package p000;

import android.view.ViewParent;

/* renamed from: ik */
/* compiled from: PG */
final class C0229ik implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C0231im f9602a;

    public C0229ik(C0231im imVar) {
        this.f9602a = imVar;
    }

    public final void run() {
        ViewParent parent = this.f9602a.f9604a.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }
}
