package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ia  reason: default package */
/* compiled from: PG */
public final class ia extends kt {
    private static TimeInterpolator k;
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final ArrayList g = new ArrayList();
    private final ArrayList l = new ArrayList();
    private final ArrayList m = new ArrayList();
    private final ArrayList n = new ArrayList();
    private final ArrayList o = new ArrayList();

    public final boolean b(km kmVar) {
        g(kmVar);
        kmVar.a.setAlpha(0.0f);
        this.m.add(kmVar);
        return true;
    }

    public final boolean a(km kmVar, km kmVar2, int i, int i2, int i3, int i4) {
        if (kmVar == kmVar2) {
            return a(kmVar, i, i2, i3, i4);
        }
        float translationX = kmVar.a.getTranslationX();
        float translationY = kmVar.a.getTranslationY();
        float alpha = kmVar.a.getAlpha();
        g(kmVar);
        int i5 = (int) (((float) (i3 - i)) - translationX);
        int i6 = (int) (((float) (i4 - i2)) - translationY);
        kmVar.a.setTranslationX(translationX);
        kmVar.a.setTranslationY(translationY);
        kmVar.a.setAlpha(alpha);
        if (kmVar2 != null) {
            g(kmVar2);
            kmVar2.a.setTranslationX((float) (-i5));
            kmVar2.a.setTranslationY((float) (-i6));
            kmVar2.a.setAlpha(0.0f);
        }
        this.o.add(new hy(kmVar, kmVar2, i, i2, i3, i4));
        return true;
    }

