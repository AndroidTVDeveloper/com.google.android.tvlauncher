package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: kc  reason: default package */
/* compiled from: PG */
public final class kc {
    public final ArrayList a = new ArrayList();
    public ArrayList b = null;
    public final ArrayList c = new ArrayList();
    public final List d = Collections.unmodifiableList(this.a);
    public int e = 2;
    public final /* synthetic */ RecyclerView f;
    private int g = 2;
    private kb h;

    public kc(RecyclerView recyclerView) {
        this.f = recyclerView;
    }

    /* access modifiers changed from: package-private */
    public final void a(km kmVar, boolean z) {
        RecyclerView.b(kmVar);
        View view = kmVar.a;
        ko koVar = this.f.I;
        if (koVar != null) {
            dj b2 = koVar.b();
            dx.a(view, b2 instanceof kn ? (dj) ((kn) b2).b.remove(view) : null);
        }
        if (z) {
            if (!(this.f.i == null || kmVar.d() == -1)) {
                View view2 = kmVar.a;
            }
            jp jpVar = this.f.g;
            if (jpVar != null) {
                jpVar.a(kmVar);
            }
            RecyclerView recyclerView = this.f;
            if (recyclerView.D != null) {
                recyclerView.d.d(kmVar);
            }
        }
        kmVar.o = null;
        kb d2 = d();
        int i = kmVar.f;
        ArrayList arrayList = d2.a(i).a;
        ka kaVar = (ka) d2.a.get(i);
        if (arrayList.size() < 5) {
            kmVar.r();
            arrayList.add(kmVar);
        }
    }

    public final void a() {
        this.a.clear();
        c();
    }

    public final kb d() {
        if (this.h == null) {
            this.h = new kb();
        }
        return this.h;
    }

    public final View a(int i) {
        return a(i, Long.MAX_VALUE).a;
    }

    /* access modifiers changed from: package-private */
    public final void b(View view) {
        km c2 = RecyclerView.c(view);
        c2.k = null;
        c2.l = false;
        c2.h();
        a(c2);
    }

