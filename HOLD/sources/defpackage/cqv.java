package defpackage;

import android.app.LoaderManager;
import android.content.Loader;
import android.os.Bundle;

/* renamed from: cqv  reason: default package */
/* compiled from: PG */
final class cqv implements LoaderManager.LoaderCallbacks {
    private final /* synthetic */ cqy a;

    public cqv(cqy cqy) {
        this.a = cqy;
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        return new ckf(this.a.getContext());
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        this.a.a.a((Integer) obj);
    }

    public final void onLoaderReset(Loader loader) {
        this.a.a.a((Integer) null);
    }
}
