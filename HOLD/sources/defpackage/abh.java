package defpackage;

import android.content.ContentResolver;
import android.net.Uri;

/* renamed from: abh  reason: default package */
/* compiled from: PG */
public final class abh implements aak, abi {
    private final ContentResolver a;

    public abh(ContentResolver contentResolver) {
        this.a = contentResolver;
    }

    public final ug a(Uri uri) {
        return new uo(this.a, uri);
    }

    public final aaj a(aas aas) {
        return new abk(this);
    }
}
