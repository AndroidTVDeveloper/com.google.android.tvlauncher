package defpackage;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: amn  reason: default package */
/* compiled from: PG */
final class amn extends amm {
    public int[] e;
    private boolean f;
    private int[] g;

    public final boolean a() {
        return this.f;
    }

    public final int b() {
        int[] iArr = this.g;
        return iArr == null ? this.b : iArr.length;
    }

    public final boolean a(int i, int i2, int i3) {
        boolean z = !Arrays.equals(this.e, this.g);
        int[] iArr = this.e;
        this.g = iArr;
        if (iArr == null) {
            this.f = false;
            return z;
        } else if (i3 != 2) {
            throw new alt(i, i2, i3);
        } else if (!z && !b(i, i2, 2)) {
            return false;
        } else {
            this.f = i2 != iArr.length;
            int i4 = 0;
            while (i4 < iArr.length) {
                int i5 = iArr[i4];
                if (i5 < i2) {
                    this.f = (i5 != i4) | this.f;
                    i4++;
                } else {
                    throw new alt(i, i2, 2);
                }
            }
            return true;
        }
    }

    /* access modifiers changed from: protected */
    public final void l() {
        this.g = null;
        this.e = null;
        this.f = false;
    }

    public final void a(ByteBuffer byteBuffer) {
        int[] iArr = (int[]) bks.a(this.g);
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = this.b;
        int length = ((limit - position) / (i + i)) * iArr.length;
        ByteBuffer a = a(length + length);
        while (position < limit) {
            for (int i2 : iArr) {
                a.putShort(byteBuffer.getShort(i2 + i2 + position));
            }
            int i3 = this.b;
            position += i3 + i3;
        }
        byteBuffer.position(limit);
        a.flip();
    }
}
