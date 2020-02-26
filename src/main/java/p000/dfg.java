package p000;

import java.io.Serializable;

/* renamed from: dfg */
/* compiled from: PG */
public final class dfg implements Serializable, dff {
    public static final long serialVersionUID = 0;

    /* renamed from: a */
    private final dff f8445a;

    /* renamed from: b */
    private volatile transient boolean f8446b;

    /* renamed from: c */
    private transient Object f8447c;

    public dfg(dff dff) {
        this.f8445a = (dff) dgx.m6401a((Object) dff);
    }

    /* renamed from: a */
    public final Object mo2551a() {
        if (!this.f8446b) {
            synchronized (this) {
                if (!this.f8446b) {
                    Object a = this.f8445a.mo2551a();
                    this.f8447c = a;
                    this.f8446b = true;
                    return a;
                }
            }
        }
        return this.f8447c;
    }

    public final String toString() {
        Object obj;
        if (this.f8446b) {
            String valueOf = String.valueOf(this.f8447c);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
            sb.append("<supplier that returned ");
            sb.append(valueOf);
            sb.append(">");
            obj = sb.toString();
        } else {
            obj = this.f8445a;
        }
        String valueOf2 = String.valueOf(obj);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 19);
        sb2.append("Suppliers.memoize(");
        sb2.append(valueOf2);
        sb2.append(")");
        return sb2.toString();
    }
}
