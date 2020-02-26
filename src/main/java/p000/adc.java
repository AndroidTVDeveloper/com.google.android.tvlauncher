package p000;

import android.graphics.Bitmap;
import java.security.MessageDigest;

/* renamed from: adc */
/* compiled from: PG */
public final class adc extends acg {

    /* renamed from: b */
    private static final byte[] f130b = "com.bumptech.glide.load.resource.bitmap.FitCenter".getBytes(f10521a);

    public final int hashCode() {
        return 1572326941;
    }

    public final boolean equals(Object obj) {
        return obj instanceof adc;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Bitmap mo42a(C0630xg xgVar, Bitmap bitmap, int i, int i2) {
        return adl.m199b(xgVar, bitmap, i, i2);
    }

    /* renamed from: a */
    public final void mo37a(MessageDigest messageDigest) {
        messageDigest.update(f130b);
    }
}
