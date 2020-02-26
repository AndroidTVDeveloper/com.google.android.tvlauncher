package p000;

import java.nio.ByteBuffer;

/* renamed from: aev */
/* compiled from: PG */
public final class aev implements aew {
    /* renamed from: a */
    public final C0619ww mo122a(C0619ww wwVar, C0539tx txVar) {
        byte[] bArr;
        ByteBuffer b = ((aeh) wwVar.mo33b()).mo99b();
        int i = ahr.f379a;
        ahq ahq = null;
        if (!b.isReadOnly() && b.hasArray()) {
            ahq = new ahq(b.array(), b.arrayOffset(), b.limit());
        }
        if (ahq != null && ahq.f376a == 0 && ahq.f377b == ahq.f378c.length) {
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
