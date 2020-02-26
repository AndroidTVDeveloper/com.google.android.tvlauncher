package defpackage;

import android.content.Context;
import android.net.Uri;

/* renamed from: aad  reason: default package */
/* compiled from: PG */
public final class aad implements aaj {
    private final Context a;

    public aad(Context context) {
        this.a = context;
    }

    public final /* bridge */ /* synthetic */ aai a(Object obj, int i, int i2, tx txVar) {
        Uri uri = (Uri) obj;
        return new aai(new aho(uri), new aac(this.a, uri));
    }

    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        return bru.a((Uri) obj);
    }
}
