package p000;

import android.view.animation.Interpolator;

/* renamed from: jl */
/* compiled from: PG */
public final class C0257jl implements Interpolator {
    public final float getInterpolation(float f) {
        float f2 = f - 4.0f;
        return (f2 * f2 * f2 * f2 * f2) + 1.0f;
    }
}
