package defpackage;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* renamed from: dkm  reason: default package */
/* compiled from: PG */
final class dkm implements dkw {
    private static final int[] a = new int[0];
    private static final Unsafe b = dlv.a();
    private final int[] c;
    private final Object[] d;
    private final int e;
    private final int f;
    private final dkk g;
    private final boolean h;
    private final boolean i;
    private final int[] j;
    private final int k;
    private final int l;
    private final dkp m;
    private final djx n;
    private final dke o;
    private final dlw p;

    private static int g(int i2) {
        return (i2 >>> 20) & 255;
    }

    private static long h(int i2) {
        return (long) (i2 & 1048575);
    }

    private dkm(int[] iArr, Object[] objArr, int i2, int i3, dkk dkk, boolean z, int[] iArr2, int i4, int i5, dkp dkp, djx djx, dlw dlw, dkc dkc, dke dke, byte b2) {
        this.c = iArr;
        this.d = objArr;
        this.e = i2;
        this.f = i3;
        this.i = z;
        boolean z2 = false;
        if (dkc != null && (dkk instanceof djc)) {
            z2 = true;
        }
        this.h = z2;
        this.j = iArr2;
        this.k = i4;
        this.l = i5;
        this.m = dkp;
        this.n = djx;
        this.p = dlw;
        this.g = dkk;
        this.o = dke;
    }

    private final boolean c(Object obj, Object obj2, int i2) {
        return a(obj, i2) == a(obj2, i2);
    }

