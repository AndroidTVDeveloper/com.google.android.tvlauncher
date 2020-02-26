package p000;

/* renamed from: ov */
/* compiled from: PG */
final class C0402ov extends C0364nk {

    /* renamed from: j */
    private final C0070co f10094j = new C0070co((byte) 0);

    /* renamed from: k */
    private int f10095k = -1;

    /* renamed from: l */
    private Object f10096l;

    /* renamed from: m */
    private int f10097m;

    public C0402ov() {
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: nj.a(int, boolean, java.lang.Object[], boolean):int
     arg types: [int, int, java.lang.Object[], int]
     candidates:
      nj.a(java.lang.Object, int, int, int):void
      nj.a(int, boolean, java.lang.Object[], boolean):int */
    /* renamed from: b */
    private final int m8148b(int i, int i2, int i3) {
        int i4;
        int i5;
        int i6 = this.f9997g;
        if (i6 >= 0 && !(i6 == m8149d() && this.f9997g == i - 1)) {
            throw new IllegalStateException();
        }
        int i7 = this.f9997g;
        if (i7 >= 0) {
            i4 = i3 - this.f9992b.mo5633b(i7);
        } else if (this.f10094j.mo3158c() <= 0 || i != m8149d() + 1) {
            i4 = 0;
        } else {
            int d = m8149d();
            while (true) {
                if (d >= this.f10095k) {
                    if (mo5648d(d).f9990a == i2) {
                        break;
                    }
                    d--;
                } else {
                    d = m8149d();
                    break;
                }
            }
            if (this.f9993c) {
                i5 = (-mo5648d(d).f10093c) - this.f9994d;
            } else {
                i5 = mo5648d(d).f10093c + this.f9994d;
            }
            for (int i8 = d + 1; i8 <= m8149d(); i8++) {
                i5 -= mo5648d(i8).f10092b;
            }
            i4 = i5;
        }
        C0401ou ouVar = new C0401ou(i2, i4);
        C0070co coVar = this.f10094j;
        Object[] objArr = coVar.f6133a;
        int i9 = coVar.f6135c;
        objArr[i9] = ouVar;
        int i10 = coVar.f6136d & (i9 + 1);
        coVar.f6135c = i10;
        if (i10 == coVar.f6134b) {
            coVar.mo3154a();
        }
        Object obj = this.f10096l;
        if (obj == null) {
            ouVar.f10093c = this.f9992b.mo5629a(i, true, this.f9991a, false);
            obj = this.f9991a[0];
        } else {
            ouVar.f10093c = this.f10097m;
            this.f10096l = null;
        }
        if (this.f10094j.mo3158c() == 1) {
            this.f9997g = i;
            this.f9996f = i;
            this.f10095k = i;
        } else {
            int i11 = this.f9997g;
            if (i11 >= 0) {
                this.f9997g = i11 + 1;
            } else {
                this.f9997g = i;
                this.f9996f = i;
            }
        }
        this.f9992b.mo5631a(obj, ouVar.f10093c, i2, i3);
        return ouVar.f10093c;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: nj.a(int, boolean, java.lang.Object[], boolean):int
     arg types: [int, int, java.lang.Object[], int]
     candidates:
      nj.a(java.lang.Object, int, int, int):void
      nj.a(int, boolean, java.lang.Object[], boolean):int */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ov.b(boolean, int, int[]):int
     arg types: [int, int, ?[OBJECT, ARRAY]]
     candidates:
      ov.b(int, int, int):int
      ov.b(boolean, int, int[]):int */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ov.a(boolean, int, int[]):int
     arg types: [int, int, ?[OBJECT, ARRAY]]
     candidates:
      ov.a(int, int, int):int
      nk.a(int, int, jw):void
      ov.a(boolean, int, int[]):int */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: nk.a(boolean, int[]):int
     arg types: [int, ?[OBJECT, ARRAY]]
     candidates:
      ov.a(int, boolean):boolean
      ov.a(int, int):cp[]
      nk.a(int, boolean):boolean
      nk.a(int, int):cp[]
      nk.a(boolean, int[]):int */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x01e7 A[Catch:{ all -> 0x0229 }] */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x0207 A[EDGE_INSN: B:183:0x0207->B:161:0x0207 ?: BREAK  , SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo5640a(int r14, boolean r15) {
        /*
            r13 = this;
            nj r0 = r13.f9992b
            int r0 = r0.mo5628a()
            r1 = 0
            if (r0 == 0) goto L_0x0231
            if (r15 != 0) goto L_0x0013
            boolean r0 = r13.mo5649e(r14)
            if (r0 != 0) goto L_0x0012
            goto L_0x0013
        L_0x0012:
            return r1
        L_0x0013:
            r0 = 0
            co r2 = r13.f10094j     // Catch:{ all -> 0x0229 }
            int r2 = r2.mo3158c()     // Catch:{ all -> 0x0229 }
            r3 = 2147483647(0x7fffffff, float:NaN)
            r4 = -1
            r5 = 1
            if (r2 == 0) goto L_0x00b9
            nj r2 = r13.f9992b     // Catch:{ all -> 0x0229 }
            int r2 = r2.mo5628a()     // Catch:{ all -> 0x0229 }
            int r6 = r13.f9997g     // Catch:{ all -> 0x0229 }
            if (r6 >= 0) goto L_0x0050
            int r6 = r13.f9999i     // Catch:{ all -> 0x0229 }
            if (r6 == r4) goto L_0x0030
            goto L_0x0032
        L_0x0030:
            r6 = 0
        L_0x0032:
            int r7 = r13.m8149d()     // Catch:{ all -> 0x0229 }
            int r7 = r7 + r5
            if (r6 > r7) goto L_0x0049
            int r7 = r13.f10095k     // Catch:{ all -> 0x0229 }
            if (r6 >= r7) goto L_0x003e
            goto L_0x0049
        L_0x003e:
            int r7 = r13.m8149d()     // Catch:{ all -> 0x0229 }
            if (r6 > r7) goto L_0x00b9
            r7 = r6
            r6 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x005a
        L_0x0049:
            co r2 = r13.f10094j     // Catch:{ all -> 0x0229 }
            r2.mo3156b()     // Catch:{ all -> 0x0229 }
            goto L_0x00b9
        L_0x0050:
            int r7 = r6 + 1
            nj r8 = r13.f9992b     // Catch:{ all -> 0x0229 }
            int r6 = r8.mo5633b(r6)     // Catch:{ all -> 0x0229 }
        L_0x005a:
            int r8 = r13.m8149d()     // Catch:{ all -> 0x0229 }
        L_0x005e:
            if (r7 >= r2) goto L_0x00b9
            if (r7 > r8) goto L_0x00b9
            ou r9 = r13.mo5648d(r7)     // Catch:{ all -> 0x0229 }
            if (r6 == r3) goto L_0x006c
            int r10 = r9.f10092b     // Catch:{ all -> 0x0229 }
            int r6 = r6 + r10
            goto L_0x006d
        L_0x006c:
        L_0x006d:
            int r10 = r9.f9990a     // Catch:{ all -> 0x0229 }
            nj r11 = r13.f9992b     // Catch:{ all -> 0x0229 }
            java.lang.Object[] r12 = r13.f9991a     // Catch:{ all -> 0x0229 }
            int r11 = r11.mo5629a(r7, r5, r12, r1)     // Catch:{ all -> 0x0229 }
            int r12 = r9.f10093c     // Catch:{ all -> 0x0229 }
            if (r11 == r12) goto L_0x0084
            r9.f10093c = r11     // Catch:{ all -> 0x0229 }
            co r9 = r13.f10094j     // Catch:{ all -> 0x0229 }
            int r8 = r8 - r7
            r9.mo3157b(r8)     // Catch:{ all -> 0x0229 }
            r8 = r7
        L_0x0084:
            r13.f9997g = r7     // Catch:{ all -> 0x0229 }
            int r9 = r13.f9996f     // Catch:{ all -> 0x0229 }
            if (r9 < 0) goto L_0x008b
            goto L_0x008d
        L_0x008b:
            r13.f9996f = r7     // Catch:{ all -> 0x0229 }
        L_0x008d:
            nj r9 = r13.f9992b     // Catch:{ all -> 0x0229 }
            java.lang.Object[] r12 = r13.f9991a     // Catch:{ all -> 0x0229 }
            r12 = r12[r1]     // Catch:{ all -> 0x0229 }
            r9.mo5631a(r12, r11, r10, r6)     // Catch:{ all -> 0x0229 }
            if (r15 != 0) goto L_0x009e
            boolean r9 = r13.mo5649e(r14)     // Catch:{ all -> 0x0229 }
            if (r9 != 0) goto L_0x00af
        L_0x009e:
            if (r6 != r3) goto L_0x00a7
            nj r6 = r13.f9992b     // Catch:{ all -> 0x0229 }
            int r6 = r6.mo5633b(r7)     // Catch:{ all -> 0x0229 }
        L_0x00a7:
            int r9 = r13.f9995e     // Catch:{ all -> 0x0229 }
            int r9 = r9 + r4
            if (r10 == r9) goto L_0x00ad
        L_0x00ac:
            goto L_0x00b6
        L_0x00ad:
            if (r15 == 0) goto L_0x00ac
        L_0x00af:
            java.lang.Object[] r14 = r13.f9991a
            r14[r1] = r0
        L_0x00b3:
            r13.f10096l = r0
            return r5
        L_0x00b6:
            int r7 = r7 + 1
            goto L_0x005e
        L_0x00b9:
            nj r2 = r13.f9992b     // Catch:{ all -> 0x0229 }
            int r2 = r2.mo5628a()     // Catch:{ all -> 0x0229 }
            int r6 = r13.f9997g     // Catch:{ all -> 0x0229 }
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r6 >= 0) goto L_0x00ea
            int r6 = r13.f9999i     // Catch:{ all -> 0x0229 }
            if (r6 == r4) goto L_0x00ca
            goto L_0x00cc
        L_0x00ca:
            r6 = 0
        L_0x00cc:
            co r8 = r13.f10094j     // Catch:{ all -> 0x0229 }
            int r8 = r8.mo3158c()     // Catch:{ all -> 0x0229 }
            if (r8 <= 0) goto L_0x00e0
            int r8 = r13.m8149d()     // Catch:{ all -> 0x0229 }
            ou r8 = r13.mo5648d(r8)     // Catch:{ all -> 0x0229 }
            int r8 = r8.f9990a     // Catch:{ all -> 0x0229 }
            int r8 = r8 + r5
            goto L_0x00e1
        L_0x00e0:
            r8 = r6
        L_0x00e1:
            int r9 = r13.f9995e     // Catch:{ all -> 0x0229 }
            int r8 = r8 % r9
            r10 = r6
            r6 = r8
            r8 = 0
            r9 = 0
            goto L_0x0157
        L_0x00ea:
            int r8 = r13.m8149d()     // Catch:{ all -> 0x0229 }
            if (r6 < r8) goto L_0x0221
            int r6 = r13.f9997g     // Catch:{ all -> 0x0229 }
            int r8 = r6 + 1
            ou r6 = r13.mo5648d(r6)     // Catch:{ all -> 0x0229 }
            int r6 = r6.f9990a     // Catch:{ all -> 0x0229 }
            int r9 = r13.m8147a(r5)     // Catch:{ all -> 0x0229 }
            if (r9 < 0) goto L_0x010f
            boolean r10 = r13.f9993c     // Catch:{ all -> 0x0229 }
            if (r10 != 0) goto L_0x0109
            int r9 = r13.mo5642b(r5, r9, r0)     // Catch:{ all -> 0x0229 }
            goto L_0x012b
        L_0x0109:
            int r9 = r13.mo5635a(r1, r9, r0)     // Catch:{ all -> 0x0229 }
            goto L_0x012b
        L_0x010f:
            r9 = 0
            r10 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x0112:
            int r11 = r13.f9995e     // Catch:{ all -> 0x0229 }
            if (r9 >= r11) goto L_0x012a
            boolean r10 = r13.f9993c     // Catch:{ all -> 0x0229 }
            if (r10 == 0) goto L_0x011f
            int r10 = r13.m8152j(r9)     // Catch:{ all -> 0x0229 }
            goto L_0x0123
        L_0x011f:
            int r10 = r13.m8151i(r9)     // Catch:{ all -> 0x0229 }
        L_0x0123:
            if (r10 != r7) goto L_0x0128
            int r9 = r9 + 1
            goto L_0x0112
        L_0x0128:
            r9 = r10
            goto L_0x012b
        L_0x012a:
            r9 = r10
        L_0x012b:
            boolean r10 = r13.f9993c     // Catch:{ all -> 0x0229 }
            if (r10 != 0) goto L_0x0136
            int r10 = r13.m8151i(r6)     // Catch:{ all -> 0x0229 }
            if (r10 < r9) goto L_0x0153
            goto L_0x013d
        L_0x0136:
            int r10 = r13.m8152j(r6)     // Catch:{ all -> 0x0229 }
            if (r10 <= r9) goto L_0x013d
            goto L_0x0153
        L_0x013d:
            int r6 = r6 + 1
            int r10 = r13.f9995e     // Catch:{ all -> 0x0229 }
            if (r6 != r10) goto L_0x0153
            boolean r6 = r13.f9993c     // Catch:{ all -> 0x0229 }
            if (r6 == 0) goto L_0x014c
            int r6 = r13.mo5636a(r1, r0)     // Catch:{ all -> 0x0229 }
            goto L_0x0150
        L_0x014c:
            int r6 = r13.mo5643b(r5, r0)     // Catch:{ all -> 0x0229 }
        L_0x0150:
            r9 = r6
            r6 = 0
            goto L_0x0154
        L_0x0153:
        L_0x0154:
            r10 = r8
            r8 = 1
        L_0x0157:
            r11 = r9
            r9 = r8
            r8 = 0
        L_0x015a:
            int r12 = r13.f9995e     // Catch:{ all -> 0x0229 }
            if (r6 < r12) goto L_0x0171
            if (r15 != 0) goto L_0x021f
            boolean r6 = r13.f9993c     // Catch:{ all -> 0x0229 }
            if (r6 == 0) goto L_0x0169
            int r6 = r13.mo5636a(r1, r0)     // Catch:{ all -> 0x0229 }
            goto L_0x016d
        L_0x0169:
            int r6 = r13.mo5643b(r5, r0)     // Catch:{ all -> 0x0229 }
        L_0x016d:
            r11 = r6
            r6 = 0
            goto L_0x015a
        L_0x0171:
            if (r10 == r2) goto L_0x021f
            if (r15 != 0) goto L_0x017b
            boolean r12 = r13.mo5649e(r14)     // Catch:{ all -> 0x0229 }
            if (r12 != 0) goto L_0x021f
        L_0x017b:
            boolean r8 = r13.f9993c     // Catch:{ all -> 0x0229 }
            if (r8 == 0) goto L_0x0184
            int r8 = r13.m8152j(r6)     // Catch:{ all -> 0x0229 }
            goto L_0x0188
        L_0x0184:
            int r8 = r13.m8151i(r6)     // Catch:{ all -> 0x0229 }
        L_0x0188:
            if (r8 == r3) goto L_0x0198
            if (r8 == r7) goto L_0x0198
            boolean r12 = r13.f9993c     // Catch:{ all -> 0x0229 }
            if (r12 == 0) goto L_0x0194
            int r12 = r13.f9994d     // Catch:{ all -> 0x0229 }
            int r12 = -r12
            goto L_0x0196
        L_0x0194:
            int r12 = r13.f9994d     // Catch:{ all -> 0x0229 }
        L_0x0196:
            int r8 = r8 + r12
            goto L_0x01ce
        L_0x0198:
            if (r6 == 0) goto L_0x01ac
            boolean r8 = r13.f9993c     // Catch:{ all -> 0x0229 }
            if (r8 != 0) goto L_0x01a5
            int r8 = r6 + -1
            int r8 = r13.m8152j(r8)     // Catch:{ all -> 0x0229 }
            goto L_0x01ce
        L_0x01a5:
            int r8 = r6 + -1
            int r8 = r13.m8151i(r8)     // Catch:{ all -> 0x0229 }
            goto L_0x01ce
        L_0x01ac:
            boolean r8 = r13.f9993c     // Catch:{ all -> 0x0229 }
            if (r8 != 0) goto L_0x01b8
            int r8 = r13.f9995e     // Catch:{ all -> 0x0229 }
            int r8 = r8 + r4
            int r8 = r13.m8151i(r8)     // Catch:{ all -> 0x0229 }
            goto L_0x01bf
        L_0x01b8:
            int r8 = r13.f9995e     // Catch:{ all -> 0x0229 }
            int r8 = r8 + r4
            int r8 = r13.m8152j(r8)     // Catch:{ all -> 0x0229 }
        L_0x01bf:
            if (r8 == r3) goto L_0x01ce
            if (r8 == r7) goto L_0x01ce
            boolean r12 = r13.f9993c     // Catch:{ all -> 0x0229 }
            if (r12 != 0) goto L_0x01ca
            int r12 = r13.f9994d     // Catch:{ all -> 0x0229 }
            goto L_0x01cd
        L_0x01ca:
            int r12 = r13.f9994d     // Catch:{ all -> 0x0229 }
            int r12 = -r12
        L_0x01cd:
            int r8 = r8 + r12
        L_0x01ce:
            int r12 = r10 + 1
            int r10 = r13.m8148b(r10, r6, r8)     // Catch:{ all -> 0x0229 }
            if (r9 == 0) goto L_0x0208
        L_0x01d6:
            boolean r9 = r13.f9993c     // Catch:{ all -> 0x0229 }
            if (r9 != 0) goto L_0x01df
            int r9 = r8 + r10
            if (r9 < r11) goto L_0x01e5
            goto L_0x01e3
        L_0x01df:
            int r9 = r8 - r10
            if (r9 > r11) goto L_0x01e5
        L_0x01e3:
            r10 = r12
            goto L_0x0218
        L_0x01e5:
            if (r12 == r2) goto L_0x0207
            if (r15 != 0) goto L_0x01f1
            boolean r9 = r13.mo5649e(r14)     // Catch:{ all -> 0x0229 }
            if (r9 != 0) goto L_0x01f0
            goto L_0x01f1
        L_0x01f0:
            goto L_0x0207
        L_0x01f1:
            boolean r9 = r13.f9993c     // Catch:{ all -> 0x0229 }
            if (r9 == 0) goto L_0x01fa
            int r9 = -r10
            int r10 = r13.f9994d     // Catch:{ all -> 0x0229 }
            int r9 = r9 - r10
            goto L_0x01fd
        L_0x01fa:
            int r9 = r13.f9994d     // Catch:{ all -> 0x0229 }
            int r9 = r9 + r10
        L_0x01fd:
            int r8 = r8 + r9
            int r9 = r12 + 1
            int r10 = r13.m8148b(r12, r6, r8)     // Catch:{ all -> 0x0229 }
            r12 = r9
            goto L_0x01d6
        L_0x0207:
            goto L_0x0223
        L_0x0208:
            boolean r8 = r13.f9993c     // Catch:{ all -> 0x0229 }
            if (r8 == 0) goto L_0x0211
            int r8 = r13.m8152j(r6)     // Catch:{ all -> 0x0229 }
            goto L_0x0215
        L_0x0211:
            int r8 = r13.m8151i(r6)     // Catch:{ all -> 0x0229 }
        L_0x0215:
            r11 = r8
            r10 = r12
        L_0x0218:
            int r6 = r6 + 1
            r8 = 1
            r9 = 1
            goto L_0x015a
        L_0x021f:
            r5 = r8
            goto L_0x0223
        L_0x0221:
            r5 = 0
        L_0x0223:
            java.lang.Object[] r14 = r13.f9991a
            r14[r1] = r0
            goto L_0x00b3
        L_0x0229:
            r14 = move-exception
            java.lang.Object[] r15 = r13.f9991a
            r15[r1] = r0
            r13.f10096l = r0
            throw r14
        L_0x0231:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0402ov.mo5640a(int, boolean):boolean");
    }

    /* renamed from: a */
    public final C0072cp[] mo5641a(int i, int i2) {
        for (int i3 = 0; i3 < this.f9995e; i3++) {
            this.f9998h[i3].mo3539a();
        }
        if (i >= 0) {
            while (i <= i2) {
                C0072cp cpVar = this.f9998h[mo5648d(i).f9990a];
                if (cpVar.mo3541b() > 0) {
                    int i4 = cpVar.f6861b;
                    if (i4 != 0) {
                        int[] iArr = cpVar.f6860a;
                        int i5 = (i4 - 1) & cpVar.f6862c;
                        if (iArr[i5] == i - 1) {
                            if (i4 != 0) {
                                cpVar.f6861b = i5;
                                cpVar.mo3540a(i);
                                i++;
                            } else {
                                throw new ArrayIndexOutOfBoundsException();
                            }
                        }
                    } else {
                        throw new ArrayIndexOutOfBoundsException();
                    }
                }
                cpVar.mo3540a(i);
                cpVar.mo3540a(i);
                i++;
            }
        }
        return this.f9998h;
    }

    /* renamed from: d */
    private final int m8149d() {
        return (this.f10095k + this.f10094j.mo3158c()) - 1;
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public final C0401ou mo5648d(int i) {
        int i2 = i - this.f10095k;
        if (i2 < 0 || i2 >= this.f10094j.mo3158c()) {
            return null;
        }
        C0070co coVar = this.f10094j;
        if (i2 < coVar.mo3158c()) {
            return (C0401ou) coVar.f6133a[coVar.f6136d & (coVar.f6134b + i2)];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    /* renamed from: b */
    public final void mo5644b(int i) {
        super.mo5644b(i);
        this.f10094j.mo3157b((m8149d() - i) + 1);
        if (this.f10094j.mo3158c() == 0) {
            this.f10095k = -1;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: nj.a(int, boolean, java.lang.Object[], boolean):int
     arg types: [int, int, java.lang.Object[], int]
     candidates:
      nj.a(java.lang.Object, int, int, int):void
      nj.a(int, boolean, java.lang.Object[], boolean):int */
    /* renamed from: a */
    private final int m8146a(int i, int i2, int i3) {
        int i4;
        int i5;
        int i6 = this.f9996f;
        if (i6 >= 0 && !(i6 == this.f10095k && i6 == i + 1)) {
            throw new IllegalStateException();
        }
        int i7 = this.f10095k;
        C0401ou h = i7 >= 0 ? mo5648d(i7) : null;
        int b = this.f9992b.mo5633b(this.f10095k);
        C0401ou ouVar = new C0401ou(i2, 0);
        C0070co coVar = this.f10094j;
        int i8 = (coVar.f6134b - 1) & coVar.f6136d;
        coVar.f6134b = i8;
        coVar.f6133a[i8] = ouVar;
        if (i8 == coVar.f6135c) {
            coVar.mo3154a();
        }
        Object obj = this.f10096l;
        if (obj == null) {
            i4 = this.f9992b.mo5629a(i, false, this.f9991a, false);
            ouVar.f10093c = i4;
            obj = this.f9991a[0];
        } else {
            int i9 = this.f10097m;
            ouVar.f10093c = i9;
            this.f10096l = null;
            i4 = i9;
        }
        this.f9996f = i;
        this.f10095k = i;
        if (this.f9997g < 0) {
            this.f9997g = i;
        }
        if (this.f9993c) {
            i5 = i3 + i4;
        } else {
            i5 = i3 - i4;
        }
        if (h != null) {
            h.f10092b = b - i5;
        }
        this.f9992b.mo5631a(obj, i4, i2, i5);
        return ouVar.f10093c;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: nj.a(int, boolean, java.lang.Object[], boolean):int
     arg types: [int, int, java.lang.Object[], int]
     candidates:
      nj.a(java.lang.Object, int, int, int):void
      nj.a(int, boolean, java.lang.Object[], boolean):int */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ov.a(boolean, int, int[]):int
     arg types: [int, int, ?[OBJECT, ARRAY]]
     candidates:
      ov.a(int, int, int):int
      nk.a(int, int, jw):void
      ov.a(boolean, int, int[]):int */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ov.b(boolean, int, int[]):int
     arg types: [int, int, ?[OBJECT, ARRAY]]
     candidates:
      ov.b(int, int, int):int
      ov.b(boolean, int, int[]):int */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: nk.a(boolean, int[]):int
     arg types: [int, ?[OBJECT, ARRAY]]
     candidates:
      ov.a(int, boolean):boolean
      ov.a(int, int):cp[]
      nk.a(int, boolean):boolean
      nk.a(int, int):cp[]
      nk.a(boolean, int[]):int */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x01ce, code lost:
        r7 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        r14.f10094j.mo3155a((r7 + 1) - r14.f10095k);
        r14.f10095k = r14.f9996f;
        r14.f10096l = r14.f9991a[0];
        r14.f10097m = r11;
     */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x018c A[Catch:{ all -> 0x020a }] */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x019e A[Catch:{ all -> 0x020a }] */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x01c1 A[Catch:{ all -> 0x020a }, LOOP:3: B:127:0x01c1->B:142:0x01e4, LOOP_START, PHI: r7 r9 r10 
      PHI: (r7v6 int) = (r7v3 int), (r7v7 int) binds: [B:126:0x01bf, B:142:0x01e4] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r9v4 int) = (r9v3 int), (r9v5 int) binds: [B:126:0x01bf, B:142:0x01e4] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r10v2 int) = (r10v1 int), (r10v3 int) binds: [B:126:0x01bf, B:142:0x01e4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x01dc A[Catch:{ all -> 0x020a }] */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x01e1 A[Catch:{ all -> 0x020a }] */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x01ee A[Catch:{ all -> 0x020a }] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x014b A[Catch:{ all -> 0x020a }] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x015d A[Catch:{ all -> 0x020a }] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo5651g(int r15) {
        /*
            r14 = this;
            nj r0 = r14.f9992b
            int r0 = r0.mo5628a()
            if (r0 == 0) goto L_0x0213
            boolean r0 = r14.mo5650f(r15)
            if (r0 != 0) goto L_0x0212
            r0 = 0
            r1 = 0
            co r2 = r14.f10094j     // Catch:{ all -> 0x020a }
            int r2 = r2.mo3158c()     // Catch:{ all -> 0x020a }
            r3 = 2147483647(0x7fffffff, float:NaN)
            r4 = 1
            r5 = -1
            if (r2 == 0) goto L_0x00b4
            int r2 = r14.f9996f     // Catch:{ all -> 0x020a }
            if (r2 >= 0) goto L_0x0043
            int r2 = r14.f9999i     // Catch:{ all -> 0x020a }
            if (r2 == r5) goto L_0x0026
            goto L_0x0028
        L_0x0026:
            r2 = 0
        L_0x0028:
            int r6 = r14.m8149d()     // Catch:{ all -> 0x020a }
            if (r2 > r6) goto L_0x003d
            int r6 = r14.f10095k     // Catch:{ all -> 0x020a }
            int r7 = r6 + -1
            if (r2 >= r7) goto L_0x0035
            goto L_0x003d
        L_0x0035:
            if (r2 < r6) goto L_0x00b4
            r7 = r2
            r2 = 2147483647(0x7fffffff, float:NaN)
            r6 = 0
            goto L_0x0054
        L_0x003d:
            co r2 = r14.f10094j     // Catch:{ all -> 0x020a }
            r2.mo3156b()     // Catch:{ all -> 0x020a }
            goto L_0x00b4
        L_0x0043:
            nj r6 = r14.f9992b     // Catch:{ all -> 0x020a }
            int r2 = r6.mo5633b(r2)     // Catch:{ all -> 0x020a }
            int r6 = r14.f9996f     // Catch:{ all -> 0x020a }
            ou r6 = r14.mo5648d(r6)     // Catch:{ all -> 0x020a }
            int r6 = r6.f10092b     // Catch:{ all -> 0x020a }
            int r7 = r14.f9996f     // Catch:{ all -> 0x020a }
            int r7 = r7 + r5
        L_0x0054:
            nj r8 = r14.f9992b     // Catch:{ all -> 0x020a }
            int r8 = r8.mo5632b()     // Catch:{ all -> 0x020a }
            int r9 = r14.f10095k     // Catch:{ all -> 0x020a }
            int r8 = java.lang.Math.max(r8, r9)     // Catch:{ all -> 0x020a }
        L_0x0060:
            if (r7 < r8) goto L_0x00b4
            ou r9 = r14.mo5648d(r7)     // Catch:{ all -> 0x020a }
            int r10 = r9.f9990a     // Catch:{ all -> 0x020a }
            nj r11 = r14.f9992b     // Catch:{ all -> 0x020a }
            java.lang.Object[] r12 = r14.f9991a     // Catch:{ all -> 0x020a }
            int r11 = r11.mo5629a(r7, r1, r12, r1)     // Catch:{ all -> 0x020a }
            int r12 = r9.f10093c     // Catch:{ all -> 0x020a }
            if (r11 != r12) goto L_0x009f
            r14.f9996f = r7     // Catch:{ all -> 0x020a }
            int r12 = r14.f9997g     // Catch:{ all -> 0x020a }
            if (r12 < 0) goto L_0x007b
            goto L_0x007d
        L_0x007b:
            r14.f9997g = r7     // Catch:{ all -> 0x020a }
        L_0x007d:
            nj r12 = r14.f9992b     // Catch:{ all -> 0x020a }
            java.lang.Object[] r13 = r14.f9991a     // Catch:{ all -> 0x020a }
            r13 = r13[r1]     // Catch:{ all -> 0x020a }
            int r2 = r2 - r6
            r12.mo5631a(r13, r11, r10, r2)     // Catch:{ all -> 0x020a }
            boolean r2 = r14.mo5650f(r15)     // Catch:{ all -> 0x020a }
            if (r2 != 0) goto L_0x0098
            nj r2 = r14.f9992b     // Catch:{ all -> 0x020a }
            int r2 = r2.mo5633b(r7)     // Catch:{ all -> 0x020a }
            int r6 = r9.f10092b     // Catch:{ all -> 0x020a }
            int r7 = r7 + -1
            goto L_0x0060
        L_0x0098:
            java.lang.Object[] r15 = r14.f9991a
            r15[r1] = r0
        L_0x009c:
            r14.f10096l = r0
            return
        L_0x009f:
            co r2 = r14.f10094j     // Catch:{ all -> 0x020a }
            int r7 = r7 + r4
            int r6 = r14.f10095k     // Catch:{ all -> 0x020a }
            int r7 = r7 - r6
            r2.mo3155a(r7)     // Catch:{ all -> 0x020a }
            int r2 = r14.f9996f     // Catch:{ all -> 0x020a }
            r14.f10095k = r2     // Catch:{ all -> 0x020a }
            java.lang.Object[] r2 = r14.f9991a     // Catch:{ all -> 0x020a }
            r2 = r2[r1]     // Catch:{ all -> 0x020a }
            r14.f10096l = r2     // Catch:{ all -> 0x020a }
            r14.f10097m = r11     // Catch:{ all -> 0x020a }
        L_0x00b4:
            int r2 = r14.f9996f     // Catch:{ all -> 0x020a }
            if (r2 >= 0) goto L_0x00de
            int r2 = r14.f9999i     // Catch:{ all -> 0x020a }
            if (r2 == r5) goto L_0x00bd
            goto L_0x00bf
        L_0x00bd:
            r2 = 0
        L_0x00bf:
            co r6 = r14.f10094j     // Catch:{ all -> 0x020a }
            int r6 = r6.mo3158c()     // Catch:{ all -> 0x020a }
            if (r6 <= 0) goto L_0x00d4
            int r6 = r14.f10095k     // Catch:{ all -> 0x020a }
            ou r6 = r14.mo5648d(r6)     // Catch:{ all -> 0x020a }
            int r6 = r6.f9990a     // Catch:{ all -> 0x020a }
            int r7 = r14.f9995e     // Catch:{ all -> 0x020a }
            int r6 = r6 + r7
            int r6 = r6 + r5
            goto L_0x00d5
        L_0x00d4:
            r6 = r2
        L_0x00d5:
            int r7 = r14.f9995e     // Catch:{ all -> 0x020a }
            int r6 = r6 % r7
            r7 = r2
            r2 = r6
            r6 = 0
            r8 = 0
            goto L_0x0148
        L_0x00de:
            int r6 = r14.f10095k     // Catch:{ all -> 0x020a }
            if (r2 > r6) goto L_0x0204
            int r6 = r2 + -1
            ou r2 = r14.mo5648d(r2)     // Catch:{ all -> 0x020a }
            int r2 = r2.f9990a     // Catch:{ all -> 0x020a }
            int r7 = r14.m8147a(r1)     // Catch:{ all -> 0x020a }
            if (r7 >= 0) goto L_0x010e
            int r2 = r2 + -1
            int r7 = r14.f9995e     // Catch:{ all -> 0x020a }
            int r7 = r7 + r5
            r8 = 2147483647(0x7fffffff, float:NaN)
        L_0x00f8:
            if (r7 >= 0) goto L_0x00fb
            goto L_0x010d
        L_0x00fb:
            boolean r8 = r14.f9993c     // Catch:{ all -> 0x020a }
            if (r8 == 0) goto L_0x0104
            int r8 = r14.m8151i(r7)     // Catch:{ all -> 0x020a }
            goto L_0x0108
        L_0x0104:
            int r8 = r14.m8152j(r7)     // Catch:{ all -> 0x020a }
        L_0x0108:
            if (r8 != r3) goto L_0x010d
            int r7 = r7 + -1
            goto L_0x00f8
        L_0x010d:
            goto L_0x011c
        L_0x010e:
            boolean r8 = r14.f9993c     // Catch:{ all -> 0x020a }
            if (r8 != 0) goto L_0x0117
            int r8 = r14.mo5635a(r1, r7, r0)     // Catch:{ all -> 0x020a }
            goto L_0x011c
        L_0x0117:
            int r8 = r14.mo5642b(r4, r7, r0)     // Catch:{ all -> 0x020a }
        L_0x011c:
            boolean r7 = r14.f9993c     // Catch:{ all -> 0x020a }
            if (r7 == 0) goto L_0x0127
            int r7 = r14.m8151i(r2)     // Catch:{ all -> 0x020a }
            if (r7 < r8) goto L_0x0144
            goto L_0x012e
        L_0x0127:
            int r7 = r14.m8152j(r2)     // Catch:{ all -> 0x020a }
            if (r7 <= r8) goto L_0x012e
            goto L_0x0144
        L_0x012e:
            int r2 = r2 + -1
            if (r2 >= 0) goto L_0x0144
            int r2 = r14.f9995e     // Catch:{ all -> 0x020a }
            int r2 = r2 + r5
            boolean r7 = r14.f9993c     // Catch:{ all -> 0x020a }
            if (r7 == 0) goto L_0x013e
            int r7 = r14.mo5643b(r4, r0)     // Catch:{ all -> 0x020a }
            goto L_0x0142
        L_0x013e:
            int r7 = r14.mo5636a(r1, r0)     // Catch:{ all -> 0x020a }
        L_0x0142:
            r8 = r7
            goto L_0x0145
        L_0x0144:
        L_0x0145:
            r7 = r6
            r6 = 1
        L_0x0148:
        L_0x0149:
            if (r2 >= 0) goto L_0x015d
            boolean r2 = r14.f9993c     // Catch:{ all -> 0x020a }
            if (r2 == 0) goto L_0x0154
            int r2 = r14.mo5643b(r4, r0)     // Catch:{ all -> 0x020a }
            goto L_0x0158
        L_0x0154:
            int r2 = r14.mo5636a(r1, r0)     // Catch:{ all -> 0x020a }
        L_0x0158:
            r8 = r2
            int r2 = r14.f9995e     // Catch:{ all -> 0x020a }
            int r2 = r2 + r5
            goto L_0x0149
        L_0x015d:
            if (r7 >= 0) goto L_0x0161
            goto L_0x0204
        L_0x0161:
            boolean r9 = r14.mo5650f(r15)     // Catch:{ all -> 0x020a }
            if (r9 != 0) goto L_0x0204
            boolean r9 = r14.f9993c     // Catch:{ all -> 0x020a }
            if (r9 == 0) goto L_0x0170
            int r9 = r14.m8151i(r2)     // Catch:{ all -> 0x020a }
            goto L_0x0174
        L_0x0170:
            int r9 = r14.m8152j(r2)     // Catch:{ all -> 0x020a }
        L_0x0174:
            r10 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r9 != r3) goto L_0x0179
            goto L_0x0187
        L_0x0179:
            if (r9 == r10) goto L_0x0187
            boolean r10 = r14.f9993c     // Catch:{ all -> 0x020a }
            if (r10 == 0) goto L_0x0182
            int r10 = r14.f9994d     // Catch:{ all -> 0x020a }
            goto L_0x0185
        L_0x0182:
            int r10 = r14.f9994d     // Catch:{ all -> 0x020a }
        L_0x0184:
            int r10 = -r10
        L_0x0185:
            int r9 = r9 + r10
            goto L_0x01b9
        L_0x0187:
            int r9 = r14.f9995e     // Catch:{ all -> 0x020a }
            int r9 = r9 + r5
            if (r2 == r9) goto L_0x019e
            boolean r9 = r14.f9993c     // Catch:{ all -> 0x020a }
            if (r9 != 0) goto L_0x0197
            int r9 = r2 + 1
            int r9 = r14.m8151i(r9)     // Catch:{ all -> 0x020a }
            goto L_0x01b9
        L_0x0197:
            int r9 = r2 + 1
            int r9 = r14.m8152j(r9)     // Catch:{ all -> 0x020a }
            goto L_0x01b9
        L_0x019e:
            boolean r9 = r14.f9993c     // Catch:{ all -> 0x020a }
            if (r9 == 0) goto L_0x01a7
            int r9 = r14.m8151i(r1)     // Catch:{ all -> 0x020a }
            goto L_0x01ab
        L_0x01a7:
            int r9 = r14.m8152j(r1)     // Catch:{ all -> 0x020a }
        L_0x01ab:
            if (r9 == r3) goto L_0x01b9
            if (r9 == r10) goto L_0x01b9
            boolean r10 = r14.f9993c     // Catch:{ all -> 0x020a }
            if (r10 == 0) goto L_0x01b6
            int r10 = r14.f9994d     // Catch:{ all -> 0x020a }
            goto L_0x0185
        L_0x01b6:
            int r10 = r14.f9994d     // Catch:{ all -> 0x020a }
            goto L_0x0184
        L_0x01b9:
            int r10 = r7 + -1
            int r7 = r14.m8146a(r7, r2, r9)     // Catch:{ all -> 0x020a }
            if (r6 == 0) goto L_0x01ee
        L_0x01c1:
            boolean r6 = r14.f9993c     // Catch:{ all -> 0x020a }
            if (r6 != 0) goto L_0x01ca
            int r6 = r9 - r7
            if (r6 > r8) goto L_0x01d0
            goto L_0x01ce
        L_0x01ca:
            int r6 = r9 + r7
            if (r6 < r8) goto L_0x01d0
        L_0x01ce:
            r7 = r10
            goto L_0x01fe
        L_0x01d0:
            if (r10 < 0) goto L_0x0204
            boolean r6 = r14.mo5650f(r15)     // Catch:{ all -> 0x020a }
            if (r6 != 0) goto L_0x0204
            boolean r6 = r14.f9993c     // Catch:{ all -> 0x020a }
            if (r6 != 0) goto L_0x01e1
            int r6 = -r7
            int r7 = r14.f9994d     // Catch:{ all -> 0x020a }
            int r6 = r6 - r7
            goto L_0x01e4
        L_0x01e1:
            int r6 = r14.f9994d     // Catch:{ all -> 0x020a }
            int r6 = r6 + r7
        L_0x01e4:
            int r9 = r9 + r6
            int r6 = r10 + -1
            int r7 = r14.m8146a(r10, r2, r9)     // Catch:{ all -> 0x020a }
            r10 = r6
            goto L_0x01c1
        L_0x01ee:
            boolean r6 = r14.f9993c     // Catch:{ all -> 0x020a }
            if (r6 == 0) goto L_0x01f7
            int r6 = r14.m8151i(r2)     // Catch:{ all -> 0x020a }
            goto L_0x01fb
        L_0x01f7:
            int r6 = r14.m8152j(r2)     // Catch:{ all -> 0x020a }
        L_0x01fb:
            r8 = r6
            r7 = r10
        L_0x01fe:
            int r2 = r2 + -1
            r6 = 1
            goto L_0x0149
        L_0x0204:
            java.lang.Object[] r15 = r14.f9991a
            r15[r1] = r0
            goto L_0x009c
        L_0x020a:
            r15 = move-exception
            java.lang.Object[] r2 = r14.f9991a
            r2[r1] = r0
            r14.f10096l = r0
            throw r15
        L_0x0212:
            return
        L_0x0213:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0402ov.mo5651g(int):void");
    }

    public C0402ov(byte b) {
    }

    /* renamed from: a */
    private final int m8147a(boolean z) {
        boolean z2 = false;
        if (z) {
            for (int i = this.f9997g; i >= this.f9996f; i--) {
                int i2 = mo5648d(i).f9990a;
                if (i2 == 0) {
                    z2 = true;
                } else if (z2 && i2 == this.f9995e - 1) {
                    return i;
                }
            }
        } else {
            for (int i3 = this.f9996f; i3 <= this.f9997g; i3++) {
                int i4 = mo5648d(i3).f9990a;
                if (i4 == this.f9995e - 1) {
                    z2 = true;
                } else if (z2 && i4 == 0) {
                    return i3;
                }
            }
        }
        return -1;
    }

    /* renamed from: b */
    public final int mo5642b(boolean z, int i, int[] iArr) {
        int i2;
        int i3;
        int b = this.f9992b.mo5633b(i);
        C0401ou h = mo5648d(i);
        int i4 = h.f9990a;
        if (!this.f9993c) {
            i2 = this.f9992b.mo5634c(i) + b;
            int i5 = i - 1;
            C0401ou ouVar = h;
            int i6 = i4;
            int i7 = b;
            i3 = i;
            int i8 = 1;
            while (i8 < this.f9995e && i5 >= this.f9996f) {
                i7 -= ouVar.f10092b;
                ouVar = mo5648d(i5);
                int i9 = ouVar.f9990a;
                if (i9 != i6) {
                    i8++;
                    int c = this.f9992b.mo5634c(i5) + i7;
                    if (!z ? c < i2 : c > i2) {
                        i3 = i5;
                        i2 = c;
                        i4 = i9;
                        i6 = i4;
                    } else {
                        i6 = i9;
                    }
                }
                i5--;
            }
        } else {
            int i10 = i + 1;
            i2 = b;
            int i11 = i2;
            int i12 = i4;
            i3 = i;
            int i13 = 1;
            while (i13 < this.f9995e && i10 <= this.f9997g) {
                C0401ou h2 = mo5648d(i10);
                i11 += h2.f10092b;
                int i14 = h2.f9990a;
                if (i14 != i12) {
                    i13++;
                    if (!z ? i11 >= i2 : i11 <= i2) {
                        i12 = i14;
                    } else {
                        i3 = i10;
                        i2 = i11;
                        i4 = i14;
                        i12 = i4;
                    }
                }
                i10++;
            }
        }
        if (iArr != null) {
            iArr[0] = i4;
            iArr[1] = i3;
        }
        return i2;
    }

    /* renamed from: a */
    public final int mo5635a(boolean z, int i, int[] iArr) {
        int i2;
        int i3;
        int b = this.f9992b.mo5633b(i);
        C0401ou h = mo5648d(i);
        int i4 = h.f9990a;
        if (this.f9993c) {
            i2 = b - this.f9992b.mo5634c(i);
            int i5 = i - 1;
            C0401ou ouVar = h;
            int i6 = i4;
            int i7 = b;
            i3 = i;
            int i8 = 1;
            while (i8 < this.f9995e && i5 >= this.f9996f) {
                i7 -= ouVar.f10092b;
                ouVar = mo5648d(i5);
                int i9 = ouVar.f9990a;
                if (i9 != i6) {
                    i8++;
                    int c = i7 - this.f9992b.mo5634c(i5);
                    if (!z ? c < i2 : c > i2) {
                        i3 = i5;
                        i2 = c;
                        i4 = i9;
                        i6 = i4;
                    } else {
                        i6 = i9;
                    }
                }
                i5--;
            }
        } else {
            int i10 = i + 1;
            i2 = b;
            int i11 = i2;
            int i12 = i4;
            i3 = i;
            int i13 = 1;
            while (i13 < this.f9995e && i10 <= this.f9997g) {
                C0401ou h2 = mo5648d(i10);
                i11 += h2.f10092b;
                int i14 = h2.f9990a;
                if (i14 != i12) {
                    i13++;
                    if (!z ? i11 >= i2 : i11 <= i2) {
                        i12 = i14;
                    } else {
                        i3 = i10;
                        i2 = i11;
                        i4 = i14;
                        i12 = i4;
                    }
                }
                i10++;
            }
        }
        if (iArr != null) {
            iArr[0] = i4;
            iArr[1] = i3;
        }
        return i2;
    }

    /* renamed from: i */
    private final int m8151i(int i) {
        int i2 = this.f9996f;
        if (i2 < 0) {
            return Integer.MIN_VALUE;
        }
        if (!this.f9993c) {
            int b = this.f9992b.mo5633b(this.f9997g);
            C0401ou h = mo5648d(this.f9997g);
            if (h.f9990a != i) {
                int i3 = this.f9997g;
                while (true) {
                    i3--;
                    if (i3 < this.f10095k) {
                        break;
                    }
                    b -= h.f10092b;
                    h = mo5648d(i3);
                    if (h.f9990a == i) {
                        return b + h.f10093c;
                    }
                }
            } else {
                return b + h.f10093c;
            }
        } else {
            int b2 = this.f9992b.mo5633b(i2);
            if (mo5648d(this.f9996f).f9990a != i) {
                int i4 = this.f9996f;
                while (true) {
                    i4++;
                    if (i4 > m8149d()) {
                        break;
                    }
                    C0401ou h2 = mo5648d(i4);
                    b2 += h2.f10092b;
                    if (h2.f9990a == i) {
                        return b2;
                    }
                }
            } else {
                return b2;
            }
        }
        return Integer.MIN_VALUE;
    }

    /* renamed from: j */
    private final int m8152j(int i) {
        int i2 = this.f9996f;
        if (i2 < 0) {
            return Integer.MAX_VALUE;
        }
        if (this.f9993c) {
            int b = this.f9992b.mo5633b(this.f9997g);
            C0401ou h = mo5648d(this.f9997g);
            if (h.f9990a != i) {
                int i3 = this.f9997g;
                while (true) {
                    i3--;
                    if (i3 < this.f10095k) {
                        break;
                    }
                    b -= h.f10092b;
                    h = mo5648d(i3);
                    if (h.f9990a == i) {
                        return b - h.f10093c;
                    }
                }
            } else {
                return b - h.f10093c;
            }
        } else {
            int b2 = this.f9992b.mo5633b(i2);
            if (mo5648d(this.f9996f).f9990a != i) {
                int i4 = this.f9996f;
                while (true) {
                    i4++;
                    if (i4 > m8149d()) {
                        break;
                    }
                    C0401ou h2 = mo5648d(i4);
                    b2 += h2.f10092b;
                    if (h2.f9990a == i) {
                        return b2;
                    }
                }
            } else {
                return b2;
            }
        }
        return Integer.MAX_VALUE;
    }
}
