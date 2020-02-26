package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: afs */
/* compiled from: PG */
public final class afs {

    /* renamed from: a */
    public final Set f248a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b */
    public final List f249b = new ArrayList();

    /* renamed from: c */
    public boolean f250c;

    /* renamed from: a */
    public final boolean mo175a(agm agm) {
        boolean z = true;
        if (agm == null) {
            return true;
        }
        boolean remove = this.f248a.remove(agm);
        if (!this.f249b.remove(agm) && !remove) {
            z = false;
        }
        if (z) {
            agm.mo217b();
        }
        return z;
    }

    public final String toString() {
        String obj = super.toString();
        int size = this.f248a.size();
        boolean z = this.f250c;
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 41);
        sb.append(obj);
        sb.append("{numRequests=");
        sb.append(size);
        sb.append(", isPaused=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
