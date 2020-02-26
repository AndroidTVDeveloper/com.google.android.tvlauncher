package defpackage;

import java.util.HashSet;

/* renamed from: akf  reason: default package */
/* compiled from: PG */
public final class akf {
    private static final HashSet a = new HashSet();
    private static String b = "goog.exo.core";

    public static synchronized String a() {
        String str;
        synchronized (akf.class) {
            str = b;
        }
        return str;
    }

    public static synchronized void a(String str) {
        synchronized (akf.class) {
            if (a.add(str)) {
                String str2 = b;
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 2 + str.length());
                sb.append(str2);
                sb.append(", ");
                sb.append(str);
                b = sb.toString();
            }
        }
    }
}
