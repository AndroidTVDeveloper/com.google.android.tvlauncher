package defpackage;

import java.util.Iterator;
import java.util.Map;

/* renamed from: g  reason: default package */
/* compiled from: PG */
public final class g implements Iterator {
    private f a;
    private boolean b = true;
    private final /* synthetic */ i c;

    public g(i iVar) {
        this.c = iVar;
    }

    public final boolean hasNext() {
        if (this.b) {
            return this.c.b != null;
        }
        f fVar = this.a;
        return (fVar == null || fVar.b == null) ? false : true;
    }

    /* renamed from: a */
    public final Map.Entry next() {
        f fVar;
        if (this.b) {
            this.b = false;
            this.a = this.c.b;
        } else {
            f fVar2 = this.a;
            if (fVar2 != null) {
                fVar = fVar2.b;
            } else {
                fVar = null;
            }
            this.a = fVar;
        }
        return this.a;
    }
}
