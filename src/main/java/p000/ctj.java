package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import com.google.android.tvlauncher.R;
import java.security.MessageDigest;
import java.util.Arrays;

/* renamed from: ctj */
/* compiled from: PG */
public final class ctj extends acg {

    /* renamed from: b */
    private static final byte[] f7358b;

    /* renamed from: c */
    private static final int f7359c;

    /* renamed from: d */
    private final int f7360d;

    /* renamed from: e */
    private final int f7361e;

    static {
        byte[] bytes = ctj.class.getName().getBytes(f10521a);
        f7358b = bytes;
        f7359c = Arrays.hashCode(bytes);
    }

    public final int hashCode() {
        return f7359c;
    }

    public ctj(Context context) {
        this.f7360d = context.getResources().getDimensionPixelSize(R.dimen.home_background_image_view_port_width);
        this.f7361e = context.getResources().getDimensionPixelSize(R.dimen.home_background_image_view_port_height);
    }

    public final boolean equals(Object obj) {
        return obj instanceof ctj;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Bitmap mo42a(C0630xg xgVar, Bitmap bitmap, int i, int i2) {
        Bitmap b = xgVar.mo6109b(this.f7360d, this.f7361e, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(b);
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Rect rect = new Rect();
        rect.left = (width - this.f7360d) / 2;
        rect.top = (height - this.f7361e) / 2;
        rect.right = rect.left + this.f7360d;
        rect.bottom = rect.top + this.f7361e;
        canvas.drawBitmap(bitmap, rect, new Rect(0, 0, this.f7360d, this.f7361e), (Paint) null);
        return b;
    }

    /* renamed from: a */
    public final void mo37a(MessageDigest messageDigest) {
        messageDigest.update(f7358b);
    }
}
