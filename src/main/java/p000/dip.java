package p000;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: dip */
/* compiled from: PG */
final class dip extends dhw implements RandomAccess, djk, dks {

    /* renamed from: b */
    private double[] f8595b;

    /* renamed from: c */
    private int f8596c;

    static {
        new dip(new double[0], 0).mo4379b();
    }

    public final int size() {
        return this.f8596c;
    }

    public dip() {
        this(new double[10], 0);
    }

    private dip(double[] dArr, int i) {
        this.f8595b = dArr;
        this.f8596c = i;
    }

    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        int i2;
        double doubleValue = ((Double) obj).doubleValue();
        mo4380c();
        if (i < 0 || i > (i2 = this.f8596c)) {
            throw new IndexOutOfBoundsException(m6613c(i));
        }
        double[] dArr = this.f8595b;
        if (i2 < dArr.length) {
            System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
        } else {
            double[] dArr2 = new double[(((i2 * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            System.arraycopy(this.f8595b, i, dArr2, i + 1, this.f8596c - i);
            this.f8595b = dArr2;
        }
        this.f8595b[i] = doubleValue;
        this.f8596c++;
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo4462a(((Double) obj).doubleValue());
        return true;
    }

    public final boolean addAll(Collection collection) {
        mo4380c();
        djl.m6727a(collection);
        if (!(collection instanceof dip)) {
            return super.addAll(collection);
        }
        dip dip = (dip) collection;
        int i = dip.f8596c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f8596c;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            double[] dArr = this.f8595b;
            if (i3 > dArr.length) {
                this.f8595b = Arrays.copyOf(dArr, i3);
            }
            System.arraycopy(dip.f8595b, 0, this.f8595b, this.f8596c, dip.f8596c);
            this.f8596c = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: a */
    public final void mo4462a(double d) {
        mo4380c();
        int i = this.f8596c;
        double[] dArr = this.f8595b;
        if (i == dArr.length) {
            double[] dArr2 = new double[(((i * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.f8595b = dArr2;
        }
        double[] dArr3 = this.f8595b;
        int i2 = this.f8596c;
        this.f8596c = i2 + 1;
        dArr3[i2] = d;
    }

    /* renamed from: b */
    private final void m6612b(int i) {
        if (i < 0 || i >= this.f8596c) {
            throw new IndexOutOfBoundsException(m6613c(i));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dip)) {
            return super.equals(obj);
        }
        dip dip = (dip) obj;
        if (this.f8596c != dip.f8596c) {
            return false;
        }
        double[] dArr = dip.f8595b;
        for (int i = 0; i < this.f8596c; i++) {
            if (Double.doubleToLongBits(this.f8595b[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        m6612b(i);
        return Double.valueOf(this.f8595b[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f8596c; i2++) {
            i = (i * 31) + djl.m6722a(Double.doubleToLongBits(this.f8595b[i2]));
        }
        return i;
    }

    /* renamed from: c */
    private final String m6613c(int i) {
        int i2 = this.f8596c;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ djk mo4398a(int i) {
        if (i >= this.f8596c) {
            return new dip(Arrays.copyOf(this.f8595b, i), this.f8596c);
        }
        throw new IllegalArgumentException();
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo4380c();
        m6612b(i);
        double[] dArr = this.f8595b;
        double d = dArr[i];
        int i2 = this.f8596c;
        if (i < i2 - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (i2 - i) - 1);
        }
        this.f8596c--;
        this.modCount++;
        return Double.valueOf(d);
    }

    public final boolean remove(Object obj) {
        mo4380c();
        for (int i = 0; i < this.f8596c; i++) {
            if (obj.equals(Double.valueOf(this.f8595b[i]))) {
                double[] dArr = this.f8595b;
                System.arraycopy(dArr, i + 1, dArr, i, (this.f8596c - i) - 1);
                this.f8596c--;
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
            double[] dArr = this.f8595b;
            System.arraycopy(dArr, i2, dArr, i, this.f8596c - i2);
            this.f8596c -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        mo4380c();
        m6612b(i);
        double[] dArr = this.f8595b;
        double d = dArr[i];
        dArr[i] = doubleValue;
        return Double.valueOf(d);
    }
}
