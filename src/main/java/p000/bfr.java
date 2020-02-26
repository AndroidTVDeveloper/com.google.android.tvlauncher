package p000;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: bfr */
/* compiled from: PG */
public final class bfr {

    /* renamed from: a */
    private static final Pattern f3716a = Pattern.compile("^NOTE([ \t].*)?$");

    /* renamed from: c */
    public static Matcher m3072c(bky bky) {
        String r;
        while (true) {
            String r2 = bky.mo2091r();
            if (r2 == null) {
                return null;
            }
            if (f3716a.matcher(r2).matches()) {
                do {
                    r = bky.mo2091r();
                    if (r == null) {
                        break;
                    }
                } while (!r.isEmpty());
            } else {
                Matcher matcher = bfp.f3708a.matcher(r2);
                if (matcher.matches()) {
                    return matcher;
                }
            }
        }
    }

    /* renamed from: b */
    public static boolean m3071b(bky bky) {
        String r = bky.mo2091r();
        return r != null && r.startsWith("WEBVTT");
    }

    /* renamed from: b */
    public static float m3070b(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    /* renamed from: a */
    public static long m3068a(String str) {
        String[] b = blm.m3670b(str, "\\.");
        long j = 0;
        for (String parseLong : blm.m3658a(b[0], ":")) {
            j = (j * 60) + Long.parseLong(parseLong);
        }
        long j2 = j * 1000;
        if (b.length == 2) {
            j2 += Long.parseLong(b[1]);
        }
        return j2 * 1000;
    }

    /* renamed from: a */
    public static void m3069a(bky bky) {
        int i = bky.f4259b;
        if (!m3071b(bky)) {
            bky.mo2073c(i);
            String valueOf = String.valueOf(bky.mo2091r());
            throw new ako(valueOf.length() == 0 ? new String("Expected WEBVTT. Got ") : "Expected WEBVTT. Got ".concat(valueOf));
        }
    }
}
