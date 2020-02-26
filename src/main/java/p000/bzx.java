package p000;

import android.app.Activity;
import java.util.concurrent.TimeUnit;

/* renamed from: bzx */
/* compiled from: PG */
final class bzx implements bzb {

    /* renamed from: a */
    public final /* synthetic */ bzz f5086a;

    public bzx(bzz bzz) {
        this.f5086a = bzz;
    }

    /* renamed from: a */
    public final void mo2562a(Activity activity) {
        String simpleName = activity.getClass().getSimpleName();
        this.f5086a.f5088b.mo2593a(4, simpleName);
        this.f5086a.mo2594a();
        bzz bzz = this.f5086a;
        bzz.f5089c = ((dhe) bzz.f5091e.mo2551a()).mo2633a(new bzw(this, simpleName), 10, TimeUnit.SECONDS);
    }
}
