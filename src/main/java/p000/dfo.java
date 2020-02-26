package p000;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: dfo */
/* compiled from: PG */
public abstract class dfo extends dfl implements List, RandomAccess {

    /* renamed from: a */
    private static final dfw f8458a = new dfw(dfs.f8463a, 0);

    @Deprecated
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    static dfo m6316a(Object[] objArr, int i) {
        return i != 0 ? new dfs(objArr, i) : dfs.f8463a;
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    /* renamed from: a */
    public void mo4236a(Object[] objArr) {
        int size = size();
        for (int i = 0; i < size; i++) {
            objArr[i] = get(i);
        }
    }

    /* renamed from: b */
    public static dfo m6318b(Object[] objArr) {
        if (objArr.length == 0) {
            return dfs.f8463a;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        int length = objArr2.length;
        for (int i = 0; i < length; i++) {
            dgx.m6402a(objArr2[i], i);
        }
        return m6316a(objArr2, objArr2.length);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0040  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = p000.dgx.m6401a(r6)
            r1 = 1
            r2 = 0
            if (r7 == r0) goto L_0x005d
            boolean r0 = r7 instanceof java.util.List
            if (r0 != 0) goto L_0x000d
        L_0x000c:
            goto L_0x005e
        L_0x000d:
            java.util.List r7 = (java.util.List) r7
            int r0 = r6.size()
            int r3 = r7.size()
            if (r0 != r3) goto L_0x005c
            boolean r3 = r7 instanceof java.util.RandomAccess
            if (r3 == 0) goto L_0x0032
            r3 = 0
        L_0x001e:
            if (r3 < r0) goto L_0x0021
            goto L_0x005d
        L_0x0021:
            java.lang.Object r4 = r6.get(r3)
            java.lang.Object r5 = r7.get(r3)
            boolean r4 = p000.dgx.m6410b(r4, r5)
            if (r4 == 0) goto L_0x000c
            int r3 = r3 + 1
            goto L_0x001e
        L_0x0032:
            java.util.Iterator r0 = r6.iterator()
            java.util.Iterator r7 = r7.iterator()
        L_0x003a:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0055
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L_0x000c
            java.lang.Object r3 = r0.next()
            java.lang.Object r4 = r7.next()
            boolean r3 = p000.dgx.m6410b(r3, r4)
            if (r3 != 0) goto L_0x003a
            goto L_0x000c
        L_0x0055:
            boolean r7 = r7.hasNext()
            r1 = r1 ^ r7
            r2 = r1
            goto L_0x005e
        L_0x005c:
            goto L_0x000c
        L_0x005d:
            r2 = 1
        L_0x005e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.dfo.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public final dfv mo4235a() {
        return listIterator();
    }

    public final int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    /* renamed from: e */
    public final dfw listIterator() {
        return listIterator(0);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final dfw listIterator(int i) {
        dgx.m6409b(i, size());
        return !isEmpty() ? new dfw(this, i) : f8458a;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Deprecated
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public dfo subList(int i, int i2) {
        dgx.m6407a(i, i2, size());
        int i3 = i2 - i;
        if (i3 != size()) {
            return i3 != 0 ? new dfn(this, i, i3) : dfs.f8463a;
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return new dfm(toArray());
    }
}
