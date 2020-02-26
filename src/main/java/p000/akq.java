package p000;

/* renamed from: akq */
/* compiled from: PG */
public final class akq {

    /* renamed from: a */
    public static final akq f624a = new akq();

    /* renamed from: b */
    public final float f625b;

    /* renamed from: c */
    public final float f626c;

    /* renamed from: d */
    public final boolean f627d;

    /* renamed from: e */
    public final int f628e;

    public akq() {
        this(1.0f, 1.0f);
    }

    public akq(float f, float f2) {
        boolean z = true;
        bks.m3510a(f > 0.0f);
        bks.m3510a(f2 <= 0.0f ? false : z);
        this.f625b = f;
        this.f626c = f2;
        this.f627d = false;
        this.f628e = Math.round(f * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            akq akq = (akq) obj;
            return this.f625b == akq.f625b && this.f626c == akq.f626c;
        }
    }

    public final int hashCode() {
        return (((Float.floatToRawIntBits(this.f625b) + 527) * 31) + Float.floatToRawIntBits(this.f626c)) * 31;
    }
}
