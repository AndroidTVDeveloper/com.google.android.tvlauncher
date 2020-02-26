package defpackage;

/* renamed from: wo  reason: default package */
/* compiled from: PG */
public final class wo implements ww {
    public final boolean a;
    private final ww b;
    private final wn c;
    private final ts d;
    private int e;
    private boolean f;

    public wo(ww wwVar, boolean z, ts tsVar, wn wnVar) {
        this.b = (ww) aic.a(wwVar);
        this.a = z;
        this.d = tsVar;
        this.c = (wn) aic.a(wnVar);
    }

    public final synchronized void e() {
        if (!this.f) {
            this.e++;
        } else {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
    }

    public final Object b() {
        return this.b.b();
    }

    public final Class a() {
        return this.b.a();
    }

    public final int c() {
        return this.b.c();
    }

    public final synchronized void d() {
        if (this.e > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        } else if (!this.f) {
            this.f = true;
            this.b.d();
        } else {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
    }

    /* access modifiers changed from: package-private */
    public final void f() {
        int i;
        synchronized (this) {
            int i2 = this.e;
            if (i2 > 0) {
                i = i2 - 1;
                this.e = i;
            } else {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
        }
        if (i == 0) {
            this.c.a(this.d, this);
        }
    }

    public final synchronized String toString() {
        StringBuilder sb;
        boolean z = this.a;
        String valueOf = String.valueOf(this.c);
        String valueOf2 = String.valueOf(this.d);
        int i = this.e;
        boolean z2 = this.f;
        String valueOf3 = String.valueOf(this.b);
        int length = String.valueOf(valueOf).length();
        sb = new StringBuilder(length + 107 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("EngineResource{isMemoryCacheable=");
        sb.append(z);
        sb.append(", listener=");
        sb.append(valueOf);
        sb.append(", key=");
        sb.append(valueOf2);
        sb.append(", acquired=");
        sb.append(i);
        sb.append(", isRecycled=");
        sb.append(z2);
        sb.append(", resource=");
        sb.append(valueOf3);
        sb.append('}');
        return sb.toString();
    }
}
