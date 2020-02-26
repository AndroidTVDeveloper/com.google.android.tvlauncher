package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.tvlauncher.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
public class Toolbar extends ViewGroup {
    private int A;
    private int B;
    private ColorStateList C;
    private ColorStateList D;
    private boolean E;
    private boolean F;
    private final ArrayList G;
    private final int[] H;
    private final gt I;
    private final Runnable J;
    public ActionMenuView a;
    public TextView b;
    public TextView c;
    public ImageButton d;
    public Drawable e;
    public CharSequence f;
    public ImageButton g;
    public View h;
    public int i;
    public int j;
    public int k;
    public ks l;
    public CharSequence m;
    public CharSequence n;
    public final ArrayList o;
    public li p;
    public ld q;
    private ImageView r;
    private Context s;
    private int t;
    private int u;
    private int v;
    private int w;
    private int x;
    private int y;
    private int z;

    public Toolbar(Context context) {
        this(context, null);
    }

    private final int g() {
        ks ksVar = this.l;
        if (ksVar != null) {
            return ksVar.g ? ksVar.b : ksVar.a;
        }
        return 0;
    }

    private final int h() {
        ks ksVar = this.l;
        if (ksVar != null) {
            return ksVar.g ? ksVar.a : ksVar.b;
        }
        return 0;
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.toolbarStyle);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: android.support.v7.widget.Toolbar.a(android.view.View, boolean):void
     arg types: [android.support.v7.widget.ActionMenuView, int]
     candidates:
      android.support.v7.widget.Toolbar.a(android.view.View, int):int
      android.support.v7.widget.Toolbar.a(java.util.List, int):void
      android.support.v7.widget.Toolbar.a(android.view.View, boolean):void */
    public Toolbar(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.B = 8388627;
        this.G = new ArrayList();
        this.o = new ArrayList();
        this.H = new int[2];
        this.I = new la();
        this.J = new lb(this);
        kz a2 = kz.a(getContext(), attributeSet, er.s, i2);
        this.i = a2.e(28, 0);
        this.j = a2.e(19, 0);
        this.B = a2.b(0, this.B);
        this.k = a2.b(2, 48);
        int c2 = a2.c(22, 0);
        c2 = a2.e(27) ? a2.c(27, c2) : c2;
        this.y = c2;
        this.x = c2;
        this.w = c2;
        this.v = c2;
        int c3 = a2.c(25, -1);
        if (c3 >= 0) {
            this.v = c3;
        }
        int c4 = a2.c(24, -1);
        if (c4 >= 0) {
            this.w = c4;
        }
        int c5 = a2.c(26, -1);
        if (c5 >= 0) {
            this.x = c5;
        }
        int c6 = a2.c(23, -1);
        if (c6 >= 0) {
            this.y = c6;
        }
        this.u = a2.d(13, -1);
        int c7 = a2.c(9, Integer.MIN_VALUE);
        int c8 = a2.c(5, Integer.MIN_VALUE);
        int d2 = a2.d(7, 0);
        int d3 = a2.d(8, 0);
        d();
        ks ksVar = this.l;
        ksVar.h = false;
        if (d2 != Integer.MIN_VALUE) {
            ksVar.e = d2;
            ksVar.a = d2;
        }
        if (d3 != Integer.MIN_VALUE) {
            ksVar.f = d3;
            ksVar.b = d3;
        }
        if (!(c7 == Integer.MIN_VALUE && c8 == Integer.MIN_VALUE)) {
            ksVar.a(c7, c8);
        }
        this.z = a2.c(10, Integer.MIN_VALUE);
        this.A = a2.c(6, Integer.MIN_VALUE);
        this.e = a2.a(4);
        this.f = a2.b(3);
        CharSequence b2 = a2.b(21);
        if (!TextUtils.isEmpty(b2)) {
            a(b2);
        }
        CharSequence b3 = a2.b(18);
        if (!TextUtils.isEmpty(b3)) {
            b(b3);
        }
        this.s = getContext();
        a(a2.e(17, 0));
        Drawable a3 = a2.a(16);
        if (a3 != null) {
            b(a3);
        }
        CharSequence b4 = a2.b(15);
        if (!TextUtils.isEmpty(b4)) {
            c(b4);
        }
        Drawable a4 = a2.a(11);
        if (a4 != null) {
            a(a4);
        }
        CharSequence b5 = a2.b(12);
        if (!TextUtils.isEmpty(b5)) {
            if (!TextUtils.isEmpty(b5)) {
                f();
            }
            ImageView imageView = this.r;
            if (imageView != null) {
                imageView.setContentDescription(b5);
            }
        }
        if (a2.e(29)) {
            ColorStateList d4 = a2.d(29);
            this.C = d4;
            TextView textView = this.b;
            if (textView != null) {
                textView.setTextColor(d4);
            }
        }
        if (a2.e(20)) {
            ColorStateList d5 = a2.d(20);
            this.D = d5;
            TextView textView2 = this.c;
            if (textView2 != null) {
                textView2.setTextColor(d5);
            }
        }
        if (a2.e(14)) {
            int e2 = a2.e(14, 0);
            fb fbVar = new fb(getContext());
            if (this.a == null) {
                ActionMenuView actionMenuView = new ActionMenuView(getContext());
                this.a = actionMenuView;
                int i3 = this.t;
                if (actionMenuView.c != i3) {
                    actionMenuView.c = i3;
                    if (i3 != 0) {
                        actionMenuView.b = new ContextThemeWrapper(actionMenuView.getContext(), i3);
                    } else {
                        actionMenuView.b = actionMenuView.getContext();
                    }
                }
                this.a.e = this.I;
                le e3 = e();
                e3.a = (this.k & 112) | 8388613;
                this.a.setLayoutParams(e3);
                a((View) this.a, false);
            }
            ActionMenuView actionMenuView2 = this.a;
            if (actionMenuView2.a == null) {
                fo foVar = (fo) actionMenuView2.a();
                if (this.q == null) {
                    this.q = new ld(this);
                }
                this.a.d.j = true;
                foVar.a(this.q, this.s);
            }
            fbVar.inflate(e2, this.a.a());
        }
        a2.a();
    }

