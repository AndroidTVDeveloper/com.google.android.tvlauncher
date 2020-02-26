package p000;

import android.net.Uri;

/* renamed from: cec */
/* compiled from: PG */
public final class cec {

    /* renamed from: a */
    private static final C0067cl f5351a = new C0067cl();

    /* renamed from: a */
    public static synchronized Uri m4600a(String str) {
        Uri uri;
        synchronized (cec.class) {
            uri = (Uri) f5351a.get(str);
            if (uri == null) {
                String valueOf = String.valueOf(Uri.encode(str));
                uri = Uri.parse(valueOf.length() == 0 ? new String("content://com.google.android.gms.phenotype/") : "content://com.google.android.gms.phenotype/".concat(valueOf));
                f5351a.put(str, uri);
            }
        }
        return uri;
    }
}
