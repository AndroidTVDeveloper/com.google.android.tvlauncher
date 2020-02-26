package p000;

import java.nio.ByteBuffer;

/* renamed from: amz */
/* compiled from: PG */
final class amz extends amm {
    /* renamed from: a */
    public final boolean mo612a() {
        int i = this.f780c;
        return (i == 0 || i == 2) ? false : true;
    }

    /* renamed from: c */
    public final int mo615c() {
        return 2;
    }

    /* renamed from: a */
    public final boolean mo613a(int i, int i2, int i3) {
        if (i3 == 3 || i3 == 2 || i3 == Integer.MIN_VALUE || i3 == 1073741824) {
            return mo654b(i, i2, i3);
        }
        throw new alt(i, i2, i3);
    }

    /* renamed from: a */
    public final void mo611a(ByteBuffer byteBuffer) {
        int i;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i2 = limit - position;
        int i3 = this.f780c;
        if (i3 == Integer.MIN_VALUE) {
            int i4 = i2 / 3;
            i = i4 + i4;
        } else if (i3 == 3) {
            i = i2 + i2;
        } else if (i3 == 1073741824) {
            i = i2 / 2;
        } else {
            throw new IllegalStateException();
        }
        ByteBuffer a = mo653a(i);
        int i5 = this.f780c;
        if (i5 == Integer.MIN_VALUE) {
            while (position < limit) {
                a.put(byteBuffer.get(position + 1));
                a.put(byteBuffer.get(position + 2));
                position += 3;
            }
        } else if (i5 == 3) {
            while (position < limit) {
                a.put((byte) 0);
                a.put((byte) ((byteBuffer.get(position) & 255) - 128));
                position++;
            }
        } else if (i5 == 1073741824) {
            while (position < limit) {
                a.put(byteBuffer.get(position + 2));
                a.put(byteBuffer.get(position + 3));
                position += 4;
            }
        } else {
            throw new IllegalStateException();
        }
        byteBuffer.position(byteBuffer.limit());
        a.flip();
    }
}
