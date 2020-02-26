package p000;

/* renamed from: bzh */
/* compiled from: PG */
final class bzh implements cat {

    /* renamed from: a */
    public final bzs f5047a;

    public bzh(bzs bzs) {
        this.f5047a = bzs;
    }

    /* renamed from: a */
    public final void mo2576a() {
        this.f5047a.f5078i.mo2667a();
    }

    /* renamed from: c */
    public final void mo2578c() {
        if (this.f5047a.mo2589a()) {
            bzn b = this.f5047a.mo2590b();
            if (b.f5054d.compareAndSet(false, true)) {
                Thread.setDefaultUncaughtExceptionHandler(b.mo2582a(Thread.getDefaultUncaughtExceptionHandler()));
            }
        }
    }

    /* renamed from: b */
    public final void mo2577b() {
        bzs bzs = this.f5047a;
        if (bzs.f5076g.mo2615c().mo4219a() && ((cbv) bzs.f5076g.mo2615c().mo4220b()).f5228a) {
            bzs bzs2 = this.f5047a;
            if (bzs2.f5070a == null) {
                synchronized (cac.class) {
                    if (bzs2.f5070a == null) {
                        bzs2.f5070a = (cac) bzs2.mo2588a(new cac(bzs2.f5073d, bzs2.f5072c, bzs2.f5074e, bzs2.f5075f, ((cbv) bzs2.f5076g.mo2615c().mo4220b()).f5229b));
                    }
                }
            }
            bzs2.f5070a.mo2597e();
        }
    }
}
