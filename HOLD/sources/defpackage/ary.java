package defpackage;

/* renamed from: ary  reason: default package */
/* compiled from: PG */
public final class ary implements art {
    private final asm a;
    private final boolean b;
    private final boolean c;
    private final ase d = new ase(7);
    private final ase e = new ase(8);
    private final ase f = new ase(6);
    private long g;
    private final boolean[] h = new boolean[3];
    private String i;
    private aov j;
    private arx k;
    private boolean l;
    private long m;
    private boolean n;
    private final bky o = new bky();

    public ary(asm asm, boolean z, boolean z2) {
        this.a = asm;
        this.b = z;
        this.c = z2;
    }

    public final void b() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01e9, code lost:
        if (r4.l == r6.l) goto L_0x021b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0248  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0220  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.bky r26) {
        /*
            r25 = this;
            r0 = r25
            r1 = r26
            int r2 = r1.b
            int r3 = r1.c
            byte[] r4 = r1.a
            long r5 = r0.g
            int r7 = r26.b()
            long r7 = (long) r7
            long r5 = r5 + r7
            r0.g = r5
            aov r5 = r0.j
            int r6 = r26.b()
            r5.a(r1, r6)
        L_0x001d:
            boolean[] r1 = r0.h
            int r1 = defpackage.bkw.a(r4, r2, r3, r1)
            if (r1 == r3) goto L_0x02a0
            int r5 = defpackage.bkw.b(r4, r1)
            int r6 = r1 - r2
            if (r6 > 0) goto L_0x002e
            goto L_0x0031
        L_0x002e:
            r0.a(r4, r2, r1)
        L_0x0031:
            int r2 = r3 - r1
            long r7 = r0.g
            long r9 = (long) r2
            long r7 = r7 - r9
            if (r6 >= 0) goto L_0x003b
            int r6 = -r6
            goto L_0x003d
        L_0x003b:
            r6 = 0
        L_0x003d:
            long r10 = r0.m
            boolean r12 = r0.l
            if (r12 != 0) goto L_0x0044
            goto L_0x004a
        L_0x0044:
            arx r12 = r0.k
            boolean r12 = r12.c
            if (r12 == 0) goto L_0x0131
        L_0x004a:
            ase r12 = r0.d
            r12.b(r6)
            ase r12 = r0.e
            r12.b(r6)
            boolean r12 = r0.l
            r14 = 3
            if (r12 == 0) goto L_0x00a1
            ase r12 = r0.d
            boolean r15 = r12.a
            if (r15 == 0) goto L_0x0079
            byte[] r15 = r12.b
            int r12 = r12.c
            bkv r12 = defpackage.bkw.a(r15, r14, r12)
            arx r14 = r0.k
            r14.a(r12)
            ase r12 = r0.d
            r12.a()
            r24 = r1
            r22 = r3
            r23 = r4
            goto L_0x0137
        L_0x0079:
            ase r12 = r0.e
            boolean r14 = r12.a
            if (r14 == 0) goto L_0x0099
            byte[] r14 = r12.b
            int r12 = r12.c
            bku r12 = defpackage.bkw.d(r14, r12)
            arx r14 = r0.k
            r14.a(r12)
            ase r12 = r0.e
            r12.a()
            r24 = r1
            r22 = r3
            r23 = r4
            goto L_0x0137
        L_0x0099:
            r24 = r1
            r22 = r3
            r23 = r4
            goto L_0x0137
        L_0x00a1:
            ase r12 = r0.d
            boolean r12 = r12.a
            if (r12 == 0) goto L_0x012a
            ase r12 = r0.e
            boolean r12 = r12.a
            if (r12 == 0) goto L_0x012a
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            ase r15 = r0.d
            byte[] r9 = r15.b
            int r15 = r15.c
            byte[] r9 = java.util.Arrays.copyOf(r9, r15)
            r12.add(r9)
            ase r9 = r0.e
            byte[] r15 = r9.b
            int r9 = r9.c
            byte[] r9 = java.util.Arrays.copyOf(r15, r9)
            r12.add(r9)
            ase r9 = r0.d
            byte[] r15 = r9.b
            int r9 = r9.c
            bkv r9 = defpackage.bkw.a(r15, r14, r9)
            ase r14 = r0.e
            byte[] r15 = r14.b
            int r14 = r14.c
            bku r14 = defpackage.bkw.d(r15, r14)
            aov r15 = r0.j
            java.lang.String r13 = r0.i
            r16 = r15
            int r15 = r9.a
            r22 = r3
            int r3 = r9.b
            r23 = r4
            int r4 = r9.c
            java.lang.String r17 = defpackage.bkg.a(r15, r3, r4)
            int r3 = r9.e
            int r4 = r9.f
            float r15 = r9.g
            java.lang.String r18 = "video/avc"
            r24 = r1
            r21 = r15
            r1 = r16
            r15 = r13
            r16 = r18
            r18 = r3
            r19 = r4
            r20 = r12
            akh r3 = defpackage.akh.a(r15, r16, r17, r18, r19, r20, r21)
            r1.a(r3)
            r1 = 1
            r0.l = r1
            arx r1 = r0.k
            r1.a(r9)
            arx r1 = r0.k
            r1.a(r14)
            ase r1 = r0.d
            r1.a()
            ase r1 = r0.e
            r1.a()
            goto L_0x0137
        L_0x012a:
            r24 = r1
            r22 = r3
            r23 = r4
            goto L_0x0137
        L_0x0131:
            r24 = r1
            r22 = r3
            r23 = r4
        L_0x0137:
            ase r1 = r0.f
            boolean r1 = r1.b(r6)
            if (r1 == 0) goto L_0x015f
            ase r1 = r0.f
            byte[] r3 = r1.b
            int r1 = r1.c
            int r1 = defpackage.bkw.a(r3, r1)
            bky r3 = r0.o
            ase r4 = r0.f
            byte[] r4 = r4.b
            r3.a(r4, r1)
            bky r1 = r0.o
            r3 = 4
            r1.c(r3)
            asm r1 = r0.a
            bky r3 = r0.o
            r1.a(r10, r3)
        L_0x015f:
            arx r1 = r0.k
            boolean r3 = r0.l
            boolean r9 = r0.n
            int r4 = r1.i
            r6 = 9
            if (r4 == r6) goto L_0x01eb
            boolean r4 = r1.c
            if (r4 == 0) goto L_0x021b
            arw r4 = r1.n
            arw r6 = r1.m
            boolean r10 = r4.a
            if (r10 != 0) goto L_0x0179
            goto L_0x021b
        L_0x0179:
            boolean r10 = r6.a
            if (r10 == 0) goto L_0x01eb
            int r10 = r4.f
            int r11 = r6.f
            if (r10 != r11) goto L_0x01eb
            int r10 = r4.g
            int r11 = r6.g
            if (r10 != r11) goto L_0x01eb
            boolean r10 = r4.h
            boolean r11 = r6.h
            if (r10 != r11) goto L_0x01eb
            boolean r10 = r4.i
            if (r10 != 0) goto L_0x0194
        L_0x0193:
            goto L_0x019f
        L_0x0194:
            boolean r10 = r6.i
            if (r10 == 0) goto L_0x0193
            boolean r10 = r4.j
            boolean r11 = r6.j
            if (r10 == r11) goto L_0x0193
            goto L_0x01eb
        L_0x019f:
            int r10 = r4.d
            int r11 = r6.d
            if (r10 != r11) goto L_0x01a6
        L_0x01a5:
            goto L_0x01ab
        L_0x01a6:
            if (r10 == 0) goto L_0x01eb
            if (r11 != 0) goto L_0x01a5
            goto L_0x01eb
        L_0x01ab:
            bkv r10 = r4.c
            int r10 = r10.k
            if (r10 != 0) goto L_0x01c5
            bkv r10 = r6.c
            int r10 = r10.k
            if (r10 == 0) goto L_0x01b8
            goto L_0x01db
        L_0x01b8:
            int r10 = r4.m
            int r11 = r6.m
            if (r10 != r11) goto L_0x01eb
            int r10 = r4.n
            int r11 = r6.n
            if (r10 == r11) goto L_0x01db
            goto L_0x01eb
        L_0x01c5:
            r11 = 1
            if (r10 != r11) goto L_0x01db
            bkv r10 = r6.c
            int r10 = r10.k
            if (r10 != r11) goto L_0x01db
            int r10 = r4.o
            int r11 = r6.o
            if (r10 != r11) goto L_0x01eb
            int r10 = r4.p
            int r11 = r6.p
            if (r10 == r11) goto L_0x01db
            goto L_0x01eb
        L_0x01db:
            boolean r10 = r4.k
            boolean r11 = r6.k
            if (r10 != r11) goto L_0x01eb
            if (r10 == 0) goto L_0x021b
            if (r11 == 0) goto L_0x021b
            int r4 = r4.l
            int r6 = r6.l
            if (r4 == r6) goto L_0x021b
        L_0x01eb:
            if (r3 != 0) goto L_0x01ee
            goto L_0x020d
        L_0x01ee:
            boolean r3 = r1.o
            if (r3 == 0) goto L_0x020d
            long r3 = r1.j
            boolean r13 = r1.r
            long r10 = r1.p
            aov r6 = r1.a
            long r14 = r1.q
            long r10 = r3 - r10
            int r11 = (int) r10
            long r3 = r7 - r3
            int r4 = (int) r3
            int r2 = r2 + r4
            r16 = 0
            r10 = r6
            r3 = r11
            r11 = r14
            r14 = r3
            r15 = r2
            r10.a(r11, r13, r14, r15, r16)
        L_0x020d:
            long r2 = r1.j
            r1.p = r2
            long r2 = r1.l
            r1.q = r2
            r2 = 0
            r1.r = r2
            r2 = 1
            r1.o = r2
        L_0x021b:
            boolean r2 = r1.b
            r3 = 2
            if (r2 == 0) goto L_0x0232
            arw r2 = r1.n
            boolean r4 = r2.b
            if (r4 == 0) goto L_0x0230
            int r2 = r2.e
            r4 = 7
            if (r2 != r4) goto L_0x022d
        L_0x022b:
            r9 = 1
            goto L_0x0233
        L_0x022d:
            if (r2 != r3) goto L_0x0230
            goto L_0x022b
        L_0x0230:
            r9 = 0
            goto L_0x0233
        L_0x0232:
        L_0x0233:
            boolean r2 = r1.r
            int r4 = r1.i
            r6 = 5
            if (r4 != r6) goto L_0x023c
        L_0x023a:
            r4 = 1
            goto L_0x0242
        L_0x023c:
            if (r9 == 0) goto L_0x0241
            r9 = 1
            if (r4 == r9) goto L_0x023a
        L_0x0241:
            r4 = 0
        L_0x0242:
            r2 = r2 | r4
            r1.r = r2
            if (r2 != 0) goto L_0x0248
            goto L_0x024c
        L_0x0248:
            r1 = 0
            r0.n = r1
        L_0x024c:
            long r1 = r0.m
            boolean r4 = r0.l
            if (r4 != 0) goto L_0x0253
            goto L_0x0259
        L_0x0253:
            arx r4 = r0.k
            boolean r4 = r4.c
            if (r4 == 0) goto L_0x0263
        L_0x0259:
            ase r4 = r0.d
            r4.a(r5)
            ase r4 = r0.e
            r4.a(r5)
        L_0x0263:
            ase r4 = r0.f
            r4.a(r5)
            arx r4 = r0.k
            r4.i = r5
            r4.l = r1
            r4.j = r7
            boolean r1 = r4.b
            if (r1 != 0) goto L_0x0275
            goto L_0x0278
        L_0x0275:
            r1 = 1
            if (r5 == r1) goto L_0x0285
        L_0x0278:
            boolean r1 = r4.c
            if (r1 != 0) goto L_0x027d
            goto L_0x0298
        L_0x027d:
            if (r5 != r6) goto L_0x0280
            goto L_0x0285
        L_0x0280:
            r1 = 1
            if (r5 == r1) goto L_0x0285
            if (r5 != r3) goto L_0x0298
        L_0x0285:
            arw r1 = r4.m
            arw r2 = r4.n
            r4.m = r2
            r4.n = r1
            arw r1 = r4.n
            r1.a()
            r1 = 0
            r4.h = r1
            r1 = 1
            r4.k = r1
        L_0x0298:
            int r2 = r24 + 3
            r3 = r22
            r4 = r23
            goto L_0x001d
        L_0x02a0:
            r22 = r3
            r23 = r4
            r1 = r22
            r3 = r23
            r0.a(r3, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ary.a(bky):void");
    }

    public final void a(aok aok, asw asw) {
        asw.a();
        this.i = asw.c();
        this.j = aok.a(asw.b(), 2);
        this.k = new arx(this.j, this.b, this.c);
        this.a.a(aok, asw);
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0153  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void a(byte[] r17, int r18, int r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r19
            boolean r4 = r0.l
            if (r4 == 0) goto L_0x0012
            arx r4 = r0.k
            boolean r4 = r4.c
            if (r4 == 0) goto L_0x001c
        L_0x0012:
            ase r4 = r0.d
            r4.a(r1, r2, r3)
            ase r4 = r0.e
            r4.a(r1, r2, r3)
        L_0x001c:
            ase r4 = r0.f
            r4.a(r1, r2, r3)
            arx r4 = r0.k
            boolean r5 = r4.k
            if (r5 == 0) goto L_0x01b6
            int r3 = r3 - r2
            byte[] r5 = r4.g
            int r6 = r5.length
            int r7 = r4.h
            int r7 = r7 + r3
            if (r6 >= r7) goto L_0x0037
            int r7 = r7 + r7
            byte[] r5 = java.util.Arrays.copyOf(r5, r7)
            r4.g = r5
        L_0x0037:
            byte[] r5 = r4.g
            int r6 = r4.h
            java.lang.System.arraycopy(r1, r2, r5, r6, r3)
            int r1 = r4.h
            int r1 = r1 + r3
            r4.h = r1
            bkz r2 = r4.f
            byte[] r3 = r4.g
            r5 = 0
            r2.a(r3, r5, r1)
            bkz r1 = r4.f
            r2 = 8
            boolean r1 = r1.b(r2)
            if (r1 == 0) goto L_0x01b6
            bkz r1 = r4.f
            r1.a()
            bkz r1 = r4.f
            r2 = 2
            int r1 = r1.c(r2)
            bkz r3 = r4.f
            r6 = 5
            r3.a(r6)
            bkz r3 = r4.f
            boolean r3 = r3.c()
            if (r3 == 0) goto L_0x01b6
            bkz r3 = r4.f
            r3.e()
            bkz r3 = r4.f
            boolean r3 = r3.c()
            if (r3 == 0) goto L_0x01b6
            bkz r3 = r4.f
            int r3 = r3.e()
            boolean r7 = r4.c
            r8 = 1
            if (r7 != 0) goto L_0x0090
            r4.k = r5
            arw r1 = r4.n
            r1.e = r3
            r1.b = r8
            return
        L_0x0090:
            bkz r7 = r4.f
            boolean r7 = r7.c()
            if (r7 == 0) goto L_0x01b6
            bkz r7 = r4.f
            int r7 = r7.e()
            android.util.SparseArray r9 = r4.e
            int r9 = r9.indexOfKey(r7)
            if (r9 < 0) goto L_0x01b2
            android.util.SparseArray r9 = r4.e
            java.lang.Object r9 = r9.get(r7)
            bku r9 = (defpackage.bku) r9
            android.util.SparseArray r10 = r4.d
            int r11 = r9.b
            java.lang.Object r10 = r10.get(r11)
            bkv r10 = (defpackage.bkv) r10
            boolean r11 = r10.h
            if (r11 == 0) goto L_0x00c9
            bkz r11 = r4.f
            boolean r11 = r11.b(r2)
            if (r11 == 0) goto L_0x01b6
            bkz r11 = r4.f
            r11.a(r2)
        L_0x00c9:
            bkz r2 = r4.f
            int r11 = r10.j
            boolean r2 = r2.b(r11)
            if (r2 == 0) goto L_0x01b6
            bkz r2 = r4.f
            int r11 = r10.j
            int r2 = r2.c(r11)
            boolean r11 = r10.i
            if (r11 == 0) goto L_0x00e3
            r11 = 0
        L_0x00e0:
            r12 = 0
            r13 = 0
            goto L_0x0107
        L_0x00e3:
            bkz r11 = r4.f
            boolean r11 = r11.b(r8)
            if (r11 == 0) goto L_0x01b6
            bkz r11 = r4.f
            boolean r11 = r11.b()
            if (r11 == 0) goto L_0x0105
            bkz r12 = r4.f
            boolean r12 = r12.b(r8)
            if (r12 == 0) goto L_0x01b6
            bkz r12 = r4.f
            boolean r12 = r12.b()
            r13 = r12
            r12 = 1
            goto L_0x0107
        L_0x0105:
            goto L_0x00e0
        L_0x0107:
            int r14 = r4.i
            if (r14 != r6) goto L_0x010d
            r6 = 1
            goto L_0x010f
        L_0x010d:
            r6 = 0
        L_0x010f:
            if (r6 == 0) goto L_0x0120
            bkz r14 = r4.f
            boolean r14 = r14.c()
            if (r14 == 0) goto L_0x01b6
            bkz r14 = r4.f
            int r14 = r14.e()
            goto L_0x0122
        L_0x0120:
            r14 = 0
        L_0x0122:
            int r15 = r10.k
            if (r15 != 0) goto L_0x0152
            bkz r15 = r4.f
            int r5 = r10.l
            boolean r5 = r15.b(r5)
            if (r5 == 0) goto L_0x01b6
            bkz r5 = r4.f
            int r15 = r10.l
            int r5 = r5.c(r15)
            boolean r9 = r9.c
            if (r9 != 0) goto L_0x013d
        L_0x013c:
            goto L_0x0188
        L_0x013d:
            if (r11 != 0) goto L_0x0151
            bkz r9 = r4.f
            boolean r9 = r9.c()
            if (r9 == 0) goto L_0x01b6
            bkz r9 = r4.f
            int r9 = r9.d()
            r8 = 0
            r15 = 0
            goto L_0x018b
        L_0x0151:
            goto L_0x013c
        L_0x0152:
            if (r15 != r8) goto L_0x0187
            boolean r5 = r10.m
            if (r5 != 0) goto L_0x0187
            bkz r5 = r4.f
            boolean r5 = r5.c()
            if (r5 == 0) goto L_0x01b6
            bkz r5 = r4.f
            int r5 = r5.d()
            boolean r9 = r9.c
            if (r9 == 0) goto L_0x0182
            if (r11 != 0) goto L_0x0181
            bkz r9 = r4.f
            boolean r9 = r9.c()
            if (r9 == 0) goto L_0x01b6
            bkz r9 = r4.f
            int r9 = r9.d()
            r15 = r5
            r8 = r9
            r5 = 0
            r9 = 0
            goto L_0x018b
        L_0x0181:
        L_0x0182:
            r15 = r5
            r5 = 0
            r8 = 0
            r9 = 0
            goto L_0x018b
        L_0x0187:
            r5 = 0
        L_0x0188:
            r8 = 0
            r9 = 0
            r15 = 0
        L_0x018b:
            arw r0 = r4.n
            r0.c = r10
            r0.d = r1
            r0.e = r3
            r0.f = r2
            r0.g = r7
            r0.h = r11
            r0.i = r12
            r0.j = r13
            r0.k = r6
            r0.l = r14
            r0.m = r5
            r0.n = r9
            r0.o = r15
            r0.p = r8
            r1 = 1
            r0.a = r1
            r0.b = r1
            r0 = 0
            r4.k = r0
            return
        L_0x01b2:
            r0 = 0
            r4.k = r0
            return
        L_0x01b6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ary.a(byte[], int, int):void");
    }

    public final void a(long j2, int i2) {
        boolean z;
        this.m = j2;
        boolean z2 = this.n;
        if ((i2 & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        this.n = z2 | z;
    }

    public final void a() {
        bkw.a(this.h);
        this.d.a();
        this.e.a();
        this.f.a();
        this.k.a();
        this.g = 0;
        this.n = false;
    }
}
