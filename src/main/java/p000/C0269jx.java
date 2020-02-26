package p000;

import android.content.Context;
import android.graphics.Rect;
import android.os.Parcelable;
import android.support.p002v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* renamed from: jx */
/* compiled from: PG */
public abstract class C0269jx {

    /* renamed from: a */
    public C0206ho f9708a;

    /* renamed from: b */
    public RecyclerView f9709b;

    /* renamed from: c */
    public C0282kj f9710c;

    /* renamed from: d */
    public boolean f9711d = false;

    /* renamed from: e */
    public boolean f9712e = true;

    /* renamed from: f */
    public int f9713f;

    /* renamed from: g */
    public boolean f9714g;

    /* renamed from: h */
    public int f9715h;

    /* renamed from: i */
    public int f9716i;

    /* renamed from: a */
    public int mo5327a(int i, C0275kc kcVar, C0283kk kkVar) {
        throw null;
    }

    /* renamed from: a */
    public int mo5328a(View view) {
        throw null;
    }

    /* renamed from: a */
    public C0270jy mo5329a(Context context, AttributeSet attributeSet) {
        throw null;
    }

    /* renamed from: a */
    public C0270jy mo5330a(ViewGroup.LayoutParams layoutParams) {
        throw null;
    }

    /* renamed from: a */
    public void mo5332a(int i) {
    }

    /* renamed from: a */
    public void mo5334a(int i, int i2, C0283kk kkVar, C0268jw jwVar) {
    }

    /* renamed from: a */
    public void mo5335a(int i, C0268jw jwVar) {
    }

    /* renamed from: a */
    public void mo5336a(Parcelable parcelable) {
    }

    /* renamed from: a */
    public void mo5338a(RecyclerView recyclerView, ArrayList arrayList, int i, int i2) {
        throw null;
    }

    /* renamed from: a */
    public void mo5340a(View view, Rect rect) {
        throw null;
    }

    @Deprecated
    /* renamed from: a */
    public void mo5341a(View view, View view2) {
        throw null;
    }

    /* renamed from: a */
    public void mo5342a(View view, C0114ed edVar) {
        throw null;
    }

    /* renamed from: a */
    public void mo5345a(C0261jp jpVar, C0261jp jpVar2) {
    }

    /* renamed from: a */
    public void mo5348a(C0275kc kcVar, C0283kk kkVar) {
        throw null;
    }

    /* renamed from: a */
    public void mo5349a(C0275kc kcVar, C0283kk kkVar, int i, int i2) {
        throw null;
    }

    /* renamed from: a */
    public void mo5350a(C0275kc kcVar, C0283kk kkVar, C0114ed edVar) {
        throw null;
    }

    /* renamed from: a */
    public boolean mo5351a(C0275kc kcVar, C0283kk kkVar, int i) {
        throw null;
    }

    /* renamed from: b */
    public int mo5352b(int i, C0275kc kcVar, C0283kk kkVar) {
        throw null;
    }

    /* renamed from: b */
    public int mo5353b(View view) {
        throw null;
    }

    /* renamed from: b */
    public abstract C0270jy mo5354b();

    /* renamed from: b */
    public void mo5356b(int i, int i2) {
    }

    /* renamed from: b */
    public void mo5361b(C0275kc kcVar) {
        throw null;
    }

    /* renamed from: c */
    public int mo5362c(View view) {
        throw null;
    }

    /* renamed from: c */
    public View mo5364c(View view, int i) {
        throw null;
    }

    /* renamed from: c */
    public void mo5365c(int i, int i2) {
    }

    /* renamed from: c */
    public boolean mo5366c() {
        throw null;
    }

    /* renamed from: d */
    public int mo5367d(View view) {
        throw null;
    }

    /* renamed from: d */
    public void mo5369d(int i, int i2) {
    }

    /* renamed from: d */
    public boolean mo5370d() {
        throw null;
    }

    /* renamed from: e */
    public void mo5371e(int i) {
        throw null;
    }

    /* renamed from: e */
    public final boolean mo5372e() {
        C0282kj kjVar = this.f9710c;
        return kjVar != null && kjVar.f9747e;
    }

    /* renamed from: n */
    public Parcelable mo5381n() {
        throw null;
    }

    /* renamed from: o */
    public void mo5382o() {
    }

    /* renamed from: p */
    public boolean mo5383p() {
        throw null;
    }

