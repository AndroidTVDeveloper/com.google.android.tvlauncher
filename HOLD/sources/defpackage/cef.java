package defpackage;

import android.util.Base64;
import android.util.Log;
import java.io.IOException;

/* renamed from: cef  reason: default package */
/* compiled from: PG */
public final class cef extends ceh {
    public cef(ceg ceg, String str, Object obj) {
        super(ceg, str, obj);
    }

    public final Object a(Object obj) {
        if (obj instanceof String) {
            try {
                return (dni) dje.a(dni.b, Base64.decode((String) obj, 3));
            } catch (IOException | IllegalArgumentException e) {
            }
        }
        String b = super.b();
        String valueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 27 + String.valueOf(valueOf).length());
        sb.append("Invalid byte[] value for ");
        sb.append(b);
        sb.append(": ");
        sb.append(valueOf);
        Log.e("PhenotypeFlag", sb.toString());
        return null;
    }
}
