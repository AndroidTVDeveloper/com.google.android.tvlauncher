package defpackage;

import android.util.Pair;

/* renamed from: alh  reason: default package */
/* compiled from: PG */
public abstract class alh {
    public static final alh a = new ale();

    public abstract int a();

    public abstract int a(Object obj);

    public abstract alf a(int i, alf alf, boolean z);

    public abstract alg a(int i, alg alg, long j);

    public abstract Object a(int i);

    public abstract int b();

    public final int d() {
        return c() ? -1 : 0;
    }

    public final int e() {
        if (!c()) {
            return a() - 1;
        }
        return -1;
    }

    public final int a(int i, alf alf, alg alg, int i2) {
        a(i, alf);
        if (a(0, alg).f != i) {
            return i + 1;
        }
        int a2 = a(0, i2);
        if (a2 == -1) {
            return -1;
        }
        int i3 = a(a2, alg).e;
        return 0;
    }

    public final int a(int i, int i2) {
        if (i2 != 0) {
            if (i2 == 1) {
                return i;
            }
            if (i2 != 2) {
                throw new IllegalStateException();
            } else if (i != e()) {
                return i + 1;
            } else {
                return d();
            }
        } else if (i == e()) {
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
    public final void a(int i, alf alf) {
        a(i, alf, false);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: alh.a(int, alf, boolean):alf
     arg types: [int, alf, int]
     candidates:
      alh.a(int, alg, long):alg
      alh.a(int, alf, boolean):alf */
    public final alf a(Object obj, alf alf) {
        return a(a(obj), alf, true);
    }

    public final Pair a(alg alg, alf alf, int i, long j) {
        return (Pair) bks.a(a(alg, alf, i, j, 0));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: alh.a(int, alf, boolean):alf
     arg types: [int, alf, int]
     candidates:
      alh.a(int, alg, long):alg
      alh.a(int, alf, boolean):alf */
    public final Pair a(alg alg, alf alf, int i, long j, long j2) {
        bks.a(i, a());
        a(i, alg, j2);
        if (j == -9223372036854775807L) {
            j = alg.g;
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        int i2 = alg.e;
        long j3 = alg.i + j;
        int i3 = 0;
        long j4 = a(0, alf, true).b;
        while (j4 != -9223372036854775807L && j3 >= j4 && i3 < alg.f) {
            j3 -= j4;
            i3++;
            j4 = a(i3, alf, true).b;
        }
        return Pair.create(bks.a(alf.a), Long.valueOf(j3));
    }

    public final alg a(int i, alg alg) {
        return a(i, alg, 0);
    }

    public final boolean c() {
        return a() == 0;
    }
}
