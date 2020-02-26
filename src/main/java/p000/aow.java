package p000;

import java.io.EOFException;
import java.util.Arrays;

/* renamed from: aow */
/* compiled from: PG */
public final class aow implements aoi {

    /* renamed from: a */
    private static final int[] f1526a = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* renamed from: b */
    private static final int[] f1527b = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};

    /* renamed from: c */
    private static final byte[] f1528c = blm.m3674c("#!AMR\n");

    /* renamed from: d */
    private static final byte[] f1529d = blm.m3674c("#!AMR-WB\n");

    /* renamed from: e */
    private static final int f1530e = f1527b[8];

    /* renamed from: f */
    private final byte[] f1531f;

    /* renamed from: g */
    private boolean f1532g;

    /* renamed from: h */
    private long f1533h;

    /* renamed from: i */
    private int f1534i;

    /* renamed from: j */
    private int f1535j;

    /* renamed from: k */
    private boolean f1536k;

    /* renamed from: l */
    private int f1537l;

    /* renamed from: m */
    private int f1538m;

    /* renamed from: n */
    private aok f1539n;

    /* renamed from: o */
    private aov f1540o;

    /* renamed from: p */
    private aos f1541p;

    /* renamed from: q */
    private boolean f1542q;

    public aow() {
        this((byte) 0);
    }

    public aow(byte b) {
        this.f1531f = new byte[1];
        this.f1537l = -1;
    }

    /* renamed from: a */
    public final void mo1208a(aok aok) {
        this.f1539n = aok;
        this.f1540o = aok.mo1211a(0, 1);
        aok.mo1210S();
    }

    /* renamed from: a */
    private static final boolean m1686a(aoj aoj, byte[] bArr) {
        aoj.mo1191a();
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        aoj.mo1199c(bArr2, 0, length);
        return Arrays.equals(bArr2, bArr);
    }

    /* renamed from: a */
    public final int mo1206a(aoj aoj, aop aop) {
        String str;
        if (((aof) aoj).f1490c == 0 && !m1687b(aoj)) {
            throw new ako("Could not find AMR header.");
        }
        if (!this.f1542q) {
            this.f1542q = true;
            boolean z = this.f1532g;
            if (!z) {
                str = "audio/3gpp";
            } else {
                str = "audio/amr-wb";
            }
            this.f1540o.mo1204a(akh.m730a(null, str, -1, f1530e, 1, !z ? 8000 : 16000, -1, null, null, 0, null));
        }
        int c = m1688c(aoj);
        if (!this.f1536k) {
            aor aor = new aor(-9223372036854775807L);
            this.f1541p = aor;
            this.f1539n.mo1212a(aor);
            this.f1536k = true;
        }
        return c;
    }

    /* renamed from: b */
    private final boolean m1687b(aoj aoj) {
        if (m1686a(aoj, f1528c)) {
            this.f1532g = false;
            aoj.mo1192a(f1528c.length);
            return true;
        } else if (!m1686a(aoj, f1529d)) {
            return false;
        } else {
            this.f1532g = true;
            aoj.mo1192a(f1529d.length);
            return true;
        }
    }

    /* renamed from: c */
    private final int m1688c(aoj aoj) {
        String str;
        int i = this.f1535j;
        if (i == 0) {
            try {
                aoj.mo1191a();
                aoj.mo1199c(this.f1531f, 0, 1);
                byte b = this.f1531f[0];
                if ((b & 131) <= 0) {
                    int i2 = (b >> 3) & 15;
                    boolean z = this.f1532g;
                    if (!z || (i2 >= 10 && i2 <= 13)) {
                        if (!z) {
                            if (i2 >= 12) {
                                if (i2 > 14) {
                                }
                            }
                        }
                        if (!z) {
                            str = "NB";
                        } else {
                            str = "WB";
                        }
                        StringBuilder sb = new StringBuilder(str.length() + 35);
                        sb.append("Illegal AMR ");
                        sb.append(str);
                        sb.append(" frame type ");
                        sb.append(i2);
                        throw new ako(sb.toString());
                    }
                    i = !z ? f1526a[i2] : f1527b[i2];
                    this.f1534i = i;
                    this.f1535j = i;
                    int i3 = this.f1537l;
                    if (i3 == -1) {
                        this.f1537l = i;
                        i3 = i;
                    }
                    if (i3 == i) {
                        this.f1538m++;
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder(42);
                    sb2.append("Invalid padding bits for frame header ");
                    sb2.append((int) b);
                    throw new ako(sb2.toString());
                }
            } catch (EOFException e) {
                return -1;
            }
        }
        int a = this.f1540o.mo1202a(aoj, i, true);
        if (a == -1) {
            return -1;
        }
        int i4 = this.f1535j - a;
        this.f1535j = i4;
        if (i4 <= 0) {
            this.f1540o.mo1203a(this.f1533h, 1, this.f1534i, 0, null);
            this.f1533h += 20000;
        }
        return 0;
    }

    /* renamed from: a */
    public final void mo1207a(long j, long j2) {
        this.f1533h = 0;
        this.f1534i = 0;
        this.f1535j = 0;
    }

    /* renamed from: a */
    public final boolean mo1209a(aoj aoj) {
        return m1687b(aoj);
    }
}
