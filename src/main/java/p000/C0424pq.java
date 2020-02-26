package p000;

/* renamed from: pq */
/* compiled from: PG */
public final class C0424pq {

    /* renamed from: a */
    public static final C0424pq f10178a;

    /* renamed from: b */
    public static final C0424pq f10179b;

    /* renamed from: c */
    public static final C0424pq f10180c;

    /* renamed from: d */
    public static final C0424pq f10181d;

    /* renamed from: e */
    public static final C0424pq f10182e;

    /* renamed from: f */
    public static final C0424pq f10183f;

    /* renamed from: g */
    public final float[] f10184g;

    /* renamed from: h */
    public final float[] f10185h = new float[3];

    /* renamed from: i */
    public final float[] f10186i = new float[3];

    /* renamed from: j */
    public final boolean f10187j = true;

    static {
        C0424pq pqVar = new C0424pq();
        f10178a = pqVar;
        m8207c(pqVar);
        m8208d(f10178a);
        C0424pq pqVar2 = new C0424pq();
        f10179b = pqVar2;
        m8206b(pqVar2);
        m8208d(f10179b);
        C0424pq pqVar3 = new C0424pq();
        f10180c = pqVar3;
        m8204a(pqVar3);
        m8208d(f10180c);
        C0424pq pqVar4 = new C0424pq();
        f10181d = pqVar4;
        m8207c(pqVar4);
        m8209e(f10181d);
        C0424pq pqVar5 = new C0424pq();
        f10182e = pqVar5;
        m8206b(pqVar5);
        m8209e(f10182e);
        C0424pq pqVar6 = new C0424pq();
        f10183f = pqVar6;
        m8204a(pqVar6);
        m8209e(f10183f);
    }

    public C0424pq() {
        float[] fArr = new float[3];
        this.f10184g = fArr;
        m8205a(fArr);
        m8205a(this.f10185h);
        float[] fArr2 = this.f10186i;
        fArr2[0] = 0.24f;
        fArr2[1] = 0.52f;
        fArr2[2] = 0.24f;
    }

    /* renamed from: b */
    public final float mo5755b() {
        return this.f10186i[1];
    }

    /* renamed from: c */
    public final float mo5756c() {
        return this.f10186i[2];
    }

    /* renamed from: a */
    public final float mo5754a() {
        return this.f10186i[0];
    }

    /* renamed from: a */
    private static void m8204a(C0424pq pqVar) {
        float[] fArr = pqVar.f10185h;
        fArr[1] = 0.26f;
        fArr[2] = 0.45f;
    }

    /* renamed from: c */
    private static void m8207c(C0424pq pqVar) {
        float[] fArr = pqVar.f10185h;
        fArr[0] = 0.55f;
        fArr[1] = 0.74f;
    }

    /* renamed from: e */
    private static void m8209e(C0424pq pqVar) {
        float[] fArr = pqVar.f10184g;
        fArr[1] = 0.3f;
        fArr[2] = 0.4f;
    }

    /* renamed from: b */
    private static void m8206b(C0424pq pqVar) {
        float[] fArr = pqVar.f10185h;
        fArr[0] = 0.3f;
        fArr[1] = 0.5f;
        fArr[2] = 0.7f;
    }

    /* renamed from: d */
    private static void m8208d(C0424pq pqVar) {
        float[] fArr = pqVar.f10184g;
        fArr[0] = 0.35f;
        fArr[1] = 1.0f;
    }

    /* renamed from: a */
    private static void m8205a(float[] fArr) {
        fArr[0] = 0.0f;
        fArr[1] = 0.5f;
        fArr[2] = 1.0f;
    }
}
