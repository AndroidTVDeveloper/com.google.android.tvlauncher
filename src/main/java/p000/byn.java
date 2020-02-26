package p000;

import android.content.Context;
import android.os.Build;
import java.io.File;

/* renamed from: byn */
/* compiled from: PG */
public final class byn {

    /* renamed from: a */
    private final Context f5022a;

    /* renamed from: b */
    private final Object f5023b = new Object();

    /* renamed from: c */
    private File f5024c;

    public byn(Context context) {
        this.f5022a = context.getApplicationContext();
    }

    /* renamed from: a */
    public final File mo2542a() {
        File file;
        synchronized (this.f5023b) {
            if (this.f5024c == null) {
                int i = Build.VERSION.SDK_INT;
                this.f5024c = this.f5022a.getDataDir();
            }
            file = this.f5024c;
        }
        return file;
    }
}
