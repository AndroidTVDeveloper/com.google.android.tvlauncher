package defpackage;

/* renamed from: acq  reason: default package */
/* compiled from: PG */
final class acq extends acu {
    public final int b(int i, int i2, int i3, int i4) {
        if (a(i, i2, i3, i4) != 1.0f) {
            return b.b(i, i2, i3, i4);
        }
        return 2;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.min(float, float):float}
     arg types: [int, float]
     candidates:
      ClspMth{java.lang.Math.min(double, double):double}
      ClspMth{java.lang.Math.min(long, long):long}
      ClspMth{java.lang.Math.min(int, int):int}
      ClspMth{java.lang.Math.min(float, float):float} */
    public final float a(int i, int i2, int i3, int i4) {
        return Math.min(1.0f, b.a(i, i2, i3, i4));
    }
}
