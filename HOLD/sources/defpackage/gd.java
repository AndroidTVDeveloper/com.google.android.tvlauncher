package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.ViewGroup;
import com.google.android.tvlauncher.R;

/* renamed from: gd  reason: default package */
/* compiled from: PG */
public abstract class gd extends ViewGroup {
    public int a;
    private boolean b;
    private boolean c;

    gd(Context context) {
        this(context, null);
    }

    public void a(int i) {
        throw null;
    }

    public gd(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public gd(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) && typedValue.resourceId != 0) {
            new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    /* access modifiers changed from: protected */
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, er.a, R.attr.actionBarStyle, 0);
        a(obtainStyledAttributes.getLayoutDimension(13, 0));
        obtainStyledAttributes.recycle();
    }

    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.c = false;
        }
        if (!this.c) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.c = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.c = false;
        }
        return true;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.b = false;
        }
        if (!this.b) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.b = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.b = false;
        }
        return true;
    }

    public final void setVisibility(int i) {
        if (i != getVisibility()) {
            super.setVisibility(i);
        }
    }
}
