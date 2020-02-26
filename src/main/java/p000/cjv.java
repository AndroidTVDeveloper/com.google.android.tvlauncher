package p000;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* renamed from: cjv */
/* compiled from: PG */
final class cjv extends ContentObserver {

    /* renamed from: a */
    private final /* synthetic */ cjw f5761a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cjv(cjw cjw, Handler handler) {
        super(handler);
        this.f5761a = cjw;
    }

    public final void onChange(boolean z) {
        this.f5761a.onContentChanged();
    }

    public final void onChange(boolean z, Uri uri) {
        onChange(z);
    }
}
