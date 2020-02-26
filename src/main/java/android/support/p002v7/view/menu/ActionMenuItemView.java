package android.support.p002v7.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: android.support.v7.view.menu.ActionMenuItemView */
/* compiled from: PG */
public class ActionMenuItemView extends C0202hk implements View.OnClickListener, C0160fw, C0181gq {

    /* renamed from: b */
    public C0153fp f951b;

    /* renamed from: c */
    public C0151fn f952c;

    /* renamed from: d */
    public C0142fe f953d;

    /* renamed from: e */
    private CharSequence f954e;

    /* renamed from: f */
    private Drawable f955f;

    /* renamed from: g */
    private C0231im f956g;

    /* renamed from: h */
    private boolean f957h;

    /* renamed from: i */
    private int f958i;

    /* renamed from: j */
    private int f959j;

    /* renamed from: k */
    private int f960k;

    public ActionMenuItemView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public final C0153fp mo747a() {
        return this.f951b;
    }

    /* renamed from: b */
    public final boolean mo749b() {
        return true;
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Resources resources = context.getResources();
        this.f957h = m1247f();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0128er.f9165c, i, 0);
        this.f958i = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.f960k = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f959j = -1;
        setSaveEnabled(false);
    }

    /* renamed from: c */
    public final boolean mo750c() {
        return !TextUtils.isEmpty(getText());
    }

    /* renamed from: a */
    public final void mo748a(C0153fp fpVar) {
        this.f951b = fpVar;
        Drawable icon = fpVar.getIcon();
        this.f955f = icon;
        int i = 0;
        if (icon != null) {
            int intrinsicWidth = icon.getIntrinsicWidth();
            int intrinsicHeight = icon.getIntrinsicHeight();
            int i2 = this.f960k;
            if (intrinsicWidth > i2) {
                intrinsicHeight = (int) (((float) intrinsicHeight) * (((float) i2) / ((float) intrinsicWidth)));
                intrinsicWidth = i2;
            }
            if (intrinsicHeight > i2) {
                intrinsicWidth = (int) (((float) intrinsicWidth) * (((float) i2) / ((float) intrinsicHeight)));
                intrinsicHeight = i2;
            }
            icon.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        }
        setCompoundDrawables(icon, null, null, null);
        m1248g();
        this.f954e = fpVar.mo4907a((C0160fw) this);
        m1248g();
        setId(fpVar.f9325a);
        if (!fpVar.isVisible()) {
            i = 8;
        }
        setVisibility(i);
        setEnabled(fpVar.isEnabled());
        if (fpVar.hasSubMenu() && this.f956g == null) {
            this.f956g = new C0141fd(this);
        }
    }

    /* renamed from: e */
    public final boolean mo752e() {
        return mo750c();
    }

    /* renamed from: d */
    public final boolean mo751d() {
        return mo750c() && this.f951b.getIcon() == null;
    }

    public final void onClick(View view) {
        C0151fn fnVar = this.f952c;
        if (fnVar != null) {
            fnVar.mo759a(this.f951b);
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f957h = m1247f();
        m1248g();
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        boolean c = mo750c();
        if (c && (i4 = this.f959j) >= 0) {
            super.setPadding(i4, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        if (mode == Integer.MIN_VALUE) {
            i3 = Math.min(size, this.f958i);
        } else {
            i3 = this.f958i;
        }
        if (mode != 1073741824 && this.f958i > 0 && measuredWidth < i3) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
        }
        if (!c && this.f955f != null) {
            super.setPadding((getMeasuredWidth() - this.f955f.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C0231im imVar;
        if (!this.f951b.hasSubMenu() || (imVar = this.f956g) == null || !imVar.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public final void setPadding(int i, int i2, int i3, int i4) {
        this.f959j = i;
        super.setPadding(i, i2, i3, i4);
    }

    /* renamed from: f */
    private final boolean m1247f() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        return i >= 480 || configuration.orientation == 2;
    }

    /* renamed from: g */
    private final void m1248g() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f954e);
        if (this.f955f != null && ((this.f951b.f9337m & 4) != 4 || !this.f957h)) {
            z = false;
        }
        boolean z3 = z2 & z;
        CharSequence charSequence = null;
        setText(z3 ? this.f954e : null);
        CharSequence charSequence2 = this.f951b.f9335k;
        if (!TextUtils.isEmpty(charSequence2)) {
            setContentDescription(charSequence2);
        } else {
            setContentDescription(!z3 ? this.f951b.f9328d : null);
        }
        CharSequence charSequence3 = this.f951b.f9336l;
        if (TextUtils.isEmpty(charSequence3)) {
            if (!z3) {
                charSequence = this.f951b.f9328d;
            }
            akr.m788a(this, charSequence);
            return;
        }
        akr.m788a(this, charSequence3);
    }
}
