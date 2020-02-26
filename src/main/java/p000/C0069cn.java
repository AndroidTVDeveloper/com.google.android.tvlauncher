package p000;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;

/* renamed from: cn */
/* compiled from: PG */
public final class C0069cn implements Collection, Set {

    /* renamed from: c */
    private static final int[] f6092c = new int[0];

    /* renamed from: d */
    private static final Object[] f6093d = new Object[0];

    /* renamed from: e */
    private static Object[] f6094e;

    /* renamed from: f */
    private static int f6095f;

    /* renamed from: g */
    private static Object[] f6096g;

    /* renamed from: h */
    private static int f6097h;

    /* renamed from: i */
    private static final Object f6098i = new Object();

    /* renamed from: j */
    private static final Object f6099j = new Object();

    /* renamed from: a */
    public Object[] f6100a;

    /* renamed from: b */
    public int f6101b;

    /* renamed from: k */
    private int[] f6102k;

    /* renamed from: l */
    private C0081cy f6103l;

    public final boolean isEmpty() {
        return this.f6101b <= 0;
    }

    public final int size() {
        return this.f6101b;
    }

    public C0069cn() {
        this(0);
    }

    public C0069cn(int i) {
        if (i == 0) {
            this.f6102k = f6092c;
            this.f6100a = f6093d;
        } else {
            m5145b(i);
        }
        this.f6101b = 0;
    }

