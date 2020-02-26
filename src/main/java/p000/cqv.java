package p000;

import android.app.LoaderManager;
import android.content.Loader;
import android.os.Bundle;

/* renamed from: cqv */
/* compiled from: PG */
final class cqv implements LoaderManager.LoaderCallbacks {

    /* renamed from: a */
    private final /* synthetic */ cqy f7040a;

    public cqv(cqy cqy) {
        this.f7040a = cqy;
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        return new ckf(this.f7040a.getContext());
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        this.f7040a.f7043a.mo3591a((Integer) obj);
    }

    public final void onLoaderReset(Loader loader) {
        this.f7040a.f7043a.mo3591a((Integer) null);
    }
}
