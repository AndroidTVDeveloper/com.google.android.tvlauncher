package p000;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

/* renamed from: tg */
/* compiled from: PG */
final class C0522tg implements Closeable {

    /* renamed from: a */
    public final Charset f10463a;

    /* renamed from: b */
    public int f10464b;

    /* renamed from: c */
    private final InputStream f10465c;

    /* renamed from: d */
    private byte[] f10466d;

    /* renamed from: e */
    private int f10467e;

    public C0522tg(InputStream inputStream, Charset charset) {
        if (charset == null) {
            throw null;
        } else if (charset.equals(C0523th.f10468a)) {
            this.f10465c = inputStream;
            this.f10463a = charset;
            this.f10466d = new byte[8192];
        } else {
            throw new IllegalArgumentException("Unsupported encoding");
        }
    }

    public final void close() {
        synchronized (this.f10465c) {
            if (this.f10466d != null) {
                this.f10466d = null;
                this.f10465c.close();
            }
        }
    }

    /* renamed from: b */
    private final void m8361b() {
        InputStream inputStream = this.f10465c;
        byte[] bArr = this.f10466d;
        int read = inputStream.read(bArr, 0, bArr.length);
        if (read != -1) {
            this.f10467e = 0;
            this.f10464b = read;
            return;
        }
        throw new EOFException();
    }

    /* renamed from: a */
    public final String mo5974a() {
        int i;
        byte[] bArr;
        int i2;
        synchronized (this.f10465c) {
            if (this.f10466d != null) {
                if (this.f10467e >= this.f10464b) {
                    m8361b();
                }
                int i3 = this.f10467e;
                while (true) {
                    int i4 = this.f10464b;
                    if (i3 != i4) {
                        byte[] bArr2 = this.f10466d;
                        if (bArr2[i3] != 10) {
                            i3++;
                        } else {
                            int i5 = this.f10467e;
                            if (i3 != i5) {
                                i2 = i3 - 1;
                                if (bArr2[i2] == 13) {
                                    String str = new String(bArr2, i5, i2 - i5, this.f10463a.name());
                                    this.f10467e = i3 + 1;
                                    return str;
                                }
                            }
                            i2 = i3;
                            String str2 = new String(bArr2, i5, i2 - i5, this.f10463a.name());
                            this.f10467e = i3 + 1;
                            return str2;
                        }
                    } else {
                        C0521tf tfVar = new C0521tf(this, (i4 - this.f10467e) + 80);
                        loop1:
                        while (true) {
                            byte[] bArr3 = this.f10466d;
                            int i6 = this.f10467e;
                            tfVar.write(bArr3, i6, this.f10464b - i6);
                            this.f10464b = -1;
                            m8361b();
                            i = this.f10467e;
                            while (true) {
                                if (i != this.f10464b) {
                                    bArr = this.f10466d;
                                    if (bArr[i] == 10) {
                                        break loop1;
                                    }
                                    i++;
                                }
                            }
                        }
                        int i7 = this.f10467e;
                        if (i != i7) {
                            tfVar.write(bArr, i7, i - i7);
                        }
                        this.f10467e = i + 1;
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
