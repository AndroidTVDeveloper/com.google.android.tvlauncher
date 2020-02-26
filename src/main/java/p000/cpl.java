package p000;

import android.view.ViewPropertyAnimator;

/* renamed from: cpl */
/* compiled from: PG */
final /* synthetic */ class cpl implements Runnable {

    /* renamed from: a */
    private final cpn f6886a;

    /* renamed from: b */
    private final boolean f6887b;

    public cpl(cpn cpn, boolean z) {
        this.f6886a = cpn;
        this.f6887b = z;
    }

    public final void run() {
        float f;
        cpn cpn = this.f6886a;
        boolean z = this.f6887b;
        ViewPropertyAnimator animate = cpn.f6889A.animate();
        if (!z) {
            f = 0.0f;
        } else {
            f = 1.0f;
        }
        animate.alpha(f).setDuration((long) cpn.f6891C.f6899e.f8304a).setListener(new cpm(cpn));
    }
}
