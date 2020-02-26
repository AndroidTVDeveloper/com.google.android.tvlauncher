package p000;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* renamed from: dlu */
/* compiled from: PG */
abstract class dlu {

    /* renamed from: a */
    public final Unsafe f8778a;

    public dlu(Unsafe unsafe) {
        this.f8778a = unsafe;
    }

    /* renamed from: a */
    public abstract byte mo4649a(Object obj, long j);

    /* renamed from: a */
    public abstract void mo4650a(Object obj, long j, byte b);

    /* renamed from: a */
    public abstract void mo4651a(Object obj, long j, double d);

    /* renamed from: a */
    public abstract void mo4652a(Object obj, long j, float f);

    /* renamed from: a */
    public abstract void mo4653a(Object obj, long j, boolean z);

    /* renamed from: b */
    public abstract boolean mo4654b(Object obj, long j);

    /* renamed from: c */
    public abstract float mo4655c(Object obj, long j);

    /* renamed from: d */
    public abstract double mo4656d(Object obj, long j);

    /* renamed from: a */
    public final int mo4657a(Class cls) {
        return this.f8778a.arrayBaseOffset(cls);
    }

    /* renamed from: b */
    public final void mo4662b(Class cls) {
        this.f8778a.arrayIndexScale(cls);
    }

    /* renamed from: e */
    public final int mo4663e(Object obj, long j) {
        return this.f8778a.getInt(obj, j);
    }

    /* renamed from: f */
    public final long mo4664f(Object obj, long j) {
        return this.f8778a.getLong(obj, j);
    }

    /* renamed from: g */
    public final Object mo4665g(Object obj, long j) {
        return this.f8778a.getObject(obj, j);
    }

    /* renamed from: a */
    public final void mo4661a(Field field) {
        this.f8778a.objectFieldOffset(field);
    }

    /* renamed from: a */
    public final void mo4658a(Object obj, long j, int i) {
        this.f8778a.putInt(obj, j, i);
    }

    /* renamed from: a */
    public final void mo4659a(Object obj, long j, long j2) {
        this.f8778a.putLong(obj, j, j2);
    }

    /* renamed from: a */
    public final void mo4660a(Object obj, long j, Object obj2) {
        this.f8778a.putObject(obj, j, obj2);
    }
}
