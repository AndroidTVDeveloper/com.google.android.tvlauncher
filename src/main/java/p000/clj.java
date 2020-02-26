package p000;

import android.os.Process;
import java.util.List;

/* renamed from: clj */
/* compiled from: PG */
public final class clj implements Runnable {

    /* renamed from: a */
    private final List f5911a;

    /* renamed from: b */
    private final clr f5912b;

    public clj(clr clr, List list) {
        this.f5912b = clr;
        this.f5911a = list;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof clj) {
            return this.f5911a.equals(((clj) obj).f5911a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f5911a.hashCode();
    }

    public final void run() {
        Process.setThreadPriority(10);
        clr clr = this.f5912b;
        List list = this.f5911a;
        int size = list.size();
        boolean z = true;
        for (int i = 0; i < size; i++) {
            z = z && clr.mo3104a(null, (String) list.get(i));
        }
    }
}
