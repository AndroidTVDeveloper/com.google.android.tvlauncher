package defpackage;

import java.nio.ByteBuffer;

/* renamed from: amz  reason: default package */
/* compiled from: PG */
final class amz extends amm {
    public final boolean a() {
        int i = this.c;
        return (i == 0 || i == 2) ? false : true;
    }

    public final int c() {
        return 2;
    }

    public final boolean a(int i, int i2, int i3) {
        if (i3 == 3 || i3 == 2 || i3 == Integer.MIN_VALUE || i3 == 1073741824) {
            return b(i, i2, i3);
        }
        throw new alt(i, i2, i3);
    }

    public final void a(ByteBuffer byteBuffer) {
        int i;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i2 = limit - position;
        int i3 = this.c;
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
        ByteBuffer a = a(i);
        int i5 = this.c;
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
