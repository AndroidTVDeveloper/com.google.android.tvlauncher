package p000;

import android.app.LoaderManager;
import android.content.Loader;
import android.os.Bundle;

/* renamed from: cqs */
/* compiled from: PG */
final class cqs implements LoaderManager.LoaderCallbacks {

    /* renamed from: a */
    private final /* synthetic */ cqy f7037a;

    public cqs(cqy cqy) {
        this.f7037a = cqy;
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        return new clc(this.f7037a.getContext());
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        this.f7037a.f7043a.mo3592a((String[]) obj);
    }

    public final void onLoaderReset(Loader loader) {
        this.f7037a.f7043a.mo3592a((String[]) null);
    }
}
