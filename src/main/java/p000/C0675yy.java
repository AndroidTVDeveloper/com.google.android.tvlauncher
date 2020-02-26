package p000;

import android.content.res.AssetManager;
import android.net.Uri;

/* renamed from: yy */
/* compiled from: PG */
public final class C0675yy implements aaj {

    /* renamed from: a */
    private final AssetManager f10842a;

    /* renamed from: b */
    private final C0672yv f10843b;

    public C0675yy(AssetManager assetManager, C0672yv yvVar) {
        this.f10842a = assetManager;
        this.f10843b = yvVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ aai mo11a(Object obj, int i, int i2, C0539tx txVar) {
        Uri uri = (Uri) obj;
        return new aai(new aho(uri), this.f10843b.mo6153a(this.f10842a, uri.toString().substring(22)));
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo12a(Object obj) {
        Uri uri = (Uri) obj;
        if ("file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0))) {
            return true;
        }
        return false;
    }
}
