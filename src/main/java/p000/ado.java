package p000;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* renamed from: ado */
/* compiled from: PG */
final class ado implements C0537tv {

    /* renamed from: a */
    private final ByteBuffer f155a = ByteBuffer.allocate(8);

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo83a(byte[] bArr, Object obj, MessageDigest messageDigest) {
        Long l = (Long) obj;
        messageDigest.update(bArr);
        synchronized (this.f155a) {
            this.f155a.position(0);
            messageDigest.update(this.f155a.putLong(l.longValue()).array());
        }
    }
}
