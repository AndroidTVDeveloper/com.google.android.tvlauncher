package com.google.android.tvlauncher.notifications;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageButton;
import com.google.android.tvlauncher.R;

/* compiled from: PG */
public class NotificationDismissButton extends ImageButton {

    /* renamed from: a */
    public Drawable f6607a;

    /* renamed from: b */
    public int f6608b;

    /* renamed from: c */
    public int f6609c;

    /* renamed from: d */
    public int f6610d;

    public NotificationDismissButton(Context context) {
        super(context, null);
    }

    public NotificationDismissButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Resources resources = getResources();
        this.f6609c = resources.getColor(R.color.reference_white_40, null);
        this.f6610d = resources.getColor(R.color.notification_panel_background, null);
        this.f6608b = resources.getColor(R.color.reference_white_20, null);
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        Drawable drawable = getDrawable();
        this.f6607a = drawable;
        drawable.mutate();
    }
}
