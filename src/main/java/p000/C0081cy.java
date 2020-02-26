package p000;

import java.lang.reflect.Array;
import java.util.Map;
import java.util.Set;

/* renamed from: cy */
/* compiled from: PG */
public abstract class C0081cy {

    /* renamed from: a */
    public C0077cu f7899a;

    /* renamed from: b */
    public C0080cx f7900b;

    /* renamed from: c */
    private C0078cv f7901c;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo2954a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo2955a(Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Object mo2956a(int i, int i2);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Object mo2957a(int i, Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo2958a(int i);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo2959a(Object obj, Object obj2);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract int mo2960b(Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract Map mo2961b();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo2962c();

    /* renamed from: a */
    public static boolean m5956a(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                return set.size() == set2.size() && set.containsAll(set2);
            } catch (NullPointerException e) {
            } catch (ClassCastException e2) {
                return false;
            }
        }
        return false;
    }

    /* renamed from: d */
    public final Set mo3954d() {
        if (this.f7901c == null) {
            this.f7901c = new C0078cv(this);
        }
        return this.f7901c;
    }

    /* renamed from: b */
    public final Object[] mo3953b(int i) {
        int a = mo2954a();
        Object[] objArr = new Object[a];
        for (int i2 = 0; i2 < a; i2++) {
            objArr[i2] = mo2956a(i2, i);
        }
        return objArr;
    }

    /* renamed from: a */
    public final Object[] mo3952a(Object[] objArr, int i) {
        int a = mo2954a();
        if (objArr.length < a) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), a);
        }
        for (int i2 = 0; i2 < a; i2++) {
            objArr[i2] = mo2956a(i2, i);
        }
        if (objArr.length > a) {
            objArr[a] = null;
        }
        return objArr;
    }
}
