package defpackage;

import android.os.SystemClock;
import java.util.Random;

/* renamed from: cda  reason: default package */
/* compiled from: PG */
public final class cda {
    private final float a;
    private final Random b;

    private cda(float f, Random random) {
        boolean z = false;
        if (f >= 0.0f && f <= 1.0f) {
            z = true;
        }
        cev.a(z, "Sampling rate should be a floating number >= 0 and <= 1.");
        this.a = f;
        this.b = random;
    }

    public static cda a(float f) {
        return new cda(f, new Random(SystemClock.elapsedRealtime()));
    }

    public final boolean a() {
        return this.b.nextFloat() < this.a;
    }
}
