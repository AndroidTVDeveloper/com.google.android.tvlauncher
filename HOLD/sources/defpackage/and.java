package defpackage;

import java.nio.ByteBuffer;

/* renamed from: and  reason: default package */
/* compiled from: PG */
final class and extends amm {
    public int e;
    public int f;
    public long g;
    private boolean h;
    private int i;
    private boolean j;
    private int k;
    private byte[] l = blm.f;
    private int m;

    public final boolean a() {
        return this.h;
    }

    public final boolean a(int i2, int i3, int i4) {
        boolean z;
        if (i4 == 2) {
            int i5 = this.m;
            if (i5 > 0) {
                this.g += (long) (i5 / this.i);
            }
            int b = blm.b(2, i3);
            this.i = b;
            int i6 = this.f;
            this.l = new byte[(i6 * b)];
            this.m = 0;
            int i7 = this.e;
            this.k = b * i7;
            boolean z2 = this.h;
            if (i7 == 0 && i6 == 0) {
                z = false;
            } else {
                z = true;
            }
            this.h = z;
            this.j = false;
            b(i2, i3, 2);
            if (z2 == this.h) {
                return false;
            }
            return true;
        }
        throw new alt(i2, i3, i4);
    }

    public final ByteBuffer f() {
        int i2;
        if (super.g() && (i2 = this.m) > 0) {
            a(i2).put(this.l, 0, this.m).flip();
            this.m = 0;
        }
        return super.f();
    }

    public final boolean g() {
        return super.g() && this.m == 0;
    }

    /* access modifiers changed from: protected */
    public final void k() {
        if (this.j) {
            this.k = 0;
        }
        this.m = 0;
    }

    /* access modifiers changed from: protected */
    public final void l() {
        this.l = blm.f;
    }

    public final void a(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i2 = limit - position;
        if (i2 != 0) {
            this.j = true;
            int min = Math.min(i2, this.k);
            this.g += (long) (min / this.i);
            this.k -= min;
            byteBuffer.position(position + min);
            if (this.k <= 0) {
                int i3 = i2 - min;
                int length = (this.m + i3) - this.l.length;
                ByteBuffer a = a(length);
                int a2 = blm.a(length, 0, this.m);
                a.put(this.l, 0, a2);
                int a3 = blm.a(length - a2, 0, i3);
                byteBuffer.limit(byteBuffer.position() + a3);
                a.put(byteBuffer);
                byteBuffer.limit(limit);
                int i4 = i3 - a3;
                int i5 = this.m - a2;
                this.m = i5;
                byte[] bArr = this.l;
                System.arraycopy(bArr, a2, bArr, 0, i5);
                byteBuffer.get(this.l, this.m, i4);
                this.m += i4;
                a.flip();
            }
        }
    }
}
