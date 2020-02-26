package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;

/* renamed from: yk  reason: default package */
/* compiled from: PG */
public final class yk {
    public final ActivityManager a;
    public final ym b;
    public float c = 1.0f;

    static {
        int i = Build.VERSION.SDK_INT;
    }

    public yk(Context context) {
        this.a = (ActivityManager) context.getSystemService("activity");
        this.b = new yl(context.getResources().getDisplayMetrics());
        int i = Build.VERSION.SDK_INT;
        if (yn.a(this.a)) {
            this.c = 0.0f;
        }
    }
}
