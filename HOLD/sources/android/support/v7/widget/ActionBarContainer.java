package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.tvlauncher.R;

/* compiled from: PG */
public class ActionBarContainer extends FrameLayout {
    public Drawable a;
    public Drawable b;
    public Drawable c;
    public boolean d;
    private View e;
    private View f;
    private int g;

    public ActionBarContainer(Context context) {
        this(context, null);
    }

    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        dx.a(this, new ge(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, er.a);
        boolean z = false;
        this.a = obtainStyledAttributes.getDrawable(0);
        this.b = obtainStyledAttributes.getDrawable(2);
        this.g = obtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.d = true;
            this.c = obtainStyledAttributes.getDrawable(1);
        }
        obtainStyledAttributes.recycle();
        if (this.d ? this.c == null : this.a == null && this.b == null) {
            z = true;
        }
        setWillNotDraw(z);
    }

    /* access modifiers changed from: protected */
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.a;
        if (drawable != null && drawable.isStateful()) {
            this.a.setState(getDrawableState());
        }
        Drawable drawable2 = this.b;
        if (drawable2 != null && drawable2.isStateful()) {
            this.b.setState(getDrawableState());
        }
        Drawable drawable3 = this.c;
        if (drawable3 != null && drawable3.isStateful()) {
            this.c.setState(getDrawableState());
        }
    }

    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.b;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.c;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    public final void onFinishInflate() {
        super.onFinishInflate();
        this.e = findViewById(R.id.action_bar);
        this.f = findViewById(R.id.action_context_bar);
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
        if (this.d) {
            Drawable drawable = this.c;
            if (drawable != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                return;
            }
        } else if (this.a == null) {
            return;
        } else {
            if (this.e.getVisibility() == 0) {
                this.a.setBounds(this.e.getLeft(), this.e.getTop(), this.e.getRight(), this.e.getBottom());
            } else {
                View view = this.f;
                if (view != null && view.getVisibility() == 0) {
                    this.a.setBounds(this.f.getLeft(), this.f.getTop(), this.f.getRight(), this.f.getBottom());
                } else {
                    this.a.setBounds(0, 0, 0, 0);
                }
            }
        }
        invalidate();
    }

    public final void onMeasure(int i, int i2) {
        int i3;
        if (this.e == null && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE && (i3 = this.g) >= 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(i3, View.MeasureSpec.getSize(i2)), Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        if (this.e != null) {
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
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.b;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.c;
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
        if (drawable != this.a || this.d) {
            return (drawable == this.c && this.d) || super.verifyDrawable(drawable);
        }
        return true;
    }
}
