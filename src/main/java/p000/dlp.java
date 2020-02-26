package p000;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: dlp */
/* compiled from: PG */
public final class dlp extends AbstractList implements RandomAccess, dju {

    /* renamed from: a */
    public final dju f8777a;

    public dlp(dju dju) {
        this.f8777a = dju;
    }

    /* renamed from: e */
    public final dju mo4544e() {
        return this;
    }

    /* renamed from: a */
    public final void mo4540a(dik dik) {
        throw new UnsupportedOperationException();
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        return ((djt) this.f8777a).get(i);
    }

    /* renamed from: c */
    public final Object mo4542c(int i) {
        return this.f8777a.mo4542c(i);
    }

    /* renamed from: d */
    public final List mo4543d() {
        return this.f8777a.mo4543d();
    }

    public final Iterator iterator() {
        return new dlo(this);
    }

    public final ListIterator listIterator(int i) {
        return new dln(this, i);
    }

    public final int size() {
        return this.f8777a.size();
    }
}
