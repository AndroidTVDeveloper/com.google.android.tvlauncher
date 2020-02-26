package p000;

import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: afa */
/* compiled from: PG */
final class afa implements afj {

    /* renamed from: a */
    public final Set f226a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b */
    public boolean f227b;

    /* renamed from: c */
    public boolean f228c;

    /* renamed from: a */
    public final void mo155a(afk afk) {
        this.f226a.add(afk);
        if (this.f228c) {
            afk.mo160c();
        } else if (!this.f227b) {
            afk.mo159b();
        } else {
            afk.mo158a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo154a() {
        this.f227b = true;
        for (afk a : aie.m557a(this.f226a)) {
            a.mo158a();
        }
    }

    /* renamed from: b */
    public final void mo156b(afk afk) {
        this.f226a.remove(afk);
    }
}
