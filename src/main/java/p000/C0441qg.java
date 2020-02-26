package p000;

import android.content.DialogInterface;

/* renamed from: qg */
/* compiled from: PG */
final class C0441qg implements DialogInterface.OnMultiChoiceClickListener {

    /* renamed from: a */
    private final /* synthetic */ C0442qh f10202a;

    public C0441qg(C0442qh qhVar) {
        this.f10202a = qhVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i, boolean z) {
        if (z) {
            C0442qh qhVar = this.f10202a;
            qhVar.f10204b = qhVar.f10203a.add(qhVar.f10205c[i].toString()) | qhVar.f10204b;
            return;
        }
        C0442qh qhVar2 = this.f10202a;
        qhVar2.f10204b = qhVar2.f10203a.remove(qhVar2.f10205c[i].toString()) | qhVar2.f10204b;
    }
}
