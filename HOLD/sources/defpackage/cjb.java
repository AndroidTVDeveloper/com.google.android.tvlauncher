package defpackage;

import java.util.Comparator;

/* renamed from: cjb  reason: default package */
/* compiled from: PG */
final class cjb implements Comparator {
    private final /* synthetic */ cjc a;

    public /* synthetic */ cjb(cjc cjc) {
        this.a = cjc;
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        int i;
        chn chn = (chn) obj;
        chn chn2 = (chn) obj2;
        if (chn == null || chn2 == null) {
            return 0;
        }
        cjc cjc = this.a;
        if (cjc.e) {
            Integer num = (Integer) cjc.c.get(chn.c);
            Integer num2 = (Integer) this.a.c.get(chn2.c);
            i = a(num, num2);
            if (i == 0) {
                if (!(num == null || num2 == null)) {
                    return chn.compareTo(chn2);
                }
            }
            return i;
        }
        Integer num3 = (Integer) this.a.b.get(chn.c);
        Integer num4 = (Integer) this.a.b.get(chn2.c);
        i = a(num3, num4);
        if (i == 0) {
            if (num3 == null || num4 == null) {
                return chn.compareTo(chn2);
            }
            return chn.compareTo(chn2);
        }
        return i;
    }

    private static final int a(Integer num, Integer num2) {
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
