package defpackage;

import android.graphics.Bitmap;
import java.security.MessageDigest;

/* renamed from: adc  reason: default package */
/* compiled from: PG */
public final class adc extends acg {
    private static final byte[] b = "com.bumptech.glide.load.resource.bitmap.FitCenter".getBytes(a);

    public final int hashCode() {
        return 1572326941;
    }

    public final boolean equals(Object obj) {
        return obj instanceof adc;
    }

    /* access modifiers changed from: protected */
    public final Bitmap a(xg xgVar, Bitmap bitmap, int i, int i2) {
        return adl.b(xgVar, bitmap, i, i2);
    }

    public final void a(MessageDigest messageDigest) {
        messageDigest.update(b);
    }
}
