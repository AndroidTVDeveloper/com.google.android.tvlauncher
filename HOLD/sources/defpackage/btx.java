package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: btx  reason: default package */
/* compiled from: PG */
public final class btx {
    private final List a = new ArrayList();
    private final Object b;

    public /* synthetic */ btx(Object obj) {
        this.b = buh.a(obj);
    }

    public final void a(String str, Object obj) {
        List list = this.a;
        String str2 = (String) buh.a((Object) str);
        String valueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 1 + String.valueOf(valueOf).length());
        sb.append(str2);
        sb.append("=");
        sb.append(valueOf);
        list.add(sb.toString());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append(this.b.getClass().getSimpleName());
        sb.append('{');
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            sb.append((String) this.a.get(i));
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
