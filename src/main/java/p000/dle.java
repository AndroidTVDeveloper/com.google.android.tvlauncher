package p000;

import java.util.Iterator;
import java.util.Map;

/* renamed from: dle */
/* compiled from: PG */
final class dle implements Iterator {

    /* renamed from: a */
    private int f8754a = -1;

    /* renamed from: b */
    private boolean f8755b;

    /* renamed from: c */
    private Iterator f8756c;

    /* renamed from: d */
    private final /* synthetic */ dlg f8757d;

    public /* synthetic */ dle(dlg dlg) {
        this.f8757d = dlg;
    }

    /* renamed from: a */
    private final Iterator m6947a() {
        if (this.f8756c == null) {
            this.f8756c = this.f8757d.f8760b.entrySet().iterator();
        }
        return this.f8756c;
    }

    public final boolean hasNext() {
        if (this.f8754a + 1 < this.f8757d.f8759a.size()) {
            return true;
        }
        if (this.f8757d.f8760b.isEmpty() || !m6947a().hasNext()) {
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object next() {
        this.f8755b = true;
        int i = this.f8754a + 1;
        this.f8754a = i;
        if (i < this.f8757d.f8759a.size()) {
            return (Map.Entry) this.f8757d.f8759a.get(this.f8754a);
        }
        return (Map.Entry) m6947a().next();
    }

    public final void remove() {
        if (this.f8755b) {
            this.f8755b = false;
            this.f8757d.mo4618d();
            if (this.f8754a < this.f8757d.f8759a.size()) {
                dlg dlg = this.f8757d;
                int i = this.f8754a;
                this.f8754a = i - 1;
                dlg.mo4615c(i);
                return;
            }
            m6947a().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }
}
