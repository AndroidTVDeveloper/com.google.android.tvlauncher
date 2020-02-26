package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.SharedPreferences;
import java.util.concurrent.TimeUnit;

/* renamed from: cam  reason: default package */
/* compiled from: PG */
final class cam extends byo implements cbx, bza {
    public static final long d = TimeUnit.HOURS.toMillis(12);
    public final SharedPreferences e;
    private final bze f;

    public final void g() {
    }

    public cam(dnj dnj, Application application, dff dff, dff dff2, SharedPreferences sharedPreferences) {
        super(dnj, application, dff, dff2, 1);
        this.e = sharedPreferences;
        this.f = bze.a(application);
    }

    public final void b(Activity activity) {
        this.f.b(this);
        c().a(new cal(this));
    }

    public final void f() {
        this.f.a(this);
    }

    public final void d() {
        this.f.b(this);
    }
}
