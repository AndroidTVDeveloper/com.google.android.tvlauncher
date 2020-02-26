package p000;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;

/* renamed from: hq */
/* compiled from: PG */
final class C0208hq implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ ArrayList f9494a;

    /* renamed from: b */
    private final /* synthetic */ C0219ia f9495b;

    public C0208hq(C0219ia iaVar, ArrayList arrayList) {
        this.f9495b = iaVar;
        this.f9494a = arrayList;
    }

    public final void run() {
        ArrayList arrayList = this.f9494a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0217hz hzVar = (C0217hz) arrayList.get(i);
            C0219ia iaVar = this.f9495b;
            C0285km kmVar = hzVar.f9528a;
            int i2 = hzVar.f9529b;
            int i3 = hzVar.f9530c;
            int i4 = hzVar.f9531d;
            int i5 = hzVar.f9532e;
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
            iaVar.f9542e.add(kmVar);
            animate.setDuration(250).setListener(new C0213hv(iaVar, kmVar, i6, view, i7, animate)).start();
        }
        this.f9494a.clear();
        this.f9495b.f9539b.remove(this.f9494a);
    }
}
