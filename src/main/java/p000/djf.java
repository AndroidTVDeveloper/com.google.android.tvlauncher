package p000;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: djf */
/* compiled from: PG */
public final class djf extends dhw implements RandomAccess, dji, dks {

    /* renamed from: b */
    public static final djf f8679b;

    /* renamed from: c */
    private int[] f8680c;

    /* renamed from: d */
    private int f8681d;

    static {
        djf djf = new djf(new int[0], 0);
        f8679b = djf;
        djf.mo4379b();
    }

    public final int size() {
        return this.f8681d;
    }

    public djf() {
        this(new int[10], 0);
    }

    private djf(int[] iArr, int i) {
        this.f8680c = iArr;
        this.f8681d = i;
    }

    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        int i2;
        int intValue = ((Integer) obj).intValue();
        mo4380c();
        if (i < 0 || i > (i2 = this.f8681d)) {
            throw new IndexOutOfBoundsException(m6707f(i));
        }
        int[] iArr = this.f8680c;
        if (i2 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
        } else {
            int[] iArr2 = new int[(((i2 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.f8680c, i, iArr2, i + 1, this.f8681d - i);
            this.f8680c = iArr2;
        }
        this.f8680c[i] = intValue;
        this.f8681d++;
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo4523d(((Integer) obj).intValue());
        return true;
    }

    public final boolean addAll(Collection collection) {
        mo4380c();
        djl.m6727a(collection);
        if (!(collection instanceof djf)) {
            return super.addAll(collection);
        }
        djf djf = (djf) collection;
        int i = djf.f8681d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f8681d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            int[] iArr = this.f8680c;
            if (i3 > iArr.length) {
                this.f8680c = Arrays.copyOf(iArr, i3);
            }
            System.arraycopy(djf.f8680c, 0, this.f8680c, this.f8681d, djf.f8681d);
            this.f8681d = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: d */
    public final void mo4523d(int i) {
        mo4380c();
        int i2 = this.f8681d;
        int[] iArr = this.f8680c;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[(((i2 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f8680c = iArr2;
        }
        int[] iArr3 = this.f8680c;
        int i3 = this.f8681d;
        this.f8681d = i3 + 1;
        iArr3[i3] = i;
    }

    /* renamed from: e */
    private final void m6706e(int i) {
        if (i < 0 || i >= this.f8681d) {
            throw new IndexOutOfBoundsException(m6707f(i));
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
        if (this.f8681d != djf.f8681d) {
            return false;
        }
        int[] iArr = djf.f8680c;
        for (int i = 0; i < this.f8681d; i++) {
            if (this.f8680c[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        return Integer.valueOf(mo4522c(i));
    }

    /* renamed from: c */
    public final int mo4522c(int i) {
        m6706e(i);
        return this.f8680c[i];
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f8681d; i2++) {
            i = (i * 31) + this.f8680c[i2];
        }
        return i;
    }

    /* renamed from: f */
    private final String m6707f(int i) {
        int i2 = this.f8681d;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: b */
    public final dji mo4398a(int i) {
        if (i >= this.f8681d) {
            return new djf(Arrays.copyOf(this.f8680c, i), this.f8681d);
        }
        throw new IllegalArgumentException();
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo4380c();
        m6706e(i);
        int[] iArr = this.f8680c;
        int i2 = iArr[i];
        int i3 = this.f8681d;
        if (i < i3 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i3 - i) - 1);
        }
        this.f8681d--;
        this.modCount++;
        return Integer.valueOf(i2);
    }

    public final boolean remove(Object obj) {
        mo4380c();
        for (int i = 0; i < this.f8681d; i++) {
            if (obj.equals(Integer.valueOf(this.f8680c[i]))) {
                int[] iArr = this.f8680c;
                System.arraycopy(iArr, i + 1, iArr, i, (this.f8681d - i) - 1);
                this.f8681d--;
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
            int[] iArr = this.f8680c;
            System.arraycopy(iArr, i2, iArr, i, this.f8681d - i2);
            this.f8681d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        mo4380c();
        m6706e(i);
        int[] iArr = this.f8680c;
        int i2 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i2);
    }
}
