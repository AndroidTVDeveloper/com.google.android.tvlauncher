package p000;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* renamed from: ckk */
/* compiled from: PG */
final class ckk extends ContentObserver {

    /* renamed from: a */
    private final /* synthetic */ ckl f5817a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ckk(ckl ckl, Handler handler) {
        super(handler);
        this.f5817a = ckl;
    }

    public final void onChange(boolean z) {
        this.f5817a.onContentChanged();
    }

    public final void onChange(boolean z, Uri uri) {
        onChange(z);
    }
}
