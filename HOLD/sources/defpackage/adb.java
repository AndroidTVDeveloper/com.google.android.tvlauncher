package defpackage;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: adb  reason: default package */
/* compiled from: PG */
public final class adb implements tr {
    public final ImageHeaderParser$ImageType a(InputStream inputStream) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    public final ImageHeaderParser$ImageType a(ByteBuffer byteBuffer) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    public final int a(InputStream inputStream, xe xeVar) {
        lx lxVar = new lx(inputStream);
        lu a = lxVar.a("Orientation");
        int i = 1;
        if (a != null) {
            try {
                i = a.b(lxVar.e);
            } catch (NumberFormatException e) {
            }
        }
        if (i == 0) {
            return -1;
        }
        return i;
    }
}
