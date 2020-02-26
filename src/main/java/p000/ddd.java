package p000;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.SystemClock;

/* renamed from: ddd */
/* compiled from: PG */
public final class ddd extends LayerDrawable {

    /* renamed from: a */
    public boolean f8329a = false;

    /* renamed from: b */
    public long f8330b;

    /* renamed from: c */
    public long f8331c;

    /* renamed from: d */
    private int f8332d = 255;

    public ddd(Drawable[] drawableArr) {
        super(drawableArr);
    }

    public final void draw(Canvas canvas) {
        if (this.f8329a) {
            long uptimeMillis = SystemClock.uptimeMillis() - this.f8330b;
            long j = this.f8331c;
            if (uptimeMillis >= j) {
                this.f8329a = false;
                this.f8332d = 255;
            } else {
                this.f8332d = (int) ((uptimeMillis * 255) / j);
            }
        }
        if (this.f8332d != 255) {
            getDrawable(1).setAlpha(255);
            getDrawable(1).draw(canvas);
        }
        if (this.f8332d != 0) {
            getDrawable(2).setAlpha(this.f8332d);
            getDrawable(2).draw(canvas);
        }
        if (this.f8329a) {
            invalidateSelf();
        }
    }
}
