package defpackage;

import android.util.Log;

/* renamed from: cee  reason: default package */
/* compiled from: PG */
public final class cee extends ceh {
    public cee(ceg ceg, String str, Boolean bool) {
        super(ceg, str, bool);
    }

    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (byi.b.matcher(str).matches()) {
                return true;
            }
            if (byi.c.matcher(str).matches()) {
                return false;
            }
        }
        String b = super.b();
        String valueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 28 + String.valueOf(valueOf).length());
        sb.append("Invalid boolean value for ");
        sb.append(b);
        sb.append(": ");
        sb.append(valueOf);
        Log.e("PhenotypeFlag", sb.toString());
        return null;
    }
}
