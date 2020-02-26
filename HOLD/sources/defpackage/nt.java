package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcelable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;

/* renamed from: nt  reason: default package */
/* compiled from: PG */
public final class nt extends jx {
    public static final int[] F = new int[2];
    private static final Rect L = new Rect();
    public int A = 8388659;
    public int B;
    public nk C;
    public final oz D = new oz();
    public final nw E = new nw();
    private final int G = 10;
    private ji H = ji.a(this);
    private int I;
    private final SparseIntArray J = new SparseIntArray();
    private int[] K;
    private int M = 0;
    private int N;
    private int O;
    private int[] P;
    private int Q;
    private int R = 1;
    private int S;
    private final int[] T = new int[2];
    private nh U;
    private final Runnable V = new nl(this);
    private final nj W = new nm(this);
    public final float j = 1.0f;
    public final nf k;
    public int l = 0;
    public kk m;
    public int n;
    public kc o;
    public int p = 221696;
    public ArrayList q = null;
    public int r = -1;
    public int s = 0;
    public no t;
    public nq u;
    public final int v;
    public int w;
    public int x;
    public int y;
    public int z;

    private final int q(int i) {
        if (this.l != 0) {
            if (i == 17) {
                return (this.p & 524288) != 0 ? 3 : 2;
            }
            if (i != 33) {
                return i != 66 ? i != 130 ? 17 : 1 : (this.p & 524288) != 0 ? 2 : 3;
            }
            return 0;
        } else if (i == 17) {
            return (this.p & 262144) != 0 ? 1 : 0;
        } else {
            if (i != 33) {
                return i != 66 ? i != 130 ? 17 : 3 : (this.p & 262144) != 0 ? 0 : 1;
            }
            return 2;
        }
    }

    private final boolean z() {
        return this.C != null;
    }

    public final boolean c() {
        return this.l == 0 || this.B > 1;
    }

    public final boolean d() {
        return this.l == 1 || this.B > 1;
    }

    public final boolean p() {
        return false;
    }

    public final void r() {
    }

    /* access modifiers changed from: package-private */
    public final boolean v() {
        return (this.p & 64) != 0;
    }

