package p000;

/* renamed from: ks */
/* compiled from: PG */
public final class C0291ks {

    /* renamed from: a */
    public int f9813a = 0;

    /* renamed from: b */
    public int f9814b = 0;

    /* renamed from: c */
    public int f9815c = Integer.MIN_VALUE;

    /* renamed from: d */
    public int f9816d = Integer.MIN_VALUE;

    /* renamed from: e */
    public int f9817e = 0;

    /* renamed from: f */
    public int f9818f = 0;

    /* renamed from: g */
    public boolean f9819g = false;

    /* renamed from: h */
    public boolean f9820h = false;

    /* renamed from: a */
    public final void mo5504a(int i, int i2) {
        this.f9815c = i;
        this.f9816d = i2;
        this.f9820h = true;
        if (!this.f9819g) {
            if (i != Integer.MIN_VALUE) {
                this.f9813a = i;
            }
            if (i2 != Integer.MIN_VALUE) {
                this.f9814b = i2;
                return;
            }
            return;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f9813a = i2;
        }
        if (i != Integer.MIN_VALUE) {
            this.f9814b = i;
        }
    }
}
