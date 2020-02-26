package defpackage;

import java.io.Serializable;

/* renamed from: dfg  reason: default package */
/* compiled from: PG */
public final class dfg implements Serializable, dff {
    public static final long serialVersionUID = 0;
    private final dff a;
    private volatile transient boolean b;
    private transient Object c;

    public dfg(dff dff) {
        this.a = (dff) dgx.a((Object) dff);
    }

    public final Object a() {
        if (!this.b) {
            synchronized (this) {
                if (!this.b) {
                    Object a2 = this.a.a();
                    this.c = a2;
                    this.b = true;
                    return a2;
                }
            }
        }
        return this.c;
    }

    public final String toString() {
        Object obj;
        if (this.b) {
            String valueOf = String.valueOf(this.c);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
            sb.append("<supplier that returned ");
            sb.append(valueOf);
            sb.append(">");
            obj = sb.toString();
        } else {
            obj = this.a;
        }
        String valueOf2 = String.valueOf(obj);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 19);
        sb2.append("Suppliers.memoize(");
        sb2.append(valueOf2);
        sb2.append(")");
        return sb2.toString();
    }
}
