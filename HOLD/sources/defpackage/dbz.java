package defpackage;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* renamed from: dbz  reason: default package */
/* compiled from: PG */
final class dbz extends ContentObserver {
    private final /* synthetic */ dcc a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dbz(dcc dcc, Handler handler) {
        super(handler);
        this.a = dcc;
    }

    public final void onChange(boolean z, Uri uri) {
        Uri uri2 = this.a.h;
        if (uri2 != null && uri2.equals(uri)) {
            this.a.a(false);
        }
    }
}
