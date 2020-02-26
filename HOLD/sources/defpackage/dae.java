package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import java.security.MessageDigest;
import java.util.Arrays;

/* renamed from: dae  reason: default package */
/* compiled from: PG */
public final class dae extends acg {
    private static final byte[] b = "com.google.android.tvLauncher.util.AddBackgroundColorTransformation".getBytes(a);
    private final byte[] c;
    private final int d;
    private int e;
    private boolean f = false;
    private final boolean g;

    /* JADX WARN: Type inference failed for: r0v1, types: [byte[]] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public dae(int r5, boolean r6) {
        /*
            r4 = this;
            r4.<init>()
            r0 = 0
            r4.f = r0
            r4.d = r5
            byte[] r1 = defpackage.dae.b
            int r2 = r1.length
            int r2 = r2 + 5
            byte[] r2 = new byte[r2]
            r4.c = r2
            int r3 = r1.length
            java.lang.System.arraycopy(r1, r0, r2, r0, r3)
            byte[] r0 = r4.c
            int r1 = r0.length
            int r2 = r1 + -5
            r0[r2] = r6
            int r2 = r1 + -4
            int r3 = r5 >> 24
            r3 = r3 & 15
            byte r3 = (byte) r3
            r0[r2] = r3
            int r2 = r1 + -3
            int r3 = r5 >> 16
            r3 = r3 & 15
            byte r3 = (byte) r3
            r0[r2] = r3
            int r2 = r1 + -2
            int r3 = r5 >> 8
            r3 = r3 & 15
            byte r3 = (byte) r3
            r0[r2] = r3
            int r1 = r1 + -1
            r5 = r5 & 15
            byte r5 = (byte) r5
            r0[r1] = r5
            r4.g = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dae.<init>(int, boolean):void");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dae) || ((dae) obj).d != this.d) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        if (this.f) {
            return this.e;
        }
        this.f = true;
        int hashCode = Arrays.hashCode(this.c);
        this.e = hashCode;
        return hashCode;
    }

    /* access modifiers changed from: protected */
    public final Bitmap a(xg xgVar, Bitmap bitmap, int i, int i2) {
        if (!this.g) {
            return a(xgVar, bitmap);
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width < i || height < i2) {
            Bitmap b2 = xgVar.b(i, i2, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(b2);
            canvas.drawColor(this.d);
            canvas.drawBitmap(bitmap, (float) ((i - width) / 2), (float) ((i2 - height) / 2), (Paint) null);
            return b2;
        } else if (!bitmap.hasAlpha()) {
            return bitmap;
        } else {
            return a(xgVar, bitmap);
        }
    }

    private final Bitmap a(xg xgVar, Bitmap bitmap) {
        if (!bitmap.hasAlpha()) {
            return bitmap;
        }
        Bitmap b2 = xgVar.b(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(b2);
        canvas.drawColor(this.d);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        return b2;
    }

    public final void a(MessageDigest messageDigest) {
        messageDigest.update(this.c);
    }
}
