package p000;

import android.app.Activity;
import android.app.Application;
import android.content.SharedPreferences;
import java.util.concurrent.TimeUnit;

/* renamed from: cam */
/* compiled from: PG */
final class cam extends byo implements cbx, bza {

    /* renamed from: d */
    public static final long f5127d = TimeUnit.HOURS.toMillis(12);

    /* renamed from: e */
    public final SharedPreferences f5128e;

    /* renamed from: f */
    private final bze f5129f;

    /* renamed from: g */
    public final void mo2587g() {
    }

    public cam(dnj dnj, Application application, dff dff, dff dff2, SharedPreferences sharedPreferences) {
        super(dnj, application, dff, dff2, 1);
        this.f5128e = sharedPreferences;
        this.f5129f = bze.m4405a(application);
    }

    /* renamed from: b */
    public final void mo2561b(Activity activity) {
        this.f5129f.mo2565b(this);
        mo2548c().mo2629a(new cal(this));
    }

    /* renamed from: f */
    public final void mo2586f() {
        this.f5129f.mo2564a(this);
    }

    /* renamed from: d */
    public final void mo2549d() {
        this.f5129f.mo2565b(this);
    }
}
