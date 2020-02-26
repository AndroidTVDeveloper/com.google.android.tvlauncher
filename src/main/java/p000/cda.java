package p000;

import android.os.SystemClock;
import java.util.Random;

/* renamed from: cda */
/* compiled from: PG */
public final class cda {

    /* renamed from: a */
    private final float f5302a;

    /* renamed from: b */
    private final Random f5303b;

    private cda(float f, Random random) {
        boolean z = false;
        if (f >= 0.0f && f <= 1.0f) {
            z = true;
        }
        cev.m4633a(z, "Sampling rate should be a floating number >= 0 and <= 1.");
        this.f5302a = f;
        this.f5303b = random;
    }

    /* renamed from: a */
    public static cda m4558a(float f) {
        return new cda(f, new Random(SystemClock.elapsedRealtime()));
    }

    /* renamed from: a */
    public final boolean mo2673a() {
        return this.f5303b.nextFloat() < this.f5302a;
    }
}
