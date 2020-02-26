package defpackage;

/* renamed from: axp  reason: default package */
/* compiled from: PG */
final class axp {
    public final boolean a;
    private final int b;

    public axp(int i, boolean z) {
        this.b = i;
        this.a = z;
    }

    public final int hashCode() {
        return (this.b * 31) + (this.a ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            axp axp = (axp) obj;
            return this.b == axp.b && this.a == axp.a;
        }
    }
}
