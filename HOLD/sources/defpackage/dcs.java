package defpackage;

/* renamed from: dcs  reason: default package */
/* compiled from: PG */
final class dcs implements Runnable {
    private final /* synthetic */ dcw a;

    public dcs(dcw dcw) {
        this.a = dcw;
    }

    public final void run() {
        if (this.a.c.isFocused()) {
            this.a.a(true);
        }
    }
}
