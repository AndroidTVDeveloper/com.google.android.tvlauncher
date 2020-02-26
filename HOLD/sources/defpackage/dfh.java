package defpackage;

/* renamed from: dfh  reason: default package */
/* compiled from: PG */
public final class dfh implements dff {
    private volatile dff a;
    private volatile boolean b;
    private Object c;

    public dfh(dff dff) {
        this.a = (dff) dgx.a((Object) dff);
    }

    public final Object a() {
        if (!this.b) {
            synchronized (this) {
                if (!this.b) {
                    Object a2 = this.a.a();
                    this.c = a2;
                    this.b = true;
                    this.a = null;
                    return a2;
                }
            }
        }
        return this.c;
    }

    public final String toString() {
        Object obj = this.a;
        if (obj == null) {
            String valueOf = String.valueOf(this.c);
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
