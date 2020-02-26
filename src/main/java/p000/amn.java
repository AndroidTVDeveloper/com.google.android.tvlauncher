package p000;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: amn */
/* compiled from: PG */
final class amn extends amm {

    /* renamed from: e */
    public int[] f785e;

    /* renamed from: f */
    private boolean f786f;

    /* renamed from: g */
    private int[] f787g;

    /* renamed from: a */
    public final boolean mo612a() {
        return this.f786f;
    }

    /* renamed from: b */
    public final int mo614b() {
        int[] iArr = this.f787g;
        return iArr == null ? this.f779b : iArr.length;
    }

    /* renamed from: a */
    public final boolean mo613a(int i, int i2, int i3) {
        boolean z = !Arrays.equals(this.f785e, this.f787g);
        int[] iArr = this.f785e;
        this.f787g = iArr;
        if (iArr == null) {
            this.f786f = false;
            return z;
        } else if (i3 != 2) {
            throw new alt(i, i2, i3);
        } else if (!z && !mo654b(i, i2, 2)) {
            return false;
        } else {
            this.f786f = i2 != iArr.length;
            int i4 = 0;
            while (i4 < iArr.length) {
                int i5 = iArr[i4];
                if (i5 < i2) {
                    this.f786f = (i5 != i4) | this.f786f;
                    i4++;
                } else {
                    throw new alt(i, i2, 2);
                }
            }
            return true;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final void mo657l() {
        this.f787g = null;
        this.f785e = null;
        this.f786f = false;
    }

    /* renamed from: a */
    public final void mo611a(ByteBuffer byteBuffer) {
        int[] iArr = (int[]) bks.m3507a(this.f787g);
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = this.f779b;
        int length = ((limit - position) / (i + i)) * iArr.length;
        ByteBuffer a = mo653a(length + length);
        while (position < limit) {
            for (int i2 : iArr) {
                a.putShort(byteBuffer.getShort(i2 + i2 + position));
            }
            int i3 = this.f779b;
            position += i3 + i3;
        }
        byteBuffer.position(limit);
        a.flip();
    }
}
