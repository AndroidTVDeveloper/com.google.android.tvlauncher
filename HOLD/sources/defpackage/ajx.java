package defpackage;

import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: ajx  reason: default package */
/* compiled from: PG */
final class ajx implements Runnable {
    public final akp a;
    private final CopyOnWriteArrayList b;
    private final boolean c;
    private final int d;
    private final boolean e;
    private final boolean f;
    private final boolean g;
    private final boolean h;
    private final boolean i;
    private final boolean j;
    private final boolean k;

    public ajx(akp akp, akp akp2, CopyOnWriteArrayList copyOnWriteArrayList, boolean z, int i2, boolean z2, boolean z3) {
        this.a = akp;
        this.b = new CopyOnWriteArrayList(copyOnWriteArrayList);
        this.c = z;
        this.d = i2;
        this.e = z2;
        this.k = z3;
        boolean z4 = true;
        this.f = akp2.e != akp.e;
        ajh ajh = akp2.f;
        ajh ajh2 = akp.f;
        this.g = (ajh == ajh2 || ajh2 == null) ? false : true;
        this.h = akp2.a != akp.a;
        this.i = akp2.g != akp.g;
        this.j = akp2.i == akp.i ? false : z4;
    }

    public final void run() {
        if (this.h || this.d == 0) {
            ajy.a(this.b, new ajp(this));
        }
        if (this.c) {
            ajy.a(this.b, new ajq());
        }
        if (this.g) {
            ajy.a(this.b, new ajr(this));
        }
        if (this.j) {
            bgr bgr = this.a.i;
            ajy.a(this.b, new ajs(this));
        }
        if (this.i) {
            ajy.a(this.b, new ajt(this));
        }
        if (this.f) {
            ajy.a(this.b, new aju(this));
        }
        if (this.k) {
            ajy.a(this.b, new ajv(this));
        }
        if (this.e) {
            ajy.a(this.b, ajw.a);
        }
    }
}
