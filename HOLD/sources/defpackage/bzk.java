package defpackage;

import android.app.Activity;
import android.text.TextUtils;

/* renamed from: bzk  reason: default package */
/* compiled from: PG */
final class bzk implements bzl {
    public final /* synthetic */ bzn a;

    public bzk(bzn bzn) {
        this.a = bzn;
    }

    public final void a(Activity activity) {
        cah cah;
        bzn bzn = this.a;
        Class<?> cls = activity.getClass();
        if (!TextUtils.isEmpty(null)) {
            String valueOf = String.valueOf((Object) null);
            String valueOf2 = String.valueOf(cls.getSimpleName());
            cah = new cah(valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2));
        } else {
            cah = new cah(cls.getSimpleName());
        }
        bzn.a(cah);
    }

    public final void b(Activity activity) {
        this.a.a((cah) null);
        if (this.a.f.get()) {
            this.a.c().a(new bzj(this));
        }
    }
}
