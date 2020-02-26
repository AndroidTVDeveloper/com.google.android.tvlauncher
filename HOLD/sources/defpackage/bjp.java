package defpackage;

/* renamed from: bjp  reason: default package */
/* compiled from: PG */
public final class bjp implements bhu {
    private final bjk a;
    private final bhu b;
    private final bhs c;

    public bjp(bjk bjk, bhu bhu) {
        bjn bjn = new bjn(bjk);
        this.a = bjk;
        this.b = bhu;
        this.c = bjn;
    }

    /* renamed from: b */
    public final bjo a() {
        return new bjo(this.a, ((bif) this.b).a(), new bij(), new bjm(((bjn) this.c).a));
    }
}
