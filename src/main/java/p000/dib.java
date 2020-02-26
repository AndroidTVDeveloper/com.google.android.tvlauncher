package p000;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: dib */
/* compiled from: PG */
final class dib extends dhw implements RandomAccess, djk, dks {

    /* renamed from: b */
    private boolean[] f8572b;

    /* renamed from: c */
    private int f8573c;

    static {
        new dib(new boolean[0], 0).mo4379b();
    }

    public final int size() {
        return this.f8573c;
    }

    public dib() {
        this(new boolean[10], 0);
    }

    private dib(boolean[] zArr, int i) {
        this.f8572b = zArr;
        this.f8573c = i;
    }

    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        int i2;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        mo4380c();
        if (i < 0 || i > (i2 = this.f8573c)) {
            throw new IndexOutOfBoundsException(m6492c(i));
        }
        boolean[] zArr = this.f8572b;
        if (i2 < zArr.length) {
            System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[(((i2 * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            System.arraycopy(this.f8572b, i, zArr2, i + 1, this.f8573c - i);
            this.f8572b = zArr2;
        }
        this.f8572b[i] = booleanValue;
        this.f8573c++;
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo4399a(((Boolean) obj).booleanValue());
        return true;
    }

    public final boolean addAll(Collection collection) {
        mo4380c();
        djl.m6727a(collection);
        if (!(collection instanceof dib)) {
            return super.addAll(collection);
        }
        dib dib = (dib) collection;
        int i = dib.f8573c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f8573c;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            boolean[] zArr = this.f8572b;
            if (i3 > zArr.length) {
                this.f8572b = Arrays.copyOf(zArr, i3);
            }
            System.arraycopy(dib.f8572b, 0, this.f8572b, this.f8573c, dib.f8573c);
            this.f8573c = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: a */
    public final void mo4399a(boolean z) {
        mo4380c();
        int i = this.f8573c;
        boolean[] zArr = this.f8572b;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[(((i * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            this.f8572b = zArr2;
        }
        boolean[] zArr3 = this.f8572b;
        int i2 = this.f8573c;
        this.f8573c = i2 + 1;
        zArr3[i2] = z;
    }

    /* renamed from: b */
    private final void m6491b(int i) {
        if (i < 0 || i >= this.f8573c) {
            throw new IndexOutOfBoundsException(m6492c(i));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dib)) {
            return super.equals(obj);
        }
        dib dib = (dib) obj;
        if (this.f8573c != dib.f8573c) {
            return false;
        }
        boolean[] zArr = dib.f8572b;
        for (int i = 0; i < this.f8573c; i++) {
            if (this.f8572b[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        m6491b(i);
        return Boolean.valueOf(this.f8572b[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f8573c; i2++) {
            i = (i * 31) + djl.m6723a(this.f8572b[i2]);
        }
        return i;
    }

    /* renamed from: c */
    private final String m6492c(int i) {
        int i2 = this.f8573c;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ djk mo4398a(int i) {
        if (i >= this.f8573c) {
            return new dib(Arrays.copyOf(this.f8572b, i), this.f8573c);
        }
        throw new IllegalArgumentException();
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo4380c();
        m6491b(i);
        boolean[] zArr = this.f8572b;
        boolean z = zArr[i];
        int i2 = this.f8573c;
        if (i < i2 - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (i2 - i) - 1);
        }
        this.f8573c--;
        this.modCount++;
        return Boolean.valueOf(z);
    }

    public final boolean remove(Object obj) {
        mo4380c();
        for (int i = 0; i < this.f8573c; i++) {
            if (obj.equals(Boolean.valueOf(this.f8572b[i]))) {
                boolean[] zArr = this.f8572b;
                System.arraycopy(zArr, i + 1, zArr, i, (this.f8573c - i) - 1);
                this.f8573c--;
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
            boolean[] zArr = this.f8572b;
            System.arraycopy(zArr, i2, zArr, i, this.f8573c - i2);
            this.f8573c -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        mo4380c();
        m6491b(i);
        boolean[] zArr = this.f8572b;
        boolean z = zArr[i];
        zArr[i] = booleanValue;
        return Boolean.valueOf(z);
    }
}
