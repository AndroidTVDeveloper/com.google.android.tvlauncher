package com.google.android.tvlauncher.notifications;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;
import com.google.android.tvlauncher.R;

/* compiled from: PG */
public class NotificationTrayButton extends Button {
    private static final int[] a = {R.attr.state_notification_selected};
    private boolean b;

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
        if (!this.b) {
            return super.onCreateDrawableState(i);
        }
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        mergeDrawableStates(onCreateDrawableState, a);
        return onCreateDrawableState;
    }

    public final void a(boolean z) {
        this.b = z;
        refreshDrawableState();
    }
}
