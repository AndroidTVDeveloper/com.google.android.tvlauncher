package p000;

/* renamed from: asw */
/* compiled from: PG */
public final class asw {

    /* renamed from: a */
    private final String f2306a;

    /* renamed from: b */
    private final int f2307b;

    /* renamed from: c */
    private final int f2308c;

    /* renamed from: d */
    private int f2309d;

    /* renamed from: e */
    private String f2310e;

    public asw(int i, int i2) {
        this(Integer.MIN_VALUE, i, i2);
    }

    public asw(int i, int i2, int i3) {
        String str;
        if (i != Integer.MIN_VALUE) {
            StringBuilder sb = new StringBuilder(12);
            sb.append(i);
            sb.append("/");
            str = sb.toString();
        } else {
            str = "";
        }
        this.f2306a = str;
        this.f2307b = i2;
        this.f2308c = i3;
        this.f2309d = Integer.MIN_VALUE;
    }

    /* renamed from: a */
    public final void mo1308a() {
        int i = this.f2309d;
        int i2 = i != Integer.MIN_VALUE ? i + this.f2308c : this.f2307b;
        this.f2309d = i2;
        String str = this.f2306a;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 11);
        sb.append(str);
        sb.append(i2);
        this.f2310e = sb.toString();
    }

    /* renamed from: c */
    public final String mo1310c() {
        m2025d();
        return this.f2310e;
    }

    /* renamed from: b */
    public final int mo1309b() {
        m2025d();
        return this.f2309d;
    }

    /* renamed from: d */
    private final void m2025d() {
        if (this.f2309d == Integer.MIN_VALUE) {
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }
    }
}
