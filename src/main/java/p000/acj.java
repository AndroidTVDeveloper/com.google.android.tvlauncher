package p000;

import android.graphics.Bitmap;
import java.security.MessageDigest;

/* renamed from: acj */
/* compiled from: PG */
public final class acj extends acg {

    /* renamed from: b */
    private static final byte[] f93b = "com.bumptech.glide.load.resource.bitmap.CenterInside".getBytes(f10521a);

    public final int hashCode() {
        return -670243078;
    }

    public final boolean equals(Object obj) {
        return obj instanceof acj;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Bitmap mo42a(C0630xg xgVar, Bitmap bitmap, int i, int i2) {
        return adl.m201c(xgVar, bitmap, i, i2);
    }

    /* renamed from: a */
    public final void mo37a(MessageDigest messageDigest) {
        messageDigest.update(f93b);
    }
}
