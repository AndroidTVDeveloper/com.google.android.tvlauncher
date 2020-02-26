package p000;

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

/* renamed from: cdt */
/* compiled from: PG */
public final class cdt implements cdw {

    /* renamed from: f */
    public static final String[] f5334f = {"key", "value"};

    /* renamed from: g */
    private static final Map f5335g = new C0067cl();

    /* renamed from: a */
    public final ContentResolver f5336a;

    /* renamed from: b */
    public final Uri f5337b;

    /* renamed from: c */
    public final Object f5338c = new Object();

    /* renamed from: d */
    public volatile Map f5339d;

    /* renamed from: e */
    public final List f5340e = new ArrayList();

    /* renamed from: h */
    private final ContentObserver f5341h = new cds(this);

    private cdt(ContentResolver contentResolver, Uri uri) {
        this.f5336a = contentResolver;
        this.f5337b = uri;
        contentResolver.registerContentObserver(uri, false, this.f5341h);
    }

    /* renamed from: a */
    static synchronized void m4589a() {
        synchronized (cdt.class) {
            for (cdt cdt : f5335g.values()) {
                cdt.f5336a.unregisterContentObserver(cdt.f5341h);
            }
            f5335g.clear();
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo2685a(String str) {
        Map map;
        Map map2 = this.f5339d;
        if (map2 == null) {
            synchronized (this.f5338c) {
                map2 = this.f5339d;
                if (map2 == null) {
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        map = (Map) cel.m4618a(new cdr(this));
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                    } catch (SQLiteException | IllegalStateException | SecurityException e) {
                        try {
                            Log.e("ConfigurationContentLoader", "PhenotypeFlag unable to load ContentProvider, using default values");
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                            map = null;
                        } catch (Throwable th) {
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                            throw th;
                        }
                    }
                    this.f5339d = map;
                    map2 = map;
                }
            }
        }
        if (map2 == null) {
            map2 = Collections.emptyMap();
        }
        return (String) map2.get(str);
    }

    /* renamed from: a */
    public static cdt m4588a(ContentResolver contentResolver, Uri uri) {
        cdt cdt;
        synchronized (cdt.class) {
            cdt = (cdt) f5335g.get(uri);
            if (cdt == null) {
                try {
                    cdt cdt2 = new cdt(contentResolver, uri);
                    try {
                        f5335g.put(uri, cdt2);
                    } catch (SecurityException e) {
                    }
                    cdt = cdt2;
                } catch (SecurityException e2) {
                }
            }
        }
        return cdt;
    }
}
