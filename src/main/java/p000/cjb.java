package p000;

import java.util.Comparator;

/* renamed from: cjb */
/* compiled from: PG */
final class cjb implements Comparator {

    /* renamed from: a */
    private final /* synthetic */ cjc f5697a;

    public /* synthetic */ cjb(cjc cjc) {
        this.f5697a = cjc;
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        int i;
        chn chn = (chn) obj;
        chn chn2 = (chn) obj2;
        if (chn == null || chn2 == null) {
            return 0;
        }
        cjc cjc = this.f5697a;
        if (cjc.f5702e) {
            Integer num = (Integer) cjc.f5700c.get(chn.f5563c);
            Integer num2 = (Integer) this.f5697a.f5700c.get(chn2.f5563c);
            i = m4886a(num, num2);
            if (i == 0) {
                if (!(num == null || num2 == null)) {
                    return chn.compareTo(chn2);
                }
            }
            return i;
        }
        Integer num3 = (Integer) this.f5697a.f5699b.get(chn.f5563c);
        Integer num4 = (Integer) this.f5697a.f5699b.get(chn2.f5563c);
        i = m4886a(num3, num4);
        if (i == 0) {
            if (num3 == null || num4 == null) {
                return chn.compareTo(chn2);
            }
            return chn.compareTo(chn2);
        }
        return i;
    }

    /* renamed from: a */
    private static final int m4886a(Integer num, Integer num2) {
        if (num == null && num2 == null) {
            return 0;
        }
        if (num == null) {
            return 1;
        }
        if (num2 == null || num2.intValue() > num.intValue()) {
            return -1;
        }
        return num2.intValue() < num.intValue() ? 1 : 0;
    }
}
