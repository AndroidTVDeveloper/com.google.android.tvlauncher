package defpackage;

import android.content.DialogInterface;

/* renamed from: qc  reason: default package */
/* compiled from: PG */
final class qc implements DialogInterface.OnClickListener {
    private final /* synthetic */ qd a;

    public qc(qd qdVar) {
        this.a = qdVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        qd qdVar = this.a;
        qdVar.a = i;
        qdVar.d = -1;
        dialogInterface.dismiss();
    }
}
