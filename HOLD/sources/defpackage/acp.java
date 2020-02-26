package defpackage;

/* renamed from: acp  reason: default package */
/* compiled from: PG */
final class acp extends acu {
    public final int b(int i, int i2, int i3, int i4) {
        return 2;
    }

    public final float a(int i, int i2, int i3, int i4) {
        int min = Math.min(i2 / i4, i / i3);
        if (min != 0) {
            return 1.0f / ((float) Integer.highestOneBit(min));
        }
        return 1.0f;
    }
}
