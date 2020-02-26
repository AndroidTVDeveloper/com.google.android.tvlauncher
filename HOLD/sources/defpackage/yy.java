package defpackage;

import android.content.res.AssetManager;
import android.net.Uri;

/* renamed from: yy  reason: default package */
/* compiled from: PG */
public final class yy implements aaj {
    private final AssetManager a;
    private final yv b;

    public yy(AssetManager assetManager, yv yvVar) {
        this.a = assetManager;
        this.b = yvVar;
    }

    public final /* bridge */ /* synthetic */ aai a(Object obj, int i, int i2, tx txVar) {
        Uri uri = (Uri) obj;
        return new aai(new aho(uri), this.b.a(this.a, uri.toString().substring(22)));
    }

    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        Uri uri = (Uri) obj;
        if ("file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0))) {
            return true;
        }
        return false;
    }
}
