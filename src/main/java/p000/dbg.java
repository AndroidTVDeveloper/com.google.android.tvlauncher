package p000;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* renamed from: dbg */
/* compiled from: PG */
final class dbg extends ContentObserver {

    /* renamed from: a */
    private final /* synthetic */ dbh f8142a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dbg(dbh dbh, Handler handler) {
        super(handler);
        this.f8142a = dbh;
    }

    public final void onChange(boolean z, Uri uri) {
        synchronized (this.f8142a.f8143a) {
            this.f8142a.f8144b = false;
        }
    }
}
