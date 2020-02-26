package defpackage;

/* renamed from: pl  reason: default package */
/* compiled from: PG */
final class pl implements pn {
    public final boolean a(float[] fArr) {
        float f = fArr[2];
        if (f < 0.95f && f > 0.05f) {
            float f2 = fArr[0];
            if (f2 < 10.0f || f2 > 37.0f || fArr[1] > 0.82f) {
                return true;
            }
        }
        return false;
    }
}
