package p000;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: dix */
/* compiled from: PG */
final class dix extends dhw implements RandomAccess, djk, dks {

    /* renamed from: b */
    private float[] f8664b;

    /* renamed from: c */
    private int f8665c;

    static {
        new dix(new float[0], 0).mo4379b();
    }

    public final int size() {
        return this.f8665c;
    }

    public dix() {
        this(new float[10], 0);
    }

    private dix(float[] fArr, int i) {
        this.f8664b = fArr;
        this.f8665c = i;
    }

    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        int i2;
        float floatValue = ((Float) obj).floatValue();
        mo4380c();
        if (i < 0 || i > (i2 = this.f8665c)) {
            throw new IndexOutOfBoundsException(m6644c(i));
        }
        float[] fArr = this.f8664b;
        if (i2 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
        } else {
            float[] fArr2 = new float[(((i2 * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            System.arraycopy(this.f8664b, i, fArr2, i + 1, this.f8665c - i);
            this.f8664b = fArr2;
        }
        this.f8664b[i] = floatValue;
        this.f8665c++;
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo4486a(((Float) obj).floatValue());
        return true;
    }

    public final boolean addAll(Collection collection) {
        mo4380c();
        djl.m6727a(collection);
        if (!(collection instanceof dix)) {
            return super.addAll(collection);
        }
        dix dix = (dix) collection;
        int i = dix.f8665c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f8665c;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            float[] fArr = this.f8664b;
            if (i3 > fArr.length) {
                this.f8664b = Arrays.copyOf(fArr, i3);
            }
            System.arraycopy(dix.f8664b, 0, this.f8664b, this.f8665c, dix.f8665c);
            this.f8665c = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: a */
    public final void mo4486a(float f) {
        mo4380c();
        int i = this.f8665c;
        float[] fArr = this.f8664b;
        if (i == fArr.length) {
            float[] fArr2 = new float[(((i * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.f8664b = fArr2;
        }
        float[] fArr3 = this.f8664b;
        int i2 = this.f8665c;
        this.f8665c = i2 + 1;
        fArr3[i2] = f;
    }

    /* renamed from: b */
    private final void m6643b(int i) {
        if (i < 0 || i >= this.f8665c) {
            throw new IndexOutOfBoundsException(m6644c(i));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dix)) {
            return super.equals(obj);
        }
        dix dix = (dix) obj;
        if (this.f8665c != dix.f8665c) {
            return false;
        }
        float[] fArr = dix.f8664b;
        for (int i = 0; i < this.f8665c; i++) {
            if (Float.floatToIntBits(this.f8664b[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        m6643b(i);
        return Float.valueOf(this.f8664b[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f8665c; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.f8664b[i2]);
        }
        return i;
    }

    /* renamed from: c */
    private final String m6644c(int i) {
        int i2 = this.f8665c;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ djk mo4398a(int i) {
        if (i >= this.f8665c) {
            return new dix(Arrays.copyOf(this.f8664b, i), this.f8665c);
        }
        throw new IllegalArgumentException();
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo4380c();
        m6643b(i);
        float[] fArr = this.f8664b;
        float f = fArr[i];
        int i2 = this.f8665c;
        if (i < i2 - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.f8665c--;
        this.modCount++;
        return Float.valueOf(f);
    }

    public final boolean remove(Object obj) {
        mo4380c();
        for (int i = 0; i < this.f8665c; i++) {
            if (obj.equals(Float.valueOf(this.f8664b[i]))) {
                float[] fArr = this.f8664b;
                System.arraycopy(fArr, i + 1, fArr, i, (this.f8665c - i) - 1);
                this.f8665c--;
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
            float[] fArr = this.f8664b;
            System.arraycopy(fArr, i2, fArr, i, this.f8665c - i2);
            this.f8665c -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        mo4380c();
        m6643b(i);
        float[] fArr = this.f8664b;
        float f = fArr[i];
        fArr[i] = floatValue;
        return Float.valueOf(f);
    }
}
