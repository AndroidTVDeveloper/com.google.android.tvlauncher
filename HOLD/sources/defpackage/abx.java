package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Build;

/* renamed from: abx  reason: default package */
/* compiled from: PG */
public final class abx implements aaj {
    private final Context a;
    private final aaj b;
    private final aaj c;
    private final Class d;

    public abx(Context context, aaj aaj, aaj aaj2, Class cls) {
        this.a = context.getApplicationContext();
        this.b = aaj;
        this.c = aaj2;
        this.d = cls;
    }

    public final /* bridge */ /* synthetic */ aai a(Object obj, int i, int i2, tx txVar) {
        Uri uri = (Uri) obj;
        return new aai(new aho(uri), new abw(this.a, this.b, this.c, uri, i, i2, txVar, this.d));
    }

    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        return Build.VERSION.SDK_INT >= 29 && bru.a((Uri) obj);
    }
}
