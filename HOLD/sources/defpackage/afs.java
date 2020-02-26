package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: afs  reason: default package */
/* compiled from: PG */
public final class afs {
    public final Set a = Collections.newSetFromMap(new WeakHashMap());
    public final List b = new ArrayList();
    public boolean c;

    public final boolean a(agm agm) {
        boolean z = true;
        if (agm == null) {
            return true;
        }
        boolean remove = this.a.remove(agm);
        if (!this.b.remove(agm) && !remove) {
            z = false;
        }
        if (z) {
            agm.b();
        }
        return z;
    }

    public final String toString() {
        String obj = super.toString();
        int size = this.a.size();
        boolean z = this.c;
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
