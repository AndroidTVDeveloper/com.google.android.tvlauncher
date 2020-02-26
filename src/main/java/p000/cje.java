package p000;

import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import java.util.Locale;
import java.util.Objects;

/* renamed from: cje */
/* compiled from: PG */
public class cje {

    /* renamed from: a */
    private final String f5707a;

    /* renamed from: b */
    public final ResolveInfo f5708b;

    /* renamed from: c */
    public final cjd f5709c;

    /* renamed from: d */
    public final Locale f5710d;

    public cje(String str, ResolveInfo resolveInfo, cjd cjd, Locale locale) {
        this.f5707a = str;
        this.f5708b = resolveInfo;
        this.f5709c = cjd;
        this.f5710d = locale;
    }

    public boolean equals(Object obj) {
        if (obj instanceof cje) {
            cje cje = (cje) obj;
            if (!TextUtils.equals(this.f5707a, cje.f5707a) || !this.f5709c.equals(cje.f5709c) || !this.f5710d.equals(cje.f5710d)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(this.f5707a, this.f5709c, this.f5710d);
    }

    public String toString() {
        String str = this.f5707a;
        String valueOf = String.valueOf(this.f5709c);
        String valueOf2 = String.valueOf(this.f5710d);
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
