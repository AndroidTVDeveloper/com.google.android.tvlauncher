package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;

/* renamed from: tf  reason: default package */
/* compiled from: PG */
final class tf extends ByteArrayOutputStream {
    private final /* synthetic */ tg a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tf(tg tgVar, int i) {
        super(i);
        this.a = tgVar;
    }

    public final String toString() {
        try {
            return new String(this.buf, 0, (this.count <= 0 || this.buf[this.count + -1] != 13) ? this.count : this.count - 1, this.a.a.name());
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }
}
