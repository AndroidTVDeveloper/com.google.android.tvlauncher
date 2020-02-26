package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.io.File;

/* renamed from: abc  reason: default package */
/* compiled from: PG */
public final class abc implements aaj {
    private final aaj a;

    public abc(aaj aaj) {
        this.a = aaj;
    }

    public final /* bridge */ /* synthetic */ aai a(Object obj, int i, int i2, tx txVar) {
        Uri uri;
        String str = (String) obj;
        if (TextUtils.isEmpty(str)) {
            uri = null;
        } else if (str.charAt(0) == '/') {
            uri = a(str);
        } else {
            Uri parse = Uri.parse(str);
            uri = parse.getScheme() != null ? parse : a(str);
        }
        if (uri == null || !this.a.a(uri)) {
            return null;
        }
        return this.a.a(uri, i, i2, txVar);
    }

    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        String str = (String) obj;
        return true;
    }

    private static Uri a(String str) {
        return Uri.fromFile(new File(str));
    }
}
