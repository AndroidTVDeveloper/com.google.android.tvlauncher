package p000;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import com.google.android.tvlauncher.clock.ClockView;

/* renamed from: cjo */
/* compiled from: PG */
public final class cjo extends ContentObserver {

    /* renamed from: a */
    private final /* synthetic */ ClockView f5729a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cjo(ClockView clockView, Handler handler) {
        super(handler);
        this.f5729a = clockView;
    }

    public final void onChange(boolean z) {
        this.f5729a.mo3252a();
    }

    public final void onChange(boolean z, Uri uri) {
        this.f5729a.mo3252a();
    }
}
