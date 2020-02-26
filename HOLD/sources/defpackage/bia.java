package defpackage;

import android.content.Context;
import android.util.SparseArray;

/* renamed from: bia  reason: default package */
/* compiled from: PG */
public final class bia {
    public final Context a;
    public final SparseArray b;
    private final bkf c;

    public bia(Context context) {
        Context context2;
        if (context != null) {
            context2 = context.getApplicationContext();
        } else {
            context2 = null;
        }
        this.a = context2;
        int[] iArr = (int[]) bid.a.get(blm.b(context));
        iArr = iArr == null ? new int[]{2, 2, 2, 2} : iArr;
        SparseArray sparseArray = new SparseArray(6);
        sparseArray.append(0, 1000000L);
        sparseArray.append(2, Long.valueOf(bid.b[iArr[0]]));
        sparseArray.append(3, Long.valueOf(bid.c[iArr[1]]));
        sparseArray.append(4, Long.valueOf(bid.d[iArr[2]]));
        sparseArray.append(5, Long.valueOf(bid.e[iArr[3]]));
        sparseArray.append(7, Long.valueOf(bid.b[iArr[0]]));
        this.b = sparseArray;
        this.c = bkf.a;
    }
}
