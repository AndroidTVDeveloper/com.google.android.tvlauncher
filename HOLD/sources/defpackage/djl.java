package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: djl  reason: default package */
/* compiled from: PG */
public final class djl {
    public static final Charset a = Charset.forName("UTF-8");
    public static final byte[] b;

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        b = bArr;
        ByteBuffer.wrap(bArr);
        int length = b.length;
        dil dil = new dil(length);
        try {
            if (length <= dil.c) {
                dil.c = length;
                int i = dil.a + dil.b;
                dil.a = i;
                if (i > length) {
                    int i2 = i - length;
                    dil.b = i2;
                    dil.a = i - i2;
                    return;
                }
                dil.b = 0;
                return;
            }
            throw djn.a();
        } catch (djn e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static int a(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static int a(boolean z) {
        return z ? 1231 : 1237;
    }

    static void a(Object obj) {
        if (obj == null) {
            throw null;
        }
    }

    static Object a(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    public static int c(byte[] bArr) {
        int length = bArr.length;
        int a2 = a(length, bArr, 0, length);
        if (a2 == 0) {
            return 1;
        }
        return a2;
    }

    static void a(dkk dkk) {
        if (dkk instanceof dhv) {
            dhv dhv = (dhv) dkk;
            throw null;
        }
    }

    public static boolean a(byte[] bArr) {
        return dmb.a.a(bArr, 0, bArr.length);
    }

    static Object a(Object obj, Object obj2) {
        return ((dkk) obj).o().a((dkk) obj2).f();
    }

    static int a(int i, byte[] bArr, int i2, int i3) {
        int i4 = i;
        for (int i5 = i2; i5 < i2 + i3; i5++) {
            i4 = (i4 * 31) + bArr[i5];
        }
        return i4;
    }

    public static String b(byte[] bArr) {
        return new String(bArr, a);
    }
}
