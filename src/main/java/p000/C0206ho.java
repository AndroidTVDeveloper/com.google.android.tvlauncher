package p000;

import android.support.p002v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ho */
/* compiled from: PG */
public final class C0206ho {

    /* renamed from: a */
    public final C0205hn f9491a;

    /* renamed from: b */
    public final C0204hm f9492b = new C0204hm();

    /* renamed from: c */
    public final List f9493c = new ArrayList();

    public C0206ho(C0205hn hnVar) {
        this.f9491a = hnVar;
    }

    /* renamed from: a */
    public final void mo5200a(View view, int i, boolean z) {
        int i2;
        if (i < 0) {
            i2 = this.f9491a.mo5191a();
        } else {
            i2 = mo5197a(i);
        }
        this.f9492b.mo5185a(i2, z);
        if (z) {
            mo5198a(view);
        }
        C0259jn jnVar = (C0259jn) this.f9491a;
        jnVar.f9696a.addView(view, i2);
        RecyclerView recyclerView = jnVar.f9696a;
        C0285km c = RecyclerView.m1301c(view);
        C0261jp jpVar = recyclerView.f1067g;
        if (jpVar != null && c != null) {
            jpVar.mo5311b(c);
        }
    }

    /* renamed from: a */
    public final void mo5199a(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        int i2;
        if (i < 0) {
            i2 = this.f9491a.mo5191a();
        } else {
            i2 = mo5197a(i);
        }
        this.f9492b.mo5185a(i2, z);
        if (z) {
            mo5198a(view);
        }
        C0205hn hnVar = this.f9491a;
        C0285km c = RecyclerView.m1301c(view);
        if (c != null) {
            if (c.mo5446n() || c.mo5434b()) {
                c.mo5441i();
            } else {
                throw new IllegalArgumentException("Called attach on a child which is not detached: " + c + ((C0259jn) hnVar).f9696a.mo822a());
            }
        }
        ((C0259jn) hnVar).f9696a.attachViewToParent(view, i2, layoutParams);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo5206d(int i) {
        C0285km c;
        int a = mo5197a(i);
        this.f9492b.mo5188d(a);
        C0259jn jnVar = (C0259jn) this.f9491a;
        View b = jnVar.mo5194b(a);
        if (!(b == null || (c = RecyclerView.m1301c(b)) == null)) {
            if (!c.mo5446n() || c.mo5434b()) {
                c.mo5433b(256);
            } else {
                throw new IllegalArgumentException("called detach on an already detached child " + c + jnVar.f9696a.mo822a());
            }
        }
        jnVar.f9696a.detachViewFromParent(a);
    }

    /* renamed from: b */
    public final View mo5203b(int i) {
        return this.f9491a.mo5194b(mo5197a(i));
    }

    /* renamed from: a */
    public final int mo5196a() {
        return this.f9491a.mo5191a() - this.f9493c.size();
    }

    /* renamed from: a */
    public final int mo5197a(int i) {
        if (i >= 0) {
            int a = this.f9491a.mo5191a();
            int i2 = i;
            while (i2 < a) {
                int e = i - (i2 - this.f9492b.mo5189e(i2));
                if (e != 0) {
                    i2 += e;
                } else {
                    while (this.f9492b.mo5187c(i2)) {
                        i2++;
                    }
                    return i2;
                }
            }
        }
        return -1;
    }

    /* renamed from: c */
    public final View mo5204c(int i) {
        return this.f9491a.mo5194b(i);
    }

    /* renamed from: b */
    public final int mo5201b() {
        return this.f9491a.mo5191a();
    }

    /* renamed from: a */
    public final void mo5198a(View view) {
        this.f9493c.add(view);
        C0205hn hnVar = this.f9491a;
        C0285km c = RecyclerView.m1301c(view);
        if (c != null) {
            RecyclerView recyclerView = ((C0259jn) hnVar).f9696a;
            int i = c.f9796n;
            if (i == -1) {
                c.f9795m = C0107dx.m7208e(c.f9783a);
            } else {
                c.f9795m = i;
            }
            recyclerView.mo835a(c, 4);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int mo5202b(View view) {
        int a = this.f9491a.mo5192a(view);
        if (a == -1 || this.f9492b.mo5187c(a)) {
            return -1;
        }
        return a - this.f9492b.mo5189e(a);
    }

    /* renamed from: c */
    public final boolean mo5205c(View view) {
        return this.f9493c.contains(view);
    }

    public final String toString() {
        return this.f9492b.toString() + ", hidden list:" + this.f9493c.size();
    }

    /* renamed from: d */
    public final void mo5207d(View view) {
        if (this.f9493c.remove(view)) {
            this.f9491a.mo5195b(view);
        }
    }
}
