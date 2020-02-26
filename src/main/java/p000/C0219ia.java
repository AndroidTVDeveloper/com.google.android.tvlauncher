package p000;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ia */
/* compiled from: PG */
public final class C0219ia extends C0292kt {

    /* renamed from: k */
    private static TimeInterpolator f9537k;

    /* renamed from: a */
    public final ArrayList f9538a = new ArrayList();

    /* renamed from: b */
    public final ArrayList f9539b = new ArrayList();

    /* renamed from: c */
    public final ArrayList f9540c = new ArrayList();

    /* renamed from: d */
    public final ArrayList f9541d = new ArrayList();

    /* renamed from: e */
    public final ArrayList f9542e = new ArrayList();

    /* renamed from: f */
    public final ArrayList f9543f = new ArrayList();

    /* renamed from: g */
    public final ArrayList f9544g = new ArrayList();

    /* renamed from: l */
    private final ArrayList f9545l = new ArrayList();

    /* renamed from: m */
    private final ArrayList f9546m = new ArrayList();

    /* renamed from: n */
    private final ArrayList f9547n = new ArrayList();

    /* renamed from: o */
    private final ArrayList f9548o = new ArrayList();

    /* renamed from: b */
    public final boolean mo4218b(C0285km kmVar) {
        m7547g(kmVar);
        kmVar.f9783a.setAlpha(0.0f);
        this.f9546m.add(kmVar);
        return true;
    }

    /* renamed from: a */
    public final boolean mo4217a(C0285km kmVar, C0285km kmVar2, int i, int i2, int i3, int i4) {
        if (kmVar == kmVar2) {
            return mo4188a(kmVar, i, i2, i3, i4);
        }
        float translationX = kmVar.f9783a.getTranslationX();
        float translationY = kmVar.f9783a.getTranslationY();
        float alpha = kmVar.f9783a.getAlpha();
        m7547g(kmVar);
        int i5 = (int) (((float) (i3 - i)) - translationX);
        int i6 = (int) (((float) (i4 - i2)) - translationY);
        kmVar.f9783a.setTranslationX(translationX);
        kmVar.f9783a.setTranslationY(translationY);
        kmVar.f9783a.setAlpha(alpha);
        if (kmVar2 != null) {
            m7547g(kmVar2);
            kmVar2.f9783a.setTranslationX((float) (-i5));
            kmVar2.f9783a.setTranslationY((float) (-i6));
            kmVar2.f9783a.setAlpha(0.0f);
        }
        this.f9548o.add(new C0216hy(kmVar, kmVar2, i, i2, i3, i4));
        return true;
    }

