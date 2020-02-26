package p000;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;

/* renamed from: deq */
/* compiled from: PG */
final class deq implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ ArrayList f8391a;

    /* renamed from: b */
    private final /* synthetic */ dey f8392b;

    public deq(dey dey, ArrayList arrayList) {
        this.f8392b = dey;
        this.f8391a = arrayList;
    }

    public final void run() {
        ArrayList arrayList = this.f8391a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0285km kmVar = (C0285km) arrayList.get(i);
            dey dey = this.f8392b;
            View view = kmVar.f9783a;
            ViewPropertyAnimator animate = view.animate();
            dey.f8432g.add(kmVar);
            animate.alpha(1.0f).setDuration(120).setListener(new des(dey, kmVar, view, animate)).start();
        }
        this.f8391a.clear();
        this.f8392b.f8429d.remove(this.f8391a);
    }
}
