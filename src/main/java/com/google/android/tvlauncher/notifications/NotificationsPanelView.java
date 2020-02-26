package com.google.android.tvlauncher.notifications;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import androidx.leanback.widget.VerticalGridView;

/* compiled from: PG */
public class NotificationsPanelView extends VerticalGridView {

    /* renamed from: O */
    public cyo f6665O;

    /* renamed from: P */
    private ViewTreeObserver.OnGlobalFocusChangeListener f6666P = new cym(this);

    /* renamed from: Q */
    private final C0263jr f6667Q = new cyn(this);

    public NotificationsPanelView(Context context) {
        super(context);
        m5337u();
    }

    public NotificationsPanelView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m5337u();
    }

    public NotificationsPanelView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m5337u();
    }

    /* renamed from: u */
    private final void m5337u() {
        this.f1074n = false;
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnGlobalFocusChangeListener(this.f6666P);
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalFocusChangeListener(this.f6666P);
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C0266ju juVar = this.f1084x;
        if (juVar != null && juVar.mo4191b()) {
            juVar.mo5322a(this.f6667Q);
            suppressLayout(true);
        } else if (this.f1077q) {
            suppressLayout(false);
        }
    }
}
