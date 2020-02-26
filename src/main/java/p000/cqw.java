package p000;

import android.app.LoaderManager;
import android.content.Loader;
import android.os.Bundle;

/* renamed from: cqw */
/* compiled from: PG */
final class cqw implements LoaderManager.LoaderCallbacks {

    /* renamed from: a */
    private final /* synthetic */ cqy f7041a;

    public cqw(cqy cqy) {
        this.f7041a = cqy;
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        return new ckh(this.f7041a.getContext());
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        this.f7041a.f7043a.mo3590a((Boolean) obj);
    }

    public final void onLoaderReset(Loader loader) {
        this.f7041a.f7043a.mo3590a((Boolean) null);
    }
}
