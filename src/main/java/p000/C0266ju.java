package p000;

import android.support.p002v7.widget.RecyclerView;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ju */
/* compiled from: PG */
public abstract class C0266ju {

    /* renamed from: h */
    public C0264js f9704h = null;

    /* renamed from: i */
    public long f9705i = 250;

    /* renamed from: q */
    private final ArrayList f9706q = new ArrayList();

    /* renamed from: a */
    public abstract void mo4214a();

    /* renamed from: a */
    public boolean mo4216a(C0285km kmVar, List list) {
        throw null;
    }

    /* renamed from: a */
    public abstract boolean mo4189a(C0285km kmVar, C0265jt jtVar, C0265jt jtVar2);

    /* renamed from: a */
    public abstract boolean mo4190a(C0285km kmVar, C0285km kmVar2, C0265jt jtVar, C0265jt jtVar2);

    /* renamed from: b */
    public abstract boolean mo4191b();

    /* renamed from: b */
    public abstract boolean mo4192b(C0285km kmVar, C0265jt jtVar, C0265jt jtVar2);

    /* renamed from: c */
    public abstract void mo4194c(C0285km kmVar);

    /* renamed from: c */
    public abstract boolean mo4195c(C0285km kmVar, C0265jt jtVar, C0265jt jtVar2);

    /* renamed from: d */
    public abstract void mo4196d();

    /* renamed from: f */
    public boolean mo5325f(C0285km kmVar) {
        throw null;
    }

    /* renamed from: d */
    public static int m7667d(C0285km kmVar) {
        int i = kmVar.f9792j & 14;
        if (kmVar.mo5442j()) {
            return 4;
        }
        if ((i & 4) == 0) {
            int i2 = kmVar.f9786d;
            int d = kmVar.mo5436d();
            if (!(i2 == -1 || d == -1 || i2 == d)) {
                return i | 2048;
            }
        }
        return i;
    }

    /* renamed from: e */
    public final void mo5324e(C0285km kmVar) {
        C0264js jsVar = this.f9704h;
        if (jsVar != null) {
            boolean z = true;
            kmVar.mo5432a(true);
            if (kmVar.f9790h != null && kmVar.f9791i == null) {
                kmVar.f9790h = null;
            }
            kmVar.f9791i = null;
            if ((kmVar.f9792j & 16) == 0) {
                C0267jv jvVar = (C0267jv) jsVar;
                RecyclerView recyclerView = jvVar.f9707a;
                View view = kmVar.f9783a;
                recyclerView.mo859d();
                C0206ho hoVar = recyclerView.f1063c;
                int a = hoVar.f9491a.mo5192a(view);
                if (a == -1) {
                    hoVar.mo5207d(view);
                } else if (hoVar.f9492b.mo5187c(a)) {
                    hoVar.f9492b.mo5188d(a);
                    hoVar.mo5207d(view);
                    hoVar.f9491a.mo5193a(a);
                } else {
                    z = false;
                }
                if (z) {
                    C0285km c = RecyclerView.m1301c(view);
                    recyclerView.f1041a.mo5400b(c);
                    recyclerView.f1041a.mo5395a(c);
                }
                recyclerView.mo838a(!z);
                if (!z && kmVar.mo5446n()) {
                    jvVar.f9707a.removeDetachedView(kmVar.f9783a, false);
                }
            }
        }
    }

    /* renamed from: e */
    public final void mo5323e() {
        int size = this.f9706q.size();
        for (int i = 0; i < size; i++) {
            ((C0263jr) this.f9706q.get(i)).mo3747a();
        }
        this.f9706q.clear();
    }

    /* renamed from: a */
    public final void mo5322a(C0263jr jrVar) {
        boolean b = mo4191b();
        if (jrVar == null) {
            return;
        }
        if (b) {
            this.f9706q.add(jrVar);
        } else {
            jrVar.mo3747a();
        }
    }

    /* renamed from: f */
    public C0265jt mo3746f() {
        return new C0265jt();
    }

    /* renamed from: a */
    public C0265jt mo4187a(C0283kk kkVar, C0285km kmVar) {
        return mo3746f().mo3742a(kmVar);
    }

    /* renamed from: a */
    public C0265jt mo3744a(C0283kk kkVar, C0285km kmVar, int i, List list) {
        return mo3746f().mo3742a(kmVar);
    }

    /* renamed from: g */
    public final void mo5326g() {
        this.f9705i = 175;
    }
}
