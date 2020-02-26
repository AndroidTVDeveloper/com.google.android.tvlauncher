package defpackage;

/* renamed from: cdo  reason: default package */
/* compiled from: PG */
final class cdo implements cdp {
    public final /* bridge */ /* synthetic */ String b(dkj dkj) {
        return ((dny) ((dja) dkj).a).b;
    }

    public final /* bridge */ /* synthetic */ String a(dkj dkj) {
        return ((dny) ((dja) dkj).a).d;
    }

    public final /* bridge */ /* synthetic */ void c(dkj dkj) {
        dja dja = (dja) dkj;
        if (dja.b) {
            dja.b();
            dja.b = false;
        }
        dny dny = (dny) dja.a;
        dny dny2 = dny.k;
        dny.a &= -5;
        dny.d = dny.k.d;
    }

    public final /* bridge */ /* synthetic */ void a(dkj dkj, Long l) {
        if (l != null) {
            long longValue = l.longValue();
            dja dja = (dja) dkj;
            if (dja.b) {
                dja.b();
                dja.b = false;
            }
            dny dny = (dny) dja.a;
            dny dny2 = dny.k;
            dny.a |= 2;
            dny.c = longValue;
            return;
        }
        dja dja2 = (dja) dkj;
        if (dja2.b) {
            dja2.b();
            dja2.b = false;
        }
        dny dny3 = (dny) dja2.a;
        dny dny4 = dny.k;
        dny3.a &= -3;
        dny3.c = 0;
    }
}
