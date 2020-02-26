package p000;

import android.content.Loader;

/* renamed from: cqq */
/* compiled from: PG */
final /* synthetic */ class cqq implements dbb {

    /* renamed from: a */
    private final cqy f7035a;

    public cqq(cqy cqy) {
        this.f7035a = cqy;
    }

    /* renamed from: a */
    public final void mo2968a(dbc dbc) {
        cqy cqy = this.f7035a;
        cqy.f7048f = false;
        Loader loader = cqy.getLoaderManager().getLoader(0);
        if (loader != null && loader.isStarted()) {
            cqy.getLoaderManager().getLoader(0).forceLoad();
        }
    }
}
