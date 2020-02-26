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

    /* renamed from: a */
    private final RectF f1282a = new RectF();

    /* renamed from: b */
    private final RectF f1283b = new RectF();

    /* renamed from: c */
    private final RectF f1284c = new RectF();

    /* renamed from: d */
    private final Paint f1285d = new Paint(1);

    /* renamed from: e */
    private final Paint f1286e = new Paint(1);

    /* renamed from: f */
    private final Paint f1287f = new Paint(1);

    /* renamed from: g */
    private final Paint f1288g = new Paint(1);

    /* renamed from: h */
    private int f1289h;

    /* renamed from: i */
    private int f1290i;

    /* renamed from: j */
    private int f1291j;

    /* renamed from: k */
    private int f1292k;

    public SeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setWillNotDraw(false);
        this.f1287f.setColor(-7829368);
        this.f1285d.setColor(-3355444);
        this.f1286e.setColor(-65536);
        this.f1288g.setColor(-1);
        this.f1291j = context.getResources().getDimensionPixelSize(R.dimen.lb_playback_transport_progressbar_bar_height);
        this.f1292k = context.getResources().getDimensionPixelSize(R.dimen.lb_playback_transport_progressbar_active_bar_height);
        this.f1290i = context.getResources().getDimensionPixelSize(R.dimen.lb_playback_transport_progressbar_active_radius);
    }

    /* renamed from: a */
    private final void m1435a() {
        int i;
        int i2;
        if (!isFocused()) {
            i = this.f1291j;
        } else {
            i = this.f1292k;
        }
        int width = getWidth();
        int height = getHeight();
        int i3 = (height - i) / 2;
        RectF rectF = this.f1284c;
        int i4 = this.f1291j / 2;
        float f = (float) i3;
        float f2 = (float) (height - i3);
        rectF.set((float) i4, f, (float) (width - i4), f2);
        if (!isFocused()) {
            i2 = this.f1291j / 2;
        } else {
            i2 = this.f1290i;
        }
        float f3 = ((float) (width - (i2 + i2))) * Float.NaN;
        RectF rectF2 = this.f1282a;
        float f4 = (float) (this.f1291j / 2);
        rectF2.set(f4, f, f4 + f3, f2);
        this.f1283b.set(this.f1282a.right, f, ((float) (this.f1291j / 2)) + f3, f2);
        this.f1289h = i2 + ((int) f3);
        invalidate();
    }

    public final CharSequence getAccessibilityClassName() {
        return android.widget.SeekBar.class.getName();
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        int i;
        super.onDraw(canvas);
        if (!isFocused()) {
            i = this.f1291j / 2;
        } else {
            i = this.f1290i;
        }
        float f = (float) i;
        canvas.drawRoundRect(this.f1284c, f, f, this.f1287f);
        if (this.f1283b.right > this.f1283b.left) {
            canvas.drawRoundRect(this.f1283b, f, f, this.f1285d);
        }
        canvas.drawRoundRect(this.f1282a, f, f, this.f1286e);
        canvas.drawCircle((float) this.f1289h, (float) (getHeight() / 2), f, this.f1288g);
    }

    /* access modifiers changed from: protected */
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        m1435a();
    }

    /* access modifiers changed from: protected */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        m1435a();
    }
}
