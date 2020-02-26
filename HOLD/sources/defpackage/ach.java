package defpackage;

import java.nio.ByteBuffer;

/* renamed from: ach  reason: default package */
/* compiled from: PG */
public final class ach implements tz {
    private final acx a;

    public ach(acx acx) {
        this.a = acx;
    }

    public final /* bridge */ /* synthetic */ ww a(Object obj, int i, int i2, tx txVar) {
        return this.a.a(ahr.a((ByteBuffer) obj), i, i2, txVar, acx.b);
    }

    public final /* bridge */ /* synthetic */ boolean a(Object obj, tx txVar) {
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        return true;
    }
}
