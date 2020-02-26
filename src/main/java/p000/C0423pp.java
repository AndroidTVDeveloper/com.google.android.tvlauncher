package p000;

import android.graphics.Bitmap;
import android.util.SparseBooleanArray;
import java.util.List;

/* renamed from: pp */
/* compiled from: PG */
public final class C0423pp {

    /* renamed from: f */
    public static final C0421pn f10172f = new C0419pl();

    /* renamed from: a */
    public final List f10173a;

    /* renamed from: b */
    public final List f10174b;

    /* renamed from: c */
    public final C0087dd f10175c = new C0087dd();

    /* renamed from: d */
    public final SparseBooleanArray f10176d = new SparseBooleanArray();

    /* renamed from: e */
    public final C0422po f10177e;

    public C0423pp(List list, List list2) {
        this.f10173a = list;
        this.f10174b = list2;
        int size = this.f10173a.size();
        int i = Integer.MIN_VALUE;
        C0422po poVar = null;
        for (int i2 = 0; i2 < size; i2++) {
            C0422po poVar2 = (C0422po) this.f10173a.get(i2);
            int i3 = poVar2.f10164b;
            poVar = i3 > i ? poVar2 : poVar;
            if (i3 > i) {
                i = i3;
            }
        }
        this.f10177e = poVar;
    }

    /* renamed from: a */
    public static C0420pm m8201a(Bitmap bitmap) {
        return new C0420pm(bitmap);
    }

    /* renamed from: a */
    public final int mo5753a(C0424pq pqVar, int i) {
        C0422po poVar = (C0422po) this.f10175c.get(pqVar);
        return poVar != null ? poVar.f10163a : i;
    }

    /* renamed from: a */
    public final int mo5752a(int i) {
        return mo5753a(C0424pq.f10179b, i);
    }
}
