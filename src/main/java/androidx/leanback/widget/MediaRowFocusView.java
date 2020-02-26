package androidx.leanback.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.tvlauncher.R;

/* compiled from: PG */
class MediaRowFocusView extends View {

    /* renamed from: a */
    private final Paint f1209a;

    /* renamed from: b */
    private final RectF f1210b = new RectF();

    /* renamed from: c */
    private int f1211c;

    public MediaRowFocusView(Context context) {
        super(context);
        this.f1209a = m1411a(context);
    }

    public MediaRowFocusView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1209a = m1411a(context);
    }

    public MediaRowFocusView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1209a = m1411a(context);
    }

    /* renamed from: a */
    private static final Paint m1411a(Context context) {
        Paint paint = new Paint();
        paint.setColor(context.getResources().getColor(R.color.lb_playback_media_row_highlight_color));
        return paint;
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight() / 2;
        this.f1211c = height;
        int height2 = ((height + height) - getHeight()) / 2;
        this.f1210b.set(0.0f, (float) (-height2), (float) getWidth(), (float) (getHeight() + height2));
        RectF rectF = this.f1210b;
        float f = (float) this.f1211c;
        canvas.drawRoundRect(rectF, f, f, this.f1209a);
    }
}
