package p000;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;

/* renamed from: dep */
/* compiled from: PG */
final class dep implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ ArrayList f8389a;

    /* renamed from: b */
    private final /* synthetic */ dey f8390b;

    public dep(dey dey, ArrayList arrayList) {
        this.f8390b = dey;
        this.f8389a = arrayList;
    }

    public final void run() {
        ArrayList arrayList = this.f8389a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            dew dew = (dew) arrayList.get(i);
            dey dey = this.f8390b;
            C0285km kmVar = dew.f8415a;
            View view = null;
            View view2 = kmVar != null ? kmVar.f9783a : null;
            C0285km kmVar2 = dew.f8416b;
            if (kmVar2 != null) {
                view = kmVar2.f9783a;
            }
            if (view2 != null) {
                ViewPropertyAnimator duration = view2.animate().setDuration(dey.f9705i);
                dey.f8435m.add(dew.f8415a);
                duration.translationX((float) (dew.f8419e - dew.f8417c));
                duration.translationY((float) (dew.f8420f - dew.f8418d));
                duration.alpha(0.0f).setListener(new deu(dey, dew, duration, view2)).start();
            }
            if (view != null) {
                ViewPropertyAnimator animate = view.animate();
                dey.f8435m.add(dew.f8416b);
                animate.translationX(0.0f).translationY(0.0f).setDuration(dey.f9705i).alpha(1.0f).setListener(new dev(dey, dew, animate, view)).start();
            }
        }
        this.f8389a.clear();
        this.f8390b.f8431f.remove(this.f8389a);
    }
}
