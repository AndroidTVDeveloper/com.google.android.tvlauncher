package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.util.List;

/* renamed from: bbe  reason: default package */
/* compiled from: PG */
final class bbe {
    public final bbh a;
    public final bhv b;
    public final bby c;
    public final Uri[] d;
    public final akh[] e;
    public final bcq f;
    public final ayc g;
    public final List h;
    public final bba i = new bba();
    public boolean j;
    public byte[] k = blm.f;
    public IOException l;
    public Uri m;
    public boolean n;
    public bgl o;
    public long p = -9223372036854775807L;
    public boolean q;
    private final bhv r;

    public bbe(bbh bbh, bcq bcq, Uri[] uriArr, akh[] akhArr, bbf bbf, bjf bjf, bby bby, List list) {
        this.a = bbh;
        this.f = bcq;
        this.d = uriArr;
        this.e = akhArr;
        this.c = bby;
        this.h = list;
        bhv a2 = bbf.a();
        this.b = a2;
        if (bjf != null) {
            a2.a(bjf);
        }
        this.r = bbf.a();
        this.g = new ayc(akhArr);
        int[] iArr = new int[uriArr.length];
        for (int i2 = 0; i2 < uriArr.length; i2++) {
            iArr[i2] = i2;
        }
        this.o = new bbd(this.g, iArr);
    }

    public final void a(bbi bbi, long j2) {
        boolean z;
        bbi bbi2 = bbi;
        int a2 = bbi2 != null ? this.g.a(bbi2.g) : -1;
        int f2 = this.o.f();
        ayz[] ayzArr = new ayz[f2];
        for (int i2 = 0; i2 < f2; i2++) {
            int b2 = this.o.b(i2);
            Uri uri = this.d[b2];
            if (!this.f.a(uri)) {
                ayzArr[i2] = ayz.a;
            } else {
                bch a3 = this.f.a(uri, false);
                bks.a(a3);
                long j3 = a3.c - ((bcc) this.f).n;
                if (b2 != a2) {
                    z = true;
                } else {
                    z = false;
                }
                if (a(bbi, z, a3, j3, j2) < a3.f) {
                    ayzArr[i2] = ayz.a;
                } else {
                    ayzArr[i2] = new ayj(a3);
                }
            }
        }
    }

    public final long a(bbi bbi, boolean z, bch bch, long j2, long j3) {
        if (bbi != null && !z) {
            return bbi.d();
        }
        long j4 = bch.m + j2;
        if (bbi != null && !this.n) {
            j3 = bbi.j;
        }
        if (!bch.i && j3 >= j4) {
            return bch.f + ((long) bch.l.size());
        }
        List list = bch.l;
        Long valueOf = Long.valueOf(j3 - j2);
        boolean z2 = true;
        if (((bcc) this.f).m && bbi != null) {
            z2 = false;
        }
        return ((long) blm.a(list, valueOf, z2)) + bch.f;
    }

    public static Uri a(bch bch, bcg bcg) {
        String str;
        if (bcg == null || (str = bcg.g) == null) {
            return null;
        }
        return blk.a(bch.n, str);
    }

    public final ayl a(Uri uri, int i2) {
        if (uri == null) {
            return null;
        }
        byte[] bArr = (byte[]) this.i.a.remove(bks.a(uri));
        if (bArr != null) {
            this.i.a(uri, bArr);
            return null;
        }
        return new bbb(this.r, new bhy(uri, (byte) 0), this.e[i2], this.o.b(), this.o.c(), this.k);
    }
}
