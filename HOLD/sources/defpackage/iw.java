package defpackage;

import android.database.DataSetObserver;

/* renamed from: iw  reason: default package */
/* compiled from: PG */
final class iw extends DataSetObserver {
    private final /* synthetic */ ja a;

    public iw(ja jaVar) {
        this.a = jaVar;
    }

    public final void onChanged() {
        if (this.a.e()) {
            this.a.c();
        }
    }

    public final void onInvalidated() {
        this.a.d();
    }
}
