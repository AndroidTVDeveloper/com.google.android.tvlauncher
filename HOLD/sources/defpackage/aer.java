package defpackage;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: aer  reason: default package */
/* compiled from: PG */
public final class aer implements tz {
    private final List a;
    private final tz b;
    private final xe c;

    public aer(List list, tz tzVar, xe xeVar) {
        this.a = list;
        this.b = tzVar;
        this.c = xeVar;
    }

    public final /* bridge */ /* synthetic */ ww a(Object obj, int i, int i2, tx txVar) {
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
        return this.b.a(ByteBuffer.wrap(bArr), i, i2, txVar);
    }

    public final /* bridge */ /* synthetic */ boolean a(Object obj, tx txVar) {
        InputStream inputStream = (InputStream) obj;
        if (((Boolean) txVar.a(aeq.b)).booleanValue() || bro.a(this.a, inputStream, this.c) != ImageHeaderParser$ImageType.GIF) {
            return false;
        }
        return true;
    }
}
