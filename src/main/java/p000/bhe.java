package p000;

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

/* renamed from: bhe */
/* compiled from: PG */
public final class bhe {

    /* renamed from: A */
    public int f3935A;

    /* renamed from: B */
    public StaticLayout f3936B;

    /* renamed from: C */
    public int f3937C;

    /* renamed from: D */
    public int f3938D;

    /* renamed from: E */
    public int f3939E;

    /* renamed from: F */
    public Rect f3940F;

    /* renamed from: G */
    private final float f3941G;

    /* renamed from: H */
    private final float f3942H;

    /* renamed from: I */
    private final float f3943I;

    /* renamed from: J */
    private final Paint f3944J;

    /* renamed from: a */
    public final float f3945a;

    /* renamed from: b */
    public final float f3946b;

    /* renamed from: c */
    public final TextPaint f3947c;

    /* renamed from: d */
    public CharSequence f3948d;

    /* renamed from: e */
    public Layout.Alignment f3949e;

    /* renamed from: f */
    public Bitmap f3950f;

    /* renamed from: g */
    public float f3951g;

    /* renamed from: h */
    public int f3952h;

    /* renamed from: i */
    public int f3953i;

    /* renamed from: j */
    public float f3954j;

    /* renamed from: k */
    public int f3955k;

    /* renamed from: l */
    public float f3956l;

    /* renamed from: m */
    public float f3957m;

    /* renamed from: n */
    public boolean f3958n;

    /* renamed from: o */
    public boolean f3959o;

    /* renamed from: p */
    public int f3960p;

    /* renamed from: q */
    public int f3961q;

    /* renamed from: r */
    public int f3962r;

    /* renamed from: s */
    public int f3963s;

    /* renamed from: t */
    public int f3964t;

    /* renamed from: u */
    public float f3965u;

    /* renamed from: v */
    public float f3966v;

    /* renamed from: w */
    public float f3967w;

    /* renamed from: x */
    public int f3968x;

    /* renamed from: y */
    public int f3969y;

    /* renamed from: z */
    public int f3970z;

    public bhe(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{16843287, 16843288}, 0, 0);
        this.f3946b = (float) obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f3945a = obtainStyledAttributes.getFloat(1, 1.0f);
        obtainStyledAttributes.recycle();
        float f = (float) context.getResources().getDisplayMetrics().densityDpi;
        float round = (float) Math.round((f + f) / 160.0f);
        this.f3941G = round;
        this.f3942H = round;
        this.f3943I = round;
        TextPaint textPaint = new TextPaint();
        this.f3947c = textPaint;
        textPaint.setAntiAlias(true);
        this.f3947c.setSubpixelText(true);
        Paint paint = new Paint();
        this.f3944J = paint;
        paint.setAntiAlias(true);
        this.f3944J.setStyle(Paint.Style.FILL);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.graphics.Paint.setShadowLayer(float, float, float, int):void}
     arg types: [int, int, int, int]
     candidates:
      ClspMth{android.graphics.Paint.setShadowLayer(float, float, float, long):void}
      ClspMth{android.graphics.Paint.setShadowLayer(float, float, float, int):void} */
    /* renamed from: a */
    public final void mo1932a(Canvas canvas, boolean z) {
        if (z) {
            StaticLayout staticLayout = this.f3936B;
            if (staticLayout != null) {
                int save = canvas.save();
                canvas.translate((float) this.f3937C, (float) this.f3938D);
                if (Color.alpha(this.f3962r) > 0) {
                    this.f3944J.setColor(this.f3962r);
                    canvas.drawRect((float) (-this.f3939E), 0.0f, (float) (staticLayout.getWidth() + this.f3939E), (float) staticLayout.getHeight(), this.f3944J);
                }
                int i = this.f3964t;
                if (i == 1) {
                    this.f3947c.setStrokeJoin(Paint.Join.ROUND);
                    this.f3947c.setStrokeWidth(this.f3941G);
                    this.f3947c.setColor(this.f3963s);
                    this.f3947c.setStyle(Paint.Style.FILL_AND_STROKE);
                    staticLayout.draw(canvas);
                } else if (i == 2) {
                    TextPaint textPaint = this.f3947c;
                    float f = this.f3942H;
                    float f2 = this.f3943I;
                    textPaint.setShadowLayer(f, f2, f2, this.f3963s);
                } else if (i == 3 || i == 4) {
                    int i2 = -1;
                    int i3 = i != 3 ? this.f3963s : -1;
                    if (i == 3) {
                        i2 = this.f3963s;
                    }
                    float f3 = this.f3942H / 2.0f;
                    this.f3947c.setColor(this.f3960p);
                    this.f3947c.setStyle(Paint.Style.FILL);
                    float f4 = -f3;
                    this.f3947c.setShadowLayer(this.f3942H, f4, f4, i3);
                    staticLayout.draw(canvas);
                    this.f3947c.setShadowLayer(this.f3942H, f3, f3, i2);
                }
                this.f3947c.setColor(this.f3960p);
                this.f3947c.setStyle(Paint.Style.FILL);
                staticLayout.draw(canvas);
                this.f3947c.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
                canvas.restoreToCount(save);
                return;
            }
            return;
        }
        canvas.drawBitmap(this.f3950f, (Rect) null, this.f3940F, (Paint) null);
    }
}
