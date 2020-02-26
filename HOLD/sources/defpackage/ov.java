package defpackage;

/* renamed from: ov  reason: default package */
/* compiled from: PG */
final class ov extends nk {
    private final co j = new co((byte) 0);
    private int k = -1;
    private Object l;
    private int m;

    public ov() {
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: nj.a(int, boolean, java.lang.Object[], boolean):int
     arg types: [int, int, java.lang.Object[], int]
     candidates:
      nj.a(java.lang.Object, int, int, int):void
      nj.a(int, boolean, java.lang.Object[], boolean):int */
    private final int b(int i, int i2, int i3) {
        int i4;
        int i5;
        int i6 = this.g;
        if (i6 >= 0 && !(i6 == d() && this.g == i - 1)) {
            throw new IllegalStateException();
        }
        int i7 = this.g;
        if (i7 >= 0) {
            i4 = i3 - this.b.b(i7);
        } else if (this.j.c() <= 0 || i != d() + 1) {
            i4 = 0;
        } else {
            int d = d();
            while (true) {
                if (d >= this.k) {
                    if (d(d).a == i2) {
                        break;
                    }
                    d--;
                } else {
                    d = d();
                    break;
                }
            }
            if (this.c) {
                i5 = (-d(d).c) - this.d;
            } else {
                i5 = d(d).c + this.d;
            }
            for (int i8 = d + 1; i8 <= d(); i8++) {
                i5 -= d(i8).b;
            }
            i4 = i5;
        }
        ou ouVar = new ou(i2, i4);
        co coVar = this.j;
        Object[] objArr = coVar.a;
        int i9 = coVar.c;
        objArr[i9] = ouVar;
        int i10 = coVar.d & (i9 + 1);
        coVar.c = i10;
        if (i10 == coVar.b) {
            coVar.a();
        }
        Object obj = this.l;
        if (obj == null) {
            ouVar.c = this.b.a(i, true, this.a, false);
            obj = this.a[0];
        } else {
            ouVar.c = this.m;
            this.l = null;
        }
        if (this.j.c() == 1) {
            this.g = i;
            this.f = i;
            this.k = i;
        } else {
            int i11 = this.g;
            if (i11 >= 0) {
                this.g = i11 + 1;
            } else {
                this.g = i;
                this.f = i;
            }
        }
        this.b.a(obj, ouVar.c, i2, i3);
        return ouVar.c;
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
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(int r14, boolean r15) {
        /*
            r13 = this;
            nj r0 = r13.b
            int r0 = r0.a()
            r1 = 0
            if (r0 == 0) goto L_0x0231
            if (r15 != 0) goto L_0x0013
            boolean r0 = r13.e(r14)
            if (r0 != 0) goto L_0x0012
            goto L_0x0013
        L_0x0012:
            return r1
        L_0x0013:
            r0 = 0
            co r2 = r13.j     // Catch:{ all -> 0x0229 }
            int r2 = r2.c()     // Catch:{ all -> 0x0229 }
            r3 = 2147483647(0x7fffffff, float:NaN)
            r4 = -1
            r5 = 1
            if (r2 == 0) goto L_0x00b9
            nj r2 = r13.b     // Catch:{ all -> 0x0229 }
            int r2 = r2.a()     // Catch:{ all -> 0x0229 }
            int r6 = r13.g     // Catch:{ all -> 0x0229 }
            if (r6 >= 0) goto L_0x0050
            int r6 = r13.i     // Catch:{ all -> 0x0229 }
            if (r6 == r4) goto L_0x0030
            goto L_0x0032
        L_0x0030:
            r6 = 0
        L_0x0032:
            int r7 = r13.d()     // Catch:{ all -> 0x0229 }
            int r7 = r7 + r5
            if (r6 > r7) goto L_0x0049
            int r7 = r13.k     // Catch:{ all -> 0x0229 }
            if (r6 >= r7) goto L_0x003e
            goto L_0x0049
        L_0x003e:
            int r7 = r13.d()     // Catch:{ all -> 0x0229 }
            if (r6 > r7) goto L_0x00b9
            r7 = r6
            r6 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x005a
        L_0x0049:
            co r2 = r13.j     // Catch:{ all -> 0x0229 }
            r2.b()     // Catch:{ all -> 0x0229 }
            goto L_0x00b9
        L_0x0050:
            int r7 = r6 + 1
            nj r8 = r13.b     // Catch:{ all -> 0x0229 }
            int r6 = r8.b(r6)     // Catch:{ all -> 0x0229 }
        L_0x005a:
            int r8 = r13.d()     // Catch:{ all -> 0x0229 }
        L_0x005e:
            if (r7 >= r2) goto L_0x00b9
            if (r7 > r8) goto L_0x00b9
            ou r9 = r13.d(r7)     // Catch:{ all -> 0x0229 }
            if (r6 == r3) goto L_0x006c
            int r10 = r9.b     // Catch:{ all -> 0x0229 }
            int r6 = r6 + r10
            goto L_0x006d
        L_0x006c:
        L_0x006d:
            int r10 = r9.a     // Catch:{ all -> 0x0229 }
            nj r11 = r13.b     // Catch:{ all -> 0x0229 }
            java.lang.Object[] r12 = r13.a     // Catch:{ all -> 0x0229 }
            int r11 = r11.a(r7, r5, r12, r1)     // Catch:{ all -> 0x0229 }
            int r12 = r9.c     // Catch:{ all -> 0x0229 }
            if (r11 == r12) goto L_0x0084
            r9.c = r11     // Catch:{ all -> 0x0229 }
            co r9 = r13.j     // Catch:{ all -> 0x0229 }
            int r8 = r8 - r7
            r9.b(r8)     // Catch:{ all -> 0x0229 }
            r8 = r7
        L_0x0084:
            r13.g = r7     // Catch:{ all -> 0x0229 }
            int r9 = r13.f     // Catch:{ all -> 0x0229 }
            if (r9 < 0) goto L_0x008b
            goto L_0x008d
        L_0x008b:
            r13.f = r7     // Catch:{ all -> 0x0229 }
        L_0x008d:
            nj r9 = r13.b     // Catch:{ all -> 0x0229 }
            java.lang.Object[] r12 = r13.a     // Catch:{ all -> 0x0229 }
            r12 = r12[r1]     // Catch:{ all -> 0x0229 }
            r9.a(r12, r11, r10, r6)     // Catch:{ all -> 0x0229 }
            if (r15 != 0) goto L_0x009e
            boolean r9 = r13.e(r14)     // Catch:{ all -> 0x0229 }
            if (r9 != 0) goto L_0x00af
        L_0x009e:
            if (r6 != r3) goto L_0x00a7
            nj r6 = r13.b     // Catch:{ all -> 0x0229 }
            int r6 = r6.b(r7)     // Catch:{ all -> 0x0229 }
        L_0x00a7:
            int r9 = r13.e     // Catch:{ all -> 0x0229 }
            int r9 = r9 + r4
            if (r10 == r9) goto L_0x00ad
        L_0x00ac:
            goto L_0x00b6
        L_0x00ad:
            if (r15 == 0) goto L_0x00ac
        L_0x00af:
            java.lang.Object[] r14 = r13.a
            r14[r1] = r0
        L_0x00b3:
            r13.l = r0
            return r5
        L_0x00b6:
            int r7 = r7 + 1
            goto L_0x005e
        L_0x00b9:
            nj r2 = r13.b     // Catch:{ all -> 0x0229 }
            int r2 = r2.a()     // Catch:{ all -> 0x0229 }
            int r6 = r13.g     // Catch:{ all -> 0x0229 }
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r6 >= 0) goto L_0x00ea
            int r6 = r13.i     // Catch:{ all -> 0x0229 }
            if (r6 == r4) goto L_0x00ca
            goto L_0x00cc
        L_0x00ca:
            r6 = 0
        L_0x00cc:
            co r8 = r13.j     // Catch:{ all -> 0x0229 }
            int r8 = r8.c()     // Catch:{ all -> 0x0229 }
            if (r8 <= 0) goto L_0x00e0
            int r8 = r13.d()     // Catch:{ all -> 0x0229 }
            ou r8 = r13.d(r8)     // Catch:{ all -> 0x0229 }
            int r8 = r8.a     // Catch:{ all -> 0x0229 }
            int r8 = r8 + r5
            goto L_0x00e1
        L_0x00e0:
            r8 = r6
        L_0x00e1:
            int r9 = r13.e     // Catch:{ all -> 0x0229 }
            int r8 = r8 % r9
            r10 = r6
            r6 = r8
            r8 = 0
            r9 = 0
            goto L_0x0157
        L_0x00ea:
            int r8 = r13.d()     // Catch:{ all -> 0x0229 }
            if (r6 < r8) goto L_0x0221
            int r6 = r13.g     // Catch:{ all -> 0x0229 }
            int r8 = r6 + 1
            ou r6 = r13.d(r6)     // Catch:{ all -> 0x0229 }
            int r6 = r6.a     // Catch:{ all -> 0x0229 }
            int r9 = r13.a(r5)     // Catch:{ all -> 0x0229 }
            if (r9 < 0) goto L_0x010f
            boolean r10 = r13.c     // Catch:{ all -> 0x0229 }
            if (r10 != 0) goto L_0x0109
            int r9 = r13.b(r5, r9, r0)     // Catch:{ all -> 0x0229 }
            goto L_0x012b
        L_0x0109:
            int r9 = r13.a(r1, r9, r0)     // Catch:{ all -> 0x0229 }
            goto L_0x012b
        L_0x010f:
            r9 = 0
            r10 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x0112:
            int r11 = r13.e     // Catch:{ all -> 0x0229 }
            if (r9 >= r11) goto L_0x012a
            boolean r10 = r13.c     // Catch:{ all -> 0x0229 }
            if (r10 == 0) goto L_0x011f
            int r10 = r13.j(r9)     // Catch:{ all -> 0x0229 }
            goto L_0x0123
        L_0x011f:
            int r10 = r13.i(r9)     // Catch:{ all -> 0x0229 }
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
            boolean r10 = r13.c     // Catch:{ all -> 0x0229 }
            if (r10 != 0) goto L_0x0136
            int r10 = r13.i(r6)     // Catch:{ all -> 0x0229 }
            if (r10 < r9) goto L_0x0153
            goto L_0x013d
        L_0x0136:
            int r10 = r13.j(r6)     // Catch:{ all -> 0x0229 }
            if (r10 <= r9) goto L_0x013d
            goto L_0x0153
        L_0x013d:
            int r6 = r6 + 1
            int r10 = r13.e     // Catch:{ all -> 0x0229 }
            if (r6 != r10) goto L_0x0153
            boolean r6 = r13.c     // Catch:{ all -> 0x0229 }
            if (r6 == 0) goto L_0x014c
            int r6 = r13.a(r1, r0)     // Catch:{ all -> 0x0229 }
            goto L_0x0150
        L_0x014c:
            int r6 = r13.b(r5, r0)     // Catch:{ all -> 0x0229 }
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
            int r12 = r13.e     // Catch:{ all -> 0x0229 }
            if (r6 < r12) goto L_0x0171
            if (r15 != 0) goto L_0x021f
            boolean r6 = r13.c     // Catch:{ all -> 0x0229 }
            if (r6 == 0) goto L_0x0169
            int r6 = r13.a(r1, r0)     // Catch:{ all -> 0x0229 }
            goto L_0x016d
        L_0x0169:
            int r6 = r13.b(r5, r0)     // Catch:{ all -> 0x0229 }
        L_0x016d:
            r11 = r6
            r6 = 0
            goto L_0x015a
        L_0x0171:
            if (r10 == r2) goto L_0x021f
            if (r15 != 0) goto L_0x017b
            boolean r12 = r13.e(r14)     // Catch:{ all -> 0x0229 }
            if (r12 != 0) goto L_0x021f
        L_0x017b:
            boolean r8 = r13.c     // Catch:{ all -> 0x0229 }
            if (r8 == 0) goto L_0x0184
            int r8 = r13.j(r6)     // Catch:{ all -> 0x0229 }
            goto L_0x0188
        L_0x0184:
            int r8 = r13.i(r6)     // Catch:{ all -> 0x0229 }
        L_0x0188:
            if (r8 == r3) goto L_0x0198
            if (r8 == r7) goto L_0x0198
            boolean r12 = r13.c     // Catch:{ all -> 0x0229 }
            if (r12 == 0) goto L_0x0194
            int r12 = r13.d     // Catch:{ all -> 0x0229 }
            int r12 = -r12
            goto L_0x0196
        L_0x0194:
            int r12 = r13.d     // Catch:{ all -> 0x0229 }
        L_0x0196:
            int r8 = r8 + r12
            goto L_0x01ce
        L_0x0198:
            if (r6 == 0) goto L_0x01ac
            boolean r8 = r13.c     // Catch:{ all -> 0x0229 }
            if (r8 != 0) goto L_0x01a5
            int r8 = r6 + -1
            int r8 = r13.j(r8)     // Catch:{ all -> 0x0229 }
            goto L_0x01ce
        L_0x01a5:
            int r8 = r6 + -1
            int r8 = r13.i(r8)     // Catch:{ all -> 0x0229 }
            goto L_0x01ce
        L_0x01ac:
            boolean r8 = r13.c     // Catch:{ all -> 0x0229 }
            if (r8 != 0) goto L_0x01b8
            int r8 = r13.e     // Catch:{ all -> 0x0229 }
            int r8 = r8 + r4
            int r8 = r13.i(r8)     // Catch:{ all -> 0x0229 }
            goto L_0x01bf
        L_0x01b8:
            int r8 = r13.e     // Catch:{ all -> 0x0229 }
            int r8 = r8 + r4
            int r8 = r13.j(r8)     // Catch:{ all -> 0x0229 }
        L_0x01bf:
            if (r8 == r3) goto L_0x01ce
            if (r8 == r7) goto L_0x01ce
            boolean r12 = r13.c     // Catch:{ all -> 0x0229 }
            if (r12 != 0) goto L_0x01ca
            int r12 = r13.d     // Catch:{ all -> 0x0229 }
            goto L_0x01cd
        L_0x01ca:
            int r12 = r13.d     // Catch:{ all -> 0x0229 }
            int r12 = -r12
        L_0x01cd:
            int r8 = r8 + r12
        L_0x01ce:
            int r12 = r10 + 1
            int r10 = r13.b(r10, r6, r8)     // Catch:{ all -> 0x0229 }
            if (r9 == 0) goto L_0x0208
        L_0x01d6:
            boolean r9 = r13.c     // Catch:{ all -> 0x0229 }
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
            boolean r9 = r13.e(r14)     // Catch:{ all -> 0x0229 }
            if (r9 != 0) goto L_0x01f0
            goto L_0x01f1
        L_0x01f0:
            goto L_0x0207
        L_0x01f1:
            boolean r9 = r13.c     // Catch:{ all -> 0x0229 }
            if (r9 == 0) goto L_0x01fa
            int r9 = -r10
            int r10 = r13.d     // Catch:{ all -> 0x0229 }
            int r9 = r9 - r10
            goto L_0x01fd
        L_0x01fa:
            int r9 = r13.d     // Catch:{ all -> 0x0229 }
            int r9 = r9 + r10
        L_0x01fd:
            int r8 = r8 + r9
            int r9 = r12 + 1
            int r10 = r13.b(r12, r6, r8)     // Catch:{ all -> 0x0229 }
            r12 = r9
            goto L_0x01d6
        L_0x0207:
            goto L_0x0223
        L_0x0208:
            boolean r8 = r13.c     // Catch:{ all -> 0x0229 }
            if (r8 == 0) goto L_0x0211
            int r8 = r13.j(r6)     // Catch:{ all -> 0x0229 }
            goto L_0x0215
        L_0x0211:
            int r8 = r13.i(r6)     // Catch:{ all -> 0x0229 }
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
            java.lang.Object[] r14 = r13.a
            r14[r1] = r0
            goto L_0x00b3
        L_0x0229:
            r14 = move-exception
            java.lang.Object[] r15 = r13.a
            r15[r1] = r0
            r13.l = r0
            throw r14
        L_0x0231:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ov.a(int, boolean):boolean");
    }

    public final cp[] a(int i, int i2) {
        for (int i3 = 0; i3 < this.e; i3++) {
            this.h[i3].a();
        }
        if (i >= 0) {
            while (i <= i2) {
                cp cpVar = this.h[d(i).a];
                if (cpVar.b() > 0) {
                    int i4 = cpVar.b;
                    if (i4 != 0) {
                        int[] iArr = cpVar.a;
                        int i5 = (i4 - 1) & cpVar.c;
                        if (iArr[i5] == i - 1) {
                            if (i4 != 0) {
                                cpVar.b = i5;
                                cpVar.a(i);
                                i++;
                            } else {
                                throw new ArrayIndexOutOfBoundsException();
                            }
                        }
                    } else {
                        throw new ArrayIndexOutOfBoundsException();
                    }
                }
                cpVar.a(i);
                cpVar.a(i);
                i++;
            }
        }
        return this.h;
    }

    private final int d() {
        return (this.k + this.j.c()) - 1;
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public final ou d(int i) {
        int i2 = i - this.k;
        if (i2 < 0 || i2 >= this.j.c()) {
            return null;
        }
        co coVar = this.j;
        if (i2 < coVar.c()) {
            return (ou) coVar.a[coVar.d & (coVar.b + i2)];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public final void b(int i) {
        super.b(i);
        this.j.b((d() - i) + 1);
        if (this.j.c() == 0) {
            this.k = -1;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: nj.a(int, boolean, java.lang.Object[], boolean):int
     arg types: [int, int, java.lang.Object[], int]
     candidates:
      nj.a(java.lang.Object, int, int, int):void
      nj.a(int, boolean, java.lang.Object[], boolean):int */
    private final int a(int i, int i2, int i3) {
        int i4;
        int i5;
        int i6 = this.f;
        if (i6 >= 0 && !(i6 == this.k && i6 == i + 1)) {
            throw new IllegalStateException();
        }
        int i7 = this.k;
        ou h = i7 >= 0 ? d(i7) : null;
        int b = this.b.b(this.k);
        ou ouVar = new ou(i2, 0);
        co coVar = this.j;
        int i8 = (coVar.b - 1) & coVar.d;
        coVar.b = i8;
        coVar.a[i8] = ouVar;
        if (i8 == coVar.c) {
            coVar.a();
        }
        Object obj = this.l;
        if (obj == null) {
            i4 = this.b.a(i, false, this.a, false);
            ouVar.c = i4;
            obj = this.a[0];
        } else {
            int i9 = this.m;
            ouVar.c = i9;
            this.l = null;
            i4 = i9;
        }
        this.f = i;
        this.k = i;
        if (this.g < 0) {
            this.g = i;
        }
        if (this.c) {
            i5 = i3 + i4;
        } else {
            i5 = i3 - i4;
        }
        if (h != null) {
            h.b = b - i5;
        }
        this.b.a(obj, i4, i2, i5);
        return ouVar.c;
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
        r14.j.a((r7 + 1) - r14.k);
        r14.k = r14.f;
        r14.l = r14.a[0];
        r14.m = r11;
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
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g(int r15) {
        /*
            r14 = this;
            nj r0 = r14.b
            int r0 = r0.a()
            if (r0 == 0) goto L_0x0213
            boolean r0 = r14.f(r15)
            if (r0 != 0) goto L_0x0212
            r0 = 0
            r1 = 0
            co r2 = r14.j     // Catch:{ all -> 0x020a }
            int r2 = r2.c()     // Catch:{ all -> 0x020a }
            r3 = 2147483647(0x7fffffff, float:NaN)
            r4 = 1
            r5 = -1
            if (r2 == 0) goto L_0x00b4
            int r2 = r14.f     // Catch:{ all -> 0x020a }
            if (r2 >= 0) goto L_0x0043
            int r2 = r14.i     // Catch:{ all -> 0x020a }
            if (r2 == r5) goto L_0x0026
            goto L_0x0028
        L_0x0026:
            r2 = 0
        L_0x0028:
            int r6 = r14.d()     // Catch:{ all -> 0x020a }
            if (r2 > r6) goto L_0x003d
            int r6 = r14.k     // Catch:{ all -> 0x020a }
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
            co r2 = r14.j     // Catch:{ all -> 0x020a }
            r2.b()     // Catch:{ all -> 0x020a }
            goto L_0x00b4
        L_0x0043:
            nj r6 = r14.b     // Catch:{ all -> 0x020a }
            int r2 = r6.b(r2)     // Catch:{ all -> 0x020a }
            int r6 = r14.f     // Catch:{ all -> 0x020a }
            ou r6 = r14.d(r6)     // Catch:{ all -> 0x020a }
            int r6 = r6.b     // Catch:{ all -> 0x020a }
            int r7 = r14.f     // Catch:{ all -> 0x020a }
            int r7 = r7 + r5
        L_0x0054:
            nj r8 = r14.b     // Catch:{ all -> 0x020a }
            int r8 = r8.b()     // Catch:{ all -> 0x020a }
            int r9 = r14.k     // Catch:{ all -> 0x020a }
            int r8 = java.lang.Math.max(r8, r9)     // Catch:{ all -> 0x020a }
        L_0x0060:
            if (r7 < r8) goto L_0x00b4
            ou r9 = r14.d(r7)     // Catch:{ all -> 0x020a }
            int r10 = r9.a     // Catch:{ all -> 0x020a }
            nj r11 = r14.b     // Catch:{ all -> 0x020a }
            java.lang.Object[] r12 = r14.a     // Catch:{ all -> 0x020a }
            int r11 = r11.a(r7, r1, r12, r1)     // Catch:{ all -> 0x020a }
            int r12 = r9.c     // Catch:{ all -> 0x020a }
            if (r11 != r12) goto L_0x009f
            r14.f = r7     // Catch:{ all -> 0x020a }
            int r12 = r14.g     // Catch:{ all -> 0x020a }
            if (r12 < 0) goto L_0x007b
            goto L_0x007d
        L_0x007b:
            r14.g = r7     // Catch:{ all -> 0x020a }
        L_0x007d:
            nj r12 = r14.b     // Catch:{ all -> 0x020a }
            java.lang.Object[] r13 = r14.a     // Catch:{ all -> 0x020a }
            r13 = r13[r1]     // Catch:{ all -> 0x020a }
            int r2 = r2 - r6
            r12.a(r13, r11, r10, r2)     // Catch:{ all -> 0x020a }
            boolean r2 = r14.f(r15)     // Catch:{ all -> 0x020a }
            if (r2 != 0) goto L_0x0098
            nj r2 = r14.b     // Catch:{ all -> 0x020a }
            int r2 = r2.b(r7)     // Catch:{ all -> 0x020a }
            int r6 = r9.b     // Catch:{ all -> 0x020a }
            int r7 = r7 + -1
            goto L_0x0060
        L_0x0098:
            java.lang.Object[] r15 = r14.a
            r15[r1] = r0
        L_0x009c:
            r14.l = r0
            return
        L_0x009f:
            co r2 = r14.j     // Catch:{ all -> 0x020a }
            int r7 = r7 + r4
            int r6 = r14.k     // Catch:{ all -> 0x020a }
            int r7 = r7 - r6
            r2.a(r7)     // Catch:{ all -> 0x020a }
            int r2 = r14.f     // Catch:{ all -> 0x020a }
            r14.k = r2     // Catch:{ all -> 0x020a }
            java.lang.Object[] r2 = r14.a     // Catch:{ all -> 0x020a }
            r2 = r2[r1]     // Catch:{ all -> 0x020a }
            r14.l = r2     // Catch:{ all -> 0x020a }
            r14.m = r11     // Catch:{ all -> 0x020a }
        L_0x00b4:
            int r2 = r14.f     // Catch:{ all -> 0x020a }
            if (r2 >= 0) goto L_0x00de
            int r2 = r14.i     // Catch:{ all -> 0x020a }
            if (r2 == r5) goto L_0x00bd
            goto L_0x00bf
        L_0x00bd:
            r2 = 0
        L_0x00bf:
            co r6 = r14.j     // Catch:{ all -> 0x020a }
            int r6 = r6.c()     // Catch:{ all -> 0x020a }
            if (r6 <= 0) goto L_0x00d4
            int r6 = r14.k     // Catch:{ all -> 0x020a }
            ou r6 = r14.d(r6)     // Catch:{ all -> 0x020a }
            int r6 = r6.a     // Catch:{ all -> 0x020a }
            int r7 = r14.e     // Catch:{ all -> 0x020a }
            int r6 = r6 + r7
            int r6 = r6 + r5
            goto L_0x00d5
        L_0x00d4:
            r6 = r2
        L_0x00d5:
            int r7 = r14.e     // Catch:{ all -> 0x020a }
            int r6 = r6 % r7
            r7 = r2
            r2 = r6
            r6 = 0
            r8 = 0
            goto L_0x0148
        L_0x00de:
            int r6 = r14.k     // Catch:{ all -> 0x020a }
            if (r2 > r6) goto L_0x0204
            int r6 = r2 + -1
            ou r2 = r14.d(r2)     // Catch:{ all -> 0x020a }
            int r2 = r2.a     // Catch:{ all -> 0x020a }
            int r7 = r14.a(r1)     // Catch:{ all -> 0x020a }
            if (r7 >= 0) goto L_0x010e
            int r2 = r2 + -1
            int r7 = r14.e     // Catch:{ all -> 0x020a }
            int r7 = r7 + r5
            r8 = 2147483647(0x7fffffff, float:NaN)
        L_0x00f8:
            if (r7 >= 0) goto L_0x00fb
            goto L_0x010d
        L_0x00fb:
            boolean r8 = r14.c     // Catch:{ all -> 0x020a }
            if (r8 == 0) goto L_0x0104
            int r8 = r14.i(r7)     // Catch:{ all -> 0x020a }
            goto L_0x0108
        L_0x0104:
            int r8 = r14.j(r7)     // Catch:{ all -> 0x020a }
        L_0x0108:
            if (r8 != r3) goto L_0x010d
            int r7 = r7 + -1
            goto L_0x00f8
        L_0x010d:
            goto L_0x011c
        L_0x010e:
            boolean r8 = r14.c     // Catch:{ all -> 0x020a }
            if (r8 != 0) goto L_0x0117
            int r8 = r14.a(r1, r7, r0)     // Catch:{ all -> 0x020a }
            goto L_0x011c
        L_0x0117:
            int r8 = r14.b(r4, r7, r0)     // Catch:{ all -> 0x020a }
        L_0x011c:
            boolean r7 = r14.c     // Catch:{ all -> 0x020a }
            if (r7 == 0) goto L_0x0127
            int r7 = r14.i(r2)     // Catch:{ all -> 0x020a }
            if (r7 < r8) goto L_0x0144
            goto L_0x012e
        L_0x0127:
            int r7 = r14.j(r2)     // Catch:{ all -> 0x020a }
            if (r7 <= r8) goto L_0x012e
            goto L_0x0144
        L_0x012e:
            int r2 = r2 + -1
            if (r2 >= 0) goto L_0x0144
            int r2 = r14.e     // Catch:{ all -> 0x020a }
            int r2 = r2 + r5
            boolean r7 = r14.c     // Catch:{ all -> 0x020a }
            if (r7 == 0) goto L_0x013e
            int r7 = r14.b(r4, r0)     // Catch:{ all -> 0x020a }
            goto L_0x0142
        L_0x013e:
            int r7 = r14.a(r1, r0)     // Catch:{ all -> 0x020a }
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
            boolean r2 = r14.c     // Catch:{ all -> 0x020a }
            if (r2 == 0) goto L_0x0154
            int r2 = r14.b(r4, r0)     // Catch:{ all -> 0x020a }
            goto L_0x0158
        L_0x0154:
            int r2 = r14.a(r1, r0)     // Catch:{ all -> 0x020a }
        L_0x0158:
            r8 = r2
            int r2 = r14.e     // Catch:{ all -> 0x020a }
            int r2 = r2 + r5
            goto L_0x0149
        L_0x015d:
            if (r7 >= 0) goto L_0x0161
            goto L_0x0204
        L_0x0161:
            boolean r9 = r14.f(r15)     // Catch:{ all -> 0x020a }
            if (r9 != 0) goto L_0x0204
            boolean r9 = r14.c     // Catch:{ all -> 0x020a }
            if (r9 == 0) goto L_0x0170
            int r9 = r14.i(r2)     // Catch:{ all -> 0x020a }
            goto L_0x0174
        L_0x0170:
            int r9 = r14.j(r2)     // Catch:{ all -> 0x020a }
        L_0x0174:
            r10 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r9 != r3) goto L_0x0179
            goto L_0x0187
        L_0x0179:
            if (r9 == r10) goto L_0x0187
            boolean r10 = r14.c     // Catch:{ all -> 0x020a }
            if (r10 == 0) goto L_0x0182
            int r10 = r14.d     // Catch:{ all -> 0x020a }
            goto L_0x0185
        L_0x0182:
            int r10 = r14.d     // Catch:{ all -> 0x020a }
        L_0x0184:
            int r10 = -r10
        L_0x0185:
            int r9 = r9 + r10
            goto L_0x01b9
        L_0x0187:
            int r9 = r14.e     // Catch:{ all -> 0x020a }
            int r9 = r9 + r5
            if (r2 == r9) goto L_0x019e
            boolean r9 = r14.c     // Catch:{ all -> 0x020a }
            if (r9 != 0) goto L_0x0197
            int r9 = r2 + 1
            int r9 = r14.i(r9)     // Catch:{ all -> 0x020a }
            goto L_0x01b9
        L_0x0197:
            int r9 = r2 + 1
            int r9 = r14.j(r9)     // Catch:{ all -> 0x020a }
            goto L_0x01b9
        L_0x019e:
            boolean r9 = r14.c     // Catch:{ all -> 0x020a }
            if (r9 == 0) goto L_0x01a7
            int r9 = r14.i(r1)     // Catch:{ all -> 0x020a }
            goto L_0x01ab
        L_0x01a7:
            int r9 = r14.j(r1)     // Catch:{ all -> 0x020a }
        L_0x01ab:
            if (r9 == r3) goto L_0x01b9
            if (r9 == r10) goto L_0x01b9
            boolean r10 = r14.c     // Catch:{ all -> 0x020a }
            if (r10 == 0) goto L_0x01b6
            int r10 = r14.d     // Catch:{ all -> 0x020a }
            goto L_0x0185
        L_0x01b6:
            int r10 = r14.d     // Catch:{ all -> 0x020a }
            goto L_0x0184
        L_0x01b9:
            int r10 = r7 + -1
            int r7 = r14.a(r7, r2, r9)     // Catch:{ all -> 0x020a }
            if (r6 == 0) goto L_0x01ee
        L_0x01c1:
            boolean r6 = r14.c     // Catch:{ all -> 0x020a }
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
            boolean r6 = r14.f(r15)     // Catch:{ all -> 0x020a }
            if (r6 != 0) goto L_0x0204
            boolean r6 = r14.c     // Catch:{ all -> 0x020a }
            if (r6 != 0) goto L_0x01e1
            int r6 = -r7
            int r7 = r14.d     // Catch:{ all -> 0x020a }
            int r6 = r6 - r7
            goto L_0x01e4
        L_0x01e1:
            int r6 = r14.d     // Catch:{ all -> 0x020a }
            int r6 = r6 + r7
        L_0x01e4:
            int r9 = r9 + r6
            int r6 = r10 + -1
            int r7 = r14.a(r10, r2, r9)     // Catch:{ all -> 0x020a }
            r10 = r6
            goto L_0x01c1
        L_0x01ee:
            boolean r6 = r14.c     // Catch:{ all -> 0x020a }
            if (r6 == 0) goto L_0x01f7
            int r6 = r14.i(r2)     // Catch:{ all -> 0x020a }
            goto L_0x01fb
        L_0x01f7:
            int r6 = r14.j(r2)     // Catch:{ all -> 0x020a }
        L_0x01fb:
            r8 = r6
            r7 = r10
        L_0x01fe:
            int r2 = r2 + -1
            r6 = 1
            goto L_0x0149
        L_0x0204:
            java.lang.Object[] r15 = r14.a
            r15[r1] = r0
            goto L_0x009c
        L_0x020a:
            r15 = move-exception
            java.lang.Object[] r2 = r14.a
            r2[r1] = r0
            r14.l = r0
            throw r15
        L_0x0212:
            return
        L_0x0213:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ov.g(int):void");
    }

    public ov(byte b) {
    }

    private final int a(boolean z) {
        boolean z2 = false;
        if (z) {
            for (int i = this.g; i >= this.f; i--) {
                int i2 = d(i).a;
                if (i2 == 0) {
                    z2 = true;
                } else if (z2 && i2 == this.e - 1) {
                    return i;
                }
            }
        } else {
            for (int i3 = this.f; i3 <= this.g; i3++) {
                int i4 = d(i3).a;
                if (i4 == this.e - 1) {
                    z2 = true;
                } else if (z2 && i4 == 0) {
                    return i3;
                }
            }
        }
        return -1;
    }

    public final int b(boolean z, int i, int[] iArr) {
        int i2;
        int i3;
        int b = this.b.b(i);
        ou h = d(i);
        int i4 = h.a;
        if (!this.c) {
            i2 = this.b.c(i) + b;
            int i5 = i - 1;
            ou ouVar = h;
            int i6 = i4;
            int i7 = b;
            i3 = i;
            int i8 = 1;
            while (i8 < this.e && i5 >= this.f) {
                i7 -= ouVar.b;
                ouVar = d(i5);
                int i9 = ouVar.a;
                if (i9 != i6) {
                    i8++;
                    int c = this.b.c(i5) + i7;
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
            while (i13 < this.e && i10 <= this.g) {
                ou h2 = d(i10);
                i11 += h2.b;
                int i14 = h2.a;
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

    public final int a(boolean z, int i, int[] iArr) {
        int i2;
        int i3;
        int b = this.b.b(i);
        ou h = d(i);
        int i4 = h.a;
        if (this.c) {
            i2 = b - this.b.c(i);
            int i5 = i - 1;
            ou ouVar = h;
            int i6 = i4;
            int i7 = b;
            i3 = i;
            int i8 = 1;
            while (i8 < this.e && i5 >= this.f) {
                i7 -= ouVar.b;
                ouVar = d(i5);
                int i9 = ouVar.a;
                if (i9 != i6) {
                    i8++;
                    int c = i7 - this.b.c(i5);
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
            while (i13 < this.e && i10 <= this.g) {
                ou h2 = d(i10);
                i11 += h2.b;
                int i14 = h2.a;
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

    private final int i(int i) {
        int i2 = this.f;
        if (i2 < 0) {
            return Integer.MIN_VALUE;
        }
        if (!this.c) {
            int b = this.b.b(this.g);
            ou h = d(this.g);
            if (h.a != i) {
                int i3 = this.g;
                while (true) {
                    i3--;
                    if (i3 < this.k) {
                        break;
                    }
                    b -= h.b;
                    h = d(i3);
                    if (h.a == i) {
                        return b + h.c;
                    }
                }
            } else {
                return b + h.c;
            }
        } else {
            int b2 = this.b.b(i2);
            if (d(this.f).a != i) {
                int i4 = this.f;
                while (true) {
                    i4++;
                    if (i4 > d()) {
                        break;
                    }
                    ou h2 = d(i4);
                    b2 += h2.b;
                    if (h2.a == i) {
                        return b2;
                    }
                }
            } else {
                return b2;
            }
        }
        return Integer.MIN_VALUE;
    }

    private final int j(int i) {
        int i2 = this.f;
        if (i2 < 0) {
            return Integer.MAX_VALUE;
        }
        if (this.c) {
            int b = this.b.b(this.g);
            ou h = d(this.g);
            if (h.a != i) {
                int i3 = this.g;
                while (true) {
                    i3--;
                    if (i3 < this.k) {
                        break;
                    }
                    b -= h.b;
                    h = d(i3);
                    if (h.a == i) {
                        return b - h.c;
                    }
                }
            } else {
                return b - h.c;
            }
        } else {
            int b2 = this.b.b(i2);
            if (d(this.f).a != i) {
                int i4 = this.f;
                while (true) {
                    i4++;
                    if (i4 > d()) {
                        break;
                    }
                    ou h2 = d(i4);
                    b2 += h2.b;
                    if (h2.a == i) {
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
