package defpackage;

import java.nio.ByteBuffer;

/* renamed from: aev  reason: default package */
/* compiled from: PG */
public final class aev implements aew {
    public final ww a(ww wwVar, tx txVar) {
        byte[] bArr;
        ByteBuffer b = ((aeh) wwVar.b()).b();
        int i = ahr.a;
        ahq ahq = null;
        if (!b.isReadOnly() && b.hasArray()) {
            ahq = new ahq(b.array(), b.arrayOffset(), b.limit());
        }
        if (ahq != null && ahq.a == 0 && ahq.b == ahq.c.length) {
            bArr = b.array();
        } else {
            ByteBuffer asReadOnlyBuffer = b.asReadOnlyBuffer();
            byte[] bArr2 = new byte[asReadOnlyBuffer.limit()];
            asReadOnlyBuffer.position(0);
            asReadOnlyBuffer.get(bArr2);
            bArr = bArr2;
        }
        return new adw(bArr);
    }
}
