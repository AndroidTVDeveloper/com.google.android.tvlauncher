package defpackage;

import android.graphics.drawable.Drawable;

/* renamed from: agw  reason: default package */
/* compiled from: PG */
public abstract class agw implements ahg {
    private final int a;
    private final int b;
    private agm c;

    public agw() {
        this((byte) 0);
    }

    public final void a() {
    }

    public final void b() {
    }

    public final void b(ahf ahf) {
    }

    public final void b(Drawable drawable) {
    }

    public final void c() {
    }

    public final void c(Drawable drawable) {
    }

    public final agm d() {
        return this.c;
    }

    public agw(byte b2) {
        if (aie.a(Integer.MIN_VALUE, Integer.MIN_VALUE)) {
            this.a = Integer.MIN_VALUE;
            this.b = Integer.MIN_VALUE;
            return;
        }
        StringBuilder sb = new StringBuilder(111);
        sb.append("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: -2147483648 and height: -2147483648");
        throw new IllegalArgumentException(sb.toString());
    }

    public final void a(ahf ahf) {
        ahf.a(this.a, this.b);
    }

    public final void a(agm agm) {
        this.c = agm;
    }
}
