package p000;

import android.net.Uri;
import android.os.Handler;

@Deprecated
/* renamed from: awo */
/* compiled from: PG */
public final class awo extends awj {

    /* renamed from: f */
    private final axr f2560f;

    @Deprecated
    public awo(Uri uri, bhu bhu, aol aol) {
        Uri uri2 = uri;
        bhu bhu2 = bhu;
        aol aol2 = aol;
        this.f2560f = new axr(uri2, bhu2, aol2, anu.f1453a, new bih());
    }

    /* renamed from: a */
    public final aws mo1496a(awt awt, bhk bhk, long j) {
        return this.f2560f.mo1496a(awt, bhk, j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo1471a(bjf bjf) {
        this.f2558e = bjf;
        this.f2557d = new Handler();
        axr axr = this.f2560f;
        bks.m3510a(!this.f2556c.containsKey(null));
        awg awg = new awg(this);
        awh awh = new awh(this);
        this.f2556c.put(null, new awi(axr, awg, awh));
        axr.mo1467a((Handler) bks.m3507a(this.f2557d), awh);
        axr.mo1469a(awg, this.f2558e);
        if (!(!this.f2537a.isEmpty())) {
            axr.mo1473b(awg);
        }
    }

    /* renamed from: a */
    public final void mo1497a(aws aws) {
        this.f2560f.mo1497a(aws);
    }
}
