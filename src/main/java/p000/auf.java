package p000;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: auf */
/* compiled from: PG */
public final class auf implements atx {
    /* renamed from: a */
    public final atw mo1353a(aua aua) {
        ByteBuffer byteBuffer = (ByteBuffer) bks.m3507a(aua.f1425c);
        return new atw(m2161a(new bky(byteBuffer.array(), byteBuffer.limit())));
    }

    /* renamed from: a */
    public static final aue m2161a(bky bky) {
        return new aue((String) bks.m3507a((Object) bky.mo2090q()), (String) bks.m3507a((Object) bky.mo2090q()), bky.mo2081h(), bky.mo2081h(), Arrays.copyOfRange(bky.f4258a, bky.f4259b, bky.f4260c));
    }
}
