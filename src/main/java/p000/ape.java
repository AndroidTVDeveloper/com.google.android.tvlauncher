package p000;

import java.util.ArrayDeque;

/* renamed from: ape */
/* compiled from: PG */
final class ape implements apg {

    /* renamed from: a */
    public final byte[] f1575a = new byte[8];

    /* renamed from: b */
    public final ArrayDeque f1576b = new ArrayDeque();

    /* renamed from: c */
    public final apm f1577c = new apm();

    /* renamed from: d */
    public apf f1578d;

    /* renamed from: e */
    public int f1579e;

    /* renamed from: f */
    public int f1580f;

    /* renamed from: g */
    public long f1581g;

    /* renamed from: a */
    public final long mo1228a(aoj aoj, int i) {
        aoj.mo1196b(this.f1575a, 0, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | ((long) (this.f1575a[i2] & 255));
        }
        return j;
    }
}
