package defpackage;

import android.content.Context;

/* renamed from: bif  reason: default package */
/* compiled from: PG */
public final class bif implements bhu {
    private final Context a;
    private final bjf b;
    private final bhu c;

    public bif(Context context, bjf bjf, bhu bhu) {
        this.a = context.getApplicationContext();
        this.b = bjf;
        this.c = bhu;
    }

    /* renamed from: b */
    public final bie a() {
        bie bie = new bie(this.a, ((bik) this.c).a());
        bjf bjf = this.b;
        if (bjf != null) {
            bie.a(bjf);
        }
        return bie;
    }
}
