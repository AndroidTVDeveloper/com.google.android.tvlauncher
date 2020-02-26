package defpackage;

import android.app.LoaderManager;
import android.content.Loader;
import android.os.Bundle;

/* renamed from: cqs  reason: default package */
/* compiled from: PG */
final class cqs implements LoaderManager.LoaderCallbacks {
    private final /* synthetic */ cqy a;

    public cqs(cqy cqy) {
        this.a = cqy;
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        return new clc(this.a.getContext());
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        this.a.a.a((String[]) obj);
    }

    public final void onLoaderReset(Loader loader) {
        this.a.a.a((String[]) null);
    }
}
