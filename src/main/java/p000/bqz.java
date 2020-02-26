package p000;

import android.os.Handler;

/* renamed from: bqz */
/* compiled from: PG */
final class bqz implements bpl {

    /* renamed from: a */
    private final /* synthetic */ bri f4659a;

    public bqz(bri bri) {
        this.f4659a = bri;
    }

    /* renamed from: a */
    public final void mo2269a(boolean z) {
        Handler handler = this.f4659a.f4697l;
        handler.sendMessage(handler.obtainMessage(1, Boolean.valueOf(z)));
    }
}
