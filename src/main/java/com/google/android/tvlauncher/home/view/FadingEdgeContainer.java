package com.google.android.tvlauncher.home.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.android.tvlauncher.R;

/* compiled from: PG */
public class FadingEdgeContainer extends FrameLayout {

    /* renamed from: b */
    private static final int[] f6557b;

    /* renamed from: c */
    private static final int[] f6558c = new int[21];

    /* renamed from: d */
    private static final float[] f6559d = new float[21];

    /* renamed from: a */
    public boolean f6560a = true;

    /* renamed from: e */
    private int f6561e;

    /* renamed from: f */
    private Paint f6562f;

    /* renamed from: g */
    private Rect f6563g;

    static {
        int[] iArr = new int[21];
        f6557b = iArr;
        int i = 0;
        iArr[0] = 0;
        for (int i2 = 1; i2 <= 20; i2++) {
            double d = (double) i2;
            Double.isNaN(d);
            float pow = (float) Math.pow(100.0d, (d / 20.0d) - 4.0d);
            if (dcy.m6189a()) {
                f6557b[i2] = Color.argb(pow, 0.0f, 0.0f, 0.0f);
            } else {
                f6557b[i2] = Color.rgb(0, 0, 0);
            }
            f6559d[i2] = ((float) i2) / 20.0f;
        }
        while (true) {
            int[] iArr2 = f6557b;
            if (i < iArr2.length) {
                f6558c[(iArr2.length - i) - 1] = iArr2[i];
                i++;
            } else {
                return;
            }
        }
    }

    public FadingEdgeContainer(Context context) {
        super(context);
        m5314a();
    }

    public FadingEdgeContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m5314a();
    }

    public FadingEdgeContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m5314a();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.graphics.LinearGradient.<init>(float, float, float, float, int[], float[], android.graphics.Shader$TileMode):void}
     arg types: [int, int, float, int, int[], float[], android.graphics.Shader$TileMode]
     candidates:
      ClspMth{android.graphics.LinearGradient.<init>(float, float, float, float, long, long, android.graphics.Shader$TileMode):void}
      ClspMth{android.graphics.LinearGradient.<init>(float, float, float, float, long[], float[], android.graphics.Shader$TileMode):void}
      ClspMth{android.graphics.LinearGradient.<init>(float, float, float, float, int, int, android.graphics.Shader$TileMode):void}
      ClspMth{android.graphics.LinearGradient.<init>(float, float, float, float, int[], float[], android.graphics.Shader$TileMode):void} */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.graphics.LinearGradient.<init>(float, float, float, float, int[], float[], android.graphics.Shader$TileMode):void}
     arg types: [float, int, float, int, int[], float[], android.graphics.Shader$TileMode]
     candidates:
      ClspMth{android.graphics.LinearGradient.<init>(float, float, float, float, long, long, android.graphics.Shader$TileMode):void}
      ClspMth{android.graphics.LinearGradient.<init>(float, float, float, float, long[], float[], android.graphics.Shader$TileMode):void}
      ClspMth{android.graphics.LinearGradient.<init>(float, float, float, float, int, int, android.graphics.Shader$TileMode):void}
      ClspMth{android.graphics.LinearGradient.<init>(float, float, float, float, int[], float[], android.graphics.Shader$TileMode):void} */
    /* access modifiers changed from: protected */
    public final void dispatchDraw(Canvas canvas) {
        LinearGradient linearGradient;
        Canvas canvas2 = canvas;
        int height = getHeight();
        int width = getWidth();
        if (this.f6560a && this.f6562f == null) {
            this.f6562f = new Paint();
            if (getLayoutDirection() == 0) {
                linearGradient = new LinearGradient(0.0f, 0.0f, (float) this.f6561e, 0.0f, f6557b, f6559d, Shader.TileMode.CLAMP);
            } else {
                linearGradient = new LinearGradient((float) (width - this.f6561e), 0.0f, (float) width, 0.0f, f6558c, f6559d, Shader.TileMode.CLAMP);
            }
            this.f6562f.setShader(linearGradient);
            this.f6562f.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        }
        if (getLayoutDirection() != 0) {
            if (this.f6560a) {
                canvas.saveLayer(0.0f, 0.0f, (float) width, (float) height, null);
                canvas2.clipRect(width - this.f6561e, 0, width, height);
                super.dispatchDraw(canvas);
                this.f6563g.set(width - this.f6561e, 0, width, height);
                canvas2.drawRect(this.f6563g, this.f6562f);
                canvas.restore();
            }
            canvas2.clipRect(0, 0, width - this.f6561e, height);
            super.dispatchDraw(canvas);
            return;
        }
        if (this.f6560a) {
            canvas.saveLayer(0.0f, 0.0f, (float) this.f6561e, (float) height, null);
            super.dispatchDraw(canvas);
            this.f6563g.set(0, 0, this.f6561e, height);
            canvas2.drawRect(this.f6563g, this.f6562f);
            canvas.restore();
        }
        canvas2.clipRect(this.f6561e, 0, width, height);
        super.dispatchDraw(canvas);
    }

    /* renamed from: a */
    private final void m5314a() {
        this.f6561e = getContext().getResources().getDimensionPixelOffset(R.dimen.channel_items_list_fade_width);
        this.f6563g = new Rect();
    }
}
