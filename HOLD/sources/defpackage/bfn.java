package defpackage;

/* renamed from: bfn  reason: default package */
/* compiled from: PG */
final class bfn {
    private static final String[] e = new String[0];
    public final String a;
    public final int b;
    public final String c;
    public final String[] d;

    public bfn(String str, int i, String str2, String[] strArr) {
        this.b = i;
        this.a = str;
        this.c = str2;
        this.d = strArr;
    }

    public static bfn a(String str, int i) {
        String str2;
        String[] strArr;
        String trim = str.trim();
        bks.a(!trim.isEmpty());
        int indexOf = trim.indexOf(" ");
        if (indexOf != -1) {
            str2 = trim.substring(indexOf).trim();
            trim = trim.substring(0, indexOf);
        } else {
            str2 = "";
        }
        String[] a2 = blm.a(trim, "\\.");
        String str3 = a2[0];
        int length = a2.length;
        if (length > 1) {
            strArr = (String[]) blm.b(a2, length);
        } else {
            strArr = e;
        }
        return new bfn(str3, i, str2, strArr);
    }
}
