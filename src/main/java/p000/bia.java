package p000;

import android.content.Context;
import android.util.SparseArray;

/* renamed from: bia */
/* compiled from: PG */
public final class bia {

    /* renamed from: a */
    public final Context f4016a;

    /* renamed from: b */
    public final SparseArray f4017b;

    /* renamed from: c */
    private final bkf f4018c;

    public bia(Context context) {
        Context context2;
        if (context != null) {
            context2 = context.getApplicationContext();
        } else {
            context2 = null;
        }
        this.f4016a = context2;
        int[] iArr = (int[]) bid.f4023a.get(blm.m3664b(context));
        iArr = iArr == null ? new int[]{2, 2, 2, 2} : iArr;
        SparseArray sparseArray = new SparseArray(6);
        sparseArray.append(0, 1000000L);
        sparseArray.append(2, Long.valueOf(bid.f4024b[iArr[0]]));
        sparseArray.append(3, Long.valueOf(bid.f4025c[iArr[1]]));
        sparseArray.append(4, Long.valueOf(bid.f4026d[iArr[2]]));
        sparseArray.append(5, Long.valueOf(bid.f4027e[iArr[3]]));
        sparseArray.append(7, Long.valueOf(bid.f4024b[iArr[0]]));
        this.f4017b = sparseArray;
        this.f4018c = bkf.f4206a;
    }
}
