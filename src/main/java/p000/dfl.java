package p000;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;

/* renamed from: dfl */
/* compiled from: PG */
public abstract class dfl extends AbstractCollection implements Serializable {

    /* renamed from: a */
    private static final Object[] f8453a = new Object[0];

    /* renamed from: a */
    public abstract dfv iterator();

    /* renamed from: a */
    public void mo4236a(Object[] objArr) {
        throw null;
    }

    /* renamed from: b */
    public Object[] mo4239b() {
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

    /* renamed from: d */
    public int mo4242d() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: c */
    public int mo4240c() {
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
        return toArray(f8453a);
    }

    public final Object[] toArray(Object[] objArr) {
        dgx.m6401a(objArr);
        int size = size();
        int length = objArr.length;
        if (length < size) {
            Object[] b = mo4239b();
            if (b != null) {
                return Arrays.copyOfRange(b, mo4240c(), mo4242d(), objArr.getClass());
            }
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size);
        } else if (length > size) {
            objArr[size] = null;
        }
        mo4236a(objArr);
        return objArr;
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return new dfm(toArray());
    }
}
