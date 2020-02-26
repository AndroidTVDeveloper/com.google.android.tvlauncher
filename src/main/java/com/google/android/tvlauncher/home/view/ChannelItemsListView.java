package com.google.android.tvlauncher.home.view;

import android.content.Context;
import android.util.AttributeSet;
import androidx.leanback.widget.HorizontalGridView;

/* compiled from: PG */
public class ChannelItemsListView extends HorizontalGridView {

    /* renamed from: O */
    private final C0263jr f6449O = new ctw(this);

    public ChannelItemsListView(Context context) {
        super(context);
        m5290u();
    }

    public ChannelItemsListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m5290u();
    }

    public ChannelItemsListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m5290u();
    }

    /* renamed from: u */
    private final void m5290u() {
        this.f1074n = false;
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C0266ju juVar = this.f1084x;
        if (juVar != null && juVar.mo4191b()) {
            juVar.mo5322a(this.f6449O);
            suppressLayout(true);
        } else if (this.f1077q) {
            suppressLayout(false);
        }
    }
}
