package p000;

import android.util.SparseArray;

/* renamed from: kb */
/* compiled from: PG */
public final class C0274kb {

    /* renamed from: a */
    public final SparseArray f9724a = new SparseArray();

    /* renamed from: b */
    public int f9725b = 0;

    /* renamed from: a */
    static final long m7756a(long j, long j2) {
        return j != 0 ? ((j / 4) * 3) + (j2 / 4) : j2;
    }

    /* renamed from: a */
    public final C0273ka mo5390a(int i) {
        C0273ka kaVar = (C0273ka) this.f9724a.get(i);
        if (kaVar != null) {
            return kaVar;
        }
        C0273ka kaVar2 = new C0273ka();
        this.f9724a.put(i, kaVar2);
        return kaVar2;
    }
}
