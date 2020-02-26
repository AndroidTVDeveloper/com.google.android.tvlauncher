package defpackage;

import android.content.res.AssetManager;
import java.io.InputStream;

/* renamed from: ut  reason: default package */
/* compiled from: PG */
public final class ut extends ud {
    public ut(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    public final Class a() {
        return InputStream.class;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        ((InputStream) obj).close();
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object a(AssetManager assetManager, String str) {
        return assetManager.open(str);
    }
}
