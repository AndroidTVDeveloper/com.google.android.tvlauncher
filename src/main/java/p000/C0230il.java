package p000;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: il */
/* compiled from: PG */
final class C0230il implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C0231im f9603a;

    public C0230il(C0231im imVar) {
        this.f9603a = imVar;
    }

    public final void run() {
        C0231im imVar = this.f9603a;
        imVar.mo5255d();
        View view = imVar.f9604a;
        if (view.isEnabled() && !view.isLongClickable() && imVar.mo4825b()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(obtain);
            obtain.recycle();
            imVar.f9605b = true;
        }
    }
}
