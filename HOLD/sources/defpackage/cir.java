package defpackage;

import java.util.Locale;
import java.util.Objects;

/* renamed from: cir  reason: default package */
/* compiled from: PG */
public final class cir extends cje {
    public final chn a;

    public cir(chn chn, cjd cjd, Locale locale) {
        super(chn.c, chn.j, cjd, locale);
        this.a = chn;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cir) {
            cir cir = (cir) obj;
            if (!this.a.equals(cir.a) || !this.c.equals(cir.c) || this.a.a() != cir.a.a() || !this.d.equals(cir.d) || this.a.l != cir.a.l) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        chn chn = this.a;
        return Objects.hash(chn, this.c, Boolean.valueOf(chn.a()), this.d, Long.valueOf(this.a.l));
    }

    public final String toString() {
        String chn = this.a.toString();
        String valueOf = String.valueOf(this.c);
        boolean a2 = this.a.a();
        String valueOf2 = String.valueOf(this.d);
        int length = String.valueOf(chn).length();
        StringBuilder sb = new StringBuilder(length + 48 + String.valueOf(valueOf).length() + String.valueOf(valueOf2).length());
        sb.append(chn);
        sb.append(", Image Type: ");
        sb.append(valueOf);
        sb.append(", Is Installing : ");
        sb.append(a2);
        sb.append(", Locale : ");
        sb.append(valueOf2);
        return sb.toString();
    }
}
