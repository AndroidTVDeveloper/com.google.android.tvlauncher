package p000;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.List;

@Deprecated
/* renamed from: dey */
/* compiled from: PG */
class dey extends C0292kt {

    /* renamed from: a */
    private static TimeInterpolator f8426a;

    /* renamed from: b */
    private final ArrayList f8427b = new ArrayList();

    /* renamed from: c */
    private final ArrayList f8428c = new ArrayList();

    /* renamed from: d */
    public final ArrayList f8429d = new ArrayList();

    /* renamed from: e */
    public final ArrayList f8430e = new ArrayList();

    /* renamed from: f */
    public final ArrayList f8431f = new ArrayList();

    /* renamed from: g */
    public final ArrayList f8432g = new ArrayList();

    /* renamed from: k */
    public final ArrayList f8433k = new ArrayList();

    /* renamed from: l */
    public final ArrayList f8434l = new ArrayList();

    /* renamed from: m */
    public final ArrayList f8435m = new ArrayList();

    /* renamed from: n */
    private final ArrayList f8436n = new ArrayList();

    /* renamed from: o */
    private final ArrayList f8437o = new ArrayList();

    /* renamed from: b */
    public final boolean mo4218b(C0285km kmVar) {
        mo4197g(kmVar);
        kmVar.f9783a.setAlpha(0.0f);
        this.f8428c.add(kmVar);
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
        mo4197g(kmVar);
        int i5 = (int) (((float) (i3 - i)) - translationX);
        int i6 = (int) (((float) (i4 - i2)) - translationY);
        kmVar.f9783a.setTranslationX(translationX);
        kmVar.f9783a.setTranslationY(translationY);
        kmVar.f9783a.setAlpha(alpha);
        if (kmVar2 != null) {
            mo4197g(kmVar2);
            kmVar2.f9783a.setTranslationX((float) (-i5));
            kmVar2.f9783a.setTranslationY((float) (-i6));
            kmVar2.f9783a.setAlpha(0.0f);
        }
        this.f8437o.add(new dew(kmVar, kmVar2, i, i2, i3, i4));
        return true;
    }

