package defpackage;

import java.io.IOException;

/* renamed from: azo  reason: default package */
/* compiled from: PG */
final class azo implements biq {
    private final /* synthetic */ azq a;

    public /* synthetic */ azo(azq azq) {
        this.a = azq;
    }

    public final /* bridge */ /* synthetic */ void a(bit bit, long j, long j2, boolean z) {
        this.a.a((bja) bit, j, j2);
    }

    public final /* bridge */ /* synthetic */ void a(bit bit, long j, long j2) {
        bja bja = (bja) bit;
        azq azq = this.a;
        azq.d.b(bja.b);
        azq.a(((Long) bja.c).longValue() - j);
    }

    public final /* bridge */ /* synthetic */ bir a(bit bit, long j, long j2, IOException iOException, int i) {
        azq azq = this.a;
        azq.d.a(((bja) bit).b, iOException, true);
        azq.a(iOException);
        return bix.a;
    }
}
