package p000;

import sun.misc.Unsafe;

/* renamed from: dlt */
/* compiled from: PG */
final class dlt extends dlu {
    public dlt(Unsafe unsafe) {
        super(unsafe);
    }

    /* renamed from: b */
    public final boolean mo4654b(Object obj, long j) {
        return this.f8778a.getBoolean(obj, j);
    }

    /* renamed from: a */
    public final byte mo4649a(Object obj, long j) {
        return this.f8778a.getByte(obj, j);
    }

    /* renamed from: d */
    public final double mo4656d(Object obj, long j) {
        return this.f8778a.getDouble(obj, j);
    }

    /* renamed from: c */
    public final float mo4655c(Object obj, long j) {
        return this.f8778a.getFloat(obj, j);
    }

    /* renamed from: a */
    public final void mo4653a(Object obj, long j, boolean z) {
        this.f8778a.putBoolean(obj, j, z);
    }

    /* renamed from: a */
    public final void mo4650a(Object obj, long j, byte b) {
        this.f8778a.putByte(obj, j, b);
    }

    /* renamed from: a */
    public final void mo4651a(Object obj, long j, double d) {
        this.f8778a.putDouble(obj, j, d);
    }

    /* renamed from: a */
    public final void mo4652a(Object obj, long j, float f) {
        this.f8778a.putFloat(obj, j, f);
    }
}
