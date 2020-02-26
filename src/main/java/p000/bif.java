package p000;

import android.content.Context;

/* renamed from: bif */
/* compiled from: PG */
public final class bif implements bhu {

    /* renamed from: a */
    private final Context f4052a;

    /* renamed from: b */
    private final bjf f4053b;

    /* renamed from: c */
    private final bhu f4054c;

    public bif(Context context, bjf bjf, bhu bhu) {
        this.f4052a = context.getApplicationContext();
        this.f4053b = bjf;
        this.f4054c = bhu;
    }

    /* renamed from: b */
    public final bie mo1949a() {
        bie bie = new bie(this.f4052a, ((bik) this.f4054c).mo1949a());
        bjf bjf = this.f4053b;
        if (bjf != null) {
            bie.mo1501a(bjf);
        }
        return bie;
    }
}
