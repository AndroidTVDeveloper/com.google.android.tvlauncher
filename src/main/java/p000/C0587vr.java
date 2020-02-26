package p000;

/* renamed from: vr */
/* compiled from: PG */
final class C0587vr {

    /* renamed from: a */
    private boolean f10612a;

    /* renamed from: b */
    private boolean f10613b;

    /* renamed from: c */
    private boolean f10614c;

    /* renamed from: e */
    private final boolean m8494e() {
        return (this.f10614c || this.f10613b) && this.f10612a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized boolean mo6039a() {
        this.f10613b = true;
        return m8494e();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized boolean mo6040b() {
        this.f10614c = true;
        return m8494e();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final synchronized boolean mo6042d() {
        this.f10612a = true;
        return m8494e();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final synchronized void mo6041c() {
        this.f10613b = false;
        this.f10612a = false;
        this.f10614c = false;
    }
}
