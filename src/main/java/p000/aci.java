package p000;

import android.graphics.Bitmap;
import java.security.MessageDigest;

/* renamed from: aci */
/* compiled from: PG */
public final class aci extends acg {

    /* renamed from: b */
    private static final byte[] f92b = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(f10521a);

    public final int hashCode() {
        return -599754482;
    }

    public final boolean equals(Object obj) {
        return obj instanceof aci;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Bitmap mo42a(C0630xg xgVar, Bitmap bitmap, int i, int i2) {
        return adl.m196a(xgVar, bitmap, i, i2);
    }

    /* renamed from: a */
    public final void mo37a(MessageDigest messageDigest) {
        messageDigest.update(f92b);
    }
}
