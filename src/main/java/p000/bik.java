package p000;

/* renamed from: bik */
/* compiled from: PG */
public final class bik implements bhu {

    /* renamed from: a */
    private final bin f4073a = new bin();

    /* renamed from: b */
    private final String f4074b;

    /* renamed from: c */
    private final bjf f4075c;

    public bik(String str, bjf bjf) {
        this.f4074b = bks.m3508a(str);
        this.f4075c = bjf;
    }

    public bik() {
    }

    /* renamed from: b */
    public final bio mo1949a() {
        big big = new big(this.f4074b, this.f4073a);
        bjf bjf = this.f4075c;
        if (bjf != null) {
            big.mo1501a(bjf);
        }
        return big;
    }
}
