package androidx.leanback.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.google.android.tvlauncher.R;

/* compiled from: PG */
class GuidedActionsRelativeLayout extends RelativeLayout {
    private float a;
    private boolean b;

    public GuidedActionsRelativeLayout(Context context) {
        this(context, null);
    }

    public GuidedActionsRelativeLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GuidedActionsRelativeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = false;
        this.a = GuidanceStylingRelativeLayout.a(context);
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.b = false;
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        View findViewById;
        int size = View.MeasureSpec.getSize(i2);
        if (size > 0 && (findViewById = findViewById(R.id.guidedactions_sub_list)) != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) findViewById.getLayoutParams();
            if (marginLayoutParams.topMargin < 0 && !this.b) {
                this.b = true;
            }
            if (this.b) {
                marginLayoutParams.topMargin = (int) ((this.a * ((float) size)) / 100.0f);
            }
        }
        super.onMeasure(i, i2);
    }
}
