package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: acl  reason: default package */
/* compiled from: PG */
final class acl {
    public final ByteBuffer a;

    public acl(byte[] bArr, int i) {
        this.a = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i);
    }

    /* access modifiers changed from: package-private */
    public final short b(int i) {
        if (a(i, 2)) {
            return this.a.getShort(i);
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    public final int a(int i) {
        if (a(i, 4)) {
            return this.a.getInt(i);
        }
        return -1;
    }

    private final boolean a(int i, int i2) {
        return this.a.remaining() - i >= i2;
    }

    /* access modifiers changed from: package-private */
    public final int a() {
        return this.a.remaining();
    }
}
