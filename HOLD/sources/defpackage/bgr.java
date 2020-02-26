package defpackage;

/* renamed from: bgr  reason: default package */
/* compiled from: PG */
public final class bgr {
    public final int a;
    public final akz[] b;
    public final bgm c;

    public bgr(akz[] akzArr, bgl[] bglArr) {
        this.b = akzArr;
        this.c = new bgm(bglArr);
        this.a = akzArr.length;
    }

    public final boolean a(bgr bgr, int i) {
        if (bgr == null || !blm.a(this.b[i], bgr.b[i]) || !blm.a(this.c.a(i), bgr.c.a(i))) {
            return false;
        }
        return true;
    }

    public final boolean a(int i) {
        return this.b[i] != null;
    }
}
