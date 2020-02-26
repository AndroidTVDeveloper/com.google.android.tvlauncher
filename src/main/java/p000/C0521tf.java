package p000;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;

/* renamed from: tf */
/* compiled from: PG */
final class C0521tf extends ByteArrayOutputStream {

    /* renamed from: a */
    private final /* synthetic */ C0522tg f10462a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0521tf(C0522tg tgVar, int i) {
        super(i);
        this.f10462a = tgVar;
    }

    public final String toString() {
        try {
            return new String(this.buf, 0, (this.count <= 0 || this.buf[this.count + -1] != 13) ? this.count : this.count - 1, this.f10462a.f10463a.name());
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }
}
