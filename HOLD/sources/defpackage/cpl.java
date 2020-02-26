package defpackage;

import android.view.ViewPropertyAnimator;

/* renamed from: cpl  reason: default package */
/* compiled from: PG */
final /* synthetic */ class cpl implements Runnable {
    private final cpn a;
    private final boolean b;

    public cpl(cpn cpn, boolean z) {
        this.a = cpn;
        this.b = z;
    }

    public final void run() {
        float f;
        cpn cpn = this.a;
        boolean z = this.b;
        ViewPropertyAnimator animate = cpn.A.animate();
        if (!z) {
            f = 0.0f;
        } else {
            f = 1.0f;
        }
        animate.alpha(f).setDuration((long) cpn.C.e.a).setListener(new cpm(cpn));
    }
}
