package defpackage;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* renamed from: ckk  reason: default package */
/* compiled from: PG */
final class ckk extends ContentObserver {
    private final /* synthetic */ ckl a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ckk(ckl ckl, Handler handler) {
        super(handler);
        this.a = ckl;
    }

    public final void onChange(boolean z) {
        this.a.onContentChanged();
    }

    public final void onChange(boolean z, Uri uri) {
        onChange(z);
    }
}
