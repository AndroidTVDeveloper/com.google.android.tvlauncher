package p000;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Queue;

/* renamed from: aed */
/* compiled from: PG */
final class aed {

    /* renamed from: a */
    private final Queue f166a = aie.m558a(0);

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized C0528tm mo90a(ByteBuffer byteBuffer) {
        C0528tm tmVar;
        tmVar = (C0528tm) this.f166a.poll();
        if (tmVar == null) {
            tmVar = new C0528tm();
        }
        tmVar.f10494b = null;
        Arrays.fill(tmVar.f10493a, (byte) 0);
        tmVar.f10495c = new C0527tl();
        tmVar.f10496d = 0;
        tmVar.f10494b = byteBuffer.asReadOnlyBuffer();
        tmVar.f10494b.position(0);
        tmVar.f10494b.order(ByteOrder.LITTLE_ENDIAN);
        return tmVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo91a(C0528tm tmVar) {
        tmVar.f10494b = null;
        tmVar.f10495c = null;
        this.f166a.offer(tmVar);
    }
}
