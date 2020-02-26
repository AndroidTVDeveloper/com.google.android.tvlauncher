package defpackage;

import android.os.Handler;
import java.util.HashMap;

/* renamed from: awj  reason: default package */
/* compiled from: PG */
public abstract class awj extends awc {
    public final HashMap c = new HashMap();
    public Handler d;
    public bjf e;

    protected awj() {
    }

    /* access modifiers changed from: protected */
    public void a(bjf bjf) {
        throw null;
    }

    /* access modifiers changed from: protected */
    public final void b() {
        for (awi awi : this.c.values()) {
            awi.a.b(awi.b);
        }
    }

    /* access modifiers changed from: protected */
    public final void a() {
        for (awi awi : this.c.values()) {
            awi.a.a(awi.b);
        }
    }

    public final void d() {
        for (awi awi : this.c.values()) {
        }
    }

    /* access modifiers changed from: protected */
    public final void c() {
        for (awi awi : this.c.values()) {
            awi.a.c(awi.b);
            awi.a.a(awi.c);
        }
        this.c.clear();
    }
}
