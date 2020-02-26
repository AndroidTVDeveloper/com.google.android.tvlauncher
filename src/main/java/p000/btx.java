package p000;

import java.util.ArrayList;
import java.util.List;

/* renamed from: btx */
/* compiled from: PG */
public final class btx {

    /* renamed from: a */
    private final List f4832a = new ArrayList();

    /* renamed from: b */
    private final Object f4833b;

    public /* synthetic */ btx(Object obj) {
        this.f4833b = buh.m4199a(obj);
    }

    /* renamed from: a */
    public final void mo2440a(String str, Object obj) {
        List list = this.f4832a;
        String str2 = (String) buh.m4199a((Object) str);
        String valueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 1 + String.valueOf(valueOf).length());
        sb.append(str2);
        sb.append("=");
        sb.append(valueOf);
        list.add(sb.toString());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append(this.f4833b.getClass().getSimpleName());
        sb.append('{');
        int size = this.f4832a.size();
        for (int i = 0; i < size; i++) {
            sb.append((String) this.f4832a.get(i));
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
