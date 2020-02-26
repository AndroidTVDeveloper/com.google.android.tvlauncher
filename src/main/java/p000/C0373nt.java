package p000;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcelable;
import android.support.p002v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;

/* renamed from: nt */
/* compiled from: PG */
public final class C0373nt extends C0269jx {

    /* renamed from: F */
    public static final int[] f10018F = new int[2];

    /* renamed from: L */
    private static final Rect f10019L = new Rect();

    /* renamed from: A */
    public int f10020A = 8388659;

    /* renamed from: B */
    public int f10021B;

    /* renamed from: C */
    public C0364nk f10022C;

    /* renamed from: D */
    public final C0406oz f10023D = new C0406oz();

    /* renamed from: E */
    public final C0376nw f10024E = new C0376nw();

    /* renamed from: G */
    private final int f10025G = 10;

    /* renamed from: H */
    private C0254ji f10026H = C0254ji.m7619a(this);

    /* renamed from: I */
    private int f10027I;

    /* renamed from: J */
    private final SparseIntArray f10028J = new SparseIntArray();

    /* renamed from: K */
    private int[] f10029K;

    /* renamed from: M */
    private int f10030M = 0;

    /* renamed from: N */
    private int f10031N;

    /* renamed from: O */
    private int f10032O;

    /* renamed from: P */
    private int[] f10033P;

    /* renamed from: Q */
    private int f10034Q;

    /* renamed from: R */
    private int f10035R = 1;

    /* renamed from: S */
    private int f10036S;

    /* renamed from: T */
    private final int[] f10037T = new int[2];

    /* renamed from: U */
    private C0361nh f10038U;

    /* renamed from: V */
    private final Runnable f10039V = new C0365nl(this);

    /* renamed from: W */
    private final C0363nj f10040W = new C0366nm(this);

    /* renamed from: j */
    public final float f10041j = 1.0f;

    /* renamed from: k */
    public final C0359nf f10042k;

    /* renamed from: l */
    public int f10043l = 0;

    /* renamed from: m */
    public C0283kk f10044m;

    /* renamed from: n */
    public int f10045n;

    /* renamed from: o */
    public C0275kc f10046o;

    /* renamed from: p */
    public int f10047p = 221696;

    /* renamed from: q */
    public ArrayList f10048q = null;

    /* renamed from: r */
    public int f10049r = -1;

    /* renamed from: s */
    public int f10050s = 0;

    /* renamed from: t */
    public C0368no f10051t;

    /* renamed from: u */
    public C0370nq f10052u;

    /* renamed from: v */
    public final int f10053v;

    /* renamed from: w */
    public int f10054w;

    /* renamed from: x */
    public int f10055x;

    /* renamed from: y */
    public int f10056y;

    /* renamed from: z */
    public int f10057z;

    /* renamed from: q */
    private final int m8066q(int i) {
        if (this.f10043l != 0) {
            if (i == 17) {
                return (this.f10047p & 524288) != 0 ? 3 : 2;
            }
            if (i != 33) {
                return i != 66 ? i != 130 ? 17 : 1 : (this.f10047p & 524288) != 0 ? 2 : 3;
            }
            return 0;
        } else if (i == 17) {
            return (this.f10047p & 262144) != 0 ? 1 : 0;
        } else {
            if (i != 33) {
                return i != 66 ? i != 130 ? 17 : 3 : (this.f10047p & 262144) != 0 ? 0 : 1;
            }
            return 2;
        }
    }

    /* renamed from: z */
    private final boolean m8067z() {
        return this.f10022C != null;
    }

    /* renamed from: c */
    public final boolean mo5366c() {
        return this.f10043l == 0 || this.f10021B > 1;
    }

    /* renamed from: d */
    public final boolean mo5370d() {
        return this.f10043l == 1 || this.f10021B > 1;
    }

    /* renamed from: p */
    public final boolean mo5383p() {
        return false;
    }

    /* renamed from: r */
    public final void mo5385r() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public final boolean mo5679v() {
        return (this.f10047p & 64) != 0;
    }

