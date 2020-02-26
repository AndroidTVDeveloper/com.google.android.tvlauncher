package defpackage;

import java.nio.ByteBuffer;

/* renamed from: ana  reason: default package */
/* compiled from: PG */
public final class ana extends amm {
    public long e;
    private int f;
    private byte[] g = blm.f;
    private byte[] h = blm.f;
    private int i;
    private int j;
    private boolean k;

    public final boolean a() {
        return false;
    }

    public final boolean a(int i2, int i3, int i4) {
        if (i4 == 2) {
            this.f = i3 + i3;
            return b(i2, i3, 2);
        }
        throw new alt(i2, i3, i4);
    }

    private final int b(ByteBuffer byteBuffer) {
        int position = byteBuffer.position() + 1;
        while (position < byteBuffer.limit()) {
            if (Math.abs((int) byteBuffer.get(position)) <= 4) {
                position += 2;
            } else {
                int i2 = this.f;
                return i2 * (position / i2);
            }
        }
        return byteBuffer.limit();
    }

    /* access modifiers changed from: protected */
    public final void k() {
        this.i = 0;
        this.e = 0;
        this.j = 0;
        this.k = false;
    }

    /* access modifiers changed from: protected */
    public final void j() {
        int i2 = this.j;
        if (i2 > 0) {
            a(this.g, i2);
        }
        boolean z = this.k;
    }

    /* access modifiers changed from: protected */
    public final void l() {
        this.g = blm.f;
        this.h = blm.f;
    }

    private final void a(byte[] bArr, int i2) {
        a(i2).put(bArr, 0, i2).flip();
        if (i2 > 0) {
            this.k = true;
        }
    }

    public final void a(ByteBuffer byteBuffer) {
        int position;
        int i2;
        while (byteBuffer.hasRemaining() && !this.d.hasRemaining()) {
            int i3 = this.i;
            if (i3 == 0) {
                int limit = byteBuffer.limit();
                byteBuffer.limit(Math.min(limit, byteBuffer.position() + this.g.length));
                int limit2 = byteBuffer.limit() - 1;
                while (true) {
                    if (limit2 < byteBuffer.position()) {
                        position = byteBuffer.position();
                        break;
                    } else if (Math.abs((int) byteBuffer.get(limit2)) > 4) {
                        int i4 = this.f;
                        position = ((limit2 / i4) * i4) + i4;
                        break;
                    } else {
                        limit2 -= 2;
                    }
                }
                if (position == byteBuffer.position()) {
                    this.i = 1;
                } else {
                    byteBuffer.limit(position);
                    int remaining = byteBuffer.remaining();
                    a(remaining).put(byteBuffer).flip();
                    if (remaining > 0) {
                        this.k = true;
                    }
                }
                byteBuffer.limit(limit);
            } else if (i3 != 1) {
                int limit3 = byteBuffer.limit();
                int b = b(byteBuffer);
                byteBuffer.limit(b);
                this.e += (long) (byteBuffer.remaining() / this.f);
                a(byteBuffer, this.h, 0);
                if (b < limit3) {
                    a(this.h, 0);
                    this.i = 0;
                    byteBuffer.limit(limit3);
                }
            } else {
                int limit4 = byteBuffer.limit();
                int b2 = b(byteBuffer);
                int position2 = b2 - byteBuffer.position();
                byte[] bArr = this.g;
                int length = bArr.length;
                int i5 = this.j;
                int i6 = length - i5;
                if (b2 >= limit4 || position2 >= i6) {
                    int min = Math.min(position2, i6);
                    byteBuffer.limit(byteBuffer.position() + min);
                    byteBuffer.get(this.g, this.j, min);
                    int i7 = this.j + min;
                    this.j = i7;
                    byte[] bArr2 = this.g;
                    if (i7 == bArr2.length) {
                        if (this.k) {
                            a(bArr2, 0);
                            long j2 = this.e;
                            i2 = this.j;
                            this.e = j2 + ((long) (i2 / this.f));
                        } else {
                            this.e += (long) (i7 / this.f);
                            i2 = i7;
                        }
                        a(byteBuffer, this.g, i2);
                        this.j = 0;
                        this.i = 2;
                    }
                    byteBuffer.limit(limit4);
                } else {
                    a(bArr, i5);
                    this.j = 0;
                    this.i = 0;
                }
            }
        }
    }

    private final void a(ByteBuffer byteBuffer, byte[] bArr, int i2) {
        int min = Math.min(byteBuffer.remaining(), 0);
        int i3 = -min;
        System.arraycopy(bArr, i2 - i3, this.h, 0, i3);
        byteBuffer.position(byteBuffer.limit() - min);
        byteBuffer.get(this.h, i3, min);
    }
}
