package androidx.leanback.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.tvlauncher.R;

/* compiled from: PG */
public final class SeekBar extends View {
    private final RectF a = new RectF();
    private final RectF b = new RectF();
    private final RectF c = new RectF();
    private final Paint d = new Paint(1);
    private final Paint e = new Paint(1);
    private final Paint f = new Paint(1);
    private final Paint g = new Paint(1);
    private int h;
    private int i;
    private int j;
    private int k;

    public SeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setWillNotDraw(false);
        this.f.setColor(-7829368);
        this.d.setColor(-3355444);
        this.e.setColor(-65536);
        this.g.setColor(-1);
        this.j = context.getResources().getDimensionPixelSize(R.dimen.lb_playback_transport_progressbar_bar_height);
        this.k = context.getResources().getDimensionPixelSize(R.dimen.lb_playback_transport_progressbar_active_bar_height);
        this.i = context.getResources().getDimensionPixelSize(R.dimen.lb_playback_transport_progressbar_active_radius);
    }

    private final void a() {
        int i2;
        int i3;
        if (!isFocused()) {
            i2 = this.j;
        } else {
            i2 = this.k;
        }
        int width = getWidth();
        int height = getHeight();
        int i4 = (height - i2) / 2;
        RectF rectF = this.c;
        int i5 = this.j / 2;
        float f2 = (float) i4;
        float f3 = (float) (height - i4);
        rectF.set((float) i5, f2, (float) (width - i5), f3);
        if (!isFocused()) {
            i3 = this.j / 2;
        } else {
            i3 = this.i;
        }
        float f4 = ((float) (width - (i3 + i3))) * Float.NaN;
        RectF rectF2 = this.a;
        float f5 = (float) (this.j / 2);
        rectF2.set(f5, f2, f5 + f4, f3);
        this.b.set(this.a.right, f2, ((float) (this.j / 2)) + f4, f3);
        this.h = i3 + ((int) f4);
        invalidate();
    }

    public final CharSequence getAccessibilityClassName() {
        return android.widget.SeekBar.class.getName();
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        int i2;
        super.onDraw(canvas);
        if (!isFocused()) {
            i2 = this.j / 2;
        } else {
            i2 = this.i;
        }
        float f2 = (float) i2;
        canvas.drawRoundRect(this.c, f2, f2, this.f);
        if (this.b.right > this.b.left) {
            canvas.drawRoundRect(this.b, f2, f2, this.d);
        }
        canvas.drawRoundRect(this.a, f2, f2, this.e);
        canvas.drawCircle((float) this.h, (float) (getHeight() / 2), f2, this.g);
    }

    /* access modifiers changed from: protected */
    public final void onFocusChanged(boolean z, int i2, Rect rect) {
        super.onFocusChanged(z, i2, rect);
        a();
    }

    /* access modifiers changed from: protected */
    public final void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        a();
    }
}
