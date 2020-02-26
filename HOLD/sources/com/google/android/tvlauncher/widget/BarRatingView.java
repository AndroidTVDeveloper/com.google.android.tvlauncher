package com.google.android.tvlauncher.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.tvlauncher.R;

/* compiled from: PG */
public class BarRatingView extends View {
    public final int a;
    public float b;
    public int c;
    public int d;
    public RectF e;
    public RectF f;
    private Bitmap g;
    private Bitmap h;
    private Paint i;
    private Paint j;

    public BarRatingView(Context context) {
        this(context, null);
    }

    public BarRatingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BarRatingView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        setWillNotDraw(false);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.program_meta_rating_size);
        this.d = dimensionPixelSize;
        this.c = dimensionPixelSize * 5;
        this.g = a(context.getDrawable(R.drawable.ic_channel_view_filled_item_active), dimensionPixelSize, this.d);
        this.h = a(context.getDrawable(R.drawable.ic_channel_view_filled_item_inactive), dimensionPixelSize, this.d);
        Paint paint = new Paint();
        this.i = paint;
        paint.setShader(new BitmapShader(this.g, Shader.TileMode.REPEAT, Shader.TileMode.REPEAT));
        Paint paint2 = new Paint();
        this.j = paint2;
        paint2.setShader(new BitmapShader(this.h, Shader.TileMode.REPEAT, Shader.TileMode.REPEAT));
        this.a = 20;
    }

    private static final Bitmap a(Drawable drawable, int i2, int i3) {
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        Bitmap createBitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return createBitmap;
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        canvas.drawRect(this.f, this.j);
        canvas.drawRect(this.e, this.i);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i2, int i3) {
        setMeasuredDimension(this.c, this.d);
    }
}
