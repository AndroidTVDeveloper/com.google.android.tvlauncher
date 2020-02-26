package defpackage;

import sun.misc.Unsafe;

/* renamed from: dlr  reason: default package */
/* compiled from: PG */
final class dlr extends dlu {
    public dlr(Unsafe unsafe) {
        super(unsafe);
    }

    public final boolean b(Object obj, long j) {
        return dlv.c ? dlv.i(obj, j) : dlv.j(obj, j);
    }

    public final byte a(Object obj, long j) {
        return dlv.c ? dlv.g(obj, j) : dlv.h(obj, j);
    }

    public final double d(Object obj, long j) {
        return Double.longBitsToDouble(f(obj, j));
    }

    public final float c(Object obj, long j) {
        return Float.intBitsToFloat(e(obj, j));
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
    public final void a(Object obj, long j, boolean z) {
        if (dlv.c) {
            dlv.a(obj, j, (byte) z);
        } else {
            dlv.b(obj, j, z ? (byte) 1 : 0);
        }
    }

    public final void a(Object obj, long j, byte b) {
        if (dlv.c) {
            dlv.a(obj, j, b);
        } else {
            dlv.b(obj, j, b);
        }
    }

    public final void a(Object obj, long j, double d) {
        a(obj, j, Double.doubleToLongBits(d));
    }

    public final void a(Object obj, long j, float f) {
        a(obj, j, Float.floatToIntBits(f));
    }
}
