package p000;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.leanback.transition.FadeAndShortSlide;

/* renamed from: mn */
/* compiled from: PG */
public final class C0340mn extends bmp {
    /* renamed from: a */
    public final float mo2154a(FadeAndShortSlide fadeAndShortSlide, ViewGroup viewGroup, View view, int[] iArr) {
        int i;
        int width = iArr[0] + (view.getWidth() / 2);
        viewGroup.getLocationOnScreen(iArr);
        Rect epicenter = fadeAndShortSlide.getEpicenter();
        if (epicenter == null) {
            i = iArr[0] + (viewGroup.getWidth() / 2);
        } else {
            i = epicenter.centerX();
        }
        if (width >= i) {
            return view.getTranslationX() + fadeAndShortSlide.mo981a(viewGroup);
        }
        return view.getTranslationX() - fadeAndShortSlide.mo981a(viewGroup);
    }
}