    public final void c() {
        for (int size = this.c.size() - 1; size >= 0; size--) {
            b(size);
        }
        this.c.clear();
        Interpolator interpolator = RecyclerView.K;
        this.f.C.a();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: kc.a(km, boolean):void
     arg types: [km, int]
     candidates:
      kc.a(int, long):km
      kc.a(km, boolean):void */
    public final void b(int i) {
        a((km) this.c.get(i), true);
        this.c.remove(i);
    }

    public final void a(View view) {
        km c2 = RecyclerView.c(view);
        if (c2.n()) {
            this.f.removeDetachedView(view, false);
        }
        if (c2.e()) {
            c2.f();
        } else if (c2.g()) {
            c2.h();
        }
        a(c2);
        if (this.f.x != null && !c2.s()) {
            this.f.x.c(c2);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: kc.a(km, boolean):void
     arg types: [km, int]
     candidates:
      kc.a(int, long):km
      kc.a(km, boolean):void */
    /* access modifiers changed from: package-private */
    public final void a(km kmVar) {
        boolean z;
        boolean z2;
        boolean z3 = true;
        boolean z4 = false;
        if (kmVar.e() || kmVar.a.getParent() != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Scrapped or attached views may not be recycled. isScrap:");
            sb.append(kmVar.e());
            sb.append(" isAttached:");
            if (kmVar.a.getParent() == null) {
                z3 = false;
            }
            sb.append(z3);
            sb.append(this.f.a());
            throw new IllegalArgumentException(sb.toString());
        } else if (kmVar.n()) {
            throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + kmVar + this.f.a());
        } else if (!kmVar.b()) {
            if ((kmVar.j & 16) != 0 || !dx.c(kmVar.a)) {
                z = false;
            } else {
                z = true;
            }
            jp jpVar = this.f.g;
            if (jpVar != null && z) {
                jpVar.c(kmVar);
            }
            if (!kmVar.s()) {
                z2 = false;
            } else {
                if (this.g <= 0 || kmVar.o(526)) {
                    z2 = false;
                } else {
                    int size = this.c.size();
                    if (size >= this.g && size > 0) {
                        b(0);
                        size--;
                    }
                    if (size > 0 && !this.f.C.a(kmVar.c)) {
                        int i = size - 1;
                        while (i >= 0) {
                            if (!this.f.C.a(((km) this.c.get(i)).c)) {
                                break;
                            }
                            i--;
                        }
                        size = i + 1;
                    }
                    this.c.add(size, kmVar);
                    z2 = true;
                }
                if (!z2) {
                    a(kmVar, true);
                    z4 = true;
                }
            }
            this.f.d.d(kmVar);
            if (!z2 && !z4 && z) {
                kmVar.o = null;
            }
        } else {
            throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + this.f.a());
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: km.a(kc, boolean):void
     arg types: [kc, int]
     candidates:
      km.a(int, int):void
      km.a(int, boolean):void
      km.a(kc, boolean):void */
    /* access modifiers changed from: package-private */
    public final void c(View view) {
        ju juVar;
        km c2 = RecyclerView.c(view);
        if (!c2.o(12) && c2.t() && (juVar = this.f.x) != null && !juVar.a(c2, c2.q())) {
            if (this.b == null) {
                this.b = new ArrayList();
            }
            c2.a(this, true);
            this.b.add(c2);
        } else if (!c2.j() || c2.m() || this.f.g.a) {
            c2.a(this, false);
            this.a.add(c2);
        } else {
            throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + this.f.a());
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0209, code lost:
        if (r10.e != r8.b(r10.c)) goto L_0x020c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x047d, code lost:
        if ((r11 + r7) < r20) goto L_0x0480;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01d0, code lost:
        if (r1.f.D.g != false) goto L_0x01d2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:252:0x0531  */
    /* JADX WARNING: Removed duplicated region for block: B:253:0x053f  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0090  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.km a(int r19, long r20) {
        /*
            r18 = this;
            r1 = r18
            r0 = r19
            if (r0 < 0) goto L_0x0562
            android.support.v7.widget.RecyclerView r2 = r1.f
            kk r2 = r2.D
            int r2 = r2.a()
            if (r0 >= r2) goto L_0x0562
            android.support.v7.widget.RecyclerView r2 = r1.f
            kk r2 = r2.D
            boolean r2 = r2.g
            r3 = 32
            r4 = 0
            r6 = 0
            if (r2 == 0) goto L_0x0093
            java.util.ArrayList r2 = r1.b
            if (r2 == 0) goto L_0x008b
            int r2 = r2.size()
            if (r2 != 0) goto L_0x0027
            goto L_0x008b
        L_0x0027:
            r7 = 0
        L_0x0028:
            if (r7 >= r2) goto L_0x0047
            java.util.ArrayList r8 = r1.b
            java.lang.Object r8 = r8.get(r7)
            km r8 = (defpackage.km) r8
            boolean r9 = r8.g()
            if (r9 == 0) goto L_0x0039
        L_0x0038:
            goto L_0x0044
        L_0x0039:
            int r9 = r8.c()
            if (r9 != r0) goto L_0x0038
            r8.b(r3)
            goto L_0x008c
        L_0x0044:
            int r7 = r7 + 1
            goto L_0x0028
        L_0x0047:
            android.support.v7.widget.RecyclerView r7 = r1.f
            jp r8 = r7.g
            boolean r8 = r8.a
            if (r8 == 0) goto L_0x008b
            gw r7 = r7.b
            int r7 = r7.b(r0)
            if (r7 <= 0) goto L_0x008b
            android.support.v7.widget.RecyclerView r8 = r1.f
            jp r8 = r8.g
            int r8 = r8.a()
            if (r7 >= r8) goto L_0x008b
            android.support.v7.widget.RecyclerView r8 = r1.f
            jp r8 = r8.g
            long r7 = r8.b(r7)
            r9 = 0
        L_0x006a:
            if (r9 >= r2) goto L_0x008a
            java.util.ArrayList r10 = r1.b
            java.lang.Object r10 = r10.get(r9)
            km r10 = (defpackage.km) r10
            boolean r11 = r10.g()
            if (r11 == 0) goto L_0x007b
        L_0x007a:
            goto L_0x0087
        L_0x007b:
            long r11 = r10.e
            int r13 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r13 != 0) goto L_0x007a
            r10.b(r3)
            r8 = r10
            goto L_0x008c
        L_0x0087:
            int r9 = r9 + 1
            goto L_0x006a
        L_0x008a:
        L_0x008b:
            r8 = r6
        L_0x008c:
            if (r8 == 0) goto L_0x0090
            r2 = 1
            goto L_0x0096
        L_0x0090:
            r2 = 0
            goto L_0x0096
        L_0x0093:
            r8 = r6
            r2 = 0
        L_0x0096:
            r7 = -1
            if (r8 != 0) goto L_0x0254
            java.util.ArrayList r8 = r1.a
            int r9 = r8.size()
            r8 = 0
        L_0x00a0:
            if (r8 < r9) goto L_0x0191
            android.support.v7.widget.RecyclerView r8 = r1.f
            ho r8 = r8.c
            java.util.List r9 = r8.c
            int r9 = r9.size()
            r10 = 0
        L_0x00ad:
            if (r10 >= r9) goto L_0x00d2
            java.util.List r11 = r8.c
            java.lang.Object r11 = r11.get(r10)
            android.view.View r11 = (android.view.View) r11
            km r12 = android.support.v7.widget.RecyclerView.c(r11)
            int r13 = r12.c()
            if (r13 == r0) goto L_0x00c2
            goto L_0x00cf
        L_0x00c2:
            boolean r13 = r12.j()
            if (r13 != 0) goto L_0x00cf
            boolean r12 = r12.m()
            if (r12 != 0) goto L_0x00cf
            goto L_0x00d4
        L_0x00cf:
            int r10 = r10 + 1
            goto L_0x00ad
        L_0x00d2:
            r11 = r6
        L_0x00d4:
            if (r11 == 0) goto L_0x0160
            km r8 = android.support.v7.widget.RecyclerView.c(r11)
            android.support.v7.widget.RecyclerView r9 = r1.f
            ho r9 = r9.c
            hn r10 = r9.a
            int r10 = r10.a(r11)
            if (r10 < 0) goto L_0x0149
            hm r12 = r9.b
            boolean r12 = r12.c(r10)
            if (r12 == 0) goto L_0x0132
            hm r12 = r9.b
            r12.b(r10)
            r9.d(r11)
            android.support.v7.widget.RecyclerView r9 = r1.f
            ho r9 = r9.c
            int r9 = r9.b(r11)
            if (r9 == r7) goto L_0x0112
            android.support.v7.widget.RecyclerView r10 = r1.f
            ho r10 = r10.c
            r10.d(r9)
            r1.c(r11)
            r9 = 8224(0x2020, float:1.1524E-41)
            r8.b(r9)
            r10 = r8
            goto L_0x01c0
        L_0x0112:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "layout index should not be -1 after unhiding a view:"
            r2.append(r3)
            r2.append(r8)
            android.support.v7.widget.RecyclerView r3 = r1.f
            java.lang.String r3 = r3.a()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L_0x0132:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "trying to unhide a view that was not hidden"
            r2.append(r3)
            r2.append(r11)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L_0x0149:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "view is not a child, cannot hide "
            r2.append(r3)
            r2.append(r11)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L_0x0160:
            java.util.ArrayList r8 = r1.c
            int r8 = r8.size()
            r9 = 0
        L_0x0167:
            if (r9 >= r8) goto L_0x018e
            java.util.ArrayList r10 = r1.c
            java.lang.Object r10 = r10.get(r9)
            km r10 = (defpackage.km) r10
            boolean r11 = r10.j()
            if (r11 == 0) goto L_0x0178
        L_0x0177:
            goto L_0x018b
        L_0x0178:
            int r11 = r10.c()
            if (r11 != r0) goto L_0x0177
            boolean r11 = r10.o()
            if (r11 != 0) goto L_0x018b
            java.util.ArrayList r8 = r1.c
            r8.remove(r9)
            goto L_0x01c0
        L_0x018b:
            int r9 = r9 + 1
            goto L_0x0167
        L_0x018e:
            r10 = r6
            goto L_0x01c0
        L_0x0191:
            java.util.ArrayList r10 = r1.a
            java.lang.Object r10 = r10.get(r8)
            km r10 = (defpackage.km) r10
            boolean r11 = r10.g()
            if (r11 == 0) goto L_0x01a1
        L_0x019f:
            goto L_0x0250
        L_0x01a1:
            int r11 = r10.c()
            if (r11 != r0) goto L_0x019f
            boolean r11 = r10.j()
            if (r11 != 0) goto L_0x0250
            android.support.v7.widget.RecyclerView r11 = r1.f
            kk r11 = r11.D
            boolean r11 = r11.g
            if (r11 != 0) goto L_0x01bb
            boolean r11 = r10.m()
            if (r11 != 0) goto L_0x0250
        L_0x01bb:
            r10.b(r3)
        L_0x01c0:
            if (r10 != 0) goto L_0x01c4
            goto L_0x0255
        L_0x01c4:
            boolean r8 = r10.m()
            if (r8 == 0) goto L_0x01d5
            android.support.v7.widget.RecyclerView r8 = r1.f
            kk r8 = r8.D
            boolean r8 = r8.g
            if (r8 == 0) goto L_0x020c
        L_0x01d2:
            r2 = 1
            goto L_0x0255
        L_0x01d5:
            int r8 = r10.c
            if (r8 < 0) goto L_0x0230
            android.support.v7.widget.RecyclerView r9 = r1.f
            jp r9 = r9.g
            int r9 = r9.a()
            if (r8 >= r9) goto L_0x0230
            android.support.v7.widget.RecyclerView r8 = r1.f
            kk r9 = r8.D
            boolean r9 = r9.g
            if (r9 != 0) goto L_0x01f7
            jp r8 = r8.g
            int r9 = r10.c
            int r8 = r8.a(r9)
            int r9 = r10.f
            if (r8 != r9) goto L_0x020c
        L_0x01f7:
            android.support.v7.widget.RecyclerView r8 = r1.f
            jp r8 = r8.g
            boolean r9 = r8.a
            if (r9 == 0) goto L_0x01d2
            long r11 = r10.e
            int r9 = r10.c
            long r8 = r8.b(r9)
            int r13 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r13 != 0) goto L_0x020c
            goto L_0x01d2
        L_0x020c:
            r8 = 4
            r10.b(r8)
            boolean r8 = r10.e()
            if (r8 == 0) goto L_0x0221
            android.support.v7.widget.RecyclerView r8 = r1.f
            android.view.View r9 = r10.a
            r8.removeDetachedView(r9, r4)
            r10.f()
            goto L_0x022a
        L_0x0221:
            boolean r8 = r10.g()
            if (r8 == 0) goto L_0x022a
            r10.h()
        L_0x022a:
            r1.a(r10)
            r10 = r6
            goto L_0x0255
        L_0x0230:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Inconsistency detected. Invalid view holder adapter position"
            r2.append(r3)
            r2.append(r10)
            android.support.v7.widget.RecyclerView r3 = r1.f
            java.lang.String r3 = r3.a()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L_0x0250:
            int r8 = r8 + 1
            goto L_0x00a0
        L_0x0254:
            r10 = r8
        L_0x0255:
            r11 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r10 != 0) goto L_0x03f3
            android.support.v7.widget.RecyclerView r13 = r1.f
            gw r13 = r13.b
            int r13 = r13.b(r0)
            if (r13 < 0) goto L_0x03bb
            android.support.v7.widget.RecyclerView r14 = r1.f
            jp r14 = r14.g
            int r14 = r14.a()
            if (r13 >= r14) goto L_0x03bb
            android.support.v7.widget.RecyclerView r14 = r1.f
            jp r14 = r14.g
            int r14 = r14.a(r13)
            android.support.v7.widget.RecyclerView r15 = r1.f
            jp r15 = r15.g
            boolean r5 = r15.a
            if (r5 == 0) goto L_0x030f
            long r16 = r15.b(r13)
            java.util.ArrayList r5 = r1.a
            int r5 = r5.size()
            int r5 = r5 + r7
        L_0x028b:
            if (r5 < 0) goto L_0x02d4
            java.util.ArrayList r10 = r1.a
            java.lang.Object r10 = r10.get(r5)
            km r10 = (defpackage.km) r10
            long r8 = r10.e
            int r15 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r15 == 0) goto L_0x029c
            goto L_0x02d1
        L_0x029c:
            boolean r8 = r10.g()
            if (r8 != 0) goto L_0x02d1
            int r8 = r10.f
            if (r14 == r8) goto L_0x02b8
            java.util.ArrayList r8 = r1.a
            r8.remove(r5)
            android.support.v7.widget.RecyclerView r8 = r1.f
            android.view.View r9 = r10.a
            r8.removeDetachedView(r9, r4)
            android.view.View r8 = r10.a
            r1.b(r8)
            goto L_0x02d1
        L_0x02b8:
            r10.b(r3)
            boolean r3 = r10.m()
            if (r3 == 0) goto L_0x02d0
            android.support.v7.widget.RecyclerView r3 = r1.f
            kk r3 = r3.D
            boolean r3 = r3.g
            if (r3 != 0) goto L_0x02d0
            r3 = 2
            r5 = 14
            r10.a(r3, r5)
        L_0x02d0:
            goto L_0x0309
        L_0x02d1:
            int r5 = r5 + -1
            goto L_0x028b
        L_0x02d4:
            java.util.ArrayList r3 = r1.c
            int r3 = r3.size()
            int r3 = r3 + r7
        L_0x02db:
            if (r3 < 0) goto L_0x0307
            java.util.ArrayList r5 = r1.c
            java.lang.Object r5 = r5.get(r3)
            km r5 = (defpackage.km) r5
            long r8 = r5.e
            int r10 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r10 == 0) goto L_0x02ec
            goto L_0x0304
        L_0x02ec:
            boolean r8 = r5.o()
            if (r8 != 0) goto L_0x0304
            int r8 = r5.f
            if (r14 != r8) goto L_0x02fe
            java.util.ArrayList r8 = r1.c
            r8.remove(r3)
            r10 = r5
            goto L_0x0309
        L_0x02fe:
            r1.b(r3)
            r10 = r6
            goto L_0x0309
        L_0x0304:
            int r3 = r3 + -1
            goto L_0x02db
        L_0x0307:
            r10 = r6
        L_0x0309:
            if (r10 == 0) goto L_0x030f
            r10.c = r13
            r2 = 1
            goto L_0x0310
        L_0x030f:
        L_0x0310:
            if (r10 != 0) goto L_0x0350
            kb r3 = r18.d()
            android.util.SparseArray r3 = r3.a
            java.lang.Object r3 = r3.get(r14)
            ka r3 = (defpackage.ka) r3
            if (r3 == 0) goto L_0x0348
            java.util.ArrayList r5 = r3.a
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L_0x0348
            java.util.ArrayList r3 = r3.a
            int r5 = r3.size()
            int r5 = r5 + r7
        L_0x032f:
            if (r5 < 0) goto L_0x0347
            java.lang.Object r7 = r3.get(r5)
            km r7 = (defpackage.km) r7
            boolean r7 = r7.o()
            if (r7 != 0) goto L_0x0344
            java.lang.Object r3 = r3.remove(r5)
            km r3 = (defpackage.km) r3
            goto L_0x0349
        L_0x0344:
            int r5 = r5 + -1
            goto L_0x032f
        L_0x0347:
        L_0x0348:
            r3 = r6
        L_0x0349:
            if (r3 == 0) goto L_0x034e
            r3.r()
        L_0x034e:
            r10 = r3
            goto L_0x0351
        L_0x0350:
        L_0x0351:
            if (r10 != 0) goto L_0x03f3
            long r7 = java.lang.System.nanoTime()
            int r3 = (r20 > r11 ? 1 : (r20 == r11 ? 0 : -1))
            if (r3 == 0) goto L_0x0370
            kb r3 = r1.h
            ka r3 = r3.a(r14)
            long r9 = r3.b
            r16 = 0
            int r3 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            if (r3 != 0) goto L_0x036a
            goto L_0x0370
        L_0x036a:
            long r9 = r9 + r7
            int r3 = (r9 > r20 ? 1 : (r9 == r20 ? 0 : -1))
            if (r3 < 0) goto L_0x0370
            return r6
        L_0x0370:
            android.support.v7.widget.RecyclerView r3 = r1.f
            jp r5 = r3.g
            java.lang.String r9 = "RV CreateView"
            defpackage.bu.a(r9)     // Catch:{ all -> 0x03b6 }
            km r10 = r5.a(r3, r14)     // Catch:{ all -> 0x03b6 }
            android.view.View r3 = r10.a     // Catch:{ all -> 0x03b6 }
            android.view.ViewParent r3 = r3.getParent()     // Catch:{ all -> 0x03b6 }
            if (r3 != 0) goto L_0x03ae
            r10.f = r14     // Catch:{ all -> 0x03b6 }
            defpackage.bu.a()
            android.view.View r3 = r10.a
            android.support.v7.widget.RecyclerView r3 = android.support.v7.widget.RecyclerView.e(r3)
            if (r3 == 0) goto L_0x0399
            java.lang.ref.WeakReference r5 = new java.lang.ref.WeakReference
            r5.<init>(r3)
            r10.b = r5
        L_0x0399:
            long r16 = java.lang.System.nanoTime()
            kb r3 = r1.h
            ka r3 = r3.a(r14)
            long r13 = r3.b
            long r7 = r16 - r7
            long r7 = defpackage.kb.a(r13, r7)
            r3.b = r7
            goto L_0x03f4
        L_0x03ae:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x03b6 }
            java.lang.String r2 = "ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)"
            r0.<init>(r2)     // Catch:{ all -> 0x03b6 }
            throw r0     // Catch:{ all -> 0x03b6 }
        L_0x03b6:
            r0 = move-exception
            defpackage.bu.a()
            throw r0
        L_0x03bb:
            java.lang.IndexOutOfBoundsException r2 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Inconsistency detected. Invalid item position "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = "(offset:"
            r3.append(r0)
            r3.append(r13)
            java.lang.String r0 = ").state:"
            r3.append(r0)
            android.support.v7.widget.RecyclerView r0 = r1.f
            kk r0 = r0.D
            int r0 = r0.a()
            r3.append(r0)
            android.support.v7.widget.RecyclerView r0 = r1.f
            java.lang.String r0 = r0.a()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        L_0x03f3:
        L_0x03f4:
            if (r2 == 0) goto L_0x042c
            android.support.v7.widget.RecyclerView r3 = r1.f
            kk r3 = r3.D
            boolean r3 = r3.g
            if (r3 == 0) goto L_0x03ff
            goto L_0x042c
        L_0x03ff:
            r3 = 8192(0x2000, float:1.14794E-41)
            boolean r5 = r10.o(r3)
            if (r5 == 0) goto L_0x042c
            r10.a(r4, r3)
            android.support.v7.widget.RecyclerView r3 = r1.f
            kk r3 = r3.D
            boolean r3 = r3.j
            if (r3 == 0) goto L_0x042c
            int r3 = defpackage.ju.d(r10)
            android.support.v7.widget.RecyclerView r5 = r1.f
            ju r7 = r5.x
            kk r5 = r5.D
            java.util.List r8 = r10.q()
            r3 = r3 | 4096(0x1000, float:5.74E-42)
            jt r3 = r7.a(r5, r10, r3, r8)
            android.support.v7.widget.RecyclerView r5 = r1.f
            r5.a(r10, r3)
        L_0x042c:
            android.support.v7.widget.RecyclerView r3 = r1.f
            kk r3 = r3.D
            boolean r3 = r3.g
            if (r3 == 0) goto L_0x0441
            boolean r3 = r10.l()
            if (r3 != 0) goto L_0x043b
            goto L_0x0441
        L_0x043b:
            r10.g = r0
        L_0x043d:
            r0 = 0
            r11 = 1
            goto L_0x0528
        L_0x0441:
            boolean r3 = r10.l()
            if (r3 != 0) goto L_0x0448
        L_0x0447:
            goto L_0x0455
        L_0x0448:
            boolean r3 = r10.k()
            if (r3 != 0) goto L_0x0447
            boolean r3 = r10.j()
            if (r3 != 0) goto L_0x0447
        L_0x0454:
            goto L_0x043d
        L_0x0455:
            android.support.v7.widget.RecyclerView r3 = r1.f
            gw r3 = r3.b
            int r3 = r3.b(r0)
            android.support.v7.widget.RecyclerView r5 = r1.f
            r10.o = r5
            int r5 = r10.f
            long r7 = java.lang.System.nanoTime()
            int r9 = (r20 > r11 ? 1 : (r20 == r11 ? 0 : -1))
            if (r9 == 0) goto L_0x0480
            kb r9 = r1.h
            ka r5 = r9.a(r5)
            long r11 = r5.c
            r13 = 0
            int r5 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r5 != 0) goto L_0x047a
            goto L_0x0480
        L_0x047a:
            long r11 = r11 + r7
            int r5 = (r11 > r20 ? 1 : (r11 == r20 ? 0 : -1))
            if (r5 < 0) goto L_0x0480
            goto L_0x0454
        L_0x0480:
            android.support.v7.widget.RecyclerView r5 = r1.f
            jp r5 = r5.g
            r10.c = r3
            boolean r9 = r5.a
            if (r9 == 0) goto L_0x0490
            long r11 = r5.b(r3)
            r10.e = r11
        L_0x0490:
            r9 = 519(0x207, float:7.27E-43)
            r11 = 1
            r10.a(r11, r9)
            java.lang.String r9 = "RV OnBindView"
            defpackage.bu.a(r9)
            java.util.List r9 = r10.q()
            r5.a(r10, r3, r9)
            r10.p()
            android.view.View r3 = r10.a
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            boolean r5 = r3 instanceof defpackage.jy
            if (r5 == 0) goto L_0x04b4
            jy r3 = (defpackage.jy) r3
            r5 = 1
            r3.c = r5
        L_0x04b4:
            defpackage.bu.a()
            long r11 = java.lang.System.nanoTime()
            kb r3 = r1.h
            int r5 = r10.f
            ka r3 = r3.a(r5)
            long r13 = r3.c
            long r11 = r11 - r7
            long r7 = defpackage.kb.a(r13, r11)
            r3.c = r7
            android.support.v7.widget.RecyclerView r3 = r1.f
            boolean r3 = r3.k()
            if (r3 != 0) goto L_0x04d6
            r11 = 1
            goto L_0x051b
        L_0x04d6:
            android.view.View r3 = r10.a
            int r5 = defpackage.dx.e(r3)
            if (r5 == 0) goto L_0x04e0
            r11 = 1
            goto L_0x04e5
        L_0x04e0:
            r11 = 1
            defpackage.dx.a(r3, r11)
        L_0x04e5:
            android.support.v7.widget.RecyclerView r5 = r1.f
            ko r5 = r5.I
            if (r5 == 0) goto L_0x051b
            dj r5 = r5.b()
            boolean r7 = r5 instanceof defpackage.kn
            if (r7 == 0) goto L_0x0518
            r7 = r5
            kn r7 = (defpackage.kn) r7
            android.view.View$AccessibilityDelegate r8 = defpackage.dx.b(r3)
            if (r8 == 0) goto L_0x050c
            boolean r6 = r8 instanceof defpackage.di
            if (r6 == 0) goto L_0x0505
            di r8 = (defpackage.di) r8
            dj r6 = r8.a
            goto L_0x050e
        L_0x0505:
            dj r6 = new dj
            r6.<init>(r8)
            goto L_0x050e
        L_0x050c:
        L_0x050e:
            if (r6 != 0) goto L_0x0511
            goto L_0x0518
        L_0x0511:
            if (r6 == r7) goto L_0x0518
            java.util.Map r7 = r7.b
            r7.put(r3, r6)
        L_0x0518:
            defpackage.dx.a(r3, r5)
        L_0x051b:
            android.support.v7.widget.RecyclerView r3 = r1.f
            kk r3 = r3.D
            boolean r3 = r3.g
            if (r3 == 0) goto L_0x0526
            r10.g = r0
            goto L_0x0527
        L_0x0526:
        L_0x0527:
            r0 = 1
        L_0x0528:
            android.view.View r3 = r10.a
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            if (r3 != 0) goto L_0x053f
            android.support.v7.widget.RecyclerView r3 = r1.f
            android.view.ViewGroup$LayoutParams r3 = r3.generateDefaultLayoutParams()
            jy r3 = (defpackage.jy) r3
            android.view.View r5 = r10.a
            r5.setLayoutParams(r3)
            goto L_0x0557
        L_0x053f:
            android.support.v7.widget.RecyclerView r5 = r1.f
            boolean r5 = r5.checkLayoutParams(r3)
            if (r5 != 0) goto L_0x0555
            android.support.v7.widget.RecyclerView r5 = r1.f
            android.view.ViewGroup$LayoutParams r3 = r5.generateLayoutParams(r3)
            jy r3 = (defpackage.jy) r3
            android.view.View r5 = r10.a
            r5.setLayoutParams(r3)
            goto L_0x0557
        L_0x0555:
            jy r3 = (defpackage.jy) r3
        L_0x0557:
            r3.a = r10
            if (r2 != 0) goto L_0x055c
        L_0x055b:
            goto L_0x055f
        L_0x055c:
            if (r0 == 0) goto L_0x055b
            r4 = 1
        L_0x055f:
            r3.d = r4
            return r10
        L_0x0562:
            java.lang.IndexOutOfBoundsException r2 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Invalid item position "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r4 = "("
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = "). Item count:"
            r3.append(r0)
            android.support.v7.widget.RecyclerView r0 = r1.f
            kk r0 = r0.D
            int r0 = r0.a()
            r3.append(r0)
            android.support.v7.widget.RecyclerView r0 = r1.f
            java.lang.String r0 = r0.a()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            goto L_0x059b
        L_0x059a:
            throw r2
        L_0x059b:
            goto L_0x059a
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kc.a(int, long):km");
    }

    public final void b(km kmVar) {
        if (kmVar.l) {
            this.b.remove(kmVar);
        } else {
            this.a.remove(kmVar);
        }
        kmVar.k = null;
        kmVar.l = false;
        kmVar.h();
    }

    public final void b() {
        jx jxVar = this.f.h;
        this.g = this.e + (jxVar != null ? jxVar.f : 0);
        for (int size = this.c.size() - 1; size >= 0 && this.c.size() > this.g; size--) {
            b(size);
        }
    }
}
