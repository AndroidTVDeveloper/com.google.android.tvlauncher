package p000;

import android.view.View;

/* renamed from: nm */
/* compiled from: PG */
final class C0366nm implements C0363nj {

    /* renamed from: a */
    private final /* synthetic */ C0373nt f10001a;

    public C0366nm(C0373nt ntVar) {
        this.f10001a = ntVar;
    }

    /* renamed from: b */
    public final int mo5632b() {
        return this.f10001a.f10045n;
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
    /* renamed from: a */
    public final void mo5631a(Object obj, int i, int i2, int i3) {
        int i4;
        int i5;
        C0370nq nqVar;
        int i6;
        View view = (View) obj;
        if (i3 == Integer.MIN_VALUE || i3 == Integer.MAX_VALUE) {
            C0373nt ntVar = this.f10001a;
            if (ntVar.f10022C.f9993c) {
                C0405oy oyVar = ntVar.f10023D.f10113d;
                i3 = oyVar.f10106h - oyVar.f10108j;
            } else {
                i3 = ntVar.f10023D.f10113d.f10107i;
            }
        }
        C0373nt ntVar2 = this.f10001a;
        if (!(!ntVar2.f10022C.f9993c)) {
            i5 = i3 - i;
            i4 = i3;
        } else {
            i4 = i + i3;
            i5 = i3;
        }
        int j = ntVar2.mo5674j(i2);
        C0373nt ntVar3 = this.f10001a;
        ntVar3.mo5660a(i2, view, i5, i4, (j + ntVar3.f10023D.f10114e.f10107i) - ntVar3.f10054w);
        C0373nt ntVar4 = this.f10001a;
        if (!ntVar4.f10044m.f9765g) {
            ntVar4.mo5680w();
        }
        C0373nt ntVar5 = this.f10001a;
        if ((ntVar5.f10047p & 3) != 1 && (nqVar = ntVar5.f10052u) != null) {
            if (nqVar.f10013j && (i6 = nqVar.f10014k) != 0) {
                nqVar.f10014k = nqVar.f10015l.mo5659a(true, i6);
            }
            int i7 = nqVar.f10014k;
            if (i7 == 0 || ((i7 > 0 && nqVar.f10015l.mo5681x()) || (nqVar.f10014k < 0 && nqVar.f10015l.mo5682y()))) {
                nqVar.f9743a = nqVar.f10015l.f10049r;
                nqVar.mo5411a();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object[]] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo5629a(int r6, boolean r7, java.lang.Object[] r8, boolean r9) {
        /*
            r5 = this;
            nt r0 = r5.f10001a
            int r1 = r0.f10045n
            int r1 = r6 - r1
            android.view.View r0 = r0.mo5672i(r1)
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            np r1 = (p000.C0369np) r1
            boolean r1 = r1.mo5386a()
            r2 = 0
            if (r1 == 0) goto L_0x0019
            goto L_0x0102
        L_0x0019:
            r1 = -1
            if (r9 != 0) goto L_0x002a
            if (r7 == 0) goto L_0x0024
            nt r7 = r5.f10001a
            r7.mo5358b(r0, r1)
            goto L_0x0037
        L_0x0024:
            nt r7 = r5.f10001a
            r7.mo5358b(r0, r2)
            goto L_0x0037
        L_0x002a:
            if (r7 == 0) goto L_0x0032
            nt r7 = r5.f10001a
            r7.mo5339a(r0, r1)
            goto L_0x0037
        L_0x0032:
            nt r7 = r5.f10001a
            r7.mo5339a(r0, r2)
        L_0x0037:
            nt r7 = r5.f10001a
            int r7 = r7.f10053v
            if (r7 != r1) goto L_0x003e
            goto L_0x0042
        L_0x003e:
            r0.setVisibility(r2)
        L_0x0042:
            nt r7 = r5.f10001a
            nq r7 = r7.f10052u
            if (r7 == 0) goto L_0x00b7
            boolean r9 = r7.f10013j
            if (r9 != 0) goto L_0x00b7
            int r9 = r7.f10014k
            if (r9 == 0) goto L_0x00b7
            if (r9 > 0) goto L_0x005a
            nt r9 = r7.f10015l
            int r1 = r9.f10049r
            int r9 = r9.f10021B
            int r1 = r1 - r9
            goto L_0x0061
        L_0x005a:
            nt r9 = r7.f10015l
            int r1 = r9.f10049r
            int r9 = r9.f10021B
            int r1 = r1 + r9
        L_0x0061:
            r9 = 0
        L_0x0062:
            int r3 = r7.f10014k
            if (r3 == 0) goto L_0x009a
            android.view.View r3 = r7.mo5416b(r1)
            if (r3 == 0) goto L_0x009a
            nt r4 = r7.f10015l
            boolean r4 = r4.mo5673i(r3)
            if (r4 == 0) goto L_0x008a
            nt r9 = r7.f10015l
            r9.f10049r = r1
            r9.f10050s = r2
            int r9 = r7.f10014k
            if (r9 <= 0) goto L_0x0083
            int r9 = r9 + -1
            r7.f10014k = r9
            goto L_0x0089
        L_0x0083:
            int r9 = r9 + 1
            r7.f10014k = r9
        L_0x0089:
            r9 = r3
        L_0x008a:
            int r3 = r7.f10014k
            if (r3 <= 0) goto L_0x0094
            nt r3 = r7.f10015l
            int r3 = r3.f10021B
            int r1 = r1 + r3
            goto L_0x0062
        L_0x0094:
            nt r3 = r7.f10015l
            int r3 = r3.f10021B
            int r1 = r1 - r3
            goto L_0x0062
        L_0x009a:
            if (r9 == 0) goto L_0x00b7
            nt r1 = r7.f10015l
            boolean r1 = r1.mo5379l()
            if (r1 == 0) goto L_0x00b7
            nt r1 = r7.f10015l
            int r3 = r1.f10047p
            r3 = r3 | 32
            r1.f10047p = r3
            r9.requestFocus()
            nt r7 = r7.f10015l
            int r9 = r7.f10047p
            r9 = r9 & -33
            r7.f10047p = r9
        L_0x00b7:
            android.view.View r7 = r0.findFocus()
            p000.C0373nt.m8051b(r0, r7)
            nt r7 = r5.f10001a
            int r9 = r7.f10047p
            r1 = r9 & 3
            r3 = 1
            if (r1 != r3) goto L_0x00f2
            r1 = r9 & 4
            if (r1 != 0) goto L_0x00fd
            r9 = r9 & 16
            if (r9 == 0) goto L_0x00ea
            int r7 = r7.f10049r
            if (r6 >= r7) goto L_0x00d4
            goto L_0x00fd
        L_0x00d4:
            boolean r7 = r0.hasFocusable()
            if (r7 == 0) goto L_0x00fd
            nt r7 = r5.f10001a
            r7.f10049r = r6
            r7.f10050s = r2
            int r6 = r7.f10047p
            r6 = r6 & -17
            r7.f10047p = r6
            r7.mo5676s()
            goto L_0x00fd
        L_0x00ea:
            int r9 = r7.f10049r
            if (r6 != r9) goto L_0x00fd
            r7.mo5676s()
            goto L_0x00fd
        L_0x00f2:
            int r9 = r7.f10049r
            if (r6 != r9) goto L_0x00fd
            nq r6 = r7.f10052u
            if (r6 != 0) goto L_0x00fd
            r7.mo5676s()
        L_0x00fd:
            nt r6 = r5.f10001a
            r6.mo5671h(r0)
        L_0x0102:
            r8[r2] = r0
            nt r6 = r5.f10001a
            int r6 = r6.f10043l
            if (r6 == 0) goto L_0x010f
            int r6 = p000.C0373nt.m8054j(r0)
            goto L_0x0113
        L_0x010f:
            int r6 = p000.C0373nt.m8055k(r0)
        L_0x0113:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0366nm.mo5629a(int, boolean, java.lang.Object[], boolean):int");
    }

    /* renamed from: a */
    public final int mo5628a() {
        return this.f10001a.f10044m.mo5420a() + this.f10001a.f10045n;
    }

    /* renamed from: b */
    public final int mo5633b(int i) {
        C0373nt ntVar = this.f10001a;
        View c = ntVar.mo5363c(i - ntVar.f10045n);
        C0373nt ntVar2 = this.f10001a;
        return (ntVar2.f10047p & 262144) != 0 ? ntVar2.mo5666f(c) : ntVar2.mo5665e(c);
    }

    /* renamed from: c */
    public final int mo5634c(int i) {
        C0373nt ntVar = this.f10001a;
        return ntVar.mo5668g(ntVar.mo5363c(i - ntVar.f10045n));
    }

    /* renamed from: a */
    public final void mo5630a(int i) {
        C0373nt ntVar = this.f10001a;
        View c = ntVar.mo5363c(i - ntVar.f10045n);
        C0373nt ntVar2 = this.f10001a;
        if ((ntVar2.f10047p & 3) == 1) {
            ntVar2.mo5343a(c, ntVar2.f10046o);
        } else {
            ntVar2.mo5360b(c, ntVar2.f10046o);
        }
    }
}
