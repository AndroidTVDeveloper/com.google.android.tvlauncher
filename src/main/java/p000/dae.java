package p000;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import java.security.MessageDigest;
import java.util.Arrays;

/* renamed from: dae */
/* compiled from: PG */
public final class dae extends acg {

    /* renamed from: b */
    private static final byte[] f8034b = "com.google.android.tvLauncher.util.AddBackgroundColorTransformation".getBytes(f10521a);

    /* renamed from: c */
    private final byte[] f8035c;

    /* renamed from: d */
    private final int f8036d;

    /* renamed from: e */
    private int f8037e;

    /* renamed from: f */
    private boolean f8038f = false;

    /* renamed from: g */
    private final boolean f8039g;

    /* JADX WARN: Type inference failed for: r0v1, types: [byte[]] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public dae(int r5, boolean r6) {
        /*
            r4 = this;
            r4.<init>()
            r0 = 0
            r4.f8038f = r0
            r4.f8036d = r5
            byte[] r1 = p000.dae.f8034b
            int r2 = r1.length
            int r2 = r2 + 5
            byte[] r2 = new byte[r2]
            r4.f8035c = r2
            int r3 = r1.length
            java.lang.System.arraycopy(r1, r0, r2, r0, r3)
            byte[] r0 = r4.f8035c
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
            r4.f8039g = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.dae.<init>(int, boolean):void");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dae) || ((dae) obj).f8036d != this.f8036d) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        if (this.f8038f) {
            return this.f8037e;
        }
        this.f8038f = true;
        int hashCode = Arrays.hashCode(this.f8035c);
        this.f8037e = hashCode;
        return hashCode;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Bitmap mo42a(C0630xg xgVar, Bitmap bitmap, int i, int i2) {
        if (!this.f8039g) {
            return m6047a(xgVar, bitmap);
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width < i || height < i2) {
            Bitmap b = xgVar.mo6109b(i, i2, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(b);
            canvas.drawColor(this.f8036d);
            canvas.drawBitmap(bitmap, (float) ((i - width) / 2), (float) ((i2 - height) / 2), (Paint) null);
            return b;
        } else if (!bitmap.hasAlpha()) {
            return bitmap;
        } else {
            return m6047a(xgVar, bitmap);
        }
    }

    /* renamed from: a */
    private final Bitmap m6047a(C0630xg xgVar, Bitmap bitmap) {
        if (!bitmap.hasAlpha()) {
            return bitmap;
        }
        Bitmap b = xgVar.mo6109b(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(b);
        canvas.drawColor(this.f8036d);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        return b;
    }

    /* renamed from: a */
    public final void mo37a(MessageDigest messageDigest) {
        messageDigest.update(this.f8035c);
    }
}
