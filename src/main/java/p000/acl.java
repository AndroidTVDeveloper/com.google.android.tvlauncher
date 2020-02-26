package p000;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: acl */
/* compiled from: PG */
final class acl {

    /* renamed from: a */
    public final ByteBuffer f95a;

    public acl(byte[] bArr, int i) {
        this.f95a = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final short mo51b(int i) {
        if (m125a(i, 2)) {
            return this.f95a.getShort(i);
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo50a(int i) {
        if (m125a(i, 4)) {
            return this.f95a.getInt(i);
        }
        return -1;
    }

    /* renamed from: a */
    private final boolean m125a(int i, int i2) {
        return this.f95a.remaining() - i >= i2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo49a() {
        return this.f95a.remaining();
    }
}
