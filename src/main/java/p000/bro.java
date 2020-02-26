package p000;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.util.List;

/* renamed from: bro */
/* compiled from: PG */
public final class bro {
    private bro() {
        new C0483rv();
    }

    /* renamed from: a */
    public static void m4076a() {
        new bro();
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: b */
    public static int m4077b(List list, InputStream inputStream, C0628xe xeVar) {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new adg(inputStream, xeVar);
        }
        inputStream.mark(5242880);
        int size = list.size();
        int i = 0;
        while (i < size) {
            try {
                int a = ((C0533tr) list.get(i)).mo52a(inputStream, xeVar);
                if (a == -1) {
                    inputStream.reset();
                    i++;
                } else {
                    inputStream.reset();
                    return a;
                }
            } catch (Throwable th) {
                inputStream.reset();
                throw th;
            }
        }
        return -1;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public static ImageHeaderParser$ImageType m4075a(List list, InputStream inputStream, C0628xe xeVar) {
        if (inputStream == null) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new adg(inputStream, xeVar);
        }
        inputStream.mark(5242880);
        int size = list.size();
        int i = 0;
        while (i < size) {
            try {
                ImageHeaderParser$ImageType a = ((C0533tr) list.get(i)).mo53a(inputStream);
                if (a == ImageHeaderParser$ImageType.UNKNOWN) {
                    inputStream.reset();
                    i++;
                } else {
                    inputStream.reset();
                    return a;
                }
            } catch (Throwable th) {
                inputStream.reset();
                throw th;
            }
        }
        return ImageHeaderParser$ImageType.UNKNOWN;
    }
}
