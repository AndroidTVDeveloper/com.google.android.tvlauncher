package defpackage;

import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: afa  reason: default package */
/* compiled from: PG */
final class afa implements afj {
    public final Set a = Collections.newSetFromMap(new WeakHashMap());
    public boolean b;
    public boolean c;

    public final void a(afk afk) {
        this.a.add(afk);
        if (this.c) {
            afk.c();
        } else if (!this.b) {
            afk.b();
        } else {
            afk.a();
        }
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        this.b = true;
        for (afk a2 : aie.a(this.a)) {
            a2.a();
        }
    }

    public final void b(afk afk) {
        this.a.remove(afk);
    }
}
