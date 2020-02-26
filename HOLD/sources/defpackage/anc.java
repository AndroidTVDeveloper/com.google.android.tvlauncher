package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* renamed from: anc  reason: default package */
/* compiled from: PG */
public final class anc implements alu {
    public int b = -1;
    public float c = 1.0f;
    public float d = 1.0f;
    public int e = -1;
    public boolean f;
    public long g;
    public long h;
    private int i = -1;
    private int j;
    private anb k;
    private ByteBuffer l;
    private ShortBuffer m;
    private ByteBuffer n;
    private boolean o;

    public anc() {
        ByteBuffer byteBuffer = a;
        this.l = byteBuffer;
        this.m = byteBuffer.asShortBuffer();
        this.n = a;
        this.j = -1;
    }

    public final int b() {
        return this.i;
    }

    public final int c() {
        return 2;
    }

    public final int d() {
        return this.e;
    }

    public final boolean a(int i2, int i3, int i4) {
        if (i4 == 2) {
            int i5 = this.j;
            if (i5 == -1) {
                i5 = i2;
            }
            if (this.b == i2 && this.i == i3 && this.e == i5) {
                return false;
            }
            this.b = i2;
            this.i = i3;
            this.e = i5;
            this.f = true;
            return true;
        }
        throw new alt(i2, i3, i4);
    }

    public final void h() {
        if (a()) {
            if (this.f) {
                this.k = new anb(this.b, this.i, this.c, this.d, this.e);
            } else {
                anb anb = this.k;
                if (anb != null) {
                    anb.g = 0;
                    anb.i = 0;
                    anb.j = 0;
                    anb.k = 0;
                    anb.l = 0;
                    anb.m = 0;
                    anb.n = 0;
                    anb.o = 0;
                    anb.p = 0;
                    anb.q = 0;
                }
            }
        }
        this.n = a;
        this.g = 0;
        this.h = 0;
        this.o = false;
    }

    public final ByteBuffer f() {
        ByteBuffer byteBuffer = this.n;
        this.n = a;
        return byteBuffer;
    }

    public final boolean a() {
        if (this.b != -1) {
            return Math.abs(this.c + -1.0f) >= 0.01f || Math.abs(this.d + -1.0f) >= 0.01f || this.e != this.b;
        }
        return false;
    }

    public final boolean g() {
        if (!this.o) {
            return false;
        }
        anb anb = this.k;
        return anb == null || anb.a() == 0;
    }

    public final void e() {
        int i2;
        anb anb = this.k;
        if (anb != null) {
            int i3 = anb.g;
            float f2 = anb.b;
            float f3 = anb.c;
            int i4 = anb.i + ((int) ((((((float) i3) / (f2 / f3)) + ((float) anb.j)) / (anb.d * f3)) + 0.5f));
            short[] sArr = anb.f;
            int i5 = anb.e;
            anb.f = anb.a(sArr, i3, i5 + i5 + i3);
            int i6 = 0;
            while (true) {
                int i7 = anb.e;
                i2 = i7 + i7;
                int i8 = anb.a;
                if (i6 >= i2 * i8) {
                    break;
                }
                anb.f[(i8 * i3) + i6] = 0;
                i6++;
            }
            anb.g += i2;
            anb.b();
            if (anb.i > i4) {
                anb.i = i4;
            }
            anb.g = 0;
            anb.m = 0;
            anb.j = 0;
        }
        this.o = true;
    }

    public final void a(ByteBuffer byteBuffer) {
        anb anb = (anb) bks.a(this.k);
        if (byteBuffer.hasRemaining()) {
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.g += (long) remaining;
            int remaining2 = asShortBuffer.remaining();
            int i2 = anb.a;
            int i3 = remaining2 / i2;
            int i4 = i2 * i3;
            anb.f = anb.a(anb.f, anb.g, i3);
            asShortBuffer.get(anb.f, anb.g * anb.a, (i4 + i4) / 2);
            anb.g += i3;
            anb.b();
            byteBuffer.position(byteBuffer.position() + remaining);
        }
        int a = anb.a();
        if (a > 0) {
            if (this.l.capacity() < a) {
                ByteBuffer order = ByteBuffer.allocateDirect(a).order(ByteOrder.nativeOrder());
                this.l = order;
                this.m = order.asShortBuffer();
            } else {
                this.l.clear();
                this.m.clear();
            }
            ShortBuffer shortBuffer = this.m;
            int min = Math.min(shortBuffer.remaining() / anb.a, anb.i);
            shortBuffer.put(anb.h, 0, anb.a * min);
            int i5 = anb.i - min;
            anb.i = i5;
            short[] sArr = anb.h;
            int i6 = anb.a;
            System.arraycopy(sArr, min * i6, sArr, 0, i5 * i6);
            this.h += (long) a;
            this.l.limit(a);
            this.n = this.l;
        }
    }

    public final void i() {
        this.c = 1.0f;
        this.d = 1.0f;
        this.i = -1;
        this.b = -1;
        this.e = -1;
        ByteBuffer byteBuffer = a;
        this.l = byteBuffer;
        this.m = byteBuffer.asShortBuffer();
        this.n = a;
        this.j = -1;
        this.f = false;
        this.k = null;
        this.g = 0;
        this.h = 0;
        this.o = false;
    }
}
