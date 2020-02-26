package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.tvlauncher.clock.ClockView;

/* renamed from: cjn  reason: default package */
/* compiled from: PG */
public final class cjn extends BroadcastReceiver {
    private final /* synthetic */ ClockView a;

    public cjn(ClockView clockView) {
        this.a = clockView;
    }

    public final void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if ("android.intent.action.TIME_SET".equals(action) || "android.intent.action.TIMEZONE_CHANGED".equals(action) || "android.intent.action.LOCALE_CHANGED".equals(action)) {
            this.a.a();
        }
    }
}
