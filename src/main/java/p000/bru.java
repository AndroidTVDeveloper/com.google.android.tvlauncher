package p000;

import android.net.Uri;

/* renamed from: bru */
/* compiled from: PG */
public class bru {
    private bru() {
    }

    /* renamed from: a */
    public static boolean m4079a(int i, int i2) {
        return i != Integer.MIN_VALUE && i2 != Integer.MIN_VALUE && i <= 512 && i2 <= 384;
    }

    /* renamed from: a */
    public boolean mo2362a(int[] iArr) {
        return false;
    }

    /* renamed from: b */
    public boolean mo2363b() {
        return false;
    }

    public /* synthetic */ bru(byte b) {
    }

    /* renamed from: a */
    public static boolean m4080a(Uri uri) {
        return uri != null && "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    /* renamed from: b */
    public static boolean m4081b(Uri uri) {
        return uri.getPathSegments().contains("video");
    }
}
