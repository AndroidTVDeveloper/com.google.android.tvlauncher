package p000;

import android.net.Uri;
import android.text.TextUtils;
import java.io.File;

/* renamed from: abc */
/* compiled from: PG */
public final class abc implements aaj {

    /* renamed from: a */
    private final aaj f42a;

    public abc(aaj aaj) {
        this.f42a = aaj;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ aai mo11a(Object obj, int i, int i2, C0539tx txVar) {
        Uri uri;
        String str = (String) obj;
        if (TextUtils.isEmpty(str)) {
            uri = null;
        } else if (str.charAt(0) == '/') {
            uri = m49a(str);
        } else {
            Uri parse = Uri.parse(str);
            uri = parse.getScheme() != null ? parse : m49a(str);
        }
        if (uri == null || !this.f42a.mo12a(uri)) {
            return null;
        }
        return this.f42a.mo11a(uri, i, i2, txVar);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo12a(Object obj) {
        String str = (String) obj;
        return true;
    }

    /* renamed from: a */
    private static Uri m49a(String str) {
        return Uri.fromFile(new File(str));
    }
}
