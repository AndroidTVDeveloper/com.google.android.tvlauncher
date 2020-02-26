package defpackage;

/* renamed from: cdx  reason: default package */
/* compiled from: PG */
final /* synthetic */ class cdx implements cdv {
    private final cdz a;
    private final String b;

    public cdx(cdz cdz, String str) {
        this.a = cdz;
        this.b = str;
    }

    public final Object a() {
        cdz cdz = this.a;
        return byi.a(cdz.a.getContentResolver(), this.b, (String) null);
    }
}