    public final boolean a(Object obj, Object obj2) {
        boolean z;
        int length = this.c.length;
        for (int i2 = 0; i2 < length; i2 += 3) {
            int e2 = e(i2);
            long h2 = h(e2);
            switch (g(e2)) {
                case 0:
                    if (c(obj, obj2, i2) && Double.doubleToLongBits(dlv.e(obj, h2)) == Double.doubleToLongBits(dlv.e(obj2, h2))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (c(obj, obj2, i2) && Float.floatToIntBits(dlv.d(obj, h2)) == Float.floatToIntBits(dlv.d(obj2, h2))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (c(obj, obj2, i2) && dlv.b(obj, h2) == dlv.b(obj2, h2)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (c(obj, obj2, i2) && dlv.b(obj, h2) == dlv.b(obj2, h2)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (c(obj, obj2, i2) && dlv.a(obj, h2) == dlv.a(obj2, h2)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (c(obj, obj2, i2) && dlv.b(obj, h2) == dlv.b(obj2, h2)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (c(obj, obj2, i2) && dlv.a(obj, h2) == dlv.a(obj2, h2)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (c(obj, obj2, i2) && dlv.c(obj, h2) == dlv.c(obj2, h2)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (c(obj, obj2, i2) && dky.a(dlv.f(obj, h2), dlv.f(obj2, h2))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (c(obj, obj2, i2) && dky.a(dlv.f(obj, h2), dlv.f(obj2, h2))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (c(obj, obj2, i2) && dky.a(dlv.f(obj, h2), dlv.f(obj2, h2))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (c(obj, obj2, i2) && dlv.a(obj, h2) == dlv.a(obj2, h2)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (c(obj, obj2, i2) && dlv.a(obj, h2) == dlv.a(obj2, h2)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (c(obj, obj2, i2) && dlv.a(obj, h2) == dlv.a(obj2, h2)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (c(obj, obj2, i2) && dlv.b(obj, h2) == dlv.b(obj2, h2)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (c(obj, obj2, i2) && dlv.a(obj, h2) == dlv.a(obj2, h2)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (c(obj, obj2, i2) && dlv.b(obj, h2) == dlv.b(obj2, h2)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (c(obj, obj2, i2) && dky.a(dlv.f(obj, h2), dlv.f(obj2, h2))) {
                        continue;
                    }
                    return false;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    z = dky.a(dlv.f(obj, h2), dlv.f(obj2, h2));
                    break;
                case 50:
                    z = dky.a(dlv.f(obj, h2), dlv.f(obj2, h2));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long f2 = (long) (f(i2) & 1048575);
                    if (dlv.a(obj, f2) == dlv.a(obj2, f2) && dky.a(dlv.f(obj, h2), dlv.f(obj2, h2))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!z) {
                return false;
            }
        }
        if (!dlw.a(obj).equals(dlw.a(obj2))) {
            return false;
        }
        if (this.h) {
            return dkc.a(obj).equals(dkc.a(obj2));
        }
        return true;
    }

    private final djh c(int i2) {
        int i3 = i2 / 3;
        return (djh) this.d[i3 + i3 + 1];
    }

    private final Object b(int i2) {
        int i3 = i2 / 3;
        return this.d[i3 + i3];
    }

    private final dkw a(int i2) {
        int i3 = i2 / 3;
        int i4 = i3 + i3;
        dkw dkw = (dkw) this.d[i4];
        if (dkw != null) {
            return dkw;
        }
        dkw a2 = dkt.a.a((Class) this.d[i4 + 1]);
        this.d[i4] = a2;
        return a2;
    }

    private static dlm g(Object obj) {
        dje dje = (dje) obj;
        dlm dlm = dje.A;
        if (dlm != dlm.a) {
            return dlm;
        }
        dlm a2 = dlm.a();
        dje.A = a2;
        return a2;
    }

    public final int b(Object obj) {
        return this.i ? f(obj) : e(obj);
    }

    private final int e(Object obj) {
        int i2;
        Unsafe unsafe = b;
        int i3 = 0;
        int i4 = 0;
        int i5 = -1;
        for (int i6 = 0; i6 < this.c.length; i6 += 3) {
            int e2 = e(i6);
            int d2 = d(i6);
            int g2 = g(e2);
            if (g2 <= 17) {
                int i7 = this.c[i6 + 2];
                int i8 = 1048575 & i7;
                i2 = 1 << (i7 >>> 20);
                if (i8 != i5) {
                    i4 = unsafe.getInt(obj, (long) i8);
                    i5 = i8;
                }
            } else {
                i2 = 0;
            }
            long h2 = h(e2);
            switch (g2) {
                case 0:
                    if ((i4 & i2) == 0) {
                        break;
                    } else {
                        i3 += din.j(d2);
                        break;
                    }
                case 1:
                    if ((i4 & i2) == 0) {
                        break;
                    } else {
                        i3 += din.m(d2);
                        break;
                    }
                case 2:
                    if ((i4 & i2) == 0) {
                        break;
                    } else {
                        i3 += din.b(d2, unsafe.getLong(obj, h2));
                        break;
                    }
                case 3:
                    if ((i4 & i2) == 0) {
                        break;
                    } else {
                        i3 += din.c(d2, unsafe.getLong(obj, h2));
                        break;
                    }
                case 4:
                    if ((i4 & i2) == 0) {
                        break;
                    } else {
                        i3 += din.b(d2, unsafe.getInt(obj, h2));
                        break;
                    }
                case 5:
                    if ((i4 & i2) == 0) {
                        break;
                    } else {
                        i3 += din.l(d2);
                        break;
                    }
                case 6:
                    if ((i4 & i2) == 0) {
                        break;
                    } else {
                        i3 += din.k(d2);
                        break;
                    }
                case 7:
                    if ((i4 & i2) == 0) {
                        break;
                    } else {
                        i3 += din.i(d2);
                        break;
                    }
                case 8:
                    if ((i4 & i2) == 0) {
                        break;
                    } else {
                        Object object = unsafe.getObject(obj, h2);
                        if (!(object instanceof dik)) {
                            i3 += din.a(d2, (String) object);
                            break;
                        } else {
                            i3 += din.a(d2, (dik) object);
                            break;
                        }
                    }
                case 9:
                    if ((i4 & i2) == 0) {
                        break;
                    } else {
                        i3 += dky.a(d2, unsafe.getObject(obj, h2), a(i6));
                        break;
                    }
                case 10:
                    if ((i4 & i2) == 0) {
                        break;
                    } else {
                        i3 += din.a(d2, (dik) unsafe.getObject(obj, h2));
                        break;
                    }
                case 11:
                    if ((i4 & i2) == 0) {
                        break;
                    } else {
                        i3 += din.c(d2, unsafe.getInt(obj, h2));
                        break;
                    }
                case 12:
                    if ((i4 & i2) == 0) {
                        break;
                    } else {
                        i3 += din.e(d2, unsafe.getInt(obj, h2));
                        break;
                    }
                case 13:
                    if ((i4 & i2) == 0) {
                        break;
                    } else {
                        i3 += din.n(d2);
                        break;
                    }
                case 14:
                    if ((i4 & i2) == 0) {
                        break;
                    } else {
                        i3 += din.o(d2);
                        break;
                    }
                case 15:
                    if ((i4 & i2) == 0) {
                        break;
                    } else {
                        i3 += din.d(d2, unsafe.getInt(obj, h2));
                        break;
                    }
                case 16:
                    if ((i4 & i2) == 0) {
                        break;
                    } else {
                        i3 += din.d(d2, unsafe.getLong(obj, h2));
                        break;
                    }
                case 17:
                    if ((i4 & i2) == 0) {
                        break;
                    } else {
                        i3 += din.a(d2, (dkk) unsafe.getObject(obj, h2), a(i6));
                        break;
                    }
                case 18:
                    i3 += dky.f(d2, (List) unsafe.getObject(obj, h2));
                    break;
                case 19:
                    i3 += dky.e(d2, (List) unsafe.getObject(obj, h2));
                    break;
                case 20:
                    i3 += dky.h(d2, (List) unsafe.getObject(obj, h2));
                    break;
                case 21:
                    i3 += dky.l(d2, (List) unsafe.getObject(obj, h2));
                    break;
                case 22:
                    i3 += dky.g(d2, (List) unsafe.getObject(obj, h2));
                    break;
                case 23:
                    i3 += dky.f(d2, (List) unsafe.getObject(obj, h2));
                    break;
                case 24:
                    i3 += dky.e(d2, (List) unsafe.getObject(obj, h2));
                    break;
                case 25:
                    i3 += dky.c(d2, (List) unsafe.getObject(obj, h2));
                    break;
                case 26:
                    i3 += dky.a(d2, (List) unsafe.getObject(obj, h2));
                    break;
                case 27:
                    i3 += dky.a(d2, (List) unsafe.getObject(obj, h2), a(i6));
                    break;
                case 28:
                    i3 += dky.b(d2, (List) unsafe.getObject(obj, h2));
                    break;
                case 29:
                    i3 += dky.k(d2, (List) unsafe.getObject(obj, h2));
                    break;
                case 30:
                    i3 += dky.d(d2, (List) unsafe.getObject(obj, h2));
                    break;
                case 31:
                    i3 += dky.e(d2, (List) unsafe.getObject(obj, h2));
                    break;
                case 32:
                    i3 += dky.f(d2, (List) unsafe.getObject(obj, h2));
                    break;
                case 33:
                    i3 += dky.i(d2, (List) unsafe.getObject(obj, h2));
                    break;
                case 34:
                    i3 += dky.j(d2, (List) unsafe.getObject(obj, h2));
                    break;
                case 35:
                    int i9 = dky.i((List) unsafe.getObject(obj, h2));
                    if (i9 <= 0) {
                        break;
                    } else {
                        i3 += din.a(d2) + din.c(i9) + i9;
                        break;
                    }
                case 36:
                    int h3 = dky.h((List) unsafe.getObject(obj, h2));
                    if (h3 <= 0) {
                        break;
                    } else {
                        i3 += din.a(d2) + din.c(h3) + h3;
                        break;
                    }
                case 37:
                    int a2 = dky.a((List) unsafe.getObject(obj, h2));
                    if (a2 <= 0) {
                        break;
                    } else {
                        i3 += din.a(d2) + din.c(a2) + a2;
                        break;
                    }
                case 38:
                    int b2 = dky.b((List) unsafe.getObject(obj, h2));
                    if (b2 <= 0) {
                        break;
                    } else {
                        i3 += din.a(d2) + din.c(b2) + b2;
                        break;
                    }
                case 39:
                    int e3 = dky.e((List) unsafe.getObject(obj, h2));
                    if (e3 <= 0) {
                        break;
                    } else {
                        i3 += din.a(d2) + din.c(e3) + e3;
                        break;
                    }
                case 40:
                    int i10 = dky.i((List) unsafe.getObject(obj, h2));
                    if (i10 <= 0) {
                        break;
                    } else {
                        i3 += din.a(d2) + din.c(i10) + i10;
                        break;
                    }
                case 41:
                    int h4 = dky.h((List) unsafe.getObject(obj, h2));
                    if (h4 <= 0) {
                        break;
                    } else {
                        i3 += din.a(d2) + din.c(h4) + h4;
                        break;
                    }
                case 42:
                    int j2 = dky.j((List) unsafe.getObject(obj, h2));
                    if (j2 <= 0) {
                        break;
                    } else {
                        i3 += din.a(d2) + din.c(j2) + j2;
                        break;
                    }
                case 43:
                    int f2 = dky.f((List) unsafe.getObject(obj, h2));
                    if (f2 <= 0) {
                        break;
                    } else {
                        i3 += din.a(d2) + din.c(f2) + f2;
                        break;
                    }
                case 44:
                    int d3 = dky.d((List) unsafe.getObject(obj, h2));
                    if (d3 <= 0) {
                        break;
                    } else {
                        i3 += din.a(d2) + din.c(d3) + d3;
                        break;
                    }
                case 45:
                    int h5 = dky.h((List) unsafe.getObject(obj, h2));
                    if (h5 <= 0) {
                        break;
                    } else {
                        i3 += din.a(d2) + din.c(h5) + h5;
                        break;
                    }
                case 46:
                    int i11 = dky.i((List) unsafe.getObject(obj, h2));
                    if (i11 <= 0) {
                        break;
                    } else {
                        i3 += din.a(d2) + din.c(i11) + i11;
                        break;
                    }
                case 47:
                    int g3 = dky.g((List) unsafe.getObject(obj, h2));
                    if (g3 <= 0) {
                        break;
                    } else {
                        i3 += din.a(d2) + din.c(g3) + g3;
                        break;
                    }
                case 48:
                    int c2 = dky.c((List) unsafe.getObject(obj, h2));
                    if (c2 <= 0) {
                        break;
                    } else {
                        i3 += din.a(d2) + din.c(c2) + c2;
                        break;
                    }
                case 49:
                    i3 += dky.b(d2, (List) unsafe.getObject(obj, h2), a(i6));
                    break;
                case 50:
                    i3 += this.o.b(unsafe.getObject(obj, h2), b(i6));
                    break;
                case 51:
                    if (!a(obj, d2, i6)) {
                        break;
                    } else {
                        i3 += din.j(d2);
                        break;
                    }
                case 52:
                    if (!a(obj, d2, i6)) {
                        break;
                    } else {
                        i3 += din.m(d2);
                        break;
                    }
                case 53:
                    if (!a(obj, d2, i6)) {
                        break;
                    } else {
                        i3 += din.b(d2, e(obj, h2));
                        break;
                    }
                case 54:
                    if (!a(obj, d2, i6)) {
                        break;
                    } else {
                        i3 += din.c(d2, e(obj, h2));
                        break;
                    }
                case 55:
                    if (!a(obj, d2, i6)) {
                        break;
                    } else {
                        i3 += din.b(d2, d(obj, h2));
                        break;
                    }
                case 56:
                    if (!a(obj, d2, i6)) {
                        break;
                    } else {
                        i3 += din.l(d2);
                        break;
                    }
                case 57:
                    if (!a(obj, d2, i6)) {
                        break;
                    } else {
                        i3 += din.k(d2);
                        break;
                    }
                case 58:
                    if (!a(obj, d2, i6)) {
                        break;
                    } else {
                        i3 += din.i(d2);
                        break;
                    }
                case 59:
                    if (!a(obj, d2, i6)) {
                        break;
                    } else {
                        Object object2 = unsafe.getObject(obj, h2);
                        if (!(object2 instanceof dik)) {
                            i3 += din.a(d2, (String) object2);
                            break;
                        } else {
                            i3 += din.a(d2, (dik) object2);
                            break;
                        }
                    }
                case 60:
                    if (!a(obj, d2, i6)) {
                        break;
                    } else {
                        i3 += dky.a(d2, unsafe.getObject(obj, h2), a(i6));
                        break;
                    }
                case 61:
                    if (!a(obj, d2, i6)) {
                        break;
                    } else {
                        i3 += din.a(d2, (dik) unsafe.getObject(obj, h2));
                        break;
                    }
                case 62:
                    if (!a(obj, d2, i6)) {
                        break;
                    } else {
                        i3 += din.c(d2, d(obj, h2));
                        break;
                    }
                case 63:
                    if (!a(obj, d2, i6)) {
                        break;
                    } else {
                        i3 += din.e(d2, d(obj, h2));
                        break;
                    }
                case 64:
                    if (!a(obj, d2, i6)) {
                        break;
                    } else {
                        i3 += din.n(d2);
                        break;
                    }
                case 65:
                    if (!a(obj, d2, i6)) {
                        break;
                    } else {
                        i3 += din.o(d2);
                        break;
                    }
                case 66:
                    if (!a(obj, d2, i6)) {
                        break;
                    } else {
                        i3 += din.d(d2, d(obj, h2));
                        break;
                    }
                case 67:
                    if (!a(obj, d2, i6)) {
                        break;
                    } else {
                        i3 += din.d(d2, e(obj, h2));
                        break;
                    }
                case 68:
                    if (!a(obj, d2, i6)) {
                        break;
                    } else {
                        i3 += din.a(d2, (dkk) unsafe.getObject(obj, h2), a(i6));
                        break;
                    }
            }
        }
        int h6 = i3 + h(obj);
        if (!this.h) {
            return h6;
        }
        div a3 = dkc.a(obj);
        int i12 = 0;
        for (int i13 = 0; i13 < a3.a.b(); i13++) {
            Map.Entry b3 = a3.a.b(i13);
            i12 += div.a((diu) b3.getKey(), b3.getValue());
        }
        for (Map.Entry entry : a3.a.c()) {
            i12 += div.a((diu) entry.getKey(), entry.getValue());
        }
        return h6 + i12;
    }

    private final int f(Object obj) {
        Unsafe unsafe = b;
        int i2 = 0;
        for (int i3 = 0; i3 < this.c.length; i3 += 3) {
            int e2 = e(i3);
            int g2 = g(e2);
            int d2 = d(i3);
            long h2 = h(e2);
            if (g2 >= diw.DOUBLE_LIST_PACKED.c) {
                int i4 = diw.SINT64_LIST_PACKED.c;
            }
            switch (g2) {
                case 0:
                    if (!a(obj, i3)) {
                        break;
                    } else {
                        i2 += din.j(d2);
                        break;
                    }
                case 1:
                    if (!a(obj, i3)) {
                        break;
                    } else {
                        i2 += din.m(d2);
                        break;
                    }
                case 2:
                    if (!a(obj, i3)) {
                        break;
                    } else {
                        i2 += din.b(d2, dlv.b(obj, h2));
                        break;
                    }
                case 3:
                    if (!a(obj, i3)) {
                        break;
                    } else {
                        i2 += din.c(d2, dlv.b(obj, h2));
                        break;
                    }
                case 4:
                    if (!a(obj, i3)) {
                        break;
                    } else {
                        i2 += din.b(d2, dlv.a(obj, h2));
                        break;
                    }
                case 5:
                    if (!a(obj, i3)) {
                        break;
                    } else {
                        i2 += din.l(d2);
                        break;
                    }
                case 6:
                    if (!a(obj, i3)) {
                        break;
                    } else {
                        i2 += din.k(d2);
                        break;
                    }
                case 7:
                    if (!a(obj, i3)) {
                        break;
                    } else {
                        i2 += din.i(d2);
                        break;
                    }
                case 8:
                    if (!a(obj, i3)) {
                        break;
                    } else {
                        Object f2 = dlv.f(obj, h2);
                        if (!(f2 instanceof dik)) {
                            i2 += din.a(d2, (String) f2);
                            break;
                        } else {
                            i2 += din.a(d2, (dik) f2);
                            break;
                        }
                    }
                case 9:
                    if (!a(obj, i3)) {
                        break;
                    } else {
                        i2 += dky.a(d2, dlv.f(obj, h2), a(i3));
                        break;
                    }
                case 10:
                    if (!a(obj, i3)) {
                        break;
                    } else {
                        i2 += din.a(d2, (dik) dlv.f(obj, h2));
                        break;
                    }
                case 11:
                    if (!a(obj, i3)) {
                        break;
                    } else {
                        i2 += din.c(d2, dlv.a(obj, h2));
                        break;
                    }
                case 12:
                    if (!a(obj, i3)) {
                        break;
                    } else {
                        i2 += din.e(d2, dlv.a(obj, h2));
                        break;
                    }
                case 13:
                    if (!a(obj, i3)) {
                        break;
                    } else {
                        i2 += din.n(d2);
                        break;
                    }
                case 14:
                    if (!a(obj, i3)) {
                        break;
                    } else {
                        i2 += din.o(d2);
                        break;
                    }
                case 15:
                    if (!a(obj, i3)) {
                        break;
                    } else {
                        i2 += din.d(d2, dlv.a(obj, h2));
                        break;
                    }
                case 16:
                    if (!a(obj, i3)) {
                        break;
                    } else {
                        i2 += din.d(d2, dlv.b(obj, h2));
                        break;
                    }
                case 17:
                    if (!a(obj, i3)) {
                        break;
                    } else {
                        i2 += din.a(d2, (dkk) dlv.f(obj, h2), a(i3));
                        break;
                    }
                case 18:
                    i2 += dky.f(d2, a(obj, h2));
                    break;
                case 19:
                    i2 += dky.e(d2, a(obj, h2));
                    break;
                case 20:
                    i2 += dky.h(d2, a(obj, h2));
                    break;
                case 21:
                    i2 += dky.l(d2, a(obj, h2));
                    break;
                case 22:
                    i2 += dky.g(d2, a(obj, h2));
                    break;
                case 23:
                    i2 += dky.f(d2, a(obj, h2));
                    break;
                case 24:
                    i2 += dky.e(d2, a(obj, h2));
                    break;
                case 25:
                    i2 += dky.c(d2, a(obj, h2));
                    break;
                case 26:
                    i2 += dky.a(d2, a(obj, h2));
                    break;
                case 27:
                    i2 += dky.a(d2, a(obj, h2), a(i3));
                    break;
                case 28:
                    i2 += dky.b(d2, a(obj, h2));
                    break;
                case 29:
                    i2 += dky.k(d2, a(obj, h2));
                    break;
                case 30:
                    i2 += dky.d(d2, a(obj, h2));
                    break;
                case 31:
                    i2 += dky.e(d2, a(obj, h2));
                    break;
                case 32:
                    i2 += dky.f(d2, a(obj, h2));
                    break;
                case 33:
                    i2 += dky.i(d2, a(obj, h2));
                    break;
                case 34:
                    i2 += dky.j(d2, a(obj, h2));
                    break;
                case 35:
                    int i5 = dky.i((List) unsafe.getObject(obj, h2));
                    if (i5 <= 0) {
                        break;
                    } else {
                        i2 += din.a(d2) + din.c(i5) + i5;
                        break;
                    }
                case 36:
                    int h3 = dky.h((List) unsafe.getObject(obj, h2));
                    if (h3 <= 0) {
                        break;
                    } else {
                        i2 += din.a(d2) + din.c(h3) + h3;
                        break;
                    }
                case 37:
                    int a2 = dky.a((List) unsafe.getObject(obj, h2));
                    if (a2 <= 0) {
                        break;
                    } else {
                        i2 += din.a(d2) + din.c(a2) + a2;
                        break;
                    }
                case 38:
                    int b2 = dky.b((List) unsafe.getObject(obj, h2));
                    if (b2 <= 0) {
                        break;
                    } else {
                        i2 += din.a(d2) + din.c(b2) + b2;
                        break;
                    }
                case 39:
                    int e3 = dky.e((List) unsafe.getObject(obj, h2));
                    if (e3 <= 0) {
                        break;
                    } else {
                        i2 += din.a(d2) + din.c(e3) + e3;
                        break;
                    }
                case 40:
                    int i6 = dky.i((List) unsafe.getObject(obj, h2));
                    if (i6 <= 0) {
                        break;
                    } else {
                        i2 += din.a(d2) + din.c(i6) + i6;
                        break;
                    }
                case 41:
                    int h4 = dky.h((List) unsafe.getObject(obj, h2));
                    if (h4 <= 0) {
                        break;
                    } else {
                        i2 += din.a(d2) + din.c(h4) + h4;
                        break;
                    }
                case 42:
                    int j2 = dky.j((List) unsafe.getObject(obj, h2));
                    if (j2 <= 0) {
                        break;
                    } else {
                        i2 += din.a(d2) + din.c(j2) + j2;
                        break;
                    }
                case 43:
                    int f3 = dky.f((List) unsafe.getObject(obj, h2));
                    if (f3 <= 0) {
                        break;
                    } else {
                        i2 += din.a(d2) + din.c(f3) + f3;
                        break;
                    }
                case 44:
                    int d3 = dky.d((List) unsafe.getObject(obj, h2));
                    if (d3 <= 0) {
                        break;
                    } else {
                        i2 += din.a(d2) + din.c(d3) + d3;
                        break;
                    }
                case 45:
                    int h5 = dky.h((List) unsafe.getObject(obj, h2));
                    if (h5 <= 0) {
                        break;
                    } else {
                        i2 += din.a(d2) + din.c(h5) + h5;
                        break;
                    }
                case 46:
                    int i7 = dky.i((List) unsafe.getObject(obj, h2));
                    if (i7 <= 0) {
                        break;
                    } else {
                        i2 += din.a(d2) + din.c(i7) + i7;
                        break;
                    }
                case 47:
                    int g3 = dky.g((List) unsafe.getObject(obj, h2));
                    if (g3 <= 0) {
                        break;
                    } else {
                        i2 += din.a(d2) + din.c(g3) + g3;
                        break;
                    }
                case 48:
                    int c2 = dky.c((List) unsafe.getObject(obj, h2));
                    if (c2 <= 0) {
                        break;
                    } else {
                        i2 += din.a(d2) + din.c(c2) + c2;
                        break;
                    }
                case 49:
                    i2 += dky.b(d2, a(obj, h2), a(i3));
                    break;
                case 50:
                    i2 += this.o.b(dlv.f(obj, h2), b(i3));
                    break;
                case 51:
                    if (!a(obj, d2, i3)) {
                        break;
                    } else {
                        i2 += din.j(d2);
                        break;
                    }
                case 52:
                    if (!a(obj, d2, i3)) {
                        break;
                    } else {
                        i2 += din.m(d2);
                        break;
                    }
                case 53:
                    if (!a(obj, d2, i3)) {
                        break;
                    } else {
                        i2 += din.b(d2, e(obj, h2));
                        break;
                    }
                case 54:
                    if (!a(obj, d2, i3)) {
                        break;
                    } else {
                        i2 += din.c(d2, e(obj, h2));
                        break;
                    }
                case 55:
                    if (!a(obj, d2, i3)) {
                        break;
                    } else {
                        i2 += din.b(d2, d(obj, h2));
                        break;
                    }
                case 56:
                    if (!a(obj, d2, i3)) {
                        break;
                    } else {
                        i2 += din.l(d2);
                        break;
                    }
                case 57:
                    if (!a(obj, d2, i3)) {
                        break;
                    } else {
                        i2 += din.k(d2);
                        break;
                    }
                case 58:
                    if (!a(obj, d2, i3)) {
                        break;
                    } else {
                        i2 += din.i(d2);
                        break;
                    }
                case 59:
                    if (!a(obj, d2, i3)) {
                        break;
                    } else {
                        Object f4 = dlv.f(obj, h2);
                        if (!(f4 instanceof dik)) {
                            i2 += din.a(d2, (String) f4);
                            break;
                        } else {
                            i2 += din.a(d2, (dik) f4);
                            break;
                        }
                    }
                case 60:
                    if (!a(obj, d2, i3)) {
                        break;
                    } else {
                        i2 += dky.a(d2, dlv.f(obj, h2), a(i3));
                        break;
                    }
                case 61:
                    if (!a(obj, d2, i3)) {
                        break;
                    } else {
                        i2 += din.a(d2, (dik) dlv.f(obj, h2));
                        break;
                    }
                case 62:
                    if (!a(obj, d2, i3)) {
                        break;
                    } else {
                        i2 += din.c(d2, d(obj, h2));
                        break;
                    }
                case 63:
                    if (!a(obj, d2, i3)) {
                        break;
                    } else {
                        i2 += din.e(d2, d(obj, h2));
                        break;
                    }
                case 64:
                    if (!a(obj, d2, i3)) {
                        break;
                    } else {
                        i2 += din.n(d2);
                        break;
                    }
                case 65:
                    if (!a(obj, d2, i3)) {
                        break;
                    } else {
                        i2 += din.o(d2);
                        break;
                    }
                case 66:
                    if (!a(obj, d2, i3)) {
                        break;
                    } else {
                        i2 += din.d(d2, d(obj, h2));
                        break;
                    }
                case 67:
                    if (!a(obj, d2, i3)) {
                        break;
                    } else {
                        i2 += din.d(d2, e(obj, h2));
                        break;
                    }
                case 68:
                    if (!a(obj, d2, i3)) {
                        break;
                    } else {
                        i2 += din.a(d2, (dkk) dlv.f(obj, h2), a(i3));
                        break;
                    }
            }
        }
        return i2 + h(obj);
    }

    private static final int h(Object obj) {
        return dlw.a(obj).b();
    }

    public final int a(Object obj) {
        int length = this.c.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int e2 = e(i3);
            int d2 = d(i3);
            long h2 = h(e2);
            int i4 = 37;
            switch (g(e2)) {
                case 0:
                    i2 = (i2 * 53) + djl.a(Double.doubleToLongBits(dlv.e(obj, h2)));
                    break;
                case 1:
                    i2 = (i2 * 53) + Float.floatToIntBits(dlv.d(obj, h2));
                    break;
                case 2:
                    i2 = (i2 * 53) + djl.a(dlv.b(obj, h2));
                    break;
                case 3:
                    i2 = (i2 * 53) + djl.a(dlv.b(obj, h2));
                    break;
                case 4:
                    i2 = (i2 * 53) + dlv.a(obj, h2);
                    break;
                case 5:
                    i2 = (i2 * 53) + djl.a(dlv.b(obj, h2));
                    break;
                case 6:
                    i2 = (i2 * 53) + dlv.a(obj, h2);
                    break;
                case 7:
                    i2 = (i2 * 53) + djl.a(dlv.c(obj, h2));
                    break;
                case 8:
                    i2 = (i2 * 53) + ((String) dlv.f(obj, h2)).hashCode();
                    break;
                case 9:
                    Object f2 = dlv.f(obj, h2);
                    if (f2 != null) {
                        i4 = f2.hashCode();
                    }
                    i2 = (i2 * 53) + i4;
                    break;
                case 10:
                    i2 = (i2 * 53) + dlv.f(obj, h2).hashCode();
                    break;
                case 11:
                    i2 = (i2 * 53) + dlv.a(obj, h2);
                    break;
                case 12:
                    i2 = (i2 * 53) + dlv.a(obj, h2);
                    break;
                case 13:
                    i2 = (i2 * 53) + dlv.a(obj, h2);
                    break;
                case 14:
                    i2 = (i2 * 53) + djl.a(dlv.b(obj, h2));
                    break;
                case 15:
                    i2 = (i2 * 53) + dlv.a(obj, h2);
                    break;
                case 16:
                    i2 = (i2 * 53) + djl.a(dlv.b(obj, h2));
                    break;
                case 17:
                    Object f3 = dlv.f(obj, h2);
                    if (f3 != null) {
                        i4 = f3.hashCode();
                    }
                    i2 = (i2 * 53) + i4;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i2 = (i2 * 53) + dlv.f(obj, h2).hashCode();
                    break;
                case 50:
                    i2 = (i2 * 53) + dlv.f(obj, h2).hashCode();
                    break;
                case 51:
                    if (!a(obj, d2, i3)) {
                        break;
                    } else {
                        i2 = (i2 * 53) + djl.a(Double.doubleToLongBits(b(obj, h2)));
                        break;
                    }
                case 52:
                    if (!a(obj, d2, i3)) {
                        break;
                    } else {
                        i2 = (i2 * 53) + Float.floatToIntBits(c(obj, h2));
                        break;
                    }
                case 53:
                    if (!a(obj, d2, i3)) {
                        break;
                    } else {
                        i2 = (i2 * 53) + djl.a(e(obj, h2));
                        break;
                    }
                case 54:
                    if (!a(obj, d2, i3)) {
                        break;
                    } else {
                        i2 = (i2 * 53) + djl.a(e(obj, h2));
                        break;
                    }
                case 55:
                    if (!a(obj, d2, i3)) {
                        break;
                    } else {
                        i2 = (i2 * 53) + d(obj, h2);
                        break;
                    }
                case 56:
                    if (!a(obj, d2, i3)) {
                        break;
                    } else {
                        i2 = (i2 * 53) + djl.a(e(obj, h2));
                        break;
                    }
                case 57:
                    if (!a(obj, d2, i3)) {
                        break;
                    } else {
                        i2 = (i2 * 53) + d(obj, h2);
                        break;
                    }
                case 58:
                    if (!a(obj, d2, i3)) {
                        break;
                    } else {
                        i2 = (i2 * 53) + djl.a(f(obj, h2));
                        break;
                    }
                case 59:
                    if (!a(obj, d2, i3)) {
                        break;
                    } else {
                        i2 = (i2 * 53) + ((String) dlv.f(obj, h2)).hashCode();
                        break;
                    }
                case 60:
                    if (!a(obj, d2, i3)) {
                        break;
                    } else {
                        i2 = (i2 * 53) + dlv.f(obj, h2).hashCode();
                        break;
                    }
                case 61:
                    if (!a(obj, d2, i3)) {
                        break;
                    } else {
                        i2 = (i2 * 53) + dlv.f(obj, h2).hashCode();
                        break;
                    }
                case 62:
                    if (!a(obj, d2, i3)) {
                        break;
                    } else {
                        i2 = (i2 * 53) + d(obj, h2);
                        break;
                    }
                case 63:
                    if (!a(obj, d2, i3)) {
                        break;
                    } else {
                        i2 = (i2 * 53) + d(obj, h2);
                        break;
                    }
                case 64:
                    if (!a(obj, d2, i3)) {
                        break;
                    } else {
                        i2 = (i2 * 53) + d(obj, h2);
                        break;
                    }
                case 65:
                    if (!a(obj, d2, i3)) {
                        break;
                    } else {
                        i2 = (i2 * 53) + djl.a(e(obj, h2));
                        break;
                    }
                case 66:
                    if (!a(obj, d2, i3)) {
                        break;
                    } else {
                        i2 = (i2 * 53) + d(obj, h2);
                        break;
                    }
                case 67:
                    if (!a(obj, d2, i3)) {
                        break;
                    } else {
                        i2 = (i2 * 53) + djl.a(e(obj, h2));
                        break;
                    }
                case 68:
                    if (!a(obj, d2, i3)) {
                        break;
                    } else {
                        i2 = (i2 * 53) + dlv.f(obj, h2).hashCode();
                        break;
                    }
            }
        }
        int hashCode = (i2 * 53) + dlw.a(obj).hashCode();
        return this.h ? (hashCode * 53) + dkc.a(obj).hashCode() : hashCode;
    }

    private final boolean a(Object obj, int i2) {
        if (!this.i) {
            int f2 = f(i2);
            return (dlv.a(obj, (long) (1048575 & f2)) & (1 << (f2 >>> 20))) != 0;
        }
        int e2 = e(i2);
        long h2 = h(e2);
        switch (g(e2)) {
            case 0:
                return dlv.e(obj, h2) != 0.0d;
            case 1:
                return dlv.d(obj, h2) != 0.0f;
            case 2:
                return dlv.b(obj, h2) != 0;
            case 3:
                return dlv.b(obj, h2) != 0;
            case 4:
                return dlv.a(obj, h2) != 0;
            case 5:
                return dlv.b(obj, h2) != 0;
            case 6:
                return dlv.a(obj, h2) != 0;
            case 7:
                return dlv.c(obj, h2);
            case 8:
                Object f3 = dlv.f(obj, h2);
                if (f3 instanceof String) {
                    return !((String) f3).isEmpty();
                }
                if (f3 instanceof dik) {
                    return !dik.b.equals(f3);
                }
                throw new IllegalArgumentException();
            case 9:
                return dlv.f(obj, h2) != null;
            case 10:
                return !dik.b.equals(dlv.f(obj, h2));
            case 11:
                return dlv.a(obj, h2) != 0;
            case 12:
                return dlv.a(obj, h2) != 0;
            case 13:
                return dlv.a(obj, h2) != 0;
            case 14:
                return dlv.b(obj, h2) != 0;
            case 15:
                return dlv.a(obj, h2) != 0;
            case 16:
                return dlv.b(obj, h2) != 0;
            case 17:
                return dlv.f(obj, h2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean a(Object obj, int i2, int i3, int i4) {
        if (!this.i) {
            return (i3 & i4) != 0;
        }
        return a(obj, i2);
    }

    public final boolean d(Object obj) {
        int i2;
        int i3 = 0;
        int i4 = -1;
        for (int i5 = 0; i5 < this.k; i5++) {
            int i6 = this.j[i5];
            int d2 = d(i6);
            int e2 = e(i6);
            if (!this.i) {
                int i7 = this.c[i6 + 2];
                int i8 = 1048575 & i7;
                i2 = 1 << (i7 >>> 20);
                if (i8 != i4) {
                    i3 = b.getInt(obj, (long) i8);
                    i4 = i8;
                }
            } else {
                i2 = 0;
            }
            if ((268435456 & e2) != 0 && !a(obj, i6, i3, i2)) {
                return false;
            }
            int g2 = g(e2);
            if (g2 != 9 && g2 != 17) {
                if (g2 != 27) {
                    if (g2 == 60 || g2 == 68) {
                        if (a(obj, d2, i6) && !a(obj, e2, a(i6))) {
                            return false;
                        }
                    } else if (g2 != 49) {
                        if (g2 == 50 && !this.o.b(dlv.f(obj, h(e2))).isEmpty()) {
                            this.o.e(b(i6));
                            throw null;
                        }
                    }
                }
                List list = (List) dlv.f(obj, h(e2));
                if (!list.isEmpty()) {
                    dkw a2 = a(i6);
                    for (int i9 = 0; i9 < list.size(); i9++) {
                        if (!a2.d(list.get(i9))) {
                            return false;
                        }
                    }
                    continue;
                } else {
                    continue;
                }
            } else if (a(obj, i6, i3, i2) && !a(obj, e2, a(i6))) {
                return false;
            }
        }
        if (!this.h || dkc.a(obj).e()) {
            return true;
        }
        return false;
    }

    private static boolean a(Object obj, int i2, dkw dkw) {
        return dkw.d(dlv.f(obj, h(i2)));
    }

    private final boolean a(Object obj, int i2, int i3) {
        return dlv.a(obj, (long) (f(i3) & 1048575)) == i2;
    }

    private static List a(Object obj, long j2) {
        return (List) dlv.f(obj, j2);
    }

    public final void c(Object obj) {
        int i2;
        int i3 = this.k;
        while (true) {
            i2 = this.l;
            if (i3 >= i2) {
                break;
            }
            long h2 = h(e(this.j[i3]));
            Object f2 = dlv.f(obj, h2);
            if (f2 != null) {
                dlv.a(obj, h2, this.o.d(f2));
            }
            i3++;
        }
        int length = this.j.length;
        while (i2 < length) {
            this.n.a(obj, (long) this.j[i2]);
            i2++;
        }
        dlw.b(obj);
        if (this.h) {
            dkc.b(obj);
        }
    }

    public final void b(Object obj, Object obj2) {
        if (obj2 != null) {
            for (int i2 = 0; i2 < this.c.length; i2 += 3) {
                int e2 = e(i2);
                long h2 = h(e2);
                int d2 = d(i2);
                switch (g(e2)) {
                    case 0:
                        if (!a(obj2, i2)) {
                            break;
                        } else {
                            dlv.a(obj, h2, dlv.e(obj2, h2));
                            b(obj, i2);
                            break;
                        }
                    case 1:
                        if (!a(obj2, i2)) {
                            break;
                        } else {
                            dlv.a(obj, h2, dlv.d(obj2, h2));
                            b(obj, i2);
                            break;
                        }
                    case 2:
                        if (!a(obj2, i2)) {
                            break;
                        } else {
                            dlv.a(obj, h2, dlv.b(obj2, h2));
                            b(obj, i2);
                            break;
                        }
                    case 3:
                        if (!a(obj2, i2)) {
                            break;
                        } else {
                            dlv.a(obj, h2, dlv.b(obj2, h2));
                            b(obj, i2);
                            break;
                        }
                    case 4:
                        if (!a(obj2, i2)) {
                            break;
                        } else {
                            dlv.a(obj, h2, dlv.a(obj2, h2));
                            b(obj, i2);
                            break;
                        }
                    case 5:
                        if (!a(obj2, i2)) {
                            break;
                        } else {
                            dlv.a(obj, h2, dlv.b(obj2, h2));
                            b(obj, i2);
                            break;
                        }
                    case 6:
                        if (!a(obj2, i2)) {
                            break;
                        } else {
                            dlv.a(obj, h2, dlv.a(obj2, h2));
                            b(obj, i2);
                            break;
                        }
                    case 7:
                        if (!a(obj2, i2)) {
                            break;
                        } else {
                            dlv.a(obj, h2, dlv.c(obj2, h2));
                            b(obj, i2);
                            break;
                        }
                    case 8:
                        if (!a(obj2, i2)) {
                            break;
                        } else {
                            dlv.a(obj, h2, dlv.f(obj2, h2));
                            b(obj, i2);
                            break;
                        }
                    case 9:
                        a(obj, obj2, i2);
                        break;
                    case 10:
                        if (!a(obj2, i2)) {
                            break;
                        } else {
                            dlv.a(obj, h2, dlv.f(obj2, h2));
                            b(obj, i2);
                            break;
                        }
                    case 11:
                        if (!a(obj2, i2)) {
                            break;
                        } else {
                            dlv.a(obj, h2, dlv.a(obj2, h2));
                            b(obj, i2);
                            break;
                        }
                    case 12:
                        if (!a(obj2, i2)) {
                            break;
                        } else {
                            dlv.a(obj, h2, dlv.a(obj2, h2));
                            b(obj, i2);
                            break;
                        }
                    case 13:
                        if (!a(obj2, i2)) {
                            break;
                        } else {
                            dlv.a(obj, h2, dlv.a(obj2, h2));
                            b(obj, i2);
                            break;
                        }
                    case 14:
                        if (!a(obj2, i2)) {
                            break;
                        } else {
                            dlv.a(obj, h2, dlv.b(obj2, h2));
                            b(obj, i2);
                            break;
                        }
                    case 15:
                        if (!a(obj2, i2)) {
                            break;
                        } else {
                            dlv.a(obj, h2, dlv.a(obj2, h2));
                            b(obj, i2);
                            break;
                        }
                    case 16:
                        if (!a(obj2, i2)) {
                            break;
                        } else {
                            dlv.a(obj, h2, dlv.b(obj2, h2));
                            b(obj, i2);
                            break;
                        }
                    case 17:
                        a(obj, obj2, i2);
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                        this.n.a(obj, obj2, h2);
                        break;
                    case 50:
                        dky.a(this.o, obj, obj2, h2);
                        break;
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                        if (!a(obj2, d2, i2)) {
                            break;
                        } else {
                            dlv.a(obj, h2, dlv.f(obj2, h2));
                            b(obj, d2, i2);
                            break;
                        }
                    case 60:
                        b(obj, obj2, i2);
                        break;
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                        if (!a(obj2, d2, i2)) {
                            break;
                        } else {
                            dlv.a(obj, h2, dlv.f(obj2, h2));
                            b(obj, d2, i2);
                            break;
                        }
                    case 68:
                        b(obj, obj2, i2);
                        break;
                }
            }
            dky.c(obj, obj2);
            if (this.h) {
                dky.b(obj, obj2);
                return;
            }
            return;
        }
        throw null;
    }

    public final void a(Object obj, byte[] bArr, int i2, int i3, dhy dhy) {
        if (!this.i) {
            a(obj, bArr, i2, i3, 0, dhy);
        } else {
            b(obj, bArr, i2, i3, dhy);
        }
    }

    private final void a(Object obj, Object obj2, int i2) {
        long h2 = h(e(i2));
        if (a(obj2, i2)) {
            Object f2 = dlv.f(obj, h2);
            Object f3 = dlv.f(obj2, h2);
            if (f2 != null && f3 != null) {
                dlv.a(obj, h2, djl.a(f2, f3));
                b(obj, i2);
            } else if (f3 != null) {
                dlv.a(obj, h2, f3);
                b(obj, i2);
            }
        }
    }

    private final void b(Object obj, Object obj2, int i2) {
        int e2 = e(i2);
        int d2 = d(i2);
        long h2 = h(e2);
        if (a(obj2, d2, i2)) {
            Object f2 = dlv.f(obj, h2);
            Object f3 = dlv.f(obj2, h2);
            if (f2 != null && f3 != null) {
                dlv.a(obj, h2, djl.a(f2, f3));
                b(obj, d2, i2);
            } else if (f3 != null) {
                dlv.a(obj, h2, f3);
                b(obj, d2, i2);
            }
        }
    }

    public final Object a() {
        return this.m.a(this.g);
    }

    static dkm a(dkh dkh, dkp dkp, djx djx, dlw dlw, dkc dkc, dke dke) {
        if (dkh instanceof dkv) {
            return a((dkv) dkh, dkp, djx, dlw, dkc, dke);
        }
        dlh dlh = (dlh) dkh;
        throw null;
    }

    /* JADX WARN: Type inference failed for: r23v6 */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: dkm.a(java.lang.Class, java.lang.String):java.lang.reflect.Field
     arg types: [java.lang.Class<?>, ?]
     candidates:
      dkm.a(int, int):int
      dkm.a(java.lang.Object, long):java.util.List
      dkm.a(java.lang.Object, int):boolean
      dkm.a(java.lang.Object, dmf):void
      dkm.a(java.lang.Object, java.lang.Object):boolean
      dkw.a(java.lang.Object, dmf):void
      dkw.a(java.lang.Object, java.lang.Object):boolean
      dkm.a(java.lang.Class, java.lang.String):java.lang.reflect.Field */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: dkm.a(java.lang.Class, java.lang.String):java.lang.reflect.Field
     arg types: [java.lang.Class<?>, java.lang.String]
     candidates:
      dkm.a(int, int):int
      dkm.a(java.lang.Object, long):java.util.List
      dkm.a(java.lang.Object, int):boolean
      dkm.a(java.lang.Object, dmf):void
      dkm.a(java.lang.Object, java.lang.Object):boolean
      dkw.a(java.lang.Object, dmf):void
      dkw.a(java.lang.Object, java.lang.Object):boolean
      dkm.a(java.lang.Class, java.lang.String):java.lang.reflect.Field */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static defpackage.dkm a(defpackage.dkv r36, defpackage.dkp r37, defpackage.djx r38, defpackage.dlw r39, defpackage.dkc r40, defpackage.dke r41) {
        /*
            r0 = r36
            int r1 = r36.c()
            r2 = 0
            r4 = 2
            if (r1 != r4) goto L_0x000c
            r11 = 1
            goto L_0x000e
        L_0x000c:
            r11 = 0
        L_0x000e:
            java.lang.String r1 = r0.b
            int r4 = r1.length()
            char r5 = r1.charAt(r2)
            r7 = 55296(0xd800, float:7.7486E-41)
            if (r5 < r7) goto L_0x0037
            r5 = r5 & 8191(0x1fff, float:1.1478E-41)
            r8 = r5
            r5 = 1
            r9 = 13
        L_0x0023:
            int r10 = r5 + 1
            char r5 = r1.charAt(r5)
            if (r5 < r7) goto L_0x0034
            r5 = r5 & 8191(0x1fff, float:1.1478E-41)
            int r5 = r5 << r9
            r8 = r8 | r5
            int r9 = r9 + 13
            r5 = r10
            goto L_0x0023
        L_0x0034:
            int r5 = r5 << r9
            r5 = r5 | r8
            goto L_0x0039
        L_0x0037:
            r10 = 1
        L_0x0039:
            int r8 = r10 + 1
            char r9 = r1.charAt(r10)
            if (r9 < r7) goto L_0x0059
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            r10 = 13
        L_0x0045:
            int r12 = r8 + 1
            char r8 = r1.charAt(r8)
            if (r8 < r7) goto L_0x0056
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            int r8 = r8 << r10
            r9 = r9 | r8
            int r10 = r10 + 13
            r8 = r12
            goto L_0x0045
        L_0x0056:
            int r8 = r8 << r10
            r9 = r9 | r8
            goto L_0x005a
        L_0x0059:
            r12 = r8
        L_0x005a:
            if (r9 != 0) goto L_0x0068
            int[] r8 = defpackage.dkm.a
            r16 = r8
            r8 = 0
            r9 = 0
            r10 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            goto L_0x01b4
        L_0x0068:
            int r8 = r12 + 1
            char r9 = r1.charAt(r12)
            if (r9 < r7) goto L_0x0089
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            r10 = 13
        L_0x0075:
            int r12 = r8 + 1
            char r8 = r1.charAt(r8)
            if (r8 < r7) goto L_0x0086
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            int r8 = r8 << r10
            r9 = r9 | r8
            int r10 = r10 + 13
            r8 = r12
            goto L_0x0075
        L_0x0086:
            int r8 = r8 << r10
            r8 = r8 | r9
            goto L_0x008b
        L_0x0089:
            r12 = r8
            r8 = r9
        L_0x008b:
            int r9 = r12 + 1
            char r10 = r1.charAt(r12)
            if (r10 < r7) goto L_0x00ab
            r10 = r10 & 8191(0x1fff, float:1.1478E-41)
            r12 = 13
        L_0x0097:
            int r13 = r9 + 1
            char r9 = r1.charAt(r9)
            if (r9 < r7) goto L_0x00a8
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r12
            r10 = r10 | r9
            int r12 = r12 + 13
            r9 = r13
            goto L_0x0097
        L_0x00a8:
            int r9 = r9 << r12
            r10 = r10 | r9
            goto L_0x00ac
        L_0x00ab:
            r13 = r9
        L_0x00ac:
            int r9 = r13 + 1
            char r12 = r1.charAt(r13)
            if (r12 < r7) goto L_0x00cd
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            r13 = 13
        L_0x00b8:
            int r14 = r9 + 1
            char r9 = r1.charAt(r9)
            if (r9 < r7) goto L_0x00c9
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r13
            r12 = r12 | r9
            int r13 = r13 + 13
            r9 = r14
            goto L_0x00b8
        L_0x00c9:
            int r9 = r9 << r13
            r9 = r9 | r12
            r12 = r9
            goto L_0x00ce
        L_0x00cd:
            r14 = r9
        L_0x00ce:
            int r9 = r14 + 1
            char r13 = r1.charAt(r14)
            if (r13 < r7) goto L_0x00ef
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            r14 = 13
        L_0x00da:
            int r15 = r9 + 1
            char r9 = r1.charAt(r9)
            if (r9 < r7) goto L_0x00eb
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r14
            r13 = r13 | r9
            int r14 = r14 + 13
            r9 = r15
            goto L_0x00da
        L_0x00eb:
            int r9 = r9 << r14
            r9 = r9 | r13
            r13 = r9
            goto L_0x00f0
        L_0x00ef:
            r15 = r9
        L_0x00f0:
            int r9 = r15 + 1
            char r14 = r1.charAt(r15)
            if (r14 < r7) goto L_0x0114
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            r15 = 13
        L_0x00fc:
            int r16 = r9 + 1
            char r9 = r1.charAt(r9)
            if (r9 < r7) goto L_0x010e
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r15
            r14 = r14 | r9
            int r15 = r15 + 13
            r9 = r16
            goto L_0x00fc
        L_0x010e:
            int r9 = r9 << r15
            r9 = r9 | r14
            r14 = r9
            r9 = r16
            goto L_0x0115
        L_0x0114:
        L_0x0115:
            int r15 = r9 + 1
            char r9 = r1.charAt(r9)
            if (r9 < r7) goto L_0x013a
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            r16 = 13
        L_0x0121:
            int r17 = r15 + 1
            char r15 = r1.charAt(r15)
            if (r15 < r7) goto L_0x0134
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r15 = r15 << r16
            r9 = r9 | r15
            int r16 = r16 + 13
            r15 = r17
            goto L_0x0121
        L_0x0134:
            int r15 = r15 << r16
            r9 = r9 | r15
            r15 = r17
            goto L_0x013b
        L_0x013a:
        L_0x013b:
            int r16 = r15 + 1
            char r15 = r1.charAt(r15)
            if (r15 < r7) goto L_0x016a
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            r17 = 13
            r35 = r16
            r16 = r15
            r15 = r35
        L_0x014d:
            int r18 = r15 + 1
            char r15 = r1.charAt(r15)
            if (r15 < r7) goto L_0x0161
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r15 = r15 << r17
            r16 = r16 | r15
            int r17 = r17 + 13
            r15 = r18
            goto L_0x014d
        L_0x0161:
            int r15 = r15 << r17
            r15 = r16 | r15
            r16 = r15
            r15 = r18
            goto L_0x0170
        L_0x016a:
            r35 = r16
            r16 = r15
            r15 = r35
        L_0x0170:
            int r17 = r15 + 1
            char r15 = r1.charAt(r15)
            if (r15 < r7) goto L_0x019d
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            r18 = 13
            r35 = r17
            r17 = r15
            r15 = r35
        L_0x0182:
            int r19 = r15 + 1
            char r15 = r1.charAt(r15)
            if (r15 < r7) goto L_0x0196
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r15 = r15 << r18
            r17 = r17 | r15
            int r18 = r18 + 13
            r15 = r19
            goto L_0x0182
        L_0x0196:
            int r15 = r15 << r18
            r15 = r17 | r15
            r17 = r19
            goto L_0x019e
        L_0x019d:
        L_0x019e:
            int r18 = r15 + r9
            int r2 = r18 + r16
            int[] r2 = new int[r2]
            int r16 = r8 + r8
            int r10 = r16 + r10
            r16 = r2
            r2 = r9
            r9 = r12
            r12 = r17
            r35 = r15
            r15 = r13
            r13 = r35
        L_0x01b4:
            sun.misc.Unsafe r6 = defpackage.dkm.b
            java.lang.Object[] r3 = r0.c
            dkk r7 = r0.a
            java.lang.Class r7 = r7.getClass()
            r21 = r10
            int r10 = r14 * 3
            int[] r10 = new int[r10]
            int r14 = r14 + r14
            java.lang.Object[] r14 = new java.lang.Object[r14]
            int r2 = r2 + r13
            r25 = r2
            r24 = r13
            r23 = r21
            r21 = 0
            r22 = 0
        L_0x01d2:
            if (r12 >= r4) goto L_0x0441
            int r26 = r12 + 1
            char r12 = r1.charAt(r12)
            r27 = r4
            r4 = 55296(0xd800, float:7.7486E-41)
            if (r12 < r4) goto L_0x0209
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            r28 = 13
            r35 = r26
            r26 = r12
            r12 = r35
        L_0x01eb:
            int r29 = r12 + 1
            char r12 = r1.charAt(r12)
            if (r12 < r4) goto L_0x0202
            r4 = r12 & 8191(0x1fff, float:1.1478E-41)
            int r4 = r4 << r28
            r26 = r26 | r4
            int r28 = r28 + 13
            r12 = r29
            r4 = 55296(0xd800, float:7.7486E-41)
            goto L_0x01eb
        L_0x0202:
            int r4 = r12 << r28
            r12 = r26 | r4
            r4 = r29
            goto L_0x020b
        L_0x0209:
            r4 = r26
        L_0x020b:
            int r26 = r4 + 1
            char r4 = r1.charAt(r4)
            r28 = r2
            r2 = 55296(0xd800, float:7.7486E-41)
            if (r4 < r2) goto L_0x0240
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r29 = 13
            r35 = r26
            r26 = r4
            r4 = r35
        L_0x0222:
            int r30 = r4 + 1
            char r4 = r1.charAt(r4)
            if (r4 < r2) goto L_0x0239
            r2 = r4 & 8191(0x1fff, float:1.1478E-41)
            int r2 = r2 << r29
            r26 = r26 | r2
            int r29 = r29 + 13
            r4 = r30
            r2 = 55296(0xd800, float:7.7486E-41)
            goto L_0x0222
        L_0x0239:
            int r2 = r4 << r29
            r4 = r26 | r2
            r2 = r30
            goto L_0x0242
        L_0x0240:
            r2 = r26
        L_0x0242:
            r26 = r13
            r13 = r4 & 255(0xff, float:3.57E-43)
            r29 = r11
            r11 = r4 & 1024(0x400, float:1.435E-42)
            if (r11 != 0) goto L_0x024d
            goto L_0x0255
        L_0x024d:
            int r11 = r22 + 1
            r16[r22] = r21
            r22 = r11
        L_0x0255:
            r11 = 51
            if (r13 >= r11) goto L_0x0368
            int r11 = r23 + 1
            r23 = r3[r23]
            r30 = r15
            r15 = r23
            java.lang.String r15 = (java.lang.String) r15
            java.lang.reflect.Field r15 = a(r7, r15)
            r33 = r9
            r9 = 9
            if (r13 != r9) goto L_0x026f
            goto L_0x02d9
        L_0x026f:
            r9 = 17
            if (r13 == r9) goto L_0x02d9
            r9 = 27
            if (r13 != r9) goto L_0x0279
            goto L_0x02c8
        L_0x0279:
            r9 = 49
            if (r13 == r9) goto L_0x02c8
            r9 = 12
            if (r13 == r9) goto L_0x02b2
            r9 = 30
            if (r13 == r9) goto L_0x02b2
            r9 = 44
            if (r13 == r9) goto L_0x02b2
            r9 = 50
            if (r13 != r9) goto L_0x02c7
            int r9 = r24 + 1
            r16[r24] = r21
            int r24 = r21 / 3
            int r24 = r24 + r24
            int r31 = r11 + 1
            r11 = r3[r11]
            r14[r24] = r11
            r11 = r4 & 2048(0x800, float:2.87E-42)
            if (r11 == 0) goto L_0x02ac
            int r11 = r31 + 1
            int r24 = r24 + 1
            r31 = r3[r31]
            r14[r24] = r31
            r24 = r9
            r9 = 1
            goto L_0x02e4
        L_0x02ac:
            r24 = r9
            r11 = r31
        L_0x02b0:
            r9 = 1
            goto L_0x02e4
        L_0x02b2:
            r9 = r5 & 1
            r0 = 1
            if (r9 != r0) goto L_0x02c7
            int r9 = r21 / 3
            int r31 = r11 + 1
            int r9 = r9 + r9
            int r9 = r9 + r0
            r0 = r3[r11]
            r14[r9] = r0
            r11 = r31
            r9 = 1
            goto L_0x02e4
        L_0x02c7:
            goto L_0x02b0
        L_0x02c8:
            int r0 = r21 / 3
            int r9 = r11 + 1
            int r0 = r0 + r0
            r18 = 1
            int r0 = r0 + 1
            r11 = r3[r11]
            r14[r0] = r11
            r11 = r9
            r9 = 1
            goto L_0x02e4
        L_0x02d9:
            int r0 = r21 / 3
            int r0 = r0 + r0
            r9 = 1
            int r0 = r0 + r9
            java.lang.Class r18 = r15.getType()
            r14[r0] = r18
        L_0x02e4:
            r0 = r10
            long r9 = r6.objectFieldOffset(r15)
            int r10 = (int) r9
            r9 = r5 & 1
            r15 = 1
            if (r9 == r15) goto L_0x02f4
            r34 = r8
        L_0x02f1:
            r8 = 0
            r9 = 0
            goto L_0x034b
        L_0x02f4:
            r9 = 17
            if (r13 > r9) goto L_0x0348
            int r9 = r2 + 1
            char r2 = r1.charAt(r2)
            r15 = 55296(0xd800, float:7.7486E-41)
            if (r2 < r15) goto L_0x0321
            r2 = r2 & 8191(0x1fff, float:1.1478E-41)
            r31 = 13
        L_0x0307:
            int r32 = r9 + 1
            char r9 = r1.charAt(r9)
            if (r9 < r15) goto L_0x031d
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r31
            r2 = r2 | r9
            int r31 = r31 + 13
            r9 = r32
            r15 = 55296(0xd800, float:7.7486E-41)
            goto L_0x0307
        L_0x031d:
            int r9 = r9 << r31
            r2 = r2 | r9
            goto L_0x0323
        L_0x0321:
            r32 = r9
        L_0x0323:
            int r9 = r8 + r8
            int r15 = r2 / 32
            int r9 = r9 + r15
            r15 = r3[r9]
            r34 = r8
            boolean r8 = r15 instanceof java.lang.reflect.Field
            if (r8 == 0) goto L_0x0333
            java.lang.reflect.Field r15 = (java.lang.reflect.Field) r15
            goto L_0x033d
        L_0x0333:
            java.lang.String r15 = (java.lang.String) r15
            java.lang.reflect.Field r15 = a(r7, r15)
            r3[r9] = r15
        L_0x033d:
            long r8 = r6.objectFieldOffset(r15)
            int r9 = (int) r8
            int r2 = r2 % 32
            r8 = r2
            r2 = r32
            goto L_0x034b
        L_0x0348:
            r34 = r8
            goto L_0x02f1
        L_0x034b:
            r15 = 18
            if (r13 >= r15) goto L_0x0350
        L_0x034f:
            goto L_0x0362
        L_0x0350:
            r15 = 49
            if (r13 > r15) goto L_0x034f
            int r15 = r25 + 1
            r16[r25] = r10
            r23 = r11
            r25 = r15
            r15 = 1
            r11 = r1
            goto L_0x0406
        L_0x0362:
            r23 = r11
            r15 = 1
            r11 = r1
            goto L_0x0406
        L_0x0368:
            r34 = r8
            r33 = r9
            r0 = r10
            r30 = r15
            int r8 = r2 + 1
            char r2 = r1.charAt(r2)
            r9 = 55296(0xd800, float:7.7486E-41)
            if (r2 >= r9) goto L_0x037f
            r10 = r8
            r11 = 55296(0xd800, float:7.7486E-41)
            goto L_0x039b
        L_0x037f:
            r2 = r2 & 8191(0x1fff, float:1.1478E-41)
            r9 = 13
        L_0x0384:
            int r10 = r8 + 1
            char r8 = r1.charAt(r8)
            r11 = 55296(0xd800, float:7.7486E-41)
            if (r8 < r11) goto L_0x0399
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            int r8 = r8 << r9
            r2 = r2 | r8
            int r9 = r9 + 13
            r8 = r10
            goto L_0x0384
        L_0x0399:
            int r8 = r8 << r9
            r2 = r2 | r8
        L_0x039b:
            int r8 = r13 + -51
            r9 = 9
            if (r8 != r9) goto L_0x03a2
            goto L_0x03bf
        L_0x03a2:
            r9 = 17
            if (r8 == r9) goto L_0x03bf
            r9 = 12
            if (r8 != r9) goto L_0x03bd
            r8 = r5 & 1
            r9 = 1
            if (r8 != r9) goto L_0x03bd
            int r8 = r21 / 3
            int r15 = r23 + 1
            int r8 = r8 + r8
            int r8 = r8 + r9
            r9 = r3[r23]
            r14[r8] = r9
            r23 = r15
            r15 = 1
            goto L_0x03cc
        L_0x03bd:
            r15 = 1
            goto L_0x03cc
        L_0x03bf:
            int r8 = r21 / 3
            int r9 = r23 + 1
            int r8 = r8 + r8
            r15 = 1
            int r8 = r8 + r15
            r18 = r3[r23]
            r14[r8] = r18
            r23 = r9
        L_0x03cc:
            int r2 = r2 + r2
            r8 = r3[r2]
            boolean r9 = r8 instanceof java.lang.reflect.Field
            if (r9 == 0) goto L_0x03d6
            java.lang.reflect.Field r8 = (java.lang.reflect.Field) r8
            goto L_0x03de
        L_0x03d6:
            java.lang.String r8 = (java.lang.String) r8
            java.lang.reflect.Field r8 = a(r7, r8)
            r3[r2] = r8
        L_0x03de:
            long r8 = r6.objectFieldOffset(r8)
            int r9 = (int) r8
            int r2 = r2 + 1
            r8 = r3[r2]
            boolean r11 = r8 instanceof java.lang.reflect.Field
            if (r11 == 0) goto L_0x03ee
            java.lang.reflect.Field r8 = (java.lang.reflect.Field) r8
            goto L_0x03f8
        L_0x03ee:
            java.lang.String r8 = (java.lang.String) r8
            java.lang.reflect.Field r8 = a(r7, r8)
            r3[r2] = r8
        L_0x03f8:
            r11 = r1
            long r1 = r6.objectFieldOffset(r8)
            int r2 = (int) r1
            r8 = 0
            r35 = r9
            r9 = r2
            r2 = r10
            r10 = r35
        L_0x0406:
            int r1 = r21 + 1
            r0[r21] = r12
            int r12 = r1 + 1
            r15 = r4 & 512(0x200, float:7.175E-43)
            if (r15 == 0) goto L_0x0413
            r15 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0414
        L_0x0413:
            r15 = 0
        L_0x0414:
            r4 = r4 & 256(0x100, float:3.59E-43)
            if (r4 == 0) goto L_0x041b
            r4 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x041d
        L_0x041b:
            r4 = 0
        L_0x041d:
            r4 = r4 | r15
            int r13 = r13 << 20
            r4 = r4 | r13
            r4 = r4 | r10
            r0[r1] = r4
            int r21 = r12 + 1
            int r1 = r8 << 20
            r1 = r1 | r9
            r0[r12] = r1
            r10 = r0
            r12 = r2
            r1 = r11
            r13 = r26
            r4 = r27
            r2 = r28
            r11 = r29
            r15 = r30
            r9 = r33
            r8 = r34
            r0 = r36
            goto L_0x01d2
        L_0x0441:
            r28 = r2
            r33 = r9
            r0 = r10
            r29 = r11
            r26 = r13
            r30 = r15
            dkm r1 = new dkm
            r2 = r36
            dkk r10 = r2.a
            r20 = 0
            r5 = r1
            r6 = r0
            r7 = r14
            r8 = r33
            r9 = r30
            r12 = r16
            r14 = r28
            r15 = r37
            r16 = r38
            r17 = r39
            r18 = r40
            r19 = r41
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dkm.a(dkv, dkp, djx, dlw, dkc, dke):dkm");
    }

    private final int d(int i2) {
        return this.c[i2];
    }

    private static boolean f(Object obj, long j2) {
        return ((Boolean) dlv.f(obj, j2)).booleanValue();
    }

    private static double b(Object obj, long j2) {
        return ((Double) dlv.f(obj, j2)).doubleValue();
    }

    private static float c(Object obj, long j2) {
        return ((Float) dlv.f(obj, j2)).floatValue();
    }

    private static int d(Object obj, long j2) {
        return ((Integer) dlv.f(obj, j2)).intValue();
    }

    private static long e(Object obj, long j2) {
        return ((Long) dlv.f(obj, j2)).longValue();
    }

    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v8, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int a(java.lang.Object r5, byte[] r6, int r7, int r8, int r9, long r10, defpackage.dhy r12) {
        /*
            r4 = this;
            sun.misc.Unsafe r0 = defpackage.dkm.b
            java.lang.Object r9 = r4.b(r9)
            java.lang.Object r1 = r0.getObject(r5, r10)
            dke r2 = r4.o
            boolean r2 = r2.c(r1)
            if (r2 == 0) goto L_0x0022
            dke r2 = r4.o
            java.lang.Object r2 = r2.a()
            dke r3 = r4.o
            r3.a(r2, r1)
            r0.putObject(r5, r10, r2)
            r1 = r2
            goto L_0x0023
        L_0x0022:
        L_0x0023:
            dke r5 = r4.o
            r5.e(r9)
            dke r5 = r4.o
            java.util.Map r5 = r5.a(r1)
            int r7 = defpackage.dhz.a(r6, r7, r12)
            int r9 = r12.a
            if (r9 < 0) goto L_0x0068
            int r10 = r8 - r7
            if (r9 > r10) goto L_0x0068
            int r9 = r9 + r7
        L_0x003b:
            r10 = 0
            if (r7 >= r9) goto L_0x005d
            int r11 = r7 + 1
            byte r7 = r6[r7]
            if (r7 >= 0) goto L_0x004b
            int r11 = defpackage.dhz.a(r7, r6, r11, r12)
            int r7 = r12.a
            goto L_0x004c
        L_0x004b:
        L_0x004c:
            int r0 = r7 >>> 3
            r1 = 1
            if (r0 == r1) goto L_0x005b
            r1 = 2
            if (r0 == r1) goto L_0x0059
            int r7 = defpackage.dhz.a(r7, r6, r11, r8, r12)
            goto L_0x003b
        L_0x0059:
            throw r10
        L_0x005b:
            throw r10
        L_0x005d:
            if (r7 != r9) goto L_0x0063
            r5.put(r10, r10)
            return r9
        L_0x0063:
            djn r5 = defpackage.djn.e()
            throw r5
        L_0x0068:
            djn r5 = defpackage.djn.a()
            goto L_0x006e
        L_0x006d:
            throw r5
        L_0x006e:
            goto L_0x006d
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dkm.a(java.lang.Object, byte[], int, int, int, long, dhy):int");
    }

    private final int a(Object obj, byte[] bArr, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j2, int i9, dhy dhy) {
        boolean z;
        Object obj2 = obj;
        byte[] bArr2 = bArr;
        int i10 = i2;
        int i11 = i4;
        int i12 = i5;
        int i13 = i6;
        long j3 = j2;
        int i14 = i9;
        dhy dhy2 = dhy;
        Unsafe unsafe = b;
        long j4 = (long) (this.c[i14 + 2] & 1048575);
        switch (i8) {
            case 51:
                if (i13 == 1) {
                    unsafe.putObject(obj2, j3, Double.valueOf(dhz.c(bArr, i2)));
                    unsafe.putInt(obj2, j4, i12);
                    return i10 + 8;
                }
                break;
            case 52:
                if (i13 == 5) {
                    unsafe.putObject(obj2, j3, Float.valueOf(dhz.d(bArr, i2)));
                    unsafe.putInt(obj2, j4, i12);
                    return i10 + 4;
                }
                break;
            case 53:
            case 54:
                if (i13 == 0) {
                    int b2 = dhz.b(bArr2, i10, dhy2);
                    unsafe.putObject(obj2, j3, Long.valueOf(dhy2.b));
                    unsafe.putInt(obj2, j4, i12);
                    return b2;
                }
                break;
            case 55:
            case 62:
                if (i13 == 0) {
                    int a2 = dhz.a(bArr2, i10, dhy2);
                    unsafe.putObject(obj2, j3, Integer.valueOf(dhy2.a));
                    unsafe.putInt(obj2, j4, i12);
                    return a2;
                }
                break;
            case 56:
            case 65:
                if (i13 == 1) {
                    unsafe.putObject(obj2, j3, Long.valueOf(dhz.b(bArr, i2)));
                    unsafe.putInt(obj2, j4, i12);
                    return i10 + 8;
                }
                break;
            case 57:
            case 64:
                if (i13 == 5) {
                    unsafe.putObject(obj2, j3, Integer.valueOf(dhz.a(bArr, i2)));
                    unsafe.putInt(obj2, j4, i12);
                    return i10 + 4;
                }
                break;
            case 58:
                if (i13 == 0) {
                    int b3 = dhz.b(bArr2, i10, dhy2);
                    if (dhy2.b != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    unsafe.putObject(obj2, j3, Boolean.valueOf(z));
                    unsafe.putInt(obj2, j4, i12);
                    return b3;
                }
                break;
            case 59:
                if (i13 == 2) {
                    int a3 = dhz.a(bArr2, i10, dhy2);
                    int i15 = dhy2.a;
                    if (i15 == 0) {
                        unsafe.putObject(obj2, j3, "");
                    } else if ((i7 & 536870912) != 0 && !dmb.a(bArr2, a3, a3 + i15)) {
                        throw djn.f();
                    } else {
                        unsafe.putObject(obj2, j3, new String(bArr2, a3, i15, djl.a));
                        a3 += i15;
                    }
                    unsafe.putInt(obj2, j4, i12);
                    return a3;
                }
                break;
            case 60:
                if (i13 == 2) {
                    int a4 = dhz.a(a(i14), bArr2, i10, i3, dhy2);
                    Object object = unsafe.getInt(obj2, j4) == i12 ? unsafe.getObject(obj2, j3) : null;
                    if (object != null) {
                        unsafe.putObject(obj2, j3, djl.a(object, dhy2.c));
                    } else {
                        unsafe.putObject(obj2, j3, dhy2.c);
                    }
                    unsafe.putInt(obj2, j4, i12);
                    return a4;
                }
                break;
            case 61:
                if (i13 == 2) {
                    int e2 = dhz.e(bArr2, i10, dhy2);
                    unsafe.putObject(obj2, j3, dhy2.c);
                    unsafe.putInt(obj2, j4, i12);
                    return e2;
                }
                break;
            case 63:
                if (i13 == 0) {
                    int a5 = dhz.a(bArr2, i10, dhy2);
                    int i16 = dhy2.a;
                    djh c2 = c(i14);
                    if (c2 == null || c2.a(i16)) {
                        unsafe.putObject(obj2, j3, Integer.valueOf(i16));
                        unsafe.putInt(obj2, j4, i12);
                    } else {
                        g(obj).a(i11, Long.valueOf((long) i16));
                    }
                    return a5;
                }
                break;
            case 66:
                if (i13 == 0) {
                    int a6 = dhz.a(bArr2, i10, dhy2);
                    unsafe.putObject(obj2, j3, Integer.valueOf(dil.a(dhy2.a)));
                    unsafe.putInt(obj2, j4, i12);
                    return a6;
                }
                break;
            case 67:
                if (i13 == 0) {
                    int b4 = dhz.b(bArr2, i10, dhy2);
                    unsafe.putObject(obj2, j3, Long.valueOf(dil.a(dhy2.b)));
                    unsafe.putInt(obj2, j4, i12);
                    return b4;
                }
                break;
            case 68:
                if (i13 == 3) {
                    int a7 = dhz.a(a(i14), bArr, i2, i3, (i11 & -8) | 4, dhy);
                    Object object2 = unsafe.getInt(obj2, j4) == i12 ? unsafe.getObject(obj2, j3) : null;
                    if (object2 != null) {
                        unsafe.putObject(obj2, j3, djl.a(object2, dhy2.c));
                    } else {
                        unsafe.putObject(obj2, j3, dhy2.c);
                    }
                    unsafe.putInt(obj2, j4, i12);
                    return a7;
                }
                break;
        }
        return i10;
    }

    /* JADX WARN: Type inference failed for: r35v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v67, types: [int] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0438, code lost:
        if (r1 == r0) goto L_0x03e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x03df, code lost:
        if (r1 == r0) goto L_0x03e1;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(java.lang.Object r31, byte[] r32, int r33, int r34, int r35, defpackage.dhy r36) {
        /*
            r30 = this;
            r15 = r30
            r0 = r31
            r13 = r32
            r14 = r34
            r12 = r35
            r10 = r36
            sun.misc.Unsafe r11 = defpackage.dkm.b
            r16 = 0
            r1 = r33
            r2 = 0
            r3 = -1
            r4 = 0
            r7 = 0
            r8 = -1
        L_0x0017:
            r17 = 0
            if (r1 >= r14) goto L_0x0553
            int r2 = r1 + 1
            byte r1 = r13[r1]
            if (r1 >= 0) goto L_0x002a
            int r1 = defpackage.dhz.a(r1, r13, r2, r10)
            int r2 = r10.a
            r5 = r2
            r2 = r1
            goto L_0x002d
        L_0x002a:
            r5 = r1
        L_0x002d:
            int r1 = r5 >>> 3
            r6 = r5 & 7
            r9 = 3
            if (r1 <= r3) goto L_0x003b
            int r4 = r4 / r9
            int r3 = r15.a(r1, r4)
            r4 = r3
            goto L_0x0040
        L_0x003b:
            int r3 = r15.i(r1)
            r4 = r3
        L_0x0040:
            r3 = -1
            if (r4 == r3) goto L_0x04df
            int[] r3 = r15.c
            int r19 = r4 + 1
            r3 = r3[r19]
            int r9 = g(r3)
            long r12 = h(r3)
            r20 = r2
            r2 = 17
            if (r9 > r2) goto L_0x039b
            int[] r2 = r15.c
            int r21 = r4 + 2
            r2 = r2[r21]
            int r21 = r2 >>> 20
            r22 = r5
            r5 = 1
            int r21 = r5 << r21
            r23 = 1048575(0xfffff, float:1.469367E-39)
            r2 = r2 & r23
            if (r2 != r8) goto L_0x006c
            goto L_0x007c
        L_0x006c:
            r14 = -1
            if (r8 != r14) goto L_0x0071
            goto L_0x0075
        L_0x0071:
            long r14 = (long) r8
            r11.putInt(r0, r14, r7)
        L_0x0075:
            long r7 = (long) r2
            int r7 = r11.getInt(r0, r7)
            r8 = r2
        L_0x007c:
            r2 = 5
            switch(r9) {
                case 0: goto L_0x0361;
                case 1: goto L_0x0336;
                case 2: goto L_0x0307;
                case 3: goto L_0x0307;
                case 4: goto L_0x02dc;
                case 5: goto L_0x02ad;
                case 6: goto L_0x0280;
                case 7: goto L_0x0249;
                case 8: goto L_0x0213;
                case 9: goto L_0x01c9;
                case 10: goto L_0x0198;
                case 11: goto L_0x02dc;
                case 12: goto L_0x014b;
                case 13: goto L_0x0280;
                case 14: goto L_0x02ad;
                case 15: goto L_0x011f;
                case 16: goto L_0x00ea;
                case 17: goto L_0x0091;
                default: goto L_0x0080;
            }
        L_0x0080:
            r15 = r30
            r13 = r32
            r14 = r1
            r12 = r4
            r19 = r8
            r9 = r20
            r8 = r22
            r1 = 2
            r18 = -1
            goto L_0x0390
        L_0x0091:
            r2 = 3
            if (r6 != r2) goto L_0x00da
            r15 = r30
            dkw r2 = r15.a(r4)
            int r3 = r1 << 3
            r5 = r3 | 4
            r14 = r1
            r1 = r2
            r9 = r20
            r2 = r32
            r3 = r9
            r9 = r4
            r4 = r34
            r6 = r22
            r19 = r8
            r8 = r6
            r6 = r36
            int r1 = defpackage.dhz.a(r1, r2, r3, r4, r5, r6)
            r2 = r7 & r21
            if (r2 != 0) goto L_0x00be
            java.lang.Object r2 = r10.c
            r11.putObject(r0, r12, r2)
            goto L_0x00cb
        L_0x00be:
            java.lang.Object r2 = r11.getObject(r0, r12)
            java.lang.Object r3 = r10.c
            java.lang.Object r2 = defpackage.djl.a(r2, r3)
            r11.putObject(r0, r12, r2)
        L_0x00cb:
            r7 = r7 | r21
            r13 = r32
            r12 = r35
            r2 = r8
            r4 = r9
            r3 = r14
            r8 = r19
            r14 = r34
            goto L_0x0017
        L_0x00da:
            r15 = r30
            r14 = r1
            r5 = r4
            r19 = r8
            r9 = r20
            r8 = r22
            r13 = r32
            r12 = r5
            goto L_0x01c4
        L_0x00ea:
            r15 = r30
            r14 = r1
            r5 = r4
            r19 = r8
            r9 = r20
            r8 = r22
            if (r6 != 0) goto L_0x011a
            r3 = r12
            r13 = r32
            int r9 = defpackage.dhz.b(r13, r9, r10)
            long r1 = r10.b
            long r22 = defpackage.dil.a(r1)
            r1 = r11
            r2 = r31
            r12 = r5
            r5 = r22
            r1.putLong(r2, r3, r5)
            r7 = r7 | r21
            r2 = r8
            r1 = r9
            r4 = r12
            r3 = r14
            r8 = r19
            r14 = r34
            r12 = r35
            goto L_0x0017
        L_0x011a:
            r13 = r32
            r12 = r5
            goto L_0x01c1
        L_0x011f:
            r15 = r30
            r14 = r1
            r19 = r8
            r9 = r20
            r8 = r22
            r28 = r12
            r13 = r32
            r12 = r4
            r3 = r28
            if (r6 != 0) goto L_0x01c1
            int r1 = defpackage.dhz.a(r13, r9, r10)
            int r2 = r10.a
            int r2 = defpackage.dil.a(r2)
            r11.putInt(r0, r3, r2)
            r7 = r7 | r21
            r2 = r8
            r4 = r12
            r3 = r14
            r8 = r19
            r14 = r34
            r12 = r35
            goto L_0x0017
        L_0x014b:
            r15 = r30
            r14 = r1
            r19 = r8
            r9 = r20
            r8 = r22
            r28 = r12
            r13 = r32
            r12 = r4
            r3 = r28
            if (r6 != 0) goto L_0x01c1
            int r1 = defpackage.dhz.a(r13, r9, r10)
            int r2 = r10.a
            djh r5 = r15.c(r12)
            if (r5 == 0) goto L_0x0188
            boolean r5 = r5.a(r2)
            if (r5 == 0) goto L_0x0170
            goto L_0x0188
        L_0x0170:
            dlm r3 = g(r31)
            long r4 = (long) r2
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            r3.a(r8, r2)
            r2 = r8
            r4 = r12
            r3 = r14
            r8 = r19
            r14 = r34
            r12 = r35
            goto L_0x0017
        L_0x0188:
            r11.putInt(r0, r3, r2)
            r7 = r7 | r21
            r2 = r8
            r4 = r12
            r3 = r14
            r8 = r19
            r14 = r34
            r12 = r35
            goto L_0x0017
        L_0x0198:
            r15 = r30
            r14 = r1
            r19 = r8
            r9 = r20
            r8 = r22
            r28 = r12
            r13 = r32
            r12 = r4
            r3 = r28
            r1 = 2
            if (r6 != r1) goto L_0x01c1
            int r1 = defpackage.dhz.e(r13, r9, r10)
            java.lang.Object r2 = r10.c
            r11.putObject(r0, r3, r2)
            r7 = r7 | r21
            r2 = r8
            r4 = r12
            r3 = r14
            r8 = r19
            r14 = r34
            r12 = r35
            goto L_0x0017
        L_0x01c1:
        L_0x01c4:
            r1 = 2
            r18 = -1
            goto L_0x0390
        L_0x01c9:
            r15 = r30
            r14 = r1
            r19 = r8
            r9 = r20
            r8 = r22
            r28 = r12
            r13 = r32
            r12 = r4
            r3 = r28
            r1 = 2
            if (r6 != r1) goto L_0x020b
            dkw r1 = r15.a(r12)
            r2 = r34
            r18 = -1
            int r1 = defpackage.dhz.a(r1, r13, r9, r2, r10)
            r5 = r7 & r21
            if (r5 != 0) goto L_0x01f2
            java.lang.Object r5 = r10.c
            r11.putObject(r0, r3, r5)
            goto L_0x01ff
        L_0x01f2:
            java.lang.Object r5 = r11.getObject(r0, r3)
            java.lang.Object r6 = r10.c
            java.lang.Object r5 = defpackage.djl.a(r5, r6)
            r11.putObject(r0, r3, r5)
        L_0x01ff:
            r7 = r7 | r21
            r4 = r12
            r3 = r14
            r12 = r35
            r14 = r2
            r2 = r8
            r8 = r19
            goto L_0x0017
        L_0x020b:
            r2 = r34
            r18 = -1
            r1 = 2
            goto L_0x0390
        L_0x0213:
            r15 = r30
            r2 = r34
            r14 = r1
            r19 = r8
            r9 = r20
            r8 = r22
            r18 = -1
            r28 = r12
            r13 = r32
            r12 = r4
            r4 = r28
            r1 = 2
            if (r6 != r1) goto L_0x038d
            r1 = 536870912(0x20000000, float:1.0842022E-19)
            r1 = r1 & r3
            if (r1 == 0) goto L_0x0234
            int r1 = defpackage.dhz.d(r13, r9, r10)
            goto L_0x0238
        L_0x0234:
            int r1 = defpackage.dhz.c(r13, r9, r10)
        L_0x0238:
            java.lang.Object r3 = r10.c
            r11.putObject(r0, r4, r3)
            r7 = r7 | r21
            r4 = r12
            r3 = r14
            r12 = r35
            r14 = r2
            r2 = r8
            r8 = r19
            goto L_0x0017
        L_0x0249:
            r15 = r30
            r2 = r34
            r14 = r1
            r19 = r8
            r9 = r20
            r8 = r22
            r1 = 2
            r18 = -1
            r28 = r12
            r13 = r32
            r12 = r4
            r3 = r28
            if (r6 != 0) goto L_0x038d
            int r1 = defpackage.dhz.b(r13, r9, r10)
            long r5 = r10.b
            r22 = 0
            int r9 = (r5 > r22 ? 1 : (r5 == r22 ? 0 : -1))
            if (r9 == 0) goto L_0x026e
            r5 = 1
            goto L_0x0270
        L_0x026e:
            r5 = 0
        L_0x0270:
            defpackage.dlv.a(r0, r3, r5)
            r7 = r7 | r21
            r4 = r12
            r3 = r14
            r12 = r35
            r14 = r2
            r2 = r8
            r8 = r19
            goto L_0x0017
        L_0x0280:
            r18 = -1
            r15 = r30
            r14 = r1
            r19 = r8
            r9 = r20
            r8 = r22
            r1 = 2
            r28 = r12
            r13 = r32
            r12 = r4
            r3 = r28
            if (r6 == r2) goto L_0x0297
            goto L_0x038d
        L_0x0297:
            int r1 = defpackage.dhz.a(r13, r9)
            r11.putInt(r0, r3, r1)
            int r1 = r9 + 4
            r7 = r7 | r21
            r2 = r8
            r4 = r12
            r3 = r14
            r8 = r19
            r14 = r34
            r12 = r35
            goto L_0x0017
        L_0x02ad:
            r15 = r30
            r14 = r1
            r19 = r8
            r9 = r20
            r8 = r22
            r1 = 2
            r18 = -1
            r28 = r12
            r13 = r32
            r12 = r4
            r3 = r28
            r2 = 1
            if (r6 != r2) goto L_0x038d
            long r5 = defpackage.dhz.b(r13, r9)
            r1 = r11
            r2 = r31
            r1.putLong(r2, r3, r5)
            int r1 = r9 + 8
            r7 = r7 | r21
            r2 = r8
            r4 = r12
            r3 = r14
            r8 = r19
            r14 = r34
            r12 = r35
            goto L_0x0017
        L_0x02dc:
            r15 = r30
            r14 = r1
            r19 = r8
            r9 = r20
            r8 = r22
            r1 = 2
            r18 = -1
            r28 = r12
            r13 = r32
            r12 = r4
            r3 = r28
            if (r6 != 0) goto L_0x038d
            int r1 = defpackage.dhz.a(r13, r9, r10)
            int r2 = r10.a
            r11.putInt(r0, r3, r2)
            r7 = r7 | r21
            r2 = r8
            r4 = r12
            r3 = r14
            r8 = r19
            r14 = r34
            r12 = r35
            goto L_0x0017
        L_0x0307:
            r15 = r30
            r14 = r1
            r19 = r8
            r9 = r20
            r8 = r22
            r1 = 2
            r18 = -1
            r28 = r12
            r13 = r32
            r12 = r4
            r3 = r28
            if (r6 != 0) goto L_0x038d
            int r9 = defpackage.dhz.b(r13, r9, r10)
            long r5 = r10.b
            r1 = r11
            r2 = r31
            r1.putLong(r2, r3, r5)
            r7 = r7 | r21
            r2 = r8
            r1 = r9
            r4 = r12
            r3 = r14
            r8 = r19
            r14 = r34
            r12 = r35
            goto L_0x0017
        L_0x0336:
            r15 = r30
            r14 = r1
            r19 = r8
            r9 = r20
            r8 = r22
            r1 = 2
            r18 = -1
            r28 = r12
            r13 = r32
            r12 = r4
            r3 = r28
            if (r6 != r2) goto L_0x038d
            float r1 = defpackage.dhz.d(r13, r9)
            defpackage.dlv.a(r0, r3, r1)
            int r1 = r9 + 4
            r7 = r7 | r21
            r2 = r8
            r4 = r12
            r3 = r14
            r8 = r19
            r14 = r34
            r12 = r35
            goto L_0x0017
        L_0x0361:
            r15 = r30
            r14 = r1
            r19 = r8
            r9 = r20
            r8 = r22
            r1 = 2
            r18 = -1
            r28 = r12
            r13 = r32
            r12 = r4
            r3 = r28
            r2 = 1
            if (r6 != r2) goto L_0x038d
            double r1 = defpackage.dhz.c(r13, r9)
            defpackage.dlv.a(r0, r3, r1)
            int r1 = r9 + 8
            r7 = r7 | r21
            r2 = r8
            r4 = r12
            r3 = r14
            r8 = r19
            r14 = r34
            r12 = r35
            goto L_0x0017
        L_0x038d:
        L_0x0390:
            r25 = r8
            r3 = r9
            r8 = r11
            r18 = r12
            r23 = r14
            r9 = r15
            goto L_0x03ec
        L_0x039b:
            r14 = r1
            r19 = r8
            r1 = 2
            r18 = -1
            r8 = r5
            r5 = r20
            r20 = r12
            r13 = r32
            r12 = r4
            r2 = 27
            if (r9 == r2) goto L_0x0470
            r2 = 49
            if (r9 > r2) goto L_0x0409
            long r3 = (long) r3
            r22 = 2
            r1 = r30
            r2 = r31
            r23 = r3
            r3 = r32
            r4 = r5
            r0 = r5
            r5 = r34
            r33 = r6
            r6 = r8
            r22 = r7
            r7 = r14
            r25 = r8
            r8 = r33
            r26 = r9
            r9 = r12
            r27 = r11
            r10 = r23
            r18 = r12
            r12 = r26
            r23 = r14
            r13 = r20
            r15 = r36
            int r1 = r1.a(r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13, r15)
            if (r1 != r0) goto L_0x03ef
        L_0x03e1:
            r9 = r30
            r0 = r31
            r3 = r1
            r7 = r22
            r8 = r27
        L_0x03ec:
            r10 = 2
            goto L_0x04ef
        L_0x03ef:
            r15 = r30
            r0 = r31
            r13 = r32
            r14 = r34
            r12 = r35
            r10 = r36
            r4 = r18
            r8 = r19
            r7 = r22
            r3 = r23
            r2 = r25
            r11 = r27
            goto L_0x0017
        L_0x0409:
            r0 = r5
            r33 = r6
            r22 = r7
            r25 = r8
            r26 = r9
            r27 = r11
            r18 = r12
            r23 = r14
            r1 = 50
            r10 = r26
            if (r10 == r1) goto L_0x043b
            r1 = r30
            r2 = r31
            r9 = r3
            r3 = r32
            r4 = r0
            r5 = r34
            r6 = r25
            r7 = r23
            r8 = r33
            r11 = r20
            r13 = r18
            r14 = r36
            int r1 = r1.a(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r13, r14)
            if (r1 != r0) goto L_0x03ef
            goto L_0x03e1
        L_0x043b:
            r1 = r33
            r10 = 2
            if (r1 != r10) goto L_0x0463
            r1 = r30
            r2 = r31
            r3 = r32
            r4 = r0
            r5 = r34
            r6 = r18
            r7 = r20
            r9 = r36
            int r1 = r1.a(r2, r3, r4, r5, r6, r7, r9)
            if (r1 != r0) goto L_0x03ef
            r9 = r30
            r0 = r31
            r3 = r1
            r7 = r22
            r8 = r27
            goto L_0x04ef
        L_0x0463:
            r9 = r30
            r4 = r0
            r11 = r18
            r8 = r27
            r0 = r31
            goto L_0x04d9
        L_0x0470:
            r0 = r5
            r1 = r6
            r22 = r7
            r25 = r8
            r27 = r11
            r18 = r12
            r23 = r14
            r10 = 2
            if (r1 != r10) goto L_0x04ce
            r4 = r0
            r1 = r20
            r8 = r27
            r0 = r31
            java.lang.Object r3 = r8.getObject(r0, r1)
            djk r3 = (defpackage.djk) r3
            boolean r5 = r3.a()
            if (r5 != 0) goto L_0x04a5
            int r5 = r3.size()
            if (r5 == 0) goto L_0x049a
            int r5 = r5 + r5
            goto L_0x049d
        L_0x049a:
            r5 = 10
        L_0x049d:
            djk r3 = r3.a(r5)
            r8.putObject(r0, r1, r3)
            goto L_0x04a6
        L_0x04a5:
        L_0x04a6:
            r6 = r3
            r9 = r30
            r11 = r18
            dkw r1 = r9.a(r11)
            r2 = r25
            r3 = r32
            r5 = r34
            r7 = r36
            int r1 = defpackage.dhz.a(r1, r2, r3, r4, r5, r6, r7)
            r13 = r32
            r14 = r34
            r12 = r35
            r10 = r36
            r15 = r9
            r4 = r11
            r7 = r22
            r3 = r23
            r11 = r8
            r8 = r19
            goto L_0x0017
        L_0x04ce:
            r9 = r30
            r4 = r0
            r11 = r18
            r8 = r27
            r0 = r31
        L_0x04d9:
            r3 = r4
            r18 = r11
            r7 = r22
            goto L_0x04ef
        L_0x04df:
            r23 = r1
            r4 = r2
            r25 = r5
            r22 = r7
            r19 = r8
            r8 = r11
            r9 = r15
            r10 = 2
            r3 = r4
            r18 = 0
        L_0x04ef:
            r11 = r35
            r12 = r25
            if (r12 == r11) goto L_0x04f6
            goto L_0x04fa
        L_0x04f6:
            if (r11 == 0) goto L_0x04fa
            goto L_0x055d
        L_0x04fa:
            boolean r1 = r9.h
            if (r1 == 0) goto L_0x052f
            r13 = r36
            dis r1 = r13.d
            dis r2 = defpackage.dis.a()
            if (r1 == r2) goto L_0x052c
            dkk r1 = r9.g
            dis r2 = r13.d
            r10 = r23
            diq r1 = r2.a(r1, r10)
            if (r1 != 0) goto L_0x0524
            dlm r5 = g(r31)
            r1 = r12
            r2 = r32
            r4 = r34
            r6 = r36
            int r1 = defpackage.dhz.a(r1, r2, r3, r4, r5, r6)
            goto L_0x0542
        L_0x0524:
            djc r0 = (defpackage.djc) r0
            r0.a()
            div r0 = r0.a
            throw r17
        L_0x052c:
            r10 = r23
            goto L_0x0533
        L_0x052f:
            r13 = r36
            r10 = r23
        L_0x0533:
            dlm r5 = g(r31)
            r1 = r12
            r2 = r32
            r4 = r34
            r6 = r36
            int r1 = defpackage.dhz.a(r1, r2, r3, r4, r5, r6)
        L_0x0542:
            r14 = r34
            r15 = r9
            r3 = r10
            r2 = r12
            r10 = r13
            r4 = r18
            r13 = r32
            r12 = r11
            r11 = r8
            r8 = r19
            goto L_0x0017
        L_0x0553:
            r22 = r7
            r19 = r8
            r8 = r11
            r11 = r12
            r9 = r15
            r10 = 2
            r3 = r1
            r12 = r2
        L_0x055d:
            r1 = r19
            r2 = -1
            if (r1 != r2) goto L_0x0563
            goto L_0x0567
        L_0x0563:
            long r1 = (long) r1
            r8.putInt(r0, r1, r7)
        L_0x0567:
            int r1 = r9.k
            r2 = r17
        L_0x056b:
            int r4 = r9.l
            if (r1 >= r4) goto L_0x05fd
            int[] r4 = r9.j
            r4 = r4[r1]
            int r5 = r9.d(r4)
            int r6 = r9.e(r4)
            long r6 = h(r6)
            java.lang.Object r6 = defpackage.dlv.f(r0, r6)
            if (r6 != 0) goto L_0x0586
            goto L_0x05f9
        L_0x0586:
            djh r7 = r9.c(r4)
            if (r7 == 0) goto L_0x05f9
            dke r8 = r9.o
            java.util.Map r6 = r8.a(r6)
            dke r8 = r9.o
            java.lang.Object r4 = r9.b(r4)
            r8.e(r4)
            java.util.Set r4 = r6.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L_0x05a3:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x05f9
            java.lang.Object r6 = r4.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r8 = r6.getValue()
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            boolean r8 = r7.a(r8)
            if (r8 != 0) goto L_0x05a3
            if (r2 == 0) goto L_0x05c2
            goto L_0x05c6
        L_0x05c2:
            dlm r2 = defpackage.dlm.a()
        L_0x05c6:
            java.lang.Object r8 = r6.getKey()
            java.lang.Object r13 = r6.getValue()
            int r8 = defpackage.dkc.a(r8, r13)
            dig r8 = defpackage.dik.d(r8)
            din r13 = r8.a
            java.lang.Object r14 = r6.getKey()     // Catch:{ IOException -> 0x05f2 }
            java.lang.Object r6 = r6.getValue()     // Catch:{ IOException -> 0x05f2 }
            defpackage.dkc.a(r13, r14, r6)     // Catch:{ IOException -> 0x05f2 }
            int r6 = defpackage.dme.a(r5, r10)
            dik r8 = r8.a()
            r2.a(r6, r8)
            r4.remove()
            goto L_0x05a3
        L_0x05f2:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L_0x05f9:
            int r1 = r1 + 1
            goto L_0x056b
        L_0x05fd:
            if (r2 == 0) goto L_0x0602
            defpackage.dlw.a(r0, r2)
        L_0x0602:
            if (r11 == 0) goto L_0x0610
            r0 = r34
            if (r3 > r0) goto L_0x060b
            if (r12 != r11) goto L_0x060b
            goto L_0x0614
        L_0x060b:
            djn r0 = defpackage.djn.e()
            throw r0
        L_0x0610:
            r0 = r34
            if (r3 != r0) goto L_0x0615
        L_0x0614:
            return r3
        L_0x0615:
            djn r0 = defpackage.djn.e()
            goto L_0x061b
        L_0x061a:
            throw r0
        L_0x061b:
            goto L_0x061a
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dkm.a(java.lang.Object, byte[], int, int, int, dhy):int");
    }

    /* JADX WARN: Type inference failed for: r3v17, types: [int] */
    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void b(java.lang.Object r27, byte[] r28, int r29, int r30, defpackage.dhy r31) {
        /*
            r26 = this;
            r15 = r26
            r14 = r27
            r12 = r28
            r13 = r30
            r11 = r31
            sun.misc.Unsafe r9 = defpackage.dkm.b
            r10 = -1
            r16 = 0
            r0 = r29
            r1 = -1
            r2 = 0
        L_0x0013:
            if (r0 >= r13) goto L_0x02e8
            int r3 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x0025
            int r0 = defpackage.dhz.a(r0, r12, r3, r11)
            int r3 = r11.a
            r8 = r0
            r17 = r3
            goto L_0x0028
        L_0x0025:
            r17 = r0
            r8 = r3
        L_0x0028:
            int r7 = r17 >>> 3
            r6 = r17 & 7
            if (r7 <= r1) goto L_0x0036
            int r2 = r2 / 3
            int r0 = r15.a(r7, r2)
            r4 = r0
            goto L_0x003b
        L_0x0036:
            int r0 = r15.i(r7)
            r4 = r0
        L_0x003b:
            if (r4 == r10) goto L_0x02bf
            int[] r0 = r15.c
            int r1 = r4 + 1
            r5 = r0[r1]
            int r3 = g(r5)
            long r1 = h(r5)
            r0 = 17
            r10 = 2
            if (r3 > r0) goto L_0x018a
            r0 = 1
            switch(r3) {
                case 0: goto L_0x0178;
                case 1: goto L_0x0165;
                case 2: goto L_0x014f;
                case 3: goto L_0x014f;
                case 4: goto L_0x013d;
                case 5: goto L_0x0127;
                case 6: goto L_0x0112;
                case 7: goto L_0x00f6;
                case 8: goto L_0x00db;
                case 9: goto L_0x00b6;
                case 10: goto L_0x00a5;
                case 11: goto L_0x013d;
                case 12: goto L_0x0093;
                case 13: goto L_0x0112;
                case 14: goto L_0x0127;
                case 15: goto L_0x007e;
                case 16: goto L_0x0060;
                default: goto L_0x0054;
            }
        L_0x0054:
            r10 = r4
        L_0x0055:
        L_0x0056:
            r24 = r7
            r3 = r8
            r8 = r9
            r7 = r14
            r9 = r15
            r18 = -1
            goto L_0x02bd
        L_0x0060:
            if (r6 != 0) goto L_0x0054
            int r6 = defpackage.dhz.b(r12, r8, r11)
            r19 = r1
            long r0 = r11.b
            long r21 = defpackage.dil.a(r0)
            r0 = r9
            r2 = r19
            r1 = r27
            r10 = r4
            r4 = r21
            r0.putLong(r1, r2, r4)
            r0 = r6
            r1 = r7
            r2 = r10
            r10 = -1
            goto L_0x0013
        L_0x007e:
            r2 = r1
            r10 = r4
            if (r6 != 0) goto L_0x0055
            int r0 = defpackage.dhz.a(r12, r8, r11)
            int r1 = r11.a
            int r1 = defpackage.dil.a(r1)
            r9.putInt(r14, r2, r1)
            r1 = r7
            r2 = r10
            r10 = -1
            goto L_0x0013
        L_0x0093:
            r2 = r1
            r10 = r4
            if (r6 != 0) goto L_0x0055
            int r0 = defpackage.dhz.a(r12, r8, r11)
            int r1 = r11.a
            r9.putInt(r14, r2, r1)
            r1 = r7
            r2 = r10
            r10 = -1
            goto L_0x0013
        L_0x00a5:
            r2 = r1
            if (r6 != r10) goto L_0x0116
            int r0 = defpackage.dhz.e(r12, r8, r11)
            java.lang.Object r1 = r11.c
            r9.putObject(r14, r2, r1)
            r2 = r4
            r1 = r7
            r10 = -1
            goto L_0x0013
        L_0x00b6:
            r2 = r1
            if (r6 != r10) goto L_0x0116
            dkw r0 = r15.a(r4)
            int r0 = defpackage.dhz.a(r0, r12, r8, r13, r11)
            java.lang.Object r1 = r9.getObject(r14, r2)
            if (r1 != 0) goto L_0x00cd
            java.lang.Object r1 = r11.c
            r9.putObject(r14, r2, r1)
            goto L_0x00d6
        L_0x00cd:
            java.lang.Object r5 = r11.c
            java.lang.Object r1 = defpackage.djl.a(r1, r5)
            r9.putObject(r14, r2, r1)
        L_0x00d6:
            r2 = r4
            r1 = r7
            r10 = -1
            goto L_0x0013
        L_0x00db:
            r2 = r1
            if (r6 != r10) goto L_0x0116
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r0 & r5
            if (r0 == 0) goto L_0x00e8
            int r0 = defpackage.dhz.d(r12, r8, r11)
            goto L_0x00ec
        L_0x00e8:
            int r0 = defpackage.dhz.c(r12, r8, r11)
        L_0x00ec:
            java.lang.Object r1 = r11.c
            r9.putObject(r14, r2, r1)
            r2 = r4
            r1 = r7
            r10 = -1
            goto L_0x0013
        L_0x00f6:
            r2 = r1
            if (r6 == 0) goto L_0x00fa
            goto L_0x0116
        L_0x00fa:
            int r1 = defpackage.dhz.b(r12, r8, r11)
            long r5 = r11.b
            r19 = 0
            int r8 = (r5 > r19 ? 1 : (r5 == r19 ? 0 : -1))
            if (r8 == 0) goto L_0x0107
            goto L_0x0109
        L_0x0107:
            r0 = 0
        L_0x0109:
            defpackage.dlv.a(r14, r2, r0)
            r0 = r1
            r2 = r4
            r1 = r7
            r10 = -1
            goto L_0x0013
        L_0x0112:
            r2 = r1
            r0 = 5
            if (r6 == r0) goto L_0x0119
        L_0x0116:
            r10 = r4
            goto L_0x0056
        L_0x0119:
            int r0 = defpackage.dhz.a(r12, r8)
            r9.putInt(r14, r2, r0)
            int r0 = r8 + 4
            r2 = r4
            r1 = r7
            r10 = -1
            goto L_0x0013
        L_0x0127:
            r2 = r1
            if (r6 != r0) goto L_0x0054
            long r5 = defpackage.dhz.b(r12, r8)
            r0 = r9
            r1 = r27
            r10 = r4
            r4 = r5
            r0.putLong(r1, r2, r4)
            int r0 = r8 + 8
            r1 = r7
            r2 = r10
            r10 = -1
            goto L_0x0013
        L_0x013d:
            r2 = r1
            r10 = r4
            if (r6 != 0) goto L_0x0055
            int r0 = defpackage.dhz.a(r12, r8, r11)
            int r1 = r11.a
            r9.putInt(r14, r2, r1)
            r1 = r7
            r2 = r10
            r10 = -1
            goto L_0x0013
        L_0x014f:
            r2 = r1
            r10 = r4
            if (r6 != 0) goto L_0x0055
            int r6 = defpackage.dhz.b(r12, r8, r11)
            long r4 = r11.b
            r0 = r9
            r1 = r27
            r0.putLong(r1, r2, r4)
            r0 = r6
            r1 = r7
            r2 = r10
            r10 = -1
            goto L_0x0013
        L_0x0165:
            r2 = r1
            r10 = r4
            r0 = 5
            if (r6 != r0) goto L_0x0055
            float r0 = defpackage.dhz.d(r12, r8)
            defpackage.dlv.a(r14, r2, r0)
            int r0 = r8 + 4
            r1 = r7
            r2 = r10
            r10 = -1
            goto L_0x0013
        L_0x0178:
            r2 = r1
            r10 = r4
            if (r6 != r0) goto L_0x0055
            double r0 = defpackage.dhz.c(r12, r8)
            defpackage.dlv.a(r14, r2, r0)
            int r0 = r8 + 8
            r1 = r7
            r2 = r10
            r10 = -1
            goto L_0x0013
        L_0x018a:
            r0 = 27
            if (r3 == r0) goto L_0x025b
            r0 = 49
            if (r3 > r0) goto L_0x01df
            r19 = r9
            long r9 = (long) r5
            r0 = r26
            r20 = r1
            r1 = r27
            r2 = r28
            r5 = r3
            r3 = r8
            r29 = r4
            r4 = r30
            r22 = r5
            r5 = r17
            r23 = r6
            r6 = r7
            r24 = r7
            r7 = r23
            r15 = r8
            r8 = r29
            r25 = r19
            r18 = -1
            r11 = r22
            r12 = r20
            r14 = r31
            int r0 = r0.a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            if (r0 == r15) goto L_0x01d4
            r15 = r26
            r14 = r27
            r12 = r28
            r2 = r29
            r13 = r30
            r11 = r31
            r1 = r24
            r9 = r25
            r10 = -1
            goto L_0x0013
        L_0x01d4:
            r9 = r26
            r7 = r27
            r10 = r29
            r2 = r0
            r8 = r25
            goto L_0x02c9
        L_0x01df:
            r20 = r1
            r22 = r3
            r29 = r4
            r23 = r6
            r24 = r7
            r15 = r8
            r25 = r9
            r18 = -1
            r0 = 50
            r9 = r22
            if (r9 == r0) goto L_0x0223
            r0 = r26
            r1 = r27
            r2 = r28
            r3 = r15
            r4 = r30
            r8 = r5
            r5 = r17
            r6 = r24
            r7 = r23
            r10 = r20
            r12 = r29
            r13 = r31
            int r0 = r0.a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 == r15) goto L_0x01d4
            r15 = r26
            r14 = r27
            r12 = r28
            r2 = r29
            r13 = r30
            r11 = r31
            r1 = r24
            r9 = r25
            r10 = -1
            goto L_0x0013
        L_0x0223:
            r0 = r23
            if (r0 != r10) goto L_0x0250
            r0 = r26
            r1 = r27
            r2 = r28
            r3 = r15
            r4 = r30
            r5 = r29
            r6 = r20
            r8 = r31
            int r0 = r0.a(r1, r2, r3, r4, r5, r6, r8)
            if (r0 == r15) goto L_0x01d4
            r15 = r26
            r14 = r27
            r12 = r28
            r2 = r29
            r13 = r30
            r11 = r31
            r1 = r24
            r9 = r25
            r10 = -1
            goto L_0x0013
        L_0x0250:
            r9 = r26
            r7 = r27
            r10 = r29
            r3 = r15
            r8 = r25
            goto L_0x02bd
        L_0x025b:
            r20 = r1
            r29 = r4
            r0 = r6
            r24 = r7
            r15 = r8
            r25 = r9
            r18 = -1
            if (r0 != r10) goto L_0x02b4
            r7 = r27
            r0 = r20
            r8 = r25
            java.lang.Object r2 = r8.getObject(r7, r0)
            djk r2 = (defpackage.djk) r2
            boolean r3 = r2.a()
            if (r3 != 0) goto L_0x028e
            int r3 = r2.size()
            if (r3 == 0) goto L_0x0283
            int r3 = r3 + r3
            goto L_0x0286
        L_0x0283:
            r3 = 10
        L_0x0286:
            djk r2 = r2.a(r3)
            r8.putObject(r7, r0, r2)
            goto L_0x028f
        L_0x028e:
        L_0x028f:
            r5 = r2
            r9 = r26
            r10 = r29
            r3 = r15
            dkw r0 = r9.a(r10)
            r1 = r17
            r2 = r28
            r4 = r30
            r6 = r31
            int r0 = defpackage.dhz.a(r0, r1, r2, r3, r4, r5, r6)
            r12 = r28
            r13 = r30
            r11 = r31
            r14 = r7
            r15 = r9
            r2 = r10
            r1 = r24
            r10 = -1
            r9 = r8
            goto L_0x0013
        L_0x02b4:
            r9 = r26
            r7 = r27
            r10 = r29
            r3 = r15
            r8 = r25
        L_0x02bd:
            r2 = r3
            goto L_0x02c9
        L_0x02bf:
            r24 = r7
            r3 = r8
            r8 = r9
            r7 = r14
            r9 = r15
            r18 = -1
            r2 = r3
            r10 = 0
        L_0x02c9:
            dlm r4 = g(r27)
            r0 = r17
            r1 = r28
            r3 = r30
            r5 = r31
            int r0 = defpackage.dhz.a(r0, r1, r2, r3, r4, r5)
            r12 = r28
            r13 = r30
            r11 = r31
            r14 = r7
            r15 = r9
            r2 = r10
            r1 = r24
            r10 = -1
            r9 = r8
            goto L_0x0013
        L_0x02e8:
            r9 = r15
            r1 = r30
            if (r0 != r1) goto L_0x02ee
            return
        L_0x02ee:
            djn r0 = defpackage.djn.e()
            goto L_0x02f4
        L_0x02f3:
            throw r0
        L_0x02f4:
            goto L_0x02f3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dkm.b(java.lang.Object, byte[], int, int, dhy):void");
    }

    private final int a(Object obj, byte[] bArr, int i2, int i3, int i4, int i5, int i6, int i7, long j2, int i8, long j3, dhy dhy) {
        boolean z;
        boolean z2;
        int i9;
        int i10;
        int i11;
        Object obj2 = obj;
        byte[] bArr2 = bArr;
        int i12 = i2;
        int i13 = i3;
        int i14 = i4;
        int i15 = i6;
        int i16 = i7;
        long j4 = j3;
        dhy dhy2 = dhy;
        djk djk = (djk) b.getObject(obj2, j4);
        if (!djk.a()) {
            int size = djk.size();
            if (size != 0) {
                i11 = size + size;
            } else {
                i11 = 10;
            }
            djk = djk.a(i11);
            b.putObject(obj2, j4, djk);
        }
        switch (i8) {
            case 18:
            case 35:
                if (i15 == 2) {
                    dip dip = (dip) djk;
                    int a2 = dhz.a(bArr2, i12, dhy2);
                    int i17 = dhy2.a + a2;
                    while (a2 < i17) {
                        dip.a(dhz.c(bArr2, a2));
                        a2 += 8;
                    }
                    if (a2 == i17) {
                        return a2;
                    }
                    throw djn.a();
                } else if (i15 == 1) {
                    dip dip2 = (dip) djk;
                    dip2.a(dhz.c(bArr, i2));
                    int i18 = i12 + 8;
                    while (i18 < i13) {
                        int a3 = dhz.a(bArr2, i18, dhy2);
                        if (i14 != dhy2.a) {
                            return i18;
                        }
                        dip2.a(dhz.c(bArr2, a3));
                        i18 = a3 + 8;
                    }
                    return i18;
                }
                break;
            case 19:
            case 36:
                if (i15 == 2) {
                    dix dix = (dix) djk;
                    int a4 = dhz.a(bArr2, i12, dhy2);
                    int i19 = dhy2.a + a4;
                    while (a4 < i19) {
                        dix.a(dhz.d(bArr2, a4));
                        a4 += 4;
                    }
                    if (a4 == i19) {
                        return a4;
                    }
                    throw djn.a();
                } else if (i15 == 5) {
                    dix dix2 = (dix) djk;
                    dix2.a(dhz.d(bArr, i2));
                    int i20 = i12 + 4;
                    while (i20 < i13) {
                        int a5 = dhz.a(bArr2, i20, dhy2);
                        if (i14 != dhy2.a) {
                            return i20;
                        }
                        dix2.a(dhz.d(bArr2, a5));
                        i20 = a5 + 4;
                    }
                    return i20;
                }
                break;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i15 == 2) {
                    djy djy = (djy) djk;
                    int a6 = dhz.a(bArr2, i12, dhy2);
                    int i21 = dhy2.a + a6;
                    while (a6 < i21) {
                        a6 = dhz.b(bArr2, a6, dhy2);
                        djy.a(dhy2.b);
                    }
                    if (a6 == i21) {
                        return a6;
                    }
                    throw djn.a();
                } else if (i15 == 0) {
                    djy djy2 = (djy) djk;
                    int b2 = dhz.b(bArr2, i12, dhy2);
                    djy2.a(dhy2.b);
                    while (b2 < i13) {
                        int a7 = dhz.a(bArr2, b2, dhy2);
                        if (i14 != dhy2.a) {
                            return b2;
                        }
                        b2 = dhz.b(bArr2, a7, dhy2);
                        djy2.a(dhy2.b);
                    }
                    return b2;
                }
                break;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i15 == 2) {
                    return dhz.a(bArr2, i12, djk, dhy2);
                }
                if (i15 == 0) {
                    return dhz.a(i4, bArr, i2, i3, djk, dhy);
                }
                break;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i15 == 2) {
                    djy djy3 = (djy) djk;
                    int a8 = dhz.a(bArr2, i12, dhy2);
                    int i22 = dhy2.a + a8;
                    while (a8 < i22) {
                        djy3.a(dhz.b(bArr2, a8));
                        a8 += 8;
                    }
                    if (a8 == i22) {
                        return a8;
                    }
                    throw djn.a();
                } else if (i15 == 1) {
                    djy djy4 = (djy) djk;
                    djy4.a(dhz.b(bArr, i2));
                    int i23 = i12 + 8;
                    while (i23 < i13) {
                        int a9 = dhz.a(bArr2, i23, dhy2);
                        if (i14 != dhy2.a) {
                            return i23;
                        }
                        djy4.a(dhz.b(bArr2, a9));
                        i23 = a9 + 8;
                    }
                    return i23;
                }
                break;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i15 == 2) {
                    djf djf = (djf) djk;
                    int a10 = dhz.a(bArr2, i12, dhy2);
                    int i24 = dhy2.a + a10;
                    while (a10 < i24) {
                        djf.d(dhz.a(bArr2, a10));
                        a10 += 4;
                    }
                    if (a10 == i24) {
                        return a10;
                    }
                    throw djn.a();
                } else if (i15 == 5) {
                    djf djf2 = (djf) djk;
                    djf2.d(dhz.a(bArr, i2));
                    int i25 = i12 + 4;
                    while (i25 < i13) {
                        int a11 = dhz.a(bArr2, i25, dhy2);
                        if (i14 != dhy2.a) {
                            return i25;
                        }
                        djf2.d(dhz.a(bArr2, a11));
                        i25 = a11 + 4;
                    }
                    return i25;
                }
                break;
            case 25:
            case 42:
                if (i15 == 2) {
                    dib dib = (dib) djk;
                    int a12 = dhz.a(bArr2, i12, dhy2);
                    int i26 = dhy2.a + a12;
                    while (a12 < i26) {
                        a12 = dhz.b(bArr2, a12, dhy2);
                        dib.a(dhy2.b != 0);
                    }
                    if (a12 == i26) {
                        return a12;
                    }
                    throw djn.a();
                } else if (i15 == 0) {
                    dib dib2 = (dib) djk;
                    int b3 = dhz.b(bArr2, i12, dhy2);
                    if (dhy2.b != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    dib2.a(z);
                    while (b3 < i13) {
                        int a13 = dhz.a(bArr2, b3, dhy2);
                        if (i14 != dhy2.a) {
                            return b3;
                        }
                        b3 = dhz.b(bArr2, a13, dhy2);
                        if (dhy2.b != 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        dib2.a(z2);
                    }
                    return b3;
                }
                break;
            case 26:
                if (i15 == 2) {
                    if ((j2 & 536870912) != 0) {
                        int a14 = dhz.a(bArr2, i12, dhy2);
                        int i27 = dhy2.a;
                        if (i27 >= 0) {
                            if (i27 == 0) {
                                djk.add("");
                            } else {
                                int i28 = a14 + i27;
                                if (dmb.a(bArr2, a14, i28)) {
                                    djk.add(new String(bArr2, a14, i27, djl.a));
                                    a14 = i28;
                                } else {
                                    throw djn.f();
                                }
                            }
                            while (i12 < i13) {
                                int a15 = dhz.a(bArr2, i12, dhy2);
                                if (i14 != dhy2.a) {
                                    break;
                                } else {
                                    i12 = dhz.a(bArr2, a15, dhy2);
                                    int i29 = dhy2.a;
                                    if (i29 < 0) {
                                        throw djn.b();
                                    } else if (i29 == 0) {
                                        djk.add("");
                                    } else {
                                        int i30 = i12 + i29;
                                        if (dmb.a(bArr2, i12, i30)) {
                                            djk.add(new String(bArr2, i12, i29, djl.a));
                                            i12 = i30;
                                        } else {
                                            throw djn.f();
                                        }
                                    }
                                }
                            }
                            break;
                        } else {
                            throw djn.b();
                        }
                    } else {
                        int a16 = dhz.a(bArr2, i12, dhy2);
                        int i31 = dhy2.a;
                        if (i31 >= 0) {
                            if (i31 != 0) {
                                djk.add(new String(bArr2, a16, i31, djl.a));
                                a16 += i31;
                            } else {
                                djk.add("");
                            }
                            while (i12 < i13) {
                                int a17 = dhz.a(bArr2, i12, dhy2);
                                if (i14 != dhy2.a) {
                                    break;
                                } else {
                                    int i32 = dhz.a(bArr2, a17, dhy2);
                                    int i33 = dhy2.a;
                                    if (i33 < 0) {
                                        throw djn.b();
                                    } else if (i33 != 0) {
                                        djk.add(new String(bArr2, i32, i33, djl.a));
                                        i32 += i33;
                                    } else {
                                        djk.add("");
                                    }
                                }
                            }
                            break;
                        } else {
                            throw djn.b();
                        }
                    }
                }
                break;
            case 27:
                if (i15 == 2) {
                    return dhz.a(a(i16), i4, bArr, i2, i3, djk, dhy);
                }
                break;
            case 28:
                if (i15 == 2) {
                    int a18 = dhz.a(bArr2, i12, dhy2);
                    int i34 = dhy2.a;
                    if (i34 < 0) {
                        throw djn.b();
                    } else if (i34 <= bArr2.length - a18) {
                        if (i34 != 0) {
                            djk.add(dik.a(bArr2, a18, i34));
                            a18 += i34;
                        } else {
                            djk.add(dik.b);
                        }
                        while (i9 < i13) {
                            int a19 = dhz.a(bArr2, i9, dhy2);
                            if (i14 != dhy2.a) {
                                return i9;
                            }
                            i9 = dhz.a(bArr2, a19, dhy2);
                            int i35 = dhy2.a;
                            if (i35 < 0) {
                                throw djn.b();
                            } else if (i35 > bArr2.length - i9) {
                                throw djn.a();
                            } else if (i35 != 0) {
                                djk.add(dik.a(bArr2, i9, i35));
                                i9 += i35;
                            } else {
                                djk.add(dik.b);
                            }
                        }
                        return i9;
                    } else {
                        throw djn.a();
                    }
                }
                break;
            case 30:
            case 44:
                if (i15 == 2) {
                    i10 = dhz.a(bArr2, i12, djk, dhy2);
                } else if (i15 == 0) {
                    i10 = dhz.a(i4, bArr, i2, i3, djk, dhy);
                }
                dje dje = (dje) obj2;
                dlm dlm = dje.A;
                if (dlm == dlm.a) {
                    dlm = null;
                }
                dlm dlm2 = (dlm) dky.a(i5, djk, c(i16), dlm);
                if (dlm2 == null) {
                    return i10;
                }
                dje.A = dlm2;
                return i10;
            case 33:
            case 47:
                if (i15 == 2) {
                    djf djf3 = (djf) djk;
                    int a20 = dhz.a(bArr2, i12, dhy2);
                    int i36 = dhy2.a + a20;
                    while (a20 < i36) {
                        a20 = dhz.a(bArr2, a20, dhy2);
                        djf3.d(dil.a(dhy2.a));
                    }
                    if (a20 == i36) {
                        return a20;
                    }
                    throw djn.a();
                } else if (i15 == 0) {
                    djf djf4 = (djf) djk;
                    int a21 = dhz.a(bArr2, i12, dhy2);
                    djf4.d(dil.a(dhy2.a));
                    while (a21 < i13) {
                        int a22 = dhz.a(bArr2, a21, dhy2);
                        if (i14 != dhy2.a) {
                            return a21;
                        }
                        a21 = dhz.a(bArr2, a22, dhy2);
                        djf4.d(dil.a(dhy2.a));
                    }
                    return a21;
                }
                break;
            case 34:
            case 48:
                if (i15 == 2) {
                    djy djy5 = (djy) djk;
                    int a23 = dhz.a(bArr2, i12, dhy2);
                    int i37 = dhy2.a + a23;
                    while (a23 < i37) {
                        a23 = dhz.b(bArr2, a23, dhy2);
                        djy5.a(dil.a(dhy2.b));
                    }
                    if (a23 == i37) {
                        return a23;
                    }
                    throw djn.a();
                } else if (i15 == 0) {
                    djy djy6 = (djy) djk;
                    int b4 = dhz.b(bArr2, i12, dhy2);
                    djy6.a(dil.a(dhy2.b));
                    while (b4 < i13) {
                        int a24 = dhz.a(bArr2, b4, dhy2);
                        if (i14 != dhy2.a) {
                            return b4;
                        }
                        b4 = dhz.b(bArr2, a24, dhy2);
                        djy6.a(dil.a(dhy2.b));
                    }
                    return b4;
                }
                break;
            default:
                if (i15 == 3) {
                    dkw a25 = a(i16);
                    int i38 = (i14 & -8) | 4;
                    int a26 = dhz.a(a25, bArr, i2, i3, i38, dhy);
                    djk.add(dhy2.c);
                    while (a26 < i13) {
                        int a27 = dhz.a(bArr2, a26, dhy2);
                        if (i14 != dhy2.a) {
                            return a26;
                        }
                        a26 = dhz.a(a25, bArr, a27, i3, i38, dhy);
                        djk.add(dhy2.c);
                    }
                    return a26;
                }
                break;
        }
        return i12;
    }

    private final int i(int i2) {
        if (i2 < this.e || i2 > this.f) {
            return -1;
        }
        return b(i2, 0);
    }

    private final int a(int i2, int i3) {
        if (i2 < this.e || i2 > this.f) {
            return -1;
        }
        return b(i2, i3);
    }

    private final int f(int i2) {
        return this.c[i2 + 2];
    }

    private static Field a(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e2) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40 + String.valueOf(name).length() + String.valueOf(arrays).length());
            sb.append("Field ");
            sb.append(str);
            sb.append(" for ");
            sb.append(name);
            sb.append(" not found. Known fields are ");
            sb.append(arrays);
            throw new RuntimeException(sb.toString());
        }
    }

    private final void b(Object obj, int i2) {
        if (!this.i) {
            int f2 = f(i2);
            long j2 = (long) (1048575 & f2);
            dlv.a(obj, j2, (1 << (f2 >>> 20)) | dlv.a(obj, j2));
        }
    }

    private final void b(Object obj, int i2, int i3) {
        dlv.a(obj, (long) (f(i3) & 1048575), i2);
    }

    private final int b(int i2, int i3) {
        int length = (this.c.length / 3) - 1;
        while (i3 <= length) {
            int i4 = (length + i3) >>> 1;
            int i5 = i4 * 3;
            int d2 = d(i5);
            if (i2 == d2) {
                return i5;
            }
            if (i2 < d2) {
                length = i4 - 1;
            } else {
                i3 = i4 + 1;
            }
        }
        return -1;
    }

    private final int e(int i2) {
        return this.c[i2 + 1];
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: java.util.Map$Entry} */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: dky.b(int, java.util.List, dmf, boolean):void
     arg types: [int, java.util.List, dmf, int]
     candidates:
      dky.b(int, java.util.List, dmf, dkw):void
      dky.b(int, java.util.List, dmf, boolean):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: dky.a(int, java.util.List, dmf, boolean):void
     arg types: [int, java.util.List, dmf, int]
     candidates:
      dky.a(int, java.util.List, djh, java.lang.Object):java.lang.Object
      dky.a(int, java.util.List, dmf, dkw):void
      dky.a(dke, java.lang.Object, java.lang.Object, long):void
      dky.a(int, java.util.List, dmf, boolean):void */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x0546  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void b(java.lang.Object r19, defpackage.dmf r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            boolean r3 = r0.h
            if (r3 == 0) goto L_0x0020
            div r3 = defpackage.dkc.a(r19)
            boolean r5 = r3.a()
            if (r5 != 0) goto L_0x001f
            java.util.Iterator r3 = r3.d()
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L_0x0022
        L_0x001f:
        L_0x0020:
            r3 = 0
            r5 = 0
        L_0x0022:
            int[] r6 = r0.c
            int r6 = r6.length
            sun.misc.Unsafe r7 = defpackage.dkm.b
            r8 = -1
            r8 = r5
            r5 = 0
            r10 = -1
            r11 = 0
        L_0x002c:
            if (r5 >= r6) goto L_0x0543
            int r12 = r0.e(r5)
            int r13 = r0.d(r5)
            int r14 = g(r12)
            boolean r15 = r0.i
            r4 = 1
            if (r15 == 0) goto L_0x0041
        L_0x003f:
            r9 = 0
            goto L_0x0062
        L_0x0041:
            r15 = 17
            if (r14 > r15) goto L_0x003f
            int[] r15 = r0.c
            int r16 = r5 + 2
            r15 = r15[r16]
            r16 = 1048575(0xfffff, float:1.469367E-39)
            r9 = r15 & r16
            if (r9 == r10) goto L_0x0058
            long r10 = (long) r9
            int r11 = r7.getInt(r1, r10)
            goto L_0x0059
        L_0x0058:
            r9 = r10
        L_0x0059:
            int r10 = r15 >>> 20
            int r10 = r4 << r10
            r17 = r10
            r10 = r9
            r9 = r17
        L_0x0062:
            if (r8 == 0) goto L_0x007c
            int r15 = defpackage.dkc.a(r8)
            if (r15 > r13) goto L_0x007c
            defpackage.dkc.b(r8)
            boolean r8 = r3.hasNext()
            if (r8 == 0) goto L_0x007a
            java.lang.Object r8 = r3.next()
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8
            goto L_0x0062
        L_0x007a:
            r8 = 0
            goto L_0x0062
        L_0x007c:
            r15 = r5
            long r4 = h(r12)
            switch(r14) {
                case 0: goto L_0x0532;
                case 1: goto L_0x0525;
                case 2: goto L_0x0518;
                case 3: goto L_0x050b;
                case 4: goto L_0x04fe;
                case 5: goto L_0x04f1;
                case 6: goto L_0x04e4;
                case 7: goto L_0x04d7;
                case 8: goto L_0x04c9;
                case 9: goto L_0x04b7;
                case 10: goto L_0x04a7;
                case 11: goto L_0x0499;
                case 12: goto L_0x048b;
                case 13: goto L_0x047d;
                case 14: goto L_0x046f;
                case 15: goto L_0x0461;
                case 16: goto L_0x0453;
                case 17: goto L_0x0441;
                case 18: goto L_0x0430;
                case 19: goto L_0x041f;
                case 20: goto L_0x040e;
                case 21: goto L_0x03fd;
                case 22: goto L_0x03ec;
                case 23: goto L_0x03db;
                case 24: goto L_0x03ca;
                case 25: goto L_0x03b9;
                case 26: goto L_0x03a8;
                case 27: goto L_0x0393;
                case 28: goto L_0x0382;
                case 29: goto L_0x0370;
                case 30: goto L_0x035e;
                case 31: goto L_0x034c;
                case 32: goto L_0x033a;
                case 33: goto L_0x0328;
                case 34: goto L_0x0316;
                case 35: goto L_0x0304;
                case 36: goto L_0x02f2;
                case 37: goto L_0x02e0;
                case 38: goto L_0x02ce;
                case 39: goto L_0x02bc;
                case 40: goto L_0x02aa;
                case 41: goto L_0x0298;
                case 42: goto L_0x0286;
                case 43: goto L_0x0274;
                case 44: goto L_0x0262;
                case 45: goto L_0x0250;
                case 46: goto L_0x023e;
                case 47: goto L_0x022c;
                case 48: goto L_0x021a;
                case 49: goto L_0x0205;
                case 50: goto L_0x01fa;
                case 51: goto L_0x01e6;
                case 52: goto L_0x01d2;
                case 53: goto L_0x01be;
                case 54: goto L_0x01aa;
                case 55: goto L_0x0196;
                case 56: goto L_0x0182;
                case 57: goto L_0x016e;
                case 58: goto L_0x015a;
                case 59: goto L_0x0146;
                case 60: goto L_0x012e;
                case 61: goto L_0x0118;
                case 62: goto L_0x0104;
                case 63: goto L_0x00f0;
                case 64: goto L_0x00dc;
                case 65: goto L_0x00c8;
                case 66: goto L_0x00b4;
                case 67: goto L_0x00a0;
                case 68: goto L_0x0088;
                default: goto L_0x0084;
            }
        L_0x0084:
            r12 = r15
            r14 = 0
            goto L_0x053e
        L_0x0088:
            r12 = r15
            boolean r9 = r0.a(r1, r13, r12)
            if (r9 == 0) goto L_0x009d
            java.lang.Object r4 = r7.getObject(r1, r4)
            dkw r5 = r0.a(r12)
            r2.b(r13, r4, r5)
            r14 = 0
            goto L_0x053e
        L_0x009d:
            r14 = 0
            goto L_0x053e
        L_0x00a0:
            r12 = r15
            boolean r9 = r0.a(r1, r13, r12)
            if (r9 == 0) goto L_0x00b1
            long r4 = e(r1, r4)
            r2.e(r13, r4)
            r14 = 0
            goto L_0x053e
        L_0x00b1:
            r14 = 0
            goto L_0x053e
        L_0x00b4:
            r12 = r15
            boolean r9 = r0.a(r1, r13, r12)
            if (r9 == 0) goto L_0x00c5
            int r4 = d(r1, r4)
            r2.f(r13, r4)
            r14 = 0
            goto L_0x053e
        L_0x00c5:
            r14 = 0
            goto L_0x053e
        L_0x00c8:
            r12 = r15
            boolean r9 = r0.a(r1, r13, r12)
            if (r9 == 0) goto L_0x00d9
            long r4 = e(r1, r4)
            r2.b(r13, r4)
            r14 = 0
            goto L_0x053e
        L_0x00d9:
            r14 = 0
            goto L_0x053e
        L_0x00dc:
            r12 = r15
            boolean r9 = r0.a(r1, r13, r12)
            if (r9 == 0) goto L_0x00ed
            int r4 = d(r1, r4)
            r2.a(r13, r4)
            r14 = 0
            goto L_0x053e
        L_0x00ed:
            r14 = 0
            goto L_0x053e
        L_0x00f0:
            r12 = r15
            boolean r9 = r0.a(r1, r13, r12)
            if (r9 == 0) goto L_0x0101
            int r4 = d(r1, r4)
            r2.b(r13, r4)
            r14 = 0
            goto L_0x053e
        L_0x0101:
            r14 = 0
            goto L_0x053e
        L_0x0104:
            r12 = r15
            boolean r9 = r0.a(r1, r13, r12)
            if (r9 == 0) goto L_0x0115
            int r4 = d(r1, r4)
            r2.e(r13, r4)
            r14 = 0
            goto L_0x053e
        L_0x0115:
            r14 = 0
            goto L_0x053e
        L_0x0118:
            r12 = r15
            boolean r9 = r0.a(r1, r13, r12)
            if (r9 == 0) goto L_0x012b
            java.lang.Object r4 = r7.getObject(r1, r4)
            dik r4 = (defpackage.dik) r4
            r2.a(r13, r4)
            r14 = 0
            goto L_0x053e
        L_0x012b:
            r14 = 0
            goto L_0x053e
        L_0x012e:
            r12 = r15
            boolean r9 = r0.a(r1, r13, r12)
            if (r9 == 0) goto L_0x0143
            java.lang.Object r4 = r7.getObject(r1, r4)
            dkw r5 = r0.a(r12)
            r2.a(r13, r4, r5)
            r14 = 0
            goto L_0x053e
        L_0x0143:
            r14 = 0
            goto L_0x053e
        L_0x0146:
            r12 = r15
            boolean r9 = r0.a(r1, r13, r12)
            if (r9 == 0) goto L_0x0157
            java.lang.Object r4 = r7.getObject(r1, r4)
            a(r13, r4, r2)
            r14 = 0
            goto L_0x053e
        L_0x0157:
            r14 = 0
            goto L_0x053e
        L_0x015a:
            r12 = r15
            boolean r9 = r0.a(r1, r13, r12)
            if (r9 == 0) goto L_0x016b
            boolean r4 = f(r1, r4)
            r2.a(r13, r4)
            r14 = 0
            goto L_0x053e
        L_0x016b:
            r14 = 0
            goto L_0x053e
        L_0x016e:
            r12 = r15
            boolean r9 = r0.a(r1, r13, r12)
            if (r9 == 0) goto L_0x017f
            int r4 = d(r1, r4)
            r2.d(r13, r4)
            r14 = 0
            goto L_0x053e
        L_0x017f:
            r14 = 0
            goto L_0x053e
        L_0x0182:
            r12 = r15
            boolean r9 = r0.a(r1, r13, r12)
            if (r9 == 0) goto L_0x0193
            long r4 = e(r1, r4)
            r2.d(r13, r4)
            r14 = 0
            goto L_0x053e
        L_0x0193:
            r14 = 0
            goto L_0x053e
        L_0x0196:
            r12 = r15
            boolean r9 = r0.a(r1, r13, r12)
            if (r9 == 0) goto L_0x01a7
            int r4 = d(r1, r4)
            r2.c(r13, r4)
            r14 = 0
            goto L_0x053e
        L_0x01a7:
            r14 = 0
            goto L_0x053e
        L_0x01aa:
            r12 = r15
            boolean r9 = r0.a(r1, r13, r12)
            if (r9 == 0) goto L_0x01bb
            long r4 = e(r1, r4)
            r2.c(r13, r4)
            r14 = 0
            goto L_0x053e
        L_0x01bb:
            r14 = 0
            goto L_0x053e
        L_0x01be:
            r12 = r15
            boolean r9 = r0.a(r1, r13, r12)
            if (r9 == 0) goto L_0x01cf
            long r4 = e(r1, r4)
            r2.a(r13, r4)
            r14 = 0
            goto L_0x053e
        L_0x01cf:
            r14 = 0
            goto L_0x053e
        L_0x01d2:
            r12 = r15
            boolean r9 = r0.a(r1, r13, r12)
            if (r9 == 0) goto L_0x01e3
            float r4 = c(r1, r4)
            r2.a(r13, r4)
            r14 = 0
            goto L_0x053e
        L_0x01e3:
            r14 = 0
            goto L_0x053e
        L_0x01e6:
            r12 = r15
            boolean r9 = r0.a(r1, r13, r12)
            if (r9 == 0) goto L_0x01f7
            double r4 = b(r1, r4)
            r2.a(r13, r4)
            r14 = 0
            goto L_0x053e
        L_0x01f7:
            r14 = 0
            goto L_0x053e
        L_0x01fa:
            r12 = r15
            java.lang.Object r4 = r7.getObject(r1, r4)
            r0.a(r2, r13, r4, r12)
            r14 = 0
            goto L_0x053e
        L_0x0205:
            r12 = r15
            int r9 = r0.d(r12)
            java.lang.Object r4 = r7.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            dkw r5 = r0.a(r12)
            defpackage.dky.b(r9, r4, r2, r5)
            r14 = 0
            goto L_0x053e
        L_0x021a:
            r12 = r15
            int r9 = r0.d(r12)
            java.lang.Object r4 = r7.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            r13 = 1
            defpackage.dky.e(r9, r4, r2, r13)
            r14 = 0
            goto L_0x053e
        L_0x022c:
            r12 = r15
            r13 = 1
            int r9 = r0.d(r12)
            java.lang.Object r4 = r7.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            defpackage.dky.j(r9, r4, r2, r13)
            r14 = 0
            goto L_0x053e
        L_0x023e:
            r12 = r15
            r13 = 1
            int r9 = r0.d(r12)
            java.lang.Object r4 = r7.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            defpackage.dky.g(r9, r4, r2, r13)
            r14 = 0
            goto L_0x053e
        L_0x0250:
            r12 = r15
            r13 = 1
            int r9 = r0.d(r12)
            java.lang.Object r4 = r7.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            defpackage.dky.l(r9, r4, r2, r13)
            r14 = 0
            goto L_0x053e
        L_0x0262:
            r12 = r15
            r13 = 1
            int r9 = r0.d(r12)
            java.lang.Object r4 = r7.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            defpackage.dky.m(r9, r4, r2, r13)
            r14 = 0
            goto L_0x053e
        L_0x0274:
            r12 = r15
            r13 = 1
            int r9 = r0.d(r12)
            java.lang.Object r4 = r7.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            defpackage.dky.i(r9, r4, r2, r13)
            r14 = 0
            goto L_0x053e
        L_0x0286:
            r12 = r15
            r13 = 1
            int r9 = r0.d(r12)
            java.lang.Object r4 = r7.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            defpackage.dky.n(r9, r4, r2, r13)
            r14 = 0
            goto L_0x053e
        L_0x0298:
            r12 = r15
            r13 = 1
            int r9 = r0.d(r12)
            java.lang.Object r4 = r7.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            defpackage.dky.k(r9, r4, r2, r13)
            r14 = 0
            goto L_0x053e
        L_0x02aa:
            r12 = r15
            r13 = 1
            int r9 = r0.d(r12)
            java.lang.Object r4 = r7.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            defpackage.dky.f(r9, r4, r2, r13)
            r14 = 0
            goto L_0x053e
        L_0x02bc:
            r12 = r15
            r13 = 1
            int r9 = r0.d(r12)
            java.lang.Object r4 = r7.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            defpackage.dky.h(r9, r4, r2, r13)
            r14 = 0
            goto L_0x053e
        L_0x02ce:
            r12 = r15
            r13 = 1
            int r9 = r0.d(r12)
            java.lang.Object r4 = r7.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            defpackage.dky.d(r9, r4, r2, r13)
            r14 = 0
            goto L_0x053e
        L_0x02e0:
            r12 = r15
            r13 = 1
            int r9 = r0.d(r12)
            java.lang.Object r4 = r7.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            defpackage.dky.c(r9, r4, r2, r13)
            r14 = 0
            goto L_0x053e
        L_0x02f2:
            r12 = r15
            r13 = 1
            int r9 = r0.d(r12)
            java.lang.Object r4 = r7.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            defpackage.dky.b(r9, r4, r2, r13)
            r14 = 0
            goto L_0x053e
        L_0x0304:
            r12 = r15
            r13 = 1
            int r9 = r0.d(r12)
            java.lang.Object r4 = r7.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            defpackage.dky.a(r9, r4, r2, r13)
            r14 = 0
            goto L_0x053e
        L_0x0316:
            r12 = r15
            int r9 = r0.d(r12)
            java.lang.Object r4 = r7.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            r13 = 0
            defpackage.dky.e(r9, r4, r2, r13)
            r14 = 0
            goto L_0x053e
        L_0x0328:
            r12 = r15
            r13 = 0
            int r9 = r0.d(r12)
            java.lang.Object r4 = r7.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            defpackage.dky.j(r9, r4, r2, r13)
            r14 = 0
            goto L_0x053e
        L_0x033a:
            r12 = r15
            r13 = 0
            int r9 = r0.d(r12)
            java.lang.Object r4 = r7.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            defpackage.dky.g(r9, r4, r2, r13)
            r14 = 0
            goto L_0x053e
        L_0x034c:
            r12 = r15
            r13 = 0
            int r9 = r0.d(r12)
            java.lang.Object r4 = r7.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            defpackage.dky.l(r9, r4, r2, r13)
            r14 = 0
            goto L_0x053e
        L_0x035e:
            r12 = r15
            r13 = 0
            int r9 = r0.d(r12)
            java.lang.Object r4 = r7.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            defpackage.dky.m(r9, r4, r2, r13)
            r14 = 0
            goto L_0x053e
        L_0x0370:
            r12 = r15
            r13 = 0
            int r9 = r0.d(r12)
            java.lang.Object r4 = r7.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            defpackage.dky.i(r9, r4, r2, r13)
            r14 = 0
            goto L_0x053e
        L_0x0382:
            r12 = r15
            int r9 = r0.d(r12)
            java.lang.Object r4 = r7.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            defpackage.dky.b(r9, r4, r2)
            r14 = 0
            goto L_0x053e
        L_0x0393:
            r12 = r15
            int r9 = r0.d(r12)
            java.lang.Object r4 = r7.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            dkw r5 = r0.a(r12)
            defpackage.dky.a(r9, r4, r2, r5)
            r14 = 0
            goto L_0x053e
        L_0x03a8:
            r12 = r15
            int r9 = r0.d(r12)
            java.lang.Object r4 = r7.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            defpackage.dky.a(r9, r4, r2)
            r14 = 0
            goto L_0x053e
        L_0x03b9:
            r12 = r15
            int r9 = r0.d(r12)
            java.lang.Object r4 = r7.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            r14 = 0
            defpackage.dky.n(r9, r4, r2, r14)
            goto L_0x053e
        L_0x03ca:
            r12 = r15
            r14 = 0
            int r9 = r0.d(r12)
            java.lang.Object r4 = r7.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            defpackage.dky.k(r9, r4, r2, r14)
            goto L_0x053e
        L_0x03db:
            r12 = r15
            r14 = 0
            int r9 = r0.d(r12)
            java.lang.Object r4 = r7.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            defpackage.dky.f(r9, r4, r2, r14)
            goto L_0x053e
        L_0x03ec:
            r12 = r15
            r14 = 0
            int r9 = r0.d(r12)
            java.lang.Object r4 = r7.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            defpackage.dky.h(r9, r4, r2, r14)
            goto L_0x053e
        L_0x03fd:
            r12 = r15
            r14 = 0
            int r9 = r0.d(r12)
            java.lang.Object r4 = r7.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            defpackage.dky.d(r9, r4, r2, r14)
            goto L_0x053e
        L_0x040e:
            r12 = r15
            r14 = 0
            int r9 = r0.d(r12)
            java.lang.Object r4 = r7.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            defpackage.dky.c(r9, r4, r2, r14)
            goto L_0x053e
        L_0x041f:
            r12 = r15
            r14 = 0
            int r9 = r0.d(r12)
            java.lang.Object r4 = r7.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            defpackage.dky.b(r9, r4, r2, r14)
            goto L_0x053e
        L_0x0430:
            r12 = r15
            r14 = 0
            int r9 = r0.d(r12)
            java.lang.Object r4 = r7.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            defpackage.dky.a(r9, r4, r2, r14)
            goto L_0x053e
        L_0x0441:
            r12 = r15
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x053e
            java.lang.Object r4 = r7.getObject(r1, r4)
            dkw r5 = r0.a(r12)
            r2.b(r13, r4, r5)
            goto L_0x053e
        L_0x0453:
            r12 = r15
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x053e
            long r4 = r7.getLong(r1, r4)
            r2.e(r13, r4)
            goto L_0x053e
        L_0x0461:
            r12 = r15
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x053e
            int r4 = r7.getInt(r1, r4)
            r2.f(r13, r4)
            goto L_0x053e
        L_0x046f:
            r12 = r15
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x053e
            long r4 = r7.getLong(r1, r4)
            r2.b(r13, r4)
            goto L_0x053e
        L_0x047d:
            r12 = r15
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x053e
            int r4 = r7.getInt(r1, r4)
            r2.a(r13, r4)
            goto L_0x053e
        L_0x048b:
            r12 = r15
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x053e
            int r4 = r7.getInt(r1, r4)
            r2.b(r13, r4)
            goto L_0x053e
        L_0x0499:
            r12 = r15
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x053e
            int r4 = r7.getInt(r1, r4)
            r2.e(r13, r4)
            goto L_0x053e
        L_0x04a7:
            r12 = r15
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x053e
            java.lang.Object r4 = r7.getObject(r1, r4)
            dik r4 = (defpackage.dik) r4
            r2.a(r13, r4)
            goto L_0x053e
        L_0x04b7:
            r12 = r15
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x053e
            java.lang.Object r4 = r7.getObject(r1, r4)
            dkw r5 = r0.a(r12)
            r2.a(r13, r4, r5)
            goto L_0x053e
        L_0x04c9:
            r12 = r15
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x053e
            java.lang.Object r4 = r7.getObject(r1, r4)
            a(r13, r4, r2)
            goto L_0x053e
        L_0x04d7:
            r12 = r15
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x053e
            boolean r4 = defpackage.dlv.c(r1, r4)
            r2.a(r13, r4)
            goto L_0x053e
        L_0x04e4:
            r12 = r15
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x053e
            int r4 = r7.getInt(r1, r4)
            r2.d(r13, r4)
            goto L_0x053e
        L_0x04f1:
            r12 = r15
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x053e
            long r4 = r7.getLong(r1, r4)
            r2.d(r13, r4)
            goto L_0x053e
        L_0x04fe:
            r12 = r15
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x053e
            int r4 = r7.getInt(r1, r4)
            r2.c(r13, r4)
            goto L_0x053e
        L_0x050b:
            r12 = r15
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x053e
            long r4 = r7.getLong(r1, r4)
            r2.c(r13, r4)
            goto L_0x053e
        L_0x0518:
            r12 = r15
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x053e
            long r4 = r7.getLong(r1, r4)
            r2.a(r13, r4)
            goto L_0x053e
        L_0x0525:
            r12 = r15
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x053e
            float r4 = defpackage.dlv.d(r1, r4)
            r2.a(r13, r4)
            goto L_0x053e
        L_0x0532:
            r12 = r15
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x053e
            double r4 = defpackage.dlv.e(r1, r4)
            r2.a(r13, r4)
        L_0x053e:
            int r5 = r12 + 3
            goto L_0x002c
        L_0x0543:
        L_0x0544:
            if (r8 == 0) goto L_0x0559
            defpackage.dkc.b(r8)
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0557
            java.lang.Object r4 = r3.next()
            r8 = r4
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8
            goto L_0x0544
        L_0x0557:
            r8 = 0
            goto L_0x0544
        L_0x0559:
            c(r19, r20)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dkm.b(java.lang.Object, dmf):void");
    }

    private final void a(dmf dmf, int i2, Object obj, int i3) {
        if (obj != null) {
            this.o.e(b(i3));
            for (Map.Entry entry : this.o.b(obj).entrySet()) {
                dio dio = (dio) dmf;
                dio.a.f(i2, 2);
                dio.a.g(dkc.a(entry.getKey(), entry.getValue()));
                dkc.a(dio.a, entry.getKey(), entry.getValue());
            }
        }
    }

    private static final void a(int i2, Object obj, dmf dmf) {
        if (obj instanceof String) {
            ((dio) dmf).a.b(i2, (String) obj);
            return;
        }
        dmf.a(i2, (dik) obj);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: java.util.Map$Entry} */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: dky.b(int, java.util.List, dmf, boolean):void
     arg types: [int, java.util.List, dmf, int]
     candidates:
      dky.b(int, java.util.List, dmf, dkw):void
      dky.b(int, java.util.List, dmf, boolean):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: dky.a(int, java.util.List, dmf, boolean):void
     arg types: [int, java.util.List, dmf, int]
     candidates:
      dky.a(int, java.util.List, djh, java.lang.Object):java.lang.Object
      dky.a(int, java.util.List, dmf, dkw):void
      dky.a(dke, java.lang.Object, java.lang.Object, long):void
      dky.a(int, java.util.List, dmf, boolean):void */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0043  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.Object r13, defpackage.dmf r14) {
        /*
            r12 = this;
            boolean r0 = r12.i
            if (r0 == 0) goto L_0x05a0
            boolean r0 = r12.h
            r1 = 0
            if (r0 == 0) goto L_0x001f
            div r0 = defpackage.dkc.a(r13)
            boolean r2 = r0.a()
            if (r2 != 0) goto L_0x001e
            java.util.Iterator r0 = r0.d()
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L_0x0021
        L_0x001e:
        L_0x001f:
            r0 = r1
            r2 = r0
        L_0x0021:
            int[] r3 = r12.c
            int r3 = r3.length
            r4 = 0
            r5 = r2
            r2 = 0
        L_0x0027:
            if (r2 < r3) goto L_0x0043
        L_0x002a:
            if (r5 == 0) goto L_0x003f
            defpackage.dkc.b(r5)
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x003d
            java.lang.Object r2 = r0.next()
            r5 = r2
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L_0x002a
        L_0x003d:
            r5 = r1
            goto L_0x002a
        L_0x003f:
            c(r13, r14)
            return
        L_0x0043:
            int r6 = r12.e(r2)
            int r7 = r12.d(r2)
        L_0x004b:
            if (r5 == 0) goto L_0x0065
            int r8 = defpackage.dkc.a(r5)
            if (r8 > r7) goto L_0x0065
            defpackage.dkc.b(r5)
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x0063
            java.lang.Object r5 = r0.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L_0x004b
        L_0x0063:
            r5 = r1
            goto L_0x004b
        L_0x0065:
            int r8 = g(r6)
            r9 = 1
            switch(r8) {
                case 0: goto L_0x058b;
                case 1: goto L_0x0579;
                case 2: goto L_0x0567;
                case 3: goto L_0x0555;
                case 4: goto L_0x0543;
                case 5: goto L_0x0531;
                case 6: goto L_0x051f;
                case 7: goto L_0x050c;
                case 8: goto L_0x04f9;
                case 9: goto L_0x04e2;
                case 10: goto L_0x04cd;
                case 11: goto L_0x04ba;
                case 12: goto L_0x04a7;
                case 13: goto L_0x0494;
                case 14: goto L_0x0481;
                case 15: goto L_0x046e;
                case 16: goto L_0x045b;
                case 17: goto L_0x0444;
                case 18: goto L_0x0431;
                case 19: goto L_0x041e;
                case 20: goto L_0x040b;
                case 21: goto L_0x03f8;
                case 22: goto L_0x03e5;
                case 23: goto L_0x03d2;
                case 24: goto L_0x03bf;
                case 25: goto L_0x03ac;
                case 26: goto L_0x0399;
                case 27: goto L_0x0382;
                case 28: goto L_0x036f;
                case 29: goto L_0x035c;
                case 30: goto L_0x0349;
                case 31: goto L_0x0336;
                case 32: goto L_0x0323;
                case 33: goto L_0x0310;
                case 34: goto L_0x02fd;
                case 35: goto L_0x02ea;
                case 36: goto L_0x02d7;
                case 37: goto L_0x02c4;
                case 38: goto L_0x02b1;
                case 39: goto L_0x029e;
                case 40: goto L_0x028b;
                case 41: goto L_0x0278;
                case 42: goto L_0x0265;
                case 43: goto L_0x0252;
                case 44: goto L_0x023f;
                case 45: goto L_0x022c;
                case 46: goto L_0x0219;
                case 47: goto L_0x0206;
                case 48: goto L_0x01f3;
                case 49: goto L_0x01dc;
                case 50: goto L_0x01cf;
                case 51: goto L_0x01bc;
                case 52: goto L_0x01a9;
                case 53: goto L_0x0196;
                case 54: goto L_0x0183;
                case 55: goto L_0x0170;
                case 56: goto L_0x015d;
                case 57: goto L_0x014a;
                case 58: goto L_0x0137;
                case 59: goto L_0x0124;
                case 60: goto L_0x010d;
                case 61: goto L_0x00f8;
                case 62: goto L_0x00e5;
                case 63: goto L_0x00d2;
                case 64: goto L_0x00bf;
                case 65: goto L_0x00ac;
                case 66: goto L_0x0099;
                case 67: goto L_0x0086;
                case 68: goto L_0x006f;
                default: goto L_0x006d;
            }
        L_0x006d:
            goto L_0x059c
        L_0x006f:
            boolean r8 = r12.a(r13, r7, r2)
            if (r8 == 0) goto L_0x059c
            long r8 = h(r6)
            java.lang.Object r6 = defpackage.dlv.f(r13, r8)
            dkw r8 = r12.a(r2)
            r14.b(r7, r6, r8)
            goto L_0x059c
        L_0x0086:
            boolean r8 = r12.a(r13, r7, r2)
            if (r8 == 0) goto L_0x059c
            long r8 = h(r6)
            long r8 = e(r13, r8)
            r14.e(r7, r8)
            goto L_0x059c
        L_0x0099:
            boolean r8 = r12.a(r13, r7, r2)
            if (r8 == 0) goto L_0x059c
            long r8 = h(r6)
            int r6 = d(r13, r8)
            r14.f(r7, r6)
            goto L_0x059c
        L_0x00ac:
            boolean r8 = r12.a(r13, r7, r2)
            if (r8 == 0) goto L_0x059c
            long r8 = h(r6)
            long r8 = e(r13, r8)
            r14.b(r7, r8)
            goto L_0x059c
        L_0x00bf:
            boolean r8 = r12.a(r13, r7, r2)
            if (r8 == 0) goto L_0x059c
            long r8 = h(r6)
            int r6 = d(r13, r8)
            r14.a(r7, r6)
            goto L_0x059c
        L_0x00d2:
            boolean r8 = r12.a(r13, r7, r2)
            if (r8 == 0) goto L_0x059c
            long r8 = h(r6)
            int r6 = d(r13, r8)
            r14.b(r7, r6)
            goto L_0x059c
        L_0x00e5:
            boolean r8 = r12.a(r13, r7, r2)
            if (r8 == 0) goto L_0x059c
            long r8 = h(r6)
            int r6 = d(r13, r8)
            r14.e(r7, r6)
            goto L_0x059c
        L_0x00f8:
            boolean r8 = r12.a(r13, r7, r2)
            if (r8 == 0) goto L_0x059c
            long r8 = h(r6)
            java.lang.Object r6 = defpackage.dlv.f(r13, r8)
            dik r6 = (defpackage.dik) r6
            r14.a(r7, r6)
            goto L_0x059c
        L_0x010d:
            boolean r8 = r12.a(r13, r7, r2)
            if (r8 == 0) goto L_0x059c
            long r8 = h(r6)
            java.lang.Object r6 = defpackage.dlv.f(r13, r8)
            dkw r8 = r12.a(r2)
            r14.a(r7, r6, r8)
            goto L_0x059c
        L_0x0124:
            boolean r8 = r12.a(r13, r7, r2)
            if (r8 == 0) goto L_0x059c
            long r8 = h(r6)
            java.lang.Object r6 = defpackage.dlv.f(r13, r8)
            a(r7, r6, r14)
            goto L_0x059c
        L_0x0137:
            boolean r8 = r12.a(r13, r7, r2)
            if (r8 == 0) goto L_0x059c
            long r8 = h(r6)
            boolean r6 = f(r13, r8)
            r14.a(r7, r6)
            goto L_0x059c
        L_0x014a:
            boolean r8 = r12.a(r13, r7, r2)
            if (r8 == 0) goto L_0x059c
            long r8 = h(r6)
            int r6 = d(r13, r8)
            r14.d(r7, r6)
            goto L_0x059c
        L_0x015d:
            boolean r8 = r12.a(r13, r7, r2)
            if (r8 == 0) goto L_0x059c
            long r8 = h(r6)
            long r8 = e(r13, r8)
            r14.d(r7, r8)
            goto L_0x059c
        L_0x0170:
            boolean r8 = r12.a(r13, r7, r2)
            if (r8 == 0) goto L_0x059c
            long r8 = h(r6)
            int r6 = d(r13, r8)
            r14.c(r7, r6)
            goto L_0x059c
        L_0x0183:
            boolean r8 = r12.a(r13, r7, r2)
            if (r8 == 0) goto L_0x059c
            long r8 = h(r6)
            long r8 = e(r13, r8)
            r14.c(r7, r8)
            goto L_0x059c
        L_0x0196:
            boolean r8 = r12.a(r13, r7, r2)
            if (r8 == 0) goto L_0x059c
            long r8 = h(r6)
            long r8 = e(r13, r8)
            r14.a(r7, r8)
            goto L_0x059c
        L_0x01a9:
            boolean r8 = r12.a(r13, r7, r2)
            if (r8 == 0) goto L_0x059c
            long r8 = h(r6)
            float r6 = c(r13, r8)
            r14.a(r7, r6)
            goto L_0x059c
        L_0x01bc:
            boolean r8 = r12.a(r13, r7, r2)
            if (r8 == 0) goto L_0x059c
            long r8 = h(r6)
            double r8 = b(r13, r8)
            r14.a(r7, r8)
            goto L_0x059c
        L_0x01cf:
            long r8 = h(r6)
            java.lang.Object r6 = defpackage.dlv.f(r13, r8)
            r12.a(r14, r7, r6, r2)
            goto L_0x059c
        L_0x01dc:
            int r7 = r12.d(r2)
            long r8 = h(r6)
            java.lang.Object r6 = defpackage.dlv.f(r13, r8)
            java.util.List r6 = (java.util.List) r6
            dkw r8 = r12.a(r2)
            defpackage.dky.b(r7, r6, r14, r8)
            goto L_0x059c
        L_0x01f3:
            int r7 = r12.d(r2)
            long r10 = h(r6)
            java.lang.Object r6 = defpackage.dlv.f(r13, r10)
            java.util.List r6 = (java.util.List) r6
            defpackage.dky.e(r7, r6, r14, r9)
            goto L_0x059c
        L_0x0206:
            int r7 = r12.d(r2)
            long r10 = h(r6)
            java.lang.Object r6 = defpackage.dlv.f(r13, r10)
            java.util.List r6 = (java.util.List) r6
            defpackage.dky.j(r7, r6, r14, r9)
            goto L_0x059c
        L_0x0219:
            int r7 = r12.d(r2)
            long r10 = h(r6)
            java.lang.Object r6 = defpackage.dlv.f(r13, r10)
            java.util.List r6 = (java.util.List) r6
            defpackage.dky.g(r7, r6, r14, r9)
            goto L_0x059c
        L_0x022c:
            int r7 = r12.d(r2)
            long r10 = h(r6)
            java.lang.Object r6 = defpackage.dlv.f(r13, r10)
            java.util.List r6 = (java.util.List) r6
            defpackage.dky.l(r7, r6, r14, r9)
            goto L_0x059c
        L_0x023f:
            int r7 = r12.d(r2)
            long r10 = h(r6)
            java.lang.Object r6 = defpackage.dlv.f(r13, r10)
            java.util.List r6 = (java.util.List) r6
            defpackage.dky.m(r7, r6, r14, r9)
            goto L_0x059c
        L_0x0252:
            int r7 = r12.d(r2)
            long r10 = h(r6)
            java.lang.Object r6 = defpackage.dlv.f(r13, r10)
            java.util.List r6 = (java.util.List) r6
            defpackage.dky.i(r7, r6, r14, r9)
            goto L_0x059c
        L_0x0265:
            int r7 = r12.d(r2)
            long r10 = h(r6)
            java.lang.Object r6 = defpackage.dlv.f(r13, r10)
            java.util.List r6 = (java.util.List) r6
            defpackage.dky.n(r7, r6, r14, r9)
            goto L_0x059c
        L_0x0278:
            int r7 = r12.d(r2)
            long r10 = h(r6)
            java.lang.Object r6 = defpackage.dlv.f(r13, r10)
            java.util.List r6 = (java.util.List) r6
            defpackage.dky.k(r7, r6, r14, r9)
            goto L_0x059c
        L_0x028b:
            int r7 = r12.d(r2)
            long r10 = h(r6)
            java.lang.Object r6 = defpackage.dlv.f(r13, r10)
            java.util.List r6 = (java.util.List) r6
            defpackage.dky.f(r7, r6, r14, r9)
            goto L_0x059c
        L_0x029e:
            int r7 = r12.d(r2)
            long r10 = h(r6)
            java.lang.Object r6 = defpackage.dlv.f(r13, r10)
            java.util.List r6 = (java.util.List) r6
            defpackage.dky.h(r7, r6, r14, r9)
            goto L_0x059c
        L_0x02b1:
            int r7 = r12.d(r2)
            long r10 = h(r6)
            java.lang.Object r6 = defpackage.dlv.f(r13, r10)
            java.util.List r6 = (java.util.List) r6
            defpackage.dky.d(r7, r6, r14, r9)
            goto L_0x059c
        L_0x02c4:
            int r7 = r12.d(r2)
            long r10 = h(r6)
            java.lang.Object r6 = defpackage.dlv.f(r13, r10)
            java.util.List r6 = (java.util.List) r6
            defpackage.dky.c(r7, r6, r14, r9)
            goto L_0x059c
        L_0x02d7:
            int r7 = r12.d(r2)
            long r10 = h(r6)
            java.lang.Object r6 = defpackage.dlv.f(r13, r10)
            java.util.List r6 = (java.util.List) r6
            defpackage.dky.b(r7, r6, r14, r9)
            goto L_0x059c
        L_0x02ea:
            int r7 = r12.d(r2)
            long r10 = h(r6)
            java.lang.Object r6 = defpackage.dlv.f(r13, r10)
            java.util.List r6 = (java.util.List) r6
            defpackage.dky.a(r7, r6, r14, r9)
            goto L_0x059c
        L_0x02fd:
            int r7 = r12.d(r2)
            long r8 = h(r6)
            java.lang.Object r6 = defpackage.dlv.f(r13, r8)
            java.util.List r6 = (java.util.List) r6
            defpackage.dky.e(r7, r6, r14, r4)
            goto L_0x059c
        L_0x0310:
            int r7 = r12.d(r2)
            long r8 = h(r6)
            java.lang.Object r6 = defpackage.dlv.f(r13, r8)
            java.util.List r6 = (java.util.List) r6
            defpackage.dky.j(r7, r6, r14, r4)
            goto L_0x059c
        L_0x0323:
            int r7 = r12.d(r2)
            long r8 = h(r6)
            java.lang.Object r6 = defpackage.dlv.f(r13, r8)
            java.util.List r6 = (java.util.List) r6
            defpackage.dky.g(r7, r6, r14, r4)
            goto L_0x059c
        L_0x0336:
            int r7 = r12.d(r2)
            long r8 = h(r6)
            java.lang.Object r6 = defpackage.dlv.f(r13, r8)
            java.util.List r6 = (java.util.List) r6
            defpackage.dky.l(r7, r6, r14, r4)
            goto L_0x059c
        L_0x0349:
            int r7 = r12.d(r2)
            long r8 = h(r6)
            java.lang.Object r6 = defpackage.dlv.f(r13, r8)
            java.util.List r6 = (java.util.List) r6
            defpackage.dky.m(r7, r6, r14, r4)
            goto L_0x059c
        L_0x035c:
            int r7 = r12.d(r2)
            long r8 = h(r6)
            java.lang.Object r6 = defpackage.dlv.f(r13, r8)
            java.util.List r6 = (java.util.List) r6
            defpackage.dky.i(r7, r6, r14, r4)
            goto L_0x059c
        L_0x036f:
            int r7 = r12.d(r2)
            long r8 = h(r6)
            java.lang.Object r6 = defpackage.dlv.f(r13, r8)
            java.util.List r6 = (java.util.List) r6
            defpackage.dky.b(r7, r6, r14)
            goto L_0x059c
        L_0x0382:
            int r7 = r12.d(r2)
            long r8 = h(r6)
            java.lang.Object r6 = defpackage.dlv.f(r13, r8)
            java.util.List r6 = (java.util.List) r6
            dkw r8 = r12.a(r2)
            defpackage.dky.a(r7, r6, r14, r8)
            goto L_0x059c
        L_0x0399:
            int r7 = r12.d(r2)
            long r8 = h(r6)
            java.lang.Object r6 = defpackage.dlv.f(r13, r8)
            java.util.List r6 = (java.util.List) r6
            defpackage.dky.a(r7, r6, r14)
            goto L_0x059c
        L_0x03ac:
            int r7 = r12.d(r2)
            long r8 = h(r6)
            java.lang.Object r6 = defpackage.dlv.f(r13, r8)
            java.util.List r6 = (java.util.List) r6
            defpackage.dky.n(r7, r6, r14, r4)
            goto L_0x059c
        L_0x03bf:
            int r7 = r12.d(r2)
            long r8 = h(r6)
            java.lang.Object r6 = defpackage.dlv.f(r13, r8)
            java.util.List r6 = (java.util.List) r6
            defpackage.dky.k(r7, r6, r14, r4)
            goto L_0x059c
        L_0x03d2:
            int r7 = r12.d(r2)
            long r8 = h(r6)
            java.lang.Object r6 = defpackage.dlv.f(r13, r8)
            java.util.List r6 = (java.util.List) r6
            defpackage.dky.f(r7, r6, r14, r4)
            goto L_0x059c
        L_0x03e5:
            int r7 = r12.d(r2)
            long r8 = h(r6)
            java.lang.Object r6 = defpackage.dlv.f(r13, r8)
            java.util.List r6 = (java.util.List) r6
            defpackage.dky.h(r7, r6, r14, r4)
            goto L_0x059c
        L_0x03f8:
            int r7 = r12.d(r2)
            long r8 = h(r6)
            java.lang.Object r6 = defpackage.dlv.f(r13, r8)
            java.util.List r6 = (java.util.List) r6
            defpackage.dky.d(r7, r6, r14, r4)
            goto L_0x059c
        L_0x040b:
            int r7 = r12.d(r2)
            long r8 = h(r6)
            java.lang.Object r6 = defpackage.dlv.f(r13, r8)
            java.util.List r6 = (java.util.List) r6
            defpackage.dky.c(r7, r6, r14, r4)
            goto L_0x059c
        L_0x041e:
            int r7 = r12.d(r2)
            long r8 = h(r6)
            java.lang.Object r6 = defpackage.dlv.f(r13, r8)
            java.util.List r6 = (java.util.List) r6
            defpackage.dky.b(r7, r6, r14, r4)
            goto L_0x059c
        L_0x0431:
            int r7 = r12.d(r2)
            long r8 = h(r6)
            java.lang.Object r6 = defpackage.dlv.f(r13, r8)
            java.util.List r6 = (java.util.List) r6
            defpackage.dky.a(r7, r6, r14, r4)
            goto L_0x059c
        L_0x0444:
            boolean r8 = r12.a(r13, r2)
            if (r8 == 0) goto L_0x059c
            long r8 = h(r6)
            java.lang.Object r6 = defpackage.dlv.f(r13, r8)
            dkw r8 = r12.a(r2)
            r14.b(r7, r6, r8)
            goto L_0x059c
        L_0x045b:
            boolean r8 = r12.a(r13, r2)
            if (r8 == 0) goto L_0x059c
            long r8 = h(r6)
            long r8 = defpackage.dlv.b(r13, r8)
            r14.e(r7, r8)
            goto L_0x059c
        L_0x046e:
            boolean r8 = r12.a(r13, r2)
            if (r8 == 0) goto L_0x059c
            long r8 = h(r6)
            int r6 = defpackage.dlv.a(r13, r8)
            r14.f(r7, r6)
            goto L_0x059c
        L_0x0481:
            boolean r8 = r12.a(r13, r2)
            if (r8 == 0) goto L_0x059c
            long r8 = h(r6)
            long r8 = defpackage.dlv.b(r13, r8)
            r14.b(r7, r8)
            goto L_0x059c
        L_0x0494:
            boolean r8 = r12.a(r13, r2)
            if (r8 == 0) goto L_0x059c
            long r8 = h(r6)
            int r6 = defpackage.dlv.a(r13, r8)
            r14.a(r7, r6)
            goto L_0x059c
        L_0x04a7:
            boolean r8 = r12.a(r13, r2)
            if (r8 == 0) goto L_0x059c
            long r8 = h(r6)
            int r6 = defpackage.dlv.a(r13, r8)
            r14.b(r7, r6)
            goto L_0x059c
        L_0x04ba:
            boolean r8 = r12.a(r13, r2)
            if (r8 == 0) goto L_0x059c
            long r8 = h(r6)
            int r6 = defpackage.dlv.a(r13, r8)
            r14.e(r7, r6)
            goto L_0x059c
        L_0x04cd:
            boolean r8 = r12.a(r13, r2)
            if (r8 == 0) goto L_0x059c
            long r8 = h(r6)
            java.lang.Object r6 = defpackage.dlv.f(r13, r8)
            dik r6 = (defpackage.dik) r6
            r14.a(r7, r6)
            goto L_0x059c
        L_0x04e2:
            boolean r8 = r12.a(r13, r2)
            if (r8 == 0) goto L_0x059c
            long r8 = h(r6)
            java.lang.Object r6 = defpackage.dlv.f(r13, r8)
            dkw r8 = r12.a(r2)
            r14.a(r7, r6, r8)
            goto L_0x059c
        L_0x04f9:
            boolean r8 = r12.a(r13, r2)
            if (r8 == 0) goto L_0x059c
            long r8 = h(r6)
            java.lang.Object r6 = defpackage.dlv.f(r13, r8)
            a(r7, r6, r14)
            goto L_0x059c
        L_0x050c:
            boolean r8 = r12.a(r13, r2)
            if (r8 == 0) goto L_0x059c
            long r8 = h(r6)
            boolean r6 = defpackage.dlv.c(r13, r8)
            r14.a(r7, r6)
            goto L_0x059c
        L_0x051f:
            boolean r8 = r12.a(r13, r2)
            if (r8 == 0) goto L_0x059c
            long r8 = h(r6)
            int r6 = defpackage.dlv.a(r13, r8)
            r14.d(r7, r6)
            goto L_0x059c
        L_0x0531:
            boolean r8 = r12.a(r13, r2)
            if (r8 == 0) goto L_0x059c
            long r8 = h(r6)
            long r8 = defpackage.dlv.b(r13, r8)
            r14.d(r7, r8)
            goto L_0x059c
        L_0x0543:
            boolean r8 = r12.a(r13, r2)
            if (r8 == 0) goto L_0x059c
            long r8 = h(r6)
            int r6 = defpackage.dlv.a(r13, r8)
            r14.c(r7, r6)
            goto L_0x059c
        L_0x0555:
            boolean r8 = r12.a(r13, r2)
            if (r8 == 0) goto L_0x059c
            long r8 = h(r6)
            long r8 = defpackage.dlv.b(r13, r8)
            r14.c(r7, r8)
            goto L_0x059c
        L_0x0567:
            boolean r8 = r12.a(r13, r2)
            if (r8 == 0) goto L_0x059c
            long r8 = h(r6)
            long r8 = defpackage.dlv.b(r13, r8)
            r14.a(r7, r8)
            goto L_0x059c
        L_0x0579:
            boolean r8 = r12.a(r13, r2)
            if (r8 == 0) goto L_0x059c
            long r8 = h(r6)
            float r6 = defpackage.dlv.d(r13, r8)
            r14.a(r7, r6)
            goto L_0x059c
        L_0x058b:
            boolean r8 = r12.a(r13, r2)
            if (r8 == 0) goto L_0x059c
            long r8 = h(r6)
            double r8 = defpackage.dlv.e(r13, r8)
            r14.a(r7, r8)
        L_0x059c:
            int r2 = r2 + 3
            goto L_0x0027
        L_0x05a0:
            r12.b(r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dkm.a(java.lang.Object, dmf):void");
    }

    private static final void c(Object obj, dmf dmf) {
        dlw.a(obj).a(dmf);
    }
}
