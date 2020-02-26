package defpackage;

import android.content.res.AssetManager;
import android.os.ParcelFileDescriptor;

/* renamed from: un  reason: default package */
/* compiled from: PG */
public final class un extends ud {
    public un(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    public final Class a() {
        return ParcelFileDescriptor.class;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        ((ParcelFileDescriptor) obj).close();
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object a(AssetManager assetManager, String str) {
        return assetManager.openFd(str).getParcelFileDescriptor();
    }
}
