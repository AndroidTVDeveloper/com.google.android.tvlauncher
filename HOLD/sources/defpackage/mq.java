package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.leanback.transition.FadeAndShortSlide;

/* renamed from: mq  reason: default package */
/* compiled from: PG */
public final class mq extends bmp {
    private final /* synthetic */ FadeAndShortSlide a;

    public mq(FadeAndShortSlide fadeAndShortSlide) {
        this.a = fadeAndShortSlide;
    }

    public final float b(FadeAndShortSlide fadeAndShortSlide, ViewGroup viewGroup, View view, int[] iArr) {
        int i;
        int height = iArr[1] + (view.getHeight() / 2);
        viewGroup.getLocationOnScreen(iArr);
        Rect epicenter = this.a.getEpicenter();
        if (epicenter == null) {
            i = iArr[1] + (viewGroup.getHeight() / 2);
        } else {
            i = epicenter.centerY();
        }
        if (height >= i) {
            return view.getTranslationY() + fadeAndShortSlide.b(viewGroup);
        }
        return view.getTranslationY() - fadeAndShortSlide.b(viewGroup);
    }
}
