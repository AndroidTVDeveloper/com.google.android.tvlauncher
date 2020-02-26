package p000;

import android.database.DataSetObserver;

/* renamed from: iw */
/* compiled from: PG */
final class C0241iw extends DataSetObserver {

    /* renamed from: a */
    private final /* synthetic */ C0246ja f9648a;

    public C0241iw(C0246ja jaVar) {
        this.f9648a = jaVar;
    }

    public final void onChanged() {
        if (this.f9648a.mo4850e()) {
            this.f9648a.mo4847c();
        }
    }

    public final void onInvalidated() {
        this.f9648a.mo4849d();
    }
}
