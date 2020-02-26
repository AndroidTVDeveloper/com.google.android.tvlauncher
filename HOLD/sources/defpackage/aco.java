package defpackage;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

/* renamed from: aco  reason: default package */
/* compiled from: PG */
public final class aco implements tr {
    private static final byte[] a = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));
    private static final int[] b = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    public final int a(InputStream inputStream, xe xeVar) {
        int i;
        ByteOrder byteOrder;
        int i2;
        int i3;
        short b2;
        acn acn = new acn((InputStream) aic.a(inputStream));
        xe xeVar2 = (xe) aic.a(xeVar);
        int a2 = acn.a();
        short s = -1;
        if ((a2 & 65496) == 65496 || a2 == 19789 || a2 == 18761) {
            while (true) {
                if (acn.b() == 255 && (b2 = acn.b()) != 218 && b2 != 217) {
                    i = acn.a() - 2;
                    if (b2 == 225) {
                        break;
                    }
                    long j = (long) i;
                    if (acn.a(j) != j) {
                        break;
                    }
                } else {
                    i = -1;
                }
            }
            i = -1;
            if (i != -1) {
                byte[] bArr = (byte[]) xeVar2.a(i, byte[].class);
                int i4 = i;
                while (i4 > 0) {
                    try {
                        int read = acn.a.read(bArr, i - i4, i4);
                        if (read == -1) {
                            break;
                        }
                        i4 -= read;
                    } catch (Throwable th) {
                        xeVar2.a(bArr);
                        throw th;
                    }
                }
                if (i - i4 == i && bArr != null && i > a.length) {
                    int i5 = 0;
                    int i6 = 0;
                    while (true) {
                        if (i6 < a.length) {
                            if (bArr[i6] != a[i6]) {
                                break;
                            }
                            i6++;
                        } else {
                            acl acl = new acl(bArr, i);
                            short b3 = acl.b(6);
                            if (b3 == 18761) {
                                byteOrder = ByteOrder.LITTLE_ENDIAN;
                            } else if (b3 != 19789) {
                                byteOrder = ByteOrder.BIG_ENDIAN;
                            } else {
                                byteOrder = ByteOrder.BIG_ENDIAN;
                            }
                            acl.a.order(byteOrder);
                            int a3 = acl.a(10) + 6;
                            short b4 = acl.b(a3);
                            while (true) {
                                if (i5 >= b4) {
                                    break;
                                }
                                int i7 = a3 + 2 + (i5 * 12);
                                if (acl.b(i7) == 274) {
                                    short b5 = acl.b(i7 + 2);
                                    if (b5 > 0 && b5 <= 12) {
                                        int a4 = acl.a(i7 + 4);
                                        if (a4 >= 0 && (i2 = a4 + b[b5]) <= 4 && (i3 = i7 + 8) >= 0 && i3 <= acl.a() && i2 >= 0 && i2 + i3 <= acl.a()) {
                                            s = acl.b(i3);
                                            break;
                                        }
                                    }
                                }
                                i5++;
                            }
                        }
                    }
                }
                xeVar2.a(bArr);
            }
        }
        return s;
    }

    private static final ImageHeaderParser$ImageType a(acm acm) {
        int a2 = acm.a();
        if (a2 == 65496) {
            return ImageHeaderParser$ImageType.JPEG;
        }
        char a3 = ((a2 << 16) & 0) | ((char) acm.a());
        if (a3 == 20039) {
            acm.a(21);
            return acm.c() >= 3 ? ImageHeaderParser$ImageType.PNG_A : ImageHeaderParser$ImageType.PNG;
        } else if ((a3 >> 8) == 4671814) {
            return ImageHeaderParser$ImageType.GIF;
        } else {
            if (a3 != 17990) {
                return ImageHeaderParser$ImageType.UNKNOWN;
            }
            acm.a(4);
            if ((((acm.a() << 16) & 0) | ((char) acm.a())) != 16976) {
                return ImageHeaderParser$ImageType.UNKNOWN;
            }
            char a4 = ((acm.a() << 16) & 0) | ((char) acm.a());
            if ((a4 & 65280) != 14336) {
                return ImageHeaderParser$ImageType.UNKNOWN;
            }
            char c = a4 & 255;
            if (c == 'X') {
                acm.a(4);
                return (acm.c() & 16) != 0 ? ImageHeaderParser$ImageType.WEBP_A : ImageHeaderParser$ImageType.WEBP;
            } else if (c != 'L') {
                return ImageHeaderParser$ImageType.WEBP;
            } else {
                acm.a(4);
                return (acm.c() & 8) != 0 ? ImageHeaderParser$ImageType.WEBP_A : ImageHeaderParser$ImageType.WEBP;
            }
        }
    }

    public final ImageHeaderParser$ImageType a(InputStream inputStream) {
        return a(new acn((InputStream) aic.a(inputStream)));
    }

    public final ImageHeaderParser$ImageType a(ByteBuffer byteBuffer) {
        return a(new ack((ByteBuffer) aic.a(byteBuffer)));
    }
}
