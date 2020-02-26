package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;
import androidx.leanback.widget.SearchBar;

/* renamed from: on  reason: default package */
/* compiled from: PG */
final class on implements Runnable {
    private final /* synthetic */ SearchBar a;

    public on(SearchBar searchBar) {
        this.a = searchBar;
    }

    public final void run() {
        this.a.a.requestFocusFromTouch();
        this.a.a.dispatchTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 0, (float) this.a.a.getWidth(), (float) this.a.a.getHeight(), 0));
        this.a.a.dispatchTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 1, (float) this.a.a.getWidth(), (float) this.a.a.getHeight(), 0));
    }
}
