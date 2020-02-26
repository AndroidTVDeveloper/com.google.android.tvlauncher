package defpackage;

import android.view.View;

/* renamed from: nm  reason: default package */
/* compiled from: PG */
final class nm implements nj {
    private final /* synthetic */ nt a;

    public nm(nt ntVar) {
        this.a = ntVar;
    }

    public final int b() {
        return this.a.n;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: nt.a(boolean, int):int
     arg types: [int, int]
     candidates:
      nt.a(android.content.Context, android.util.AttributeSet):jy
      nt.a(int, jw):void
      nt.a(int, boolean):void
      nt.a(android.view.View, android.graphics.Rect):void
      nt.a(android.view.View, android.view.View):void
      nt.a(android.view.View, ed):void
      nt.a(android.view.View, boolean):void
      nt.a(jp, jp):void
      nt.a(kc, kk):void
      jx.a(android.content.Context, android.util.AttributeSet):jy
      jx.a(int, int):void
      jx.a(int, jw):void
      jx.a(android.view.View, int):void
      jx.a(android.view.View, android.graphics.Rect):void
      jx.a(android.view.View, android.view.View):void
      jx.a(android.view.View, ed):void
      jx.a(android.view.View, kc):void
      jx.a(jp, jp):void
      jx.a(kc, kk):void
      nt.a(boolean, int):int */
    public final void a(Object obj, int i, int i2, int i3) {
        int i4;
        int i5;
        nq nqVar;
        int i6;
        View view = (View) obj;
        if (i3 == Integer.MIN_VALUE || i3 == Integer.MAX_VALUE) {
            nt ntVar = this.a;
            if (ntVar.C.c) {
                oy oyVar = ntVar.D.d;
                i3 = oyVar.h - oyVar.j;
            } else {
                i3 = ntVar.D.d.i;
            }
        }
        nt ntVar2 = this.a;
        if (!(!ntVar2.C.c)) {
            i5 = i3 - i;
            i4 = i3;
        } else {
            i4 = i + i3;
            i5 = i3;
        }
        int j = ntVar2.j(i2);
        nt ntVar3 = this.a;
        ntVar3.a(i2, view, i5, i4, (j + ntVar3.D.e.i) - ntVar3.w);
        nt ntVar4 = this.a;
        if (!ntVar4.m.g) {
            ntVar4.w();
        }
        nt ntVar5 = this.a;
        if ((ntVar5.p & 3) != 1 && (nqVar = ntVar5.u) != null) {
            if (nqVar.j && (i6 = nqVar.k) != 0) {
                nqVar.k = nqVar.l.a(true, i6);
            }
            int i7 = nqVar.k;
            if (i7 == 0 || ((i7 > 0 && nqVar.l.x()) || (nqVar.k < 0 && nqVar.l.y()))) {
                nqVar.a = nqVar.l.r;
                nqVar.a();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object[]] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(int r6, boolean r7, java.lang.Object[] r8, boolean r9) {
        /*
            r5 = this;
            nt r0 = r5.a
            int r1 = r0.n
            int r1 = r6 - r1
            android.view.View r0 = r0.i(r1)
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            np r1 = (defpackage.np) r1
            boolean r1 = r1.a()
            r2 = 0
            if (r1 == 0) goto L_0x0019
            goto L_0x0102
        L_0x0019:
            r1 = -1
            if (r9 != 0) goto L_0x002a
            if (r7 == 0) goto L_0x0024
            nt r7 = r5.a
            r7.b(r0, r1)
            goto L_0x0037
        L_0x0024:
            nt r7 = r5.a
            r7.b(r0, r2)
            goto L_0x0037
        L_0x002a:
            if (r7 == 0) goto L_0x0032
            nt r7 = r5.a
            r7.a(r0, r1)
            goto L_0x0037
        L_0x0032:
            nt r7 = r5.a
            r7.a(r0, r2)
        L_0x0037:
            nt r7 = r5.a
            int r7 = r7.v
            if (r7 != r1) goto L_0x003e
            goto L_0x0042
        L_0x003e:
            r0.setVisibility(r2)
        L_0x0042:
            nt r7 = r5.a
            nq r7 = r7.u
            if (r7 == 0) goto L_0x00b7
            boolean r9 = r7.j
            if (r9 != 0) goto L_0x00b7
            int r9 = r7.k
            if (r9 == 0) goto L_0x00b7
            if (r9 > 0) goto L_0x005a
            nt r9 = r7.l
            int r1 = r9.r
            int r9 = r9.B
            int r1 = r1 - r9
            goto L_0x0061
        L_0x005a:
            nt r9 = r7.l
            int r1 = r9.r
            int r9 = r9.B
            int r1 = r1 + r9
        L_0x0061:
            r9 = 0
        L_0x0062:
            int r3 = r7.k
            if (r3 == 0) goto L_0x009a
            android.view.View r3 = r7.b(r1)
            if (r3 == 0) goto L_0x009a
            nt r4 = r7.l
            boolean r4 = r4.i(r3)
            if (r4 == 0) goto L_0x008a
            nt r9 = r7.l
            r9.r = r1
            r9.s = r2
            int r9 = r7.k
            if (r9 <= 0) goto L_0x0083
            int r9 = r9 + -1
            r7.k = r9
            goto L_0x0089
        L_0x0083:
            int r9 = r9 + 1
            r7.k = r9
        L_0x0089:
            r9 = r3
        L_0x008a:
            int r3 = r7.k
            if (r3 <= 0) goto L_0x0094
            nt r3 = r7.l
            int r3 = r3.B
            int r1 = r1 + r3
            goto L_0x0062
        L_0x0094:
            nt r3 = r7.l
            int r3 = r3.B
            int r1 = r1 - r3
            goto L_0x0062
        L_0x009a:
            if (r9 == 0) goto L_0x00b7
            nt r1 = r7.l
            boolean r1 = r1.l()
            if (r1 == 0) goto L_0x00b7
            nt r1 = r7.l
            int r3 = r1.p
            r3 = r3 | 32
            r1.p = r3
            r9.requestFocus()
            nt r7 = r7.l
            int r9 = r7.p
            r9 = r9 & -33
            r7.p = r9
        L_0x00b7:
            android.view.View r7 = r0.findFocus()
            defpackage.nt.b(r0, r7)
            nt r7 = r5.a
            int r9 = r7.p
            r1 = r9 & 3
            r3 = 1
            if (r1 != r3) goto L_0x00f2
            r1 = r9 & 4
            if (r1 != 0) goto L_0x00fd
            r9 = r9 & 16
            if (r9 == 0) goto L_0x00ea
            int r7 = r7.r
            if (r6 >= r7) goto L_0x00d4
            goto L_0x00fd
        L_0x00d4:
            boolean r7 = r0.hasFocusable()
            if (r7 == 0) goto L_0x00fd
            nt r7 = r5.a
            r7.r = r6
            r7.s = r2
            int r6 = r7.p
            r6 = r6 & -17
            r7.p = r6
            r7.s()
            goto L_0x00fd
        L_0x00ea:
            int r9 = r7.r
            if (r6 != r9) goto L_0x00fd
            r7.s()
            goto L_0x00fd
        L_0x00f2:
            int r9 = r7.r
            if (r6 != r9) goto L_0x00fd
            nq r6 = r7.u
            if (r6 != 0) goto L_0x00fd
            r7.s()
        L_0x00fd:
            nt r6 = r5.a
            r6.h(r0)
        L_0x0102:
            r8[r2] = r0
            nt r6 = r5.a
            int r6 = r6.l
            if (r6 == 0) goto L_0x010f
            int r6 = defpackage.nt.j(r0)
            goto L_0x0113
        L_0x010f:
            int r6 = defpackage.nt.k(r0)
        L_0x0113:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nm.a(int, boolean, java.lang.Object[], boolean):int");
    }

    public final int a() {
        return this.a.m.a() + this.a.n;
    }

    public final int b(int i) {
        nt ntVar = this.a;
        View c = ntVar.c(i - ntVar.n);
        nt ntVar2 = this.a;
        return (ntVar2.p & 262144) != 0 ? ntVar2.f(c) : ntVar2.e(c);
    }

    public final int c(int i) {
        nt ntVar = this.a;
        return ntVar.g(ntVar.c(i - ntVar.n));
    }

    public final void a(int i) {
        nt ntVar = this.a;
        View c = ntVar.c(i - ntVar.n);
        nt ntVar2 = this.a;
        if ((ntVar2.p & 3) == 1) {
            ntVar2.a(c, ntVar2.o);
        } else {
            ntVar2.b(c, ntVar2.o);
        }
    }
}
