package defpackage;

import android.os.Process;
import java.util.List;

/* renamed from: clj  reason: default package */
/* compiled from: PG */
public final class clj implements Runnable {
    private final List a;
    private final clr b;

    public clj(clr clr, List list) {
        this.b = clr;
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof clj) {
            return this.a.equals(((clj) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final void run() {
        Process.setThreadPriority(10);
        clr clr = this.b;
        List list = this.a;
        int size = list.size();
        boolean z = true;
        for (int i = 0; i < size; i++) {
            z = z && clr.a(null, (String) list.get(i));
        }
    }
}
