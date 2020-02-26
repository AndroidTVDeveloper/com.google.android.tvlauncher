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

    /* renamed from: a */
    public View f6589a;

    /* renamed from: b */
    public ImageView f6590b;

    /* renamed from: c */
    public TextView f6591c;

    /* renamed from: d */
    public TextView f6592d;

    /* renamed from: e */
    private String f6593e;

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

    /* renamed from: a */
    public final View mo3418a() {
        return (View) this.f6590b.getParent();
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f6589a = findViewById(R.id.watch_next_info_container);
        this.f6590b = (ImageView) findViewById(R.id.watch_next_info_icon);
        this.f6591c = (TextView) findViewById(R.id.watch_next_info_title);
        this.f6592d = (TextView) findViewById(R.id.watch_next_info_message);
        this.f6593e = getResources().getString(R.string.watch_next_row_acknowledgment_action_description);
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, this.f6593e));
    }
}
