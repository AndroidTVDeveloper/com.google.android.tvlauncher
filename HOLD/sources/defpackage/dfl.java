package defpackage;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;

/* renamed from: dfl  reason: default package */
/* compiled from: PG */
public abstract class dfl extends AbstractCollection implements Serializable {
    private static final Object[] a = new Object[0];

    /* renamed from: a */
    public abstract dfv iterator();

    public void a(Object[] objArr) {
        throw null;
    }

    public Object[] b() {
        return null;
    }

    @Deprecated
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public int d() {
        throw new UnsupportedOperationException();
    }

    public int c() {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final Object[] toArray() {
        return toArray(a);
    }

    public final Object[] toArray(Object[] objArr) {
        dgx.a(objArr);
        int size = size();
        int length = objArr.length;
        if (length < size) {
            Object[] b = b();
            if (b != null) {
                return Arrays.copyOfRange(b, c(), d(), objArr.getClass());
            }
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size);
        } else if (length > size) {
            objArr[size] = null;
        }
        a(objArr);
        return objArr;
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return new dfm(toArray());
    }
}
