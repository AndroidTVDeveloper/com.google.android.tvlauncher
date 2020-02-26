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

    /* renamed from: a */
    public final int f6770a;

    /* renamed from: b */
    public float f6771b;

    /* renamed from: c */
    public int f6772c;

    /* renamed from: d */
    public int f6773d;

    /* renamed from: e */
    public RectF f6774e;

    /* renamed from: f */
    public RectF f6775f;

    /* renamed from: g */
    private Bitmap f6776g;

    /* renamed from: h */
    private Bitmap f6777h;

    /* renamed from: i */
    private Paint f6778i;

    /* renamed from: j */
    private Paint f6779j;

    public BarRatingView(Context context) {
        this(context, null);
    }

    public BarRatingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BarRatingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setWillNotDraw(false);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.program_meta_rating_size);
        this.f6773d = dimensionPixelSize;
        this.f6772c = dimensionPixelSize * 5;
        this.f6776g = m5393a(context.getDrawable(R.drawable.ic_channel_view_filled_item_active), dimensionPixelSize, this.f6773d);
        this.f6777h = m5393a(context.getDrawable(R.drawable.ic_channel_view_filled_item_inactive), dimensionPixelSize, this.f6773d);
        Paint paint = new Paint();
        this.f6778i = paint;
        paint.setShader(new BitmapShader(this.f6776g, Shader.TileMode.REPEAT, Shader.TileMode.REPEAT));
        Paint paint2 = new Paint();
        this.f6779j = paint2;
        paint2.setShader(new BitmapShader(this.f6777h, Shader.TileMode.REPEAT, Shader.TileMode.REPEAT));
        this.f6770a = 20;
    }

    /* renamed from: a */
    private static final Bitmap m5393a(Drawable drawable, int i, int i2) {
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return createBitmap;
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        canvas.drawRect(this.f6775f, this.f6779j);
        canvas.drawRect(this.f6774e, this.f6778i);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(this.f6772c, this.f6773d);
    }
}
