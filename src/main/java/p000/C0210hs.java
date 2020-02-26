package p000;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;

/* renamed from: hs */
/* compiled from: PG */
final class C0210hs implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ ArrayList f9498a;

    /* renamed from: b */
    private final /* synthetic */ C0219ia f9499b;

    public C0210hs(C0219ia iaVar, ArrayList arrayList) {
        this.f9499b = iaVar;
        this.f9498a = arrayList;
    }

    public final void run() {
        ArrayList arrayList = this.f9498a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0285km kmVar = (C0285km) arrayList.get(i);
            C0219ia iaVar = this.f9499b;
            View view = kmVar.f9783a;
            ViewPropertyAnimator animate = view.animate();
            iaVar.f9541d.add(kmVar);
            animate.alpha(1.0f).setDuration(120).setListener(new C0212hu(iaVar, kmVar, view, animate)).start();
        }
        this.f9498a.clear();
        this.f9499b.f9538a.remove(this.f9498a);
    }
}
