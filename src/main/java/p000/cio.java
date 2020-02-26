package p000;

import java.util.Comparator;

/* renamed from: cio */
/* compiled from: PG */
final class cio implements Comparator {

    /* renamed from: a */
    private final /* synthetic */ cip f5651a;

    public /* synthetic */ cio(cip cip) {
        this.f5651a = cip;
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        chn chn = (chn) obj;
        chn chn2 = (chn) obj2;
        if (chn == null || chn2 == null) {
            return 0;
        }
        Integer num = (Integer) this.f5651a.f5652a.get(chn);
        Integer num2 = (Integer) this.f5651a.f5652a.get(chn2);
        Integer valueOf = Integer.valueOf(num == null ? this.f5651a.f5652a.keySet().size() : num.intValue());
        Integer valueOf2 = Integer.valueOf(num2 == null ? this.f5651a.f5652a.keySet().size() : num2.intValue());
        if (valueOf.intValue() < valueOf2.intValue()) {
            return -1;
        }
        if (valueOf.intValue() > valueOf2.intValue()) {
            return 1;
        }
        return chn.compareTo(chn2);
    }
}
