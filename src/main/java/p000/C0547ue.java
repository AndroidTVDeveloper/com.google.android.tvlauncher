package p000;

import java.io.OutputStream;

/* renamed from: ue */
/* compiled from: PG */
public final class C0547ue extends OutputStream {

    /* renamed from: a */
    private final OutputStream f10535a;

    /* renamed from: b */
    private byte[] f10536b;

    /* renamed from: c */
    private final C0628xe f10537c;

    /* renamed from: d */
    private int f10538d;

    public C0547ue(OutputStream outputStream, C0628xe xeVar) {
        this.f10535a = outputStream;
        this.f10537c = xeVar;
        this.f10536b = (byte[]) xeVar.mo6098a(65536, byte[].class);
    }

    /* JADX INFO: finally extract failed */
    public final void close() {
        try {
            flush();
            this.f10535a.close();
            byte[] bArr = this.f10536b;
            if (bArr != null) {
                this.f10537c.mo6102a(bArr);
                this.f10536b = null;
            }
        } catch (Throwable th) {
            this.f10535a.close();
            throw th;
        }
    }

    public final void flush() {
        m8410a();
        this.f10535a.flush();
    }

    /* renamed from: a */
    private final void m8410a() {
        int i = this.f10538d;
        if (i > 0) {
            this.f10535a.write(this.f10536b, 0, i);
            this.f10538d = 0;
        }
    }

    /* renamed from: b */
    private final void m8411b() {
        if (this.f10538d == this.f10536b.length) {
            m8410a();
        }
    }

    public final void write(int i) {
        byte[] bArr = this.f10536b;
        int i2 = this.f10538d;
        this.f10538d = i2 + 1;
        bArr[i2] = (byte) i;
        m8411b();
    }

    public final void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    public final void write(byte[] bArr, int i, int i2) {
        int i3 = 0;
        do {
            int i4 = i2 - i3;
            int i5 = i + i3;
            int i6 = this.f10538d;
            if (i6 == 0 && i4 >= this.f10536b.length) {
                this.f10535a.write(bArr, i5, i4);
                return;
            }
            int min = Math.min(i4, this.f10536b.length - i6);
            System.arraycopy(bArr, i5, this.f10536b, this.f10538d, min);
            this.f10538d += min;
            i3 += min;
            m8411b();
        } while (i3 < i2);
    }
}
