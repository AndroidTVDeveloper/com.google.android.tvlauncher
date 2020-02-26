package defpackage;

/* renamed from: dct  reason: default package */
/* compiled from: PG */
final class dct implements Runnable {
    private final /* synthetic */ dcw a;

    public dct(dcw dcw) {
        this.a = dcw;
    }

    public final void run() {
        if (!this.a.c.isFocused()) {
            this.a.a(false);
        }
    }
}
