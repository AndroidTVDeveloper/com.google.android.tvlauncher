package defpackage;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;

/* renamed from: dep  reason: default package */
/* compiled from: PG */
final class dep implements Runnable {
    private final /* synthetic */ ArrayList a;
    private final /* synthetic */ dey b;

    public dep(dey dey, ArrayList arrayList) {
        this.b = dey;
        this.a = arrayList;
    }

    public final void run() {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            dew dew = (dew) arrayList.get(i);
            dey dey = this.b;
            km kmVar = dew.a;
            View view = null;
            View view2 = kmVar != null ? kmVar.a : null;
            km kmVar2 = dew.b;
            if (kmVar2 != null) {
                view = kmVar2.a;
            }
            if (view2 != null) {
                ViewPropertyAnimator duration = view2.animate().setDuration(dey.i);
                dey.m.add(dew.a);
                duration.translationX((float) (dew.e - dew.c));
                duration.translationY((float) (dew.f - dew.d));
                duration.alpha(0.0f).setListener(new deu(dey, dew, duration, view2)).start();
            }
            if (view != null) {
                ViewPropertyAnimator animate = view.animate();
                dey.m.add(dew.b);
                animate.translationX(0.0f).translationY(0.0f).setDuration(dey.i).alpha(1.0f).setListener(new dev(dey, dew, animate, view)).start();
            }
        }
        this.a.clear();
        this.b.f.remove(this.a);
    }
}
