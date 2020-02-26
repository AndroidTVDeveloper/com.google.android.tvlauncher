package p000;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.widget.FrameLayout;

/* renamed from: dat */
/* compiled from: PG */
final class dat extends FrameLayout {

    /* renamed from: a */
    public RectF f8068a;

    /* renamed from: b */
    private final Paint f8069b = new Paint();

    /* renamed from: c */
    private final int f8070c;

    /* renamed from: d */
    private final int f8071d;

    /* renamed from: e */
    private final /* synthetic */ daw f8072e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dat(daw daw, Context context, int i, int i2) {
        super(context);
        this.f8072e = daw;
        this.f8070c = i;
        this.f8071d = i2;
        setWillNotDraw(false);
        setLayerType(2, null);
        this.f8069b.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.f8069b.setAntiAlias(true);
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        canvas.drawColor(this.f8072e.f8092b);
        canvas.drawRoundRect(this.f8068a, (float) this.f8070c, (float) this.f8071d, this.f8069b);
    }
}
