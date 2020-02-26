package defpackage;

import android.content.res.AssetManager;

/* renamed from: yx  reason: default package */
/* compiled from: PG */
public final class yx implements aak, yv {
    private final AssetManager a;

    public yx(AssetManager assetManager) {
        this.a = assetManager;
    }

    public final aaj a(aas aas) {
        return new yy(this.a, this);
    }

    public final ug a(AssetManager assetManager, String str) {
        return new ut(assetManager, str);
    }
}
