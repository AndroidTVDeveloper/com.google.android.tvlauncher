package p000;

import android.text.TextUtils;
import androidx.preference.Preference;

/* renamed from: rd */
/* compiled from: PG */
final class C0465rd {

    /* renamed from: a */
    public final int f10238a;

    /* renamed from: b */
    public final int f10239b;

    /* renamed from: c */
    private final String f10240c;

    public C0465rd(Preference preference) {
        this.f10240c = preference.getClass().getName();
        this.f10238a = preference.f1371y;
        this.f10239b = preference.f1372z;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0465rd) {
            C0465rd rdVar = (C0465rd) obj;
            if (this.f10238a == rdVar.f10238a && this.f10239b == rdVar.f10239b && TextUtils.equals(this.f10240c, rdVar.f10240c)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f10238a + 527) * 31) + this.f10239b) * 31) + this.f10240c.hashCode();
    }
}
