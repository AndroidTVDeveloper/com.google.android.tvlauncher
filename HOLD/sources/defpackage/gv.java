package defpackage;

/* renamed from: gv  reason: default package */
/* compiled from: PG */
public final class gv {
    public int a;
    public int b;
    public Object c;
    public int d;

    public gv(int i, int i2, int i3, Object obj) {
        this.a = i;
        this.b = i2;
        this.d = i3;
        this.c = obj;
    }

    public final int hashCode() {
        return (((this.a * 31) + this.b) * 31) + this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof gv) {
            gv gvVar = (gv) obj;
            int i = this.a;
            if (i == gvVar.a) {
                if (i == 8 && Math.abs(this.d - this.b) == 1 && this.d == gvVar.b && this.b == gvVar.d) {
                    return true;
                }
                if (this.d == gvVar.d && this.b == gvVar.b) {
                    Object obj2 = this.c;
                    if (obj2 != null) {
                        if (!obj2.equals(gvVar.c)) {
                            return false;
                        }
                    } else if (gvVar.c != null) {
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
        int i = this.a;
        if (i != 1) {
            str = i != 2 ? i != 4 ? i != 8 ? "??" : "mv" : "up" : "rm";
        } else {
            str = "add";
        }
        sb.append(str);
        sb.append(",s:");
        sb.append(this.b);
        sb.append("c:");
        sb.append(this.d);
        sb.append(",p:");
        sb.append(this.c);
        sb.append("]");
        return sb.toString();
    }
}
