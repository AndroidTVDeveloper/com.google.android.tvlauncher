package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.animation.Interpolator;

/* renamed from: ke  reason: default package */
/* compiled from: PG */
public final class ke extends aic {
    private final /* synthetic */ RecyclerView a;

    public ke(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    public final void a() {
        this.a.a((String) null);
        RecyclerView recyclerView = this.a;
        recyclerView.D.f = true;
        recyclerView.c(true);
        if (!this.a.b.d()) {
            this.a.requestLayout();
        }
    }

    public final void a(int i, int i2, Object obj) {
        this.a.a((String) null);
        gw gwVar = this.a.b;
        if (i2 > 0) {
            gwVar.a.add(gwVar.a(4, i, i2, obj));
            gwVar.c |= 4;
            if (gwVar.a.size() == 1) {
                b();
            }
        }
    }

    public final void a(int i) {
        this.a.a((String) null);
        gw gwVar = this.a.b;
        gwVar.a.add(gwVar.a(1, i, 1, null));
        gwVar.c |= 1;
        if (gwVar.a.size() == 1) {
            b();
        }
    }

    public final void a(int i, int i2) {
        this.a.a((String) null);
        gw gwVar = this.a.b;
        if (i != i2) {
            gwVar.a.add(gwVar.a(8, i, i2, null));
            gwVar.c |= 8;
            if (gwVar.a.size() == 1) {
                b();
            }
        }
    }

    public final void b(int i) {
        this.a.a((String) null);
        gw gwVar = this.a.b;
        gwVar.a.add(gwVar.a(2, i, 1, null));
        gwVar.c |= 2;
        if (gwVar.a.size() == 1) {
            b();
        }
    }

    private final void b() {
        Interpolator interpolator = RecyclerView.K;
        RecyclerView recyclerView = this.a;
        if (!recyclerView.n || !recyclerView.m) {
            recyclerView.r = true;
            recyclerView.requestLayout();
            return;
        }
        dx.a(recyclerView, recyclerView.e);
    }
}