    /* renamed from: a */
    public boolean mo4188a(C0285km kmVar, int i, int i2, int i3, int i4) {
        View view = kmVar.f9783a;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) kmVar.f9783a.getTranslationY());
        mo4197g(kmVar);
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
        this.f8436n.add(new dex(kmVar, translationX, translationY, i3, i4));
        return true;
    }

    /* renamed from: a */
    public final boolean mo4215a(C0285km kmVar) {
        mo4197g(kmVar);
        this.f8427b.add(kmVar);
        return true;
    }

    /* renamed from: a */
    public final boolean mo4216a(C0285km kmVar, List list) {
        return !list.isEmpty() || mo5325f(kmVar);
    }

    /* renamed from: a */
    private static final void m6275a(List list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            ((C0285km) list.get(size)).f9783a.animate().cancel();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo4193c() {
        if (!mo4191b()) {
            mo5323e();
        }
    }

    /* renamed from: c */
    public void mo4194c(C0285km kmVar) {
        View view = kmVar.f9783a;
        view.animate().cancel();
        int size = this.f8436n.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (((dex) this.f8436n.get(size)).f8421a == kmVar) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                mo5324e(kmVar);
                this.f8436n.remove(size);
            }
        }
        m6276a(this.f8437o, kmVar);
        if (this.f8427b.remove(kmVar)) {
            view.setAlpha(1.0f);
            mo5324e(kmVar);
        }
        if (this.f8428c.remove(kmVar)) {
            view.setAlpha(1.0f);
            mo5324e(kmVar);
        }
        for (int size2 = this.f8431f.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList = (ArrayList) this.f8431f.get(size2);
            m6276a(arrayList, kmVar);
            if (arrayList.isEmpty()) {
                this.f8431f.remove(size2);
            }
        }
        for (int size3 = this.f8430e.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList2 = (ArrayList) this.f8430e.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (((dex) arrayList2.get(size4)).f8421a != kmVar) {
                    size4--;
                } else {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    mo5324e(kmVar);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.f8430e.remove(size3);
                    }
                }
            }
        }
        for (int size5 = this.f8429d.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList3 = (ArrayList) this.f8429d.get(size5);
            if (arrayList3.remove(kmVar)) {
                view.setAlpha(1.0f);
                mo5324e(kmVar);
                if (arrayList3.isEmpty()) {
                    this.f8429d.remove(size5);
                }
            }
        }
        this.f8434l.remove(kmVar);
        this.f8432g.remove(kmVar);
        this.f8435m.remove(kmVar);
        this.f8433k.remove(kmVar);
        mo4193c();
    }

    /* renamed from: d */
    public void mo4196d() {
        int size = this.f8436n.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            dex dex = (dex) this.f8436n.get(size);
            View view = dex.f8421a.f9783a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            mo5324e(dex.f8421a);
            this.f8436n.remove(size);
        }
        for (int size2 = this.f8427b.size() - 1; size2 >= 0; size2--) {
            mo5324e((C0285km) this.f8427b.get(size2));
            this.f8427b.remove(size2);
        }
        int size3 = this.f8428c.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            C0285km kmVar = (C0285km) this.f8428c.get(size3);
            kmVar.f9783a.setAlpha(1.0f);
            mo5324e(kmVar);
            this.f8428c.remove(size3);
        }
        for (int size4 = this.f8437o.size() - 1; size4 >= 0; size4--) {
            m6274a((dew) this.f8437o.get(size4));
        }
        this.f8437o.clear();
        if (mo4191b()) {
            for (int size5 = this.f8430e.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList = (ArrayList) this.f8430e.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    dex dex2 = (dex) arrayList.get(size6);
                    View view2 = dex2.f8421a.f9783a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    mo5324e(dex2.f8421a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.f8430e.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.f8429d.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList2 = (ArrayList) this.f8429d.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    C0285km kmVar2 = (C0285km) arrayList2.get(size8);
                    kmVar2.f9783a.setAlpha(1.0f);
                    mo5324e(kmVar2);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.f8429d.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.f8431f.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList3 = (ArrayList) this.f8431f.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    m6274a((dew) arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.f8431f.remove(arrayList3);
                    }
                }
            }
            m6275a(this.f8434l);
            m6275a(this.f8433k);
            m6275a(this.f8432g);
            m6275a(this.f8435m);
            mo5323e();
        }
    }

    /* renamed from: a */
    private final void m6276a(List list, C0285km kmVar) {
        for (int size = list.size() - 1; size >= 0; size--) {
            dew dew = (dew) list.get(size);
            if (m6277a(dew, kmVar) && dew.f8415a == null && dew.f8416b == null) {
                list.remove(dew);
            }
        }
    }

    /* renamed from: a */
    private final void m6274a(dew dew) {
        C0285km kmVar = dew.f8415a;
        if (kmVar != null) {
            m6277a(dew, kmVar);
        }
        C0285km kmVar2 = dew.f8416b;
        if (kmVar2 != null) {
            m6277a(dew, kmVar2);
        }
    }

    /* renamed from: a */
    private final boolean m6277a(dew dew, C0285km kmVar) {
        if (dew.f8416b == kmVar) {
            dew.f8416b = null;
        } else if (dew.f8415a != kmVar) {
            return false;
        } else {
            dew.f8415a = null;
        }
        kmVar.f9783a.setAlpha(1.0f);
        kmVar.f9783a.setTranslationX(0.0f);
        kmVar.f9783a.setTranslationY(0.0f);
        mo5324e(kmVar);
        return true;
    }

    /* renamed from: b */
    public boolean mo4191b() {
        return !this.f8428c.isEmpty() || !this.f8437o.isEmpty() || !this.f8436n.isEmpty() || !this.f8427b.isEmpty() || !this.f8433k.isEmpty() || !this.f8434l.isEmpty() || !this.f8432g.isEmpty() || !this.f8435m.isEmpty() || !this.f8430e.isEmpty() || !this.f8429d.isEmpty() || !this.f8431f.isEmpty();
    }

    /* renamed from: g */
    private final void mo4197g(C0285km kmVar) {
        if (f8426a == null) {
            f8426a = new ValueAnimator().getInterpolator();
        }
        kmVar.f9783a.animate().setInterpolator(f8426a);
        mo4194c(kmVar);
    }

    /* renamed from: a */
    public final void mo4214a() {
        long j;
        boolean isEmpty = this.f8427b.isEmpty();
        boolean z = !isEmpty;
        boolean isEmpty2 = this.f8436n.isEmpty();
        boolean z2 = !isEmpty2;
        boolean z3 = !this.f8437o.isEmpty();
        boolean z4 = !this.f8428c.isEmpty();
        if (z || z2 || z4 || z3) {
            ArrayList arrayList = this.f8427b;
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
                this.f8434l.add(kmVar);
                animate.setDuration(120).alpha(0.0f).setListener(new der(this, kmVar, animate, view)).start();
                i++;
            }
            this.f8427b.clear();
            if (z2) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(this.f8436n);
                this.f8430e.add(arrayList2);
                this.f8436n.clear();
                deo deo = new deo(this, arrayList2);
                if (z) {
                    C0107dx.m7202a(((dex) arrayList2.get(0)).f8421a.f9783a, deo, 120);
                } else {
                    deo.run();
                }
            }
            if (z3) {
                ArrayList arrayList3 = new ArrayList();
                arrayList3.addAll(this.f8437o);
                this.f8431f.add(arrayList3);
                this.f8437o.clear();
                dep dep = new dep(this, arrayList3);
                if (z) {
                    C0107dx.m7202a(((dew) arrayList3.get(0)).f8415a.f9783a, dep, 120);
                } else {
                    dep.run();
                }
            }
            if (z4) {
                ArrayList arrayList4 = new ArrayList();
                arrayList4.addAll(this.f8428c);
                this.f8429d.add(arrayList4);
                this.f8428c.clear();
                deq deq = new deq(this, arrayList4);
                if (!z && !z2 && !z3) {
                    deq.run();
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
                C0107dx.m7202a(((C0285km) arrayList4.get(0)).f9783a, deq, j + Math.max(j3, j2));
            }
        }
    }
}
