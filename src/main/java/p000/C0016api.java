package p000;

import android.util.Log;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: api */
/* compiled from: PG */
final class C0016api {

    /* renamed from: A */
    public int f1583A = 1000;

    /* renamed from: B */
    public int f1584B = 200;

    /* renamed from: C */
    public float f1585C = -1.0f;

    /* renamed from: D */
    public float f1586D = -1.0f;

    /* renamed from: E */
    public float f1587E = -1.0f;

    /* renamed from: F */
    public float f1588F = -1.0f;

    /* renamed from: G */
    public float f1589G = -1.0f;

    /* renamed from: H */
    public float f1590H = -1.0f;

    /* renamed from: I */
    public float f1591I = -1.0f;

    /* renamed from: J */
    public float f1592J = -1.0f;

    /* renamed from: K */
    public float f1593K = -1.0f;

    /* renamed from: L */
    public float f1594L = -1.0f;

    /* renamed from: M */
    public int f1595M = 1;

    /* renamed from: N */
    public int f1596N = -1;

    /* renamed from: O */
    public int f1597O = 8000;

    /* renamed from: P */
    public long f1598P = 0;

    /* renamed from: Q */
    public long f1599Q = 0;

    /* renamed from: R */
    public apj f1600R;

    /* renamed from: S */
    public boolean f1601S;

    /* renamed from: T */
    public boolean f1602T = true;

    /* renamed from: U */
    public String f1603U = "eng";

    /* renamed from: V */
    public aov f1604V;

    /* renamed from: W */
    public int f1605W;

    /* renamed from: a */
    public String f1606a;

    /* renamed from: b */
    public String f1607b;

    /* renamed from: c */
    public int f1608c;

    /* renamed from: d */
    public int f1609d;

    /* renamed from: e */
    public int f1610e;

    /* renamed from: f */
    public int f1611f;

    /* renamed from: g */
    public boolean f1612g;

    /* renamed from: h */
    public byte[] f1613h;

    /* renamed from: i */
    public aou f1614i;

    /* renamed from: j */
    public byte[] f1615j;

    /* renamed from: k */
    public anq f1616k;

    /* renamed from: l */
    public int f1617l = -1;

    /* renamed from: m */
    public int f1618m = -1;

    /* renamed from: n */
    public int f1619n = -1;

    /* renamed from: o */
    public int f1620o = -1;

    /* renamed from: p */
    public int f1621p = 0;

    /* renamed from: q */
    public int f1622q = -1;

    /* renamed from: r */
    public float f1623r = 0.0f;

    /* renamed from: s */
    public float f1624s = 0.0f;

    /* renamed from: t */
    public float f1625t = 0.0f;

    /* renamed from: u */
    public byte[] f1626u = null;

    /* renamed from: v */
    public int f1627v = -1;

    /* renamed from: w */
    public boolean f1628w = false;

    /* renamed from: x */
    public int f1629x = -1;

    /* renamed from: y */
    public int f1630y = -1;

    /* renamed from: z */
    public int f1631z = -1;

    private C0016api() {
    }

    public /* synthetic */ C0016api(byte b) {
    }

    /* renamed from: a */
    public static Pair m1715a(bky bky) {
        try {
            bky.mo2075d(16);
            long i = bky.mo2082i();
            if (i == 1482049860) {
                return new Pair("video/divx", null);
            }
            if (i == 859189832) {
                return new Pair("video/3gpp", null);
            }
            if (i == 826496599) {
                int i2 = bky.f4259b + 20;
                byte[] bArr = bky.f4258a;
                while (true) {
                    int length = bArr.length;
                    if (i2 < length - 4) {
                        if (bArr[i2] == 0 && bArr[i2 + 1] == 0 && bArr[i2 + 2] == 1) {
                            if (bArr[i2 + 3] == 15) {
                                return new Pair("video/wvc1", Collections.singletonList(Arrays.copyOfRange(bArr, i2, length)));
                            }
                        }
                        i2++;
                    } else {
                        throw new ako("Failed to find FourCC VC1 initialization data");
                    }
                }
            } else {
                Log.w("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                return new Pair("video/x-unknown", null);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new ako("Error parsing FourCC private data");
        }
    }

    /* renamed from: b */
    public static boolean m1717b(bky bky) {
        try {
            int f = bky.mo2078f();
            if (f == 1) {
                return true;
            }
            if (f == 65534) {
                bky.mo2073c(24);
                return bky.mo2085l() == apk.f1639b.getMostSignificantBits() && bky.mo2085l() == apk.f1639b.getLeastSignificantBits();
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new ako("Error parsing MS/ACM codec private");
        }
    }

    /* renamed from: a */
    public static List m1716a(byte[] bArr) {
        byte b;
        byte b2;
        try {
            if (bArr[0] == 2) {
                int i = 1;
                int i2 = 0;
                while (true) {
                    b = bArr[i];
                    if (b != -1) {
                        break;
                    }
                    i2 += 255;
                    i++;
                }
                int i3 = i + 1;
                int i4 = i2 + b;
                int i5 = 0;
                while (true) {
                    b2 = bArr[i3];
                    if (b2 != -1) {
                        break;
                    }
                    i5 += 255;
                    i3++;
                }
                int i6 = i3 + 1;
                int i7 = i5 + b2;
                if (bArr[i6] == 1) {
                    byte[] bArr2 = new byte[i4];
                    System.arraycopy(bArr, i6, bArr2, 0, i4);
                    int i8 = i6 + i4;
                    if (bArr[i8] == 3) {
                        int i9 = i8 + i7;
                        if (bArr[i9] == 5) {
                            int length = bArr.length - i9;
                            byte[] bArr3 = new byte[length];
                            System.arraycopy(bArr, i9, bArr3, 0, length);
                            ArrayList arrayList = new ArrayList(2);
                            arrayList.add(bArr2);
                            arrayList.add(bArr3);
                            return arrayList;
                        }
                        throw new ako("Error parsing vorbis codec private");
                    }
                    throw new ako("Error parsing vorbis codec private");
                }
                throw new ako("Error parsing vorbis codec private");
            }
            throw new ako("Error parsing vorbis codec private");
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new ako("Error parsing vorbis codec private");
        }
    }
}
