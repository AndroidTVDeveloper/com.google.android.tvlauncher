package defpackage;

import java.util.Arrays;

/* renamed from: bnx  reason: default package */
/* compiled from: PG */
final class bnx extends bnw {
    private final byte[] a;

    public bnx(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.a = bArr;
    }

    public final byte[] a() {
        return this.a;
    }
}
