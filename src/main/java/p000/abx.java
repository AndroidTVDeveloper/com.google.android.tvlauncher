package p000;

import android.content.Context;
import android.net.Uri;
import android.os.Build;

/* renamed from: abx */
/* compiled from: PG */
public final class abx implements aaj {

    /* renamed from: a */
    private final Context f75a;

    /* renamed from: b */
    private final aaj f76b;

    /* renamed from: c */
    private final aaj f77c;

    /* renamed from: d */
    private final Class f78d;

    public abx(Context context, aaj aaj, aaj aaj2, Class cls) {
        this.f75a = context.getApplicationContext();
        this.f76b = aaj;
        this.f77c = aaj2;
        this.f78d = cls;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ aai mo11a(Object obj, int i, int i2, C0539tx txVar) {
        Uri uri = (Uri) obj;
        return new aai(new aho(uri), new abw(this.f75a, this.f76b, this.f77c, uri, i, i2, txVar, this.f78d));
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo12a(Object obj) {
        return Build.VERSION.SDK_INT >= 29 && bru.m4080a((Uri) obj);
    }
}
