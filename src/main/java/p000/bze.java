package p000;

import android.app.Application;

/* renamed from: bze */
/* compiled from: PG */
public final class bze {

    /* renamed from: a */
    public static volatile bze f5034a;

    /* renamed from: b */
    public final bzg f5035b = new bzg();

    private bze() {
    }

    /* renamed from: a */
    public static bze m4405a(Application application) {
        if (f5034a == null) {
            synchronized (bze.class) {
                if (f5034a == null) {
                    bze bze = new bze();
                    bzg bzg = bze.f5035b;
                    application.registerActivityLifecycleCallbacks(bzg.f5046a);
                    application.registerComponentCallbacks(bzg.f5046a);
                    f5034a = bze;
                }
            }
        }
        return f5034a;
    }

    /* renamed from: a */
    public final void mo2564a(bzd bzd) {
        bzg bzg = this.f5035b;
        cev.m4629a(bzd);
        bzg.f5046a.f5036a.add(bzd);
    }

    /* renamed from: b */
    public final void mo2565b(bzd bzd) {
        bzg bzg = this.f5035b;
        cev.m4629a(bzd);
        bzg.f5046a.f5036a.remove(bzd);
    }
}
