package defpackage;

import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* renamed from: xo  reason: default package */
/* compiled from: PG */
public final class xo implements xe {
    private final xk a;
    private final xn b;
    private final Map c;
    private final Map d;
    private final int e;
    private int f;

    public xo() {
        this.a = new xk();
        this.b = new xn();
        this.c = new HashMap();
        this.d = new HashMap();
        this.e = 4194304;
    }

    public xo(int i) {
        this.a = new xk();
        this.b = new xn();
        this.c = new HashMap();
        this.d = new HashMap();
        this.e = i;
    }

    public final synchronized void a() {
        b(0);
    }

    private final void b(int i, Class cls) {
        NavigableMap b2 = b(cls);
        Integer valueOf = Integer.valueOf(i);
        Integer num = (Integer) b2.get(valueOf);
        if (num == null) {
            String valueOf2 = String.valueOf(this);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 56);
            sb.append("Tried to decrement empty size, size: ");
            sb.append(i);
            sb.append(", this: ");
            sb.append(valueOf2);
            throw new NullPointerException(sb.toString());
        } else if (num.intValue() == 1) {
            b2.remove(valueOf);
        } else {
            b2.put(valueOf, Integer.valueOf(num.intValue() - 1));
        }
    }

    private final void b(int i) {
        while (this.f > i) {
            Object a2 = this.a.a();
            aic.a(a2);
            xd c2 = c(a2.getClass());
            this.f -= c2.a(a2) * c2.a();
            b(c2.a(a2), a2.getClass());
            c2.b();
        }
    }

    public final synchronized Object a(int i, Class cls) {
        xm xmVar;
        Integer num = (Integer) b(cls).ceilingKey(Integer.valueOf(i));
        if (num != null) {
            int i2 = this.f;
            if (i2 != 0) {
                if (this.e / i2 < 2) {
                    if (num.intValue() <= (i << 3)) {
                    }
                }
            }
            xmVar = this.b.a(num.intValue(), cls);
        }
        xmVar = this.b.a(i, cls);
        return a(xmVar, cls);
    }

    private final xd c(Class cls) {
        xd xdVar = (xd) this.d.get(cls);
        if (xdVar == null) {
            if (cls.equals(int[].class)) {
                xdVar = new xl();
            } else if (cls.equals(byte[].class)) {
                xdVar = new xi();
            } else {
                String valueOf = String.valueOf(cls.getSimpleName());
                throw new IllegalArgumentException(valueOf.length() == 0 ? new String("No array pool found for: ") : "No array pool found for: ".concat(valueOf));
            }
            this.d.put(cls, xdVar);
        }
        return xdVar;
    }

    public final synchronized Object a(Class cls) {
        return a(this.b.a(8, cls), cls);
    }

    private final Object a(xm xmVar, Class cls) {
        xd c2 = c(cls);
        Object a2 = this.a.a(xmVar);
        if (a2 != null) {
            this.f -= c2.a(a2) * c2.a();
            b(c2.a(a2), cls);
        }
        if (a2 != null) {
            return a2;
        }
        c2.b();
        return c2.a(xmVar.a);
    }

    private final NavigableMap b(Class cls) {
        NavigableMap navigableMap = (NavigableMap) this.c.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.c.put(cls, treeMap);
        return treeMap;
    }

    public final synchronized void a(Object obj) {
        Class<?> cls = obj.getClass();
        xd c2 = c(cls);
        int a2 = c2.a(obj);
        int a3 = c2.a() * a2;
        int i = 1;
        if (a3 <= (this.e >> 1)) {
            xm a4 = this.b.a(a2, cls);
            this.a.a(a4, obj);
            NavigableMap b2 = b(cls);
            Integer num = (Integer) b2.get(Integer.valueOf(a4.a));
            Integer valueOf = Integer.valueOf(a4.a);
            if (num != null) {
                i = 1 + num.intValue();
            }
            b2.put(valueOf, Integer.valueOf(i));
            this.f += a3;
            b(this.e);
        }
    }

    public final synchronized void a(int i) {
        if (i >= 40) {
            a();
        } else if (i >= 20 || i == 15) {
            b(this.e >> 1);
        }
    }
}
