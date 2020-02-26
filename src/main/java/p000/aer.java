package p000;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: aer */
/* compiled from: PG */
public final class aer implements C0541tz {

    /* renamed from: a */
    private final List f210a;

    /* renamed from: b */
    private final C0541tz f211b;

    /* renamed from: c */
    private final C0628xe f212c;

    public aer(List list, C0541tz tzVar, C0628xe xeVar) {
        this.f210a = list;
        this.f211b = tzVar;
        this.f212c = xeVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C0619ww mo38a(Object obj, int i, int i2, C0539tx txVar) {
        byte[] bArr;
        InputStream inputStream = (InputStream) obj;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr2 = new byte[16384];
            while (true) {
                int read = inputStream.read(bArr2);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr2, 0, read);
            }
            byteArrayOutputStream.flush();
            bArr = byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            if (Log.isLoggable("StreamGifDecoder", 5)) {
                Log.w("StreamGifDecoder", "Error reading data from stream", e);
                bArr = null;
            } else {
                bArr = null;
            }
        }
        if (bArr == null) {
            return null;
        }
        return this.f211b.mo38a(ByteBuffer.wrap(bArr), i, i2, txVar);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo39a(Object obj, C0539tx txVar) {
        InputStream inputStream = (InputStream) obj;
        if (((Boolean) txVar.mo5987a(aeq.f209b)).booleanValue() || bro.m4075a(this.f210a, inputStream, this.f212c) != ImageHeaderParser$ImageType.GIF) {
            return false;
        }
        return true;
    }
}
