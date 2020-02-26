package defpackage;

import android.content.Context;
import com.google.android.tvlauncher.application.TvLauncherApplication;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* renamed from: cll  reason: default package */
/* compiled from: PG */
public final class cll {
    public final Context a;
    public final clr b;
    public final cls c;
    public final dcy d;

    public cll(Context context) {
        TvLauncherApplication tvLauncherApplication = (TvLauncherApplication) context.getApplicationContext();
        clr clr = tvLauncherApplication.b;
        if (clr == null) {
            synchronized (tvLauncherApplication.a) {
                clr = tvLauncherApplication.b;
                if (clr == null) {
                    clr = new clr(tvLauncherApplication);
                    tvLauncherApplication.b = clr;
                }
            }
        }
        ((TvLauncherApplication) context.getApplicationContext()).b();
        dcy c2 = ((TvLauncherApplication) context.getApplicationContext()).c();
        cls cls = new cls(TimeUnit.SECONDS, new LinkedBlockingQueue(128));
        this.a = context.getApplicationContext();
        this.b = clr;
        this.d = c2;
        this.c = cls;
    }
}
