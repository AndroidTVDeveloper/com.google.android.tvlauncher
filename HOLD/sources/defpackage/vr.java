package defpackage;

/* renamed from: vr  reason: default package */
/* compiled from: PG */
final class vr {
    private boolean a;
    private boolean b;
    private boolean c;

    private final boolean e() {
        return (this.c || this.b) && this.a;
    }

    /* access modifiers changed from: package-private */
    public final synchronized boolean a() {
        this.b = true;
        return e();
    }

    /* access modifiers changed from: package-private */
    public final synchronized boolean b() {
        this.c = true;
        return e();
    }

    /* access modifiers changed from: package-private */
    public final synchronized boolean d() {
        this.a = true;
        return e();
    }

    /* access modifiers changed from: package-private */
    public final synchronized void c() {
        this.b = false;
        this.a = false;
        this.c = false;
    }
}
