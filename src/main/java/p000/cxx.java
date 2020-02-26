package p000;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.TextView;
import com.google.android.tvlauncher.notifications.NotificationPanelItemView;
import java.util.ArrayList;

/* renamed from: cxx */
/* compiled from: PG */
public final class cxx extends den {

    /* renamed from: a */
    private final Interpolator f7896a = new DecelerateInterpolator();

    public cxx() {
        mo5326g();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final boolean mo3745d(C0285km kmVar, C0265jt jtVar, C0265jt jtVar2) {
        mo4197g(kmVar);
        cxw cxw = (cxw) jtVar;
        cxw cxw2 = (cxw) jtVar2;
        NotificationPanelItemView notificationPanelItemView = (NotificationPanelItemView) kmVar.f9783a;
        View view = notificationPanelItemView.f6625o;
        TextView textView = notificationPanelItemView.f6615e;
        TextView textView2 = notificationPanelItemView.f6616f;
        ArrayList arrayList = new ArrayList();
        dei.m6238a(arrayList, dei.m6232a(kmVar.f9783a, cxw.f7890e, cxw2.f7890e, this.f7896a));
        if (cxw.f7893h != cxw2.f7893h) {
            dei.m6238a(arrayList, ObjectAnimator.ofFloat(view, View.ALPHA, cxw.f7893h, cxw2.f7893h));
        }
        dei.m6238a(arrayList, dei.m6243c(view, cxw.f7891f, cxw2.f7891f, cxw.f7892g, this.f7896a));
        dei.m6238a(arrayList, dei.m6232a(textView, cxw.f7894i, cxw2.f7894i, this.f7896a));
        dei.m6238a(arrayList, dei.m6232a(textView2, cxw.f7895j, cxw2.f7895j, this.f7896a));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        animatorSet.setDuration(this.f9705i);
        animatorSet.addListener(new cxv(this, kmVar, cxw2));
        this.f8386c.put(kmVar, animatorSet);
        animatorSet.start();
        return true;
    }

    /* renamed from: f */
    public final C0265jt mo3746f() {
        return new cxw((byte) 0);
    }
}
