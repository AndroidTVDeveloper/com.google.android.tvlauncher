package defpackage;

/* renamed from: dio  reason: default package */
/* compiled from: PG */
final class dio implements dmf {
    public final din a;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: djl.a(java.lang.Object, java.lang.String):java.lang.Object
     arg types: [din, java.lang.String]
     candidates:
      djl.a(java.lang.Object, java.lang.Object):java.lang.Object
      djl.a(java.lang.Object, java.lang.String):java.lang.Object */
    public dio(din din) {
        din din2 = (din) djl.a((Object) din, "output");
        this.a = din2;
        din2.a = this;
    }

    public final void a(int i, boolean z) {
        this.a.a(i, z);
    }

    public final void a(int i, dik dik) {
        this.a.b(i, dik);
    }

    public final void a(int i, double d) {
        this.a.a(i, d);
    }

    public final void b(int i, int i2) {
        this.a.g(i, i2);
    }

    public final void d(int i, int i2) {
        this.a.i(i, i2);
    }

    public final void d(int i, long j) {
        this.a.f(i, j);
    }

    public final void a(int i, float f) {
        this.a.a(i, f);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: dkw.a(java.lang.Object, dmf):void
     arg types: [dkk, dio]
     candidates:
      dkw.a(java.lang.Object, java.lang.Object):boolean
      dkw.a(java.lang.Object, dmf):void */
    public final void b(int i, Object obj, dkw dkw) {
        din din = this.a;
        din.f(i, 3);
        dkw.a((Object) ((dkk) obj), (dmf) din.a);
        din.f(i, 4);
    }

    public final void c(int i, int i2) {
        this.a.g(i, i2);
    }

    public final void a(int i, long j) {
        this.a.e(i, j);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: dkw.a(java.lang.Object, dmf):void
     arg types: [dkk, dio]
     candidates:
      dkw.a(java.lang.Object, java.lang.Object):boolean
      dkw.a(java.lang.Object, dmf):void */
    public final void a(int i, Object obj, dkw dkw) {
        din din = this.a;
        dkk dkk = (dkk) obj;
        din.f(i, 2);
        dhu dhu = (dhu) dkk;
        int k = dhu.k();
        if (k == -1) {
            k = dkw.b(dhu);
            dhu.a(k);
        }
        din.g(k);
        dkw.a((Object) dkk, (dmf) din.a);
    }

    public final void a(int i, Object obj) {
        if (obj instanceof dik) {
            din din = this.a;
            din.f(1, 3);
            din.h(2, i);
            din.b(3, (dik) obj);
            din.f(1, 4);
            return;
        }
        din din2 = this.a;
        dkk dkk = (dkk) obj;
        din2.f(1, 3);
        din2.h(2, i);
        din2.f(3, 2);
        din2.g(dkk.m());
        dkk.a(din2);
        din2.f(1, 4);
    }

    public final void a(int i, int i2) {
        this.a.i(i, i2);
    }

    public final void b(int i, long j) {
        this.a.f(i, j);
    }

    public final void f(int i, int i2) {
        this.a.a(i, i2);
    }

    public final void e(int i, long j) {
        this.a.a(i, j);
    }

    public final void e(int i, int i2) {
        this.a.h(i, i2);
    }

    public final void c(int i, long j) {
        this.a.e(i, j);
    }
}
