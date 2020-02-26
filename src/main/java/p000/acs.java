package p000;

/* renamed from: acs */
/* compiled from: PG */
final class acs extends acu {
    /* renamed from: b */
    public final int mo56b(int i, int i2, int i3, int i4) {
        return f106h ? 2 : 1;
    }

    /* renamed from: a */
    public final float mo55a(int i, int i2, int i3, int i4) {
        if (f106h) {
            return Math.min(((float) i3) / ((float) i), ((float) i4) / ((float) i2));
        }
        int max = Math.max(i2 / i4, i / i3);
        if (max != 0) {
            return 1.0f / ((float) Integer.highestOneBit(max));
        }
        return 1.0f;
    }
}
