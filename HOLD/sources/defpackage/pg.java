package defpackage;

import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.Locale;

/* renamed from: pg  reason: default package */
/* compiled from: PG */
public final class pg {
    public final Locale a;
    public final String[] b;

    public pg(Locale locale) {
        this.a = locale;
        this.b = DateFormatSymbols.getInstance(locale).getShortMonths();
        Calendar instance = Calendar.getInstance(locale);
        ph.a(instance.getMinimum(5), instance.getMaximum(5), "%02d");
    }
}
