package p000;

import java.util.Comparator;

/* renamed from: atm */
/* compiled from: PG */
final /* synthetic */ class atm implements Comparator {

    /* renamed from: a */
    private final ats f2393a;

    public atm(ats ats) {
        this.f2393a = ats;
    }

    public final int compare(Object obj, Object obj2) {
        ats ats = this.f2393a;
        int i = att.f2399a;
        return ats.mo1333a(obj2) - ats.mo1333a(obj);
    }
}
