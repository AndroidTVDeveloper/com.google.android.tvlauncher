package defpackage;

import java.nio.ByteBuffer;

/* renamed from: amw  reason: default package */
/* compiled from: PG */
final class amw extends amm {
    private static final int e = Float.floatToIntBits(Float.NaN);

    public final int c() {
        return 4;
    }

    public final boolean a(int i, int i2, int i3) {
        if (blm.d(i3)) {
            return b(i, i2, i3);
        }
        throw new alt(i, i2, i3);
    }

    public final boolean a() {
        return blm.d(this.c);
    }

    public final void a(ByteBuffer byteBuffer) {
        int i = this.c;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i2 = limit - position;
        if (i != 1073741824) {
            i2 = (i2 / 3) << 2;
        }
        ByteBuffer a = a(i2);
        if (i == 1073741824) {
            while (position < limit) {
                a((byteBuffer.get(position) & 255) | ((byteBuffer.get(position + 1) & 255) << 8) | ((byteBuffer.get(position + 2) & 255) << 16) | ((byteBuffer.get(position + 3) & 255) << 24), a);
                position += 4;
            }
        } else {
            while (position < limit) {
                a(((byteBuffer.get(position) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position + 2) & 255) << 24), a);
                position += 3;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        a.flip();
    }

    private static void a(int i, ByteBuffer byteBuffer) {
        double d = (double) i;
        Double.isNaN(d);
        int floatToIntBits = Float.floatToIntBits((float) (d * 4.656612875245797E-10d));
        if (floatToIntBits == e) {
            floatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(floatToIntBits);
    }
}
