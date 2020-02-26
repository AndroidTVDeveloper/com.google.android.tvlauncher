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
    private static final int[] b;
    private static final int[] c = new int[21];
    private static final float[] d = new float[21];
    public boolean a = true;
    private int e;
    private Paint f;
    private Rect g;

    static {
        int[] iArr = new int[21];
        b = iArr;
        int i = 0;
        iArr[0] = 0;
        for (int i2 = 1; i2 <= 20; i2++) {
            double d2 = (double) i2;
            Double.isNaN(d2);
            float pow = (float) Math.pow(100.0d, (d2 / 20.0d) - 4.0d);
            if (dcy.a()) {
                b[i2] = Color.argb(pow, 0.0f, 0.0f, 0.0f);
            } else {
                b[i2] = Color.rgb(0, 0, 0);
            }
            d[i2] = ((float) i2) / 20.0f;
        }
        while (true) {
            int[] iArr2 = b;
            if (i < iArr2.length) {
                c[(iArr2.length - i) - 1] = iArr2[i];
                i++;
            } else {
                return;
            }
        }
    }

    public FadingEdgeContainer(Context context) {
        super(context);
        a();
    }

    public FadingEdgeContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public FadingEdgeContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a();
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
        if (this.a && this.f == null) {
            this.f = new Paint();
            if (getLayoutDirection() == 0) {
                linearGradient = new LinearGradient(0.0f, 0.0f, (float) this.e, 0.0f, b, d, Shader.TileMode.CLAMP);
            } else {
                linearGradient = new LinearGradient((float) (width - this.e), 0.0f, (float) width, 0.0f, c, d, Shader.TileMode.CLAMP);
            }
            this.f.setShader(linearGradient);
            this.f.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        }
        if (getLayoutDirection() != 0) {
            if (this.a) {
                canvas.saveLayer(0.0f, 0.0f, (float) width, (float) height, null);
                canvas2.clipRect(width - this.e, 0, width, height);
                super.dispatchDraw(canvas);
                this.g.set(width - this.e, 0, width, height);
                canvas2.drawRect(this.g, this.f);
                canvas.restore();
            }
            canvas2.clipRect(0, 0, width - this.e, height);
            super.dispatchDraw(canvas);
            return;
        }
        if (this.a) {
            canvas.saveLayer(0.0f, 0.0f, (float) this.e, (float) height, null);
            super.dispatchDraw(canvas);
            this.g.set(0, 0, this.e, height);
            canvas2.drawRect(this.g, this.f);
            canvas.restore();
        }
        canvas2.clipRect(this.e, 0, width, height);
        super.dispatchDraw(canvas);
    }

    private final void a() {
        this.e = getContext().getResources().getDimensionPixelOffset(R.dimen.channel_items_list_fade_width);
        this.g = new Rect();
    }
}
