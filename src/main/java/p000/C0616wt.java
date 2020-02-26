package p000;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* renamed from: wt */
/* compiled from: PG */
public final class C0616wt {

    /* renamed from: a */
    public final C0082cz f10728a;

    /* renamed from: b */
    public final List f10729b;

    /* renamed from: c */
    public final String f10730c;

    public C0616wt(Class cls, Class cls2, Class cls3, List list, C0082cz czVar) {
        this.f10728a = czVar;
        this.f10729b = (List) aic.m545a((Collection) list);
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
        this.f10730c = sb.toString();
    }

    public final String toString() {
        String arrays = Arrays.toString(this.f10729b.toArray());
        StringBuilder sb = new StringBuilder(String.valueOf(arrays).length() + 22);
        sb.append("LoadPath{decodePaths=");
        sb.append(arrays);
        sb.append('}');
        return sb.toString();
    }
}
