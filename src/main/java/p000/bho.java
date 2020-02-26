package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* renamed from: bho */
/* compiled from: PG */
public abstract class bho implements bhv {

    /* renamed from: a */
    private final boolean f3978a;

    /* renamed from: b */
    private final ArrayList f3979b = new ArrayList(1);

    /* renamed from: c */
    private int f3980c;

    /* renamed from: d */
    private bhy f3981d;

    protected bho(boolean z) {
        this.f3978a = z;
    }

    /* renamed from: a */
    public final void mo1501a(bjf bjf) {
        if (!this.f3979b.contains(bjf)) {
            this.f3979b.add(bjf);
            this.f3980c++;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo1942a(int i) {
        bhy bhy = (bhy) blm.m3636a(this.f3981d);
        for (int i2 = 0; i2 < this.f3980c; i2++) {
            ((bjf) this.f3979b.get(i2)).mo1968a(this.f3978a, i);
        }
    }

    /* renamed from: b */
    public Map mo1502b() {
        return Collections.emptyMap();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo1944d() {
        bhy bhy = (bhy) blm.m3636a(this.f3981d);
        for (int i = 0; i < this.f3980c; i++) {
            ((bjf) this.f3979b.get(i)).mo1967a(this.f3978a);
        }
        this.f3981d = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo1945e() {
        for (int i = 0; i < this.f3980c; i++) {
            ((bjf) this.f3979b.get(i)).mo1971c();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo1943b(bhy bhy) {
        this.f3981d = bhy;
        for (int i = 0; i < this.f3980c; i++) {
            ((bjf) this.f3979b.get(i)).mo1970b(this.f3978a);
        }
    }
}
