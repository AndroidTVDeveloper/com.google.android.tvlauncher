package p000;

import android.content.DialogInterface;

/* renamed from: qc */
/* compiled from: PG */
final class C0437qc implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private final /* synthetic */ C0438qd f10197a;

    public C0437qc(C0438qd qdVar) {
        this.f10197a = qdVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C0438qd qdVar = this.f10197a;
        qdVar.f10198a = i;
        qdVar.f10212d = -1;
        dialogInterface.dismiss();
    }
}
