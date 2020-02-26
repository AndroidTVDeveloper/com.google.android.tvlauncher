package defpackage;

/* renamed from: dmb  reason: default package */
/* compiled from: PG */
final class dmb {
    public static final dlx a;

    static {
        dlx dlx;
        if (dlv.b && dlv.a && !dhx.a()) {
            dlx = new dma();
        } else {
            dlx = new dly();
        }
        a = dlx;
    }

    public static int a(int i) {
        if (i > -12) {
            return -1;
        }
        return i;
    }

    public static int a(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }

    public static int a(int i, int i2, int i3) {
        if (i > -12 || i2 > -65 || i3 > -65) {
            return -1;
        }
        return (i ^ (i2 << 8)) ^ (i3 << 16);
    }

    static int a(CharSequence charSequence, byte[] bArr, int i, int i2) {
        return a.a(charSequence, bArr, i, i2);
    }

    static int a(CharSequence charSequence) {
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

    public static int b(byte[] bArr, int i, int i2) {
        byte b = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 == 0) {
            return a(b);
        }
        if (i3 == 1) {
            return a(b, bArr[i]);
        }
        if (i3 == 2) {
            return a(b, bArr[i], bArr[i + 1]);
        }
        throw new AssertionError();
    }

    public static boolean a(byte[] bArr, int i, int i2) {
        return a.a(bArr, i, i2);
    }
}
