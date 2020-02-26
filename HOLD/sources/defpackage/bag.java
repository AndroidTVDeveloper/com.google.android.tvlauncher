package defpackage;

/* renamed from: bag  reason: default package */
/* compiled from: PG */
public final class bag {
    public final aue[] a;
    public final long[] b;
    private final String c;
    private final String d;

    public bag(String str, String str2, long[] jArr, aue[] aueArr) {
        this.c = str;
        this.d = str2;
        this.b = jArr;
        this.a = aueArr;
    }

    public final String a() {
        String str = this.c;
        String str2 = this.d;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("/");
        sb.append(str2);
        return sb.toString();
    }
}
