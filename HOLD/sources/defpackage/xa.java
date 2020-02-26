package defpackage;

import android.os.Handler;
import android.os.Looper;

/* renamed from: xa  reason: default package */
/* compiled from: PG */
public final class xa {
    private boolean a;
    private final Handler b = new Handler(Looper.getMainLooper(), new wz());

    public final synchronized void a(ww wwVar) {
        if (this.a) {
            this.b.obtainMessage(1, wwVar).sendToTarget();
            return;
        }
        this.a = true;
        wwVar.d();
        this.a = false;
    }
}
