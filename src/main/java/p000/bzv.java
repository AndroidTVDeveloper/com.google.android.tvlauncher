package p000;

import android.app.Activity;
import java.util.concurrent.TimeUnit;

/* renamed from: bzv */
/* compiled from: PG */
final class bzv implements bza {

    /* renamed from: a */
    public final /* synthetic */ bzz f5083a;

    public bzv(bzz bzz) {
        this.f5083a = bzz;
    }

    /* renamed from: b */
    public final void mo2561b(Activity activity) {
        String simpleName = activity.getClass().getSimpleName();
        this.f5083a.f5088b.mo2593a(3, simpleName);
        this.f5083a.mo2594a();
        bzz bzz = this.f5083a;
        bzz.f5090d = ((dhe) bzz.f5091e.mo2551a()).mo2633a(new bzu(this, simpleName), 10, TimeUnit.SECONDS);
    }
}
