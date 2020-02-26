package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: bdw  reason: default package */
/* compiled from: PG */
public final class bdw extends bed {
    public static final int[] a = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};
    private static final int[] c = {11, 1, 3, 12, 14, 5, 7, 9};
    private static final int[] d = {0, 4, 8, 12, 16, 20, 24, 28};
    private static final int[] e = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};
    private static final int[] f = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};
    private static final int[] g = {193, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, 203, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187};
    private static final int[] h = {195, 227, 205, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};
    private static final boolean[] i = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};
    private final bky j = new bky();
    private final int k;
    private final int l;
    private final int m;
    private final ArrayList n = new ArrayList();
    private bdv o = new bdv(0, 4);
    private List p;
    private List q;
    private int r;
    private int s;
    private boolean t;
    private boolean u;
    private byte v;
    private byte w;
    private int x = 0;
    private boolean y;

    private static boolean b(byte b) {
        return (b & 224) == 0;
    }

    public final void d() {
    }

    /* access modifiers changed from: protected */
    public final boolean e() {
        return this.p != this.q;
    }

    public bdw(String str, int i2) {
        this.k = !"application/x-mp4-cea-608".equals(str) ? 3 : 2;
        if (i2 == 1) {
            this.m = 0;
            this.l = 0;
        } else if (i2 == 2) {
            this.m = 1;
            this.l = 0;
        } else if (i2 == 3) {
            this.m = 0;
            this.l = 1;
        } else if (i2 != 4) {
            Log.w("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
            this.m = 0;
            this.l = 0;
        } else {
            this.m = 1;
            this.l = 1;
        }
        a(0);
        h();
        this.y = true;
    }

    /* access modifiers changed from: protected */
    public final bdl f() {
        List list = this.p;
        this.q = list;
        return new bee(list);
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x0014 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0090  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.bdq r15) {
        /*
            r14 = this;
            bky r0 = r14.j
            java.nio.ByteBuffer r1 = r15.c
            byte[] r1 = r1.array()
            java.nio.ByteBuffer r15 = r15.c
            int r15 = r15.limit()
            r0.a(r1, r15)
            r15 = 0
            r0 = 1
            r1 = 0
        L_0x0014:
            bky r2 = r14.j
            int r2 = r2.b()
            int r3 = r14.k
            r4 = 3
            if (r2 < r3) goto L_0x0296
            r2 = 2
            if (r3 == r2) goto L_0x002a
            bky r3 = r14.j
            int r3 = r3.d()
            byte r3 = (byte) r3
            goto L_0x002c
        L_0x002a:
            r3 = -4
        L_0x002c:
            bky r5 = r14.j
            int r5 = r5.d()
            bky r6 = r14.j
            int r6 = r6.d()
            r7 = r3 & 2
            if (r7 != 0) goto L_0x0014
            r7 = r3 & 1
            int r8 = r14.l
            if (r7 != r8) goto L_0x0014
            r7 = r5 & 127(0x7f, float:1.78E-43)
            r8 = r6 & 127(0x7f, float:1.78E-43)
            if (r7 == 0) goto L_0x0049
            goto L_0x004c
        L_0x0049:
            if (r8 != 0) goto L_0x004c
            goto L_0x0014
        L_0x004c:
            boolean r9 = r14.t
            r3 = r3 & 4
            r10 = 4
            if (r3 != r10) goto L_0x0060
            boolean[] r3 = defpackage.bdw.i
            boolean r5 = r3[r5]
            if (r5 == 0) goto L_0x0060
            boolean r3 = r3[r6]
            if (r3 == 0) goto L_0x005f
            r3 = 1
            goto L_0x0061
        L_0x005f:
        L_0x0060:
            r3 = 0
        L_0x0061:
            r14.t = r3
            byte r5 = (byte) r7
            byte r6 = (byte) r8
            r11 = 16
            if (r3 != 0) goto L_0x006a
            goto L_0x008a
        L_0x006a:
            r12 = r7 & 240(0xf0, float:3.36E-43)
            if (r12 != r11) goto L_0x008a
            boolean r12 = r14.u
            if (r12 == 0) goto L_0x0080
            byte r12 = r14.v
            if (r12 != r7) goto L_0x0080
            byte r12 = r14.w
            if (r12 == r8) goto L_0x007b
            goto L_0x0080
        L_0x007b:
            r14.u = r15
            r12 = 1
            goto L_0x008e
        L_0x0080:
            r14.u = r0
            r14.v = r5
            r14.w = r6
            r12 = 0
            goto L_0x008e
        L_0x008a:
            r14.u = r15
            r12 = 0
        L_0x008e:
            if (r12 != 0) goto L_0x0014
            if (r3 == 0) goto L_0x028d
            r3 = 20
            r9 = 32
            if (r7 > 0) goto L_0x0099
            goto L_0x00a0
        L_0x0099:
            r12 = 15
            if (r7 > r12) goto L_0x00a0
            r14.y = r15
            goto L_0x00b8
        L_0x00a0:
            r12 = r7 & 247(0xf7, float:3.46E-43)
            if (r12 == r3) goto L_0x00a5
            goto L_0x00b8
        L_0x00a5:
            if (r8 == r9) goto L_0x00b6
            r12 = 47
            if (r8 == r12) goto L_0x00b6
            switch(r8) {
                case 37: goto L_0x00b6;
                case 38: goto L_0x00b6;
                case 39: goto L_0x00b6;
                default: goto L_0x00ae;
            }
        L_0x00ae:
            switch(r8) {
                case 41: goto L_0x00b6;
                case 42: goto L_0x00b2;
                case 43: goto L_0x00b2;
                default: goto L_0x00b1;
            }
        L_0x00b1:
            goto L_0x00b8
        L_0x00b2:
            r14.y = r15
            goto L_0x00b8
        L_0x00b6:
            r14.y = r0
        L_0x00b8:
            boolean r12 = r14.y
            if (r12 == 0) goto L_0x0014
            boolean r12 = b(r5)
            if (r12 == 0) goto L_0x00c7
            int r12 = r7 >> 3
            r12 = r12 & r0
            r14.x = r12
        L_0x00c7:
            int r12 = r14.x
            int r13 = r14.m
            if (r12 != r13) goto L_0x0014
            boolean r1 = b(r5)
            if (r1 != 0) goto L_0x00f1
            bdv r1 = r14.o
            char r2 = a(r5)
            r1.a(r2)
            r1 = r8 & 224(0xe0, float:3.14E-43)
            if (r1 == 0) goto L_0x00ed
            bdv r1 = r14.o
            char r2 = a(r6)
            r1.a(r2)
            r1 = 1
            goto L_0x0014
        L_0x00ed:
        L_0x00ee:
            r1 = 1
            goto L_0x0014
        L_0x00f1:
            r1 = r7 & 247(0xf7, float:3.46E-43)
            r5 = 17
            if (r1 == r5) goto L_0x00f9
            goto L_0x0110
        L_0x00f9:
            r6 = r8 & 240(0xf0, float:3.36E-43)
            r12 = 48
            if (r6 != r12) goto L_0x0110
            bdv r1 = r14.o
            int[] r2 = defpackage.bdw.f
            r3 = r8 & 15
            r2 = r2[r3]
            char r2 = (char) r2
            r1.a(r2)
            r1 = 1
            goto L_0x0014
        L_0x0110:
            r6 = r7 & 246(0xf6, float:3.45E-43)
            r12 = 18
            if (r6 != r12) goto L_0x013b
            r12 = r8 & 224(0xe0, float:3.14E-43)
            if (r12 != r9) goto L_0x013b
            bdv r1 = r14.o
            r1.b()
            bdv r1 = r14.o
            r2 = r7 & 1
            if (r2 != 0) goto L_0x012d
            int[] r2 = defpackage.bdw.g
            r3 = r8 & 31
            r2 = r2[r3]
            char r2 = (char) r2
            goto L_0x0134
        L_0x012d:
            int[] r2 = defpackage.bdw.h
            r3 = r8 & 31
            r2 = r2[r3]
            char r2 = (char) r2
        L_0x0134:
            r1.a(r2)
            r1 = 1
            goto L_0x0014
        L_0x013b:
            if (r1 != r5) goto L_0x015b
            r5 = r8 & 240(0xf0, float:3.36E-43)
            if (r5 != r9) goto L_0x015b
            bdv r1 = r14.o
            r1.a(r9)
            int r1 = r8 >> 1
            r1 = r1 & 7
            bdv r2 = r14.o
            r3 = r8 & 1
            if (r3 != 0) goto L_0x0152
            r3 = 0
            goto L_0x0154
        L_0x0152:
            r3 = 1
        L_0x0154:
            r2.a(r1, r3)
            r1 = 1
            goto L_0x0014
        L_0x015b:
            r5 = r7 & 240(0xf0, float:3.36E-43)
            if (r5 != r11) goto L_0x01c0
            r5 = r8 & 192(0xc0, float:2.69E-43)
            r12 = 64
            if (r5 != r12) goto L_0x01c0
            int[] r1 = defpackage.bdw.c
            r2 = r7 & 7
            r1 = r1[r2]
            r2 = r8 & 32
            if (r2 != 0) goto L_0x0171
            goto L_0x0174
        L_0x0171:
            int r1 = r1 + 1
        L_0x0174:
            bdv r2 = r14.o
            int r3 = r2.d
            if (r1 == r3) goto L_0x0199
            int r3 = r14.r
            if (r3 != r0) goto L_0x017f
            goto L_0x0195
        L_0x017f:
            boolean r2 = r2.a()
            if (r2 != 0) goto L_0x0195
            bdv r2 = new bdv
            int r3 = r14.r
            int r4 = r14.s
            r2.<init>(r3, r4)
            r14.o = r2
            java.util.ArrayList r3 = r14.n
            r3.add(r2)
        L_0x0195:
            bdv r2 = r14.o
            r2.d = r1
        L_0x0199:
            r1 = r8 & 16
            r3 = r8 & 1
            int r4 = r8 >> 1
            r4 = r4 & 7
            if (r1 != r11) goto L_0x01a6
            r5 = 8
            goto L_0x01a7
        L_0x01a6:
            r5 = r4
        L_0x01a7:
            if (r3 != 0) goto L_0x01ab
            r3 = 0
            goto L_0x01ad
        L_0x01ab:
            r3 = 1
        L_0x01ad:
            r2.a(r5, r3)
            if (r1 != r11) goto L_0x01be
            bdv r1 = r14.o
            int[] r2 = defpackage.bdw.d
            r2 = r2[r4]
            r1.e = r2
            r1 = 1
            goto L_0x0014
        L_0x01be:
            goto L_0x00ee
        L_0x01c0:
            r5 = 23
            r7 = 33
            if (r1 != r5) goto L_0x01d6
            if (r8 < r7) goto L_0x01d6
            r1 = 35
            if (r8 > r1) goto L_0x01d6
            bdv r1 = r14.o
            int r8 = r8 + -32
            r1.f = r8
            r1 = 1
            goto L_0x0014
        L_0x01d6:
            if (r6 != r3) goto L_0x00ee
            r1 = r8 & 240(0xf0, float:3.36E-43)
            if (r1 != r9) goto L_0x028b
            if (r8 == r9) goto L_0x0283
            r1 = 41
            if (r8 == r1) goto L_0x027b
            switch(r8) {
                case 37: goto L_0x0270;
                case 38: goto L_0x0265;
                case 39: goto L_0x025a;
                default: goto L_0x01e5;
            }
        L_0x01e5:
            int r1 = r14.r
            if (r1 == 0) goto L_0x00ee
            if (r8 == r7) goto L_0x0251
            switch(r8) {
                case 44: goto L_0x023b;
                case 45: goto L_0x0204;
                case 46: goto L_0x01fd;
                case 47: goto L_0x01f0;
                default: goto L_0x01ee;
            }
        L_0x01ee:
            goto L_0x00ee
        L_0x01f0:
            java.util.List r1 = r14.g()
            r14.p = r1
            r14.h()
            r1 = 1
            goto L_0x0014
        L_0x01fd:
            r14.h()
            r1 = 1
            goto L_0x0014
        L_0x0204:
            if (r1 != r0) goto L_0x00ee
            bdv r1 = r14.o
            boolean r1 = r1.a()
            if (r1 != 0) goto L_0x00ee
            bdv r1 = r14.o
            java.util.List r2 = r1.b
            android.text.SpannableString r3 = r1.c()
            r2.add(r3)
            java.lang.StringBuilder r2 = r1.c
            r2.setLength(r15)
            java.util.List r2 = r1.a
            r2.clear()
            int r2 = r1.h
            int r3 = r1.d
            int r2 = java.lang.Math.min(r2, r3)
        L_0x022b:
            java.util.List r3 = r1.b
            int r3 = r3.size()
            if (r3 < r2) goto L_0x0239
            java.util.List r3 = r1.b
            r3.remove(r15)
            goto L_0x022b
        L_0x0239:
            goto L_0x00ee
        L_0x023b:
            java.util.List r1 = java.util.Collections.emptyList()
            r14.p = r1
            int r1 = r14.r
            if (r1 != r0) goto L_0x0246
            goto L_0x024a
        L_0x0246:
            if (r1 == r4) goto L_0x024a
            goto L_0x00ee
        L_0x024a:
            r14.h()
            r1 = 1
            goto L_0x0014
        L_0x0251:
            bdv r1 = r14.o
            r1.b()
            r1 = 1
            goto L_0x0014
        L_0x025a:
            r14.a(r0)
            r14.b(r10)
            r1 = 1
            goto L_0x0014
        L_0x0265:
            r14.a(r0)
            r14.b(r4)
            r1 = 1
            goto L_0x0014
        L_0x0270:
            r14.a(r0)
            r14.b(r2)
            r1 = 1
            goto L_0x0014
        L_0x027b:
            r14.a(r4)
            r1 = 1
            goto L_0x0014
        L_0x0283:
            r14.a(r2)
            r1 = 1
            goto L_0x0014
        L_0x028b:
            goto L_0x00ee
        L_0x028d:
            if (r9 == 0) goto L_0x0014
            r14.h()
            r1 = 1
            goto L_0x0014
        L_0x0296:
            if (r1 == 0) goto L_0x02a6
            int r15 = r14.r
            if (r15 != r0) goto L_0x029d
            goto L_0x02a0
        L_0x029d:
            if (r15 == r4) goto L_0x02a0
            goto L_0x02a6
        L_0x02a0:
            java.util.List r15 = r14.g()
            r14.p = r15
        L_0x02a6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bdw.a(bdq):void");
    }

    public final void c() {
        super.c();
        this.p = null;
        this.q = null;
        a(0);
        b(4);
        h();
        this.t = false;
        this.u = false;
        this.v = 0;
        this.w = 0;
        this.x = 0;
        this.y = true;
    }

    private static char a(byte b) {
        return (char) e[b - 32];
    }

    private final List g() {
        int size = this.n.size();
        ArrayList arrayList = new ArrayList(size);
        int i2 = 2;
        for (int i3 = 0; i3 < size; i3++) {
            bdj b = ((bdv) this.n.get(i3)).b(Integer.MIN_VALUE);
            arrayList.add(b);
            if (b != null) {
                i2 = Math.min(i2, b.i);
            }
        }
        ArrayList arrayList2 = new ArrayList(size);
        for (int i4 = 0; i4 < size; i4++) {
            bdj bdj = (bdj) arrayList.get(i4);
            if (bdj != null) {
                if (bdj.i != i2) {
                    bdj = ((bdv) this.n.get(i4)).b(i2);
                }
                arrayList2.add(bdj);
            }
        }
        return arrayList2;
    }

    private final void h() {
        this.o.a(this.r);
        this.n.clear();
        this.n.add(this.o);
    }

    private final void a(int i2) {
        int i3 = this.r;
        if (i3 != i2) {
            this.r = i2;
            if (i2 == 3) {
                for (int i4 = 0; i4 < this.n.size(); i4++) {
                    ((bdv) this.n.get(i4)).g = 3;
                }
                return;
            }
            h();
            if (i3 == 3 || i2 == 1 || i2 == 0) {
                this.p = Collections.emptyList();
            }
        }
    }

    private final void b(int i2) {
        this.s = i2;
        this.o.h = i2;
    }
}
