package defpackage;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* renamed from: cjv  reason: default package */
/* compiled from: PG */
final class cjv extends ContentObserver {
    private final /* synthetic */ cjw a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cjv(cjw cjw, Handler handler) {
        super(handler);
        this.a = cjw;
    }

    public final void onChange(boolean z) {
        this.a.onContentChanged();
    }

    public final void onChange(boolean z, Uri uri) {
        onChange(z);
    }
}
