package p000;

import android.graphics.drawable.Drawable;

/* renamed from: agw */
/* compiled from: PG */
public abstract class agw implements ahg {

    /* renamed from: a */
    private final int f347a;

    /* renamed from: b */
    private final int f348b;

    /* renamed from: c */
    private agm f349c;

    public agw() {
        this((byte) 0);
    }

    /* renamed from: a */
    public final void mo158a() {
    }

    /* renamed from: b */
    public final void mo159b() {
    }

    /* renamed from: b */
    public final void mo232b(ahf ahf) {
    }

    /* renamed from: b */
    public final void mo233b(Drawable drawable) {
    }

    /* renamed from: c */
    public final void mo160c() {
    }

    /* renamed from: c */
    public final void mo235c(Drawable drawable) {
    }

    /* renamed from: d */
    public final agm mo237d() {
        return this.f349c;
    }

    public agw(byte b) {
        if (aie.m560a(Integer.MIN_VALUE, Integer.MIN_VALUE)) {
            this.f347a = Integer.MIN_VALUE;
            this.f348b = Integer.MIN_VALUE;
            return;
        }
        StringBuilder sb = new StringBuilder(111);
        sb.append("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: -2147483648 and height: -2147483648");
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public final void mo230a(ahf ahf) {
        ahf.mo245a(this.f347a, this.f348b);
    }

    /* renamed from: a */
    public final void mo229a(agm agm) {
        this.f349c = agm;
    }
}
