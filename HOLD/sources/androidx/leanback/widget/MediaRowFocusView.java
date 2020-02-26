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
    private final Paint a;
    private final RectF b = new RectF();
    private int c;

    public MediaRowFocusView(Context context) {
        super(context);
        this.a = a(context);
    }

    public MediaRowFocusView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = a(context);
    }

    public MediaRowFocusView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = a(context);
    }

    private static final Paint a(Context context) {
        Paint paint = new Paint();
        paint.setColor(context.getResources().getColor(R.color.lb_playback_media_row_highlight_color));
        return paint;
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight() / 2;
        this.c = height;
        int height2 = ((height + height) - getHeight()) / 2;
        this.b.set(0.0f, (float) (-height2), (float) getWidth(), (float) (getHeight() + height2));
        RectF rectF = this.b;
        float f = (float) this.c;
        canvas.drawRoundRect(rectF, f, f, this.a);
    }
}
