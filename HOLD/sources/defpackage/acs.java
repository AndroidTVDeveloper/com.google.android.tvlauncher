package defpackage;

/* renamed from: acs  reason: default package */
/* compiled from: PG */
final class acs extends acu {
    public final int b(int i, int i2, int i3, int i4) {
        return h ? 2 : 1;
    }

    public final float a(int i, int i2, int i3, int i4) {
        if (h) {
            return Math.min(((float) i3) / ((float) i), ((float) i4) / ((float) i2));
        }
        int max = Math.max(i2 / i4, i / i3);
        if (max != 0) {
            return 1.0f / ((float) Integer.highestOneBit(max));
        }
        return 1.0f;
    }
}
