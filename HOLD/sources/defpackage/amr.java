package defpackage;

/* renamed from: amr  reason: default package */
/* compiled from: PG */
public final class amr implements amp {
    public final alu[] a;
    private final ana b = new ana();
    private final anc c;

    public amr(alu... aluArr) {
        alu[] aluArr2 = new alu[2];
        this.a = aluArr2;
        System.arraycopy(aluArr, 0, aluArr2, 0, 0);
        anc anc = new anc();
        this.c = anc;
        alu[] aluArr3 = this.a;
        aluArr3[0] = this.b;
        aluArr3[1] = anc;
    }

    public final long a() {
        return this.b.e;
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
    public final akq a(akq akq) {
        ana ana = this.b;
        boolean z = akq.d;
        ana.h();
        anc anc = this.c;
        float a2 = blm.a(akq.b, 0.1f, 8.0f);
        if (anc.c != a2) {
            anc.c = a2;
            anc.f = true;
        }
        anc.h();
        anc anc2 = this.c;
        float a3 = blm.a(akq.c, 0.1f, 8.0f);
        if (anc2.d != a3) {
            anc2.d = a3;
            anc2.f = true;
        }
        anc2.h();
        boolean z2 = akq.d;
        return new akq(a2, a3);
    }

    public final long a(long j) {
        anc anc = this.c;
        long j2 = anc.h;
        if (j2 < 1024) {
            double d = (double) anc.c;
            double d2 = (double) j;
            Double.isNaN(d);
            Double.isNaN(d2);
            return (long) (d * d2);
        }
        int i = anc.e;
        int i2 = anc.b;
        if (i != i2) {
            return blm.b(j, anc.g * ((long) i), j2 * ((long) i2));
        }
        return blm.b(j, anc.g, j2);
    }
}
