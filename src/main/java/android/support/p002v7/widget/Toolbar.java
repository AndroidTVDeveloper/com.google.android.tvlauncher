package android.support.p002v7.widget;

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

/* renamed from: android.support.v7.widget.Toolbar */
/* compiled from: PG */
public class Toolbar extends ViewGroup {

    /* renamed from: A */
    private int f1129A;

    /* renamed from: B */
    private int f1130B;

    /* renamed from: C */
    private ColorStateList f1131C;

    /* renamed from: D */
    private ColorStateList f1132D;

    /* renamed from: E */
    private boolean f1133E;

    /* renamed from: F */
    private boolean f1134F;

    /* renamed from: G */
    private final ArrayList f1135G;

    /* renamed from: H */
    private final int[] f1136H;

    /* renamed from: I */
    private final C0184gt f1137I;

    /* renamed from: J */
    private final Runnable f1138J;

    /* renamed from: a */
    public ActionMenuView f1139a;

    /* renamed from: b */
    public TextView f1140b;

    /* renamed from: c */
    public TextView f1141c;

    /* renamed from: d */
    public ImageButton f1142d;

    /* renamed from: e */
    public Drawable f1143e;

    /* renamed from: f */
    public CharSequence f1144f;

    /* renamed from: g */
    public ImageButton f1145g;

    /* renamed from: h */
    public View f1146h;

    /* renamed from: i */
    public int f1147i;

    /* renamed from: j */
    public int f1148j;

    /* renamed from: k */
    public int f1149k;

    /* renamed from: l */
    public C0291ks f1150l;

    /* renamed from: m */
    public CharSequence f1151m;

    /* renamed from: n */
    public CharSequence f1152n;

    /* renamed from: o */
    public final ArrayList f1153o;

    /* renamed from: p */
    public C0308li f1154p;

    /* renamed from: q */
    public C0303ld f1155q;

    /* renamed from: r */
    private ImageView f1156r;

    /* renamed from: s */
    private Context f1157s;

    /* renamed from: t */
    private int f1158t;

    /* renamed from: u */
    private int f1159u;

    /* renamed from: v */
    private int f1160v;

    /* renamed from: w */
    private int f1161w;

    /* renamed from: x */
    private int f1162x;

    /* renamed from: y */
    private int f1163y;

    /* renamed from: z */
    private int f1164z;

    public Toolbar(Context context) {
        this(context, null);
    }

    /* renamed from: g */
    private final int m1383g() {
        C0291ks ksVar = this.f1150l;
        if (ksVar != null) {
            return ksVar.f9819g ? ksVar.f9814b : ksVar.f9813a;
        }
        return 0;
    }

