package p000;

/* renamed from: dmb */
/* compiled from: PG */
final class dmb {

    /* renamed from: a */
    public static final dlx f8794a;

    static {
        dlx dlx;
        if (dlv.f8780b && dlv.f8779a && !dhx.m6468a()) {
            dlx = new dma();
        } else {
            dlx = new dly();
        }
        f8794a = dlx;
    }

    /* renamed from: a */
    public static int m7085a(int i) {
        if (i > -12) {
            return -1;
        }
        return i;
    }

    /* renamed from: a */
    public static int m7086a(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }

    /* renamed from: a */
    public static int m7087a(int i, int i2, int i3) {
        if (i > -12 || i2 > -65 || i3 > -65) {
            return -1;
        }
        return (i ^ (i2 << 8)) ^ (i3 << 16);
    }

    /* renamed from: a */
    static int m7089a(CharSequence charSequence, byte[] bArr, int i, int i2) {
        return f8794a.mo4666a(charSequence, bArr, i, i2);
    }

    /* renamed from: a */
    static int m7088a(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && charSequence.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (true) {
            if (i2 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i2);
            if (charAt < 2048) {
                i3 += (127 - charAt) >>> 31;
                i2++;
            } else {
                int length2 = charSequence.length();
                while (i2 < length2) {
                    char charAt2 = charSequence.charAt(i2);
                    if (charAt2 < 2048) {
                        i += (127 - charAt2) >>> 31;
                    } else {
                        i += 2;
                        if (charAt2 >= 55296 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i2) >= 65536) {
                                i2++;
                            } else {
                                throw new dlz(i2, length2);
                            }
                        }
                    }
                    i2++;
                }
                i3 += i;
            }
        }
        if (i3 >= length) {
            return i3;
        }
        StringBuilder sb = new StringBuilder(54);
        sb.append("UTF-8 length does not fit in int: ");
        sb.append(((long) i3) + 4294967296L);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: b */
    public static int m7091b(byte[] bArr, int i, int i2) {
        byte b = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 == 0) {
            return m7085a(b);
        }
        if (i3 == 1) {
            return m7086a(b, bArr[i]);
        }
        if (i3 == 2) {
            return m7087a(b, bArr[i], bArr[i + 1]);
        }
        throw new AssertionError();
    }

    /* renamed from: a */
    public static boolean m7090a(byte[] bArr, int i, int i2) {
        return f8794a.mo4667a(bArr, i, i2);
    }
}
