package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.List;

@Deprecated
/* renamed from: dey  reason: default package */
/* compiled from: PG */
class dey extends kt {
    private static TimeInterpolator a;
    private final ArrayList b = new ArrayList();
    private final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final ArrayList g = new ArrayList();
    public final ArrayList k = new ArrayList();
    public final ArrayList l = new ArrayList();
    public final ArrayList m = new ArrayList();
    private final ArrayList n = new ArrayList();
    private final ArrayList o = new ArrayList();

    public final boolean b(km kmVar) {
        g(kmVar);
        kmVar.a.setAlpha(0.0f);
        this.c.add(kmVar);
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
        this.o.add(new dew(kmVar, kmVar2, i, i2, i3, i4));
        return true;
    }

    public boolean a(km kmVar, int i, int i2, int i3, int i4) {
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
        this.n.add(new dex(kmVar, translationX, translationY, i3, i4));
        return true;
    }

    public final boolean a(km kmVar) {
        g(kmVar);
        this.b.add(kmVar);
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

    /* access modifiers changed from: protected */
    public void c() {
        if (!b()) {
            e();
        }
    }

    public void c(km kmVar) {
        View view = kmVar.a;
        view.animate().cancel();
        int size = this.n.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (((dex) this.n.get(size)).a == kmVar) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                e(kmVar);
                this.n.remove(size);
            }
        }
        a(this.o, kmVar);
        if (this.b.remove(kmVar)) {
            view.setAlpha(1.0f);
            e(kmVar);
        }
        if (this.c.remove(kmVar)) {
            view.setAlpha(1.0f);
            e(kmVar);
        }
        for (int size2 = this.f.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList = (ArrayList) this.f.get(size2);
            a(arrayList, kmVar);
            if (arrayList.isEmpty()) {
                this.f.remove(size2);
            }
        }
        for (int size3 = this.e.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList2 = (ArrayList) this.e.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (((dex) arrayList2.get(size4)).a != kmVar) {
                    size4--;
                } else {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    e(kmVar);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.e.remove(size3);
                    }
                }
            }
        }
        for (int size5 = this.d.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList3 = (ArrayList) this.d.get(size5);
            if (arrayList3.remove(kmVar)) {
                view.setAlpha(1.0f);
                e(kmVar);
                if (arrayList3.isEmpty()) {
                    this.d.remove(size5);
                }
            }
        }
        this.l.remove(kmVar);
        this.g.remove(kmVar);
        this.m.remove(kmVar);
        this.k.remove(kmVar);
        c();
    }

    public void d() {
        int size = this.n.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            dex dex = (dex) this.n.get(size);
            View view = dex.a.a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            e(dex.a);
            this.n.remove(size);
        }
        for (int size2 = this.b.size() - 1; size2 >= 0; size2--) {
            e((km) this.b.get(size2));
            this.b.remove(size2);
        }
        int size3 = this.c.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            km kmVar = (km) this.c.get(size3);
            kmVar.a.setAlpha(1.0f);
            e(kmVar);
            this.c.remove(size3);
        }
        for (int size4 = this.o.size() - 1; size4 >= 0; size4--) {
            a((dew) this.o.get(size4));
        }
        this.o.clear();
        if (b()) {
            for (int size5 = this.e.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList = (ArrayList) this.e.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    dex dex2 = (dex) arrayList.get(size6);
                    View view2 = dex2.a.a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    e(dex2.a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.e.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.d.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList2 = (ArrayList) this.d.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    km kmVar2 = (km) arrayList2.get(size8);
                    kmVar2.a.setAlpha(1.0f);
                    e(kmVar2);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.d.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.f.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList3 = (ArrayList) this.f.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    a((dew) arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.f.remove(arrayList3);
                    }
                }
            }
            a(this.l);
            a(this.k);
            a(this.g);
            a(this.m);
            e();
        }
    }

    private final void a(List list, km kmVar) {
        for (int size = list.size() - 1; size >= 0; size--) {
            dew dew = (dew) list.get(size);
            if (a(dew, kmVar) && dew.a == null && dew.b == null) {
                list.remove(dew);
            }
        }
    }

    private final void a(dew dew) {
        km kmVar = dew.a;
        if (kmVar != null) {
            a(dew, kmVar);
        }
        km kmVar2 = dew.b;
        if (kmVar2 != null) {
            a(dew, kmVar2);
        }
    }

    private final boolean a(dew dew, km kmVar) {
        if (dew.b == kmVar) {
            dew.b = null;
        } else if (dew.a != kmVar) {
            return false;
        } else {
            dew.a = null;
        }
        kmVar.a.setAlpha(1.0f);
        kmVar.a.setTranslationX(0.0f);
        kmVar.a.setTranslationY(0.0f);
        e(kmVar);
        return true;
    }

    public boolean b() {
        return !this.c.isEmpty() || !this.o.isEmpty() || !this.n.isEmpty() || !this.b.isEmpty() || !this.k.isEmpty() || !this.l.isEmpty() || !this.g.isEmpty() || !this.m.isEmpty() || !this.e.isEmpty() || !this.d.isEmpty() || !this.f.isEmpty();
    }

    private final void g(km kmVar) {
        if (a == null) {
            a = new ValueAnimator().getInterpolator();
        }
        kmVar.a.animate().setInterpolator(a);
        c(kmVar);
    }

    public final void a() {
        long j;
        boolean isEmpty = this.b.isEmpty();
        boolean z = !isEmpty;
        boolean isEmpty2 = this.n.isEmpty();
        boolean z2 = !isEmpty2;
        boolean z3 = !this.o.isEmpty();
        boolean z4 = !this.c.isEmpty();
        if (z || z2 || z4 || z3) {
            ArrayList arrayList = this.b;
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
                this.l.add(kmVar);
                animate.setDuration(120).alpha(0.0f).setListener(new der(this, kmVar, animate, view)).start();
                i++;
            }
            this.b.clear();
            if (z2) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(this.n);
                this.e.add(arrayList2);
                this.n.clear();
                deo deo = new deo(this, arrayList2);
                if (z) {
                    dx.a(((dex) arrayList2.get(0)).a.a, deo, 120);
                } else {
                    deo.run();
                }
            }
            if (z3) {
                ArrayList arrayList3 = new ArrayList();
                arrayList3.addAll(this.o);
                this.f.add(arrayList3);
                this.o.clear();
                dep dep = new dep(this, arrayList3);
                if (z) {
                    dx.a(((dew) arrayList3.get(0)).a.a, dep, 120);
                } else {
                    dep.run();
                }
            }
            if (z4) {
                ArrayList arrayList4 = new ArrayList();
                arrayList4.addAll(this.c);
                this.d.add(arrayList4);
                this.c.clear();
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
                    j2 = this.i;
                }
                dx.a(((km) arrayList4.get(0)).a, deq, j + Math.max(j3, j2));
            }
        }
    }
}
