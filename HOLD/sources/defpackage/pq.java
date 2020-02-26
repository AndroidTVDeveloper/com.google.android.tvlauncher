package defpackage;

/* renamed from: pq  reason: default package */
/* compiled from: PG */
public final class pq {
    public static final pq a;
    public static final pq b;
    public static final pq c;
    public static final pq d;
    public static final pq e;
    public static final pq f;
    public final float[] g;
    public final float[] h = new float[3];
    public final float[] i = new float[3];
    public final boolean j = true;

    static {
        pq pqVar = new pq();
        a = pqVar;
        c(pqVar);
        d(a);
        pq pqVar2 = new pq();
        b = pqVar2;
        b(pqVar2);
        d(b);
        pq pqVar3 = new pq();
        c = pqVar3;
        a(pqVar3);
        d(c);
        pq pqVar4 = new pq();
        d = pqVar4;
        c(pqVar4);
        e(d);
        pq pqVar5 = new pq();
        e = pqVar5;
        b(pqVar5);
        e(e);
        pq pqVar6 = new pq();
        f = pqVar6;
        a(pqVar6);
        e(f);
    }

    public pq() {
        float[] fArr = new float[3];
        this.g = fArr;
        a(fArr);
        a(this.h);
        float[] fArr2 = this.i;
        fArr2[0] = 0.24f;
        fArr2[1] = 0.52f;
        fArr2[2] = 0.24f;
    }

    public final float b() {
        return this.i[1];
    }

    public final float c() {
        return this.i[2];
    }

    public final float a() {
        return this.i[0];
    }

    private static void a(pq pqVar) {
        float[] fArr = pqVar.h;
        fArr[1] = 0.26f;
        fArr[2] = 0.45f;
    }

    private static void c(pq pqVar) {
        float[] fArr = pqVar.h;
        fArr[0] = 0.55f;
        fArr[1] = 0.74f;
    }

    private static void e(pq pqVar) {
        float[] fArr = pqVar.g;
        fArr[1] = 0.3f;
        fArr[2] = 0.4f;
    }

    private static void b(pq pqVar) {
        float[] fArr = pqVar.h;
        fArr[0] = 0.3f;
        fArr[1] = 0.5f;
        fArr[2] = 0.7f;
    }

    private static void d(pq pqVar) {
        float[] fArr = pqVar.g;
        fArr[0] = 0.35f;
        fArr[1] = 1.0f;
    }

    private static void a(float[] fArr) {
        fArr[0] = 0.0f;
        fArr[1] = 0.5f;
        fArr[2] = 1.0f;
    }
}