    private final void a(List list, int i2) {
        int f2 = dx.f(this);
        int childCount = getChildCount();
        int a2 = el.a(i2, dx.f(this));
        list.clear();
        if (f2 == 1) {
            for (int i3 = childCount - 1; i3 >= 0; i3--) {
                View childAt = getChildAt(i3);
                le leVar = (le) childAt.getLayoutParams();
                if (leVar.b == 0 && a(childAt) && b(leVar.a) == a2) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt2 = getChildAt(i4);
            le leVar2 = (le) childAt2.getLayoutParams();
            if (leVar2.b == 0 && a(childAt2) && b(leVar2.a) == a2) {
                list.add(childAt2);
            }
        }
    }

    private final void a(View view, boolean z2) {
        le leVar;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            leVar = e();
        } else if (!checkLayoutParams(layoutParams)) {
            leVar = a(layoutParams);
        } else {
            leVar = (le) layoutParams;
        }
        leVar.b = 1;
        if (!z2 || this.h == null) {
            addView(view, leVar);
            return;
        }
        view.setLayoutParams(leVar);
        this.o.add(view);
    }

    /* access modifiers changed from: protected */
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof le);
    }

    public final void d() {
        if (this.l == null) {
            this.l = new ks();
        }
    }

    private final void f() {
        if (this.r == null) {
            this.r = new hf(getContext());
        }
    }

    public final void c() {
        if (this.d == null) {
            this.d = new hd(getContext());
            le e2 = e();
            e2.a = (this.k & 112) | 8388611;
            this.d.setLayoutParams(e2);
        }
    }

    public static final le e() {
        return new le();
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return e();
    }

    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new le(getContext(), attributeSet);
    }

    private static final le a(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof le) {
            return new le((le) layoutParams);
        }
        if (layoutParams instanceof eq) {
            return new le((eq) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new le((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new le(layoutParams);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return a(layoutParams);
    }

    private final int b(int i2) {
        int f2 = dx.f(this);
        int a2 = el.a(i2, f2) & 7;
        if (a2 == 1 || a2 == 3 || a2 == 5) {
            return a2;
        }
        return f2 != 1 ? 3 : 5;
    }

    private final int a(View view, int i2) {
        le leVar = (le) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i3 = i2 > 0 ? (measuredHeight - i2) / 2 : 0;
        int i4 = leVar.a & 112;
        if (!(i4 == 16 || i4 == 48 || i4 == 80)) {
            i4 = this.B & 112;
        }
        if (i4 == 48) {
            return getPaddingTop() - i3;
        }
        if (i4 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - leVar.bottomMargin) - i3;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i5 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        if (i5 >= leVar.topMargin) {
            int i6 = (((height - paddingBottom) - measuredHeight) - i5) - paddingTop;
            if (i6 < leVar.bottomMargin) {
                i5 = Math.max(0, i5 - (leVar.bottomMargin - i6));
            }
        } else {
            i5 = leVar.topMargin;
        }
        return paddingTop + i5;
    }

    private final int j() {
        fo foVar;
        ActionMenuView actionMenuView = this.a;
        if (actionMenuView == null || (foVar = actionMenuView.a) == null || !foVar.hasVisibleItems()) {
            return h();
        }
        return Math.max(h(), Math.max(this.A, 0));
    }

    private final int i() {
        if (b() != null) {
            return Math.max(g(), Math.max(this.z, 0));
        }
        return g();
    }

    private static final int c(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i2 = Build.VERSION.SDK_INT;
        int marginStart = marginLayoutParams.getMarginStart();
        int i3 = Build.VERSION.SDK_INT;
        return marginStart + marginLayoutParams.getMarginEnd();
    }

    public final CharSequence a() {
        ImageButton imageButton = this.d;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public final Drawable b() {
        ImageButton imageButton = this.d;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    private static final int d(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    private final boolean b(View view) {
        return view.getParent() == this || this.o.contains(view);
    }

    private final int a(View view, int i2, int[] iArr, int i3) {
        le leVar = (le) view.getLayoutParams();
        int i4 = leVar.leftMargin - iArr[0];
        int max = i2 + Math.max(0, i4);
        iArr[0] = Math.max(0, -i4);
        int a2 = a(view, i3);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, a2, max + measuredWidth, view.getMeasuredHeight() + a2);
        return max + measuredWidth + leVar.rightMargin;
    }

    private final int b(View view, int i2, int[] iArr, int i3) {
        le leVar = (le) view.getLayoutParams();
        int i4 = leVar.rightMargin - iArr[1];
        int max = i2 - Math.max(0, i4);
        iArr[1] = Math.max(0, -i4);
        int a2 = a(view, i3);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, a2, max, view.getMeasuredHeight() + a2);
        return max - (measuredWidth + leVar.leftMargin);
    }

    private final int a(View view, int i2, int i3, int i4, int i5, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i6 = marginLayoutParams.leftMargin - iArr[0];
        int i7 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i6) + Math.max(0, i7);
        iArr[0] = Math.max(0, -i6);
        iArr[1] = Math.max(0, -i7);
        view.measure(getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight() + max + i3, marginLayoutParams.width), getChildMeasureSpec(i4, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i5, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    private final void a(View view, int i2, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i3, marginLayoutParams.width);
        int childMeasureSpec2 = getChildMeasureSpec(i4, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i5 >= 0) {
            if (mode != 0) {
                i5 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i5);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.J);
    }

    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.F = false;
        }
        if (!this.F) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.F = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.F = false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z3;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int f2 = dx.f(this);
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i20 = width - paddingRight;
        int[] iArr = this.H;
        iArr[1] = 0;
        iArr[0] = 0;
        int h2 = dx.h(this);
        int min = h2 >= 0 ? Math.min(h2, i5 - i3) : 0;
        if (!a(this.d)) {
            i6 = paddingLeft;
            i7 = i20;
        } else if (f2 != 1) {
            i6 = a(this.d, paddingLeft, iArr, min);
            i7 = i20;
        } else {
            i7 = b(this.d, i20, iArr, min);
            i6 = paddingLeft;
        }
        if (a(this.g)) {
            if (f2 != 1) {
                i6 = a(this.g, i6, iArr, min);
            } else {
                i7 = b(this.g, i7, iArr, min);
            }
        }
        if (a(this.a)) {
            if (f2 != 1) {
                i7 = b(this.a, i7, iArr, min);
            } else {
                i6 = a(this.a, i6, iArr, min);
            }
        }
        if (dx.f(this) == 1) {
            i8 = j();
        } else {
            i8 = i();
        }
        if (dx.f(this) == 1) {
            i9 = i();
        } else {
            i9 = j();
        }
        int i21 = paddingRight;
        iArr[0] = Math.max(0, i8 - i6);
        iArr[1] = Math.max(0, i9 - (i20 - i7));
        int max = Math.max(i6, i8);
        int min2 = Math.min(i7, i20 - i9);
        if (a(this.h)) {
            if (f2 != 1) {
                max = a(this.h, max, iArr, min);
            } else {
                min2 = b(this.h, min2, iArr, min);
            }
        }
        if (a(this.r)) {
            if (f2 != 1) {
                max = a(this.r, max, iArr, min);
            } else {
                min2 = b(this.r, min2, iArr, min);
            }
        }
        boolean a2 = a(this.b);
        boolean a3 = a(this.c);
        if (a2) {
            le leVar = (le) this.b.getLayoutParams();
            i10 = leVar.bottomMargin + leVar.topMargin + this.b.getMeasuredHeight();
        } else {
            i10 = 0;
        }
        if (a3) {
            le leVar2 = (le) this.c.getLayoutParams();
            i11 = width;
            i10 += leVar2.topMargin + this.c.getMeasuredHeight() + leVar2.bottomMargin;
        } else {
            i11 = width;
        }
        if (a2 || a3) {
            TextView textView = !a2 ? this.c : this.b;
            TextView textView2 = !a3 ? this.b : this.c;
            le leVar3 = (le) textView.getLayoutParams();
            le leVar4 = (le) textView2.getLayoutParams();
            if ((!a2 || this.b.getMeasuredWidth() <= 0) && (!a3 || this.c.getMeasuredWidth() <= 0)) {
                z3 = false;
            } else {
                z3 = true;
            }
            i13 = paddingLeft;
            int i22 = this.B & 112;
            i12 = min;
            if (i22 == 48) {
                i14 = min2;
                i15 = getPaddingTop() + leVar3.topMargin + this.x;
            } else if (i22 != 80) {
                int i23 = (((height - paddingTop) - paddingBottom) - i10) / 2;
                i14 = min2;
                if (i23 < leVar3.topMargin + this.x) {
                    i23 = leVar3.topMargin + this.x;
                } else {
                    int i24 = (((height - paddingBottom) - i10) - i23) - paddingTop;
                    if (i24 < leVar3.bottomMargin + this.y) {
                        i23 = Math.max(0, i23 - ((leVar4.bottomMargin + this.y) - i24));
                    }
                }
                i15 = paddingTop + i23;
            } else {
                i14 = min2;
                i15 = (((height - paddingBottom) - leVar4.bottomMargin) - this.y) - i10;
            }
            if (f2 != 1) {
                int i25 = (z3 ? this.v : 0) - iArr[0];
                max += Math.max(0, i25);
                iArr[0] = Math.max(0, -i25);
                if (a2) {
                    int measuredWidth = this.b.getMeasuredWidth() + max;
                    int measuredHeight = this.b.getMeasuredHeight() + i15;
                    this.b.layout(max, i15, measuredWidth, measuredHeight);
                    i18 = measuredWidth + this.w;
                    i15 = measuredHeight + ((le) this.b.getLayoutParams()).bottomMargin;
                } else {
                    i18 = max;
                }
                if (a3) {
                    le leVar5 = (le) this.c.getLayoutParams();
                    int i26 = i15 + leVar5.topMargin;
                    int measuredWidth2 = this.c.getMeasuredWidth() + max;
                    this.c.layout(max, i26, measuredWidth2, this.c.getMeasuredHeight() + i26);
                    i19 = measuredWidth2 + this.w;
                    int i27 = leVar5.bottomMargin;
                } else {
                    i19 = max;
                }
                if (z3) {
                    max = Math.max(i18, i19);
                    min2 = i14;
                } else {
                    min2 = i14;
                }
            } else {
                int i28 = (z3 ? this.v : 0) - iArr[1];
                min2 = i14 - Math.max(0, i28);
                iArr[1] = Math.max(0, -i28);
                if (a2) {
                    int measuredWidth3 = min2 - this.b.getMeasuredWidth();
                    int measuredHeight2 = this.b.getMeasuredHeight() + i15;
                    this.b.layout(measuredWidth3, i15, min2, measuredHeight2);
                    i16 = measuredWidth3 - this.w;
                    i15 = measuredHeight2 + ((le) this.b.getLayoutParams()).bottomMargin;
                } else {
                    i16 = min2;
                }
                if (a3) {
                    le leVar6 = (le) this.c.getLayoutParams();
                    int i29 = i15 + leVar6.topMargin;
                    this.c.layout(min2 - this.c.getMeasuredWidth(), i29, min2, this.c.getMeasuredHeight() + i29);
                    i17 = min2 - this.w;
                    int i30 = leVar6.bottomMargin;
                } else {
                    i17 = min2;
                }
                if (z3) {
                    min2 = Math.min(i16, i17);
                }
            }
        } else {
            i13 = paddingLeft;
            i12 = min;
        }
        a(this.G, 3);
        int size = this.G.size();
        for (int i31 = 0; i31 < size; i31++) {
            max = a((View) this.G.get(i31), max, iArr, i12);
        }
        int i32 = i12;
        a(this.G, 5);
        int size2 = this.G.size();
        for (int i33 = 0; i33 < size2; i33++) {
            min2 = b((View) this.G.get(i33), min2, iArr, i32);
        }
        a(this.G, 1);
        ArrayList arrayList = this.G;
        int i34 = iArr[0];
        int i35 = iArr[1];
        int size3 = arrayList.size();
        int i36 = i35;
        int i37 = i34;
        int i38 = 0;
        int i39 = 0;
        while (i38 < size3) {
            View view = (View) arrayList.get(i38);
            le leVar7 = (le) view.getLayoutParams();
            int i40 = leVar7.leftMargin - i37;
            int i41 = leVar7.rightMargin - i36;
            int max2 = Math.max(0, i40);
            int max3 = Math.max(0, i41);
            int max4 = Math.max(0, -i40);
            int max5 = Math.max(0, -i41);
            i39 += max2 + view.getMeasuredWidth() + max3;
            i38++;
            i36 = max5;
            i37 = max4;
        }
        int i42 = (i13 + (((i11 - i13) - i21) / 2)) - (i39 / 2);
        int i43 = i39 + i42;
        if (i42 >= max) {
            max = i43 > min2 ? i42 - (i43 - min2) : i42;
        }
        int size4 = this.G.size();
        for (int i44 = 0; i44 < size4; i44++) {
            max = a((View) this.G.get(i44), max, iArr, i32);
        }
        this.G.clear();
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int[] iArr = this.H;
        char a2 = ln.a(this);
        char c2 = a2 ^ 1;
        int i10 = 0;
        if (a(this.d)) {
            a(this.d, i2, 0, i3, this.u);
            i6 = this.d.getMeasuredWidth() + c(this.d);
            i4 = Math.max(0, this.d.getMeasuredHeight() + d(this.d));
            i5 = View.combineMeasuredStates(0, this.d.getMeasuredState());
        } else {
            i6 = 0;
            i5 = 0;
            i4 = 0;
        }
        if (a(this.g)) {
            a(this.g, i2, 0, i3, this.u);
            i6 = this.g.getMeasuredWidth() + c(this.g);
            i4 = Math.max(i4, this.g.getMeasuredHeight() + d(this.g));
            i5 = View.combineMeasuredStates(i5, this.g.getMeasuredState());
        }
        int i11 = i();
        int max = Math.max(i11, i6);
        iArr[a2] = Math.max(0, i11 - i6);
        if (a(this.a)) {
            a(this.a, i2, max, i3, this.u);
            i7 = this.a.getMeasuredWidth() + c(this.a);
            i4 = Math.max(i4, this.a.getMeasuredHeight() + d(this.a));
            i5 = View.combineMeasuredStates(i5, this.a.getMeasuredState());
        } else {
            i7 = 0;
        }
        int j2 = j();
        int max2 = max + Math.max(j2, i7);
        iArr[c2] = Math.max(0, j2 - i7);
        if (a(this.h)) {
            max2 += a(this.h, i2, max2, i3, 0, iArr);
            i4 = Math.max(i4, this.h.getMeasuredHeight() + d(this.h));
            i5 = View.combineMeasuredStates(i5, this.h.getMeasuredState());
        }
        if (a(this.r)) {
            max2 += a(this.r, i2, max2, i3, 0, iArr);
            i4 = Math.max(i4, this.r.getMeasuredHeight() + d(this.r));
            i5 = View.combineMeasuredStates(i5, this.r.getMeasuredState());
        }
        int childCount = getChildCount();
        int i12 = max2;
        int i13 = i5;
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (((le) childAt.getLayoutParams()).b == 0 && a(childAt)) {
                View view = childAt;
                i12 += a(childAt, i2, i12, i3, 0, iArr);
                i4 = Math.max(i4, view.getMeasuredHeight() + d(view));
                i13 = View.combineMeasuredStates(i13, view.getMeasuredState());
            }
        }
        int i15 = this.x + this.y;
        int i16 = this.v + this.w;
        if (a(this.b)) {
            a(this.b, i2, i12 + i16, i3, i15, iArr);
            i10 = this.b.getMeasuredWidth() + c(this.b);
            int measuredHeight = this.b.getMeasuredHeight() + d(this.b);
            i8 = View.combineMeasuredStates(i13, this.b.getMeasuredState());
            i9 = measuredHeight;
        } else {
            i8 = i13;
            i9 = 0;
        }
        if (a(this.c)) {
            i10 = Math.max(i10, a(this.c, i2, i12 + i16, i3, i9 + i15, iArr));
            i9 += this.c.getMeasuredHeight() + d(this.c);
            i8 = View.combineMeasuredStates(i8, this.c.getMeasuredState());
        }
        int max3 = Math.max(i4, i9);
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        setMeasuredDimension(View.resolveSizeAndState(Math.max(i12 + i10 + paddingLeft + paddingRight, getSuggestedMinimumWidth()), i2, -16777216 & i8), View.resolveSizeAndState(Math.max(max3 + paddingTop + paddingBottom, getSuggestedMinimumHeight()), i3, i8 << 16));
    }

    /* access modifiers changed from: protected */
    public final void onRestoreInstanceState(Parcelable parcelable) {
        fo foVar;
        MenuItem findItem;
        if (!(parcelable instanceof lg)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        lg lgVar = (lg) parcelable;
        super.onRestoreInstanceState(lgVar.b);
        ActionMenuView actionMenuView = this.a;
        if (actionMenuView != null) {
            foVar = actionMenuView.a;
        } else {
            foVar = null;
        }
        int i2 = lgVar.c;
        if (!(i2 == 0 || this.q == null || foVar == null || (findItem = foVar.findItem(i2)) == null)) {
            findItem.expandActionView();
        }
        if (lgVar.d) {
            removeCallbacks(this.J);
            post(this.J);
        }
    }

    public final void onRtlPropertiesChanged(int i2) {
        int i3 = Build.VERSION.SDK_INT;
        super.onRtlPropertiesChanged(i2);
        d();
        ks ksVar = this.l;
        boolean z2 = true;
        if (i2 != 1) {
            z2 = false;
        }
        if (z2 != ksVar.g) {
            ksVar.g = z2;
            if (!ksVar.h) {
                ksVar.a = ksVar.e;
                ksVar.b = ksVar.f;
            } else if (!z2) {
                int i4 = ksVar.c;
                if (i4 == Integer.MIN_VALUE) {
                    i4 = ksVar.e;
                }
                ksVar.a = i4;
                int i5 = ksVar.d;
                if (i5 == Integer.MIN_VALUE) {
                    i5 = ksVar.f;
                }
                ksVar.b = i5;
            } else {
                int i6 = ksVar.d;
                if (i6 == Integer.MIN_VALUE) {
                    i6 = ksVar.e;
                }
                ksVar.a = i6;
                int i7 = ksVar.c;
                if (i7 == Integer.MIN_VALUE) {
                    i7 = ksVar.f;
                }
                ksVar.b = i7;
            }
        }
    }

    /* access modifiers changed from: protected */
    public final Parcelable onSaveInstanceState() {
        gp gpVar;
        fp fpVar;
        lg lgVar = new lg(super.onSaveInstanceState());
        ld ldVar = this.q;
        if (!(ldVar == null || (fpVar = ldVar.a) == null)) {
            lgVar.c = fpVar.a;
        }
        ActionMenuView actionMenuView = this.a;
        boolean z2 = false;
        if (!(actionMenuView == null || (gpVar = actionMenuView.d) == null || !gpVar.c())) {
            z2 = true;
        }
        lgVar.d = z2;
        return lgVar;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.E = false;
        }
        if (!this.E) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.E = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.E = false;
        }
        return true;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: android.support.v7.widget.Toolbar.a(android.view.View, boolean):void
     arg types: [android.widget.ImageView, int]
     candidates:
      android.support.v7.widget.Toolbar.a(android.view.View, int):int
      android.support.v7.widget.Toolbar.a(java.util.List, int):void
      android.support.v7.widget.Toolbar.a(android.view.View, boolean):void */
    public final void a(Drawable drawable) {
        if (drawable != null) {
            f();
            if (!b(this.r)) {
                a((View) this.r, true);
            }
        } else {
            ImageView imageView = this.r;
            if (imageView != null && b(imageView)) {
                removeView(this.r);
                this.o.remove(this.r);
            }
        }
        ImageView imageView2 = this.r;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public final void c(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        ImageButton imageButton = this.d;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: android.support.v7.widget.Toolbar.a(android.view.View, boolean):void
     arg types: [android.widget.ImageButton, int]
     candidates:
      android.support.v7.widget.Toolbar.a(android.view.View, int):int
      android.support.v7.widget.Toolbar.a(java.util.List, int):void
      android.support.v7.widget.Toolbar.a(android.view.View, boolean):void */
    public final void b(Drawable drawable) {
        if (drawable != null) {
            c();
            if (!b(this.d)) {
                a((View) this.d, true);
            }
        } else {
            ImageButton imageButton = this.d;
            if (imageButton != null && b(imageButton)) {
                removeView(this.d);
                this.o.remove(this.d);
            }
        }
        ImageButton imageButton2 = this.d;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public final void a(int i2) {
        if (this.t != i2) {
            this.t = i2;
            if (i2 != 0) {
                this.s = new ContextThemeWrapper(getContext(), i2);
            } else {
                this.s = getContext();
            }
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: android.support.v7.widget.Toolbar.a(android.view.View, boolean):void
     arg types: [android.widget.TextView, int]
     candidates:
      android.support.v7.widget.Toolbar.a(android.view.View, int):int
      android.support.v7.widget.Toolbar.a(java.util.List, int):void
      android.support.v7.widget.Toolbar.a(android.view.View, boolean):void */
    public final void b(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.c;
            if (textView != null && b(textView)) {
                removeView(this.c);
                this.o.remove(this.c);
            }
        } else {
            if (this.c == null) {
                Context context = getContext();
                hk hkVar = new hk(context);
                this.c = hkVar;
                hkVar.setSingleLine();
                this.c.setEllipsize(TextUtils.TruncateAt.END);
                int i2 = this.j;
                if (i2 != 0) {
                    this.c.setTextAppearance(context, i2);
                }
                ColorStateList colorStateList = this.D;
                if (colorStateList != null) {
                    this.c.setTextColor(colorStateList);
                }
            }
            if (!b(this.c)) {
                a((View) this.c, true);
            }
        }
        TextView textView2 = this.c;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.n = charSequence;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: android.support.v7.widget.Toolbar.a(android.view.View, boolean):void
     arg types: [android.widget.TextView, int]
     candidates:
      android.support.v7.widget.Toolbar.a(android.view.View, int):int
      android.support.v7.widget.Toolbar.a(java.util.List, int):void
      android.support.v7.widget.Toolbar.a(android.view.View, boolean):void */
    public final void a(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.b;
            if (textView != null && b(textView)) {
                removeView(this.b);
                this.o.remove(this.b);
            }
        } else {
            if (this.b == null) {
                Context context = getContext();
                hk hkVar = new hk(context);
                this.b = hkVar;
                hkVar.setSingleLine();
                this.b.setEllipsize(TextUtils.TruncateAt.END);
                int i2 = this.i;
                if (i2 != 0) {
                    this.b.setTextAppearance(context, i2);
                }
                ColorStateList colorStateList = this.C;
                if (colorStateList != null) {
                    this.b.setTextColor(colorStateList);
                }
            }
            if (!b(this.b)) {
                a((View) this.b, true);
            }
        }
        TextView textView2 = this.b;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.m = charSequence;
    }

    private final boolean a(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }
}
