package p000;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: ack */
/* compiled from: PG */
final class ack implements acm {

    /* renamed from: a */
    private final ByteBuffer f94a;

    public ack(ByteBuffer byteBuffer) {
        this.f94a = byteBuffer;
        byteBuffer.order(ByteOrder.BIG_ENDIAN);
    }

    /* renamed from: b */
    public final short mo47b() {
        throw null;
    }

    /* renamed from: c */
    public final int mo48c() {
        if (this.f94a.remaining() > 0) {
            return this.f94a.get();
        }
        return -1;
    }

    /* renamed from: a */
    public final int mo45a() {
        return ((mo48c() << 8) & 65280) | (mo48c() & 255);
    }

    /* renamed from: a */
    public final long mo46a(long j) {
        int min = (int) Math.min((long) this.f94a.remaining(), j);
        ByteBuffer byteBuffer = this.f94a;
        byteBuffer.position(byteBuffer.position() + min);
        return (long) min;
    }
}
