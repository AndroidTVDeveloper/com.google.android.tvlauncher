package p000;

import java.nio.ByteBuffer;

/* renamed from: ana */
/* compiled from: PG */
public final class ana extends amm {

    /* renamed from: e */
    public long f872e;

    /* renamed from: f */
    private int f873f;

    /* renamed from: g */
    private byte[] f874g = blm.f4298f;

    /* renamed from: h */
    private byte[] f875h = blm.f4298f;

    /* renamed from: i */
    private int f876i;

    /* renamed from: j */
    private int f877j;

    /* renamed from: k */
    private boolean f878k;

    /* renamed from: a */
    public final boolean mo612a() {
        return false;
    }

    /* renamed from: a */
    public final boolean mo613a(int i, int i2, int i3) {
        if (i3 == 2) {
            this.f873f = i2 + i2;
            return mo654b(i, i2, 2);
        }
        throw new alt(i, i2, i3);
    }

    /* renamed from: b */
    private final int m1180b(ByteBuffer byteBuffer) {
        int position = byteBuffer.position() + 1;
        while (position < byteBuffer.limit()) {
            if (Math.abs((int) byteBuffer.get(position)) <= 4) {
                position += 2;
            } else {
                int i = this.f873f;
                return i * (position / i);
            }
        }
        return byteBuffer.limit();
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final void mo656k() {
        this.f876i = 0;
        this.f872e = 0;
        this.f877j = 0;
        this.f878k = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo655j() {
        int i = this.f877j;
        if (i > 0) {
            m1179a(this.f874g, i);
        }
        boolean z = this.f878k;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final void mo657l() {
        this.f874g = blm.f4298f;
        this.f875h = blm.f4298f;
    }

    /* renamed from: a */
    private final void m1179a(byte[] bArr, int i) {
        mo653a(i).put(bArr, 0, i).flip();
        if (i > 0) {
            this.f878k = true;
        }
    }

    /* renamed from: a */
    public final void mo611a(ByteBuffer byteBuffer) {
        int position;
        int i;
        while (byteBuffer.hasRemaining() && !this.f781d.hasRemaining()) {
            int i2 = this.f876i;
            if (i2 == 0) {
                int limit = byteBuffer.limit();
                byteBuffer.limit(Math.min(limit, byteBuffer.position() + this.f874g.length));
                int limit2 = byteBuffer.limit() - 1;
                while (true) {
                    if (limit2 < byteBuffer.position()) {
                        position = byteBuffer.position();
                        break;
                    } else if (Math.abs((int) byteBuffer.get(limit2)) > 4) {
                        int i3 = this.f873f;
                        position = ((limit2 / i3) * i3) + i3;
                        break;
                    } else {
                        limit2 -= 2;
                    }
                }
                if (position == byteBuffer.position()) {
                    this.f876i = 1;
                } else {
                    byteBuffer.limit(position);
                    int remaining = byteBuffer.remaining();
                    mo653a(remaining).put(byteBuffer).flip();
                    if (remaining > 0) {
                        this.f878k = true;
                    }
                }
                byteBuffer.limit(limit);
            } else if (i2 != 1) {
                int limit3 = byteBuffer.limit();
                int b = m1180b(byteBuffer);
                byteBuffer.limit(b);
                this.f872e += (long) (byteBuffer.remaining() / this.f873f);
                m1178a(byteBuffer, this.f875h, 0);
                if (b < limit3) {
                    m1179a(this.f875h, 0);
                    this.f876i = 0;
                    byteBuffer.limit(limit3);
                }
            } else {
                int limit4 = byteBuffer.limit();
                int b2 = m1180b(byteBuffer);
                int position2 = b2 - byteBuffer.position();
                byte[] bArr = this.f874g;
                int length = bArr.length;
                int i4 = this.f877j;
                int i5 = length - i4;
                if (b2 >= limit4 || position2 >= i5) {
                    int min = Math.min(position2, i5);
                    byteBuffer.limit(byteBuffer.position() + min);
                    byteBuffer.get(this.f874g, this.f877j, min);
                    int i6 = this.f877j + min;
                    this.f877j = i6;
                    byte[] bArr2 = this.f874g;
                    if (i6 == bArr2.length) {
                        if (this.f878k) {
                            m1179a(bArr2, 0);
                            long j = this.f872e;
                            i = this.f877j;
                            this.f872e = j + ((long) (i / this.f873f));
                        } else {
                            this.f872e += (long) (i6 / this.f873f);
                            i = i6;
                        }
                        m1178a(byteBuffer, this.f874g, i);
                        this.f877j = 0;
                        this.f876i = 2;
                    }
                    byteBuffer.limit(limit4);
                } else {
                    m1179a(bArr, i4);
                    this.f877j = 0;
                    this.f876i = 0;
                }
            }
        }
    }

    /* renamed from: a */
    private final void m1178a(ByteBuffer byteBuffer, byte[] bArr, int i) {
        int min = Math.min(byteBuffer.remaining(), 0);
        int i2 = -min;
        System.arraycopy(bArr, i - i2, this.f875h, 0, i2);
        byteBuffer.position(byteBuffer.limit() - min);
        byteBuffer.get(this.f875h, i2, min);
    }
}
