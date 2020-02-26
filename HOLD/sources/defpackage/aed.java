package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Queue;

/* renamed from: aed  reason: default package */
/* compiled from: PG */
final class aed {
    private final Queue a = aie.a(0);

    /* access modifiers changed from: package-private */
    public final synchronized tm a(ByteBuffer byteBuffer) {
        tm tmVar;
        tmVar = (tm) this.a.poll();
        if (tmVar == null) {
            tmVar = new tm();
        }
        tmVar.b = null;
        Arrays.fill(tmVar.a, (byte) 0);
        tmVar.c = new tl();
        tmVar.d = 0;
        tmVar.b = byteBuffer.asReadOnlyBuffer();
        tmVar.b.position(0);
        tmVar.b.order(ByteOrder.LITTLE_ENDIAN);
        return tmVar;
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a(tm tmVar) {
        tmVar.b = null;
        tmVar.c = null;
        this.a.offer(tmVar);
    }
}
