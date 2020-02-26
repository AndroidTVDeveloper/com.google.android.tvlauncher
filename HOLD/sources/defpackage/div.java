package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: div  reason: default package */
/* compiled from: PG */
final class div {
    public static final div c = new div((byte) 0);
    public final dlg a = dlg.a(16);
    public boolean b;
    private boolean d;

    private div() {
    }

    private div(byte b2) {
        b();
        b();
    }

    /* renamed from: c */
    public final div clone() {
        div div = new div();
        for (int i = 0; i < this.a.b(); i++) {
            Map.Entry b2 = this.a.b(i);
            div.b((diu) b2.getKey(), b2.getValue());
        }
        for (Map.Entry entry : this.a.c()) {
            div.b((diu) entry.getKey(), entry.getValue());
        }
        div.d = this.d;
        return div;
    }

    private static Object a(Object obj) {
        if (obj instanceof dko) {
            return ((dko) obj).a();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    static int a(dmc dmc, int i, Object obj) {
        int a2 = din.a(i);
        if (dmc == dmc.GROUP) {
            djl.a((dkk) obj);
            a2 += a2;
        }
        return a2 + a(dmc, obj);
    }

    private static int a(dmc dmc, Object obj) {
        dmc dmc2 = dmc.DOUBLE;
        dmd dmd = dmd.INT;
        switch (dmc.ordinal()) {
            case 0:
                ((Double) obj).doubleValue();
                return din.c();
            case 1:
                ((Float) obj).floatValue();
                return din.f();
            case 2:
                return din.a(((Long) obj).longValue());
            case 3:
                return din.a(((Long) obj).longValue());
            case 4:
                return din.b(((Integer) obj).intValue());
            case 5:
                ((Long) obj).longValue();
                return din.e();
            case 6:
                ((Integer) obj).intValue();
                return din.d();
            case 7:
                ((Boolean) obj).booleanValue();
                return din.b();
            case 8:
                if (obj instanceof dik) {
                    return din.a((dik) obj);
                }
                return din.a((String) obj);
            case 9:
                return din.b((dkk) obj);
            case 10:
                if (obj instanceof djr) {
                    return din.a((djr) obj);
                }
                return din.a((dkk) obj);
            case 11:
                if (obj instanceof dik) {
                    return din.a((dik) obj);
                }
                return din.b((byte[]) obj);
            case 12:
                return din.c(((Integer) obj).intValue());
            case 13:
                if (obj instanceof djg) {
                    return din.b(((djg) obj).a());
                }
                return din.b(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).intValue();
                return din.g();
            case 15:
                ((Long) obj).longValue();
                return din.h();
            case 16:
                return din.d(((Integer) obj).intValue());
            case 17:
                return din.b(((Long) obj).longValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int a(diu diu, Object obj) {
        dmc b2 = diu.b();
        int a2 = diu.a();
        if (!diu.d()) {
            return a(b2, a2, obj);
        }
        int i = 0;
        if (diu.e()) {
            for (Object a3 : (List) obj) {
                i += a(b2, a3);
            }
            return din.a(a2) + i + din.c(i);
        }
        for (Object a4 : (List) obj) {
            i += a(b2, a2, a4);
        }
        return i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof div) {
            return this.a.equals(((div) obj).a);
        }
        return false;
    }

    private final Object a(diu diu) {
        Object obj = this.a.get(diu);
        if (!(obj instanceof djr)) {
            return obj;
        }
        djr djr = (djr) obj;
        throw null;
    }

    public final int b(Map.Entry entry) {
        diu diu = (diu) entry.getKey();
        Object value = entry.getValue();
        if (diu.c() != dmd.MESSAGE || diu.d() || diu.e()) {
            return a(diu, value);
        }
        if (value instanceof djr) {
            int a2 = din.a(1);
            return a2 + a2 + din.c(2, ((diu) entry.getKey()).a()) + din.a(3, (djr) value);
        }
        int a3 = din.a(1);
        return a3 + a3 + din.c(2, ((diu) entry.getKey()).a()) + din.a(3) + din.a((dkk) value);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    /* access modifiers changed from: package-private */
    public final boolean a() {
        return this.a.isEmpty();
    }

    public final boolean e() {
        for (int i = 0; i < this.a.b(); i++) {
            if (!c(this.a.b(i))) {
                return false;
            }
        }
        for (Map.Entry c2 : this.a.c()) {
            if (!c(c2)) {
                return false;
            }
        }
        return true;
    }

    private static boolean c(Map.Entry entry) {
        diu diu = (diu) entry.getKey();
        if (diu.c() == dmd.MESSAGE) {
            if (diu.d()) {
                for (dkk V : (List) entry.getValue()) {
                    if (!V.V()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (value instanceof dkk) {
                    if (!((dkk) value).V()) {
                        return false;
                    }
                } else if (value instanceof djr) {
                    return true;
                } else {
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
            }
        }
        return true;
    }

    public final Iterator d() {
        if (this.d) {
            return new djq(this.a.entrySet().iterator());
        }
        return this.a.entrySet().iterator();
    }

    public final void b() {
        if (!this.b) {
            this.a.a();
            this.b = true;
        }
    }

    public final void a(Map.Entry entry) {
        Object obj;
        diu diu = (diu) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof djr) {
            djr djr = (djr) value;
            throw null;
        } else if (diu.d()) {
            Object a2 = a(diu);
            if (a2 == null) {
                a2 = new ArrayList();
            }
            for (Object a3 : (List) value) {
                ((List) a2).add(a(a3));
            }
            this.a.put(diu, a2);
        } else if (diu.c() == dmd.MESSAGE) {
            Object a4 = a(diu);
            if (a4 == null) {
                this.a.put(diu, a(value));
                return;
            }
            if (a4 instanceof dko) {
                dko dko = (dko) a4;
                dko dko2 = (dko) value;
                obj = diu.g();
            } else {
                ((dkk) a4).o();
                dkk dkk = (dkk) value;
                obj = diu.f().g();
            }
            this.a.put(diu, obj);
        } else {
            this.a.put(diu, a(value));
        }
    }

    private final void b(diu diu, Object obj) {
        if (!diu.d()) {
            b(diu.b(), obj);
        } else if (obj instanceof List) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                b(diu.b(), arrayList.get(i));
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (obj instanceof djr) {
            this.d = true;
        }
        this.a.put(diu, obj);
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    private static final void b(dmc dmc, Object obj) {
        boolean z;
        djl.a(obj);
        dmc dmc2 = dmc.DOUBLE;
        dmd dmd = dmd.INT;
        switch (dmc.c.ordinal()) {
            case 0:
                z = obj instanceof Integer;
                break;
            case 1:
                z = obj instanceof Long;
                break;
            case 2:
                z = obj instanceof Float;
                break;
            case 3:
                z = obj instanceof Double;
                break;
            case 4:
                z = obj instanceof Boolean;
                break;
            case 5:
                z = obj instanceof String;
                break;
            case 6:
                if ((obj instanceof dik) || (obj instanceof byte[])) {
                    return;
                }
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            case 7:
                if ((obj instanceof Integer) || (obj instanceof djg)) {
                    return;
                }
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            case 8:
                if ((obj instanceof dkk) || (obj instanceof djr)) {
                    return;
                }
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            default:
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (z) {
            return;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    static void a(din din, int i, Object obj) {
        if (dmc.GROUP == null) {
            dkk dkk = (dkk) obj;
            djl.a(dkk);
            din.f(i, 3);
            dkk.a(din);
            din.f(i, 4);
            return;
        }
        throw null;
    }
}
