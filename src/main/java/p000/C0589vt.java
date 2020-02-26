package p000;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: vt */
/* compiled from: PG */
public final class C0589vt {

    /* renamed from: a */
    public final aew f10644a;

    /* renamed from: b */
    public final C0082cz f10645b;

    /* renamed from: c */
    private final Class f10646c;

    /* renamed from: d */
    private final List f10647d;

    /* renamed from: e */
    private final String f10648e;

    public C0589vt(Class cls, Class cls2, Class cls3, List list, aew aew, C0082cz czVar) {
        this.f10646c = cls;
        this.f10647d = list;
        this.f10644a = aew;
        this.f10645b = czVar;
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
        this.f10648e = sb.toString();
    }

    /* renamed from: a */
    public final C0619ww mo6047a(C0551ui uiVar, int i, int i2, C0539tx txVar, List list) {
        int size = this.f10647d.size();
        C0619ww wwVar = null;
        for (int i3 = 0; i3 < size; i3++) {
            C0541tz tzVar = (C0541tz) this.f10647d.get(i3);
            try {
                if (tzVar.mo39a(uiVar.mo87a(), txVar)) {
                    wwVar = tzVar.mo38a(uiVar.mo87a(), i, i2, txVar);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e) {
                list.add(e);
            }
            if (wwVar != null) {
                break;
            }
        }
        if (wwVar != null) {
            return wwVar;
        }
        throw new C0613wq(this.f10648e, new ArrayList(list));
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f10646c);
        String valueOf2 = String.valueOf(this.f10647d);
        String valueOf3 = String.valueOf(this.f10644a);
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
