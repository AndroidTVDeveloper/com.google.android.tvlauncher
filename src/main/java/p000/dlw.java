package p000;

/* renamed from: dlw */
/* compiled from: PG */
final class dlw {
    dlw() {
    }

    /* renamed from: a */
    public static boolean m7056a(byte b) {
        return b >= 0;
    }

    /* renamed from: b */
    public static boolean m7058b(byte b) {
        return b < -32;
    }

    /* renamed from: c */
    public static boolean m7059c(byte b) {
        return b < -16;
    }

    /* renamed from: d */
    private static boolean m7060d(byte b) {
        return b > -65;
    }

    /* renamed from: e */
    private static int m7061e(byte b) {
        return b & 63;
    }

    public dlw(byte b) {
    }

    /* renamed from: a */
    public static dlm m7050a(Object obj) {
        return ((dje) obj).f8677A;
    }

    /* renamed from: b */
    static void m7057b(Object obj) {
        m7050a(obj).f8771f = false;
    }

    /* renamed from: a */
    public static void m7055a(Object obj, dlm dlm) {
        ((dje) obj).f8677A = dlm;
    }

    /* renamed from: a */
    public static void m7051a(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) {
        if (m7060d(b2) || (((b << 28) + (b2 + 112)) >> 30) != 0 || m7060d(b3) || m7060d(b4)) {
            throw djn.m6736f();
        }
        int e = ((b & 7) << 18) | (m7061e(b2) << 12) | (m7061e(b3) << 6) | m7061e(b4);
        cArr[i] = (char) ((e >>> 10) + 55232);
        cArr[i + 1] = (char) ((e & 1023) + 56320);
    }

    /* renamed from: a */
    public static void m7054a(byte b, char[] cArr, int i) {
        cArr[i] = (char) b;
    }

    /* renamed from: a */
    public static void m7052a(byte b, byte b2, byte b3, char[] cArr, int i) {
        if (m7060d(b2) || ((b == -32 && b2 < -96) || ((b == -19 && b2 >= -96) || m7060d(b3)))) {
            throw djn.m6736f();
        }
        cArr[i] = (char) (((b & 15) << 12) | (m7061e(b2) << 6) | m7061e(b3));
    }

    /* renamed from: a */
    public static void m7053a(byte b, byte b2, char[] cArr, int i) {
        if (b < -62 || m7060d(b2)) {
            throw djn.m6736f();
        }
        cArr[i] = (char) (((b & 31) << 6) | m7061e(b2));
    }
}
