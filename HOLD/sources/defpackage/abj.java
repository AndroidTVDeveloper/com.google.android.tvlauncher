package defpackage;

import android.content.ContentResolver;
import android.net.Uri;

/* renamed from: abj  reason: default package */
/* compiled from: PG */
public final class abj implements aak, abi {
    private final ContentResolver a;

    public abj(ContentResolver contentResolver) {
        this.a = contentResolver;
    }

    public final ug a(Uri uri) {
        return new uu(this.a, uri);
    }

    public final aaj a(aas aas) {
        return new abk(this);
    }
}
