package p000;

import android.view.View;
import android.view.ViewGroup;
import androidx.leanback.transition.FadeAndShortSlide;

/* renamed from: ml */
/* compiled from: PG */
public final class C0338ml extends bmp {
    /* renamed from: a */
    public final float mo2154a(FadeAndShortSlide fadeAndShortSlide, ViewGroup viewGroup, View view, int[] iArr) {
        if (viewGroup.getLayoutDirection() == 1) {
            return view.getTranslationX() + fadeAndShortSlide.mo981a(viewGroup);
        }
        return view.getTranslationX() - fadeAndShortSlide.mo981a(viewGroup);
    }
}
