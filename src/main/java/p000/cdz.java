package p000;

import android.content.Context;
import android.database.ContentObserver;
import android.util.Log;

/* renamed from: cdz */
/* compiled from: PG */
final class cdz implements cdw {

    /* renamed from: b */
    private static cdz f5344b;

    /* renamed from: a */
    public final Context f5345a;

    /* renamed from: c */
    private final ContentObserver f5346c;

    private cdz() {
        this.f5345a = null;
        this.f5346c = null;
    }

    private cdz(Context context) {
        this.f5345a = context;
        this.f5346c = new cdy();
        context.getContentResolver().registerContentObserver(byi.f5004a, true, this.f5346c);
    }

    /* renamed from: a */
    static synchronized void m4596a() {
        synchronized (cdz.class) {
            if (!(f5344b == null || f5344b.f5345a == null || f5344b.f5346c == null)) {
                f5344b.f5345a.getContentResolver().unregisterContentObserver(f5344b.f5346c);
            }
            f5344b = null;
        }
    }

    /* renamed from: b */
    public final String mo2685a(String str) {
        if (this.f5345a == null) {
            return null;
        }
        try {
            return (String) cel.m4618a(new cdx(this, str));
        } catch (IllegalStateException | SecurityException e) {
            String valueOf = String.valueOf(str);
            Log.e("GservicesLoader", valueOf.length() == 0 ? new String("Unable to read GServices for: ") : "Unable to read GServices for: ".concat(valueOf), e);
            return null;
        }
    }

    /* renamed from: a */
    static cdz m4595a(Context context) {
        cdz cdz;
        synchronized (cdz.class) {
            if (f5344b == null) {
                f5344b = C0045bq.m3940a(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") != 0 ? new cdz() : new cdz(context);
            }
            cdz = f5344b;
        }
        return cdz;
    }
}
