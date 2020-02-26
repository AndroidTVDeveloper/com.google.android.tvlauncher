package defpackage;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: auf  reason: default package */
/* compiled from: PG */
public final class auf implements atx {
    public final atw a(aua aua) {
        ByteBuffer byteBuffer = (ByteBuffer) bks.a(aua.c);
        return new atw(a(new bky(byteBuffer.array(), byteBuffer.limit())));
    }

    public static final aue a(bky bky) {
        return new aue((String) bks.a((Object) bky.q()), (String) bks.a((Object) bky.q()), bky.h(), bky.h(), Arrays.copyOfRange(bky.a, bky.b, bky.c));
    }
}
