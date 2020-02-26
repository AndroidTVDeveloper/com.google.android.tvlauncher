package p000;

import android.content.Context;
import com.google.android.tvlauncher.application.TvLauncherApplication;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* renamed from: cll */
/* compiled from: PG */
public final class cll {

    /* renamed from: a */
    public final Context f5916a;

    /* renamed from: b */
    public final clr f5917b;

    /* renamed from: c */
    public final cls f5918c;

    /* renamed from: d */
    public final dcy f5919d;

    public cll(Context context) {
        TvLauncherApplication tvLauncherApplication = (TvLauncherApplication) context.getApplicationContext();
        clr clr = tvLauncherApplication.f6367b;
        if (clr == null) {
            synchronized (tvLauncherApplication.f6366a) {
                clr = tvLauncherApplication.f6367b;
                if (clr == null) {
                    clr = new clr(tvLauncherApplication);
                    tvLauncherApplication.f6367b = clr;
                }
            }
        }
        ((TvLauncherApplication) context.getApplicationContext()).mo3215b();
        dcy c = ((TvLauncherApplication) context.getApplicationContext()).mo3216c();
        cls cls = new cls(TimeUnit.SECONDS, new LinkedBlockingQueue(128));
        this.f5916a = context.getApplicationContext();
        this.f5917b = clr;
        this.f5919d = c;
        this.f5918c = cls;
    }
}
