package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.leanback.transition.FadeAndShortSlide;

/* renamed from: mo  reason: default package */
/* compiled from: PG */
public final class mo extends bmp {
    public final float b(FadeAndShortSlide fadeAndShortSlide, ViewGroup viewGroup, View view, int[] iArr) {
        return view.getTranslationY() + fadeAndShortSlide.b(viewGroup);
    }
}
