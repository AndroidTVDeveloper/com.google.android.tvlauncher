package defpackage;

import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import java.util.Locale;
import java.util.Objects;

/* renamed from: cje  reason: default package */
/* compiled from: PG */
public class cje {
    private final String a;
    public final ResolveInfo b;
    public final cjd c;
    public final Locale d;

    public cje(String str, ResolveInfo resolveInfo, cjd cjd, Locale locale) {
        this.a = str;
        this.b = resolveInfo;
        this.c = cjd;
        this.d = locale;
    }

    public boolean equals(Object obj) {
        if (obj instanceof cje) {
            cje cje = (cje) obj;
            if (!TextUtils.equals(this.a, cje.a) || !this.c.equals(cje.c) || !this.d.equals(cje.d)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(this.a, this.c, this.d);
    }

    public String toString() {
        String str = this.a;
        String valueOf = String.valueOf(this.c);
        String valueOf2 = String.valueOf(this.d);
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 25 + String.valueOf(valueOf).length() + String.valueOf(valueOf2).length());
        sb.append(str);
        sb.append(", Image Type: ");
        sb.append(valueOf);
        sb.append(", Locale : ");
        sb.append(valueOf2);
        return sb.toString();
    }
}
