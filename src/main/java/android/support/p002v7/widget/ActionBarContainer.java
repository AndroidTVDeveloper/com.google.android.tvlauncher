package android.support.p002v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.tvlauncher.R;

/* renamed from: android.support.v7.widget.ActionBarContainer */
/* compiled from: PG */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: a */
    public Drawable f979a;

    /* renamed from: b */
    public Drawable f980b;

    /* renamed from: c */
    public Drawable f981c;

    /* renamed from: d */
    public boolean f982d;

    /* renamed from: e */
    private View f983e;

    /* renamed from: f */
    private View f984f;

    /* renamed from: g */
    private int f985g;

    public ActionBarContainer(Context context) {
        this(context, null);
    }

    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C0107dx.m7199a(this, new C0169ge(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0128er.f9163a);
        boolean z = false;
        this.f979a = obtainStyledAttributes.getDrawable(0);
        this.f980b = obtainStyledAttributes.getDrawable(2);
        this.f985g = obtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.f982d = true;
            this.f981c = obtainStyledAttributes.getDrawable(1);
        }
        obtainStyledAttributes.recycle();
        if (this.f982d ? this.f981c == null : this.f979a == null && this.f980b == null) {
            z = true;
        }
        setWillNotDraw(z);
    }

    /* access modifiers changed from: protected */
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f979a;
        if (drawable != null && drawable.isStateful()) {
            this.f979a.setState(getDrawableState());
        }
        Drawable drawable2 = this.f980b;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f980b.setState(getDrawableState());
        }
        Drawable drawable3 = this.f981c;
        if (drawable3 != null && drawable3.isStateful()) {
            this.f981c.setState(getDrawableState());
        }
    }

    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f979a;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f980b;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f981c;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f983e = findViewById(R.id.action_bar);
        this.f984f = findViewById(R.id.action_context_bar);
    }

    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f982d) {
            Drawable drawable = this.f981c;
            if (drawable != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                return;
            }
        } else if (this.f979a == null) {
            return;
        } else {
            if (this.f983e.getVisibility() == 0) {
                this.f979a.setBounds(this.f983e.getLeft(), this.f983e.getTop(), this.f983e.getRight(), this.f983e.getBottom());
            } else {
                View view = this.f984f;
                if (view != null && view.getVisibility() == 0) {
                    this.f979a.setBounds(this.f984f.getLeft(), this.f984f.getTop(), this.f984f.getRight(), this.f984f.getBottom());
                } else {
                    this.f979a.setBounds(0, 0, 0, 0);
                }
            }
        }
        invalidate();
    }

    public final void onMeasure(int i, int i2) {
        int i3;
        if (this.f983e == null && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE && (i3 = this.f985g) >= 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(i3, View.MeasureSpec.getSize(i2)), Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        if (this.f983e != null) {
            View.MeasureSpec.getMode(i2);
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public final void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f979a;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.f980b;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.f981c;
        if (drawable3 != null) {
            drawable3.setVisible(z, false);
        }
    }

    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f979a || this.f982d) {
            return (drawable == this.f981c && this.f982d) || super.verifyDrawable(drawable);
        }
        return true;
    }
}
