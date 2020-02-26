package p000;

@Deprecated
/* renamed from: ahe */
/* compiled from: PG */
public abstract class ahe extends agu {

    /* renamed from: a */
    private final int f362a;

    /* renamed from: b */
    private final int f363b;

    public ahe() {
        this(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    /* renamed from: b */
    public final void mo232b(ahf ahf) {
    }

    public ahe(int i, int i2) {
        this.f362a = i;
        this.f363b = i2;
    }

    /* renamed from: a */
    public final void mo230a(ahf ahf) {
        if (aie.m560a(this.f362a, this.f363b)) {
            ahf.mo245a(this.f362a, this.f363b);
            return;
        }
        int i = this.f362a;
        int i2 = this.f363b;
        StringBuilder sb = new StringBuilder(176);
        sb.append("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: ");
        sb.append(i);
        sb.append(" and height: ");
        sb.append(i2);
        sb.append(", either provide dimensions in the constructor or call override()");
        throw new IllegalArgumentException(sb.toString());
    }
}
