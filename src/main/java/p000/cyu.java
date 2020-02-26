package p000;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.tvlauncher.notifications.NotificationsTrayItemView;

/* renamed from: cyu */
/* compiled from: PG */
public final class cyu implements ViewTreeObserver.OnGlobalFocusChangeListener {

    /* renamed from: a */
    private final /* synthetic */ NotificationsTrayItemView f7932a;

    public cyu(NotificationsTrayItemView notificationsTrayItemView) {
        this.f7932a = notificationsTrayItemView;
    }

    public final void onGlobalFocusChanged(View view, View view2) {
        View focusedChild = this.f7932a.getFocusedChild();
        boolean z = view != null && view.getParent() == this.f7932a;
        if (focusedChild == view2 && !z) {
            this.f7932a.f6675e.setSelected(true);
            this.f7932a.f6674d.setSelected(true);
            this.f7932a.setSelected(true);
            this.f7932a.f6676f.mo3441a(true);
            this.f7932a.f6677g.mo3441a(true);
        } else if (focusedChild != view2 && z) {
            this.f7932a.f6675e.setSelected(false);
            this.f7932a.f6674d.setSelected(false);
            this.f7932a.setSelected(false);
            this.f7932a.f6676f.mo3441a(false);
            this.f7932a.f6677g.mo3441a(false);
        }
    }
}
