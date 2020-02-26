package p000;

import android.net.Uri;
import java.util.LinkedHashMap;

/* renamed from: bba */
/* compiled from: PG */
final class bba {

    /* renamed from: a */
    public final LinkedHashMap f3046a = new baz();

    /* renamed from: a */
    public final byte[] mo1707a(Uri uri) {
        if (uri != null) {
            return (byte[]) this.f3046a.get(uri);
        }
        return null;
    }

    /* renamed from: a */
    public final void mo1706a(Uri uri, byte[] bArr) {
        byte[] bArr2 = (byte[]) this.f3046a.put((Uri) bks.m3507a(uri), (byte[]) bks.m3507a(bArr));
    }
}
