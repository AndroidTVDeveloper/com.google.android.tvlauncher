package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.leanback.transition.FadeAndShortSlide;

/* renamed from: ml  reason: default package */
/* compiled from: PG */
public final class ml extends bmp {
    public final float a(FadeAndShortSlide fadeAndShortSlide, ViewGroup viewGroup, View view, int[] iArr) {
        if (viewGroup.getLayoutDirection() == 1) {
            return view.getTranslationX() + fadeAndShortSlide.a(viewGroup);
        }
        return view.getTranslationX() - fadeAndShortSlide.a(viewGroup);
    }
}
