package defpackage;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;

/* renamed from: tm  reason: default package */
/* compiled from: PG */
public final class tm {
    public final byte[] a = new byte[256];
    public ByteBuffer b;
    public tl c;
    public int d = 0;

    public final boolean e() {
        return this.c.b != 0;
    }

    public final int c() {
        try {
            return this.b.get() & 255;
        } catch (Exception e) {
            this.c.b = 1;
            return 0;
        }
    }

    public final void b() {
        int c2 = c();
        this.d = c2;
        if (c2 > 0) {
            int i = 0;
            while (true) {
                try {
                    int i2 = this.d;
                    if (i < i2) {
                        int i3 = i2 - i;
                        this.b.get(this.a, i, i3);
                        i += i3;
                    } else {
                        return;
                    }
                } catch (Exception e) {
                    this.c.b = 1;
                    return;
                }
            }
        }
    }

    public final int[] a(int i) {
        int[] iArr;
        byte[] bArr = new byte[(i * 3)];
        try {
            this.b.get(bArr);
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
                    this.c.b = 1;
                    return iArr;
                }
            }
        } catch (BufferUnderflowException e2) {
            iArr = null;
            this.c.b = 1;
            return iArr;
        }
        return iArr;
    }

    public final int d() {
        return this.b.getShort();
    }

    public final void a() {
        int c2;
        do {
            c2 = c();
            this.b.position(Math.min(this.b.position() + c2, this.b.limit()));
        } while (c2 > 0);
    }
}
