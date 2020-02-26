package com.google.android.tvlauncher.notifications;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.leanback.widget.HorizontalGridView;
import com.google.android.tvlauncher.R;

/* compiled from: PG */
public class NotificationsTrayView extends FrameLayout {
    public HorizontalGridView a;

    public NotificationsTrayView(Context context) {
        super(context);
    }

    public NotificationsTrayView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        HorizontalGridView horizontalGridView = (HorizontalGridView) findViewById(R.id.notifications_row);
        this.a = horizontalGridView;
        horizontalGridView.g(0);
        this.a.a(0.0f);
        this.a.h(getContext().getResources().getDimensionPixelSize(R.dimen.notifications_list_padding_start));
        this.a.t();
    }

    public final void a() {
        jp jpVar = this.a.g;
        int i = 8;
        if (jpVar != null && jpVar.a() > 0) {
            i = 0;
        }
        setVisibility(i);
    }
}
