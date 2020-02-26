package p000;

import android.util.Pair;

/* renamed from: alh */
/* compiled from: PG */
public abstract class alh {

    /* renamed from: a */
    public static final alh f685a = new ale();

    /* renamed from: a */
    public abstract int mo524a();

    /* renamed from: a */
    public abstract int mo525a(Object obj);

    /* renamed from: a */
    public abstract alf mo526a(int i, alf alf, boolean z);

    /* renamed from: a */
    public abstract alg mo527a(int i, alg alg, long j);

    /* renamed from: a */
    public abstract Object mo528a(int i);

    /* renamed from: b */
    public abstract int mo529b();

    /* renamed from: d */
    public final int mo553d() {
        return mo552c() ? -1 : 0;
    }

    /* renamed from: e */
    public final int mo554e() {
        if (!mo552c()) {
            return mo524a() - 1;
        }
        return -1;
    }

    /* renamed from: a */
    public final int mo546a(int i, alf alf, alg alg, int i2) {
        mo551a(i, alf);
        if (mo548a(0, alg).f677f != i) {
            return i + 1;
        }
        int a = mo545a(0, i2);
        if (a == -1) {
            return -1;
        }
        int i3 = mo548a(a, alg).f676e;
        return 0;
    }

    /* renamed from: a */
    public final int mo545a(int i, int i2) {
        if (i2 != 0) {
            if (i2 == 1) {
                return i;
            }
            if (i2 != 2) {
                throw new IllegalStateException();
            } else if (i != mo554e()) {
                return i + 1;
            } else {
                return mo553d();
            }
        } else if (i == mo554e()) {
            return -1;
        } else {
            return i + 1;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: alh.a(int, alf, boolean):alf
     arg types: [int, alf, int]
     candidates:
      alh.a(int, alg, long):alg
      alh.a(int, alf, boolean):alf */
    /* renamed from: a */
    public final void mo551a(int i, alf alf) {
        mo526a(i, alf, false);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: alh.a(int, alf, boolean):alf
     arg types: [int, alf, int]
     candidates:
      alh.a(int, alg, long):alg
      alh.a(int, alf, boolean):alf */
    /* renamed from: a */
    public final alf mo547a(Object obj, alf alf) {
        return mo526a(mo525a(obj), alf, true);
    }

    /* renamed from: a */
    public final Pair mo549a(alg alg, alf alf, int i, long j) {
        return (Pair) bks.m3507a(mo550a(alg, alf, i, j, 0));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: alh.a(int, alf, boolean):alf
     arg types: [int, alf, int]
     candidates:
      alh.a(int, alg, long):alg
      alh.a(int, alf, boolean):alf */
    /* renamed from: a */
    public final Pair mo550a(alg alg, alf alf, int i, long j, long j2) {
        bks.m3509a(i, mo524a());
        mo527a(i, alg, j2);
        if (j == -9223372036854775807L) {
            j = alg.f678g;
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        int i2 = alg.f676e;
        long j3 = alg.f680i + j;
        int i3 = 0;
        long j4 = mo526a(0, alf, true).f668b;
        while (j4 != -9223372036854775807L && j3 >= j4 && i3 < alg.f677f) {
            j3 -= j4;
            i3++;
            j4 = mo526a(i3, alf, true).f668b;
        }
        return Pair.create(bks.m3507a(alf.f667a), Long.valueOf(j3));
    }

    /* renamed from: a */
    public final alg mo548a(int i, alg alg) {
        return mo527a(i, alg, 0);
    }

    /* renamed from: c */
    public final boolean mo552c() {
        return mo524a() == 0;
    }
}
