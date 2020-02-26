package defpackage;

import android.animation.Animator;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: den  reason: default package */
/* compiled from: PG */
public abstract class den extends dey {
    private final Map a = new HashMap();
    private final Map b = new HashMap();
    public final Map c = new HashMap();

    /* access modifiers changed from: protected */
    public abstract boolean d(km kmVar, jt jtVar, jt jtVar2);

    public final boolean b(km kmVar, jt jtVar, jt jtVar2) {
        boolean b2 = super.b(kmVar, jtVar, jtVar2);
        h(kmVar);
        return b2;
    }

    public final boolean a(km kmVar, km kmVar2, jt jtVar, jt jtVar2) {
        if (kmVar != kmVar2) {
            boolean a2 = super.a(kmVar, kmVar2, jtVar, jtVar2);
            h(kmVar);
            h(kmVar2);
            return a2;
        }
        boolean d = d(kmVar2, jtVar, jtVar2);
        h(kmVar2);
        return d;
    }

    public final boolean a(km kmVar, jt jtVar, jt jtVar2) {
        boolean a2 = super.a(kmVar, jtVar, jtVar2);
        h(kmVar);
        return a2;
    }

    public final boolean a(km kmVar, int i, int i2, int i3, int i4) {
        jt jtVar = (jt) this.a.remove(kmVar);
        jt jtVar2 = (jt) this.b.remove(kmVar);
        if (jtVar != null && jtVar2 != null) {
            return a(kmVar, kmVar, jtVar, jtVar2);
        }
        boolean a2 = super.a(kmVar, i, i2, i3, i4);
        h(kmVar);
        return a2;
    }

    public final boolean c(km kmVar, jt jtVar, jt jtVar2) {
        boolean c2 = super.c(kmVar, jtVar, jtVar2);
        h(kmVar);
        return c2;
    }

    /* access modifiers changed from: protected */
    public final void g(km kmVar) {
        Animator animator = (Animator) this.c.remove(kmVar);
        if (animator != null) {
            animator.cancel();
        }
    }

    private final void h(km kmVar) {
        this.a.remove(kmVar);
        this.b.remove(kmVar);
    }

    public final void c() {
        if (!b()) {
            this.a.clear();
            this.b.clear();
        }
        super.c();
    }

    public final void c(km kmVar) {
        g(kmVar);
        super.c(kmVar);
    }

    public final void d() {
        ArrayList arrayList = new ArrayList(this.c.values());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((Animator) arrayList.get(i)).cancel();
        }
        if (this.c.size() != 0) {
            Log.w("BoundsItemAnimator", "endAnimations: All animations canceled but collection is not empty");
        }
        this.c.clear();
        this.a.clear();
        this.b.clear();
        super.d();
    }

    public final boolean b() {
        return super.b() || !this.c.isEmpty();
    }

    public final jt a(kk kkVar, km kmVar) {
        jt a2 = super.a(kkVar, kmVar);
        this.b.put(kmVar, a2);
        return a2;
    }

    public jt a(kk kkVar, km kmVar, int i, List list) {
        jt a2 = super.a(kkVar, kmVar, i, list);
        this.a.put(kmVar, a2);
        return a2;
    }
}
