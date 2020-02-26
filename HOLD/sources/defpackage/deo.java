package defpackage;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;

/* renamed from: deo  reason: default package */
/* compiled from: PG */
final class deo implements Runnable {
    private final /* synthetic */ ArrayList a;
    private final /* synthetic */ dey b;

    public deo(dey dey, ArrayList arrayList) {
        this.b = dey;
        this.a = arrayList;
    }

    public final void run() {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            dex dex = (dex) arrayList.get(i);
            dey dey = this.b;
            km kmVar = dex.a;
            int i2 = dex.b;
            int i3 = dex.c;
            int i4 = dex.d;
            int i5 = dex.e;
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
            dey.k.add(kmVar);
            animate.setDuration(250).setListener(new det(dey, kmVar, i6, view, i7, animate)).start();
        }
        this.a.clear();
        this.b.e.remove(this.a);
    }
}
