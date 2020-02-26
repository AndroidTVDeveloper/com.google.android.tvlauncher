package p000;

import android.app.LoaderManager;
import android.content.Loader;
import android.os.Bundle;

/* renamed from: cqu */
/* compiled from: PG */
final class cqu implements LoaderManager.LoaderCallbacks {

    /* renamed from: a */
    private final /* synthetic */ cqy f7039a;

    public cqu(cqy cqy) {
        this.f7039a = cqy;
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        return new ckl(this.f7039a.getContext());
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        this.f7039a.f7043a.mo3589a((ddw) obj);
    }

    public final void onLoaderReset(Loader loader) {
        this.f7039a.f7043a.mo3589a((ddw) null);
    }
}
