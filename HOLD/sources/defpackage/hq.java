package defpackage;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;

/* renamed from: hq  reason: default package */
/* compiled from: PG */
final class hq implements Runnable {
    private final /* synthetic */ ArrayList a;
    private final /* synthetic */ ia b;

    public hq(ia iaVar, ArrayList arrayList) {
        this.b = iaVar;
        this.a = arrayList;
    }

    public final void run() {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            hz hzVar = (hz) arrayList.get(i);
            ia iaVar = this.b;
            km kmVar = hzVar.a;
            int i2 = hzVar.b;
            int i3 = hzVar.c;
            int i4 = hzVar.d;
            int i5 = hzVar.e;
            View view = kmVar.a;
            int i6 = i4 - i2;
            int i7 = i5 - i3;
            if (i6 != 0) {
                view.animate().translationX(0.0f);
            }
            if (i7 != 0) {
                view.animate().translationY(0.0f);
            }
            ViewPropertyAnimator animate = view.animate();
            iaVar.e.add(kmVar);
            animate.setDuration(250).setListener(new hv(iaVar, kmVar, i6, view, i7, animate)).start();
        }
        this.a.clear();
        this.b.b.remove(this.a);
    }
}
