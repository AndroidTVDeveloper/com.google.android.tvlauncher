package p000;

import android.os.Build;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.animation.AnimationUtils;
import android.widget.ListView;

/* renamed from: ei */
/* compiled from: PG */
final class C0119ei implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C0120ej f9136a;

    public C0119ei(C0120ej ejVar) {
        this.f9136a = ejVar;
    }

    public final void run() {
        C0120ej ejVar = this.f9136a;
        if (ejVar.f9142e) {
            if (ejVar.f9140c) {
                ejVar.f9140c = false;
                C0118eh ehVar = ejVar.f9138a;
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                ehVar.f9129e = currentAnimationTimeMillis;
                ehVar.f9133i = -1;
                ehVar.f9130f = currentAnimationTimeMillis;
                ehVar.f9134j = 0.5f;
                ehVar.f9131g = 0;
                ehVar.f9132h = 0;
            }
            C0118eh ehVar2 = this.f9136a.f9138a;
            if ((ehVar2.f9133i <= 0 || AnimationUtils.currentAnimationTimeMillis() <= ehVar2.f9133i + ((long) ehVar2.f9135k)) && this.f9136a.mo4711a()) {
                C0120ej ejVar2 = this.f9136a;
                if (ejVar2.f9141d) {
                    ejVar2.f9141d = false;
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    ejVar2.f9139b.onTouchEvent(obtain);
                    obtain.recycle();
                }
                if (ehVar2.f9130f != 0) {
                    long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float a = ehVar2.mo4708a(currentAnimationTimeMillis2);
                    long j = ehVar2.f9130f;
                    ehVar2.f9130f = currentAnimationTimeMillis2;
                    float f = ((float) (currentAnimationTimeMillis2 - j)) * ((-4.0f * a * a) + (a * 4.0f));
                    ehVar2.f9131g = (int) (ehVar2.f9127c * f);
                    int i = (int) (f * ehVar2.f9128d);
                    ehVar2.f9132h = i;
                    ListView listView = this.f9136a.f9143f;
                    int i2 = Build.VERSION.SDK_INT;
                    listView.scrollListBy(i);
                    C0107dx.m7201a(this.f9136a.f9139b, this);
                    return;
                }
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
            this.f9136a.f9142e = false;
        }
    }
}
