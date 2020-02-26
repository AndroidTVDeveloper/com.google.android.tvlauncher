package defpackage;

import android.content.Context;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* renamed from: ld  reason: default package */
/* compiled from: PG */
public final class ld implements fv {
    public fp a;
    private fo b;
    private final /* synthetic */ Toolbar c;

    public ld(Toolbar toolbar) {
        this.c = toolbar;
    }

    public final void a(fo foVar, boolean z) {
    }

    public final void a(fu fuVar) {
    }

    public final boolean a() {
        return false;
    }

    public final boolean a(gc gcVar) {
        return false;
    }

    public final boolean a(fp fpVar) {
        View view = this.c.h;
        if (view instanceof ex) {
            ((ex) view).b();
        }
        Toolbar toolbar = this.c;
        toolbar.removeView(toolbar.h);
        Toolbar toolbar2 = this.c;
        toolbar2.removeView(toolbar2.g);
        Toolbar toolbar3 = this.c;
        toolbar3.h = null;
        for (int size = toolbar3.o.size() - 1; size >= 0; size--) {
            toolbar3.addView((View) toolbar3.o.get(size));
        }
        toolbar3.o.clear();
        this.a = null;
        this.c.requestLayout();
        fpVar.d(false);
        return true;
    }

    public final boolean b(fp fpVar) {
        Toolbar toolbar = this.c;
        if (toolbar.g == null) {
            toolbar.g = new hd(toolbar.getContext());
            toolbar.g.setImageDrawable(toolbar.e);
            toolbar.g.setContentDescription(toolbar.f);
            le e = Toolbar.e();
            e.a = (toolbar.k & 112) | 8388611;
            e.b = 2;
            toolbar.g.setLayoutParams(e);
            toolbar.g.setOnClickListener(new lc(toolbar));
        }
        ViewParent parent = this.c.g.getParent();
        Toolbar toolbar2 = this.c;
        if (parent != toolbar2) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar2.g);
            }
            Toolbar toolbar3 = this.c;
            toolbar3.addView(toolbar3.g);
        }
        this.c.h = fpVar.getActionView();
        this.a = fpVar;
        ViewParent parent2 = this.c.h.getParent();
        Toolbar toolbar4 = this.c;
        if (parent2 != toolbar4) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar4.h);
            }
            le e2 = Toolbar.e();
            Toolbar toolbar5 = this.c;
            e2.a = 8388611 | (toolbar5.k & 112);
            e2.b = 2;
            toolbar5.h.setLayoutParams(e2);
            Toolbar toolbar6 = this.c;
            toolbar6.addView(toolbar6.h);
        }
        Toolbar toolbar7 = this.c;
        for (int childCount = toolbar7.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar7.getChildAt(childCount);
            if (!(((le) childAt.getLayoutParams()).b == 2 || childAt == toolbar7.a)) {
                toolbar7.removeViewAt(childCount);
                toolbar7.o.add(childAt);
            }
        }
        this.c.requestLayout();
        fpVar.d(true);
        View view = this.c.h;
        if (view instanceof ex) {
            ((ex) view).a();
        }
        return true;
    }

    public final void a(Context context, fo foVar) {
        fp fpVar;
        fo foVar2 = this.b;
        if (!(foVar2 == null || (fpVar = this.a) == null)) {
            foVar2.b(fpVar);
        }
        this.b = foVar;
    }

    public final void b() {
        if (this.a != null) {
            fo foVar = this.b;
            if (foVar != null) {
                int size = foVar.size();
                int i = 0;
                while (i < size) {
                    if (this.b.getItem(i) != this.a) {
                        i++;
                    } else {
                        return;
                    }
                }
            }
            a(this.a);
        }
    }
}