    public final boolean add(Object obj) {
        int i;
        int i2;
        int i3 = this.f6101b;
        if (obj == null) {
            i2 = m5141a();
            i = 0;
        } else {
            int hashCode = obj.hashCode();
            i = hashCode;
            i2 = m5142a(obj, hashCode);
        }
        if (i2 >= 0) {
            return false;
        }
        int i4 = i2 ^ -1;
        int[] iArr = this.f6102k;
        int length = iArr.length;
        if (i3 >= length) {
            int i5 = 4;
            if (i3 >= 8) {
                i5 = (i3 >> 1) + i3;
            } else if (i3 >= 4) {
                i5 = 8;
            }
            Object[] objArr = this.f6100a;
            m5145b(i5);
            if (i3 == this.f6101b) {
                int[] iArr2 = this.f6102k;
                if (iArr2.length > 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, length);
                    System.arraycopy(objArr, 0, this.f6100a, 0, objArr.length);
                }
                m5144a(iArr, objArr, i3);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i4 < i3) {
            int[] iArr3 = this.f6102k;
            int i6 = i4 + 1;
            int i7 = i3 - i4;
            System.arraycopy(iArr3, i4, iArr3, i6, i7);
            Object[] objArr2 = this.f6100a;
            System.arraycopy(objArr2, i4, objArr2, i6, i7);
        }
        int i8 = this.f6101b;
        if (i3 == i8) {
            int[] iArr4 = this.f6102k;
            if (i4 < iArr4.length) {
                iArr4[i4] = i;
                this.f6100a[i4] = obj;
                this.f6101b = i8 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final boolean addAll(Collection collection) {
        int size = this.f6101b + collection.size();
        int i = this.f6101b;
        int[] iArr = this.f6102k;
        if (iArr.length < size) {
            Object[] objArr = this.f6100a;
            m5145b(size);
            int i2 = this.f6101b;
            if (i2 > 0) {
                System.arraycopy(iArr, 0, this.f6102k, 0, i2);
                System.arraycopy(objArr, 0, this.f6100a, 0, this.f6101b);
            }
            m5144a(iArr, objArr, this.f6101b);
        }
        if (this.f6101b == i) {
            boolean z = false;
            for (Object add : collection) {
                z |= add(add);
            }
            if (z) {
                return true;
            }
            return false;
        }
        throw new ConcurrentModificationException();
    }

    /* renamed from: b */
    private final void m5145b(int i) {
        if (i == 8) {
            synchronized (f6099j) {
                if (f6096g != null) {
                    Object[] objArr = f6096g;
                    try {
                        this.f6100a = objArr;
                        f6096g = (Object[]) objArr[0];
                        int[] iArr = (int[]) objArr[1];
                        this.f6102k = iArr;
                        if (iArr != null) {
                            objArr[1] = null;
                            objArr[0] = null;
                            f6097h--;
                            return;
                        }
                    } catch (ClassCastException e) {
                    }
                    System.out.println("ArraySet Found corrupt ArraySet cache: [0]=" + objArr[0] + " [1]=" + objArr[1]);
                    f6096g = null;
                    f6097h = 0;
                }
            }
        } else if (i == 4) {
            synchronized (f6098i) {
                if (f6094e != null) {
                    Object[] objArr2 = f6094e;
                    try {
                        this.f6100a = objArr2;
                        f6094e = (Object[]) objArr2[0];
                        int[] iArr2 = (int[]) objArr2[1];
                        this.f6102k = iArr2;
                        if (iArr2 != null) {
                            objArr2[1] = null;
                            objArr2[0] = null;
                            f6095f--;
                            return;
                        }
                    } catch (ClassCastException e2) {
                    }
                    System.out.println("ArraySet Found corrupt ArraySet cache: [0]=" + objArr2[0] + " [1]=" + objArr2[1]);
                    f6094e = null;
                    f6095f = 0;
                }
            }
        }
        this.f6102k = new int[i];
        this.f6100a = new Object[i];
    }

    /* renamed from: a */
    private final int m5143a(int[] iArr, int i) {
        try {
            return C0073cq.m5505a(iArr, this.f6101b, i);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new ConcurrentModificationException();
        }
    }

    public final void clear() {
        int i = this.f6101b;
        if (i != 0) {
            int[] iArr = this.f6102k;
            Object[] objArr = this.f6100a;
            this.f6102k = f6092c;
            this.f6100a = f6093d;
            this.f6101b = 0;
            m5144a(iArr, objArr, i);
        }
        if (this.f6101b != 0) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean contains(Object obj) {
        return mo3127a(obj) >= 0;
    }

    public final boolean containsAll(Collection collection) {
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (this.f6101b == set.size()) {
                int i = 0;
                while (i < this.f6101b) {
                    try {
                        if (!set.contains(m5146c(i))) {
                            return false;
                        }
                        i++;
                    } catch (NullPointerException e) {
                    } catch (ClassCastException e2) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private static void m5144a(int[] iArr, Object[] objArr, int i) {
        int length = iArr.length;
        if (length == 8) {
            synchronized (f6099j) {
                if (f6097h < 10) {
                    objArr[0] = f6096g;
                    objArr[1] = iArr;
                    for (int i2 = i - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f6096g = objArr;
                    f6097h++;
                }
            }
        } else if (length == 4) {
            synchronized (f6098i) {
                if (f6095f < 10) {
                    objArr[0] = f6094e;
                    objArr[1] = iArr;
                    for (int i3 = i - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f6094e = objArr;
                    f6095f++;
                }
            }
        }
    }

    public final int hashCode() {
        int[] iArr = this.f6102k;
        int i = this.f6101b;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    /* renamed from: a */
    public final int mo3127a(Object obj) {
        return obj != null ? m5142a(obj, obj.hashCode()) : m5141a();
    }

    /* renamed from: a */
    private final int m5142a(Object obj, int i) {
        int i2 = this.f6101b;
        if (i2 == 0) {
            return -1;
        }
        int a = m5143a(this.f6102k, i);
        if (a < 0 || obj.equals(this.f6100a[a])) {
            return a;
        }
        int i3 = a + 1;
        while (i3 < i2 && this.f6102k[i3] == i) {
            if (obj.equals(this.f6100a[i3])) {
                return i3;
            }
            i3++;
        }
        int i4 = a - 1;
        while (i4 >= 0 && this.f6102k[i4] == i) {
            if (obj.equals(this.f6100a[i4])) {
                return i4;
            }
            i4--;
        }
        return i3 ^ -1;
    }

    /* renamed from: a */
    private final int m5141a() {
        int i = this.f6101b;
        if (i == 0) {
            return -1;
        }
        int a = m5143a(this.f6102k, 0);
        if (a < 0 || this.f6100a[a] == null) {
            return a;
        }
        int i2 = a + 1;
        while (i2 < i && this.f6102k[i2] == 0) {
            if (this.f6100a[i2] == null) {
                return i2;
            }
            i2++;
        }
        int i3 = a - 1;
        while (i3 >= 0 && this.f6102k[i3] == 0) {
            if (this.f6100a[i3] == null) {
                return i3;
            }
            i3--;
        }
        return i2 ^ -1;
    }

    public final Iterator iterator() {
        if (this.f6103l == null) {
            this.f6103l = new C0068cm(this);
        }
        return this.f6103l.mo3954d().iterator();
    }

    public final boolean remove(Object obj) {
        int a = mo3127a(obj);
        if (a < 0) {
            return false;
        }
        mo3128a(a);
        return true;
    }

    public final boolean removeAll(Collection collection) {
        boolean z = false;
        for (Object remove : collection) {
            z |= remove(remove);
        }
        if (z) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo3128a(int i) {
        int i2 = this.f6101b;
        Object[] objArr = this.f6100a;
        if (i2 > 1) {
            int i3 = i2 - 1;
            int[] iArr = this.f6102k;
            int length = iArr.length;
            int i4 = 8;
            if (length <= 8 || i2 >= length / 3) {
                if (i < i3) {
                    int i5 = i + 1;
                    int i6 = i3 - i;
                    System.arraycopy(iArr, i5, iArr, i, i6);
                    Object[] objArr2 = this.f6100a;
                    System.arraycopy(objArr2, i5, objArr2, i, i6);
                }
                this.f6100a[i3] = null;
            } else {
                if (i2 > 8) {
                    i4 = i2 + (i2 >> 1);
                }
                m5145b(i4);
                if (i > 0) {
                    System.arraycopy(iArr, 0, this.f6102k, 0, i);
                    System.arraycopy(objArr, 0, this.f6100a, 0, i);
                }
                if (i < i3) {
                    int i7 = i + 1;
                    int i8 = i3 - i;
                    System.arraycopy(iArr, i7, this.f6102k, i, i8);
                    System.arraycopy(objArr, i7, this.f6100a, i, i8);
                }
            }
            if (i2 == this.f6101b) {
                this.f6101b = i3;
                return;
            }
            throw new ConcurrentModificationException();
        }
        clear();
    }

    public final boolean retainAll(Collection collection) {
        boolean z = false;
        for (int i = this.f6101b - 1; i >= 0; i--) {
            if (!collection.contains(this.f6100a[i])) {
                mo3128a(i);
                z = true;
            }
        }
        return z;
    }

    public final Object[] toArray() {
        int i = this.f6101b;
        Object[] objArr = new Object[i];
        System.arraycopy(this.f6100a, 0, objArr, 0, i);
        return objArr;
    }

    public final Object[] toArray(Object[] objArr) {
        if (objArr.length < this.f6101b) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), this.f6101b);
        }
        System.arraycopy(this.f6100a, 0, objArr, 0, this.f6101b);
        int length = objArr.length;
        int i = this.f6101b;
        if (length > i) {
            objArr[i] = null;
        }
        return objArr;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f6101b * 14);
        sb.append('{');
        for (int i = 0; i < this.f6101b; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object c = m5146c(i);
            if (c == this) {
                sb.append("(this Set)");
            } else {
                sb.append(c);
            }
        }
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: c */
    private final Object m5146c(int i) {
        return this.f6100a[i];
    }
}
