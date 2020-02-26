package defpackage;

import android.net.Uri;
import java.util.LinkedHashMap;

/* renamed from: bba  reason: default package */
/* compiled from: PG */
final class bba {
    public final LinkedHashMap a = new baz();

    public final byte[] a(Uri uri) {
        if (uri != null) {
            return (byte[]) this.a.get(uri);
        }
        return null;
    }

    public final void a(Uri uri, byte[] bArr) {
        byte[] bArr2 = (byte[]) this.a.put((Uri) bks.a(uri), (byte[]) bks.a(bArr));
    }
}
