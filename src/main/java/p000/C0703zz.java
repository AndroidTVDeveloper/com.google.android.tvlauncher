package p000;

/* renamed from: zz */
/* compiled from: PG */
final class C0703zz implements C0701zx {

    /* renamed from: a */
    private final String f10872a;

    public C0703zz(String str) {
        this.f10872a = str;
    }

    /* renamed from: a */
    public final String mo6160a() {
        return this.f10872a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0703zz) {
            return this.f10872a.equals(((C0703zz) obj).f10872a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f10872a.hashCode();
    }

    public final String toString() {
        String str = this.f10872a;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 29);
        sb.append("StringHeaderFactory{value='");
        sb.append(str);
        sb.append("'}");
        return sb.toString();
    }
}
