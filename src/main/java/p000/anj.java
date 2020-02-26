package p000;

import java.nio.ByteBuffer;

/* renamed from: anj */
/* compiled from: PG */
public class anj extends ane {

    /* renamed from: b */
    public final ang f1424b = new ang();

    /* renamed from: c */
    public ByteBuffer f1425c;

    /* renamed from: d */
    public long f1426d;

    /* renamed from: e */
    public ByteBuffer f1427e;

    /* renamed from: f */
    private final int f1428f;

    public anj(int i) {
        this.f1428f = i;
    }

    /* renamed from: e */
    public final boolean mo1150e() {
        return this.f1425c == null && this.f1428f == 0;
    }

    /* renamed from: a */
    public final void mo1139a() {
        super.mo1139a();
        ByteBuffer byteBuffer = this.f1425c;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f1427e;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
    }

    /* renamed from: d */
    private final ByteBuffer m1576d(int i) {
        int i2;
        if (this.f1428f == 1) {
            return ByteBuffer.allocate(i);
        }
        ByteBuffer byteBuffer = this.f1425c;
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

    /* renamed from: c */
    public final void mo1149c(int i) {
        ByteBuffer byteBuffer = this.f1425c;
        if (byteBuffer != null) {
            int capacity = byteBuffer.capacity();
            int position = this.f1425c.position();
            int i2 = i + position;
            if (capacity < i2) {
                ByteBuffer d = m1576d(i2);
                if (position > 0) {
                    this.f1425c.flip();
                    d.put(this.f1425c);
                }
                this.f1425c = d;
                return;
            }
            return;
        }
        this.f1425c = m1576d(i);
    }

    /* renamed from: g */
    public final void mo1152g() {
        this.f1425c.flip();
        ByteBuffer byteBuffer = this.f1427e;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
    }

    /* renamed from: f */
    public final boolean mo1151f() {
        return mo1140b(1073741824);
    }
}
