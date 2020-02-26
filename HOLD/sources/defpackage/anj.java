package defpackage;

import java.nio.ByteBuffer;

/* renamed from: anj  reason: default package */
/* compiled from: PG */
public class anj extends ane {
    public final ang b = new ang();
    public ByteBuffer c;
    public long d;
    public ByteBuffer e;
    private final int f;

    public anj(int i) {
        this.f = i;
    }

    public final boolean e() {
        return this.c == null && this.f == 0;
    }

    public final void a() {
        super.a();
        ByteBuffer byteBuffer = this.c;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.e;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
    }

    private final ByteBuffer d(int i) {
        int i2;
        if (this.f == 1) {
            return ByteBuffer.allocate(i);
        }
        ByteBuffer byteBuffer = this.c;
        if (byteBuffer != null) {
            i2 = byteBuffer.capacity();
        } else {
            i2 = 0;
        }
        StringBuilder sb = new StringBuilder(44);
        sb.append("Buffer too small (");
        sb.append(i2);
        sb.append(" < ");
        sb.append(i);
        sb.append(")");
        throw new IllegalStateException(sb.toString());
    }

    public final void c(int i) {
        ByteBuffer byteBuffer = this.c;
        if (byteBuffer != null) {
            int capacity = byteBuffer.capacity();
            int position = this.c.position();
            int i2 = i + position;
            if (capacity < i2) {
                ByteBuffer d2 = d(i2);
                if (position > 0) {
                    this.c.flip();
                    d2.put(this.c);
                }
                this.c = d2;
                return;
            }
            return;
        }
        this.c = d(i);
    }

    public final void g() {
        this.c.flip();
        ByteBuffer byteBuffer = this.e;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
    }

    public final boolean f() {
        return b(1073741824);
    }
}
