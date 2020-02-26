package p000;

import android.content.res.AssetManager;
import java.io.InputStream;

/* renamed from: ut */
/* compiled from: PG */
public final class C0562ut extends C0546ud {
    public C0562ut(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    /* renamed from: a */
    public final Class mo6a() {
        return InputStream.class;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6000a(Object obj) {
        ((InputStream) obj).close();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5999a(AssetManager assetManager, String str) {
        return assetManager.open(str);
    }
}
