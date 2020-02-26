package p000;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;

/* renamed from: dfq */
/* compiled from: PG */
public abstract class dfq extends dfl implements Set {

    /* renamed from: a */
    public transient dfo f8460a;

    /* renamed from: a */
    public abstract dfv iterator();

    /* renamed from: e */
    public boolean mo4268e() {
        throw null;
    }

    /* renamed from: a */
    private static int m6323a(int i) {
        boolean z;
        double d;
        int max = Math.max(i, 2);
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1);
            do {
                highestOneBit += highestOneBit;
                d = (double) highestOneBit;
                Double.isNaN(d);
            } while (d * 0.7d < ((double) max));
            return highestOneBit;
        }
        if (max < 1073741824) {
            z = true;
        } else {
            z = false;
        }
        dgx.m6408a(z, "collection too large");
        return 1073741824;
    }

    /* renamed from: a */
    public static dfq m6324a(int i, Object... objArr) {
        if (i == 0) {
            return dft.f8466b;
        }
        if (i == 1) {
            return m6325a(objArr[0]);
        }
        int a = m6323a(i);
        Object[] objArr2 = new Object[a];
        int i2 = a - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            Object a2 = dgx.m6402a(objArr[i5], i5);
            int hashCode = a2.hashCode();
            int a3 = dgx.m6398a(hashCode);
            while (true) {
                int i6 = a3 & i2;
                Object obj = objArr2[i6];
                if (obj != null) {
                    if (obj.equals(a2)) {
                        break;
                    }
                    a3++;
                } else {
                    objArr[i4] = a2;
                    objArr2[i6] = a2;
                    i3 += hashCode;
                    i4++;
                    break;
                }
            }
        }
        Arrays.fill(objArr, i4, i, (Object) null);
        if (i4 == 1) {
            return new dfu(objArr[0], i3);
        }
        if (m6323a(i4) < a / 2) {
            return m6324a(i4, objArr);
        }
        int length = objArr.length;
        if (i4 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i4);
        }
        return new dft(objArr, i3, objArr2, i2, i4);
    }

    /* renamed from: b */
    public static dfq m6326b(Object[] objArr) {
        int length = objArr.length;
        if (length == 0) {
            return dft.f8466b;
        }
        if (length != 1) {
            return m6324a(length, (Object[]) objArr.clone());
        }
        return m6325a(objArr[0]);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof dfq) && mo4268e() && ((dfq) obj).mo4268e() && hashCode() != obj.hashCode()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        try {
            return size() == set.size() && containsAll(set);
        } catch (ClassCastException | NullPointerException e) {
            return false;
        }
    }

    public int hashCode() {
        Iterator it = iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i += next != null ? next.hashCode() : 0;
        }
        return i;
    }

    /* renamed from: a */
    private static dfq m6325a(Object obj) {
        return new dfu(obj);
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return new dfp(toArray());
    }
}
