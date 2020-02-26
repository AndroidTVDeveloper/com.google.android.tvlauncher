package defpackage;

import android.database.ContentObserver;

/* renamed from: cds  reason: default package */
/* compiled from: PG */
final class cds extends ContentObserver {
    private final /* synthetic */ cdt a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cds(cdt cdt) {
        super(null);
        this.a = cdt;
    }

    public final void onChange(boolean z) {
        cdt cdt = this.a;
        synchronized (cdt.c) {
            cdt.d = null;
            ceh.a();
        }
        synchronized (cdt) {
            for (cdu a2 : cdt.e) {
                a2.a();
            }
        }
    }
}
