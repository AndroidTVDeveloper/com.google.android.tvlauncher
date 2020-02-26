package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: aap */
/* compiled from: PG */
final class aap implements aaj {

    /* renamed from: a */
    private final List f26a;

    /* renamed from: b */
    private final C0082cz f27b;

    public aap(List list, C0082cz czVar) {
        this.f26a = list;
        this.f27b = czVar;
    }

    /* renamed from: a */
    public final aai mo11a(Object obj, int i, int i2, C0539tx txVar) {
        aai a;
        int size = this.f26a.size();
        ArrayList arrayList = new ArrayList(size);
        C0534ts tsVar = null;
        for (int i3 = 0; i3 < size; i3++) {
            aaj aaj = (aaj) this.f26a.get(i3);
            if (aaj.mo12a(obj) && (a = aaj.mo11a(obj, i, i2, txVar)) != null) {
                tsVar = a.f12a;
                arrayList.add(a.f14c);
            }
        }
        if (arrayList.isEmpty() || tsVar == null) {
            return null;
        }
        return new aai(tsVar, new aao(arrayList, this.f27b));
    }

    /* renamed from: a */
    public final boolean mo12a(Object obj) {
        List list = this.f26a;
        int size = list.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            if (((aaj) list.get(i)).mo12a(obj)) {
                return true;
            }
            i = i2;
        }
        return false;
    }

    public final String toString() {
        String arrays = Arrays.toString(this.f26a.toArray());
        StringBuilder sb = new StringBuilder(String.valueOf(arrays).length() + 31);
        sb.append("MultiModelLoader{modelLoaders=");
        sb.append(arrays);
        sb.append('}');
        return sb.toString();
    }
}
