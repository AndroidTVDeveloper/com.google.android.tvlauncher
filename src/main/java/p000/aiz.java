package p000;

/* renamed from: aiz */
/* compiled from: PG */
public abstract class aiz implements akx, aky {

    /* renamed from: a */
    public akz f420a;

    /* renamed from: b */
    public int f421b;

    /* renamed from: c */
    public axx f422c;

    /* renamed from: d */
    public akh[] f423d;

    /* renamed from: e */
    public boolean f424e;

    /* renamed from: f */
    private final int f425f;

    /* renamed from: g */
    private final aki f426g = new aki();

    /* renamed from: h */
    private long f427h;

    /* renamed from: i */
    private long f428i = Long.MIN_VALUE;

    public aiz(int i) {
        this.f425f = i;
    }

    /* renamed from: a */
    protected static boolean m599a(anq anq) {
        return anq == null;
    }

    /* renamed from: R */
    public final aky mo343R() {
        return this;
    }

    /* renamed from: a */
    public final int mo344a() {
        return this.f425f;
    }

    /* renamed from: a */
    public void mo346a(float f) {
    }

    /* renamed from: a */
    public void mo347a(int i, Object obj) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo349a(long j, boolean z) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo351a(boolean z) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo352a(akh[] akhArr, long j) {
    }

    /* renamed from: c */
    public bkr mo355c() {
        return null;
    }

    /* renamed from: d */
    public final int mo356d() {
        return this.f421b;
    }

    /* renamed from: f */
    public final axx mo358f() {
        return this.f422c;
    }

    /* renamed from: g */
    public final boolean mo359g() {
        return this.f428i == Long.MIN_VALUE;
    }

    /* renamed from: h */
    public final long mo360h() {
        return this.f428i;
    }

    /* renamed from: j */
    public final boolean mo362j() {
        return this.f424e;
    }

    /* renamed from: o */
    public int mo367o() {
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public void mo368p() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public void mo369q() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public void mo370r() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public void mo371s() {
    }

    /* renamed from: u */
    public final void mo373u() {
    }

    /* renamed from: m */
    public final void mo365m() {
        boolean z = true;
        if (this.f421b != 1) {
            z = false;
        }
        bks.m3512b(z);
        this.f426g.mo433a();
        this.f421b = 0;
        this.f422c = null;
        this.f423d = null;
        this.f424e = false;
        mo370r();
    }

    /* renamed from: a */
    public final void mo350a(akz akz, akh[] akhArr, axx axx, long j, boolean z, long j2) {
        bks.m3512b(this.f421b == 0);
        this.f420a = akz;
        this.f421b = 1;
        mo351a(z);
        mo353a(akhArr, axx, j2);
        mo349a(j, z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final aki mo372t() {
        this.f426g.mo433a();
        return this.f426g;
    }

    /* renamed from: k */
    public final void mo363k() {
        this.f422c.mo1479b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo345a(aki aki, anj anj, boolean z) {
        int a = this.f422c.mo1477a(aki, anj, z);
        if (a != -4) {
            if (a == -5) {
                akh akh = aki.f576c;
                long j = akh.f560m;
                if (j != Long.MAX_VALUE) {
                    aki.f576c = akh.mo421a(j + this.f427h);
                    return -5;
                }
            }
        } else if (anj.mo1141c()) {
            this.f428i = Long.MIN_VALUE;
            if (!this.f424e) {
                return -3;
            }
            return -4;
        } else {
            long j2 = anj.f1426d + this.f427h;
            anj.f1426d = j2;
            this.f428i = Math.max(this.f428i, j2);
        }
        return a;
    }

    /* renamed from: a */
    public final void mo353a(akh[] akhArr, axx axx, long j) {
        bks.m3512b(!this.f424e);
        this.f422c = axx;
        this.f428i = j;
        this.f423d = akhArr;
        this.f427h = j;
        mo352a(akhArr, j);
    }

    /* renamed from: n */
    public final void mo366n() {
        bks.m3512b(this.f421b == 0);
        this.f426g.mo433a();
        mo371s();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aiz.a(long, boolean):void
     arg types: [long, int]
     candidates:
      aiz.a(int, java.lang.Object):void
      aiz.a(akh[], long):void
      akx.a(long, long):void
      akv.a(int, java.lang.Object):void
      aiz.a(long, boolean):void */
    /* renamed from: a */
    public final void mo348a(long j) {
        this.f424e = false;
        this.f428i = j;
        mo349a(j, false);
    }

    /* renamed from: i */
    public final void mo361i() {
        this.f424e = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo354b(long j) {
        return this.f422c.mo1476a(j - this.f427h);
    }

    /* renamed from: e */
    public final void mo357e() {
        boolean z = true;
        if (this.f421b != 1) {
            z = false;
        }
        bks.m3512b(z);
        this.f421b = 2;
        mo368p();
    }

    /* renamed from: l */
    public final void mo364l() {
        bks.m3512b(this.f421b == 2);
        this.f421b = 1;
        mo369q();
    }
}
