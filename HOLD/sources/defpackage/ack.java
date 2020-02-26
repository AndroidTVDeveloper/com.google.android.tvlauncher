package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: ack  reason: default package */
/* compiled from: PG */
final class ack implements acm {
    private final ByteBuffer a;

    public ack(ByteBuffer byteBuffer) {
        this.a = byteBuffer;
        byteBuffer.order(ByteOrder.BIG_ENDIAN);
    }

    public final short b() {
        throw null;
    }

    public final int c() {
        if (this.a.remaining() > 0) {
            return this.a.get();
        }
        return -1;
    }

    public final int a() {
        return ((c() << 8) & 65280) | (c() & 255);
    }

    public final long a(long j) {
        int min = (int) Math.min((long) this.a.remaining(), j);
        ByteBuffer byteBuffer = this.a;
        byteBuffer.position(byteBuffer.position() + min);
        return (long) min;
    }
}
