package defpackage;

import java.util.List;

/* renamed from: xj  reason: default package */
/* compiled from: PG */
final class xj {
    public final Object a;
    public List b;
    public xj c;
    public xj d;

    public xj() {
        this(null);
    }

    public xj(Object obj) {
        this.d = this;
        this.c = this;
        this.a = obj;
    }

    public final Object a() {
        int b2 = b();
        if (b2 > 0) {
            return this.b.remove(b2 - 1);
        }
        return null;
    }

    public final int b() {
        List list = this.b;
        if (list == null) {
            return 0;
        }
        return list.size();
    }
}
