package p000;

import android.net.Uri;
import java.io.IOException;
import java.util.List;

/* renamed from: bbe */
/* compiled from: PG */
final class bbe {

    /* renamed from: a */
    public final bbh f3052a;

    /* renamed from: b */
    public final bhv f3053b;

    /* renamed from: c */
    public final bby f3054c;

    /* renamed from: d */
    public final Uri[] f3055d;

    /* renamed from: e */
    public final akh[] f3056e;

    /* renamed from: f */
    public final bcq f3057f;

    /* renamed from: g */
    public final ayc f3058g;

    /* renamed from: h */
    public final List f3059h;

    /* renamed from: i */
    public final bba f3060i = new bba();

    /* renamed from: j */
    public boolean f3061j;

    /* renamed from: k */
    public byte[] f3062k = blm.f4298f;

    /* renamed from: l */
    public IOException f3063l;

    /* renamed from: m */
    public Uri f3064m;

    /* renamed from: n */
    public boolean f3065n;

    /* renamed from: o */
    public bgl f3066o;

    /* renamed from: p */
    public long f3067p = -9223372036854775807L;

    /* renamed from: q */
    public boolean f3068q;

    /* renamed from: r */
    private final bhv f3069r;

    public bbe(bbh bbh, bcq bcq, Uri[] uriArr, akh[] akhArr, bbf bbf, bjf bjf, bby bby, List list) {
        this.f3052a = bbh;
        this.f3057f = bcq;
        this.f3055d = uriArr;
        this.f3056e = akhArr;
        this.f3054c = bby;
        this.f3059h = list;
        bhv a = bbf.mo1703a();
        this.f3053b = a;
        if (bjf != null) {
            a.mo1501a(bjf);
        }
        this.f3069r = bbf.mo1703a();
        this.f3058g = new ayc(akhArr);
        int[] iArr = new int[uriArr.length];
        for (int i = 0; i < uriArr.length; i++) {
            iArr[i] = i;
        }
        this.f3066o = new bbd(this.f3058g, iArr);
    }

    /* renamed from: a */
    public final void mo1715a(bbi bbi, long j) {
        boolean z;
        bbi bbi2 = bbi;
        int a = bbi2 != null ? this.f3058g.mo1603a(bbi2.f2769g) : -1;
        int f = this.f3066o.mo1835f();
        ayz[] ayzArr = new ayz[f];
        for (int i = 0; i < f; i++) {
            int b = this.f3066o.mo1830b(i);
            Uri uri = this.f3055d[b];
            if (!this.f3057f.mo1757a(uri)) {
                ayzArr[i] = ayz.f2833a;
            } else {
                bch a2 = this.f3057f.mo1756a(uri, false);
                bks.m3507a(a2);
                long j2 = a2.f3263c - ((bcc) this.f3057f).f3232n;
                if (b != a) {
                    z = true;
                } else {
                    z = false;
                }
                if (mo1713a(bbi, z, a2, j2, j) < a2.f3266f) {
                    ayzArr[i] = ayz.f2833a;
                } else {
                    ayzArr[i] = new ayj(a2);
                }
            }
        }
    }

    /* renamed from: a */
    public final long mo1713a(bbi bbi, boolean z, bch bch, long j, long j2) {
        if (bbi != null && !z) {
            return bbi.mo1641d();
        }
        long j3 = bch.f3273m + j;
        if (bbi != null && !this.f3065n) {
            j2 = bbi.f2772j;
        }
        if (!bch.f3269i && j2 >= j3) {
            return bch.f3266f + ((long) bch.f3272l.size());
        }
        List list = bch.f3272l;
        Long valueOf = Long.valueOf(j2 - j);
        boolean z2 = true;
        if (((bcc) this.f3057f).f3231m && bbi != null) {
            z2 = false;
        }
        return ((long) blm.m3626a(list, valueOf, z2)) + bch.f3266f;
    }

    /* renamed from: a */
    public static Uri m2694a(bch bch, bcg bcg) {
        String str;
        if (bcg == null || (str = bcg.f3256g) == null) {
            return null;
        }
        return blk.m3616a(bch.f3274n, str);
    }

    /* renamed from: a */
    public final ayl mo1714a(Uri uri, int i) {
        if (uri == null) {
            return null;
        }
        byte[] bArr = (byte[]) this.f3060i.f3046a.remove(bks.m3507a(uri));
        if (bArr != null) {
            this.f3060i.mo1706a(uri, bArr);
            return null;
        }
        return new bbb(this.f3069r, new bhy(uri, (byte) 0), this.f3056e[i], this.f3066o.mo1711b(), this.f3066o.mo1712c(), this.f3062k);
    }
}
