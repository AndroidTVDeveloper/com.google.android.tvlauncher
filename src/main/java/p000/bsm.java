package p000;

/* renamed from: bsm */
/* compiled from: PG */
public abstract class bsm {

    /* renamed from: a */
    public Object f4730a;

    /* renamed from: b */
    public boolean f4731b = false;

    /* renamed from: c */
    private final /* synthetic */ bst f4732c;

    public bsm(bst bst, Object obj) {
        this.f4732c = bst;
        this.f4730a = obj;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo2375b();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo2376c();

    /* renamed from: e */
    public final void mo2380e() {
        synchronized (this) {
            this.f4730a = null;
        }
    }

    /* renamed from: d */
    public final void mo2379d() {
        mo2380e();
        synchronized (this.f4732c.f4748i) {
            this.f4732c.f4748i.remove(this);
        }
    }
}
