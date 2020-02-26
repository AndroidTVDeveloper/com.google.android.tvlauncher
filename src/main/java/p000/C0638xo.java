package p000;

import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* renamed from: xo */
/* compiled from: PG */
public final class C0638xo implements C0628xe {

    /* renamed from: a */
    private final C0634xk f10777a;

    /* renamed from: b */
    private final C0637xn f10778b;

    /* renamed from: c */
    private final Map f10779c;

    /* renamed from: d */
    private final Map f10780d;

    /* renamed from: e */
    private final int f10781e;

    /* renamed from: f */
    private int f10782f;

    public C0638xo() {
        this.f10777a = new C0634xk();
        this.f10778b = new C0637xn();
        this.f10779c = new HashMap();
        this.f10780d = new HashMap();
        this.f10781e = 4194304;
    }

    public C0638xo(int i) {
        this.f10777a = new C0634xk();
        this.f10778b = new C0637xn();
        this.f10779c = new HashMap();
        this.f10780d = new HashMap();
        this.f10781e = i;
    }

    /* renamed from: a */
    public final synchronized void mo6100a() {
        m8642b(0);
    }

    /* renamed from: b */
    private final void m8643b(int i, Class cls) {
        NavigableMap b = m8641b(cls);
        Integer valueOf = Integer.valueOf(i);
        Integer num = (Integer) b.get(valueOf);
        if (num == null) {
            String valueOf2 = String.valueOf(this);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 56);
            sb.append("Tried to decrement empty size, size: ");
            sb.append(i);
            sb.append(", this: ");
            sb.append(valueOf2);
            throw new NullPointerException(sb.toString());
        } else if (num.intValue() == 1) {
            b.remove(valueOf);
        } else {
            b.put(valueOf, Integer.valueOf(num.intValue() - 1));
        }
    }

    /* renamed from: b */
    private final void m8642b(int i) {
        while (this.f10782f > i) {
            Object a = this.f10777a.mo6112a();
            aic.m542a(a);
            C0627xd c = m8644c(a.getClass());
            this.f10782f -= c.mo6095a(a) * c.mo6094a();
            m8643b(c.mo6095a(a), a.getClass());
            c.mo6097b();
        }
    }

    /* renamed from: a */
    public final synchronized Object mo6098a(int i, Class cls) {
        C0636xm xmVar;
        Integer num = (Integer) m8641b(cls).ceilingKey(Integer.valueOf(i));
        if (num != null) {
            int i2 = this.f10782f;
            if (i2 != 0) {
                if (this.f10781e / i2 < 2) {
                    if (num.intValue() <= (i << 3)) {
                    }
                }
            }
            xmVar = this.f10778b.mo6120a(num.intValue(), cls);
        }
        xmVar = this.f10778b.mo6120a(i, cls);
        return m8640a(xmVar, cls);
    }

    /* renamed from: c */
    private final C0627xd m8644c(Class cls) {
        C0627xd xdVar = (C0627xd) this.f10780d.get(cls);
        if (xdVar == null) {
            if (cls.equals(int[].class)) {
                xdVar = new C0635xl();
            } else if (cls.equals(byte[].class)) {
                xdVar = new C0632xi();
            } else {
                String valueOf = String.valueOf(cls.getSimpleName());
                throw new IllegalArgumentException(valueOf.length() == 0 ? new String("No array pool found for: ") : "No array pool found for: ".concat(valueOf));
            }
            this.f10780d.put(cls, xdVar);
        }
        return xdVar;
    }

    /* renamed from: a */
    public final synchronized Object mo6099a(Class cls) {
        return m8640a(this.f10778b.mo6120a(8, cls), cls);
    }

    /* renamed from: a */
    private final Object m8640a(C0636xm xmVar, Class cls) {
        C0627xd c = m8644c(cls);
        Object a = this.f10777a.mo6113a(xmVar);
        if (a != null) {
            this.f10782f -= c.mo6095a(a) * c.mo6094a();
            m8643b(c.mo6095a(a), cls);
        }
        if (a != null) {
            return a;
        }
        c.mo6097b();
        return c.mo6096a(xmVar.f10774a);
    }

    /* renamed from: b */
    private final NavigableMap m8641b(Class cls) {
        NavigableMap navigableMap = (NavigableMap) this.f10779c.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f10779c.put(cls, treeMap);
        return treeMap;
    }

    /* renamed from: a */
    public final synchronized void mo6102a(Object obj) {
        Class<?> cls = obj.getClass();
        C0627xd c = m8644c(cls);
        int a = c.mo6095a(obj);
        int a2 = c.mo6094a() * a;
        int i = 1;
        if (a2 <= (this.f10781e >> 1)) {
            C0636xm a3 = this.f10778b.mo6120a(a, cls);
            this.f10777a.mo6114a(a3, obj);
            NavigableMap b = m8641b(cls);
            Integer num = (Integer) b.get(Integer.valueOf(a3.f10774a));
            Integer valueOf = Integer.valueOf(a3.f10774a);
            if (num != null) {
                i = 1 + num.intValue();
            }
            b.put(valueOf, Integer.valueOf(i));
            this.f10782f += a2;
            m8642b(this.f10781e);
        }
    }

    /* renamed from: a */
    public final synchronized void mo6101a(int i) {
        if (i >= 40) {
            mo6100a();
        } else if (i >= 20 || i == 15) {
            m8642b(this.f10781e >> 1);
        }
    }
}
