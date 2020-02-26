package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: amm  reason: default package */
/* compiled from: PG */
public abstract class amm implements alu {
    public int b = -1;
    public int c = -1;
    public ByteBuffer d = a;
    private int e = -1;
    private ByteBuffer f = a;
    private boolean g;

    public boolean a() {
        throw null;
    }

    public int b() {
        return this.b;
    }

    public int c() {
        return this.c;
    }

    public final int d() {
        return this.e;
    }

    public boolean g() {
        return this.g && this.d == a;
    }

    /* access modifiers changed from: protected */
    public void j() {
    }

    /* access modifiers changed from: protected */
    public void k() {
    }

    /* access modifiers changed from: protected */
    public void l() {
    }

    public final void h() {
        this.d = a;
        this.g = false;
        k();
    }

    public ByteBuffer f() {
        ByteBuffer byteBuffer = this.d;
        this.d = a;
        return byteBuffer;
    }

    public final void e() {
        this.g = true;
        j();
    }

    /* access modifiers changed from: protected */
    public final ByteBuffer a(int i) {
        if (this.f.capacity() < i) {
            this.f = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.f.clear();
        }
        ByteBuffer byteBuffer = this.f;
        this.d = byteBuffer;
        return byteBuffer;
    }

    public final void i() {
        h();
        this.f = a;
        this.e = -1;
        this.b = -1;
        this.c = -1;
        l();
    }

    /* access modifiers changed from: protected */
    public final boolean b(int i, int i2, int i3) {
        if (i == this.e && i2 == this.b && i3 == this.c) {
            return false;
        }
        this.e = i;
        this.b = i2;
        this.c = i3;
        return true;
    }
}
