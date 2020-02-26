package defpackage;

import android.os.Build;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.animation.AnimationUtils;
import android.widget.ListView;

/* renamed from: ei  reason: default package */
/* compiled from: PG */
final class ei implements Runnable {
    private final /* synthetic */ ej a;

    public ei(ej ejVar) {
        this.a = ejVar;
    }

    public final void run() {
        ej ejVar = this.a;
        if (ejVar.e) {
            if (ejVar.c) {
                ejVar.c = false;
                eh ehVar = ejVar.a;
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                ehVar.e = currentAnimationTimeMillis;
                ehVar.i = -1;
                ehVar.f = currentAnimationTimeMillis;
                ehVar.j = 0.5f;
                ehVar.g = 0;
                ehVar.h = 0;
            }
            eh ehVar2 = this.a.a;
            if ((ehVar2.i <= 0 || AnimationUtils.currentAnimationTimeMillis() <= ehVar2.i + ((long) ehVar2.k)) && this.a.a()) {
                ej ejVar2 = this.a;
                if (ejVar2.d) {
                    ejVar2.d = false;
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    ejVar2.b.onTouchEvent(obtain);
                    obtain.recycle();
                }
                if (ehVar2.f != 0) {
                    long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float a2 = ehVar2.a(currentAnimationTimeMillis2);
                    long j = ehVar2.f;
                    ehVar2.f = currentAnimationTimeMillis2;
                    float f = ((float) (currentAnimationTimeMillis2 - j)) * ((-4.0f * a2 * a2) + (a2 * 4.0f));
                    ehVar2.g = (int) (ehVar2.c * f);
                    int i = (int) (f * ehVar2.d);
                    ehVar2.h = i;
                    ListView listView = this.a.f;
                    int i2 = Build.VERSION.SDK_INT;
                    listView.scrollListBy(i);
                    dx.a(this.a.b, this);
                    return;
                }
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
            this.a.e = false;
        }
    }
}
