package defpackage;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.util.List;

/* renamed from: bro  reason: default package */
/* compiled from: PG */
public final class bro {
    private bro() {
        new rv();
    }

    public static void a() {
        new bro();
    }

    /* JADX INFO: finally extract failed */
    public static int b(List list, InputStream inputStream, xe xeVar) {
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
                int a = ((tr) list.get(i)).a(inputStream, xeVar);
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
    public static ImageHeaderParser$ImageType a(List list, InputStream inputStream, xe xeVar) {
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
                ImageHeaderParser$ImageType a = ((tr) list.get(i)).a(inputStream);
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
