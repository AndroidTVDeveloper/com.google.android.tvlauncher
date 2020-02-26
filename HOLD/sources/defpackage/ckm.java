package defpackage;

import android.util.LongSparseArray;
import java.util.Comparator;

/* renamed from: ckm  reason: default package */
/* compiled from: PG */
final class ckm implements Comparator {
    public LongSparseArray a;

    private ckm() {
    }

    public /* synthetic */ ckm(byte b) {
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        cxt cxt = (cxt) obj;
        cxt cxt2 = (cxt) obj2;
        int i = ((dai) this.a.get(cxt.a)).c;
        int i2 = ((dai) this.a.get(cxt2.a)).c;
        if (i == i2) {
            if (((dai) this.a.get(cxt.a)).e) {
                return 1;
            }
            if (((dai) this.a.get(cxt2.a)).e) {
                return -1;
            }
        }
        return Integer.compare(i, i2);
    }
}
