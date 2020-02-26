package androidx.leanback.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;

/* compiled from: PG */
public class HorizontalGridView extends nf {
    private Paint O;

    public HorizontalGridView(Context context) {
        this(context, null);
    }

    public HorizontalGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public HorizontalGridView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.O = new Paint();
        new Rect();
        this.L.f(0);
        a(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ly.e);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, ly.e, attributeSet, obtainStyledAttributes, 0, 0);
        }
        if (obtainStyledAttributes.peekValue(1) != null) {
            this.L.h(obtainStyledAttributes.getLayoutDimension(1, 0));
            requestLayout();
        }
        this.L.g(obtainStyledAttributes.getInt(0, 1));
        requestLayout();
        obtainStyledAttributes.recycle();
        setLayerType(0, null);
        setWillNotDraw(true);
        Paint paint = new Paint();
        this.O = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
    }
}
