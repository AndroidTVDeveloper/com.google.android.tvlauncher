package p000;

import android.util.SparseArray;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Locale;
import java.util.UUID;

/* renamed from: apk */
/* compiled from: PG */
public final class apk implements aoi {

    /* renamed from: a */
    public static final byte[] f1638a = blm.m3674c("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");

    /* renamed from: b */
    public static final UUID f1639b = new UUID(72057594037932032L, -9223371306706625679L);

    /* renamed from: v */
    private static final byte[] f1640v = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    /* renamed from: w */
    private static final byte[] f1641w = {32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32};

    /* renamed from: x */
    private static final byte[] f1642x = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};

    /* renamed from: y */
    private static final byte[] f1643y = {32, 32, 32, 32, 32, 32, 32, 32, 32, 32};

    /* renamed from: A */
    private final apm f1644A;

    /* renamed from: B */
    private final boolean f1645B;

    /* renamed from: C */
    private final bky f1646C;

    /* renamed from: D */
    private final bky f1647D;

    /* renamed from: E */
    private final bky f1648E;

    /* renamed from: F */
    private final bky f1649F;

    /* renamed from: G */
    private final bky f1650G;

    /* renamed from: H */
    private final bky f1651H;

    /* renamed from: I */
    private final bky f1652I;

    /* renamed from: J */
    private final bky f1653J;

    /* renamed from: K */
    private final bky f1654K;

    /* renamed from: L */
    private final bky f1655L;

    /* renamed from: M */
    private ByteBuffer f1656M;

    /* renamed from: N */
    private boolean f1657N;

    /* renamed from: O */
    private long f1658O;

    /* renamed from: P */
    private long f1659P;

    /* renamed from: Q */
    private boolean f1660Q;

    /* renamed from: R */
    private long f1661R;

    /* renamed from: S */
    private int f1662S;

    /* renamed from: T */
    private int f1663T;

    /* renamed from: U */
    private int[] f1664U;

    /* renamed from: V */
    private int f1665V;

    /* renamed from: W */
    private int f1666W;

    /* renamed from: X */
    private int f1667X;

    /* renamed from: Y */
    private boolean f1668Y;

    /* renamed from: Z */
    private boolean f1669Z;

    /* renamed from: aa */
    private boolean f1670aa;

    /* renamed from: ab */
    private boolean f1671ab;

    /* renamed from: ac */
    private byte f1672ac;

    /* renamed from: ad */
    private int f1673ad;

    /* renamed from: ae */
    private int f1674ae;

    /* renamed from: af */
    private int f1675af;

    /* renamed from: ag */
    private boolean f1676ag;

    /* renamed from: c */
    public final SparseArray f1677c;

    /* renamed from: d */
    public long f1678d;

    /* renamed from: e */
    public long f1679e;

    /* renamed from: f */
    public long f1680f;

    /* renamed from: g */
    public long f1681g;

    /* renamed from: h */
    public long f1682h;

    /* renamed from: i */
    public C0016api f1683i;

    /* renamed from: j */
    public boolean f1684j;

    /* renamed from: k */
    public int f1685k;

    /* renamed from: l */
    public long f1686l;

    /* renamed from: m */
    public long f1687m;

    /* renamed from: n */
    public bkq f1688n;

    /* renamed from: o */
    public bkq f1689o;

    /* renamed from: p */
    public int f1690p;

    /* renamed from: q */
    public long f1691q;

    /* renamed from: r */
    public int f1692r;

    /* renamed from: s */
    public int f1693s;

    /* renamed from: t */
    public boolean f1694t;

    /* renamed from: u */
    public aok f1695u;

    /* renamed from: z */
    private final apg f1696z;

    public apk() {
        this(0);
    }

    public apk(int i) {
        ape ape = new ape();
        this.f1679e = -1;
        this.f1680f = -9223372036854775807L;
        this.f1681g = -9223372036854775807L;
        this.f1682h = -9223372036854775807L;
        this.f1687m = -1;
        this.f1658O = -1;
        this.f1659P = -9223372036854775807L;
        this.f1696z = ape;
        ape.f1578d = new aph(this);
        this.f1645B = (i ^ 1) == 0 ? false : true;
        this.f1644A = new apm();
        this.f1677c = new SparseArray();
        this.f1648E = new bky(4);
        this.f1649F = new bky(ByteBuffer.allocate(4).putInt(-1).array());
        this.f1650G = new bky(4);
        this.f1646C = new bky(bkw.f4250a);
        this.f1647D = new bky(4);
        this.f1651H = new bky();
        this.f1652I = new bky();
        this.f1653J = new bky(8);
        this.f1654K = new bky();
        this.f1655L = new bky();
    }

    /* renamed from: a */
    public final void mo1231a(C0016api api, long j) {
        apj apj = api.f1600R;
        if (apj == null) {
            if ("S_TEXT/UTF8".equals(api.f1607b)) {
                m1723a(api, "%02d:%02d:%02d,%03d", 19, 1000, f1641w);
            } else if ("S_TEXT/ASS".equals(api.f1607b)) {
                m1723a(api, "%01d:%02d:%02d:%02d", 21, 10000, f1643y);
            }
            if ((this.f1693s & 268435456) != 0) {
                bky bky = this.f1655L;
                int i = bky.f4260c;
                api.f1604V.mo1205a(bky, i);
                this.f1675af += i;
            }
            api.f1604V.mo1203a(j, this.f1693s, this.f1675af, 0, api.f1614i);
        } else if (apj.f1633b) {
            int i2 = apj.f1634c;
            int i3 = i2 + 1;
            apj.f1634c = i3;
            if (i2 == 0) {
                apj.f1636e = j;
            }
            if (i3 >= 16) {
                api.f1604V.mo1203a(apj.f1636e, apj.f1637f, apj.f1635d, 0, api.f1614i);
                apj.f1634c = 0;
            }
        }
        this.f1676ag = true;
        m1719a();
    }

    /* renamed from: a */
    private final void m1723a(C0016api api, String str, int i, long j, byte[] bArr) {
        byte[] bArr2;
        byte[] bArr3 = this.f1652I.f4258a;
        long j2 = this.f1661R;
        if (j2 != -9223372036854775807L) {
            int i2 = (int) (j2 / 3600000000L);
            long j3 = j2 - (((long) (i2 * 3600)) * 1000000);
            int i3 = (int) (j3 / 60000000);
            long j4 = j3 - (((long) (i3 * 60)) * 1000000);
            int i4 = (int) (j4 / 1000000);
            bArr2 = blm.m3674c(String.format(Locale.US, str, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf((int) ((j4 - (((long) i4) * 1000000)) / j))));
        } else {
            bArr2 = bArr;
        }
        System.arraycopy(bArr2, 0, bArr3, i, bArr.length);
        aov aov = api.f1604V;
        bky bky = this.f1652I;
        aov.mo1205a(bky, bky.f4260c);
        this.f1675af += this.f1652I.f4260c;
    }

    /* renamed from: a */
    private static int[] m1724a(int[] iArr, int i) {
        if (iArr == null) {
            return new int[i];
        }
        int length = iArr.length;
        return length < i ? new int[Math.max(length + length, i)] : iArr;
    }

    /* renamed from: a */
    public final void mo1208a(aok aok) {
        this.f1695u = aok;
    }

    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v15, resolved type: int[]} */
    /* JADX WARN: Type inference failed for: r3v2, types: [boolean, byte, int] */
    /* JADX WARN: Type inference failed for: r3v81 */
    /* JADX WARN: Type inference failed for: r3v82 */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0058, code lost:
        if (r5 == 1) goto L_0x00e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x05f6, code lost:
        if (r3 != 7) goto L_0x07f3;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo1206a(p000.aoj r26, p000.aop r27) {
        /*
            r25 = this;
            r0 = r25
            r1 = r26
            r2 = r27
            r3 = 0
            r0.f1676ag = r3
        L_0x0009:
            boolean r4 = r0.f1676ag
            if (r4 != 0) goto L_0x0931
            apg r4 = r0.f1696z
            ape r4 = (p000.ape) r4
            apf r5 = r4.f1578d
            p000.bks.m3507a(r5)
        L_0x0016:
            java.util.ArrayDeque r5 = r4.f1576b
            boolean r5 = r5.isEmpty()
            r6 = -1
            r8 = 1
            if (r5 != 0) goto L_0x0049
            r5 = r1
            aof r5 = (p000.aof) r5
            long r9 = r5.f1490c
            java.util.ArrayDeque r5 = r4.f1576b
            java.lang.Object r5 = r5.peek()
            apd r5 = (p000.apd) r5
            long r11 = r5.f1574b
            int r5 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r5 < 0) goto L_0x0049
            apf r5 = r4.f1578d
            java.util.ArrayDeque r4 = r4.f1576b
            java.lang.Object r4 = r4.pop()
            apd r4 = (p000.apd) r4
            int r4 = r4.f1573a
            r5.mo1229a(r4)
            goto L_0x08f2
        L_0x0049:
            int r5 = r4.f1579e
            r9 = 524531317(0x1f43b675, float:4.144378E-20)
            r10 = 475249515(0x1c53bb6b, float:7.0056276E-22)
            r11 = 8
            r12 = -1
            r13 = 4
            if (r5 == 0) goto L_0x005c
            if (r5 != r8) goto L_0x00f6
            goto L_0x00e8
        L_0x005c:
            apm r5 = r4.f1577c
            long r15 = r5.mo1233a(r1, r8, r3, r13)
            r17 = -2
            int r5 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r5 != 0) goto L_0x00a3
            r26.mo1191a()
        L_0x006c:
            byte[] r5 = r4.f1575a
            r1.mo1199c(r5, r3, r13)
            byte[] r5 = r4.f1575a
            byte r5 = r5[r3]
            int r5 = p000.apm.m1732a(r5)
            if (r5 != r12) goto L_0x007e
            goto L_0x009d
        L_0x007e:
            if (r5 > r13) goto L_0x009d
            byte[] r15 = r4.f1575a
            long r13 = p000.apm.m1733a(r15, r5, r3)
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
            r1.mo1192a(r5)
            long r13 = (long) r14
            goto L_0x00a4
        L_0x009d:
            r1.mo1192a(r8)
            r13 = 4
            goto L_0x006c
        L_0x00a3:
            r13 = r15
        L_0x00a4:
            int r5 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r5 != 0) goto L_0x00e1
            r1 = 0
        L_0x00a9:
            android.util.SparseArray r2 = r0.f1677c
            int r2 = r2.size()
            if (r1 >= r2) goto L_0x00e0
            android.util.SparseArray r2 = r0.f1677c
            java.lang.Object r2 = r2.valueAt(r1)
            api r2 = (p000.C0016api) r2
            apj r4 = r2.f1600R
            if (r4 != 0) goto L_0x00be
        L_0x00bd:
            goto L_0x00dd
        L_0x00be:
            boolean r5 = r4.f1633b
            if (r5 == 0) goto L_0x00bd
            int r5 = r4.f1634c
            if (r5 <= 0) goto L_0x00bd
            aov r13 = r2.f1604V
            long r14 = r4.f1636e
            int r5 = r4.f1637f
            int r6 = r4.f1635d
            r18 = 0
            aou r2 = r2.f1614i
            r16 = r5
            r17 = r6
            r19 = r2
            r13.mo1203a(r14, r16, r17, r18, r19)
            r4.f1634c = r3
        L_0x00dd:
            int r1 = r1 + 1
            goto L_0x00a9
        L_0x00e0:
            return r12
        L_0x00e1:
            int r5 = (int) r13
            r4.f1580f = r5
            r4.f1579e = r8
        L_0x00e8:
            apm r5 = r4.f1577c
            long r13 = r5.mo1233a(r1, r3, r8, r11)
            r4.f1581g = r13
            r5 = 2
            r4.f1579e = r5
        L_0x00f6:
            int r5 = r4.f1580f
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
            long r6 = r4.f1581g
            r9 = 4
            int r11 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r11 != 0) goto L_0x012e
            goto L_0x0132
        L_0x012e:
            int r9 = (r6 > r19 ? 1 : (r6 == r19 ? 0 : -1))
            if (r9 != 0) goto L_0x01ba
        L_0x0132:
            apf r9 = r4.f1578d
            int r7 = (int) r6
            long r10 = r4.mo1228a(r1, r7)
            r6 = 4
            if (r7 != r6) goto L_0x0145
            int r6 = (int) r10
            float r6 = java.lang.Float.intBitsToFloat(r6)
            double r6 = (double) r6
            goto L_0x014b
        L_0x0145:
            double r6 = java.lang.Double.longBitsToDouble(r10)
        L_0x014b:
            aph r9 = (p000.aph) r9
            apk r9 = r9.f1582a
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
            api r5 = r9.f1683i
            float r6 = (float) r6
            r5.f1625t = r6
            goto L_0x01b5
        L_0x0164:
            api r5 = r9.f1683i
            float r6 = (float) r6
            r5.f1624s = r6
            goto L_0x01b5
        L_0x016a:
            api r5 = r9.f1683i
            float r6 = (float) r6
            r5.f1623r = r6
            goto L_0x01b5
        L_0x0170:
            api r5 = r9.f1683i
            float r6 = (float) r6
            r5.f1594L = r6
            goto L_0x01b5
        L_0x0176:
            api r5 = r9.f1683i
            float r6 = (float) r6
            r5.f1593K = r6
            goto L_0x01b5
        L_0x017c:
            api r5 = r9.f1683i
            float r6 = (float) r6
            r5.f1592J = r6
            goto L_0x01b5
        L_0x0182:
            api r5 = r9.f1683i
            float r6 = (float) r6
            r5.f1591I = r6
            goto L_0x01b5
        L_0x0188:
            api r5 = r9.f1683i
            float r6 = (float) r6
            r5.f1590H = r6
            goto L_0x01b5
        L_0x018e:
            api r5 = r9.f1683i
            float r6 = (float) r6
            r5.f1589G = r6
            goto L_0x01b5
        L_0x0194:
            api r5 = r9.f1683i
            float r6 = (float) r6
            r5.f1588F = r6
            goto L_0x01b5
        L_0x019a:
            api r5 = r9.f1683i
            float r6 = (float) r6
            r5.f1587E = r6
            goto L_0x01b5
        L_0x01a0:
            api r5 = r9.f1683i
            float r6 = (float) r6
            r5.f1586D = r6
            goto L_0x01b5
        L_0x01a6:
            api r5 = r9.f1683i
            float r6 = (float) r6
            r5.f1585C = r6
            goto L_0x01b5
        L_0x01ac:
            long r5 = (long) r6
            r9.f1681g = r5
            goto L_0x01b5
        L_0x01b0:
            api r5 = r9.f1683i
            int r6 = (int) r6
            r5.f1597O = r6
        L_0x01b5:
            r4.f1579e = r3
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
            apf r6 = r4.f1578d
            long r12 = r4.f1581g
            int r13 = (int) r12
            aph r6 = (p000.aph) r6
            apk r6 = r6.f1582a
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
            api r5 = r6.f1683i
            byte[] r6 = new byte[r13]
            r5.f1626u = r6
            byte[] r5 = r5.f1626u
            r1.mo1196b(r5, r3, r13)
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
            api r5 = r6.f1683i
            byte[] r6 = new byte[r13]
            r5.f1615j = r6
            byte[] r5 = r5.f1615j
            r1.mo1196b(r5, r3, r13)
            r2 = 0
            goto L_0x04dd
        L_0x0233:
            bky r5 = r6.f1650G
            byte[] r5 = r5.f4258a
            java.util.Arrays.fill(r5, r3)
            bky r5 = r6.f1650G
            byte[] r5 = r5.f4258a
            r7 = 4
            int r7 = r7 - r13
            r1.mo1196b(r5, r7, r13)
            bky r5 = r6.f1650G
            r5.mo2073c(r3)
            bky r5 = r6.f1650G
            long r9 = r5.mo2081h()
            int r5 = (int) r9
            r6.f1685k = r5
            r2 = 0
            goto L_0x04dd
        L_0x0254:
            byte[] r5 = new byte[r13]
            r1.mo1196b(r5, r3, r13)
            api r6 = r6.f1683i
            aou r7 = new aou
            r7.<init>(r8, r5, r3, r3)
            r6.f1614i = r7
            r2 = 0
            goto L_0x04dd
        L_0x0265:
            api r5 = r6.f1683i
            byte[] r6 = new byte[r13]
            r5.f1613h = r6
            byte[] r5 = r5.f1613h
            r1.mo1196b(r5, r3, r13)
            r2 = 0
            goto L_0x04dd
        L_0x0273:
            int r5 = r6.f1690p
            r7 = 2
            if (r5 != r7) goto L_0x02a6
            android.util.SparseArray r5 = r6.f1677c
            int r7 = r6.f1692r
            java.lang.Object r5 = r5.get(r7)
            api r5 = (p000.C0016api) r5
            int r7 = r6.f1666W
            r9 = 4
            if (r7 != r9) goto L_0x02a0
            java.lang.String r5 = r5.f1607b
            java.lang.String r7 = "V_VP9"
            boolean r5 = r7.equals(r5)
            if (r5 == 0) goto L_0x02a0
            bky r5 = r6.f1655L
            r5.mo2065a(r13)
            bky r5 = r6.f1655L
            byte[] r5 = r5.f4258a
            r1.mo1196b(r5, r3, r13)
            r2 = 0
            goto L_0x04dd
        L_0x02a0:
            r1.mo1192a(r13)
            r2 = 0
            goto L_0x04dd
        L_0x02a6:
            r2 = 0
            goto L_0x04dd
        L_0x02a9:
            int r12 = r6.f1690p
            if (r12 != 0) goto L_0x02ca
            apm r12 = r6.f1644A
            long r9 = r12.mo1233a(r1, r3, r8, r11)
            int r10 = (int) r9
            r6.f1692r = r10
            apm r9 = r6.f1644A
            int r9 = r9.f1700a
            r6.f1665V = r9
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6.f1661R = r9
            r6.f1690p = r8
            bky r9 = r6.f1648E
            r9.mo2064a()
        L_0x02ca:
            android.util.SparseArray r9 = r6.f1677c
            int r10 = r6.f1692r
            java.lang.Object r9 = r9.get(r10)
            api r9 = (p000.C0016api) r9
            if (r9 != 0) goto L_0x02e1
            int r5 = r6.f1665V
            int r13 = r13 - r5
            r1.mo1192a(r13)
            r6.f1690p = r3
            r2 = 0
            goto L_0x04dd
        L_0x02e1:
            int r10 = r6.f1690p
            if (r10 != r8) goto L_0x04a9
            r6.m1720a(r1, r14)
            bky r10 = r6.f1648E
            byte[] r10 = r10.f4258a
            r12 = 2
            byte r10 = r10[r12]
            r12 = 6
            r10 = r10 & r12
            int r10 = r10 >> r8
            r12 = 255(0xff, float:3.57E-43)
            if (r10 != 0) goto L_0x0309
            r6.f1663T = r8
            int[] r7 = r6.f1664U
            int[] r7 = m1724a(r7, r8)
            r6.f1664U = r7
            int r10 = r6.f1665V
            int r13 = r13 - r10
            int r13 = r13 + -3
            r7[r3] = r13
            goto L_0x0443
        L_0x0309:
            if (r5 != r15) goto L_0x04a1
            r7 = 4
            r6.m1720a(r1, r7)
            bky r7 = r6.f1648E
            byte[] r7 = r7.f4258a
            byte r7 = r7[r14]
            r7 = r7 & r12
            int r7 = r7 + r8
            r6.f1663T = r7
            int[] r15 = r6.f1664U
            int[] r7 = m1724a(r15, r7)
            r6.f1664U = r7
            r15 = 2
            if (r10 != r15) goto L_0x0332
            int r10 = r6.f1665V
            int r14 = r6.f1663T
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
            int r7 = r6.f1663T
            r10 = -1
            int r14 = r7 + -1
            if (r15 < r14) goto L_0x034d
            int[] r7 = r6.f1664U
            int r10 = r6.f1665V
            int r13 = r13 - r10
            int r13 = r13 - r17
            int r13 = r13 - r20
            r7[r14] = r13
            goto L_0x0443
        L_0x034d:
            int[] r10 = r6.f1664U
            r10[r15] = r3
        L_0x0351:
            int r10 = r17 + 1
            r6.m1720a(r1, r10)
            bky r14 = r6.f1648E
            byte[] r14 = r14.f4258a
            int r16 = r10 + -1
            byte r14 = r14[r16]
            r14 = r14 & r12
            int[] r7 = r6.f1664U
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
            int r7 = r6.f1663T
            r15 = -1
            int r7 = r7 + r15
            r15 = r7
            if (r10 >= r15) goto L_0x0436
            int[] r15 = r6.f1664U
            r15[r10] = r3
            int r15 = r17 + 1
            r6.m1720a(r1, r15)
            int r16 = r15 + -1
            bky r7 = r6.f1648E
            byte[] r7 = r7.f4258a
            byte r7 = r7[r16]
            if (r7 == 0) goto L_0x042e
            r7 = 0
        L_0x0396:
            if (r7 >= r11) goto L_0x03f4
            r17 = 7
            int r23 = 7 - r7
            int r17 = r8 << r23
            bky r8 = r6.f1648E
            byte[] r8 = r8.f4258a
            byte r8 = r8[r16]
            r8 = r8 & r17
            if (r8 == 0) goto L_0x03e6
            int r15 = r15 + r7
            r6.m1720a(r1, r15)
            int r8 = r16 + 1
            bky r3 = r6.f1648E
            byte[] r3 = r3.f4258a
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
            bky r11 = r6.f1648E
            byte[] r11 = r11.f4258a
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
            int[] r2 = r6.f1664U
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
            int[] r2 = r6.f1664U
            int r3 = r6.f1665V
            int r13 = r24 - r3
            int r13 = r13 - r17
            int r13 = r13 - r14
            r2[r15] = r13
        L_0x0443:
            bky r2 = r6.f1648E
            byte[] r2 = r2.f4258a
            r3 = 0
            byte r7 = r2[r3]
            r3 = 1
            byte r2 = r2[r3]
            long r10 = r6.f1659P
            r3 = 8
            int r7 = r7 << r3
            r3 = 255(0xff, float:3.57E-43)
            r2 = r2 & r3
            r2 = r2 | r7
            long r2 = (long) r2
            long r2 = r6.mo1230a(r2)
            long r10 = r10 + r2
            r6.f1691q = r10
            bky r2 = r6.f1648E
            byte[] r2 = r2.f4258a
            r3 = 2
            byte r2 = r2[r3]
            r7 = r2 & 8
            int r8 = r9.f1609d
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
            r6.f1693s = r2
            r2 = 2
            r6.f1690p = r2
            r2 = 0
            r6.f1662S = r2
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
            int r2 = r6.f1662S
            int r3 = r6.f1663T
            if (r2 >= r3) goto L_0x04d0
            int[] r3 = r6.f1664U
            r2 = r3[r2]
            r6.m1721a(r1, r9, r2)
            long r2 = r6.f1691q
            int r5 = r6.f1662S
            int r7 = r9.f1610e
            int r5 = r5 * r7
            int r5 = r5 / 1000
            long r7 = (long) r5
            long r2 = r2 + r7
            r6.mo1231a(r9, r2)
            int r2 = r6.f1662S
            r3 = 1
            int r2 = r2 + r3
            r6.f1662S = r2
            goto L_0x04ad
        L_0x04d0:
            r2 = 0
            r6.f1690p = r2
            goto L_0x04dd
        L_0x04d5:
            r2 = 0
            int[] r3 = r6.f1664U
            r3 = r3[r2]
            r6.m1721a(r1, r9, r3)
        L_0x04dd:
            r4.f1579e = r2
            goto L_0x08f2
        L_0x04e2:
            long r2 = r4.f1581g
            r6 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r8 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r8 > 0) goto L_0x056c
            apf r6 = r4.f1578d
            int r3 = (int) r2
            if (r3 == 0) goto L_0x050b
            byte[] r2 = new byte[r3]
            r7 = 0
            r1.mo1196b(r2, r7, r3)
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
            aph r6 = (p000.aph) r6
            apk r2 = r6.f1582a
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
            api r2 = r2.f1683i
            r2.f1603U = r7
            goto L_0x0566
        L_0x052b:
            api r2 = r2.f1683i
            r2.f1606a = r7
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
            api r2 = r2.f1683i
            r2.f1607b = r7
        L_0x0566:
            r2 = 0
            r4.f1579e = r2
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
            long r2 = r4.f1581g
            int r6 = (r2 > r19 ? 1 : (r2 == r19 ? 0 : -1))
            if (r6 > 0) goto L_0x0813
            apf r6 = r4.f1578d
            int r3 = (int) r2
            long r2 = r4.mo1228a(r1, r3)
            aph r6 = (p000.aph) r6
            apk r6 = r6.f1582a
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
            api r5 = r6.f1683i
            int r3 = (int) r2
            r5.f1584B = r3
            goto L_0x07f3
        L_0x05b4:
            api r5 = r6.f1683i
            int r3 = (int) r2
            r5.f1583A = r3
            goto L_0x07f3
        L_0x05bb:
            api r5 = r6.f1683i
            r6 = 1
            r5.f1628w = r6
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
            r5.f1629x = r2
            goto L_0x07f3
        L_0x05db:
            r2 = 6
            r5.f1629x = r2
            goto L_0x07f3
        L_0x05e0:
            r7 = 1
            r5.f1629x = r7
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
            api r3 = r6.f1683i
            r3.f1630y = r2
            goto L_0x07f3
        L_0x0601:
            api r2 = r6.f1683i
            r3 = 6
            r2.f1630y = r3
            goto L_0x07f3
        L_0x0608:
            api r2 = r6.f1683i
            r2.f1630y = r14
            goto L_0x07f3
        L_0x060e:
            int r3 = (int) r2
            r2 = 1
            r5 = 2
            if (r3 == r2) goto L_0x061d
            if (r3 == r5) goto L_0x0617
            goto L_0x07f3
        L_0x0617:
            api r3 = r6.f1683i
            r3.f1631z = r2
            goto L_0x07f3
        L_0x061d:
            api r2 = r6.f1683i
            r2.f1631z = r5
            goto L_0x07f3
        L_0x0623:
            r6.f1680f = r2
            goto L_0x07f3
        L_0x0627:
            api r5 = r6.f1683i
            int r3 = (int) r2
            r5.f1610e = r3
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
            api r2 = r6.f1683i
            r2.f1622q = r14
            goto L_0x07f3
        L_0x0641:
            api r2 = r6.f1683i
            r3 = 2
            r2.f1622q = r3
            goto L_0x07f3
        L_0x0648:
            api r2 = r6.f1683i
            r3 = 1
            r2.f1622q = r3
            goto L_0x07f3
        L_0x064f:
            api r2 = r6.f1683i
            r3 = 0
            r2.f1622q = r3
            goto L_0x07f3
        L_0x0656:
            api r5 = r6.f1683i
            int r3 = (int) r2
            r5.f1596N = r3
            goto L_0x07f3
        L_0x065d:
            api r5 = r6.f1683i
            r5.f1599Q = r2
            goto L_0x07f3
        L_0x0663:
            api r5 = r6.f1683i
            r5.f1598P = r2
            goto L_0x07f3
        L_0x0669:
            api r5 = r6.f1683i
            int r3 = (int) r2
            r5.f1611f = r3
            goto L_0x07f3
        L_0x0670:
            api r5 = r6.f1683i
            int r6 = (r2 > r21 ? 1 : (r2 == r21 ? 0 : -1))
            if (r6 != 0) goto L_0x0678
            r2 = 1
            goto L_0x067a
        L_0x0678:
            r2 = 0
        L_0x067a:
            r5.f1601S = r2
            goto L_0x07f3
        L_0x067e:
            api r5 = r6.f1683i
            int r3 = (int) r2
            r5.f1620o = r3
            goto L_0x07f3
        L_0x0685:
            api r5 = r6.f1683i
            int r3 = (int) r2
            r5.f1621p = r3
            goto L_0x07f3
        L_0x068c:
            api r5 = r6.f1683i
            int r3 = (int) r2
            r5.f1619n = r3
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
            api r2 = r6.f1683i
            r2.f1627v = r14
            goto L_0x07f3
        L_0x06a7:
            api r2 = r6.f1683i
            r3 = 1
            r2.f1627v = r3
            goto L_0x07f3
        L_0x06ae:
            api r2 = r6.f1683i
            r3 = 2
            r2.f1627v = r3
            goto L_0x07f3
        L_0x06b5:
            api r2 = r6.f1683i
            r3 = 0
            r2.f1627v = r3
            goto L_0x07f3
        L_0x06bc:
            long r7 = r6.f1679e
            long r2 = r2 + r7
            r6.f1686l = r2
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
            r6.f1694t = r5
            goto L_0x07f3
        L_0x0778:
            r5 = 1
            boolean r7 = r6.f1660Q
            if (r7 != 0) goto L_0x07f3
            bkq r7 = r6.f1689o
            r7.mo2047a(r2)
            r6.f1660Q = r5
            goto L_0x07f3
        L_0x0786:
            int r3 = (int) r2
            r6.f1666W = r3
            goto L_0x07f3
        L_0x078b:
            long r2 = r6.mo1230a(r2)
            r6.f1659P = r2
            goto L_0x07f3
        L_0x0792:
            api r5 = r6.f1683i
            int r3 = (int) r2
            r5.f1608c = r3
            goto L_0x07f3
        L_0x0798:
            api r5 = r6.f1683i
            int r3 = (int) r2
            r5.f1618m = r3
            goto L_0x07f3
        L_0x079e:
            bkq r5 = r6.f1688n
            long r2 = r6.mo1230a(r2)
            r5.mo2047a(r2)
            goto L_0x07f3
        L_0x07a8:
            api r5 = r6.f1683i
            int r3 = (int) r2
            r5.f1617l = r3
            goto L_0x07f3
        L_0x07ae:
            api r5 = r6.f1683i
            int r3 = (int) r2
            r5.f1595M = r3
            goto L_0x07f3
        L_0x07b4:
            long r2 = r6.mo1230a(r2)
            r6.f1661R = r2
            goto L_0x07f3
        L_0x07bb:
            api r5 = r6.f1683i
            int r6 = (r2 > r21 ? 1 : (r2 == r21 ? 0 : -1))
            if (r6 != 0) goto L_0x07c3
            r2 = 1
            goto L_0x07c5
        L_0x07c3:
            r2 = 0
        L_0x07c5:
            r5.f1602T = r2
            goto L_0x07f3
        L_0x07c8:
            api r5 = r6.f1683i
            int r3 = (int) r2
            r5.f1609d = r3
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
            r4.f1579e = r2
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
            aof r2 = (p000.aof) r2
            long r2 = r2.f1490c
            long r6 = r4.f1581g
            java.util.ArrayDeque r8 = r4.f1576b
            apd r11 = new apd
            long r6 = r6 + r2
            r11.<init>(r5, r6)
            r8.push(r11)
            apf r5 = r4.f1578d
            int r6 = r4.f1580f
            long r7 = r4.f1581g
            aph r5 = (p000.aph) r5
            apk r5 = r5.f1582a
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
            boolean r2 = r5.f1684j
            if (r2 != 0) goto L_0x0899
            boolean r2 = r5.f1645B
            if (r2 != 0) goto L_0x087a
            goto L_0x0888
        L_0x087a:
            long r2 = r5.f1687m
            r6 = -1
            int r8 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x0888
            r2 = 1
            r5.f1657N = r2
            r2 = 0
            goto L_0x08ef
        L_0x0888:
            aok r2 = r5.f1695u
            aor r3 = new aor
            long r6 = r5.f1682h
            r3.<init>(r6)
            r2.mo1212a(r3)
            r2 = 1
            r5.f1684j = r2
            r2 = 0
            goto L_0x08ef
        L_0x0899:
            r2 = 0
            goto L_0x08ef
        L_0x089b:
            bkq r2 = new bkq
            r2.<init>()
            r5.f1688n = r2
            bkq r2 = new bkq
            r2.<init>()
            r5.f1689o = r2
            r2 = 0
            goto L_0x08ef
        L_0x08ab:
            long r9 = r5.f1679e
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
            r5.f1679e = r2
            r5.f1678d = r7
            r2 = 0
            goto L_0x08ef
        L_0x08c6:
            api r2 = r5.f1683i
            r3 = 1
            r2.f1628w = r3
            r2 = 0
            goto L_0x08ef
        L_0x08cd:
            r3 = 1
            api r2 = r5.f1683i
            r2.f1612g = r3
            r2 = 0
            goto L_0x08ef
        L_0x08d4:
            r2 = -1
            r5.f1685k = r2
            r2 = -1
            r5.f1686l = r2
            r2 = 0
            goto L_0x08ef
        L_0x08de:
            r2 = 0
            r5.f1660Q = r2
            goto L_0x08ef
        L_0x08e3:
            r2 = 0
            api r3 = new api
            r3.<init>(r2)
            r5.f1683i = r3
            goto L_0x08ef
        L_0x08ec:
            r2 = 0
            r5.f1694t = r2
        L_0x08ef:
            r4.f1579e = r2
        L_0x08f2:
            r2 = r1
            aof r2 = (p000.aof) r2
            long r2 = r2.f1490c
            boolean r4 = r0.f1657N
            if (r4 != 0) goto L_0x0914
            boolean r2 = r0.f1684j
            if (r2 == 0) goto L_0x090e
            long r2 = r0.f1658O
            r4 = -1
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x090e
            r6 = r27
            r6.f1514a = r2
            r0.f1658O = r4
            goto L_0x091f
        L_0x090e:
            r6 = r27
            r2 = r6
            r3 = 0
            goto L_0x0009
        L_0x0914:
            r6 = r27
            r0.f1658O = r2
            long r1 = r0.f1687m
            r6.f1514a = r1
            r1 = 0
            r0.f1657N = r1
        L_0x091f:
            r1 = 1
            return r1
        L_0x0922:
            r6 = r2
            long r2 = r4.f1581g
            int r3 = (int) r2
            r1.mo1192a(r3)
            r2 = 0
            r4.f1579e = r2
            r2 = r6
            r3 = 0
            goto L_0x0016
        L_0x0931:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.apk.mo1206a(aoj, aop):int");
    }

    /* renamed from: a */
    private final void m1720a(aoj aoj, int i) {
        bky bky = this.f1648E;
        if (bky.f4260c < i) {
            if (bky.mo2072c() < i) {
                bky bky2 = this.f1648E;
                byte[] bArr = bky2.f4258a;
                int length = bArr.length;
                bky2.mo2068a(Arrays.copyOf(bArr, Math.max(length + length, i)), this.f1648E.f4260c);
            }
            bky bky3 = this.f1648E;
            byte[] bArr2 = bky3.f4258a;
            int i2 = bky3.f4260c;
            aoj.mo1196b(bArr2, i2, i - i2);
            this.f1648E.mo2071b(i);
        }
    }

    /* renamed from: a */
    private final int m1718a(aoj aoj, aov aov, int i) {
        int i2;
        int b = this.f1651H.mo2070b();
        if (b > 0) {
            i2 = Math.min(i, b);
            aov.mo1205a(this.f1651H, i2);
        } else {
            i2 = aov.mo1202a(aoj, i, false);
        }
        this.f1667X += i2;
        this.f1675af += i2;
        return i2;
    }

    /* renamed from: a */
    private final void m1719a() {
        this.f1667X = 0;
        this.f1675af = 0;
        this.f1674ae = 0;
        this.f1668Y = false;
        this.f1669Z = false;
        this.f1671ab = false;
        this.f1673ad = 0;
        this.f1672ac = 0;
        this.f1670aa = false;
        this.f1651H.mo2064a();
    }

    /* renamed from: a */
    public final long mo1230a(long j) {
        long j2 = this.f1680f;
        if (j2 != -9223372036854775807L) {
            return blm.m3663b(j, j2, 1000);
        }
        throw new ako("Can't scale timecode prior to timecodeScale being set.");
    }

    /* renamed from: a */
    public final void mo1207a(long j, long j2) {
        this.f1659P = -9223372036854775807L;
        this.f1690p = 0;
        ape ape = (ape) this.f1696z;
        ape.f1579e = 0;
        ape.f1576b.clear();
        ape.f1577c.mo1234a();
        this.f1644A.mo1234a();
        m1719a();
        for (int i = 0; i < this.f1677c.size(); i++) {
            apj apj = ((C0016api) this.f1677c.valueAt(i)).f1600R;
            if (apj != null) {
                apj.f1633b = false;
            }
        }
    }

    /* renamed from: a */
    public final boolean mo1209a(aoj aoj) {
        aoj aoj2 = aoj;
        apl apl = new apl();
        long j = ((aof) aoj2).f1489b;
        long j2 = 1024;
        if (j != -1 && j <= 1024) {
            j2 = j;
        }
        int i = (int) j2;
        aoj2.mo1199c(apl.f1697a.f4258a, 0, 4);
        long h = apl.f1697a.mo2081h();
        apl.f1698b = 4;
        while (true) {
            if (h != 440786851) {
                int i2 = apl.f1698b + 1;
                apl.f1698b = i2;
                if (i2 == i) {
                    break;
                }
                aoj2.mo1199c(apl.f1697a.f4258a, 0, 1);
                h = ((h << 8) & -256) | ((long) (apl.f1697a.f4258a[0] & 255));
            } else {
                long a = apl.mo1232a(aoj2);
                long j3 = (long) apl.f1698b;
                if (a != Long.MIN_VALUE && (j == -1 || j3 + a < j)) {
                    while (true) {
                        long j4 = (long) apl.f1698b;
                        long j5 = j3 + a;
                        if (j4 < j5) {
                            if (apl.mo1232a(aoj2) == Long.MIN_VALUE) {
                                break;
                            }
                            long a2 = apl.mo1232a(aoj2);
                            if (a2 < 0 || a2 > 2147483647L) {
                                break;
                            } else if (a2 != 0) {
                                int i3 = (int) a2;
                                aoj2.mo1195b(i3);
                                apl.f1698b += i3;
                            }
                        } else if (j4 == j5) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    private final void m1721a(aoj aoj, C0016api api, int i) {
        int i2;
        if ("S_TEXT/UTF8".equals(api.f1607b)) {
            m1722a(aoj, f1640v, i);
        } else if (!"S_TEXT/ASS".equals(api.f1607b)) {
            aov aov = api.f1604V;
            if (!this.f1668Y) {
                if (api.f1612g) {
                    this.f1693s &= -1073741825;
                    int i3 = 128;
                    if (!this.f1669Z) {
                        aoj.mo1196b(this.f1648E.f4258a, 0, 1);
                        this.f1667X++;
                        byte b = this.f1648E.f4258a[0];
                        if ((b & 128) != 128) {
                            this.f1672ac = b;
                            this.f1669Z = true;
                        } else {
                            throw new ako("Extension bit is set in signal byte");
                        }
                    }
                    byte b2 = this.f1672ac;
                    if ((b2 & 1) != 0) {
                        byte b3 = b2 & 2;
                        this.f1693s |= 1073741824;
                        if (!this.f1670aa) {
                            aoj.mo1196b(this.f1653J.f4258a, 0, 8);
                            this.f1667X += 8;
                            this.f1670aa = true;
                            bky bky = this.f1648E;
                            byte[] bArr = bky.f4258a;
                            if (b3 != 2) {
                                i3 = 0;
                            }
                            bArr[0] = (byte) (i3 | 8);
                            bky.mo2073c(0);
                            aov.mo1205a(this.f1648E, 1);
                            this.f1675af++;
                            this.f1653J.mo2073c(0);
                            aov.mo1205a(this.f1653J, 8);
                            this.f1675af += 8;
                        }
                        if (b3 == 2) {
                            if (!this.f1671ab) {
                                aoj.mo1196b(this.f1648E.f4258a, 0, 1);
                                this.f1667X++;
                                this.f1648E.mo2073c(0);
                                this.f1673ad = this.f1648E.mo2074d();
                                this.f1671ab = true;
                            }
                            int i4 = this.f1673ad << 2;
                            this.f1648E.mo2065a(i4);
                            aoj.mo1196b(this.f1648E.f4258a, 0, i4);
                            this.f1667X += i4;
                            short s = (short) ((this.f1673ad / 2) + 1);
                            int i5 = (s * 6) + 2;
                            ByteBuffer byteBuffer = this.f1656M;
                            if (byteBuffer == null || byteBuffer.capacity() < i5) {
                                this.f1656M = ByteBuffer.allocate(i5);
                            }
                            this.f1656M.position(0);
                            this.f1656M.putShort(s);
                            int i6 = 0;
                            int i7 = 0;
                            while (true) {
                                i2 = this.f1673ad;
                                if (i6 >= i2) {
                                    break;
                                }
                                int n = this.f1648E.mo2087n();
                                if (i6 % 2 == 0) {
                                    this.f1656M.putShort((short) (n - i7));
                                } else {
                                    this.f1656M.putInt(n - i7);
                                }
                                i6++;
                                i7 = n;
                            }
                            int i8 = (i - this.f1667X) - i7;
                            if (i2 % 2 != 1) {
                                this.f1656M.putShort((short) i8);
                                this.f1656M.putInt(0);
                            } else {
                                this.f1656M.putInt(i8);
                            }
                            this.f1654K.mo2068a(this.f1656M.array(), i5);
                            aov.mo1205a(this.f1654K, i5);
                            this.f1675af += i5;
                        }
                    }
                } else {
                    byte[] bArr2 = api.f1613h;
                    if (bArr2 != null) {
                        this.f1651H.mo2068a(bArr2, bArr2.length);
                    }
                }
                if (api.f1611f > 0) {
                    this.f1693s |= 268435456;
                    this.f1655L.mo2064a();
                    this.f1648E.mo2065a(4);
                    bky bky2 = this.f1648E;
                    byte[] bArr3 = bky2.f4258a;
                    bArr3[0] = (byte) (i >> 24);
                    bArr3[1] = (byte) (i >> 16);
                    bArr3[2] = (byte) (i >> 8);
                    bArr3[3] = (byte) i;
                    aov.mo1205a(bky2, 4);
                    this.f1675af += 4;
                }
                this.f1668Y = true;
            }
            int i9 = this.f1651H.f4260c + i;
            if (!"V_MPEG4/ISO/AVC".equals(api.f1607b) && !"V_MPEGH/ISO/HEVC".equals(api.f1607b)) {
                if (api.f1600R != null) {
                    bks.m3512b(this.f1651H.f4260c == 0);
                    apj apj = api.f1600R;
                    int i10 = this.f1693s;
                    if (!apj.f1633b) {
                        aoj.mo1199c(apj.f1632a, 0, 10);
                        aoj.mo1191a();
                        if (aln.m1034b(apj.f1632a) != 0) {
                            apj.f1633b = true;
                            apj.f1634c = 0;
                        }
                    }
                    if (apj.f1634c == 0) {
                        apj.f1637f = i10;
                        apj.f1635d = 0;
                    }
                    apj.f1635d += i9;
                }
                while (true) {
                    int i11 = this.f1667X;
                    if (i11 >= i9) {
                        break;
                    }
                    m1718a(aoj, aov, i9 - i11);
                }
            } else {
                byte[] bArr4 = this.f1647D.f4258a;
                bArr4[0] = 0;
                bArr4[1] = 0;
                bArr4[2] = 0;
                int i12 = api.f1605W;
                int i13 = 4 - i12;
                while (this.f1667X < i9) {
                    int i14 = this.f1674ae;
                    if (i14 == 0) {
                        int min = Math.min(i12, this.f1651H.mo2070b());
                        aoj.mo1196b(bArr4, i13 + min, i12 - min);
                        if (min > 0) {
                            this.f1651H.mo2069a(bArr4, i13, min);
                        }
                        this.f1667X += i12;
                        this.f1647D.mo2073c(0);
                        this.f1674ae = this.f1647D.mo2087n();
                        this.f1646C.mo2073c(0);
                        aov.mo1205a(this.f1646C, 4);
                        this.f1675af += 4;
                    } else {
                        this.f1674ae = i14 - m1718a(aoj, aov, i14);
                    }
                }
            }
            if ("A_VORBIS".equals(api.f1607b)) {
                this.f1649F.mo2073c(0);
                aov.mo1205a(this.f1649F, 4);
                this.f1675af += 4;
            }
        } else {
            m1722a(aoj, f1642x, i);
        }
    }

    /* renamed from: a */
    private final void m1722a(aoj aoj, byte[] bArr, int i) {
        int length = bArr.length;
        int i2 = length + i;
        if (this.f1652I.mo2072c() < i2) {
            this.f1652I.f4258a = Arrays.copyOf(bArr, i2 + i);
        } else {
            System.arraycopy(bArr, 0, this.f1652I.f4258a, 0, length);
        }
        aoj.mo1196b(this.f1652I.f4258a, length, i);
        this.f1652I.mo2065a(i2);
    }
}
