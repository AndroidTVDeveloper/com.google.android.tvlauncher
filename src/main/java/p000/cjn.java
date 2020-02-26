package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.tvlauncher.clock.ClockView;

/* renamed from: cjn */
/* compiled from: PG */
public final class cjn extends BroadcastReceiver {

    /* renamed from: a */
    private final /* synthetic */ ClockView f5728a;

    public cjn(ClockView clockView) {
        this.f5728a = clockView;
    }

    public final void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if ("android.intent.action.TIME_SET".equals(action) || "android.intent.action.TIMEZONE_CHANGED".equals(action) || "android.intent.action.LOCALE_CHANGED".equals(action)) {
            this.f5728a.mo3252a();
        }
    }
}
