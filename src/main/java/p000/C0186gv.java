package p000;

/* renamed from: gv */
/* compiled from: PG */
public final class C0186gv {

    /* renamed from: a */
    public int f9424a;

    /* renamed from: b */
    public int f9425b;

    /* renamed from: c */
    public Object f9426c;

    /* renamed from: d */
    public int f9427d;

    public C0186gv(int i, int i2, int i3, Object obj) {
        this.f9424a = i;
        this.f9425b = i2;
        this.f9427d = i3;
        this.f9426c = obj;
    }

    public final int hashCode() {
        return (((this.f9424a * 31) + this.f9425b) * 31) + this.f9427d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0186gv) {
            C0186gv gvVar = (C0186gv) obj;
            int i = this.f9424a;
            if (i == gvVar.f9424a) {
                if (i == 8 && Math.abs(this.f9427d - this.f9425b) == 1 && this.f9427d == gvVar.f9425b && this.f9425b == gvVar.f9427d) {
                    return true;
                }
                if (this.f9427d == gvVar.f9427d && this.f9425b == gvVar.f9425b) {
                    Object obj2 = this.f9426c;
                    if (obj2 != null) {
                        if (!obj2.equals(gvVar.f9426c)) {
                            return false;
                        }
                    } else if (gvVar.f9426c != null) {
                        return false;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[");
        int i = this.f9424a;
        if (i != 1) {
            str = i != 2 ? i != 4 ? i != 8 ? "??" : "mv" : "up" : "rm";
        } else {
            str = "add";
        }
        sb.append(str);
        sb.append(",s:");
        sb.append(this.f9425b);
        sb.append("c:");
        sb.append(this.f9427d);
        sb.append(",p:");
        sb.append(this.f9426c);
        sb.append("]");
        return sb.toString();
    }
}
