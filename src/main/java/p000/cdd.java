package p000;

import java.util.ArrayList;
import java.util.List;

/* renamed from: cdd */
/* compiled from: PG */
public final class cdd {

    /* renamed from: a */
    public final cdc f5312a;

    /* renamed from: b */
    public final List f5313b = new ArrayList();

    /* renamed from: c */
    private long f5314c;

    public cdd(cdc cdc) {
        this.f5312a = cdc;
        this.f5314c = 1;
    }

    /* renamed from: a */
    public final void mo2677a(cdc cdc, long j) {
        cdc cdc2 = cdc;
        List<cdc> list = cdc2.f5309e;
        cdc2.f5309e = cdb.f5304a;
        long j2 = this.f5314c;
        this.f5314c = 1 + j2;
        dja l = dny.f9006k.mo4516l();
        int i = cdc2.f5310f;
        String str = cdc2.f5305a;
        if (l.f8673b) {
            l.mo4505b();
            l.f8673b = false;
        }
        dny dny = (dny) l.f8672a;
        str.getClass();
        int i2 = dny.f9007a | 1;
        dny.f9007a = i2;
        dny.f9008b = str;
        long j3 = cdc2.f5306b;
        int i3 = i2 | 32;
        dny.f9007a = i3;
        dny.f9013g = j3;
        long j4 = cdc2.f5307c;
        long j5 = -1;
        if (j4 != -1) {
            j5 = j4 - j3;
        }
        int i4 = i3 | 64;
        dny.f9007a = i4;
        dny.f9014h = j5;
        long j6 = cdc2.f5308d;
        int i5 = i4 | 256;
        dny.f9007a = i5;
        dny.f9015i = j6;
        int i6 = i5 | 8;
        dny.f9007a = i6;
        dny.f9011e = j2;
        int i7 = i6 | 16;
        dny.f9007a = i7;
        dny.f9012f = j;
        if (cdc2.f5311g - 1 != 1) {
            dny.f9016j = 0;
            dny.f9007a = i7 | 512;
        } else {
            dny.f9016j = 1;
            dny.f9007a = i7 | 512;
        }
        dny dny2 = (dny) l.mo4509g();
        dja dja = (dja) dny2.mo4513b(5);
        dja.mo4366a((dje) dny2);
        this.f5313b.add((dny) dja.mo4509g());
        for (cdc a : list) {
            mo2677a(a, ((dny) dja.f8672a).f9011e);
        }
    }
}