    public C0373nt(C0359nf nfVar) {
        this.f10042k = nfVar;
        this.f10053v = -1;
        mo5384q();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: nk.a(int, boolean):boolean
     arg types: [int, int]
     candidates:
      nk.a(boolean, int[]):int
      nk.a(int, int):cp[]
      nk.a(int, boolean):boolean */
    /* renamed from: H */
    private final void m8038H() {
        this.f10022C.mo5640a((this.f10047p & 262144) == 0 ? this.f10036S + this.f10027I : -this.f10027I, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final boolean mo5673i(View view) {
        if (view.getVisibility() == 0) {
            return !mo5379l() || view.hasFocusable();
        }
        return false;
    }

    /* renamed from: a */
    public final void mo5334a(int i, int i2, C0283kk kkVar, C0268jw jwVar) {
        try {
            m8052b((C0275kc) null, kkVar);
            if (this.f10043l != 0) {
                i = i2;
            }
            if (mo5374g() != 0) {
                if (i != 0) {
                    this.f10022C.mo5639a(i >= 0 ? this.f10036S : 0, i, jwVar);
                }
            }
        } finally {
            m8032B();
        }
    }

    /* renamed from: a */
    public final void mo5335a(int i, C0268jw jwVar) {
        int i2 = this.f10042k.f9987N;
        if (i != 0 && i2 != 0) {
            int max = Math.max(0, Math.min(this.f10049r - ((i2 - 1) >> 1), i - i2));
            int i3 = max;
            while (i3 < i && i3 < max + i2) {
                jwVar.mo5261a(i3, 0);
                i3++;
            }
        }
    }

    /* renamed from: M */
    private final void m8043M() {
        this.f10022C = null;
        this.f10033P = null;
        this.f10047p &= -1025;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public final void mo5676s() {
        if (m8031A()) {
            int i = this.f10049r;
            View c = i != -1 ? mo5363c(i) : null;
            if (c != null) {
                m8045a(this.f10042k, this.f10042k.mo823a(c), this.f10049r);
            } else {
                m8045a(this.f10042k, (C0285km) null, -1);
            }
            if ((this.f10047p & 3) != 1 && !this.f10042k.isLayoutRequested()) {
                int g = mo5374g();
                int i2 = 0;
                while (i2 < g) {
                    if (!mo5368d(i2).isLayoutRequested()) {
                        i2++;
                    } else {
                        m8035E();
                        return;
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public final void mo5677t() {
        View view;
        if (m8031A()) {
            int i = this.f10049r;
            if (i != -1) {
                view = mo5363c(i);
            } else {
                view = null;
            }
            if (view != null) {
                this.f10042k.mo823a(view);
                m8044N();
                return;
            }
            m8044N();
        }
    }

    /* renamed from: a */
    private final void m8045a(RecyclerView recyclerView, C0285km kmVar, int i) {
        ArrayList arrayList = this.f10048q;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((boc) this.f10048q.get(size)).mo2223a(recyclerView, kmVar, i);
            }
        }
    }

    /* renamed from: N */
    private final void m8044N() {
        ArrayList arrayList = this.f10048q;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                boc boc = (boc) this.f10048q.get(size);
            }
        }
    }

    /* renamed from: E */
    private final void m8035E() {
        C0107dx.m7201a(this.f10042k, this.f10039V);
    }

    /* renamed from: b */
    public final C0270jy mo5354b() {
        return new C0369np();
    }

    /* renamed from: a */
    public final C0270jy mo5329a(Context context, AttributeSet attributeSet) {
        return new C0369np(context, attributeSet);
    }

    /* renamed from: a */
    public final C0270jy mo5330a(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C0369np) {
            return new C0369np((C0369np) layoutParams);
        }
        if (layoutParams instanceof C0270jy) {
            return new C0369np((C0270jy) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C0369np((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C0369np(layoutParams);
    }

    /* renamed from: l */
    private final int m8056l(int i) {
        return m8061n(mo5368d(i));
    }

    /* renamed from: n */
    private static final int m8061n(View view) {
        C0369np npVar;
        if (view == null || (npVar = (C0369np) view.getLayoutParams()) == null || npVar.mo5386a()) {
            return -1;
        }
        return npVar.mo5389d();
    }

    /* renamed from: a */
    public final boolean mo5663a(View view, View view2, int[] iArr) {
        int a = this.f10023D.f10113d.mo5722a(m8057l(view));
        if (view2 != null) {
            m8051b(view, view2);
        }
        int a2 = this.f10023D.f10114e.mo5722a(this.f10043l == 0 ? m8064p(view) : m8063o(view));
        if (a == 0 && a2 == 0) {
            iArr[0] = 0;
            iArr[1] = 0;
            return false;
        }
        iArr[0] = a;
        iArr[1] = a2;
        return true;
    }

    /* renamed from: d */
    public final int mo5367d(View view) {
        return (view.getBottom() + ((C0270jy) view.getLayoutParams()).f9718b.bottom) - ((C0369np) view.getLayoutParams()).f10008h;
    }

    /* renamed from: a */
    public final void mo5340a(View view, Rect rect) {
        RecyclerView.m1293a(view, rect);
        C0369np npVar = (C0369np) view.getLayoutParams();
        rect.left += npVar.f10005e;
        rect.top += npVar.f10006f;
        rect.right -= npVar.f10007g;
        rect.bottom -= npVar.f10008h;
    }

    /* renamed from: a */
    public final int mo5328a(View view) {
        return (view.getLeft() - ((C0270jy) view.getLayoutParams()).f9718b.left) + ((C0369np) view.getLayoutParams()).f10005e;
    }

    /* renamed from: j */
    static final int m8054j(View view) {
        C0369np npVar = (C0369np) view.getLayoutParams();
        Rect rect = ((C0270jy) view.getLayoutParams()).f9718b;
        return view.getMeasuredHeight() + rect.top + rect.bottom + npVar.topMargin + npVar.bottomMargin;
    }

    /* renamed from: k */
    static final int m8055k(View view) {
        C0369np npVar = (C0369np) view.getLayoutParams();
        Rect rect = ((C0270jy) view.getLayoutParams()).f9718b;
        return view.getMeasuredWidth() + rect.left + rect.right + npVar.leftMargin + npVar.rightMargin;
    }

    /* renamed from: c */
    public final int mo5362c(View view) {
        return (view.getRight() + ((C0270jy) view.getLayoutParams()).f9718b.right) - ((C0369np) view.getLayoutParams()).f10007g;
    }

    /* renamed from: b */
    public final int mo5353b(View view) {
        return (view.getTop() - ((C0270jy) view.getLayoutParams()).f9718b.top) + ((C0369np) view.getLayoutParams()).f10006f;
    }

    /* renamed from: m */
    private final int m8058m(int i) {
        int i2 = this.f10032O;
        if (i2 != 0) {
            return i2;
        }
        int[] iArr = this.f10033P;
        if (iArr != null) {
            return iArr[i];
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final int mo5674j(int i) {
        int i2 = 0;
        if ((this.f10047p & 524288) != 0) {
            for (int i3 = this.f10021B - 1; i3 > i; i3--) {
                i2 += m8058m(i3) + this.f10057z;
            }
            return i2;
        }
        int i4 = 0;
        while (i2 < i) {
            i4 += m8058m(i2) + this.f10057z;
            i2++;
        }
        return i4;
    }

    /* renamed from: C */
    private final int m8033C() {
        int i = (this.f10047p & 524288) == 0 ? this.f10021B - 1 : 0;
        return mo5674j(i) + m8058m(i);
    }

    /* renamed from: b */
    static final void m8051b(View view, View view2) {
        if (view != null && view2 != null) {
            C0369np npVar = (C0369np) view.getLayoutParams();
        }
    }

    /* renamed from: l */
    private final int m8057l(View view) {
        return this.f10043l == 0 ? m8063o(view) : m8064p(view);
    }

    /* renamed from: o */
    private static final int m8063o(View view) {
        C0369np npVar = (C0369np) view.getLayoutParams();
        return view.getLeft() + npVar.f10005e + npVar.f10009i;
    }

    /* renamed from: p */
    private static final int m8064p(View view) {
        C0369np npVar = (C0369np) view.getLayoutParams();
        return view.getTop() + npVar.f10006f + npVar.f10010j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final View mo5672i(int i) {
        Object obj;
        C0361nh nhVar;
        C0360ng a;
        View a2 = this.f10046o.mo5391a(i);
        C0369np npVar = (C0369np) a2.getLayoutParams();
        C0285km a3 = this.f10042k.mo823a(a2);
        if (!(a3 instanceof C0360ng)) {
            obj = null;
        } else {
            obj = ((C0360ng) a3).mo2791a();
        }
        if (!(obj != null || (nhVar = this.f10038U) == null || (a = nhVar.mo5627a()) == null)) {
            obj = a.mo2791a();
        }
        npVar.f10012l = (C0378ny) obj;
        return a2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final int mo5666f(View view) {
        return this.f10026H.mo5294a(view);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final int mo5665e(View view) {
        return this.f10026H.mo5295b(view);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final int mo5668g(View view) {
        mo5340a(view, f10019L);
        return this.f10043l != 0 ? f10019L.height() : f10019L.width();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public final boolean mo5682y() {
        return mo5380m() == 0 || this.f10042k.mo871e(0) != null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public final boolean mo5681x() {
        int m = mo5380m();
        return m == 0 || this.f10042k.mo871e(m + -1) != null;
    }

    /* renamed from: A */
    private final boolean m8031A() {
        ArrayList arrayList = this.f10048q;
        return arrayList != null && arrayList.size() > 0;
    }

    /* renamed from: p */
    private final boolean m8065p(int i) {
        C0285km e = this.f10042k.mo871e(i);
        if (e == null || e.f9783a.getLeft() < 0 || e.f9783a.getRight() > this.f10042k.getWidth() || e.f9783a.getTop() < 0 || e.f9783a.getBottom() > this.f10042k.getHeight()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo5660a(int i, View view, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        if (this.f10043l != 0) {
            i5 = m8055k(view);
        } else {
            i5 = m8054j(view);
        }
        int i8 = this.f10032O;
        if (i8 > 0) {
            i5 = Math.min(i5, i8);
        }
        int i9 = this.f10020A;
        int i10 = i9 & 112;
        if ((this.f10047p & 786432) != 0) {
            i6 = Gravity.getAbsoluteGravity(i9 & 8388615, 1);
        } else {
            i6 = i9 & 7;
        }
        int i11 = this.f10043l;
        if (!((i11 == 0 && i10 == 48) || (i11 == 1 && i6 == 3))) {
            if ((i11 == 0 && i10 == 80) || (i11 == 1 && i6 == 5)) {
                i4 += m8058m(i) - i5;
            } else if ((i11 == 0 && i10 == 16) || (i11 == 1 && i6 == 1)) {
                i4 += (m8058m(i) - i5) / 2;
            }
        }
        if (this.f10043l != 0) {
            i7 = i4 + i5;
            int i12 = i4;
            i4 = i2;
            i2 = i12;
        } else {
            int i13 = i3;
            i3 = i4 + i5;
            i7 = i13;
        }
        C0369np npVar = (C0369np) view.getLayoutParams();
        C0270jy jyVar = (C0270jy) view.getLayoutParams();
        Rect rect = jyVar.f9718b;
        view.layout(rect.left + i2 + jyVar.leftMargin, rect.top + i4 + jyVar.topMargin, (i7 - rect.right) - jyVar.rightMargin, (i3 - rect.bottom) - jyVar.bottomMargin);
        RecyclerView.m1293a(view, f10019L);
        int i14 = f10019L.left;
        int i15 = f10019L.top;
        int i16 = f10019L.right;
        int i17 = f10019L.bottom;
        npVar.f10005e = i2 - i14;
        npVar.f10006f = i4 - i15;
        npVar.f10007g = i16 - i7;
        npVar.f10008h = i17 - i3;
        m8059m(view);
    }

    /* renamed from: B */
    private final void m8032B() {
        this.f10046o = null;
        this.f10044m = null;
        this.f10045n = 0;
        this.f10027I = 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo5671h(View view) {
        int i;
        int i2;
        int i3;
        C0369np npVar = (C0369np) view.getLayoutParams();
        mo5359b(view, f10019L);
        int i4 = npVar.leftMargin + npVar.rightMargin + f10019L.left + f10019L.right;
        int i5 = npVar.topMargin + npVar.bottomMargin + f10019L.top + f10019L.bottom;
        if (this.f10031N == -2) {
            i = View.MeasureSpec.makeMeasureSpec(0, 0);
        } else {
            i = View.MeasureSpec.makeMeasureSpec(this.f10032O, 1073741824);
        }
        if (this.f10043l != 0) {
            i2 = ViewGroup.getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(0, 0), i5, npVar.height);
            i3 = ViewGroup.getChildMeasureSpec(i, i4, npVar.width);
        } else {
            int childMeasureSpec = ViewGroup.getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(0, 0), i4, npVar.width);
            i2 = ViewGroup.getChildMeasureSpec(i, i5, npVar.height);
            i3 = childMeasureSpec;
        }
        view.measure(i3, i2);
    }

    /* renamed from: a */
    public final void mo5345a(C0261jp jpVar, C0261jp jpVar2) {
        if (jpVar != null) {
            m8043M();
            this.f10049r = -1;
            this.f10030M = 0;
        }
        if (jpVar2 instanceof C0361nh) {
            this.f10038U = (C0361nh) jpVar2;
        } else {
            this.f10038U = null;
        }
    }

    /* renamed from: a */
    public final void mo5338a(RecyclerView recyclerView, ArrayList arrayList, int i, int i2) {
        int i3;
        int i4;
        int i5;
        View view;
        ArrayList arrayList2 = arrayList;
        int i6 = i;
        int i7 = i2;
        if ((this.f10047p & 32768) != 0) {
            return;
        }
        if (!recyclerView.hasFocus()) {
            int size = arrayList.size();
            View c = mo5363c(this.f10049r);
            if (c != null) {
                c.addFocusables(arrayList2, i6, i7);
            }
            if (arrayList.size() == size && recyclerView.isFocusable()) {
                arrayList2.add(recyclerView);
            }
        } else if (this.f10052u == null) {
            int q = m8066q(i6);
            View findFocus = recyclerView.findFocus();
            C0359nf nfVar = this.f10042k;
            View view2 = null;
            if (nfVar != null && findFocus != nfVar) {
                RecyclerView recyclerView2 = this.f9709b;
                if (recyclerView2 == null || (view = recyclerView2.mo841b(findFocus)) == null || this.f9708a.mo5205c(view)) {
                    view = null;
                }
                if (view != null) {
                    int g = mo5374g();
                    i3 = 0;
                    while (true) {
                        if (i3 < g) {
                            if (mo5368d(i3) == view) {
                                break;
                            }
                            i3++;
                        } else {
                            break;
                        }
                    }
                }
            }
            i3 = -1;
            int l = m8056l(i3);
            if (l != -1) {
                view2 = mo5363c(l);
            }
            if (view2 != null) {
                view2.addFocusables(arrayList2, i6, i7);
            }
            if (this.f10022C != null && mo5374g() != 0) {
                if (!(q == 3 || q == 2) || this.f10022C.f9995e > 1) {
                    C0364nk nkVar = this.f10022C;
                    if (nkVar == null || view2 == null) {
                        i4 = -1;
                    } else {
                        i4 = nkVar.mo5648d(l).f9990a;
                    }
                    int size2 = arrayList.size();
                    int i8 = (q == 1 || q == 3) ? 1 : -1;
                    int g2 = i8 > 0 ? mo5374g() - 1 : 0;
                    int g3 = i3 != -1 ? i3 + i8 : i8 > 0 ? 0 : -1 + mo5374g();
                    while (true) {
                        if (i8 <= 0) {
                            if (g3 < g2) {
                                return;
                            }
                        } else if (g3 > g2) {
                            return;
                        }
                        View d = mo5368d(g3);
                        if (d.getVisibility() == 0 && d.hasFocusable()) {
                            if (view2 != null) {
                                int l2 = m8056l(g3);
                                C0362ni d2 = this.f10022C.mo5648d(l2);
                                if (d2 != null) {
                                    if (q == 1) {
                                        if (d2.f9990a == i4 && l2 > l) {
                                            d.addFocusables(arrayList2, i6, i7);
                                            if (arrayList.size() > size2) {
                                                return;
                                            }
                                        }
                                    } else if (q == 0) {
                                        if (d2.f9990a == i4 && l2 < l) {
                                            d.addFocusables(arrayList2, i6, i7);
                                            if (arrayList.size() > size2) {
                                                return;
                                            }
                                        }
                                    } else if (q == 3) {
                                        int i9 = d2.f9990a;
                                        if (i9 != i4) {
                                            if (i9 >= i4) {
                                                d.addFocusables(arrayList2, i6, i7);
                                            } else {
                                                return;
                                            }
                                        }
                                    } else if (q == 2 && (i5 = d2.f9990a) != i4) {
                                        if (i5 <= i4) {
                                            d.addFocusables(arrayList2, i6, i7);
                                        } else {
                                            return;
                                        }
                                    }
                                }
                            } else {
                                d.addFocusables(arrayList2, i6, i7);
                                if (arrayList.size() > size2) {
                                    return;
                                }
                            }
                        }
                        g3 += i8;
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo5350a(C0275kc kcVar, C0283kk kkVar, C0114ed edVar) {
        int i;
        C0364nk nkVar;
        C0364nk nkVar2;
        C0111ea eaVar;
        C0111ea eaVar2;
        m8052b(kcVar, kkVar);
        int a = kkVar.mo5420a();
        int i2 = this.f10047p & 262144;
        int i3 = 1;
        if (a > 1 && !m8065p(0)) {
            int i4 = Build.VERSION.SDK_INT;
            if (this.f10043l != 0) {
                edVar.mo4699a(C0111ea.f9116c);
            } else {
                if (i2 == 0) {
                    eaVar2 = C0111ea.f9117d;
                } else {
                    eaVar2 = C0111ea.f9119f;
                }
                edVar.mo4699a(eaVar2);
            }
            edVar.mo4697a();
        }
        if (a > 1 && !m8065p(a - 1)) {
            int i5 = Build.VERSION.SDK_INT;
            if (this.f10043l != 0) {
                edVar.mo4699a(C0111ea.f9118e);
            } else {
                if (i2 == 0) {
                    eaVar = C0111ea.f9119f;
                } else {
                    eaVar = C0111ea.f9117d;
                }
                edVar.mo4699a(eaVar);
            }
            edVar.mo4697a();
        }
        if (this.f10043l != 0 || (nkVar2 = this.f10022C) == null) {
            RecyclerView recyclerView = this.f9709b;
            i = (recyclerView == null || recyclerView.f1067g == null || !mo5370d()) ? 1 : this.f9709b.f1067g.mo2794a();
        } else {
            i = nkVar2.f9995e;
        }
        if (this.f10043l != 1 || (nkVar = this.f10022C) == null) {
            RecyclerView recyclerView2 = this.f9709b;
            if (!(recyclerView2 == null || recyclerView2.f1067g == null || !mo5366c())) {
                i3 = this.f9709b.f1067g.mo2794a();
            }
        } else {
            i3 = nkVar.f9995e;
        }
        int i6 = Build.VERSION.SDK_INT;
        C0112eb ebVar = new C0112eb(AccessibilityNodeInfo.CollectionInfo.obtain(i, i3, false, 0));
        int i7 = Build.VERSION.SDK_INT;
        edVar.f9123a.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) ebVar.f9121a);
        m8032B();
    }

    /* renamed from: a */
    public final void mo5342a(View view, C0114ed edVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (this.f10022C != null && (layoutParams instanceof C0369np)) {
            int d = ((C0369np) layoutParams).mo5389d();
            int c = d >= 0 ? this.f10022C.mo5646c(d) : -1;
            if (c >= 0) {
                int i = d / this.f10022C.f9995e;
                if (this.f10043l == 0) {
                    edVar.mo4700a(C0113ec.m7230a(c, 1, i, 1, false, false));
                } else {
                    edVar.mo4700a(C0113ec.m7230a(i, 1, c, 1, false, false));
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:65:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00dc A[RETURN] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View mo5364c(android.view.View r8, int r9) {
        /*
            r7 = this;
            int r0 = r7.f10047p
            r1 = 32768(0x8000, float:4.5918E-41)
            r0 = r0 & r1
            if (r0 != 0) goto L_0x00de
            android.view.FocusFinder r0 = android.view.FocusFinder.getInstance()
            r1 = 0
            r2 = 2
            r3 = 1
            if (r9 == r2) goto L_0x001a
            if (r9 == r3) goto L_0x001a
            nf r4 = r7.f10042k
            android.view.View r0 = r0.findNextFocus(r4, r8, r9)
            goto L_0x0056
        L_0x001a:
            boolean r4 = r7.mo5370d()
            if (r4 != 0) goto L_0x0022
            r4 = 0
            goto L_0x0031
        L_0x0022:
            if (r9 != r2) goto L_0x0028
            r4 = 130(0x82, float:1.82E-43)
            goto L_0x002b
        L_0x0028:
            r4 = 33
        L_0x002b:
            nf r5 = r7.f10042k
            android.view.View r4 = r0.findNextFocus(r5, r8, r4)
        L_0x0031:
            boolean r5 = r7.mo5366c()
            if (r5 == 0) goto L_0x0055
            int r4 = r7.mo5373f()
            if (r4 != r3) goto L_0x003f
            r4 = 1
            goto L_0x0040
        L_0x003f:
            r4 = 0
        L_0x0040:
            if (r9 != r2) goto L_0x0044
            r5 = 1
            goto L_0x0045
        L_0x0044:
            r5 = 0
        L_0x0045:
            r4 = r4 ^ r5
            if (r4 != 0) goto L_0x004b
            r4 = 17
            goto L_0x004e
        L_0x004b:
            r4 = 66
        L_0x004e:
            nf r5 = r7.f10042k
            android.view.View r0 = r0.findNextFocus(r5, r8, r4)
            goto L_0x0056
        L_0x0055:
            r0 = r4
        L_0x0056:
            if (r0 != 0) goto L_0x00dd
            nf r4 = r7.f10042k
            int r4 = r4.getDescendantFocusability()
            r5 = 393216(0x60000, float:5.51013E-40)
            if (r4 != r5) goto L_0x006d
            nf r0 = r7.f10042k
            android.view.ViewParent r0 = r0.getParent()
            android.view.View r8 = r0.focusSearch(r8, r9)
            return r8
        L_0x006d:
            int r4 = r7.m8066q(r9)
            nf r5 = r7.f10042k
            int r5 = r5.f1085y
            r6 = 131072(0x20000, float:1.83671E-40)
            if (r4 == r3) goto L_0x00ad
            if (r4 == 0) goto L_0x0093
            r1 = 3
            if (r4 == r1) goto L_0x008a
            if (r4 == r2) goto L_0x0081
            goto L_0x00c8
        L_0x0081:
            if (r5 != 0) goto L_0x0092
            int r1 = r7.f10047p
            r1 = r1 & 8192(0x2000, float:1.14794E-41)
            if (r1 != 0) goto L_0x00c8
            goto L_0x0092
        L_0x008a:
            if (r5 != 0) goto L_0x0092
            int r1 = r7.f10047p
            r1 = r1 & 16384(0x4000, float:2.2959E-41)
            if (r1 != 0) goto L_0x00c8
        L_0x0092:
            goto L_0x00c7
        L_0x0093:
            if (r5 != 0) goto L_0x009c
            int r2 = r7.f10047p
            r2 = r2 & 2048(0x800, float:2.87E-42)
            if (r2 == 0) goto L_0x009c
            goto L_0x009d
        L_0x009c:
            r0 = r8
        L_0x009d:
            int r2 = r7.f10047p
            r2 = r2 & r6
            if (r2 == 0) goto L_0x00c8
            boolean r2 = r7.mo5682y()
            if (r2 != 0) goto L_0x00c8
            r7.m8053b(r1)
            goto L_0x00c7
        L_0x00ad:
            if (r5 != 0) goto L_0x00b6
            int r1 = r7.f10047p
            r1 = r1 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L_0x00b6
            goto L_0x00b7
        L_0x00b6:
            r0 = r8
        L_0x00b7:
            int r1 = r7.f10047p
            r1 = r1 & r6
            if (r1 == 0) goto L_0x00c8
            boolean r1 = r7.mo5681x()
            if (r1 != 0) goto L_0x00c8
            r7.m8053b(r3)
        L_0x00c7:
            r0 = r8
        L_0x00c8:
            if (r0 != 0) goto L_0x00dc
            nf r0 = r7.f10042k
            android.view.ViewParent r0 = r0.getParent()
            android.view.View r9 = r0.focusSearch(r8, r9)
            if (r9 != 0) goto L_0x00db
            if (r8 != 0) goto L_0x00da
            nf r8 = r7.f10042k
        L_0x00da:
            return r8
        L_0x00db:
            return r9
        L_0x00dc:
            return r0
        L_0x00dd:
            return r0
        L_0x00de:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0373nt.mo5364c(android.view.View, int):android.view.View");
    }

    /* renamed from: b */
    public final void mo5356b(int i, int i2) {
        C0364nk nkVar;
        int i3;
        int i4 = this.f10049r;
        if (i4 != -1 && (nkVar = this.f10022C) != null && nkVar.f9996f >= 0 && (i3 = this.f10030M) != Integer.MIN_VALUE && i <= i4 + i3) {
            this.f10030M = i3 + i2;
        }
    }

    /* renamed from: o */
    public final void mo5382o() {
        this.f10030M = 0;
    }

    /* renamed from: c */
    public final void mo5365c(int i, int i2) {
        int i3;
        int i4 = this.f10049r;
        if (i4 != -1 && (i3 = this.f10030M) != Integer.MIN_VALUE) {
            int i5 = i4 + i3;
            if (i <= i5 && i5 < i + 1) {
                this.f10030M = i3 + (i2 - i);
            } else if (i < i5 && i2 > i5 - 1) {
                this.f10030M = i3 - 1;
            } else if (i > i5 && i2 < i5) {
                this.f10030M = i3 + 1;
            }
        }
    }

    /* renamed from: d */
    public final void mo5369d(int i, int i2) {
        C0364nk nkVar;
        int i3;
        int i4;
        int i5 = this.f10049r;
        if (i5 != -1 && (nkVar = this.f10022C) != null && nkVar.f9996f >= 0 && (i3 = this.f10030M) != Integer.MIN_VALUE && i <= (i4 = i5 + i3)) {
            if (i + i2 > i4) {
                this.f10049r = i5 + i3 + (i - i4);
                this.f10030M = Integer.MIN_VALUE;
                return;
            }
            this.f10030M = i3 - i2;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: nj.a(int, boolean, java.lang.Object[], boolean):int
     arg types: [int, int, java.lang.Object[], int]
     candidates:
      nj.a(java.lang.Object, int, int, int):void
      nj.a(int, boolean, java.lang.Object[], boolean):int */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0286, code lost:
        r0 = r6.f10022C.f9997g;
        r4 = r9 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x028d, code lost:
        if (r4 < r7) goto L_0x029b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x028f, code lost:
        mo5343a(mo5368d(r4), r6.f10046o);
        r4 = r4 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x029b, code lost:
        r6.f10022C.mo5644b(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x02a5, code lost:
        if ((r6.f10047p & 65536) != 0) goto L_0x02b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x02ad, code lost:
        if (r6.f10022C.mo5645b() == false) goto L_0x02d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x02b3, code lost:
        if (r6.f10022C.f9997g < r0) goto L_0x02a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x02b6, code lost:
        m8038H();
        r1 = r6.f10049r;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x02bb, code lost:
        if (r1 < 0) goto L_0x02d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x02bd, code lost:
        if (r1 > r0) goto L_0x02d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x02bf, code lost:
        r0 = r6.f10022C;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x02c5, code lost:
        if (r0.f9997g >= r6.f10049r) goto L_0x02d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x02c7, code lost:
        r0.mo5645b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x02fb, code lost:
        if (((r1 & 262144) != 0) != r2.f9993c) goto L_0x02fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x03e3, code lost:
        if (r21 != false) goto L_0x0428;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x057d, code lost:
        if ((r0 & 8) != 0) goto L_0x058a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x03ac A[LOOP:7: B:159:0x03ac->B:162:0x03b9, LOOP_START] */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x03d6  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x03e3  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x03ee  */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x0434  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x045c  */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x045e  */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x046c  */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x0484  */
    /* JADX WARNING: Removed duplicated region for block: B:253:0x0552 A[LOOP:10: B:208:0x0461->B:253:0x0552, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:256:0x055c  */
    /* JADX WARNING: Removed duplicated region for block: B:257:0x0561  */
    /* JADX WARNING: Removed duplicated region for block: B:260:0x056b  */
    /* JADX WARNING: Removed duplicated region for block: B:268:0x0586  */
    /* JADX WARNING: Removed duplicated region for block: B:272:0x0597  */
    /* JADX WARNING: Removed duplicated region for block: B:317:0x05ed A[ADDED_TO_REGION, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo5348a(p000.C0275kc r23, p000.C0283kk r24) {
        /*
            r22 = this;
            r6 = r22
            r7 = r24
            int r0 = r6.f10021B
            if (r0 == 0) goto L_0x061e
            int r0 = r24.mo5420a()
            if (r0 < 0) goto L_0x061e
            int r0 = r6.f10047p
            r0 = r0 & 64
            if (r0 != 0) goto L_0x0015
            goto L_0x0022
        L_0x0015:
            int r0 = r22.mo5374g()
            if (r0 <= 0) goto L_0x0022
            int r0 = r6.f10047p
            r0 = r0 | 128(0x80, float:1.794E-43)
            r6.f10047p = r0
            return
        L_0x0022:
            int r0 = r6.f10047p
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x0617
            r0 = r0 & -4
            r8 = 1
            r0 = r0 | r8
            r6.f10047p = r0
            r22.m8052b(r23, r24)
            boolean r0 = r7.f9765g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r9 = 0
            if (r0 == 0) goto L_0x00d2
            r22.m8040J()
            int r0 = r22.mo5374g()
            nk r3 = r6.f10022C
            if (r3 != 0) goto L_0x0045
            goto L_0x00c8
        L_0x0045:
            if (r0 <= 0) goto L_0x00c8
            nf r3 = r6.f10042k
            android.view.View r4 = r6.mo5368d(r9)
            km r3 = r3.mo823a(r4)
            int r3 = r3.f9786d
            nf r4 = r6.f10042k
            int r5 = r0 + -1
            android.view.View r5 = r6.mo5368d(r5)
            km r4 = r4.mo823a(r5)
            int r4 = r4.f9786d
            r1 = 2147483647(0x7fffffff, float:NaN)
        L_0x0064:
            if (r9 >= r0) goto L_0x00bd
            android.view.View r5 = r6.mo5368d(r9)
            android.view.ViewGroup$LayoutParams r7 = r5.getLayoutParams()
            np r7 = (p000.C0369np) r7
            nf r8 = r6.f10042k
            int r8 = r8.mo858d(r5)
            boolean r10 = r7.mo5387b()
            if (r10 != 0) goto L_0x00a9
            boolean r10 = r7.mo5386a()
            if (r10 != 0) goto L_0x00a9
            boolean r10 = r5.isLayoutRequested()
            if (r10 != 0) goto L_0x00a9
            boolean r10 = r5.hasFocus()
            if (r10 != 0) goto L_0x0096
            int r10 = r6.f10049r
            int r11 = r7.mo5389d()
            if (r10 == r11) goto L_0x00a9
        L_0x0096:
            boolean r10 = r5.hasFocus()
            if (r10 == 0) goto L_0x00a4
            int r10 = r6.f10049r
            int r7 = r7.mo5389d()
            if (r10 != r7) goto L_0x00a9
        L_0x00a4:
            if (r8 < r3) goto L_0x00a9
            if (r8 > r4) goto L_0x00a9
            goto L_0x00b9
        L_0x00a9:
            int r7 = r6.mo5665e(r5)
            int r1 = java.lang.Math.min(r1, r7)
            int r5 = r6.mo5666f(r5)
            int r2 = java.lang.Math.max(r2, r5)
        L_0x00b9:
            int r9 = r9 + 1
            goto L_0x0064
        L_0x00bd:
            if (r2 <= r1) goto L_0x00c2
            int r2 = r2 - r1
            r6.f10027I = r2
        L_0x00c2:
            r22.m8038H()
            r22.m8039I()
        L_0x00c8:
            int r0 = r6.f10047p
            r0 = r0 & -4
            r6.f10047p = r0
            r22.m8032B()
            return
        L_0x00d2:
            boolean r0 = r7.f9769k
            if (r0 == 0) goto L_0x0102
            android.util.SparseIntArray r0 = r6.f10028J
            r0.clear()
            int r0 = r22.mo5374g()
            r3 = 0
        L_0x00e0:
            if (r3 >= r0) goto L_0x0102
            nf r4 = r6.f10042k
            android.view.View r5 = r6.mo5368d(r3)
            km r4 = r4.mo823a(r5)
            int r4 = r4.f9786d
            if (r4 < 0) goto L_0x00ff
            nk r5 = r6.f10022C
            ni r5 = r5.mo5648d(r4)
            if (r5 == 0) goto L_0x00ff
            android.util.SparseIntArray r10 = r6.f10028J
            int r5 = r5.f9990a
            r10.put(r4, r5)
        L_0x00ff:
            int r3 = r3 + 1
            goto L_0x00e0
        L_0x0102:
            boolean r0 = r22.mo5372e()
            r10 = r0 ^ 1
            int r3 = r6.f10049r
            r11 = -1
            if (r3 != r11) goto L_0x010e
            goto L_0x0117
        L_0x010e:
            int r4 = r6.f10030M
            if (r4 == r2) goto L_0x0117
            int r3 = r3 + r4
            r6.f10049r = r3
            r6.f10050s = r9
        L_0x0117:
            r6.f10030M = r9
            android.view.View r12 = r6.mo5363c(r3)
            int r13 = r6.f10049r
            nf r3 = r6.f10042k
            boolean r14 = r3.hasFocus()
            nk r3 = r6.f10022C
            if (r3 == 0) goto L_0x012d
            int r4 = r3.f9996f
            goto L_0x012e
        L_0x012d:
            r4 = -1
        L_0x012e:
            if (r3 == 0) goto L_0x0133
            int r3 = r3.f9997g
            goto L_0x0135
        L_0x0133:
            r3 = -1
        L_0x0135:
            int r5 = r6.f10043l
            if (r5 == 0) goto L_0x013e
            int r5 = r7.f9773o
            int r15 = r7.f9774p
            goto L_0x0142
        L_0x013e:
            int r15 = r7.f9773o
            int r5 = r7.f9774p
        L_0x0142:
            kk r1 = r6.f10044m
            int r1 = r1.mo5420a()
            if (r1 == 0) goto L_0x015d
            int r2 = r6.f10049r
            if (r2 < r1) goto L_0x0154
            int r1 = r1 + r11
            r6.f10049r = r1
            r6.f10050s = r9
            goto L_0x0162
        L_0x0154:
            if (r2 != r11) goto L_0x0162
            if (r1 <= 0) goto L_0x0162
            r6.f10049r = r9
            r6.f10050s = r9
            goto L_0x0162
        L_0x015d:
            r6.f10049r = r11
            r6.f10050s = r9
        L_0x0162:
            kk r1 = r6.f10044m
            boolean r1 = r1.f9764f
            r18 = 262144(0x40000, float:3.67342E-40)
            if (r1 == 0) goto L_0x0173
            r19 = r12
            r20 = r13
            r21 = r14
            r14 = r5
            goto L_0x02e1
        L_0x0173:
            nk r1 = r6.f10022C
            if (r1 == 0) goto L_0x02da
            int r2 = r1.f9996f
            if (r2 < 0) goto L_0x02da
            int r2 = r6.f10047p
            r2 = r2 & 256(0x100, float:3.59E-43)
            if (r2 != 0) goto L_0x02da
            int r1 = r1.f9995e
            int r2 = r6.f10021B
            if (r1 != r2) goto L_0x02da
            oz r0 = r6.f10023D
            oy r1 = r0.f10112c
            int r2 = r6.f9715h
            r1.f10106h = r2
            oy r0 = r0.f10111b
            int r2 = r6.f9716i
            r0.f10106h = r2
            int r0 = r22.mo5375h()
            int r2 = r22.mo5377j()
            r1.mo5724a(r0, r2)
            oz r0 = r6.f10023D
            oy r0 = r0.f10111b
            int r1 = r22.mo5376i()
            int r2 = r22.mo5378k()
            r0.mo5724a(r1, r2)
            oz r0 = r6.f10023D
            oy r0 = r0.f10113d
            int r0 = r0.f10106h
            r6.f10036S = r0
            r22.m8041K()
            nk r0 = r6.f10022C
            int r1 = r6.f10056y
            r0.f9994d = r1
            int r1 = r6.f10047p
            r1 = r1 | 4
            r6.f10047p = r1
            int r1 = r6.f10049r
            r0.f9999i = r1
            int r4 = r22.mo5374g()
            nk r0 = r6.f10022C
            int r0 = r0.f9996f
            int r1 = r6.f10047p
            r1 = r1 & -9
            r6.f10047p = r1
            r2 = r0
            r3 = 0
        L_0x01da:
            if (r3 >= r4) goto L_0x02cb
            android.view.View r0 = r6.mo5368d(r3)
            int r1 = m8061n(r0)
            if (r2 == r1) goto L_0x01f2
            r7 = r3
            r9 = r4
            r19 = r12
            r20 = r13
            r21 = r14
            r13 = r2
            r14 = r5
            goto L_0x0286
        L_0x01f2:
            nk r1 = r6.f10022C
            ni r1 = r1.mo5648d(r2)
            if (r1 == 0) goto L_0x027c
            int r9 = r1.f9990a
            int r9 = r6.mo5674j(r9)
            oz r8 = r6.f10023D
            oy r8 = r8.f10114e
            int r8 = r8.f10107i
            int r9 = r9 + r8
            int r8 = r6.f10054w
            int r8 = r9 - r8
            int r9 = r6.mo5665e(r0)
            int r11 = r6.mo5668g(r0)
            android.view.ViewGroup$LayoutParams r16 = r0.getLayoutParams()
            r17 = r4
            r4 = r16
            np r4 = (p000.C0369np) r4
            km r4 = r4.f9717a
            boolean r4 = r4.mo5443k()
            if (r4 != 0) goto L_0x0227
            r4 = r0
            goto L_0x023a
        L_0x0227:
            int r4 = r6.f10047p
            r4 = r4 | 8
            r6.f10047p = r4
            kc r4 = r6.f10046o
            r6.mo5343a(r0, r4)
            android.view.View r0 = r6.mo5672i(r2)
            r6.mo5358b(r0, r3)
            r4 = r0
        L_0x023a:
            r6.mo5671h(r4)
            int r0 = r6.f10043l
            if (r0 != 0) goto L_0x0248
            int r0 = m8055k(r4)
            int r16 = r9 + r0
            goto L_0x024e
        L_0x0248:
            int r0 = m8054j(r4)
            int r16 = r9 + r0
        L_0x024e:
            int r1 = r1.f9990a
            r19 = r12
            r12 = r0
            r0 = r22
            r20 = r13
            r13 = r2
            r2 = r4
            r4 = r3
            r3 = r9
            r7 = r4
            r9 = r17
            r4 = r16
            r21 = r14
            r14 = r5
            r5 = r8
            r0.mo5660a(r1, r2, r3, r4, r5)
            if (r11 != r12) goto L_0x0286
            int r3 = r7 + 1
            int r2 = r13 + 1
            r7 = r24
            r4 = r9
            r5 = r14
            r12 = r19
            r13 = r20
            r14 = r21
            r8 = 1
            r9 = 0
            r11 = -1
            goto L_0x01da
        L_0x027c:
            r7 = r3
            r9 = r4
            r19 = r12
            r20 = r13
            r21 = r14
            r13 = r2
            r14 = r5
        L_0x0286:
            nk r0 = r6.f10022C
            int r0 = r0.f9997g
            r1 = -1
            int r4 = r9 + -1
        L_0x028d:
            if (r4 < r7) goto L_0x029b
            android.view.View r1 = r6.mo5368d(r4)
            kc r2 = r6.f10046o
            r6.mo5343a(r1, r2)
            int r4 = r4 + -1
            goto L_0x028d
        L_0x029b:
            nk r1 = r6.f10022C
            r1.mo5644b(r13)
            int r1 = r6.f10047p
            r2 = 65536(0x10000, float:9.18355E-41)
            r1 = r1 & r2
            if (r1 != 0) goto L_0x02b6
        L_0x02a7:
            nk r1 = r6.f10022C
            boolean r1 = r1.mo5645b()
            if (r1 == 0) goto L_0x02d2
            nk r1 = r6.f10022C
            int r1 = r1.f9997g
            if (r1 < r0) goto L_0x02a7
            goto L_0x02d2
        L_0x02b6:
            r22.m8038H()
            int r1 = r6.f10049r
            if (r1 < 0) goto L_0x02d2
            if (r1 > r0) goto L_0x02d2
        L_0x02bf:
            nk r0 = r6.f10022C
            int r1 = r0.f9997g
            int r2 = r6.f10049r
            if (r1 >= r2) goto L_0x02d2
            r0.mo5645b()
            goto L_0x02bf
        L_0x02cb:
            r19 = r12
            r20 = r13
            r21 = r14
            r14 = r5
        L_0x02d2:
            r22.mo5680w()
            r22.m8041K()
            goto L_0x03bc
        L_0x02da:
            r19 = r12
            r20 = r13
            r21 = r14
            r14 = r5
        L_0x02e1:
            int r1 = r6.f10047p
            r1 = r1 & -257(0xfffffffffffffeff, float:NaN)
            r6.f10047p = r1
            nk r2 = r6.f10022C
            if (r2 == 0) goto L_0x02fd
            int r5 = r6.f10021B
            int r7 = r2.f9995e
            if (r5 == r7) goto L_0x02f2
            goto L_0x02fd
        L_0x02f2:
            r1 = r1 & r18
            if (r1 != 0) goto L_0x02f8
            r1 = 0
            goto L_0x02f9
        L_0x02f8:
            r1 = 1
        L_0x02f9:
            boolean r2 = r2.f9993c
            if (r1 == r2) goto L_0x0323
        L_0x02fd:
            int r1 = r6.f10021B
            r2 = 1
            if (r1 == r2) goto L_0x030c
            ov r2 = new ov
            r5 = 0
            r2.<init>(r5)
            r2.mo5638a(r1)
            goto L_0x0311
        L_0x030c:
            ot r2 = new ot
            r2.<init>()
        L_0x0311:
            r6.f10022C = r2
            nj r1 = r6.f10040W
            r2.f9992b = r1
            int r1 = r6.f10047p
            r1 = r1 & r18
            if (r1 == 0) goto L_0x031f
            r1 = 1
            goto L_0x0321
        L_0x031f:
            r1 = 0
        L_0x0321:
            r2.f9993c = r1
        L_0x0323:
            oz r1 = r6.f10023D
            oy r1 = r1.f10113d
            r1.mo5723a()
            oz r1 = r6.f10023D
            oy r2 = r1.f10112c
            int r5 = r6.f9715h
            r2.f10106h = r5
            oy r1 = r1.f10111b
            int r5 = r6.f9716i
            r1.f10106h = r5
            int r1 = r22.mo5375h()
            int r5 = r22.mo5377j()
            r2.mo5724a(r1, r5)
            oz r1 = r6.f10023D
            oy r1 = r1.f10111b
            int r2 = r22.mo5376i()
            int r5 = r22.mo5378k()
            r1.mo5724a(r2, r5)
            oz r1 = r6.f10023D
            oy r1 = r1.f10113d
            int r1 = r1.f10106h
            r6.f10036S = r1
            r1 = 0
            r6.f10054w = r1
            r22.m8041K()
            nk r1 = r6.f10022C
            int r2 = r6.f10056y
            r1.f9994d = r2
            kc r1 = r6.f10046o
            int r2 = r22.mo5374g()
            r5 = -1
            int r2 = r2 + r5
        L_0x036e:
            if (r2 >= 0) goto L_0x05fa
            nk r1 = r6.f10022C
            r1.mo5637a()
            oz r1 = r6.f10023D
            oy r1 = r1.f10113d
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r1.f10100b = r5
            r1.f10102d = r5
            r7 = 2147483647(0x7fffffff, float:NaN)
            r1.f10099a = r7
            r1.f10101c = r7
            int r1 = r6.f10047p
            r1 = r1 & -21
            if (r0 != 0) goto L_0x038f
            r0 = 16
            goto L_0x0391
        L_0x038f:
            r0 = 0
        L_0x0391:
            r0 = r0 | r1
            r6.f10047p = r0
            if (r10 != 0) goto L_0x0397
        L_0x0396:
            goto L_0x03a5
        L_0x0397:
            if (r4 >= 0) goto L_0x039a
        L_0x0399:
            goto L_0x03a1
        L_0x039a:
            int r0 = r6.f10049r
            if (r0 > r3) goto L_0x0399
            if (r0 < r4) goto L_0x0399
            goto L_0x0396
        L_0x03a1:
            int r4 = r6.f10049r
            r3 = r4
        L_0x03a5:
            nk r0 = r6.f10022C
            r0.f9999i = r4
            r0 = -1
            if (r3 == r0) goto L_0x03bc
        L_0x03ac:
            nk r0 = r6.f10022C
            boolean r0 = r0.mo5645b()
            if (r0 != 0) goto L_0x03b5
            goto L_0x03bc
        L_0x03b5:
            android.view.View r0 = r6.mo5363c(r3)
            if (r0 != 0) goto L_0x03bc
            goto L_0x03ac
        L_0x03bc:
            r22.mo5680w()
            nk r0 = r6.f10022C
            int r1 = r0.f9996f
            int r0 = r0.f9997g
            int r2 = -r15
            int r3 = -r14
            int r4 = r6.f10049r
            android.view.View r4 = r6.mo5363c(r4)
            if (r4 == 0) goto L_0x03d4
            if (r10 == 0) goto L_0x03d4
            r6.m8046a(r4, r2, r3)
        L_0x03d4:
            if (r4 == 0) goto L_0x03e3
            if (r21 != 0) goto L_0x03d9
            goto L_0x03e6
        L_0x03d9:
            boolean r2 = r4.hasFocus()
            if (r2 != 0) goto L_0x0428
            r4.requestFocus()
            goto L_0x0428
        L_0x03e3:
            if (r21 == 0) goto L_0x03e6
            goto L_0x0428
        L_0x03e6:
            nf r5 = r6.f10042k
            boolean r5 = r5.hasFocus()
            if (r5 != 0) goto L_0x0428
            if (r4 == 0) goto L_0x03fd
            boolean r5 = r4.hasFocusable()
            if (r5 == 0) goto L_0x03fd
            nf r5 = r6.f10042k
            r5.focusableViewAvailable(r4)
            r7 = r4
            goto L_0x041b
        L_0x03fd:
            int r5 = r22.mo5374g()
            r7 = r4
            r4 = 0
        L_0x0403:
            if (r4 >= r5) goto L_0x041b
            android.view.View r7 = r6.mo5368d(r4)
            if (r7 != 0) goto L_0x040c
            goto L_0x0418
        L_0x040c:
            boolean r8 = r7.hasFocusable()
            if (r8 == 0) goto L_0x0418
            nf r4 = r6.f10042k
            r4.focusableViewAvailable(r7)
            goto L_0x041b
        L_0x0418:
            int r4 = r4 + 1
            goto L_0x0403
        L_0x041b:
            if (r10 == 0) goto L_0x0428
            if (r7 == 0) goto L_0x0428
            boolean r4 = r7.hasFocus()
            if (r4 == 0) goto L_0x0428
            r6.m8046a(r7, r2, r3)
        L_0x0428:
            r22.m8038H()
            r22.m8039I()
            nk r2 = r6.f10022C
            int r3 = r2.f9996f
            if (r3 != r1) goto L_0x05ed
            int r1 = r2.f9997g
            if (r1 != r0) goto L_0x05ed
            r22.m8037G()
            r22.m8036F()
            r8 = r24
            boolean r0 = r8.f9769k
            if (r0 == 0) goto L_0x0556
            kc r0 = r6.f10046o
            java.util.List r0 = r0.f9729d
            int r1 = r0.size()
            if (r1 != 0) goto L_0x0450
            goto L_0x0556
        L_0x0450:
            int[] r2 = r6.f10029K
            if (r2 == 0) goto L_0x045a
            int r3 = r2.length
            if (r1 > r3) goto L_0x045a
            r2 = 0
            r3 = 0
            goto L_0x046a
        L_0x045a:
            if (r2 == 0) goto L_0x045e
            int r2 = r2.length
            goto L_0x0461
        L_0x045e:
            r2 = 16
        L_0x0461:
            if (r2 < r1) goto L_0x0552
            int[] r2 = new int[r2]
            r6.f10029K = r2
            r2 = 0
            r3 = 0
        L_0x046a:
            if (r2 >= r1) goto L_0x0482
            java.lang.Object r4 = r0.get(r2)
            km r4 = (p000.C0285km) r4
            int r4 = r4.mo5436d()
            if (r4 < 0) goto L_0x047f
            int r5 = r3 + 1
            int[] r7 = r6.f10029K
            r7[r3] = r4
            r3 = r5
        L_0x047f:
            int r2 = r2 + 1
            goto L_0x046a
        L_0x0482:
            if (r3 <= 0) goto L_0x054c
            int[] r0 = r6.f10029K
            r1 = 0
            java.util.Arrays.sort(r0, r1, r3)
            nk r0 = r6.f10022C
            int[] r2 = r6.f10029K
            android.util.SparseIntArray r4 = r6.f10028J
            int r5 = r0.f9997g
            if (r5 < 0) goto L_0x0499
            int r9 = java.util.Arrays.binarySearch(r2, r1, r3, r5)
            goto L_0x049b
        L_0x0499:
            r9 = 0
        L_0x049b:
            if (r9 >= 0) goto L_0x04f7
            int r1 = -r9
            r9 = -1
            int r1 = r1 + r9
            boolean r7 = r0.f9993c
            if (r7 != 0) goto L_0x04b5
            nj r7 = r0.f9992b
            int r7 = r7.mo5633b(r5)
            nj r8 = r0.f9992b
            int r5 = r8.mo5634c(r5)
            int r7 = r7 + r5
            int r5 = r0.f9994d
            int r7 = r7 + r5
            goto L_0x04c5
        L_0x04b5:
            nj r7 = r0.f9992b
            int r7 = r7.mo5633b(r5)
            nj r8 = r0.f9992b
            int r5 = r8.mo5634c(r5)
            int r7 = r7 - r5
            int r5 = r0.f9994d
            int r7 = r7 - r5
        L_0x04c5:
        L_0x04c6:
            if (r1 < r3) goto L_0x04c9
            goto L_0x04f7
        L_0x04c9:
            r5 = r2[r1]
            int r9 = r4.get(r5)
            if (r9 < 0) goto L_0x04d2
            goto L_0x04d4
        L_0x04d2:
            r9 = 0
        L_0x04d4:
            nj r8 = r0.f9992b
            java.lang.Object[] r10 = r0.f9991a
            r11 = 1
            int r5 = r8.mo5629a(r5, r11, r10, r11)
            nj r8 = r0.f9992b
            java.lang.Object[] r10 = r0.f9991a
            r11 = 0
            r10 = r10[r11]
            r8.mo5631a(r10, r5, r9, r7)
            boolean r8 = r0.f9993c
            if (r8 == 0) goto L_0x04f0
            int r7 = r7 - r5
            int r5 = r0.f9994d
            int r7 = r7 - r5
            goto L_0x04f4
        L_0x04f0:
            int r7 = r7 + r5
            int r5 = r0.f9994d
            int r7 = r7 + r5
        L_0x04f4:
            int r1 = r1 + 1
            goto L_0x04c6
        L_0x04f7:
            int r1 = r0.f9996f
            if (r1 < 0) goto L_0x0501
            r5 = 0
            int r9 = java.util.Arrays.binarySearch(r2, r5, r3, r1)
            goto L_0x0503
        L_0x0501:
            r9 = 0
        L_0x0503:
            if (r9 >= 0) goto L_0x054c
            int r3 = -r9
            int r3 = r3 + -2
            boolean r5 = r0.f9993c
            if (r5 != 0) goto L_0x0513
            nj r5 = r0.f9992b
            int r1 = r5.mo5633b(r1)
            goto L_0x0519
        L_0x0513:
            nj r5 = r0.f9992b
            int r1 = r5.mo5633b(r1)
        L_0x0519:
        L_0x051a:
            if (r3 >= 0) goto L_0x051d
            goto L_0x054c
        L_0x051d:
            r5 = r2[r3]
            int r9 = r4.get(r5)
            if (r9 < 0) goto L_0x0526
            goto L_0x0528
        L_0x0526:
            r9 = 0
        L_0x0528:
            nj r7 = r0.f9992b
            java.lang.Object[] r8 = r0.f9991a
            r10 = 1
            r11 = 0
            int r5 = r7.mo5629a(r5, r11, r8, r10)
            boolean r7 = r0.f9993c
            if (r7 != 0) goto L_0x053b
            int r7 = r0.f9994d
            int r1 = r1 - r7
            int r1 = r1 - r5
            goto L_0x053f
        L_0x053b:
            int r7 = r0.f9994d
            int r1 = r1 + r7
            int r1 = r1 + r5
        L_0x053f:
            nj r7 = r0.f9992b
            java.lang.Object[] r8 = r0.f9991a
            r10 = 0
            r8 = r8[r10]
            r7.mo5631a(r8, r5, r9, r1)
            int r3 = r3 + -1
            goto L_0x051a
        L_0x054c:
            android.util.SparseIntArray r0 = r6.f10028J
            r0.clear()
            goto L_0x0556
        L_0x0552:
            r9 = -1
            int r2 = r2 + r2
            goto L_0x0461
        L_0x0556:
            int r0 = r6.f10047p
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x0561
            r0 = r0 & -1025(0xfffffffffffffbff, float:NaN)
            r6.f10047p = r0
            goto L_0x0564
        L_0x0561:
            r22.m8034D()
        L_0x0564:
            int r0 = r6.f10047p
            r1 = r0 & 4
            if (r1 != 0) goto L_0x056b
            goto L_0x0580
        L_0x056b:
            int r0 = r6.f10049r
            r11 = r20
            if (r0 != r11) goto L_0x058a
            android.view.View r0 = r6.mo5363c(r0)
            r12 = r19
            if (r0 != r12) goto L_0x058a
            int r0 = r6.f10047p
            r1 = r0 & 8
            if (r1 == 0) goto L_0x0580
            goto L_0x058a
        L_0x0580:
            r0 = r0 & 20
            r13 = 16
            if (r0 != r13) goto L_0x058d
            r22.mo5676s()
            goto L_0x058d
        L_0x058a:
            r22.mo5676s()
        L_0x058d:
            r22.mo5677t()
            int r0 = r6.f10047p
            r1 = r0 & 64
            if (r1 != 0) goto L_0x0597
            goto L_0x05e3
        L_0x0597:
            int r1 = r6.f10043l
            r2 = 1
            if (r1 != r2) goto L_0x05b2
            int r0 = r6.f9716i
            int r0 = -r0
            int r1 = r22.mo5374g()
            if (r1 <= 0) goto L_0x05e0
            r1 = 0
            android.view.View r1 = r6.mo5368d(r1)
            int r1 = r1.getTop()
            if (r1 >= 0) goto L_0x05e0
            int r0 = r0 + r1
            goto L_0x05e0
        L_0x05b2:
            r0 = r0 & r18
            if (r0 != 0) goto L_0x05cc
            int r0 = r6.f9715h
            int r0 = -r0
            int r1 = r22.mo5374g()
            if (r1 <= 0) goto L_0x05e0
            r1 = 0
            android.view.View r1 = r6.mo5368d(r1)
            int r1 = r1.getLeft()
            if (r1 >= 0) goto L_0x05e0
            int r0 = r0 + r1
            goto L_0x05e0
        L_0x05cc:
            int r0 = r6.f9715h
            int r1 = r22.mo5374g()
            if (r1 <= 0) goto L_0x05e0
            r1 = 0
            android.view.View r1 = r6.mo5368d(r1)
            int r1 = r1.getRight()
            if (r1 <= r0) goto L_0x05e0
            r0 = r1
        L_0x05e0:
            r6.m8060n(r0)
        L_0x05e3:
            int r0 = r6.f10047p
            r0 = r0 & -4
            r6.f10047p = r0
            r22.m8032B()
            return
        L_0x05ed:
            r8 = r24
            r12 = r19
            r11 = r20
            r1 = 0
            r2 = 1
            r9 = -1
            r13 = 16
            goto L_0x03bc
        L_0x05fa:
            r8 = r24
            r12 = r19
            r11 = r20
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = 2147483647(0x7fffffff, float:NaN)
            r9 = -1
            r13 = 16
            r16 = 1
            r17 = 0
            android.view.View r5 = r6.mo5368d(r2)
            r6.mo5347a(r1, r2, r5)
            int r2 = r2 + -1
            goto L_0x036e
        L_0x0617:
            r22.m8043M()
            r22.mo5361b(r23)
            return
        L_0x061e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0373nt.mo5348a(kc, kk):void");
    }

    /* renamed from: a */
    public final void mo5349a(C0275kc kcVar, C0283kk kkVar, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        m8052b(kcVar, kkVar);
        if (this.f10043l == 0) {
            i6 = View.MeasureSpec.getSize(i);
            i5 = View.MeasureSpec.getSize(i2);
            i4 = View.MeasureSpec.getMode(i2);
            i3 = mo5376i() + mo5378k();
        } else {
            i5 = View.MeasureSpec.getSize(i);
            i6 = View.MeasureSpec.getSize(i2);
            i4 = View.MeasureSpec.getMode(i);
            i3 = mo5375h() + mo5377j();
        }
        this.f10034Q = i5;
        int i8 = this.f10031N;
        if (i8 == -2) {
            int i9 = this.f10035R;
            if (i9 == 0) {
                i9 = 1;
            }
            this.f10021B = i9;
            this.f10032O = 0;
            int[] iArr = this.f10033P;
            if (iArr == null || iArr.length != i9) {
                this.f10033P = new int[i9];
            }
            if (this.f10044m.f9765g) {
                m8040J();
            }
            m8050a(true);
            if (i4 == Integer.MIN_VALUE) {
                i5 = Math.min(m8033C() + i3, this.f10034Q);
            } else if (i4 == 0) {
                i5 = m8033C() + i3;
            } else if (i4 == 1073741824) {
                i5 = this.f10034Q;
            } else {
                throw new IllegalStateException("wrong spec");
            }
        } else {
            if (i4 != Integer.MIN_VALUE) {
                if (i4 == 0) {
                    if (i8 == 0) {
                        i8 = i5 - i3;
                    }
                    this.f10032O = i8;
                    int i10 = this.f10035R;
                    if (i10 == 0) {
                        i10 = 1;
                    }
                    this.f10021B = i10;
                    i5 = (i8 * i10) + (this.f10057z * (i10 - 1)) + i3;
                } else if (i4 != 1073741824) {
                    throw new IllegalStateException("wrong spec");
                }
            }
            int i11 = this.f10035R;
            if (i11 == 0 && i8 == 0) {
                this.f10021B = 1;
                i8 = i5 - i3;
                this.f10032O = i8;
                i11 = 1;
            } else if (i11 == 0) {
                this.f10032O = i8;
                int i12 = this.f10057z;
                int i13 = (i5 + i12) / (i12 + i8);
                this.f10021B = i13;
                i11 = i13;
            } else if (i8 == 0) {
                this.f10021B = i11;
                i8 = ((i5 - i3) - (this.f10057z * (i11 - 1))) / i11;
                this.f10032O = i8;
            } else {
                this.f10021B = i11;
                this.f10032O = i8;
            }
            if (i4 == Integer.MIN_VALUE && (i7 = (i8 * i11) + (this.f10057z * (i11 - 1)) + i3) < i5) {
                i5 = i7;
            }
        }
        if (this.f10043l == 0) {
            mo5333a(i6, i5);
        } else {
            mo5333a(i5, i6);
        }
        m8032B();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: nt.a(android.view.View, android.view.View, boolean):void
     arg types: [android.view.View, android.view.View, int]
     candidates:
      nt.a(android.support.v7.widget.RecyclerView, km, int):void
      nt.a(android.view.View, int, int):void
      nt.a(int, kc, kk):int
      nt.a(kc, kk, ed):void
      nt.a(android.view.View, android.view.View, int[]):boolean
      nt.a(kc, kk, int):boolean
      jx.a(int, int, int):int
      jx.a(android.view.View, int, boolean):void
      jx.a(int, kc, kk):int
      jx.a(kc, int, android.view.View):void
      jx.a(kc, kk, ed):void
      jx.a(kc, kk, int):boolean
      nt.a(android.view.View, android.view.View, boolean):void */
    /* renamed from: a */
    public final void mo5341a(View view, View view2) {
        if ((this.f10047p & 32768) == 0 && m8061n(view) != -1 && (this.f10047p & 35) == 0) {
            m8047a(view, view2, true);
        }
    }

    /* renamed from: a */
    public final void mo5336a(Parcelable parcelable) {
        if (parcelable instanceof C0372ns) {
            this.f10049r = ((C0372ns) parcelable).f10016a;
            this.f10030M = 0;
            this.f10047p |= 256;
            mo5331a();
        }
    }

    /* renamed from: n */
    public final Parcelable mo5381n() {
        C0372ns nsVar = new C0372ns();
        nsVar.f10016a = this.f10049r;
        int g = mo5374g();
        for (int i = 0; i < g; i++) {
            m8061n(mo5368d(i));
        }
        nsVar.f10017b = null;
        return nsVar;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: nt.a(boolean, int):int
     arg types: [int, int]
     candidates:
      nt.a(android.content.Context, android.util.AttributeSet):jy
      nt.a(int, jw):void
      nt.a(int, boolean):void
      nt.a(android.view.View, android.graphics.Rect):void
      nt.a(android.view.View, android.view.View):void
      nt.a(android.view.View, ed):void
      nt.a(android.view.View, boolean):void
      nt.a(jp, jp):void
      nt.a(kc, kk):void
      jx.a(android.content.Context, android.util.AttributeSet):jy
      jx.a(int, int):void
      jx.a(int, jw):void
      jx.a(android.view.View, int):void
      jx.a(android.view.View, android.graphics.Rect):void
      jx.a(android.view.View, android.view.View):void
      jx.a(android.view.View, ed):void
      jx.a(android.view.View, kc):void
      jx.a(jp, jp):void
      jx.a(kc, kk):void
      nt.a(boolean, int):int */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003f, code lost:
        if (r6 != p000.C0111ea.f9118e.mo4693a()) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002b, code lost:
        if (r4 == 0) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002e, code lost:
        if (r4 == 0) goto L_0x0046;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0056  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo5351a(p000.C0275kc r4, p000.C0283kk r5, int r6) {
        /*
            r3 = this;
            int r0 = r3.f10047p
            r1 = 131072(0x20000, float:1.83671E-40)
            r0 = r0 & r1
            r1 = 1
            if (r0 == 0) goto L_0x0061
            r3.m8052b(r4, r5)
            int r4 = r3.f10047p
            r5 = 262144(0x40000, float:3.67342E-40)
            r4 = r4 & r5
            int r5 = android.os.Build.VERSION.SDK_INT
            int r5 = r3.f10043l
            r0 = 4096(0x1000, float:5.74E-42)
            r2 = 8192(0x2000, float:1.14794E-41)
            if (r5 != 0) goto L_0x0031
            ea r5 = p000.C0111ea.f9117d
            int r5 = r5.mo4693a()
            if (r6 == r5) goto L_0x002e
            ea r5 = p000.C0111ea.f9119f
            int r5 = r5.mo4693a()
            if (r6 == r5) goto L_0x002b
            goto L_0x0048
        L_0x002b:
            if (r4 != 0) goto L_0x0046
            goto L_0x0043
        L_0x002e:
            if (r4 != 0) goto L_0x0043
            goto L_0x0046
        L_0x0031:
            ea r4 = p000.C0111ea.f9116c
            int r4 = r4.mo4693a()
            if (r6 == r4) goto L_0x0046
            ea r4 = p000.C0111ea.f9118e
            int r4 = r4.mo4693a()
            if (r6 == r4) goto L_0x0043
            goto L_0x0048
        L_0x0043:
            r6 = 4096(0x1000, float:5.74E-42)
            goto L_0x0048
        L_0x0046:
            r6 = 8192(0x2000, float:1.14794E-41)
        L_0x0048:
            r4 = 0
            if (r6 == r0) goto L_0x0056
            if (r6 == r2) goto L_0x004e
            goto L_0x005d
        L_0x004e:
            r3.m8053b(r4)
            r5 = -1
            r3.mo5659a(r4, r5)
            goto L_0x005d
        L_0x0056:
            r3.m8053b(r1)
            r3.mo5659a(r4, r1)
        L_0x005d:
            r3.m8032B()
            return r1
        L_0x0061:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0373nt.mo5351a(kc, kk, int):boolean");
    }

    /* renamed from: I */
    private final void m8039I() {
        this.f10022C.mo5651g((this.f10047p & 262144) != 0 ? this.f10036S + this.f10027I : -this.f10027I);
    }

    /* renamed from: b */
    private final void m8053b(boolean z) {
        if (z) {
            if (mo5681x()) {
                return;
            }
        } else if (mo5682y()) {
            return;
        }
        C0370nq nqVar = this.f10052u;
        int i = -1;
        boolean z2 = true;
        if (nqVar == null) {
            this.f10042k.mo872e();
            if (z) {
                i = 1;
            }
            if (this.f10021B <= 1) {
                z2 = false;
            }
            C0370nq nqVar2 = new C0370nq(this, i, z2);
            this.f10030M = 0;
            m8049a(nqVar2);
        } else if (!z) {
            int i2 = nqVar.f10014k;
            if (i2 > (-nqVar.f10015l.f10025G)) {
                nqVar.f10014k = i2 - 1;
            }
        } else {
            int i3 = nqVar.f10014k;
            if (i3 < nqVar.f10015l.f10025G) {
                nqVar.f10014k = i3 + 1;
            }
        }
    }

    /* renamed from: a */
    private final boolean m8050a(boolean z) {
        int i;
        C0072cp[] cpVarArr;
        int i2;
        int i3;
        int i4;
        int i5 = 0;
        if (this.f10032O != 0 || this.f10033P == null) {
            return false;
        }
        C0364nk nkVar = this.f10022C;
        C0072cp[] a = nkVar != null ? nkVar.mo5641a(nkVar.f9996f, nkVar.f9997g) : null;
        int i6 = -1;
        int i7 = 0;
        boolean z2 = false;
        int i8 = -1;
        while (i7 < this.f10021B) {
            C0072cp cpVar = a != null ? a[i7] : null;
            int b = cpVar != null ? cpVar.mo3541b() : 0;
            int i9 = -1;
            for (int i10 = 0; i10 < b; i10 += 2) {
                int b2 = cpVar.mo3542b(i10 + 1);
                for (int b3 = cpVar.mo3542b(i10); b3 <= b2; b3++) {
                    View c = mo5363c(b3 - this.f10045n);
                    if (c != null) {
                        if (z) {
                            mo5671h(c);
                        }
                        if (this.f10043l != 0) {
                            i4 = m8055k(c);
                        } else {
                            i4 = m8054j(c);
                        }
                        if (i4 > i9) {
                            i9 = i4;
                        }
                    }
                }
            }
            int a2 = this.f10044m.mo5420a();
            if (this.f10042k.f1074n) {
                cpVarArr = a;
                i = i9;
            } else if (!z || i9 >= 0 || a2 <= 0) {
                cpVarArr = a;
                i = i9;
            } else {
                if (i8 < 0) {
                    int i11 = this.f10049r;
                    if (i11 < 0) {
                        i11 = 0;
                    } else if (i11 >= a2) {
                        i11 = a2 - 1;
                    }
                    if (mo5374g() > 0) {
                        int c2 = this.f10042k.mo823a(mo5368d(i5)).mo5435c();
                        int c3 = this.f10042k.mo823a(mo5368d(mo5374g() + i6)).mo5435c();
                        if (i3 >= c2 && i3 <= c3) {
                            i3 = i3 - c2 <= c3 - i3 ? c2 - 1 : c3 + 1;
                            if (i3 < 0 && c3 < a2 - 1) {
                                i3 = c3 + 1;
                            } else if (i3 >= a2 && c2 > 0) {
                                i3 = c2 - 1;
                            }
                        }
                    }
                    if (i3 >= 0 && i3 < a2) {
                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i5, i5);
                        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i5, i5);
                        int[] iArr = this.f10037T;
                        View a3 = this.f10046o.mo5391a(i3);
                        if (a3 != null) {
                            C0369np npVar = (C0369np) a3.getLayoutParams();
                            mo5359b(a3, f10019L);
                            cpVarArr = a;
                            i = i9;
                            a3.measure(ViewGroup.getChildMeasureSpec(makeMeasureSpec, mo5375h() + mo5377j() + npVar.leftMargin + npVar.rightMargin + f10019L.left + f10019L.right, npVar.width), ViewGroup.getChildMeasureSpec(makeMeasureSpec2, mo5376i() + mo5378k() + npVar.topMargin + npVar.bottomMargin + f10019L.top + f10019L.bottom, npVar.height));
                            iArr[0] = m8055k(a3);
                            iArr[1] = m8054j(a3);
                            this.f10046o.mo5394a(a3);
                        } else {
                            cpVarArr = a;
                            i = i9;
                        }
                        i8 = this.f10043l != 0 ? this.f10037T[0] : this.f10037T[1];
                    } else {
                        cpVarArr = a;
                        i = i9;
                    }
                } else {
                    cpVarArr = a;
                    i = i9;
                }
                if (i8 >= 0) {
                    i = i8;
                }
            }
            if (i >= 0) {
                i2 = i;
            } else {
                i2 = 0;
            }
            int[] iArr2 = this.f10033P;
            if (iArr2[i7] != i2) {
                iArr2[i7] = i2;
                z2 = true;
            }
            i7++;
            a = cpVarArr;
            i5 = 0;
            i6 = -1;
        }
        return z2;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: nt.a(android.view.View, boolean):void
     arg types: [android.view.View, int]
     candidates:
      nt.a(boolean, int):int
      nt.a(android.content.Context, android.util.AttributeSet):jy
      nt.a(int, jw):void
      nt.a(int, boolean):void
      nt.a(android.view.View, android.graphics.Rect):void
      nt.a(android.view.View, android.view.View):void
      nt.a(android.view.View, ed):void
      nt.a(jp, jp):void
      nt.a(kc, kk):void
      jx.a(android.content.Context, android.util.AttributeSet):jy
      jx.a(int, int):void
      jx.a(int, jw):void
      jx.a(android.view.View, int):void
      jx.a(android.view.View, android.graphics.Rect):void
      jx.a(android.view.View, android.view.View):void
      jx.a(android.view.View, ed):void
      jx.a(android.view.View, kc):void
      jx.a(jp, jp):void
      jx.a(kc, kk):void
      nt.a(android.view.View, boolean):void */
    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo5659a(boolean z, int i) {
        C0364nk nkVar = this.f10022C;
        if (nkVar == null) {
            return i;
        }
        int i2 = this.f10049r;
        int c = i2 != -1 ? nkVar.mo5646c(i2) : -1;
        int g = mo5374g();
        View view = null;
        int i3 = c;
        int i4 = i;
        for (int i5 = 0; i5 < g && i4 != 0; i5++) {
            int i6 = i4 <= 0 ? (g - 1) - i5 : i5;
            View d = mo5368d(i6);
            if (mo5673i(d)) {
                int l = m8056l(i6);
                int c2 = this.f10022C.mo5646c(l);
                if (i3 == -1) {
                    i2 = l;
                    view = d;
                    i3 = c2;
                } else if (c2 == i3 && ((i4 > 0 && l > i2) || (i4 < 0 && l < i2))) {
                    i4 = i4 > 0 ? i4 - 1 : i4 + 1;
                    i2 = l;
                    view = d;
                }
            }
        }
        if (view != null) {
            if (z) {
                if (mo5379l()) {
                    this.f10047p |= 32;
                    view.requestFocus();
                    this.f10047p &= -33;
                }
                this.f10049r = i2;
                this.f10050s = 0;
            } else {
                mo5662a(view, true);
            }
        }
        return i4;
    }

    /* renamed from: b */
    public final void mo5361b(C0275kc kcVar) {
        for (int g = mo5374g() - 1; g >= 0; g--) {
            View d = mo5368d(g);
            mo5355b(g);
            kcVar.mo5394a(d);
        }
    }

    /* renamed from: F */
    private final void m8036F() {
        int i = this.f10047p;
        if ((65600 & i) == 65536) {
            C0364nk nkVar = this.f10022C;
            int i2 = this.f10049r;
            int i3 = (i & 262144) == 0 ? this.f10036S : 0;
            while (true) {
                int i4 = nkVar.f9997g;
                if (i4 < nkVar.f9996f || i4 <= i2) {
                    break;
                }
                if (!nkVar.f9993c) {
                    if (nkVar.f9992b.mo5633b(i4) < i3) {
                        break;
                    }
                } else if (nkVar.f9992b.mo5633b(i4) > i3) {
                    break;
                }
                nkVar.f9992b.mo5630a(nkVar.f9997g);
                nkVar.f9997g--;
            }
            nkVar.mo5647c();
        }
    }

    /* renamed from: G */
    private final void m8037G() {
        int i = this.f10047p;
        if ((65600 & i) == 65536) {
            C0364nk nkVar = this.f10022C;
            int i2 = this.f10049r;
            int i3 = (i & 262144) != 0 ? this.f10036S : 0;
            while (true) {
                int i4 = nkVar.f9997g;
                int i5 = nkVar.f9996f;
                if (i4 < i5 || i5 >= i2) {
                    break;
                }
                int c = nkVar.f9992b.mo5634c(i5);
                if (nkVar.f9993c) {
                    if (nkVar.f9992b.mo5633b(nkVar.f9996f) - c < i3) {
                        break;
                    }
                } else if (nkVar.f9992b.mo5633b(nkVar.f9996f) + c > i3) {
                    break;
                }
                nkVar.f9992b.mo5630a(nkVar.f9996f);
                nkVar.f9996f++;
            }
            nkVar.mo5647c();
        }
    }

    /* renamed from: b */
    private final void m8052b(C0275kc kcVar, C0283kk kkVar) {
        if (!(this.f10046o == null && this.f10044m == null)) {
            Log.e("GridLayoutManager", "Recycler information was not released, bug!");
        }
        this.f10046o = kcVar;
        this.f10044m = kkVar;
        this.f10045n = 0;
        this.f10027I = 0;
    }

    /* renamed from: n */
    private final int m8060n(int i) {
        int i2;
        int i3 = this.f10047p;
        if ((i3 & 64) != 0 || (i3 & 3) == 1 || (i <= 0 ? i >= 0 || this.f10023D.f10113d.mo5726b() || i >= (i2 = this.f10023D.f10113d.f10102d) : this.f10023D.f10113d.mo5727c() || i <= (i2 = this.f10023D.f10113d.f10101c))) {
            i2 = i;
        }
        boolean z = false;
        if (i2 == 0) {
            return 0;
        }
        int i4 = -i2;
        int g = mo5374g();
        if (this.f10043l == 1) {
            for (int i5 = 0; i5 < g; i5++) {
                mo5368d(i5).offsetTopAndBottom(i4);
            }
        } else {
            for (int i6 = 0; i6 < g; i6++) {
                mo5368d(i6).offsetLeftAndRight(i4);
            }
        }
        if ((this.f10047p & 3) != 1) {
            int g2 = mo5374g();
            if ((this.f10047p & 262144) != 0 ? i2 <= 0 : i2 >= 0) {
                m8038H();
            } else {
                m8039I();
            }
            boolean z2 = mo5374g() > g2;
            int g3 = mo5374g();
            if ((262144 & this.f10047p) != 0 ? i2 <= 0 : i2 >= 0) {
                m8037G();
            } else {
                m8036F();
            }
            if (mo5374g() < g3) {
                z = true;
            }
            if (z || z2) {
                m8034D();
            }
            this.f10042k.invalidate();
            mo5680w();
            return i2;
        }
        mo5680w();
        return i2;
    }

    /* renamed from: o */
    private final int m8062o(int i) {
        int i2 = 0;
        if (i == 0) {
            return 0;
        }
        int i3 = -i;
        int g = mo5374g();
        if (this.f10043l == 0) {
            while (i2 < g) {
                mo5368d(i2).offsetTopAndBottom(i3);
                i2++;
            }
        } else {
            while (i2 < g) {
                mo5368d(i2).offsetLeftAndRight(i3);
                i2++;
            }
        }
        this.f10054w += i;
        m8041K();
        this.f10042k.invalidate();
        return i;
    }

    /* renamed from: a */
    public final int mo5327a(int i, C0275kc kcVar, C0283kk kkVar) {
        int i2;
        if ((this.f10047p & 512) == 0 || !m8067z()) {
            return 0;
        }
        m8052b(kcVar, kkVar);
        this.f10047p = (this.f10047p & -4) | 2;
        if (this.f10043l == 0) {
            i2 = m8060n(i);
        } else {
            i2 = m8062o(i);
        }
        m8032B();
        this.f10047p &= -4;
        return i2;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: nt.a(int, boolean):void
     arg types: [int, int]
     candidates:
      nt.a(boolean, int):int
      nt.a(android.content.Context, android.util.AttributeSet):jy
      nt.a(int, jw):void
      nt.a(android.view.View, android.graphics.Rect):void
      nt.a(android.view.View, android.view.View):void
      nt.a(android.view.View, ed):void
      nt.a(android.view.View, boolean):void
      nt.a(jp, jp):void
      nt.a(kc, kk):void
      jx.a(android.content.Context, android.util.AttributeSet):jy
      jx.a(int, int):void
      jx.a(int, jw):void
      jx.a(android.view.View, int):void
      jx.a(android.view.View, android.graphics.Rect):void
      jx.a(android.view.View, android.view.View):void
      jx.a(android.view.View, ed):void
      jx.a(android.view.View, kc):void
      jx.a(jp, jp):void
      jx.a(kc, kk):void
      nt.a(int, boolean):void */
    /* renamed from: a */
    public final void mo5332a(int i) {
        mo5661a(i, false);
    }

    /* renamed from: b */
    public final void mo5664b(int i, boolean z) {
        View c = mo5363c(i);
        boolean z2 = !mo5372e();
        if (z2 && !this.f10042k.isLayoutRequested() && c != null && m8061n(c) == i) {
            this.f10047p |= 32;
            mo5662a(c, z);
            this.f10047p &= -33;
            return;
        }
        int i2 = this.f10047p;
        if ((i2 & 512) == 0 || (i2 & 64) != 0) {
            this.f10049r = i;
            this.f10050s = 0;
            this.f10030M = Integer.MIN_VALUE;
        } else if (!z || this.f10042k.isLayoutRequested()) {
            if (!z2) {
                m8042L();
                this.f10042k.mo872e();
            }
            if (this.f10042k.isLayoutRequested() || c == null || m8061n(c) != i) {
                this.f10049r = i;
                this.f10050s = 0;
                this.f10030M = Integer.MIN_VALUE;
                this.f10047p |= 256;
                mo5331a();
                return;
            }
            this.f10047p |= 32;
            mo5662a(c, z);
            this.f10047p &= -33;
        } else {
            this.f10049r = i;
            this.f10050s = 0;
            this.f10030M = Integer.MIN_VALUE;
            if (m8067z()) {
                C0367nn nnVar = new C0367nn(this);
                nnVar.f9743a = i;
                m8049a(nnVar);
                int i3 = nnVar.f9743a;
                if (i3 != this.f10049r) {
                    this.f10049r = i3;
                    this.f10050s = 0;
                    return;
                }
                return;
            }
            Log.w("GridLayoutManager:" + this.f10042k.getId(), "setSelectionSmooth should not be called before first layout pass");
        }
    }

    /* renamed from: a */
    private final void m8047a(View view, View view2, boolean z) {
        m8048a(view, view2, z, 0, 0);
    }

    /* renamed from: a */
    private final void m8048a(View view, View view2, boolean z, int i, int i2) {
        if ((this.f10047p & 64) == 0) {
            int n = m8061n(view);
            m8051b(view, view2);
            if (n != this.f10049r) {
                this.f10049r = n;
                this.f10050s = 0;
                this.f10030M = 0;
                if ((this.f10047p & 3) != 1) {
                    mo5676s();
                }
                if (this.f10042k.mo5625s()) {
                    this.f10042k.invalidate();
                }
            }
            if (view != null) {
                if (!view.hasFocus() && this.f10042k.hasFocus()) {
                    view.requestFocus();
                }
                if ((this.f10047p & 131072) != 0 || !z) {
                    if (mo5663a(view, view2, f10018F) || i != 0 || i2 != 0) {
                        int[] iArr = f10018F;
                        int i3 = iArr[0] + i;
                        int i4 = iArr[1] + i2;
                        if ((this.f10047p & 3) == 1) {
                            m8060n(i3);
                            m8062o(i4);
                            return;
                        }
                        int i5 = this.f10043l;
                        int i6 = i5 == 0 ? i4 : i3;
                        if (i5 == 0) {
                            i4 = i3;
                        }
                        if (!z) {
                            this.f10042k.scrollBy(i4, i6);
                            mo5677t();
                            return;
                        }
                        this.f10042k.mo873e(i4, i6);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo5662a(View view, boolean z) {
        m8047a(view, view != null ? view.findFocus() : null, z);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: nt.a(android.view.View, android.view.View, boolean, int, int):void
     arg types: [android.view.View, android.view.View, int, int, int]
     candidates:
      nt.a(int, android.view.View, int, int, int):void
      nt.a(android.view.View, android.view.View, boolean, int, int):void */
    /* renamed from: a */
    private final void m8046a(View view, int i, int i2) {
        m8048a(view, view != null ? view.findFocus() : null, false, i, i2);
    }

    /* renamed from: b */
    public final int mo5352b(int i, C0275kc kcVar, C0283kk kkVar) {
        int i2;
        if ((this.f10047p & 512) == 0 || !m8067z()) {
            return 0;
        }
        this.f10047p = (this.f10047p & -4) | 2;
        m8052b(kcVar, kkVar);
        if (this.f10043l == 1) {
            i2 = m8060n(i);
        } else {
            i2 = m8062o(i);
        }
        m8032B();
        this.f10047p &= -4;
        return i2;
    }

    /* renamed from: g */
    public final void mo5669g(int i) {
        if (i >= 0) {
            this.f10035R = i;
            return;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: f */
    public final void mo5667f(int i) {
        C0254ji jiVar;
        if (i != 0) {
            i = 1;
        }
        this.f10043l = i;
        if (i != 0) {
            jiVar = new C0253jh(this);
        } else {
            jiVar = C0254ji.m7619a(this);
        }
        this.f10026H = jiVar;
        C0406oz ozVar = this.f10023D;
        ozVar.f10110a = i;
        if (i == 0) {
            ozVar.f10113d = ozVar.f10112c;
            ozVar.f10114e = ozVar.f10111b;
        } else {
            ozVar.f10113d = ozVar.f10111b;
            ozVar.f10114e = ozVar.f10112c;
        }
        C0376nw nwVar = this.f10024E;
        nwVar.f10059a = i;
        if (i == 0) {
            nwVar.f10062d = nwVar.f10061c;
        } else {
            nwVar.f10062d = nwVar.f10060b;
        }
        this.f10047p |= 256;
    }

    /* renamed from: h */
    public final void mo5670h(int i) {
        if (i >= 0 || i == -2) {
            this.f10031N = i;
            return;
        }
        throw new IllegalArgumentException("Invalid row height: " + i);
    }

    /* renamed from: a */
    public final void mo5661a(int i, boolean z) {
        if (this.f10049r != i && i != -1) {
            mo5664b(i, z);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: nt.a(int, boolean):void
     arg types: [int, int]
     candidates:
      nt.a(boolean, int):int
      nt.a(android.content.Context, android.util.AttributeSet):jy
      nt.a(int, jw):void
      nt.a(android.view.View, android.graphics.Rect):void
      nt.a(android.view.View, android.view.View):void
      nt.a(android.view.View, ed):void
      nt.a(android.view.View, boolean):void
      nt.a(jp, jp):void
      nt.a(kc, kk):void
      jx.a(android.content.Context, android.util.AttributeSet):jy
      jx.a(int, int):void
      jx.a(int, jw):void
      jx.a(android.view.View, int):void
      jx.a(android.view.View, android.graphics.Rect):void
      jx.a(android.view.View, android.view.View):void
      jx.a(android.view.View, ed):void
      jx.a(android.view.View, kc):void
      jx.a(jp, jp):void
      jx.a(kc, kk):void
      nt.a(int, boolean):void */
    /* renamed from: k */
    public final void mo5675k(int i) {
        mo5661a(i, false);
    }

    /* renamed from: L */
    private final void m8042L() {
        C0368no noVar = this.f10051t;
        if (noVar != null) {
            noVar.f10003i = true;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: nt.a(int, boolean):void
     arg types: [int, int]
     candidates:
      nt.a(boolean, int):int
      nt.a(android.content.Context, android.util.AttributeSet):jy
      nt.a(int, jw):void
      nt.a(android.view.View, android.graphics.Rect):void
      nt.a(android.view.View, android.view.View):void
      nt.a(android.view.View, ed):void
      nt.a(android.view.View, boolean):void
      nt.a(jp, jp):void
      nt.a(kc, kk):void
      jx.a(android.content.Context, android.util.AttributeSet):jy
      jx.a(int, int):void
      jx.a(int, jw):void
      jx.a(android.view.View, int):void
      jx.a(android.view.View, android.graphics.Rect):void
      jx.a(android.view.View, android.view.View):void
      jx.a(android.view.View, ed):void
      jx.a(android.view.View, kc):void
      jx.a(jp, jp):void
      jx.a(kc, kk):void
      nt.a(int, boolean):void */
    /* renamed from: e */
    public final void mo5371e(int i) {
        mo5661a(i, true);
    }

    /* renamed from: a */
    private final void m8049a(C0282kj kjVar) {
        m8042L();
        C0282kj kjVar2 = this.f9710c;
        if (!(kjVar2 == null || kjVar == kjVar2 || !kjVar2.f9747e)) {
            kjVar2.mo5411a();
        }
        this.f9710c = kjVar;
        C0282kj kjVar3 = this.f9710c;
        RecyclerView recyclerView = this.f9709b;
        recyclerView.f1021A.mo5425b();
        if (kjVar3.f9749g) {
            Log.w("RecyclerView", "An instance of " + kjVar3.getClass().getSimpleName() + " was started more than once. Each instance of" + kjVar3.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
        }
        kjVar3.f9744b = recyclerView;
        kjVar3.f9745c = this;
        int i = kjVar3.f9743a;
        if (i != -1) {
            kjVar3.f9744b.f1024D.f9759a = i;
            kjVar3.f9747e = true;
            kjVar3.f9746d = true;
            kjVar3.f9748f = kjVar3.mo5416b(kjVar3.f9743a);
            kjVar3.f9744b.f1021A.mo5423a();
            kjVar3.f9749g = true;
            if (!kjVar.f9747e) {
                this.f10051t = null;
                this.f10052u = null;
                return;
            }
            C0368no noVar = (C0368no) kjVar;
            this.f10051t = noVar;
            if (noVar instanceof C0370nq) {
                this.f10052u = (C0370nq) noVar;
            } else {
                this.f10052u = null;
            }
        } else {
            throw new IllegalArgumentException("Invalid target position");
        }
    }

    /* renamed from: u */
    public final void mo5678u() {
        int g = mo5374g();
        for (int i = 0; i < g; i++) {
            m8059m(mo5368d(i));
        }
    }

    /* renamed from: m */
    private final void m8059m(View view) {
        C0369np npVar = (C0369np) view.getLayoutParams();
        C0378ny nyVar = npVar.f10012l;
        if (nyVar == null) {
            npVar.f10009i = this.f10024E.f10061c.mo5688a(view);
            npVar.f10010j = this.f10024E.f10060b.mo5688a(view);
            return;
        }
        int i = this.f10043l;
        C0377nx[] nxVarArr = nyVar.f10066a;
        int[] iArr = npVar.f10011k;
        if (iArr == null || iArr.length != 1) {
            npVar.f10011k = new int[1];
        }
        npVar.f10011k[0] = C0379nz.m8128a(view, nxVarArr[0], i);
        if (i != 0) {
            npVar.f10010j = npVar.f10011k[0];
        } else {
            npVar.f10009i = npVar.f10011k[0];
        }
        if (this.f10043l != 0) {
            npVar.f10009i = this.f10024E.f10061c.mo5688a(view);
        } else {
            npVar.f10010j = this.f10024E.f10060b.mo5688a(view);
        }
    }

    /* renamed from: J */
    private final void m8040J() {
        if (mo5374g() > 0) {
            this.f10045n = this.f10022C.f9996f - ((C0369np) mo5368d(0).getLayoutParams()).mo5388c();
        } else {
            this.f10045n = 0;
        }
    }

    /* renamed from: D */
    private final void m8034D() {
        int i = this.f10047p & -1025;
        int i2 = 0;
        if (m8050a(false)) {
            i2 = 1024;
        }
        int i3 = i | i2;
        this.f10047p = i3;
        if ((i3 & 1024) != 0) {
            m8035E();
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: nk.a(boolean, int[]):int
     arg types: [int, int[]]
     candidates:
      nk.a(int, boolean):boolean
      nk.a(int, int):cp[]
      nk.a(boolean, int[]):int */
    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public final void mo5680w() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int length;
        if (this.f10044m.mo5420a() != 0) {
            if ((this.f10047p & 262144) != 0) {
                C0364nk nkVar = this.f10022C;
                i3 = nkVar.f9996f;
                i4 = nkVar.f9997g;
                i = this.f10044m.mo5420a() - 1;
                i2 = 0;
            } else {
                i3 = this.f10022C.f9997g;
                i = 0;
                int i7 = this.f10022C.f9996f;
                i2 = this.f10044m.mo5420a() - 1;
                i4 = i7;
            }
            if (i3 >= 0 && i4 >= 0) {
                if (i3 == i2 || !this.f10023D.f10113d.mo5727c() || i4 == i || !this.f10023D.f10113d.mo5726b()) {
                    int i8 = Integer.MAX_VALUE;
                    if (i3 == i2) {
                        i8 = this.f10022C.mo5643b(true, f10018F);
                        View c = mo5363c(f10018F[1]);
                        i5 = m8057l(c);
                        int[] iArr = ((C0369np) c.getLayoutParams()).f10011k;
                        if (iArr != null && (length = iArr.length) > 0) {
                            i5 += iArr[length - 1] - iArr[0];
                        }
                    } else {
                        i5 = Integer.MAX_VALUE;
                    }
                    int i9 = Integer.MIN_VALUE;
                    if (i4 == i) {
                        i9 = this.f10022C.mo5636a(false, f10018F);
                        i6 = m8057l(mo5363c(f10018F[1]));
                    } else {
                        i6 = Integer.MIN_VALUE;
                    }
                    this.f10023D.f10113d.mo5725a(i9, i8, i6, i5);
                }
            }
        }
    }

    /* renamed from: K */
    private final void m8041K() {
        C0405oy oyVar = this.f10023D.f10114e;
        int i = oyVar.f10107i - this.f10054w;
        int C = m8033C() + i;
        oyVar.mo5725a(i, C, i, C);
    }
}
