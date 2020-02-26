package defpackage;

import android.os.Handler;

/* renamed from: bqz  reason: default package */
/* compiled from: PG */
final class bqz implements bpl {
    private final /* synthetic */ bri a;

    public bqz(bri bri) {
        this.a = bri;
    }

    public final void a(boolean z) {
        Handler handler = this.a.l;
        handler.sendMessage(handler.obtainMessage(1, Boolean.valueOf(z)));
    }
}
