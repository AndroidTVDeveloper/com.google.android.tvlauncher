package defpackage;

import android.graphics.Bitmap;
import java.security.MessageDigest;

/* renamed from: aci  reason: default package */
/* compiled from: PG */
public final class aci extends acg {
    private static final byte[] b = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(a);

    public final int hashCode() {
        return -599754482;
    }

    public final boolean equals(Object obj) {
        return obj instanceof aci;
    }

    /* access modifiers changed from: protected */
    public final Bitmap a(xg xgVar, Bitmap bitmap, int i, int i2) {
        return adl.a(xgVar, bitmap, i, i2);
    }

    public final void a(MessageDigest messageDigest) {
        messageDigest.update(b);
    }
}
