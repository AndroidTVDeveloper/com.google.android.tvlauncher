package p000;

import java.util.Iterator;
import java.util.Map;

/* renamed from: g */
/* compiled from: PG */
public final class C0164g implements Iterator {

    /* renamed from: a */
    private C0137f f9365a;

    /* renamed from: b */
    private boolean f9366b = true;

    /* renamed from: c */
    private final /* synthetic */ C0218i f9367c;

    public C0164g(C0218i iVar) {
        this.f9367c = iVar;
    }

    public final boolean hasNext() {
        if (this.f9366b) {
            return this.f9367c.f9533b != null;
        }
        C0137f fVar = this.f9365a;
        return (fVar == null || fVar.f9196b == null) ? false : true;
    }

    /* renamed from: a */
    public final Map.Entry next() {
        C0137f fVar;
        if (this.f9366b) {
            this.f9366b = false;
            this.f9365a = this.f9367c.f9533b;
        } else {
            C0137f fVar2 = this.f9365a;
            if (fVar2 != null) {
                fVar = fVar2.f9196b;
            } else {
                fVar = null;
            }
            this.f9365a = fVar;
        }
        return this.f9365a;
    }
}
