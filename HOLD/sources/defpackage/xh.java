package defpackage;

import android.graphics.Bitmap;

/* renamed from: xh  reason: default package */
/* compiled from: PG */
public class xh implements xg {
    public final void a() {
    }

    public final void a(int i) {
    }

    public final Bitmap a(int i, int i2, Bitmap.Config config) {
        return Bitmap.createBitmap(i, i2, config);
    }

    public final Bitmap b(int i, int i2, Bitmap.Config config) {
        return Bitmap.createBitmap(i, i2, config);
    }

    public void a(Bitmap bitmap) {
        bitmap.recycle();
    }
}
