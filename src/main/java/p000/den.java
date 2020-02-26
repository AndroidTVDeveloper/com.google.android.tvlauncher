package p000;

import android.animation.Animator;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: den */
/* compiled from: PG */
public abstract class den extends dey {

    /* renamed from: a */
    private final Map f8384a = new HashMap();

    /* renamed from: b */
    private final Map f8385b = new HashMap();

    /* renamed from: c */
    public final Map f8386c = new HashMap();

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract boolean mo3745d(C0285km kmVar, C0265jt jtVar, C0265jt jtVar2);

    /* renamed from: b */
    public final boolean mo4192b(C0285km kmVar, C0265jt jtVar, C0265jt jtVar2) {
        boolean b = super.mo4192b(kmVar, jtVar, jtVar2);
        m6260h(kmVar);
        return b;
    }

    /* renamed from: a */
    public final boolean mo4190a(C0285km kmVar, C0285km kmVar2, C0265jt jtVar, C0265jt jtVar2) {
        if (kmVar != kmVar2) {
            boolean a = super.mo4190a(kmVar, kmVar2, jtVar, jtVar2);
            m6260h(kmVar);
            m6260h(kmVar2);
            return a;
        }
        boolean d = mo3745d(kmVar2, jtVar, jtVar2);
        m6260h(kmVar2);
        return d;
    }

    /* renamed from: a */
    public final boolean mo4189a(C0285km kmVar, C0265jt jtVar, C0265jt jtVar2) {
        boolean a = super.mo4189a(kmVar, jtVar, jtVar2);
        m6260h(kmVar);
        return a;
    }

    /* renamed from: a */
    public final boolean mo4188a(C0285km kmVar, int i, int i2, int i3, int i4) {
        C0265jt jtVar = (C0265jt) this.f8384a.remove(kmVar);
        C0265jt jtVar2 = (C0265jt) this.f8385b.remove(kmVar);
        if (jtVar != null && jtVar2 != null) {
            return mo4190a(kmVar, kmVar, jtVar, jtVar2);
        }
        boolean a = super.mo4188a(kmVar, i, i2, i3, i4);
        m6260h(kmVar);
        return a;
    }

    /* renamed from: c */
    public final boolean mo4195c(C0285km kmVar, C0265jt jtVar, C0265jt jtVar2) {
        boolean c = super.mo4195c(kmVar, jtVar, jtVar2);
        m6260h(kmVar);
        return c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo4197g(C0285km kmVar) {
        Animator animator = (Animator) this.f8386c.remove(kmVar);
        if (animator != null) {
            animator.cancel();
        }
    }

    /* renamed from: h */
    private final void m6260h(C0285km kmVar) {
        this.f8384a.remove(kmVar);
        this.f8385b.remove(kmVar);
    }

    /* renamed from: c */
    public final void mo4193c() {
        if (!mo4191b()) {
            this.f8384a.clear();
            this.f8385b.clear();
        }
        super.mo4193c();
    }

    /* renamed from: c */
    public final void mo4194c(C0285km kmVar) {
        mo4197g(kmVar);
        super.mo4194c(kmVar);
    }

    /* renamed from: d */
    public final void mo4196d() {
        ArrayList arrayList = new ArrayList(this.f8386c.values());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((Animator) arrayList.get(i)).cancel();
        }
        if (this.f8386c.size() != 0) {
            Log.w("BoundsItemAnimator", "endAnimations: All animations canceled but collection is not empty");
        }
        this.f8386c.clear();
        this.f8384a.clear();
        this.f8385b.clear();
        super.mo4196d();
    }

    /* renamed from: b */
    public final boolean mo4191b() {
        return super.mo4191b() || !this.f8386c.isEmpty();
    }

    /* renamed from: a */
    public final C0265jt mo4187a(C0283kk kkVar, C0285km kmVar) {
        C0265jt a = super.mo4187a(kkVar, kmVar);
        this.f8385b.put(kmVar, a);
        return a;
    }

    /* renamed from: a */
    public C0265jt mo3744a(C0283kk kkVar, C0285km kmVar, int i, List list) {
        C0265jt a = super.mo3744a(kkVar, kmVar, i, list);
        this.f8384a.put(kmVar, a);
        return a;
    }
}
