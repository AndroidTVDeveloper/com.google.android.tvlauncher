package p000;

import android.util.Log;
import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.tvlauncher.notifications.NotificationsPanelView;

/* renamed from: cym */
/* compiled from: PG */
public final class cym implements ViewTreeObserver.OnGlobalFocusChangeListener {

    /* renamed from: a */
    private final /* synthetic */ NotificationsPanelView f7923a;

    public cym(NotificationsPanelView notificationsPanelView) {
        this.f7923a = notificationsPanelView;
    }

    public final void onGlobalFocusChanged(View view, View view2) {
        cyo cyo = this.f7923a.f6665O;
        if (cyo != null) {
            cyc cyc = (cyc) cyo;
            cyc.f7907c.removeCallbacks(cyc.f7908d);
            if (cyc.f7906b.mo892l()) {
                Log.w("NotifsPanelAdapter", "onFocusChanged: still computing layout => scheduling");
                cyc.f7907c.post(cyc.f7908d);
                return;
            }
            cyc.f7908d.run();
        }
    }
}
