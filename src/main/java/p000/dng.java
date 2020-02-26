package p000;

/* renamed from: dng */
/* compiled from: PG */
public final class dng extends djc implements dkl {

    /* renamed from: i */
    public static final dng f8930i;

    /* renamed from: b */
    public int f8931b;

    /* renamed from: c */
    public long f8932c;

    /* renamed from: d */
    public long f8933d;

    /* renamed from: e */
    public int f8934e;

    /* renamed from: f */
    public dik f8935f;

    /* renamed from: g */
    public long f8936g;

    /* renamed from: h */
    public boolean f8937h;

    /* renamed from: j */
    private byte f8938j = 2;

    static {
        dng dng = new dng();
        f8930i = dng;
        dje.m6693a(dng.class, dng);
    }

    private dng() {
        dku dku = dku.f8736b;
        dik dik = dik.f8583b;
        this.f8935f = dik.f8583b;
        this.f8936g = 180000;
        djf djf = djf.f8679b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3114a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f8938j);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f8938j = b;
            return null;
        } else if (i2 == 2) {
            return m6691a(f8930i, "\u0001\u0006\u0000\u0001\u0001\u0019\u0006\u0000\u0000\u0000\u0001\u0002\u0000\u0006\n\n\u000b\u0004\u0004\u000f\u0010\u0010\u0011\u0002\u0001\u0019\u0007\u0017", new Object[]{"b", "c", "f", "e", "g", "d", "h"});
        } else if (i2 == 3) {
            return new dng();
        } else {
            if (i2 != 4) {
                return f8930i;
            }
            return new djb((byte) 0);
        }
    }
}
