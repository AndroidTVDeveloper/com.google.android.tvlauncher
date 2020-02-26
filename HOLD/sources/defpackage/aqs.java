package defpackage;

/* renamed from: aqs  reason: default package */
/* compiled from: PG */
final class aqs implements aos {
    private final /* synthetic */ aqt a;

    public /* synthetic */ aqs(aqt aqt) {
        this.a = aqt;
    }

    public final boolean d() {
        return true;
    }

    public final long b() {
        aqt aqt = this.a;
        return aqt.c.a(aqt.d);
    }

    public final aoq d(long j) {
        long b = this.a.c.b(j);
        aqt aqt = this.a;
        long j2 = aqt.a;
        long j3 = aqt.b;
        return new aoq(new aot(j, blm.a((((b * (j3 - j2)) / aqt.d) + j2) - 30000, j2, -1 + j3)));
    }
}
