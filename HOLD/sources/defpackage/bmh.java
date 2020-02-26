package defpackage;

import android.view.Surface;

/* renamed from: bmh  reason: default package */
/* compiled from: PG */
final /* synthetic */ class bmh implements Runnable {
    private final bmj a;
    private final Surface b;

    public bmh(bmj bmj, Surface surface) {
        this.a = bmj;
        this.b = surface;
    }

    public final void run() {
        bmj bmj = this.a;
        bmj.b.a(this.b);
    }
}
