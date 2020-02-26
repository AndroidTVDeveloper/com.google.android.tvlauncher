package p000;

import java.util.ArrayList;
import java.util.List;

/* renamed from: gw */
/* compiled from: PG */
public final class C0187gw implements C0250je {

    /* renamed from: a */
    public final ArrayList f9428a = new ArrayList();

    /* renamed from: b */
    public final ArrayList f9429b = new ArrayList();

    /* renamed from: c */
    public int f9430c = 0;

    /* renamed from: d */
    private final C0082cz f9431d = new C0084da(30);

    /* renamed from: e */
    private final C0185gu f9432e;

    /* renamed from: f */
    private final C0251jf f9433f;

    public C0187gw(C0185gu guVar) {
        this.f9432e = guVar;
        this.f9433f = new C0251jf(this);
    }

    /* renamed from: a */
    public final boolean mo5086a(int i) {
        return (i & this.f9430c) != 0;
    }

    /* renamed from: c */
    private final boolean m7458c(int i) {
        int size = this.f9429b.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0186gv gvVar = (C0186gv) this.f9429b.get(i2);
            int i3 = gvVar.f9424a;
            if (i3 == 8) {
                if (m7455b(gvVar.f9427d, i2 + 1) == i) {
                    return true;
                }
            } else if (i3 == 1) {
                int i4 = gvVar.f9425b;
                int i5 = gvVar.f9427d + i4;
                while (i4 < i5) {
                    if (m7455b(i4, i2 + 1) == i) {
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

    /* renamed from: c */
    public final void mo5089c() {
        int size = this.f9429b.size();
        for (int i = 0; i < size; i++) {
            ((C0260jo) this.f9432e).mo5302a((C0186gv) this.f9429b.get(i));
        }
        m7454a(this.f9429b);
        this.f9430c = 0;
    }

    /* renamed from: e */
    public final void mo5091e() {
        mo5089c();
        int size = this.f9428a.size();
        for (int i = 0; i < size; i++) {
            C0186gv gvVar = (C0186gv) this.f9428a.get(i);
            int i2 = gvVar.f9424a;
            if (i2 == 1) {
                ((C0260jo) this.f9432e).mo5302a(gvVar);
                this.f9432e.mo5078b(gvVar.f9425b, gvVar.f9427d);
            } else if (i2 == 2) {
                ((C0260jo) this.f9432e).mo5302a(gvVar);
                this.f9432e.mo5076a(gvVar.f9425b, gvVar.f9427d);
            } else if (i2 == 4) {
                ((C0260jo) this.f9432e).mo5302a(gvVar);
                this.f9432e.mo5077a(gvVar.f9425b, gvVar.f9427d, gvVar.f9426c);
            } else if (i2 == 8) {
                ((C0260jo) this.f9432e).mo5302a(gvVar);
                this.f9432e.mo5079c(gvVar.f9425b, gvVar.f9427d);
            }
        }
        m7454a(this.f9428a);
        this.f9430c = 0;
    }

    /* renamed from: b */
    private final void m7456b(C0186gv gvVar) {
        int i;
        int i2 = gvVar.f9424a;
        if (i2 == 1 || i2 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int a = m7452a(gvVar.f9425b, i2);
        int i3 = gvVar.f9425b;
        int i4 = gvVar.f9424a;
        if (i4 == 2) {
            i = 0;
        } else if (i4 == 4) {
            i = 1;
        } else {
            throw new IllegalArgumentException("op should be remove or update." + gvVar);
        }
        int i5 = a;
        int i6 = i3;
        int i7 = 1;
        for (int i8 = 1; i8 < gvVar.f9427d; i8++) {
            int a2 = m7452a(gvVar.f9425b + (i * i8), gvVar.f9424a);
            int i9 = gvVar.f9424a;
            if (i9 == 2 ? a2 != i5 : !(i9 == 4 && a2 == i5 + 1)) {
                C0186gv a3 = mo5083a(i9, i5, i7, gvVar.f9426c);
                m7453a(a3, i6);
                mo5085a(a3);
                if (gvVar.f9424a == 4) {
                    i6 += i7;
                }
                i5 = a2;
                i7 = 1;
            } else {
                i7++;
            }
        }
        Object obj = gvVar.f9426c;
        mo5085a(gvVar);
        if (i7 > 0) {
            C0186gv a4 = mo5083a(gvVar.f9424a, i5, i7, obj);
            m7453a(a4, i6);
            mo5085a(a4);
        }
    }

    /* renamed from: a */
    private final void m7453a(C0186gv gvVar, int i) {
        ((C0260jo) this.f9432e).mo5302a(gvVar);
        int i2 = gvVar.f9424a;
        if (i2 == 2) {
            this.f9432e.mo5076a(i, gvVar.f9427d);
        } else if (i2 == 4) {
            this.f9432e.mo5077a(i, gvVar.f9427d, gvVar.f9426c);
        } else {
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int mo5087b(int i) {
        return m7455b(i, 0);
    }

    /* renamed from: b */
    private final int m7455b(int i, int i2) {
        int size = this.f9429b.size();
        while (i2 < size) {
            C0186gv gvVar = (C0186gv) this.f9429b.get(i2);
            int i3 = gvVar.f9424a;
            if (i3 == 8) {
                int i4 = gvVar.f9425b;
                if (i4 == i) {
                    i = gvVar.f9427d;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (gvVar.f9427d <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = gvVar.f9425b;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = gvVar.f9427d;
                    if (i < i5 + i6) {
                        return -1;
                    }
                    i -= i6;
                } else if (i3 == 1) {
                    i += gvVar.f9427d;
                }
            }
            i2++;
        }
        return i;
    }

    /* renamed from: d */
    public final boolean mo5090d() {
        return this.f9428a.size() > 0;
    }

    /* renamed from: a */
    public final C0186gv mo5083a(int i, int i2, int i3, Object obj) {
        C0186gv gvVar = (C0186gv) this.f9431d.mo317a();
        if (gvVar == null) {
            return new C0186gv(i, i2, i3, obj);
        }
        gvVar.f9424a = i;
        gvVar.f9425b = i2;
        gvVar.f9427d = i3;
        gvVar.f9426c = obj;
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
    /* renamed from: c */
    private final void m7457c(C0186gv gvVar) {
        this.f9429b.add(gvVar);
        int i = gvVar.f9424a;
        if (i == 1) {
            this.f9432e.mo5078b(gvVar.f9425b, gvVar.f9427d);
        } else if (i == 2) {
            C0185gu guVar = this.f9432e;
            C0260jo joVar = (C0260jo) guVar;
            joVar.f9697a.mo827a(gvVar.f9425b, gvVar.f9427d, false);
            joVar.f9697a.f1026F = true;
        } else if (i == 4) {
            this.f9432e.mo5077a(gvVar.f9425b, gvVar.f9427d, gvVar.f9426c);
        } else if (i == 8) {
            this.f9432e.mo5079c(gvVar.f9425b, gvVar.f9427d);
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
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo5088b() {
        /*
            r16 = this;
            r0 = r16
            jf r1 = r0.f9433f
            java.util.ArrayList r2 = r0.f9428a
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
            gv r9 = (p000.C0186gv) r9
            int r9 = r9.f9424a
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
            gv r11 = (p000.C0186gv) r11
            java.lang.Object r12 = r2.get(r7)
            gv r12 = (p000.C0186gv) r12
            int r13 = r12.f9424a
            if (r13 == r8) goto L_0x0197
            if (r13 == r9) goto L_0x00a7
            if (r13 == r6) goto L_0x0043
            goto L_0x0006
        L_0x0043:
            int r4 = r11.f9427d
            int r5 = r12.f9425b
            if (r4 >= r5) goto L_0x004f
            int r5 = r5 + -1
            r12.f9425b = r5
        L_0x004d:
            r4 = r10
            goto L_0x0065
        L_0x004f:
            int r9 = r12.f9427d
            int r5 = r5 + r9
            if (r4 >= r5) goto L_0x0063
            int r9 = r9 + -1
            r12.f9427d = r9
            je r4 = r1.f9691a
            int r5 = r11.f9425b
            java.lang.Object r9 = r12.f9426c
            gv r4 = r4.mo5083a(r6, r5, r8, r9)
            goto L_0x0065
        L_0x0063:
            goto L_0x004d
        L_0x0065:
            int r5 = r11.f9425b
            int r8 = r12.f9425b
            if (r5 > r8) goto L_0x0070
            int r8 = r8 + 1
            r12.f9425b = r8
            goto L_0x0088
        L_0x0070:
            int r9 = r12.f9427d
            int r8 = r8 + r9
            if (r5 >= r8) goto L_0x0086
            int r8 = r8 - r5
            je r9 = r1.f9691a
            int r5 = r5 + 1
            java.lang.Object r10 = r12.f9426c
            gv r10 = r9.mo5083a(r6, r5, r8, r10)
            int r5 = r12.f9427d
            int r5 = r5 - r8
            r12.f9427d = r5
            goto L_0x0088
        L_0x0086:
        L_0x0088:
            r2.set(r7, r11)
            int r5 = r12.f9427d
            if (r5 <= 0) goto L_0x0093
            r2.set(r3, r12)
            goto L_0x009b
        L_0x0093:
            r2.remove(r3)
            je r5 = r1.f9691a
            r5.mo5085a(r12)
        L_0x009b:
            if (r4 == 0) goto L_0x00a0
            r2.add(r3, r4)
        L_0x00a0:
            if (r10 == 0) goto L_0x0006
            r2.add(r3, r10)
            goto L_0x0006
        L_0x00a7:
            int r4 = r11.f9425b
            int r6 = r11.f9427d
            if (r4 < r6) goto L_0x00bd
            int r13 = r12.f9425b
            int r14 = r6 + 1
            if (r13 != r14) goto L_0x00bb
            int r13 = r12.f9427d
            int r4 = r4 - r6
            if (r13 != r4) goto L_0x00ba
            r4 = 1
            goto L_0x00c8
        L_0x00ba:
        L_0x00bb:
            r4 = 1
            goto L_0x00cb
        L_0x00bd:
            int r13 = r12.f9425b
            if (r13 != r4) goto L_0x00ca
            int r13 = r12.f9427d
            int r4 = r6 - r4
            if (r13 != r4) goto L_0x00ca
            r4 = 0
        L_0x00c8:
            r5 = 1
            goto L_0x00cb
        L_0x00ca:
            r4 = 0
        L_0x00cb:
            int r13 = r12.f9425b
            if (r6 >= r13) goto L_0x00d4
            int r13 = r13 + -1
            r12.f9425b = r13
            goto L_0x00f1
        L_0x00d4:
            int r14 = r12.f9427d
            int r15 = r13 + r14
            if (r6 >= r15) goto L_0x00f0
            int r14 = r14 + -1
            r12.f9427d = r14
            r11.f9424a = r9
            r11.f9427d = r8
            int r3 = r12.f9427d
            if (r3 != 0) goto L_0x0006
            r2.remove(r7)
            je r3 = r1.f9691a
            r3.mo5085a(r12)
            goto L_0x0006
        L_0x00f0:
        L_0x00f1:
            int r6 = r11.f9425b
            if (r6 > r13) goto L_0x00fa
            int r13 = r13 + 1
            r12.f9425b = r13
            goto L_0x0112
        L_0x00fa:
            int r8 = r12.f9427d
            int r13 = r13 + r8
            if (r6 >= r13) goto L_0x0110
            je r8 = r1.f9691a
            int r14 = r6 + 1
            int r13 = r13 - r6
            gv r10 = r8.mo5083a(r9, r14, r13, r10)
            int r6 = r11.f9425b
            int r8 = r12.f9425b
            int r6 = r6 - r8
            r12.f9427d = r6
            goto L_0x0112
        L_0x0110:
        L_0x0112:
            if (r5 == 0) goto L_0x0121
            r2.set(r3, r12)
            r2.remove(r7)
            je r3 = r1.f9691a
            r3.mo5085a(r11)
            goto L_0x0006
        L_0x0121:
            if (r4 != 0) goto L_0x0152
            if (r10 == 0) goto L_0x013b
            int r4 = r11.f9425b
            int r5 = r10.f9425b
            if (r4 < r5) goto L_0x0130
            int r5 = r10.f9427d
            int r4 = r4 - r5
            r11.f9425b = r4
        L_0x0130:
            int r4 = r11.f9427d
            int r5 = r10.f9425b
            if (r4 < r5) goto L_0x013b
            int r5 = r10.f9427d
            int r4 = r4 - r5
            r11.f9427d = r4
        L_0x013b:
            int r4 = r11.f9425b
            int r5 = r12.f9425b
            if (r4 < r5) goto L_0x0146
            int r5 = r12.f9427d
            int r4 = r4 - r5
            r11.f9425b = r4
        L_0x0146:
            int r4 = r11.f9427d
            int r5 = r12.f9425b
            if (r4 < r5) goto L_0x0180
            int r5 = r12.f9427d
            int r4 = r4 - r5
            r11.f9427d = r4
            goto L_0x0180
        L_0x0152:
            if (r10 == 0) goto L_0x016a
            int r4 = r11.f9425b
            int r5 = r10.f9425b
            if (r4 <= r5) goto L_0x015f
            int r5 = r10.f9427d
            int r4 = r4 - r5
            r11.f9425b = r4
        L_0x015f:
            int r4 = r11.f9427d
            int r5 = r10.f9425b
            if (r4 <= r5) goto L_0x016a
            int r5 = r10.f9427d
            int r4 = r4 - r5
            r11.f9427d = r4
        L_0x016a:
            int r4 = r11.f9425b
            int r5 = r12.f9425b
            if (r4 <= r5) goto L_0x0175
            int r5 = r12.f9427d
            int r4 = r4 - r5
            r11.f9425b = r4
        L_0x0175:
            int r4 = r11.f9427d
            int r5 = r12.f9425b
            if (r4 <= r5) goto L_0x0180
            int r5 = r12.f9427d
            int r4 = r4 - r5
            r11.f9427d = r4
        L_0x0180:
            r2.set(r3, r12)
            int r4 = r11.f9425b
            int r5 = r11.f9427d
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
            int r6 = r11.f9427d
            int r8 = r12.f9425b
            if (r6 >= r8) goto L_0x019e
            goto L_0x01a0
        L_0x019e:
            r4 = 0
        L_0x01a0:
            int r5 = r11.f9425b
            if (r5 >= r8) goto L_0x01a6
            int r4 = r4 + 1
        L_0x01a6:
            if (r8 > r5) goto L_0x01ad
            int r8 = r12.f9427d
            int r5 = r5 + r8
            r11.f9425b = r5
        L_0x01ad:
            int r5 = r12.f9425b
            if (r5 <= r6) goto L_0x01b2
            goto L_0x01b7
        L_0x01b2:
            int r8 = r12.f9427d
            int r6 = r6 + r8
            r11.f9427d = r6
        L_0x01b7:
            int r5 = r5 + r4
            r12.f9425b = r5
            r2.set(r3, r12)
            r2.set(r7, r11)
            goto L_0x0006
        L_0x01c2:
            java.util.ArrayList r1 = r0.f9428a
            int r1 = r1.size()
            r2 = 0
        L_0x01c9:
            if (r2 >= r1) goto L_0x029f
            java.util.ArrayList r3 = r0.f9428a
            java.lang.Object r3 = r3.get(r2)
            gv r3 = (p000.C0186gv) r3
            int r11 = r3.f9424a
            if (r11 == r8) goto L_0x0297
            if (r11 == r9) goto L_0x023e
            if (r11 == r6) goto L_0x01e4
            if (r11 == r7) goto L_0x01df
            goto L_0x029a
        L_0x01df:
            r0.m7457c(r3)
            goto L_0x029a
        L_0x01e4:
            int r11 = r3.f9425b
            int r12 = r3.f9427d
            int r12 = r12 + r11
            r14 = r11
            r13 = 0
            r15 = -1
        L_0x01ec:
            if (r11 >= r12) goto L_0x0224
            gu r4 = r0.f9432e
            km r4 = r4.mo5075a(r11)
            if (r4 != 0) goto L_0x020d
            boolean r4 = r0.m7458c(r11)
            if (r4 != 0) goto L_0x020d
            if (r15 == r8) goto L_0x01ff
            goto L_0x020b
        L_0x01ff:
            java.lang.Object r4 = r3.f9426c
            gv r4 = r0.mo5083a(r6, r14, r13, r4)
            r0.m7457c(r4)
            r14 = r11
            r13 = 0
        L_0x020b:
            r15 = 0
            goto L_0x021e
        L_0x020d:
            if (r15 != 0) goto L_0x021b
            java.lang.Object r4 = r3.f9426c
            gv r4 = r0.mo5083a(r6, r14, r13, r4)
            r0.m7456b(r4)
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
            int r4 = r3.f9427d
            if (r13 == r4) goto L_0x0232
            java.lang.Object r4 = r3.f9426c
            r0.mo5085a(r3)
            gv r3 = r0.mo5083a(r6, r14, r13, r4)
            goto L_0x0233
        L_0x0232:
        L_0x0233:
            if (r15 == 0) goto L_0x023a
            r0.m7457c(r3)
            goto L_0x029a
        L_0x023a:
            r0.m7456b(r3)
            goto L_0x029a
        L_0x023e:
            int r4 = r3.f9425b
            int r11 = r3.f9427d
            int r11 = r11 + r4
            r12 = r11
            r13 = 0
            r14 = -1
            r11 = r4
        L_0x0247:
            if (r11 >= r12) goto L_0x0280
            gu r15 = r0.f9432e
            km r15 = r15.mo5075a(r11)
            if (r15 != 0) goto L_0x0266
            boolean r15 = r0.m7458c(r11)
            if (r15 != 0) goto L_0x0266
            if (r14 == r8) goto L_0x025b
            r14 = 0
            goto L_0x0264
        L_0x025b:
            gv r14 = r0.mo5083a(r9, r4, r13, r10)
            r0.m7457c(r14)
            r14 = 1
        L_0x0264:
            r15 = 0
            goto L_0x0274
        L_0x0266:
            if (r14 != 0) goto L_0x0271
            gv r14 = r0.mo5083a(r9, r4, r13, r10)
            r0.m7456b(r14)
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
            int r11 = r3.f9427d
            if (r13 == r11) goto L_0x028c
            r0.mo5085a(r3)
            gv r3 = r0.mo5083a(r9, r4, r13, r10)
            goto L_0x028d
        L_0x028c:
        L_0x028d:
            if (r14 == 0) goto L_0x0293
            r0.m7457c(r3)
            goto L_0x029a
        L_0x0293:
            r0.m7456b(r3)
            goto L_0x029a
        L_0x0297:
            r0.m7457c(r3)
        L_0x029a:
            int r2 = r2 + 1
            r4 = -1
            goto L_0x01c9
        L_0x029f:
            java.util.ArrayList r1 = r0.f9428a
            r1.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0187gw.mo5088b():void");
    }

    /* renamed from: a */
    public final void mo5085a(C0186gv gvVar) {
        gvVar.f9426c = null;
        this.f9431d.mo318a(gvVar);
    }

    /* renamed from: a */
    private final void m7454a(List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            mo5085a((C0186gv) list.get(i));
        }
        list.clear();
    }

    /* renamed from: a */
    public final void mo5084a() {
        m7454a(this.f9428a);
        m7454a(this.f9429b);
        this.f9430c = 0;
    }

    /* renamed from: a */
    private final int m7452a(int i, int i2) {
        int size = this.f9429b.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C0186gv gvVar = (C0186gv) this.f9429b.get(size);
            int i3 = gvVar.f9424a;
            if (i3 == 8) {
                int i4 = gvVar.f9425b;
                int i5 = gvVar.f9427d;
                int i6 = i4 < i5 ? i5 : i4;
                int i7 = i4 < i5 ? i4 : i5;
                if (i < i7 || i > i6) {
                    if (i < i4) {
                        if (i2 == 1) {
                            gvVar.f9425b = i4 + 1;
                            gvVar.f9427d = i5 + 1;
                        } else if (i2 == 2) {
                            gvVar.f9425b = i4 - 1;
                            gvVar.f9427d = i5 - 1;
                        }
                    }
                } else if (i7 != i4) {
                    if (i2 == 1) {
                        gvVar.f9425b = i4 + 1;
                    } else if (i2 == 2) {
                        gvVar.f9425b = i4 - 1;
                    }
                    i--;
                } else {
                    if (i2 == 1) {
                        gvVar.f9427d = i5 + 1;
                    } else if (i2 == 2) {
                        gvVar.f9427d = i5 - 1;
                    }
                    i++;
                }
            } else {
                int i8 = gvVar.f9425b;
                if (i8 > i) {
                    if (i2 == 1) {
                        gvVar.f9425b = i8 + 1;
                    } else if (i2 == 2) {
                        gvVar.f9425b = i8 - 1;
                    }
                } else if (i3 == 1) {
                    i -= gvVar.f9427d;
                } else if (i3 == 2) {
                    i += gvVar.f9427d;
                }
            }
        }
        for (int size2 = this.f9429b.size() - 1; size2 >= 0; size2--) {
            C0186gv gvVar2 = (C0186gv) this.f9429b.get(size2);
            if (gvVar2.f9424a == 8) {
                int i9 = gvVar2.f9427d;
                if (i9 == gvVar2.f9425b || i9 < 0) {
                    this.f9429b.remove(size2);
                    mo5085a(gvVar2);
                }
            } else if (gvVar2.f9427d <= 0) {
                this.f9429b.remove(size2);
                mo5085a(gvVar2);
            }
        }
        return i;
    }
}
