package p000;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: djl */
/* compiled from: PG */
public final class djl {

    /* renamed from: a */
    public static final Charset f8682a = Charset.forName("UTF-8");

    /* renamed from: b */
    public static final byte[] f8683b;

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f8683b = bArr;
        ByteBuffer.wrap(bArr);
        int length = f8683b.length;
        dil dil = new dil(length);
        try {
            if (length <= dil.f8587c) {
                dil.f8587c = length;
                int i = dil.f8585a + dil.f8586b;
                dil.f8585a = i;
                if (i > length) {
                    int i2 = i - length;
                    dil.f8586b = i2;
                    dil.f8585a = i - i2;
                    return;
                }
                dil.f8586b = 0;
                return;
            }
            throw djn.m6731a();
        } catch (djn e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: a */
    public static int m6722a(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* renamed from: a */
    public static int m6723a(boolean z) {
        return z ? 1231 : 1237;
    }

    /* renamed from: a */
    static void m6727a(Object obj) {
        if (obj == null) {
            throw null;
        }
    }

    /* renamed from: a */
    static Object m6725a(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: c */
    public static int m6730c(byte[] bArr) {
        int length = bArr.length;
        int a = m6721a(length, bArr, 0, length);
        if (a == 0) {
            return 1;
        }
        return a;
    }

    /* renamed from: a */
    static void m6726a(dkk dkk) {
        if (dkk instanceof dhv) {
            dhv dhv = (dhv) dkk;
            throw null;
        }
    }

    /* renamed from: a */
    public static boolean m6728a(byte[] bArr) {
        return dmb.f8794a.mo4667a(bArr, 0, bArr.length);
    }

    /* renamed from: a */
    static Object m6724a(Object obj, Object obj2) {
        return ((dkk) obj).mo4518o().mo4367a((dkk) obj2).mo4508f();
    }

    /* renamed from: a */
    static int m6721a(int i, byte[] bArr, int i2, int i3) {
        int i4 = i;
        for (int i5 = i2; i5 < i2 + i3; i5++) {
            i4 = (i4 * 31) + bArr[i5];
        }
        return i4;
    }

    /* renamed from: b */
    public static String m6729b(byte[] bArr) {
        return new String(bArr, f8682a);
    }
}
