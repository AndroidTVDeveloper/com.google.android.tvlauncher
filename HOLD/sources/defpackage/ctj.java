package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import com.google.android.tvlauncher.R;
import java.security.MessageDigest;
import java.util.Arrays;

/* renamed from: ctj  reason: default package */
/* compiled from: PG */
public final class ctj extends acg {
    private static final byte[] b;
    private static final int c;
    private final int d;
    private final int e;

    static {
        byte[] bytes = ctj.class.getName().getBytes(a);
        b = bytes;
        c = Arrays.hashCode(bytes);
    }

    public final int hashCode() {
        return c;
    }

    public ctj(Context context) {
        this.d = context.getResources().getDimensionPixelSize(R.dimen.home_background_image_view_port_width);
        this.e = context.getResources().getDimensionPixelSize(R.dimen.home_background_image_view_port_height);
    }

    public final boolean equals(Object obj) {
        return obj instanceof ctj;
    }

    /* access modifiers changed from: protected */
    public final Bitmap a(xg xgVar, Bitmap bitmap, int i, int i2) {
        Bitmap b2 = xgVar.b(this.d, this.e, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(b2);
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Rect rect = new Rect();
        rect.left = (width - this.d) / 2;
        rect.top = (height - this.e) / 2;
        rect.right = rect.left + this.d;
        rect.bottom = rect.top + this.e;
        canvas.drawBitmap(bitmap, rect, new Rect(0, 0, this.d, this.e), (Paint) null);
        return b2;
    }

    public final void a(MessageDigest messageDigest) {
        messageDigest.update(b);
    }
}
