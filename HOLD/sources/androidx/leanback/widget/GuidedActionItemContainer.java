package androidx.leanback.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/* compiled from: PG */
class GuidedActionItemContainer extends oa {
    private boolean a;

    public GuidedActionItemContainer(Context context) {
        this(context, null);
    }

    public GuidedActionItemContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GuidedActionItemContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = true;
    }

    public final View focusSearch(View view, int i) {
        if (this.a || !bmp.a(this, view)) {
            return super.focusSearch(view, i);
        }
        View focusSearch = super.focusSearch(view, i);
        if (!bmp.a(this, focusSearch)) {
            return null;
        }
        return focusSearch;
    }
}
