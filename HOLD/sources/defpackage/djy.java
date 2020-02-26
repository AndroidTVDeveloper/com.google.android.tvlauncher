package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: djy  reason: default package */
/* compiled from: PG */
public final class djy extends dhw implements RandomAccess, djj, dks {
    public static final djy b;
    private long[] c;
    private int d;

    static {
        djy djy = new djy(new long[0], 0);
        b = djy;
        djy.b();
    }

    public final int size() {
        return this.d;
    }

    public djy() {
        this(new long[10], 0);
    }

    private djy(long[] jArr, int i) {
        this.c = jArr;
        this.d = i;
    }

    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        int i2;
        long longValue = ((Long) obj).longValue();
        c();
        if (i < 0 || i > (i2 = this.d)) {
            throw new IndexOutOfBoundsException(e(i));
        }
        long[] jArr = this.c;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[(((i2 * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.c, i, jArr2, i + 1, this.d - i);
            this.c = jArr2;
        }
        this.c[i] = longValue;
        this.d++;
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        a(((Long) obj).longValue());
        return true;
    }

    public final boolean addAll(Collection collection) {
        c();
        djl.a(collection);
        if (!(collection instanceof djy)) {
            return super.addAll(collection);
        }
        djy djy = (djy) collection;
        int i = djy.d;
        if (i == 0) {
            return false;
        }
        int i2 = this.d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            long[] jArr = this.c;
            if (i3 > jArr.length) {
                this.c = Arrays.copyOf(jArr, i3);
            }
            System.arraycopy(djy.c, 0, this.c, this.d, djy.d);
            this.d = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final void a(long j) {
        c();
        int i = this.d;
        long[] jArr = this.c;
        if (i == jArr.length) {
            long[] jArr2 = new long[(((i * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.c = jArr2;
        }
        long[] jArr3 = this.c;
        int i2 = this.d;
        this.d = i2 + 1;
        jArr3[i2] = j;
    }

    private final void d(int i) {
        if (i < 0 || i >= this.d) {
            throw new IndexOutOfBoundsException(e(i));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof djy)) {
            return super.equals(obj);
        }
        djy djy = (djy) obj;
        if (this.d != djy.d) {
            return false;
        }
        long[] jArr = djy.c;
        for (int i = 0; i < this.d; i++) {
            if (this.c[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        return Long.valueOf(c(i));
    }

    public final long c(int i) {
        d(i);
        return this.c[i];
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.d; i2++) {
            i = (i * 31) + djl.a(this.c[i2]);
        }
        return i;
    }

    private final String e(int i) {
        int i2 = this.d;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: b */
    public final djj a(int i) {
        if (i >= this.d) {
            return new djy(Arrays.copyOf(this.c, i), this.d);
        }
        throw new IllegalArgumentException();
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        c();
        d(i);
        long[] jArr = this.c;
        long j = jArr[i];
        int i2 = this.d;
        if (i < i2 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.d--;
        this.modCount++;
        return Long.valueOf(j);
    }

    public final boolean remove(Object obj) {
        c();
        for (int i = 0; i < this.d; i++) {
            if (obj.equals(Long.valueOf(this.c[i]))) {
                long[] jArr = this.c;
                System.arraycopy(jArr, i + 1, jArr, i, (this.d - i) - 1);
                this.d--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        c();
        if (i2 >= i) {
            long[] jArr = this.c;
            System.arraycopy(jArr, i2, jArr, i, this.d - i2);
            this.d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        c();
        d(i);
        long[] jArr = this.c;
        long j = jArr[i];
        jArr[i] = longValue;
        return Long.valueOf(j);
    }
}
