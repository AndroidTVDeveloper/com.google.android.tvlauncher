package p000;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

/* renamed from: aco */
/* compiled from: PG */
public final class aco implements C0533tr {

    /* renamed from: a */
    private static final byte[] f97a = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));

    /* renamed from: b */
    private static final int[] f98b = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    /* renamed from: a */
    public final int mo52a(InputStream inputStream, C0628xe xeVar) {
        int i;
        ByteOrder byteOrder;
        int i2;
        int i3;
        short b;
        acn acn = new acn((InputStream) aic.m542a(inputStream));
        C0628xe xeVar2 = (C0628xe) aic.m542a(xeVar);
        int a = acn.mo45a();
        short s = -1;
        if ((a & 65496) == 65496 || a == 19789 || a == 18761) {
            while (true) {
                if (acn.mo47b() == 255 && (b = acn.mo47b()) != 218 && b != 217) {
                    i = acn.mo45a() - 2;
                    if (b == 225) {
                        break;
                    }
                    long j = (long) i;
                    if (acn.mo46a(j) != j) {
                        break;
                    }
                } else {
                    i = -1;
                }
            }
            i = -1;
            if (i != -1) {
                byte[] bArr = (byte[]) xeVar2.mo6098a(i, byte[].class);
                int i4 = i;
                while (i4 > 0) {
                    try {
                        int read = acn.f96a.read(bArr, i - i4, i4);
                        if (read == -1) {
                            break;
                        }
                        i4 -= read;
                    } catch (Throwable th) {
                        xeVar2.mo6102a(bArr);
                        throw th;
                    }
                }
                if (i - i4 == i && bArr != null && i > f97a.length) {
                    int i5 = 0;
                    int i6 = 0;
                    while (true) {
                        if (i6 < f97a.length) {
                            if (bArr[i6] != f97a[i6]) {
                                break;
                            }
                            i6++;
                        } else {
                            acl acl = new acl(bArr, i);
                            short b2 = acl.mo51b(6);
                            if (b2 == 18761) {
                                byteOrder = ByteOrder.LITTLE_ENDIAN;
                            } else if (b2 != 19789) {
                                byteOrder = ByteOrder.BIG_ENDIAN;
                            } else {
                                byteOrder = ByteOrder.BIG_ENDIAN;
                            }
                            acl.f95a.order(byteOrder);
                            int a2 = acl.mo50a(10) + 6;
                            short b3 = acl.mo51b(a2);
                            while (true) {
                                if (i5 >= b3) {
                                    break;
                                }
                                int i7 = a2 + 2 + (i5 * 12);
                                if (acl.mo51b(i7) == 274) {
                                    short b4 = acl.mo51b(i7 + 2);
                                    if (b4 > 0 && b4 <= 12) {
                                        int a3 = acl.mo50a(i7 + 4);
                                        if (a3 >= 0 && (i2 = a3 + f98b[b4]) <= 4 && (i3 = i7 + 8) >= 0 && i3 <= acl.mo49a() && i2 >= 0 && i2 + i3 <= acl.mo49a()) {
                                            s = acl.mo51b(i3);
                                            break;
                                        }
                                    }
                                }
                                i5++;
                            }
                        }
                    }
                }
                xeVar2.mo6102a(bArr);
            }
        }
        return s;
    }

    /* renamed from: a */
    private static final ImageHeaderParser$ImageType m137a(acm acm) {
        int a = acm.mo45a();
        if (a == 65496) {
            return ImageHeaderParser$ImageType.JPEG;
        }
        char a2 = ((a << 16) & 0) | ((char) acm.mo45a());
        if (a2 == 20039) {
            acm.mo46a(21);
            return acm.mo48c() >= 3 ? ImageHeaderParser$ImageType.PNG_A : ImageHeaderParser$ImageType.PNG;
        } else if ((a2 >> 8) == 4671814) {
            return ImageHeaderParser$ImageType.GIF;
        } else {
            if (a2 != 17990) {
                return ImageHeaderParser$ImageType.UNKNOWN;
            }
            acm.mo46a(4);
            if ((((acm.mo45a() << 16) & 0) | ((char) acm.mo45a())) != 16976) {
                return ImageHeaderParser$ImageType.UNKNOWN;
            }
            char a3 = ((acm.mo45a() << 16) & 0) | ((char) acm.mo45a());
            if ((a3 & 65280) != 14336) {
                return ImageHeaderParser$ImageType.UNKNOWN;
            }
            char c = a3 & 255;
            if (c == 'X') {
                acm.mo46a(4);
                return (acm.mo48c() & 16) != 0 ? ImageHeaderParser$ImageType.WEBP_A : ImageHeaderParser$ImageType.WEBP;
            } else if (c != 'L') {
                return ImageHeaderParser$ImageType.WEBP;
            } else {
                acm.mo46a(4);
                return (acm.mo48c() & 8) != 0 ? ImageHeaderParser$ImageType.WEBP_A : ImageHeaderParser$ImageType.WEBP;
            }
        }
    }

    /* renamed from: a */
    public final ImageHeaderParser$ImageType mo53a(InputStream inputStream) {
        return m137a(new acn((InputStream) aic.m542a(inputStream)));
    }

    /* renamed from: a */
    public final ImageHeaderParser$ImageType mo54a(ByteBuffer byteBuffer) {
        return m137a(new ack((ByteBuffer) aic.m542a(byteBuffer)));
    }
}
