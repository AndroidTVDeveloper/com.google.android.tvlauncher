package p000;

/* renamed from: cdo */
/* compiled from: PG */
final class cdo implements cdp {
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ String mo2681b(dkj dkj) {
        return ((dny) ((dja) dkj).f8672a).f9008b;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ String mo2679a(dkj dkj) {
        return ((dny) ((dja) dkj).f8672a).f9010d;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo2682c(dkj dkj) {
        dja dja = (dja) dkj;
        if (dja.f8673b) {
            dja.mo4505b();
            dja.f8673b = false;
        }
        dny dny = (dny) dja.f8672a;
        dny dny2 = dny.f9006k;
        dny.f9007a &= -5;
        dny.f9010d = dny.f9006k.f9010d;
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
            dny dny = (dny) dja.f8672a;
            dny dny2 = dny.f9006k;
            dny.f9007a |= 2;
            dny.f9009c = longValue;
            return;
        }
        dja dja2 = (dja) dkj;
        if (dja2.f8673b) {
            dja2.mo4505b();
            dja2.f8673b = false;
        }
        dny dny3 = (dny) dja2.f8672a;
        dny dny4 = dny.f9006k;
        dny3.f9007a &= -3;
        dny3.f9009c = 0;
    }
}
