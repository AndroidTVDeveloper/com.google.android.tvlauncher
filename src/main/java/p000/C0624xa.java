package p000;

import android.os.Handler;
import android.os.Looper;

/* renamed from: xa */
/* compiled from: PG */
public final class C0624xa {

    /* renamed from: a */
    private boolean f10756a;

    /* renamed from: b */
    private final Handler f10757b = new Handler(Looper.getMainLooper(), new C0622wz());

    /* renamed from: a */
    public final synchronized void mo6092a(C0619ww wwVar) {
        if (this.f10756a) {
            this.f10757b.obtainMessage(1, wwVar).sendToTarget();
            return;
        }
        this.f10756a = true;
        wwVar.mo35d();
        this.f10756a = false;
    }
}
