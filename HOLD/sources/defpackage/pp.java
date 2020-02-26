package defpackage;

import android.graphics.Bitmap;
import android.util.SparseBooleanArray;
import java.util.List;

/* renamed from: pp  reason: default package */
/* compiled from: PG */
public final class pp {
    public static final pn f = new pl();
    public final List a;
    public final List b;
    public final dd c = new dd();
    public final SparseBooleanArray d = new SparseBooleanArray();
    public final po e;

    public pp(List list, List list2) {
        this.a = list;
        this.b = list2;
        int size = this.a.size();
        int i = Integer.MIN_VALUE;
        po poVar = null;
        for (int i2 = 0; i2 < size; i2++) {
            po poVar2 = (po) this.a.get(i2);
            int i3 = poVar2.b;
            poVar = i3 > i ? poVar2 : poVar;
            if (i3 > i) {
                i = i3;
            }
        }
        this.e = poVar;
    }

    public static pm a(Bitmap bitmap) {
        return new pm(bitmap);
    }

    public final int a(pq pqVar, int i) {
        po poVar = (po) this.c.get(pqVar);
        return poVar != null ? poVar.a : i;
    }

    public final int a(int i) {
        return a(pq.b, i);
    }
}
