package p000;

/* renamed from: bmn */
/* compiled from: PG */
public final class bmn {

    /* renamed from: a */
    public final String f4416a;

    /* renamed from: b */
    public final boolean f4417b;

    public bmn(String str, boolean z) {
        this.f4416a = str;
        this.f4417b = z;
    }

    public final String toString() {
        String str = this.f4416a;
        boolean z = this.f4417b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7);
        sb.append("{");
        sb.append(str);
        sb.append("}");
        sb.append(z);
        return sb.toString();
    }
}
