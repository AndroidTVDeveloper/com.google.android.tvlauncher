package defpackage;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: adg  reason: default package */
/* compiled from: PG */
public final class adg extends FilterInputStream {
    private volatile byte[] a;
    private int b;
    private int c;
    private int d = -1;
    private int e;
    private final xe f;

    public adg(InputStream inputStream, xe xeVar) {
        super(inputStream);
        this.f = xeVar;
        this.a = (byte[]) xeVar.a(65536, byte[].class);
    }

    public final boolean markSupported() {
        return true;
    }

    public final synchronized int available() {
        InputStream inputStream;
        inputStream = this.in;
        if (this.a == null || inputStream == null) {
            throw c();
        }
        return (this.b - this.e) + inputStream.available();
    }

    public final void close() {
        if (this.a != null) {
            this.f.a(this.a);
            this.a = null;
        }
        InputStream inputStream = this.in;
        this.in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    private final int a(InputStream inputStream, byte[] bArr) {
        int length;
        int i = this.d;
        if (i != -1) {
            int i2 = this.e;
            int i3 = this.c;
            if (i2 - i < i3) {
                if (i == 0 && i3 > (length = bArr.length) && this.b == length) {
                    int i4 = length + length;
                    if (i4 > i3) {
                        i4 = i3;
                    }
                    byte[] bArr2 = (byte[]) this.f.a(i4, byte[].class);
                    System.arraycopy(bArr, 0, bArr2, 0, length);
                    this.a = bArr2;
                    this.f.a(bArr);
                    bArr = bArr2;
                } else if (i > 0) {
                    System.arraycopy(bArr, i, bArr, 0, bArr.length - i);
                }
                int i5 = this.e - this.d;
                this.e = i5;
                this.d = 0;
                this.b = 0;
                int read = inputStream.read(bArr, i5, bArr.length - i5);
                this.b = read > 0 ? this.e + read : this.e;
                return read;
            }
        }
        int read2 = inputStream.read(bArr);
        if (read2 > 0) {
            this.d = -1;
            this.e = 0;
            this.b = read2;
        }
        return read2;
    }

    public final synchronized void a() {
        this.c = this.a.length;
    }

    public final synchronized void mark(int i) {
        this.c = Math.max(this.c, i);
        this.d = this.e;
    }

    public final synchronized int read() {
        byte[] bArr = this.a;
        InputStream inputStream = this.in;
        if (bArr == null || inputStream == null) {
            throw c();
        } else if (this.e >= this.b && a(inputStream, bArr) == -1) {
            return -1;
        } else {
            if (bArr != this.a) {
                bArr = this.a;
                if (bArr == null) {
                    throw c();
                }
            }
            int i = this.b;
            int i2 = this.e;
            if (i - i2 <= 0) {
                return -1;
            }
            this.e = i2 + 1;
            return bArr[i2] & 255;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0040, code lost:
        return r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x007f, code lost:
        return r3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0071 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int read(byte[] r6, int r7, int r8) {
        /*
            r5 = this;
            monitor-enter(r5)
            byte[] r0 = r5.a     // Catch:{ all -> 0x008d }
            if (r0 == 0) goto L_0x0088
            if (r8 == 0) goto L_0x0085
            java.io.InputStream r1 = r5.in     // Catch:{ all -> 0x008d }
            if (r1 == 0) goto L_0x0080
            int r2 = r5.e     // Catch:{ all -> 0x008d }
            int r3 = r5.b     // Catch:{ all -> 0x008d }
            if (r2 < r3) goto L_0x0013
            r2 = r8
            goto L_0x002d
        L_0x0013:
            int r3 = r3 - r2
            if (r3 >= r8) goto L_0x0017
            goto L_0x0018
        L_0x0017:
            r3 = r8
        L_0x0018:
            java.lang.System.arraycopy(r0, r2, r6, r7, r3)     // Catch:{ all -> 0x008d }
            int r2 = r5.e     // Catch:{ all -> 0x008d }
            int r2 = r2 + r3
            r5.e = r2     // Catch:{ all -> 0x008d }
            if (r3 == r8) goto L_0x007e
            int r2 = r1.available()     // Catch:{ all -> 0x008d }
            if (r2 == 0) goto L_0x007e
            int r7 = r7 + r3
            int r2 = r8 - r3
        L_0x002d:
            int r3 = r5.d     // Catch:{ all -> 0x008d }
            r4 = -1
            if (r3 != r4) goto L_0x0044
            int r3 = r0.length     // Catch:{ all -> 0x008d }
            if (r2 >= r3) goto L_0x0036
            goto L_0x0044
        L_0x0036:
            int r3 = r1.read(r6, r7, r2)     // Catch:{ all -> 0x008d }
            if (r3 != r4) goto L_0x0043
            if (r2 == r8) goto L_0x0041
        L_0x003e:
            int r8 = r8 - r2
        L_0x003f:
            monitor-exit(r5)
            return r8
        L_0x0041:
            monitor-exit(r5)
            return r4
        L_0x0043:
            goto L_0x0065
        L_0x0044:
            int r3 = r5.a(r1, r0)     // Catch:{ all -> 0x008d }
            if (r3 == r4) goto L_0x0077
            byte[] r3 = r5.a     // Catch:{ all -> 0x008d }
            if (r0 != r3) goto L_0x004f
            goto L_0x0053
        L_0x004f:
            byte[] r0 = r5.a     // Catch:{ all -> 0x008d }
            if (r0 == 0) goto L_0x0072
        L_0x0053:
            int r3 = r5.b     // Catch:{ all -> 0x008d }
            int r4 = r5.e     // Catch:{ all -> 0x008d }
            int r3 = r3 - r4
            if (r3 >= r2) goto L_0x005b
            goto L_0x005c
        L_0x005b:
            r3 = r2
        L_0x005c:
            java.lang.System.arraycopy(r0, r4, r6, r7, r3)     // Catch:{ all -> 0x008d }
            int r4 = r5.e     // Catch:{ all -> 0x008d }
            int r4 = r4 + r3
            r5.e = r4     // Catch:{ all -> 0x008d }
            goto L_0x0043
        L_0x0065:
            int r2 = r2 - r3
            if (r2 == 0) goto L_0x0071
            int r4 = r1.available()     // Catch:{ all -> 0x008d }
            if (r4 == 0) goto L_0x003e
            int r7 = r7 + r3
            goto L_0x002d
        L_0x0071:
            goto L_0x003f
        L_0x0072:
            java.io.IOException r6 = c()     // Catch:{ all -> 0x008d }
            throw r6     // Catch:{ all -> 0x008d }
        L_0x0077:
            if (r2 == r8) goto L_0x007c
            int r8 = r8 - r2
            monitor-exit(r5)
            return r8
        L_0x007c:
            monitor-exit(r5)
            return r4
        L_0x007e:
            monitor-exit(r5)
            return r3
        L_0x0080:
            java.io.IOException r6 = c()     // Catch:{ all -> 0x008d }
            throw r6     // Catch:{ all -> 0x008d }
        L_0x0085:
            r6 = 0
            monitor-exit(r5)
            return r6
        L_0x0088:
            java.io.IOException r6 = c()     // Catch:{ all -> 0x008d }
            throw r6     // Catch:{ all -> 0x008d }
        L_0x008d:
            r6 = move-exception
            monitor-exit(r5)
            goto L_0x0091
        L_0x0090:
            throw r6
        L_0x0091:
            goto L_0x0090
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adg.read(byte[], int, int):int");
    }

    public final synchronized void b() {
        if (this.a != null) {
            this.f.a(this.a);
            this.a = null;
        }
    }

    public final synchronized void reset() {
        if (this.a != null) {
            int i = this.d;
            if (i != -1) {
                this.e = i;
            } else {
                int i2 = this.e;
                int i3 = this.c;
                StringBuilder sb = new StringBuilder(66);
                sb.append("Mark has been invalidated, pos: ");
                sb.append(i2);
                sb.append(" markLimit: ");
                sb.append(i3);
                throw new adf(sb.toString());
            }
        } else {
            throw new IOException("Stream is closed");
        }
    }

    public final synchronized long skip(long j) {
        if (j < 1) {
            return 0;
        }
        byte[] bArr = this.a;
        if (bArr != null) {
            InputStream inputStream = this.in;
            if (inputStream != null) {
                int i = this.b;
                int i2 = this.e;
                if (((long) (i - i2)) < j) {
                    long j2 = ((long) i) - ((long) i2);
                    this.e = i;
                    if (this.d != -1) {
                        if (j <= ((long) this.c)) {
                            if (a(inputStream, bArr) == -1) {
                                return j2;
                            }
                            int i3 = this.b;
                            int i4 = this.e;
                            if (((long) (i3 - i4)) >= j - j2) {
                                this.e = (int) ((((long) i4) + j) - j2);
                                return j;
                            }
                            this.e = i3;
                            return (j2 + ((long) i3)) - ((long) i4);
                        }
                    }
                    return j2 + inputStream.skip(j - j2);
                }
                this.e = (int) (((long) i2) + j);
                return j;
            }
            throw c();
        }
        throw c();
    }

    private static IOException c() {
        throw new IOException("BufferedInputStream is closed");
    }
}
