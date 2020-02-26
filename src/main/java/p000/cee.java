package p000;

import android.util.Log;

/* renamed from: cee */
/* compiled from: PG */
public final class cee extends ceh {
    public cee(ceg ceg, String str, Boolean bool) {
        super(ceg, str, bool);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo2690a(Object obj) {
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (byi.f5005b.matcher(str).matches()) {
                return true;
            }
            if (byi.f5006c.matcher(str).matches()) {
                return false;
            }
        }
        String b = super.mo2693b();
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
