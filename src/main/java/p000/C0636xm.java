package p000;

/* renamed from: xm */
/* compiled from: PG */
final class C0636xm implements C0641xr {

    /* renamed from: a */
    public int f10774a;

    /* renamed from: b */
    public Class f10775b;

    /* renamed from: c */
    private final C0637xn f10776c;

    public C0636xm(C0637xn xnVar) {
        this.f10776c = xnVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0636xm) {
            C0636xm xmVar = (C0636xm) obj;
            if (this.f10774a == xmVar.f10774a && this.f10775b == xmVar.f10775b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f10774a * 31;
        Class cls = this.f10775b;
        return i + (cls != null ? cls.hashCode() : 0);
    }

    /* renamed from: a */
    public final void mo6116a() {
        this.f10776c.mo6104a(this);
    }

    public final String toString() {
        int i = this.f10774a;
        String valueOf = String.valueOf(this.f10775b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
        sb.append("Key{size=");
        sb.append(i);
        sb.append("array=");
        sb.append(valueOf);
        sb.append('}');
        return sb.toString();
    }
}
