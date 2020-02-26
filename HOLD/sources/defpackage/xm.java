package defpackage;

/* renamed from: xm  reason: default package */
/* compiled from: PG */
final class xm implements xr {
    public int a;
    public Class b;
    private final xn c;

    public xm(xn xnVar) {
        this.c = xnVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof xm) {
            xm xmVar = (xm) obj;
            if (this.a == xmVar.a && this.b == xmVar.b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a * 31;
        Class cls = this.b;
        return i + (cls != null ? cls.hashCode() : 0);
    }

    public final void a() {
        this.c.a(this);
    }

    public final String toString() {
        int i = this.a;
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
        sb.append("Key{size=");
        sb.append(i);
        sb.append("array=");
        sb.append(valueOf);
        sb.append('}');
        return sb.toString();
    }
}
