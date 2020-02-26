package p000;

import java.nio.ByteBuffer;

/* renamed from: and */
/* compiled from: PG */
final class and extends amm {

    /* renamed from: e */
    public int f915e;

    /* renamed from: f */
    public int f916f;

    /* renamed from: g */
    public long f917g;

    /* renamed from: h */
    private boolean f918h;

    /* renamed from: i */
    private int f919i;

    /* renamed from: j */
    private boolean f920j;

    /* renamed from: k */
    private int f921k;

    /* renamed from: l */
    private byte[] f922l = blm.f4298f;

    /* renamed from: m */
    private int f923m;

    /* renamed from: a */
    public final boolean mo612a() {
        return this.f918h;
    }

    /* renamed from: a */
    public final boolean mo613a(int i, int i2, int i3) {
        boolean z;
        if (i3 == 2) {
            int i4 = this.f923m;
            if (i4 > 0) {
                this.f917g += (long) (i4 / this.f919i);
            }
            int b = blm.m3660b(2, i2);
            this.f919i = b;
            int i5 = this.f916f;
            this.f922l = new byte[(i5 * b)];
            this.f923m = 0;
            int i6 = this.f915e;
            this.f921k = b * i6;
            boolean z2 = this.f918h;
            if (i6 == 0 && i5 == 0) {
                z = false;
            } else {
                z = true;
            }
            this.f918h = z;
            this.f920j = false;
            mo654b(i, i2, 2);
            if (z2 == this.f918h) {
                return false;
            }
            return true;
        }
        throw new alt(i, i2, i3);
    }

    /* renamed from: f */
    public final ByteBuffer mo618f() {
        int i;
        if (super.mo619g() && (i = this.f923m) > 0) {
            mo653a(i).put(this.f922l, 0, this.f923m).flip();
            this.f923m = 0;
        }
        return super.mo618f();
    }

    /* renamed from: g */
    public final boolean mo619g() {
        return super.mo619g() && this.f923m == 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final void mo656k() {
        if (this.f920j) {
            this.f921k = 0;
        }
        this.f923m = 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final void mo657l() {
        this.f922l = blm.f4298f;
    }

    /* renamed from: a */
    public final void mo611a(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = limit - position;
        if (i != 0) {
            this.f920j = true;
            int min = Math.min(i, this.f921k);
            this.f917g += (long) (min / this.f919i);
            this.f921k -= min;
            byteBuffer.position(position + min);
            if (this.f921k <= 0) {
                int i2 = i - min;
                int length = (this.f923m + i2) - this.f922l.length;
                ByteBuffer a = mo653a(length);
                int a2 = blm.m3624a(length, 0, this.f923m);
                a.put(this.f922l, 0, a2);
                int a3 = blm.m3624a(length - a2, 0, i2);
                byteBuffer.limit(byteBuffer.position() + a3);
                a.put(byteBuffer);
                byteBuffer.limit(limit);
                int i3 = i2 - a3;
                int i4 = this.f923m - a2;
                this.f923m = i4;
                byte[] bArr = this.f922l;
                System.arraycopy(bArr, a2, bArr, 0, i4);
                byteBuffer.get(this.f922l, this.f923m, i3);
                this.f923m += i3;
                a.flip();
            }
        }
    }
}
