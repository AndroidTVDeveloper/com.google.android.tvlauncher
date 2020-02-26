package defpackage;

/* renamed from: bsm  reason: default package */
/* compiled from: PG */
public abstract class bsm {
    public Object a;
    public boolean b = false;
    private final /* synthetic */ bst c;

    public bsm(bst bst, Object obj) {
        this.c = bst;
        this.a = obj;
    }

    /* access modifiers changed from: protected */
    public abstract void b();

    /* access modifiers changed from: protected */
    public abstract void c();

    public final void e() {
        synchronized (this) {
            this.a = null;
        }
    }

    public final void d() {
        e();
        synchronized (this.c.i) {
            this.c.i.remove(this);
        }
    }
}
