package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: bcc  reason: default package */
/* compiled from: PG */
public final class bcc implements bcq, biq {
    public final bbf a;
    public final bip b;
    public final HashMap c = new HashMap();
    public final List d = new ArrayList();
    public biz e;
    public axg f;
    public bix g;
    public Handler h;
    public bcp i;
    public bcf j;
    public Uri k;
    public bch l;
    public boolean m;
    public long n = -9223372036854775807L;

    public bcc(bbf bbf, bip bip) {
        this.a = bbf;
        this.b = bip;
    }

    public static bcg a(bch bch, bch bch2) {
        int i2 = (int) (bch2.f - bch.f);
        List list = bch.l;
        if (i2 < list.size()) {
            return (bcg) list.get(i2);
        }
        return null;
    }

    public final bch a(Uri uri, boolean z) {
        bch bch = ((bcb) this.c.get(uri)).b;
        if (bch != null && z && !uri.equals(this.k)) {
            List list = this.j.c;
            int i2 = 0;
            while (true) {
                if (i2 >= list.size()) {
                    break;
                } else if (!uri.equals(((bce) list.get(i2)).a)) {
                    i2++;
                } else {
                    bch bch2 = this.l;
                    if (bch2 == null || !bch2.i) {
                        this.k = uri;
                        ((bcb) this.c.get(uri)).a();
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
    public final boolean a(Uri uri) {
        int i2;
        bcb bcb = (bcb) this.c.get(uri);
        if (bcb.b != null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long max = Math.max(30000L, aja.a(bcb.b.m));
            bch bch = bcb.b;
            if (bch.i || (i2 = bch.a) == 2 || i2 == 1 || bcb.c + max > elapsedRealtime) {
                return true;
            }
        }
        return false;
    }

    public final void b(Uri uri) {
        bcb bcb = (bcb) this.c.get(uri);
        bcb.a.a();
        IOException iOException = bcb.d;
        if (iOException != null) {
            throw iOException;
        }
    }

    public final boolean a(Uri uri, long j2) {
        int size = this.d.size();
        boolean z = false;
        for (int i2 = 0; i2 < size; i2++) {
            z |= !((bcm) this.d.get(i2)).a(uri, j2);
        }
        return z;
    }

    public final /* bridge */ /* synthetic */ void a(bit bit, long j2, long j3, boolean z) {
        bja bja = (bja) bit;
        this.f.a(4);
    }

    public final /* bridge */ /* synthetic */ void a(bit bit, long j2, long j3) {
        bcf bcf;
        bci bci = (bci) ((bja) bit).c;
        boolean z = bci instanceof bch;
        if (z) {
            bcf = bcf.a(bci.n);
        } else {
            bcf = (bcf) bci;
        }
        this.j = bcf;
        this.e = new bck(bcf);
        this.k = ((bce) bcf.c.get(0)).a;
        List list = bcf.b;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Uri uri = (Uri) list.get(i2);
            this.c.put(uri, new bcb(this, uri));
        }
        bcb bcb = (bcb) this.c.get(this.k);
        if (z) {
            bcb.a((bch) bci);
        } else {
            bcb.a();
        }
        this.f.b(4);
    }

    public final /* bridge */ /* synthetic */ bir a(bit bit, long j2, long j3, IOException iOException, int i2) {
        bja bja = (bja) bit;
        long a2 = this.b.a(iOException, i2);
        boolean z = a2 == -9223372036854775807L;
        this.f.a(4, iOException, z);
        return z ? bix.b : bix.a(false, a2);
    }
}
