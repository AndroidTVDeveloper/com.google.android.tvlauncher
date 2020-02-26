package p000;

import android.database.ContentObserver;

/* renamed from: cds */
/* compiled from: PG */
final class cds extends ContentObserver {

    /* renamed from: a */
    private final /* synthetic */ cdt f5333a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cds(cdt cdt) {
        super(null);
        this.f5333a = cdt;
    }

    public final void onChange(boolean z) {
        cdt cdt = this.f5333a;
        synchronized (cdt.f5338c) {
            cdt.f5339d = null;
            ceh.m4607a();
        }
        synchronized (cdt) {
            for (cdu a : cdt.f5340e) {
                a.mo2686a();
            }
        }
    }
}
