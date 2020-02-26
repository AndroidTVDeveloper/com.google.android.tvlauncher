package p000;

import android.content.ContentResolver;
import android.net.Uri;

/* renamed from: abj */
/* compiled from: PG */
public final class abj implements aak, abi {

    /* renamed from: a */
    private final ContentResolver f48a;

    public abj(ContentResolver contentResolver) {
        this.f48a = contentResolver;
    }

    /* renamed from: a */
    public final C0549ug mo31a(Uri uri) {
        return new C0563uu(this.f48a, uri);
    }

    /* renamed from: a */
    public final aaj mo5a(aas aas) {
        return new abk(this);
    }
}
