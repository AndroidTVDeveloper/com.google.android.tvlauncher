package p000;

/* renamed from: acp */
/* compiled from: PG */
final class acp extends acu {
    /* renamed from: b */
    public final int mo56b(int i, int i2, int i3, int i4) {
        return 2;
    }

    /* renamed from: a */
    public final float mo55a(int i, int i2, int i3, int i4) {
        int min = Math.min(i2 / i4, i / i3);
        if (min != 0) {
            return 1.0f / ((float) Integer.highestOneBit(min));
        }
        return 1.0f;
    }
}
