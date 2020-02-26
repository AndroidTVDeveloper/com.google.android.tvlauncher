package p000;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: ajo */
/* compiled from: PG */
final class ajo extends Handler {

    /* renamed from: a */
    private final /* synthetic */ ajy f458a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ajo(ajy ajy, Looper looper) {
        super(looper);
        this.f458a = ajy;
    }

    public final void handleMessage(Message message) {
        boolean z;
        int i;
        ajy ajy = this.f458a;
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
            int i5 = ajy.f486k - i3;
            ajy.f486k = i5;
            if (i5 == 0) {
                akp a = akp.f613c == -9223372036854775807L ? akp.mo459a(akp.f612b, 0, akp.f614d, akp.f622l) : akp;
                if (!ajy.f491p.f611a.mo552c() && a.f611a.mo552c()) {
                    ajy.f493r = 0;
                    ajy.f492q = 0;
                    ajy.f494s = 0;
                }
                if (!ajy.f487l) {
                    i = 2;
                } else {
                    i = 0;
                }
                boolean z2 = ajy.f488m;
                ajy.f487l = false;
                ajy.f488m = false;
                ajy.mo387a(a, z, i4, i, z2);
            }
        } else if (i2 == 1) {
            akq akq = (akq) message.obj;
            if (message.arg1 != 0) {
                ajy.f489n--;
            }
            if (ajy.f489n == 0 && !ajy.f490o.equals(akq)) {
                ajy.f490o = akq;
                ajy.mo386a(new ajm());
            }
        } else {
            throw new IllegalStateException();
        }
    }
}
