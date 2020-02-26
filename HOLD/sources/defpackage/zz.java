package defpackage;

/* renamed from: zz  reason: default package */
/* compiled from: PG */
final class zz implements zx {
    private final String a;

    public zz(String str) {
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zz) {
            return this.a.equals(((zz) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        String str = this.a;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 29);
        sb.append("StringHeaderFactory{value='");
        sb.append(str);
        sb.append("'}");
        return sb.toString();
    }
}
