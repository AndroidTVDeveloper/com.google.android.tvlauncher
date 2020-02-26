package p000;

import android.support.p002v7.widget.RecyclerView;
import java.util.Comparator;

/* renamed from: in */
/* compiled from: PG */
final class C0232in implements Comparator {
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        C0234ip ipVar = (C0234ip) obj;
        C0234ip ipVar2 = (C0234ip) obj2;
        RecyclerView recyclerView = ipVar.f9620d;
        if ((recyclerView == null) != (ipVar2.f9620d == null)) {
            return recyclerView != null ? -1 : 1;
        }
        boolean z = ipVar.f9617a;
        if (z != ipVar2.f9617a) {
            return z ? -1 : 1;
        }
        int i = ipVar2.f9618b - ipVar.f9618b;
        if (i != 0) {
            return i;
        }
        int i2 = ipVar.f9619c - ipVar2.f9619c;
        if (i2 == 0) {
            return 0;
        }
        return i2;
    }
}
