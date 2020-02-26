package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: vt  reason: default package */
/* compiled from: PG */
public final class vt {
    public final aew a;
    public final cz b;
    private final Class c;
    private final List d;
    private final String e;

    public vt(Class cls, Class cls2, Class cls3, List list, aew aew, cz czVar) {
        this.c = cls;
        this.d = list;
        this.a = aew;
        this.b = czVar;
        String simpleName = cls.getSimpleName();
        String simpleName2 = cls2.getSimpleName();
        String simpleName3 = cls3.getSimpleName();
        int length = String.valueOf(simpleName).length();
        StringBuilder sb = new StringBuilder(length + 23 + String.valueOf(simpleName2).length() + String.valueOf(simpleName3).length());
        sb.append("Failed DecodePath{");
        sb.append(simpleName);
        sb.append("->");
        sb.append(simpleName2);
        sb.append("->");
        sb.append(simpleName3);
        sb.append("}");
        this.e = sb.toString();
    }

    public final ww a(ui uiVar, int i, int i2, tx txVar, List list) {
        int size = this.d.size();
        ww wwVar = null;
        for (int i3 = 0; i3 < size; i3++) {
            tz tzVar = (tz) this.d.get(i3);
            try {
                if (tzVar.a(uiVar.a(), txVar)) {
                    wwVar = tzVar.a(uiVar.a(), i, i2, txVar);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e2) {
                list.add(e2);
            }
            if (wwVar != null) {
                break;
            }
        }
        if (wwVar != null) {
            return wwVar;
        }
        throw new wq(this.e, new ArrayList(list));
    }

    public final String toString() {
        String valueOf = String.valueOf(this.c);
        String valueOf2 = String.valueOf(this.d);
        String valueOf3 = String.valueOf(this.a);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 47 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("DecodePath{ dataClass=");
        sb.append(valueOf);
        sb.append(", decoders=");
        sb.append(valueOf2);
        sb.append(", transcoder=");
        sb.append(valueOf3);
        sb.append('}');
        return sb.toString();
    }
}