    /* renamed from: r */
    public void mo5385r() {
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
    /* renamed from: a */
    public final void mo5339a(View view, int i) {
        m7687a(view, i, true);
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
    /* renamed from: b */
    public final void mo5358b(View view, int i) {
        m7687a(view, i, false);
    }

    /* renamed from: a */
    private final void m7687a(View view, int i, boolean z) {
        C0285km c = RecyclerView.m1301c(view);
        if (!z && !c.mo5445m()) {
            this.f9709b.f1064d.mo5538c(c);
        } else {
            this.f9709b.f1064d.mo5536b(c);
        }
        C0270jy jyVar = (C0270jy) view.getLayoutParams();
        if (c.mo5439g() || c.mo5437e()) {
            if (c.mo5437e()) {
                c.mo5438f();
            } else {
                c.mo5440h();
            }
            this.f9708a.mo5199a(view, i, view.getLayoutParams(), false);
        } else if (view.getParent() == this.f9709b) {
            int b = this.f9708a.mo5202b(view);
            if (i == -1) {
                i = this.f9708a.mo5196a();
            }
            if (b == -1) {
                throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.f9709b.indexOfChild(view) + this.f9709b.mo822a());
            } else if (b != i) {
                C0269jx jxVar = this.f9709b.f1068h;
                View d = jxVar.mo5368d(b);
                if (d != null) {
                    jxVar.mo5667f(b);
                    C0270jy jyVar2 = (C0270jy) d.getLayoutParams();
                    C0285km c2 = RecyclerView.m1301c(d);
                    if (c2.mo5445m()) {
                        jxVar.f9709b.f1064d.mo5536b(c2);
                    } else {
                        jxVar.f9709b.f1064d.mo5538c(c2);
                    }
                    jxVar.f9708a.mo5199a(d, i, jyVar2, c2.mo5445m());
                } else {
                    throw new IllegalArgumentException("Cannot move a child from non-existing index:" + b + jxVar.f9709b.toString());
                }
            }
        } else {
            this.f9708a.mo5200a(view, i, false);
            jyVar.f9719c = true;
            C0282kj kjVar = this.f9710c;
            if (kjVar != null && kjVar.f9747e && C0282kj.m7780a(view) == kjVar.f9743a) {
                kjVar.f9748f = view;
            }
        }
        if (jyVar.f9720d) {
            c.f9783a.invalidate();
            jyVar.f9720d = false;
        }
    }

    /* renamed from: a */
    public final void mo5344a(String str) {
        RecyclerView recyclerView = this.f9709b;
        if (recyclerView != null) {
            recyclerView.mo830a(str);
        }
    }

    /* renamed from: b */
    public final void mo5359b(View view, Rect rect) {
        Rect rect2;
        RecyclerView recyclerView = this.f9709b;
        if (recyclerView != null) {
            C0270jy jyVar = (C0270jy) view.getLayoutParams();
            if (!jyVar.f9719c) {
                rect2 = jyVar.f9718b;
            } else if (!recyclerView.f1024D.f9765g || (!jyVar.mo5387b() && !jyVar.f9717a.mo5442j())) {
                Rect rect3 = jyVar.f9718b;
                rect3.set(0, 0, 0, 0);
                int size = recyclerView.f1070j.size();
                for (int i = 0; i < size; i++) {
                    recyclerView.f1066f.set(0, 0, 0, 0);
                    ((akr) recyclerView.f1070j.get(i)).mo465a(recyclerView.f1066f, view, recyclerView);
                    rect3.left += recyclerView.f1066f.left;
                    rect3.top += recyclerView.f1066f.top;
                    rect3.right += recyclerView.f1066f.right;
                    rect3.bottom += recyclerView.f1066f.bottom;
                }
                jyVar.f9719c = false;
                rect2 = rect3;
            } else {
                rect2 = jyVar.f9718b;
            }
            rect.set(rect2);
            return;
        }
        rect.set(0, 0, 0, 0);
    }

    /* renamed from: a */
    public static int m7686a(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode != Integer.MIN_VALUE) {
            return mode != 1073741824 ? Math.max(i2, i3) : size;
        }
        return Math.min(size, Math.max(i2, i3));
    }

    /* renamed from: a */
    public final void mo5343a(View view, C0275kc kcVar) {
        mo5347a(kcVar, this.f9708a.mo5202b(view), view);
    }

    /* renamed from: f */
    private final void mo5667f(int i) {
        mo5368d(i);
        this.f9708a.mo5206d(i);
    }

    /* renamed from: c */
    public final View mo5363c(int i) {
        int g = mo5374g();
        for (int i2 = 0; i2 < g; i2++) {
            View d = mo5368d(i2);
            C0285km c = RecyclerView.m1301c(d);
            if (c != null && c.mo5435c() == i && !c.mo5434b() && (this.f9709b.f1024D.f9765g || !c.mo5445m())) {
                return d;
            }
        }
        return null;
    }

    /* renamed from: d */
    public final View mo5368d(int i) {
        C0206ho hoVar = this.f9708a;
        if (hoVar != null) {
            return hoVar.mo5203b(i);
        }
        return null;
    }

    /* renamed from: g */
    public final int mo5374g() {
        C0206ho hoVar = this.f9708a;
        if (hoVar == null) {
            return 0;
        }
        return hoVar.mo5196a();
    }

    /* renamed from: m */
    public final int mo5380m() {
        RecyclerView recyclerView = this.f9709b;
        C0261jp jpVar = recyclerView != null ? recyclerView.f1067g : null;
        if (jpVar == null) {
            return 0;
        }
        return jpVar.mo2794a();
    }

