package defpackage;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: dlp  reason: default package */
/* compiled from: PG */
public final class dlp extends AbstractList implements RandomAccess, dju {
    public final dju a;

    public dlp(dju dju) {
        this.a = dju;
    }

    public final dju e() {
        return this;
    }

    public final void a(dik dik) {
        throw new UnsupportedOperationException();
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        return ((djt) this.a).get(i);
    }

    public final Object c(int i) {
        return this.a.c(i);
    }

    public final List d() {
        return this.a.d();
    }

    public final Iterator iterator() {
        return new dlo(this);
    }

    public final ListIterator listIterator(int i) {
        return new dln(this, i);
    }

    public final int size() {
        return this.a.size();
    }
}
