package p000;

import java.util.List;

/* renamed from: xj */
/* compiled from: PG */
final class C0633xj {

    /* renamed from: a */
    public final Object f10768a;

    /* renamed from: b */
    public List f10769b;

    /* renamed from: c */
    public C0633xj f10770c;

    /* renamed from: d */
    public C0633xj f10771d;

    public C0633xj() {
        this(null);
    }

    public C0633xj(Object obj) {
        this.f10771d = this;
        this.f10770c = this;
        this.f10768a = obj;
    }

    /* renamed from: a */
    public final Object mo6110a() {
        int b = mo6111b();
        if (b > 0) {
            return this.f10769b.remove(b - 1);
        }
        return null;
    }

    /* renamed from: b */
    public final int mo6111b() {
        List list = this.f10769b;
        if (list == null) {
            return 0;
        }
        return list.size();
    }
}
