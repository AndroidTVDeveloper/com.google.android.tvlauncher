package androidx.leanback.transition;

import android.content.Context;
import android.transition.Slide;
import android.util.AttributeSet;

/* compiled from: PG */
public class SlideNoPropagation extends Slide {
    public SlideNoPropagation() {
    }

    public SlideNoPropagation(int i) {
        super(i);
    }

    public SlideNoPropagation(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void setSlideEdge(int i) {
        super.setSlideEdge(i);
        setPropagation(null);
    }
}
