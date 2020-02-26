package defpackage;

import java.io.Serializable;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: dgx  reason: default package */
/* compiled from: PG */
public final class dgx {
    public static boolean b(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    private static String a(int i, int i2, String str) {
        if (i < 0) {
            return a("%s (%s) must not be negative", str, Integer.valueOf(i));
        } else if (i2 >= 0) {
            return a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        } else {
            StringBuilder sb = new StringBuilder(26);
            sb.append("negative size: ");
            sb.append(i2);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public static void a(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException((String) obj);
        }
    }

    public static void a(int i, int i2) {
        String str;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                str = a("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else if (i2 < 0) {
                StringBuilder sb = new StringBuilder(26);
                sb.append("negative size: ");
                sb.append(i2);
                throw new IllegalArgumentException(sb.toString());
            } else {
                str = a("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(str);
        }
    }

    public static Object a(Object obj) {
        if (obj != null) {
            return obj;
        }
        throw null;
    }

    public static Object a(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException((String) obj2);
    }

    public static void b(int i, int i2) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(a(i, i2, "index"));
        }
    }

    public static void a(int i, int i2, int i3) {
        String str;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                str = a(i, i3, "start index");
            } else if (i2 < 0 || i2 > i3) {
                str = a(i2, i3, "end index");
            } else {
                str = a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(str);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.StringBuilder.append(java.lang.CharSequence, int, int):java.lang.StringBuilder}
     arg types: [java.lang.String, int, int]
     candidates:
      ClspMth{java.lang.StringBuilder.append(java.lang.CharSequence, int, int):java.lang.Appendable throws java.io.IOException}
      ClspMth{java.lang.StringBuilder.append(char[], int, int):java.lang.StringBuilder}
      ClspMth{java.lang.Appendable.append(java.lang.CharSequence, int, int):java.lang.Appendable throws java.io.IOException}
      ClspMth{java.lang.StringBuilder.append(java.lang.CharSequence, int, int):java.lang.StringBuilder} */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Throwable):void}
     arg types: [java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Exception]
     candidates:
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.Throwable, java.util.function.Supplier<java.lang.String>):void}
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Object[]):void}
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Object):void}
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Throwable):void} */
    public static String a(String str, Object... objArr) {
        int length;
        int length2;
        int indexOf;
        String str2;
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i2 >= length) {
                break;
            }
            Object obj = objArr[i2];
            try {
                str2 = String.valueOf(obj);
            } catch (Exception e) {
                String name = obj.getClass().getName();
                String hexString = Integer.toHexString(System.identityHashCode(obj));
                StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 1 + String.valueOf(hexString).length());
                sb.append(name);
                sb.append('@');
                sb.append(hexString);
                String sb2 = sb.toString();
                Logger logger = Logger.getLogger("com.google.common.base.Strings");
                Level level = Level.WARNING;
                String valueOf = String.valueOf(sb2);
                logger.logp(level, "com.google.common.base.Strings", "lenientToString", valueOf.length() == 0 ? new String("Exception during lenientFormat for ") : "Exception during lenientFormat for ".concat(valueOf), (Throwable) e);
                String name2 = e.getClass().getName();
                StringBuilder sb3 = new StringBuilder(String.valueOf(sb2).length() + 9 + String.valueOf(name2).length());
                sb3.append("<");
                sb3.append(sb2);
                sb3.append(" threw ");
                sb3.append(name2);
                sb3.append(">");
                str2 = sb3.toString();
            }
            objArr[i2] = str2;
            i2++;
        }
        StringBuilder sb4 = new StringBuilder(str.length() + (length << 4));
        int i3 = 0;
        while (true) {
            length2 = objArr.length;
            if (i >= length2 || (indexOf = str.indexOf("%s", i3)) == -1) {
                sb4.append((CharSequence) str, i3, str.length());
            } else {
                sb4.append((CharSequence) str, i3, indexOf);
                sb4.append(objArr[i]);
                i3 = indexOf + 2;
                i++;
            }
        }
        sb4.append((CharSequence) str, i3, str.length());
        if (i < length2) {
            sb4.append(" [");
            sb4.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb4.append(", ");
                sb4.append(objArr[i4]);
            }
            sb4.append(']');
        }
        return sb4.toString();
    }

    public static dff a(dff dff) {
        if ((dff instanceof dfh) || (dff instanceof dfg)) {
            return dff;
        }
        if (dff instanceof Serializable) {
            return new dfg(dff);
        }
        return new dfh(dff);
    }

    public static int a(int i) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i) * -862048943), 15)) * 461845907);
    }

    public static Object a(Object obj, int i) {
        if (obj != null) {
            return obj;
        }
        StringBuilder sb = new StringBuilder(20);
        sb.append("at index ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    public static dhb a(dgp dgp, Executor executor) {
        dhj dhj = new dhj(dgp);
        executor.execute(dhj);
        return dhj;
    }
}
