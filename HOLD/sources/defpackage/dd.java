package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* renamed from: dd  reason: default package */
/* compiled from: PG */
public class dd {
    private static Object[] d;
    private static int e;
    private static Object[] f;
    private static int g;
    public int[] a;
    public Object[] b;
    public int c;

    public dd() {
        this.a = cq.a;
        this.b = cq.b;
        this.c = 0;
    }

    public final boolean isEmpty() {
        return this.c <= 0;
    }

    public final int size() {
        return this.c;
    }

    public dd(int i) {
        if (i == 0) {
            this.a = cq.a;
            this.b = cq.b;
        } else {
            e(i);
        }
        this.c = 0;
    }

    private final void e(int i) {
        Class<dd> cls = dd.class;
        if (i == 8) {
            synchronized (cls) {
                if (f != null) {
                    Object[] objArr = f;
                    this.b = objArr;
                    f = (Object[]) objArr[0];
                    this.a = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    g--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (cls) {
                if (d != null) {
                    Object[] objArr2 = d;
                    this.b = objArr2;
                    d = (Object[]) objArr2[0];
                    this.a = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    e--;
                    return;
                }
            }
        }
        this.a = new int[i];
        this.b = new Object[(i + i)];
    }

    private static int a(int[] iArr, int i, int i2) {
        try {
            return cq.a(iArr, i, i2);
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw new ConcurrentModificationException();
        }
    }

    public void clear() {
        int i = this.c;
        if (i > 0) {
            int[] iArr = this.a;
            Object[] objArr = this.b;
            this.a = cq.a;
            this.b = cq.b;
            this.c = 0;
            a(iArr, objArr, i);
        }
        if (this.c > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean containsKey(Object obj) {
        return a(obj) >= 0;
    }

    public final boolean containsValue(Object obj) {
        return b(obj) >= 0;
    }

    public final void a(int i) {
        int i2 = this.c;
        int[] iArr = this.a;
        if (iArr.length < i) {
            Object[] objArr = this.b;
            e(i);
            if (this.c > 0) {
                System.arraycopy(iArr, 0, this.a, 0, i2);
                System.arraycopy(objArr, 0, this.b, 0, i2 + i2);
            }
            a(iArr, objArr, i2);
        }
        if (this.c != i2) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof dd) {
            dd ddVar = (dd) obj;
            if (this.c != ddVar.c) {
                return false;
            }
            int i = 0;
            while (i < this.c) {
                try {
                    Object b2 = b(i);
                    Object c2 = c(i);
                    Object obj2 = ddVar.get(b2);
                    if (c2 != null) {
                        if (!c2.equals(obj2)) {
                            return false;
                        }
                    } else if (obj2 != null || !ddVar.containsKey(b2)) {
                        return false;
                    }
                    i++;
                } catch (NullPointerException e2) {
                    return false;
                } catch (ClassCastException e3) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this.c == map.size()) {
                int i2 = 0;
                while (i2 < this.c) {
                    try {
                        Object b3 = b(i2);
                        Object c3 = c(i2);
                        Object obj3 = map.get(b3);
                        if (c3 != null) {
                            if (!c3.equals(obj3)) {
                                return false;
                            }
                        } else if (obj3 != null || !map.containsKey(b3)) {
                            return false;
                        }
                        i2++;
                    } catch (NullPointerException e4) {
                    } catch (ClassCastException e5) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    private static void a(int[] iArr, Object[] objArr, int i) {
        Class<dd> cls = dd.class;
        int length = iArr.length;
        if (length == 8) {
            synchronized (cls) {
                if (g < 10) {
                    objArr[0] = f;
                    objArr[1] = iArr;
                    for (int i2 = (i + i) - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f = objArr;
                    g++;
                }
            }
        } else if (length == 4) {
            synchronized (cls) {
                if (e < 10) {
                    objArr[0] = d;
                    objArr[1] = iArr;
                    for (int i3 = (i + i) - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    d = objArr;
                    e++;
                }
            }
        }
    }

    public final Object get(Object obj) {
        return getOrDefault(obj, null);
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int a2 = a(obj);
        return a2 >= 0 ? this.b[a2 + a2 + 1] : obj2;
    }

    public int hashCode() {
        int[] iArr = this.a;
        Object[] objArr = this.b;
        int i = this.c;
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

    private final int a(Object obj, int i) {
        int i2 = this.c;
        if (i2 == 0) {
            return -1;
        }
        int a2 = a(this.a, i2, i);
        if (a2 < 0 || obj.equals(this.b[a2 + a2])) {
            return a2;
        }
        int i3 = a2 + 1;
        while (i3 < i2 && this.a[i3] == i) {
            if (obj.equals(this.b[i3 + i3])) {
                return i3;
            }
            i3++;
        }
        int i4 = a2 - 1;
        while (i4 >= 0 && this.a[i4] == i) {
            if (obj.equals(this.b[i4 + i4])) {
                return i4;
            }
            i4--;
        }
        return i3 ^ -1;
    }

    public final int a(Object obj) {
        return obj != null ? a(obj, obj.hashCode()) : a();
    }

    private final int a() {
        int i = this.c;
        if (i == 0) {
            return -1;
        }
        int a2 = a(this.a, i, 0);
        if (a2 < 0 || this.b[a2 + a2] == null) {
            return a2;
        }
        int i2 = a2 + 1;
        while (i2 < i && this.a[i2] == 0) {
            if (this.b[i2 + i2] == null) {
                return i2;
            }
            i2++;
        }
        int i3 = a2 - 1;
        while (i3 >= 0 && this.a[i3] == 0) {
            if (this.b[i3 + i3] == null) {
                return i3;
            }
            i3--;
        }
        return i2 ^ -1;
    }

    /* access modifiers changed from: package-private */
    public final int b(Object obj) {
        int i = this.c;
        int i2 = i + i;
        Object[] objArr = this.b;
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

    public final Object b(int i) {
        return this.b[i + i];
    }

    public Object put(Object obj, Object obj2) {
        int i;
        int i2;
        int i3 = this.c;
        if (obj == null) {
            i2 = a();
            i = 0;
        } else {
            int hashCode = obj.hashCode();
            i = hashCode;
            i2 = a(obj, hashCode);
        }
        if (i2 >= 0) {
            int i4 = i2 + i2 + 1;
            Object[] objArr = this.b;
            Object obj3 = objArr[i4];
            objArr[i4] = obj2;
            return obj3;
        }
        int i5 = i2 ^ -1;
        int[] iArr = this.a;
        int length = iArr.length;
        if (i3 >= length) {
            int i6 = 4;
            if (i3 >= 8) {
                i6 = (i3 >> 1) + i3;
            } else if (i3 >= 4) {
                i6 = 8;
            }
            Object[] objArr2 = this.b;
            e(i6);
            if (i3 == this.c) {
                int[] iArr2 = this.a;
                if (iArr2.length > 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, length);
                    System.arraycopy(objArr2, 0, this.b, 0, objArr2.length);
                }
                a(iArr, objArr2, i3);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i5 < i3) {
            int[] iArr3 = this.a;
            int i7 = i5 + 1;
            System.arraycopy(iArr3, i5, iArr3, i7, i3 - i5);
            Object[] objArr3 = this.b;
            int i8 = this.c - i5;
            System.arraycopy(objArr3, i5 + i5, objArr3, i7 + i7, i8 + i8);
        }
        int i9 = this.c;
        if (i3 == i9) {
            int[] iArr4 = this.a;
            if (i5 < iArr4.length) {
                iArr4[i5] = i;
                Object[] objArr4 = this.b;
                int i10 = i5 + i5;
                objArr4[i10] = obj;
                objArr4[i10 + 1] = obj2;
                this.c = i9 + 1;
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
        int a2 = a(obj);
        if (a2 < 0) {
            return null;
        }
        return d(a2);
    }

    public final boolean remove(Object obj, Object obj2) {
        int a2 = a(obj);
        if (a2 < 0) {
            return false;
        }
        Object c2 = c(a2);
        if (obj2 != c2 && (obj2 == null || !obj2.equals(c2))) {
            return false;
        }
        d(a2);
        return true;
    }

    public Object d(int i) {
        Object[] objArr = this.b;
        int i2 = i + i;
        Object obj = objArr[i2 + 1];
        int i3 = this.c;
        int i4 = 0;
        if (i3 <= 1) {
            a(this.a, objArr, i3);
            this.a = cq.a;
            this.b = cq.b;
        } else {
            int i5 = i3 - 1;
            int[] iArr = this.a;
            int length = iArr.length;
            int i6 = 8;
            if (length <= 8 || i3 >= length / 3) {
                if (i < i5) {
                    int i7 = i + 1;
                    int i8 = i5 - i;
                    System.arraycopy(iArr, i7, iArr, i, i8);
                    Object[] objArr2 = this.b;
                    System.arraycopy(objArr2, i7 + i7, objArr2, i2, i8 + i8);
                }
                Object[] objArr3 = this.b;
                int i9 = i5 + i5;
                objArr3[i9] = null;
                objArr3[i9 + 1] = null;
            } else {
                if (i3 > 8) {
                    i6 = i3 + (i3 >> 1);
                }
                e(i6);
                if (i3 == this.c) {
                    if (i > 0) {
                        System.arraycopy(iArr, 0, this.a, 0, i);
                        System.arraycopy(objArr, 0, this.b, 0, i2);
                    }
                    if (i < i5) {
                        int i10 = i + 1;
                        int i11 = i5 - i;
                        System.arraycopy(iArr, i10, this.a, i, i11);
                        System.arraycopy(objArr, i10 + i10, this.b, i2, i11 + i11);
                    }
                } else {
                    throw new ConcurrentModificationException();
                }
            }
            i4 = i5;
        }
        if (i3 == this.c) {
            this.c = i4;
            return obj;
        }
        throw new ConcurrentModificationException();
    }

    public final Object replace(Object obj, Object obj2) {
        int a2 = a(obj);
        if (a2 < 0) {
            return null;
        }
        return a(a2, obj2);
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int a2 = a(obj);
        if (a2 < 0) {
            return false;
        }
        Object c2 = c(a2);
        if (c2 != obj2 && (obj2 == null || !obj2.equals(c2))) {
            return false;
        }
        a(a2, obj3);
        return true;
    }

    public Object a(int i, Object obj) {
        int i2 = i + i + 1;
        Object[] objArr = this.b;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.c * 28);
        sb.append('{');
        for (int i = 0; i < this.c; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object b2 = b(i);
            if (b2 != this) {
                sb.append(b2);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object c2 = c(i);
            if (c2 == this) {
                sb.append("(this Map)");
            } else {
                sb.append(c2);
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public final Object c(int i) {
        return this.b[i + i + 1];
    }
}
