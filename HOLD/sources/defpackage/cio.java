package defpackage;

import java.util.Comparator;

/* renamed from: cio  reason: default package */
/* compiled from: PG */
final class cio implements Comparator {
    private final /* synthetic */ cip a;

    public /* synthetic */ cio(cip cip) {
        this.a = cip;
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        chn chn = (chn) obj;
        chn chn2 = (chn) obj2;
        if (chn == null || chn2 == null) {
            return 0;
        }
        Integer num = (Integer) this.a.a.get(chn);
        Integer num2 = (Integer) this.a.a.get(chn2);
        Integer valueOf = Integer.valueOf(num == null ? this.a.a.keySet().size() : num.intValue());
        Integer valueOf2 = Integer.valueOf(num2 == null ? this.a.a.keySet().size() : num2.intValue());
        if (valueOf.intValue() < valueOf2.intValue()) {
            return -1;
        }
        if (valueOf.intValue() > valueOf2.intValue()) {
            return 1;
        }
        return chn.compareTo(chn2);
    }
}
