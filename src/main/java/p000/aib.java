package p000;

/* renamed from: aib */
/* compiled from: PG */
public final class aib {

    /* renamed from: a */
    private Class f394a;

    /* renamed from: b */
    private Class f395b;

    /* renamed from: c */
    private Class f396c;

    public aib() {
    }

    public aib(Class cls, Class cls2, Class cls3) {
        mo306a(cls, cls2, cls3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        aib aib = (aib) obj;
        return this.f394a.equals(aib.f394a) && this.f395b.equals(aib.f395b) && aie.m561a(this.f396c, aib.f396c);
    }

    public final int hashCode() {
        int hashCode = ((this.f394a.hashCode() * 31) + this.f395b.hashCode()) * 31;
        Class cls = this.f396c;
        return hashCode + (cls != null ? cls.hashCode() : 0);
    }

    /* renamed from: a */
    public final void mo306a(Class cls, Class cls2, Class cls3) {
        this.f394a = cls;
        this.f395b = cls2;
        this.f396c = cls3;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f394a);
        String valueOf2 = String.valueOf(this.f395b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 30 + String.valueOf(valueOf2).length());
        sb.append("MultiClassKey{first=");
        sb.append(valueOf);
        sb.append(", second=");
        sb.append(valueOf2);
        sb.append('}');
        return sb.toString();
    }
}
