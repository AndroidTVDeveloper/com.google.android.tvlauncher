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
public class HorizontalGridView extends C0359nf {

    /* renamed from: O */
    private Paint f1201O;

    public HorizontalGridView(Context context) {
        this(context, null);
    }

    public HorizontalGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public HorizontalGridView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1201O = new Paint();
        new Rect();
        this.f9985L.mo5667f(0);
        mo5610a(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0324ly.f9935e);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, C0324ly.f9935e, attributeSet, obtainStyledAttributes, 0, 0);
        }
        if (obtainStyledAttributes.peekValue(1) != null) {
            this.f9985L.mo5670h(obtainStyledAttributes.getLayoutDimension(1, 0));
            requestLayout();
        }
        this.f9985L.mo5669g(obtainStyledAttributes.getInt(0, 1));
        requestLayout();
        obtainStyledAttributes.recycle();
        setLayerType(0, null);
        setWillNotDraw(true);
        Paint paint = new Paint();
        this.f1201O = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
    }
}
