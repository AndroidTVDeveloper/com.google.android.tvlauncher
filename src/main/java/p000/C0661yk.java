package p000;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;

/* renamed from: yk */
/* compiled from: PG */
public final class C0661yk {

    /* renamed from: a */
    public final ActivityManager f10818a;

    /* renamed from: b */
    public final C0663ym f10819b;

    /* renamed from: c */
    public float f10820c = 1.0f;

    static {
        int i = Build.VERSION.SDK_INT;
    }

    public C0661yk(Context context) {
        this.f10818a = (ActivityManager) context.getSystemService("activity");
        this.f10819b = new C0662yl(context.getResources().getDisplayMetrics());
        int i = Build.VERSION.SDK_INT;
        if (C0664yn.m8680a(this.f10818a)) {
            this.f10820c = 0.0f;
        }
    }
}
