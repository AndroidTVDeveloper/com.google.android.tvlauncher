package defpackage;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: bbz  reason: default package */
/* compiled from: PG */
public final class bbz implements aoi {
    private static final Pattern a = Pattern.compile("LOCAL:([^,]+)");
    private static final Pattern b = Pattern.compile("MPEGTS:(\\d+)");
    private final String c;
    private final blj d;
    private final bky e = new bky();
    private aok f;
    private byte[] g = new byte[1024];
    private int h;

    public bbz(String str, blj blj) {
        this.c = str;
        this.d = blj;
    }

    private final aov a(long j) {
        aov a2 = this.f.a(0, 3);
        a2.a(akh.b("text/vtt", this.c, j));
        this.f.S();
        return a2;
    }

    public final void a(aok aok) {
        this.f = aok;
        aok.a(new aor(-9223372036854775807L));
    }

    public final int a(aoj aoj, aop aop) {
        bks.a(this.f);
        int i = (int) ((aof) aoj).b;
        int i2 = this.h;
        byte[] bArr = this.g;
        int length = bArr.length;
        if (i2 == length) {
            if (i != -1) {
                length = i;
            }
            this.g = Arrays.copyOf(bArr, (length * 3) / 2);
        }
        byte[] bArr2 = this.g;
        int i3 = this.h;
        int a2 = aoj.a(bArr2, i3, bArr2.length - i3);
        if (a2 != -1) {
            int i4 = this.h + a2;
            this.h = i4;
            if (i == -1 || i4 != i) {
                return 0;
            }
        }
        bky bky = new bky(this.g);
        bfr.a(bky);
        long j = 0;
        long j2 = 0;
        for (String r = bky.r(); !TextUtils.isEmpty(r); r = bky.r()) {
            if (r.startsWith("X-TIMESTAMP-MAP")) {
                Matcher matcher = a.matcher(r);
                if (!matcher.find()) {
                    String valueOf = String.valueOf(r);
                    throw new ako(valueOf.length() == 0 ? new String("X-TIMESTAMP-MAP doesn't contain local timestamp: ") : "X-TIMESTAMP-MAP doesn't contain local timestamp: ".concat(valueOf));
                }
                Matcher matcher2 = b.matcher(r);
                if (!matcher2.find()) {
                    String valueOf2 = String.valueOf(r);
                    throw new ako(valueOf2.length() == 0 ? new String("X-TIMESTAMP-MAP doesn't contain media timestamp: ") : "X-TIMESTAMP-MAP doesn't contain media timestamp: ".concat(valueOf2));
                }
                long a3 = bfr.a(matcher.group(1));
                j = blj.d(Long.parseLong(matcher2.group(1)));
                j2 = a3;
            }
        }
        Matcher c2 = bfr.c(bky);
        if (c2 == null) {
            a(0);
        } else {
            long a4 = bfr.a(c2.group(1));
            long b2 = this.d.b(blj.e((j + a4) - j2));
            aov a5 = a(b2 - a4);
            this.e.a(this.g, this.h);
            a5.a(this.e, this.h);
            a5.a(b2, 1, this.h, 0, null);
        }
        return -1;
    }

    public final void a(long j, long j2) {
        throw new IllegalStateException();
    }

    public final boolean a(aoj aoj) {
        aoj.b(this.g, 0, 6, false);
        this.e.a(this.g, 6);
        if (bfr.b(this.e)) {
            return true;
        }
        aoj.b(this.g, 6, 3, false);
        this.e.a(this.g, 9);
        return bfr.b(this.e);
    }
}
