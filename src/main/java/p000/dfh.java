package p000;

/* renamed from: dfh */
/* compiled from: PG */
public final class dfh implements dff {

    /* renamed from: a */
    private volatile dff f8448a;

    /* renamed from: b */
    private volatile boolean f8449b;

    /* renamed from: c */
    private Object f8450c;

    public dfh(dff dff) {
        this.f8448a = (dff) dgx.m6401a((Object) dff);
    }

    /* renamed from: a */
    public final Object mo2551a() {
        if (!this.f8449b) {
            synchronized (this) {
                if (!this.f8449b) {
                    Object a = this.f8448a.mo2551a();
                    this.f8450c = a;
                    this.f8449b = true;
                    this.f8448a = null;
                    return a;
                }
            }
        }
        return this.f8450c;
    }

    public final String toString() {
        Object obj = this.f8448a;
        if (obj == null) {
            String valueOf = String.valueOf(this.f8450c);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
            sb.append("<supplier that returned ");
            sb.append(valueOf);
            sb.append(">");
            obj = sb.toString();
        }
        String valueOf2 = String.valueOf(obj);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 19);
        sb2.append("Suppliers.memoize(");
        sb2.append(valueOf2);
        sb2.append(")");
        return sb2.toString();
    }
}
