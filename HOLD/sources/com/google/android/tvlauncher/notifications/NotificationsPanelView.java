package com.google.android.tvlauncher.notifications;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import androidx.leanback.widget.VerticalGridView;

/* compiled from: PG */
public class NotificationsPanelView extends VerticalGridView {
    public cyo O;
    private ViewTreeObserver.OnGlobalFocusChangeListener P = new cym(this);
    private final jr Q = new cyn(this);

    public NotificationsPanelView(Context context) {
        super(context);
        u();
    }

    public NotificationsPanelView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        u();
    }

    public NotificationsPanelView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        u();
    }

    private final void u() {
        this.n = false;
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnGlobalFocusChangeListener(this.P);
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalFocusChangeListener(this.P);
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        ju juVar = this.x;
        if (juVar != null && juVar.b()) {
            juVar.a(this.Q);
            suppressLayout(true);
        } else if (this.q) {
            suppressLayout(false);
        }
    }
}
