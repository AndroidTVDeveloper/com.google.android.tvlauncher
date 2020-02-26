package p000;

/* renamed from: pl */
/* compiled from: PG */
final class C0419pl implements C0421pn {
    /* renamed from: a */
    public final boolean mo5746a(float[] fArr) {
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
