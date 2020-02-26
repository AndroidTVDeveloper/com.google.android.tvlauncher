package defpackage;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* renamed from: ado  reason: default package */
/* compiled from: PG */
final class ado implements tv {
    private final ByteBuffer a = ByteBuffer.allocate(8);

    public final /* bridge */ /* synthetic */ void a(byte[] bArr, Object obj, MessageDigest messageDigest) {
        Long l = (Long) obj;
        messageDigest.update(bArr);
        synchronized (this.a) {
            this.a.position(0);
            messageDigest.update(this.a.putLong(l.longValue()).array());
        }
    }
}
