package defpackage;

/* renamed from: cdm  reason: default package */
/* compiled from: PG */
final class cdm implements cdp {
    public final /* bridge */ /* synthetic */ String b(dkj dkj) {
        return ((dom) ((dja) dkj).a).n;
    }

    public final /* bridge */ /* synthetic */ String a(dkj dkj) {
        return ((dom) ((dja) dkj).a).d;
    }

    public final /* bridge */ /* synthetic */ void c(dkj dkj) {
        dja dja = (dja) dkj;
        if (dja.b) {
            dja.b();
            dja.b = false;
        }
        dom dom = (dom) dja.a;
        dom dom2 = dom.q;
        dom.a &= -5;
        dom.d = dom.q.d;
    }

    public final /* bridge */ /* synthetic */ void a(dkj dkj, Long l) {
        if (l != null) {
            long longValue = l.longValue();
            dja dja = (dja) dkj;
            if (dja.b) {
                dja.b();
                dja.b = false;
            }
            dom dom = (dom) dja.a;
            dom dom2 = dom.q;
            dom.a |= 2;
            dom.c = longValue;
            return;
        }
        dja dja2 = (dja) dkj;
        if (dja2.b) {
            dja2.b();
            dja2.b = false;
        }
        dom dom3 = (dom) dja2.a;
        dom dom4 = dom.q;
        dom3.a &= -3;
        dom3.c = 0;
    }
}
