package p000;

import java.util.HashSet;

/* renamed from: akf */
/* compiled from: PG */
public final class akf {

    /* renamed from: a */
    private static final HashSet f542a = new HashSet();

    /* renamed from: b */
    private static String f543b = "goog.exo.core";

    /* renamed from: a */
    public static synchronized String m725a() {
        String str;
        synchronized (akf.class) {
            str = f543b;
        }
        return str;
    }

    /* renamed from: a */
    public static synchronized void m726a(String str) {
        synchronized (akf.class) {
            if (f542a.add(str)) {
                String str2 = f543b;
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 2 + str.length());
                sb.append(str2);
                sb.append(", ");
                sb.append(str);
                f543b = sb.toString();
            }
        }
    }
}
