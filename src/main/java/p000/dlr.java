package p000;

import sun.misc.Unsafe;

/* renamed from: dlr */
/* compiled from: PG */
final class dlr extends dlu {
    public dlr(Unsafe unsafe) {
        super(unsafe);
    }

    /* renamed from: b */
    public final boolean mo4654b(Object obj, long j) {
        return dlv.f8781c ? dlv.m7048i(obj, j) : dlv.m7049j(obj, j);
    }

    /* renamed from: a */
    public final byte mo4649a(Object obj, long j) {
        return dlv.f8781c ? dlv.m7046g(obj, j) : dlv.m7047h(obj, j);
    }

    /* renamed from: d */
    public final double mo4656d(Object obj, long j) {
        return Double.longBitsToDouble(mo4664f(obj, j));
    }

    /* renamed from: c */
    public final float mo4655c(Object obj, long j) {
        return Float.intBitsToFloat(mo4663e(obj, j));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: dlv.a(java.lang.Object, long, byte):void
     arg types: [java.lang.Object, long, boolean]
     candidates:
      dlv.a(java.lang.Object, long, double):void
      dlv.a(java.lang.Object, long, float):void
      dlv.a(java.lang.Object, long, int):void
      dlv.a(java.lang.Object, long, long):void
      dlv.a(java.lang.Object, long, java.lang.Object):void
      dlv.a(java.lang.Object, long, boolean):void
      dlv.a(byte[], long, byte):void
      dlv.a(java.lang.Object, long, byte):void */
    /* renamed from: a */
    public final void mo4653a(Object obj, long j, boolean z) {
        if (dlv.f8781c) {
            dlv.m7028a(obj, j, (byte) z);
        } else {
            dlv.m7039b(obj, j, z ? (byte) 1 : 0);
        }
    }

    /* renamed from: a */
    public final void mo4650a(Object obj, long j, byte b) {
        if (dlv.f8781c) {
            dlv.m7028a(obj, j, b);
        } else {
            dlv.m7039b(obj, j, b);
        }
    }

    /* renamed from: a */
    public final void mo4651a(Object obj, long j, double d) {
        mo4659a(obj, j, Double.doubleToLongBits(d));
    }

    /* renamed from: a */
    public final void mo4652a(Object obj, long j, float f) {
        mo4658a(obj, j, Float.floatToIntBits(f));
    }
}
