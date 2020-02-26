package p000;

/* renamed from: apz */
/* compiled from: PG */
final class apz implements apw {

    /* renamed from: a */
    private final bky f1752a;

    /* renamed from: b */
    private final int f1753b = this.f1752a.mo2087n();

    /* renamed from: c */
    private final int f1754c = (this.f1752a.mo2087n() & 255);

    /* renamed from: d */
    private int f1755d;

    /* renamed from: e */
    private int f1756e;

    public apz(apt apt) {
        bky bky = apt.f1734a;
        this.f1752a = bky;
        bky.mo2073c(12);
    }

    /* renamed from: a */
    public final int mo1241a() {
        return this.f1753b;
    }

    /* renamed from: c */
    public final boolean mo1243c() {
        return false;
    }

    /* renamed from: b */
    public final int mo1242b() {
        int i = this.f1754c;
        if (i == 8) {
            return this.f1752a.mo2074d();
        }
        if (i == 16) {
            return this.f1752a.mo2076e();
        }
        int i2 = this.f1755d;
        this.f1755d = i2 + 1;
        if (i2 % 2 != 0) {
            return this.f1756e & 15;
        }
        int d = this.f1752a.mo2074d();
        this.f1756e = d;
        return (d & 240) >> 4;
    }
}
