package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.support.v7.view.menu.ActionMenuItemView;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

/* compiled from: PG */
public class ActionMenuView extends is implements fn, fx {
    public fo a;
    public Context b;
    public int c;
    public gp d;
    public gt e;
    private boolean i;
    private int j;
    private int k;
    private int l;

    public ActionMenuView(Context context) {
        this(context, null);
    }

    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        d();
        float f = context.getResources().getDisplayMetrics().density;
        this.k = (int) (56.0f * f);
        this.l = (int) (f * 4.0f);
        this.b = context;
        this.c = 0;
    }

    /* access modifiers changed from: protected */
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof gs;
    }

    public static final gs c() {
        gs gsVar = new gs();
        gsVar.h = 16;
        return gsVar;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ ir b() {
        return c();
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return c();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final gs generateLayoutParams(AttributeSet attributeSet) {
        return new gs(getContext(), attributeSet);
    }

    public static final gs b(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            return c();
        }
        gs gsVar = layoutParams instanceof gs ? new gs((gs) layoutParams) : new gs(layoutParams);
        if (gsVar.h <= 0) {
            gsVar.h = 16;
        }
        return gsVar;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ ir a(ViewGroup.LayoutParams layoutParams) {
        return b(layoutParams);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return b(layoutParams);
    }

    public final Menu a() {
        if (this.a == null) {
            Context context = getContext();
            fo foVar = new fo(context);
            this.a = foVar;
            foVar.k();
            gp gpVar = new gp(context);
            this.d = gpVar;
            gpVar.h = true;
            gpVar.i = true;
            gpVar.e = new gr();
            this.a.a(this.d, this.b);
            gp gpVar2 = this.d;
            gpVar2.f = this;
            this.a = gpVar2.c;
        }
        return this.a;
    }

    private final boolean b(int i2) {
        boolean z = false;
        if (i2 == 0) {
            return false;
        }
        View childAt = getChildAt(i2 - 1);
        View childAt2 = getChildAt(i2);
        if (i2 < getChildCount() && (childAt instanceof gq)) {
            z = ((gq) childAt).e();
        }
        return (i2 <= 0 || !(childAt2 instanceof gq)) ? z : ((gq) childAt2).d() | z;
    }

    public final boolean a(fp fpVar) {
        return this.a.a(fpVar, 0);
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        gp gpVar = this.d;
        if (gpVar != null) {
            gpVar.b();
            if (this.d.c()) {
                this.d.f();
                this.d.e();
            }
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        gp gpVar = this.d;
        if (gpVar != null) {
            gpVar.d();
        }
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        if (this.i) {
            int childCount = getChildCount();
            int i8 = (i5 - i3) / 2;
            int i9 = this.h;
            int i10 = i4 - i2;
            int paddingRight = (i10 - getPaddingRight()) - getPaddingLeft();
            boolean a2 = ln.a(this);
            int i11 = paddingRight;
            int i12 = 0;
            int i13 = 0;
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt = getChildAt(i14);
                if (childAt.getVisibility() != 8) {
                    gs gsVar = (gs) childAt.getLayoutParams();
                    if (gsVar.a) {
                        int measuredWidth = childAt.getMeasuredWidth();
                        if (b(i14)) {
                            measuredWidth += i9;
                        }
                        int measuredHeight = childAt.getMeasuredHeight();
                        if (!a2) {
                            i6 = (getWidth() - getPaddingRight()) - gsVar.rightMargin;
                            i7 = i6 - measuredWidth;
                        } else {
                            i7 = gsVar.leftMargin + getPaddingLeft();
                            i6 = i7 + measuredWidth;
                        }
                        int i15 = i8 - (measuredHeight / 2);
                        childAt.layout(i7, i15, i6, measuredHeight + i15);
                        i11 -= measuredWidth;
                        i12 = 1;
                    } else {
                        i11 -= (childAt.getMeasuredWidth() + gsVar.leftMargin) + gsVar.rightMargin;
                        b(i14);
                        i13++;
                    }
                }
            }
            if (childCount == 1 && i12 == 0) {
                View childAt2 = getChildAt(0);
                int measuredWidth2 = childAt2.getMeasuredWidth();
                int measuredHeight2 = childAt2.getMeasuredHeight();
                int i16 = (i10 / 2) - (measuredWidth2 / 2);
                int i17 = i8 - (measuredHeight2 / 2);
                childAt2.layout(i16, i17, measuredWidth2 + i16, measuredHeight2 + i17);
                return;
            }
            int i18 = i13 - (i12 ^ 1);
            int i19 = 0;
            int max = Math.max(0, i18 > 0 ? i11 / i18 : 0);
            if (a2) {
                int width = getWidth() - getPaddingRight();
                while (i19 < childCount) {
                    View childAt3 = getChildAt(i19);
                    gs gsVar2 = (gs) childAt3.getLayoutParams();
                    if (childAt3.getVisibility() != 8 && !gsVar2.a) {
                        int i20 = width - gsVar2.rightMargin;
                        int measuredWidth3 = childAt3.getMeasuredWidth();
                        int measuredHeight3 = childAt3.getMeasuredHeight();
                        int i21 = i8 - (measuredHeight3 / 2);
                        childAt3.layout(i20 - measuredWidth3, i21, i20, measuredHeight3 + i21);
                        width = i20 - ((measuredWidth3 + gsVar2.leftMargin) + max);
                    }
                    i19++;
                }
                return;
            }
            int paddingLeft = getPaddingLeft();
            while (i19 < childCount) {
                View childAt4 = getChildAt(i19);
                gs gsVar3 = (gs) childAt4.getLayoutParams();
                if (childAt4.getVisibility() != 8 && !gsVar3.a) {
                    int i22 = paddingLeft + gsVar3.leftMargin;
                    int measuredWidth4 = childAt4.getMeasuredWidth();
                    int measuredHeight4 = childAt4.getMeasuredHeight();
                    int i23 = i8 - (measuredHeight4 / 2);
                    childAt4.layout(i22, i23, i22 + measuredWidth4, measuredHeight4 + i23);
                    paddingLeft = i22 + measuredWidth4 + gsVar3.rightMargin + max;
                }
                i19++;
            }
            return;
        }
        super.onLayout(z, i2, i3, i4, i5);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i2, int i3) {
        boolean z;
        boolean z2;
        int i4;
        int i5;
        boolean z3;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        boolean z4;
        ActionMenuItemView actionMenuItemView;
        int i12;
        fo foVar;
        boolean z5 = this.i;
        boolean z6 = View.MeasureSpec.getMode(i2) == 1073741824;
        this.i = z6;
        if (z5 != z6) {
            this.j = 0;
        }
        int size = View.MeasureSpec.getSize(i2);
        if (!(!this.i || (foVar = this.a) == null || size == this.j)) {
            this.j = size;
            foVar.b(true);
        }
        int childCount = getChildCount();
        if (this.i && childCount > 0) {
            int mode = View.MeasureSpec.getMode(i3);
            int size2 = View.MeasureSpec.getSize(i2);
            int size3 = View.MeasureSpec.getSize(i3);
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int childMeasureSpec = getChildMeasureSpec(i3, paddingTop, -2);
            int i13 = size2 - (paddingLeft + paddingRight);
            int i14 = this.k;
            int i15 = i13 / i14;
            int i16 = i13 % i14;
            if (i15 == 0) {
                setMeasuredDimension(i13, 0);
                return;
            }
            int i17 = i14 + (i16 / i15);
            int childCount2 = getChildCount();
            int i18 = i15;
            int i19 = 0;
            int i20 = 0;
            int i21 = 0;
            boolean z7 = false;
            int i22 = 0;
            int i23 = 0;
            long j2 = 0;
            while (i19 < childCount2) {
                View childAt = getChildAt(i19);
                if (childAt.getVisibility() == 8) {
                    i9 = i13;
                    i11 = size3;
                    i10 = paddingTop;
                } else {
                    boolean z8 = childAt instanceof ActionMenuItemView;
                    int i24 = i22 + 1;
                    if (z8) {
                        int i25 = this.l;
                        i11 = size3;
                        z4 = false;
                        childAt.setPadding(i25, 0, i25, 0);
                    } else {
                        i11 = size3;
                        z4 = false;
                    }
                    gs gsVar = (gs) childAt.getLayoutParams();
                    gsVar.f = z4;
                    gsVar.c = z4 ? 1 : 0;
                    gsVar.b = z4;
                    gsVar.d = z4;
                    gsVar.leftMargin = z4;
                    gsVar.rightMargin = z4;
                    gsVar.e = z8 && ((ActionMenuItemView) childAt).c();
                    int i26 = !gsVar.a ? i18 : 1;
                    int i27 = i24;
                    gs gsVar2 = (gs) childAt.getLayoutParams();
                    i9 = i13;
                    i10 = paddingTop;
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - paddingTop, View.MeasureSpec.getMode(childMeasureSpec));
                    if (z8) {
                        actionMenuItemView = (ActionMenuItemView) childAt;
                    } else {
                        actionMenuItemView = null;
                    }
                    boolean z9 = actionMenuItemView != null && actionMenuItemView.c();
                    if (i26 > 0 && (!z9 || i26 >= 2)) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i26 * i17, Integer.MIN_VALUE), makeMeasureSpec);
                        int measuredWidth = childAt.getMeasuredWidth();
                        i12 = measuredWidth / i17;
                        if (measuredWidth % i17 != 0) {
                            i12++;
                        }
                        if (z9 && i12 < 2) {
                            i12 = 2;
                        }
                    } else {
                        i12 = 0;
                    }
                    gsVar2.d = !gsVar2.a && z9;
                    gsVar2.b = i12;
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i12 * i17, 1073741824), makeMeasureSpec);
                    int max = Math.max(i21, i12);
                    if (gsVar.d) {
                        i23++;
                    }
                    boolean z10 = gsVar.a | z7;
                    i18 -= i12;
                    int max2 = Math.max(i20, childAt.getMeasuredHeight());
                    if (i12 == 1) {
                        i21 = max;
                        i20 = max2;
                        z7 = z10;
                        j2 |= (long) (1 << i19);
                        i22 = i27;
                    } else {
                        i21 = max;
                        i20 = max2;
                        z7 = z10;
                        i22 = i27;
                    }
                }
                i19++;
                size3 = i11;
                paddingTop = i10;
                i13 = i9;
            }
            int i28 = i13;
            int i29 = size3;
            if (z7 && i22 == 2) {
                z = true;
            } else {
                z = false;
            }
            int i30 = i18;
            boolean z11 = false;
            while (true) {
                if (i23 > 0) {
                    if (i30 <= 0) {
                        z2 = z11;
                        break;
                    }
                    int i31 = Integer.MAX_VALUE;
                    int i32 = 0;
                    int i33 = 0;
                    long j3 = 0;
                    while (i32 < childCount2) {
                        gs gsVar3 = (gs) getChildAt(i32).getLayoutParams();
                        boolean z12 = z11;
                        if (gsVar3.d) {
                            int i34 = gsVar3.b;
                            if (i34 < i31) {
                                j3 = 1 << i32;
                                i33 = 1;
                                i31 = i34;
                            } else if (i34 == i31) {
                                j3 |= 1 << i32;
                                i33++;
                            }
                        }
                        i32++;
                        z11 = z12;
                    }
                    z2 = z11;
                    j2 |= j3;
                    if (i33 > i30) {
                        break;
                    }
                    int i35 = i31 + 1;
                    int i36 = i30;
                    int i37 = 0;
                    while (i37 < childCount2) {
                        View childAt2 = getChildAt(i37);
                        gs gsVar4 = (gs) childAt2.getLayoutParams();
                        int i38 = i20;
                        int i39 = childMeasureSpec;
                        long j4 = (long) (1 << i37);
                        if ((j3 & j4) != 0) {
                            if (z && gsVar4.e && i36 == 1) {
                                int i40 = this.l;
                                childAt2.setPadding(i40 + i17, 0, i40, 0);
                            }
                            gsVar4.b++;
                            gsVar4.f = true;
                            i36--;
                        } else if (gsVar4.b == i35) {
                            j2 |= j4;
                        }
                        i37++;
                        i20 = i38;
                        childMeasureSpec = i39;
                    }
                    i30 = i36;
                    z11 = true;
                } else {
                    z2 = z11;
                    i4 = childMeasureSpec;
                    i5 = i20;
                    break;
                }
            }
            i4 = childMeasureSpec;
            i5 = i20;
            if (!z7 && i22 == 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (i30 <= 0 || j2 == 0) {
                i6 = 0;
            } else if (i30 < i22 - 1 || z3 || i21 > 1) {
                float bitCount = (float) Long.bitCount(j2);
                if (!z3) {
                    if ((j2 & 1) == 0) {
                        i6 = 0;
                    } else {
                        i6 = 0;
                        if (!((gs) getChildAt(0).getLayoutParams()).e) {
                            bitCount -= 8.0f;
                        }
                    }
                    int i41 = childCount2 - 1;
                    if ((j2 & ((long) (1 << i41))) != 0 && !((gs) getChildAt(i41).getLayoutParams()).e) {
                        bitCount -= 8.0f;
                    }
                } else {
                    i6 = 0;
                }
                if (bitCount > 0.0f) {
                    i8 = (int) (((float) (i30 * i17)) / bitCount);
                } else {
                    i8 = 0;
                }
                boolean z13 = z2;
                for (int i42 = 0; i42 < childCount2; i42++) {
                    if ((j2 & ((long) (1 << i42))) != 0) {
                        View childAt3 = getChildAt(i42);
                        gs gsVar5 = (gs) childAt3.getLayoutParams();
                        if (childAt3 instanceof ActionMenuItemView) {
                            gsVar5.c = i8;
                            gsVar5.f = true;
                            if (i42 == 0 && !gsVar5.e) {
                                gsVar5.leftMargin = (-i8) / 2;
                            }
                            z13 = true;
                        } else if (gsVar5.a) {
                            gsVar5.c = i8;
                            gsVar5.f = true;
                            gsVar5.rightMargin = (-i8) / 2;
                            z13 = true;
                        } else {
                            if (i42 != 0) {
                                gsVar5.leftMargin = i8 / 2;
                            }
                            if (i42 != childCount2 - 1) {
                                gsVar5.rightMargin = i8 / 2;
                            }
                        }
                    }
                }
                z2 = z13;
            } else {
                i6 = 0;
            }
            if (z2) {
                while (i6 < childCount2) {
                    View childAt4 = getChildAt(i6);
                    gs gsVar6 = (gs) childAt4.getLayoutParams();
                    if (gsVar6.f) {
                        i7 = i4;
                        childAt4.measure(View.MeasureSpec.makeMeasureSpec((gsVar6.b * i17) + gsVar6.c, 1073741824), i7);
                    } else {
                        i7 = i4;
                    }
                    i6++;
                    i4 = i7;
                }
            }
            setMeasuredDimension(i28, mode == 1073741824 ? i29 : i5);
            return;
        }
        for (int i43 = 0; i43 < childCount; i43++) {
            gs gsVar7 = (gs) getChildAt(i43).getLayoutParams();
            gsVar7.rightMargin = 0;
            gsVar7.leftMargin = 0;
        }
        super.onMeasure(i2, i3);
    }
}
