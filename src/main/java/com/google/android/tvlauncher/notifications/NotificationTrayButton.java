package com.google.android.tvlauncher.notifications;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;
import com.google.android.tvlauncher.R;

/* compiled from: PG */
public class NotificationTrayButton extends Button {

    /* renamed from: a */
    private static final int[] f6637a = {R.attr.state_notification_selected};

    /* renamed from: b */
    private boolean f6638b;

    public NotificationTrayButton(Context context) {
        super(context);
    }

    public NotificationTrayButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public NotificationTrayButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public final int[] onCreateDrawableState(int i) {
        if (!this.f6638b) {
            return super.onCreateDrawableState(i);
        }
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        mergeDrawableStates(onCreateDrawableState, f6637a);
        return onCreateDrawableState;
    }

    /* renamed from: a */
    public final void mo3441a(boolean z) {
        this.f6638b = z;
        refreshDrawableState();
    }
}
