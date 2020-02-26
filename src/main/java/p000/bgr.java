package p000;

/* renamed from: bgr */
/* compiled from: PG */
public final class bgr {

    /* renamed from: a */
    public final int f3833a;

    /* renamed from: b */
    public final akz[] f3834b;

    /* renamed from: c */
    public final bgm f3835c;

    public bgr(akz[] akzArr, bgl[] bglArr) {
        this.f3834b = akzArr;
        this.f3835c = new bgm(bglArr);
        this.f3833a = akzArr.length;
    }

    /* renamed from: a */
    public final boolean mo1868a(bgr bgr, int i) {
        if (bgr == null || !blm.m3652a(this.f3834b[i], bgr.f3834b[i]) || !blm.m3652a(this.f3835c.mo1861a(i), bgr.f3835c.mo1861a(i))) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo1867a(int i) {
        return this.f3834b[i] != null;
    }
}
