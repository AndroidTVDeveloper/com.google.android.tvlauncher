package defpackage;

import java.util.ArrayDeque;

/* renamed from: ape  reason: default package */
/* compiled from: PG */
final class ape implements apg {
    public final byte[] a = new byte[8];
    public final ArrayDeque b = new ArrayDeque();
    public final apm c = new apm();
    public apf d;
    public int e;
    public int f;
    public long g;

    public final long a(aoj aoj, int i) {
        aoj.b(this.a, 0, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | ((long) (this.a[i2] & 255));
        }
        return j;
    }
}
