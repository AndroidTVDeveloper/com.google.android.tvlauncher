package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: aap  reason: default package */
/* compiled from: PG */
final class aap implements aaj {
    private final List a;
    private final cz b;

    public aap(List list, cz czVar) {
        this.a = list;
        this.b = czVar;
    }

    public final aai a(Object obj, int i, int i2, tx txVar) {
        aai a2;
        int size = this.a.size();
        ArrayList arrayList = new ArrayList(size);
        ts tsVar = null;
        for (int i3 = 0; i3 < size; i3++) {
            aaj aaj = (aaj) this.a.get(i3);
            if (aaj.a(obj) && (a2 = aaj.a(obj, i, i2, txVar)) != null) {
                tsVar = a2.a;
                arrayList.add(a2.c);
            }
        }
        if (arrayList.isEmpty() || tsVar == null) {
            return null;
        }
        return new aai(tsVar, new aao(arrayList, this.b));
    }

    public final boolean a(Object obj) {
        List list = this.a;
        int size = list.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            if (((aaj) list.get(i)).a(obj)) {
                return true;
            }
            i = i2;
        }
        return false;
    }

    public final String toString() {
        String arrays = Arrays.toString(this.a.toArray());
        StringBuilder sb = new StringBuilder(String.valueOf(arrays).length() + 31);
        sb.append("MultiModelLoader{modelLoaders=");
        sb.append(arrays);
        sb.append('}');
        return sb.toString();
    }
}
