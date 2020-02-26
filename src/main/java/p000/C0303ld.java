package p000;

import android.content.Context;
import android.support.p002v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* renamed from: ld */
/* compiled from: PG */
public final class C0303ld implements C0159fv {

    /* renamed from: a */
    public C0153fp f9838a;

    /* renamed from: b */
    private C0152fo f9839b;

    /* renamed from: c */
    private final /* synthetic */ Toolbar f9840c;

    public C0303ld(Toolbar toolbar) {
        this.f9840c = toolbar;
    }

    /* renamed from: a */
    public final void mo4828a(C0152fo foVar, boolean z) {
    }

    /* renamed from: a */
    public final void mo4829a(C0158fu fuVar) {
    }

    /* renamed from: a */
    public final boolean mo4830a() {
        return false;
    }

    /* renamed from: a */
    public final boolean mo4832a(C0167gc gcVar) {
        return false;
    }

    /* renamed from: a */
    public final boolean mo4831a(C0153fp fpVar) {
        View view = this.f9840c.f1146h;
        if (view instanceof C0134ex) {
            ((C0134ex) view).mo4756b();
        }
        Toolbar toolbar = this.f9840c;
        toolbar.removeView(toolbar.f1146h);
        Toolbar toolbar2 = this.f9840c;
        toolbar2.removeView(toolbar2.f1145g);
        Toolbar toolbar3 = this.f9840c;
        toolbar3.f1146h = null;
        for (int size = toolbar3.f1153o.size() - 1; size >= 0; size--) {
            toolbar3.addView((View) toolbar3.f1153o.get(size));
        }
        toolbar3.f1153o.clear();
        this.f9838a = null;
        this.f9840c.requestLayout();
        fpVar.mo4916d(false);
        return true;
    }

    /* renamed from: b */
    public final boolean mo4834b(C0153fp fpVar) {
        Toolbar toolbar = this.f9840c;
        if (toolbar.f1145g == null) {
            toolbar.f1145g = new C0195hd(toolbar.getContext());
            toolbar.f1145g.setImageDrawable(toolbar.f1143e);
            toolbar.f1145g.setContentDescription(toolbar.f1144f);
            C0304le e = Toolbar.m1381e();
            e.f9162a = (toolbar.f1149k & 112) | 8388611;
            e.f9841b = 2;
            toolbar.f1145g.setLayoutParams(e);
            toolbar.f1145g.setOnClickListener(new C0302lc(toolbar));
        }
        ViewParent parent = this.f9840c.f1145g.getParent();
        Toolbar toolbar2 = this.f9840c;
        if (parent != toolbar2) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar2.f1145g);
            }
            Toolbar toolbar3 = this.f9840c;
            toolbar3.addView(toolbar3.f1145g);
        }
        this.f9840c.f1146h = fpVar.getActionView();
        this.f9838a = fpVar;
        ViewParent parent2 = this.f9840c.f1146h.getParent();
        Toolbar toolbar4 = this.f9840c;
        if (parent2 != toolbar4) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar4.f1146h);
            }
            C0304le e2 = Toolbar.m1381e();
            Toolbar toolbar5 = this.f9840c;
            e2.f9162a = 8388611 | (toolbar5.f1149k & 112);
            e2.f9841b = 2;
            toolbar5.f1146h.setLayoutParams(e2);
            Toolbar toolbar6 = this.f9840c;
            toolbar6.addView(toolbar6.f1146h);
        }
        Toolbar toolbar7 = this.f9840c;
        for (int childCount = toolbar7.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar7.getChildAt(childCount);
            if (!(((C0304le) childAt.getLayoutParams()).f9841b == 2 || childAt == toolbar7.f1139a)) {
                toolbar7.removeViewAt(childCount);
                toolbar7.f1153o.add(childAt);
            }
        }
        this.f9840c.requestLayout();
        fpVar.mo4916d(true);
        View view = this.f9840c.f1146h;
        if (view instanceof C0134ex) {
            ((C0134ex) view).mo4755a();
        }
        return true;
    }

    /* renamed from: a */
    public final void mo4827a(Context context, C0152fo foVar) {
        C0153fp fpVar;
        C0152fo foVar2 = this.f9839b;
        if (!(foVar2 == null || (fpVar = this.f9838a) == null)) {
            foVar2.mo4880b(fpVar);
        }
        this.f9839b = foVar;
    }

    /* renamed from: b */
    public final void mo4833b() {
        if (this.f9838a != null) {
            C0152fo foVar = this.f9839b;
            if (foVar != null) {
                int size = foVar.size();
                int i = 0;
                while (i < size) {
                    if (this.f9839b.getItem(i) != this.f9838a) {
                        i++;
                    } else {
                        return;
                    }
                }
            }
            mo4831a(this.f9838a);
        }
    }
}
