package p000;

import android.content.Context;
import android.net.Uri;

/* renamed from: aad */
/* compiled from: PG */
public final class aad implements aaj {

    /* renamed from: a */
    private final Context f8a;

    public aad(Context context) {
        this.f8a = context;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ aai mo11a(Object obj, int i, int i2, C0539tx txVar) {
        Uri uri = (Uri) obj;
        return new aai(new aho(uri), new aac(this.f8a, uri));
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo12a(Object obj) {
        return bru.m4080a((Uri) obj);
    }
}
