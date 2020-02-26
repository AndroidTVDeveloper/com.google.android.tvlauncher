package p000;

import android.content.ContentResolver;
import android.net.Uri;

/* renamed from: abh */
/* compiled from: PG */
public final class abh implements aak, abi {

    /* renamed from: a */
    private final ContentResolver f47a;

    public abh(ContentResolver contentResolver) {
        this.f47a = contentResolver;
    }

    /* renamed from: a */
    public final C0549ug mo31a(Uri uri) {
        return new C0557uo(this.f47a, uri);
    }

    /* renamed from: a */
    public final aaj mo5a(aas aas) {
        return new abk(this);
    }
}
