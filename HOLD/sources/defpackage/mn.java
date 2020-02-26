package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.leanback.transition.FadeAndShortSlide;

/* renamed from: mn  reason: default package */
/* compiled from: PG */
public final class mn extends bmp {
    public final float a(FadeAndShortSlide fadeAndShortSlide, ViewGroup viewGroup, View view, int[] iArr) {
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
            return view.getTranslationX() + fadeAndShortSlide.a(viewGroup);
        }
        return view.getTranslationX() - fadeAndShortSlide.a(viewGroup);
    }
}
