package p000;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* renamed from: dkm */
/* compiled from: PG */
final class dkm implements dkw {

    /* renamed from: a */
    private static final int[] f8713a = new int[0];

    /* renamed from: b */
    private static final Unsafe f8714b = dlv.m7027a();

    /* renamed from: c */
    private final int[] f8715c;

    /* renamed from: d */
    private final Object[] f8716d;

    /* renamed from: e */
    private final int f8717e;

    /* renamed from: f */
    private final int f8718f;

    /* renamed from: g */
    private final dkk f8719g;

    /* renamed from: h */
    private final boolean f8720h;

    /* renamed from: i */
    private final boolean f8721i;

    /* renamed from: j */
    private final int[] f8722j;

    /* renamed from: k */
    private final int f8723k;

    /* renamed from: l */
    private final int f8724l;

    /* renamed from: m */
    private final dkp f8725m;

    /* renamed from: n */
    private final djx f8726n;

    /* renamed from: o */
    private final dke f8727o;

    /* renamed from: p */
    private final dlw f8728p;

    /* renamed from: g */
    private static int m6847g(int i) {
        return (i >>> 20) & 255;
    }

    /* renamed from: h */
    private static long m6850h(int i) {
        return (long) (i & 1048575);
    }

    private dkm(int[] iArr, Object[] objArr, int i, int i2, dkk dkk, boolean z, int[] iArr2, int i3, int i4, dkp dkp, djx djx, dlw dlw, dkc dkc, dke dke, byte b) {
        this.f8715c = iArr;
        this.f8716d = objArr;
        this.f8717e = i;
        this.f8718f = i2;
        this.f8721i = z;
        boolean z2 = false;
        if (dkc != null && (dkk instanceof djc)) {
            z2 = true;
        }
        this.f8720h = z2;
        this.f8722j = iArr2;
        this.f8723k = i3;
        this.f8724l = i4;
        this.f8725m = dkp;
        this.f8726n = djx;
        this.f8728p = dlw;
        this.f8719g = dkk;
        this.f8727o = dke;
    }

    /* renamed from: c */
    private final boolean m6838c(Object obj, Object obj2, int i) {
        return m6823a(obj, i) == m6823a(obj2, i);
    }

