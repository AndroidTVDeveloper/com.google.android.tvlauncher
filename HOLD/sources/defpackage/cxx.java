package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.TextView;
import com.google.android.tvlauncher.notifications.NotificationPanelItemView;
import java.util.ArrayList;

/* renamed from: cxx  reason: default package */
/* compiled from: PG */
public final class cxx extends den {
    private final Interpolator a = new DecelerateInterpolator();

    public cxx() {
        g();
    }

    /* access modifiers changed from: protected */
    public final boolean d(km kmVar, jt jtVar, jt jtVar2) {
        g(kmVar);
        cxw cxw = (cxw) jtVar;
        cxw cxw2 = (cxw) jtVar2;
        NotificationPanelItemView notificationPanelItemView = (NotificationPanelItemView) kmVar.a;
        View view = notificationPanelItemView.o;
        TextView textView = notificationPanelItemView.e;
        TextView textView2 = notificationPanelItemView.f;
        ArrayList arrayList = new ArrayList();
        dei.a(arrayList, dei.a(kmVar.a, cxw.e, cxw2.e, this.a));
        if (cxw.h != cxw2.h) {
            dei.a(arrayList, ObjectAnimator.ofFloat(view, View.ALPHA, cxw.h, cxw2.h));
        }
        dei.a(arrayList, dei.c(view, cxw.f, cxw2.f, cxw.g, this.a));
        dei.a(arrayList, dei.a(textView, cxw.i, cxw2.i, this.a));
        dei.a(arrayList, dei.a(textView2, cxw.j, cxw2.j, this.a));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        animatorSet.setDuration(this.i);
        animatorSet.addListener(new cxv(this, kmVar, cxw2));
        this.c.put(kmVar, animatorSet);
        animatorSet.start();
        return true;
    }

    public final jt f() {
        return new cxw((byte) 0);
    }
}
