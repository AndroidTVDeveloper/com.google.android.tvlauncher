package p000;

import android.os.Build;
import java.util.Calendar;
import java.util.Locale;

/* renamed from: ph */
/* compiled from: PG */
public final class C0415ph {
    static {
        int i = Build.VERSION.SDK_INT;
    }

    /* renamed from: a */
    public static void m8184a(int i, int i2, String str) {
        String[] strArr = new String[((i2 - i) + 1)];
        for (int i3 = i; i3 <= i2; i3++) {
            strArr[i3 - i] = String.format(str, Integer.valueOf(i3));
        }
    }

    /* renamed from: a */
    public static Calendar m8182a(Calendar calendar, Locale locale) {
        if (calendar == null) {
            return Calendar.getInstance(locale);
        }
        long timeInMillis = calendar.getTimeInMillis();
        Calendar instance = Calendar.getInstance(locale);
        instance.setTimeInMillis(timeInMillis);
        return instance;
    }

    /* renamed from: a */
    public static C0414pg m8183a(Locale locale) {
        return new C0414pg(locale);
    }
}
