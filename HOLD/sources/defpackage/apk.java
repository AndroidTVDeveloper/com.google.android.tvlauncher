package defpackage;

import android.util.SparseArray;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Locale;
import java.util.UUID;

/* renamed from: apk  reason: default package */
/* compiled from: PG */
public final class apk implements aoi {
    public static final byte[] a = blm.c("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");
    public static final UUID b = new UUID(72057594037932032L, -9223371306706625679L);
    private static final byte[] v = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    private static final byte[] w = {32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32};
    private static final byte[] x = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
    private static final byte[] y = {32, 32, 32, 32, 32, 32, 32, 32, 32, 32};
    private final apm A;
    private final boolean B;
    private final bky C;
    private final bky D;
    private final bky E;
    private final bky F;
    private final bky G;
    private final bky H;
    private final bky I;
    private final bky J;
    private final bky K;
    private final bky L;
    private ByteBuffer M;
    private boolean N;
    private long O;
    private long P;
    private boolean Q;
    private long R;
    private int S;
    private int T;
    private int[] U;
    private int V;
    private int W;
    private int X;
    private boolean Y;
    private boolean Z;
    private boolean aa;
    private boolean ab;
    private byte ac;
    private int ad;
    private int ae;
    private int af;
    private boolean ag;
    public final SparseArray c;
    public long d;
    public long e;
    public long f;
    public long g;
    public long h;
    public api i;
    public boolean j;
    public int k;
    public long l;
    public long m;
    public bkq n;
    public bkq o;
    public int p;
    public long q;
    public int r;
    public int s;
    public boolean t;
    public aok u;
    private final apg z;

    public apk() {
        this(0);
    }

    public apk(int i2) {
        ape ape = new ape();
        this.e = -1;
        this.f = -9223372036854775807L;
        this.g = -9223372036854775807L;
        this.h = -9223372036854775807L;
        this.m = -1;
        this.O = -1;
        this.P = -9223372036854775807L;
        this.z = ape;
        ape.d = new aph(this);
        this.B = (i2 ^ 1) == 0 ? false : true;
        this.A = new apm();
        this.c = new SparseArray();
        this.E = new bky(4);
        this.F = new bky(ByteBuffer.allocate(4).putInt(-1).array());
        this.G = new bky(4);
        this.C = new bky(bkw.a);
        this.D = new bky(4);
        this.H = new bky();
        this.I = new bky();
        this.J = new bky(8);
        this.K = new bky();
        this.L = new bky();
    }

    public final void a(api api, long j2) {
        apj apj = api.R;
        if (apj == null) {
            if ("S_TEXT/UTF8".equals(api.b)) {
                a(api, "%02d:%02d:%02d,%03d", 19, 1000, w);
            } else if ("S_TEXT/ASS".equals(api.b)) {
                a(api, "%01d:%02d:%02d:%02d", 21, 10000, y);
            }
            if ((this.s & 268435456) != 0) {
                bky bky = this.L;
                int i2 = bky.c;
                api.V.a(bky, i2);
                this.af += i2;
            }
            api.V.a(j2, this.s, this.af, 0, api.i);
        } else if (apj.b) {
            int i3 = apj.c;
            int i4 = i3 + 1;
            apj.c = i4;
            if (i3 == 0) {
                apj.e = j2;
            }
            if (i4 >= 16) {
                api.V.a(apj.e, apj.f, apj.d, 0, api.i);
                apj.c = 0;
            }
        }
        this.ag = true;
        a();
    }

    private final void a(api api, String str, int i2, long j2, byte[] bArr) {
        byte[] bArr2;
        byte[] bArr3 = this.I.a;
        long j3 = this.R;
        if (j3 != -9223372036854775807L) {
            int i3 = (int) (j3 / 3600000000L);
            long j4 = j3 - (((long) (i3 * 3600)) * 1000000);
            int i4 = (int) (j4 / 60000000);
            long j5 = j4 - (((long) (i4 * 60)) * 1000000);
            int i5 = (int) (j5 / 1000000);
            bArr2 = blm.c(String.format(Locale.US, str, Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf((int) ((j5 - (((long) i5) * 1000000)) / j2))));
        } else {
            bArr2 = bArr;
        }
        System.arraycopy(bArr2, 0, bArr3, i2, bArr.length);
        aov aov = api.V;
        bky bky = this.I;
        aov.a(bky, bky.c);
        this.af += this.I.c;
    }

    private static int[] a(int[] iArr, int i2) {
        if (iArr == null) {
            return new int[i2];
        }
        int length = iArr.length;
        return length < i2 ? new int[Math.max(length + length, i2)] : iArr;
    }

