package defpackage;

import android.net.Uri;
import android.os.Handler;

@Deprecated
/* renamed from: awo  reason: default package */
/* compiled from: PG */
public final class awo extends awj {
    private final axr f;

    @Deprecated
    public awo(Uri uri, bhu bhu, aol aol) {
        Uri uri2 = uri;
        bhu bhu2 = bhu;
        aol aol2 = aol;
        this.f = new axr(uri2, bhu2, aol2, anu.a, new bih());
    }

    public final aws a(awt awt, bhk bhk, long j) {
        return this.f.a(awt, bhk, j);
    }

    /* access modifiers changed from: protected */
    public final void a(bjf bjf) {
        this.e = bjf;
        this.d = new Handler();
        axr axr = this.f;
        bks.a(!this.c.containsKey(null));
        awg awg = new awg(this);
        awh awh = new awh(this);
        this.c.put(null, new awi(axr, awg, awh));
        axr.a((Handler) bks.a(this.d), awh);
        axr.a(awg, this.e);
        if (!(!this.a.isEmpty())) {
            axr.b(awg);
        }
    }

    public final void a(aws aws) {
        this.f.a(aws);
    }
}
