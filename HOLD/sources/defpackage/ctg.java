package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;

/* renamed from: ctg  reason: default package */
/* compiled from: PG */
final class ctg extends Drawable {
    public boolean a = false;
    public long b;
    public long c;
    public Bitmap d;
    public Paint e;
    private int f = 255;

    public final int getOpacity() {
        return -1;
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public final void draw(Canvas canvas) {
        if (this.a) {
            long uptimeMillis = SystemClock.uptimeMillis() - this.b;
            long j = this.c;
            if (uptimeMillis >= j) {
                this.a = false;
                this.f = 255;
            } else {
                this.f = (int) ((uptimeMillis * 255) / j);
            }
        }
        if (this.f != 255 || this.d == null) {
            canvas.drawColor(-16777216);
        }
        int i = this.f;
        if (!(i == 0 || this.d == null)) {
            this.e.setAlpha(i);
            canvas.drawBitmap(this.d, 0.0f, 0.0f, this.e);
        }
        if (this.a) {
            invalidateSelf();
        }
    }
}
