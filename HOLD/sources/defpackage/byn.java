package defpackage;

import android.content.Context;
import android.os.Build;
import java.io.File;

/* renamed from: byn  reason: default package */
/* compiled from: PG */
public final class byn {
    private final Context a;
    private final Object b = new Object();
    private File c;

    public byn(Context context) {
        this.a = context.getApplicationContext();
    }

    public final File a() {
        File file;
        synchronized (this.b) {
            if (this.c == null) {
                int i = Build.VERSION.SDK_INT;
                this.c = this.a.getDataDir();
            }
            file = this.c;
        }
        return file;
    }
}
