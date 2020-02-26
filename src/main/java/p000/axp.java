package p000;

/* renamed from: axp */
/* compiled from: PG */
final class axp {

    /* renamed from: a */
    public final boolean f2637a;

    /* renamed from: b */
    private final int f2638b;

    public axp(int i, boolean z) {
        this.f2638b = i;
        this.f2637a = z;
    }

    public final int hashCode() {
        return (this.f2638b * 31) + (this.f2637a ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            axp axp = (axp) obj;
            return this.f2638b == axp.f2638b && this.f2637a == axp.f2637a;
        }
    }
}
