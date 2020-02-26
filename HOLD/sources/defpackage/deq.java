package defpackage;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;

/* renamed from: deq  reason: default package */
/* compiled from: PG */
final class deq implements Runnable {
    private final /* synthetic */ ArrayList a;
    private final /* synthetic */ dey b;

    public deq(dey dey, ArrayList arrayList) {
        this.b = dey;
        this.a = arrayList;
    }

    public final void run() {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            km kmVar = (km) arrayList.get(i);
            dey dey = this.b;
            View view = kmVar.a;
            ViewPropertyAnimator animate = view.animate();
            dey.g.add(kmVar);
            animate.alpha(1.0f).setDuration(120).setListener(new des(dey, kmVar, view, animate)).start();
        }
        this.a.clear();
        this.b.d.remove(this.a);
    }
}
