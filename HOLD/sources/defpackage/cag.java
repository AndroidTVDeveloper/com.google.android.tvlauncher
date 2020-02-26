package defpackage;

/* renamed from: cag  reason: default package */
/* compiled from: PG */
public final class cag {
    public final String a;
    public final String b;
    public final String c;
    public final byn d;
    public final long e;
    public final Long f;
    public final int g;

    public cag(String str, String str2, String str3, int i, Long l, byn byn) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.g = i;
        this.f = l;
        this.d = byn;
        this.e = byn.a().getTotalSpace() / 1024;
    }
}
