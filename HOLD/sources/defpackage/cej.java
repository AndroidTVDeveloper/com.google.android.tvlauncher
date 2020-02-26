package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.StrictMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: cej  reason: default package */
/* compiled from: PG */
public final class cej implements cdw {
    private static final Map d = new cl();
    public final Object a = new Object();
    public volatile Map b;
    public final List c = new ArrayList();
    private final SharedPreferences e;
    private final SharedPreferences.OnSharedPreferenceChangeListener f = new cei(this);

    private cej(SharedPreferences sharedPreferences) {
        this.e = sharedPreferences;
        sharedPreferences.registerOnSharedPreferenceChangeListener(this.f);
    }

    static synchronized void a() {
        synchronized (cej.class) {
            for (cej cej : d.values()) {
                cej.e.unregisterOnSharedPreferenceChangeListener(cej.f);
            }
            d.clear();
        }
    }

    /* JADX INFO: finally extract failed */
    public final Object a(String str) {
        Map<String, ?> map = this.b;
        if (map == null) {
            synchronized (this.a) {
                map = this.b;
                if (map == null) {
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        Map<String, ?> all = this.e.getAll();
                        this.b = all;
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                        map = all;
                    } catch (Throwable th) {
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                        throw th;
                    }
                }
            }
        }
        if (map != null) {
            return map.get(str);
        }
        return null;
    }

    /* JADX INFO: finally extract failed */
    static cej a(Context context, String str) {
        cej cej;
        SharedPreferences sharedPreferences;
        bym.a();
        if (!str.startsWith("direct_boot:")) {
            int i = Build.VERSION.SDK_INT;
            if (!bym.b(context)) {
                return null;
            }
        }
        synchronized (cej.class) {
            cej = (cej) d.get(str);
            if (cej == null) {
                StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                try {
                    if (str.startsWith("direct_boot:")) {
                        bym.a();
                        sharedPreferences = context.createDeviceProtectedStorageContext().getSharedPreferences(str.substring(12), 0);
                    } else {
                        sharedPreferences = context.getSharedPreferences(str, 0);
                    }
                    StrictMode.setThreadPolicy(allowThreadDiskReads);
                    cej = new cej(sharedPreferences);
                    d.put(str, cej);
                } catch (Throwable th) {
                    StrictMode.setThreadPolicy(allowThreadDiskReads);
                    throw th;
                }
            }
        }
        return cej;
    }
}
