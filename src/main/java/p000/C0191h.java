package p000;

import java.util.Iterator;

/* renamed from: h */
/* compiled from: PG */
abstract class C0191h implements Iterator {

    /* renamed from: a */
    private final C0137f f9448a;

    /* renamed from: b */
    private C0137f f9449b;

    public C0191h(C0137f fVar, C0137f fVar2) {
        this.f9448a = fVar2;
        this.f9449b = fVar;
    }

    /* renamed from: a */
    public abstract C0137f mo4025a(C0137f fVar);

    public final boolean hasNext() {
        return this.f9449b != null;
    }

    public final /* bridge */ /* synthetic */ Object next() {
        C0137f fVar = this.f9449b;
        C0137f fVar2 = this.f9448a;
        C0137f fVar3 = null;
        if (!(fVar == fVar2 || fVar2 == null)) {
            fVar3 = mo4025a(fVar);
        }
        this.f9449b = fVar3;
        return fVar;
    }
}
