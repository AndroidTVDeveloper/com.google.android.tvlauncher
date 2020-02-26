package defpackage;

import android.app.LoaderManager;
import android.content.Loader;
import android.os.Bundle;

/* renamed from: cqu  reason: default package */
/* compiled from: PG */
final class cqu implements LoaderManager.LoaderCallbacks {
    private final /* synthetic */ cqy a;

    public cqu(cqy cqy) {
        this.a = cqy;
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        return new ckl(this.a.getContext());
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        this.a.a.a((ddw) obj);
    }

    public final void onLoaderReset(Loader loader) {
        this.a.a.a((ddw) null);
    }
}
