package p000;

/* renamed from: aoq */
/* compiled from: PG */
public final class aoq {

    /* renamed from: a */
    public final aot f1515a;

    /* renamed from: b */
    public final aot f1516b;

    public aoq(aot aot) {
        this(aot, aot);
    }

    public aoq(aot aot, aot aot2) {
        this.f1515a = (aot) bks.m3507a(aot);
        this.f1516b = (aot) bks.m3507a(aot2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        aoq aoq = (aoq) obj;
        return this.f1515a.equals(aoq.f1515a) && this.f1516b.equals(aoq.f1516b);
    }

    public final int hashCode() {
        return (this.f1515a.hashCode() * 31) + this.f1516b.hashCode();
    }

    public final String toString() {
        String str;
        String valueOf = String.valueOf(this.f1515a);
        if (!this.f1515a.equals(this.f1516b)) {
            String valueOf2 = String.valueOf(this.f1516b);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 2);
            sb.append(", ");
            sb.append(valueOf2);
            str = sb.toString();
        } else {
            str = "";
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 2 + String.valueOf(str).length());
        sb2.append("[");
        sb2.append(valueOf);
        sb2.append(str);
        sb2.append("]");
        return sb2.toString();
    }
}
