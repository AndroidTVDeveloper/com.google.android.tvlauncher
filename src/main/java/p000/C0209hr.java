package p000;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;

/* renamed from: hr */
/* compiled from: PG */
final class C0209hr implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ ArrayList f9496a;

    /* renamed from: b */
    private final /* synthetic */ C0219ia f9497b;

    public C0209hr(C0219ia iaVar, ArrayList arrayList) {
        this.f9497b = iaVar;
        this.f9496a = arrayList;
    }

    public final void run() {
        ArrayList arrayList = this.f9496a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0216hy hyVar = (C0216hy) arrayList.get(i);
            C0219ia iaVar = this.f9497b;
            C0285km kmVar = hyVar.f9522a;
            View view = null;
            View view2 = kmVar != null ? kmVar.f9783a : null;
            C0285km kmVar2 = hyVar.f9523b;
            if (kmVar2 != null) {
                view = kmVar2.f9783a;
            }
            if (view2 != null) {
                ViewPropertyAnimator duration = view2.animate().setDuration(iaVar.f9705i);
                iaVar.f9544g.add(hyVar.f9522a);
                duration.translationX((float) (hyVar.f9526e - hyVar.f9524c));
                duration.translationY((float) (hyVar.f9527f - hyVar.f9525d));
                duration.alpha(0.0f).setListener(new C0214hw(iaVar, hyVar, duration, view2)).start();
            }
            if (view != null) {
                ViewPropertyAnimator animate = view.animate();
                iaVar.f9544g.add(hyVar.f9523b);
                animate.translationX(0.0f).translationY(0.0f).setDuration(iaVar.f9705i).alpha(1.0f).setListener(new C0215hx(iaVar, hyVar, animate, view)).start();
            }
        }
        this.f9496a.clear();
        this.f9497b.f9540c.remove(this.f9496a);
    }
}
