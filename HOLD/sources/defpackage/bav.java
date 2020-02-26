package defpackage;

/* renamed from: bav  reason: default package */
/* compiled from: PG */
public final class bav {
    public final String a;
    public final String b;

    public bav(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(", ");
        sb.append(str2);
        return sb.toString();
    }
}
