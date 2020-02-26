package defpackage;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.StrictMode;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: cdt  reason: default package */
/* compiled from: PG */
public final class cdt implements cdw {
    public static final String[] f = {"key", "value"};
    private static final Map g = new cl();
    public final ContentResolver a;
    public final Uri b;
    public final Object c = new Object();
    public volatile Map d;
    public final List e = new ArrayList();
    private final ContentObserver h = new cds(this);

    private cdt(ContentResolver contentResolver, Uri uri) {
        this.a = contentResolver;
        this.b = uri;
        contentResolver.registerContentObserver(uri, false, this.h);
    }

    static synchronized void a() {
        synchronized (cdt.class) {
            for (cdt cdt : g.values()) {
                cdt.a.unregisterContentObserver(cdt.h);
            }
            g.clear();
        }
    }

    /* JADX INFO: finally extract failed */
    public final /* bridge */ /* synthetic */ Object a(String str) {
        Map map;
        Map map2 = this.d;
        if (map2 == null) {
            synchronized (this.c) {
                map2 = this.d;
                if (map2 == null) {
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        map = (Map) cel.a(new cdr(this));
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                    } catch (SQLiteException | IllegalStateException | SecurityException e2) {
                        try {
                            Log.e("ConfigurationContentLoader", "PhenotypeFlag unable to load ContentProvider, using default values");
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                            map = null;
                        } catch (Throwable th) {
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                            throw th;
                        }
                    }
                    this.d = map;
                    map2 = map;
                }
            }
        }
        if (map2 == null) {
            map2 = Collections.emptyMap();
        }
        return (String) map2.get(str);
    }

    public static cdt a(ContentResolver contentResolver, Uri uri) {
        cdt cdt;
        synchronized (cdt.class) {
            cdt = (cdt) g.get(uri);
            if (cdt == null) {
                try {
                    cdt cdt2 = new cdt(contentResolver, uri);
                    try {
                        g.put(uri, cdt2);
                    } catch (SecurityException e2) {
                    }
                    cdt = cdt2;
                } catch (SecurityException e3) {
                }
            }
        }
        return cdt;
    }
}
