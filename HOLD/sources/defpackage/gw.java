package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: gw  reason: default package */
/* compiled from: PG */
public final class gw implements je {
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();
    public int c = 0;
    private final cz d = new da(30);
    private final gu e;
    private final jf f;

    public gw(gu guVar) {
        this.e = guVar;
        this.f = new jf(this);
    }

    public final boolean a(int i) {
        return (i & this.c) != 0;
    }

    private final boolean c(int i) {
        int size = this.b.size();
        for (int i2 = 0; i2 < size; i2++) {
            gv gvVar = (gv) this.b.get(i2);
            int i3 = gvVar.a;
            if (i3 == 8) {
                if (b(gvVar.d, i2 + 1) == i) {
                    return true;
                }
            } else if (i3 == 1) {
                int i4 = gvVar.b;
                int i5 = gvVar.d + i4;
                while (i4 < i5) {
                    if (b(i4, i2 + 1) == i) {
                        return true;
                    }
                    i4++;
                }
                continue;
            } else {
                continue;
            }
        }
        return false;
    }

    public final void c() {
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            ((jo) this.e).a((gv) this.b.get(i));
        }
        a(this.b);
        this.c = 0;
    }

    public final void e() {
        c();
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            gv gvVar = (gv) this.a.get(i);
            int i2 = gvVar.a;
            if (i2 == 1) {
                ((jo) this.e).a(gvVar);
                this.e.b(gvVar.b, gvVar.d);
            } else if (i2 == 2) {
                ((jo) this.e).a(gvVar);
                this.e.a(gvVar.b, gvVar.d);
            } else if (i2 == 4) {
                ((jo) this.e).a(gvVar);
                this.e.a(gvVar.b, gvVar.d, gvVar.c);
            } else if (i2 == 8) {
                ((jo) this.e).a(gvVar);
                this.e.c(gvVar.b, gvVar.d);
            }
        }
        a(this.a);
        this.c = 0;
    }

    private final void b(gv gvVar) {
        int i;
        int i2 = gvVar.a;
        if (i2 == 1 || i2 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int a2 = a(gvVar.b, i2);
        int i3 = gvVar.b;
        int i4 = gvVar.a;
        if (i4 == 2) {
            i = 0;
        } else if (i4 == 4) {
            i = 1;
        } else {
            throw new IllegalArgumentException("op should be remove or update." + gvVar);
        }
        int i5 = a2;
        int i6 = i3;
        int i7 = 1;
        for (int i8 = 1; i8 < gvVar.d; i8++) {
            int a3 = a(gvVar.b + (i * i8), gvVar.a);
            int i9 = gvVar.a;
            if (i9 == 2 ? a3 != i5 : !(i9 == 4 && a3 == i5 + 1)) {
                gv a4 = a(i9, i5, i7, gvVar.c);
                a(a4, i6);
                a(a4);
                if (gvVar.a == 4) {
                    i6 += i7;
                }
                i5 = a3;
                i7 = 1;
            } else {
                i7++;
            }
        }
        Object obj = gvVar.c;
        a(gvVar);
        if (i7 > 0) {
            gv a5 = a(gvVar.a, i5, i7, obj);
            a(a5, i6);
            a(a5);
        }
    }

    private final void a(gv gvVar, int i) {
        ((jo) this.e).a(gvVar);
        int i2 = gvVar.a;
        if (i2 == 2) {
            this.e.a(i, gvVar.d);
        } else if (i2 == 4) {
            this.e.a(i, gvVar.d, gvVar.c);
        } else {
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
    }

    /* access modifiers changed from: package-private */
    public final int b(int i) {
        return b(i, 0);
    }

    private final int b(int i, int i2) {
        int size = this.b.size();
        while (i2 < size) {
            gv gvVar = (gv) this.b.get(i2);
            int i3 = gvVar.a;
            if (i3 == 8) {
                int i4 = gvVar.b;
                if (i4 == i) {
                    i = gvVar.d;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (gvVar.d <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = gvVar.b;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = gvVar.d;
                    if (i < i5 + i6) {
                        return -1;
                    }
                    i -= i6;
                } else if (i3 == 1) {
                    i += gvVar.d;
                }
            }
            i2++;
        }
        return i;
    }

    public final boolean d() {
        return this.a.size() > 0;
    }

    public final gv a(int i, int i2, int i3, Object obj) {
        gv gvVar = (gv) this.d.a();
        if (gvVar == null) {
            return new gv(i, i2, i3, obj);
        }
        gvVar.a = i;
        gvVar.b = i2;
        gvVar.d = i3;
        gvVar.c = obj;
        return gvVar;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: android.support.v7.widget.RecyclerView.a(int, int, boolean):void
     arg types: [int, int, int]
     candidates:
      android.support.v7.widget.RecyclerView.a(android.support.v7.widget.RecyclerView, int, int):void
      android.support.v7.widget.RecyclerView.a(int, int, android.view.MotionEvent):boolean
      android.support.v7.widget.RecyclerView.a(int, int, int[]):void
      android.support.v7.widget.RecyclerView.a(int, int, boolean):void */
    private final void c(gv gvVar) {
        this.b.add(gvVar);
        int i = gvVar.a;
        if (i == 1) {
            this.e.b(gvVar.b, gvVar.d);
        } else if (i == 2) {
            gu guVar = this.e;
            jo joVar = (jo) guVar;
            joVar.a.a(gvVar.b, gvVar.d, false);
            joVar.a.F = true;
        } else if (i == 4) {
            this.e.a(gvVar.b, gvVar.d, gvVar.c);
        } else if (i == 8) {
            this.e.c(gvVar.b, gvVar.d);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + gvVar);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:171:0x0006 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0121  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b() {
        /*
            r16 = this;
            r0 = r16
            jf r1 = r0.f
            java.util.ArrayList r2 = r0.a
        L_0x0006:
            int r3 = r2.size()
            r4 = -1
            int r3 = r3 + r4
            r5 = 0
            r6 = 0
        L_0x000e:
            r7 = 8
            r8 = 1
            if (r3 < 0) goto L_0x0025
            java.lang.Object r9 = r2.get(r3)
            gv r9 = (defpackage.gv) r9
            int r9 = r9.a
            if (r9 == r7) goto L_0x001f
            r6 = 1
            goto L_0x0022
        L_0x001f:
            if (r6 == 0) goto L_0x0022
            goto L_0x0027
        L_0x0022:
            int r3 = r3 + -1
            goto L_0x000e
        L_0x0025:
            r3 = -1
        L_0x0027:
            r6 = 4
            r9 = 2
            r10 = 0
            if (r3 == r4) goto L_0x01c2
            int r7 = r3 + 1
            java.lang.Object r11 = r2.get(r3)
            gv r11 = (defpackage.gv) r11
            java.lang.Object r12 = r2.get(r7)
            gv r12 = (defpackage.gv) r12
            int r13 = r12.a
            if (r13 == r8) goto L_0x0197
            if (r13 == r9) goto L_0x00a7
            if (r13 == r6) goto L_0x0043
            goto L_0x0006
        L_0x0043:
            int r4 = r11.d
            int r5 = r12.b
            if (r4 >= r5) goto L_0x004f
            int r5 = r5 + -1
            r12.b = r5
        L_0x004d:
            r4 = r10
            goto L_0x0065
        L_0x004f:
            int r9 = r12.d
            int r5 = r5 + r9
            if (r4 >= r5) goto L_0x0063
            int r9 = r9 + -1
            r12.d = r9
            je r4 = r1.a
            int r5 = r11.b
            java.lang.Object r9 = r12.c
            gv r4 = r4.a(r6, r5, r8, r9)
            goto L_0x0065
        L_0x0063:
            goto L_0x004d
        L_0x0065:
            int r5 = r11.b
            int r8 = r12.b
            if (r5 > r8) goto L_0x0070
            int r8 = r8 + 1
            r12.b = r8
            goto L_0x0088
        L_0x0070:
            int r9 = r12.d
            int r8 = r8 + r9
            if (r5 >= r8) goto L_0x0086
            int r8 = r8 - r5
            je r9 = r1.a
            int r5 = r5 + 1
            java.lang.Object r10 = r12.c
            gv r10 = r9.a(r6, r5, r8, r10)
            int r5 = r12.d
            int r5 = r5 - r8
            r12.d = r5
            goto L_0x0088
        L_0x0086:
        L_0x0088:
            r2.set(r7, r11)
            int r5 = r12.d
            if (r5 <= 0) goto L_0x0093
            r2.set(r3, r12)
            goto L_0x009b
        L_0x0093:
            r2.remove(r3)
            je r5 = r1.a
            r5.a(r12)
        L_0x009b:
            if (r4 == 0) goto L_0x00a0
            r2.add(r3, r4)
        L_0x00a0:
            if (r10 == 0) goto L_0x0006
            r2.add(r3, r10)
            goto L_0x0006
        L_0x00a7:
            int r4 = r11.b
            int r6 = r11.d
            if (r4 < r6) goto L_0x00bd
            int r13 = r12.b
            int r14 = r6 + 1
            if (r13 != r14) goto L_0x00bb
            int r13 = r12.d
            int r4 = r4 - r6
            if (r13 != r4) goto L_0x00ba
            r4 = 1
            goto L_0x00c8
        L_0x00ba:
        L_0x00bb:
            r4 = 1
            goto L_0x00cb
        L_0x00bd:
            int r13 = r12.b
            if (r13 != r4) goto L_0x00ca
            int r13 = r12.d
            int r4 = r6 - r4
            if (r13 != r4) goto L_0x00ca
            r4 = 0
        L_0x00c8:
            r5 = 1
            goto L_0x00cb
        L_0x00ca:
            r4 = 0
        L_0x00cb:
            int r13 = r12.b
            if (r6 >= r13) goto L_0x00d4
            int r13 = r13 + -1
            r12.b = r13
            goto L_0x00f1
        L_0x00d4:
            int r14 = r12.d
            int r15 = r13 + r14
            if (r6 >= r15) goto L_0x00f0
            int r14 = r14 + -1
            r12.d = r14
            r11.a = r9
            r11.d = r8
            int r3 = r12.d
            if (r3 != 0) goto L_0x0006
            r2.remove(r7)
            je r3 = r1.a
            r3.a(r12)
            goto L_0x0006
        L_0x00f0:
        L_0x00f1:
            int r6 = r11.b
            if (r6 > r13) goto L_0x00fa
            int r13 = r13 + 1
            r12.b = r13
            goto L_0x0112
        L_0x00fa:
            int r8 = r12.d
            int r13 = r13 + r8
            if (r6 >= r13) goto L_0x0110
            je r8 = r1.a
            int r14 = r6 + 1
            int r13 = r13 - r6
            gv r10 = r8.a(r9, r14, r13, r10)
            int r6 = r11.b
            int r8 = r12.b
            int r6 = r6 - r8
            r12.d = r6
            goto L_0x0112
        L_0x0110:
        L_0x0112:
            if (r5 == 0) goto L_0x0121
            r2.set(r3, r12)
            r2.remove(r7)
            je r3 = r1.a
            r3.a(r11)
            goto L_0x0006
        L_0x0121:
            if (r4 != 0) goto L_0x0152
            if (r10 == 0) goto L_0x013b
            int r4 = r11.b
            int r5 = r10.b
            if (r4 < r5) goto L_0x0130
            int r5 = r10.d
            int r4 = r4 - r5
            r11.b = r4
        L_0x0130:
            int r4 = r11.d
            int r5 = r10.b
            if (r4 < r5) goto L_0x013b
            int r5 = r10.d
            int r4 = r4 - r5
            r11.d = r4
        L_0x013b:
            int r4 = r11.b
            int r5 = r12.b
            if (r4 < r5) goto L_0x0146
            int r5 = r12.d
            int r4 = r4 - r5
            r11.b = r4
        L_0x0146:
            int r4 = r11.d
            int r5 = r12.b
            if (r4 < r5) goto L_0x0180
            int r5 = r12.d
            int r4 = r4 - r5
            r11.d = r4
            goto L_0x0180
        L_0x0152:
            if (r10 == 0) goto L_0x016a
            int r4 = r11.b
            int r5 = r10.b
            if (r4 <= r5) goto L_0x015f
            int r5 = r10.d
            int r4 = r4 - r5
            r11.b = r4
        L_0x015f:
            int r4 = r11.d
            int r5 = r10.b
            if (r4 <= r5) goto L_0x016a
            int r5 = r10.d
            int r4 = r4 - r5
            r11.d = r4
        L_0x016a:
            int r4 = r11.b
            int r5 = r12.b
            if (r4 <= r5) goto L_0x0175
            int r5 = r12.d
            int r4 = r4 - r5
            r11.b = r4
        L_0x0175:
            int r4 = r11.d
            int r5 = r12.b
            if (r4 <= r5) goto L_0x0180
            int r5 = r12.d
            int r4 = r4 - r5
            r11.d = r4
        L_0x0180:
            r2.set(r3, r12)
            int r4 = r11.b
            int r5 = r11.d
            if (r4 == r5) goto L_0x018d
            r2.set(r7, r11)
            goto L_0x0190
        L_0x018d:
            r2.remove(r7)
        L_0x0190:
            if (r10 == 0) goto L_0x0006
            r2.add(r3, r10)
            goto L_0x0006
        L_0x0197:
            int r6 = r11.d
            int r8 = r12.b
            if (r6 >= r8) goto L_0x019e
            goto L_0x01a0
        L_0x019e:
            r4 = 0
        L_0x01a0:
            int r5 = r11.b
            if (r5 >= r8) goto L_0x01a6
            int r4 = r4 + 1
        L_0x01a6:
            if (r8 > r5) goto L_0x01ad
            int r8 = r12.d
            int r5 = r5 + r8
            r11.b = r5
        L_0x01ad:
            int r5 = r12.b
            if (r5 <= r6) goto L_0x01b2
            goto L_0x01b7
        L_0x01b2:
            int r8 = r12.d
            int r6 = r6 + r8
            r11.d = r6
        L_0x01b7:
            int r5 = r5 + r4
            r12.b = r5
            r2.set(r3, r12)
            r2.set(r7, r11)
            goto L_0x0006
        L_0x01c2:
            java.util.ArrayList r1 = r0.a
            int r1 = r1.size()
            r2 = 0
        L_0x01c9:
            if (r2 >= r1) goto L_0x029f
            java.util.ArrayList r3 = r0.a
            java.lang.Object r3 = r3.get(r2)
            gv r3 = (defpackage.gv) r3
            int r11 = r3.a
            if (r11 == r8) goto L_0x0297
            if (r11 == r9) goto L_0x023e
            if (r11 == r6) goto L_0x01e4
            if (r11 == r7) goto L_0x01df
            goto L_0x029a
        L_0x01df:
            r0.c(r3)
            goto L_0x029a
        L_0x01e4:
            int r11 = r3.b
            int r12 = r3.d
            int r12 = r12 + r11
            r14 = r11
            r13 = 0
            r15 = -1
        L_0x01ec:
            if (r11 >= r12) goto L_0x0224
            gu r4 = r0.e
            km r4 = r4.a(r11)
            if (r4 != 0) goto L_0x020d
            boolean r4 = r0.c(r11)
            if (r4 != 0) goto L_0x020d
            if (r15 == r8) goto L_0x01ff
            goto L_0x020b
        L_0x01ff:
            java.lang.Object r4 = r3.c
            gv r4 = r0.a(r6, r14, r13, r4)
            r0.c(r4)
            r14 = r11
            r13 = 0
        L_0x020b:
            r15 = 0
            goto L_0x021e
        L_0x020d:
            if (r15 != 0) goto L_0x021b
            java.lang.Object r4 = r3.c
            gv r4 = r0.a(r6, r14, r13, r4)
            r0.b(r4)
            r14 = r11
            r13 = 0
            goto L_0x021c
        L_0x021b:
        L_0x021c:
            r15 = 1
        L_0x021e:
            int r13 = r13 + r8
            int r11 = r11 + 1
            r4 = -1
            goto L_0x01ec
        L_0x0224:
            int r4 = r3.d
            if (r13 == r4) goto L_0x0232
            java.lang.Object r4 = r3.c
            r0.a(r3)
            gv r3 = r0.a(r6, r14, r13, r4)
            goto L_0x0233
        L_0x0232:
        L_0x0233:
            if (r15 == 0) goto L_0x023a
            r0.c(r3)
            goto L_0x029a
        L_0x023a:
            r0.b(r3)
            goto L_0x029a
        L_0x023e:
            int r4 = r3.b
            int r11 = r3.d
            int r11 = r11 + r4
            r12 = r11
            r13 = 0
            r14 = -1
            r11 = r4
        L_0x0247:
            if (r11 >= r12) goto L_0x0280
            gu r15 = r0.e
            km r15 = r15.a(r11)
            if (r15 != 0) goto L_0x0266
            boolean r15 = r0.c(r11)
            if (r15 != 0) goto L_0x0266
            if (r14 == r8) goto L_0x025b
            r14 = 0
            goto L_0x0264
        L_0x025b:
            gv r14 = r0.a(r9, r4, r13, r10)
            r0.c(r14)
            r14 = 1
        L_0x0264:
            r15 = 0
            goto L_0x0274
        L_0x0266:
            if (r14 != 0) goto L_0x0271
            gv r14 = r0.a(r9, r4, r13, r10)
            r0.b(r14)
            r14 = 1
            goto L_0x0272
        L_0x0271:
            r14 = 0
        L_0x0272:
            r15 = 1
        L_0x0274:
            if (r14 == 0) goto L_0x027a
            int r11 = r11 - r13
            int r12 = r12 - r13
            r13 = 1
            goto L_0x027c
        L_0x027a:
            int r13 = r13 + 1
        L_0x027c:
            int r11 = r11 + r8
            r14 = r15
            goto L_0x0247
        L_0x0280:
            int r11 = r3.d
            if (r13 == r11) goto L_0x028c
            r0.a(r3)
            gv r3 = r0.a(r9, r4, r13, r10)
            goto L_0x028d
        L_0x028c:
        L_0x028d:
            if (r14 == 0) goto L_0x0293
            r0.c(r3)
            goto L_0x029a
        L_0x0293:
            r0.b(r3)
            goto L_0x029a
        L_0x0297:
            r0.c(r3)
        L_0x029a:
            int r2 = r2 + 1
            r4 = -1
            goto L_0x01c9
        L_0x029f:
            java.util.ArrayList r1 = r0.a
            r1.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gw.b():void");
    }

    public final void a(gv gvVar) {
        gvVar.c = null;
        this.d.a(gvVar);
    }

    private final void a(List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            a((gv) list.get(i));
        }
        list.clear();
    }

    public final void a() {
        a(this.a);
        a(this.b);
        this.c = 0;
    }

    private final int a(int i, int i2) {
        int size = this.b.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            gv gvVar = (gv) this.b.get(size);
            int i3 = gvVar.a;
            if (i3 == 8) {
                int i4 = gvVar.b;
                int i5 = gvVar.d;
                int i6 = i4 < i5 ? i5 : i4;
                int i7 = i4 < i5 ? i4 : i5;
                if (i < i7 || i > i6) {
                    if (i < i4) {
                        if (i2 == 1) {
                            gvVar.b = i4 + 1;
                            gvVar.d = i5 + 1;
                        } else if (i2 == 2) {
                            gvVar.b = i4 - 1;
                            gvVar.d = i5 - 1;
                        }
                    }
                } else if (i7 != i4) {
                    if (i2 == 1) {
                        gvVar.b = i4 + 1;
                    } else if (i2 == 2) {
                        gvVar.b = i4 - 1;
                    }
                    i--;
                } else {
                    if (i2 == 1) {
                        gvVar.d = i5 + 1;
                    } else if (i2 == 2) {
                        gvVar.d = i5 - 1;
                    }
                    i++;
                }
            } else {
                int i8 = gvVar.b;
                if (i8 > i) {
                    if (i2 == 1) {
                        gvVar.b = i8 + 1;
                    } else if (i2 == 2) {
                        gvVar.b = i8 - 1;
                    }
                } else if (i3 == 1) {
                    i -= gvVar.d;
                } else if (i3 == 2) {
                    i += gvVar.d;
                }
            }
        }
        for (int size2 = this.b.size() - 1; size2 >= 0; size2--) {
            gv gvVar2 = (gv) this.b.get(size2);
            if (gvVar2.a == 8) {
                int i9 = gvVar2.d;
                if (i9 == gvVar2.b || i9 < 0) {
                    this.b.remove(size2);
                    a(gvVar2);
                }
            } else if (gvVar2.d <= 0) {
                this.b.remove(size2);
                a(gvVar2);
            }
        }
        return i;
    }
}
