package defpackage;

/* renamed from: djs  reason: default package */
/* compiled from: PG */
public class djs {
    public volatile dkk a;
    public volatile dik b;

    static {
        dis.a();
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
        dkk dkk = this.a;
        dkk dkk2 = djs.a;
        if (dkk == null && dkk2 == null) {
            return a().equals(djs.a());
        }
        if (dkk != null && dkk2 != null) {
            return dkk.equals(dkk2);
        }
        if (dkk == null) {
            return a(dkk2.W()).equals(dkk2);
        }
        return dkk.equals(djs.a(dkk.W()));
    }

    private final dkk a(dkk dkk) {
        if (this.a == null) {
            synchronized (this) {
                if (this.a == null) {
                    try {
                        this.a = dkk;
                        this.b = dik.b;
                    } catch (djn e) {
                        this.a = dkk;
                        this.b = dik.b;
                    }
                }
            }
        }
        return this.a;
    }

    public final dik a() {
        if (this.b != null) {
            return this.b;
        }
        synchronized (this) {
            if (this.b != null) {
                dik dik = this.b;
                return dik;
            }
            if (this.a != null) {
                this.b = this.a.i();
            } else {
                this.b = dik.b;
            }
            dik dik2 = this.b;
            return dik2;
        }
    }
}
