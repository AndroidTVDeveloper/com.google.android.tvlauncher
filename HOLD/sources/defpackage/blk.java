package defpackage;

import android.net.Uri;
import android.os.Trace;
import android.text.TextUtils;
import java.util.ArrayDeque;

/* renamed from: blk  reason: default package */
/* compiled from: PG */
public final class blk {
    public blk() {
        this((byte) 0);
    }

    public blk(byte b) {
        new ArrayDeque();
    }

    public static void a(String str) {
        if (blm.a >= 18) {
            Trace.beginSection(str);
        }
    }

    public static void a() {
        if (blm.a >= 18) {
            Trace.endSection();
        }
    }

    private static int[] b(String str) {
        int i;
        int[] iArr = new int[4];
        if (!TextUtils.isEmpty(str)) {
            int length = str.length();
            int indexOf = str.indexOf(35);
            if (indexOf != -1) {
                length = indexOf;
            }
            int indexOf2 = str.indexOf(63);
            if (indexOf2 == -1 || indexOf2 > length) {
                indexOf2 = length;
            }
            int indexOf3 = str.indexOf(47);
            if (indexOf3 == -1 || indexOf3 > indexOf2) {
                indexOf3 = indexOf2;
            }
            int indexOf4 = str.indexOf(58);
            if (indexOf4 > indexOf3) {
                indexOf4 = -1;
            }
            int i2 = indexOf4 + 2;
            if (i2 < indexOf2 && str.charAt(indexOf4 + 1) == '/' && str.charAt(i2) == '/') {
                i = str.indexOf(47, indexOf4 + 3);
                if (i == -1 || i > indexOf2) {
                    i = indexOf2;
                }
            } else {
                i = indexOf4 + 1;
            }
            iArr[0] = indexOf4;
            iArr[1] = i;
            iArr[2] = indexOf2;
            iArr[3] = length;
            return iArr;
        }
        iArr[0] = -1;
        return iArr;
    }

    private static String a(StringBuilder sb, int i, int i2) {
        int i3;
        if (i >= i2) {
            return sb.toString();
        }
        if (sb.charAt(i) == '/') {
            i++;
        }
        int i4 = i;
        int i5 = i2;
        int i6 = i4;
        while (i6 <= i5) {
            if (i6 == i5) {
                i3 = i6;
            } else if (sb.charAt(i6) != '/') {
                i6++;
            } else {
                i3 = i6 + 1;
            }
            int i7 = i4 + 1;
            if (i6 == i7 && sb.charAt(i4) == '.') {
                sb.delete(i4, i3);
                i5 -= i3 - i4;
            } else if (i6 == i4 + 2 && sb.charAt(i4) == '.' && sb.charAt(i7) == '.') {
                int lastIndexOf = sb.lastIndexOf("/", i4 - 2) + 1;
                int i8 = lastIndexOf > i ? lastIndexOf : i;
                sb.delete(i8, i3);
                i5 -= i3 - i8;
                i4 = lastIndexOf;
            } else {
                i4 = i6 + 1;
            }
            i6 = i4;
        }
        return sb.toString();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.StringBuilder.append(java.lang.CharSequence, int, int):java.lang.StringBuilder}
     arg types: [java.lang.String, int, int]
     candidates:
      ClspMth{java.lang.StringBuilder.append(java.lang.CharSequence, int, int):java.lang.Appendable throws java.io.IOException}
      ClspMth{java.lang.StringBuilder.append(char[], int, int):java.lang.StringBuilder}
      ClspMth{java.lang.Appendable.append(java.lang.CharSequence, int, int):java.lang.Appendable throws java.io.IOException}
      ClspMth{java.lang.StringBuilder.append(java.lang.CharSequence, int, int):java.lang.StringBuilder} */
    public static String b(String str, String str2) {
        int i;
        StringBuilder sb = new StringBuilder();
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        int[] b = b(str2);
        if (b[0] != -1) {
            sb.append(str2);
            a(sb, b[1], b[2]);
            return sb.toString();
        }
        int[] b2 = b(str);
        if (b[3] == 0) {
            sb.append((CharSequence) str, 0, b2[3]);
            sb.append(str2);
            return sb.toString();
        } else if (b[2] == 0) {
            sb.append((CharSequence) str, 0, b2[2]);
            sb.append(str2);
            return sb.toString();
        } else if (b[1] != 0) {
            int i2 = b2[0] + 1;
            sb.append((CharSequence) str, 0, i2);
            sb.append(str2);
            return a(sb, b[1] + i2, i2 + b[2]);
        } else if (str2.charAt(0) == '/') {
            sb.append((CharSequence) str, 0, b2[1]);
            sb.append(str2);
            int i3 = b2[1];
            return a(sb, i3, b[2] + i3);
        } else {
            int i4 = b2[0];
            int i5 = b2[1];
            if (i4 + 2 >= i5 || i5 != b2[2]) {
                int lastIndexOf = str.lastIndexOf(47, b2[2] - 1);
                if (lastIndexOf != -1) {
                    i = lastIndexOf + 1;
                } else {
                    i = b2[1];
                }
                sb.append((CharSequence) str, 0, i);
                sb.append(str2);
                return a(sb, b2[1], i + b[2]);
            }
            sb.append((CharSequence) str, 0, i5);
            sb.append('/');
            sb.append(str2);
            int i6 = b2[1];
            return a(sb, i6, b[2] + i6 + 1);
        }
    }

    public static Uri a(String str, String str2) {
        return Uri.parse(b(str, str2));
    }
}
