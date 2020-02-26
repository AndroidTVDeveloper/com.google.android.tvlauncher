package p000;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;

/* renamed from: ctg */
/* compiled from: PG */
final class ctg extends Drawable {

    /* renamed from: a */
    public boolean f7346a = false;

    /* renamed from: b */
    public long f7347b;

    /* renamed from: c */
    public long f7348c;

    /* renamed from: d */
    public Bitmap f7349d;

    /* renamed from: e */
    public Paint f7350e;

    /* renamed from: f */
    private int f7351f = 255;

    public final int getOpacity() {
        return -1;
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public final void draw(Canvas canvas) {
        if (this.f7346a) {
            long uptimeMillis = SystemClock.uptimeMillis() - this.f7347b;
            long j = this.f7348c;
            if (uptimeMillis >= j) {
                this.f7346a = false;
                this.f7351f = 255;
            } else {
                this.f7351f = (int) ((uptimeMillis * 255) / j);
            }
        }
        if (this.f7351f != 255 || this.f7349d == null) {
            canvas.drawColor(-16777216);
        }
        int i = this.f7351f;
        if (!(i == 0 || this.f7349d == null)) {
            this.f7350e.setAlpha(i);
            canvas.drawBitmap(this.f7349d, 0.0f, 0.0f, this.f7350e);
        }
        if (this.f7346a) {
            invalidateSelf();
        }
    }
}
