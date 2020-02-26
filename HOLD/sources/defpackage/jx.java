package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.os.Parcelable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* renamed from: jx  reason: default package */
/* compiled from: PG */
public abstract class jx {
    public ho a;
    public RecyclerView b;
    public kj c;
    public boolean d = false;
    public boolean e = true;
    public int f;
    public boolean g;
    public int h;
    public int i;

    public int a(int i2, kc kcVar, kk kkVar) {
        throw null;
    }

    public int a(View view) {
        throw null;
    }

    public jy a(Context context, AttributeSet attributeSet) {
        throw null;
    }

    public jy a(ViewGroup.LayoutParams layoutParams) {
        throw null;
    }

    public void a(int i2) {
    }

    public void a(int i2, int i3, kk kkVar, jw jwVar) {
    }

    public void a(int i2, jw jwVar) {
    }

    public void a(Parcelable parcelable) {
    }

    public void a(RecyclerView recyclerView, ArrayList arrayList, int i2, int i3) {
        throw null;
    }

    public void a(View view, Rect rect) {
        throw null;
    }

    @Deprecated
    public void a(View view, View view2) {
        throw null;
    }

    public void a(View view, ed edVar) {
        throw null;
    }

    public void a(jp jpVar, jp jpVar2) {
    }

    public void a(kc kcVar, kk kkVar) {
        throw null;
    }

    public void a(kc kcVar, kk kkVar, int i2, int i3) {
        throw null;
    }

    public void a(kc kcVar, kk kkVar, ed edVar) {
        throw null;
    }

    public boolean a(kc kcVar, kk kkVar, int i2) {
        throw null;
    }

    public int b(int i2, kc kcVar, kk kkVar) {
        throw null;
    }

    public int b(View view) {
        throw null;
    }

    public abstract jy b();

    public void b(int i2, int i3) {
    }

    public void b(kc kcVar) {
        throw null;
    }

    public int c(View view) {
        throw null;
    }

    public View c(View view, int i2) {
        throw null;
    }

    public void c(int i2, int i3) {
    }

    public boolean c() {
        throw null;
    }

    public int d(View view) {
        throw null;
    }

    public void d(int i2, int i3) {
    }

    public boolean d() {
        throw null;
    }

    public void e(int i2) {
        throw null;
    }

    public final boolean e() {
        kj kjVar = this.c;
        return kjVar != null && kjVar.e;
    }

    public Parcelable n() {
        throw null;
    }

    public void o() {
    }

    public boolean p() {
        throw null;
    }

    public void r() {
        throw null;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: jx.a(android.view.View, int, boolean):void
     arg types: [android.view.View, int, int]
     candidates:
      jx.a(int, int, int):int
      jx.a(int, kc, kk):int
      jx.a(kc, int, android.view.View):void
      jx.a(kc, kk, ed):void
      jx.a(kc, kk, int):boolean
      jx.a(android.view.View, int, boolean):void */
    public final void a(View view, int i2) {
        a(view, i2, true);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: jx.a(android.view.View, int, boolean):void
     arg types: [android.view.View, int, int]
     candidates:
      jx.a(int, int, int):int
      jx.a(int, kc, kk):int
      jx.a(kc, int, android.view.View):void
      jx.a(kc, kk, ed):void
      jx.a(kc, kk, int):boolean
      jx.a(android.view.View, int, boolean):void */
    public final void b(View view, int i2) {
        a(view, i2, false);
    }

    private final void a(View view, int i2, boolean z) {
        km c2 = RecyclerView.c(view);
        if (!z && !c2.m()) {
            this.b.d.c(c2);
        } else {
            this.b.d.b(c2);
        }
        jy jyVar = (jy) view.getLayoutParams();
        if (c2.g() || c2.e()) {
            if (c2.e()) {
                c2.f();
            } else {
                c2.h();
            }
            this.a.a(view, i2, view.getLayoutParams(), false);
        } else if (view.getParent() == this.b) {
            int b2 = this.a.b(view);
            if (i2 == -1) {
                i2 = this.a.a();
            }
            if (b2 == -1) {
                throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.b.indexOfChild(view) + this.b.a());
            } else if (b2 != i2) {
                jx jxVar = this.b.h;
                View d2 = jxVar.d(b2);
                if (d2 != null) {
                    jxVar.f(b2);
                    jy jyVar2 = (jy) d2.getLayoutParams();
                    km c3 = RecyclerView.c(d2);
                    if (c3.m()) {
                        jxVar.b.d.b(c3);
                    } else {
                        jxVar.b.d.c(c3);
                    }
                    jxVar.a.a(d2, i2, jyVar2, c3.m());
                } else {
                    throw new IllegalArgumentException("Cannot move a child from non-existing index:" + b2 + jxVar.b.toString());
                }
            }
        } else {
            this.a.a(view, i2, false);
            jyVar.c = true;
            kj kjVar = this.c;
            if (kjVar != null && kjVar.e && kj.a(view) == kjVar.a) {
                kjVar.f = view;
            }
        }
        if (jyVar.d) {
            c2.a.invalidate();
            jyVar.d = false;
        }
    }

    public final void a(String str) {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            recyclerView.a(str);
        }
    }

