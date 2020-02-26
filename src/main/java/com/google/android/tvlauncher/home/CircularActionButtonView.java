package com.google.android.tvlauncher.home;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.google.android.tvlauncher.R;

/* compiled from: PG */
public class CircularActionButtonView extends ImageView {
    public CircularActionButtonView(Context context) {
        super(context);
    }

    public CircularActionButtonView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CircularActionButtonView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        if (!isInEditMode()) {
            Resources resources = getResources();
            new dcw(resources.getInteger(R.integer.channel_action_button_focused_animation_duration_ms), resources.getFraction(R.fraction.channel_action_button_focused_scale, 1, 1), resources.getDimension(R.dimen.channel_action_button_focused_elevation)).mo4132a(this);
        }
        setOutlineProvider(new cos());
        setClipToOutline(true);
    }
}
