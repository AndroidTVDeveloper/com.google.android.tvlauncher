package android.support.v7.view.menu;

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

/* compiled from: PG */
public class ActionMenuItemView extends hk implements View.OnClickListener, fw, gq {
    public fp b;
    public fn c;
    public fe d;
    private CharSequence e;
    private Drawable f;
    private im g;
    private boolean h;
    private int i;
    private int j;
    private int k;

    public ActionMenuItemView(Context context) {
        this(context, null);
    }

    public final fp a() {
        return this.b;
    }

    public final boolean b() {
        return true;
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Resources resources = context.getResources();
        this.h = f();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, er.c, i2, 0);
        this.i = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.k = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.j = -1;
        setSaveEnabled(false);
    }

    public final boolean c() {
        return !TextUtils.isEmpty(getText());
    }

    public final void a(fp fpVar) {
        this.b = fpVar;
        Drawable icon = fpVar.getIcon();
        this.f = icon;
        int i2 = 0;
        if (icon != null) {
            int intrinsicWidth = icon.getIntrinsicWidth();
            int intrinsicHeight = icon.getIntrinsicHeight();
            int i3 = this.k;
            if (intrinsicWidth > i3) {
                intrinsicHeight = (int) (((float) intrinsicHeight) * (((float) i3) / ((float) intrinsicWidth)));
                intrinsicWidth = i3;
            }
            if (intrinsicHeight > i3) {
                intrinsicWidth = (int) (((float) intrinsicWidth) * (((float) i3) / ((float) intrinsicHeight)));
                intrinsicHeight = i3;
            }
            icon.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        }
        setCompoundDrawables(icon, null, null, null);
        g();
        this.e = fpVar.a((fw) this);
        g();
        setId(fpVar.a);
        if (!fpVar.isVisible()) {
            i2 = 8;
        }
        setVisibility(i2);
        setEnabled(fpVar.isEnabled());
        if (fpVar.hasSubMenu() && this.g == null) {
            this.g = new fd(this);
        }
    }

    public final boolean e() {
        return c();
    }

    public final boolean d() {
        return c() && this.b.getIcon() == null;
    }

    public final void onClick(View view) {
        fn fnVar = this.c;
        if (fnVar != null) {
            fnVar.a(this.b);
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.h = f();
        g();
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i2, int i3) {
        int i4;
        int i5;
        boolean c2 = c();
        if (c2 && (i5 = this.j) >= 0) {
            super.setPadding(i5, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i2, i3);
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int measuredWidth = getMeasuredWidth();
        if (mode == Integer.MIN_VALUE) {
            i4 = Math.min(size, this.i);
        } else {
            i4 = this.i;
        }
        if (mode != 1073741824 && this.i > 0 && measuredWidth < i4) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(i4, 1073741824), i3);
        }
        if (!c2 && this.f != null) {
            super.setPadding((getMeasuredWidth() - this.f.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        im imVar;
        if (!this.b.hasSubMenu() || (imVar = this.g) == null || !imVar.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public final void setPadding(int i2, int i3, int i4, int i5) {
        this.j = i2;
        super.setPadding(i2, i3, i4, i5);
    }

    private final boolean f() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        int i3 = configuration.screenHeightDp;
        return i2 >= 480 || configuration.orientation == 2;
    }

    private final void g() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.e);
        if (this.f != null && ((this.b.m & 4) != 4 || !this.h)) {
            z = false;
        }
        boolean z3 = z2 & z;
        CharSequence charSequence = null;
        setText(z3 ? this.e : null);
        CharSequence charSequence2 = this.b.k;
        if (!TextUtils.isEmpty(charSequence2)) {
            setContentDescription(charSequence2);
        } else {
            setContentDescription(!z3 ? this.b.d : null);
        }
        CharSequence charSequence3 = this.b.l;
        if (TextUtils.isEmpty(charSequence3)) {
            if (!z3) {
                charSequence = this.b.d;
            }
            akr.a(this, charSequence);
            return;
        }
        akr.a(this, charSequence3);
    }
}
