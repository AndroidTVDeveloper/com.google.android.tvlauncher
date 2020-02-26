package com.google.android.tvlauncher.home.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.tvlauncher.R;

/* compiled from: PG */
public class WatchNextInfoView extends FrameLayout {
    public View a;
    public ImageView b;
    public TextView c;
    public TextView d;
    private String e;

    public WatchNextInfoView(Context context) {
        super(context);
    }

    public WatchNextInfoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public WatchNextInfoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public WatchNextInfoView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public final View a() {
        return (View) this.b.getParent();
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.a = findViewById(R.id.watch_next_info_container);
        this.b = (ImageView) findViewById(R.id.watch_next_info_icon);
        this.c = (TextView) findViewById(R.id.watch_next_info_title);
        this.d = (TextView) findViewById(R.id.watch_next_info_message);
        this.e = getResources().getString(R.string.watch_next_row_acknowledgment_action_description);
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, this.e));
    }
}
