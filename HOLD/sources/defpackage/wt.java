package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* renamed from: wt  reason: default package */
/* compiled from: PG */
public final class wt {
    public final cz a;
    public final List b;
    public final String c;

    public wt(Class cls, Class cls2, Class cls3, List list, cz czVar) {
        this.a = czVar;
        this.b = (List) aic.a((Collection) list);
        String simpleName = cls.getSimpleName();
        String simpleName2 = cls2.getSimpleName();
        String simpleName3 = cls3.getSimpleName();
        int length = String.valueOf(simpleName).length();
        StringBuilder sb = new StringBuilder(length + 21 + String.valueOf(simpleName2).length() + String.valueOf(simpleName3).length());
        sb.append("Failed LoadPath{");
        sb.append(simpleName);
        sb.append("->");
        sb.append(simpleName2);
        sb.append("->");
        sb.append(simpleName3);
        sb.append("}");
        this.c = sb.toString();
    }

    public final String toString() {
        String arrays = Arrays.toString(this.b.toArray());
        StringBuilder sb = new StringBuilder(String.valueOf(arrays).length() + 22);
        sb.append("LoadPath{decodePaths=");
        sb.append(arrays);
        sb.append('}');
        return sb.toString();
    }
}
