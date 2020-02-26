package p000;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: amm */
/* compiled from: PG */
public abstract class amm implements alu {

    /* renamed from: b */
    public int f779b = -1;

    /* renamed from: c */
    public int f780c = -1;

    /* renamed from: d */
    public ByteBuffer f781d = f724a;

    /* renamed from: e */
    private int f782e = -1;

    /* renamed from: f */
    private ByteBuffer f783f = f724a;

    /* renamed from: g */
    private boolean f784g;

    /* renamed from: a */
    public boolean mo612a() {
        throw null;
    }

    /* renamed from: b */
    public int mo614b() {
        return this.f779b;
    }

    /* renamed from: c */
    public int mo615c() {
        return this.f780c;
    }

    /* renamed from: d */
    public final int mo616d() {
        return this.f782e;
    }

    /* renamed from: g */
    public boolean mo619g() {
        return this.f784g && this.f781d == f724a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo655j() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo656k() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo657l() {
    }

    /* renamed from: h */
    public final void mo620h() {
        this.f781d = f724a;
        this.f784g = false;
        mo656k();
    }

    /* renamed from: f */
    public ByteBuffer mo618f() {
        ByteBuffer byteBuffer = this.f781d;
        this.f781d = f724a;
        return byteBuffer;
    }

    /* renamed from: e */
    public final void mo617e() {
        this.f784g = true;
        mo655j();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final ByteBuffer mo653a(int i) {
        if (this.f783f.capacity() < i) {
            this.f783f = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.f783f.clear();
        }
        ByteBuffer byteBuffer = this.f783f;
        this.f781d = byteBuffer;
        return byteBuffer;
    }

    /* renamed from: i */
    public final void mo621i() {
        mo620h();
        this.f783f = f724a;
        this.f782e = -1;
        this.f779b = -1;
        this.f780c = -1;
        mo657l();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo654b(int i, int i2, int i3) {
        if (i == this.f782e && i2 == this.f779b && i3 == this.f780c) {
            return false;
        }
        this.f782e = i;
        this.f779b = i2;
        this.f780c = i3;
        return true;
    }
}