    public final void a(aok aok) {
        this.u = aok;
    }

    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v15, resolved type: int[]} */
    /* JADX WARN: Type inference failed for: r3v2, types: [boolean, int, byte] */
    /* JADX WARN: Type inference failed for: r3v81 */
    /* JADX WARN: Type inference failed for: r3v82 */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0058, code lost:
        if (r5 == 1) goto L_0x00e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x05f6, code lost:
        if (r3 != 7) goto L_0x07f3;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(defpackage.aoj r26, defpackage.aop r27) {
        /*
            r25 = this;
            r0 = r25
            r1 = r26
            r2 = r27
            r3 = 0
            r0.ag = r3
        L_0x0009:
            boolean r4 = r0.ag
            if (r4 != 0) goto L_0x0931
            apg r4 = r0.z
            ape r4 = (defpackage.ape) r4
            apf r5 = r4.d
            defpackage.bks.a(r5)
        L_0x0016:
            java.util.ArrayDeque r5 = r4.b
            boolean r5 = r5.isEmpty()
            r6 = -1
            r8 = 1
            if (r5 != 0) goto L_0x0049
            r5 = r1
            aof r5 = (defpackage.aof) r5
            long r9 = r5.c
            java.util.ArrayDeque r5 = r4.b
            java.lang.Object r5 = r5.peek()
            apd r5 = (defpackage.apd) r5
            long r11 = r5.b
            int r5 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r5 < 0) goto L_0x0049
            apf r5 = r4.d
            java.util.ArrayDeque r4 = r4.b
            java.lang.Object r4 = r4.pop()
            apd r4 = (defpackage.apd) r4
            int r4 = r4.a
            r5.a(r4)
            goto L_0x08f2
        L_0x0049:
            int r5 = r4.e
            r9 = 524531317(0x1f43b675, float:4.144378E-20)
            r10 = 475249515(0x1c53bb6b, float:7.0056276E-22)
            r11 = 8
            r12 = -1
            r13 = 4
            if (r5 == 0) goto L_0x005c
            if (r5 != r8) goto L_0x00f6
            goto L_0x00e8
        L_0x005c:
            apm r5 = r4.c
            long r15 = r5.a(r1, r8, r3, r13)
            r17 = -2
            int r5 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r5 != 0) goto L_0x00a3
            r26.a()
        L_0x006c:
            byte[] r5 = r4.a
            r1.c(r5, r3, r13)
            byte[] r5 = r4.a
            byte r5 = r5[r3]
            int r5 = defpackage.apm.a(r5)
            if (r5 != r12) goto L_0x007e
            goto L_0x009d
        L_0x007e:
            if (r5 > r13) goto L_0x009d
            byte[] r15 = r4.a
            long r13 = defpackage.apm.a(r15, r5, r3)
            int r14 = (int) r13
            r13 = 357149030(0x1549a966, float:4.072526E-26)
            if (r14 != r13) goto L_0x008e
            goto L_0x0098
        L_0x008e:
            if (r14 == r9) goto L_0x0098
            if (r14 == r10) goto L_0x0098
            r13 = 374648427(0x1654ae6b, float:1.718026E-25)
            if (r14 != r13) goto L_0x009d
        L_0x0098:
            r1.a(r5)
            long r13 = (long) r14
            goto L_0x00a4
        L_0x009d:
            r1.a(r8)
            r13 = 4
            goto L_0x006c
        L_0x00a3:
            r13 = r15
        L_0x00a4:
            int r5 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r5 != 0) goto L_0x00e1
            r1 = 0
        L_0x00a9:
            android.util.SparseArray r2 = r0.c
            int r2 = r2.size()
            if (r1 >= r2) goto L_0x00e0
            android.util.SparseArray r2 = r0.c
            java.lang.Object r2 = r2.valueAt(r1)
            api r2 = (defpackage.api) r2
            apj r4 = r2.R
            if (r4 != 0) goto L_0x00be
        L_0x00bd:
            goto L_0x00dd
        L_0x00be:
            boolean r5 = r4.b
            if (r5 == 0) goto L_0x00bd
            int r5 = r4.c
            if (r5 <= 0) goto L_0x00bd
            aov r13 = r2.V
            long r14 = r4.e
            int r5 = r4.f
            int r6 = r4.d
            r18 = 0
            aou r2 = r2.i
            r16 = r5
            r17 = r6
            r19 = r2
            r13.a(r14, r16, r17, r18, r19)
            r4.c = r3
        L_0x00dd:
            int r1 = r1 + 1
            goto L_0x00a9
        L_0x00e0:
            return r12
        L_0x00e1:
            int r5 = (int) r13
            r4.f = r5
            r4.e = r8
        L_0x00e8:
            apm r5 = r4.c
            long r13 = r5.a(r1, r3, r8, r11)
            r4.g = r13
            r5 = 2
            r4.e = r5
        L_0x00f6:
            int r5 = r4.f
            r14 = 3
            switch(r5) {
                case 131: goto L_0x010f;
                case 134: goto L_0x010b;
                case 136: goto L_0x010f;
                case 155: goto L_0x010f;
                case 159: goto L_0x010f;
                case 160: goto L_0x0107;
                case 161: goto L_0x0103;
                case 163: goto L_0x0103;
                case 165: goto L_0x0103;
                case 166: goto L_0x0107;
                case 174: goto L_0x0107;
                case 176: goto L_0x010f;
                case 179: goto L_0x010f;
                case 181: goto L_0x00ff;
                case 183: goto L_0x0107;
                case 186: goto L_0x010f;
                case 187: goto L_0x0107;
                case 215: goto L_0x010f;
                case 224: goto L_0x0107;
                case 225: goto L_0x0107;
                case 231: goto L_0x010f;
                case 238: goto L_0x010f;
                case 241: goto L_0x010f;
                case 251: goto L_0x010f;
                case 16980: goto L_0x010f;
                case 16981: goto L_0x0103;
                case 17026: goto L_0x010b;
                case 17029: goto L_0x010f;
                case 17143: goto L_0x010f;
                case 17545: goto L_0x00ff;
                case 18401: goto L_0x010f;
                case 18402: goto L_0x0103;
                case 18407: goto L_0x0107;
                case 18408: goto L_0x010f;
                case 19899: goto L_0x0107;
                case 20529: goto L_0x010f;
                case 20530: goto L_0x010f;
                case 20532: goto L_0x0107;
                case 20533: goto L_0x0107;
                case 21358: goto L_0x010b;
                case 21419: goto L_0x0103;
                case 21420: goto L_0x010f;
                case 21432: goto L_0x010f;
                case 21680: goto L_0x010f;
                case 21682: goto L_0x010f;
                case 21690: goto L_0x010f;
                case 21930: goto L_0x010f;
                case 21936: goto L_0x0107;
                case 21945: goto L_0x010f;
                case 21946: goto L_0x010f;
                case 21947: goto L_0x010f;
                case 21948: goto L_0x010f;
                case 21949: goto L_0x010f;
                case 21968: goto L_0x0107;
                case 21969: goto L_0x00ff;
                case 21970: goto L_0x00ff;
                case 21971: goto L_0x00ff;
                case 21972: goto L_0x00ff;
                case 21973: goto L_0x00ff;
                case 21974: goto L_0x00ff;
                case 21975: goto L_0x00ff;
                case 21976: goto L_0x00ff;
                case 21977: goto L_0x00ff;
                case 21978: goto L_0x00ff;
                case 21998: goto L_0x010f;
                case 22186: goto L_0x010f;
                case 22203: goto L_0x010f;
                case 25152: goto L_0x0107;
                case 25188: goto L_0x010f;
                case 25506: goto L_0x0103;
                case 28032: goto L_0x0107;
                case 30113: goto L_0x0107;
                case 30320: goto L_0x0107;
                case 30321: goto L_0x010f;
                case 30322: goto L_0x0103;
                case 30323: goto L_0x00ff;
                case 30324: goto L_0x00ff;
                case 30325: goto L_0x00ff;
                case 2274716: goto L_0x010b;
                case 2352003: goto L_0x010f;
                case 2807729: goto L_0x010f;
                case 290298740: goto L_0x0107;
                case 357149030: goto L_0x0107;
                case 374648427: goto L_0x0107;
                case 408125543: goto L_0x0107;
                case 440786851: goto L_0x0107;
                case 475249515: goto L_0x0107;
                case 524531317: goto L_0x0107;
                default: goto L_0x00fd;
            }
        L_0x00fd:
            r15 = 0
            goto L_0x0112
        L_0x00ff:
            r15 = 5
            goto L_0x0112
        L_0x0103:
            r15 = 4
            goto L_0x0112
        L_0x0107:
            r15 = 1
            goto L_0x0112
        L_0x010b:
            r15 = 3
            goto L_0x0112
        L_0x010f:
            r15 = 2
        L_0x0112:
            if (r15 == 0) goto L_0x0922
            if (r15 == r8) goto L_0x082c
            r19 = 8
            r21 = 1
            java.lang.String r13 = " not supported"
            r6 = 2
            if (r15 == r6) goto L_0x0585
            if (r15 == r14) goto L_0x04e2
            r6 = 4
            if (r15 == r6) goto L_0x01d3
            long r6 = r4.g
            r9 = 4
            int r11 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r11 != 0) goto L_0x012e
            goto L_0x0132
        L_0x012e:
            int r9 = (r6 > r19 ? 1 : (r6 == r19 ? 0 : -1))
            if (r9 != 0) goto L_0x01ba
        L_0x0132:
            apf r9 = r4.d
            int r7 = (int) r6
            long r10 = r4.a(r1, r7)
            r6 = 4
            if (r7 != r6) goto L_0x0145
            int r6 = (int) r10
            float r6 = java.lang.Float.intBitsToFloat(r6)
            double r6 = (double) r6
            goto L_0x014b
        L_0x0145:
            double r6 = java.lang.Double.longBitsToDouble(r10)
        L_0x014b:
            aph r9 = (defpackage.aph) r9
            apk r9 = r9.a
            r10 = 181(0xb5, float:2.54E-43)
            if (r5 == r10) goto L_0x01b0
            r10 = 17545(0x4489, float:2.4586E-41)
            if (r5 == r10) goto L_0x01ac
            switch(r5) {
                case 21969: goto L_0x01a6;
                case 21970: goto L_0x01a0;
                case 21971: goto L_0x019a;
                case 21972: goto L_0x0194;
                case 21973: goto L_0x018e;
                case 21974: goto L_0x0188;
                case 21975: goto L_0x0182;
                case 21976: goto L_0x017c;
                case 21977: goto L_0x0176;
                case 21978: goto L_0x0170;
                default: goto L_0x015a;
            }
        L_0x015a:
            switch(r5) {
                case 30323: goto L_0x016a;
                case 30324: goto L_0x0164;
                case 30325: goto L_0x015e;
                default: goto L_0x015d;
            }
        L_0x015d:
            goto L_0x01b5
        L_0x015e:
            api r5 = r9.i
            float r6 = (float) r6
            r5.t = r6
            goto L_0x01b5
        L_0x0164:
            api r5 = r9.i
            float r6 = (float) r6
            r5.s = r6
            goto L_0x01b5
        L_0x016a:
            api r5 = r9.i
            float r6 = (float) r6
            r5.r = r6
            goto L_0x01b5
        L_0x0170:
            api r5 = r9.i
            float r6 = (float) r6
            r5.L = r6
            goto L_0x01b5
        L_0x0176:
            api r5 = r9.i
            float r6 = (float) r6
            r5.K = r6
            goto L_0x01b5
        L_0x017c:
            api r5 = r9.i
            float r6 = (float) r6
            r5.J = r6
            goto L_0x01b5
        L_0x0182:
            api r5 = r9.i
            float r6 = (float) r6
            r5.I = r6
            goto L_0x01b5
        L_0x0188:
            api r5 = r9.i
            float r6 = (float) r6
            r5.H = r6
            goto L_0x01b5
        L_0x018e:
            api r5 = r9.i
            float r6 = (float) r6
            r5.G = r6
            goto L_0x01b5
        L_0x0194:
            api r5 = r9.i
            float r6 = (float) r6
            r5.F = r6
            goto L_0x01b5
        L_0x019a:
            api r5 = r9.i
            float r6 = (float) r6
            r5.E = r6
            goto L_0x01b5
        L_0x01a0:
            api r5 = r9.i
            float r6 = (float) r6
            r5.D = r6
            goto L_0x01b5
        L_0x01a6:
            api r5 = r9.i
            float r6 = (float) r6
            r5.C = r6
            goto L_0x01b5
        L_0x01ac:
            long r5 = (long) r6
            r9.g = r5
            goto L_0x01b5
        L_0x01b0:
            api r5 = r9.i
            int r6 = (int) r6
            r5.O = r6
        L_0x01b5:
            r4.e = r3
            goto L_0x08f2
        L_0x01ba:
            ako r1 = new ako
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = 40
            r2.<init>(r3)
            java.lang.String r3 = "Invalid float size: "
            r2.append(r3)
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x01d3:
            apf r6 = r4.d
            long r12 = r4.g
            int r13 = (int) r12
            aph r6 = (defpackage.aph) r6
            apk r6 = r6.a
            r12 = 161(0xa1, float:2.26E-43)
            r15 = 163(0xa3, float:2.28E-43)
            if (r5 == r12) goto L_0x02a9
            if (r5 == r15) goto L_0x02a9
            r7 = 165(0xa5, float:2.31E-43)
            if (r5 == r7) goto L_0x0273
            r7 = 16981(0x4255, float:2.3795E-41)
            if (r5 == r7) goto L_0x0265
            r7 = 18402(0x47e2, float:2.5787E-41)
            if (r5 == r7) goto L_0x0254
            r7 = 21419(0x53ab, float:3.0014E-41)
            if (r5 == r7) goto L_0x0233
            r7 = 25506(0x63a2, float:3.5742E-41)
            if (r5 == r7) goto L_0x0225
            r7 = 30322(0x7672, float:4.249E-41)
            if (r5 != r7) goto L_0x020c
            api r5 = r6.i
            byte[] r6 = new byte[r13]
            r5.u = r6
            byte[] r5 = r5.u
            r1.b(r5, r3, r13)
            r2 = 0
            goto L_0x04dd
        L_0x020c:
            ako r1 = new ako
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = 26
            r2.<init>(r3)
            java.lang.String r3 = "Unexpected id: "
            r2.append(r3)
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x0225:
            api r5 = r6.i
            byte[] r6 = new byte[r13]
            r5.j = r6
            byte[] r5 = r5.j
            r1.b(r5, r3, r13)
            r2 = 0
            goto L_0x04dd
        L_0x0233:
            bky r5 = r6.G
            byte[] r5 = r5.a
            java.util.Arrays.fill(r5, r3)
            bky r5 = r6.G
            byte[] r5 = r5.a
            r7 = 4
            int r7 = r7 - r13
            r1.b(r5, r7, r13)
            bky r5 = r6.G
            r5.c(r3)
            bky r5 = r6.G
            long r9 = r5.h()
            int r5 = (int) r9
            r6.k = r5
            r2 = 0
            goto L_0x04dd
        L_0x0254:
            byte[] r5 = new byte[r13]
            r1.b(r5, r3, r13)
            api r6 = r6.i
            aou r7 = new aou
            r7.<init>(r8, r5, r3, r3)
            r6.i = r7
            r2 = 0
            goto L_0x04dd
        L_0x0265:
            api r5 = r6.i
            byte[] r6 = new byte[r13]
            r5.h = r6
            byte[] r5 = r5.h
            r1.b(r5, r3, r13)
            r2 = 0
            goto L_0x04dd
        L_0x0273:
            int r5 = r6.p
            r7 = 2
            if (r5 != r7) goto L_0x02a6
            android.util.SparseArray r5 = r6.c
            int r7 = r6.r
            java.lang.Object r5 = r5.get(r7)
            api r5 = (defpackage.api) r5
            int r7 = r6.W
            r9 = 4
            if (r7 != r9) goto L_0x02a0
            java.lang.String r5 = r5.b
            java.lang.String r7 = "V_VP9"
            boolean r5 = r7.equals(r5)
            if (r5 == 0) goto L_0x02a0
            bky r5 = r6.L
            r5.a(r13)
            bky r5 = r6.L
            byte[] r5 = r5.a
            r1.b(r5, r3, r13)
            r2 = 0
            goto L_0x04dd
        L_0x02a0:
            r1.a(r13)
            r2 = 0
            goto L_0x04dd
        L_0x02a6:
            r2 = 0
            goto L_0x04dd
        L_0x02a9:
            int r12 = r6.p
            if (r12 != 0) goto L_0x02ca
            apm r12 = r6.A
            long r9 = r12.a(r1, r3, r8, r11)
            int r10 = (int) r9
            r6.r = r10
            apm r9 = r6.A
            int r9 = r9.a
            r6.V = r9
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6.R = r9
            r6.p = r8
            bky r9 = r6.E
            r9.a()
        L_0x02ca:
            android.util.SparseArray r9 = r6.c
            int r10 = r6.r
            java.lang.Object r9 = r9.get(r10)
            api r9 = (defpackage.api) r9
            if (r9 != 0) goto L_0x02e1
            int r5 = r6.V
            int r13 = r13 - r5
            r1.a(r13)
            r6.p = r3
            r2 = 0
            goto L_0x04dd
        L_0x02e1:
            int r10 = r6.p
            if (r10 != r8) goto L_0x04a9
            r6.a(r1, r14)
            bky r10 = r6.E
            byte[] r10 = r10.a
            r12 = 2
            byte r10 = r10[r12]
            r12 = 6
            r10 = r10 & r12
            int r10 = r10 >> r8
            r12 = 255(0xff, float:3.57E-43)
            if (r10 != 0) goto L_0x0309
            r6.T = r8
            int[] r7 = r6.U
            int[] r7 = a(r7, r8)
            r6.U = r7
            int r10 = r6.V
            int r13 = r13 - r10
            int r13 = r13 + -3
            r7[r3] = r13
            goto L_0x0443
        L_0x0309:
            if (r5 != r15) goto L_0x04a1
            r7 = 4
            r6.a(r1, r7)
            bky r7 = r6.E
            byte[] r7 = r7.a
            byte r7 = r7[r14]
            r7 = r7 & r12
            int r7 = r7 + r8
            r6.T = r7
            int[] r15 = r6.U
            int[] r7 = a(r15, r7)
            r6.U = r7
            r15 = 2
            if (r10 != r15) goto L_0x0332
            int r10 = r6.V
            int r14 = r6.T
            int r13 = r13 - r10
            int r13 = r13 + -4
            int r13 = r13 / r14
            java.util.Arrays.fill(r7, r3, r14, r13)
            goto L_0x0443
        L_0x0332:
            if (r10 != r8) goto L_0x0374
            r15 = 0
            r17 = 4
            r20 = 0
        L_0x0339:
            int r7 = r6.T
            r10 = -1
            int r14 = r7 + -1
            if (r15 < r14) goto L_0x034d
            int[] r7 = r6.U
            int r10 = r6.V
            int r13 = r13 - r10
            int r13 = r13 - r17
            int r13 = r13 - r20
            r7[r14] = r13
            goto L_0x0443
        L_0x034d:
            int[] r10 = r6.U
            r10[r15] = r3
        L_0x0351:
            int r10 = r17 + 1
            r6.a(r1, r10)
            bky r14 = r6.E
            byte[] r14 = r14.a
            int r16 = r10 + -1
            byte r14 = r14[r16]
            r14 = r14 & r12
            int[] r7 = r6.U
            r17 = r7[r15]
            int r17 = r17 + r14
            r7[r15] = r17
            if (r14 == r12) goto L_0x0371
            int r20 = r20 + r17
            int r15 = r15 + 1
            r17 = r10
            goto L_0x0339
        L_0x0371:
            r17 = r10
            goto L_0x0351
        L_0x0374:
            if (r10 != r14) goto L_0x048b
            r10 = 0
            r14 = 0
            r17 = 4
        L_0x037b:
            int r7 = r6.T
            r15 = -1
            int r7 = r7 + r15
            r15 = r7
            if (r10 >= r15) goto L_0x0436
            int[] r15 = r6.U
            r15[r10] = r3
            int r15 = r17 + 1
            r6.a(r1, r15)
            int r16 = r15 + -1
            bky r7 = r6.E
            byte[] r7 = r7.a
            byte r7 = r7[r16]
            if (r7 == 0) goto L_0x042e
            r7 = 0
        L_0x0396:
            if (r7 >= r11) goto L_0x03f4
            r17 = 7
            int r23 = 7 - r7
            int r17 = r8 << r23
            bky r8 = r6.E
            byte[] r8 = r8.a
            byte r8 = r8[r16]
            r8 = r8 & r17
            if (r8 == 0) goto L_0x03e6
            int r15 = r15 + r7
            r6.a(r1, r15)
            int r8 = r16 + 1
            bky r3 = r6.E
            byte[] r3 = r3.a
            byte r3 = r3[r16]
            r3 = r3 & r12
            r16 = r17 ^ -1
            r3 = r3 & r16
            r24 = r13
            long r12 = (long) r3
        L_0x03bc:
            if (r8 >= r15) goto L_0x03d4
            int r3 = r8 + 1
            long r12 = r12 << r11
            bky r11 = r6.E
            byte[] r11 = r11.a
            byte r8 = r11[r8]
            r11 = 255(0xff, float:3.57E-43)
            r8 = r8 & r11
            r11 = r3
            long r2 = (long) r8
            long r12 = r12 | r2
            r2 = r27
            r8 = r11
            r11 = 8
            goto L_0x03bc
        L_0x03d4:
            if (r10 <= 0) goto L_0x03e2
            int r7 = r7 * 7
            r2 = 6
            int r7 = r7 + r2
            long r2 = r21 << r7
            r7 = -1
            long r2 = r2 + r7
            long r2 = r12 - r2
            goto L_0x03e3
        L_0x03e2:
            r2 = r12
        L_0x03e3:
            r17 = r15
            goto L_0x03fa
        L_0x03e6:
            r24 = r13
            int r7 = r7 + 1
            r2 = r27
            r3 = 0
            r8 = 1
            r11 = 8
            r12 = 255(0xff, float:3.57E-43)
            goto L_0x0396
        L_0x03f4:
            r24 = r13
            r17 = r15
            r2 = 0
        L_0x03fa:
            r7 = -2147483648(0xffffffff80000000, double:NaN)
            int r11 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r11 < 0) goto L_0x0426
            r7 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r11 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r11 > 0) goto L_0x0426
            int r3 = (int) r2
            int[] r2 = r6.U
            if (r10 == 0) goto L_0x0413
            int r7 = r10 + -1
            r7 = r2[r7]
            int r3 = r3 + r7
            goto L_0x0414
        L_0x0413:
        L_0x0414:
            r2[r10] = r3
            int r14 = r14 + r3
            int r10 = r10 + 1
            r2 = r27
            r13 = r24
            r3 = 0
            r8 = 1
            r11 = 8
            r12 = 255(0xff, float:3.57E-43)
            goto L_0x037b
        L_0x0426:
            ako r1 = new ako
            java.lang.String r2 = "EBML lacing sample size out of range."
            r1.<init>(r2)
            throw r1
        L_0x042e:
            ako r1 = new ako
            java.lang.String r2 = "No valid varint length mask found"
            r1.<init>(r2)
            throw r1
        L_0x0436:
            r24 = r13
            int[] r2 = r6.U
            int r3 = r6.V
            int r13 = r24 - r3
            int r13 = r13 - r17
            int r13 = r13 - r14
            r2[r15] = r13
        L_0x0443:
            bky r2 = r6.E
            byte[] r2 = r2.a
            r3 = 0
            byte r7 = r2[r3]
            r3 = 1
            byte r2 = r2[r3]
            long r10 = r6.P
            r3 = 8
            int r7 = r7 << r3
            r3 = 255(0xff, float:3.57E-43)
            r2 = r2 & r3
            r2 = r2 | r7
            long r2 = (long) r2
            long r2 = r6.a(r2)
            long r10 = r10 + r2
            r6.q = r10
            bky r2 = r6.E
            byte[] r2 = r2.a
            r3 = 2
            byte r2 = r2[r3]
            r7 = r2 & 8
            int r8 = r9.d
            if (r8 != r3) goto L_0x046d
        L_0x046b:
            r2 = 1
            goto L_0x0478
        L_0x046d:
            r3 = 163(0xa3, float:2.28E-43)
            if (r5 != r3) goto L_0x0477
            r2 = r2 & 128(0x80, float:1.794E-43)
            r3 = 128(0x80, float:1.794E-43)
            if (r2 == r3) goto L_0x046b
        L_0x0477:
            r2 = 0
        L_0x0478:
            r3 = 8
            if (r7 != r3) goto L_0x047f
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x0481
        L_0x047f:
            r3 = 0
        L_0x0481:
            r2 = r2 | r3
            r6.s = r2
            r2 = 2
            r6.p = r2
            r2 = 0
            r6.S = r2
            goto L_0x04a9
        L_0x048b:
            ako r1 = new ako
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = 36
            r2.<init>(r3)
            java.lang.String r3 = "Unexpected lacing value: 2"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x04a1:
            ako r1 = new ako
            java.lang.String r2 = "Lacing only supported in SimpleBlocks."
            r1.<init>(r2)
            throw r1
        L_0x04a9:
            r2 = 163(0xa3, float:2.28E-43)
            if (r5 != r2) goto L_0x04d5
        L_0x04ad:
            int r2 = r6.S
            int r3 = r6.T
            if (r2 >= r3) goto L_0x04d0
            int[] r3 = r6.U
            r2 = r3[r2]
            r6.a(r1, r9, r2)
            long r2 = r6.q
            int r5 = r6.S
            int r7 = r9.e
            int r5 = r5 * r7
            int r5 = r5 / 1000
            long r7 = (long) r5
            long r2 = r2 + r7
            r6.a(r9, r2)
            int r2 = r6.S
            r3 = 1
            int r2 = r2 + r3
            r6.S = r2
            goto L_0x04ad
        L_0x04d0:
            r2 = 0
            r6.p = r2
            goto L_0x04dd
        L_0x04d5:
            r2 = 0
            int[] r3 = r6.U
            r3 = r3[r2]
            r6.a(r1, r9, r3)
        L_0x04dd:
            r4.e = r2
            goto L_0x08f2
        L_0x04e2:
            long r2 = r4.g
            r6 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r8 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r8 > 0) goto L_0x056c
            apf r6 = r4.d
            int r3 = (int) r2
            if (r3 == 0) goto L_0x050b
            byte[] r2 = new byte[r3]
            r7 = 0
            r1.b(r2, r7, r3)
        L_0x04f8:
            if (r3 > 0) goto L_0x04fb
            goto L_0x0504
        L_0x04fb:
            int r7 = r3 + -1
            byte r8 = r2[r7]
            if (r8 != 0) goto L_0x0504
            r3 = r7
            goto L_0x04f8
        L_0x0504:
            java.lang.String r7 = new java.lang.String
            r8 = 0
            r7.<init>(r2, r8, r3)
            goto L_0x0510
        L_0x050b:
            java.lang.String r7 = ""
        L_0x0510:
            aph r6 = (defpackage.aph) r6
            apk r2 = r6.a
            r3 = 134(0x86, float:1.88E-43)
            if (r5 == r3) goto L_0x0562
            r3 = 17026(0x4282, float:2.3859E-41)
            if (r5 == r3) goto L_0x0530
            r3 = 21358(0x536e, float:2.9929E-41)
            if (r5 == r3) goto L_0x052b
            r3 = 2274716(0x22b59c, float:3.187556E-39)
            if (r5 == r3) goto L_0x0526
            goto L_0x0566
        L_0x0526:
            api r2 = r2.i
            r2.U = r7
            goto L_0x0566
        L_0x052b:
            api r2 = r2.i
            r2.a = r7
            goto L_0x0566
        L_0x0530:
            java.lang.String r2 = "webm"
            boolean r2 = r2.equals(r7)
            if (r2 != 0) goto L_0x0566
            java.lang.String r2 = "matroska"
            boolean r2 = r2.equals(r7)
            if (r2 == 0) goto L_0x0542
            goto L_0x0566
        L_0x0542:
            ako r1 = new ako
            int r2 = r7.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r2 = r2 + 22
            r3.<init>(r2)
            java.lang.String r2 = "DocType "
            r3.append(r2)
            r3.append(r7)
            r3.append(r13)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2)
            throw r1
        L_0x0562:
            api r2 = r2.i
            r2.b = r7
        L_0x0566:
            r2 = 0
            r4.e = r2
            goto L_0x08f2
        L_0x056c:
            ako r1 = new ako
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r5 = 41
            r4.<init>(r5)
            java.lang.String r5 = "String element size: "
            r4.append(r5)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r1.<init>(r2)
            throw r1
        L_0x0585:
            long r2 = r4.g
            int r6 = (r2 > r19 ? 1 : (r2 == r19 ? 0 : -1))
            if (r6 > 0) goto L_0x0813
            apf r6 = r4.d
            int r3 = (int) r2
            long r2 = r4.a(r1, r3)
            aph r6 = (defpackage.aph) r6
            apk r6 = r6.a
            r7 = 20529(0x5031, float:2.8767E-41)
            r8 = 55
            if (r5 == r7) goto L_0x07ed
            r7 = 20530(0x5032, float:2.8769E-41)
            if (r5 == r7) goto L_0x07ce
            r7 = 50
            switch(r5) {
                case 131: goto L_0x07c8;
                case 136: goto L_0x07bb;
                case 155: goto L_0x07b4;
                case 159: goto L_0x07ae;
                case 176: goto L_0x07a8;
                case 179: goto L_0x079e;
                case 186: goto L_0x0798;
                case 215: goto L_0x0792;
                case 231: goto L_0x078b;
                case 238: goto L_0x0786;
                case 241: goto L_0x0778;
                case 251: goto L_0x0772;
                case 16980: goto L_0x0750;
                case 17029: goto L_0x0729;
                case 17143: goto L_0x0709;
                case 18401: goto L_0x06e5;
                case 18408: goto L_0x06c3;
                case 21420: goto L_0x06bc;
                case 21432: goto L_0x0693;
                case 21680: goto L_0x068c;
                case 21682: goto L_0x0685;
                case 21690: goto L_0x067e;
                case 21930: goto L_0x0670;
                case 21998: goto L_0x0669;
                case 22186: goto L_0x0663;
                case 22203: goto L_0x065d;
                case 25188: goto L_0x0656;
                case 30321: goto L_0x062e;
                case 2352003: goto L_0x0627;
                case 2807729: goto L_0x0623;
                default: goto L_0x05a8;
            }
        L_0x05a8:
            switch(r5) {
                case 21945: goto L_0x060e;
                case 21946: goto L_0x05e6;
                case 21947: goto L_0x05bb;
                case 21948: goto L_0x05b4;
                case 21949: goto L_0x05ad;
                default: goto L_0x05ab;
            }
        L_0x05ab:
            goto L_0x07f3
        L_0x05ad:
            api r5 = r6.i
            int r3 = (int) r2
            r5.B = r3
            goto L_0x07f3
        L_0x05b4:
            api r5 = r6.i
            int r3 = (int) r2
            r5.A = r3
            goto L_0x07f3
        L_0x05bb:
            api r5 = r6.i
            r6 = 1
            r5.w = r6
            int r3 = (int) r2
            if (r3 == r6) goto L_0x05e0
            r2 = 9
            if (r3 == r2) goto L_0x05db
            r2 = 4
            if (r3 == r2) goto L_0x05d5
            r2 = 5
            if (r3 == r2) goto L_0x05d5
            r2 = 6
            if (r3 == r2) goto L_0x05d5
            r2 = 7
            if (r3 == r2) goto L_0x05d5
            goto L_0x07f3
        L_0x05d5:
            r2 = 2
            r5.x = r2
            goto L_0x07f3
        L_0x05db:
            r2 = 6
            r5.x = r2
            goto L_0x07f3
        L_0x05e0:
            r7 = 1
            r5.x = r7
            goto L_0x07f3
        L_0x05e6:
            r7 = 1
            int r3 = (int) r2
            if (r3 == r7) goto L_0x0608
            r2 = 16
            if (r3 == r2) goto L_0x0601
            r2 = 18
            if (r3 == r2) goto L_0x05fa
            r2 = 6
            if (r3 == r2) goto L_0x0608
            r2 = 7
            if (r3 == r2) goto L_0x0608
            goto L_0x07f3
        L_0x05fa:
            r2 = 7
            api r3 = r6.i
            r3.y = r2
            goto L_0x07f3
        L_0x0601:
            api r2 = r6.i
            r3 = 6
            r2.y = r3
            goto L_0x07f3
        L_0x0608:
            api r2 = r6.i
            r2.y = r14
            goto L_0x07f3
        L_0x060e:
            int r3 = (int) r2
            r2 = 1
            r5 = 2
            if (r3 == r2) goto L_0x061d
            if (r3 == r5) goto L_0x0617
            goto L_0x07f3
        L_0x0617:
            api r3 = r6.i
            r3.z = r2
            goto L_0x07f3
        L_0x061d:
            api r2 = r6.i
            r2.z = r5
            goto L_0x07f3
        L_0x0623:
            r6.f = r2
            goto L_0x07f3
        L_0x0627:
            api r5 = r6.i
            int r3 = (int) r2
            r5.e = r3
            goto L_0x07f3
        L_0x062e:
            int r3 = (int) r2
            if (r3 == 0) goto L_0x064f
            r2 = 1
            if (r3 == r2) goto L_0x0648
            r2 = 2
            if (r3 == r2) goto L_0x0641
            if (r3 == r14) goto L_0x063b
            goto L_0x07f3
        L_0x063b:
            api r2 = r6.i
            r2.q = r14
            goto L_0x07f3
        L_0x0641:
            api r2 = r6.i
            r3 = 2
            r2.q = r3
            goto L_0x07f3
        L_0x0648:
            api r2 = r6.i
            r3 = 1
            r2.q = r3
            goto L_0x07f3
        L_0x064f:
            api r2 = r6.i
            r3 = 0
            r2.q = r3
            goto L_0x07f3
        L_0x0656:
            api r5 = r6.i
            int r3 = (int) r2
            r5.N = r3
            goto L_0x07f3
        L_0x065d:
            api r5 = r6.i
            r5.Q = r2
            goto L_0x07f3
        L_0x0663:
            api r5 = r6.i
            r5.P = r2
            goto L_0x07f3
        L_0x0669:
            api r5 = r6.i
            int r3 = (int) r2
            r5.f = r3
            goto L_0x07f3
        L_0x0670:
            api r5 = r6.i
            int r6 = (r2 > r21 ? 1 : (r2 == r21 ? 0 : -1))
            if (r6 != 0) goto L_0x0678
            r2 = 1
            goto L_0x067a
        L_0x0678:
            r2 = 0
        L_0x067a:
            r5.S = r2
            goto L_0x07f3
        L_0x067e:
            api r5 = r6.i
            int r3 = (int) r2
            r5.o = r3
            goto L_0x07f3
        L_0x0685:
            api r5 = r6.i
            int r3 = (int) r2
            r5.p = r3
            goto L_0x07f3
        L_0x068c:
            api r5 = r6.i
            int r3 = (int) r2
            r5.n = r3
            goto L_0x07f3
        L_0x0693:
            int r3 = (int) r2
            if (r3 == 0) goto L_0x06b5
            r2 = 1
            if (r3 == r2) goto L_0x06ae
            if (r3 == r14) goto L_0x06a7
            r2 = 15
            if (r3 == r2) goto L_0x06a1
            goto L_0x07f3
        L_0x06a1:
            api r2 = r6.i
            r2.v = r14
            goto L_0x07f3
        L_0x06a7:
            api r2 = r6.i
            r3 = 1
            r2.v = r3
            goto L_0x07f3
        L_0x06ae:
            api r2 = r6.i
            r3 = 2
            r2.v = r3
            goto L_0x07f3
        L_0x06b5:
            api r2 = r6.i
            r3 = 0
            r2.v = r3
            goto L_0x07f3
        L_0x06bc:
            long r7 = r6.e
            long r2 = r2 + r7
            r6.l = r2
            goto L_0x07f3
        L_0x06c3:
            int r5 = (r2 > r21 ? 1 : (r2 == r21 ? 0 : -1))
            if (r5 != 0) goto L_0x06c9
            goto L_0x07f3
        L_0x06c9:
            ako r1 = new ako
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r5 = 56
            r4.<init>(r5)
            java.lang.String r5 = "AESSettingsCipherMode "
            r4.append(r5)
            r4.append(r2)
            r4.append(r13)
            java.lang.String r2 = r4.toString()
            r1.<init>(r2)
            throw r1
        L_0x06e5:
            r5 = 5
            int r7 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x06ed
            goto L_0x07f3
        L_0x06ed:
            ako r1 = new ako
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r5 = 49
            r4.<init>(r5)
            java.lang.String r5 = "ContentEncAlgo "
            r4.append(r5)
            r4.append(r2)
            r4.append(r13)
            java.lang.String r2 = r4.toString()
            r1.<init>(r2)
            throw r1
        L_0x0709:
            int r5 = (r2 > r21 ? 1 : (r2 == r21 ? 0 : -1))
            if (r5 != 0) goto L_0x070f
            goto L_0x07f3
        L_0x070f:
            ako r1 = new ako
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r7)
            java.lang.String r5 = "EBMLReadVersion "
            r4.append(r5)
            r4.append(r2)
            r4.append(r13)
            java.lang.String r2 = r4.toString()
            r1.<init>(r2)
            throw r1
        L_0x0729:
            int r5 = (r2 > r21 ? 1 : (r2 == r21 ? 0 : -1))
            if (r5 < 0) goto L_0x0734
            r5 = 2
            int r7 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r7 > 0) goto L_0x0734
            goto L_0x0756
        L_0x0734:
            ako r1 = new ako
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r5 = 53
            r4.<init>(r5)
            java.lang.String r5 = "DocTypeReadVersion "
            r4.append(r5)
            r4.append(r2)
            r4.append(r13)
            java.lang.String r2 = r4.toString()
            r1.<init>(r2)
            throw r1
        L_0x0750:
            r5 = 3
            int r8 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r8 != 0) goto L_0x0758
        L_0x0756:
            goto L_0x07f3
        L_0x0758:
            ako r1 = new ako
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r7)
            java.lang.String r5 = "ContentCompAlgo "
            r4.append(r5)
            r4.append(r2)
            r4.append(r13)
            java.lang.String r2 = r4.toString()
            r1.<init>(r2)
            throw r1
        L_0x0772:
            r5 = 1
            r6.t = r5
            goto L_0x07f3
        L_0x0778:
            r5 = 1
            boolean r7 = r6.Q
            if (r7 != 0) goto L_0x07f3
            bkq r7 = r6.o
            r7.a(r2)
            r6.Q = r5
            goto L_0x07f3
        L_0x0786:
            int r3 = (int) r2
            r6.W = r3
            goto L_0x07f3
        L_0x078b:
            long r2 = r6.a(r2)
            r6.P = r2
            goto L_0x07f3
        L_0x0792:
            api r5 = r6.i
            int r3 = (int) r2
            r5.c = r3
            goto L_0x07f3
        L_0x0798:
            api r5 = r6.i
            int r3 = (int) r2
            r5.m = r3
            goto L_0x07f3
        L_0x079e:
            bkq r5 = r6.n
            long r2 = r6.a(r2)
            r5.a(r2)
            goto L_0x07f3
        L_0x07a8:
            api r5 = r6.i
            int r3 = (int) r2
            r5.l = r3
            goto L_0x07f3
        L_0x07ae:
            api r5 = r6.i
            int r3 = (int) r2
            r5.M = r3
            goto L_0x07f3
        L_0x07b4:
            long r2 = r6.a(r2)
            r6.R = r2
            goto L_0x07f3
        L_0x07bb:
            api r5 = r6.i
            int r6 = (r2 > r21 ? 1 : (r2 == r21 ? 0 : -1))
            if (r6 != 0) goto L_0x07c3
            r2 = 1
            goto L_0x07c5
        L_0x07c3:
            r2 = 0
        L_0x07c5:
            r5.T = r2
            goto L_0x07f3
        L_0x07c8:
            api r5 = r6.i
            int r3 = (int) r2
            r5.d = r3
            goto L_0x07f3
        L_0x07ce:
            int r5 = (r2 > r21 ? 1 : (r2 == r21 ? 0 : -1))
            if (r5 != 0) goto L_0x07d3
            goto L_0x07f3
        L_0x07d3:
            ako r1 = new ako
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r8)
            java.lang.String r5 = "ContentEncodingScope "
            r4.append(r5)
            r4.append(r2)
            r4.append(r13)
            java.lang.String r2 = r4.toString()
            r1.<init>(r2)
            throw r1
        L_0x07ed:
            r5 = 0
            int r7 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x07f9
        L_0x07f3:
            r2 = 0
            r4.e = r2
            goto L_0x08f2
        L_0x07f9:
            ako r1 = new ako
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r8)
            java.lang.String r5 = "ContentEncodingOrder "
            r4.append(r5)
            r4.append(r2)
            r4.append(r13)
            java.lang.String r2 = r4.toString()
            r1.<init>(r2)
            throw r1
        L_0x0813:
            ako r1 = new ako
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r5 = 42
            r4.<init>(r5)
            java.lang.String r5 = "Invalid integer size: "
            r4.append(r5)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r1.<init>(r2)
            throw r1
        L_0x082c:
            r2 = r1
            aof r2 = (defpackage.aof) r2
            long r2 = r2.c
            long r6 = r4.g
            java.util.ArrayDeque r8 = r4.b
            apd r11 = new apd
            long r6 = r6 + r2
            r11.<init>(r5, r6)
            r8.push(r11)
            apf r5 = r4.d
            int r6 = r4.f
            long r7 = r4.g
            aph r5 = (defpackage.aph) r5
            apk r5 = r5.a
            r11 = 160(0xa0, float:2.24E-43)
            if (r6 == r11) goto L_0x08ec
            r11 = 174(0xae, float:2.44E-43)
            if (r6 == r11) goto L_0x08e3
            r11 = 187(0xbb, float:2.62E-43)
            if (r6 == r11) goto L_0x08de
            r11 = 19899(0x4dbb, float:2.7884E-41)
            if (r6 == r11) goto L_0x08d4
            r11 = 20533(0x5035, float:2.8773E-41)
            if (r6 == r11) goto L_0x08cd
            r11 = 21968(0x55d0, float:3.0784E-41)
            if (r6 == r11) goto L_0x08c6
            r11 = 408125543(0x18538067, float:2.7335937E-24)
            if (r6 == r11) goto L_0x08ab
            if (r6 == r10) goto L_0x089b
            if (r6 == r9) goto L_0x0871
            r2 = 0
            goto L_0x08ef
        L_0x0871:
            boolean r2 = r5.j
            if (r2 != 0) goto L_0x0899
            boolean r2 = r5.B
            if (r2 != 0) goto L_0x087a
            goto L_0x0888
        L_0x087a:
            long r2 = r5.m
            r6 = -1
            int r8 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x0888
            r2 = 1
            r5.N = r2
            r2 = 0
            goto L_0x08ef
        L_0x0888:
            aok r2 = r5.u
            aor r3 = new aor
            long r6 = r5.h
            r3.<init>(r6)
            r2.a(r3)
            r2 = 1
            r5.j = r2
            r2 = 0
            goto L_0x08ef
        L_0x0899:
            r2 = 0
            goto L_0x08ef
        L_0x089b:
            bkq r2 = new bkq
            r2.<init>()
            r5.n = r2
            bkq r2 = new bkq
            r2.<init>()
            r5.o = r2
            r2 = 0
            goto L_0x08ef
        L_0x08ab:
            long r9 = r5.e
            r11 = -1
            int r6 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r6 == 0) goto L_0x08c0
            int r6 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r6 != 0) goto L_0x08b8
            goto L_0x08c0
        L_0x08b8:
            ako r1 = new ako
            java.lang.String r2 = "Multiple Segment elements not supported"
            r1.<init>(r2)
            throw r1
        L_0x08c0:
            r5.e = r2
            r5.d = r7
            r2 = 0
            goto L_0x08ef
        L_0x08c6:
            api r2 = r5.i
            r3 = 1
            r2.w = r3
            r2 = 0
            goto L_0x08ef
        L_0x08cd:
            r3 = 1
            api r2 = r5.i
            r2.g = r3
            r2 = 0
            goto L_0x08ef
        L_0x08d4:
            r2 = -1
            r5.k = r2
            r2 = -1
            r5.l = r2
            r2 = 0
            goto L_0x08ef
        L_0x08de:
            r2 = 0
            r5.Q = r2
            goto L_0x08ef
        L_0x08e3:
            r2 = 0
            api r3 = new api
            r3.<init>(r2)
            r5.i = r3
            goto L_0x08ef
        L_0x08ec:
            r2 = 0
            r5.t = r2
        L_0x08ef:
            r4.e = r2
        L_0x08f2:
            r2 = r1
            aof r2 = (defpackage.aof) r2
            long r2 = r2.c
            boolean r4 = r0.N
            if (r4 != 0) goto L_0x0914
            boolean r2 = r0.j
            if (r2 == 0) goto L_0x090e
            long r2 = r0.O
            r4 = -1
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x090e
            r6 = r27
            r6.a = r2
            r0.O = r4
            goto L_0x091f
        L_0x090e:
            r6 = r27
            r2 = r6
            r3 = 0
            goto L_0x0009
        L_0x0914:
            r6 = r27
            r0.O = r2
            long r1 = r0.m
            r6.a = r1
            r1 = 0
            r0.N = r1
        L_0x091f:
            r1 = 1
            return r1
        L_0x0922:
            r6 = r2
            long r2 = r4.g
            int r3 = (int) r2
            r1.a(r3)
            r2 = 0
            r4.e = r2
            r2 = r6
            r3 = 0
            goto L_0x0016
        L_0x0931:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.apk.a(aoj, aop):int");
    }

    private final void a(aoj aoj, int i2) {
        bky bky = this.E;
        if (bky.c < i2) {
            if (bky.c() < i2) {
                bky bky2 = this.E;
                byte[] bArr = bky2.a;
                int length = bArr.length;
                bky2.a(Arrays.copyOf(bArr, Math.max(length + length, i2)), this.E.c);
            }
            bky bky3 = this.E;
            byte[] bArr2 = bky3.a;
            int i3 = bky3.c;
            aoj.b(bArr2, i3, i2 - i3);
            this.E.b(i2);
        }
    }

    private final int a(aoj aoj, aov aov, int i2) {
        int i3;
        int b2 = this.H.b();
        if (b2 > 0) {
            i3 = Math.min(i2, b2);
            aov.a(this.H, i3);
        } else {
            i3 = aov.a(aoj, i2, false);
        }
        this.X += i3;
        this.af += i3;
        return i3;
    }

    private final void a() {
        this.X = 0;
        this.af = 0;
        this.ae = 0;
        this.Y = false;
        this.Z = false;
        this.ab = false;
        this.ad = 0;
        this.ac = 0;
        this.aa = false;
        this.H.a();
    }

    public final long a(long j2) {
        long j3 = this.f;
        if (j3 != -9223372036854775807L) {
            return blm.b(j2, j3, 1000);
        }
        throw new ako("Can't scale timecode prior to timecodeScale being set.");
    }

    public final void a(long j2, long j3) {
        this.P = -9223372036854775807L;
        this.p = 0;
        ape ape = (ape) this.z;
        ape.e = 0;
        ape.b.clear();
        ape.c.a();
        this.A.a();
        a();
        for (int i2 = 0; i2 < this.c.size(); i2++) {
            apj apj = ((api) this.c.valueAt(i2)).R;
            if (apj != null) {
                apj.b = false;
            }
        }
    }

    public final boolean a(aoj aoj) {
        aoj aoj2 = aoj;
        apl apl = new apl();
        long j2 = ((aof) aoj2).b;
        long j3 = 1024;
        if (j2 != -1 && j2 <= 1024) {
            j3 = j2;
        }
        int i2 = (int) j3;
        aoj2.c(apl.a.a, 0, 4);
        long h2 = apl.a.h();
        apl.b = 4;
        while (true) {
            if (h2 != 440786851) {
                int i3 = apl.b + 1;
                apl.b = i3;
                if (i3 == i2) {
                    break;
                }
                aoj2.c(apl.a.a, 0, 1);
                h2 = ((h2 << 8) & -256) | ((long) (apl.a.a[0] & 255));
            } else {
                long a2 = apl.a(aoj2);
                long j4 = (long) apl.b;
                if (a2 != Long.MIN_VALUE && (j2 == -1 || j4 + a2 < j2)) {
                    while (true) {
                        long j5 = (long) apl.b;
                        long j6 = j4 + a2;
                        if (j5 < j6) {
                            if (apl.a(aoj2) == Long.MIN_VALUE) {
                                break;
                            }
                            long a3 = apl.a(aoj2);
                            if (a3 < 0 || a3 > 2147483647L) {
                                break;
                            } else if (a3 != 0) {
                                int i4 = (int) a3;
                                aoj2.b(i4);
                                apl.b += i4;
                            }
                        } else if (j5 == j6) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    private final void a(aoj aoj, api api, int i2) {
        int i3;
        if ("S_TEXT/UTF8".equals(api.b)) {
            a(aoj, v, i2);
        } else if (!"S_TEXT/ASS".equals(api.b)) {
            aov aov = api.V;
            if (!this.Y) {
                if (api.g) {
                    this.s &= -1073741825;
                    int i4 = 128;
                    if (!this.Z) {
                        aoj.b(this.E.a, 0, 1);
                        this.X++;
                        byte b2 = this.E.a[0];
                        if ((b2 & 128) != 128) {
                            this.ac = b2;
                            this.Z = true;
                        } else {
                            throw new ako("Extension bit is set in signal byte");
                        }
                    }
                    byte b3 = this.ac;
                    if ((b3 & 1) != 0) {
                        byte b4 = b3 & 2;
                        this.s |= 1073741824;
                        if (!this.aa) {
                            aoj.b(this.J.a, 0, 8);
                            this.X += 8;
                            this.aa = true;
                            bky bky = this.E;
                            byte[] bArr = bky.a;
                            if (b4 != 2) {
                                i4 = 0;
                            }
                            bArr[0] = (byte) (i4 | 8);
                            bky.c(0);
                            aov.a(this.E, 1);
                            this.af++;
                            this.J.c(0);
                            aov.a(this.J, 8);
                            this.af += 8;
                        }
                        if (b4 == 2) {
                            if (!this.ab) {
                                aoj.b(this.E.a, 0, 1);
                                this.X++;
                                this.E.c(0);
                                this.ad = this.E.d();
                                this.ab = true;
                            }
                            int i5 = this.ad << 2;
                            this.E.a(i5);
                            aoj.b(this.E.a, 0, i5);
                            this.X += i5;
                            short s2 = (short) ((this.ad / 2) + 1);
                            int i6 = (s2 * 6) + 2;
                            ByteBuffer byteBuffer = this.M;
                            if (byteBuffer == null || byteBuffer.capacity() < i6) {
                                this.M = ByteBuffer.allocate(i6);
                            }
                            this.M.position(0);
                            this.M.putShort(s2);
                            int i7 = 0;
                            int i8 = 0;
                            while (true) {
                                i3 = this.ad;
                                if (i7 >= i3) {
                                    break;
                                }
                                int n2 = this.E.n();
                                if (i7 % 2 == 0) {
                                    this.M.putShort((short) (n2 - i8));
                                } else {
                                    this.M.putInt(n2 - i8);
                                }
                                i7++;
                                i8 = n2;
                            }
                            int i9 = (i2 - this.X) - i8;
                            if (i3 % 2 != 1) {
                                this.M.putShort((short) i9);
                                this.M.putInt(0);
                            } else {
                                this.M.putInt(i9);
                            }
                            this.K.a(this.M.array(), i6);
                            aov.a(this.K, i6);
                            this.af += i6;
                        }
                    }
                } else {
                    byte[] bArr2 = api.h;
                    if (bArr2 != null) {
                        this.H.a(bArr2, bArr2.length);
                    }
                }
                if (api.f > 0) {
                    this.s |= 268435456;
                    this.L.a();
                    this.E.a(4);
                    bky bky2 = this.E;
                    byte[] bArr3 = bky2.a;
                    bArr3[0] = (byte) (i2 >> 24);
                    bArr3[1] = (byte) (i2 >> 16);
                    bArr3[2] = (byte) (i2 >> 8);
                    bArr3[3] = (byte) i2;
                    aov.a(bky2, 4);
                    this.af += 4;
                }
                this.Y = true;
            }
            int i10 = this.H.c + i2;
            if (!"V_MPEG4/ISO/AVC".equals(api.b) && !"V_MPEGH/ISO/HEVC".equals(api.b)) {
                if (api.R != null) {
                    bks.b(this.H.c == 0);
                    apj apj = api.R;
                    int i11 = this.s;
                    if (!apj.b) {
                        aoj.c(apj.a, 0, 10);
                        aoj.a();
                        if (aln.b(apj.a) != 0) {
                            apj.b = true;
                            apj.c = 0;
                        }
                    }
                    if (apj.c == 0) {
                        apj.f = i11;
                        apj.d = 0;
                    }
                    apj.d += i10;
                }
                while (true) {
                    int i12 = this.X;
                    if (i12 >= i10) {
                        break;
                    }
                    a(aoj, aov, i10 - i12);
                }
            } else {
                byte[] bArr4 = this.D.a;
                bArr4[0] = 0;
                bArr4[1] = 0;
                bArr4[2] = 0;
                int i13 = api.W;
                int i14 = 4 - i13;
                while (this.X < i10) {
                    int i15 = this.ae;
                    if (i15 == 0) {
                        int min = Math.min(i13, this.H.b());
                        aoj.b(bArr4, i14 + min, i13 - min);
                        if (min > 0) {
                            this.H.a(bArr4, i14, min);
                        }
                        this.X += i13;
                        this.D.c(0);
                        this.ae = this.D.n();
                        this.C.c(0);
                        aov.a(this.C, 4);
                        this.af += 4;
                    } else {
                        this.ae = i15 - a(aoj, aov, i15);
                    }
                }
            }
            if ("A_VORBIS".equals(api.b)) {
                this.F.c(0);
                aov.a(this.F, 4);
                this.af += 4;
            }
        } else {
            a(aoj, x, i2);
        }
    }

    private final void a(aoj aoj, byte[] bArr, int i2) {
        int length = bArr.length;
        int i3 = length + i2;
        if (this.I.c() < i3) {
            this.I.a = Arrays.copyOf(bArr, i3 + i2);
        } else {
            System.arraycopy(bArr, 0, this.I.a, 0, length);
        }
        aoj.b(this.I.a, length, i2);
        this.I.a(i3);
    }
}
