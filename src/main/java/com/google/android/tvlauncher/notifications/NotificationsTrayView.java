package com.google.android.tvlauncher.notifications;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.leanback.widget.HorizontalGridView;
import com.google.android.tvlauncher.R;

/* compiled from: PG */
public class NotificationsTrayView extends FrameLayout {

    /* renamed from: a */
    public HorizontalGridView f6682a;

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
        this.f6682a = horizontalGridView;
        horizontalGridView.mo5613g(0);
        this.f6682a.mo5609a(0.0f);
        this.f6682a.mo5615h(getContext().getResources().getDimensionPixelSize(R.dimen.notifications_list_padding_start));
        this.f6682a.mo5626t();
    }

    /* renamed from: a */
    public final void mo3457a() {
        C0261jp jpVar = this.f6682a.f1067g;
        int i = 8;
        if (jpVar != null && jpVar.mo2794a() > 0) {
            i = 0;
        }
        setVisibility(i);
    }
}
