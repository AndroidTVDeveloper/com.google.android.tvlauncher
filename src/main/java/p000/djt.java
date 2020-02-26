package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: djt */
/* compiled from: PG */
public final class djt extends dhw implements RandomAccess, dju {

    /* renamed from: b */
    private final List f8699b;

    static {
        new djt().mo4379b();
    }

    public djt() {
        this(10);
    }

    public djt(int i) {
        this(new ArrayList(i));
    }

    private djt(ArrayList arrayList) {
        this.f8699b = arrayList;
    }

    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        mo4380c();
        this.f8699b.add(i, (String) obj);
        this.modCount++;
    }

    /* renamed from: a */
    public final void mo4540a(dik dik) {
        mo4380c();
        this.f8699b.add(dik);
        this.modCount++;
    }

    public final boolean addAll(int i, Collection collection) {
        mo4380c();
        if (collection instanceof dju) {
            collection = ((dju) collection).mo4543d();
        }
        boolean addAll = this.f8699b.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    /* renamed from: a */
    private static String m6739a(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof dik) {
            return ((dik) obj).mo4419d();
        }
        return djl.m6729b((byte[]) obj);
    }

    public final void clear() {
        mo4380c();
        this.f8699b.clear();
        this.modCount++;
    }

    /* renamed from: b */
    public final String get(int i) {
        Object obj = this.f8699b.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof dik) {
            dik dik = (dik) obj;
            String d = dik.mo4419d();
            if (dik.mo4417c()) {
                this.f8699b.set(i, d);
            }
            return d;
        }
        byte[] bArr = (byte[]) obj;
        String b = djl.m6729b(bArr);
        if (djl.m6728a(bArr)) {
            this.f8699b.set(i, b);
        }
        return b;
    }

    /* renamed from: c */
    public final Object mo4542c(int i) {
        return this.f8699b.get(i);
    }

    /* renamed from: d */
    public final List mo4543d() {
        return Collections.unmodifiableList(this.f8699b);
    }

    /* renamed from: e */
    public final dju mo4544e() {
        return this.f8564a ? new dlp(this) : this;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ djk mo4398a(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.f8699b);
            return new djt(arrayList);
        }
        throw new IllegalArgumentException();
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo4380c();
        Object remove = this.f8699b.remove(i);
        this.modCount++;
        return m6739a(remove);
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        mo4380c();
        return m6739a(this.f8699b.set(i, (String) obj));
    }

    public final int size() {
        return this.f8699b.size();
    }
}
