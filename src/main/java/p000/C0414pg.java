package p000;

import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.Locale;

/* renamed from: pg */
/* compiled from: PG */
public final class C0414pg {

    /* renamed from: a */
    public final Locale f10142a;

    /* renamed from: b */
    public final String[] f10143b;

    public C0414pg(Locale locale) {
        this.f10142a = locale;
        this.f10143b = DateFormatSymbols.getInstance(locale).getShortMonths();
        Calendar instance = Calendar.getInstance(locale);
        C0415ph.m8184a(instance.getMinimum(5), instance.getMaximum(5), "%02d");
    }
}
