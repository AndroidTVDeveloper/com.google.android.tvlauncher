package p000;

import android.content.ContentResolver;
import android.net.Uri;

/* renamed from: abg */
/* compiled from: PG */
public final class abg implements aak, abi {

    /* renamed from: a */
    private final ContentResolver f46a;

    public abg(ContentResolver contentResolver) {
        this.f46a = contentResolver;
    }

    /* renamed from: a */
    public final C0549ug mo31a(Uri uri) {
        return new C0545uc(this.f46a, uri);
    }

    /* renamed from: a */
    public final aaj mo5a(aas aas) {
        return new abk(this);
    }
}
