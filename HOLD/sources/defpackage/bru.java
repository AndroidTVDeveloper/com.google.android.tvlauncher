package defpackage;

import android.net.Uri;

/* renamed from: bru  reason: default package */
/* compiled from: PG */
public class bru {
    private bru() {
    }

    public static boolean a(int i, int i2) {
        return i != Integer.MIN_VALUE && i2 != Integer.MIN_VALUE && i <= 512 && i2 <= 384;
    }

    public boolean a(int[] iArr) {
        return false;
    }

    public boolean b() {
        return false;
    }

    public /* synthetic */ bru(byte b) {
    }

    public static boolean a(Uri uri) {
        return uri != null && "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    public static boolean b(Uri uri) {
        return uri.getPathSegments().contains("video");
    }
}
