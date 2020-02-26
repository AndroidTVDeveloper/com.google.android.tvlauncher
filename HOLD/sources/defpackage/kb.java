package defpackage;

import android.util.SparseArray;

/* renamed from: kb  reason: default package */
/* compiled from: PG */
public final class kb {
    public final SparseArray a = new SparseArray();
    public int b = 0;

    static final long a(long j, long j2) {
        return j != 0 ? ((j / 4) * 3) + (j2 / 4) : j2;
    }

    public final ka a(int i) {
        ka kaVar = (ka) this.a.get(i);
        if (kaVar != null) {
            return kaVar;
        }
        ka kaVar2 = new ka();
        this.a.put(i, kaVar2);
        return kaVar2;
    }
}
