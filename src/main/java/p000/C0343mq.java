package p000;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.leanback.transition.FadeAndShortSlide;

/* renamed from: mq */
/* compiled from: PG */
public final class C0343mq extends bmp {

    /* renamed from: a */
    private final /* synthetic */ FadeAndShortSlide f9966a;

    public C0343mq(FadeAndShortSlide fadeAndShortSlide) {
        this.f9966a = fadeAndShortSlide;
    }

    /* renamed from: b */
    public final float mo2155b(FadeAndShortSlide fadeAndShortSlide, ViewGroup viewGroup, View view, int[] iArr) {
        int i;
        int height = iArr[1] + (view.getHeight() / 2);
        viewGroup.getLocationOnScreen(iArr);
        Rect epicenter = this.f9966a.getEpicenter();
        if (epicenter == null) {
            i = iArr[1] + (viewGroup.getHeight() / 2);
        } else {
            i = epicenter.centerY();
        }
        if (height >= i) {
            return view.getTranslationY() + fadeAndShortSlide.mo983b(viewGroup);
        }
        return view.getTranslationY() - fadeAndShortSlide.mo983b(viewGroup);
    }
}
