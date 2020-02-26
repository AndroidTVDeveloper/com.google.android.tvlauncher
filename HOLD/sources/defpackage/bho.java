package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* renamed from: bho  reason: default package */
/* compiled from: PG */
public abstract class bho implements bhv {
    private final boolean a;
    private final ArrayList b = new ArrayList(1);
    private int c;
    private bhy d;

    protected bho(boolean z) {
        this.a = z;
    }

    public final void a(bjf bjf) {
        if (!this.b.contains(bjf)) {
            this.b.add(bjf);
            this.c++;
        }
    }

    /* access modifiers changed from: protected */
    public final void a(int i) {
        bhy bhy = (bhy) blm.a(this.d);
        for (int i2 = 0; i2 < this.c; i2++) {
            ((bjf) this.b.get(i2)).a(this.a, i);
        }
    }

    public Map b() {
        return Collections.emptyMap();
    }

    /* access modifiers changed from: protected */
    public final void d() {
        bhy bhy = (bhy) blm.a(this.d);
        for (int i = 0; i < this.c; i++) {
            ((bjf) this.b.get(i)).a(this.a);
        }
        this.d = null;
    }

    /* access modifiers changed from: protected */
    public final void e() {
        for (int i = 0; i < this.c; i++) {
            ((bjf) this.b.get(i)).c();
        }
    }

    /* access modifiers changed from: protected */
    public final void b(bhy bhy) {
        this.d = bhy;
        for (int i = 0; i < this.c; i++) {
            ((bjf) this.b.get(i)).b(this.a);
        }
    }
}
