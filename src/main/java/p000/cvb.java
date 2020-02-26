package p000;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* renamed from: cvb */
/* compiled from: PG */
final class cvb extends ContentObserver {

    /* renamed from: a */
    private final /* synthetic */ cvf f7618a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cvb(cvf cvf, Handler handler) {
        super(handler);
        this.f7618a = cvf;
    }

    public final void onChange(boolean z) {
        onChange(z, null);
    }

    public final void onChange(boolean z, Uri uri) {
        int match = cvf.f7624b.match(uri);
        if (match == 1 || match == 2) {
            this.f7618a.mo3802a();
        }
    }
}
