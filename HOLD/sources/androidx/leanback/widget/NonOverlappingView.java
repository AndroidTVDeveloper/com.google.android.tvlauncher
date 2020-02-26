package androidx.leanback.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/* compiled from: PG */
class NonOverlappingView extends View {
    public NonOverlappingView(Context context) {
        this(context, null);
    }

    public final boolean hasOverlappingRendering() {
        return false;
    }

    public NonOverlappingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    public NonOverlappingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
