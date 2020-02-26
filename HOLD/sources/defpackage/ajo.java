package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: ajo  reason: default package */
/* compiled from: PG */
final class ajo extends Handler {
    private final /* synthetic */ ajy a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ajo(ajy ajy, Looper looper) {
        super(looper);
        this.a = ajy;
    }

    public final void handleMessage(Message message) {
        boolean z;
        int i;
        ajy ajy = this.a;
        int i2 = message.what;
        if (i2 == 0) {
            akp akp = (akp) message.obj;
            int i3 = message.arg1;
            if (message.arg2 != -1) {
                z = true;
            } else {
                z = false;
            }
            int i4 = message.arg2;
            int i5 = ajy.k - i3;
            ajy.k = i5;
            if (i5 == 0) {
                akp a2 = akp.c == -9223372036854775807L ? akp.a(akp.b, 0, akp.d, akp.l) : akp;
                if (!ajy.p.a.c() && a2.a.c()) {
                    ajy.r = 0;
                    ajy.q = 0;
                    ajy.s = 0;
                }
                if (!ajy.l) {
                    i = 2;
                } else {
                    i = 0;
                }
                boolean z2 = ajy.m;
                ajy.l = false;
                ajy.m = false;
                ajy.a(a2, z, i4, i, z2);
            }
        } else if (i2 == 1) {
            akq akq = (akq) message.obj;
            if (message.arg1 != 0) {
                ajy.n--;
            }
            if (ajy.n == 0 && !ajy.o.equals(akq)) {
                ajy.o = akq;
                ajy.a(new ajm());
            }
        } else {
            throw new IllegalStateException();
        }
    }
}
