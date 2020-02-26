package defpackage;

/* renamed from: bdk  reason: default package */
/* compiled from: PG */
public final class bdk extends bdr {
    private final anm d;

    public bdk(anm anm) {
        this.d = anm;
    }

    public final void e() {
        anm anm = this.d;
        synchronized (anm.a) {
            a();
            ank[] ankArr = anm.b;
            int i = anm.c;
            anm.c = i + 1;
            ankArr[i] = this;
            anm.e();
        }
    }
}
