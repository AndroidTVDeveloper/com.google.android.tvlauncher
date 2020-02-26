package defpackage;

import java.util.List;

/* renamed from: clv  reason: default package */
/* compiled from: PG */
public class clv {
    public final String a;
    public final String b;
    public final String c;
    public final List d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final long k;
    public final cmc l;

    public clv(clu clu) {
        this.a = clu.a;
        this.b = clu.b;
        this.c = clu.c;
        this.d = clu.d;
        this.e = clu.e;
        this.f = clu.f;
        this.g = clu.g;
        this.h = clu.h;
        this.i = clu.i;
        this.j = clu.j;
        this.k = clu.k;
        this.l = clu.l;
    }

    public boolean a() {
        throw null;
    }

    public final long b() {
        cmc cmc = this.l;
        if (cmc == null) {
            return -1;
        }
        return cmc.d;
    }

    public final String toString() {
        return String.format("OutstreamVideoAd: [imageUri=%s, videoUri=%s, displayBannerImpressionTrackingUrl=%s, videoImpressionTrackingUrls=%s, displayBannerFocusImpressionTrackingUrl=%s, displayBannerClickTrackingUrl=%s, videoClickTrackingUrl=%s, packageName=%s, marketUrl=%s, deepLinkUrl=%s, adAsset=%s]", this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, dcr.a(this.l));
    }
}