    public final void b(View view, Rect rect) {
        Rect rect2;
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            jy jyVar = (jy) view.getLayoutParams();
            if (!jyVar.c) {
                rect2 = jyVar.b;
            } else if (!recyclerView.D.g || (!jyVar.b() && !jyVar.a.j())) {
                Rect rect3 = jyVar.b;
                rect3.set(0, 0, 0, 0);
                int size = recyclerView.j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    recyclerView.f.set(0, 0, 0, 0);
                    ((akr) recyclerView.j.get(i2)).a(recyclerView.f, view, recyclerView);
                    rect3.left += recyclerView.f.left;
                    rect3.top += recyclerView.f.top;
                    rect3.right += recyclerView.f.right;
                    rect3.bottom += recyclerView.f.bottom;
                }
                jyVar.c = false;
                rect2 = rect3;
            } else {
                rect2 = jyVar.b;
            }
            rect.set(rect2);
            return;
        }
        rect.set(0, 0, 0, 0);
    }

    public static int a(int i2, int i3, int i4) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode != Integer.MIN_VALUE) {
            return mode != 1073741824 ? Math.max(i3, i4) : size;
        }
        return Math.min(size, Math.max(i3, i4));
    }

    public final void a(View view, kc kcVar) {
        a(kcVar, this.a.b(view), view);
    }

    private final void f(int i2) {
        d(i2);
        this.a.d(i2);
    }

    public final View c(int i2) {
        int g2 = g();
        for (int i3 = 0; i3 < g2; i3++) {
            View d2 = d(i3);
            km c2 = RecyclerView.c(d2);
            if (c2 != null && c2.c() == i2 && !c2.b() && (this.b.D.g || !c2.m())) {
                return d2;
            }
        }
        return null;
    }

    public final View d(int i2) {
        ho hoVar = this.a;
        if (hoVar != null) {
            return hoVar.b(i2);
        }
        return null;
    }

    public final int g() {
        ho hoVar = this.a;
        if (hoVar == null) {
            return 0;
        }
        return hoVar.a();
    }

    public final int m() {
        RecyclerView recyclerView = this.b;
        jp jpVar = recyclerView != null ? recyclerView.g : null;
        if (jpVar == null) {
            return 0;
        }
        return jpVar.a();
    }

    public final int f() {
        return dx.f(this.b);
    }

    public final int k() {
        RecyclerView recyclerView = this.b;
        if (recyclerView == null) {
            return 0;
        }
        return recyclerView.getPaddingBottom();
    }

    public final int h() {
        RecyclerView recyclerView = this.b;
        if (recyclerView == null) {
            return 0;
        }
        return recyclerView.getPaddingLeft();
    }

    public final int j() {
        RecyclerView recyclerView = this.b;
        if (recyclerView == null) {
            return 0;
        }
        return recyclerView.getPaddingRight();
    }

    public final int i() {
        RecyclerView recyclerView = this.b;
        if (recyclerView == null) {
            return 0;
        }
        return recyclerView.getPaddingTop();
    }

    public final boolean l() {
        RecyclerView recyclerView = this.b;
        return recyclerView != null && recyclerView.hasFocus();
    }

    public final void a(kc kcVar) {
        int size = kcVar.a.size();
        for (int i2 = size - 1; i2 >= 0; i2--) {
            View view = ((km) kcVar.a.get(i2)).a;
            km c2 = RecyclerView.c(view);
            if (!c2.b()) {
                c2.a(false);
                if (c2.n()) {
                    this.b.removeDetachedView(view, false);
                }
                ju juVar = this.b.x;
                if (juVar != null) {
                    juVar.c(c2);
                }
                c2.a(true);
                kcVar.b(view);
            }
        }
        kcVar.a.clear();
        ArrayList arrayList = kcVar.b;
        if (arrayList != null) {
            arrayList.clear();
        }
        if (size > 0) {
            this.b.invalidate();
        }
    }

    public final void b(View view, kc kcVar) {
        ho hoVar = this.a;
        int a2 = hoVar.a.a(view);
        if (a2 >= 0) {
            if (hoVar.b.d(a2)) {
                hoVar.d(view);
            }
            hoVar.a.a(a2);
        }
        kcVar.a(view);
    }

    public final void b(int i2) {
        ho hoVar;
        int a2;
        View b2;
        if (d(i2) != null && (b2 = hoVar.a.b((a2 = (hoVar = this.a).a(i2)))) != null) {
            if (hoVar.b.d(a2)) {
                hoVar.d(b2);
            }
            hoVar.a.a(a2);
        }
    }

    public final void a() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public final void a(kc kcVar, int i2, View view) {
        km c2 = RecyclerView.c(view);
        if (c2.b()) {
            return;
        }
        if (!c2.j() || c2.m() || this.b.g.a) {
            f(i2);
            kcVar.c(view);
            this.b.d.c(c2);
            return;
        }
        b(i2);
        kcVar.a(c2);
    }

    public final void b(RecyclerView recyclerView) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824);
        this.h = View.MeasureSpec.getSize(makeMeasureSpec);
        View.MeasureSpec.getMode(makeMeasureSpec);
        this.i = View.MeasureSpec.getSize(makeMeasureSpec2);
        int mode = View.MeasureSpec.getMode(makeMeasureSpec2);
    }

    public final void q() {
        if (this.e) {
            this.e = false;
            this.f = 0;
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                recyclerView.a.b();
            }
        }
    }

    public final void a(int i2, int i3) {
        this.b.setMeasuredDimension(i2, i3);
    }

    public final void a(RecyclerView recyclerView) {
        if (recyclerView != null) {
            this.b = recyclerView;
            this.a = recyclerView.c;
            this.h = recyclerView.getWidth();
            this.i = recyclerView.getHeight();
            return;
        }
        this.b = null;
        this.a = null;
        this.h = 0;
        this.i = 0;
    }
}
