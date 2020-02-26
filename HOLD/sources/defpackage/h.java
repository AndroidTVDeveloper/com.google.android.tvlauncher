package defpackage;

import java.util.Iterator;

/* renamed from: h  reason: default package */
/* compiled from: PG */
abstract class h implements Iterator {
    private final f a;
    private f b;

    public h(f fVar, f fVar2) {
        this.a = fVar2;
        this.b = fVar;
    }

    public abstract f a(f fVar);

    public final boolean hasNext() {
        return this.b != null;
    }

    public final /* bridge */ /* synthetic */ Object next() {
        f fVar = this.b;
        f fVar2 = this.a;
        f fVar3 = null;
        if (!(fVar == fVar2 || fVar2 == null)) {
            fVar3 = a(fVar);
        }
        this.b = fVar3;
        return fVar;
    }
}
