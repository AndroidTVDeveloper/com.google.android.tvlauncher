package p000;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;

/* renamed from: tm */
/* compiled from: PG */
public final class C0528tm {

    /* renamed from: a */
    public final byte[] f10493a = new byte[256];

    /* renamed from: b */
    public ByteBuffer f10494b;

    /* renamed from: c */
    public C0527tl f10495c;

    /* renamed from: d */
    public int f10496d = 0;

    /* renamed from: e */
    public final boolean mo5983e() {
        return this.f10495c.f10481b != 0;
    }

    /* renamed from: c */
    public final int mo5981c() {
        try {
            return this.f10494b.get() & 255;
        } catch (Exception e) {
            this.f10495c.f10481b = 1;
            return 0;
        }
    }

    /* renamed from: b */
    public final void mo5980b() {
        int c = mo5981c();
        this.f10496d = c;
        if (c > 0) {
            int i = 0;
            while (true) {
                try {
                    int i2 = this.f10496d;
                    if (i < i2) {
                        int i3 = i2 - i;
                        this.f10494b.get(this.f10493a, i, i3);
                        i += i3;
                    } else {
                        return;
                    }
                } catch (Exception e) {
                    this.f10495c.f10481b = 1;
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public final int[] mo5979a(int i) {
        int[] iArr;
        byte[] bArr = new byte[(i * 3)];
        try {
            this.f10494b.get(bArr);
            iArr = new int[256];
            int i2 = 0;
            int i3 = 0;
            while (i2 < i) {
                int i4 = i3 + 1;
                try {
                    int i5 = i4 + 1;
                    int i6 = i5 + 1;
                    int i7 = i2 + 1;
                    iArr[i2] = ((bArr[i3] & 255) << 16) | -16777216 | ((bArr[i4] & 255) << 8) | (bArr[i5] & 255);
                    i3 = i6;
                    i2 = i7;
                } catch (BufferUnderflowException e) {
                    this.f10495c.f10481b = 1;
                    return iArr;
                }
            }
        } catch (BufferUnderflowException e2) {
            iArr = null;
            this.f10495c.f10481b = 1;
            return iArr;
        }
        return iArr;
    }

    /* renamed from: d */
    public final int mo5982d() {
        return this.f10494b.getShort();
    }

    /* renamed from: a */
    public final void mo5978a() {
        int c;
        do {
            c = mo5981c();
            this.f10494b.position(Math.min(this.f10494b.position() + c, this.f10494b.limit()));
        } while (c > 0);
    }
}
