package p000;

/* renamed from: djs */
/* compiled from: PG */
public class djs {

    /* renamed from: a */
    public volatile dkk f8697a;

    /* renamed from: b */
    public volatile dik f8698b;

    static {
        dis.m6616a();
    }

    public int hashCode() {
        return 1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof djs)) {
            return false;
        }
        djs djs = (djs) obj;
        dkk dkk = this.f8697a;
        dkk dkk2 = djs.f8697a;
        if (dkk == null && dkk2 == null) {
            return mo4539a().equals(djs.mo4539a());
        }
        if (dkk != null && dkk2 != null) {
            return dkk.equals(dkk2);
        }
        if (dkk == null) {
            return m6737a(dkk2.mo4503W()).equals(dkk2);
        }
        return dkk.equals(djs.m6737a(dkk.mo4503W()));
    }

    /* renamed from: a */
    private final dkk m6737a(dkk dkk) {
        if (this.f8697a == null) {
            synchronized (this) {
                if (this.f8697a == null) {
                    try {
                        this.f8697a = dkk;
                        this.f8698b = dik.f8583b;
                    } catch (djn e) {
                        this.f8697a = dkk;
                        this.f8698b = dik.f8583b;
                    }
                }
            }
        }
        return this.f8697a;
    }

    /* renamed from: a */
    public final dik mo4539a() {
        if (this.f8698b != null) {
            return this.f8698b;
        }
        synchronized (this) {
            if (this.f8698b != null) {
                dik dik = this.f8698b;
                return dik;
            }
            if (this.f8697a != null) {
                this.f8698b = this.f8697a.mo4370i();
            } else {
                this.f8698b = dik.f8583b;
            }
            dik dik2 = this.f8698b;
            return dik2;
        }
    }
}