    /* renamed from: f */
    public final int mo5373f() {
        return C0107dx.m7209f(this.f9709b);
    }

    /* renamed from: k */
    public final int mo5378k() {
        RecyclerView recyclerView = this.f9709b;
        if (recyclerView == null) {
            return 0;
        }
        return recyclerView.getPaddingBottom();
    }

    /* renamed from: h */
    public final int mo5375h() {
        RecyclerView recyclerView = this.f9709b;
        if (recyclerView == null) {
            return 0;
        }
        return recyclerView.getPaddingLeft();
    }

    /* renamed from: j */
    public final int mo5377j() {
        RecyclerView recyclerView = this.f9709b;
        if (recyclerView == null) {
            return 0;
        }
        return recyclerView.getPaddingRight();
    }

    /* renamed from: i */
    public final int mo5376i() {
        RecyclerView recyclerView = this.f9709b;
        if (recyclerView == null) {
            return 0;
        }
        return recyclerView.getPaddingTop();
    }

    /* renamed from: l */
    public final boolean mo5379l() {
        RecyclerView recyclerView = this.f9709b;
        return recyclerView != null && recyclerView.hasFocus();
    }

    /* renamed from: a */
    public final void mo5346a(C0275kc kcVar) {
        int size = kcVar.f9726a.size();
        for (int i = size - 1; i >= 0; i--) {
            View view = ((C0285km) kcVar.f9726a.get(i)).f9783a;
            C0285km c = RecyclerView.m1301c(view);
            if (!c.mo5434b()) {
                c.mo5432a(false);
                if (c.mo5446n()) {
                    this.f9709b.removeDetachedView(view, false);
                }
                C0266ju juVar = this.f9709b.f1084x;
                if (juVar != null) {
                    juVar.mo4194c(c);
                }
                c.mo5432a(true);
                kcVar.mo5399b(view);
            }
        }
        kcVar.f9726a.clear();
        ArrayList arrayList = kcVar.f9727b;
        if (arrayList != null) {
            arrayList.clear();
        }
        if (size > 0) {
            this.f9709b.invalidate();
        }
    }

    /* renamed from: b */
    public final void mo5360b(View view, C0275kc kcVar) {
        C0206ho hoVar = this.f9708a;
        int a = hoVar.f9491a.mo5192a(view);
        if (a >= 0) {
            if (hoVar.f9492b.mo5188d(a)) {
                hoVar.mo5207d(view);
            }
            hoVar.f9491a.mo5193a(a);
        }
        kcVar.mo5394a(view);
    }

    /* renamed from: b */
    public final void mo5355b(int i) {
        C0206ho hoVar;
        int a;
        View b;
        if (mo5368d(i) != null && (b = hoVar.f9491a.mo5194b((a = (hoVar = this.f9708a).mo5197a(i)))) != null) {
            if (hoVar.f9492b.mo5188d(a)) {
                hoVar.mo5207d(b);
            }
            hoVar.f9491a.mo5193a(a);
        }
    }

    /* renamed from: a */
    public final void mo5331a() {
        RecyclerView recyclerView = this.f9709b;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    /* renamed from: a */
    public final void mo5347a(C0275kc kcVar, int i, View view) {
        C0285km c = RecyclerView.m1301c(view);
        if (c.mo5434b()) {
            return;
        }
        if (!c.mo5442j() || c.mo5445m() || this.f9709b.f1067g.f9698a) {
            mo5667f(i);
            kcVar.mo5402c(view);
            this.f9709b.f1064d.mo5538c(c);
            return;
        }
        mo5355b(i);
        kcVar.mo5395a(c);
    }

    /* renamed from: b */
    public final void mo5357b(RecyclerView recyclerView) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824);
        this.f9715h = View.MeasureSpec.getSize(makeMeasureSpec);
        View.MeasureSpec.getMode(makeMeasureSpec);
        this.f9716i = View.MeasureSpec.getSize(makeMeasureSpec2);
        int mode = View.MeasureSpec.getMode(makeMeasureSpec2);
    }

    /* renamed from: q */
    public final void mo5384q() {
        if (this.f9712e) {
            this.f9712e = false;
            this.f9713f = 0;
            RecyclerView recyclerView = this.f9709b;
            if (recyclerView != null) {
                recyclerView.f1041a.mo5397b();
            }
        }
    }

    /* renamed from: a */
    public final void mo5333a(int i, int i2) {
        this.f9709b.setMeasuredDimension(i, i2);
    }

    /* renamed from: a */
    public final void mo5337a(RecyclerView recyclerView) {
        if (recyclerView != null) {
            this.f9709b = recyclerView;
            this.f9708a = recyclerView.f1063c;
            this.f9715h = recyclerView.getWidth();
            this.f9716i = recyclerView.getHeight();
            return;
        }
        this.f9709b = null;
        this.f9708a = null;
        this.f9715h = 0;
        this.f9716i = 0;
    }
}
