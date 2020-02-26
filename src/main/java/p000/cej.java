package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.StrictMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: cej */
/* compiled from: PG */
public final class cej implements cdw {

    /* renamed from: d */
    private static final Map f5369d = new C0067cl();

    /* renamed from: a */
    public final Object f5370a = new Object();

    /* renamed from: b */
    public volatile Map f5371b;

    /* renamed from: c */
    public final List f5372c = new ArrayList();

    /* renamed from: e */
    private final SharedPreferences f5373e;

    /* renamed from: f */
    private final SharedPreferences.OnSharedPreferenceChangeListener f5374f = new cei(this);

    private cej(SharedPreferences sharedPreferences) {
        this.f5373e = sharedPreferences;
        sharedPreferences.registerOnSharedPreferenceChangeListener(this.f5374f);
    }

    /* renamed from: a */
    static synchronized void m4616a() {
        synchronized (cej.class) {
            for (cej cej : f5369d.values()) {
                cej.f5373e.unregisterOnSharedPreferenceChangeListener(cej.f5374f);
            }
            f5369d.clear();
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public final Object mo2685a(String str) {
        Map<String, ?> map = this.f5371b;
        if (map == null) {
            synchronized (this.f5370a) {
                map = this.f5371b;
                if (map == null) {
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        Map<String, ?> all = this.f5373e.getAll();
                        this.f5371b = all;
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
    /* renamed from: a */
    static cej m4615a(Context context, String str) {
        cej cej;
        SharedPreferences sharedPreferences;
        bym.m4380a();
        if (!str.startsWith("direct_boot:")) {
            int i = Build.VERSION.SDK_INT;
            if (!bym.m4382b(context)) {
                return null;
            }
        }
        synchronized (cej.class) {
            cej = (cej) f5369d.get(str);
            if (cej == null) {
                StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                try {
                    if (str.startsWith("direct_boot:")) {
                        bym.m4380a();
                        sharedPreferences = context.createDeviceProtectedStorageContext().getSharedPreferences(str.substring(12), 0);
                    } else {
                        sharedPreferences = context.getSharedPreferences(str, 0);
                    }
                    StrictMode.setThreadPolicy(allowThreadDiskReads);
                    cej = new cej(sharedPreferences);
                    f5369d.put(str, cej);
                } catch (Throwable th) {
                    StrictMode.setThreadPolicy(allowThreadDiskReads);
                    throw th;
                }
            }
        }
        return cej;
    }
}
