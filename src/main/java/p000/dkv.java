package p000;

/* renamed from: dkv */
/* compiled from: PG */
final class dkv implements dkh {

    /* renamed from: a */
    public final dkk f8739a;

    /* renamed from: b */
    public final String f8740b;

    /* renamed from: c */
    public final Object[] f8741c;

    /* renamed from: d */
    private final int f8742d;

    public dkv(dkk dkk, String str, Object[] objArr) {
        this.f8739a = dkk;
        this.f8740b = str;
        this.f8741c = objArr;
        char charAt = str.charAt(0);
        if (charAt >= 55296) {
            char c = charAt & 8191;
            int i = 13;
            int i2 = 1;
            while (true) {
                int i3 = i2 + 1;
                char charAt2 = str.charAt(i2);
                if (charAt2 >= 55296) {
                    c |= (charAt2 & 8191) << i;
                    i += 13;
                    i2 = i3;
                } else {
                    this.f8742d = c | (charAt2 << i);
                    return;
                }
            }
        } else {
            this.f8742d = charAt;
        }
    }

    /* renamed from: a */
    public final boolean mo4571a() {
        return (this.f8742d & 2) == 2;
    }

    /* renamed from: b */
    public final dkk mo4572b() {
        return this.f8739a;
    }

    /* renamed from: c */
    public final int mo4573c() {
        return (this.f8742d & 1) == 0 ? 2 : 1;
    }
}
