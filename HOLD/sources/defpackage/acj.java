package defpackage;

import android.graphics.Bitmap;
import java.security.MessageDigest;

/* renamed from: acj  reason: default package */
/* compiled from: PG */
public final class acj extends acg {
    private static final byte[] b = "com.bumptech.glide.load.resource.bitmap.CenterInside".getBytes(a);

    public final int hashCode() {
        return -670243078;
    }

    public final boolean equals(Object obj) {
        return obj instanceof acj;
    }

    /* access modifiers changed from: protected */
    public final Bitmap a(xg xgVar, Bitmap bitmap, int i, int i2) {
        return adl.c(xgVar, bitmap, i, i2);
    }

    public final void a(MessageDigest messageDigest) {
        messageDigest.update(b);
    }
}
