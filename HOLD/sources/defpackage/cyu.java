package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.tvlauncher.notifications.NotificationsTrayItemView;

/* renamed from: cyu  reason: default package */
/* compiled from: PG */
public final class cyu implements ViewTreeObserver.OnGlobalFocusChangeListener {
    private final /* synthetic */ NotificationsTrayItemView a;

    public cyu(NotificationsTrayItemView notificationsTrayItemView) {
        this.a = notificationsTrayItemView;
    }

    public final void onGlobalFocusChanged(View view, View view2) {
        View focusedChild = this.a.getFocusedChild();
        boolean z = view != null && view.getParent() == this.a;
        if (focusedChild == view2 && !z) {
            this.a.e.setSelected(true);
            this.a.d.setSelected(true);
            this.a.setSelected(true);
            this.a.f.a(true);
            this.a.g.a(true);
        } else if (focusedChild != view2 && z) {
            this.a.e.setSelected(false);
            this.a.d.setSelected(false);
            this.a.setSelected(false);
            this.a.f.a(false);
            this.a.g.a(false);
        }
    }
}
