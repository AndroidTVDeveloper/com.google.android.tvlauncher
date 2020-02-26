package defpackage;

import android.util.LongSparseArray;
import java.util.Comparator;

/* renamed from: cjr  reason: default package */
/* compiled from: PG */
final class cjr implements Comparator {
    public LongSparseArray a;
    public LongSparseArray b;
    public long c = -1;
    public long d = -1;

    private cjr() {
    }

    public /* synthetic */ cjr(byte b2) {
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        cxt cxt = (cxt) obj;
        cxt cxt2 = (cxt) obj2;
        if (cxt == cxt2) {
            return 0;
        }
        Integer num = (Integer) this.b.get(cxt.a);
        Integer num2 = (Integer) this.b.get(cxt2.a);
        if (num != null && num2 != null) {
            return a(cxt.a, cxt2.a, num.intValue(), num2.intValue());
        }
        if (num2 == null) {
            if (num != null) {
                return -1;
            }
            Integer num3 = (Integer) this.a.get(cxt.a);
            Integer num4 = (Integer) this.a.get(cxt2.a);
            if (num3 != null && num4 != null) {
                return a(cxt.a, cxt2.a, num3.intValue(), num4.intValue());
            }
            if (num4 == null) {
                if (num3 != null) {
                    return -1;
                }
                return (cxt.a > cxt2.a ? 1 : (cxt.a == cxt2.a ? 0 : -1));
            }
        }
        return 1;
    }

    private final int a(long j, long j2, int i, int i2) {
        if (i != i2) {
            return Integer.compare(i, i2);
        }
        long j3 = this.d;
        if (j == j3) {
            return -1;
        }
        if (j2 == j3) {
            return 1;
        }
        long j4 = this.c;
        if (j != j4) {
            return j2 != j4 ? 0 : 1;
        }
        return -1;
    }
}