    /* renamed from: a */
    public final boolean mo4579a(Object obj, Object obj2) {
        boolean z;
        int length = this.f8715c.length;
        for (int i = 0; i < length; i += 3) {
            int e = m6841e(i);
            long h = m6850h(e);
            switch (m6847g(e)) {
                case 0:
                    if (m6838c(obj, obj2, i) && Double.doubleToLongBits(dlv.m7044e(obj, h)) == Double.doubleToLongBits(dlv.m7044e(obj2, h))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (m6838c(obj, obj2, i) && Float.floatToIntBits(dlv.m7042d(obj, h)) == Float.floatToIntBits(dlv.m7042d(obj2, h))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (m6838c(obj, obj2, i) && dlv.m7037b(obj, h) == dlv.m7037b(obj2, h)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (m6838c(obj, obj2, i) && dlv.m7037b(obj, h) == dlv.m7037b(obj2, h)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (m6838c(obj, obj2, i) && dlv.m7024a(obj, h) == dlv.m7024a(obj2, h)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (m6838c(obj, obj2, i) && dlv.m7037b(obj, h) == dlv.m7037b(obj2, h)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (m6838c(obj, obj2, i) && dlv.m7024a(obj, h) == dlv.m7024a(obj2, h)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (m6838c(obj, obj2, i) && dlv.m7041c(obj, h) == dlv.m7041c(obj2, h)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (m6838c(obj, obj2, i) && dky.m6904a(dlv.m7045f(obj, h), dlv.m7045f(obj2, h))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (m6838c(obj, obj2, i) && dky.m6904a(dlv.m7045f(obj, h), dlv.m7045f(obj2, h))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (m6838c(obj, obj2, i) && dky.m6904a(dlv.m7045f(obj, h), dlv.m7045f(obj2, h))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (m6838c(obj, obj2, i) && dlv.m7024a(obj, h) == dlv.m7024a(obj2, h)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (m6838c(obj, obj2, i) && dlv.m7024a(obj, h) == dlv.m7024a(obj2, h)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (m6838c(obj, obj2, i) && dlv.m7024a(obj, h) == dlv.m7024a(obj2, h)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (m6838c(obj, obj2, i) && dlv.m7037b(obj, h) == dlv.m7037b(obj2, h)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (m6838c(obj, obj2, i) && dlv.m7024a(obj, h) == dlv.m7024a(obj2, h)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (m6838c(obj, obj2, i) && dlv.m7037b(obj, h) == dlv.m7037b(obj2, h)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (m6838c(obj, obj2, i) && dky.m6904a(dlv.m7045f(obj, h), dlv.m7045f(obj2, h))) {
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
                    z = dky.m6904a(dlv.m7045f(obj, h), dlv.m7045f(obj2, h));
                    break;
                case 50:
                    z = dky.m6904a(dlv.m7045f(obj, h), dlv.m7045f(obj2, h));
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
                    long f = (long) (m6844f(i) & 1048575);
                    if (dlv.m7024a(obj, f) == dlv.m7024a(obj2, f) && dky.m6904a(dlv.m7045f(obj, h), dlv.m7045f(obj2, h))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!z) {
                return false;
            }
        }
        if (!dlw.m7050a(obj).equals(dlw.m7050a(obj2))) {
            return false;
        }
        if (this.f8720h) {
            return dkc.m6772a(obj).equals(dkc.m6772a(obj2));
        }
        return true;
    }

    /* renamed from: c */
    private final djh m6836c(int i) {
        int i2 = i / 3;
        return (djh) this.f8716d[i2 + i2 + 1];
    }

    /* renamed from: b */
    private final Object m6829b(int i) {
        int i2 = i / 3;
        return this.f8716d[i2 + i2];
    }

    /* renamed from: a */
    private final dkw m6817a(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        dkw dkw = (dkw) this.f8716d[i3];
        if (dkw != null) {
            return dkw;
        }
        dkw a = dkt.f8733a.mo4586a((Class) this.f8716d[i3 + 1]);
        this.f8716d[i3] = a;
        return a;
    }

    /* renamed from: g */
    private static dlm m6848g(Object obj) {
        dje dje = (dje) obj;
        dlm dlm = dje.f8677A;
        if (dlm != dlm.f8766a) {
            return dlm;
        }
        dlm a = dlm.m6972a();
        dje.f8677A = a;
        return a;
    }

    /* renamed from: b */
    public final int mo4580b(Object obj) {
        return this.f8721i ? m6845f(obj) : m6842e(obj);
    }

    /* renamed from: e */
    private final int m6842e(Object obj) {
        int i;
        Unsafe unsafe = f8714b;
        int i2 = 0;
        int i3 = 0;
        int i4 = -1;
        for (int i5 = 0; i5 < this.f8715c.length; i5 += 3) {
            int e = m6841e(i5);
            int d = m6839d(i5);
            int g = m6847g(e);
            if (g <= 17) {
                int i6 = this.f8715c[i5 + 2];
                int i7 = 1048575 & i6;
                i = 1 << (i6 >>> 20);
                if (i7 != i4) {
                    i3 = unsafe.getInt(obj, (long) i7);
                    i4 = i7;
                }
            } else {
                i = 0;
            }
            long h = m6850h(e);
            switch (g) {
                case 0:
                    if ((i3 & i) == 0) {
                        break;
                    } else {
                        i2 += din.m6566j(d);
                        break;
                    }
                case 1:
                    if ((i3 & i) == 0) {
                        break;
                    } else {
                        i2 += din.m6569m(d);
                        break;
                    }
                case 2:
                    if ((i3 & i) == 0) {
                        break;
                    } else {
                        i2 += din.m6544b(d, unsafe.getLong(obj, h));
                        break;
                    }
                case 3:
                    if ((i3 & i) == 0) {
                        break;
                    } else {
                        i2 += din.m6552c(d, unsafe.getLong(obj, h));
                        break;
                    }
                case 4:
                    if ((i3 & i) == 0) {
                        break;
                    } else {
                        i2 += din.m6543b(d, unsafe.getInt(obj, h));
                        break;
                    }
                case 5:
                    if ((i3 & i) == 0) {
                        break;
                    } else {
                        i2 += din.m6568l(d);
                        break;
                    }
                case 6:
                    if ((i3 & i) == 0) {
                        break;
                    } else {
                        i2 += din.m6567k(d);
                        break;
                    }
                case 7:
                    if ((i3 & i) == 0) {
                        break;
                    } else {
                        i2 += din.m6565i(d);
                        break;
                    }
                case 8:
                    if ((i3 & i) == 0) {
                        break;
                    } else {
                        Object object = unsafe.getObject(obj, h);
                        if (!(object instanceof dik)) {
                            i2 += din.m6532a(d, (String) object);
                            break;
                        } else {
                            i2 += din.m6529a(d, (dik) object);
                            break;
                        }
                    }
                case 9:
                    if ((i3 & i) == 0) {
                        break;
                    } else {
                        i2 += dky.m6892a(d, unsafe.getObject(obj, h), m6817a(i5));
                        break;
                    }
                case 10:
                    if ((i3 & i) == 0) {
                        break;
                    } else {
                        i2 += din.m6529a(d, (dik) unsafe.getObject(obj, h));
                        break;
                    }
                case 11:
                    if ((i3 & i) == 0) {
                        break;
                    } else {
                        i2 += din.m6551c(d, unsafe.getInt(obj, h));
                        break;
                    }
                case 12:
                    if ((i3 & i) == 0) {
                        break;
                    } else {
                        i2 += din.m6560e(d, unsafe.getInt(obj, h));
                        break;
                    }
                case 13:
                    if ((i3 & i) == 0) {
                        break;
                    } else {
                        i2 += din.m6570n(d);
                        break;
                    }
                case 14:
                    if ((i3 & i) == 0) {
                        break;
                    } else {
                        i2 += din.m6571o(d);
                        break;
                    }
                case 15:
                    if ((i3 & i) == 0) {
                        break;
                    } else {
                        i2 += din.m6556d(d, unsafe.getInt(obj, h));
                        break;
                    }
                case 16:
                    if ((i3 & i) == 0) {
                        break;
                    } else {
                        i2 += din.m6557d(d, unsafe.getLong(obj, h));
                        break;
                    }
                case 17:
                    if ((i3 & i) == 0) {
                        break;
                    } else {
                        i2 += din.m6531a(d, (dkk) unsafe.getObject(obj, h), m6817a(i5));
                        break;
                    }
                case 18:
                    i2 += dky.m6922f(d, (List) unsafe.getObject(obj, h));
                    break;
                case 19:
                    i2 += dky.m6919e(d, (List) unsafe.getObject(obj, h));
                    break;
                case 20:
                    i2 += dky.m6928h(d, (List) unsafe.getObject(obj, h));
                    break;
                case 21:
                    i2 += dky.m6939l(d, (List) unsafe.getObject(obj, h));
                    break;
                case 22:
                    i2 += dky.m6925g(d, (List) unsafe.getObject(obj, h));
                    break;
                case 23:
                    i2 += dky.m6922f(d, (List) unsafe.getObject(obj, h));
                    break;
                case 24:
                    i2 += dky.m6919e(d, (List) unsafe.getObject(obj, h));
                    break;
                case 25:
                    i2 += dky.m6912c(d, (List) unsafe.getObject(obj, h));
                    break;
                case 26:
                    i2 += dky.m6893a(d, (List) unsafe.getObject(obj, h));
                    break;
                case 27:
                    i2 += dky.m6894a(d, (List) unsafe.getObject(obj, h), m6817a(i5));
                    break;
                case 28:
                    i2 += dky.m6905b(d, (List) unsafe.getObject(obj, h));
                    break;
                case 29:
                    i2 += dky.m6937k(d, (List) unsafe.getObject(obj, h));
                    break;
                case 30:
                    i2 += dky.m6916d(d, (List) unsafe.getObject(obj, h));
                    break;
                case 31:
                    i2 += dky.m6919e(d, (List) unsafe.getObject(obj, h));
                    break;
                case 32:
                    i2 += dky.m6922f(d, (List) unsafe.getObject(obj, h));
                    break;
                case 33:
                    i2 += dky.m6931i(d, (List) unsafe.getObject(obj, h));
                    break;
                case 34:
                    i2 += dky.m6934j(d, (List) unsafe.getObject(obj, h));
                    break;
                case 35:
                    int i8 = dky.m6932i((List) unsafe.getObject(obj, h));
                    if (i8 <= 0) {
                        break;
                    } else {
                        i2 += din.m6528a(d) + din.m6550c(i8) + i8;
                        break;
                    }
                case 36:
                    int h2 = dky.m6929h((List) unsafe.getObject(obj, h));
                    if (h2 <= 0) {
                        break;
                    } else {
                        i2 += din.m6528a(d) + din.m6550c(h2) + h2;
                        break;
                    }
                case 37:
                    int a = dky.m6895a((List) unsafe.getObject(obj, h));
                    if (a <= 0) {
                        break;
                    } else {
                        i2 += din.m6528a(d) + din.m6550c(a) + a;
                        break;
                    }
                case 38:
                    int b = dky.m6907b((List) unsafe.getObject(obj, h));
                    if (b <= 0) {
                        break;
                    } else {
                        i2 += din.m6528a(d) + din.m6550c(b) + b;
                        break;
                    }
                case 39:
                    int e2 = dky.m6920e((List) unsafe.getObject(obj, h));
                    if (e2 <= 0) {
                        break;
                    } else {
                        i2 += din.m6528a(d) + din.m6550c(e2) + e2;
                        break;
                    }
                case 40:
                    int i9 = dky.m6932i((List) unsafe.getObject(obj, h));
                    if (i9 <= 0) {
                        break;
                    } else {
                        i2 += din.m6528a(d) + din.m6550c(i9) + i9;
                        break;
                    }
                case 41:
                    int h3 = dky.m6929h((List) unsafe.getObject(obj, h));
                    if (h3 <= 0) {
                        break;
                    } else {
                        i2 += din.m6528a(d) + din.m6550c(h3) + h3;
                        break;
                    }
                case 42:
                    int j = dky.m6935j((List) unsafe.getObject(obj, h));
                    if (j <= 0) {
                        break;
                    } else {
                        i2 += din.m6528a(d) + din.m6550c(j) + j;
                        break;
                    }
                case 43:
                    int f = dky.m6923f((List) unsafe.getObject(obj, h));
                    if (f <= 0) {
                        break;
                    } else {
                        i2 += din.m6528a(d) + din.m6550c(f) + f;
                        break;
                    }
                case 44:
                    int d2 = dky.m6917d((List) unsafe.getObject(obj, h));
                    if (d2 <= 0) {
                        break;
                    } else {
                        i2 += din.m6528a(d) + din.m6550c(d2) + d2;
                        break;
                    }
                case 45:
                    int h4 = dky.m6929h((List) unsafe.getObject(obj, h));
                    if (h4 <= 0) {
                        break;
                    } else {
                        i2 += din.m6528a(d) + din.m6550c(h4) + h4;
                        break;
                    }
                case 46:
                    int i10 = dky.m6932i((List) unsafe.getObject(obj, h));
                    if (i10 <= 0) {
                        break;
                    } else {
                        i2 += din.m6528a(d) + din.m6550c(i10) + i10;
                        break;
                    }
                case 47:
                    int g2 = dky.m6926g((List) unsafe.getObject(obj, h));
                    if (g2 <= 0) {
                        break;
                    } else {
                        i2 += din.m6528a(d) + din.m6550c(g2) + g2;
                        break;
                    }
                case 48:
                    int c = dky.m6913c((List) unsafe.getObject(obj, h));
                    if (c <= 0) {
                        break;
                    } else {
                        i2 += din.m6528a(d) + din.m6550c(c) + c;
                        break;
                    }
                case 49:
                    i2 += dky.m6906b(d, (List) unsafe.getObject(obj, h), m6817a(i5));
                    break;
                case 50:
                    i2 += this.f8727o.mo4566b(unsafe.getObject(obj, h), m6829b(i5));
                    break;
                case 51:
                    if (!m6824a(obj, d, i5)) {
                        break;
                    } else {
                        i2 += din.m6566j(d);
                        break;
                    }
                case 52:
                    if (!m6824a(obj, d, i5)) {
                        break;
                    } else {
                        i2 += din.m6569m(d);
                        break;
                    }
                case 53:
                    if (!m6824a(obj, d, i5)) {
                        break;
                    } else {
                        i2 += din.m6544b(d, m6843e(obj, h));
                        break;
                    }
                case 54:
                    if (!m6824a(obj, d, i5)) {
                        break;
                    } else {
                        i2 += din.m6552c(d, m6843e(obj, h));
                        break;
                    }
                case 55:
                    if (!m6824a(obj, d, i5)) {
                        break;
                    } else {
                        i2 += din.m6543b(d, m6840d(obj, h));
                        break;
                    }
                case 56:
                    if (!m6824a(obj, d, i5)) {
                        break;
                    } else {
                        i2 += din.m6568l(d);
                        break;
                    }
                case 57:
                    if (!m6824a(obj, d, i5)) {
                        break;
                    } else {
                        i2 += din.m6567k(d);
                        break;
                    }
                case 58:
                    if (!m6824a(obj, d, i5)) {
                        break;
                    } else {
                        i2 += din.m6565i(d);
                        break;
                    }
                case 59:
                    if (!m6824a(obj, d, i5)) {
                        break;
                    } else {
                        Object object2 = unsafe.getObject(obj, h);
                        if (!(object2 instanceof dik)) {
                            i2 += din.m6532a(d, (String) object2);
                            break;
                        } else {
                            i2 += din.m6529a(d, (dik) object2);
                            break;
                        }
                    }
                case 60:
                    if (!m6824a(obj, d, i5)) {
                        break;
                    } else {
                        i2 += dky.m6892a(d, unsafe.getObject(obj, h), m6817a(i5));
                        break;
                    }
                case 61:
                    if (!m6824a(obj, d, i5)) {
                        break;
                    } else {
                        i2 += din.m6529a(d, (dik) unsafe.getObject(obj, h));
                        break;
                    }
                case 62:
                    if (!m6824a(obj, d, i5)) {
                        break;
                    } else {
                        i2 += din.m6551c(d, m6840d(obj, h));
                        break;
                    }
                case 63:
                    if (!m6824a(obj, d, i5)) {
                        break;
                    } else {
                        i2 += din.m6560e(d, m6840d(obj, h));
                        break;
                    }
                case 64:
                    if (!m6824a(obj, d, i5)) {
                        break;
                    } else {
                        i2 += din.m6570n(d);
                        break;
                    }
                case 65:
                    if (!m6824a(obj, d, i5)) {
                        break;
                    } else {
                        i2 += din.m6571o(d);
                        break;
                    }
                case 66:
                    if (!m6824a(obj, d, i5)) {
                        break;
                    } else {
                        i2 += din.m6556d(d, m6840d(obj, h));
                        break;
                    }
                case 67:
                    if (!m6824a(obj, d, i5)) {
                        break;
                    } else {
                        i2 += din.m6557d(d, m6843e(obj, h));
                        break;
                    }
                case 68:
                    if (!m6824a(obj, d, i5)) {
                        break;
                    } else {
                        i2 += din.m6531a(d, (dkk) unsafe.getObject(obj, h), m6817a(i5));
                        break;
                    }
            }
        }
        int h5 = i2 + m6849h(obj);
        if (!this.f8720h) {
            return h5;
        }
        div a2 = dkc.m6772a(obj);
        int i11 = 0;
        for (int i12 = 0; i12 < a2.f8607a.mo4612b(); i12++) {
            Map.Entry b2 = a2.f8607a.mo4613b(i12);
            i11 += div.m6627a((diu) b2.getKey(), b2.getValue());
        }
        for (Map.Entry entry : a2.f8607a.mo4614c()) {
            i11 += div.m6627a((diu) entry.getKey(), entry.getValue());
        }
        return h5 + i11;
    }

    /* renamed from: f */
    private final int m6845f(Object obj) {
        Unsafe unsafe = f8714b;
        int i = 0;
        for (int i2 = 0; i2 < this.f8715c.length; i2 += 3) {
            int e = m6841e(i2);
            int g = m6847g(e);
            int d = m6839d(i2);
            long h = m6850h(e);
            if (g >= diw.DOUBLE_LIST_PACKED.f8663c) {
                int i3 = diw.SINT64_LIST_PACKED.f8663c;
            }
            switch (g) {
                case 0:
                    if (!m6823a(obj, i2)) {
                        break;
                    } else {
                        i += din.m6566j(d);
                        break;
                    }
                case 1:
                    if (!m6823a(obj, i2)) {
                        break;
                    } else {
                        i += din.m6569m(d);
                        break;
                    }
                case 2:
                    if (!m6823a(obj, i2)) {
                        break;
                    } else {
                        i += din.m6544b(d, dlv.m7037b(obj, h));
                        break;
                    }
                case 3:
                    if (!m6823a(obj, i2)) {
                        break;
                    } else {
                        i += din.m6552c(d, dlv.m7037b(obj, h));
                        break;
                    }
                case 4:
                    if (!m6823a(obj, i2)) {
                        break;
                    } else {
                        i += din.m6543b(d, dlv.m7024a(obj, h));
                        break;
                    }
                case 5:
                    if (!m6823a(obj, i2)) {
                        break;
                    } else {
                        i += din.m6568l(d);
                        break;
                    }
                case 6:
                    if (!m6823a(obj, i2)) {
                        break;
                    } else {
                        i += din.m6567k(d);
                        break;
                    }
                case 7:
                    if (!m6823a(obj, i2)) {
                        break;
                    } else {
                        i += din.m6565i(d);
                        break;
                    }
                case 8:
                    if (!m6823a(obj, i2)) {
                        break;
                    } else {
                        Object f = dlv.m7045f(obj, h);
                        if (!(f instanceof dik)) {
                            i += din.m6532a(d, (String) f);
                            break;
                        } else {
                            i += din.m6529a(d, (dik) f);
                            break;
                        }
                    }
                case 9:
                    if (!m6823a(obj, i2)) {
                        break;
                    } else {
                        i += dky.m6892a(d, dlv.m7045f(obj, h), m6817a(i2));
                        break;
                    }
                case 10:
                    if (!m6823a(obj, i2)) {
                        break;
                    } else {
                        i += din.m6529a(d, (dik) dlv.m7045f(obj, h));
                        break;
                    }
                case 11:
                    if (!m6823a(obj, i2)) {
                        break;
                    } else {
                        i += din.m6551c(d, dlv.m7024a(obj, h));
                        break;
                    }
                case 12:
                    if (!m6823a(obj, i2)) {
                        break;
                    } else {
                        i += din.m6560e(d, dlv.m7024a(obj, h));
                        break;
                    }
                case 13:
                    if (!m6823a(obj, i2)) {
                        break;
                    } else {
                        i += din.m6570n(d);
                        break;
                    }
                case 14:
                    if (!m6823a(obj, i2)) {
                        break;
                    } else {
                        i += din.m6571o(d);
                        break;
                    }
                case 15:
                    if (!m6823a(obj, i2)) {
                        break;
                    } else {
                        i += din.m6556d(d, dlv.m7024a(obj, h));
                        break;
                    }
                case 16:
                    if (!m6823a(obj, i2)) {
                        break;
                    } else {
                        i += din.m6557d(d, dlv.m7037b(obj, h));
                        break;
                    }
                case 17:
                    if (!m6823a(obj, i2)) {
                        break;
                    } else {
                        i += din.m6531a(d, (dkk) dlv.m7045f(obj, h), m6817a(i2));
                        break;
                    }
                case 18:
                    i += dky.m6922f(d, m6819a(obj, h));
                    break;
                case 19:
                    i += dky.m6919e(d, m6819a(obj, h));
                    break;
                case 20:
                    i += dky.m6928h(d, m6819a(obj, h));
                    break;
                case 21:
                    i += dky.m6939l(d, m6819a(obj, h));
                    break;
                case 22:
                    i += dky.m6925g(d, m6819a(obj, h));
                    break;
                case 23:
                    i += dky.m6922f(d, m6819a(obj, h));
                    break;
                case 24:
                    i += dky.m6919e(d, m6819a(obj, h));
                    break;
                case 25:
                    i += dky.m6912c(d, m6819a(obj, h));
                    break;
                case 26:
                    i += dky.m6893a(d, m6819a(obj, h));
                    break;
                case 27:
                    i += dky.m6894a(d, m6819a(obj, h), m6817a(i2));
                    break;
                case 28:
                    i += dky.m6905b(d, m6819a(obj, h));
                    break;
                case 29:
                    i += dky.m6937k(d, m6819a(obj, h));
                    break;
                case 30:
                    i += dky.m6916d(d, m6819a(obj, h));
                    break;
                case 31:
                    i += dky.m6919e(d, m6819a(obj, h));
                    break;
                case 32:
                    i += dky.m6922f(d, m6819a(obj, h));
                    break;
                case 33:
                    i += dky.m6931i(d, m6819a(obj, h));
                    break;
                case 34:
                    i += dky.m6934j(d, m6819a(obj, h));
                    break;
                case 35:
                    int i4 = dky.m6932i((List) unsafe.getObject(obj, h));
                    if (i4 <= 0) {
                        break;
                    } else {
                        i += din.m6528a(d) + din.m6550c(i4) + i4;
                        break;
                    }
                case 36:
                    int h2 = dky.m6929h((List) unsafe.getObject(obj, h));
                    if (h2 <= 0) {
                        break;
                    } else {
                        i += din.m6528a(d) + din.m6550c(h2) + h2;
                        break;
                    }
                case 37:
                    int a = dky.m6895a((List) unsafe.getObject(obj, h));
                    if (a <= 0) {
                        break;
                    } else {
                        i += din.m6528a(d) + din.m6550c(a) + a;
                        break;
                    }
                case 38:
                    int b = dky.m6907b((List) unsafe.getObject(obj, h));
                    if (b <= 0) {
                        break;
                    } else {
                        i += din.m6528a(d) + din.m6550c(b) + b;
                        break;
                    }
                case 39:
                    int e2 = dky.m6920e((List) unsafe.getObject(obj, h));
                    if (e2 <= 0) {
                        break;
                    } else {
                        i += din.m6528a(d) + din.m6550c(e2) + e2;
                        break;
                    }
                case 40:
                    int i5 = dky.m6932i((List) unsafe.getObject(obj, h));
                    if (i5 <= 0) {
                        break;
                    } else {
                        i += din.m6528a(d) + din.m6550c(i5) + i5;
                        break;
                    }
                case 41:
                    int h3 = dky.m6929h((List) unsafe.getObject(obj, h));
                    if (h3 <= 0) {
                        break;
                    } else {
                        i += din.m6528a(d) + din.m6550c(h3) + h3;
                        break;
                    }
                case 42:
                    int j = dky.m6935j((List) unsafe.getObject(obj, h));
                    if (j <= 0) {
                        break;
                    } else {
                        i += din.m6528a(d) + din.m6550c(j) + j;
                        break;
                    }
                case 43:
                    int f2 = dky.m6923f((List) unsafe.getObject(obj, h));
                    if (f2 <= 0) {
                        break;
                    } else {
                        i += din.m6528a(d) + din.m6550c(f2) + f2;
                        break;
                    }
                case 44:
                    int d2 = dky.m6917d((List) unsafe.getObject(obj, h));
                    if (d2 <= 0) {
                        break;
                    } else {
                        i += din.m6528a(d) + din.m6550c(d2) + d2;
                        break;
                    }
                case 45:
                    int h4 = dky.m6929h((List) unsafe.getObject(obj, h));
                    if (h4 <= 0) {
                        break;
                    } else {
                        i += din.m6528a(d) + din.m6550c(h4) + h4;
                        break;
                    }
                case 46:
                    int i6 = dky.m6932i((List) unsafe.getObject(obj, h));
                    if (i6 <= 0) {
                        break;
                    } else {
                        i += din.m6528a(d) + din.m6550c(i6) + i6;
                        break;
                    }
                case 47:
                    int g2 = dky.m6926g((List) unsafe.getObject(obj, h));
                    if (g2 <= 0) {
                        break;
                    } else {
                        i += din.m6528a(d) + din.m6550c(g2) + g2;
                        break;
                    }
                case 48:
                    int c = dky.m6913c((List) unsafe.getObject(obj, h));
                    if (c <= 0) {
                        break;
                    } else {
                        i += din.m6528a(d) + din.m6550c(c) + c;
                        break;
                    }
                case 49:
                    i += dky.m6906b(d, m6819a(obj, h), m6817a(i2));
                    break;
                case 50:
                    i += this.f8727o.mo4566b(dlv.m7045f(obj, h), m6829b(i2));
                    break;
                case 51:
                    if (!m6824a(obj, d, i2)) {
                        break;
                    } else {
                        i += din.m6566j(d);
                        break;
                    }
                case 52:
                    if (!m6824a(obj, d, i2)) {
                        break;
                    } else {
                        i += din.m6569m(d);
                        break;
                    }
                case 53:
                    if (!m6824a(obj, d, i2)) {
                        break;
                    } else {
                        i += din.m6544b(d, m6843e(obj, h));
                        break;
                    }
                case 54:
                    if (!m6824a(obj, d, i2)) {
                        break;
                    } else {
                        i += din.m6552c(d, m6843e(obj, h));
                        break;
                    }
                case 55:
                    if (!m6824a(obj, d, i2)) {
                        break;
                    } else {
                        i += din.m6543b(d, m6840d(obj, h));
                        break;
                    }
                case 56:
                    if (!m6824a(obj, d, i2)) {
                        break;
                    } else {
                        i += din.m6568l(d);
                        break;
                    }
                case 57:
                    if (!m6824a(obj, d, i2)) {
                        break;
                    } else {
                        i += din.m6567k(d);
                        break;
                    }
                case 58:
                    if (!m6824a(obj, d, i2)) {
                        break;
                    } else {
                        i += din.m6565i(d);
                        break;
                    }
                case 59:
                    if (!m6824a(obj, d, i2)) {
                        break;
                    } else {
                        Object f3 = dlv.m7045f(obj, h);
                        if (!(f3 instanceof dik)) {
                            i += din.m6532a(d, (String) f3);
                            break;
                        } else {
                            i += din.m6529a(d, (dik) f3);
                            break;
                        }
                    }
                case 60:
                    if (!m6824a(obj, d, i2)) {
                        break;
                    } else {
                        i += dky.m6892a(d, dlv.m7045f(obj, h), m6817a(i2));
                        break;
                    }
                case 61:
                    if (!m6824a(obj, d, i2)) {
                        break;
                    } else {
                        i += din.m6529a(d, (dik) dlv.m7045f(obj, h));
                        break;
                    }
                case 62:
                    if (!m6824a(obj, d, i2)) {
                        break;
                    } else {
                        i += din.m6551c(d, m6840d(obj, h));
                        break;
                    }
                case 63:
                    if (!m6824a(obj, d, i2)) {
                        break;
                    } else {
                        i += din.m6560e(d, m6840d(obj, h));
                        break;
                    }
                case 64:
                    if (!m6824a(obj, d, i2)) {
                        break;
                    } else {
                        i += din.m6570n(d);
                        break;
                    }
                case 65:
                    if (!m6824a(obj, d, i2)) {
                        break;
                    } else {
                        i += din.m6571o(d);
                        break;
                    }
                case 66:
                    if (!m6824a(obj, d, i2)) {
                        break;
                    } else {
                        i += din.m6556d(d, m6840d(obj, h));
                        break;
                    }
                case 67:
                    if (!m6824a(obj, d, i2)) {
                        break;
                    } else {
                        i += din.m6557d(d, m6843e(obj, h));
                        break;
                    }
                case 68:
                    if (!m6824a(obj, d, i2)) {
                        break;
                    } else {
                        i += din.m6531a(d, (dkk) dlv.m7045f(obj, h), m6817a(i2));
                        break;
                    }
            }
        }
        return i + m6849h(obj);
    }

    /* renamed from: h */
    private static final int m6849h(Object obj) {
        return dlw.m7050a(obj).mo4629b();
    }

    /* renamed from: a */
    public final int mo4574a(Object obj) {
        int length = this.f8715c.length;
        int i = 0;
        for (int i2 = 0; i2 < length; i2 += 3) {
            int e = m6841e(i2);
            int d = m6839d(i2);
            long h = m6850h(e);
            int i3 = 37;
            switch (m6847g(e)) {
                case 0:
                    i = (i * 53) + djl.m6722a(Double.doubleToLongBits(dlv.m7044e(obj, h)));
                    break;
                case 1:
                    i = (i * 53) + Float.floatToIntBits(dlv.m7042d(obj, h));
                    break;
                case 2:
                    i = (i * 53) + djl.m6722a(dlv.m7037b(obj, h));
                    break;
                case 3:
                    i = (i * 53) + djl.m6722a(dlv.m7037b(obj, h));
                    break;
                case 4:
                    i = (i * 53) + dlv.m7024a(obj, h);
                    break;
                case 5:
                    i = (i * 53) + djl.m6722a(dlv.m7037b(obj, h));
                    break;
                case 6:
                    i = (i * 53) + dlv.m7024a(obj, h);
                    break;
                case 7:
                    i = (i * 53) + djl.m6723a(dlv.m7041c(obj, h));
                    break;
                case 8:
                    i = (i * 53) + ((String) dlv.m7045f(obj, h)).hashCode();
                    break;
                case 9:
                    Object f = dlv.m7045f(obj, h);
                    if (f != null) {
                        i3 = f.hashCode();
                    }
                    i = (i * 53) + i3;
                    break;
                case 10:
                    i = (i * 53) + dlv.m7045f(obj, h).hashCode();
                    break;
                case 11:
                    i = (i * 53) + dlv.m7024a(obj, h);
                    break;
                case 12:
                    i = (i * 53) + dlv.m7024a(obj, h);
                    break;
                case 13:
                    i = (i * 53) + dlv.m7024a(obj, h);
                    break;
                case 14:
                    i = (i * 53) + djl.m6722a(dlv.m7037b(obj, h));
                    break;
                case 15:
                    i = (i * 53) + dlv.m7024a(obj, h);
                    break;
                case 16:
                    i = (i * 53) + djl.m6722a(dlv.m7037b(obj, h));
                    break;
                case 17:
                    Object f2 = dlv.m7045f(obj, h);
                    if (f2 != null) {
                        i3 = f2.hashCode();
                    }
                    i = (i * 53) + i3;
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
                    i = (i * 53) + dlv.m7045f(obj, h).hashCode();
                    break;
                case 50:
                    i = (i * 53) + dlv.m7045f(obj, h).hashCode();
                    break;
                case 51:
                    if (!m6824a(obj, d, i2)) {
                        break;
                    } else {
                        i = (i * 53) + djl.m6722a(Double.doubleToLongBits(m6827b(obj, h)));
                        break;
                    }
                case 52:
                    if (!m6824a(obj, d, i2)) {
                        break;
                    } else {
                        i = (i * 53) + Float.floatToIntBits(m6835c(obj, h));
                        break;
                    }
                case 53:
                    if (!m6824a(obj, d, i2)) {
                        break;
                    } else {
                        i = (i * 53) + djl.m6722a(m6843e(obj, h));
                        break;
                    }
                case 54:
                    if (!m6824a(obj, d, i2)) {
                        break;
                    } else {
                        i = (i * 53) + djl.m6722a(m6843e(obj, h));
                        break;
                    }
                case 55:
                    if (!m6824a(obj, d, i2)) {
                        break;
                    } else {
                        i = (i * 53) + m6840d(obj, h);
                        break;
                    }
                case 56:
                    if (!m6824a(obj, d, i2)) {
                        break;
                    } else {
                        i = (i * 53) + djl.m6722a(m6843e(obj, h));
                        break;
                    }
                case 57:
                    if (!m6824a(obj, d, i2)) {
                        break;
                    } else {
                        i = (i * 53) + m6840d(obj, h);
                        break;
                    }
                case 58:
                    if (!m6824a(obj, d, i2)) {
                        break;
                    } else {
                        i = (i * 53) + djl.m6723a(m6846f(obj, h));
                        break;
                    }
                case 59:
                    if (!m6824a(obj, d, i2)) {
                        break;
                    } else {
                        i = (i * 53) + ((String) dlv.m7045f(obj, h)).hashCode();
                        break;
                    }
                case 60:
                    if (!m6824a(obj, d, i2)) {
                        break;
                    } else {
                        i = (i * 53) + dlv.m7045f(obj, h).hashCode();
                        break;
                    }
                case 61:
                    if (!m6824a(obj, d, i2)) {
                        break;
                    } else {
                        i = (i * 53) + dlv.m7045f(obj, h).hashCode();
                        break;
                    }
                case 62:
                    if (!m6824a(obj, d, i2)) {
                        break;
                    } else {
                        i = (i * 53) + m6840d(obj, h);
                        break;
                    }
                case 63:
                    if (!m6824a(obj, d, i2)) {
                        break;
                    } else {
                        i = (i * 53) + m6840d(obj, h);
                        break;
                    }
                case 64:
                    if (!m6824a(obj, d, i2)) {
                        break;
                    } else {
                        i = (i * 53) + m6840d(obj, h);
                        break;
                    }
                case 65:
                    if (!m6824a(obj, d, i2)) {
                        break;
                    } else {
                        i = (i * 53) + djl.m6722a(m6843e(obj, h));
                        break;
                    }
                case 66:
                    if (!m6824a(obj, d, i2)) {
                        break;
                    } else {
                        i = (i * 53) + m6840d(obj, h);
                        break;
                    }
                case 67:
                    if (!m6824a(obj, d, i2)) {
                        break;
                    } else {
                        i = (i * 53) + djl.m6722a(m6843e(obj, h));
                        break;
                    }
                case 68:
                    if (!m6824a(obj, d, i2)) {
                        break;
                    } else {
                        i = (i * 53) + dlv.m7045f(obj, h).hashCode();
                        break;
                    }
            }
        }
        int hashCode = (i * 53) + dlw.m7050a(obj).hashCode();
        return this.f8720h ? (hashCode * 53) + dkc.m6772a(obj).hashCode() : hashCode;
    }

    /* renamed from: a */
    private final boolean m6823a(Object obj, int i) {
        if (!this.f8721i) {
            int f = m6844f(i);
            return (dlv.m7024a(obj, (long) (1048575 & f)) & (1 << (f >>> 20))) != 0;
        }
        int e = m6841e(i);
        long h = m6850h(e);
        switch (m6847g(e)) {
            case 0:
                return dlv.m7044e(obj, h) != 0.0d;
            case 1:
                return dlv.m7042d(obj, h) != 0.0f;
            case 2:
                return dlv.m7037b(obj, h) != 0;
            case 3:
                return dlv.m7037b(obj, h) != 0;
            case 4:
                return dlv.m7024a(obj, h) != 0;
            case 5:
                return dlv.m7037b(obj, h) != 0;
            case 6:
                return dlv.m7024a(obj, h) != 0;
            case 7:
                return dlv.m7041c(obj, h);
            case 8:
                Object f2 = dlv.m7045f(obj, h);
                if (f2 instanceof String) {
                    return !((String) f2).isEmpty();
                }
                if (f2 instanceof dik) {
                    return !dik.f8583b.equals(f2);
                }
                throw new IllegalArgumentException();
            case 9:
                return dlv.m7045f(obj, h) != null;
            case 10:
                return !dik.f8583b.equals(dlv.m7045f(obj, h));
            case 11:
                return dlv.m7024a(obj, h) != 0;
            case 12:
                return dlv.m7024a(obj, h) != 0;
            case 13:
                return dlv.m7024a(obj, h) != 0;
            case 14:
                return dlv.m7037b(obj, h) != 0;
            case 15:
                return dlv.m7024a(obj, h) != 0;
            case 16:
                return dlv.m7037b(obj, h) != 0;
            case 17:
                return dlv.m7045f(obj, h) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    /* renamed from: a */
    private final boolean m6825a(Object obj, int i, int i2, int i3) {
        if (!this.f8721i) {
            return (i2 & i3) != 0;
        }
        return m6823a(obj, i);
    }

    /* renamed from: d */
    public final boolean mo4583d(Object obj) {
        int i;
        int i2 = 0;
        int i3 = -1;
        for (int i4 = 0; i4 < this.f8723k; i4++) {
            int i5 = this.f8722j[i4];
            int d = m6839d(i5);
            int e = m6841e(i5);
            if (!this.f8721i) {
                int i6 = this.f8715c[i5 + 2];
                int i7 = 1048575 & i6;
                i = 1 << (i6 >>> 20);
                if (i7 != i3) {
                    i2 = f8714b.getInt(obj, (long) i7);
                    i3 = i7;
                }
            } else {
                i = 0;
            }
            if ((268435456 & e) != 0 && !m6825a(obj, i5, i2, i)) {
                return false;
            }
            int g = m6847g(e);
            if (g != 9 && g != 17) {
                if (g != 27) {
                    if (g == 60 || g == 68) {
                        if (m6824a(obj, d, i5) && !m6826a(obj, e, m6817a(i5))) {
                            return false;
                        }
                    } else if (g != 49) {
                        if (g == 50 && !this.f8727o.mo4567b(dlv.m7045f(obj, m6850h(e))).isEmpty()) {
                            this.f8727o.mo4570e(m6829b(i5));
                            throw null;
                        }
                    }
                }
                List list = (List) dlv.m7045f(obj, m6850h(e));
                if (!list.isEmpty()) {
                    dkw a = m6817a(i5);
                    for (int i8 = 0; i8 < list.size(); i8++) {
                        if (!a.mo4583d(list.get(i8))) {
                            return false;
                        }
                    }
                    continue;
                } else {
                    continue;
                }
            } else if (m6825a(obj, i5, i2, i) && !m6826a(obj, e, m6817a(i5))) {
                return false;
            }
        }
        if (!this.f8720h || dkc.m6772a(obj).mo4483e()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m6826a(Object obj, int i, dkw dkw) {
        return dkw.mo4583d(dlv.m7045f(obj, m6850h(i)));
    }

    /* renamed from: a */
    private final boolean m6824a(Object obj, int i, int i2) {
        return dlv.m7024a(obj, (long) (m6844f(i2) & 1048575)) == i;
    }

    /* renamed from: a */
    private static List m6819a(Object obj, long j) {
        return (List) dlv.m7045f(obj, j);
    }

    /* renamed from: c */
    public final void mo4582c(Object obj) {
        int i;
        int i2 = this.f8723k;
        while (true) {
            i = this.f8724l;
            if (i2 >= i) {
                break;
            }
            long h = m6850h(m6841e(this.f8722j[i2]));
            Object f = dlv.m7045f(obj, h);
            if (f != null) {
                dlv.m7033a(obj, h, this.f8727o.mo4569d(f));
            }
            i2++;
        }
        int length = this.f8722j.length;
        while (i < length) {
            this.f8726n.mo4547a(obj, (long) this.f8722j[i]);
            i++;
        }
        dlw.m7057b(obj);
        if (this.f8720h) {
            dkc.m6774b(obj);
        }
    }

    /* renamed from: b */
    public final void mo4581b(Object obj, Object obj2) {
        if (obj2 != null) {
            for (int i = 0; i < this.f8715c.length; i += 3) {
                int e = m6841e(i);
                long h = m6850h(e);
                int d = m6839d(i);
                switch (m6847g(e)) {
                    case 0:
                        if (!m6823a(obj2, i)) {
                            break;
                        } else {
                            dlv.m7029a(obj, h, dlv.m7044e(obj2, h));
                            m6830b(obj, i);
                            break;
                        }
                    case 1:
                        if (!m6823a(obj2, i)) {
                            break;
                        } else {
                            dlv.m7030a(obj, h, dlv.m7042d(obj2, h));
                            m6830b(obj, i);
                            break;
                        }
                    case 2:
                        if (!m6823a(obj2, i)) {
                            break;
                        } else {
                            dlv.m7032a(obj, h, dlv.m7037b(obj2, h));
                            m6830b(obj, i);
                            break;
                        }
                    case 3:
                        if (!m6823a(obj2, i)) {
                            break;
                        } else {
                            dlv.m7032a(obj, h, dlv.m7037b(obj2, h));
                            m6830b(obj, i);
                            break;
                        }
                    case 4:
                        if (!m6823a(obj2, i)) {
                            break;
                        } else {
                            dlv.m7031a(obj, h, dlv.m7024a(obj2, h));
                            m6830b(obj, i);
                            break;
                        }
                    case 5:
                        if (!m6823a(obj2, i)) {
                            break;
                        } else {
                            dlv.m7032a(obj, h, dlv.m7037b(obj2, h));
                            m6830b(obj, i);
                            break;
                        }
                    case 6:
                        if (!m6823a(obj2, i)) {
                            break;
                        } else {
                            dlv.m7031a(obj, h, dlv.m7024a(obj2, h));
                            m6830b(obj, i);
                            break;
                        }
                    case 7:
                        if (!m6823a(obj2, i)) {
                            break;
                        } else {
                            dlv.m7034a(obj, h, dlv.m7041c(obj2, h));
                            m6830b(obj, i);
                            break;
                        }
                    case 8:
                        if (!m6823a(obj2, i)) {
                            break;
                        } else {
                            dlv.m7033a(obj, h, dlv.m7045f(obj2, h));
                            m6830b(obj, i);
                            break;
                        }
                    case 9:
                        m6822a(obj, obj2, i);
                        break;
                    case 10:
                        if (!m6823a(obj2, i)) {
                            break;
                        } else {
                            dlv.m7033a(obj, h, dlv.m7045f(obj2, h));
                            m6830b(obj, i);
                            break;
                        }
                    case 11:
                        if (!m6823a(obj2, i)) {
                            break;
                        } else {
                            dlv.m7031a(obj, h, dlv.m7024a(obj2, h));
                            m6830b(obj, i);
                            break;
                        }
                    case 12:
                        if (!m6823a(obj2, i)) {
                            break;
                        } else {
                            dlv.m7031a(obj, h, dlv.m7024a(obj2, h));
                            m6830b(obj, i);
                            break;
                        }
                    case 13:
                        if (!m6823a(obj2, i)) {
                            break;
                        } else {
                            dlv.m7031a(obj, h, dlv.m7024a(obj2, h));
                            m6830b(obj, i);
                            break;
                        }
                    case 14:
                        if (!m6823a(obj2, i)) {
                            break;
                        } else {
                            dlv.m7032a(obj, h, dlv.m7037b(obj2, h));
                            m6830b(obj, i);
                            break;
                        }
                    case 15:
                        if (!m6823a(obj2, i)) {
                            break;
                        } else {
                            dlv.m7031a(obj, h, dlv.m7024a(obj2, h));
                            m6830b(obj, i);
                            break;
                        }
                    case 16:
                        if (!m6823a(obj2, i)) {
                            break;
                        } else {
                            dlv.m7032a(obj, h, dlv.m7037b(obj2, h));
                            m6830b(obj, i);
                            break;
                        }
                    case 17:
                        m6822a(obj, obj2, i);
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
                        this.f8726n.mo4548a(obj, obj2, h);
                        break;
                    case 50:
                        dky.m6902a(this.f8727o, obj, obj2, h);
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
                        if (!m6824a(obj2, d, i)) {
                            break;
                        } else {
                            dlv.m7033a(obj, h, dlv.m7045f(obj2, h));
                            m6831b(obj, d, i);
                            break;
                        }
                    case 60:
                        m6833b(obj, obj2, i);
                        break;
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                        if (!m6824a(obj2, d, i)) {
                            break;
                        } else {
                            dlv.m7033a(obj, h, dlv.m7045f(obj2, h));
                            m6831b(obj, d, i);
                            break;
                        }
                    case 68:
                        m6833b(obj, obj2, i);
                        break;
                }
            }
            dky.m6915c(obj, obj2);
            if (this.f8720h) {
                dky.m6911b(obj, obj2);
                return;
            }
            return;
        }
        throw null;
    }

    /* renamed from: a */
    public final void mo4578a(Object obj, byte[] bArr, int i, int i2, dhy dhy) {
        if (!this.f8721i) {
            mo4575a(obj, bArr, i, i2, 0, dhy);
        } else {
            m6834b(obj, bArr, i, i2, dhy);
        }
    }

    /* renamed from: a */
    private final void m6822a(Object obj, Object obj2, int i) {
        long h = m6850h(m6841e(i));
        if (m6823a(obj2, i)) {
            Object f = dlv.m7045f(obj, h);
            Object f2 = dlv.m7045f(obj2, h);
            if (f != null && f2 != null) {
                dlv.m7033a(obj, h, djl.m6724a(f, f2));
                m6830b(obj, i);
            } else if (f2 != null) {
                dlv.m7033a(obj, h, f2);
                m6830b(obj, i);
            }
        }
    }

    /* renamed from: b */
    private final void m6833b(Object obj, Object obj2, int i) {
        int e = m6841e(i);
        int d = m6839d(i);
        long h = m6850h(e);
        if (m6824a(obj2, d, i)) {
            Object f = dlv.m7045f(obj, h);
            Object f2 = dlv.m7045f(obj2, h);
            if (f != null && f2 != null) {
                dlv.m7033a(obj, h, djl.m6724a(f, f2));
                m6831b(obj, d, i);
            } else if (f2 != null) {
                dlv.m7033a(obj, h, f2);
                m6831b(obj, d, i);
            }
        }
    }

    /* renamed from: a */
    public final Object mo4576a() {
        return this.f8725m.mo4585a(this.f8719g);
    }

    /* renamed from: a */
    static dkm m6815a(dkh dkh, dkp dkp, djx djx, dlw dlw, dkc dkc, dke dke) {
        if (dkh instanceof dkv) {
            return m6816a((dkv) dkh, dkp, djx, dlw, dkc, dke);
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
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static p000.dkm m6816a(p000.dkv r36, p000.dkp r37, p000.djx r38, p000.dlw r39, p000.dkc r40, p000.dke r41) {
        /*
            r0 = r36
            int r1 = r36.mo4573c()
            r2 = 0
            r4 = 2
            if (r1 != r4) goto L_0x000c
            r11 = 1
            goto L_0x000e
        L_0x000c:
            r11 = 0
        L_0x000e:
            java.lang.String r1 = r0.f8740b
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
            int[] r8 = p000.dkm.f8713a
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
            sun.misc.Unsafe r6 = p000.dkm.f8714b
            java.lang.Object[] r3 = r0.f8741c
            dkk r7 = r0.f8739a
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
            java.lang.reflect.Field r15 = m6818a(r7, r15)
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
            java.lang.reflect.Field r15 = m6818a(r7, r15)
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
            java.lang.reflect.Field r8 = m6818a(r7, r8)
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
            java.lang.reflect.Field r8 = m6818a(r7, r8)
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
            dkk r10 = r2.f8739a
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
        throw new UnsupportedOperationException("Method not decompiled: p000.dkm.m6816a(dkv, dkp, djx, dlw, dkc, dke):dkm");
    }

    /* renamed from: d */
    private final int m6839d(int i) {
        return this.f8715c[i];
    }

    /* renamed from: f */
    private static boolean m6846f(Object obj, long j) {
        return ((Boolean) dlv.m7045f(obj, j)).booleanValue();
    }

    /* renamed from: b */
    private static double m6827b(Object obj, long j) {
        return ((Double) dlv.m7045f(obj, j)).doubleValue();
    }

    /* renamed from: c */
    private static float m6835c(Object obj, long j) {
        return ((Float) dlv.m7045f(obj, j)).floatValue();
    }

    /* renamed from: d */
    private static int m6840d(Object obj, long j) {
        return ((Integer) dlv.m7045f(obj, j)).intValue();
    }

    /* renamed from: e */
    private static long m6843e(Object obj, long j) {
        return ((Long) dlv.m7045f(obj, j)).longValue();
    }

    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v8, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m6814a(java.lang.Object r5, byte[] r6, int r7, int r8, int r9, long r10, p000.dhy r12) {
        /*
            r4 = this;
            sun.misc.Unsafe r0 = p000.dkm.f8714b
            java.lang.Object r9 = r4.m6829b(r9)
            java.lang.Object r1 = r0.getObject(r5, r10)
            dke r2 = r4.f8727o
            boolean r2 = r2.mo4568c(r1)
            if (r2 == 0) goto L_0x0022
            dke r2 = r4.f8727o
            java.lang.Object r2 = r2.mo4563a()
            dke r3 = r4.f8727o
            r3.mo4564a(r2, r1)
            r0.putObject(r5, r10, r2)
            r1 = r2
            goto L_0x0023
        L_0x0022:
        L_0x0023:
            dke r5 = r4.f8727o
            r5.mo4570e(r9)
            dke r5 = r4.f8727o
            java.util.Map r5 = r5.mo4565a(r1)
            int r7 = p000.dhz.m6478a(r6, r7, r12)
            int r9 = r12.f8567a
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
            int r11 = p000.dhz.m6473a(r7, r6, r11, r12)
            int r7 = r12.f8567a
            goto L_0x004c
        L_0x004b:
        L_0x004c:
            int r0 = r7 >>> 3
            r1 = 1
            if (r0 == r1) goto L_0x005b
            r1 = 2
            if (r0 == r1) goto L_0x0059
            int r7 = p000.dhz.m6470a(r7, r6, r11, r8, r12)
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
            djn r5 = p000.djn.m6735e()
            throw r5
        L_0x0068:
            djn r5 = p000.djn.m6731a()
            goto L_0x006e
        L_0x006d:
            throw r5
        L_0x006e:
            goto L_0x006d
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.dkm.m6814a(java.lang.Object, byte[], int, int, int, long, dhy):int");
    }

    /* renamed from: a */
    private final int m6812a(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, dhy dhy) {
        boolean z;
        Object obj2 = obj;
        byte[] bArr2 = bArr;
        int i9 = i;
        int i10 = i3;
        int i11 = i4;
        int i12 = i5;
        long j2 = j;
        int i13 = i8;
        dhy dhy2 = dhy;
        Unsafe unsafe = f8714b;
        long j3 = (long) (this.f8715c[i13 + 2] & 1048575);
        switch (i7) {
            case 51:
                if (i12 == 1) {
                    unsafe.putObject(obj2, j2, Double.valueOf(dhz.m6486c(bArr, i)));
                    unsafe.putInt(obj2, j3, i11);
                    return i9 + 8;
                }
                break;
            case 52:
                if (i12 == 5) {
                    unsafe.putObject(obj2, j2, Float.valueOf(dhz.m6488d(bArr, i)));
                    unsafe.putInt(obj2, j3, i11);
                    return i9 + 4;
                }
                break;
            case 53:
            case 54:
                if (i12 == 0) {
                    int b = dhz.m6483b(bArr2, i9, dhy2);
                    unsafe.putObject(obj2, j2, Long.valueOf(dhy2.f8568b));
                    unsafe.putInt(obj2, j3, i11);
                    return b;
                }
                break;
            case 55:
            case 62:
                if (i12 == 0) {
                    int a = dhz.m6478a(bArr2, i9, dhy2);
                    unsafe.putObject(obj2, j2, Integer.valueOf(dhy2.f8567a));
                    unsafe.putInt(obj2, j3, i11);
                    return a;
                }
                break;
            case 56:
            case 65:
                if (i12 == 1) {
                    unsafe.putObject(obj2, j2, Long.valueOf(dhz.m6484b(bArr, i)));
                    unsafe.putInt(obj2, j3, i11);
                    return i9 + 8;
                }
                break;
            case 57:
            case 64:
                if (i12 == 5) {
                    unsafe.putObject(obj2, j2, Integer.valueOf(dhz.m6477a(bArr, i)));
                    unsafe.putInt(obj2, j3, i11);
                    return i9 + 4;
                }
                break;
            case 58:
                if (i12 == 0) {
                    int b2 = dhz.m6483b(bArr2, i9, dhy2);
                    if (dhy2.f8568b != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    unsafe.putObject(obj2, j2, Boolean.valueOf(z));
                    unsafe.putInt(obj2, j3, i11);
                    return b2;
                }
                break;
            case 59:
                if (i12 == 2) {
                    int a2 = dhz.m6478a(bArr2, i9, dhy2);
                    int i14 = dhy2.f8567a;
                    if (i14 == 0) {
                        unsafe.putObject(obj2, j2, "");
                    } else if ((i6 & 536870912) != 0 && !dmb.m7090a(bArr2, a2, a2 + i14)) {
                        throw djn.m6736f();
                    } else {
                        unsafe.putObject(obj2, j2, new String(bArr2, a2, i14, djl.f8682a));
                        a2 += i14;
                    }
                    unsafe.putInt(obj2, j3, i11);
                    return a2;
                }
                break;
            case 60:
                if (i12 == 2) {
                    int a3 = dhz.m6476a(m6817a(i13), bArr2, i9, i2, dhy2);
                    Object object = unsafe.getInt(obj2, j3) == i11 ? unsafe.getObject(obj2, j2) : null;
                    if (object != null) {
                        unsafe.putObject(obj2, j2, djl.m6724a(object, dhy2.f8569c));
                    } else {
                        unsafe.putObject(obj2, j2, dhy2.f8569c);
                    }
                    unsafe.putInt(obj2, j3, i11);
                    return a3;
                }
                break;
            case 61:
                if (i12 == 2) {
                    int e = dhz.m6490e(bArr2, i9, dhy2);
                    unsafe.putObject(obj2, j2, dhy2.f8569c);
                    unsafe.putInt(obj2, j3, i11);
                    return e;
                }
                break;
            case 63:
                if (i12 == 0) {
                    int a4 = dhz.m6478a(bArr2, i9, dhy2);
                    int i15 = dhy2.f8567a;
                    djh c = m6836c(i13);
                    if (c == null || c.mo4289a(i15)) {
                        unsafe.putObject(obj2, j2, Integer.valueOf(i15));
                        unsafe.putInt(obj2, j3, i11);
                    } else {
                        m6848g(obj).mo4627a(i10, Long.valueOf((long) i15));
                    }
                    return a4;
                }
                break;
            case 66:
                if (i12 == 0) {
                    int a5 = dhz.m6478a(bArr2, i9, dhy2);
                    unsafe.putObject(obj2, j2, Integer.valueOf(dil.m6526a(dhy2.f8567a)));
                    unsafe.putInt(obj2, j3, i11);
                    return a5;
                }
                break;
            case 67:
                if (i12 == 0) {
                    int b3 = dhz.m6483b(bArr2, i9, dhy2);
                    unsafe.putObject(obj2, j2, Long.valueOf(dil.m6527a(dhy2.f8568b)));
                    unsafe.putInt(obj2, j3, i11);
                    return b3;
                }
                break;
            case 68:
                if (i12 == 3) {
                    int a6 = dhz.m6475a(m6817a(i13), bArr, i, i2, (i10 & -8) | 4, dhy);
                    Object object2 = unsafe.getInt(obj2, j3) == i11 ? unsafe.getObject(obj2, j2) : null;
                    if (object2 != null) {
                        unsafe.putObject(obj2, j2, djl.m6724a(object2, dhy2.f8569c));
                    } else {
                        unsafe.putObject(obj2, j2, dhy2.f8569c);
                    }
                    unsafe.putInt(obj2, j3, i11);
                    return a6;
                }
                break;
        }
        return i9;
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
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo4575a(java.lang.Object r31, byte[] r32, int r33, int r34, int r35, p000.dhy r36) {
        /*
            r30 = this;
            r15 = r30
            r0 = r31
            r13 = r32
            r14 = r34
            r12 = r35
            r10 = r36
            sun.misc.Unsafe r11 = p000.dkm.f8714b
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
            int r1 = p000.dhz.m6473a(r1, r13, r2, r10)
            int r2 = r10.f8567a
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
            int r3 = r15.m6811a(r1, r4)
            r4 = r3
            goto L_0x0040
        L_0x003b:
            int r3 = r15.m6851i(r1)
            r4 = r3
        L_0x0040:
            r3 = -1
            if (r4 == r3) goto L_0x04df
            int[] r3 = r15.f8715c
            int r19 = r4 + 1
            r3 = r3[r19]
            int r9 = m6847g(r3)
            long r12 = m6850h(r3)
            r20 = r2
            r2 = 17
            if (r9 > r2) goto L_0x039b
            int[] r2 = r15.f8715c
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
            dkw r2 = r15.m6817a(r4)
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
            int r1 = p000.dhz.m6475a(r1, r2, r3, r4, r5, r6)
            r2 = r7 & r21
            if (r2 != 0) goto L_0x00be
            java.lang.Object r2 = r10.f8569c
            r11.putObject(r0, r12, r2)
            goto L_0x00cb
        L_0x00be:
            java.lang.Object r2 = r11.getObject(r0, r12)
            java.lang.Object r3 = r10.f8569c
            java.lang.Object r2 = p000.djl.m6724a(r2, r3)
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
            int r9 = p000.dhz.m6483b(r13, r9, r10)
            long r1 = r10.f8568b
            long r22 = p000.dil.m6527a(r1)
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
            int r1 = p000.dhz.m6478a(r13, r9, r10)
            int r2 = r10.f8567a
            int r2 = p000.dil.m6526a(r2)
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
            int r1 = p000.dhz.m6478a(r13, r9, r10)
            int r2 = r10.f8567a
            djh r5 = r15.m6836c(r12)
            if (r5 == 0) goto L_0x0188
            boolean r5 = r5.mo4289a(r2)
            if (r5 == 0) goto L_0x0170
            goto L_0x0188
        L_0x0170:
            dlm r3 = m6848g(r31)
            long r4 = (long) r2
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            r3.mo4627a(r8, r2)
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
            int r1 = p000.dhz.m6490e(r13, r9, r10)
            java.lang.Object r2 = r10.f8569c
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
            dkw r1 = r15.m6817a(r12)
            r2 = r34
            r18 = -1
            int r1 = p000.dhz.m6476a(r1, r13, r9, r2, r10)
            r5 = r7 & r21
            if (r5 != 0) goto L_0x01f2
            java.lang.Object r5 = r10.f8569c
            r11.putObject(r0, r3, r5)
            goto L_0x01ff
        L_0x01f2:
            java.lang.Object r5 = r11.getObject(r0, r3)
            java.lang.Object r6 = r10.f8569c
            java.lang.Object r5 = p000.djl.m6724a(r5, r6)
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
            int r1 = p000.dhz.m6489d(r13, r9, r10)
            goto L_0x0238
        L_0x0234:
            int r1 = p000.dhz.m6487c(r13, r9, r10)
        L_0x0238:
            java.lang.Object r3 = r10.f8569c
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
            int r1 = p000.dhz.m6483b(r13, r9, r10)
            long r5 = r10.f8568b
            r22 = 0
            int r9 = (r5 > r22 ? 1 : (r5 == r22 ? 0 : -1))
            if (r9 == 0) goto L_0x026e
            r5 = 1
            goto L_0x0270
        L_0x026e:
            r5 = 0
        L_0x0270:
            p000.dlv.m7034a(r0, r3, r5)
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
            int r1 = p000.dhz.m6477a(r13, r9)
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
            long r5 = p000.dhz.m6484b(r13, r9)
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
            int r1 = p000.dhz.m6478a(r13, r9, r10)
            int r2 = r10.f8567a
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
            int r9 = p000.dhz.m6483b(r13, r9, r10)
            long r5 = r10.f8568b
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
            float r1 = p000.dhz.m6488d(r13, r9)
            p000.dlv.m7030a(r0, r3, r1)
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
            double r1 = p000.dhz.m6486c(r13, r9)
            p000.dlv.m7029a(r0, r3, r1)
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
            int r1 = r1.m6813a(r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13, r15)
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
            int r1 = r1.m6812a(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r13, r14)
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
            int r1 = r1.m6814a(r2, r3, r4, r5, r6, r7, r9)
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
            djk r3 = (p000.djk) r3
            boolean r5 = r3.mo4374a()
            if (r5 != 0) goto L_0x04a5
            int r5 = r3.size()
            if (r5 == 0) goto L_0x049a
            int r5 = r5 + r5
            goto L_0x049d
        L_0x049a:
            r5 = 10
        L_0x049d:
            djk r3 = r3.mo4398a(r5)
            r8.putObject(r0, r1, r3)
            goto L_0x04a6
        L_0x04a5:
        L_0x04a6:
            r6 = r3
            r9 = r30
            r11 = r18
            dkw r1 = r9.m6817a(r11)
            r2 = r25
            r3 = r32
            r5 = r34
            r7 = r36
            int r1 = p000.dhz.m6474a(r1, r2, r3, r4, r5, r6, r7)
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
            boolean r1 = r9.f8720h
            if (r1 == 0) goto L_0x052f
            r13 = r36
            dis r1 = r13.f8570d
            dis r2 = p000.dis.m6616a()
            if (r1 == r2) goto L_0x052c
            dkk r1 = r9.f8719g
            dis r2 = r13.f8570d
            r10 = r23
            diq r1 = r2.mo4468a(r1, r10)
            if (r1 != 0) goto L_0x0524
            dlm r5 = m6848g(r31)
            r1 = r12
            r2 = r32
            r4 = r34
            r6 = r36
            int r1 = p000.dhz.m6472a(r1, r2, r3, r4, r5, r6)
            goto L_0x0542
        L_0x0524:
            djc r0 = (p000.djc) r0
            r0.mo4510a()
            div r0 = r0.f8675a
            throw r17
        L_0x052c:
            r10 = r23
            goto L_0x0533
        L_0x052f:
            r13 = r36
            r10 = r23
        L_0x0533:
            dlm r5 = m6848g(r31)
            r1 = r12
            r2 = r32
            r4 = r34
            r6 = r36
            int r1 = p000.dhz.m6472a(r1, r2, r3, r4, r5, r6)
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
            int r1 = r9.f8723k
            r2 = r17
        L_0x056b:
            int r4 = r9.f8724l
            if (r1 >= r4) goto L_0x05fd
            int[] r4 = r9.f8722j
            r4 = r4[r1]
            int r5 = r9.m6839d(r4)
            int r6 = r9.m6841e(r4)
            long r6 = m6850h(r6)
            java.lang.Object r6 = p000.dlv.m7045f(r0, r6)
            if (r6 != 0) goto L_0x0586
            goto L_0x05f9
        L_0x0586:
            djh r7 = r9.m6836c(r4)
            if (r7 == 0) goto L_0x05f9
            dke r8 = r9.f8727o
            java.util.Map r6 = r8.mo4565a(r6)
            dke r8 = r9.f8727o
            java.lang.Object r4 = r9.m6829b(r4)
            r8.mo4570e(r4)
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
            boolean r8 = r7.mo4289a(r8)
            if (r8 != 0) goto L_0x05a3
            if (r2 == 0) goto L_0x05c2
            goto L_0x05c6
        L_0x05c2:
            dlm r2 = p000.dlm.m6972a()
        L_0x05c6:
            java.lang.Object r8 = r6.getKey()
            java.lang.Object r13 = r6.getValue()
            int r8 = p000.dkc.m6770a(r8, r13)
            dig r8 = p000.dik.m6516d(r8)
            din r13 = r8.f8579a
            java.lang.Object r14 = r6.getKey()     // Catch:{ IOException -> 0x05f2 }
            java.lang.Object r6 = r6.getValue()     // Catch:{ IOException -> 0x05f2 }
            p000.dkc.m6773a(r13, r14, r6)     // Catch:{ IOException -> 0x05f2 }
            int r6 = p000.dme.m7093a(r5, r10)
            dik r8 = r8.mo4412a()
            r2.mo4627a(r6, r8)
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
            p000.dlw.m7055a(r0, r2)
        L_0x0602:
            if (r11 == 0) goto L_0x0610
            r0 = r34
            if (r3 > r0) goto L_0x060b
            if (r12 != r11) goto L_0x060b
            goto L_0x0614
        L_0x060b:
            djn r0 = p000.djn.m6735e()
            throw r0
        L_0x0610:
            r0 = r34
            if (r3 != r0) goto L_0x0615
        L_0x0614:
            return r3
        L_0x0615:
            djn r0 = p000.djn.m6735e()
            goto L_0x061b
        L_0x061a:
            throw r0
        L_0x061b:
            goto L_0x061a
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.dkm.mo4575a(java.lang.Object, byte[], int, int, int, dhy):int");
    }

    /* JADX WARN: Type inference failed for: r3v17, types: [int] */
    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m6834b(java.lang.Object r27, byte[] r28, int r29, int r30, p000.dhy r31) {
        /*
            r26 = this;
            r15 = r26
            r14 = r27
            r12 = r28
            r13 = r30
            r11 = r31
            sun.misc.Unsafe r9 = p000.dkm.f8714b
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
            int r0 = p000.dhz.m6473a(r0, r12, r3, r11)
            int r3 = r11.f8567a
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
            int r0 = r15.m6811a(r7, r2)
            r4 = r0
            goto L_0x003b
        L_0x0036:
            int r0 = r15.m6851i(r7)
            r4 = r0
        L_0x003b:
            if (r4 == r10) goto L_0x02bf
            int[] r0 = r15.f8715c
            int r1 = r4 + 1
            r5 = r0[r1]
            int r3 = m6847g(r5)
            long r1 = m6850h(r5)
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
            int r6 = p000.dhz.m6483b(r12, r8, r11)
            r19 = r1
            long r0 = r11.f8568b
            long r21 = p000.dil.m6527a(r0)
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
            int r0 = p000.dhz.m6478a(r12, r8, r11)
            int r1 = r11.f8567a
            int r1 = p000.dil.m6526a(r1)
            r9.putInt(r14, r2, r1)
            r1 = r7
            r2 = r10
            r10 = -1
            goto L_0x0013
        L_0x0093:
            r2 = r1
            r10 = r4
            if (r6 != 0) goto L_0x0055
            int r0 = p000.dhz.m6478a(r12, r8, r11)
            int r1 = r11.f8567a
            r9.putInt(r14, r2, r1)
            r1 = r7
            r2 = r10
            r10 = -1
            goto L_0x0013
        L_0x00a5:
            r2 = r1
            if (r6 != r10) goto L_0x0116
            int r0 = p000.dhz.m6490e(r12, r8, r11)
            java.lang.Object r1 = r11.f8569c
            r9.putObject(r14, r2, r1)
            r2 = r4
            r1 = r7
            r10 = -1
            goto L_0x0013
        L_0x00b6:
            r2 = r1
            if (r6 != r10) goto L_0x0116
            dkw r0 = r15.m6817a(r4)
            int r0 = p000.dhz.m6476a(r0, r12, r8, r13, r11)
            java.lang.Object r1 = r9.getObject(r14, r2)
            if (r1 != 0) goto L_0x00cd
            java.lang.Object r1 = r11.f8569c
            r9.putObject(r14, r2, r1)
            goto L_0x00d6
        L_0x00cd:
            java.lang.Object r5 = r11.f8569c
            java.lang.Object r1 = p000.djl.m6724a(r1, r5)
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
            int r0 = p000.dhz.m6489d(r12, r8, r11)
            goto L_0x00ec
        L_0x00e8:
            int r0 = p000.dhz.m6487c(r12, r8, r11)
        L_0x00ec:
            java.lang.Object r1 = r11.f8569c
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
            int r1 = p000.dhz.m6483b(r12, r8, r11)
            long r5 = r11.f8568b
            r19 = 0
            int r8 = (r5 > r19 ? 1 : (r5 == r19 ? 0 : -1))
            if (r8 == 0) goto L_0x0107
            goto L_0x0109
        L_0x0107:
            r0 = 0
        L_0x0109:
            p000.dlv.m7034a(r14, r2, r0)
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
            int r0 = p000.dhz.m6477a(r12, r8)
            r9.putInt(r14, r2, r0)
            int r0 = r8 + 4
            r2 = r4
            r1 = r7
            r10 = -1
            goto L_0x0013
        L_0x0127:
            r2 = r1
            if (r6 != r0) goto L_0x0054
            long r5 = p000.dhz.m6484b(r12, r8)
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
            int r0 = p000.dhz.m6478a(r12, r8, r11)
            int r1 = r11.f8567a
            r9.putInt(r14, r2, r1)
            r1 = r7
            r2 = r10
            r10 = -1
            goto L_0x0013
        L_0x014f:
            r2 = r1
            r10 = r4
            if (r6 != 0) goto L_0x0055
            int r6 = p000.dhz.m6483b(r12, r8, r11)
            long r4 = r11.f8568b
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
            float r0 = p000.dhz.m6488d(r12, r8)
            p000.dlv.m7030a(r14, r2, r0)
            int r0 = r8 + 4
            r1 = r7
            r2 = r10
            r10 = -1
            goto L_0x0013
        L_0x0178:
            r2 = r1
            r10 = r4
            if (r6 != r0) goto L_0x0055
            double r0 = p000.dhz.m6486c(r12, r8)
            p000.dlv.m7029a(r14, r2, r0)
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
            int r0 = r0.m6813a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
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
            int r0 = r0.m6812a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
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
            int r0 = r0.m6814a(r1, r2, r3, r4, r5, r6, r8)
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
            djk r2 = (p000.djk) r2
            boolean r3 = r2.mo4374a()
            if (r3 != 0) goto L_0x028e
            int r3 = r2.size()
            if (r3 == 0) goto L_0x0283
            int r3 = r3 + r3
            goto L_0x0286
        L_0x0283:
            r3 = 10
        L_0x0286:
            djk r2 = r2.mo4398a(r3)
            r8.putObject(r7, r0, r2)
            goto L_0x028f
        L_0x028e:
        L_0x028f:
            r5 = r2
            r9 = r26
            r10 = r29
            r3 = r15
            dkw r0 = r9.m6817a(r10)
            r1 = r17
            r2 = r28
            r4 = r30
            r6 = r31
            int r0 = p000.dhz.m6474a(r0, r1, r2, r3, r4, r5, r6)
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
            dlm r4 = m6848g(r27)
            r0 = r17
            r1 = r28
            r3 = r30
            r5 = r31
            int r0 = p000.dhz.m6472a(r0, r1, r2, r3, r4, r5)
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
            djn r0 = p000.djn.m6735e()
            goto L_0x02f4
        L_0x02f3:
            throw r0
        L_0x02f4:
            goto L_0x02f3
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.dkm.m6834b(java.lang.Object, byte[], int, int, dhy):void");
    }

    /* renamed from: a */
    private final int m6813a(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, long j, int i7, long j2, dhy dhy) {
        boolean z;
        boolean z2;
        int i8;
        int i9;
        int i10;
        Object obj2 = obj;
        byte[] bArr2 = bArr;
        int i11 = i;
        int i12 = i2;
        int i13 = i3;
        int i14 = i5;
        int i15 = i6;
        long j3 = j2;
        dhy dhy2 = dhy;
        djk djk = (djk) f8714b.getObject(obj2, j3);
        if (!djk.mo4374a()) {
            int size = djk.size();
            if (size != 0) {
                i10 = size + size;
            } else {
                i10 = 10;
            }
            djk = djk.mo4398a(i10);
            f8714b.putObject(obj2, j3, djk);
        }
        switch (i7) {
            case 18:
            case 35:
                if (i14 == 2) {
                    dip dip = (dip) djk;
                    int a = dhz.m6478a(bArr2, i11, dhy2);
                    int i16 = dhy2.f8567a + a;
                    while (a < i16) {
                        dip.mo4462a(dhz.m6486c(bArr2, a));
                        a += 8;
                    }
                    if (a == i16) {
                        return a;
                    }
                    throw djn.m6731a();
                } else if (i14 == 1) {
                    dip dip2 = (dip) djk;
                    dip2.mo4462a(dhz.m6486c(bArr, i));
                    int i17 = i11 + 8;
                    while (i17 < i12) {
                        int a2 = dhz.m6478a(bArr2, i17, dhy2);
                        if (i13 != dhy2.f8567a) {
                            return i17;
                        }
                        dip2.mo4462a(dhz.m6486c(bArr2, a2));
                        i17 = a2 + 8;
                    }
                    return i17;
                }
                break;
            case 19:
            case 36:
                if (i14 == 2) {
                    dix dix = (dix) djk;
                    int a3 = dhz.m6478a(bArr2, i11, dhy2);
                    int i18 = dhy2.f8567a + a3;
                    while (a3 < i18) {
                        dix.mo4486a(dhz.m6488d(bArr2, a3));
                        a3 += 4;
                    }
                    if (a3 == i18) {
                        return a3;
                    }
                    throw djn.m6731a();
                } else if (i14 == 5) {
                    dix dix2 = (dix) djk;
                    dix2.mo4486a(dhz.m6488d(bArr, i));
                    int i19 = i11 + 4;
                    while (i19 < i12) {
                        int a4 = dhz.m6478a(bArr2, i19, dhy2);
                        if (i13 != dhy2.f8567a) {
                            return i19;
                        }
                        dix2.mo4486a(dhz.m6488d(bArr2, a4));
                        i19 = a4 + 4;
                    }
                    return i19;
                }
                break;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i14 == 2) {
                    djy djy = (djy) djk;
                    int a5 = dhz.m6478a(bArr2, i11, dhy2);
                    int i20 = dhy2.f8567a + a5;
                    while (a5 < i20) {
                        a5 = dhz.m6483b(bArr2, a5, dhy2);
                        djy.mo4528a(dhy2.f8568b);
                    }
                    if (a5 == i20) {
                        return a5;
                    }
                    throw djn.m6731a();
                } else if (i14 == 0) {
                    djy djy2 = (djy) djk;
                    int b = dhz.m6483b(bArr2, i11, dhy2);
                    djy2.mo4528a(dhy2.f8568b);
                    while (b < i12) {
                        int a6 = dhz.m6478a(bArr2, b, dhy2);
                        if (i13 != dhy2.f8567a) {
                            return b;
                        }
                        b = dhz.m6483b(bArr2, a6, dhy2);
                        djy2.mo4528a(dhy2.f8568b);
                    }
                    return b;
                }
                break;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i14 == 2) {
                    return dhz.m6479a(bArr2, i11, djk, dhy2);
                }
                if (i14 == 0) {
                    return dhz.m6471a(i3, bArr, i, i2, djk, dhy);
                }
                break;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i14 == 2) {
                    djy djy3 = (djy) djk;
                    int a7 = dhz.m6478a(bArr2, i11, dhy2);
                    int i21 = dhy2.f8567a + a7;
                    while (a7 < i21) {
                        djy3.mo4528a(dhz.m6484b(bArr2, a7));
                        a7 += 8;
                    }
                    if (a7 == i21) {
                        return a7;
                    }
                    throw djn.m6731a();
                } else if (i14 == 1) {
                    djy djy4 = (djy) djk;
                    djy4.mo4528a(dhz.m6484b(bArr, i));
                    int i22 = i11 + 8;
                    while (i22 < i12) {
                        int a8 = dhz.m6478a(bArr2, i22, dhy2);
                        if (i13 != dhy2.f8567a) {
                            return i22;
                        }
                        djy4.mo4528a(dhz.m6484b(bArr2, a8));
                        i22 = a8 + 8;
                    }
                    return i22;
                }
                break;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i14 == 2) {
                    djf djf = (djf) djk;
                    int a9 = dhz.m6478a(bArr2, i11, dhy2);
                    int i23 = dhy2.f8567a + a9;
                    while (a9 < i23) {
                        djf.mo4523d(dhz.m6477a(bArr2, a9));
                        a9 += 4;
                    }
                    if (a9 == i23) {
                        return a9;
                    }
                    throw djn.m6731a();
                } else if (i14 == 5) {
                    djf djf2 = (djf) djk;
                    djf2.mo4523d(dhz.m6477a(bArr, i));
                    int i24 = i11 + 4;
                    while (i24 < i12) {
                        int a10 = dhz.m6478a(bArr2, i24, dhy2);
                        if (i13 != dhy2.f8567a) {
                            return i24;
                        }
                        djf2.mo4523d(dhz.m6477a(bArr2, a10));
                        i24 = a10 + 4;
                    }
                    return i24;
                }
                break;
            case 25:
            case 42:
                if (i14 == 2) {
                    dib dib = (dib) djk;
                    int a11 = dhz.m6478a(bArr2, i11, dhy2);
                    int i25 = dhy2.f8567a + a11;
                    while (a11 < i25) {
                        a11 = dhz.m6483b(bArr2, a11, dhy2);
                        dib.mo4399a(dhy2.f8568b != 0);
                    }
                    if (a11 == i25) {
                        return a11;
                    }
                    throw djn.m6731a();
                } else if (i14 == 0) {
                    dib dib2 = (dib) djk;
                    int b2 = dhz.m6483b(bArr2, i11, dhy2);
                    if (dhy2.f8568b != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    dib2.mo4399a(z);
                    while (b2 < i12) {
                        int a12 = dhz.m6478a(bArr2, b2, dhy2);
                        if (i13 != dhy2.f8567a) {
                            return b2;
                        }
                        b2 = dhz.m6483b(bArr2, a12, dhy2);
                        if (dhy2.f8568b != 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        dib2.mo4399a(z2);
                    }
                    return b2;
                }
                break;
            case 26:
                if (i14 == 2) {
                    if ((j & 536870912) != 0) {
                        int a13 = dhz.m6478a(bArr2, i11, dhy2);
                        int i26 = dhy2.f8567a;
                        if (i26 >= 0) {
                            if (i26 == 0) {
                                djk.add("");
                            } else {
                                int i27 = a13 + i26;
                                if (dmb.m7090a(bArr2, a13, i27)) {
                                    djk.add(new String(bArr2, a13, i26, djl.f8682a));
                                    a13 = i27;
                                } else {
                                    throw djn.m6736f();
                                }
                            }
                            while (i11 < i12) {
                                int a14 = dhz.m6478a(bArr2, i11, dhy2);
                                if (i13 != dhy2.f8567a) {
                                    break;
                                } else {
                                    i11 = dhz.m6478a(bArr2, a14, dhy2);
                                    int i28 = dhy2.f8567a;
                                    if (i28 < 0) {
                                        throw djn.m6732b();
                                    } else if (i28 == 0) {
                                        djk.add("");
                                    } else {
                                        int i29 = i11 + i28;
                                        if (dmb.m7090a(bArr2, i11, i29)) {
                                            djk.add(new String(bArr2, i11, i28, djl.f8682a));
                                            i11 = i29;
                                        } else {
                                            throw djn.m6736f();
                                        }
                                    }
                                }
                            }
                            break;
                        } else {
                            throw djn.m6732b();
                        }
                    } else {
                        int a15 = dhz.m6478a(bArr2, i11, dhy2);
                        int i30 = dhy2.f8567a;
                        if (i30 >= 0) {
                            if (i30 != 0) {
                                djk.add(new String(bArr2, a15, i30, djl.f8682a));
                                a15 += i30;
                            } else {
                                djk.add("");
                            }
                            while (i11 < i12) {
                                int a16 = dhz.m6478a(bArr2, i11, dhy2);
                                if (i13 != dhy2.f8567a) {
                                    break;
                                } else {
                                    int i31 = dhz.m6478a(bArr2, a16, dhy2);
                                    int i32 = dhy2.f8567a;
                                    if (i32 < 0) {
                                        throw djn.m6732b();
                                    } else if (i32 != 0) {
                                        djk.add(new String(bArr2, i31, i32, djl.f8682a));
                                        i31 += i32;
                                    } else {
                                        djk.add("");
                                    }
                                }
                            }
                            break;
                        } else {
                            throw djn.m6732b();
                        }
                    }
                }
                break;
            case 27:
                if (i14 == 2) {
                    return dhz.m6474a(m6817a(i15), i3, bArr, i, i2, djk, dhy);
                }
                break;
            case 28:
                if (i14 == 2) {
                    int a17 = dhz.m6478a(bArr2, i11, dhy2);
                    int i33 = dhy2.f8567a;
                    if (i33 < 0) {
                        throw djn.m6732b();
                    } else if (i33 <= bArr2.length - a17) {
                        if (i33 != 0) {
                            djk.add(dik.m6515a(bArr2, a17, i33));
                            a17 += i33;
                        } else {
                            djk.add(dik.f8583b);
                        }
                        while (i8 < i12) {
                            int a18 = dhz.m6478a(bArr2, i8, dhy2);
                            if (i13 != dhy2.f8567a) {
                                return i8;
                            }
                            i8 = dhz.m6478a(bArr2, a18, dhy2);
                            int i34 = dhy2.f8567a;
                            if (i34 < 0) {
                                throw djn.m6732b();
                            } else if (i34 > bArr2.length - i8) {
                                throw djn.m6731a();
                            } else if (i34 != 0) {
                                djk.add(dik.m6515a(bArr2, i8, i34));
                                i8 += i34;
                            } else {
                                djk.add(dik.f8583b);
                            }
                        }
                        return i8;
                    } else {
                        throw djn.m6731a();
                    }
                }
                break;
            case 30:
            case 44:
                if (i14 == 2) {
                    i9 = dhz.m6479a(bArr2, i11, djk, dhy2);
                } else if (i14 == 0) {
                    i9 = dhz.m6471a(i3, bArr, i, i2, djk, dhy);
                }
                dje dje = (dje) obj2;
                dlm dlm = dje.f8677A;
                if (dlm == dlm.f8766a) {
                    dlm = null;
                }
                dlm dlm2 = (dlm) dky.m6898a(i4, djk, m6836c(i15), dlm);
                if (dlm2 == null) {
                    return i9;
                }
                dje.f8677A = dlm2;
                return i9;
            case 33:
            case 47:
                if (i14 == 2) {
                    djf djf3 = (djf) djk;
                    int a19 = dhz.m6478a(bArr2, i11, dhy2);
                    int i35 = dhy2.f8567a + a19;
                    while (a19 < i35) {
                        a19 = dhz.m6478a(bArr2, a19, dhy2);
                        djf3.mo4523d(dil.m6526a(dhy2.f8567a));
                    }
                    if (a19 == i35) {
                        return a19;
                    }
                    throw djn.m6731a();
                } else if (i14 == 0) {
                    djf djf4 = (djf) djk;
                    int a20 = dhz.m6478a(bArr2, i11, dhy2);
                    djf4.mo4523d(dil.m6526a(dhy2.f8567a));
                    while (a20 < i12) {
                        int a21 = dhz.m6478a(bArr2, a20, dhy2);
                        if (i13 != dhy2.f8567a) {
                            return a20;
                        }
                        a20 = dhz.m6478a(bArr2, a21, dhy2);
                        djf4.mo4523d(dil.m6526a(dhy2.f8567a));
                    }
                    return a20;
                }
                break;
            case 34:
            case 48:
                if (i14 == 2) {
                    djy djy5 = (djy) djk;
                    int a22 = dhz.m6478a(bArr2, i11, dhy2);
                    int i36 = dhy2.f8567a + a22;
                    while (a22 < i36) {
                        a22 = dhz.m6483b(bArr2, a22, dhy2);
                        djy5.mo4528a(dil.m6527a(dhy2.f8568b));
                    }
                    if (a22 == i36) {
                        return a22;
                    }
                    throw djn.m6731a();
                } else if (i14 == 0) {
                    djy djy6 = (djy) djk;
                    int b3 = dhz.m6483b(bArr2, i11, dhy2);
                    djy6.mo4528a(dil.m6527a(dhy2.f8568b));
                    while (b3 < i12) {
                        int a23 = dhz.m6478a(bArr2, b3, dhy2);
                        if (i13 != dhy2.f8567a) {
                            return b3;
                        }
                        b3 = dhz.m6483b(bArr2, a23, dhy2);
                        djy6.mo4528a(dil.m6527a(dhy2.f8568b));
                    }
                    return b3;
                }
                break;
            default:
                if (i14 == 3) {
                    dkw a24 = m6817a(i15);
                    int i37 = (i13 & -8) | 4;
                    int a25 = dhz.m6475a(a24, bArr, i, i2, i37, dhy);
                    djk.add(dhy2.f8569c);
                    while (a25 < i12) {
                        int a26 = dhz.m6478a(bArr2, a25, dhy2);
                        if (i13 != dhy2.f8567a) {
                            return a25;
                        }
                        a25 = dhz.m6475a(a24, bArr, a26, i2, i37, dhy);
                        djk.add(dhy2.f8569c);
                    }
                    return a25;
                }
                break;
        }
        return i11;
    }

    /* renamed from: i */
    private final int m6851i(int i) {
        if (i < this.f8717e || i > this.f8718f) {
            return -1;
        }
        return m6828b(i, 0);
    }

    /* renamed from: a */
    private final int m6811a(int i, int i2) {
        if (i < this.f8717e || i > this.f8718f) {
            return -1;
        }
        return m6828b(i, i2);
    }

    /* renamed from: f */
    private final int m6844f(int i) {
        return this.f8715c[i + 2];
    }

    /* renamed from: a */
    private static Field m6818a(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e) {
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

    /* renamed from: b */
    private final void m6830b(Object obj, int i) {
        if (!this.f8721i) {
            int f = m6844f(i);
            long j = (long) (1048575 & f);
            dlv.m7031a(obj, j, (1 << (f >>> 20)) | dlv.m7024a(obj, j));
        }
    }

    /* renamed from: b */
    private final void m6831b(Object obj, int i, int i2) {
        dlv.m7031a(obj, (long) (m6844f(i2) & 1048575), i);
    }

    /* renamed from: b */
    private final int m6828b(int i, int i2) {
        int length = (this.f8715c.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int d = m6839d(i4);
            if (i == d) {
                return i4;
            }
            if (i < d) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    /* renamed from: e */
    private final int m6841e(int i) {
        return this.f8715c[i + 1];
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
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m6832b(java.lang.Object r19, p000.dmf r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            boolean r3 = r0.f8720h
            if (r3 == 0) goto L_0x0020
            div r3 = p000.dkc.m6772a(r19)
            boolean r5 = r3.mo4477a()
            if (r5 != 0) goto L_0x001f
            java.util.Iterator r3 = r3.mo4482d()
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L_0x0022
        L_0x001f:
        L_0x0020:
            r3 = 0
            r5 = 0
        L_0x0022:
            int[] r6 = r0.f8715c
            int r6 = r6.length
            sun.misc.Unsafe r7 = p000.dkm.f8714b
            r8 = -1
            r8 = r5
            r5 = 0
            r10 = -1
            r11 = 0
        L_0x002c:
            if (r5 >= r6) goto L_0x0543
            int r12 = r0.m6841e(r5)
            int r13 = r0.m6839d(r5)
            int r14 = m6847g(r12)
            boolean r15 = r0.f8721i
            r4 = 1
            if (r15 == 0) goto L_0x0041
        L_0x003f:
            r9 = 0
            goto L_0x0062
        L_0x0041:
            r15 = 17
            if (r14 > r15) goto L_0x003f
            int[] r15 = r0.f8715c
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
            int r15 = p000.dkc.m6771a(r8)
            if (r15 > r13) goto L_0x007c
            p000.dkc.m6775b(r8)
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
            long r4 = m6850h(r12)
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
            boolean r9 = r0.m6824a(r1, r13, r12)
            if (r9 == 0) goto L_0x009d
            java.lang.Object r4 = r7.getObject(r1, r4)
            dkw r5 = r0.m6817a(r12)
            r2.mo4454b(r13, r4, r5)
            r14 = 0
            goto L_0x053e
        L_0x009d:
            r14 = 0
            goto L_0x053e
        L_0x00a0:
            r12 = r15
            boolean r9 = r0.m6824a(r1, r13, r12)
            if (r9 == 0) goto L_0x00b1
            long r4 = m6843e(r1, r4)
            r2.mo4460e(r13, r4)
            r14 = 0
            goto L_0x053e
        L_0x00b1:
            r14 = 0
            goto L_0x053e
        L_0x00b4:
            r12 = r15
            boolean r9 = r0.m6824a(r1, r13, r12)
            if (r9 == 0) goto L_0x00c5
            int r4 = m6840d(r1, r4)
            r2.mo4461f(r13, r4)
            r14 = 0
            goto L_0x053e
        L_0x00c5:
            r14 = 0
            goto L_0x053e
        L_0x00c8:
            r12 = r15
            boolean r9 = r0.m6824a(r1, r13, r12)
            if (r9 == 0) goto L_0x00d9
            long r4 = m6843e(r1, r4)
            r2.mo4453b(r13, r4)
            r14 = 0
            goto L_0x053e
        L_0x00d9:
            r14 = 0
            goto L_0x053e
        L_0x00dc:
            r12 = r15
            boolean r9 = r0.m6824a(r1, r13, r12)
            if (r9 == 0) goto L_0x00ed
            int r4 = m6840d(r1, r4)
            r2.mo4446a(r13, r4)
            r14 = 0
            goto L_0x053e
        L_0x00ed:
            r14 = 0
            goto L_0x053e
        L_0x00f0:
            r12 = r15
            boolean r9 = r0.m6824a(r1, r13, r12)
            if (r9 == 0) goto L_0x0101
            int r4 = m6840d(r1, r4)
            r2.mo4452b(r13, r4)
            r14 = 0
            goto L_0x053e
        L_0x0101:
            r14 = 0
            goto L_0x053e
        L_0x0104:
            r12 = r15
            boolean r9 = r0.m6824a(r1, r13, r12)
            if (r9 == 0) goto L_0x0115
            int r4 = m6840d(r1, r4)
            r2.mo4459e(r13, r4)
            r14 = 0
            goto L_0x053e
        L_0x0115:
            r14 = 0
            goto L_0x053e
        L_0x0118:
            r12 = r15
            boolean r9 = r0.m6824a(r1, r13, r12)
            if (r9 == 0) goto L_0x012b
            java.lang.Object r4 = r7.getObject(r1, r4)
            dik r4 = (p000.dik) r4
            r2.mo4448a(r13, r4)
            r14 = 0
            goto L_0x053e
        L_0x012b:
            r14 = 0
            goto L_0x053e
        L_0x012e:
            r12 = r15
            boolean r9 = r0.m6824a(r1, r13, r12)
            if (r9 == 0) goto L_0x0143
            java.lang.Object r4 = r7.getObject(r1, r4)
            dkw r5 = r0.m6817a(r12)
            r2.mo4450a(r13, r4, r5)
            r14 = 0
            goto L_0x053e
        L_0x0143:
            r14 = 0
            goto L_0x053e
        L_0x0146:
            r12 = r15
            boolean r9 = r0.m6824a(r1, r13, r12)
            if (r9 == 0) goto L_0x0157
            java.lang.Object r4 = r7.getObject(r1, r4)
            m6820a(r13, r4, r2)
            r14 = 0
            goto L_0x053e
        L_0x0157:
            r14 = 0
            goto L_0x053e
        L_0x015a:
            r12 = r15
            boolean r9 = r0.m6824a(r1, r13, r12)
            if (r9 == 0) goto L_0x016b
            boolean r4 = m6846f(r1, r4)
            r2.mo4451a(r13, r4)
            r14 = 0
            goto L_0x053e
        L_0x016b:
            r14 = 0
            goto L_0x053e
        L_0x016e:
            r12 = r15
            boolean r9 = r0.m6824a(r1, r13, r12)
            if (r9 == 0) goto L_0x017f
            int r4 = m6840d(r1, r4)
            r2.mo4457d(r13, r4)
            r14 = 0
            goto L_0x053e
        L_0x017f:
            r14 = 0
            goto L_0x053e
        L_0x0182:
            r12 = r15
            boolean r9 = r0.m6824a(r1, r13, r12)
            if (r9 == 0) goto L_0x0193
            long r4 = m6843e(r1, r4)
            r2.mo4458d(r13, r4)
            r14 = 0
            goto L_0x053e
        L_0x0193:
            r14 = 0
            goto L_0x053e
        L_0x0196:
            r12 = r15
            boolean r9 = r0.m6824a(r1, r13, r12)
            if (r9 == 0) goto L_0x01a7
            int r4 = m6840d(r1, r4)
            r2.mo4455c(r13, r4)
            r14 = 0
            goto L_0x053e
        L_0x01a7:
            r14 = 0
            goto L_0x053e
        L_0x01aa:
            r12 = r15
            boolean r9 = r0.m6824a(r1, r13, r12)
            if (r9 == 0) goto L_0x01bb
            long r4 = m6843e(r1, r4)
            r2.mo4456c(r13, r4)
            r14 = 0
            goto L_0x053e
        L_0x01bb:
            r14 = 0
            goto L_0x053e
        L_0x01be:
            r12 = r15
            boolean r9 = r0.m6824a(r1, r13, r12)
            if (r9 == 0) goto L_0x01cf
            long r4 = m6843e(r1, r4)
            r2.mo4447a(r13, r4)
            r14 = 0
            goto L_0x053e
        L_0x01cf:
            r14 = 0
            goto L_0x053e
        L_0x01d2:
            r12 = r15
            boolean r9 = r0.m6824a(r1, r13, r12)
            if (r9 == 0) goto L_0x01e3
            float r4 = m6835c(r1, r4)
            r2.mo4445a(r13, r4)
            r14 = 0
            goto L_0x053e
        L_0x01e3:
            r14 = 0
            goto L_0x053e
        L_0x01e6:
            r12 = r15
            boolean r9 = r0.m6824a(r1, r13, r12)
            if (r9 == 0) goto L_0x01f7
            double r4 = m6827b(r1, r4)
            r2.mo4444a(r13, r4)
            r14 = 0
            goto L_0x053e
        L_0x01f7:
            r14 = 0
            goto L_0x053e
        L_0x01fa:
            r12 = r15
            java.lang.Object r4 = r7.getObject(r1, r4)
            r0.m6821a(r2, r13, r4, r12)
            r14 = 0
            goto L_0x053e
        L_0x0205:
            r12 = r15
            int r9 = r0.m6839d(r12)
            java.lang.Object r4 = r7.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            dkw r5 = r0.m6817a(r12)
            p000.dky.m6909b(r9, r4, r2, r5)
            r14 = 0
            goto L_0x053e
        L_0x021a:
            r12 = r15
            int r9 = r0.m6839d(r12)
            java.lang.Object r4 = r7.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            r13 = 1
            p000.dky.m6921e(r9, r4, r2, r13)
            r14 = 0
            goto L_0x053e
        L_0x022c:
            r12 = r15
            r13 = 1
            int r9 = r0.m6839d(r12)
            java.lang.Object r4 = r7.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            p000.dky.m6936j(r9, r4, r2, r13)
            r14 = 0
            goto L_0x053e
        L_0x023e:
            r12 = r15
            r13 = 1
            int r9 = r0.m6839d(r12)
            java.lang.Object r4 = r7.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            p000.dky.m6927g(r9, r4, r2, r13)
            r14 = 0
            goto L_0x053e
        L_0x0250:
            r12 = r15
            r13 = 1
            int r9 = r0.m6839d(r12)
            java.lang.Object r4 = r7.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            p000.dky.m6940l(r9, r4, r2, r13)
            r14 = 0
            goto L_0x053e
        L_0x0262:
            r12 = r15
            r13 = 1
            int r9 = r0.m6839d(r12)
            java.lang.Object r4 = r7.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            p000.dky.m6941m(r9, r4, r2, r13)
            r14 = 0
            goto L_0x053e
        L_0x0274:
            r12 = r15
            r13 = 1
            int r9 = r0.m6839d(r12)
            java.lang.Object r4 = r7.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            p000.dky.m6933i(r9, r4, r2, r13)
            r14 = 0
            goto L_0x053e
        L_0x0286:
            r12 = r15
            r13 = 1
            int r9 = r0.m6839d(r12)
            java.lang.Object r4 = r7.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            p000.dky.m6942n(r9, r4, r2, r13)
            r14 = 0
            goto L_0x053e
        L_0x0298:
            r12 = r15
            r13 = 1
            int r9 = r0.m6839d(r12)
            java.lang.Object r4 = r7.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            p000.dky.m6938k(r9, r4, r2, r13)
            r14 = 0
            goto L_0x053e
        L_0x02aa:
            r12 = r15
            r13 = 1
            int r9 = r0.m6839d(r12)
            java.lang.Object r4 = r7.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            p000.dky.m6924f(r9, r4, r2, r13)
            r14 = 0
            goto L_0x053e
        L_0x02bc:
            r12 = r15
            r13 = 1
            int r9 = r0.m6839d(r12)
            java.lang.Object r4 = r7.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            p000.dky.m6930h(r9, r4, r2, r13)
            r14 = 0
            goto L_0x053e
        L_0x02ce:
            r12 = r15
            r13 = 1
            int r9 = r0.m6839d(r12)
            java.lang.Object r4 = r7.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            p000.dky.m6918d(r9, r4, r2, r13)
            r14 = 0
            goto L_0x053e
        L_0x02e0:
            r12 = r15
            r13 = 1
            int r9 = r0.m6839d(r12)
            java.lang.Object r4 = r7.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            p000.dky.m6914c(r9, r4, r2, r13)
            r14 = 0
            goto L_0x053e
        L_0x02f2:
            r12 = r15
            r13 = 1
            int r9 = r0.m6839d(r12)
            java.lang.Object r4 = r7.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            p000.dky.m6910b(r9, r4, r2, r13)
            r14 = 0
            goto L_0x053e
        L_0x0304:
            r12 = r15
            r13 = 1
            int r9 = r0.m6839d(r12)
            java.lang.Object r4 = r7.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            p000.dky.m6901a(r9, r4, r2, r13)
            r14 = 0
            goto L_0x053e
        L_0x0316:
            r12 = r15
            int r9 = r0.m6839d(r12)
            java.lang.Object r4 = r7.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            r13 = 0
            p000.dky.m6921e(r9, r4, r2, r13)
            r14 = 0
            goto L_0x053e
        L_0x0328:
            r12 = r15
            r13 = 0
            int r9 = r0.m6839d(r12)
            java.lang.Object r4 = r7.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            p000.dky.m6936j(r9, r4, r2, r13)
            r14 = 0
            goto L_0x053e
        L_0x033a:
            r12 = r15
            r13 = 0
            int r9 = r0.m6839d(r12)
            java.lang.Object r4 = r7.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            p000.dky.m6927g(r9, r4, r2, r13)
            r14 = 0
            goto L_0x053e
        L_0x034c:
            r12 = r15
            r13 = 0
            int r9 = r0.m6839d(r12)
            java.lang.Object r4 = r7.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            p000.dky.m6940l(r9, r4, r2, r13)
            r14 = 0
            goto L_0x053e
        L_0x035e:
            r12 = r15
            r13 = 0
            int r9 = r0.m6839d(r12)
            java.lang.Object r4 = r7.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            p000.dky.m6941m(r9, r4, r2, r13)
            r14 = 0
            goto L_0x053e
        L_0x0370:
            r12 = r15
            r13 = 0
            int r9 = r0.m6839d(r12)
            java.lang.Object r4 = r7.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            p000.dky.m6933i(r9, r4, r2, r13)
            r14 = 0
            goto L_0x053e
        L_0x0382:
            r12 = r15
            int r9 = r0.m6839d(r12)
            java.lang.Object r4 = r7.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            p000.dky.m6908b(r9, r4, r2)
            r14 = 0
            goto L_0x053e
        L_0x0393:
            r12 = r15
            int r9 = r0.m6839d(r12)
            java.lang.Object r4 = r7.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            dkw r5 = r0.m6817a(r12)
            p000.dky.m6900a(r9, r4, r2, r5)
            r14 = 0
            goto L_0x053e
        L_0x03a8:
            r12 = r15
            int r9 = r0.m6839d(r12)
            java.lang.Object r4 = r7.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            p000.dky.m6899a(r9, r4, r2)
            r14 = 0
            goto L_0x053e
        L_0x03b9:
            r12 = r15
            int r9 = r0.m6839d(r12)
            java.lang.Object r4 = r7.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            r14 = 0
            p000.dky.m6942n(r9, r4, r2, r14)
            goto L_0x053e
        L_0x03ca:
            r12 = r15
            r14 = 0
            int r9 = r0.m6839d(r12)
            java.lang.Object r4 = r7.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            p000.dky.m6938k(r9, r4, r2, r14)
            goto L_0x053e
        L_0x03db:
            r12 = r15
            r14 = 0
            int r9 = r0.m6839d(r12)
            java.lang.Object r4 = r7.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            p000.dky.m6924f(r9, r4, r2, r14)
            goto L_0x053e
        L_0x03ec:
            r12 = r15
            r14 = 0
            int r9 = r0.m6839d(r12)
            java.lang.Object r4 = r7.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            p000.dky.m6930h(r9, r4, r2, r14)
            goto L_0x053e
        L_0x03fd:
            r12 = r15
            r14 = 0
            int r9 = r0.m6839d(r12)
            java.lang.Object r4 = r7.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            p000.dky.m6918d(r9, r4, r2, r14)
            goto L_0x053e
        L_0x040e:
            r12 = r15
            r14 = 0
            int r9 = r0.m6839d(r12)
            java.lang.Object r4 = r7.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            p000.dky.m6914c(r9, r4, r2, r14)
            goto L_0x053e
        L_0x041f:
            r12 = r15
            r14 = 0
            int r9 = r0.m6839d(r12)
            java.lang.Object r4 = r7.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            p000.dky.m6910b(r9, r4, r2, r14)
            goto L_0x053e
        L_0x0430:
            r12 = r15
            r14 = 0
            int r9 = r0.m6839d(r12)
            java.lang.Object r4 = r7.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            p000.dky.m6901a(r9, r4, r2, r14)
            goto L_0x053e
        L_0x0441:
            r12 = r15
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x053e
            java.lang.Object r4 = r7.getObject(r1, r4)
            dkw r5 = r0.m6817a(r12)
            r2.mo4454b(r13, r4, r5)
            goto L_0x053e
        L_0x0453:
            r12 = r15
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x053e
            long r4 = r7.getLong(r1, r4)
            r2.mo4460e(r13, r4)
            goto L_0x053e
        L_0x0461:
            r12 = r15
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x053e
            int r4 = r7.getInt(r1, r4)
            r2.mo4461f(r13, r4)
            goto L_0x053e
        L_0x046f:
            r12 = r15
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x053e
            long r4 = r7.getLong(r1, r4)
            r2.mo4453b(r13, r4)
            goto L_0x053e
        L_0x047d:
            r12 = r15
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x053e
            int r4 = r7.getInt(r1, r4)
            r2.mo4446a(r13, r4)
            goto L_0x053e
        L_0x048b:
            r12 = r15
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x053e
            int r4 = r7.getInt(r1, r4)
            r2.mo4452b(r13, r4)
            goto L_0x053e
        L_0x0499:
            r12 = r15
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x053e
            int r4 = r7.getInt(r1, r4)
            r2.mo4459e(r13, r4)
            goto L_0x053e
        L_0x04a7:
            r12 = r15
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x053e
            java.lang.Object r4 = r7.getObject(r1, r4)
            dik r4 = (p000.dik) r4
            r2.mo4448a(r13, r4)
            goto L_0x053e
        L_0x04b7:
            r12 = r15
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x053e
            java.lang.Object r4 = r7.getObject(r1, r4)
            dkw r5 = r0.m6817a(r12)
            r2.mo4450a(r13, r4, r5)
            goto L_0x053e
        L_0x04c9:
            r12 = r15
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x053e
            java.lang.Object r4 = r7.getObject(r1, r4)
            m6820a(r13, r4, r2)
            goto L_0x053e
        L_0x04d7:
            r12 = r15
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x053e
            boolean r4 = p000.dlv.m7041c(r1, r4)
            r2.mo4451a(r13, r4)
            goto L_0x053e
        L_0x04e4:
            r12 = r15
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x053e
            int r4 = r7.getInt(r1, r4)
            r2.mo4457d(r13, r4)
            goto L_0x053e
        L_0x04f1:
            r12 = r15
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x053e
            long r4 = r7.getLong(r1, r4)
            r2.mo4458d(r13, r4)
            goto L_0x053e
        L_0x04fe:
            r12 = r15
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x053e
            int r4 = r7.getInt(r1, r4)
            r2.mo4455c(r13, r4)
            goto L_0x053e
        L_0x050b:
            r12 = r15
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x053e
            long r4 = r7.getLong(r1, r4)
            r2.mo4456c(r13, r4)
            goto L_0x053e
        L_0x0518:
            r12 = r15
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x053e
            long r4 = r7.getLong(r1, r4)
            r2.mo4447a(r13, r4)
            goto L_0x053e
        L_0x0525:
            r12 = r15
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x053e
            float r4 = p000.dlv.m7042d(r1, r4)
            r2.mo4445a(r13, r4)
            goto L_0x053e
        L_0x0532:
            r12 = r15
            r14 = 0
            r9 = r9 & r11
            if (r9 == 0) goto L_0x053e
            double r4 = p000.dlv.m7044e(r1, r4)
            r2.mo4444a(r13, r4)
        L_0x053e:
            int r5 = r12 + 3
            goto L_0x002c
        L_0x0543:
        L_0x0544:
            if (r8 == 0) goto L_0x0559
            p000.dkc.m6775b(r8)
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
            m6837c(r19, r20)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.dkm.m6832b(java.lang.Object, dmf):void");
    }

    /* renamed from: a */
    private final void m6821a(dmf dmf, int i, Object obj, int i2) {
        if (obj != null) {
            this.f8727o.mo4570e(m6829b(i2));
            for (Map.Entry entry : this.f8727o.mo4567b(obj).entrySet()) {
                dio dio = (dio) dmf;
                dio.f8594a.mo4437f(i, 2);
                dio.f8594a.mo4439g(dkc.m6770a(entry.getKey(), entry.getValue()));
                dkc.m6773a(dio.f8594a, entry.getKey(), entry.getValue());
            }
        }
    }

    /* renamed from: a */
    private static final void m6820a(int i, Object obj, dmf dmf) {
        if (obj instanceof String) {
            ((dio) dmf).f8594a.mo4432b(i, (String) obj);
            return;
        }
        dmf.mo4448a(i, (dik) obj);
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
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo4577a(java.lang.Object r13, p000.dmf r14) {
        /*
            r12 = this;
            boolean r0 = r12.f8721i
            if (r0 == 0) goto L_0x05a0
            boolean r0 = r12.f8720h
            r1 = 0
            if (r0 == 0) goto L_0x001f
            div r0 = p000.dkc.m6772a(r13)
            boolean r2 = r0.mo4477a()
            if (r2 != 0) goto L_0x001e
            java.util.Iterator r0 = r0.mo4482d()
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L_0x0021
        L_0x001e:
        L_0x001f:
            r0 = r1
            r2 = r0
        L_0x0021:
            int[] r3 = r12.f8715c
            int r3 = r3.length
            r4 = 0
            r5 = r2
            r2 = 0
        L_0x0027:
            if (r2 < r3) goto L_0x0043
        L_0x002a:
            if (r5 == 0) goto L_0x003f
            p000.dkc.m6775b(r5)
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
            m6837c(r13, r14)
            return
        L_0x0043:
            int r6 = r12.m6841e(r2)
            int r7 = r12.m6839d(r2)
        L_0x004b:
            if (r5 == 0) goto L_0x0065
            int r8 = p000.dkc.m6771a(r5)
            if (r8 > r7) goto L_0x0065
            p000.dkc.m6775b(r5)
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x0063
            java.lang.Object r5 = r0.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L_0x004b
        L_0x0063:
            r5 = r1
            goto L_0x004b
        L_0x0065:
            int r8 = m6847g(r6)
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
            boolean r8 = r12.m6824a(r13, r7, r2)
            if (r8 == 0) goto L_0x059c
            long r8 = m6850h(r6)
            java.lang.Object r6 = p000.dlv.m7045f(r13, r8)
            dkw r8 = r12.m6817a(r2)
            r14.mo4454b(r7, r6, r8)
            goto L_0x059c
        L_0x0086:
            boolean r8 = r12.m6824a(r13, r7, r2)
            if (r8 == 0) goto L_0x059c
            long r8 = m6850h(r6)
            long r8 = m6843e(r13, r8)
            r14.mo4460e(r7, r8)
            goto L_0x059c
        L_0x0099:
            boolean r8 = r12.m6824a(r13, r7, r2)
            if (r8 == 0) goto L_0x059c
            long r8 = m6850h(r6)
            int r6 = m6840d(r13, r8)
            r14.mo4461f(r7, r6)
            goto L_0x059c
        L_0x00ac:
            boolean r8 = r12.m6824a(r13, r7, r2)
            if (r8 == 0) goto L_0x059c
            long r8 = m6850h(r6)
            long r8 = m6843e(r13, r8)
            r14.mo4453b(r7, r8)
            goto L_0x059c
        L_0x00bf:
            boolean r8 = r12.m6824a(r13, r7, r2)
            if (r8 == 0) goto L_0x059c
            long r8 = m6850h(r6)
            int r6 = m6840d(r13, r8)
            r14.mo4446a(r7, r6)
            goto L_0x059c
        L_0x00d2:
            boolean r8 = r12.m6824a(r13, r7, r2)
            if (r8 == 0) goto L_0x059c
            long r8 = m6850h(r6)
            int r6 = m6840d(r13, r8)
            r14.mo4452b(r7, r6)
            goto L_0x059c
        L_0x00e5:
            boolean r8 = r12.m6824a(r13, r7, r2)
            if (r8 == 0) goto L_0x059c
            long r8 = m6850h(r6)
            int r6 = m6840d(r13, r8)
            r14.mo4459e(r7, r6)
            goto L_0x059c
        L_0x00f8:
            boolean r8 = r12.m6824a(r13, r7, r2)
            if (r8 == 0) goto L_0x059c
            long r8 = m6850h(r6)
            java.lang.Object r6 = p000.dlv.m7045f(r13, r8)
            dik r6 = (p000.dik) r6
            r14.mo4448a(r7, r6)
            goto L_0x059c
        L_0x010d:
            boolean r8 = r12.m6824a(r13, r7, r2)
            if (r8 == 0) goto L_0x059c
            long r8 = m6850h(r6)
            java.lang.Object r6 = p000.dlv.m7045f(r13, r8)
            dkw r8 = r12.m6817a(r2)
            r14.mo4450a(r7, r6, r8)
            goto L_0x059c
        L_0x0124:
            boolean r8 = r12.m6824a(r13, r7, r2)
            if (r8 == 0) goto L_0x059c
            long r8 = m6850h(r6)
            java.lang.Object r6 = p000.dlv.m7045f(r13, r8)
            m6820a(r7, r6, r14)
            goto L_0x059c
        L_0x0137:
            boolean r8 = r12.m6824a(r13, r7, r2)
            if (r8 == 0) goto L_0x059c
            long r8 = m6850h(r6)
            boolean r6 = m6846f(r13, r8)
            r14.mo4451a(r7, r6)
            goto L_0x059c
        L_0x014a:
            boolean r8 = r12.m6824a(r13, r7, r2)
            if (r8 == 0) goto L_0x059c
            long r8 = m6850h(r6)
            int r6 = m6840d(r13, r8)
            r14.mo4457d(r7, r6)
            goto L_0x059c
        L_0x015d:
            boolean r8 = r12.m6824a(r13, r7, r2)
            if (r8 == 0) goto L_0x059c
            long r8 = m6850h(r6)
            long r8 = m6843e(r13, r8)
            r14.mo4458d(r7, r8)
            goto L_0x059c
        L_0x0170:
            boolean r8 = r12.m6824a(r13, r7, r2)
            if (r8 == 0) goto L_0x059c
            long r8 = m6850h(r6)
            int r6 = m6840d(r13, r8)
            r14.mo4455c(r7, r6)
            goto L_0x059c
        L_0x0183:
            boolean r8 = r12.m6824a(r13, r7, r2)
            if (r8 == 0) goto L_0x059c
            long r8 = m6850h(r6)
            long r8 = m6843e(r13, r8)
            r14.mo4456c(r7, r8)
            goto L_0x059c
        L_0x0196:
            boolean r8 = r12.m6824a(r13, r7, r2)
            if (r8 == 0) goto L_0x059c
            long r8 = m6850h(r6)
            long r8 = m6843e(r13, r8)
            r14.mo4447a(r7, r8)
            goto L_0x059c
        L_0x01a9:
            boolean r8 = r12.m6824a(r13, r7, r2)
            if (r8 == 0) goto L_0x059c
            long r8 = m6850h(r6)
            float r6 = m6835c(r13, r8)
            r14.mo4445a(r7, r6)
            goto L_0x059c
        L_0x01bc:
            boolean r8 = r12.m6824a(r13, r7, r2)
            if (r8 == 0) goto L_0x059c
            long r8 = m6850h(r6)
            double r8 = m6827b(r13, r8)
            r14.mo4444a(r7, r8)
            goto L_0x059c
        L_0x01cf:
            long r8 = m6850h(r6)
            java.lang.Object r6 = p000.dlv.m7045f(r13, r8)
            r12.m6821a(r14, r7, r6, r2)
            goto L_0x059c
        L_0x01dc:
            int r7 = r12.m6839d(r2)
            long r8 = m6850h(r6)
            java.lang.Object r6 = p000.dlv.m7045f(r13, r8)
            java.util.List r6 = (java.util.List) r6
            dkw r8 = r12.m6817a(r2)
            p000.dky.m6909b(r7, r6, r14, r8)
            goto L_0x059c
        L_0x01f3:
            int r7 = r12.m6839d(r2)
            long r10 = m6850h(r6)
            java.lang.Object r6 = p000.dlv.m7045f(r13, r10)
            java.util.List r6 = (java.util.List) r6
            p000.dky.m6921e(r7, r6, r14, r9)
            goto L_0x059c
        L_0x0206:
            int r7 = r12.m6839d(r2)
            long r10 = m6850h(r6)
            java.lang.Object r6 = p000.dlv.m7045f(r13, r10)
            java.util.List r6 = (java.util.List) r6
            p000.dky.m6936j(r7, r6, r14, r9)
            goto L_0x059c
        L_0x0219:
            int r7 = r12.m6839d(r2)
            long r10 = m6850h(r6)
            java.lang.Object r6 = p000.dlv.m7045f(r13, r10)
            java.util.List r6 = (java.util.List) r6
            p000.dky.m6927g(r7, r6, r14, r9)
            goto L_0x059c
        L_0x022c:
            int r7 = r12.m6839d(r2)
            long r10 = m6850h(r6)
            java.lang.Object r6 = p000.dlv.m7045f(r13, r10)
            java.util.List r6 = (java.util.List) r6
            p000.dky.m6940l(r7, r6, r14, r9)
            goto L_0x059c
        L_0x023f:
            int r7 = r12.m6839d(r2)
            long r10 = m6850h(r6)
            java.lang.Object r6 = p000.dlv.m7045f(r13, r10)
            java.util.List r6 = (java.util.List) r6
            p000.dky.m6941m(r7, r6, r14, r9)
            goto L_0x059c
        L_0x0252:
            int r7 = r12.m6839d(r2)
            long r10 = m6850h(r6)
            java.lang.Object r6 = p000.dlv.m7045f(r13, r10)
            java.util.List r6 = (java.util.List) r6
            p000.dky.m6933i(r7, r6, r14, r9)
            goto L_0x059c
        L_0x0265:
            int r7 = r12.m6839d(r2)
            long r10 = m6850h(r6)
            java.lang.Object r6 = p000.dlv.m7045f(r13, r10)
            java.util.List r6 = (java.util.List) r6
            p000.dky.m6942n(r7, r6, r14, r9)
            goto L_0x059c
        L_0x0278:
            int r7 = r12.m6839d(r2)
            long r10 = m6850h(r6)
            java.lang.Object r6 = p000.dlv.m7045f(r13, r10)
            java.util.List r6 = (java.util.List) r6
            p000.dky.m6938k(r7, r6, r14, r9)
            goto L_0x059c
        L_0x028b:
            int r7 = r12.m6839d(r2)
            long r10 = m6850h(r6)
            java.lang.Object r6 = p000.dlv.m7045f(r13, r10)
            java.util.List r6 = (java.util.List) r6
            p000.dky.m6924f(r7, r6, r14, r9)
            goto L_0x059c
        L_0x029e:
            int r7 = r12.m6839d(r2)
            long r10 = m6850h(r6)
            java.lang.Object r6 = p000.dlv.m7045f(r13, r10)
            java.util.List r6 = (java.util.List) r6
            p000.dky.m6930h(r7, r6, r14, r9)
            goto L_0x059c
        L_0x02b1:
            int r7 = r12.m6839d(r2)
            long r10 = m6850h(r6)
            java.lang.Object r6 = p000.dlv.m7045f(r13, r10)
            java.util.List r6 = (java.util.List) r6
            p000.dky.m6918d(r7, r6, r14, r9)
            goto L_0x059c
        L_0x02c4:
            int r7 = r12.m6839d(r2)
            long r10 = m6850h(r6)
            java.lang.Object r6 = p000.dlv.m7045f(r13, r10)
            java.util.List r6 = (java.util.List) r6
            p000.dky.m6914c(r7, r6, r14, r9)
            goto L_0x059c
        L_0x02d7:
            int r7 = r12.m6839d(r2)
            long r10 = m6850h(r6)
            java.lang.Object r6 = p000.dlv.m7045f(r13, r10)
            java.util.List r6 = (java.util.List) r6
            p000.dky.m6910b(r7, r6, r14, r9)
            goto L_0x059c
        L_0x02ea:
            int r7 = r12.m6839d(r2)
            long r10 = m6850h(r6)
            java.lang.Object r6 = p000.dlv.m7045f(r13, r10)
            java.util.List r6 = (java.util.List) r6
            p000.dky.m6901a(r7, r6, r14, r9)
            goto L_0x059c
        L_0x02fd:
            int r7 = r12.m6839d(r2)
            long r8 = m6850h(r6)
            java.lang.Object r6 = p000.dlv.m7045f(r13, r8)
            java.util.List r6 = (java.util.List) r6
            p000.dky.m6921e(r7, r6, r14, r4)
            goto L_0x059c
        L_0x0310:
            int r7 = r12.m6839d(r2)
            long r8 = m6850h(r6)
            java.lang.Object r6 = p000.dlv.m7045f(r13, r8)
            java.util.List r6 = (java.util.List) r6
            p000.dky.m6936j(r7, r6, r14, r4)
            goto L_0x059c
        L_0x0323:
            int r7 = r12.m6839d(r2)
            long r8 = m6850h(r6)
            java.lang.Object r6 = p000.dlv.m7045f(r13, r8)
            java.util.List r6 = (java.util.List) r6
            p000.dky.m6927g(r7, r6, r14, r4)
            goto L_0x059c
        L_0x0336:
            int r7 = r12.m6839d(r2)
            long r8 = m6850h(r6)
            java.lang.Object r6 = p000.dlv.m7045f(r13, r8)
            java.util.List r6 = (java.util.List) r6
            p000.dky.m6940l(r7, r6, r14, r4)
            goto L_0x059c
        L_0x0349:
            int r7 = r12.m6839d(r2)
            long r8 = m6850h(r6)
            java.lang.Object r6 = p000.dlv.m7045f(r13, r8)
            java.util.List r6 = (java.util.List) r6
            p000.dky.m6941m(r7, r6, r14, r4)
            goto L_0x059c
        L_0x035c:
            int r7 = r12.m6839d(r2)
            long r8 = m6850h(r6)
            java.lang.Object r6 = p000.dlv.m7045f(r13, r8)
            java.util.List r6 = (java.util.List) r6
            p000.dky.m6933i(r7, r6, r14, r4)
            goto L_0x059c
        L_0x036f:
            int r7 = r12.m6839d(r2)
            long r8 = m6850h(r6)
            java.lang.Object r6 = p000.dlv.m7045f(r13, r8)
            java.util.List r6 = (java.util.List) r6
            p000.dky.m6908b(r7, r6, r14)
            goto L_0x059c
        L_0x0382:
            int r7 = r12.m6839d(r2)
            long r8 = m6850h(r6)
            java.lang.Object r6 = p000.dlv.m7045f(r13, r8)
            java.util.List r6 = (java.util.List) r6
            dkw r8 = r12.m6817a(r2)
            p000.dky.m6900a(r7, r6, r14, r8)
            goto L_0x059c
        L_0x0399:
            int r7 = r12.m6839d(r2)
            long r8 = m6850h(r6)
            java.lang.Object r6 = p000.dlv.m7045f(r13, r8)
            java.util.List r6 = (java.util.List) r6
            p000.dky.m6899a(r7, r6, r14)
            goto L_0x059c
        L_0x03ac:
            int r7 = r12.m6839d(r2)
            long r8 = m6850h(r6)
            java.lang.Object r6 = p000.dlv.m7045f(r13, r8)
            java.util.List r6 = (java.util.List) r6
            p000.dky.m6942n(r7, r6, r14, r4)
            goto L_0x059c
        L_0x03bf:
            int r7 = r12.m6839d(r2)
            long r8 = m6850h(r6)
            java.lang.Object r6 = p000.dlv.m7045f(r13, r8)
            java.util.List r6 = (java.util.List) r6
            p000.dky.m6938k(r7, r6, r14, r4)
            goto L_0x059c
        L_0x03d2:
            int r7 = r12.m6839d(r2)
            long r8 = m6850h(r6)
            java.lang.Object r6 = p000.dlv.m7045f(r13, r8)
            java.util.List r6 = (java.util.List) r6
            p000.dky.m6924f(r7, r6, r14, r4)
            goto L_0x059c
        L_0x03e5:
            int r7 = r12.m6839d(r2)
            long r8 = m6850h(r6)
            java.lang.Object r6 = p000.dlv.m7045f(r13, r8)
            java.util.List r6 = (java.util.List) r6
            p000.dky.m6930h(r7, r6, r14, r4)
            goto L_0x059c
        L_0x03f8:
            int r7 = r12.m6839d(r2)
            long r8 = m6850h(r6)
            java.lang.Object r6 = p000.dlv.m7045f(r13, r8)
            java.util.List r6 = (java.util.List) r6
            p000.dky.m6918d(r7, r6, r14, r4)
            goto L_0x059c
        L_0x040b:
            int r7 = r12.m6839d(r2)
            long r8 = m6850h(r6)
            java.lang.Object r6 = p000.dlv.m7045f(r13, r8)
            java.util.List r6 = (java.util.List) r6
            p000.dky.m6914c(r7, r6, r14, r4)
            goto L_0x059c
        L_0x041e:
            int r7 = r12.m6839d(r2)
            long r8 = m6850h(r6)
            java.lang.Object r6 = p000.dlv.m7045f(r13, r8)
            java.util.List r6 = (java.util.List) r6
            p000.dky.m6910b(r7, r6, r14, r4)
            goto L_0x059c
        L_0x0431:
            int r7 = r12.m6839d(r2)
            long r8 = m6850h(r6)
            java.lang.Object r6 = p000.dlv.m7045f(r13, r8)
            java.util.List r6 = (java.util.List) r6
            p000.dky.m6901a(r7, r6, r14, r4)
            goto L_0x059c
        L_0x0444:
            boolean r8 = r12.m6823a(r13, r2)
            if (r8 == 0) goto L_0x059c
            long r8 = m6850h(r6)
            java.lang.Object r6 = p000.dlv.m7045f(r13, r8)
            dkw r8 = r12.m6817a(r2)
            r14.mo4454b(r7, r6, r8)
            goto L_0x059c
        L_0x045b:
            boolean r8 = r12.m6823a(r13, r2)
            if (r8 == 0) goto L_0x059c
            long r8 = m6850h(r6)
            long r8 = p000.dlv.m7037b(r13, r8)
            r14.mo4460e(r7, r8)
            goto L_0x059c
        L_0x046e:
            boolean r8 = r12.m6823a(r13, r2)
            if (r8 == 0) goto L_0x059c
            long r8 = m6850h(r6)
            int r6 = p000.dlv.m7024a(r13, r8)
            r14.mo4461f(r7, r6)
            goto L_0x059c
        L_0x0481:
            boolean r8 = r12.m6823a(r13, r2)
            if (r8 == 0) goto L_0x059c
            long r8 = m6850h(r6)
            long r8 = p000.dlv.m7037b(r13, r8)
            r14.mo4453b(r7, r8)
            goto L_0x059c
        L_0x0494:
            boolean r8 = r12.m6823a(r13, r2)
            if (r8 == 0) goto L_0x059c
            long r8 = m6850h(r6)
            int r6 = p000.dlv.m7024a(r13, r8)
            r14.mo4446a(r7, r6)
            goto L_0x059c
        L_0x04a7:
            boolean r8 = r12.m6823a(r13, r2)
            if (r8 == 0) goto L_0x059c
            long r8 = m6850h(r6)
            int r6 = p000.dlv.m7024a(r13, r8)
            r14.mo4452b(r7, r6)
            goto L_0x059c
        L_0x04ba:
            boolean r8 = r12.m6823a(r13, r2)
            if (r8 == 0) goto L_0x059c
            long r8 = m6850h(r6)
            int r6 = p000.dlv.m7024a(r13, r8)
            r14.mo4459e(r7, r6)
            goto L_0x059c
        L_0x04cd:
            boolean r8 = r12.m6823a(r13, r2)
            if (r8 == 0) goto L_0x059c
            long r8 = m6850h(r6)
            java.lang.Object r6 = p000.dlv.m7045f(r13, r8)
            dik r6 = (p000.dik) r6
            r14.mo4448a(r7, r6)
            goto L_0x059c
        L_0x04e2:
            boolean r8 = r12.m6823a(r13, r2)
            if (r8 == 0) goto L_0x059c
            long r8 = m6850h(r6)
            java.lang.Object r6 = p000.dlv.m7045f(r13, r8)
            dkw r8 = r12.m6817a(r2)
            r14.mo4450a(r7, r6, r8)
            goto L_0x059c
        L_0x04f9:
            boolean r8 = r12.m6823a(r13, r2)
            if (r8 == 0) goto L_0x059c
            long r8 = m6850h(r6)
            java.lang.Object r6 = p000.dlv.m7045f(r13, r8)
            m6820a(r7, r6, r14)
            goto L_0x059c
        L_0x050c:
            boolean r8 = r12.m6823a(r13, r2)
            if (r8 == 0) goto L_0x059c
            long r8 = m6850h(r6)
            boolean r6 = p000.dlv.m7041c(r13, r8)
            r14.mo4451a(r7, r6)
            goto L_0x059c
        L_0x051f:
            boolean r8 = r12.m6823a(r13, r2)
            if (r8 == 0) goto L_0x059c
            long r8 = m6850h(r6)
            int r6 = p000.dlv.m7024a(r13, r8)
            r14.mo4457d(r7, r6)
            goto L_0x059c
        L_0x0531:
            boolean r8 = r12.m6823a(r13, r2)
            if (r8 == 0) goto L_0x059c
            long r8 = m6850h(r6)
            long r8 = p000.dlv.m7037b(r13, r8)
            r14.mo4458d(r7, r8)
            goto L_0x059c
        L_0x0543:
            boolean r8 = r12.m6823a(r13, r2)
            if (r8 == 0) goto L_0x059c
            long r8 = m6850h(r6)
            int r6 = p000.dlv.m7024a(r13, r8)
            r14.mo4455c(r7, r6)
            goto L_0x059c
        L_0x0555:
            boolean r8 = r12.m6823a(r13, r2)
            if (r8 == 0) goto L_0x059c
            long r8 = m6850h(r6)
            long r8 = p000.dlv.m7037b(r13, r8)
            r14.mo4456c(r7, r8)
            goto L_0x059c
        L_0x0567:
            boolean r8 = r12.m6823a(r13, r2)
            if (r8 == 0) goto L_0x059c
            long r8 = m6850h(r6)
            long r8 = p000.dlv.m7037b(r13, r8)
            r14.mo4447a(r7, r8)
            goto L_0x059c
        L_0x0579:
            boolean r8 = r12.m6823a(r13, r2)
            if (r8 == 0) goto L_0x059c
            long r8 = m6850h(r6)
            float r6 = p000.dlv.m7042d(r13, r8)
            r14.mo4445a(r7, r6)
            goto L_0x059c
        L_0x058b:
            boolean r8 = r12.m6823a(r13, r2)
            if (r8 == 0) goto L_0x059c
            long r8 = m6850h(r6)
            double r8 = p000.dlv.m7044e(r13, r8)
            r14.mo4444a(r7, r8)
        L_0x059c:
            int r2 = r2 + 3
            goto L_0x0027
        L_0x05a0:
            r12.m6832b(r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.dkm.mo4577a(java.lang.Object, dmf):void");
    }

    /* renamed from: c */
    private static final void m6837c(Object obj, dmf dmf) {
        dlw.m7050a(obj).mo4628a(dmf);
    }
}
