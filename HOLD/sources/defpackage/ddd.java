package defpackage;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.SystemClock;

/* renamed from: ddd  reason: default package */
/* compiled from: PG */
public final class ddd extends LayerDrawable {
    public boolean a = false;
    public long b;
    public long c;
    private int d = 255;

    public ddd(Drawable[] drawableArr) {
        super(drawableArr);
    }

    public final void draw(Canvas canvas) {
        if (this.a) {
            long uptimeMillis = SystemClock.uptimeMillis() - this.b;
            long j = this.c;
            if (uptimeMillis >= j) {
                this.a = false;
                this.d = 255;
            } else {
                this.d = (int) ((uptimeMillis * 255) / j);
            }
        }
        if (this.d != 255) {
            getDrawable(1).setAlpha(255);
            getDrawable(1).draw(canvas);
        }
        if (this.d != 0) {
            getDrawable(2).setAlpha(this.d);
            getDrawable(2).draw(canvas);
        }
        if (this.a) {
            invalidateSelf();
        }
    }
}
