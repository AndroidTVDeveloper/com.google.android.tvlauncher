package p000;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: bcc */
/* compiled from: PG */
public final class bcc implements bcq, biq {

    /* renamed from: a */
    public final bbf f3219a;

    /* renamed from: b */
    public final bip f3220b;

    /* renamed from: c */
    public final HashMap f3221c = new HashMap();

    /* renamed from: d */
    public final List f3222d = new ArrayList();

    /* renamed from: e */
    public biz f3223e;

    /* renamed from: f */
    public axg f3224f;

    /* renamed from: g */
    public bix f3225g;

    /* renamed from: h */
    public Handler f3226h;

    /* renamed from: i */
    public bcp f3227i;

    /* renamed from: j */
    public bcf f3228j;

    /* renamed from: k */
    public Uri f3229k;

    /* renamed from: l */
    public bch f3230l;

    /* renamed from: m */
    public boolean f3231m;

    /* renamed from: n */
    public long f3232n = -9223372036854775807L;

    public bcc(bbf bbf, bip bip) {
        this.f3219a = bbf;
        this.f3220b = bip;
    }

    /* renamed from: a */
    public static bcg m2791a(bch bch, bch bch2) {
        int i = (int) (bch2.f3266f - bch.f3266f);
        List list = bch.f3272l;
        if (i < list.size()) {
            return (bcg) list.get(i);
        }
        return null;
    }

    /* renamed from: a */
    public final bch mo1756a(Uri uri, boolean z) {
        bch bch = ((bcb) this.f3221c.get(uri)).f3209b;
        if (bch != null && z && !uri.equals(this.f3229k)) {
            List list = this.f3228j.f3244c;
            int i = 0;
            while (true) {
                if (i >= list.size()) {
                    break;
                } else if (!uri.equals(((bce) list.get(i)).f3236a)) {
                    i++;
                } else {
                    bch bch2 = this.f3230l;
                    if (bch2 == null || !bch2.f3269i) {
                        this.f3229k = uri;
                        ((bcb) this.f3221c.get(uri)).mo1753a();
                    }
                }
            }
        }
        return bch;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.max(long, long):long}
     arg types: [int, long]
     candidates:
      ClspMth{java.lang.Math.max(double, double):double}
      ClspMth{java.lang.Math.max(int, int):int}
      ClspMth{java.lang.Math.max(float, float):float}
      ClspMth{java.lang.Math.max(long, long):long} */
    /* renamed from: a */
    public final boolean mo1757a(Uri uri) {
        int i;
        bcb bcb = (bcb) this.f3221c.get(uri);
        if (bcb.f3209b != null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long max = Math.max(30000L, aja.m632a(bcb.f3209b.f3273m));
            bch bch = bcb.f3209b;
            if (bch.f3269i || (i = bch.f3261a) == 2 || i == 1 || bcb.f3210c + max > elapsedRealtime) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final void mo1759b(Uri uri) {
        bcb bcb = (bcb) this.f3221c.get(uri);
        bcb.f3208a.mo1649a();
        IOException iOException = bcb.f3211d;
        if (iOException != null) {
            throw iOException;
        }
    }

    /* renamed from: a */
    public final boolean mo1758a(Uri uri, long j) {
        int size = this.f3222d.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            z |= !((bcm) this.f3222d.get(i)).mo1716a(uri, j);
        }
        return z;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo1549a(bit bit, long j, long j2, boolean z) {
        bja bja = (bja) bit;
        this.f3224f.mo1518a(4);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo1548a(bit bit, long j, long j2) {
        bcf bcf;
        bci bci = (bci) ((bja) bit).f4106c;
        boolean z = bci instanceof bch;
        if (z) {
            bcf = bcf.m2799a(bci.f3274n);
        } else {
            bcf = (bcf) bci;
        }
        this.f3228j = bcf;
        this.f3223e = new bck(bcf);
        this.f3229k = ((bce) bcf.f3244c.get(0)).f3236a;
        List list = bcf.f3243b;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Uri uri = (Uri) list.get(i);
            this.f3221c.put(uri, new bcb(this, uri));
        }
        bcb bcb = (bcb) this.f3221c.get(this.f3229k);
        if (z) {
            bcb.mo1754a((bch) bci);
        } else {
            bcb.mo1753a();
        }
        this.f3224f.mo1527b(4);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bir mo1546a(bit bit, long j, long j2, IOException iOException, int i) {
        bja bja = (bja) bit;
        long a = this.f3220b.mo1975a(iOException, i);
        boolean z = a == -9223372036854775807L;
        this.f3224f.mo1519a(4, iOException, z);
        return z ? bix.f4093b : bix.m3360a(false, a);
    }
}
