package defpackage;

import android.app.Application;

/* renamed from: bze  reason: default package */
/* compiled from: PG */
public final class bze {
    public static volatile bze a;
    public final bzg b = new bzg();

    private bze() {
    }

    public static bze a(Application application) {
        if (a == null) {
            synchronized (bze.class) {
                if (a == null) {
                    bze bze = new bze();
                    bzg bzg = bze.b;
                    application.registerActivityLifecycleCallbacks(bzg.a);
                    application.registerComponentCallbacks(bzg.a);
                    a = bze;
                }
            }
        }
        return a;
    }

    public final void a(bzd bzd) {
        bzg bzg = this.b;
        cev.a(bzd);
        bzg.a.a.add(bzd);
    }

    public final void b(bzd bzd) {
        bzg bzg = this.b;
        cev.a(bzd);
        bzg.a.a.remove(bzd);
    }
}
