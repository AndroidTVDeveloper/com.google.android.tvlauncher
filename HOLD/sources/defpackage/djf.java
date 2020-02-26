package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: djf  reason: default package */
/* compiled from: PG */
public final class djf extends dhw implements RandomAccess, dji, dks {
    public static final djf b;
    private int[] c;
    private int d;

    static {
        djf djf = new djf(new int[0], 0);
        b = djf;
        djf.b();
    }

    public final int size() {
        return this.d;
    }

    public djf() {
        this(new int[10], 0);
    }

    private djf(int[] iArr, int i) {
        this.c = iArr;
        this.d = i;
    }

    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        int i2;
        int intValue = ((Integer) obj).intValue();
        c();
        if (i < 0 || i > (i2 = this.d)) {
            throw new IndexOutOfBoundsException(f(i));
        }
        int[] iArr = this.c;
        if (i2 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
        } else {
            int[] iArr2 = new int[(((i2 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.c, i, iArr2, i + 1, this.d - i);
            this.c = iArr2;
        }
        this.c[i] = intValue;
        this.d++;
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        d(((Integer) obj).intValue());
        return true;
    }

    public final boolean addAll(Collection collection) {
        c();
        djl.a(collection);
        if (!(collection instanceof djf)) {
            return super.addAll(collection);
        }
        djf djf = (djf) collection;
        int i = djf.d;
        if (i == 0) {
            return false;
        }
        int i2 = this.d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            int[] iArr = this.c;
            if (i3 > iArr.length) {
                this.c = Arrays.copyOf(iArr, i3);
            }
            System.arraycopy(djf.c, 0, this.c, this.d, djf.d);
            this.d = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final void d(int i) {
        c();
        int i2 = this.d;
        int[] iArr = this.c;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[(((i2 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.c = iArr2;
        }
        int[] iArr3 = this.c;
        int i3 = this.d;
        this.d = i3 + 1;
        iArr3[i3] = i;
    }

    private final void e(int i) {
        if (i < 0 || i >= this.d) {
            throw new IndexOutOfBoundsException(f(i));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof djf)) {
            return super.equals(obj);
        }
        djf djf = (djf) obj;
        if (this.d != djf.d) {
            return false;
        }
        int[] iArr = djf.c;
        for (int i = 0; i < this.d; i++) {
            if (this.c[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        return Integer.valueOf(c(i));
    }

    public final int c(int i) {
        e(i);
        return this.c[i];
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.d; i2++) {
            i = (i * 31) + this.c[i2];
        }
        return i;
    }

    private final String f(int i) {
        int i2 = this.d;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: b */
    public final dji a(int i) {
        if (i >= this.d) {
            return new djf(Arrays.copyOf(this.c, i), this.d);
        }
        throw new IllegalArgumentException();
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        c();
        e(i);
        int[] iArr = this.c;
        int i2 = iArr[i];
        int i3 = this.d;
        if (i < i3 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i3 - i) - 1);
        }
        this.d--;
        this.modCount++;
        return Integer.valueOf(i2);
    }

    public final boolean remove(Object obj) {
        c();
        for (int i = 0; i < this.d; i++) {
            if (obj.equals(Integer.valueOf(this.c[i]))) {
                int[] iArr = this.c;
                System.arraycopy(iArr, i + 1, iArr, i, (this.d - i) - 1);
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
            int[] iArr = this.c;
            System.arraycopy(iArr, i2, iArr, i, this.d - i2);
            this.d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        c();
        e(i);
        int[] iArr = this.c;
        int i2 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i2);
    }
}
