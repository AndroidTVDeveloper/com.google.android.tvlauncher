package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.widget.FrameLayout;

/* renamed from: dat  reason: default package */
/* compiled from: PG */
final class dat extends FrameLayout {
    public RectF a;
    private final Paint b = new Paint();
    private final int c;
    private final int d;
    private final /* synthetic */ daw e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dat(daw daw, Context context, int i, int i2) {
        super(context);
        this.e = daw;
        this.c = i;
        this.d = i2;
        setWillNotDraw(false);
        setLayerType(2, null);
        this.b.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.b.setAntiAlias(true);
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        canvas.drawColor(this.e.b);
        canvas.drawRoundRect(this.a, (float) this.c, (float) this.d, this.b);
    }
}
