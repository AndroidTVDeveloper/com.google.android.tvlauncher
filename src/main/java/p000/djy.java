package p000;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: djy */
/* compiled from: PG */
public final class djy extends dhw implements RandomAccess, djj, dks {

    /* renamed from: b */
    public static final djy f8703b;

    /* renamed from: c */
    private long[] f8704c;

    /* renamed from: d */
    private int f8705d;

    static {
        djy djy = new djy(new long[0], 0);
        f8703b = djy;
        djy.mo4379b();
    }

    public final int size() {
        return this.f8705d;
    }

    public djy() {
        this(new long[10], 0);
    }

    private djy(long[] jArr, int i) {
        this.f8704c = jArr;
        this.f8705d = i;
    }

    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        int i2;
        long longValue = ((Long) obj).longValue();
        mo4380c();
        if (i < 0 || i > (i2 = this.f8705d)) {
            throw new IndexOutOfBoundsException(m6759e(i));
        }
        long[] jArr = this.f8704c;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[(((i2 * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.f8704c, i, jArr2, i + 1, this.f8705d - i);
            this.f8704c = jArr2;
        }
        this.f8704c[i] = longValue;
        this.f8705d++;
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo4528a(((Long) obj).longValue());
        return true;
    }

    public final boolean addAll(Collection collection) {
        mo4380c();
        djl.m6727a(collection);
        if (!(collection instanceof djy)) {
            return super.addAll(collection);
        }
        djy djy = (djy) collection;
        int i = djy.f8705d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f8705d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            long[] jArr = this.f8704c;
            if (i3 > jArr.length) {
                this.f8704c = Arrays.copyOf(jArr, i3);
            }
            System.arraycopy(djy.f8704c, 0, this.f8704c, this.f8705d, djy.f8705d);
            this.f8705d = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: a */
    public final void mo4528a(long j) {
        mo4380c();
        int i = this.f8705d;
        long[] jArr = this.f8704c;
        if (i == jArr.length) {
            long[] jArr2 = new long[(((i * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.f8704c = jArr2;
        }
        long[] jArr3 = this.f8704c;
        int i2 = this.f8705d;
        this.f8705d = i2 + 1;
        jArr3[i2] = j;
    }

    /* renamed from: d */
    private final void m6758d(int i) {
        if (i < 0 || i >= this.f8705d) {
            throw new IndexOutOfBoundsException(m6759e(i));
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
        if (this.f8705d != djy.f8705d) {
            return false;
        }
        long[] jArr = djy.f8704c;
        for (int i = 0; i < this.f8705d; i++) {
            if (this.f8704c[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        return Long.valueOf(mo4549c(i));
    }

    /* renamed from: c */
    public final long mo4549c(int i) {
        m6758d(i);
        return this.f8704c[i];
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f8705d; i2++) {
            i = (i * 31) + djl.m6722a(this.f8704c[i2]);
        }
        return i;
    }

    /* renamed from: e */
    private final String m6759e(int i) {
        int i2 = this.f8705d;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: b */
    public final djj mo4398a(int i) {
        if (i >= this.f8705d) {
            return new djy(Arrays.copyOf(this.f8704c, i), this.f8705d);
        }
        throw new IllegalArgumentException();
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo4380c();
        m6758d(i);
        long[] jArr = this.f8704c;
        long j = jArr[i];
        int i2 = this.f8705d;
        if (i < i2 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.f8705d--;
        this.modCount++;
        return Long.valueOf(j);
    }

    public final boolean remove(Object obj) {
        mo4380c();
        for (int i = 0; i < this.f8705d; i++) {
            if (obj.equals(Long.valueOf(this.f8704c[i]))) {
                long[] jArr = this.f8704c;
                System.arraycopy(jArr, i + 1, jArr, i, (this.f8705d - i) - 1);
                this.f8705d--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo4380c();
        if (i2 >= i) {
            long[] jArr = this.f8704c;
            System.arraycopy(jArr, i2, jArr, i, this.f8705d - i2);
            this.f8705d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        mo4380c();
        m6758d(i);
        long[] jArr = this.f8704c;
        long j = jArr[i];
        jArr[i] = longValue;
        return Long.valueOf(j);
    }
}
