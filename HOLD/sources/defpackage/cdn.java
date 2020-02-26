package defpackage;

/* renamed from: cdn  reason: default package */
/* compiled from: PG */
final class cdn implements cdp {
    public final /* bridge */ /* synthetic */ String b(dkj dkj) {
        return ((dnk) ((dja) dkj).a).d;
    }

    public final /* bridge */ /* synthetic */ String a(dkj dkj) {
        return ((dnk) ((dja) dkj).a).c;
    }

    public final /* bridge */ /* synthetic */ void c(dkj dkj) {
        dja dja = (dja) dkj;
        if (dja.b) {
            dja.b();
            dja.b = false;
        }
        dnk dnk = (dnk) dja.a;
        dnk dnk2 = dnk.e;
        dnk.a &= -5;
        dnk.c = dnk.e.c;
    }

    public final /* bridge */ /* synthetic */ void a(dkj dkj, Long l) {
        if (l != null) {
            long longValue = l.longValue();
            dja dja = (dja) dkj;
            if (dja.b) {
                dja.b();
                dja.b = false;
            }
            dnk dnk = (dnk) dja.a;
            dnk dnk2 = dnk.e;
            dnk.a |= 2;
            dnk.b = longValue;
            return;
        }
        dja dja2 = (dja) dkj;
        if (dja2.b) {
            dja2.b();
            dja2.b = false;
        }
        dnk dnk3 = (dnk) dja2.a;
        dnk dnk4 = dnk.e;
        dnk3.a &= -3;
        dnk3.b = 0;
    }
}
