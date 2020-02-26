package com.google.android.tvlauncher.home.view;

import android.content.Context;
import android.util.AttributeSet;
import androidx.leanback.widget.HorizontalGridView;

/* compiled from: PG */
public class ChannelItemsListView extends HorizontalGridView {
    private final jr O = new ctw(this);

    public ChannelItemsListView(Context context) {
        super(context);
        u();
    }

    public ChannelItemsListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        u();
    }

    public ChannelItemsListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        u();
    }

    private final void u() {
        this.n = false;
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        ju juVar = this.x;
        if (juVar != null && juVar.b()) {
            juVar.a(this.O);
            suppressLayout(true);
        } else if (this.q) {
            suppressLayout(false);
        }
    }
}
