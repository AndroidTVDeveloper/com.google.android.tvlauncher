package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: cax  reason: default package */
/* compiled from: PG */
final class cax implements byt, ccl {
    public final List a = new ArrayList();
    public boolean b;
    private final bze c;

    public cax(bze bze) {
        this.c = bze;
        bze.a(this);
    }

    public final void b() {
        synchronized (this) {
            this.b = true;
        }
        this.c.b(this);
        List list = this.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((cbx) list.get(i)).g();
        }
    }

    public final void a() {
        this.c.b(this);
    }
}
