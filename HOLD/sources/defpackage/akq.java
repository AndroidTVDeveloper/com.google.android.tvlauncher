package defpackage;

/* renamed from: akq  reason: default package */
/* compiled from: PG */
public final class akq {
    public static final akq a = new akq();
    public final float b;
    public final float c;
    public final boolean d;
    public final int e;

    public akq() {
        this(1.0f, 1.0f);
    }

    public akq(float f, float f2) {
        boolean z = true;
        bks.a(f > 0.0f);
        bks.a(f2 <= 0.0f ? false : z);
        this.b = f;
        this.c = f2;
        this.d = false;
        this.e = Math.round(f * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            akq akq = (akq) obj;
            return this.b == akq.b && this.c == akq.c;
        }
    }

    public final int hashCode() {
        return (((Float.floatToRawIntBits(this.b) + 527) * 31) + Float.floatToRawIntBits(this.c)) * 31;
    }
}
