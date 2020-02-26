package p000;

import android.content.Context;
import android.net.Uri;

/* renamed from: abu */
/* compiled from: PG */
public final class abu implements aaj {

    /* renamed from: a */
    private final Context f61a;

    public abu(Context context) {
        this.f61a = context.getApplicationContext();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ aai mo11a(Object obj, int i, int i2, C0539tx txVar) {
        Long l;
        Uri uri = (Uri) obj;
        if (!bru.m4079a(i, i2) || (l = (Long) txVar.mo5987a(adt.f157a)) == null || l.longValue() != -1) {
            return null;
        }
        aho aho = new aho(uri);
        Context context = this.f61a;
        return new aai(aho, C0566ux.m8460a(context, uri, new C0565uw(context.getContentResolver())));
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo12a(Object obj) {
        Uri uri = (Uri) obj;
        return bru.m4080a(uri) && bru.m4081b(uri);
    }
}
