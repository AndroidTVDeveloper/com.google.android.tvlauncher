package defpackage;

import android.content.DialogInterface;

/* renamed from: qg  reason: default package */
/* compiled from: PG */
final class qg implements DialogInterface.OnMultiChoiceClickListener {
    private final /* synthetic */ qh a;

    public qg(qh qhVar) {
        this.a = qhVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i, boolean z) {
        if (z) {
            qh qhVar = this.a;
            qhVar.b = qhVar.a.add(qhVar.c[i].toString()) | qhVar.b;
            return;
        }
        qh qhVar2 = this.a;
        qhVar2.b = qhVar2.a.remove(qhVar2.c[i].toString()) | qhVar2.b;
    }
}
