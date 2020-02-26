package p000;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.ViewGroup;
import com.google.android.tvlauncher.R;

/* renamed from: gd */
/* compiled from: PG */
public abstract class C0168gd extends ViewGroup {

    /* renamed from: a */
    public int f9390a;

    /* renamed from: b */
    private boolean f9391b;

    /* renamed from: c */
    private boolean f9392c;

    C0168gd(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public void mo777a(int i) {
        throw null;
    }

    public C0168gd(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C0168gd(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) && typedValue.resourceId != 0) {
            new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    /* access modifiers changed from: protected */
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, C0128er.f9163a, R.attr.actionBarStyle, 0);
        mo777a(obtainStyledAttributes.getLayoutDimension(13, 0));
        obtainStyledAttributes.recycle();
    }

    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f9392c = false;
        }
        if (!this.f9392c) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f9392c = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f9392c = false;
        }
        return true;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f9391b = false;
        }
        if (!this.f9391b) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f9391b = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f9391b = false;
        }
        return true;
    }

    public final void setVisibility(int i) {
        if (i != getVisibility()) {
            super.setVisibility(i);
        }
    }
}
