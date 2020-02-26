package defpackage;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* renamed from: cvb  reason: default package */
/* compiled from: PG */
final class cvb extends ContentObserver {
    private final /* synthetic */ cvf a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cvb(cvf cvf, Handler handler) {
        super(handler);
        this.a = cvf;
    }

    public final void onChange(boolean z) {
        onChange(z, null);
    }

    public final void onChange(boolean z, Uri uri) {
        int match = cvf.b.match(uri);
        if (match == 1 || match == 2) {
            this.a.a();
        }
    }
}
