package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;

/* renamed from: bhe  reason: default package */
/* compiled from: PG */
public final class bhe {
    public int A;
    public StaticLayout B;
    public int C;
    public int D;
    public int E;
    public Rect F;
    private final float G;
    private final float H;
    private final float I;
    private final Paint J;
    public final float a;
    public final float b;
    public final TextPaint c;
    public CharSequence d;
    public Layout.Alignment e;
    public Bitmap f;
    public float g;
    public int h;
    public int i;
    public float j;
    public int k;
    public float l;
    public float m;
    public boolean n;
    public boolean o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public float u;
    public float v;
    public float w;
    public int x;
    public int y;
    public int z;

    public bhe(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{16843287, 16843288}, 0, 0);
        this.b = (float) obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.a = obtainStyledAttributes.getFloat(1, 1.0f);
        obtainStyledAttributes.recycle();
        float f2 = (float) context.getResources().getDisplayMetrics().densityDpi;
        float round = (float) Math.round((f2 + f2) / 160.0f);
        this.G = round;
        this.H = round;
        this.I = round;
        TextPaint textPaint = new TextPaint();
        this.c = textPaint;
        textPaint.setAntiAlias(true);
        this.c.setSubpixelText(true);
        Paint paint = new Paint();
        this.J = paint;
        paint.setAntiAlias(true);
        this.J.setStyle(Paint.Style.FILL);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.graphics.Paint.setShadowLayer(float, float, float, int):void}
     arg types: [int, int, int, int]
     candidates:
      ClspMth{android.graphics.Paint.setShadowLayer(float, float, float, long):void}
      ClspMth{android.graphics.Paint.setShadowLayer(float, float, float, int):void} */
    public final void a(Canvas canvas, boolean z2) {
        if (z2) {
            StaticLayout staticLayout = this.B;
            if (staticLayout != null) {
                int save = canvas.save();
                canvas.translate((float) this.C, (float) this.D);
                if (Color.alpha(this.r) > 0) {
                    this.J.setColor(this.r);
                    canvas.drawRect((float) (-this.E), 0.0f, (float) (staticLayout.getWidth() + this.E), (float) staticLayout.getHeight(), this.J);
                }
                int i2 = this.t;
                if (i2 == 1) {
                    this.c.setStrokeJoin(Paint.Join.ROUND);
                    this.c.setStrokeWidth(this.G);
                    this.c.setColor(this.s);
                    this.c.setStyle(Paint.Style.FILL_AND_STROKE);
                    staticLayout.draw(canvas);
                } else if (i2 == 2) {
                    TextPaint textPaint = this.c;
                    float f2 = this.H;
                    float f3 = this.I;
                    textPaint.setShadowLayer(f2, f3, f3, this.s);
                } else if (i2 == 3 || i2 == 4) {
                    int i3 = -1;
                    int i4 = i2 != 3 ? this.s : -1;
                    if (i2 == 3) {
                        i3 = this.s;
                    }
                    float f4 = this.H / 2.0f;
                    this.c.setColor(this.p);
                    this.c.setStyle(Paint.Style.FILL);
                    float f5 = -f4;
                    this.c.setShadowLayer(this.H, f5, f5, i4);
                    staticLayout.draw(canvas);
                    this.c.setShadowLayer(this.H, f4, f4, i3);
                }
                this.c.setColor(this.p);
                this.c.setStyle(Paint.Style.FILL);
                staticLayout.draw(canvas);
                this.c.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
                canvas.restoreToCount(save);
                return;
            }
            return;
        }
        canvas.drawBitmap(this.f, (Rect) null, this.F, (Paint) null);
    }
}
