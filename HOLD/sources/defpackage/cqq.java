package defpackage;

import android.content.Loader;

/* renamed from: cqq  reason: default package */
/* compiled from: PG */
final /* synthetic */ class cqq implements dbb {
    private final cqy a;

    public cqq(cqy cqy) {
        this.a = cqy;
    }

    public final void a(dbc dbc) {
        cqy cqy = this.a;
        cqy.f = false;
        Loader loader = cqy.getLoaderManager().getLoader(0);
        if (loader != null && loader.isStarted()) {
            cqy.getLoaderManager().getLoader(0).forceLoad();
        }
    }
}
