package defpackage;

import android.text.TextUtils;
import androidx.preference.Preference;

/* renamed from: rd  reason: default package */
/* compiled from: PG */
final class rd {
    public final int a;
    public final int b;
    private final String c;

    public rd(Preference preference) {
        this.c = preference.getClass().getName();
        this.a = preference.y;
        this.b = preference.z;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof rd) {
            rd rdVar = (rd) obj;
            if (this.a == rdVar.a && this.b == rdVar.b && TextUtils.equals(this.c, rdVar.c)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a + 527) * 31) + this.b) * 31) + this.c.hashCode();
    }
}
