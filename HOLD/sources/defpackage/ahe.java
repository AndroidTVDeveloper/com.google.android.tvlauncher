package defpackage;

@Deprecated
/* renamed from: ahe  reason: default package */
/* compiled from: PG */
public abstract class ahe extends agu {
    private final int a;
    private final int b;

    public ahe() {
        this(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    public final void b(ahf ahf) {
    }

    public ahe(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final void a(ahf ahf) {
        if (aie.a(this.a, this.b)) {
            ahf.a(this.a, this.b);
            return;
        }
        int i = this.a;
        int i2 = this.b;
        StringBuilder sb = new StringBuilder(176);
        sb.append("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: ");
        sb.append(i);
        sb.append(" and height: ");
        sb.append(i2);
        sb.append(", either provide dimensions in the constructor or call override()");
        throw new IllegalArgumentException(sb.toString());
    }
}
