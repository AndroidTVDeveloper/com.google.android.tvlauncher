package p000;

import android.app.Activity;
import android.text.TextUtils;

/* renamed from: bzk */
/* compiled from: PG */
final class bzk implements bzl {

    /* renamed from: a */
    public final /* synthetic */ bzn f5051a;

    public bzk(bzn bzn) {
        this.f5051a = bzn;
    }

    /* renamed from: a */
    public final void mo2558a(Activity activity) {
        cah cah;
        bzn bzn = this.f5051a;
        Class<?> cls = activity.getClass();
        if (!TextUtils.isEmpty(null)) {
            String valueOf = String.valueOf((Object) null);
            String valueOf2 = String.valueOf(cls.getSimpleName());
            cah = new cah(valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2));
        } else {
            cah = new cah(cls.getSimpleName());
        }
        bzn.mo2583a(cah);
    }

    /* renamed from: b */
    public final void mo2561b(Activity activity) {
        this.f5051a.mo2583a((cah) null);
        if (this.f5051a.f5056f.get()) {
            this.f5051a.mo2548c().mo2629a(new bzj(this));
        }
    }
}
