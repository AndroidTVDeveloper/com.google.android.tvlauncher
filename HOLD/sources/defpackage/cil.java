package defpackage;

import android.animation.ValueAnimator;
import com.google.android.tvlauncher.appsview.StoreRowButtonView;

/* renamed from: cil  reason: default package */
/* compiled from: PG */
public final class cil implements ValueAnimator.AnimatorUpdateListener {
    private final /* synthetic */ StoreRowButtonView a;

    public cil(StoreRowButtonView storeRowButtonView) {
        this.a = storeRowButtonView;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.setBackgroundColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
