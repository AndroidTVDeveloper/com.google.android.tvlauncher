package p000;

/* renamed from: bfn */
/* compiled from: PG */
final class bfn {

    /* renamed from: e */
    private static final String[] f3701e = new String[0];

    /* renamed from: a */
    public final String f3702a;

    /* renamed from: b */
    public final int f3703b;

    /* renamed from: c */
    public final String f3704c;

    /* renamed from: d */
    public final String[] f3705d;

    public bfn(String str, int i, String str2, String[] strArr) {
        this.f3703b = i;
        this.f3702a = str;
        this.f3704c = str2;
        this.f3705d = strArr;
    }

    /* renamed from: a */
    public static bfn m3061a(String str, int i) {
        String str2;
        String[] strArr;
        String trim = str.trim();
        bks.m3510a(!trim.isEmpty());
        int indexOf = trim.indexOf(" ");
        if (indexOf != -1) {
            str2 = trim.substring(indexOf).trim();
            trim = trim.substring(0, indexOf);
        } else {
            str2 = "";
        }
        String[] a = blm.m3658a(trim, "\\.");
        String str3 = a[0];
        int length = a.length;
        if (length > 1) {
            strArr = (String[]) blm.m3667b(a, length);
        } else {
            strArr = f3701e;
        }
        return new bfn(str3, i, str2, strArr);
    }
}
