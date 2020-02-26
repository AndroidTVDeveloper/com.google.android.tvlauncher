package p000;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: adb */
/* compiled from: PG */
public final class adb implements C0533tr {
    /* renamed from: a */
    public final ImageHeaderParser$ImageType mo53a(InputStream inputStream) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    /* renamed from: a */
    public final ImageHeaderParser$ImageType mo54a(ByteBuffer byteBuffer) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    /* renamed from: a */
    public final int mo52a(InputStream inputStream, C0628xe xeVar) {
        C0323lx lxVar = new C0323lx(inputStream);
        C0320lu a = lxVar.mo5572a("Orientation");
        int i = 1;
        if (a != null) {
            try {
                i = a.mo5568b(lxVar.f9930e);
            } catch (NumberFormatException e) {
            }
        }
        if (i == 0) {
            return -1;
        }
        return i;
    }
}
