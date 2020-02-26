package defpackage;

import android.content.ContentResolver;
import android.net.Uri;

/* renamed from: abg  reason: default package */
/* compiled from: PG */
public final class abg implements aak, abi {
    private final ContentResolver a;

    public abg(ContentResolver contentResolver) {
        this.a = contentResolver;
    }

    public final ug a(Uri uri) {
        return new uc(this.a, uri);
    }

    public final aaj a(aas aas) {
        return new abk(this);
    }
}
