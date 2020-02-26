package p000;

import java.util.Arrays;
import java.util.RandomAccess;

/* renamed from: dku */
/* compiled from: PG */
public final class dku extends dhw implements RandomAccess {

    /* renamed from: b */
    public static final dku f8736b;

    /* renamed from: c */
    private Object[] f8737c;

    /* renamed from: d */
    private int f8738d;

    static {
        dku dku = new dku(new Object[0], 0);
        f8736b = dku;
        dku.mo4379b();
    }

    public final int size() {
        return this.f8738d;
    }

    public dku() {
        this(new Object[10], 0);
    }

    private dku(Object[] objArr, int i) {
        this.f8737c = objArr;
        this.f8738d = i;
    }

    public final void add(int i, Object obj) {
        int i2;
        mo4380c();
        if (i < 0 || i > (i2 = this.f8738d)) {
            throw new IndexOutOfBoundsException(m6878c(i));
        }
        Object[] objArr = this.f8737c;
        if (i2 < objArr.length) {
            System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
        } else {
            Object[] objArr2 = new Object[(((i2 * 3) / 2) + 1)];
            System.arraycopy(objArr, 0, objArr2, 0, i);
            System.arraycopy(this.f8737c, i, objArr2, i + 1, this.f8738d - i);
            this.f8737c = objArr2;
        }
        this.f8737c[i] = obj;
        this.f8738d++;
        this.modCount++;
    }

    public final boolean add(Object obj) {
        mo4380c();
        int i = this.f8738d;
        Object[] objArr = this.f8737c;
        if (i == objArr.length) {
            this.f8737c = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f8737c;
        int i2 = this.f8738d;
        this.f8738d = i2 + 1;
        objArr2[i2] = obj;
        this.modCount++;
        return true;
    }

    /* renamed from: b */
    private final void m6877b(int i) {
        if (i < 0 || i >= this.f8738d) {
            throw new IndexOutOfBoundsException(m6878c(i));
        }
    }

    public final Object get(int i) {
        m6877b(i);
        return this.f8737c[i];
    }

    /* renamed from: c */
    private final String m6878c(int i) {
        int i2 = this.f8738d;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ djk mo4398a(int i) {
        if (i >= this.f8738d) {
            return new dku(Arrays.copyOf(this.f8737c, i), this.f8738d);
        }
        throw new IllegalArgumentException();
    }

    public final Object remove(int i) {
        mo4380c();
        m6877b(i);
        Object[] objArr = this.f8737c;
        Object obj = objArr[i];
        int i2 = this.f8738d;
        if (i < i2 - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (i2 - i) - 1);
        }
        this.f8738d--;
        this.modCount++;
        return obj;
    }

    public final Object set(int i, Object obj) {
        mo4380c();
        m6877b(i);
        Object[] objArr = this.f8737c;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        this.modCount++;
        return obj2;
    }
}
