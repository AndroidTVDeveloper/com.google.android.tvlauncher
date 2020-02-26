package p000;

/* renamed from: bag */
/* compiled from: PG */
public final class bag {

    /* renamed from: a */
    public final aue[] f2993a;

    /* renamed from: b */
    public final long[] f2994b;

    /* renamed from: c */
    private final String f2995c;

    /* renamed from: d */
    private final String f2996d;

    public bag(String str, String str2, long[] jArr, aue[] aueArr) {
        this.f2995c = str;
        this.f2996d = str2;
        this.f2994b = jArr;
        this.f2993a = aueArr;
    }

    /* renamed from: a */
    public final String mo1683a() {
        String str = this.f2995c;
        String str2 = this.f2996d;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("/");
        sb.append(str2);
        return sb.toString();
    }
}
