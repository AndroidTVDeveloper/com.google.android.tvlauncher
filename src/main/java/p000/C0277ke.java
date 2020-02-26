package p000;

import android.support.p002v7.widget.RecyclerView;
import android.view.animation.Interpolator;

/* renamed from: ke */
/* compiled from: PG */
public final class C0277ke extends aic {

    /* renamed from: a */
    private final /* synthetic */ RecyclerView f9734a;

    public C0277ke(RecyclerView recyclerView) {
        this.f9734a = recyclerView;
    }

    /* renamed from: a */
    public final void mo310a() {
        this.f9734a.mo830a((String) null);
        RecyclerView recyclerView = this.f9734a;
        recyclerView.f1024D.f9764f = true;
        recyclerView.mo850c(true);
        if (!this.f9734a.f1062b.mo5090d()) {
            this.f9734a.requestLayout();
        }
    }

    /* renamed from: a */
    public final void mo313a(int i, int i2, Object obj) {
        this.f9734a.mo830a((String) null);
        C0187gw gwVar = this.f9734a.f1062b;
        if (i2 > 0) {
            gwVar.f9428a.add(gwVar.mo5083a(4, i, i2, obj));
            gwVar.f9430c |= 4;
            if (gwVar.f9428a.size() == 1) {
                m7771b();
            }
        }
    }

    /* renamed from: a */
    public final void mo311a(int i) {
        this.f9734a.mo830a((String) null);
        C0187gw gwVar = this.f9734a.f1062b;
        gwVar.f9428a.add(gwVar.mo5083a(1, i, 1, null));
        gwVar.f9430c |= 1;
        if (gwVar.f9428a.size() == 1) {
            m7771b();
        }
    }

    /* renamed from: a */
    public final void mo312a(int i, int i2) {
        this.f9734a.mo830a((String) null);
        C0187gw gwVar = this.f9734a.f1062b;
        if (i != i2) {
            gwVar.f9428a.add(gwVar.mo5083a(8, i, i2, null));
            gwVar.f9430c |= 8;
            if (gwVar.f9428a.size() == 1) {
                m7771b();
            }
        }
    }

    /* renamed from: b */
    public final void mo314b(int i) {
        this.f9734a.mo830a((String) null);
        C0187gw gwVar = this.f9734a.f1062b;
        gwVar.f9428a.add(gwVar.mo5083a(2, i, 1, null));
        gwVar.f9430c |= 2;
        if (gwVar.f9428a.size() == 1) {
            m7771b();
        }
    }

    /* renamed from: b */
    private final void m7771b() {
        Interpolator interpolator = RecyclerView.f1018K;
        RecyclerView recyclerView = this.f9734a;
        if (!recyclerView.f1074n || !recyclerView.f1073m) {
            recyclerView.f1078r = true;
            recyclerView.requestLayout();
            return;
        }
        C0107dx.m7201a(recyclerView, recyclerView.f1065e);
    }
}
