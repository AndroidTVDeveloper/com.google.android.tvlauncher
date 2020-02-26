package defpackage;

/* renamed from: dlw  reason: default package */
/* compiled from: PG */
final class dlw {
    dlw() {
    }

    public static boolean a(byte b) {
        return b >= 0;
    }

    public static boolean b(byte b) {
        return b < -32;
    }

    public static boolean c(byte b) {
        return b < -16;
    }

    private static boolean d(byte b) {
        return b > -65;
    }

    private static int e(byte b) {
        return b & 63;
    }

    public dlw(byte b) {
    }

    public static dlm a(Object obj) {
        return ((dje) obj).A;
    }

    static void b(Object obj) {
        a(obj).f = false;
    }

    public static void a(Object obj, dlm dlm) {
        ((dje) obj).A = dlm;
    }

    public static void a(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) {
        if (d(b2) || (((b << 28) + (b2 + 112)) >> 30) != 0 || d(b3) || d(b4)) {
            throw djn.f();
        }
        int e = ((b & 7) << 18) | (e(b2) << 12) | (e(b3) << 6) | e(b4);
        cArr[i] = (char) ((e >>> 10) + 55232);
        cArr[i + 1] = (char) ((e & 1023) + 56320);
    }

    public static void a(byte b, char[] cArr, int i) {
        cArr[i] = (char) b;
    }

    public static void a(byte b, byte b2, byte b3, char[] cArr, int i) {
        if (d(b2) || ((b == -32 && b2 < -96) || ((b == -19 && b2 >= -96) || d(b3)))) {
            throw djn.f();
        }
        cArr[i] = (char) (((b & 15) << 12) | (e(b2) << 6) | e(b3));
    }

    public static void a(byte b, byte b2, char[] cArr, int i) {
        if (b < -62 || d(b2)) {
            throw djn.f();
        }
        cArr[i] = (char) (((b & 31) << 6) | e(b2));
    }
}
