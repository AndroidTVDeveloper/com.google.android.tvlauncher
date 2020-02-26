package defpackage;

/* renamed from: dng  reason: default package */
/* compiled from: PG */
public final class dng extends djc implements dkl {
    public static final dng i;
    public int b;
    public long c;
    public long d;
    public int e;
    public dik f;
    public long g;
    public boolean h;
    private byte j = 2;

    static {
        dng dng = new dng();
        i = dng;
        dje.a(dng.class, dng);
    }

    private dng() {
        dku dku = dku.b;
        dik dik = dik.b;
        this.f = dik.b;
        this.g = 180000;
        djf djf = djf.b;
    }

    /* access modifiers changed from: protected */
    public final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return Byte.valueOf(this.j);
        }
        byte b2 = 0;
        if (i3 == 1) {
            if (obj != null) {
                b2 = 1;
            }
            this.j = b2;
            return null;
        } else if (i3 == 2) {
            return a(i, "\u0001\u0006\u0000\u0001\u0001\u0019\u0006\u0000\u0000\u0000\u0001\u0002\u0000\u0006\n\n\u000b\u0004\u0004\u000f\u0010\u0010\u0011\u0002\u0001\u0019\u0007\u0017", new Object[]{"b", "c", "f", "e", "g", "d", "h"});
        } else if (i3 == 3) {
            return new dng();
        } else {
            if (i3 != 4) {
                return i;
            }
            return new djb((byte) 0);
        }
    }
}
