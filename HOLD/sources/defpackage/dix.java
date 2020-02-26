package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: dix  reason: default package */
/* compiled from: PG */
final class dix extends dhw implements RandomAccess, djk, dks {
    private float[] b;
    private int c;

    static {
        new dix(new float[0], 0).b();
    }

    public final int size() {
        return this.c;
    }

    public dix() {
        this(new float[10], 0);
    }

    private dix(float[] fArr, int i) {
        this.b = fArr;
        this.c = i;
    }

    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        int i2;
        float floatValue = ((Float) obj).floatValue();
        c();
        if (i < 0 || i > (i2 = this.c)) {
            throw new IndexOutOfBoundsException(c(i));
        }
        float[] fArr = this.b;
        if (i2 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
        } else {
            float[] fArr2 = new float[(((i2 * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            System.arraycopy(this.b, i, fArr2, i + 1, this.c - i);
            this.b = fArr2;
        }
        this.b[i] = floatValue;
        this.c++;
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        a(((Float) obj).floatValue());
        return true;
    }

    public final boolean addAll(Collection collection) {
        c();
        djl.a(collection);
        if (!(collection instanceof dix)) {
            return super.addAll(collection);
        }
        dix dix = (dix) collection;
        int i = dix.c;
        if (i == 0) {
            return false;
        }
        int i2 = this.c;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            float[] fArr = this.b;
            if (i3 > fArr.length) {
                this.b = Arrays.copyOf(fArr, i3);
            }
            System.arraycopy(dix.b, 0, this.b, this.c, dix.c);
            this.c = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final void a(float f) {
        c();
        int i = this.c;
        float[] fArr = this.b;
        if (i == fArr.length) {
            float[] fArr2 = new float[(((i * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.b = fArr2;
        }
        float[] fArr3 = this.b;
        int i2 = this.c;
        this.c = i2 + 1;
        fArr3[i2] = f;
    }

    private final void b(int i) {
        if (i < 0 || i >= this.c) {
            throw new IndexOutOfBoundsException(c(i));
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
        if (this.c != dix.c) {
            return false;
        }
        float[] fArr = dix.b;
        for (int i = 0; i < this.c; i++) {
            if (Float.floatToIntBits(this.b[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        b(i);
        return Float.valueOf(this.b[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.c; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.b[i2]);
        }
        return i;
    }

    private final String c(int i) {
        int i2 = this.c;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    public final /* bridge */ /* synthetic */ djk a(int i) {
        if (i >= this.c) {
            return new dix(Arrays.copyOf(this.b, i), this.c);
        }
        throw new IllegalArgumentException();
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        c();
        b(i);
        float[] fArr = this.b;
        float f = fArr[i];
        int i2 = this.c;
        if (i < i2 - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.c--;
        this.modCount++;
        return Float.valueOf(f);
    }

    public final boolean remove(Object obj) {
        c();
        for (int i = 0; i < this.c; i++) {
            if (obj.equals(Float.valueOf(this.b[i]))) {
                float[] fArr = this.b;
                System.arraycopy(fArr, i + 1, fArr, i, (this.c - i) - 1);
                this.c--;
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
            float[] fArr = this.b;
            System.arraycopy(fArr, i2, fArr, i, this.c - i2);
            this.c -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        c();
        b(i);
        float[] fArr = this.b;
        float f = fArr[i];
        fArr[i] = floatValue;
        return Float.valueOf(f);
    }
}
