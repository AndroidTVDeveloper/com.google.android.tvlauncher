package androidx.leanback.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.google.android.tvlauncher.R;

/* compiled from: PG */
class GuidedActionsRelativeLayout extends RelativeLayout {

    /* renamed from: a */
    private float f1199a;

    /* renamed from: b */
    private boolean f1200b;

    public GuidedActionsRelativeLayout(Context context) {
        this(context, null);
    }

    public GuidedActionsRelativeLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GuidedActionsRelativeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1200b = false;
        this.f1199a = GuidanceStylingRelativeLayout.m1405a(context);
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f1200b = false;
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        View findViewById;
        int size = View.MeasureSpec.getSize(i2);
        if (size > 0 && (findViewById = findViewById(R.id.guidedactions_sub_list)) != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) findViewById.getLayoutParams();
            if (marginLayoutParams.topMargin < 0 && !this.f1200b) {
                this.f1200b = true;
            }
            if (this.f1200b) {
                marginLayoutParams.topMargin = (int) ((this.f1199a * ((float) size)) / 100.0f);
            }
        }
        super.onMeasure(i, i2);
    }
}
