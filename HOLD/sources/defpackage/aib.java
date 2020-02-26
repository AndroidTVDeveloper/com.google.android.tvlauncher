package defpackage;

/* renamed from: aib  reason: default package */
/* compiled from: PG */
public final class aib {
    private Class a;
    private Class b;
    private Class c;

    public aib() {
    }

    public aib(Class cls, Class cls2, Class cls3) {
        a(cls, cls2, cls3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        aib aib = (aib) obj;
        return this.a.equals(aib.a) && this.b.equals(aib.b) && aie.a(this.c, aib.c);
    }

    public final int hashCode() {
        int hashCode = ((this.a.hashCode() * 31) + this.b.hashCode()) * 31;
        Class cls = this.c;
        return hashCode + (cls != null ? cls.hashCode() : 0);
    }

    public final void a(Class cls, Class cls2, Class cls3) {
        this.a = cls;
        this.b = cls2;
        this.c = cls3;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 30 + String.valueOf(valueOf2).length());
        sb.append("MultiClassKey{first=");
        sb.append(valueOf);
        sb.append(", second=");
        sb.append(valueOf2);
        sb.append('}');
        return sb.toString();
    }
}
