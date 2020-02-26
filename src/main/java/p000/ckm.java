package p000;

import android.util.LongSparseArray;
import java.util.Comparator;

/* renamed from: ckm */
/* compiled from: PG */
final class ckm implements Comparator {

    /* renamed from: a */
    public LongSparseArray f5822a;

    private ckm() {
    }

    public /* synthetic */ ckm(byte b) {
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        cxt cxt = (cxt) obj;
        cxt cxt2 = (cxt) obj2;
        int i = ((dai) this.f5822a.get(cxt.f7874a)).f8052c;
        int i2 = ((dai) this.f5822a.get(cxt2.f7874a)).f8052c;
        if (i == i2) {
            if (((dai) this.f5822a.get(cxt.f7874a)).f8054e) {
                return 1;
            }
            if (((dai) this.f5822a.get(cxt2.f7874a)).f8054e) {
                return -1;
            }
        }
        return Integer.compare(i, i2);
    }
}
