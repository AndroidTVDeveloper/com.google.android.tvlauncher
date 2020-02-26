package defpackage;

import android.util.Log;
import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.tvlauncher.notifications.NotificationsPanelView;

/* renamed from: cym  reason: default package */
/* compiled from: PG */
public final class cym implements ViewTreeObserver.OnGlobalFocusChangeListener {
    private final /* synthetic */ NotificationsPanelView a;

    public cym(NotificationsPanelView notificationsPanelView) {
        this.a = notificationsPanelView;
    }

    public final void onGlobalFocusChanged(View view, View view2) {
        cyo cyo = this.a.O;
        if (cyo != null) {
            cyc cyc = (cyc) cyo;
            cyc.c.removeCallbacks(cyc.d);
            if (cyc.b.l()) {
                Log.w("NotifsPanelAdapter", "onFocusChanged: still computing layout => scheduling");
                cyc.c.post(cyc.d);
                return;
            }
            cyc.d.run();
        }
    }
}
