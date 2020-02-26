package defpackage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: bfr  reason: default package */
/* compiled from: PG */
public final class bfr {
    private static final Pattern a = Pattern.compile("^NOTE([ \t].*)?$");

    public static Matcher c(bky bky) {
        String r;
        while (true) {
            String r2 = bky.r();
            if (r2 == null) {
                return null;
            }
            if (a.matcher(r2).matches()) {
                do {
                    r = bky.r();
                    if (r == null) {
                        break;
                    }
                } while (!r.isEmpty());
            } else {
                Matcher matcher = bfp.a.matcher(r2);
                if (matcher.matches()) {
                    return matcher;
                }
            }
        }
    }

    public static boolean b(bky bky) {
        String r = bky.r();
        return r != null && r.startsWith("WEBVTT");
    }

    public static float b(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static long a(String str) {
        String[] b = blm.b(str, "\\.");
        long j = 0;
        for (String parseLong : blm.a(b[0], ":")) {
            j = (j * 60) + Long.parseLong(parseLong);
        }
        long j2 = j * 1000;
        if (b.length == 2) {
            j2 += Long.parseLong(b[1]);
        }
        return j2 * 1000;
    }

    public static void a(bky bky) {
        int i = bky.b;
        if (!b(bky)) {
            bky.c(i);
            String valueOf = String.valueOf(bky.r());
            throw new ako(valueOf.length() == 0 ? new String("Expected WEBVTT. Got ") : "Expected WEBVTT. Got ".concat(valueOf));
        }
    }
}
