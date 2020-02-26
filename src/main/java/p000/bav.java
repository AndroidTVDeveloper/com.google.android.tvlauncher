package p000;

/* renamed from: bav */
/* compiled from: PG */
public final class bav {

    /* renamed from: a */
    public final String f3037a;

    /* renamed from: b */
    public final String f3038b;

    public bav(String str, String str2) {
        this.f3037a = str;
        this.f3038b = str2;
    }

    public final String toString() {
        String str = this.f3037a;
        String str2 = this.f3038b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(", ");
        sb.append(str2);
        return sb.toString();
    }
}
