package p000;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* renamed from: adp */
/* compiled from: PG */
final class adp implements C0537tv {

    /* renamed from: a */
    private final ByteBuffer f156a = ByteBuffer.allocate(4);

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo83a(byte[] bArr, Object obj, MessageDigest messageDigest) {
        Integer num = (Integer) obj;
        if (num != null) {
            messageDigest.update(bArr);
            synchronized (this.f156a) {
                this.f156a.position(0);
                messageDigest.update(this.f156a.putInt(num.intValue()).array());
            }
        }
    }
}
