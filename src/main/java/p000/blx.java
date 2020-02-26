package p000;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* renamed from: blx */
/* compiled from: PG */
public final class blx extends atg {

    /* renamed from: k */
    private static final int[] f4331k = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};

    /* renamed from: l */
    private static boolean f4332l;

    /* renamed from: m */
    private static boolean f4333m;

    /* renamed from: A */
    private long f4334A;

    /* renamed from: B */
    private long f4335B;

    /* renamed from: C */
    private long f4336C;

    /* renamed from: D */
    private int f4337D;

    /* renamed from: E */
    private int f4338E;

    /* renamed from: F */
    private int f4339F;

    /* renamed from: G */
    private long f4340G;

    /* renamed from: H */
    private int f4341H;

    /* renamed from: I */
    private float f4342I;

    /* renamed from: J */
    private int f4343J;

    /* renamed from: K */
    private int f4344K;

    /* renamed from: L */
    private int f4345L;

    /* renamed from: M */
    private float f4346M;

    /* renamed from: N */
    private int f4347N;

    /* renamed from: O */
    private int f4348O;

    /* renamed from: P */
    private int f4349P;

    /* renamed from: Q */
    private float f4350Q;

    /* renamed from: R */
    private boolean f4351R;

    /* renamed from: S */
    private int f4352S;

    /* renamed from: T */
    private long f4353T;

    /* renamed from: U */
    private long f4354U;

    /* renamed from: V */
    private int f4355V;

    /* renamed from: f */
    public blv f4356f;

    /* renamed from: n */
    private final Context f4357n;

    /* renamed from: o */
    private final bma f4358o = new bma(this.f4357n);

    /* renamed from: p */
    private final bmj f4359p;

    /* renamed from: q */
    private final boolean f4360q;

    /* renamed from: r */
    private final long[] f4361r;

    /* renamed from: s */
    private final long[] f4362s;

    /* renamed from: t */
    private blu f4363t;

    /* renamed from: u */
    private boolean f4364u;

    /* renamed from: v */
    private boolean f4365v;

    /* renamed from: w */
    private Surface f4366w;

    /* renamed from: x */
    private Surface f4367x;

    /* renamed from: y */
    private final int f4368y;

    /* renamed from: z */
    private boolean f4369z;

    /* renamed from: f */
    private static boolean m3705f(long j) {
        return j < -30000;
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public final boolean mo1330z() {
        return this.f4351R;
    }

    public blx(Context context, ati ati, Handler handler, bmk bmk) {
        super(2, ati, 30.0f);
        this.f4357n = context.getApplicationContext();
        this.f4359p = new bmj(handler, bmk);
        this.f4360q = "NVIDIA".equals(blm.f4295c);
        this.f4361r = new long[10];
        this.f4362s = new long[10];
        this.f4354U = -9223372036854775807L;
        this.f4353T = -9223372036854775807L;
        this.f4335B = -9223372036854775807L;
        this.f4343J = -1;
        this.f4344K = -1;
        this.f4346M = -1.0f;
        this.f4342I = -1.0f;
        this.f4368y = 1;
        m3691G();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: atd.a(akh, akh, boolean):boolean
     arg types: [akh, akh, int]
     candidates:
      atd.a(android.media.MediaCodecInfo$VideoCapabilities, int, int):android.graphics.Point
      atd.a(int, int, double):boolean
      atd.a(akh, akh, boolean):boolean */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo674a(atd atd, akh akh, akh akh2) {
        if (!atd.mo1318a(akh, akh2, true)) {
            return 0;
        }
        int i = akh2.f561n;
        blu blu = this.f4363t;
        if (i > blu.f4327a || akh2.f562o > blu.f4328b || m3695a(atd, akh2) > this.f4363t.f4329c) {
            return 0;
        }
        return akh.mo427b(akh2) ? 3 : 2;
    }

    /* renamed from: E */
    private final void m3689E() {
        MediaCodec mediaCodec;
        this.f4369z = false;
        if (blm.f4293a >= 23 && this.f4351R && (mediaCodec = this.f2369g) != null) {
            this.f4356f = new blv(this, mediaCodec);
        }
    }

    /* renamed from: G */
    private final void m3691G() {
        this.f4347N = -1;
        this.f4348O = -1;
        this.f4350Q = -1.0f;
        this.f4349P = -1;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Removed duplicated region for block: B:418:0x0654 A[ADDED_TO_REGION] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final boolean m3702a(java.lang.String r7) {
        /*
            java.lang.String r0 = "OMX.google"
            boolean r7 = r7.startsWith(r0)
            r0 = 0
            if (r7 != 0) goto L_0x0665
            java.lang.Class<blx> r7 = p000.blx.class
            monitor-enter(r7)
            boolean r1 = p000.blx.f4332l     // Catch:{ all -> 0x0662 }
            if (r1 != 0) goto L_0x065e
            int r1 = p000.blm.f4293a     // Catch:{ all -> 0x0662 }
            r2 = 27
            r3 = 1
            if (r1 > r2) goto L_0x0031
            java.lang.String r1 = "dangal"
            java.lang.String r4 = p000.blm.f4294b     // Catch:{ all -> 0x0662 }
            boolean r1 = r1.equals(r4)     // Catch:{ all -> 0x0662 }
            if (r1 != 0) goto L_0x002c
            java.lang.String r1 = "HWEML"
            java.lang.String r4 = p000.blm.f4294b     // Catch:{ all -> 0x0662 }
            boolean r1 = r1.equals(r4)     // Catch:{ all -> 0x0662 }
            if (r1 != 0) goto L_0x002c
            goto L_0x0031
        L_0x002c:
            p000.blx.f4333m = r3     // Catch:{ all -> 0x0662 }
            goto L_0x065b
        L_0x0031:
            int r1 = p000.blm.f4293a     // Catch:{ all -> 0x0662 }
            if (r1 >= r2) goto L_0x065b
            java.lang.String r1 = p000.blm.f4294b     // Catch:{ all -> 0x0662 }
            int r4 = r1.hashCode()     // Catch:{ all -> 0x0662 }
            r5 = 2
            r6 = -1
            switch(r4) {
                case -2144781245: goto L_0x060e;
                case -2144781185: goto L_0x0603;
                case -2144781160: goto L_0x05f8;
                case -2097309513: goto L_0x05ed;
                case -2022874474: goto L_0x05e2;
                case -1978993182: goto L_0x05d7;
                case -1978990237: goto L_0x05cc;
                case -1936688988: goto L_0x05c1;
                case -1936688066: goto L_0x05b6;
                case -1936688065: goto L_0x05ab;
                case -1931988508: goto L_0x059f;
                case -1696512866: goto L_0x0593;
                case -1680025915: goto L_0x0587;
                case -1615810839: goto L_0x057b;
                case -1554255044: goto L_0x056f;
                case -1481772737: goto L_0x0563;
                case -1481772730: goto L_0x0557;
                case -1481772729: goto L_0x054b;
                case -1320080169: goto L_0x053f;
                case -1217592143: goto L_0x0533;
                case -1180384755: goto L_0x0527;
                case -1139198265: goto L_0x051b;
                case -1052835013: goto L_0x050f;
                case -993250464: goto L_0x0504;
                case -993250458: goto L_0x04f9;
                case -965403638: goto L_0x04ed;
                case -958336948: goto L_0x04e1;
                case -879245230: goto L_0x04d5;
                case -842500323: goto L_0x04c9;
                case -821392978: goto L_0x04be;
                case -797483286: goto L_0x04b2;
                case -794946968: goto L_0x04a6;
                case -788334647: goto L_0x049a;
                case -782144577: goto L_0x048e;
                case -575125681: goto L_0x0482;
                case -521118391: goto L_0x0476;
                case -430914369: goto L_0x046a;
                case -290434366: goto L_0x045e;
                case -282781963: goto L_0x0452;
                case -277133239: goto L_0x0446;
                case -173639913: goto L_0x043a;
                case -56598463: goto L_0x042e;
                case 2126: goto L_0x0422;
                case 2564: goto L_0x0416;
                case 2715: goto L_0x040a;
                case 2719: goto L_0x03fe;
                case 3483: goto L_0x03f2;
                case 73405: goto L_0x03e6;
                case 75739: goto L_0x03da;
                case 76779: goto L_0x03ce;
                case 78669: goto L_0x03c2;
                case 79305: goto L_0x03b6;
                case 80618: goto L_0x03aa;
                case 88274: goto L_0x039e;
                case 98846: goto L_0x0392;
                case 98848: goto L_0x0386;
                case 99329: goto L_0x037a;
                case 101481: goto L_0x036e;
                case 1513190: goto L_0x0363;
                case 1514184: goto L_0x0358;
                case 1514185: goto L_0x034d;
                case 2436959: goto L_0x0341;
                case 2463773: goto L_0x0335;
                case 2464648: goto L_0x0329;
                case 2689555: goto L_0x031d;
                case 3154429: goto L_0x0311;
                case 3284551: goto L_0x0305;
                case 3351335: goto L_0x02f9;
                case 3386211: goto L_0x02ed;
                case 41325051: goto L_0x02e1;
                case 55178625: goto L_0x02d5;
                case 61542055: goto L_0x02ca;
                case 65355429: goto L_0x02be;
                case 66214468: goto L_0x02b2;
                case 66214470: goto L_0x02a6;
                case 66214473: goto L_0x029a;
                case 66215429: goto L_0x028e;
                case 66215431: goto L_0x0282;
                case 66215433: goto L_0x0276;
                case 66216390: goto L_0x026a;
                case 76402249: goto L_0x025e;
                case 76404105: goto L_0x0252;
                case 76404911: goto L_0x0246;
                case 80963634: goto L_0x023a;
                case 82882791: goto L_0x022e;
                case 98715550: goto L_0x0222;
                case 101370885: goto L_0x0216;
                case 102844228: goto L_0x020a;
                case 165221241: goto L_0x01ff;
                case 182191441: goto L_0x01f3;
                case 245388979: goto L_0x01e7;
                case 287431619: goto L_0x01db;
                case 307593612: goto L_0x01cf;
                case 308517133: goto L_0x01c3;
                case 316215098: goto L_0x01b7;
                case 316215116: goto L_0x01ab;
                case 316246811: goto L_0x019f;
                case 316246818: goto L_0x0193;
                case 407160593: goto L_0x0187;
                case 507412548: goto L_0x017b;
                case 793982701: goto L_0x016f;
                case 794038622: goto L_0x0163;
                case 794040393: goto L_0x0157;
                case 835649806: goto L_0x014b;
                case 917340916: goto L_0x013f;
                case 958008161: goto L_0x0133;
                case 1060579533: goto L_0x0127;
                case 1150207623: goto L_0x011b;
                case 1176899427: goto L_0x010f;
                case 1280332038: goto L_0x0103;
                case 1306947716: goto L_0x00f7;
                case 1349174697: goto L_0x00eb;
                case 1522194893: goto L_0x00df;
                case 1691543273: goto L_0x00d3;
                case 1709443163: goto L_0x00c7;
                case 1865889110: goto L_0x00bb;
                case 1906253259: goto L_0x00af;
                case 1977196784: goto L_0x00a3;
                case 2006372676: goto L_0x0097;
                case 2029784656: goto L_0x008b;
                case 2030379515: goto L_0x007f;
                case 2033393791: goto L_0x0073;
                case 2047190025: goto L_0x0067;
                case 2047252157: goto L_0x005b;
                case 2048319463: goto L_0x004f;
                case 2048855701: goto L_0x0043;
                default: goto L_0x0040;
            }     // Catch:{ all -> 0x0662 }
        L_0x0040:
            r1 = -1
            goto L_0x0618
        L_0x0043:
            java.lang.String r2 = "HWWAS-H"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0662 }
            if (r1 == 0) goto L_0x0040
            r1 = 55
            goto L_0x0618
        L_0x004f:
            java.lang.String r2 = "HWVNS-H"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0662 }
            if (r1 == 0) goto L_0x0040
            r1 = 54
            goto L_0x0618
        L_0x005b:
            java.lang.String r2 = "ELUGA_Prim"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0662 }
            if (r1 == 0) goto L_0x0040
            r1 = 28
            goto L_0x0618
        L_0x0067:
            java.lang.String r4 = "ELUGA_Note"
            boolean r1 = r1.equals(r4)     // Catch:{ all -> 0x0662 }
            if (r1 == 0) goto L_0x0040
            r1 = 27
            goto L_0x0618
        L_0x0073:
            java.lang.String r2 = "ASUS_X00AD_2"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0662 }
            if (r1 == 0) goto L_0x0040
            r1 = 12
            goto L_0x0618
        L_0x007f:
            java.lang.String r2 = "HWCAM-H"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0662 }
            if (r1 == 0) goto L_0x0040
            r1 = 53
            goto L_0x0618
        L_0x008b:
            java.lang.String r2 = "HWBLN-H"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0662 }
            if (r1 == 0) goto L_0x0040
            r1 = 52
            goto L_0x0618
        L_0x0097:
            java.lang.String r2 = "BRAVIA_ATV3_4K"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0662 }
            if (r1 == 0) goto L_0x0040
            r1 = 16
            goto L_0x0618
        L_0x00a3:
            java.lang.String r2 = "Infinix-X572"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0662 }
            if (r1 == 0) goto L_0x0040
            r1 = 58
            goto L_0x0618
        L_0x00af:
            java.lang.String r2 = "PB2-670M"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0662 }
            if (r1 == 0) goto L_0x0040
            r1 = 87
            goto L_0x0618
        L_0x00bb:
            java.lang.String r2 = "santoni"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0662 }
            if (r1 == 0) goto L_0x0040
            r1 = 103(0x67, float:1.44E-43)
            goto L_0x0618
        L_0x00c7:
            java.lang.String r2 = "iball8735_9806"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0662 }
            if (r1 == 0) goto L_0x0040
            r1 = 57
            goto L_0x0618
        L_0x00d3:
            java.lang.String r2 = "CPH1609"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0662 }
            if (r1 == 0) goto L_0x0040
            r1 = 20
            goto L_0x0618
        L_0x00df:
            java.lang.String r2 = "woods_f"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0662 }
            if (r1 == 0) goto L_0x0040
            r1 = 119(0x77, float:1.67E-43)
            goto L_0x0618
        L_0x00eb:
            java.lang.String r2 = "htc_e56ml_dtul"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0662 }
            if (r1 == 0) goto L_0x0040
            r1 = 50
            goto L_0x0618
        L_0x00f7:
            java.lang.String r2 = "EverStar_S"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0662 }
            if (r1 == 0) goto L_0x0040
            r1 = 30
            goto L_0x0618
        L_0x0103:
            java.lang.String r2 = "hwALE-H"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0662 }
            if (r1 == 0) goto L_0x0040
            r1 = 51
            goto L_0x0618
        L_0x010f:
            java.lang.String r2 = "itel_S41"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0662 }
            if (r1 == 0) goto L_0x0040
            r1 = 60
            goto L_0x0618
        L_0x011b:
            java.lang.String r2 = "LS-5017"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0662 }
            if (r1 == 0) goto L_0x0040
            r1 = 67
            goto L_0x0618
        L_0x0127:
            java.lang.String r2 = "panell_d"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0662 }
            if (r1 == 0) goto L_0x0040
            r1 = 83
            goto L_0x0618
        L_0x0133:
            java.lang.String r2 = "j2xlteins"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0662 }
            if (r1 == 0) goto L_0x0040
            r1 = 61
            goto L_0x0618
        L_0x013f:
            java.lang.String r2 = "A7000plus"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0662 }
            if (r1 == 0) goto L_0x0040
            r1 = 8
            goto L_0x0618
        L_0x014b:
            java.lang.String r2 = "manning"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0662 }
            if (r1 == 0) goto L_0x0040
            r1 = 69
            goto L_0x0618
        L_0x0157:
            java.lang.String r2 = "GIONEE_WBL7519"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0662 }
            if (r1 == 0) goto L_0x0040
            r1 = 48
            goto L_0x0618
        L_0x0163:
            java.lang.String r2 = "GIONEE_WBL7365"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0662 }
            if (r1 == 0) goto L_0x0040
            r1 = 47
            goto L_0x0618
        L_0x016f:
            java.lang.String r2 = "GIONEE_WBL5708"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0662 }
            if (r1 == 0) goto L_0x0040
            r1 = 46
            goto L_0x0618
        L_0x017b:
            java.lang.String r2 = "QM16XE_U"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0662 }
            if (r1 == 0) goto L_0x0040
            r1 = 101(0x65, float:1.42E-43)
            goto L_0x0618
        L_0x0187:
            java.lang.String r2 = "Pixi5-10_4G"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0662 }
            if (r1 == 0) goto L_0x0040
            r1 = 93
            goto L_0x0618
        L_0x0193:
            java.lang.String r2 = "TB3-850M"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0662 }
            if (r1 == 0) goto L_0x0040
            r1 = 111(0x6f, float:1.56E-43)
            goto L_0x0618
        L_0x019f:
            java.lang.String r2 = "TB3-850F"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0662 }
            if (r1 == 0) goto L_0x0040
            r1 = 110(0x6e, float:1.54E-43)
            goto L_0x0618
        L_0x01ab:
            java.lang.String r2 = "TB3-730X"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0662 }
            if (r1 == 0) goto L_0x0040
            r1 = 109(0x6d, float:1.53E-43)
            goto L_0x0618
        L_0x01b7:
            java.lang.String r2 = "TB3-730F"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0662 }
            if (r1 == 0) goto L_0x0040
            r1 = 108(0x6c, float:1.51E-43)
            goto L_0x0618
        L_0x01c3:
            java.lang.String r2 = "A7020a48"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0662 }
            if (r1 == 0) goto L_0x0040
            r1 = 10
            goto L_0x0618
        L_0x01cf:
            java.lang.String r2 = "A7010a48"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0662 }
            if (r1 == 0) goto L_0x0040
            r1 = 9
            goto L_0x0618
        L_0x01db:
            java.lang.String r2 = "griffin"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0662 }
            if (r1 == 0) goto L_0x0040
            r1 = 49
            goto L_0x0618
        L_0x01e7:
            java.lang.String r2 = "marino_f"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0662 }
            if (r1 == 0) goto L_0x0040
            r1 = 70
            goto L_0x0618
        L_0x01f3:
            java.lang.String r2 = "CPY83_I00"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0662 }
            if (r1 == 0) goto L_0x0040
            r1 = 21
            goto L_0x0618
        L_0x01ff:
            java.lang.String r2 = "A2016a40"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0662 }
            if (r1 == 0) goto L_0x0040
            r1 = 6
            goto L_0x0618
        L_0x020a:
            java.lang.String r2 = "le_x6"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0662 }
            if (r1 == 0) goto L_0x0040
            r1 = 66
            goto L_0x0618
        L_0x0216:
            java.lang.String r2 = "l5460"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0662 }
            if (r1 == 0) goto L_0x0040
            r1 = 65
            goto L_0x0618
        L_0x0222:
            java.lang.String r2 = "i9031"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0662 }
            if (r1 == 0) goto L_0x0040
            r1 = 56
            goto L_0x0618
        L_0x022e:
            java.lang.String r2 = "X3_HK"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0662 }
            if (r1 == 0) goto L_0x0040
            r1 = 121(0x79, float:1.7E-43)
            goto L_0x0618
        L_0x023a:
            java.lang.String r2 = "V23GB"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0662 }
            if (r1 == 0) goto L_0x0040
            r1 = 114(0x72, float:1.6E-43)
            goto L_0x0618
        L_0x0246:
            java.lang.String r2 = "Q4310"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0662 }
            if (r1 == 0) goto L_0x0040
            r1 = 99
            goto L_0x0618
        L_0x0252:
            java.lang.String r2 = "Q4260"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0662 }
            if (r1 == 0) goto L_0x0040
            r1 = 97
            goto L_0x0618
        L_0x025e:
            java.lang.String r2 = "PRO7S"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0662 }
            if (r1 == 0) goto L_0x0040
            r1 = 95
            goto L_0x0618
        L_0x026a:
            java.lang.String r2 = "F3311"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0662 }
            if (r1 == 0) goto L_0x0040
            r1 = 37
            goto L_0x0618
        L_0x0276:
            java.lang.String r2 = "F3215"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0662 }
            if (r1 == 0) goto L_0x0040
            r1 = 36
            goto L_0x0618
        L_0x0282:
            java.lang.String r2 = "F3213"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0662 }
            if (r1 == 0) goto L_0x0040
            r1 = 35
            goto L_0x0618
        L_0x028e:
            java.lang.String r2 = "F3211"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0662 }
            if (r1 == 0) goto L_0x0040
            r1 = 34
            goto L_0x0618
        L_0x029a:
            java.lang.String r2 = "F3116"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0662 }
            if (r1 == 0) goto L_0x0040
            r1 = 33
            goto L_0x0618
        L_0x02a6:
            java.lang.String r2 = "F3113"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0662 }
            if (r1 == 0) goto L_0x0040
            r1 = 32
            goto L_0x0618
        L_0x02b2:
            java.lang.String r2 = "F3111"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0662 }
            if (r1 == 0) goto L_0x0040
            r1 = 31
            goto L_0x0618
        L_0x02be:
            java.lang.String r2 = "E5643"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0662 }
            if (r1 == 0) goto L_0x0040
            r1 = 25
            goto L_0x0618
        L_0x02ca:
            java.lang.String r2 = "A1601"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0662 }
            if (r1 == 0) goto L_0x0040
            r1 = 5
            goto L_0x0618
        L_0x02d5:
            java.lang.String r2 = "Aura_Note_2"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0662 }
            if (r1 == 0) goto L_0x0040
            r1 = 13
            goto L_0x0618
        L_0x02e1:
            java.lang.String r2 = "MEIZU_M5"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0662 }
            if (r1 == 0) goto L_0x0040
            r1 = 71
            goto L_0x0618
        L_0x02ed:
            java.lang.String r2 = "p212"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0662 }
            if (r1 == 0) goto L_0x0040
            r1 = 80
            goto L_0x0618
        L_0x02f9:
            java.lang.String r2 = "mido"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0662 }
            if (r1 == 0) goto L_0x0040
            r1 = 73
            goto L_0x0618
        L_0x0305:
            java.lang.String r2 = "kate"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0662 }
            if (r1 == 0) goto L_0x0040
            r1 = 64
            goto L_0x0618
        L_0x0311:
            java.lang.String r2 = "fugu"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0662 }
            if (r1 == 0) goto L_0x0040
            r1 = 39
            goto L_0x0618
        L_0x031d:
            java.lang.String r2 = "XE2X"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0662 }
            if (r1 == 0) goto L_0x0040
            r1 = 122(0x7a, float:1.71E-43)
            goto L_0x0618
        L_0x0329:
            java.lang.String r2 = "Q427"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0662 }
            if (r1 == 0) goto L_0x0040
            r1 = 98
            goto L_0x0618
        L_0x0335:
            java.lang.String r2 = "Q350"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0662 }
            if (r1 == 0) goto L_0x0040
            r1 = 96
            goto L_0x0618
        L_0x0341:
            java.lang.String r2 = "P681"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0662 }
            if (r1 == 0) goto L_0x0040
            r1 = 81
            goto L_0x0618
        L_0x034d:
            java.lang.String r2 = "1714"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0662 }
            if (r1 == 0) goto L_0x0040
            r1 = 2
            goto L_0x0618
        L_0x0358:
            java.lang.String r2 = "1713"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0662 }
            if (r1 == 0) goto L_0x0040
            r1 = 1
            goto L_0x0618
        L_0x0363:
            java.lang.String r2 = "1601"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0662 }
            if (r1 == 0) goto L_0x0040
            r1 = 0
            goto L_0x0618
        L_0x036e:
            java.lang.String r2 = "flo"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0662 }
            if (r1 == 0) goto L_0x0040
            r1 = 38
            goto L_0x0618
        L_0x037a:
            java.lang.String r2 = "deb"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0662 }
            if (r1 == 0) goto L_0x0040
            r1 = 24
            goto L_0x0618
        L_0x0386:
            java.lang.String r2 = "cv3"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0662 }
            if (r1 == 0) goto L_0x0040
            r1 = 23
            goto L_0x0618
        L_0x0392:
            java.lang.String r2 = "cv1"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0662 }
            if (r1 == 0) goto L_0x0040
            r1 = 22
            goto L_0x0618
        L_0x039e:
            java.lang.String r2 = "Z80"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0662 }
            if (r1 == 0) goto L_0x0040
            r1 = 125(0x7d, float:1.75E-43)
            goto L_0x0618
        L_0x03aa:
            java.lang.String r2 = "QX1"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0662 }
            if (r1 == 0) goto L_0x0040
            r1 = 102(0x66, float:1.43E-43)
            goto L_0x0618
        L_0x03b6:
            java.lang.String r2 = "PLE"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0662 }
            if (r1 == 0) goto L_0x0040
            r1 = 94
            goto L_0x0618
        L_0x03c2:
            java.lang.String r2 = "P85"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0662 }
            if (r1 == 0) goto L_0x0040
            r1 = 82
            goto L_0x0618
        L_0x03ce:
            java.lang.String r2 = "MX6"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0662 }
            if (r1 == 0) goto L_0x0040
            r1 = 74
            goto L_0x0618
        L_0x03da:
            java.lang.String r2 = "M5c"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0662 }
            if (r1 == 0) goto L_0x0040
            r1 = 68
            goto L_0x0618
        L_0x03e6:
            java.lang.String r2 = "JGZ"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0662 }
            if (r1 == 0) goto L_0x0040
            r1 = 62
            goto L_0x0618
        L_0x03f2:
            java.lang.String r2 = "mh"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0662 }
            if (r1 == 0) goto L_0x0040
            r1 = 72
            goto L_0x0618
        L_0x03fe:
            java.lang.String r2 = "V5"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0662 }
            if (r1 == 0) goto L_0x0040
            r1 = 115(0x73, float:1.61E-43)
            goto L_0x0618
        L_0x040a:
            java.lang.String r2 = "V1"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0662 }
            if (r1 == 0) goto L_0x0040
            r1 = 113(0x71, float:1.58E-43)
            goto L_0x0618
        L_0x0416:
            java.lang.String r2 = "Q5"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0662 }
            if (r1 == 0) goto L_0x0040
            r1 = 100
            goto L_0x0618
        L_0x0422:
            java.lang.String r2 = "C1"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0662 }
            if (r1 == 0) goto L_0x0040
            r1 = 17
            goto L_0x0618
        L_0x042e:
            java.lang.String r2 = "woods_fn"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0662 }
            if (r1 == 0) goto L_0x0040
            r1 = 120(0x78, float:1.68E-43)
            goto L_0x0618
        L_0x043a:
            java.lang.String r2 = "ELUGA_A3_Pro"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0662 }
            if (r1 == 0) goto L_0x0040
            r1 = 26
            goto L_0x0618
        L_0x0446:
            java.lang.String r2 = "Z12_PRO"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0662 }
            if (r1 == 0) goto L_0x0040
            r1 = 124(0x7c, float:1.74E-43)
            goto L_0x0618
        L_0x0452:
            java.lang.String r2 = "BLACK-1X"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0662 }
            if (r1 == 0) goto L_0x0040
            r1 = 14
            goto L_0x0618
        L_0x045e:
            java.lang.String r2 = "taido_row"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0662 }
            if (r1 == 0) goto L_0x0040
            r1 = 107(0x6b, float:1.5E-43)
            goto L_0x0618
        L_0x046a:
            java.lang.String r2 = "Pixi4-7_3G"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0662 }
            if (r1 == 0) goto L_0x0040
            r1 = 92
            goto L_0x0618
        L_0x0476:
            java.lang.String r2 = "GIONEE_GBL7360"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0662 }
            if (r1 == 0) goto L_0x0040
            r1 = 42
            goto L_0x0618
        L_0x0482:
            java.lang.String r2 = "GiONEE_CBL7513"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0662 }
            if (r1 == 0) goto L_0x0040
            r1 = 40
            goto L_0x0618
        L_0x048e:
            java.lang.String r2 = "OnePlus5T"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0662 }
            if (r1 == 0) goto L_0x0040
            r1 = 79
            goto L_0x0618
        L_0x049a:
            java.lang.String r2 = "whyred"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0662 }
            if (r1 == 0) goto L_0x0040
            r1 = 118(0x76, float:1.65E-43)
            goto L_0x0618
        L_0x04a6:
            java.lang.String r2 = "watson"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0662 }
            if (r1 == 0) goto L_0x0040
            r1 = 117(0x75, float:1.64E-43)
            goto L_0x0618
        L_0x04b2:
            java.lang.String r2 = "SVP-DTV15"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0662 }
            if (r1 == 0) goto L_0x0040
            r1 = 105(0x69, float:1.47E-43)
            goto L_0x0618
        L_0x04be:
            java.lang.String r2 = "A7000-a"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0662 }
            if (r1 == 0) goto L_0x0040
            r1 = 7
            goto L_0x0618
        L_0x04c9:
            java.lang.String r2 = "nicklaus_f"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0662 }
            if (r1 == 0) goto L_0x0040
            r1 = 76
            goto L_0x0618
        L_0x04d5:
            java.lang.String r2 = "tcl_eu"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0662 }
            if (r1 == 0) goto L_0x0040
            r1 = 112(0x70, float:1.57E-43)
            goto L_0x0618
        L_0x04e1:
            java.lang.String r2 = "ELUGA_Ray_X"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0662 }
            if (r1 == 0) goto L_0x0040
            r1 = 29
            goto L_0x0618
        L_0x04ed:
            java.lang.String r2 = "s905x018"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0662 }
            if (r1 == 0) goto L_0x0040
            r1 = 106(0x6a, float:1.49E-43)
            goto L_0x0618
        L_0x04f9:
            java.lang.String r2 = "A10-70L"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0662 }
            if (r1 == 0) goto L_0x0040
            r1 = 4
            goto L_0x0618
        L_0x0504:
            java.lang.String r2 = "A10-70F"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0662 }
            if (r1 == 0) goto L_0x0040
            r1 = 3
            goto L_0x0618
        L_0x050f:
            java.lang.String r2 = "namath"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0662 }
            if (r1 == 0) goto L_0x0040
            r1 = 75
            goto L_0x0618
        L_0x051b:
            java.lang.String r2 = "Slate_Pro"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0662 }
            if (r1 == 0) goto L_0x0040
            r1 = 104(0x68, float:1.46E-43)
            goto L_0x0618
        L_0x0527:
            java.lang.String r2 = "iris60"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0662 }
            if (r1 == 0) goto L_0x0040
            r1 = 59
            goto L_0x0618
        L_0x0533:
            java.lang.String r2 = "BRAVIA_ATV2"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0662 }
            if (r1 == 0) goto L_0x0040
            r1 = 15
            goto L_0x0618
        L_0x053f:
            java.lang.String r2 = "GiONEE_GBL7319"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0662 }
            if (r1 == 0) goto L_0x0040
            r1 = 41
            goto L_0x0618
        L_0x054b:
            java.lang.String r2 = "panell_dt"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0662 }
            if (r1 == 0) goto L_0x0040
            r1 = 86
            goto L_0x0618
        L_0x0557:
            java.lang.String r2 = "panell_ds"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0662 }
            if (r1 == 0) goto L_0x0040
            r1 = 85
            goto L_0x0618
        L_0x0563:
            java.lang.String r2 = "panell_dl"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0662 }
            if (r1 == 0) goto L_0x0040
            r1 = 84
            goto L_0x0618
        L_0x056f:
            java.lang.String r2 = "vernee_M5"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0662 }
            if (r1 == 0) goto L_0x0040
            r1 = 116(0x74, float:1.63E-43)
            goto L_0x0618
        L_0x057b:
            java.lang.String r2 = "Phantom6"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0662 }
            if (r1 == 0) goto L_0x0040
            r1 = 91
            goto L_0x0618
        L_0x0587:
            java.lang.String r2 = "ComioS1"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0662 }
            if (r1 == 0) goto L_0x0040
            r1 = 18
            goto L_0x0618
        L_0x0593:
            java.lang.String r2 = "XT1663"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0662 }
            if (r1 == 0) goto L_0x0040
            r1 = 123(0x7b, float:1.72E-43)
            goto L_0x0618
        L_0x059f:
            java.lang.String r2 = "AquaPowerM"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0662 }
            if (r1 == 0) goto L_0x0040
            r1 = 11
            goto L_0x0618
        L_0x05ab:
            java.lang.String r2 = "PGN611"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0662 }
            if (r1 == 0) goto L_0x0040
            r1 = 90
            goto L_0x0618
        L_0x05b6:
            java.lang.String r2 = "PGN610"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0662 }
            if (r1 == 0) goto L_0x0040
            r1 = 89
            goto L_0x0618
        L_0x05c1:
            java.lang.String r2 = "PGN528"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0662 }
            if (r1 == 0) goto L_0x0040
            r1 = 88
            goto L_0x0618
        L_0x05cc:
            java.lang.String r2 = "NX573J"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0662 }
            if (r1 == 0) goto L_0x0040
            r1 = 78
            goto L_0x0618
        L_0x05d7:
            java.lang.String r2 = "NX541J"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0662 }
            if (r1 == 0) goto L_0x0040
            r1 = 77
            goto L_0x0618
        L_0x05e2:
            java.lang.String r2 = "CP8676_I02"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0662 }
            if (r1 == 0) goto L_0x0040
            r1 = 19
            goto L_0x0618
        L_0x05ed:
            java.lang.String r2 = "K50a40"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0662 }
            if (r1 == 0) goto L_0x0040
            r1 = 63
            goto L_0x0618
        L_0x05f8:
            java.lang.String r2 = "GIONEE_SWW1631"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0662 }
            if (r1 == 0) goto L_0x0040
            r1 = 45
            goto L_0x0618
        L_0x0603:
            java.lang.String r2 = "GIONEE_SWW1627"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0662 }
            if (r1 == 0) goto L_0x0040
            r1 = 44
            goto L_0x0618
        L_0x060e:
            java.lang.String r2 = "GIONEE_SWW1609"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0662 }
            if (r1 == 0) goto L_0x0040
            r1 = 43
        L_0x0618:
            switch(r1) {
                case 0: goto L_0x061c;
                case 1: goto L_0x061c;
                case 2: goto L_0x061c;
                case 3: goto L_0x061c;
                case 4: goto L_0x061c;
                case 5: goto L_0x061c;
                case 6: goto L_0x061c;
                case 7: goto L_0x061c;
                case 8: goto L_0x061c;
                case 9: goto L_0x061c;
                case 10: goto L_0x061c;
                case 11: goto L_0x061c;
                case 12: goto L_0x061c;
                case 13: goto L_0x061c;
                case 14: goto L_0x061c;
                case 15: goto L_0x061c;
                case 16: goto L_0x061c;
                case 17: goto L_0x061c;
                case 18: goto L_0x061c;
                case 19: goto L_0x061c;
                case 20: goto L_0x061c;
                case 21: goto L_0x061c;
                case 22: goto L_0x061c;
                case 23: goto L_0x061c;
                case 24: goto L_0x061c;
                case 25: goto L_0x061c;
                case 26: goto L_0x061c;
                case 27: goto L_0x061c;
                case 28: goto L_0x061c;
                case 29: goto L_0x061c;
                case 30: goto L_0x061c;
                case 31: goto L_0x061c;
                case 32: goto L_0x061c;
                case 33: goto L_0x061c;
                case 34: goto L_0x061c;
                case 35: goto L_0x061c;
                case 36: goto L_0x061c;
                case 37: goto L_0x061c;
                case 38: goto L_0x061c;
                case 39: goto L_0x061c;
                case 40: goto L_0x061c;
                case 41: goto L_0x061c;
                case 42: goto L_0x061c;
                case 43: goto L_0x061c;
                case 44: goto L_0x061c;
                case 45: goto L_0x061c;
                case 46: goto L_0x061c;
                case 47: goto L_0x061c;
                case 48: goto L_0x061c;
                case 49: goto L_0x061c;
                case 50: goto L_0x061c;
                case 51: goto L_0x061c;
                case 52: goto L_0x061c;
                case 53: goto L_0x061c;
                case 54: goto L_0x061c;
                case 55: goto L_0x061c;
                case 56: goto L_0x061c;
                case 57: goto L_0x061c;
                case 58: goto L_0x061c;
                case 59: goto L_0x061c;
                case 60: goto L_0x061c;
                case 61: goto L_0x061c;
                case 62: goto L_0x061c;
                case 63: goto L_0x061c;
                case 64: goto L_0x061c;
                case 65: goto L_0x061c;
                case 66: goto L_0x061c;
                case 67: goto L_0x061c;
                case 68: goto L_0x061c;
                case 69: goto L_0x061c;
                case 70: goto L_0x061c;
                case 71: goto L_0x061c;
                case 72: goto L_0x061c;
                case 73: goto L_0x061c;
                case 74: goto L_0x061c;
                case 75: goto L_0x061c;
                case 76: goto L_0x061c;
                case 77: goto L_0x061c;
                case 78: goto L_0x061c;
                case 79: goto L_0x061c;
                case 80: goto L_0x061c;
                case 81: goto L_0x061c;
                case 82: goto L_0x061c;
                case 83: goto L_0x061c;
                case 84: goto L_0x061c;
                case 85: goto L_0x061c;
                case 86: goto L_0x061c;
                case 87: goto L_0x061c;
                case 88: goto L_0x061c;
                case 89: goto L_0x061c;
                case 90: goto L_0x061c;
                case 91: goto L_0x061c;
                case 92: goto L_0x061c;
                case 93: goto L_0x061c;
                case 94: goto L_0x061c;
                case 95: goto L_0x061c;
                case 96: goto L_0x061c;
                case 97: goto L_0x061c;
                case 98: goto L_0x061c;
                case 99: goto L_0x061c;
                case 100: goto L_0x061c;
                case 101: goto L_0x061c;
                case 102: goto L_0x061c;
                case 103: goto L_0x061c;
                case 104: goto L_0x061c;
                case 105: goto L_0x061c;
                case 106: goto L_0x061c;
                case 107: goto L_0x061c;
                case 108: goto L_0x061c;
                case 109: goto L_0x061c;
                case 110: goto L_0x061c;
                case 111: goto L_0x061c;
                case 112: goto L_0x061c;
                case 113: goto L_0x061c;
                case 114: goto L_0x061c;
                case 115: goto L_0x061c;
                case 116: goto L_0x061c;
                case 117: goto L_0x061c;
                case 118: goto L_0x061c;
                case 119: goto L_0x061c;
                case 120: goto L_0x061c;
                case 121: goto L_0x061c;
                case 122: goto L_0x061c;
                case 123: goto L_0x061c;
                case 124: goto L_0x061c;
                case 125: goto L_0x061c;
                default: goto L_0x061b;
            }     // Catch:{ all -> 0x0662 }
        L_0x061b:
            goto L_0x061f
        L_0x061c:
            p000.blx.f4333m = r3     // Catch:{ all -> 0x0662 }
        L_0x061f:
            java.lang.String r1 = p000.blm.f4296d     // Catch:{ all -> 0x0662 }
            int r2 = r1.hashCode()     // Catch:{ all -> 0x0662 }
            r4 = -594534941(0xffffffffdc901de3, float:-3.2452206E17)
            if (r2 == r4) goto L_0x0649
            r4 = 2006354(0x1e9d52, float:2.811501E-39)
            if (r2 == r4) goto L_0x063f
            r0 = 2006367(0x1e9d5f, float:2.811519E-39)
            if (r2 == r0) goto L_0x0635
        L_0x0634:
            goto L_0x0652
        L_0x0635:
            java.lang.String r0 = "AFTN"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0662 }
            if (r0 == 0) goto L_0x0634
            r6 = 1
            goto L_0x0652
        L_0x063f:
            java.lang.String r2 = "AFTA"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0662 }
            if (r1 == 0) goto L_0x0634
            r6 = 0
            goto L_0x0652
        L_0x0649:
            java.lang.String r0 = "JSN-L21"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0662 }
            if (r0 == 0) goto L_0x0634
            r6 = 2
        L_0x0652:
            if (r6 == 0) goto L_0x0659
            if (r6 == r3) goto L_0x0659
            if (r6 == r5) goto L_0x0659
            goto L_0x065b
        L_0x0659:
            p000.blx.f4333m = r3     // Catch:{ all -> 0x0662 }
        L_0x065b:
            p000.blx.f4332l = r3     // Catch:{ all -> 0x0662 }
        L_0x065e:
            monitor-exit(r7)     // Catch:{ all -> 0x0662 }
            boolean r7 = p000.blx.f4333m
            return r7
        L_0x0662:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0662 }
            throw r0
        L_0x0665:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.blx.m3702a(java.lang.String):boolean");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo679a(atd atd, MediaCodec mediaCodec, akh akh, float f) {
        String str;
        blu blu;
        Pair a;
        int a2;
        Point point;
        int i;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        akh[] akhArr;
        boolean z;
        atd atd2 = atd;
        akh akh2 = akh;
        String str2 = atd2.f2330c;
        akh[] akhArr2 = this.f423d;
        int i2 = akh2.f561n;
        int i3 = akh2.f562o;
        int a3 = m3695a(atd2, akh2);
        int length = akhArr2.length;
        boolean z2 = false;
        if (length != 1) {
            int i4 = i2;
            int i5 = a3;
            int i6 = 0;
            int i7 = i3;
            boolean z3 = false;
            while (i6 < length) {
                akh akh3 = akhArr2[i6];
                if (!atd2.mo1318a(akh2, akh3, z2)) {
                    akhArr = akhArr2;
                } else {
                    int i8 = akh3.f561n;
                    if (i8 != -1) {
                        akhArr = akhArr2;
                        if (akh3.f562o != -1) {
                            z = false;
                            boolean z4 = z | z3;
                            int max = Math.max(i4, i8);
                            i7 = Math.max(i7, akh3.f562o);
                            i5 = Math.max(i5, m3695a(atd2, akh3));
                            i4 = max;
                            z3 = z4;
                        }
                    } else {
                        akhArr = akhArr2;
                    }
                    z = true;
                    boolean z42 = z | z3;
                    int max2 = Math.max(i4, i8);
                    i7 = Math.max(i7, akh3.f562o);
                    i5 = Math.max(i5, m3695a(atd2, akh3));
                    i4 = max2;
                    z3 = z42;
                }
                i6++;
                akhArr2 = akhArr;
                z2 = false;
            }
            if (z3) {
                StringBuilder sb = new StringBuilder(66);
                sb.append("Resolutions unknown. Codec max resolution: ");
                sb.append(i4);
                sb.append("x");
                sb.append(i7);
                Log.w("MediaCodecVideoRenderer", sb.toString());
                int i9 = akh2.f562o;
                int i10 = akh2.f561n;
                int i11 = i9 > i10 ? i9 : i10;
                int i12 = i9 > i10 ? i10 : i9;
                float f2 = ((float) i12) / ((float) i11);
                int[] iArr = f4331k;
                int length2 = iArr.length;
                str = str2;
                int i13 = 0;
                while (true) {
                    if (i13 >= length2) {
                        break;
                    }
                    int i14 = length2;
                    int i15 = iArr[i13];
                    int[] iArr2 = iArr;
                    int i16 = (int) (((float) i15) * f2);
                    if (i15 <= i11 || i16 <= i12) {
                        break;
                    }
                    int i17 = i11;
                    int i18 = i12;
                    if (blm.f4293a < 21) {
                        try {
                            int a4 = blm.m3623a(i15, 16) << 4;
                            int a5 = blm.m3623a(i16, 16) << 4;
                            if (a4 * a5 > att.m2124a()) {
                                i = i9;
                            } else {
                                int i19 = i9 <= i10 ? a4 : a5;
                                if (i9 > i10) {
                                    a5 = a4;
                                }
                                point = new Point(i19, a5);
                            }
                        } catch (ato e) {
                            point = null;
                        }
                    } else {
                        int i20 = i9 <= i10 ? i15 : i16;
                        if (i9 > i10) {
                            i16 = i15;
                        }
                        MediaCodecInfo.CodecCapabilities codecCapabilities = atd2.f2331d;
                        point = (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) ? null : atd.m2048a(videoCapabilities, i20, i16);
                        i = i9;
                        if (atd2.mo1316a(point.x, point.y, (double) akh2.f563p)) {
                            break;
                        }
                    }
                    i13++;
                    length2 = i14;
                    iArr = iArr2;
                    i11 = i17;
                    i12 = i18;
                    i9 = i;
                }
                point = null;
                if (point != null) {
                    i4 = Math.max(i4, point.x);
                    i7 = Math.max(i7, point.y);
                    i5 = Math.max(i5, m3696a(atd2, akh2.f556i, i4, i7));
                    StringBuilder sb2 = new StringBuilder(57);
                    sb2.append("Codec max resolution adjusted to: ");
                    sb2.append(i4);
                    sb2.append("x");
                    sb2.append(i7);
                    Log.w("MediaCodecVideoRenderer", sb2.toString());
                }
            } else {
                str = str2;
            }
            blu = new blu(i4, i7, i5);
        } else {
            str = str2;
            if (!(a3 == -1 || (a2 = m3696a(atd2, akh2.f556i, akh2.f561n, akh2.f562o)) == -1)) {
                a3 = Math.min((int) (((float) a3) * 1.5f), a2);
            }
            blu = new blu(i2, i3, a3);
        }
        this.f4363t = blu;
        boolean z5 = this.f4360q;
        int i21 = this.f4352S;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", akh2.f561n);
        mediaFormat.setInteger("height", akh2.f562o);
        buj.m4233a(mediaFormat, akh2.f558k);
        float f3 = akh2.f563p;
        if (f3 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f3);
        }
        buj.m4232a(mediaFormat, "rotation-degrees", akh2.f564q);
        blp blp = akh2.f568u;
        if (blp != null) {
            buj.m4232a(mediaFormat, "color-transfer", blp.f4312c);
            buj.m4232a(mediaFormat, "color-standard", blp.f4310a);
            buj.m4232a(mediaFormat, "color-range", blp.f4311b);
            byte[] bArr = blp.f4313d;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(akh2.f556i) && (a = att.m2125a(akh)) != null) {
            buj.m4232a(mediaFormat, "profile", ((Integer) a.first).intValue());
        }
        mediaFormat.setInteger("max-width", blu.f4327a);
        mediaFormat.setInteger("max-height", blu.f4328b);
        buj.m4232a(mediaFormat, "max-input-size", blu.f4329c);
        if (blm.f4293a >= 23) {
            mediaFormat.setInteger("priority", 0);
            float f4 = f;
            if (f4 != -1.0f) {
                mediaFormat.setFloat("operating-rate", f4);
            }
        }
        if (z5) {
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (i21 != 0) {
            mediaFormat.setFeatureEnabled("tunneled-playback", true);
            mediaFormat.setInteger("audio-session-id", i21);
        }
        if (this.f4366w == null) {
            bks.m3512b(m3704b(atd));
            if (this.f4367x == null) {
                this.f4367x = bls.m3685a(this.f4357n, atd2.f2332e);
            }
            this.f4366w = this.f4367x;
        }
        MediaCodec mediaCodec2 = mediaCodec;
        mediaCodec2.configure(mediaFormat, this.f4366w, (MediaCrypto) null, 0);
        if (blm.f4293a >= 23 && this.f4351R) {
            this.f4356f = new blv(this, mediaCodec2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final ate mo1325a(Throwable th, atd atd) {
        return new blw(th, atd, this.f4366w);
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public final boolean mo1323B() {
        try {
            return super.mo1323B();
        } finally {
            this.f4339F = 0;
        }
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    private static int m3696a(atd atd, String str, int i, int i2) {
        char c;
        int i3;
        if (i == -1 || i2 == -1) {
            return -1;
        }
        int i4 = 2;
        switch (str.hashCode()) {
            case -1664118616:
                if (str.equals("video/3gpp")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1662541442:
                if (str.equals("video/hevc")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1187890754:
                if (str.equals("video/mp4v-es")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 1331836730:
                if (str.equals("video/avc")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1599127256:
                if (str.equals("video/x-vnd.on2.vp8")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1599127257:
                if (str.equals("video/x-vnd.on2.vp9")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (!(c == 0 || c == 1)) {
            if (c != 2) {
                if (c != 3) {
                    if (c != 4 && c != 5) {
                        return -1;
                    }
                    i3 = i * i2;
                    i4 = 4;
                }
            } else if ("BRAVIA 4K 2015".equals(blm.f4296d) || ("Amazon".equals(blm.f4295c) && ("KFSOWI".equals(blm.f4296d) || ("AFTS".equals(blm.f4296d) && atd.f2332e)))) {
                return -1;
            } else {
                i3 = (blm.m3623a(i, 16) * blm.m3623a(i2, 16)) << 8;
            }
            return (i3 * 3) / (i4 + i4);
        }
        i3 = i * i2;
        return (i3 * 3) / (i4 + i4);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final float mo673a(float f, akh[] akhArr) {
        float f2 = -1.0f;
        for (akh akh : akhArr) {
            float f3 = akh.f563p;
            if (f3 != -1.0f) {
                f2 = Math.max(f2, f3);
            }
        }
        if (f2 != -1.0f) {
            return f2 * f;
        }
        return -1.0f;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: blx.a(ati, akh, boolean, boolean):java.util.List
     arg types: [ati, akh, int, boolean]
     candidates:
      blx.a(atd, java.lang.String, int, int):int
      blx.a(atd, android.media.MediaCodec, akh, float):void
      atg.a(atd, android.media.MediaCodec, akh, float):void
      blx.a(ati, akh, boolean, boolean):java.util.List */
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final List mo682b(ati ati, akh akh) {
        return m3697a(ati, akh, false, this.f4351R);
    }

    /* renamed from: a */
    private static List m3697a(ati ati, akh akh, boolean z, boolean z2) {
        Pair a;
        String str = akh.f556i;
        if (str == null) {
            return Collections.emptyList();
        }
        List a2 = att.m2129a(ati.mo1332a(str, z, z2), akh);
        if ("video/dolby-vision".equals(str) && (a = att.m2125a(akh)) != null) {
            int intValue = ((Integer) a.first).intValue();
            if (intValue == 16 || intValue == 256) {
                a2.addAll(ati.mo1332a("video/hevc", z, z2));
            } else if (intValue == 512) {
                a2.addAll(ati.mo1332a("video/avc", z, z2));
            }
        }
        return Collections.unmodifiableList(a2);
    }

    /* renamed from: a */
    private static int m3695a(atd atd, akh akh) {
        if (akh.f557j == -1) {
            return m3696a(atd, akh.f556i, akh.f561n, akh.f562o);
        }
        int size = akh.f558k.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += ((byte[]) akh.f558k.get(i2)).length;
        }
        return akh.f557j + i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo1327b(anj anj) {
        if (this.f4365v) {
            ByteBuffer byteBuffer = (ByteBuffer) bks.m3507a(anj.f1427e);
            if (byteBuffer.remaining() >= 7) {
                byte b = byteBuffer.get();
                short s = byteBuffer.getShort();
                short s2 = byteBuffer.getShort();
                byte b2 = byteBuffer.get();
                byte b3 = byteBuffer.get();
                byteBuffer.position(0);
                if (b == -75 && s == 60 && s2 == 1 && b2 == 4 && b3 == 0) {
                    byte[] bArr = new byte[byteBuffer.remaining()];
                    byteBuffer.get(bArr);
                    byteBuffer.position(0);
                    MediaCodec mediaCodec = this.f2369g;
                    Bundle bundle = new Bundle();
                    bundle.putByteArray("hdr10-plus-info", bArr);
                    mediaCodec.setParameters(bundle);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo347a(int i, Object obj) {
        if (i == 1) {
            Surface surface = (Surface) obj;
            if (surface == null) {
                Surface surface2 = this.f4367x;
                if (surface2 == null) {
                    atd atd = this.f2370h;
                    if (atd != null && m3704b(atd)) {
                        surface = bls.m3685a(this.f4357n, atd.f2332e);
                        this.f4367x = surface;
                    }
                } else {
                    surface = surface2;
                }
            }
            if (this.f4366w != surface) {
                this.f4366w = surface;
                int i2 = this.f421b;
                MediaCodec mediaCodec = this.f2369g;
                if (mediaCodec != null) {
                    if (blm.f4293a < 23 || surface == null || this.f4364u) {
                        mo1322A();
                        mo1329y();
                    } else {
                        mediaCodec.setOutputSurface(surface);
                    }
                }
                if (surface == null || surface == this.f4367x) {
                    m3691G();
                    m3689E();
                    return;
                }
                m3693I();
                m3689E();
                if (i2 == 2) {
                    m3688D();
                }
            } else if (surface != null && surface != this.f4367x) {
                m3693I();
                if (this.f4369z) {
                    this.f4359p.mo2148a(this.f4366w);
                }
            }
        }
    }

    /* renamed from: v */
    public final boolean mo485v() {
        Surface surface;
        if (super.mo485v() && (this.f4369z || (((surface = this.f4367x) != null && this.f4366w == surface) || this.f2369g == null || this.f4351R))) {
            this.f4335B = -9223372036854775807L;
            return true;
        } else if (this.f4335B == -9223372036854775807L) {
            return false;
        } else {
            if (SystemClock.elapsedRealtime() < this.f4335B) {
                return true;
            }
            this.f4335B = -9223372036854775807L;
            return false;
        }
    }

    /* renamed from: J */
    private final void m3694J() {
        if (this.f4337D > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j = elapsedRealtime - this.f4336C;
            bmj bmj = this.f4359p;
            int i = this.f4337D;
            if (bmj.f4411b != null) {
                bmj.f4410a.post(new bmf(bmj, i, j));
            }
            this.f4337D = 0;
            this.f4336C = elapsedRealtime;
        }
    }

    /* renamed from: F */
    private final void m3690F() {
        if (!this.f4369z) {
            this.f4369z = true;
            this.f4359p.mo2148a(this.f4366w);
        }
    }

    /* renamed from: H */
    private final void m3692H() {
        int i = this.f4343J;
        if (i != -1 || this.f4344K != -1) {
            if (this.f4347N != i || this.f4348O != this.f4344K || this.f4349P != this.f4345L || this.f4350Q != this.f4346M) {
                this.f4359p.mo2147a(i, this.f4344K, this.f4345L, this.f4346M);
                this.f4347N = this.f4343J;
                this.f4348O = this.f4344K;
                this.f4349P = this.f4345L;
                this.f4350Q = this.f4346M;
            }
        }
    }

    /* renamed from: I */
    private final void m3693I() {
        int i = this.f4347N;
        if (i != -1 || this.f4348O != -1) {
            this.f4359p.mo2147a(i, this.f4348O, this.f4349P, this.f4350Q);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo680a(String str, long j, long j2) {
        bmj bmj = this.f4359p;
        if (bmj.f4411b != null) {
            bmj.f4410a.post(new bmd(bmj, str, j, j2));
        }
        this.f4364u = m3702a(str);
        atd atd = (atd) bks.m3507a(this.f2370h);
        boolean z = false;
        if (blm.f4293a >= 29 && "video/x-vnd.on2.vp9".equals(atd.f2329b)) {
            MediaCodecInfo.CodecProfileLevel[] a = atd.mo1319a();
            int length = a.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    if (a[i].profile == 16384) {
                        z = true;
                        break;
                    }
                    i++;
                } else {
                    break;
                }
            }
        }
        this.f4365v = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final void mo370r() {
        this.f4353T = -9223372036854775807L;
        this.f4354U = -9223372036854775807L;
        this.f4355V = 0;
        m3691G();
        m3689E();
        bma bma = this.f4358o;
        if (bma.f4378a != null) {
            bly bly = bma.f4380c;
            if (bly != null) {
                bly.f4370a.unregisterDisplayListener(bly);
            }
            bma.f4379b.f4374c.sendEmptyMessage(2);
        }
        this.f4356f = null;
        try {
            super.mo370r();
        } finally {
            this.f4359p.mo2149a(this.f2372j);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo351a(boolean z) {
        super.mo351a(z);
        int i = this.f4352S;
        int i2 = this.f420a.f638b;
        this.f4352S = i2;
        this.f4351R = i2 != 0;
        if (i2 != i) {
            mo1322A();
        }
        bmj bmj = this.f4359p;
        ani ani = this.f2372j;
        if (bmj.f4411b != null) {
            bmj.f4410a.post(new bmc(bmj, ani));
        }
        bma bma = this.f4358o;
        bma.f4386i = false;
        if (bma.f4378a != null) {
            bma.f4379b.f4374c.sendEmptyMessage(1);
            bly bly = bma.f4380c;
            if (bly != null) {
                bly.f4370a.registerDisplayListener(bly, null);
            }
            bma.mo2138a();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo676a(aki aki) {
        super.mo676a(aki);
        akh akh = aki.f576c;
        bmj bmj = this.f4359p;
        if (bmj.f4411b != null) {
            bmj.f4410a.post(new bme(bmj, akh));
        }
        this.f4342I = akh.f565r;
        this.f4341H = akh.f564q;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo677a(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        int i;
        int i2;
        boolean z = false;
        if (mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top")) {
            z = true;
        }
        if (z) {
            i = (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1;
        } else {
            i = mediaFormat.getInteger("width");
        }
        if (z) {
            i2 = (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1;
        } else {
            i2 = mediaFormat.getInteger("height");
        }
        m3700a(mediaCodec, i, i2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo349a(long j, boolean z) {
        super.mo349a(j, z);
        m3689E();
        this.f4334A = -9223372036854775807L;
        this.f4338E = 0;
        this.f4353T = -9223372036854775807L;
        int i = this.f4355V;
        if (i != 0) {
            this.f4354U = this.f4361r[i - 1];
            this.f4355V = 0;
        }
        if (!z) {
            this.f4335B = -9223372036854775807L;
        } else {
            m3688D();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo683c(long j) {
        this.f4339F--;
        while (true) {
            int i = this.f4355V;
            if (i != 0 && j >= this.f4362s[0]) {
                long[] jArr = this.f4361r;
                this.f4354U = jArr[0];
                int i2 = i - 1;
                this.f4355V = i2;
                System.arraycopy(jArr, 1, jArr, 0, i2);
                long[] jArr2 = this.f4362s;
                System.arraycopy(jArr2, 1, jArr2, 0, this.f4355V);
                m3689E();
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo2130e(long j) {
        akh d = mo1328d(j);
        if (d != null) {
            m3700a(this.f2369g, d.f561n, d.f562o);
        }
        m3692H();
        m3690F();
        mo683c(j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo678a(anj anj) {
        this.f4339F++;
        this.f4353T = Math.max(anj.f1426d, this.f4353T);
        if (blm.f4293a < 23 && this.f4351R) {
            mo2130e(anj.f1426d);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public final void mo371s() {
        try {
            super.mo371s();
        } finally {
            Surface surface = this.f4367x;
            if (surface != null) {
                if (this.f4366w == surface) {
                    this.f4366w = null;
                }
                surface.release();
                this.f4367x = null;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final void mo368p() {
        this.f4337D = 0;
        this.f4336C = SystemClock.elapsedRealtime();
        this.f4340G = SystemClock.elapsedRealtime() * 1000;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final void mo369q() {
        this.f4335B = -9223372036854775807L;
        m3694J();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo352a(akh[] akhArr, long j) {
        if (this.f4354U != -9223372036854775807L) {
            int i = this.f4355V;
            long[] jArr = this.f4361r;
            if (i == jArr.length) {
                long j2 = jArr[i - 1];
                StringBuilder sb = new StringBuilder(65);
                sb.append("Too many stream changes, so dropping offset: ");
                sb.append(j2);
                Log.w("MediaCodecVideoRenderer", sb.toString());
            } else {
                this.f4355V = i + 1;
            }
            long[] jArr2 = this.f4361r;
            int i2 = this.f4355V - 1;
            jArr2[i2] = j;
            this.f4362s[i2] = this.f4353T;
            return;
        }
        this.f4354U = j;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.media.MediaCodec.releaseOutputBuffer(int, boolean):void}
     arg types: [int, int]
     candidates:
      ClspMth{android.media.MediaCodec.releaseOutputBuffer(int, long):void}
      ClspMth{android.media.MediaCodec.releaseOutputBuffer(int, boolean):void} */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005a, code lost:
        if (r7 > 100000) goto L_0x0060;
     */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0175  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0186  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0191  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x01b5  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo681a(long r26, long r28, android.media.MediaCodec r30, java.nio.ByteBuffer r31, int r32, int r33, long r34, boolean r36, boolean r37) {
        /*
            r25 = this;
            r1 = r25
            r2 = r26
            r0 = r30
            r4 = r32
            r5 = r34
            long r7 = r1.f4334A
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 == 0) goto L_0x0016
            goto L_0x0018
        L_0x0016:
            r1.f4334A = r2
        L_0x0018:
            r7 = 1
            if (r36 != 0) goto L_0x001c
            goto L_0x0022
        L_0x001c:
            if (r37 != 0) goto L_0x0022
            r1.m3703b(r0, r4)
            return r7
        L_0x0022:
            long r11 = r5 - r2
            android.view.Surface r8 = r1.f4366w
            android.view.Surface r13 = r1.f4367x
            if (r8 == r13) goto L_0x01c6
            long r15 = android.os.SystemClock.elapsedRealtime()
            r17 = 1000(0x3e8, double:4.94E-321)
            long r15 = r15 * r17
            long r7 = r1.f4340G
            long r7 = r15 - r7
            int r13 = r1.f421b
            r19 = r15
            long r14 = r1.f4335B
            r5 = 21
            r6 = 2
            int r16 = (r14 > r9 ? 1 : (r14 == r9 ? 0 : -1))
            if (r16 != 0) goto L_0x0071
            long r14 = r1.f4354U
            int r16 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r16 < 0) goto L_0x0071
            boolean r14 = r1.f4369z
            if (r14 == 0) goto L_0x0060
            if (r13 != r6) goto L_0x005d
            boolean r6 = m3705f(r11)
            if (r6 == 0) goto L_0x0074
            r13 = 100000(0x186a0, double:4.94066E-319)
            int r6 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r6 > 0) goto L_0x0060
            goto L_0x0074
        L_0x005d:
            r2 = 0
            goto L_0x01c4
        L_0x0060:
            long r2 = java.lang.System.nanoTime()
            int r6 = p000.blm.f4293a
            if (r6 < r5) goto L_0x006c
            r1.m3701a(r0, r4, r2)
            goto L_0x006f
        L_0x006c:
            r1.m3699a(r0, r4)
        L_0x006f:
            r0 = 1
            return r0
        L_0x0071:
            if (r13 != r6) goto L_0x01c3
        L_0x0074:
            long r6 = r1.f4334A
            int r8 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x007d
            r2 = 0
            goto L_0x01c4
        L_0x007d:
            long r6 = java.lang.System.nanoTime()
            long r15 = r19 - r28
            long r11 = r11 - r15
            long r11 = r11 * r17
            long r11 = r11 + r6
            bma r8 = r1.f4358o
            r13 = r34
            r15 = r6
            long r5 = r13 * r17
            boolean r7 = r8.f4386i
            if (r7 == 0) goto L_0x00dd
            long r9 = r8.f4383f
            int r7 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r7 == 0) goto L_0x00a4
            long r9 = r8.f4389l
            r21 = 1
            long r9 = r9 + r21
            r8.f4389l = r9
            long r9 = r8.f4385h
            r8.f4384g = r9
        L_0x00a4:
            long r9 = r8.f4389l
            r21 = 6
            int r7 = (r9 > r21 ? 1 : (r9 == r21 ? 0 : -1))
            if (r7 < 0) goto L_0x00d0
            long r2 = r8.f4388k
            long r2 = r5 - r2
            long r2 = r2 / r9
            long r9 = r8.f4384g
            long r2 = r2 + r9
            boolean r7 = r8.mo2139a(r2, r11)
            if (r7 != 0) goto L_0x00c4
            long r9 = r8.f4387j
            long r9 = r9 + r2
            r21 = r2
            long r2 = r8.f4388k
            long r2 = r9 - r2
            goto L_0x00cc
        L_0x00c4:
            r2 = 0
            r8.f4386i = r2
            r21 = r5
            r2 = r11
        L_0x00cc:
            r9 = r2
            r2 = r21
            goto L_0x00e0
        L_0x00d0:
            boolean r2 = r8.mo2139a(r5, r11)
            if (r2 != 0) goto L_0x00d7
            goto L_0x00dd
        L_0x00d7:
            r2 = 0
            r8.f4386i = r2
            goto L_0x00de
        L_0x00dd:
        L_0x00de:
            r2 = r5
            r9 = r11
        L_0x00e0:
            boolean r7 = r8.f4386i
            if (r7 != 0) goto L_0x00ef
            r8.f4388k = r5
            r8.f4387j = r11
            r5 = 0
            r8.f4389l = r5
            r5 = 1
            r8.f4386i = r5
        L_0x00ef:
            r8.f4383f = r13
            r8.f4385h = r2
            blz r2 = r8.f4379b
            if (r2 == 0) goto L_0x012b
            long r5 = r8.f4381d
            r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r3 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r3 == 0) goto L_0x012b
            long r2 = r2.f4373a
            int r5 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r5 == 0) goto L_0x012b
            long r5 = r8.f4381d
            long r11 = r9 - r2
            long r11 = r11 / r5
            long r11 = r11 * r5
            long r2 = r2 + r11
            int r7 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r7 <= 0) goto L_0x0116
            long r5 = r5 + r2
            goto L_0x011d
        L_0x0116:
            long r5 = r2 - r5
            r23 = r2
            r2 = r5
            r5 = r23
        L_0x011d:
            long r11 = r5 - r9
            long r9 = r9 - r2
            int r7 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r7 >= 0) goto L_0x0125
            goto L_0x0126
        L_0x0125:
            r5 = r2
        L_0x0126:
            long r2 = r8.f4382e
            long r9 = r5 - r2
            goto L_0x012c
        L_0x012b:
        L_0x012c:
            long r2 = r9 - r15
            long r2 = r2 / r17
            long r5 = r1.f4335B
            r7 = -500000(0xfffffffffff85ee0, double:NaN)
            int r11 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r11 >= 0) goto L_0x0163
            if (r37 != 0) goto L_0x0163
            int r7 = r25.mo354b(r26)
            if (r7 == 0) goto L_0x0163
            ani r0 = r1.f2372j
            int r2 = r0.f1423i
            r3 = 1
            int r2 = r2 + r3
            r0.f1423i = r2
            int r2 = r1.f4339F
            int r2 = r2 + r7
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 == 0) goto L_0x015b
            int r3 = r0.f1420f
            int r3 = r3 + r2
            r0.f1420f = r3
            goto L_0x015e
        L_0x015b:
            r1.m3698a(r2)
        L_0x015e:
            r25.mo1324C()
            r2 = 0
            return r2
        L_0x0163:
            boolean r7 = m3705f(r2)
            if (r7 != 0) goto L_0x016a
            goto L_0x018b
        L_0x016a:
            if (r37 != 0) goto L_0x018b
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r7 != 0) goto L_0x0186
            java.lang.String r2 = "dropVideoBuffer"
            p000.blk.m3619a(r2)
            r2 = 0
            r0.releaseOutputBuffer(r4, r2)
            p000.blk.m3618a()
            r2 = 1
            r1.m3698a(r2)
            goto L_0x018a
        L_0x0186:
            r2 = 1
            r1.m3703b(r0, r4)
        L_0x018a:
            return r2
        L_0x018b:
            int r5 = p000.blm.f4293a
            r6 = 21
            if (r5 >= r6) goto L_0x01b5
            r5 = 30000(0x7530, double:1.4822E-319)
            int r7 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r7 >= 0) goto L_0x01c1
            r5 = 11000(0x2af8, double:5.4347E-320)
            int r7 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x01b0
            r5 = -10000(0xffffffffffffd8f0, double:NaN)
            long r2 = r2 + r5
            long r2 = r2 / r17
            java.lang.Thread.sleep(r2)     // Catch:{ InterruptedException -> 0x01a6 }
            goto L_0x01b0
        L_0x01a6:
            r0 = move-exception
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
            r2 = 0
            return r2
        L_0x01b0:
            r1.m3699a(r0, r4)
            r5 = 1
            return r5
        L_0x01b5:
            r5 = 1
            r6 = 50000(0xc350, double:2.47033E-319)
            int r8 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r8 >= 0) goto L_0x01c1
            r1.m3701a(r0, r4, r9)
            return r5
        L_0x01c1:
            r2 = 0
            return r2
        L_0x01c3:
            r2 = 0
        L_0x01c4:
            return r2
        L_0x01c6:
            r2 = 0
            boolean r3 = m3705f(r11)
            if (r3 == 0) goto L_0x01d2
            r1.m3703b(r0, r4)
            r0 = 1
            return r0
        L_0x01d2:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.blx.mo681a(long, long, android.media.MediaCodec, java.nio.ByteBuffer, int, int, long, boolean, boolean):boolean");
    }

    /* renamed from: a */
    private final void m3700a(MediaCodec mediaCodec, int i, int i2) {
        this.f4343J = i;
        this.f4344K = i2;
        this.f4346M = this.f4342I;
        if (blm.f4293a >= 21) {
            int i3 = this.f4341H;
            if (i3 == 90 || i3 == 270) {
                int i4 = this.f4343J;
                this.f4343J = this.f4344K;
                this.f4344K = i4;
                this.f4346M = 1.0f / this.f4346M;
            }
        } else {
            this.f4345L = this.f4341H;
        }
        mediaCodec.setVideoScalingMode(1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public final void mo1322A() {
        try {
            super.mo1322A();
        } finally {
            this.f4339F = 0;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.media.MediaCodec.releaseOutputBuffer(int, boolean):void}
     arg types: [int, int]
     candidates:
      ClspMth{android.media.MediaCodec.releaseOutputBuffer(int, long):void}
      ClspMth{android.media.MediaCodec.releaseOutputBuffer(int, boolean):void} */
    /* renamed from: a */
    private final void m3699a(MediaCodec mediaCodec, int i) {
        m3692H();
        blk.m3619a("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i, true);
        blk.m3618a();
        this.f4340G = SystemClock.elapsedRealtime() * 1000;
        this.f2372j.f1419e++;
        this.f4338E = 0;
        m3690F();
    }

    /* renamed from: a */
    private final void m3701a(MediaCodec mediaCodec, int i, long j) {
        m3692H();
        blk.m3619a("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i, j);
        blk.m3618a();
        this.f4340G = SystemClock.elapsedRealtime() * 1000;
        this.f2372j.f1419e++;
        this.f4338E = 0;
        m3690F();
    }

    /* renamed from: D */
    private final void m3688D() {
        this.f4335B = SystemClock.elapsedRealtime() + 5000;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo1326a(atd atd) {
        return this.f4366w != null || m3704b(atd);
    }

    /* renamed from: b */
    private final boolean m3704b(atd atd) {
        if (blm.f4293a < 23 || this.f4351R || m3702a(atd.f2328a)) {
            return false;
        }
        return !atd.f2332e || bls.m3686a(this.f4357n);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.media.MediaCodec.releaseOutputBuffer(int, boolean):void}
     arg types: [int, int]
     candidates:
      ClspMth{android.media.MediaCodec.releaseOutputBuffer(int, long):void}
      ClspMth{android.media.MediaCodec.releaseOutputBuffer(int, boolean):void} */
    /* renamed from: b */
    private final void m3703b(MediaCodec mediaCodec, int i) {
        blk.m3619a("skipVideoBuffer");
        mediaCodec.releaseOutputBuffer(i, false);
        blk.m3618a();
        this.f2372j.f1420f++;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: blx.a(ati, akh, boolean, boolean):java.util.List
     arg types: [ati, akh, boolean, int]
     candidates:
      blx.a(atd, java.lang.String, int, int):int
      blx.a(atd, android.media.MediaCodec, akh, float):void
      atg.a(atd, android.media.MediaCodec, akh, float):void
      blx.a(ati, akh, boolean, boolean):java.util.List */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: blx.a(ati, akh, boolean, boolean):java.util.List
     arg types: [ati, akh, int, int]
     candidates:
      blx.a(atd, java.lang.String, int, int):int
      blx.a(atd, android.media.MediaCodec, akh, float):void
      atg.a(atd, android.media.MediaCodec, akh, float):void
      blx.a(ati, akh, boolean, boolean):java.util.List */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo675a(ati ati, akh akh) {
        int i;
        int i2 = 0;
        if (!bkt.m3516b(akh.f556i)) {
            return 0;
        }
        anq anq = akh.f559l;
        boolean z = anq != null;
        List a = m3697a(ati, akh, z, false);
        if (z && a.isEmpty()) {
            a = m3697a(ati, akh, false, false);
        }
        if (a.isEmpty()) {
            return 1;
        }
        if (anq != null) {
            Class cls = akh.f546C;
            if (!anw.class.equals(null)) {
                Class cls2 = akh.f546C;
                if (!m599a(anq)) {
                    return 2;
                }
            }
        }
        atd atd = (atd) a.get(0);
        boolean a2 = atd.mo1317a(akh);
        if (!atd.mo1320b(akh)) {
            i = 8;
        } else {
            i = 16;
        }
        if (a2) {
            List a3 = m3697a(ati, akh, z, true);
            if (!a3.isEmpty()) {
                atd atd2 = (atd) a3.get(0);
                if (atd2.mo1317a(akh) && atd2.mo1320b(akh)) {
                    i2 = 32;
                }
            }
        }
        return (!a2 ? 3 : 4) | i | i2;
    }

    /* renamed from: a */
    private final void m3698a(int i) {
        ani ani = this.f2372j;
        ani.f1421g += i;
        this.f4337D += i;
        int i2 = this.f4338E + i;
        this.f4338E = i2;
        ani.f1422h = Math.max(i2, ani.f1422h);
        if (this.f4337D >= 50) {
            m3694J();
        }
    }
}
