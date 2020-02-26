package p000;

/* renamed from: bdk */
/* compiled from: PG */
public final class bdk extends bdr {

    /* renamed from: d */
    private final anm f3421d;

    public bdk(anm anm) {
        this.f3421d = anm;
    }

    /* renamed from: e */
    public final void mo1153e() {
        anm anm = this.f3421d;
        synchronized (anm.f1432a) {
            mo1139a();
            ank[] ankArr = anm.f1433b;
            int i = anm.f1434c;
            anm.f1434c = i + 1;
            ankArr[i] = this;
            anm.mo1157e();
        }
    }
}
