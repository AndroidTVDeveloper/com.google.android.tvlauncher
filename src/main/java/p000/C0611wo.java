package p000;

/* renamed from: wo */
/* compiled from: PG */
public final class C0611wo implements C0619ww {

    /* renamed from: a */
    public final boolean f10713a;

    /* renamed from: b */
    private final C0619ww f10714b;

    /* renamed from: c */
    private final C0610wn f10715c;

    /* renamed from: d */
    private final C0534ts f10716d;

    /* renamed from: e */
    private int f10717e;

    /* renamed from: f */
    private boolean f10718f;

    public C0611wo(C0619ww wwVar, boolean z, C0534ts tsVar, C0610wn wnVar) {
        this.f10714b = (C0619ww) aic.m542a(wwVar);
        this.f10713a = z;
        this.f10716d = tsVar;
        this.f10715c = (C0610wn) aic.m542a(wnVar);
    }

    /* renamed from: e */
    public final synchronized void mo6073e() {
        if (!this.f10718f) {
            this.f10717e++;
        } else {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
    }

    /* renamed from: b */
    public final Object mo33b() {
        return this.f10714b.mo33b();
    }

    /* renamed from: a */
    public final Class mo32a() {
        return this.f10714b.mo32a();
    }

    /* renamed from: c */
    public final int mo34c() {
        return this.f10714b.mo34c();
    }

    /* renamed from: d */
    public final synchronized void mo35d() {
        if (this.f10717e > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        } else if (!this.f10718f) {
            this.f10718f = true;
            this.f10714b.mo35d();
        } else {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo6074f() {
        int i;
        synchronized (this) {
            int i2 = this.f10717e;
            if (i2 > 0) {
                i = i2 - 1;
                this.f10717e = i;
            } else {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
        }
        if (i == 0) {
            this.f10715c.mo6053a(this.f10716d, this);
        }
    }

    public final synchronized String toString() {
        StringBuilder sb;
        boolean z = this.f10713a;
        String valueOf = String.valueOf(this.f10715c);
        String valueOf2 = String.valueOf(this.f10716d);
        int i = this.f10717e;
        boolean z2 = this.f10718f;
        String valueOf3 = String.valueOf(this.f10714b);
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