    /* renamed from: a */
    public final boolean mo4188a(C0285km kmVar, int i, int i2, int i3, int i4) {
        View view = kmVar.f9783a;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) kmVar.f9783a.getTranslationY());
        m7547g(kmVar);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            mo5324e(kmVar);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX((float) (-i5));
        }
        if (i6 != 0) {
            view.setTranslationY((float) (-i6));
        }
        this.f9547n.add(new C0217hz(kmVar, translationX, translationY, i3, i4));
        return true;
    }

    /* renamed from: a */
    public final boolean mo4215a(C0285km kmVar) {
        m7547g(kmVar);
        this.f9545l.add(kmVar);
        return true;
    }

    /* renamed from: a */
    public final boolean mo4216a(C0285km kmVar, List list) {
        return !list.isEmpty() || mo5325f(kmVar);
    }

    /* renamed from: a */
    private static final void m7544a(List list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            ((C0285km) list.get(size)).f9783a.animate().cancel();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo5230c() {
        if (!mo4191b()) {
            mo5323e();
        }
    }

    /* renamed from: c */
    public final void mo4194c(C0285km kmVar) {
        View view = kmVar.f9783a;
        view.animate().cancel();
        int size = this.f9547n.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (((C0217hz) this.f9547n.get(size)).f9528a == kmVar) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                mo5324e(kmVar);
                this.f9547n.remove(size);
            }
        }
        m7545a(this.f9548o, kmVar);
        if (this.f9545l.remove(kmVar)) {
            view.setAlpha(1.0f);
            mo5324e(kmVar);
        }
        if (this.f9546m.remove(kmVar)) {
            view.setAlpha(1.0f);
            mo5324e(kmVar);
        }
        for (int size2 = this.f9540c.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList = (ArrayList) this.f9540c.get(size2);
            m7545a(arrayList, kmVar);
            if (arrayList.isEmpty()) {
                this.f9540c.remove(size2);
            }
        }
        for (int size3 = this.f9539b.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList2 = (ArrayList) this.f9539b.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (((C0217hz) arrayList2.get(size4)).f9528a != kmVar) {
                    size4--;
                } else {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    mo5324e(kmVar);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.f9539b.remove(size3);
                    }
                }
            }
        }
        for (int size5 = this.f9538a.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList3 = (ArrayList) this.f9538a.get(size5);
            if (arrayList3.remove(kmVar)) {
                view.setAlpha(1.0f);
                mo5324e(kmVar);
                if (arrayList3.isEmpty()) {
                    this.f9538a.remove(size5);
                }
            }
        }
        this.f9543f.remove(kmVar);
        this.f9541d.remove(kmVar);
        this.f9544g.remove(kmVar);
        this.f9542e.remove(kmVar);
        mo5230c();
    }

    /* renamed from: d */
    public final void mo4196d() {
        int size = this.f9547n.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C0217hz hzVar = (C0217hz) this.f9547n.get(size);
            View view = hzVar.f9528a.f9783a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            mo5324e(hzVar.f9528a);
            this.f9547n.remove(size);
        }
        for (int size2 = this.f9545l.size() - 1; size2 >= 0; size2--) {
            mo5324e((C0285km) this.f9545l.get(size2));
            this.f9545l.remove(size2);
        }
        int size3 = this.f9546m.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            C0285km kmVar = (C0285km) this.f9546m.get(size3);
            kmVar.f9783a.setAlpha(1.0f);
            mo5324e(kmVar);
            this.f9546m.remove(size3);
        }
        for (int size4 = this.f9548o.size() - 1; size4 >= 0; size4--) {
            m7543a((C0216hy) this.f9548o.get(size4));
        }
        this.f9548o.clear();
        if (mo4191b()) {
            for (int size5 = this.f9539b.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList = (ArrayList) this.f9539b.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    C0217hz hzVar2 = (C0217hz) arrayList.get(size6);
                    View view2 = hzVar2.f9528a.f9783a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    mo5324e(hzVar2.f9528a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.f9539b.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.f9538a.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList2 = (ArrayList) this.f9538a.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    C0285km kmVar2 = (C0285km) arrayList2.get(size8);
                    kmVar2.f9783a.setAlpha(1.0f);
                    mo5324e(kmVar2);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.f9538a.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.f9540c.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList3 = (ArrayList) this.f9540c.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    m7543a((C0216hy) arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.f9540c.remove(arrayList3);
                    }
                }
            }
            m7544a(this.f9543f);
            m7544a(this.f9542e);
            m7544a(this.f9541d);
            m7544a(this.f9544g);
            mo5323e();
        }
    }

    /* renamed from: a */
    private final void m7545a(List list, C0285km kmVar) {
        for (int size = list.size() - 1; size >= 0; size--) {
            C0216hy hyVar = (C0216hy) list.get(size);
            if (m7546a(hyVar, kmVar) && hyVar.f9522a == null && hyVar.f9523b == null) {
                list.remove(hyVar);
            }
        }
    }

    /* renamed from: a */
    private final void m7543a(C0216hy hyVar) {
        C0285km kmVar = hyVar.f9522a;
        if (kmVar != null) {
            m7546a(hyVar, kmVar);
        }
        C0285km kmVar2 = hyVar.f9523b;
        if (kmVar2 != null) {
            m7546a(hyVar, kmVar2);
        }
    }

    /* renamed from: a */
    private final boolean m7546a(C0216hy hyVar, C0285km kmVar) {
        if (hyVar.f9523b == kmVar) {
            hyVar.f9523b = null;
        } else if (hyVar.f9522a != kmVar) {
            return false;
        } else {
            hyVar.f9522a = null;
        }
        kmVar.f9783a.setAlpha(1.0f);
        kmVar.f9783a.setTranslationX(0.0f);
        kmVar.f9783a.setTranslationY(0.0f);
        mo5324e(kmVar);
        return true;
    }

    /* renamed from: b */
    public final boolean mo4191b() {
        return !this.f9546m.isEmpty() || !this.f9548o.isEmpty() || !this.f9547n.isEmpty() || !this.f9545l.isEmpty() || !this.f9542e.isEmpty() || !this.f9543f.isEmpty() || !this.f9541d.isEmpty() || !this.f9544g.isEmpty() || !this.f9539b.isEmpty() || !this.f9538a.isEmpty() || !this.f9540c.isEmpty();
    }

    /* renamed from: g */
    private final void m7547g(C0285km kmVar) {
        if (f9537k == null) {
            f9537k = new ValueAnimator().getInterpolator();
        }
        kmVar.f9783a.animate().setInterpolator(f9537k);
        mo4194c(kmVar);
    }

    /* renamed from: a */
    public final void mo4214a() {
        long j;
        boolean isEmpty = this.f9545l.isEmpty();
        boolean z = !isEmpty;
        boolean isEmpty2 = this.f9547n.isEmpty();
        boolean z2 = !isEmpty2;
        boolean z3 = !this.f9548o.isEmpty();
        boolean z4 = !this.f9546m.isEmpty();
        if (z || z2 || z4 || z3) {
            ArrayList arrayList = this.f9545l;
            int size = arrayList.size();
            int i = 0;
            while (true) {
                j = 120;
                if (i >= size) {
                    break;
                }
                C0285km kmVar = (C0285km) arrayList.get(i);
                View view = kmVar.f9783a;
                ViewPropertyAnimator animate = view.animate();
                this.f9543f.add(kmVar);
                animate.setDuration(120).alpha(0.0f).setListener(new C0211ht(this, kmVar, animate, view)).start();
                i++;
            }
            this.f9545l.clear();
            if (z2) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(this.f9547n);
                this.f9539b.add(arrayList2);
                this.f9547n.clear();
                C0208hq hqVar = new C0208hq(this, arrayList2);
                if (z) {
                    C0107dx.m7202a(((C0217hz) arrayList2.get(0)).f9528a.f9783a, hqVar, 120);
                } else {
                    hqVar.run();
                }
            }
            if (z3) {
                ArrayList arrayList3 = new ArrayList();
                arrayList3.addAll(this.f9548o);
                this.f9540c.add(arrayList3);
                this.f9548o.clear();
                C0209hr hrVar = new C0209hr(this, arrayList3);
                if (z) {
                    C0107dx.m7202a(((C0216hy) arrayList3.get(0)).f9522a.f9783a, hrVar, 120);
                } else {
                    hrVar.run();
                }
            }
            if (z4) {
                ArrayList arrayList4 = new ArrayList();
                arrayList4.addAll(this.f9546m);
                this.f9538a.add(arrayList4);
                this.f9546m.clear();
                C0210hs hsVar = new C0210hs(this, arrayList4);
                if (!z && !z2 && !z3) {
                    hsVar.run();
                    return;
                }
                long j2 = 0;
                if (isEmpty) {
                    j = 0;
                }
                long j3 = !isEmpty2 ? 250 : 0;
                if (z3) {
                    j2 = this.f9705i;
                }
                C0107dx.m7202a(((C0285km) arrayList4.get(0)).f9783a, hsVar, j + Math.max(j3, j2));
            }
        }
    }
}
