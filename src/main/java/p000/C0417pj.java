package p000;

/* renamed from: pj */
/* compiled from: PG */
final class C0417pj {

    /* renamed from: a */
    public final int f10144a;

    /* renamed from: b */
    public int f10145b;

    /* renamed from: c */
    public int f10146c;

    /* renamed from: d */
    public int f10147d;

    /* renamed from: e */
    public int f10148e;

    /* renamed from: f */
    public int f10149f;

    /* renamed from: g */
    public int f10150g;

    /* renamed from: h */
    public int f10151h;

    /* renamed from: i */
    public int f10152i;

    /* renamed from: j */
    public final /* synthetic */ C0418pk f10153j;

    public C0417pj(C0418pk pkVar, int i, int i2) {
        this.f10153j = pkVar;
        this.f10144a = i;
        this.f10145b = i2;
        mo5745c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo5743a() {
        return ((this.f10148e - this.f10147d) + 1) * ((this.f10150g - this.f10149f) + 1) * ((this.f10152i - this.f10151h) + 1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo5744b() {
        return (this.f10145b + 1) - this.f10144a > 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo5745c() {
        C0418pk pkVar = this.f10153j;
        int[] iArr = pkVar.f10155a;
        int[] iArr2 = pkVar.f10156b;
        int i = Integer.MIN_VALUE;
        int i2 = Integer.MAX_VALUE;
        int i3 = Integer.MAX_VALUE;
        int i4 = Integer.MIN_VALUE;
        int i5 = Integer.MAX_VALUE;
        int i6 = Integer.MIN_VALUE;
        int i7 = 0;
        for (int i8 = this.f10144a; i8 <= this.f10145b; i8++) {
            int i9 = iArr[i8];
            i7 += iArr2[i9];
            int a = C0418pk.m8188a(i9);
            int b = C0418pk.m8192b(i9);
            int c = C0418pk.m8194c(i9);
            if (a > i) {
                i = a;
            }
            if (a < i2) {
                i2 = a;
            }
            if (b > i4) {
                i4 = b;
            }
            if (b < i3) {
                i3 = b;
            }
            if (c > i6) {
                i6 = c;
            }
            if (c < i5) {
                i5 = c;
            }
        }
        this.f10147d = i2;
        this.f10148e = i;
        this.f10149f = i3;
        this.f10150g = i4;
        this.f10151h = i5;
        this.f10152i = i6;
        this.f10146c = i7;
    }
}
