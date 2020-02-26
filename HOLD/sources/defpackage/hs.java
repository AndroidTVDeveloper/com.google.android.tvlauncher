package defpackage;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;

/* renamed from: hs  reason: default package */
/* compiled from: PG */
final class hs implements Runnable {
    private final /* synthetic */ ArrayList a;
    private final /* synthetic */ ia b;

    public hs(ia iaVar, ArrayList arrayList) {
        this.b = iaVar;
        this.a = arrayList;
    }

    public final void run() {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            km kmVar = (km) arrayList.get(i);
            ia iaVar = this.b;
            View view = kmVar.a;
            ViewPropertyAnimator animate = view.animate();
            iaVar.d.add(kmVar);
            animate.alpha(1.0f).setDuration(120).setListener(new hu(iaVar, kmVar, view, animate)).start();
        }
        this.a.clear();
        this.b.a.remove(this.a);
    }
}
