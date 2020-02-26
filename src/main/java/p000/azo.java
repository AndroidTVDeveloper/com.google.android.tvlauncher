package p000;

import java.io.IOException;

/* renamed from: azo */
/* compiled from: PG */
final class azo implements biq {

    /* renamed from: a */
    private final /* synthetic */ azq f2886a;

    public /* synthetic */ azo(azq azq) {
        this.f2886a = azq;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo1549a(bit bit, long j, long j2, boolean z) {
        this.f2886a.mo1652a((bja) bit, j, j2);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo1548a(bit bit, long j, long j2) {
        bja bja = (bja) bit;
        azq azq = this.f2886a;
        azq.f2894d.mo1527b(bja.f4105b);
        azq.mo1650a(((Long) bja.f4106c).longValue() - j);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bir mo1546a(bit bit, long j, long j2, IOException iOException, int i) {
        azq azq = this.f2886a;
        azq.f2894d.mo1519a(((bja) bit).f4105b, iOException, true);
        azq.mo1653a(iOException);
        return bix.f4092a;
    }
}
