package defpackage;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

/* renamed from: tg  reason: default package */
/* compiled from: PG */
final class tg implements Closeable {
    public final Charset a;
    public int b;
    private final InputStream c;
    private byte[] d;
    private int e;

    public tg(InputStream inputStream, Charset charset) {
        if (charset == null) {
            throw null;
        } else if (charset.equals(th.a)) {
            this.c = inputStream;
            this.a = charset;
            this.d = new byte[8192];
        } else {
            throw new IllegalArgumentException("Unsupported encoding");
        }
    }

    public final void close() {
        synchronized (this.c) {
            if (this.d != null) {
                this.d = null;
                this.c.close();
            }
        }
    }

    private final void b() {
        InputStream inputStream = this.c;
        byte[] bArr = this.d;
        int read = inputStream.read(bArr, 0, bArr.length);
        if (read != -1) {
            this.e = 0;
            this.b = read;
            return;
        }
        throw new EOFException();
    }

    public final String a() {
        int i;
        byte[] bArr;
        int i2;
        synchronized (this.c) {
            if (this.d != null) {
                if (this.e >= this.b) {
                    b();
                }
                int i3 = this.e;
                while (true) {
                    int i4 = this.b;
                    if (i3 != i4) {
                        byte[] bArr2 = this.d;
                        if (bArr2[i3] != 10) {
                            i3++;
                        } else {
                            int i5 = this.e;
                            if (i3 != i5) {
                                i2 = i3 - 1;
                                if (bArr2[i2] == 13) {
                                    String str = new String(bArr2, i5, i2 - i5, this.a.name());
                                    this.e = i3 + 1;
                                    return str;
                                }
                            }
                            i2 = i3;
                            String str2 = new String(bArr2, i5, i2 - i5, this.a.name());
                            this.e = i3 + 1;
                            return str2;
                        }
                    } else {
                        tf tfVar = new tf(this, (i4 - this.e) + 80);
                        loop1:
                        while (true) {
                            byte[] bArr3 = this.d;
                            int i6 = this.e;
                            tfVar.write(bArr3, i6, this.b - i6);
                            this.b = -1;
                            b();
                            i = this.e;
                            while (true) {
                                if (i != this.b) {
                                    bArr = this.d;
                                    if (bArr[i] == 10) {
                                        break loop1;
                                    }
                                    i++;
                                }
                            }
                        }
                        int i7 = this.e;
                        if (i != i7) {
                            tfVar.write(bArr, i7, i - i7);
                        }
                        this.e = i + 1;
                        String byteArrayOutputStream = tfVar.toString();
                        return byteArrayOutputStream;
                    }
                }
            } else {
                throw new IOException("LineReader is closed");
            }
        }
    }
}
