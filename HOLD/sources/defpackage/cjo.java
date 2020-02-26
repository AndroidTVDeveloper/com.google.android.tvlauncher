package defpackage;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import com.google.android.tvlauncher.clock.ClockView;

/* renamed from: cjo  reason: default package */
/* compiled from: PG */
public final class cjo extends ContentObserver {
    private final /* synthetic */ ClockView a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cjo(ClockView clockView, Handler handler) {
        super(handler);
        this.a = clockView;
    }

    public final void onChange(boolean z) {
        this.a.a();
    }

    public final void onChange(boolean z, Uri uri) {
        this.a.a();
    }
}
