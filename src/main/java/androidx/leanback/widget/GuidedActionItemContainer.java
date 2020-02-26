package androidx.leanback.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/* compiled from: PG */
class GuidedActionItemContainer extends C0381oa {

    /* renamed from: a */
    private boolean f1198a;

    public GuidedActionItemContainer(Context context) {
        this(context, null);
    }

    public GuidedActionItemContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GuidedActionItemContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1198a = true;
    }

    public final View focusSearch(View view, int i) {
        if (this.f1198a || !bmp.m3762a(this, view)) {
            return super.focusSearch(view, i);
        }
        View focusSearch = super.focusSearch(view, i);
        if (!bmp.m3762a(this, focusSearch)) {
            return null;
        }
        return focusSearch;
    }
}
