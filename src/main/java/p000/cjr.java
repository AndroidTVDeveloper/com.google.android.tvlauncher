package p000;

import android.util.LongSparseArray;
import java.util.Comparator;

/* renamed from: cjr */
/* compiled from: PG */
final class cjr implements Comparator {

    /* renamed from: a */
    public LongSparseArray f5734a;

    /* renamed from: b */
    public LongSparseArray f5735b;

    /* renamed from: c */
    public long f5736c = -1;

    /* renamed from: d */
    public long f5737d = -1;

    private cjr() {
    }

    public /* synthetic */ cjr(byte b) {
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        cxt cxt = (cxt) obj;
        cxt cxt2 = (cxt) obj2;
        if (cxt == cxt2) {
            return 0;
        }
        Integer num = (Integer) this.f5735b.get(cxt.f7874a);
        Integer num2 = (Integer) this.f5735b.get(cxt2.f7874a);
        if (num != null && num2 != null) {
            return m4921a(cxt.f7874a, cxt2.f7874a, num.intValue(), num2.intValue());
        }
        if (num2 == null) {
            if (num != null) {
                return -1;
            }
            Integer num3 = (Integer) this.f5734a.get(cxt.f7874a);
            Integer num4 = (Integer) this.f5734a.get(cxt2.f7874a);
            if (num3 != null && num4 != null) {
                return m4921a(cxt.f7874a, cxt2.f7874a, num3.intValue(), num4.intValue());
            }
            if (num4 == null) {
                if (num3 != null) {
                    return -1;
                }
                return (cxt.f7874a > cxt2.f7874a ? 1 : (cxt.f7874a == cxt2.f7874a ? 0 : -1));
            }
        }
        return 1;
    }

    /* renamed from: a */
    private final int m4921a(long j, long j2, int i, int i2) {
        if (i != i2) {
            return Integer.compare(i, i2);
        }
        long j3 = this.f5737d;
        if (j == j3) {
            return -1;
        }
        if (j2 == j3) {
            return 1;
        }
        long j4 = this.f5736c;
        if (j != j4) {
            return j2 != j4 ? 0 : 1;
        }
        return -1;
    }
}
