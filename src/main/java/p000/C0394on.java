package p000;

import android.os.SystemClock;
import android.view.MotionEvent;
import androidx.leanback.widget.SearchBar;

/* renamed from: on */
/* compiled from: PG */
final class C0394on implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ SearchBar f10085a;

    public C0394on(SearchBar searchBar) {
        this.f10085a = searchBar;
    }

    public final void run() {
        this.f10085a.f1246a.requestFocusFromTouch();
        this.f10085a.f1246a.dispatchTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 0, (float) this.f10085a.f1246a.getWidth(), (float) this.f10085a.f1246a.getHeight(), 0));
        this.f10085a.f1246a.dispatchTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 1, (float) this.f10085a.f1246a.getWidth(), (float) this.f10085a.f1246a.getHeight(), 0));
    }
}
