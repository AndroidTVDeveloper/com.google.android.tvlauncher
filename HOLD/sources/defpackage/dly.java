package defpackage;

/* renamed from: dly  reason: default package */
/* compiled from: PG */
final class dly extends dlx {
    public final String b(byte[] bArr, int i, int i2) {
        int i3;
        int length = bArr.length;
        if ((i | i2 | ((length - i) - i2)) >= 0) {
            int i4 = i + i2;
            char[] cArr = new char[i2];
            int i5 = 0;
            while (r12 < i4) {
                byte b = bArr[r12];
                if (!dlw.a(b)) {
                    break;
                }
                i = r12 + 1;
                dlw.a(b, cArr, i3);
                i5 = i3 + 1;
            }
            while (r12 < i4) {
                int i6 = r12 + 1;
                byte b2 = bArr[r12];
                if (dlw.a(b2)) {
                    dlw.a(b2, cArr, i3);
                    r12 = i6;
                    i3++;
                    while (r12 < i4) {
                        byte b3 = bArr[r12];
                        if (!dlw.a(b3)) {
                            break;
                        }
                        r12++;
                        dlw.a(b3, cArr, i3);
                        i3++;
                    }
                } else if (!dlw.b(b2)) {
                    if (!dlw.c(b2)) {
                        if (i6 < i4 - 2) {
                            int i7 = i6 + 1;
                            int i8 = i7 + 1;
                            dlw.a(b2, bArr[i6], bArr[i7], bArr[i8], cArr, i3);
                            i3 += 2;
                            r12 = i8 + 1;
                        } else {
                            throw djn.f();
                        }
                    } else if (i6 < i4 - 1) {
                        int i9 = i6 + 1;
                        dlw.a(b2, bArr[i6], bArr[i9], cArr, i3);
                        r12 = i9 + 1;
                        i3++;
                    } else {
                        throw djn.f();
                    }
                } else if (i6 < i4) {
                    dlw.a(b2, bArr[i6], cArr, i3);
                    r12 = i6 + 1;
                    i3++;
                } else {
                    throw djn.f();
                }
            }
            return new String(cArr, 0, i3);
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(i), Integer.valueOf(i2)));
    }

    public final int a(CharSequence charSequence, byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        char charAt;
        int length = charSequence.length();
        int i5 = i2 + i;
        int i6 = 0;
        while (i6 < length && (i4 = i6 + i) < i5 && (charAt = charSequence.charAt(i6)) < 128) {
            bArr[i4] = (byte) charAt;
            i6++;
        }
        if (i6 == length) {
            return i + length;
        }
        int i7 = i + i6;
        while (i6 < length) {
            char charAt2 = charSequence.charAt(i6);
            if (charAt2 < 128 && i7 < i5) {
                bArr[i7] = (byte) charAt2;
                i7++;
            } else if (charAt2 < 2048 && i7 <= i5 - 2) {
                int i8 = i7 + 1;
                bArr[i7] = (byte) ((charAt2 >>> 6) | 960);
                i7 = i8 + 1;
                bArr[i8] = (byte) ((charAt2 & '?') | 128);
            } else if ((charAt2 < 55296 || charAt2 > 57343) && i7 <= i5 - 3) {
                int i9 = i7 + 1;
                bArr[i7] = (byte) ((charAt2 >>> 12) | 480);
                int i10 = i9 + 1;
                bArr[i9] = (byte) (((charAt2 >>> 6) & 63) | 128);
                bArr[i10] = (byte) ((charAt2 & '?') | 128);
                i7 = i10 + 1;
            } else if (i7 <= i5 - 4) {
                int i11 = i6 + 1;
                if (i11 != charSequence.length()) {
                    char charAt3 = charSequence.charAt(i11);
                    if (Character.isSurrogatePair(charAt2, charAt3)) {
                        int codePoint = Character.toCodePoint(charAt2, charAt3);
                        int i12 = i7 + 1;
                        bArr[i7] = (byte) ((codePoint >>> 18) | 240);
                        int i13 = i12 + 1;
                        bArr[i12] = (byte) (((codePoint >>> 12) & 63) | 128);
                        int i14 = i13 + 1;
                        bArr[i13] = (byte) (((codePoint >>> 6) & 63) | 128);
                        i7 = i14 + 1;
                        bArr[i14] = (byte) ((codePoint & 63) | 128);
                        i6 = i11;
                    } else {
                        i6 = i11;
                    }
                }
                throw new dlz(i6 - 1, length);
            } else if (charAt2 < 55296 || charAt2 > 57343 || ((i3 = i6 + 1) != charSequence.length() && Character.isSurrogatePair(charAt2, charSequence.charAt(i3)))) {
                StringBuilder sb = new StringBuilder(37);
                sb.append("Failed writing ");
                sb.append(charAt2);
                sb.append(" at index ");
                sb.append(i7);
                throw new ArrayIndexOutOfBoundsException(sb.toString());
            } else {
                throw new dlz(i6, length);
            }
            i6++;
        }
        return i7;
    }

    public final int c(byte[] bArr, int i, int i2) {
        while (r9 < i2 && bArr[r9] >= 0) {
            i = r9 + 1;
        }
        if (r9 < i2) {
            while (r9 < i2) {
                int i3 = r9 + 1;
                byte b = bArr[r9];
                if (b < 0) {
                    if (b >= -32) {
                        if (b >= -16) {
                            if (i3 >= i2 - 2) {
                                return dmb.b(bArr, i3, i2);
                            }
                            int i4 = i3 + 1;
                            byte b2 = bArr[i3];
                            if (b2 > -65 || (((b << 28) + (b2 + 112)) >> 30) != 0) {
                                return -1;
                            }
                            int i5 = i4 + 1;
                            if (bArr[i4] > -65) {
                                return -1;
                            }
                            i3 = i5 + 1;
                            if (bArr[i5] > -65) {
                                return -1;
                            }
                        } else if (i3 >= i2 - 1) {
                            return dmb.b(bArr, i3, i2);
                        } else {
                            int i6 = i3 + 1;
                            byte b3 = bArr[i3];
                            if (b3 > -65) {
                                return -1;
                            }
                            if (b == -32 && b3 < -96) {
                                return -1;
                            }
                            if (b == -19 && b3 >= -96) {
                                return -1;
                            }
                            r9 = i6 + 1;
                            if (bArr[i6] > -65) {
                                return -1;
                            }
                        }
                    } else if (i3 >= i2) {
                        return b;
                    } else {
                        if (b < -62) {
                            return -1;
                        }
                        r9 = i3 + 1;
                        if (bArr[i3] > -65) {
                            return -1;
                        }
                    }
                }
                r9 = i3;
            }
        }
        return 0;
    }
}
