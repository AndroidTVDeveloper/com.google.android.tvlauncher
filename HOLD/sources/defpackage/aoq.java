package defpackage;

/* renamed from: aoq  reason: default package */
/* compiled from: PG */
public final class aoq {
    public final aot a;
    public final aot b;

    public aoq(aot aot) {
        this(aot, aot);
    }

    public aoq(aot aot, aot aot2) {
        this.a = (aot) bks.a(aot);
        this.b = (aot) bks.a(aot2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        aoq aoq = (aoq) obj;
        return this.a.equals(aoq.a) && this.b.equals(aoq.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        String str;
        String valueOf = String.valueOf(this.a);
        if (!this.a.equals(this.b)) {
            String valueOf2 = String.valueOf(this.b);
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
