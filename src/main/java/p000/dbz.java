package p000;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* renamed from: dbz */
/* compiled from: PG */
final class dbz extends ContentObserver {

    /* renamed from: a */
    private final /* synthetic */ dcc f8194a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dbz(dcc dcc, Handler handler) {
        super(handler);
        this.f8194a = dcc;
    }

    public final void onChange(boolean z, Uri uri) {
        Uri uri2 = this.f8194a.f8205h;
        if (uri2 != null && uri2.equals(uri)) {
            this.f8194a.mo4088a(false);
        }
    }
}