    public final boolean a(km kmVar, int i, int i2, int i3, int i4) {
        View view = kmVar.a;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) kmVar.a.getTranslationY());
        g(kmVar);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            e(kmVar);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX((float) (-i5));
        }
        if (i6 != 0) {
            view.setTranslationY((float) (-i6));
        }
        this.n.add(new hz(kmVar, translationX, translationY, i3, i4));
        return true;
    }

    public final boolean a(km kmVar) {
        g(kmVar);
        this.l.add(kmVar);
        return true;
    }

    public final boolean a(km kmVar, List list) {
        return !list.isEmpty() || f(kmVar);
    }

    private static final void a(List list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            ((km) list.get(size)).a.animate().cancel();
        }
    }

    /* access modifiers changed from: package-private */
    public final void c() {
        if (!b()) {
            e();
        }
    }

    public final void c(km kmVar) {
        View view = kmVar.a;
        view.animate().cancel();
        int size = this.n.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (((hz) this.n.get(size)).a == kmVar) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                e(kmVar);
                this.n.remove(size);
            }
        }
        a(this.o, kmVar);
        if (this.l.remove(kmVar)) {
            view.setAlpha(1.0f);
            e(kmVar);
        }
        if (this.m.remove(kmVar)) {
            view.setAlpha(1.0f);
            e(kmVar);
        }
        for (int size2 = this.c.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList = (ArrayList) this.c.get(size2);
            a(arrayList, kmVar);
            if (arrayList.isEmpty()) {
                this.c.remove(size2);
            }
        }
        for (int size3 = this.b.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList2 = (ArrayList) this.b.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (((hz) arrayList2.get(size4)).a != kmVar) {
                    size4--;
                } else {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    e(kmVar);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.b.remove(size3);
                    }
                }
            }
        }
        for (int size5 = this.a.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList3 = (ArrayList) this.a.get(size5);
            if (arrayList3.remove(kmVar)) {
                view.setAlpha(1.0f);
                e(kmVar);
                if (arrayList3.isEmpty()) {
                    this.a.remove(size5);
                }
            }
        }
        this.f.remove(kmVar);
        this.d.remove(kmVar);
        this.g.remove(kmVar);
        this.e.remove(kmVar);
        c();
    }

    public final void d() {
        int size = this.n.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            hz hzVar = (hz) this.n.get(size);
            View view = hzVar.a.a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            e(hzVar.a);
            this.n.remove(size);
        }
        for (int size2 = this.l.size() - 1; size2 >= 0; size2--) {
            e((km) this.l.get(size2));
            this.l.remove(size2);
        }
        int size3 = this.m.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            km kmVar = (km) this.m.get(size3);
            kmVar.a.setAlpha(1.0f);
            e(kmVar);
            this.m.remove(size3);
        }
        for (int size4 = this.o.size() - 1; size4 >= 0; size4--) {
            a((hy) this.o.get(size4));
        }
        this.o.clear();
        if (b()) {
            for (int size5 = this.b.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList = (ArrayList) this.b.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    hz hzVar2 = (hz) arrayList.get(size6);
                    View view2 = hzVar2.a.a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    e(hzVar2.a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.b.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.a.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList2 = (ArrayList) this.a.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    km kmVar2 = (km) arrayList2.get(size8);
                    kmVar2.a.setAlpha(1.0f);
                    e(kmVar2);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.a.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.c.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList3 = (ArrayList) this.c.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    a((hy) arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.c.remove(arrayList3);
                    }
                }
            }
            a(this.f);
            a(this.e);
            a(this.d);
            a(this.g);
            e();
        }
    }

    private final void a(List list, km kmVar) {
        for (int size = list.size() - 1; size >= 0; size--) {
            hy hyVar = (hy) list.get(size);
            if (a(hyVar, kmVar) && hyVar.a == null && hyVar.b == null) {
                list.remove(hyVar);
            }
        }
    }

    private final void a(hy hyVar) {
        km kmVar = hyVar.a;
        if (kmVar != null) {
            a(hyVar, kmVar);
        }
        km kmVar2 = hyVar.b;
        if (kmVar2 != null) {
            a(hyVar, kmVar2);
        }
    }

    private final boolean a(hy hyVar, km kmVar) {
        if (hyVar.b == kmVar) {
            hyVar.b = null;
        } else if (hyVar.a != kmVar) {
            return false;
        } else {
            hyVar.a = null;
        }
        kmVar.a.setAlpha(1.0f);
        kmVar.a.setTranslationX(0.0f);
        kmVar.a.setTranslationY(0.0f);
        e(kmVar);
        return true;
    }

    public final boolean b() {
        return !this.m.isEmpty() || !this.o.isEmpty() || !this.n.isEmpty() || !this.l.isEmpty() || !this.e.isEmpty() || !this.f.isEmpty() || !this.d.isEmpty() || !this.g.isEmpty() || !this.b.isEmpty() || !this.a.isEmpty() || !this.c.isEmpty();
    }

    private final void g(km kmVar) {
        if (k == null) {
            k = new ValueAnimator().getInterpolator();
        }
        kmVar.a.animate().setInterpolator(k);
        c(kmVar);
    }

    public final void a() {
        long j;
        boolean isEmpty = this.l.isEmpty();
        boolean z = !isEmpty;
        boolean isEmpty2 = this.n.isEmpty();
        boolean z2 = !isEmpty2;
        boolean z3 = !this.o.isEmpty();
        boolean z4 = !this.m.isEmpty();
        if (z || z2 || z4 || z3) {
            ArrayList arrayList = this.l;
            int size = arrayList.size();
            int i = 0;
            while (true) {
                j = 120;
                if (i >= size) {
                    break;
                }
                km kmVar = (km) arrayList.get(i);
                View view = kmVar.a;
                ViewPropertyAnimator animate = view.animate();
                this.f.add(kmVar);
                animate.setDuration(120).alpha(0.0f).setListener(new ht(this, kmVar, animate, view)).start();
                i++;
            }
            this.l.clear();
            if (z2) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(this.n);
                this.b.add(arrayList2);
                this.n.clear();
                hq hqVar = new hq(this, arrayList2);
                if (z) {
                    dx.a(((hz) arrayList2.get(0)).a.a, hqVar, 120);
                } else {
                    hqVar.run();
                }
            }
            if (z3) {
                ArrayList arrayList3 = new ArrayList();
                arrayList3.addAll(this.o);
                this.c.add(arrayList3);
                this.o.clear();
                hr hrVar = new hr(this, arrayList3);
                if (z) {
                    dx.a(((hy) arrayList3.get(0)).a.a, hrVar, 120);
                } else {
                    hrVar.run();
                }
            }
            if (z4) {
                ArrayList arrayList4 = new ArrayList();
                arrayList4.addAll(this.m);
                this.a.add(arrayList4);
                this.m.clear();
                hs hsVar = new hs(this, arrayList4);
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
                    j2 = this.i;
                }
                dx.a(((km) arrayList4.get(0)).a, hsVar, j + Math.max(j3, j2));
            }
        }
    }
}
