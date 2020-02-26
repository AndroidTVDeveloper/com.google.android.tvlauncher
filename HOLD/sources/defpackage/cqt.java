package defpackage;

import android.app.LoaderManager;
import android.content.Loader;
import android.graphics.drawable.Drawable;
import android.os.Bundle;

/* renamed from: cqt  reason: default package */
/* compiled from: PG */
final class cqt implements LoaderManager.LoaderCallbacks {
    private final /* synthetic */ cqy a;

    public cqt(cqy cqy) {
        this.a = cqy;
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        return new clb(this.a.getContext());
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        this.a.a.a((Drawable) obj);
    }

    public final void onLoaderReset(Loader loader) {
        this.a.a.a((Drawable) null);
    }
}
