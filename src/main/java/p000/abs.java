package p000;

import android.content.Context;
import android.net.Uri;

/* renamed from: abs */
/* compiled from: PG */
public final class abs implements aaj {

    /* renamed from: a */
    private final Context f59a;

    public abs(Context context) {
        this.f59a = context.getApplicationContext();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ aai mo11a(Object obj, int i, int i2, C0539tx txVar) {
        Uri uri = (Uri) obj;
        if (!bru.m4079a(i, i2)) {
            return null;
        }
        aho aho = new aho(uri);
        Context context = this.f59a;
        return new aai(aho, C0566ux.m8460a(context, uri, new C0564uv(context.getContentResolver())));
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo12a(Object obj) {
        Uri uri = (Uri) obj;
        return bru.m4080a(uri) && !bru.m4081b(uri);
    }
}
