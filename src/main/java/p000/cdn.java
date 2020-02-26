package p000;

/* renamed from: cdn */
/* compiled from: PG */
final class cdn implements cdp {
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ String mo2681b(dkj dkj) {
        return ((dnk) ((dja) dkj).f8672a).f8951d;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ String mo2679a(dkj dkj) {
        return ((dnk) ((dja) dkj).f8672a).f8950c;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo2682c(dkj dkj) {
        dja dja = (dja) dkj;
        if (dja.f8673b) {
            dja.mo4505b();
            dja.f8673b = false;
        }
        dnk dnk = (dnk) dja.f8672a;
        dnk dnk2 = dnk.f8947e;
        dnk.f8948a &= -5;
        dnk.f8950c = dnk.f8947e.f8950c;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo2680a(dkj dkj, Long l) {
        if (l != null) {
            long longValue = l.longValue();
            dja dja = (dja) dkj;
            if (dja.f8673b) {
                dja.mo4505b();
                dja.f8673b = false;
            }
            dnk dnk = (dnk) dja.f8672a;
            dnk dnk2 = dnk.f8947e;
            dnk.f8948a |= 2;
            dnk.f8949b = longValue;
            return;
        }
        dja dja2 = (dja) dkj;
        if (dja2.f8673b) {
            dja2.mo4505b();
            dja2.f8673b = false;
        }
        dnk dnk3 = (dnk) dja2.f8672a;
        dnk dnk4 = dnk.f8947e;
        dnk3.f8948a &= -3;
        dnk3.f8949b = 0;
    }
}
