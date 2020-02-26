package p000;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;

/* renamed from: deo */
/* compiled from: PG */
final class deo implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ ArrayList f8387a;

    /* renamed from: b */
    private final /* synthetic */ dey f8388b;

    public deo(dey dey, ArrayList arrayList) {
        this.f8388b = dey;
        this.f8387a = arrayList;
    }

    public final void run() {
        ArrayList arrayList = this.f8387a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            dex dex = (dex) arrayList.get(i);
            dey dey = this.f8388b;
            C0285km kmVar = dex.f8421a;
            int i2 = dex.f8422b;
            int i3 = dex.f8423c;
            int i4 = dex.f8424d;
            int i5 = dex.f8425e;
            View view = kmVar.f9783a;
            int i6 = i4 - i2;
            int i7 = i5 - i3;
            if (i6 != 0) {
                view.animate().translationX(0.0f);
            }
            if (i7 != 0) {
                view.animate().translationY(0.0f);
            }
            ViewPropertyAnimator animate = view.animate();
            dey.f8433k.add(kmVar);
            animate.setDuration(250).setListener(new det(dey, kmVar, i6, view, i7, animate)).start();
        }
        this.f8387a.clear();
        this.f8388b.f8430e.remove(this.f8387a);
    }
}
