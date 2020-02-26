package android.support.p002v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.support.p002v7.view.menu.ActionMenuItemView;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

/* renamed from: android.support.v7.widget.ActionMenuView */
/* compiled from: PG */
public class ActionMenuView extends C0237is implements C0151fn, C0161fx {

    /* renamed from: a */
    public C0152fo f1006a;

    /* renamed from: b */
    public Context f1007b;

    /* renamed from: c */
    public int f1008c;

    /* renamed from: d */
    public C0180gp f1009d;

    /* renamed from: e */
    public C0184gt f1010e;

    /* renamed from: i */
    private boolean f1011i;

    /* renamed from: j */
    private int f1012j;

    /* renamed from: k */
    private int f1013k;

    /* renamed from: l */
    private int f1014l;

    public ActionMenuView(Context context) {
        this(context, null);
    }

    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo5267d();
        float f = context.getResources().getDisplayMetrics().density;
        this.f1013k = (int) (56.0f * f);
        this.f1014l = (int) (f * 4.0f);
        this.f1007b = context;
        this.f1008c = 0;
    }

    /* access modifiers changed from: protected */
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0183gs;
    }

    /* renamed from: c */
    public static final C0183gs m1276c() {
        C0183gs gsVar = new C0183gs();
        gsVar.f9629h = 16;
        return gsVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ C0236ir mo809b() {
        return m1276c();
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return m1276c();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final C0183gs generateLayoutParams(AttributeSet attributeSet) {
        return new C0183gs(getContext(), attributeSet);
    }

    /* renamed from: b */
    public static final C0183gs m1274b(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            return m1276c();
        }
        C0183gs gsVar = layoutParams instanceof C0183gs ? new C0183gs((C0183gs) layoutParams) : new C0183gs(layoutParams);
        if (gsVar.f9629h <= 0) {
            gsVar.f9629h = 16;
        }
        return gsVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C0236ir mo808a(ViewGroup.LayoutParams layoutParams) {
        return m1274b(layoutParams);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m1274b(layoutParams);
    }

    /* renamed from: a */
    public final Menu mo806a() {
        if (this.f1006a == null) {
            Context context = getContext();
            C0152fo foVar = new C0152fo(context);
            this.f1006a = foVar;
            foVar.mo4896k();
            C0180gp gpVar = new C0180gp(context);
            this.f1009d = gpVar;
            gpVar.f9405h = true;
            gpVar.f9406i = true;
            gpVar.f9259e = new C0182gr();
            this.f1006a.mo4862a(this.f1009d, this.f1007b);
            C0180gp gpVar2 = this.f1009d;
            gpVar2.f9260f = this;
            this.f1006a = gpVar2.f9257c;
        }
        return this.f1006a;
    }

    /* renamed from: b */
    private final boolean m1275b(int i) {
        boolean z = false;
        if (i == 0) {
            return false;
        }
        View childAt = getChildAt(i - 1);
        View childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof C0181gq)) {
            z = ((C0181gq) childAt).mo752e();
        }
        return (i <= 0 || !(childAt2 instanceof C0181gq)) ? z : ((C0181gq) childAt2).mo751d() | z;
    }

    /* renamed from: a */
    public final boolean mo759a(C0153fp fpVar) {
        return this.f1006a.mo4865a(fpVar, 0);
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C0180gp gpVar = this.f1009d;
        if (gpVar != null) {
            gpVar.mo4833b();
            if (this.f1009d.mo5071c()) {
                this.f1009d.mo5074f();
                this.f1009d.mo5073e();
            }
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0180gp gpVar = this.f1009d;
        if (gpVar != null) {
            gpVar.mo5072d();
        }
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        if (this.f1011i) {
            int childCount = getChildCount();
            int i7 = (i4 - i2) / 2;
            int i8 = this.f9637h;
            int i9 = i3 - i;
            int paddingRight = (i9 - getPaddingRight()) - getPaddingLeft();
            boolean a = C0313ln.m7906a(this);
            int i10 = paddingRight;
            int i11 = 0;
            int i12 = 0;
            for (int i13 = 0; i13 < childCount; i13++) {
                View childAt = getChildAt(i13);
                if (childAt.getVisibility() != 8) {
                    C0183gs gsVar = (C0183gs) childAt.getLayoutParams();
                    if (gsVar.f9418a) {
                        int measuredWidth = childAt.getMeasuredWidth();
                        if (m1275b(i13)) {
                            measuredWidth += i8;
                        }
                        int measuredHeight = childAt.getMeasuredHeight();
                        if (!a) {
                            i5 = (getWidth() - getPaddingRight()) - gsVar.rightMargin;
                            i6 = i5 - measuredWidth;
                        } else {
                            i6 = gsVar.leftMargin + getPaddingLeft();
                            i5 = i6 + measuredWidth;
                        }
                        int i14 = i7 - (measuredHeight / 2);
                        childAt.layout(i6, i14, i5, measuredHeight + i14);
                        i10 -= measuredWidth;
                        i11 = 1;
                    } else {
                        i10 -= (childAt.getMeasuredWidth() + gsVar.leftMargin) + gsVar.rightMargin;
                        m1275b(i13);
                        i12++;
                    }
                }
            }
            if (childCount == 1 && i11 == 0) {
                View childAt2 = getChildAt(0);
                int measuredWidth2 = childAt2.getMeasuredWidth();
                int measuredHeight2 = childAt2.getMeasuredHeight();
                int i15 = (i9 / 2) - (measuredWidth2 / 2);
                int i16 = i7 - (measuredHeight2 / 2);
                childAt2.layout(i15, i16, measuredWidth2 + i15, measuredHeight2 + i16);
                return;
            }
            int i17 = i12 - (i11 ^ 1);
            int i18 = 0;
            int max = Math.max(0, i17 > 0 ? i10 / i17 : 0);
            if (a) {
                int width = getWidth() - getPaddingRight();
                while (i18 < childCount) {
                    View childAt3 = getChildAt(i18);
                    C0183gs gsVar2 = (C0183gs) childAt3.getLayoutParams();
                    if (childAt3.getVisibility() != 8 && !gsVar2.f9418a) {
                        int i19 = width - gsVar2.rightMargin;
                        int measuredWidth3 = childAt3.getMeasuredWidth();
                        int measuredHeight3 = childAt3.getMeasuredHeight();
                        int i20 = i7 - (measuredHeight3 / 2);
                        childAt3.layout(i19 - measuredWidth3, i20, i19, measuredHeight3 + i20);
                        width = i19 - ((measuredWidth3 + gsVar2.leftMargin) + max);
                    }
                    i18++;
                }
                return;
            }
            int paddingLeft = getPaddingLeft();
            while (i18 < childCount) {
                View childAt4 = getChildAt(i18);
                C0183gs gsVar3 = (C0183gs) childAt4.getLayoutParams();
                if (childAt4.getVisibility() != 8 && !gsVar3.f9418a) {
                    int i21 = paddingLeft + gsVar3.leftMargin;
                    int measuredWidth4 = childAt4.getMeasuredWidth();
                    int measuredHeight4 = childAt4.getMeasuredHeight();
                    int i22 = i7 - (measuredHeight4 / 2);
                    childAt4.layout(i21, i22, i21 + measuredWidth4, measuredHeight4 + i22);
                    paddingLeft = i21 + measuredWidth4 + gsVar3.rightMargin + max;
                }
                i18++;
            }
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        boolean z;
        boolean z2;
        int i3;
        int i4;
        boolean z3;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z4;
        ActionMenuItemView actionMenuItemView;
        int i11;
        C0152fo foVar;
        boolean z5 = this.f1011i;
        boolean z6 = View.MeasureSpec.getMode(i) == 1073741824;
        this.f1011i = z6;
        if (z5 != z6) {
            this.f1012j = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (!(!this.f1011i || (foVar = this.f1006a) == null || size == this.f1012j)) {
            this.f1012j = size;
            foVar.mo4878b(true);
        }
        int childCount = getChildCount();
        if (this.f1011i && childCount > 0) {
            int mode = View.MeasureSpec.getMode(i2);
            int size2 = View.MeasureSpec.getSize(i);
            int size3 = View.MeasureSpec.getSize(i2);
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int childMeasureSpec = getChildMeasureSpec(i2, paddingTop, -2);
            int i12 = size2 - (paddingLeft + paddingRight);
            int i13 = this.f1013k;
            int i14 = i12 / i13;
            int i15 = i12 % i13;
            if (i14 == 0) {
                setMeasuredDimension(i12, 0);
                return;
            }
            int i16 = i13 + (i15 / i14);
            int childCount2 = getChildCount();
            int i17 = i14;
            int i18 = 0;
            int i19 = 0;
            int i20 = 0;
            boolean z7 = false;
            int i21 = 0;
            int i22 = 0;
            long j = 0;
            while (i18 < childCount2) {
                View childAt = getChildAt(i18);
                if (childAt.getVisibility() == 8) {
                    i8 = i12;
                    i10 = size3;
                    i9 = paddingTop;
                } else {
                    boolean z8 = childAt instanceof ActionMenuItemView;
                    int i23 = i21 + 1;
                    if (z8) {
                        int i24 = this.f1014l;
                        i10 = size3;
                        z4 = false;
                        childAt.setPadding(i24, 0, i24, 0);
                    } else {
                        i10 = size3;
                        z4 = false;
                    }
                    C0183gs gsVar = (C0183gs) childAt.getLayoutParams();
                    gsVar.f9423f = z4;
                    gsVar.f9420c = z4 ? 1 : 0;
                    gsVar.f9419b = z4;
                    gsVar.f9421d = z4;
                    gsVar.leftMargin = z4;
                    gsVar.rightMargin = z4;
                    gsVar.f9422e = z8 && ((ActionMenuItemView) childAt).mo750c();
                    int i25 = !gsVar.f9418a ? i17 : 1;
                    int i26 = i23;
                    C0183gs gsVar2 = (C0183gs) childAt.getLayoutParams();
                    i8 = i12;
                    i9 = paddingTop;
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - paddingTop, View.MeasureSpec.getMode(childMeasureSpec));
                    if (z8) {
                        actionMenuItemView = (ActionMenuItemView) childAt;
                    } else {
                        actionMenuItemView = null;
                    }
                    boolean z9 = actionMenuItemView != null && actionMenuItemView.mo750c();
                    if (i25 > 0 && (!z9 || i25 >= 2)) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i25 * i16, Integer.MIN_VALUE), makeMeasureSpec);
                        int measuredWidth = childAt.getMeasuredWidth();
                        i11 = measuredWidth / i16;
                        if (measuredWidth % i16 != 0) {
                            i11++;
                        }
                        if (z9 && i11 < 2) {
                            i11 = 2;
                        }
                    } else {
                        i11 = 0;
                    }
                    gsVar2.f9421d = !gsVar2.f9418a && z9;
                    gsVar2.f9419b = i11;
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i11 * i16, 1073741824), makeMeasureSpec);
                    int max = Math.max(i20, i11);
                    if (gsVar.f9421d) {
                        i22++;
                    }
                    boolean z10 = gsVar.f9418a | z7;
                    i17 -= i11;
                    int max2 = Math.max(i19, childAt.getMeasuredHeight());
                    if (i11 == 1) {
                        i20 = max;
                        i19 = max2;
                        z7 = z10;
                        j |= (long) (1 << i18);
                        i21 = i26;
                    } else {
                        i20 = max;
                        i19 = max2;
                        z7 = z10;
                        i21 = i26;
                    }
                }
                i18++;
                size3 = i10;
                paddingTop = i9;
                i12 = i8;
            }
            int i27 = i12;
            int i28 = size3;
            if (z7 && i21 == 2) {
                z = true;
            } else {
                z = false;
            }
            int i29 = i17;
            boolean z11 = false;
            while (true) {
                if (i22 > 0) {
                    if (i29 <= 0) {
                        z2 = z11;
                        break;
                    }
                    int i30 = Integer.MAX_VALUE;
                    int i31 = 0;
                    int i32 = 0;
                    long j2 = 0;
                    while (i31 < childCount2) {
                        C0183gs gsVar3 = (C0183gs) getChildAt(i31).getLayoutParams();
                        boolean z12 = z11;
                        if (gsVar3.f9421d) {
                            int i33 = gsVar3.f9419b;
                            if (i33 < i30) {
                                j2 = 1 << i31;
                                i32 = 1;
                                i30 = i33;
                            } else if (i33 == i30) {
                                j2 |= 1 << i31;
                                i32++;
                            }
                        }
                        i31++;
                        z11 = z12;
                    }
                    z2 = z11;
                    j |= j2;
                    if (i32 > i29) {
                        break;
                    }
                    int i34 = i30 + 1;
                    int i35 = i29;
                    int i36 = 0;
                    while (i36 < childCount2) {
                        View childAt2 = getChildAt(i36);
                        C0183gs gsVar4 = (C0183gs) childAt2.getLayoutParams();
                        int i37 = i19;
                        int i38 = childMeasureSpec;
                        long j3 = (long) (1 << i36);
                        if ((j2 & j3) != 0) {
                            if (z && gsVar4.f9422e && i35 == 1) {
                                int i39 = this.f1014l;
                                childAt2.setPadding(i39 + i16, 0, i39, 0);
                            }
                            gsVar4.f9419b++;
                            gsVar4.f9423f = true;
                            i35--;
                        } else if (gsVar4.f9419b == i34) {
                            j |= j3;
                        }
                        i36++;
                        i19 = i37;
                        childMeasureSpec = i38;
                    }
                    i29 = i35;
                    z11 = true;
                } else {
                    z2 = z11;
                    i3 = childMeasureSpec;
                    i4 = i19;
                    break;
                }
            }
            i3 = childMeasureSpec;
            i4 = i19;
            if (!z7 && i21 == 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (i29 <= 0 || j == 0) {
                i5 = 0;
            } else if (i29 < i21 - 1 || z3 || i20 > 1) {
                float bitCount = (float) Long.bitCount(j);
                if (!z3) {
                    if ((j & 1) == 0) {
                        i5 = 0;
                    } else {
                        i5 = 0;
                        if (!((C0183gs) getChildAt(0).getLayoutParams()).f9422e) {
                            bitCount -= 8.0f;
                        }
                    }
                    int i40 = childCount2 - 1;
                    if ((j & ((long) (1 << i40))) != 0 && !((C0183gs) getChildAt(i40).getLayoutParams()).f9422e) {
                        bitCount -= 8.0f;
                    }
                } else {
                    i5 = 0;
                }
                if (bitCount > 0.0f) {
                    i7 = (int) (((float) (i29 * i16)) / bitCount);
                } else {
                    i7 = 0;
                }
                boolean z13 = z2;
                for (int i41 = 0; i41 < childCount2; i41++) {
                    if ((j & ((long) (1 << i41))) != 0) {
                        View childAt3 = getChildAt(i41);
                        C0183gs gsVar5 = (C0183gs) childAt3.getLayoutParams();
                        if (childAt3 instanceof ActionMenuItemView) {
                            gsVar5.f9420c = i7;
                            gsVar5.f9423f = true;
                            if (i41 == 0 && !gsVar5.f9422e) {
                                gsVar5.leftMargin = (-i7) / 2;
                            }
                            z13 = true;
                        } else if (gsVar5.f9418a) {
                            gsVar5.f9420c = i7;
                            gsVar5.f9423f = true;
                            gsVar5.rightMargin = (-i7) / 2;
                            z13 = true;
                        } else {
                            if (i41 != 0) {
                                gsVar5.leftMargin = i7 / 2;
                            }
                            if (i41 != childCount2 - 1) {
                                gsVar5.rightMargin = i7 / 2;
                            }
                        }
                    }
                }
                z2 = z13;
            } else {
                i5 = 0;
            }
            if (z2) {
                while (i5 < childCount2) {
                    View childAt4 = getChildAt(i5);
                    C0183gs gsVar6 = (C0183gs) childAt4.getLayoutParams();
                    if (gsVar6.f9423f) {
                        i6 = i3;
                        childAt4.measure(View.MeasureSpec.makeMeasureSpec((gsVar6.f9419b * i16) + gsVar6.f9420c, 1073741824), i6);
                    } else {
                        i6 = i3;
                    }
                    i5++;
                    i3 = i6;
                }
            }
            setMeasuredDimension(i27, mode == 1073741824 ? i28 : i4);
            return;
        }
        for (int i42 = 0; i42 < childCount; i42++) {
            C0183gs gsVar7 = (C0183gs) getChildAt(i42).getLayoutParams();
            gsVar7.rightMargin = 0;
            gsVar7.leftMargin = 0;
        }
        super.onMeasure(i, i2);
    }
}
