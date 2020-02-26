package p000;

import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: ajx */
/* compiled from: PG */
final class ajx implements Runnable {

    /* renamed from: a */
    public final akp f466a;

    /* renamed from: b */
    private final CopyOnWriteArrayList f467b;

    /* renamed from: c */
    private final boolean f468c;

    /* renamed from: d */
    private final int f469d;

    /* renamed from: e */
    private final boolean f470e;

    /* renamed from: f */
    private final boolean f471f;

    /* renamed from: g */
    private final boolean f472g;

    /* renamed from: h */
    private final boolean f473h;

    /* renamed from: i */
    private final boolean f474i;

    /* renamed from: j */
    private final boolean f475j;

    /* renamed from: k */
    private final boolean f476k;

    public ajx(akp akp, akp akp2, CopyOnWriteArrayList copyOnWriteArrayList, boolean z, int i, boolean z2, boolean z3) {
        this.f466a = akp;
        this.f467b = new CopyOnWriteArrayList(copyOnWriteArrayList);
        this.f468c = z;
        this.f469d = i;
        this.f470e = z2;
        this.f476k = z3;
        boolean z4 = true;
        this.f471f = akp2.f615e != akp.f615e;
        ajh ajh = akp2.f616f;
        ajh ajh2 = akp.f616f;
        this.f472g = (ajh == ajh2 || ajh2 == null) ? false : true;
        this.f473h = akp2.f611a != akp.f611a;
        this.f474i = akp2.f617g != akp.f617g;
        this.f475j = akp2.f619i == akp.f619i ? false : z4;
    }

    public final void run() {
        if (this.f473h || this.f469d == 0) {
            ajy.m658a(this.f467b, new ajp(this));
        }
        if (this.f468c) {
            ajy.m658a(this.f467b, new ajq());
        }
        if (this.f472g) {
            ajy.m658a(this.f467b, new ajr(this));
        }
        if (this.f475j) {
            bgr bgr = this.f466a.f619i;
            ajy.m658a(this.f467b, new ajs(this));
        }
        if (this.f474i) {
            ajy.m658a(this.f467b, new ajt(this));
        }
        if (this.f471f) {
            ajy.m658a(this.f467b, new aju(this));
        }
        if (this.f476k) {
            ajy.m658a(this.f467b, new ajv(this));
        }
        if (this.f470e) {
            ajy.m658a(this.f467b, ajw.f465a);
        }
    }
}
