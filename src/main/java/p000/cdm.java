package p000;

/* renamed from: cdm */
/* compiled from: PG */
final class cdm implements cdp {
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ String mo2681b(dkj dkj) {
        return ((dom) ((dja) dkj).f8672a).f9091n;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ String mo2679a(dkj dkj) {
        return ((dom) ((dja) dkj).f8672a).f9081d;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo2682c(dkj dkj) {
        dja dja = (dja) dkj;
        if (dja.f8673b) {
            dja.mo4505b();
            dja.f8673b = false;
        }
        dom dom = (dom) dja.f8672a;
        dom dom2 = dom.f9077q;
        dom.f9078a &= -5;
        dom.f9081d = dom.f9077q.f9081d;
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
            dom dom = (dom) dja.f8672a;
            dom dom2 = dom.f9077q;
            dom.f9078a |= 2;
            dom.f9080c = longValue;
            return;
        }
        dja dja2 = (dja) dkj;
        if (dja2.f8673b) {
            dja2.mo4505b();
            dja2.f8673b = false;
        }
        dom dom3 = (dom) dja2.f8672a;
        dom dom4 = dom.f9077q;
        dom3.f9078a &= -3;
        dom3.f9080c = 0;
    }
}
