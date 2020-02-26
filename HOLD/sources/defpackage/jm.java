package defpackage;

import android.support.v7.widget.RecyclerView;

/* renamed from: jm  reason: default package */
/* compiled from: PG */
public final class jm implements ll {
    public final /* synthetic */ RecyclerView a;

    public jm(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    public final void b(km kmVar, jt jtVar, jt jtVar2) {
        RecyclerView recyclerView = this.a;
        kmVar.a(false);
        if (recyclerView.x.b(kmVar, jtVar, jtVar2)) {
            recyclerView.m();
        }
    }

    public final void a(km kmVar, jt jtVar, jt jtVar2) {
        this.a.a.b(kmVar);
        RecyclerView recyclerView = this.a;
        recyclerView.a(kmVar);
        kmVar.a(false);
        if (recyclerView.x.a(kmVar, jtVar, jtVar2)) {
            recyclerView.m();
        }
    }

    public final void a(km kmVar) {
        RecyclerView recyclerView = this.a;
        recyclerView.h.b(kmVar.a, recyclerView.a);
    }
}
