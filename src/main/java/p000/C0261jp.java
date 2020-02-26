package p000;

import android.support.p002v7.widget.RecyclerView;
import android.view.ViewGroup;
import java.util.List;

/* renamed from: jp */
/* compiled from: PG */
public abstract class C0261jp {

    /* renamed from: a */
    public boolean f9698a = false;

    /* renamed from: b */
    private final C0262jq f9699b = new C0262jq();

    /* renamed from: a */
    public abstract int mo2794a();

    /* renamed from: a */
    public int mo2850a(int i) {
        return 0;
    }

    /* renamed from: a */
    public abstract C0285km mo2795a(ViewGroup viewGroup, int i);

    /* renamed from: a */
    public void mo3510a(RecyclerView recyclerView) {
    }

    /* renamed from: a */
    public void mo2853a(C0285km kmVar) {
    }

    /* renamed from: a */
    public abstract void mo2797a(C0285km kmVar, int i);

    /* renamed from: b */
    public long mo2835b(int i) {
        return -1;
    }

    /* renamed from: b */
    public void mo5311b(C0285km kmVar) {
    }

    /* renamed from: c */
    public void mo3511c() {
    }

    /* renamed from: c */
    public void mo3596c(C0285km kmVar) {
    }

    /* renamed from: O */
    public final void mo5303O() {
        this.f9699b.mo5319b();
    }

    /* renamed from: c */
    public final void mo5312c(int i) {
        this.f9699b.mo5316a(i, 1);
    }

    /* renamed from: a */
    public final void mo5306a(int i, Object obj) {
        this.f9699b.mo5317a(i, 1, obj);
    }

    /* renamed from: d */
    public final void mo5313d(int i) {
        this.f9699b.mo5315a(i);
    }

    /* renamed from: b */
    public final void mo5309b(int i, int i2) {
        this.f9699b.mo5321b(i, i2);
    }

    /* renamed from: a */
    public final void mo5304a(int i, int i2) {
        this.f9699b.mo5316a(i, i2);
    }

    /* renamed from: a */
    public final void mo5305a(int i, int i2, Object obj) {
        this.f9699b.mo5317a(i, i2, obj);
    }

    /* renamed from: e */
    public final void mo5314e(int i) {
        this.f9699b.mo5320b(i);
    }

    /* renamed from: a */
    public void mo2854a(C0285km kmVar, int i, List list) {
        mo2797a(kmVar, i);
    }

    /* renamed from: a */
    public final void mo5307a(aic aic) {
        this.f9699b.registerObserver(aic);
    }

    /* renamed from: a */
    public final void mo5308a(boolean z) {
        if (!this.f9699b.mo5318a()) {
            this.f9698a = z;
            return;
        }
        throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
    }

    /* renamed from: b */
    public final void mo5310b(aic aic) {
        this.f9699b.unregisterObserver(aic);
    }
}
