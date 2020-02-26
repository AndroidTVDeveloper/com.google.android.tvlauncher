package defpackage;

import sun.misc.Unsafe;

/* renamed from: dlt  reason: default package */
/* compiled from: PG */
final class dlt extends dlu {
    public dlt(Unsafe unsafe) {
        super(unsafe);
    }

    public final boolean b(Object obj, long j) {
        return this.a.getBoolean(obj, j);
    }

    public final byte a(Object obj, long j) {
        return this.a.getByte(obj, j);
    }

    public final double d(Object obj, long j) {
        return this.a.getDouble(obj, j);
    }

    public final float c(Object obj, long j) {
        return this.a.getFloat(obj, j);
    }

    public final void a(Object obj, long j, boolean z) {
        this.a.putBoolean(obj, j, z);
    }

    public final void a(Object obj, long j, byte b) {
        this.a.putByte(obj, j, b);
    }

    public final void a(Object obj, long j, double d) {
        this.a.putDouble(obj, j, d);
    }

    public final void a(Object obj, long j, float f) {
        this.a.putFloat(obj, j, f);
    }
}
