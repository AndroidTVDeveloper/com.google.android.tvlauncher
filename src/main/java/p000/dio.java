package p000;

/* renamed from: dio */
/* compiled from: PG */
final class dio implements dmf {

    /* renamed from: a */
    public final din f8594a;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: djl.a(java.lang.Object, java.lang.String):java.lang.Object
     arg types: [din, java.lang.String]
     candidates:
      djl.a(java.lang.Object, java.lang.Object):java.lang.Object
      djl.a(java.lang.Object, java.lang.String):java.lang.Object */
    public dio(din din) {
        din din2 = (din) djl.m6725a((Object) din, "output");
        this.f8594a = din2;
        din2.f8590a = this;
    }

    /* renamed from: a */
    public final void mo4451a(int i, boolean z) {
        this.f8594a.mo4429a(i, z);
    }

    /* renamed from: a */
    public final void mo4448a(int i, dik dik) {
        this.f8594a.mo4431b(i, dik);
    }

    /* renamed from: a */
    public final void mo4444a(int i, double d) {
        this.f8594a.mo4425a(i, d);
    }

    /* renamed from: b */
    public final void mo4452b(int i, int i2) {
        this.f8594a.mo4440g(i, i2);
    }

    /* renamed from: d */
    public final void mo4457d(int i, int i2) {
        this.f8594a.mo4443i(i, i2);
    }

    /* renamed from: d */
    public final void mo4458d(int i, long j) {
        this.f8594a.mo4438f(i, j);
    }

    /* renamed from: a */
    public final void mo4445a(int i, float f) {
        this.f8594a.mo4426a(i, f);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: dkw.a(java.lang.Object, dmf):void
     arg types: [dkk, dio]
     candidates:
      dkw.a(java.lang.Object, java.lang.Object):boolean
      dkw.a(java.lang.Object, dmf):void */
    /* renamed from: b */
    public final void mo4454b(int i, Object obj, dkw dkw) {
        din din = this.f8594a;
        din.mo4437f(i, 3);
        dkw.mo4577a((Object) ((dkk) obj), (dmf) din.f8590a);
        din.mo4437f(i, 4);
    }

    /* renamed from: c */
    public final void mo4455c(int i, int i2) {
        this.f8594a.mo4440g(i, i2);
    }

    /* renamed from: a */
    public final void mo4447a(int i, long j) {
        this.f8594a.mo4434e(i, j);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: dkw.a(java.lang.Object, dmf):void
     arg types: [dkk, dio]
     candidates:
      dkw.a(java.lang.Object, java.lang.Object):boolean
      dkw.a(java.lang.Object, dmf):void */
    /* renamed from: a */
    public final void mo4450a(int i, Object obj, dkw dkw) {
        din din = this.f8594a;
        dkk dkk = (dkk) obj;
        din.mo4437f(i, 2);
        dhu dhu = (dhu) dkk;
        int k = dhu.mo4372k();
        if (k == -1) {
            k = dkw.mo4580b(dhu);
            dhu.mo4369a(k);
        }
        din.mo4439g(k);
        dkw.mo4577a((Object) dkk, (dmf) din.f8590a);
    }

    /* renamed from: a */
    public final void mo4449a(int i, Object obj) {
        if (obj instanceof dik) {
            din din = this.f8594a;
            din.mo4437f(1, 3);
            din.mo4442h(2, i);
            din.mo4431b(3, (dik) obj);
            din.mo4437f(1, 4);
            return;
        }
        din din2 = this.f8594a;
        dkk dkk = (dkk) obj;
        din2.mo4437f(1, 3);
        din2.mo4442h(2, i);
        din2.mo4437f(3, 2);
        din2.mo4439g(dkk.mo4517m());
        dkk.mo4512a(din2);
        din2.mo4437f(1, 4);
    }

    /* renamed from: a */
    public final void mo4446a(int i, int i2) {
        this.f8594a.mo4443i(i, i2);
    }

    /* renamed from: b */
    public final void mo4453b(int i, long j) {
        this.f8594a.mo4438f(i, j);
    }

    /* renamed from: f */
    public final void mo4461f(int i, int i2) {
        this.f8594a.mo4427a(i, i2);
    }

    /* renamed from: e */
    public final void mo4460e(int i, long j) {
        this.f8594a.mo4428a(i, j);
    }

    /* renamed from: e */
    public final void mo4459e(int i, int i2) {
        this.f8594a.mo4442h(i, i2);
    }

    /* renamed from: c */
    public final void mo4456c(int i, long j) {
        this.f8594a.mo4434e(i, j);
    }
}
