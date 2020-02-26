package p000;

import java.nio.ByteBuffer;

/* renamed from: amw */
/* compiled from: PG */
final class amw extends amm {

    /* renamed from: e */
    private static final int f852e = Float.floatToIntBits(Float.NaN);

    /* renamed from: c */
    public final int mo615c() {
        return 4;
    }

    /* renamed from: a */
    public final boolean mo613a(int i, int i2, int i3) {
        if (blm.m3676d(i3)) {
            return mo654b(i, i2, i3);
        }
        throw new alt(i, i2, i3);
    }

    /* renamed from: a */
    public final boolean mo612a() {
        return blm.m3676d(this.f780c);
    }

    /* renamed from: a */
    public final void mo611a(ByteBuffer byteBuffer) {
        int i = this.f780c;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i2 = limit - position;
        if (i != 1073741824) {
            i2 = (i2 / 3) << 2;
        }
        ByteBuffer a = mo653a(i2);
        if (i == 1073741824) {
            while (position < limit) {
                m1139a((byteBuffer.get(position) & 255) | ((byteBuffer.get(position + 1) & 255) << 8) | ((byteBuffer.get(position + 2) & 255) << 16) | ((byteBuffer.get(position + 3) & 255) << 24), a);
                position += 4;
            }
        } else {
            while (position < limit) {
                m1139a(((byteBuffer.get(position) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position + 2) & 255) << 24), a);
                position += 3;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        a.flip();
    }

    /* renamed from: a */
    private static void m1139a(int i, ByteBuffer byteBuffer) {
        double d = (double) i;
        Double.isNaN(d);
        int floatToIntBits = Float.floatToIntBits((float) (d * 4.656612875245797E-10d));
        if (floatToIntBits == f852e) {
            floatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(floatToIntBits);
    }
}
