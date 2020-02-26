package p000;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: bbz */
/* compiled from: PG */
public final class bbz implements aoi {

    /* renamed from: a */
    private static final Pattern f3197a = Pattern.compile("LOCAL:([^,]+)");

    /* renamed from: b */
    private static final Pattern f3198b = Pattern.compile("MPEGTS:(\\d+)");

    /* renamed from: c */
    private final String f3199c;

    /* renamed from: d */
    private final blj f3200d;

    /* renamed from: e */
    private final bky f3201e = new bky();

    /* renamed from: f */
    private aok f3202f;

    /* renamed from: g */
    private byte[] f3203g = new byte[1024];

    /* renamed from: h */
    private int f3204h;

    public bbz(String str, blj blj) {
        this.f3199c = str;
        this.f3200d = blj;
    }

    /* renamed from: a */
    private final aov m2776a(long j) {
        aov a = this.f3202f.mo1211a(0, 3);
        a.mo1204a(akh.m743b("text/vtt", this.f3199c, j));
        this.f3202f.mo1210S();
        return a;
    }

    /* renamed from: a */
    public final void mo1208a(aok aok) {
        this.f3202f = aok;
        aok.mo1212a(new aor(-9223372036854775807L));
    }

    /* renamed from: a */
    public final int mo1206a(aoj aoj, aop aop) {
        bks.m3507a(this.f3202f);
        int i = (int) ((aof) aoj).f1489b;
        int i2 = this.f3204h;
        byte[] bArr = this.f3203g;
        int length = bArr.length;
        if (i2 == length) {
            if (i != -1) {
                length = i;
            }
            this.f3203g = Arrays.copyOf(bArr, (length * 3) / 2);
        }
        byte[] bArr2 = this.f3203g;
        int i3 = this.f3204h;
        int a = aoj.mo1189a(bArr2, i3, bArr2.length - i3);
        if (a != -1) {
            int i4 = this.f3204h + a;
            this.f3204h = i4;
            if (i == -1 || i4 != i) {
                return 0;
            }
        }
        bky bky = new bky(this.f3203g);
        bfr.m3069a(bky);
        long j = 0;
        long j2 = 0;
        for (String r = bky.mo2091r(); !TextUtils.isEmpty(r); r = bky.mo2091r()) {
            if (r.startsWith("X-TIMESTAMP-MAP")) {
                Matcher matcher = f3197a.matcher(r);
                if (!matcher.find()) {
                    String valueOf = String.valueOf(r);
                    throw new ako(valueOf.length() == 0 ? new String("X-TIMESTAMP-MAP doesn't contain local timestamp: ") : "X-TIMESTAMP-MAP doesn't contain local timestamp: ".concat(valueOf));
                }
                Matcher matcher2 = f3198b.matcher(r);
                if (!matcher2.find()) {
                    String valueOf2 = String.valueOf(r);
                    throw new ako(valueOf2.length() == 0 ? new String("X-TIMESTAMP-MAP doesn't contain media timestamp: ") : "X-TIMESTAMP-MAP doesn't contain media timestamp: ".concat(valueOf2));
                }
                long a2 = bfr.m3068a(matcher.group(1));
                j = blj.m3608d(Long.parseLong(matcher2.group(1)));
                j2 = a2;
            }
        }
        Matcher c = bfr.m3072c(bky);
        if (c == null) {
            m2776a(0);
        } else {
            long a3 = bfr.m3068a(c.group(1));
            long b = this.f3200d.mo2115b(blj.m3609e((j + a3) - j2));
            aov a4 = m2776a(b - a3);
            this.f3201e.mo2068a(this.f3203g, this.f3204h);
            a4.mo1205a(this.f3201e, this.f3204h);
            a4.mo1203a(b, 1, this.f3204h, 0, null);
        }
        return -1;
    }

    /* renamed from: a */
    public final void mo1207a(long j, long j2) {
        throw new IllegalStateException();
    }

    /* renamed from: a */
    public final boolean mo1209a(aoj aoj) {
        aoj.mo1197b(this.f3203g, 0, 6, false);
        this.f3201e.mo2068a(this.f3203g, 6);
        if (bfr.m3071b(this.f3201e)) {
            return true;
        }
        aoj.mo1197b(this.f3203g, 6, 3, false);
        this.f3201e.mo2068a(this.f3203g, 9);
        return bfr.m3071b(this.f3201e);
    }
}