    public nt(nf nfVar) {
        this.k = nfVar;
        this.v = -1;
        q();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: nk.a(int, boolean):boolean
     arg types: [int, int]
     candidates:
      nk.a(boolean, int[]):int
      nk.a(int, int):cp[]
      nk.a(int, boolean):boolean */
    private final void H() {
        this.C.a((this.p & 262144) == 0 ? this.S + this.I : -this.I, false);
    }

    /* access modifiers changed from: package-private */
    public final boolean i(View view) {
        if (view.getVisibility() == 0) {
            return !l() || view.hasFocusable();
        }
        return false;
    }

    public final void a(int i, int i2, kk kkVar, jw jwVar) {
        try {
            b((kc) null, kkVar);
            if (this.l != 0) {
                i = i2;
            }
            if (g() != 0) {
                if (i != 0) {
                    this.C.a(i >= 0 ? this.S : 0, i, jwVar);
                }
            }
        } finally {
            B();
        }
    }

    public final void a(int i, jw jwVar) {
        int i2 = this.k.N;
        if (i != 0 && i2 != 0) {
            int max = Math.max(0, Math.min(this.r - ((i2 - 1) >> 1), i - i2));
            int i3 = max;
            while (i3 < i && i3 < max + i2) {
                jwVar.a(i3, 0);
                i3++;
            }
        }
    }

    private final void M() {
        this.C = null;
        this.P = null;
        this.p &= -1025;
    }

    /* access modifiers changed from: package-private */
    public final void s() {
        if (A()) {
            int i = this.r;
            View c = i != -1 ? c(i) : null;
            if (c != null) {
                a(this.k, this.k.a(c), this.r);
            } else {
                a(this.k, (km) null, -1);
            }
            if ((this.p & 3) != 1 && !this.k.isLayoutRequested()) {
                int g = g();
                int i2 = 0;
                while (i2 < g) {
                    if (!d(i2).isLayoutRequested()) {
                        i2++;
                    } else {
                        E();
                        return;
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void t() {
        View view;
        if (A()) {
            int i = this.r;
            if (i != -1) {
                view = c(i);
            } else {
                view = null;
            }
            if (view != null) {
                this.k.a(view);
                N();
                return;
            }
            N();
        }
    }

    private final void a(RecyclerView recyclerView, km kmVar, int i) {
        ArrayList arrayList = this.q;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((boc) this.q.get(size)).a(recyclerView, kmVar, i);
            }
        }
    }

    private final void N() {
        ArrayList arrayList = this.q;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                boc boc = (boc) this.q.get(size);
            }
        }
    }

    private final void E() {
        dx.a(this.k, this.V);
    }

    public final jy b() {
        return new np();
    }

    public final jy a(Context context, AttributeSet attributeSet) {
        return new np(context, attributeSet);
    }

    public final jy a(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof np) {
            return new np((np) layoutParams);
        }
        if (layoutParams instanceof jy) {
            return new np((jy) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new np((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new np(layoutParams);
    }

    private final int l(int i) {
        return n(d(i));
    }

    private static final int n(View view) {
        np npVar;
        if (view == null || (npVar = (np) view.getLayoutParams()) == null || npVar.a()) {
            return -1;
        }
        return npVar.d();
    }

    public final boolean a(View view, View view2, int[] iArr) {
        int a = this.D.d.a(l(view));
        if (view2 != null) {
            b(view, view2);
        }
        int a2 = this.D.e.a(this.l == 0 ? p(view) : o(view));
        if (a == 0 && a2 == 0) {
            iArr[0] = 0;
            iArr[1] = 0;
            return false;
        }
        iArr[0] = a;
        iArr[1] = a2;
        return true;
    }

    public final int d(View view) {
        return (view.getBottom() + ((jy) view.getLayoutParams()).b.bottom) - ((np) view.getLayoutParams()).h;
    }

    public final void a(View view, Rect rect) {
        RecyclerView.a(view, rect);
        np npVar = (np) view.getLayoutParams();
        rect.left += npVar.e;
        rect.top += npVar.f;
        rect.right -= npVar.g;
        rect.bottom -= npVar.h;
    }

    public final int a(View view) {
        return (view.getLeft() - ((jy) view.getLayoutParams()).b.left) + ((np) view.getLayoutParams()).e;
    }

    static final int j(View view) {
        np npVar = (np) view.getLayoutParams();
        Rect rect = ((jy) view.getLayoutParams()).b;
        return view.getMeasuredHeight() + rect.top + rect.bottom + npVar.topMargin + npVar.bottomMargin;
    }

    static final int k(View view) {
        np npVar = (np) view.getLayoutParams();
        Rect rect = ((jy) view.getLayoutParams()).b;
        return view.getMeasuredWidth() + rect.left + rect.right + npVar.leftMargin + npVar.rightMargin;
    }

    public final int c(View view) {
        return (view.getRight() + ((jy) view.getLayoutParams()).b.right) - ((np) view.getLayoutParams()).g;
    }

    public final int b(View view) {
        return (view.getTop() - ((jy) view.getLayoutParams()).b.top) + ((np) view.getLayoutParams()).f;
    }

    private final int m(int i) {
        int i2 = this.O;
        if (i2 != 0) {
            return i2;
        }
        int[] iArr = this.P;
        if (iArr != null) {
            return iArr[i];
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    public final int j(int i) {
        int i2 = 0;
        if ((this.p & 524288) != 0) {
            for (int i3 = this.B - 1; i3 > i; i3--) {
                i2 += m(i3) + this.z;
            }
            return i2;
        }
        int i4 = 0;
        while (i2 < i) {
            i4 += m(i2) + this.z;
            i2++;
        }
        return i4;
    }

    private final int C() {
        int i = (this.p & 524288) == 0 ? this.B - 1 : 0;
        return j(i) + m(i);
    }

    static final void b(View view, View view2) {
        if (view != null && view2 != null) {
            np npVar = (np) view.getLayoutParams();
        }
    }

    private final int l(View view) {
        return this.l == 0 ? o(view) : p(view);
    }

    private static final int o(View view) {
        np npVar = (np) view.getLayoutParams();
        return view.getLeft() + npVar.e + npVar.i;
    }

    private static final int p(View view) {
        np npVar = (np) view.getLayoutParams();
        return view.getTop() + npVar.f + npVar.j;
    }

    /* access modifiers changed from: protected */
    public final View i(int i) {
        Object obj;
        nh nhVar;
        ng a;
        View a2 = this.o.a(i);
        np npVar = (np) a2.getLayoutParams();
        km a3 = this.k.a(a2);
        if (!(a3 instanceof ng)) {
            obj = null;
        } else {
            obj = ((ng) a3).a();
        }
        if (!(obj != null || (nhVar = this.U) == null || (a = nhVar.a()) == null)) {
            obj = a.a();
        }
        npVar.l = (ny) obj;
        return a2;
    }

    /* access modifiers changed from: package-private */
    public final int f(View view) {
        return this.H.a(view);
    }

    /* access modifiers changed from: package-private */
    public final int e(View view) {
        return this.H.b(view);
    }

    /* access modifiers changed from: package-private */
    public final int g(View view) {
        a(view, L);
        return this.l != 0 ? L.height() : L.width();
    }

    /* access modifiers changed from: package-private */
    public final boolean y() {
        return m() == 0 || this.k.e(0) != null;
    }

    /* access modifiers changed from: package-private */
    public final boolean x() {
        int m2 = m();
        return m2 == 0 || this.k.e(m2 + -1) != null;
    }

    private final boolean A() {
        ArrayList arrayList = this.q;
        return arrayList != null && arrayList.size() > 0;
    }

    private final boolean p(int i) {
        km e = this.k.e(i);
        if (e == null || e.a.getLeft() < 0 || e.a.getRight() > this.k.getWidth() || e.a.getTop() < 0 || e.a.getBottom() > this.k.getHeight()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public final void a(int i, View view, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        if (this.l != 0) {
            i5 = k(view);
        } else {
            i5 = j(view);
        }
        int i8 = this.O;
        if (i8 > 0) {
            i5 = Math.min(i5, i8);
        }
        int i9 = this.A;
        int i10 = i9 & 112;
        if ((this.p & 786432) != 0) {
            i6 = Gravity.getAbsoluteGravity(i9 & 8388615, 1);
        } else {
            i6 = i9 & 7;
        }
        int i11 = this.l;
        if (!((i11 == 0 && i10 == 48) || (i11 == 1 && i6 == 3))) {
            if ((i11 == 0 && i10 == 80) || (i11 == 1 && i6 == 5)) {
                i4 += m(i) - i5;
            } else if ((i11 == 0 && i10 == 16) || (i11 == 1 && i6 == 1)) {
                i4 += (m(i) - i5) / 2;
            }
        }
        if (this.l != 0) {
            i7 = i4 + i5;
            int i12 = i4;
            i4 = i2;
            i2 = i12;
        } else {
            int i13 = i3;
            i3 = i4 + i5;
            i7 = i13;
        }
        np npVar = (np) view.getLayoutParams();
        jy jyVar = (jy) view.getLayoutParams();
        Rect rect = jyVar.b;
        view.layout(rect.left + i2 + jyVar.leftMargin, rect.top + i4 + jyVar.topMargin, (i7 - rect.right) - jyVar.rightMargin, (i3 - rect.bottom) - jyVar.bottomMargin);
        RecyclerView.a(view, L);
        int i14 = L.left;
        int i15 = L.top;
        int i16 = L.right;
        int i17 = L.bottom;
        npVar.e = i2 - i14;
        npVar.f = i4 - i15;
        npVar.g = i16 - i7;
        npVar.h = i17 - i3;
        m(view);
    }

    private final void B() {
        this.o = null;
        this.m = null;
        this.n = 0;
        this.I = 0;
    }

    /* access modifiers changed from: package-private */
    public final void h(View view) {
        int i;
        int i2;
        int i3;
        np npVar = (np) view.getLayoutParams();
        b(view, L);
        int i4 = npVar.leftMargin + npVar.rightMargin + L.left + L.right;
        int i5 = npVar.topMargin + npVar.bottomMargin + L.top + L.bottom;
        if (this.N == -2) {
            i = View.MeasureSpec.makeMeasureSpec(0, 0);
        } else {
            i = View.MeasureSpec.makeMeasureSpec(this.O, 1073741824);
        }
        if (this.l != 0) {
            i2 = ViewGroup.getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(0, 0), i5, npVar.height);
            i3 = ViewGroup.getChildMeasureSpec(i, i4, npVar.width);
        } else {
            int childMeasureSpec = ViewGroup.getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(0, 0), i4, npVar.width);
            i2 = ViewGroup.getChildMeasureSpec(i, i5, npVar.height);
            i3 = childMeasureSpec;
        }
        view.measure(i3, i2);
    }

    public final void a(jp jpVar, jp jpVar2) {
        if (jpVar != null) {
            M();
            this.r = -1;
            this.M = 0;
        }
        if (jpVar2 instanceof nh) {
            this.U = (nh) jpVar2;
        } else {
            this.U = null;
        }
    }

    public final void a(RecyclerView recyclerView, ArrayList arrayList, int i, int i2) {
        int i3;
        int i4;
        int i5;
        View view;
        ArrayList arrayList2 = arrayList;
        int i6 = i;
        int i7 = i2;
        if ((this.p & 32768) != 0) {
            return;
        }
        if (!recyclerView.hasFocus()) {
            int size = arrayList.size();
            View c = c(this.r);
            if (c != null) {
                c.addFocusables(arrayList2, i6, i7);
            }
            if (arrayList.size() == size && recyclerView.isFocusable()) {
                arrayList2.add(recyclerView);
            }
        } else if (this.u == null) {
            int q2 = q(i6);
            View findFocus = recyclerView.findFocus();
            nf nfVar = this.k;
            View view2 = null;
            if (nfVar != null && findFocus != nfVar) {
                RecyclerView recyclerView2 = this.b;
                if (recyclerView2 == null || (view = recyclerView2.b(findFocus)) == null || this.a.c(view)) {
                    view = null;
                }
                if (view != null) {
                    int g = g();
                    i3 = 0;
                    while (true) {
                        if (i3 < g) {
                            if (d(i3) == view) {
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
            int l2 = l(i3);
            if (l2 != -1) {
                view2 = c(l2);
            }
            if (view2 != null) {
                view2.addFocusables(arrayList2, i6, i7);
            }
            if (this.C != null && g() != 0) {
                if (!(q2 == 3 || q2 == 2) || this.C.e > 1) {
                    nk nkVar = this.C;
                    if (nkVar == null || view2 == null) {
                        i4 = -1;
                    } else {
                        i4 = nkVar.d(l2).a;
                    }
                    int size2 = arrayList.size();
                    int i8 = (q2 == 1 || q2 == 3) ? 1 : -1;
                    int g2 = i8 > 0 ? g() - 1 : 0;
                    int g3 = i3 != -1 ? i3 + i8 : i8 > 0 ? 0 : -1 + g();
                    while (true) {
                        if (i8 <= 0) {
                            if (g3 < g2) {
                                return;
                            }
                        } else if (g3 > g2) {
                            return;
                        }
                        View d = d(g3);
                        if (d.getVisibility() == 0 && d.hasFocusable()) {
                            if (view2 != null) {
                                int l3 = l(g3);
                                ni d2 = this.C.d(l3);
                                if (d2 != null) {
                                    if (q2 == 1) {
                                        if (d2.a == i4 && l3 > l2) {
                                            d.addFocusables(arrayList2, i6, i7);
                                            if (arrayList.size() > size2) {
                                                return;
                                            }
                                        }
                                    } else if (q2 == 0) {
                                        if (d2.a == i4 && l3 < l2) {
                                            d.addFocusables(arrayList2, i6, i7);
                                            if (arrayList.size() > size2) {
                                                return;
                                            }
                                        }
                                    } else if (q2 == 3) {
                                        int i9 = d2.a;
                                        if (i9 != i4) {
                                            if (i9 >= i4) {
                                                d.addFocusables(arrayList2, i6, i7);
                                            } else {
                                                return;
                                            }
                                        }
                                    } else if (q2 == 2 && (i5 = d2.a) != i4) {
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

    public final void a(kc kcVar, kk kkVar, ed edVar) {
        int i;
        nk nkVar;
        nk nkVar2;
        ea eaVar;
        ea eaVar2;
        b(kcVar, kkVar);
        int a = kkVar.a();
        int i2 = this.p & 262144;
        int i3 = 1;
        if (a > 1 && !p(0)) {
            int i4 = Build.VERSION.SDK_INT;
            if (this.l != 0) {
                edVar.a(ea.c);
            } else {
                if (i2 == 0) {
                    eaVar2 = ea.d;
                } else {
                    eaVar2 = ea.f;
                }
                edVar.a(eaVar2);
            }
            edVar.a();
        }
        if (a > 1 && !p(a - 1)) {
            int i5 = Build.VERSION.SDK_INT;
            if (this.l != 0) {
                edVar.a(ea.e);
            } else {
                if (i2 == 0) {
                    eaVar = ea.f;
                } else {
                    eaVar = ea.d;
                }
                edVar.a(eaVar);
            }
            edVar.a();
        }
        if (this.l != 0 || (nkVar2 = this.C) == null) {
            RecyclerView recyclerView = this.b;
            i = (recyclerView == null || recyclerView.g == null || !d()) ? 1 : this.b.g.a();
        } else {
            i = nkVar2.e;
        }
        if (this.l != 1 || (nkVar = this.C) == null) {
            RecyclerView recyclerView2 = this.b;
            if (!(recyclerView2 == null || recyclerView2.g == null || !c())) {
                i3 = this.b.g.a();
            }
        } else {
            i3 = nkVar.e;
        }
        int i6 = Build.VERSION.SDK_INT;
        eb ebVar = new eb(AccessibilityNodeInfo.CollectionInfo.obtain(i, i3, false, 0));
        int i7 = Build.VERSION.SDK_INT;
        edVar.a.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) ebVar.a);
        B();
    }

    public final void a(View view, ed edVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (this.C != null && (layoutParams instanceof np)) {
            int d = ((np) layoutParams).d();
            int c = d >= 0 ? this.C.c(d) : -1;
            if (c >= 0) {
                int i = d / this.C.e;
                if (this.l == 0) {
                    edVar.a(ec.a(c, 1, i, 1, false, false));
                } else {
                    edVar.a(ec.a(i, 1, c, 1, false, false));
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:65:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00dc A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View c(android.view.View r8, int r9) {
        /*
            r7 = this;
            int r0 = r7.p
            r1 = 32768(0x8000, float:4.5918E-41)
            r0 = r0 & r1
            if (r0 != 0) goto L_0x00de
            android.view.FocusFinder r0 = android.view.FocusFinder.getInstance()
            r1 = 0
            r2 = 2
            r3 = 1
            if (r9 == r2) goto L_0x001a
            if (r9 == r3) goto L_0x001a
            nf r4 = r7.k
            android.view.View r0 = r0.findNextFocus(r4, r8, r9)
            goto L_0x0056
        L_0x001a:
            boolean r4 = r7.d()
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
            nf r5 = r7.k
            android.view.View r4 = r0.findNextFocus(r5, r8, r4)
        L_0x0031:
            boolean r5 = r7.c()
            if (r5 == 0) goto L_0x0055
            int r4 = r7.f()
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
            nf r5 = r7.k
            android.view.View r0 = r0.findNextFocus(r5, r8, r4)
            goto L_0x0056
        L_0x0055:
            r0 = r4
        L_0x0056:
            if (r0 != 0) goto L_0x00dd
            nf r4 = r7.k
            int r4 = r4.getDescendantFocusability()
            r5 = 393216(0x60000, float:5.51013E-40)
            if (r4 != r5) goto L_0x006d
            nf r0 = r7.k
            android.view.ViewParent r0 = r0.getParent()
            android.view.View r8 = r0.focusSearch(r8, r9)
            return r8
        L_0x006d:
            int r4 = r7.q(r9)
            nf r5 = r7.k
            int r5 = r5.y
            r6 = 131072(0x20000, float:1.83671E-40)
            if (r4 == r3) goto L_0x00ad
            if (r4 == 0) goto L_0x0093
            r1 = 3
            if (r4 == r1) goto L_0x008a
            if (r4 == r2) goto L_0x0081
            goto L_0x00c8
        L_0x0081:
            if (r5 != 0) goto L_0x0092
            int r1 = r7.p
            r1 = r1 & 8192(0x2000, float:1.14794E-41)
            if (r1 != 0) goto L_0x00c8
            goto L_0x0092
        L_0x008a:
            if (r5 != 0) goto L_0x0092
            int r1 = r7.p
            r1 = r1 & 16384(0x4000, float:2.2959E-41)
            if (r1 != 0) goto L_0x00c8
        L_0x0092:
            goto L_0x00c7
        L_0x0093:
            if (r5 != 0) goto L_0x009c
            int r2 = r7.p
            r2 = r2 & 2048(0x800, float:2.87E-42)
            if (r2 == 0) goto L_0x009c
            goto L_0x009d
        L_0x009c:
            r0 = r8
        L_0x009d:
            int r2 = r7.p
            r2 = r2 & r6
            if (r2 == 0) goto L_0x00c8
            boolean r2 = r7.y()
            if (r2 != 0) goto L_0x00c8
            r7.b(r1)
            goto L_0x00c7
        L_0x00ad:
            if (r5 != 0) goto L_0x00b6
            int r1 = r7.p
            r1 = r1 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L_0x00b6
            goto L_0x00b7
        L_0x00b6:
            r0 = r8
        L_0x00b7:
            int r1 = r7.p
            r1 = r1 & r6
            if (r1 == 0) goto L_0x00c8
            boolean r1 = r7.x()
            if (r1 != 0) goto L_0x00c8
            r7.b(r3)
        L_0x00c7:
            r0 = r8
        L_0x00c8:
            if (r0 != 0) goto L_0x00dc
            nf r0 = r7.k
            android.view.ViewParent r0 = r0.getParent()
            android.view.View r9 = r0.focusSearch(r8, r9)
            if (r9 != 0) goto L_0x00db
            if (r8 != 0) goto L_0x00da
            nf r8 = r7.k
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nt.c(android.view.View, int):android.view.View");
    }

    public final void b(int i, int i2) {
        nk nkVar;
        int i3;
        int i4 = this.r;
        if (i4 != -1 && (nkVar = this.C) != null && nkVar.f >= 0 && (i3 = this.M) != Integer.MIN_VALUE && i <= i4 + i3) {
            this.M = i3 + i2;
        }
    }

    public final void o() {
        this.M = 0;
    }

    public final void c(int i, int i2) {
        int i3;
        int i4 = this.r;
        if (i4 != -1 && (i3 = this.M) != Integer.MIN_VALUE) {
            int i5 = i4 + i3;
            if (i <= i5 && i5 < i + 1) {
                this.M = i3 + (i2 - i);
            } else if (i < i5 && i2 > i5 - 1) {
                this.M = i3 - 1;
            } else if (i > i5 && i2 < i5) {
                this.M = i3 + 1;
            }
        }
    }

    public final void d(int i, int i2) {
        nk nkVar;
        int i3;
        int i4;
        int i5 = this.r;
        if (i5 != -1 && (nkVar = this.C) != null && nkVar.f >= 0 && (i3 = this.M) != Integer.MIN_VALUE && i <= (i4 = i5 + i3)) {
            if (i + i2 > i4) {
                this.r = i5 + i3 + (i - i4);
                this.M = Integer.MIN_VALUE;
                return;
            }
            this.M = i3 - i2;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: nj.a(int, boolean, java.lang.Object[], boolean):int
     arg types: [int, int, java.lang.Object[], int]
     candidates:
      nj.a(java.lang.Object, int, int, int):void
      nj.a(int, boolean, java.lang.Object[], boolean):int */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0286, code lost:
        r0 = r6.C.g;
        r4 = r9 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x028d, code lost:
        if (r4 < r7) goto L_0x029b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x028f, code lost:
        a(d(r4), r6.o);
        r4 = r4 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x029b, code lost:
        r6.C.b(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x02a5, code lost:
        if ((r6.p & 65536) != 0) goto L_0x02b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x02ad, code lost:
        if (r6.C.b() == false) goto L_0x02d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x02b3, code lost:
        if (r6.C.g < r0) goto L_0x02a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x02b6, code lost:
        H();
        r1 = r6.r;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x02bb, code lost:
        if (r1 < 0) goto L_0x02d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x02bd, code lost:
        if (r1 > r0) goto L_0x02d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x02bf, code lost:
        r0 = r6.C;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x02c5, code lost:
        if (r0.g >= r6.r) goto L_0x02d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x02c7, code lost:
        r0.b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x02fb, code lost:
        if (((r1 & 262144) != 0) != r2.c) goto L_0x02fd;
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
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.kc r23, defpackage.kk r24) {
        /*
            r22 = this;
            r6 = r22
            r7 = r24
            int r0 = r6.B
            if (r0 == 0) goto L_0x061e
            int r0 = r24.a()
            if (r0 < 0) goto L_0x061e
            int r0 = r6.p
            r0 = r0 & 64
            if (r0 != 0) goto L_0x0015
            goto L_0x0022
        L_0x0015:
            int r0 = r22.g()
            if (r0 <= 0) goto L_0x0022
            int r0 = r6.p
            r0 = r0 | 128(0x80, float:1.794E-43)
            r6.p = r0
            return
        L_0x0022:
            int r0 = r6.p
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x0617
            r0 = r0 & -4
            r8 = 1
            r0 = r0 | r8
            r6.p = r0
            r22.b(r23, r24)
            boolean r0 = r7.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r9 = 0
            if (r0 == 0) goto L_0x00d2
            r22.J()
            int r0 = r22.g()
            nk r3 = r6.C
            if (r3 != 0) goto L_0x0045
            goto L_0x00c8
        L_0x0045:
            if (r0 <= 0) goto L_0x00c8
            nf r3 = r6.k
            android.view.View r4 = r6.d(r9)
            km r3 = r3.a(r4)
            int r3 = r3.d
            nf r4 = r6.k
            int r5 = r0 + -1
            android.view.View r5 = r6.d(r5)
            km r4 = r4.a(r5)
            int r4 = r4.d
            r1 = 2147483647(0x7fffffff, float:NaN)
        L_0x0064:
            if (r9 >= r0) goto L_0x00bd
            android.view.View r5 = r6.d(r9)
            android.view.ViewGroup$LayoutParams r7 = r5.getLayoutParams()
            np r7 = (defpackage.np) r7
            nf r8 = r6.k
            int r8 = r8.d(r5)
            boolean r10 = r7.b()
            if (r10 != 0) goto L_0x00a9
            boolean r10 = r7.a()
            if (r10 != 0) goto L_0x00a9
            boolean r10 = r5.isLayoutRequested()
            if (r10 != 0) goto L_0x00a9
            boolean r10 = r5.hasFocus()
            if (r10 != 0) goto L_0x0096
            int r10 = r6.r
            int r11 = r7.d()
            if (r10 == r11) goto L_0x00a9
        L_0x0096:
            boolean r10 = r5.hasFocus()
            if (r10 == 0) goto L_0x00a4
            int r10 = r6.r
            int r7 = r7.d()
            if (r10 != r7) goto L_0x00a9
        L_0x00a4:
            if (r8 < r3) goto L_0x00a9
            if (r8 > r4) goto L_0x00a9
            goto L_0x00b9
        L_0x00a9:
            int r7 = r6.e(r5)
            int r1 = java.lang.Math.min(r1, r7)
            int r5 = r6.f(r5)
            int r2 = java.lang.Math.max(r2, r5)
        L_0x00b9:
            int r9 = r9 + 1
            goto L_0x0064
        L_0x00bd:
            if (r2 <= r1) goto L_0x00c2
            int r2 = r2 - r1
            r6.I = r2
        L_0x00c2:
            r22.H()
            r22.I()
        L_0x00c8:
            int r0 = r6.p
            r0 = r0 & -4
            r6.p = r0
            r22.B()
            return
        L_0x00d2:
            boolean r0 = r7.k
            if (r0 == 0) goto L_0x0102
            android.util.SparseIntArray r0 = r6.J
            r0.clear()
            int r0 = r22.g()
            r3 = 0
        L_0x00e0:
            if (r3 >= r0) goto L_0x0102
            nf r4 = r6.k
            android.view.View r5 = r6.d(r3)
            km r4 = r4.a(r5)
            int r4 = r4.d
            if (r4 < 0) goto L_0x00ff
            nk r5 = r6.C
            ni r5 = r5.d(r4)
            if (r5 == 0) goto L_0x00ff
            android.util.SparseIntArray r10 = r6.J
            int r5 = r5.a
            r10.put(r4, r5)
        L_0x00ff:
            int r3 = r3 + 1
            goto L_0x00e0
        L_0x0102:
            boolean r0 = r22.e()
            r10 = r0 ^ 1
            int r3 = r6.r
            r11 = -1
            if (r3 != r11) goto L_0x010e
            goto L_0x0117
        L_0x010e:
            int r4 = r6.M
            if (r4 == r2) goto L_0x0117
            int r3 = r3 + r4
            r6.r = r3
            r6.s = r9
        L_0x0117:
            r6.M = r9
            android.view.View r12 = r6.c(r3)
            int r13 = r6.r
            nf r3 = r6.k
            boolean r14 = r3.hasFocus()
            nk r3 = r6.C
            if (r3 == 0) goto L_0x012d
            int r4 = r3.f
            goto L_0x012e
        L_0x012d:
            r4 = -1
        L_0x012e:
            if (r3 == 0) goto L_0x0133
            int r3 = r3.g
            goto L_0x0135
        L_0x0133:
            r3 = -1
        L_0x0135:
            int r5 = r6.l
            if (r5 == 0) goto L_0x013e
            int r5 = r7.o
            int r15 = r7.p
            goto L_0x0142
        L_0x013e:
            int r15 = r7.o
            int r5 = r7.p
        L_0x0142:
            kk r1 = r6.m
            int r1 = r1.a()
            if (r1 == 0) goto L_0x015d
            int r2 = r6.r
            if (r2 < r1) goto L_0x0154
            int r1 = r1 + r11
            r6.r = r1
            r6.s = r9
            goto L_0x0162
        L_0x0154:
            if (r2 != r11) goto L_0x0162
            if (r1 <= 0) goto L_0x0162
            r6.r = r9
            r6.s = r9
            goto L_0x0162
        L_0x015d:
            r6.r = r11
            r6.s = r9
        L_0x0162:
            kk r1 = r6.m
            boolean r1 = r1.f
            r18 = 262144(0x40000, float:3.67342E-40)
            if (r1 == 0) goto L_0x0173
            r19 = r12
            r20 = r13
            r21 = r14
            r14 = r5
            goto L_0x02e1
        L_0x0173:
            nk r1 = r6.C
            if (r1 == 0) goto L_0x02da
            int r2 = r1.f
            if (r2 < 0) goto L_0x02da
            int r2 = r6.p
            r2 = r2 & 256(0x100, float:3.59E-43)
            if (r2 != 0) goto L_0x02da
            int r1 = r1.e
            int r2 = r6.B
            if (r1 != r2) goto L_0x02da
            oz r0 = r6.D
            oy r1 = r0.c
            int r2 = r6.h
            r1.h = r2
            oy r0 = r0.b
            int r2 = r6.i
            r0.h = r2
            int r0 = r22.h()
            int r2 = r22.j()
            r1.a(r0, r2)
            oz r0 = r6.D
            oy r0 = r0.b
            int r1 = r22.i()
            int r2 = r22.k()
            r0.a(r1, r2)
            oz r0 = r6.D
            oy r0 = r0.d
            int r0 = r0.h
            r6.S = r0
            r22.K()
            nk r0 = r6.C
            int r1 = r6.y
            r0.d = r1
            int r1 = r6.p
            r1 = r1 | 4
            r6.p = r1
            int r1 = r6.r
            r0.i = r1
            int r4 = r22.g()
            nk r0 = r6.C
            int r0 = r0.f
            int r1 = r6.p
            r1 = r1 & -9
            r6.p = r1
            r2 = r0
            r3 = 0
        L_0x01da:
            if (r3 >= r4) goto L_0x02cb
            android.view.View r0 = r6.d(r3)
            int r1 = n(r0)
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
            nk r1 = r6.C
            ni r1 = r1.d(r2)
            if (r1 == 0) goto L_0x027c
            int r9 = r1.a
            int r9 = r6.j(r9)
            oz r8 = r6.D
            oy r8 = r8.e
            int r8 = r8.i
            int r9 = r9 + r8
            int r8 = r6.w
            int r8 = r9 - r8
            int r9 = r6.e(r0)
            int r11 = r6.g(r0)
            android.view.ViewGroup$LayoutParams r16 = r0.getLayoutParams()
            r17 = r4
            r4 = r16
            np r4 = (defpackage.np) r4
            km r4 = r4.a
            boolean r4 = r4.k()
            if (r4 != 0) goto L_0x0227
            r4 = r0
            goto L_0x023a
        L_0x0227:
            int r4 = r6.p
            r4 = r4 | 8
            r6.p = r4
            kc r4 = r6.o
            r6.a(r0, r4)
            android.view.View r0 = r6.i(r2)
            r6.b(r0, r3)
            r4 = r0
        L_0x023a:
            r6.h(r4)
            int r0 = r6.l
            if (r0 != 0) goto L_0x0248
            int r0 = k(r4)
            int r16 = r9 + r0
            goto L_0x024e
        L_0x0248:
            int r0 = j(r4)
            int r16 = r9 + r0
        L_0x024e:
            int r1 = r1.a
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
            r0.a(r1, r2, r3, r4, r5)
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
            nk r0 = r6.C
            int r0 = r0.g
            r1 = -1
            int r4 = r9 + -1
        L_0x028d:
            if (r4 < r7) goto L_0x029b
            android.view.View r1 = r6.d(r4)
            kc r2 = r6.o
            r6.a(r1, r2)
            int r4 = r4 + -1
            goto L_0x028d
        L_0x029b:
            nk r1 = r6.C
            r1.b(r13)
            int r1 = r6.p
            r2 = 65536(0x10000, float:9.18355E-41)
            r1 = r1 & r2
            if (r1 != 0) goto L_0x02b6
        L_0x02a7:
            nk r1 = r6.C
            boolean r1 = r1.b()
            if (r1 == 0) goto L_0x02d2
            nk r1 = r6.C
            int r1 = r1.g
            if (r1 < r0) goto L_0x02a7
            goto L_0x02d2
        L_0x02b6:
            r22.H()
            int r1 = r6.r
            if (r1 < 0) goto L_0x02d2
            if (r1 > r0) goto L_0x02d2
        L_0x02bf:
            nk r0 = r6.C
            int r1 = r0.g
            int r2 = r6.r
            if (r1 >= r2) goto L_0x02d2
            r0.b()
            goto L_0x02bf
        L_0x02cb:
            r19 = r12
            r20 = r13
            r21 = r14
            r14 = r5
        L_0x02d2:
            r22.w()
            r22.K()
            goto L_0x03bc
        L_0x02da:
            r19 = r12
            r20 = r13
            r21 = r14
            r14 = r5
        L_0x02e1:
            int r1 = r6.p
            r1 = r1 & -257(0xfffffffffffffeff, float:NaN)
            r6.p = r1
            nk r2 = r6.C
            if (r2 == 0) goto L_0x02fd
            int r5 = r6.B
            int r7 = r2.e
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
            boolean r2 = r2.c
            if (r1 == r2) goto L_0x0323
        L_0x02fd:
            int r1 = r6.B
            r2 = 1
            if (r1 == r2) goto L_0x030c
            ov r2 = new ov
            r5 = 0
            r2.<init>(r5)
            r2.a(r1)
            goto L_0x0311
        L_0x030c:
            ot r2 = new ot
            r2.<init>()
        L_0x0311:
            r6.C = r2
            nj r1 = r6.W
            r2.b = r1
            int r1 = r6.p
            r1 = r1 & r18
            if (r1 == 0) goto L_0x031f
            r1 = 1
            goto L_0x0321
        L_0x031f:
            r1 = 0
        L_0x0321:
            r2.c = r1
        L_0x0323:
            oz r1 = r6.D
            oy r1 = r1.d
            r1.a()
            oz r1 = r6.D
            oy r2 = r1.c
            int r5 = r6.h
            r2.h = r5
            oy r1 = r1.b
            int r5 = r6.i
            r1.h = r5
            int r1 = r22.h()
            int r5 = r22.j()
            r2.a(r1, r5)
            oz r1 = r6.D
            oy r1 = r1.b
            int r2 = r22.i()
            int r5 = r22.k()
            r1.a(r2, r5)
            oz r1 = r6.D
            oy r1 = r1.d
            int r1 = r1.h
            r6.S = r1
            r1 = 0
            r6.w = r1
            r22.K()
            nk r1 = r6.C
            int r2 = r6.y
            r1.d = r2
            kc r1 = r6.o
            int r2 = r22.g()
            r5 = -1
            int r2 = r2 + r5
        L_0x036e:
            if (r2 >= 0) goto L_0x05fa
            nk r1 = r6.C
            r1.a()
            oz r1 = r6.D
            oy r1 = r1.d
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r1.b = r5
            r1.d = r5
            r7 = 2147483647(0x7fffffff, float:NaN)
            r1.a = r7
            r1.c = r7
            int r1 = r6.p
            r1 = r1 & -21
            if (r0 != 0) goto L_0x038f
            r0 = 16
            goto L_0x0391
        L_0x038f:
            r0 = 0
        L_0x0391:
            r0 = r0 | r1
            r6.p = r0
            if (r10 != 0) goto L_0x0397
        L_0x0396:
            goto L_0x03a5
        L_0x0397:
            if (r4 >= 0) goto L_0x039a
        L_0x0399:
            goto L_0x03a1
        L_0x039a:
            int r0 = r6.r
            if (r0 > r3) goto L_0x0399
            if (r0 < r4) goto L_0x0399
            goto L_0x0396
        L_0x03a1:
            int r4 = r6.r
            r3 = r4
        L_0x03a5:
            nk r0 = r6.C
            r0.i = r4
            r0 = -1
            if (r3 == r0) goto L_0x03bc
        L_0x03ac:
            nk r0 = r6.C
            boolean r0 = r0.b()
            if (r0 != 0) goto L_0x03b5
            goto L_0x03bc
        L_0x03b5:
            android.view.View r0 = r6.c(r3)
            if (r0 != 0) goto L_0x03bc
            goto L_0x03ac
        L_0x03bc:
            r22.w()
            nk r0 = r6.C
            int r1 = r0.f
            int r0 = r0.g
            int r2 = -r15
            int r3 = -r14
            int r4 = r6.r
            android.view.View r4 = r6.c(r4)
            if (r4 == 0) goto L_0x03d4
            if (r10 == 0) goto L_0x03d4
            r6.a(r4, r2, r3)
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
            nf r5 = r6.k
            boolean r5 = r5.hasFocus()
            if (r5 != 0) goto L_0x0428
            if (r4 == 0) goto L_0x03fd
            boolean r5 = r4.hasFocusable()
            if (r5 == 0) goto L_0x03fd
            nf r5 = r6.k
            r5.focusableViewAvailable(r4)
            r7 = r4
            goto L_0x041b
        L_0x03fd:
            int r5 = r22.g()
            r7 = r4
            r4 = 0
        L_0x0403:
            if (r4 >= r5) goto L_0x041b
            android.view.View r7 = r6.d(r4)
            if (r7 != 0) goto L_0x040c
            goto L_0x0418
        L_0x040c:
            boolean r8 = r7.hasFocusable()
            if (r8 == 0) goto L_0x0418
            nf r4 = r6.k
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
            r6.a(r7, r2, r3)
        L_0x0428:
            r22.H()
            r22.I()
            nk r2 = r6.C
            int r3 = r2.f
            if (r3 != r1) goto L_0x05ed
            int r1 = r2.g
            if (r1 != r0) goto L_0x05ed
            r22.G()
            r22.F()
            r8 = r24
            boolean r0 = r8.k
            if (r0 == 0) goto L_0x0556
            kc r0 = r6.o
            java.util.List r0 = r0.d
            int r1 = r0.size()
            if (r1 != 0) goto L_0x0450
            goto L_0x0556
        L_0x0450:
            int[] r2 = r6.K
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
            r6.K = r2
            r2 = 0
            r3 = 0
        L_0x046a:
            if (r2 >= r1) goto L_0x0482
            java.lang.Object r4 = r0.get(r2)
            km r4 = (defpackage.km) r4
            int r4 = r4.d()
            if (r4 < 0) goto L_0x047f
            int r5 = r3 + 1
            int[] r7 = r6.K
            r7[r3] = r4
            r3 = r5
        L_0x047f:
            int r2 = r2 + 1
            goto L_0x046a
        L_0x0482:
            if (r3 <= 0) goto L_0x054c
            int[] r0 = r6.K
            r1 = 0
            java.util.Arrays.sort(r0, r1, r3)
            nk r0 = r6.C
            int[] r2 = r6.K
            android.util.SparseIntArray r4 = r6.J
            int r5 = r0.g
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
            boolean r7 = r0.c
            if (r7 != 0) goto L_0x04b5
            nj r7 = r0.b
            int r7 = r7.b(r5)
            nj r8 = r0.b
            int r5 = r8.c(r5)
            int r7 = r7 + r5
            int r5 = r0.d
            int r7 = r7 + r5
            goto L_0x04c5
        L_0x04b5:
            nj r7 = r0.b
            int r7 = r7.b(r5)
            nj r8 = r0.b
            int r5 = r8.c(r5)
            int r7 = r7 - r5
            int r5 = r0.d
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
            nj r8 = r0.b
            java.lang.Object[] r10 = r0.a
            r11 = 1
            int r5 = r8.a(r5, r11, r10, r11)
            nj r8 = r0.b
            java.lang.Object[] r10 = r0.a
            r11 = 0
            r10 = r10[r11]
            r8.a(r10, r5, r9, r7)
            boolean r8 = r0.c
            if (r8 == 0) goto L_0x04f0
            int r7 = r7 - r5
            int r5 = r0.d
            int r7 = r7 - r5
            goto L_0x04f4
        L_0x04f0:
            int r7 = r7 + r5
            int r5 = r0.d
            int r7 = r7 + r5
        L_0x04f4:
            int r1 = r1 + 1
            goto L_0x04c6
        L_0x04f7:
            int r1 = r0.f
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
            boolean r5 = r0.c
            if (r5 != 0) goto L_0x0513
            nj r5 = r0.b
            int r1 = r5.b(r1)
            goto L_0x0519
        L_0x0513:
            nj r5 = r0.b
            int r1 = r5.b(r1)
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
            nj r7 = r0.b
            java.lang.Object[] r8 = r0.a
            r10 = 1
            r11 = 0
            int r5 = r7.a(r5, r11, r8, r10)
            boolean r7 = r0.c
            if (r7 != 0) goto L_0x053b
            int r7 = r0.d
            int r1 = r1 - r7
            int r1 = r1 - r5
            goto L_0x053f
        L_0x053b:
            int r7 = r0.d
            int r1 = r1 + r7
            int r1 = r1 + r5
        L_0x053f:
            nj r7 = r0.b
            java.lang.Object[] r8 = r0.a
            r10 = 0
            r8 = r8[r10]
            r7.a(r8, r5, r9, r1)
            int r3 = r3 + -1
            goto L_0x051a
        L_0x054c:
            android.util.SparseIntArray r0 = r6.J
            r0.clear()
            goto L_0x0556
        L_0x0552:
            r9 = -1
            int r2 = r2 + r2
            goto L_0x0461
        L_0x0556:
            int r0 = r6.p
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x0561
            r0 = r0 & -1025(0xfffffffffffffbff, float:NaN)
            r6.p = r0
            goto L_0x0564
        L_0x0561:
            r22.D()
        L_0x0564:
            int r0 = r6.p
            r1 = r0 & 4
            if (r1 != 0) goto L_0x056b
            goto L_0x0580
        L_0x056b:
            int r0 = r6.r
            r11 = r20
            if (r0 != r11) goto L_0x058a
            android.view.View r0 = r6.c(r0)
            r12 = r19
            if (r0 != r12) goto L_0x058a
            int r0 = r6.p
            r1 = r0 & 8
            if (r1 == 0) goto L_0x0580
            goto L_0x058a
        L_0x0580:
            r0 = r0 & 20
            r13 = 16
            if (r0 != r13) goto L_0x058d
            r22.s()
            goto L_0x058d
        L_0x058a:
            r22.s()
        L_0x058d:
            r22.t()
            int r0 = r6.p
            r1 = r0 & 64
            if (r1 != 0) goto L_0x0597
            goto L_0x05e3
        L_0x0597:
            int r1 = r6.l
            r2 = 1
            if (r1 != r2) goto L_0x05b2
            int r0 = r6.i
            int r0 = -r0
            int r1 = r22.g()
            if (r1 <= 0) goto L_0x05e0
            r1 = 0
            android.view.View r1 = r6.d(r1)
            int r1 = r1.getTop()
            if (r1 >= 0) goto L_0x05e0
            int r0 = r0 + r1
            goto L_0x05e0
        L_0x05b2:
            r0 = r0 & r18
            if (r0 != 0) goto L_0x05cc
            int r0 = r6.h
            int r0 = -r0
            int r1 = r22.g()
            if (r1 <= 0) goto L_0x05e0
            r1 = 0
            android.view.View r1 = r6.d(r1)
            int r1 = r1.getLeft()
            if (r1 >= 0) goto L_0x05e0
            int r0 = r0 + r1
            goto L_0x05e0
        L_0x05cc:
            int r0 = r6.h
            int r1 = r22.g()
            if (r1 <= 0) goto L_0x05e0
            r1 = 0
            android.view.View r1 = r6.d(r1)
            int r1 = r1.getRight()
            if (r1 <= r0) goto L_0x05e0
            r0 = r1
        L_0x05e0:
            r6.n(r0)
        L_0x05e3:
            int r0 = r6.p
            r0 = r0 & -4
            r6.p = r0
            r22.B()
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
            android.view.View r5 = r6.d(r2)
            r6.a(r1, r2, r5)
            int r2 = r2 + -1
            goto L_0x036e
        L_0x0617:
            r22.M()
            r22.b(r23)
            return
        L_0x061e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nt.a(kc, kk):void");
    }

    public final void a(kc kcVar, kk kkVar, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        b(kcVar, kkVar);
        if (this.l == 0) {
            i6 = View.MeasureSpec.getSize(i);
            i5 = View.MeasureSpec.getSize(i2);
            i4 = View.MeasureSpec.getMode(i2);
            i3 = i() + k();
        } else {
            i5 = View.MeasureSpec.getSize(i);
            i6 = View.MeasureSpec.getSize(i2);
            i4 = View.MeasureSpec.getMode(i);
            i3 = h() + j();
        }
        this.Q = i5;
        int i8 = this.N;
        if (i8 == -2) {
            int i9 = this.R;
            if (i9 == 0) {
                i9 = 1;
            }
            this.B = i9;
            this.O = 0;
            int[] iArr = this.P;
            if (iArr == null || iArr.length != i9) {
                this.P = new int[i9];
            }
            if (this.m.g) {
                J();
            }
            a(true);
            if (i4 == Integer.MIN_VALUE) {
                i5 = Math.min(C() + i3, this.Q);
            } else if (i4 == 0) {
                i5 = C() + i3;
            } else if (i4 == 1073741824) {
                i5 = this.Q;
            } else {
                throw new IllegalStateException("wrong spec");
            }
        } else {
            if (i4 != Integer.MIN_VALUE) {
                if (i4 == 0) {
                    if (i8 == 0) {
                        i8 = i5 - i3;
                    }
                    this.O = i8;
                    int i10 = this.R;
                    if (i10 == 0) {
                        i10 = 1;
                    }
                    this.B = i10;
                    i5 = (i8 * i10) + (this.z * (i10 - 1)) + i3;
                } else if (i4 != 1073741824) {
                    throw new IllegalStateException("wrong spec");
                }
            }
            int i11 = this.R;
            if (i11 == 0 && i8 == 0) {
                this.B = 1;
                i8 = i5 - i3;
                this.O = i8;
                i11 = 1;
            } else if (i11 == 0) {
                this.O = i8;
                int i12 = this.z;
                int i13 = (i5 + i12) / (i12 + i8);
                this.B = i13;
                i11 = i13;
            } else if (i8 == 0) {
                this.B = i11;
                i8 = ((i5 - i3) - (this.z * (i11 - 1))) / i11;
                this.O = i8;
            } else {
                this.B = i11;
                this.O = i8;
            }
            if (i4 == Integer.MIN_VALUE && (i7 = (i8 * i11) + (this.z * (i11 - 1)) + i3) < i5) {
                i5 = i7;
            }
        }
        if (this.l == 0) {
            a(i6, i5);
        } else {
            a(i5, i6);
        }
        B();
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
    public final void a(View view, View view2) {
        if ((this.p & 32768) == 0 && n(view) != -1 && (this.p & 35) == 0) {
            a(view, view2, true);
        }
    }

    public final void a(Parcelable parcelable) {
        if (parcelable instanceof ns) {
            this.r = ((ns) parcelable).a;
            this.M = 0;
            this.p |= 256;
            a();
        }
    }

    public final Parcelable n() {
        ns nsVar = new ns();
        nsVar.a = this.r;
        int g = g();
        for (int i = 0; i < g; i++) {
            n(d(i));
        }
        nsVar.b = null;
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
        if (r6 != defpackage.ea.e.a()) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002b, code lost:
        if (r4 == 0) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002e, code lost:
        if (r4 == 0) goto L_0x0046;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0056  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(defpackage.kc r4, defpackage.kk r5, int r6) {
        /*
            r3 = this;
            int r0 = r3.p
            r1 = 131072(0x20000, float:1.83671E-40)
            r0 = r0 & r1
            r1 = 1
            if (r0 == 0) goto L_0x0061
            r3.b(r4, r5)
            int r4 = r3.p
            r5 = 262144(0x40000, float:3.67342E-40)
            r4 = r4 & r5
            int r5 = android.os.Build.VERSION.SDK_INT
            int r5 = r3.l
            r0 = 4096(0x1000, float:5.74E-42)
            r2 = 8192(0x2000, float:1.14794E-41)
            if (r5 != 0) goto L_0x0031
            ea r5 = defpackage.ea.d
            int r5 = r5.a()
            if (r6 == r5) goto L_0x002e
            ea r5 = defpackage.ea.f
            int r5 = r5.a()
            if (r6 == r5) goto L_0x002b
            goto L_0x0048
        L_0x002b:
            if (r4 != 0) goto L_0x0046
            goto L_0x0043
        L_0x002e:
            if (r4 != 0) goto L_0x0043
            goto L_0x0046
        L_0x0031:
            ea r4 = defpackage.ea.c
            int r4 = r4.a()
            if (r6 == r4) goto L_0x0046
            ea r4 = defpackage.ea.e
            int r4 = r4.a()
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
            r3.b(r4)
            r5 = -1
            r3.a(r4, r5)
            goto L_0x005d
        L_0x0056:
            r3.b(r1)
            r3.a(r4, r1)
        L_0x005d:
            r3.B()
            return r1
        L_0x0061:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nt.a(kc, kk, int):boolean");
    }

    private final void I() {
        this.C.g((this.p & 262144) != 0 ? this.S + this.I : -this.I);
    }

    private final void b(boolean z2) {
        if (z2) {
            if (x()) {
                return;
            }
        } else if (y()) {
            return;
        }
        nq nqVar = this.u;
        int i = -1;
        boolean z3 = true;
        if (nqVar == null) {
            this.k.e();
            if (z2) {
                i = 1;
            }
            if (this.B <= 1) {
                z3 = false;
            }
            nq nqVar2 = new nq(this, i, z3);
            this.M = 0;
            a(nqVar2);
        } else if (!z2) {
            int i2 = nqVar.k;
            if (i2 > (-nqVar.l.G)) {
                nqVar.k = i2 - 1;
            }
        } else {
            int i3 = nqVar.k;
            if (i3 < nqVar.l.G) {
                nqVar.k = i3 + 1;
            }
        }
    }

    private final boolean a(boolean z2) {
        int i;
        cp[] cpVarArr;
        int i2;
        int i3;
        int i4;
        int i5 = 0;
        if (this.O != 0 || this.P == null) {
            return false;
        }
        nk nkVar = this.C;
        cp[] a = nkVar != null ? nkVar.a(nkVar.f, nkVar.g) : null;
        int i6 = -1;
        int i7 = 0;
        boolean z3 = false;
        int i8 = -1;
        while (i7 < this.B) {
            cp cpVar = a != null ? a[i7] : null;
            int b = cpVar != null ? cpVar.b() : 0;
            int i9 = -1;
            for (int i10 = 0; i10 < b; i10 += 2) {
                int b2 = cpVar.b(i10 + 1);
                for (int b3 = cpVar.b(i10); b3 <= b2; b3++) {
                    View c = c(b3 - this.n);
                    if (c != null) {
                        if (z2) {
                            h(c);
                        }
                        if (this.l != 0) {
                            i4 = k(c);
                        } else {
                            i4 = j(c);
                        }
                        if (i4 > i9) {
                            i9 = i4;
                        }
                    }
                }
            }
            int a2 = this.m.a();
            if (this.k.n) {
                cpVarArr = a;
                i = i9;
            } else if (!z2 || i9 >= 0 || a2 <= 0) {
                cpVarArr = a;
                i = i9;
            } else {
                if (i8 < 0) {
                    int i11 = this.r;
                    if (i11 < 0) {
                        i11 = 0;
                    } else if (i11 >= a2) {
                        i11 = a2 - 1;
                    }
                    if (g() > 0) {
                        int c2 = this.k.a(d(i5)).c();
                        int c3 = this.k.a(d(g() + i6)).c();
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
                        int[] iArr = this.T;
                        View a3 = this.o.a(i3);
                        if (a3 != null) {
                            np npVar = (np) a3.getLayoutParams();
                            b(a3, L);
                            cpVarArr = a;
                            i = i9;
                            a3.measure(ViewGroup.getChildMeasureSpec(makeMeasureSpec, h() + j() + npVar.leftMargin + npVar.rightMargin + L.left + L.right, npVar.width), ViewGroup.getChildMeasureSpec(makeMeasureSpec2, i() + k() + npVar.topMargin + npVar.bottomMargin + L.top + L.bottom, npVar.height));
                            iArr[0] = k(a3);
                            iArr[1] = j(a3);
                            this.o.a(a3);
                        } else {
                            cpVarArr = a;
                            i = i9;
                        }
                        i8 = this.l != 0 ? this.T[0] : this.T[1];
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
            int[] iArr2 = this.P;
            if (iArr2[i7] != i2) {
                iArr2[i7] = i2;
                z3 = true;
            }
            i7++;
            a = cpVarArr;
            i5 = 0;
            i6 = -1;
        }
        return z3;
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
    public final int a(boolean z2, int i) {
        nk nkVar = this.C;
        if (nkVar == null) {
            return i;
        }
        int i2 = this.r;
        int c = i2 != -1 ? nkVar.c(i2) : -1;
        int g = g();
        View view = null;
        int i3 = c;
        int i4 = i;
        for (int i5 = 0; i5 < g && i4 != 0; i5++) {
            int i6 = i4 <= 0 ? (g - 1) - i5 : i5;
            View d = d(i6);
            if (i(d)) {
                int l2 = l(i6);
                int c2 = this.C.c(l2);
                if (i3 == -1) {
                    i2 = l2;
                    view = d;
                    i3 = c2;
                } else if (c2 == i3 && ((i4 > 0 && l2 > i2) || (i4 < 0 && l2 < i2))) {
                    i4 = i4 > 0 ? i4 - 1 : i4 + 1;
                    i2 = l2;
                    view = d;
                }
            }
        }
        if (view != null) {
            if (z2) {
                if (l()) {
                    this.p |= 32;
                    view.requestFocus();
                    this.p &= -33;
                }
                this.r = i2;
                this.s = 0;
            } else {
                a(view, true);
            }
        }
        return i4;
    }

    public final void b(kc kcVar) {
        for (int g = g() - 1; g >= 0; g--) {
            View d = d(g);
            b(g);
            kcVar.a(d);
        }
    }

    private final void F() {
        int i = this.p;
        if ((65600 & i) == 65536) {
            nk nkVar = this.C;
            int i2 = this.r;
            int i3 = (i & 262144) == 0 ? this.S : 0;
            while (true) {
                int i4 = nkVar.g;
                if (i4 < nkVar.f || i4 <= i2) {
                    break;
                }
                if (!nkVar.c) {
                    if (nkVar.b.b(i4) < i3) {
                        break;
                    }
                } else if (nkVar.b.b(i4) > i3) {
                    break;
                }
                nkVar.b.a(nkVar.g);
                nkVar.g--;
            }
            nkVar.c();
        }
    }

    private final void G() {
        int i = this.p;
        if ((65600 & i) == 65536) {
            nk nkVar = this.C;
            int i2 = this.r;
            int i3 = (i & 262144) != 0 ? this.S : 0;
            while (true) {
                int i4 = nkVar.g;
                int i5 = nkVar.f;
                if (i4 < i5 || i5 >= i2) {
                    break;
                }
                int c = nkVar.b.c(i5);
                if (nkVar.c) {
                    if (nkVar.b.b(nkVar.f) - c < i3) {
                        break;
                    }
                } else if (nkVar.b.b(nkVar.f) + c > i3) {
                    break;
                }
                nkVar.b.a(nkVar.f);
                nkVar.f++;
            }
            nkVar.c();
        }
    }

    private final void b(kc kcVar, kk kkVar) {
        if (!(this.o == null && this.m == null)) {
            Log.e("GridLayoutManager", "Recycler information was not released, bug!");
        }
        this.o = kcVar;
        this.m = kkVar;
        this.n = 0;
        this.I = 0;
    }

    private final int n(int i) {
        int i2;
        int i3 = this.p;
        if ((i3 & 64) != 0 || (i3 & 3) == 1 || (i <= 0 ? i >= 0 || this.D.d.b() || i >= (i2 = this.D.d.d) : this.D.d.c() || i <= (i2 = this.D.d.c))) {
            i2 = i;
        }
        boolean z2 = false;
        if (i2 == 0) {
            return 0;
        }
        int i4 = -i2;
        int g = g();
        if (this.l == 1) {
            for (int i5 = 0; i5 < g; i5++) {
                d(i5).offsetTopAndBottom(i4);
            }
        } else {
            for (int i6 = 0; i6 < g; i6++) {
                d(i6).offsetLeftAndRight(i4);
            }
        }
        if ((this.p & 3) != 1) {
            int g2 = g();
            if ((this.p & 262144) != 0 ? i2 <= 0 : i2 >= 0) {
                H();
            } else {
                I();
            }
            boolean z3 = g() > g2;
            int g3 = g();
            if ((262144 & this.p) != 0 ? i2 <= 0 : i2 >= 0) {
                G();
            } else {
                F();
            }
            if (g() < g3) {
                z2 = true;
            }
            if (z2 || z3) {
                D();
            }
            this.k.invalidate();
            w();
            return i2;
        }
        w();
        return i2;
    }

    private final int o(int i) {
        int i2 = 0;
        if (i == 0) {
            return 0;
        }
        int i3 = -i;
        int g = g();
        if (this.l == 0) {
            while (i2 < g) {
                d(i2).offsetTopAndBottom(i3);
                i2++;
            }
        } else {
            while (i2 < g) {
                d(i2).offsetLeftAndRight(i3);
                i2++;
            }
        }
        this.w += i;
        K();
        this.k.invalidate();
        return i;
    }

    public final int a(int i, kc kcVar, kk kkVar) {
        int i2;
        if ((this.p & 512) == 0 || !z()) {
            return 0;
        }
        b(kcVar, kkVar);
        this.p = (this.p & -4) | 2;
        if (this.l == 0) {
            i2 = n(i);
        } else {
            i2 = o(i);
        }
        B();
        this.p &= -4;
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
    public final void a(int i) {
        a(i, false);
    }

    public final void b(int i, boolean z2) {
        View c = c(i);
        boolean z3 = !e();
        if (z3 && !this.k.isLayoutRequested() && c != null && n(c) == i) {
            this.p |= 32;
            a(c, z2);
            this.p &= -33;
            return;
        }
        int i2 = this.p;
        if ((i2 & 512) == 0 || (i2 & 64) != 0) {
            this.r = i;
            this.s = 0;
            this.M = Integer.MIN_VALUE;
        } else if (!z2 || this.k.isLayoutRequested()) {
            if (!z3) {
                L();
                this.k.e();
            }
            if (this.k.isLayoutRequested() || c == null || n(c) != i) {
                this.r = i;
                this.s = 0;
                this.M = Integer.MIN_VALUE;
                this.p |= 256;
                a();
                return;
            }
            this.p |= 32;
            a(c, z2);
            this.p &= -33;
        } else {
            this.r = i;
            this.s = 0;
            this.M = Integer.MIN_VALUE;
            if (z()) {
                nn nnVar = new nn(this);
                nnVar.a = i;
                a(nnVar);
                int i3 = nnVar.a;
                if (i3 != this.r) {
                    this.r = i3;
                    this.s = 0;
                    return;
                }
                return;
            }
            Log.w("GridLayoutManager:" + this.k.getId(), "setSelectionSmooth should not be called before first layout pass");
        }
    }

    private final void a(View view, View view2, boolean z2) {
        a(view, view2, z2, 0, 0);
    }

    private final void a(View view, View view2, boolean z2, int i, int i2) {
        if ((this.p & 64) == 0) {
            int n2 = n(view);
            b(view, view2);
            if (n2 != this.r) {
                this.r = n2;
                this.s = 0;
                this.M = 0;
                if ((this.p & 3) != 1) {
                    s();
                }
                if (this.k.s()) {
                    this.k.invalidate();
                }
            }
            if (view != null) {
                if (!view.hasFocus() && this.k.hasFocus()) {
                    view.requestFocus();
                }
                if ((this.p & 131072) != 0 || !z2) {
                    if (a(view, view2, F) || i != 0 || i2 != 0) {
                        int[] iArr = F;
                        int i3 = iArr[0] + i;
                        int i4 = iArr[1] + i2;
                        if ((this.p & 3) == 1) {
                            n(i3);
                            o(i4);
                            return;
                        }
                        int i5 = this.l;
                        int i6 = i5 == 0 ? i4 : i3;
                        if (i5 == 0) {
                            i4 = i3;
                        }
                        if (!z2) {
                            this.k.scrollBy(i4, i6);
                            t();
                            return;
                        }
                        this.k.e(i4, i6);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(View view, boolean z2) {
        a(view, view != null ? view.findFocus() : null, z2);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: nt.a(android.view.View, android.view.View, boolean, int, int):void
     arg types: [android.view.View, android.view.View, int, int, int]
     candidates:
      nt.a(int, android.view.View, int, int, int):void
      nt.a(android.view.View, android.view.View, boolean, int, int):void */
    private final void a(View view, int i, int i2) {
        a(view, view != null ? view.findFocus() : null, false, i, i2);
    }

    public final int b(int i, kc kcVar, kk kkVar) {
        int i2;
        if ((this.p & 512) == 0 || !z()) {
            return 0;
        }
        this.p = (this.p & -4) | 2;
        b(kcVar, kkVar);
        if (this.l == 1) {
            i2 = n(i);
        } else {
            i2 = o(i);
        }
        B();
        this.p &= -4;
        return i2;
    }

    public final void g(int i) {
        if (i >= 0) {
            this.R = i;
            return;
        }
        throw new IllegalArgumentException();
    }

    public final void f(int i) {
        ji jiVar;
        if (i != 0) {
            i = 1;
        }
        this.l = i;
        if (i != 0) {
            jiVar = new jh(this);
        } else {
            jiVar = ji.a(this);
        }
        this.H = jiVar;
        oz ozVar = this.D;
        ozVar.a = i;
        if (i == 0) {
            ozVar.d = ozVar.c;
            ozVar.e = ozVar.b;
        } else {
            ozVar.d = ozVar.b;
            ozVar.e = ozVar.c;
        }
        nw nwVar = this.E;
        nwVar.a = i;
        if (i == 0) {
            nwVar.d = nwVar.c;
        } else {
            nwVar.d = nwVar.b;
        }
        this.p |= 256;
    }

    public final void h(int i) {
        if (i >= 0 || i == -2) {
            this.N = i;
            return;
        }
        throw new IllegalArgumentException("Invalid row height: " + i);
    }

    public final void a(int i, boolean z2) {
        if (this.r != i && i != -1) {
            b(i, z2);
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
    public final void k(int i) {
        a(i, false);
    }

    private final void L() {
        no noVar = this.t;
        if (noVar != null) {
            noVar.i = true;
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
    public final void e(int i) {
        a(i, true);
    }

    private final void a(kj kjVar) {
        L();
        kj kjVar2 = this.c;
        if (!(kjVar2 == null || kjVar == kjVar2 || !kjVar2.e)) {
            kjVar2.a();
        }
        this.c = kjVar;
        kj kjVar3 = this.c;
        RecyclerView recyclerView = this.b;
        recyclerView.A.b();
        if (kjVar3.g) {
            Log.w("RecyclerView", "An instance of " + kjVar3.getClass().getSimpleName() + " was started more than once. Each instance of" + kjVar3.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
        }
        kjVar3.b = recyclerView;
        kjVar3.c = this;
        int i = kjVar3.a;
        if (i != -1) {
            kjVar3.b.D.a = i;
            kjVar3.e = true;
            kjVar3.d = true;
            kjVar3.f = kjVar3.b(kjVar3.a);
            kjVar3.b.A.a();
            kjVar3.g = true;
            if (!kjVar.e) {
                this.t = null;
                this.u = null;
                return;
            }
            no noVar = (no) kjVar;
            this.t = noVar;
            if (noVar instanceof nq) {
                this.u = (nq) noVar;
            } else {
                this.u = null;
            }
        } else {
            throw new IllegalArgumentException("Invalid target position");
        }
    }

    public final void u() {
        int g = g();
        for (int i = 0; i < g; i++) {
            m(d(i));
        }
    }

    private final void m(View view) {
        np npVar = (np) view.getLayoutParams();
        ny nyVar = npVar.l;
        if (nyVar == null) {
            npVar.i = this.E.c.a(view);
            npVar.j = this.E.b.a(view);
            return;
        }
        int i = this.l;
        nx[] nxVarArr = nyVar.a;
        int[] iArr = npVar.k;
        if (iArr == null || iArr.length != 1) {
            npVar.k = new int[1];
        }
        npVar.k[0] = nz.a(view, nxVarArr[0], i);
        if (i != 0) {
            npVar.j = npVar.k[0];
        } else {
            npVar.i = npVar.k[0];
        }
        if (this.l != 0) {
            npVar.i = this.E.c.a(view);
        } else {
            npVar.j = this.E.b.a(view);
        }
    }

    private final void J() {
        if (g() > 0) {
            this.n = this.C.f - ((np) d(0).getLayoutParams()).c();
        } else {
            this.n = 0;
        }
    }

    private final void D() {
        int i = this.p & -1025;
        int i2 = 0;
        if (a(false)) {
            i2 = 1024;
        }
        int i3 = i | i2;
        this.p = i3;
        if ((i3 & 1024) != 0) {
            E();
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
    public final void w() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int length;
        if (this.m.a() != 0) {
            if ((this.p & 262144) != 0) {
                nk nkVar = this.C;
                i3 = nkVar.f;
                i4 = nkVar.g;
                i = this.m.a() - 1;
                i2 = 0;
            } else {
                i3 = this.C.g;
                i = 0;
                int i7 = this.C.f;
                i2 = this.m.a() - 1;
                i4 = i7;
            }
            if (i3 >= 0 && i4 >= 0) {
                if (i3 == i2 || !this.D.d.c() || i4 == i || !this.D.d.b()) {
                    int i8 = Integer.MAX_VALUE;
                    if (i3 == i2) {
                        i8 = this.C.b(true, F);
                        View c = c(F[1]);
                        i5 = l(c);
                        int[] iArr = ((np) c.getLayoutParams()).k;
                        if (iArr != null && (length = iArr.length) > 0) {
                            i5 += iArr[length - 1] - iArr[0];
                        }
                    } else {
                        i5 = Integer.MAX_VALUE;
                    }
                    int i9 = Integer.MIN_VALUE;
                    if (i4 == i) {
                        i9 = this.C.a(false, F);
                        i6 = l(c(F[1]));
                    } else {
                        i6 = Integer.MIN_VALUE;
                    }
                    this.D.d.a(i9, i8, i6, i5);
                }
            }
        }
    }

    private final void K() {
        oy oyVar = this.D.e;
        int i = oyVar.i - this.w;
        int C2 = C() + i;
        oyVar.a(i, C2, i, C2);
    }
}
