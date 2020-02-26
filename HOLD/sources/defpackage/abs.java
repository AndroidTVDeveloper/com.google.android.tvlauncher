package defpackage;

import android.content.Context;
import android.net.Uri;

/* renamed from: abs  reason: default package */
/* compiled from: PG */
public final class abs implements aaj {
    private final Context a;

    public abs(Context context) {
        this.a = context.getApplicationContext();
    }

    public final /* bridge */ /* synthetic */ aai a(Object obj, int i, int i2, tx txVar) {
        Uri uri = (Uri) obj;
        if (!bru.a(i, i2)) {
            return null;
        }
        aho aho = new aho(uri);
        Context context = this.a;
        return new aai(aho, ux.a(context, uri, new uv(context.getContentResolver())));
    }

    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        Uri uri = (Uri) obj;
        return bru.a(uri) && !bru.b(uri);
    }
}
