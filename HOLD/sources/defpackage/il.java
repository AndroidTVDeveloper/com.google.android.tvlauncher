package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: il  reason: default package */
/* compiled from: PG */
final class il implements Runnable {
    private final /* synthetic */ im a;

    public il(im imVar) {
        this.a = imVar;
    }

    public final void run() {
        im imVar = this.a;
        imVar.d();
        View view = imVar.a;
        if (view.isEnabled() && !view.isLongClickable() && imVar.b()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(obtain);
            obtain.recycle();
            imVar.b = true;
        }
    }
}
