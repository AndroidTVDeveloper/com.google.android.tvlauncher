package p000;

import android.app.LoaderManager;
import android.content.Loader;
import android.graphics.drawable.Drawable;
import android.os.Bundle;

/* renamed from: cqt */
/* compiled from: PG */
final class cqt implements LoaderManager.LoaderCallbacks {

    /* renamed from: a */
    private final /* synthetic */ cqy f7038a;

    public cqt(cqy cqy) {
        this.f7038a = cqy;
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        return new clb(this.f7038a.getContext());
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        this.f7038a.f7043a.mo3588a((Drawable) obj);
    }

    public final void onLoaderReset(Loader loader) {
        this.f7038a.f7043a.mo3588a((Drawable) null);
    }
}
