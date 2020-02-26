package com.google.android.tvlauncher.notifications;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageButton;
import com.google.android.tvlauncher.R;

/* compiled from: PG */
public class NotificationDismissButton extends ImageButton {
    public Drawable a;
    public int b;
    public int c;
    public int d;

    public NotificationDismissButton(Context context) {
        super(context, null);
    }

    public NotificationDismissButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Resources resources = getResources();
        this.c = resources.getColor(R.color.reference_white_40, null);
        this.d = resources.getColor(R.color.notification_panel_background, null);
        this.b = resources.getColor(R.color.reference_white_20, null);
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        Drawable drawable = getDrawable();
        this.a = drawable;
        drawable.mutate();
    }
}
