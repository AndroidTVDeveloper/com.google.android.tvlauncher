package p000;

import android.content.res.AssetManager;
import android.os.ParcelFileDescriptor;

/* renamed from: un */
/* compiled from: PG */
public final class C0556un extends C0546ud {
    public C0556un(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    /* renamed from: a */
    public final Class mo6a() {
        return ParcelFileDescriptor.class;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6000a(Object obj) {
        ((ParcelFileDescriptor) obj).close();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5999a(AssetManager assetManager, String str) {
        return assetManager.openFd(str).getParcelFileDescriptor();
    }
}
