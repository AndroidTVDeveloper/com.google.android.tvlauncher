package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ho  reason: default package */
/* compiled from: PG */
public final class ho {
    public final hn a;
    public final hm b = new hm();
    public final List c = new ArrayList();

    public ho(hn hnVar) {
        this.a = hnVar;
    }

    public final void a(View view, int i, boolean z) {
        int i2;
        if (i < 0) {
            i2 = this.a.a();
        } else {
            i2 = a(i);
        }
        this.b.a(i2, z);
        if (z) {
            a(view);
        }
        jn jnVar = (jn) this.a;
        jnVar.a.addView(view, i2);
        RecyclerView recyclerView = jnVar.a;
        km c2 = RecyclerView.c(view);
        jp jpVar = recyclerView.g;
        if (jpVar != null && c2 != null) {
            jpVar.b(c2);
        }
    }

    public final void a(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        int i2;
        if (i < 0) {
            i2 = this.a.a();
        } else {
            i2 = a(i);
        }
        this.b.a(i2, z);
        if (z) {
            a(view);
        }
        hn hnVar = this.a;
        km c2 = RecyclerView.c(view);
        if (c2 != null) {
            if (c2.n() || c2.b()) {
                c2.i();
            } else {
                throw new IllegalArgumentException("Called attach on a child which is not detached: " + c2 + ((jn) hnVar).a.a());
            }
        }
        ((jn) hnVar).a.attachViewToParent(view, i2, layoutParams);
    }

    /* access modifiers changed from: package-private */
    public final void d(int i) {
        km c2;
        int a2 = a(i);
        this.b.d(a2);
        jn jnVar = (jn) this.a;
        View b2 = jnVar.b(a2);
        if (!(b2 == null || (c2 = RecyclerView.c(b2)) == null)) {
            if (!c2.n() || c2.b()) {
                c2.b(256);
            } else {
                throw new IllegalArgumentException("called detach on an already detached child " + c2 + jnVar.a.a());
            }
        }
        jnVar.a.detachViewFromParent(a2);
    }

    public final View b(int i) {
        return this.a.b(a(i));
    }

    public final int a() {
        return this.a.a() - this.c.size();
    }

    public final int a(int i) {
        if (i >= 0) {
            int a2 = this.a.a();
            int i2 = i;
            while (i2 < a2) {
                int e = i - (i2 - this.b.e(i2));
                if (e != 0) {
                    i2 += e;
                } else {
                    while (this.b.c(i2)) {
                        i2++;
                    }
                    return i2;
                }
            }
        }
        return -1;
    }

    public final View c(int i) {
        return this.a.b(i);
    }

    public final int b() {
        return this.a.a();
    }

    public final void a(View view) {
        this.c.add(view);
        hn hnVar = this.a;
        km c2 = RecyclerView.c(view);
        if (c2 != null) {
            RecyclerView recyclerView = ((jn) hnVar).a;
            int i = c2.n;
            if (i == -1) {
                c2.m = dx.e(c2.a);
            } else {
                c2.m = i;
            }
            recyclerView.a(c2, 4);
        }
    }

    /* access modifiers changed from: package-private */
    public final int b(View view) {
        int a2 = this.a.a(view);
        if (a2 == -1 || this.b.c(a2)) {
            return -1;
        }
        return a2 - this.b.e(a2);
    }

    public final boolean c(View view) {
        return this.c.contains(view);
    }

    public final String toString() {
        return this.b.toString() + ", hidden list:" + this.c.size();
    }

    public final void d(View view) {
        if (this.c.remove(view)) {
            this.a.b(view);
        }
    }
}
