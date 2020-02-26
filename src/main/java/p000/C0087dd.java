package p000;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* renamed from: dd */
/* compiled from: PG */
public class C0087dd {

    /* renamed from: d */
    private static Object[] f8318d;

    /* renamed from: e */
    private static int f8319e;

    /* renamed from: f */
    private static Object[] f8320f;

    /* renamed from: g */
    private static int f8321g;

    /* renamed from: a */
    public int[] f8322a;

    /* renamed from: b */
    public Object[] f8323b;

    /* renamed from: c */
    public int f8324c;

    public C0087dd() {
        this.f8322a = C0073cq.f6955a;
        this.f8323b = C0073cq.f6956b;
        this.f8324c = 0;
    }

    public final boolean isEmpty() {
        return this.f8324c <= 0;
    }

    public final int size() {
        return this.f8324c;
    }

    public C0087dd(int i) {
        if (i == 0) {
            this.f8322a = C0073cq.f6955a;
            this.f8323b = C0073cq.f6956b;
        } else {
            m6201e(i);
        }
        this.f8324c = 0;
    }

    /* renamed from: e */
    private final void m6201e(int i) {
        Class<C0087dd> cls = C0087dd.class;
        if (i == 8) {
            synchronized (cls) {
                if (f8320f != null) {
                    Object[] objArr = f8320f;
                    this.f8323b = objArr;
                    f8320f = (Object[]) objArr[0];
                    this.f8322a = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f8321g--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (cls) {
                if (f8318d != null) {
                    Object[] objArr2 = f8318d;
                    this.f8323b = objArr2;
                    f8318d = (Object[]) objArr2[0];
                    this.f8322a = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f8319e--;
                    return;
                }
            }
        }
        this.f8322a = new int[i];
        this.f8323b = new Object[(i + i)];
    }

    /* renamed from: a */
    private static int m6199a(int[] iArr, int i, int i2) {
        try {
            return C0073cq.m5505a(iArr, i, i2);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new ConcurrentModificationException();
        }
    }

    public void clear() {
        int i = this.f8324c;
        if (i > 0) {
            int[] iArr = this.f8322a;
            Object[] objArr = this.f8323b;
            this.f8322a = C0073cq.f6955a;
            this.f8323b = C0073cq.f6956b;
            this.f8324c = 0;
            m6200a(iArr, objArr, i);
        }
        if (this.f8324c > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean containsKey(Object obj) {
        return mo4135a(obj) >= 0;
    }

    public final boolean containsValue(Object obj) {
        return mo4137b(obj) >= 0;
    }

    /* renamed from: a */
    public final void mo4136a(int i) {
        int i2 = this.f8324c;
        int[] iArr = this.f8322a;
        if (iArr.length < i) {
            Object[] objArr = this.f8323b;
            m6201e(i);
            if (this.f8324c > 0) {
                System.arraycopy(iArr, 0, this.f8322a, 0, i2);
                System.arraycopy(objArr, 0, this.f8323b, 0, i2 + i2);
            }
            m6200a(iArr, objArr, i2);
        }
        if (this.f8324c != i2) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0087dd) {
            C0087dd ddVar = (C0087dd) obj;
            if (this.f8324c != ddVar.f8324c) {
                return false;
            }
            int i = 0;
            while (i < this.f8324c) {
                try {
                    Object b = mo4138b(i);
                    Object c = mo4139c(i);
                    Object obj2 = ddVar.get(b);
                    if (c != null) {
                        if (!c.equals(obj2)) {
                            return false;
                        }
                    } else if (obj2 != null || !ddVar.containsKey(b)) {
                        return false;
                    }
                    i++;
                } catch (NullPointerException e) {
                    return false;
                } catch (ClassCastException e2) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this.f8324c == map.size()) {
                int i2 = 0;
                while (i2 < this.f8324c) {
                    try {
                        Object b2 = mo4138b(i2);
                        Object c2 = mo4139c(i2);
                        Object obj3 = map.get(b2);
                        if (c2 != null) {
                            if (!c2.equals(obj3)) {
                                return false;
                            }
                        } else if (obj3 != null || !map.containsKey(b2)) {
                            return false;
                        }
                        i2++;
                    } catch (NullPointerException e3) {
                    } catch (ClassCastException e4) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private static void m6200a(int[] iArr, Object[] objArr, int i) {
        Class<C0087dd> cls = C0087dd.class;
        int length = iArr.length;
        if (length == 8) {
            synchronized (cls) {
                if (f8321g < 10) {
                    objArr[0] = f8320f;
                    objArr[1] = iArr;
                    for (int i2 = (i + i) - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f8320f = objArr;
                    f8321g++;
                }
            }
        } else if (length == 4) {
            synchronized (cls) {
                if (f8319e < 10) {
                    objArr[0] = f8318d;
                    objArr[1] = iArr;
                    for (int i3 = (i + i) - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f8318d = objArr;
                    f8319e++;
                }
            }
        }
    }

    public final Object get(Object obj) {
        return getOrDefault(obj, null);
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int a = mo4135a(obj);
        return a >= 0 ? this.f8323b[a + a + 1] : obj2;
    }

    public int hashCode() {
        int[] iArr = this.f8322a;
        Object[] objArr = this.f8323b;
        int i = this.f8324c;
        int i2 = 0;
        int i3 = 0;
        int i4 = 1;
        while (i2 < i) {
            Object obj = objArr[i4];
            i3 += (obj != null ? obj.hashCode() : 0) ^ iArr[i2];
            i2++;
            i4 += 2;
        }
        return i3;
    }

    /* renamed from: a */
    private final int m6198a(Object obj, int i) {
        int i2 = this.f8324c;
        if (i2 == 0) {
            return -1;
        }
        int a = m6199a(this.f8322a, i2, i);
        if (a < 0 || obj.equals(this.f8323b[a + a])) {
            return a;
        }
        int i3 = a + 1;
        while (i3 < i2 && this.f8322a[i3] == i) {
            if (obj.equals(this.f8323b[i3 + i3])) {
                return i3;
            }
            i3++;
        }
        int i4 = a - 1;
        while (i4 >= 0 && this.f8322a[i4] == i) {
            if (obj.equals(this.f8323b[i4 + i4])) {
                return i4;
            }
            i4--;
        }
        return i3 ^ -1;
    }

    /* renamed from: a */
    public final int mo4135a(Object obj) {
        return obj != null ? m6198a(obj, obj.hashCode()) : m6197a();
    }

    /* renamed from: a */
    private final int m6197a() {
        int i = this.f8324c;
        if (i == 0) {
            return -1;
        }
        int a = m6199a(this.f8322a, i, 0);
        if (a < 0 || this.f8323b[a + a] == null) {
            return a;
        }
        int i2 = a + 1;
        while (i2 < i && this.f8322a[i2] == 0) {
            if (this.f8323b[i2 + i2] == null) {
                return i2;
            }
            i2++;
        }
        int i3 = a - 1;
        while (i3 >= 0 && this.f8322a[i3] == 0) {
            if (this.f8323b[i3 + i3] == null) {
                return i3;
            }
            i3--;
        }
        return i2 ^ -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int mo4137b(Object obj) {
        int i = this.f8324c;
        int i2 = i + i;
        Object[] objArr = this.f8323b;
        if (obj == null) {
            for (int i3 = 1; i3 < i2; i3 += 2) {
                if (objArr[i3] == null) {
                    return i3 >> 1;
                }
            }
            return -1;
        }
        for (int i4 = 1; i4 < i2; i4 += 2) {
            if (obj.equals(objArr[i4])) {
                return i4 >> 1;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public final Object mo4138b(int i) {
        return this.f8323b[i + i];
    }

    public Object put(Object obj, Object obj2) {
        int i;
        int i2;
        int i3 = this.f8324c;
        if (obj == null) {
            i2 = m6197a();
            i = 0;
        } else {
            int hashCode = obj.hashCode();
            i = hashCode;
            i2 = m6198a(obj, hashCode);
        }
        if (i2 >= 0) {
            int i4 = i2 + i2 + 1;
            Object[] objArr = this.f8323b;
            Object obj3 = objArr[i4];
            objArr[i4] = obj2;
            return obj3;
        }
        int i5 = i2 ^ -1;
        int[] iArr = this.f8322a;
        int length = iArr.length;
        if (i3 >= length) {
            int i6 = 4;
            if (i3 >= 8) {
                i6 = (i3 >> 1) + i3;
            } else if (i3 >= 4) {
                i6 = 8;
            }
            Object[] objArr2 = this.f8323b;
            m6201e(i6);
            if (i3 == this.f8324c) {
                int[] iArr2 = this.f8322a;
                if (iArr2.length > 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, length);
                    System.arraycopy(objArr2, 0, this.f8323b, 0, objArr2.length);
                }
                m6200a(iArr, objArr2, i3);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i5 < i3) {
            int[] iArr3 = this.f8322a;
            int i7 = i5 + 1;
            System.arraycopy(iArr3, i5, iArr3, i7, i3 - i5);
            Object[] objArr3 = this.f8323b;
            int i8 = this.f8324c - i5;
            System.arraycopy(objArr3, i5 + i5, objArr3, i7 + i7, i8 + i8);
        }
        int i9 = this.f8324c;
        if (i3 == i9) {
            int[] iArr4 = this.f8322a;
            if (i5 < iArr4.length) {
                iArr4[i5] = i;
                Object[] objArr4 = this.f8323b;
                int i10 = i5 + i5;
                objArr4[i10] = obj;
                objArr4[i10 + 1] = obj2;
                this.f8324c = i9 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    public final Object remove(Object obj) {
        int a = mo4135a(obj);
        if (a < 0) {
            return null;
        }
        return mo273d(a);
    }

    public final boolean remove(Object obj, Object obj2) {
        int a = mo4135a(obj);
        if (a < 0) {
            return false;
        }
        Object c = mo4139c(a);
        if (obj2 != c && (obj2 == null || !obj2.equals(c))) {
            return false;
        }
        mo273d(a);
        return true;
    }

    /* renamed from: d */
    public Object mo273d(int i) {
        Object[] objArr = this.f8323b;
        int i2 = i + i;
        Object obj = objArr[i2 + 1];
        int i3 = this.f8324c;
        int i4 = 0;
        if (i3 <= 1) {
            m6200a(this.f8322a, objArr, i3);
            this.f8322a = C0073cq.f6955a;
            this.f8323b = C0073cq.f6956b;
        } else {
            int i5 = i3 - 1;
            int[] iArr = this.f8322a;
            int length = iArr.length;
            int i6 = 8;
            if (length <= 8 || i3 >= length / 3) {
                if (i < i5) {
                    int i7 = i + 1;
                    int i8 = i5 - i;
                    System.arraycopy(iArr, i7, iArr, i, i8);
                    Object[] objArr2 = this.f8323b;
                    System.arraycopy(objArr2, i7 + i7, objArr2, i2, i8 + i8);
                }
                Object[] objArr3 = this.f8323b;
                int i9 = i5 + i5;
                objArr3[i9] = null;
                objArr3[i9 + 1] = null;
            } else {
                if (i3 > 8) {
                    i6 = i3 + (i3 >> 1);
                }
                m6201e(i6);
                if (i3 == this.f8324c) {
                    if (i > 0) {
                        System.arraycopy(iArr, 0, this.f8322a, 0, i);
                        System.arraycopy(objArr, 0, this.f8323b, 0, i2);
                    }
                    if (i < i5) {
                        int i10 = i + 1;
                        int i11 = i5 - i;
                        System.arraycopy(iArr, i10, this.f8322a, i, i11);
                        System.arraycopy(objArr, i10 + i10, this.f8323b, i2, i11 + i11);
                    }
                } else {
                    throw new ConcurrentModificationException();
                }
            }
            i4 = i5;
        }
        if (i3 == this.f8324c) {
            this.f8324c = i4;
            return obj;
        }
        throw new ConcurrentModificationException();
    }

    public final Object replace(Object obj, Object obj2) {
        int a = mo4135a(obj);
        if (a < 0) {
            return null;
        }
        return mo271a(a, obj2);
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int a = mo4135a(obj);
        if (a < 0) {
            return false;
        }
        Object c = mo4139c(a);
        if (c != obj2 && (obj2 == null || !obj2.equals(c))) {
            return false;
        }
        mo271a(a, obj3);
        return true;
    }

    /* renamed from: a */
    public Object mo271a(int i, Object obj) {
        int i2 = i + i + 1;
        Object[] objArr = this.f8323b;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f8324c * 28);
        sb.append('{');
        for (int i = 0; i < this.f8324c; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object b = mo4138b(i);
            if (b != this) {
                sb.append(b);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object c = mo4139c(i);
            if (c == this) {
                sb.append("(this Map)");
            } else {
                sb.append(c);
            }
        }
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: c */
    public final Object mo4139c(int i) {
        return this.f8323b[i + i + 1];
    }
}
