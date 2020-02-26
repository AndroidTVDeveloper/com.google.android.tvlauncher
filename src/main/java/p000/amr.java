package p000;

/* renamed from: amr */
/* compiled from: PG */
public final class amr implements amp {

    /* renamed from: a */
    public final alu[] f801a;

    /* renamed from: b */
    private final ana f802b = new ana();

    /* renamed from: c */
    private final anc f803c;

    public amr(alu... aluArr) {
        alu[] aluArr2 = new alu[2];
        this.f801a = aluArr2;
        System.arraycopy(aluArr, 0, aluArr2, 0, 0);
        anc anc = new anc();
        this.f803c = anc;
        alu[] aluArr3 = this.f801a;
        aluArr3[0] = this.f802b;
        aluArr3[1] = anc;
    }

    /* renamed from: a */
    public final long mo659a() {
        return this.f802b.f872e;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: blm.a(float, float, float):float
     arg types: [float, int, int]
     candidates:
      blm.a(int, int, int):int
      blm.a(java.util.List, java.lang.Comparable, boolean):int
      blm.a(long[], long, boolean):int
      blm.a(long, long, long):long
      blm.a(java.lang.StringBuilder, java.util.Formatter, long):java.lang.String
      blm.a(byte[], int, int):java.lang.String
      blm.a(java.util.List, int, int):void
      blm.a(bky, bky, java.util.zip.Inflater):boolean
      blm.a(float, float, float):float */
    /* renamed from: a */
    public final akq mo661a(akq akq) {
        ana ana = this.f802b;
        boolean z = akq.f627d;
        ana.mo620h();
        anc anc = this.f803c;
        float a = blm.m3622a(akq.f625b, 0.1f, 8.0f);
        if (anc.f902c != a) {
            anc.f902c = a;
            anc.f905f = true;
        }
        anc.mo620h();
        anc anc2 = this.f803c;
        float a2 = blm.m3622a(akq.f626c, 0.1f, 8.0f);
        if (anc2.f903d != a2) {
            anc2.f903d = a2;
            anc2.f905f = true;
        }
        anc2.mo620h();
        boolean z2 = akq.f627d;
        return new akq(a, a2);
    }

    /* renamed from: a */
    public final long mo660a(long j) {
        anc anc = this.f803c;
        long j2 = anc.f907h;
        if (j2 < 1024) {
            double d = (double) anc.f902c;
            double d2 = (double) j;
            Double.isNaN(d);
            Double.isNaN(d2);
            return (long) (d * d2);
        }
        int i = anc.f904e;
        int i2 = anc.f901b;
        if (i != i2) {
            return blm.m3663b(j, anc.f906g * ((long) i), j2 * ((long) i2));
        }
        return blm.m3663b(j, anc.f906g, j2);
    }
}
