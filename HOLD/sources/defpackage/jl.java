package defpackage;

import android.view.animation.Interpolator;

/* renamed from: jl  reason: default package */
/* compiled from: PG */
public final class jl implements Interpolator {
    public final float getInterpolation(float f) {
        float f2 = f - 4.0f;
        return (f2 * f2 * f2 * f2 * f2) + 1.0f;
    }
}
