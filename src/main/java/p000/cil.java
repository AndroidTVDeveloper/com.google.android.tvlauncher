package p000;

import android.animation.ValueAnimator;
import com.google.android.tvlauncher.appsview.StoreRowButtonView;

/* renamed from: cil */
/* compiled from: PG */
public final class cil implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    private final /* synthetic */ StoreRowButtonView f5646a;

    public cil(StoreRowButtonView storeRowButtonView) {
        this.f5646a = storeRowButtonView;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f5646a.setBackgroundColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
