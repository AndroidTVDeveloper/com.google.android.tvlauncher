package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;

/* renamed from: dfq  reason: default package */
/* compiled from: PG */
public abstract class dfq extends dfl implements Set {
    public transient dfo a;

    /* renamed from: a */
    public abstract dfv iterator();

    public boolean e() {
        throw null;
    }

    private static int a(int i) {
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
        dgx.a(z, "collection too large");
        return 1073741824;
    }

    public static dfq a(int i, Object... objArr) {
        if (i == 0) {
            return dft.b;
        }
        if (i == 1) {
            return a(objArr[0]);
        }
        int a2 = a(i);
        Object[] objArr2 = new Object[a2];
        int i2 = a2 - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            Object a3 = dgx.a(objArr[i5], i5);
            int hashCode = a3.hashCode();
            int a4 = dgx.a(hashCode);
            while (true) {
                int i6 = a4 & i2;
                Object obj = objArr2[i6];
                if (obj != null) {
                    if (obj.equals(a3)) {
                        break;
                    }
                    a4++;
                } else {
                    objArr[i4] = a3;
                    objArr2[i6] = a3;
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
        if (a(i4) < a2 / 2) {
            return a(i4, objArr);
        }
        int length = objArr.length;
        if (i4 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i4);
        }
        return new dft(objArr, i3, objArr2, i2, i4);
    }

    public static dfq b(Object[] objArr) {
        int length = objArr.length;
        if (length == 0) {
            return dft.b;
        }
        if (length != 1) {
            return a(length, (Object[]) objArr.clone());
        }
        return a(objArr[0]);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof dfq) && e() && ((dfq) obj).e() && hashCode() != obj.hashCode()) {
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

    private static dfq a(Object obj) {
        return new dfu(obj);
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return new dfp(toArray());
    }
}
