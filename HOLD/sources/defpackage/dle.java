package defpackage;

import java.util.Iterator;
import java.util.Map;

/* renamed from: dle  reason: default package */
/* compiled from: PG */
final class dle implements Iterator {
    private int a = -1;
    private boolean b;
    private Iterator c;
    private final /* synthetic */ dlg d;

    public /* synthetic */ dle(dlg dlg) {
        this.d = dlg;
    }

    private final Iterator a() {
        if (this.c == null) {
            this.c = this.d.b.entrySet().iterator();
        }
        return this.c;
    }

    public final boolean hasNext() {
        if (this.a + 1 < this.d.a.size()) {
            return true;
        }
        if (this.d.b.isEmpty() || !a().hasNext()) {
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object next() {
        this.b = true;
        int i = this.a + 1;
        this.a = i;
        if (i < this.d.a.size()) {
            return (Map.Entry) this.d.a.get(this.a);
        }
        return (Map.Entry) a().next();
    }

    public final void remove() {
        if (this.b) {
            this.b = false;
            this.d.d();
            if (this.a < this.d.a.size()) {
                dlg dlg = this.d;
                int i = this.a;
                this.a = i - 1;
                dlg.c(i);
                return;
            }
            a().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }
}
