package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: djt  reason: default package */
/* compiled from: PG */
public final class djt extends dhw implements RandomAccess, dju {
    private final List b;

    static {
        new djt().b();
    }

    public djt() {
        this(10);
    }

    public djt(int i) {
        this(new ArrayList(i));
    }

    private djt(ArrayList arrayList) {
        this.b = arrayList;
    }

    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        c();
        this.b.add(i, (String) obj);
        this.modCount++;
    }

    public final void a(dik dik) {
        c();
        this.b.add(dik);
        this.modCount++;
    }

    public final boolean addAll(int i, Collection collection) {
        c();
        if (collection instanceof dju) {
            collection = ((dju) collection).d();
        }
        boolean addAll = this.b.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    private static String a(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof dik) {
            return ((dik) obj).d();
        }
        return djl.b((byte[]) obj);
    }

    public final void clear() {
        c();
        this.b.clear();
        this.modCount++;
    }

    /* renamed from: b */
    public final String get(int i) {
        Object obj = this.b.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof dik) {
            dik dik = (dik) obj;
            String d = dik.d();
            if (dik.c()) {
                this.b.set(i, d);
            }
            return d;
        }
        byte[] bArr = (byte[]) obj;
        String b2 = djl.b(bArr);
        if (djl.a(bArr)) {
            this.b.set(i, b2);
        }
        return b2;
    }

    public final Object c(int i) {
        return this.b.get(i);
    }

    public final List d() {
        return Collections.unmodifiableList(this.b);
    }

    public final dju e() {
        return this.a ? new dlp(this) : this;
    }

    public final /* bridge */ /* synthetic */ djk a(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.b);
            return new djt(arrayList);
        }
        throw new IllegalArgumentException();
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        c();
        Object remove = this.b.remove(i);
        this.modCount++;
        return a(remove);
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        c();
        return a(this.b.set(i, (String) obj));
    }

    public final int size() {
        return this.b.size();
    }
}