    /* renamed from: h */
    private final int m1384h() {
        C0291ks ksVar = this.f1150l;
        if (ksVar != null) {
            return ksVar.f9819g ? ksVar.f9813a : ksVar.f9814b;
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
    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1130B = 8388627;
        this.f1135G = new ArrayList();
        this.f1153o = new ArrayList();
        this.f1136H = new int[2];
        this.f1137I = new C0300la();
        this.f1138J = new C0301lb(this);
        C0298kz a = C0298kz.m7865a(getContext(), attributeSet, C0128er.f9181s, i);
        this.f1147i = a.mo5521e(28, 0);
        this.f1148j = a.mo5521e(19, 0);
        this.f1130B = a.mo5515b(0, this.f1130B);
        this.f1149k = a.mo5515b(2, 48);
        int c = a.mo5517c(22, 0);
        c = a.mo5522e(27) ? a.mo5517c(27, c) : c;
        this.f1163y = c;
        this.f1162x = c;
        this.f1161w = c;
        this.f1160v = c;
        int c2 = a.mo5517c(25, -1);
        if (c2 >= 0) {
            this.f1160v = c2;
        }
        int c3 = a.mo5517c(24, -1);
        if (c3 >= 0) {
            this.f1161w = c3;
        }
        int c4 = a.mo5517c(26, -1);
        if (c4 >= 0) {
            this.f1162x = c4;
        }
        int c5 = a.mo5517c(23, -1);
        if (c5 >= 0) {
            this.f1163y = c5;
        }
        this.f1159u = a.mo5519d(13, -1);
        int c6 = a.mo5517c(9, Integer.MIN_VALUE);
        int c7 = a.mo5517c(5, Integer.MIN_VALUE);
        int d = a.mo5519d(7, 0);
        int d2 = a.mo5519d(8, 0);
        mo961d();
        C0291ks ksVar = this.f1150l;
        ksVar.f9820h = false;
        if (d != Integer.MIN_VALUE) {
            ksVar.f9817e = d;
            ksVar.f9813a = d;
        }
        if (d2 != Integer.MIN_VALUE) {
            ksVar.f9818f = d2;
            ksVar.f9814b = d2;
        }
        if (!(c6 == Integer.MIN_VALUE && c7 == Integer.MIN_VALUE)) {
            ksVar.mo5504a(c6, c7);
        }
        this.f1164z = a.mo5517c(10, Integer.MIN_VALUE);
        this.f1129A = a.mo5517c(6, Integer.MIN_VALUE);
        this.f1143e = a.mo5512a(4);
        this.f1144f = a.mo5516b(3);
        CharSequence b = a.mo5516b(21);
        if (!TextUtils.isEmpty(b)) {
            mo954a(b);
        }
        CharSequence b2 = a.mo5516b(18);
        if (!TextUtils.isEmpty(b2)) {
            mo957b(b2);
        }
        this.f1157s = getContext();
        mo952a(a.mo5521e(17, 0));
        Drawable a2 = a.mo5512a(16);
        if (a2 != null) {
            mo956b(a2);
        }
        CharSequence b3 = a.mo5516b(15);
        if (!TextUtils.isEmpty(b3)) {
            mo959c(b3);
        }
        Drawable a3 = a.mo5512a(11);
        if (a3 != null) {
            mo953a(a3);
        }
        CharSequence b4 = a.mo5516b(12);
        if (!TextUtils.isEmpty(b4)) {
            if (!TextUtils.isEmpty(b4)) {
                m1382f();
            }
            ImageView imageView = this.f1156r;
            if (imageView != null) {
                imageView.setContentDescription(b4);
            }
        }
        if (a.mo5522e(29)) {
            ColorStateList d3 = a.mo5520d(29);
            this.f1131C = d3;
            TextView textView = this.f1140b;
            if (textView != null) {
                textView.setTextColor(d3);
            }
        }
        if (a.mo5522e(20)) {
            ColorStateList d4 = a.mo5520d(20);
            this.f1132D = d4;
            TextView textView2 = this.f1141c;
            if (textView2 != null) {
                textView2.setTextColor(d4);
            }
        }
        if (a.mo5522e(14)) {
            int e = a.mo5521e(14, 0);
            C0139fb fbVar = new C0139fb(getContext());
            if (this.f1139a == null) {
                ActionMenuView actionMenuView = new ActionMenuView(getContext());
                this.f1139a = actionMenuView;
                int i2 = this.f1158t;
                if (actionMenuView.f1008c != i2) {
                    actionMenuView.f1008c = i2;
                    if (i2 != 0) {
                        actionMenuView.f1007b = new ContextThemeWrapper(actionMenuView.getContext(), i2);
                    } else {
                        actionMenuView.f1007b = actionMenuView.getContext();
                    }
                }
                this.f1139a.f1010e = this.f1137I;
                C0304le e2 = m1381e();
                e2.f9162a = (this.f1149k & 112) | 8388613;
                this.f1139a.setLayoutParams(e2);
                m1373a((View) this.f1139a, false);
            }
            ActionMenuView actionMenuView2 = this.f1139a;
            if (actionMenuView2.f1006a == null) {
                C0152fo foVar = (C0152fo) actionMenuView2.mo806a();
                if (this.f1155q == null) {
                    this.f1155q = new C0303ld(this);
                }
                this.f1139a.f1009d.f9407j = true;
                foVar.mo4862a(this.f1155q, this.f1157s);
            }
            fbVar.inflate(e, this.f1139a.mo806a());
        }
        a.mo5513a();
    }

    /* renamed from: a */
    private final void m1374a(List list, int i) {
        int f = C0107dx.m7209f(this);
        int childCount = getChildCount();
        int a = C0122el.m7244a(i, C0107dx.m7209f(this));
        list.clear();
        if (f == 1) {
            for (int i2 = childCount - 1; i2 >= 0; i2--) {
                View childAt = getChildAt(i2);
                C0304le leVar = (C0304le) childAt.getLayoutParams();
                if (leVar.f9841b == 0 && m1375a(childAt) && m1376b(leVar.f9162a) == a) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt2 = getChildAt(i3);
            C0304le leVar2 = (C0304le) childAt2.getLayoutParams();
            if (leVar2.f9841b == 0 && m1375a(childAt2) && m1376b(leVar2.f9162a) == a) {
                list.add(childAt2);
            }
        }
    }

    /* renamed from: a */
    private final void m1373a(View view, boolean z) {
        C0304le leVar;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            leVar = m1381e();
        } else if (!checkLayoutParams(layoutParams)) {
            leVar = m1371a(layoutParams);
        } else {
            leVar = (C0304le) layoutParams;
        }
        leVar.f9841b = 1;
        if (!z || this.f1146h == null) {
            addView(view, leVar);
            return;
        }
        view.setLayoutParams(leVar);
        this.f1153o.add(view);
    }

    /* access modifiers changed from: protected */
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof C0304le);
    }

    /* renamed from: d */
    public final void mo961d() {
        if (this.f1150l == null) {
            this.f1150l = new C0291ks();
        }
    }

    /* renamed from: f */
    private final void m1382f() {
        if (this.f1156r == null) {
            this.f1156r = new C0197hf(getContext());
        }
    }

    /* renamed from: c */
    public final void mo958c() {
        if (this.f1142d == null) {
            this.f1142d = new C0195hd(getContext());
            C0304le e = m1381e();
            e.f9162a = (this.f1149k & 112) | 8388611;
            this.f1142d.setLayoutParams(e);
        }
    }

    /* renamed from: e */
    public static final C0304le m1381e() {
        return new C0304le();
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return m1381e();
    }

    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0304le(getContext(), attributeSet);
    }

    /* renamed from: a */
    private static final C0304le m1371a(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C0304le) {
            return new C0304le((C0304le) layoutParams);
        }
        if (layoutParams instanceof C0127eq) {
            return new C0304le((C0127eq) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C0304le((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C0304le(layoutParams);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m1371a(layoutParams);
    }

    /* renamed from: b */
    private final int m1376b(int i) {
        int f = C0107dx.m7209f(this);
        int a = C0122el.m7244a(i, f) & 7;
        if (a == 1 || a == 3 || a == 5) {
            return a;
        }
        return f != 1 ? 3 : 5;
    }

    /* renamed from: a */
    private final int m1368a(View view, int i) {
        C0304le leVar = (C0304le) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int i3 = leVar.f9162a & 112;
        if (!(i3 == 16 || i3 == 48 || i3 == 80)) {
            i3 = this.f1130B & 112;
        }
        if (i3 == 48) {
            return getPaddingTop() - i2;
        }
        if (i3 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - leVar.bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i4 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        if (i4 >= leVar.topMargin) {
            int i5 = (((height - paddingBottom) - measuredHeight) - i4) - paddingTop;
            if (i5 < leVar.bottomMargin) {
                i4 = Math.max(0, i4 - (leVar.bottomMargin - i5));
            }
        } else {
            i4 = leVar.topMargin;
        }
        return paddingTop + i4;
    }

    /* renamed from: j */
    private final int m1386j() {
        C0152fo foVar;
        ActionMenuView actionMenuView = this.f1139a;
        if (actionMenuView == null || (foVar = actionMenuView.f1006a) == null || !foVar.hasVisibleItems()) {
            return m1384h();
        }
        return Math.max(m1384h(), Math.max(this.f1129A, 0));
    }

    /* renamed from: i */
    private final int m1385i() {
        if (mo955b() != null) {
            return Math.max(m1383g(), Math.max(this.f1164z, 0));
        }
        return m1383g();
    }

    /* renamed from: c */
    private static final int m1379c(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i = Build.VERSION.SDK_INT;
        int marginStart = marginLayoutParams.getMarginStart();
        int i2 = Build.VERSION.SDK_INT;
        return marginStart + marginLayoutParams.getMarginEnd();
    }

    /* renamed from: a */
    public final CharSequence mo951a() {
        ImageButton imageButton = this.f1142d;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    /* renamed from: b */
    public final Drawable mo955b() {
        ImageButton imageButton = this.f1142d;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    /* renamed from: d */
    private static final int m1380d(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    /* renamed from: b */
    private final boolean m1378b(View view) {
        return view.getParent() == this || this.f1153o.contains(view);
    }

    /* renamed from: a */
    private final int m1370a(View view, int i, int[] iArr, int i2) {
        C0304le leVar = (C0304le) view.getLayoutParams();
        int i3 = leVar.leftMargin - iArr[0];
        int max = i + Math.max(0, i3);
        iArr[0] = Math.max(0, -i3);
        int a = m1368a(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, a, max + measuredWidth, view.getMeasuredHeight() + a);
        return max + measuredWidth + leVar.rightMargin;
    }

    /* renamed from: b */
    private final int m1377b(View view, int i, int[] iArr, int i2) {
        C0304le leVar = (C0304le) view.getLayoutParams();
        int i3 = leVar.rightMargin - iArr[1];
        int max = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int a = m1368a(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, a, max, view.getMeasuredHeight() + a);
        return max - (measuredWidth + leVar.leftMargin);
    }

    /* renamed from: a */
    private final int m1369a(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i5) + Math.max(0, i6);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + max + i2, marginLayoutParams.width), getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    /* renamed from: a */
    private final void m1372a(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i4 >= 0) {
            if (mode != 0) {
                i4 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i4);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f1138J);
    }

    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f1134F = false;
        }
        if (!this.f1134F) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f1134F = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f1134F = false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        boolean z2;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int f = C0107dx.m7209f(this);
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i19 = width - paddingRight;
        int[] iArr = this.f1136H;
        iArr[1] = 0;
        iArr[0] = 0;
        int h = C0107dx.m7211h(this);
        int min = h >= 0 ? Math.min(h, i4 - i2) : 0;
        if (!m1375a(this.f1142d)) {
            i5 = paddingLeft;
            i6 = i19;
        } else if (f != 1) {
            i5 = m1370a(this.f1142d, paddingLeft, iArr, min);
            i6 = i19;
        } else {
            i6 = m1377b(this.f1142d, i19, iArr, min);
            i5 = paddingLeft;
        }
        if (m1375a(this.f1145g)) {
            if (f != 1) {
                i5 = m1370a(this.f1145g, i5, iArr, min);
            } else {
                i6 = m1377b(this.f1145g, i6, iArr, min);
            }
        }
        if (m1375a(this.f1139a)) {
            if (f != 1) {
                i6 = m1377b(this.f1139a, i6, iArr, min);
            } else {
                i5 = m1370a(this.f1139a, i5, iArr, min);
            }
        }
        if (C0107dx.m7209f(this) == 1) {
            i7 = m1386j();
        } else {
            i7 = m1385i();
        }
        if (C0107dx.m7209f(this) == 1) {
            i8 = m1385i();
        } else {
            i8 = m1386j();
        }
        int i20 = paddingRight;
        iArr[0] = Math.max(0, i7 - i5);
        iArr[1] = Math.max(0, i8 - (i19 - i6));
        int max = Math.max(i5, i7);
        int min2 = Math.min(i6, i19 - i8);
        if (m1375a(this.f1146h)) {
            if (f != 1) {
                max = m1370a(this.f1146h, max, iArr, min);
            } else {
                min2 = m1377b(this.f1146h, min2, iArr, min);
            }
        }
        if (m1375a(this.f1156r)) {
            if (f != 1) {
                max = m1370a(this.f1156r, max, iArr, min);
            } else {
                min2 = m1377b(this.f1156r, min2, iArr, min);
            }
        }
        boolean a = m1375a(this.f1140b);
        boolean a2 = m1375a(this.f1141c);
        if (a) {
            C0304le leVar = (C0304le) this.f1140b.getLayoutParams();
            i9 = leVar.bottomMargin + leVar.topMargin + this.f1140b.getMeasuredHeight();
        } else {
            i9 = 0;
        }
        if (a2) {
            C0304le leVar2 = (C0304le) this.f1141c.getLayoutParams();
            i10 = width;
            i9 += leVar2.topMargin + this.f1141c.getMeasuredHeight() + leVar2.bottomMargin;
        } else {
            i10 = width;
        }
        if (a || a2) {
            TextView textView = !a ? this.f1141c : this.f1140b;
            TextView textView2 = !a2 ? this.f1140b : this.f1141c;
            C0304le leVar3 = (C0304le) textView.getLayoutParams();
            C0304le leVar4 = (C0304le) textView2.getLayoutParams();
            if ((!a || this.f1140b.getMeasuredWidth() <= 0) && (!a2 || this.f1141c.getMeasuredWidth() <= 0)) {
                z2 = false;
            } else {
                z2 = true;
            }
            i12 = paddingLeft;
            int i21 = this.f1130B & 112;
            i11 = min;
            if (i21 == 48) {
                i13 = min2;
                i14 = getPaddingTop() + leVar3.topMargin + this.f1162x;
            } else if (i21 != 80) {
                int i22 = (((height - paddingTop) - paddingBottom) - i9) / 2;
                i13 = min2;
                if (i22 < leVar3.topMargin + this.f1162x) {
                    i22 = leVar3.topMargin + this.f1162x;
                } else {
                    int i23 = (((height - paddingBottom) - i9) - i22) - paddingTop;
                    if (i23 < leVar3.bottomMargin + this.f1163y) {
                        i22 = Math.max(0, i22 - ((leVar4.bottomMargin + this.f1163y) - i23));
                    }
                }
                i14 = paddingTop + i22;
            } else {
                i13 = min2;
                i14 = (((height - paddingBottom) - leVar4.bottomMargin) - this.f1163y) - i9;
            }
            if (f != 1) {
                int i24 = (z2 ? this.f1160v : 0) - iArr[0];
                max += Math.max(0, i24);
                iArr[0] = Math.max(0, -i24);
                if (a) {
                    int measuredWidth = this.f1140b.getMeasuredWidth() + max;
                    int measuredHeight = this.f1140b.getMeasuredHeight() + i14;
                    this.f1140b.layout(max, i14, measuredWidth, measuredHeight);
                    i17 = measuredWidth + this.f1161w;
                    i14 = measuredHeight + ((C0304le) this.f1140b.getLayoutParams()).bottomMargin;
                } else {
                    i17 = max;
                }
                if (a2) {
                    C0304le leVar5 = (C0304le) this.f1141c.getLayoutParams();
                    int i25 = i14 + leVar5.topMargin;
                    int measuredWidth2 = this.f1141c.getMeasuredWidth() + max;
                    this.f1141c.layout(max, i25, measuredWidth2, this.f1141c.getMeasuredHeight() + i25);
                    i18 = measuredWidth2 + this.f1161w;
                    int i26 = leVar5.bottomMargin;
                } else {
                    i18 = max;
                }
                if (z2) {
                    max = Math.max(i17, i18);
                    min2 = i13;
                } else {
                    min2 = i13;
                }
            } else {
                int i27 = (z2 ? this.f1160v : 0) - iArr[1];
                min2 = i13 - Math.max(0, i27);
                iArr[1] = Math.max(0, -i27);
                if (a) {
                    int measuredWidth3 = min2 - this.f1140b.getMeasuredWidth();
                    int measuredHeight2 = this.f1140b.getMeasuredHeight() + i14;
                    this.f1140b.layout(measuredWidth3, i14, min2, measuredHeight2);
                    i15 = measuredWidth3 - this.f1161w;
                    i14 = measuredHeight2 + ((C0304le) this.f1140b.getLayoutParams()).bottomMargin;
                } else {
                    i15 = min2;
                }
                if (a2) {
                    C0304le leVar6 = (C0304le) this.f1141c.getLayoutParams();
                    int i28 = i14 + leVar6.topMargin;
                    this.f1141c.layout(min2 - this.f1141c.getMeasuredWidth(), i28, min2, this.f1141c.getMeasuredHeight() + i28);
                    i16 = min2 - this.f1161w;
                    int i29 = leVar6.bottomMargin;
                } else {
                    i16 = min2;
                }
                if (z2) {
                    min2 = Math.min(i15, i16);
                }
            }
        } else {
            i12 = paddingLeft;
            i11 = min;
        }
        m1374a(this.f1135G, 3);
        int size = this.f1135G.size();
        for (int i30 = 0; i30 < size; i30++) {
            max = m1370a((View) this.f1135G.get(i30), max, iArr, i11);
        }
        int i31 = i11;
        m1374a(this.f1135G, 5);
        int size2 = this.f1135G.size();
        for (int i32 = 0; i32 < size2; i32++) {
            min2 = m1377b((View) this.f1135G.get(i32), min2, iArr, i31);
        }
        m1374a(this.f1135G, 1);
        ArrayList arrayList = this.f1135G;
        int i33 = iArr[0];
        int i34 = iArr[1];
        int size3 = arrayList.size();
        int i35 = i34;
        int i36 = i33;
        int i37 = 0;
        int i38 = 0;
        while (i37 < size3) {
            View view = (View) arrayList.get(i37);
            C0304le leVar7 = (C0304le) view.getLayoutParams();
            int i39 = leVar7.leftMargin - i36;
            int i40 = leVar7.rightMargin - i35;
            int max2 = Math.max(0, i39);
            int max3 = Math.max(0, i40);
            int max4 = Math.max(0, -i39);
            int max5 = Math.max(0, -i40);
            i38 += max2 + view.getMeasuredWidth() + max3;
            i37++;
            i35 = max5;
            i36 = max4;
        }
        int i41 = (i12 + (((i10 - i12) - i20) / 2)) - (i38 / 2);
        int i42 = i38 + i41;
        if (i41 >= max) {
            max = i42 > min2 ? i41 - (i42 - min2) : i41;
        }
        int size4 = this.f1135G.size();
        for (int i43 = 0; i43 < size4; i43++) {
            max = m1370a((View) this.f1135G.get(i43), max, iArr, i31);
        }
        this.f1135G.clear();
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int[] iArr = this.f1136H;
        char a = C0313ln.m7906a(this);
        char c = a ^ 1;
        int i9 = 0;
        if (m1375a(this.f1142d)) {
            m1372a(this.f1142d, i, 0, i2, this.f1159u);
            i5 = this.f1142d.getMeasuredWidth() + m1379c(this.f1142d);
            i3 = Math.max(0, this.f1142d.getMeasuredHeight() + m1380d(this.f1142d));
            i4 = View.combineMeasuredStates(0, this.f1142d.getMeasuredState());
        } else {
            i5 = 0;
            i4 = 0;
            i3 = 0;
        }
        if (m1375a(this.f1145g)) {
            m1372a(this.f1145g, i, 0, i2, this.f1159u);
            i5 = this.f1145g.getMeasuredWidth() + m1379c(this.f1145g);
            i3 = Math.max(i3, this.f1145g.getMeasuredHeight() + m1380d(this.f1145g));
            i4 = View.combineMeasuredStates(i4, this.f1145g.getMeasuredState());
        }
        int i10 = m1385i();
        int max = Math.max(i10, i5);
        iArr[a] = Math.max(0, i10 - i5);
        if (m1375a(this.f1139a)) {
            m1372a(this.f1139a, i, max, i2, this.f1159u);
            i6 = this.f1139a.getMeasuredWidth() + m1379c(this.f1139a);
            i3 = Math.max(i3, this.f1139a.getMeasuredHeight() + m1380d(this.f1139a));
            i4 = View.combineMeasuredStates(i4, this.f1139a.getMeasuredState());
        } else {
            i6 = 0;
        }
        int j = m1386j();
        int max2 = max + Math.max(j, i6);
        iArr[c] = Math.max(0, j - i6);
        if (m1375a(this.f1146h)) {
            max2 += m1369a(this.f1146h, i, max2, i2, 0, iArr);
            i3 = Math.max(i3, this.f1146h.getMeasuredHeight() + m1380d(this.f1146h));
            i4 = View.combineMeasuredStates(i4, this.f1146h.getMeasuredState());
        }
        if (m1375a(this.f1156r)) {
            max2 += m1369a(this.f1156r, i, max2, i2, 0, iArr);
            i3 = Math.max(i3, this.f1156r.getMeasuredHeight() + m1380d(this.f1156r));
            i4 = View.combineMeasuredStates(i4, this.f1156r.getMeasuredState());
        }
        int childCount = getChildCount();
        int i11 = max2;
        int i12 = i4;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (((C0304le) childAt.getLayoutParams()).f9841b == 0 && m1375a(childAt)) {
                View view = childAt;
                i11 += m1369a(childAt, i, i11, i2, 0, iArr);
                i3 = Math.max(i3, view.getMeasuredHeight() + m1380d(view));
                i12 = View.combineMeasuredStates(i12, view.getMeasuredState());
            }
        }
        int i14 = this.f1162x + this.f1163y;
        int i15 = this.f1160v + this.f1161w;
        if (m1375a(this.f1140b)) {
            m1369a(this.f1140b, i, i11 + i15, i2, i14, iArr);
            i9 = this.f1140b.getMeasuredWidth() + m1379c(this.f1140b);
            int measuredHeight = this.f1140b.getMeasuredHeight() + m1380d(this.f1140b);
            i7 = View.combineMeasuredStates(i12, this.f1140b.getMeasuredState());
            i8 = measuredHeight;
        } else {
            i7 = i12;
            i8 = 0;
        }
        if (m1375a(this.f1141c)) {
            i9 = Math.max(i9, m1369a(this.f1141c, i, i11 + i15, i2, i8 + i14, iArr));
            i8 += this.f1141c.getMeasuredHeight() + m1380d(this.f1141c);
            i7 = View.combineMeasuredStates(i7, this.f1141c.getMeasuredState());
        }
        int max3 = Math.max(i3, i8);
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        setMeasuredDimension(View.resolveSizeAndState(Math.max(i11 + i9 + paddingLeft + paddingRight, getSuggestedMinimumWidth()), i, -16777216 & i7), View.resolveSizeAndState(Math.max(max3 + paddingTop + paddingBottom, getSuggestedMinimumHeight()), i2, i7 << 16));
    }

    /* access modifiers changed from: protected */
    public final void onRestoreInstanceState(Parcelable parcelable) {
        C0152fo foVar;
        MenuItem findItem;
        if (!(parcelable instanceof C0306lg)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0306lg lgVar = (C0306lg) parcelable;
        super.onRestoreInstanceState(lgVar.f8521b);
        ActionMenuView actionMenuView = this.f1139a;
        if (actionMenuView != null) {
            foVar = actionMenuView.f1006a;
        } else {
            foVar = null;
        }
        int i = lgVar.f9842c;
        if (!(i == 0 || this.f1155q == null || foVar == null || (findItem = foVar.findItem(i)) == null)) {
            findItem.expandActionView();
        }
        if (lgVar.f9843d) {
            removeCallbacks(this.f1138J);
            post(this.f1138J);
        }
    }

    public final void onRtlPropertiesChanged(int i) {
        int i2 = Build.VERSION.SDK_INT;
        super.onRtlPropertiesChanged(i);
        mo961d();
        C0291ks ksVar = this.f1150l;
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        if (z != ksVar.f9819g) {
            ksVar.f9819g = z;
            if (!ksVar.f9820h) {
                ksVar.f9813a = ksVar.f9817e;
                ksVar.f9814b = ksVar.f9818f;
            } else if (!z) {
                int i3 = ksVar.f9815c;
                if (i3 == Integer.MIN_VALUE) {
                    i3 = ksVar.f9817e;
                }
                ksVar.f9813a = i3;
                int i4 = ksVar.f9816d;
                if (i4 == Integer.MIN_VALUE) {
                    i4 = ksVar.f9818f;
                }
                ksVar.f9814b = i4;
            } else {
                int i5 = ksVar.f9816d;
                if (i5 == Integer.MIN_VALUE) {
                    i5 = ksVar.f9817e;
                }
                ksVar.f9813a = i5;
                int i6 = ksVar.f9815c;
                if (i6 == Integer.MIN_VALUE) {
                    i6 = ksVar.f9818f;
                }
                ksVar.f9814b = i6;
            }
        }
    }

    /* access modifiers changed from: protected */
    public final Parcelable onSaveInstanceState() {
        C0180gp gpVar;
        C0153fp fpVar;
        C0306lg lgVar = new C0306lg(super.onSaveInstanceState());
        C0303ld ldVar = this.f1155q;
        if (!(ldVar == null || (fpVar = ldVar.f9838a) == null)) {
            lgVar.f9842c = fpVar.f9325a;
        }
        ActionMenuView actionMenuView = this.f1139a;
        boolean z = false;
        if (!(actionMenuView == null || (gpVar = actionMenuView.f1009d) == null || !gpVar.mo5071c())) {
            z = true;
        }
        lgVar.f9843d = z;
        return lgVar;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1133E = false;
        }
        if (!this.f1133E) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f1133E = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f1133E = false;
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
    /* renamed from: a */
    public final void mo953a(Drawable drawable) {
        if (drawable != null) {
            m1382f();
            if (!m1378b(this.f1156r)) {
                m1373a((View) this.f1156r, true);
            }
        } else {
            ImageView imageView = this.f1156r;
            if (imageView != null && m1378b(imageView)) {
                removeView(this.f1156r);
                this.f1153o.remove(this.f1156r);
            }
        }
        ImageView imageView2 = this.f1156r;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    /* renamed from: c */
    public final void mo959c(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            mo958c();
        }
        ImageButton imageButton = this.f1142d;
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
    /* renamed from: b */
    public final void mo956b(Drawable drawable) {
        if (drawable != null) {
            mo958c();
            if (!m1378b(this.f1142d)) {
                m1373a((View) this.f1142d, true);
            }
        } else {
            ImageButton imageButton = this.f1142d;
            if (imageButton != null && m1378b(imageButton)) {
                removeView(this.f1142d);
                this.f1153o.remove(this.f1142d);
            }
        }
        ImageButton imageButton2 = this.f1142d;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    /* renamed from: a */
    public final void mo952a(int i) {
        if (this.f1158t != i) {
            this.f1158t = i;
            if (i != 0) {
                this.f1157s = new ContextThemeWrapper(getContext(), i);
            } else {
                this.f1157s = getContext();
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
    /* renamed from: b */
    public final void mo957b(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f1141c;
            if (textView != null && m1378b(textView)) {
                removeView(this.f1141c);
                this.f1153o.remove(this.f1141c);
            }
        } else {
            if (this.f1141c == null) {
                Context context = getContext();
                C0202hk hkVar = new C0202hk(context);
                this.f1141c = hkVar;
                hkVar.setSingleLine();
                this.f1141c.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f1148j;
                if (i != 0) {
                    this.f1141c.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f1132D;
                if (colorStateList != null) {
                    this.f1141c.setTextColor(colorStateList);
                }
            }
            if (!m1378b(this.f1141c)) {
                m1373a((View) this.f1141c, true);
            }
        }
        TextView textView2 = this.f1141c;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f1152n = charSequence;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: android.support.v7.widget.Toolbar.a(android.view.View, boolean):void
     arg types: [android.widget.TextView, int]
     candidates:
      android.support.v7.widget.Toolbar.a(android.view.View, int):int
      android.support.v7.widget.Toolbar.a(java.util.List, int):void
      android.support.v7.widget.Toolbar.a(android.view.View, boolean):void */
    /* renamed from: a */
    public final void mo954a(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f1140b;
            if (textView != null && m1378b(textView)) {
                removeView(this.f1140b);
                this.f1153o.remove(this.f1140b);
            }
        } else {
            if (this.f1140b == null) {
                Context context = getContext();
                C0202hk hkVar = new C0202hk(context);
                this.f1140b = hkVar;
                hkVar.setSingleLine();
                this.f1140b.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f1147i;
                if (i != 0) {
                    this.f1140b.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f1131C;
                if (colorStateList != null) {
                    this.f1140b.setTextColor(colorStateList);
                }
            }
            if (!m1378b(this.f1140b)) {
                m1373a((View) this.f1140b, true);
            }
        }
        TextView textView2 = this.f1140b;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f1151m = charSequence;
    }

    /* renamed from: a */
    private final boolean m1375a(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }
}
