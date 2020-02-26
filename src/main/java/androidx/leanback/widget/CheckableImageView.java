package androidx.leanback.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Checkable;
import android.widget.ImageView;

/* compiled from: PG */
class CheckableImageView extends ImageView implements Checkable {

    /* renamed from: b */
    private static final int[] f1191b = {16842912};

    /* renamed from: a */
    private boolean f1192a;

    public final boolean isChecked() {
        return this.f1192a;
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
        if (this.f1192a) {
            mergeDrawableStates(onCreateDrawableState, f1191b);
        }
        return onCreateDrawableState;
    }

    public final void setChecked(boolean z) {
        if (this.f1192a != z) {
            this.f1192a = z;
            refreshDrawableState();
        }
    }

    public final void toggle() {
        setChecked(!this.f1192a);
    }
}
