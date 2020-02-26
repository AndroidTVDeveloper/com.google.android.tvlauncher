package defpackage;

import android.net.Uri;

/* renamed from: cec  reason: default package */
/* compiled from: PG */
public final class cec {
    private static final cl a = new cl();

    public static synchronized Uri a(String str) {
        Uri uri;
        synchronized (cec.class) {
            uri = (Uri) a.get(str);
            if (uri == null) {
                String valueOf = String.valueOf(Uri.encode(str));
                uri = Uri.parse(valueOf.length() == 0 ? new String("content://com.google.android.gms.phenotype/") : "content://com.google.android.gms.phenotype/".concat(valueOf));
                a.put(str, uri);
            }
        }
        return uri;
    }
}
