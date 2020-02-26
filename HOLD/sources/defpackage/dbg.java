package defpackage;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* renamed from: dbg  reason: default package */
/* compiled from: PG */
final class dbg extends ContentObserver {
    private final /* synthetic */ dbh a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dbg(dbh dbh, Handler handler) {
        super(handler);
        this.a = dbh;
    }

    public final void onChange(boolean z, Uri uri) {
        synchronized (this.a.a) {
            this.a.b = false;
        }
    }
}
