package defpackage;

import android.app.LoaderManager;
import android.content.Loader;
import android.os.Bundle;

/* renamed from: cqw  reason: default package */
/* compiled from: PG */
final class cqw implements LoaderManager.LoaderCallbacks {
    private final /* synthetic */ cqy a;

    public cqw(cqy cqy) {
        this.a = cqy;
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        return new ckh(this.a.getContext());
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        this.a.a.a((Boolean) obj);
    }

    public final void onLoaderReset(Loader loader) {
        this.a.a.a((Boolean) null);
    }
}
