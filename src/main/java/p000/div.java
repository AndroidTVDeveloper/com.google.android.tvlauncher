package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: div */
/* compiled from: PG */
final class div {

    /* renamed from: c */
    public static final div f8606c = new div((byte) 0);

    /* renamed from: a */
    public final dlg f8607a = dlg.m6949a(16);

    /* renamed from: b */
    public boolean f8608b;

    /* renamed from: d */
    private boolean f8609d;

    private div() {
    }

    private div(byte b) {
        mo4479b();
        mo4479b();
    }

    /* renamed from: c */
    public final div clone() {
        div div = new div();
        for (int i = 0; i < this.f8607a.mo4612b(); i++) {
            Map.Entry b = this.f8607a.mo4613b(i);
            div.m6633b((diu) b.getKey(), b.getValue());
        }
        for (Map.Entry entry : this.f8607a.mo4614c()) {
            div.m6633b((diu) entry.getKey(), entry.getValue());
        }
        div.f8609d = this.f8609d;
        return div;
    }

    /* renamed from: a */
    private static Object m6631a(Object obj) {
        if (obj instanceof dko) {
            return ((dko) obj).mo4584a();
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

    /* renamed from: a */
    static int m6628a(dmc dmc, int i, Object obj) {
        int a = din.m6528a(i);
        if (dmc == dmc.GROUP) {
            djl.m6726a((dkk) obj);
            a += a;
        }
        return a + m6629a(dmc, obj);
    }

    /* renamed from: a */
    private static int m6629a(dmc dmc, Object obj) {
        dmc dmc2 = dmc.DOUBLE;
        dmd dmd = dmd.INT;
        switch (dmc.ordinal()) {
            case 0:
                ((Double) obj).doubleValue();
                return din.m6549c();
            case 1:
                ((Float) obj).floatValue();
                return din.m6561f();
            case 2:
                return din.m6533a(((Long) obj).longValue());
            case 3:
                return din.m6533a(((Long) obj).longValue());
            case 4:
                return din.m6542b(((Integer) obj).intValue());
            case 5:
                ((Long) obj).longValue();
                return din.m6558e();
            case 6:
                ((Integer) obj).intValue();
                return din.m6554d();
            case 7:
                ((Boolean) obj).booleanValue();
                return din.m6541b();
            case 8:
                if (obj instanceof dik) {
                    return din.m6534a((dik) obj);
                }
                return din.m6538a((String) obj);
            case 9:
                return din.m6546b((dkk) obj);
            case 10:
                if (obj instanceof djr) {
                    return din.m6535a((djr) obj);
                }
                return din.m6536a((dkk) obj);
            case 11:
                if (obj instanceof dik) {
                    return din.m6534a((dik) obj);
                }
                return din.m6547b((byte[]) obj);
            case 12:
                return din.m6550c(((Integer) obj).intValue());
            case 13:
                if (obj instanceof djg) {
                    return din.m6542b(((djg) obj).mo4527a());
                }
                return din.m6542b(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).intValue();
                return din.m6562g();
            case 15:
                ((Long) obj).longValue();
                return din.m6563h();
            case 16:
                return din.m6555d(((Integer) obj).intValue());
            case 17:
                return din.m6545b(((Long) obj).longValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* renamed from: a */
    public static int m6627a(diu diu, Object obj) {
        dmc b = diu.mo4470b();
        int a = diu.mo4469a();
        if (!diu.mo4472d()) {
            return m6628a(b, a, obj);
        }
        int i = 0;
        if (diu.mo4473e()) {
            for (Object a2 : (List) obj) {
                i += m6629a(b, a2);
            }
            return din.m6528a(a) + i + din.m6550c(i);
        }
        for (Object a3 : (List) obj) {
            i += m6628a(b, a, a3);
        }
        return i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof div) {
            return this.f8607a.equals(((div) obj).f8607a);
        }
        return false;
    }

    /* renamed from: a */
    private final Object m6630a(diu diu) {
        Object obj = this.f8607a.get(diu);
        if (!(obj instanceof djr)) {
            return obj;
        }
        djr djr = (djr) obj;
        throw null;
    }

    /* renamed from: b */
    public final int mo4478b(Map.Entry entry) {
        diu diu = (diu) entry.getKey();
        Object value = entry.getValue();
        if (diu.mo4471c() != dmd.MESSAGE || diu.mo4472d() || diu.mo4473e()) {
            return m6627a(diu, value);
        }
        if (value instanceof djr) {
            int a = din.m6528a(1);
            return a + a + din.m6551c(2, ((diu) entry.getKey()).mo4469a()) + din.m6530a(3, (djr) value);
        }
        int a2 = din.m6528a(1);
        return a2 + a2 + din.m6551c(2, ((diu) entry.getKey()).mo4469a()) + din.m6528a(3) + din.m6536a((dkk) value);
    }

    public final int hashCode() {
        return this.f8607a.hashCode();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo4477a() {
        return this.f8607a.isEmpty();
    }

    /* renamed from: e */
    public final boolean mo4483e() {
        for (int i = 0; i < this.f8607a.mo4612b(); i++) {
            if (!m6635c(this.f8607a.mo4613b(i))) {
                return false;
            }
        }
        for (Map.Entry c : this.f8607a.mo4614c()) {
            if (!m6635c(c)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    private static boolean m6635c(Map.Entry entry) {
        diu diu = (diu) entry.getKey();
        if (diu.mo4471c() == dmd.MESSAGE) {
            if (diu.mo4472d()) {
                for (dkk V : (List) entry.getValue()) {
                    if (!V.mo4502V()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (value instanceof dkk) {
                    if (!((dkk) value).mo4502V()) {
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

    /* renamed from: d */
    public final Iterator mo4482d() {
        if (this.f8609d) {
            return new djq(this.f8607a.entrySet().iterator());
        }
        return this.f8607a.entrySet().iterator();
    }

    /* renamed from: b */
    public final void mo4479b() {
        if (!this.f8608b) {
            this.f8607a.mo4590a();
            this.f8608b = true;
        }
    }

    /* renamed from: a */
    public final void mo4476a(Map.Entry entry) {
        Object obj;
        diu diu = (diu) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof djr) {
            djr djr = (djr) value;
            throw null;
        } else if (diu.mo4472d()) {
            Object a = m6630a(diu);
            if (a == null) {
                a = new ArrayList();
            }
            for (Object a2 : (List) value) {
                ((List) a).add(m6631a(a2));
            }
            this.f8607a.put(diu, a);
        } else if (diu.mo4471c() == dmd.MESSAGE) {
            Object a3 = m6630a(diu);
            if (a3 == null) {
                this.f8607a.put(diu, m6631a(value));
                return;
            }
            if (a3 instanceof dko) {
                dko dko = (dko) a3;
                dko dko2 = (dko) value;
                obj = diu.mo4475g();
            } else {
                ((dkk) a3).mo4518o();
                dkk dkk = (dkk) value;
                obj = diu.mo4474f().mo4509g();
            }
            this.f8607a.put(diu, obj);
        } else {
            this.f8607a.put(diu, m6631a(value));
        }
    }

    /* renamed from: b */
    private final void m6633b(diu diu, Object obj) {
        if (!diu.mo4472d()) {
            m6634b(diu.mo4470b(), obj);
        } else if (obj instanceof List) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                m6634b(diu.mo4470b(), arrayList.get(i));
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (obj instanceof djr) {
            this.f8609d = true;
        }
        this.f8607a.put(diu, obj);
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: b */
    private static final void m6634b(dmc dmc, Object obj) {
        boolean z;
        djl.m6727a(obj);
        dmc dmc2 = dmc.DOUBLE;
        dmd dmd = dmd.INT;
        switch (dmc.f8814c.ordinal()) {
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

    /* renamed from: a */
    static void m6632a(din din, int i, Object obj) {
        if (dmc.GROUP == null) {
            dkk dkk = (dkk) obj;
            djl.m6726a(dkk);
            din.mo4437f(i, 3);
            dkk.mo4512a(din);
            din.mo4437f(i, 4);
            return;
        }
        throw null;
    }
}
