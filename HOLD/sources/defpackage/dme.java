package defpackage;

/* renamed from: dme  reason: default package */
/* compiled from: PG */
public final class dme {
    public static final int a = a(1, 3);
    public static final int b = a(1, 4);

    public static int a(int i) {
        return i & 7;
    }

    static int a(int i, int i2) {
        return (i << 3) | i2;
    }

    public static int b(int i) {
        return i >>> 3;
    }
}
