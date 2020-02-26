package p000;

import java.util.regex.Pattern;

/* renamed from: bfh */
/* compiled from: PG */
final class bfh {

    /* renamed from: a */
    public static final Pattern f3671a = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* renamed from: b */
    public final bky f3672b = new bky();

    /* renamed from: c */
    public final StringBuilder f3673c = new StringBuilder();

    /* renamed from: b */
    public static String m3051b(bky bky, StringBuilder sb) {
        boolean z = false;
        sb.setLength(0);
        int i = bky.f4259b;
        int i2 = bky.f4260c;
        while (i < i2 && !z) {
            char c = (char) bky.f4258a[i];
            if ((c < 'A' || c > 'Z') && ((c < 'a' || c > 'z') && !((c >= '0' && c <= '9') || c == '#' || c == '-' || c == '.' || c == '_'))) {
                z = true;
            } else {
                i++;
                sb.append(c);
            }
        }
        bky.mo2075d(i - bky.f4259b);
        return sb.toString();
    }

    /* renamed from: a */
    static String m3049a(bky bky, StringBuilder sb) {
        m3050a(bky);
        if (bky.mo2070b() == 0) {
            return null;
        }
        String b = m3051b(bky, sb);
        if (!"".equals(b)) {
            return b;
        }
        int d = bky.mo2074d();
        StringBuilder sb2 = new StringBuilder(1);
        sb2.append((char) d);
        return sb2.toString();
    }

    /* renamed from: a */
    static void m3050a(bky bky) {
        boolean z = true;
        while (bky.mo2070b() > 0 && z) {
            int i = bky.f4259b;
            byte[] bArr = bky.f4258a;
            byte b = bArr[i];
            char c = (char) b;
            if (c == 9 || c == 10 || c == 12 || c == 13 || c == ' ') {
                bky.mo2075d(1);
                z = true;
            } else {
                int i2 = bky.f4260c;
                if (i + 2 <= i2) {
                    int i3 = i + 1;
                    if (b == 47) {
                        int i4 = i3 + 1;
                        if (bArr[i3] == 42) {
                            while (true) {
                                int i5 = i4 + 1;
                                if (i5 >= i2) {
                                    break;
                                } else if (((char) bArr[i4]) == '*' && ((char) bArr[i5]) == '/') {
                                    i4 = i5 + 1;
                                    i2 = i4;
                                } else {
                                    i4 = i5;
                                }
                            }
                            bky.mo2075d(i2 - bky.f4259b);
                            z = true;
                        }
                    }
                }
                z = false;
            }
        }
    }
}
