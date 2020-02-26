package defpackage;

import android.support.v7.widget.RecyclerView;
import java.util.Comparator;

/* renamed from: in  reason: default package */
/* compiled from: PG */
final class in implements Comparator {
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        ip ipVar = (ip) obj;
        ip ipVar2 = (ip) obj2;
        RecyclerView recyclerView = ipVar.d;
        if ((recyclerView == null) != (ipVar2.d == null)) {
            return recyclerView != null ? -1 : 1;
        }
        boolean z = ipVar.a;
        if (z != ipVar2.a) {
            return z ? -1 : 1;
        }
        int i = ipVar2.b - ipVar.b;
        if (i != 0) {
            return i;
        }
        int i2 = ipVar.c - ipVar2.c;
        if (i2 == 0) {
            return 0;
        }
        return i2;
    }
}
