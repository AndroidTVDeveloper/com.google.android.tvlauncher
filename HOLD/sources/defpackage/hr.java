package defpackage;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;

/* renamed from: hr  reason: default package */
/* compiled from: PG */
final class hr implements Runnable {
    private final /* synthetic */ ArrayList a;
    private final /* synthetic */ ia b;

    public hr(ia iaVar, ArrayList arrayList) {
        this.b = iaVar;
        this.a = arrayList;
    }

    public final void run() {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            hy hyVar = (hy) arrayList.get(i);
            ia iaVar = this.b;
            km kmVar = hyVar.a;
            View view = null;
            View view2 = kmVar != null ? kmVar.a : null;
            km kmVar2 = hyVar.b;
            if (kmVar2 != null) {
                view = kmVar2.a;
            }
            if (view2 != null) {
                ViewPropertyAnimator duration = view2.animate().setDuration(iaVar.i);
                iaVar.g.add(hyVar.a);
                duration.translationX((float) (hyVar.e - hyVar.c));
                duration.translationY((float) (hyVar.f - hyVar.d));
                duration.alpha(0.0f).setListener(new hw(iaVar, hyVar, duration, view2)).start();
            }
            if (view != null) {
                ViewPropertyAnimator animate = view.animate();
                iaVar.g.add(hyVar.b);
                animate.translationX(0.0f).translationY(0.0f).setDuration(iaVar.i).alpha(1.0f).setListener(new hx(iaVar, hyVar, animate, view)).start();
            }
        }
        this.a.clear();
        this.b.c.remove(this.a);
    }
}
