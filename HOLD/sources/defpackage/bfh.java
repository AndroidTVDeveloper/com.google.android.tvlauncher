package defpackage;

import java.util.regex.Pattern;

/* renamed from: bfh  reason: default package */
/* compiled from: PG */
final class bfh {
    public static final Pattern a = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
    public final bky b = new bky();
    public final StringBuilder c = new StringBuilder();

    public static String b(bky bky, StringBuilder sb) {
        boolean z = false;
        sb.setLength(0);
        int i = bky.b;
        int i2 = bky.c;
        while (i < i2 && !z) {
            char c2 = (char) bky.a[i];
            if ((c2 < 'A' || c2 > 'Z') && ((c2 < 'a' || c2 > 'z') && !((c2 >= '0' && c2 <= '9') || c2 == '#' || c2 == '-' || c2 == '.' || c2 == '_'))) {
                z = true;
            } else {
                i++;
                sb.append(c2);
            }
        }
        bky.d(i - bky.b);
        return sb.toString();
    }

    static String a(bky bky, StringBuilder sb) {
        a(bky);
        if (bky.b() == 0) {
            return null;
        }
        String b2 = b(bky, sb);
        if (!"".equals(b2)) {
            return b2;
        }
        int d = bky.d();
        StringBuilder sb2 = new StringBuilder(1);
        sb2.append((char) d);
        return sb2.toString();
    }

    static void a(bky bky) {
        boolean z = true;
        while (bky.b() > 0 && z) {
            int i = bky.b;
            byte[] bArr = bky.a;
            byte b2 = bArr[i];
            char c2 = (char) b2;
            if (c2 == 9 || c2 == 10 || c2 == 12 || c2 == 13 || c2 == ' ') {
                bky.d(1);
                z = true;
            } else {
                int i2 = bky.c;
                if (i + 2 <= i2) {
                    int i3 = i + 1;
                    if (b2 == 47) {
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
                            bky.d(i2 - bky.b);
                            z = true;
                        }
                    }
                }
                z = false;
            }
        }
    }
}
