package androidx.leanback.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Checkable;
import android.widget.ImageView;

/* compiled from: PG */
class CheckableImageView extends ImageView implements Checkable {
    private static final int[] b = {16842912};
    private boolean a;

    public final boolean isChecked() {
        return this.a;
    }

    public CheckableImageView(Context context) {
        this(context, null);
    }

    public CheckableImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CheckableImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (this.a) {
            mergeDrawableStates(onCreateDrawableState, b);
        }
        return onCreateDrawableState;
    }

    public final void setChecked(boolean z) {
        if (this.a != z) {
            this.a = z;
            refreshDrawableState();
        }
    }

    public final void toggle() {
        setChecked(!this.a);
    }
}
