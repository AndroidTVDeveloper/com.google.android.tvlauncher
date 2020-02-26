package defpackage;

import android.content.Context;
import android.net.Uri;

/* renamed from: abu  reason: default package */
/* compiled from: PG */
public final class abu implements aaj {
    private final Context a;

    public abu(Context context) {
        this.a = context.getApplicationContext();
    }

    public final /* bridge */ /* synthetic */ aai a(Object obj, int i, int i2, tx txVar) {
        Long l;
        Uri uri = (Uri) obj;
        if (!bru.a(i, i2) || (l = (Long) txVar.a(adt.a)) == null || l.longValue() != -1) {
            return null;
        }
        aho aho = new aho(uri);
        Context context = this.a;
        return new aai(aho, ux.a(context, uri, new uw(context.getContentResolver())));
    }

    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        Uri uri = (Uri) obj;
        return bru.a(uri) && bru.b(uri);
    }
}
