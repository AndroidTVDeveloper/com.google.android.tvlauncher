package defpackage;

import android.content.res.AssetManager;

/* renamed from: yw  reason: default package */
/* compiled from: PG */
public final class yw implements aak, yv {
    private final AssetManager a;

    public yw(AssetManager assetManager) {
        this.a = assetManager;
    }

    public final aaj a(aas aas) {
        return new yy(this.a, this);
    }

    public final ug a(AssetManager assetManager, String str) {
        return new un(assetManager, str);
    }
}
