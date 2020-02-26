package defpackage;

import android.content.Context;
import android.database.ContentObserver;
import android.util.Log;

/* renamed from: cdz  reason: default package */
/* compiled from: PG */
final class cdz implements cdw {
    private static cdz b;
    public final Context a;
    private final ContentObserver c;

    private cdz() {
        this.a = null;
        this.c = null;
    }

    private cdz(Context context) {
        this.a = context;
        this.c = new cdy();
        context.getContentResolver().registerContentObserver(byi.a, true, this.c);
    }

    static synchronized void a() {
        synchronized (cdz.class) {
            if (!(b == null || b.a == null || b.c == null)) {
                b.a.getContentResolver().unregisterContentObserver(b.c);
            }
            b = null;
        }
    }

    /* renamed from: b */
    public final String a(String str) {
        if (this.a == null) {
            return null;
        }
        try {
            return (String) cel.a(new cdx(this, str));
        } catch (IllegalStateException | SecurityException e) {
            String valueOf = String.valueOf(str);
            Log.e("GservicesLoader", valueOf.length() == 0 ? new String("Unable to read GServices for: ") : "Unable to read GServices for: ".concat(valueOf), e);
            return null;
        }
    }

    static cdz a(Context context) {
        cdz cdz;
        synchronized (cdz.class) {
            if (b == null) {
                b = bq.a(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") != 0 ? new cdz() : new cdz(context);
            }
            cdz = b;
        }
        return cdz;
    }
}
