package defpackage;

import java.lang.reflect.Array;
import java.util.Map;
import java.util.Set;

/* renamed from: cy  reason: default package */
/* compiled from: PG */
public abstract class cy {
    public cu a;
    public cx b;
    private cv c;

    /* access modifiers changed from: protected */
    public abstract int a();

    /* access modifiers changed from: protected */
    public abstract int a(Object obj);

    /* access modifiers changed from: protected */
    public abstract Object a(int i, int i2);

    /* access modifiers changed from: protected */
    public abstract Object a(int i, Object obj);

    /* access modifiers changed from: protected */
    public abstract void a(int i);

    /* access modifiers changed from: protected */
    public abstract void a(Object obj, Object obj2);

    /* access modifiers changed from: protected */
    public abstract int b(Object obj);

    /* access modifiers changed from: protected */
    public abstract Map b();

    /* access modifiers changed from: protected */
    public abstract void c();

    public static boolean a(Set set, Object obj) {
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

    public final Set d() {
        if (this.c == null) {
            this.c = new cv(this);
        }
        return this.c;
    }

    public final Object[] b(int i) {
        int a2 = a();
        Object[] objArr = new Object[a2];
        for (int i2 = 0; i2 < a2; i2++) {
            objArr[i2] = a(i2, i);
        }
        return objArr;
    }

    public final Object[] a(Object[] objArr, int i) {
        int a2 = a();
        if (objArr.length < a2) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), a2);
        }
        for (int i2 = 0; i2 < a2; i2++) {
            objArr[i2] = a(i2, i);
        }
        if (objArr.length > a2) {
            objArr[a2] = null;
        }
        return objArr;
    }
}
