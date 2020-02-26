package p000;

import java.util.Locale;
import java.util.Objects;

/* renamed from: cir */
/* compiled from: PG */
public final class cir extends cje {

    /* renamed from: a */
    public final chn f5665a;

    public cir(chn chn, cjd cjd, Locale locale) {
        super(chn.f5563c, chn.f5570j, cjd, locale);
        this.f5665a = chn;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cir) {
            cir cir = (cir) obj;
            if (!this.f5665a.equals(cir.f5665a) || !this.f5709c.equals(cir.f5709c) || this.f5665a.mo2812a() != cir.f5665a.mo2812a() || !this.f5710d.equals(cir.f5710d) || this.f5665a.f5572l != cir.f5665a.f5572l) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        chn chn = this.f5665a;
        return Objects.hash(chn, this.f5709c, Boolean.valueOf(chn.mo2812a()), this.f5710d, Long.valueOf(this.f5665a.f5572l));
    }

    public final String toString() {
        String chn = this.f5665a.toString();
        String valueOf = String.valueOf(this.f5709c);
        boolean a = this.f5665a.mo2812a();
        String valueOf2 = String.valueOf(this.f5710d);
        int length = String.valueOf(chn).length();
        StringBuilder sb = new StringBuilder(length + 48 + String.valueOf(valueOf).length() + String.valueOf(valueOf2).length());
        sb.append(chn);
        sb.append(", Image Type: ");
        sb.append(valueOf);
        sb.append(", Is Installing : ");
        sb.append(a);
        sb.append(", Locale : ");
        sb.append(valueOf2);
        return sb.toString();
    }
}
