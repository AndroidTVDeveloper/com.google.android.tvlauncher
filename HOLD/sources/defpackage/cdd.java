package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: cdd  reason: default package */
/* compiled from: PG */
public final class cdd {
    public final cdc a;
    public final List b = new ArrayList();
    private long c;

    public cdd(cdc cdc) {
        this.a = cdc;
        this.c = 1;
    }

    public final void a(cdc cdc, long j) {
        cdc cdc2 = cdc;
        List<cdc> list = cdc2.e;
        cdc2.e = cdb.a;
        long j2 = this.c;
        this.c = 1 + j2;
        dja l = dny.k.l();
        int i = cdc2.f;
        String str = cdc2.a;
        if (l.b) {
            l.b();
            l.b = false;
        }
        dny dny = (dny) l.a;
        str.getClass();
        int i2 = dny.a | 1;
        dny.a = i2;
        dny.b = str;
        long j3 = cdc2.b;
        int i3 = i2 | 32;
        dny.a = i3;
        dny.g = j3;
        long j4 = cdc2.c;
        long j5 = -1;
        if (j4 != -1) {
            j5 = j4 - j3;
        }
        int i4 = i3 | 64;
        dny.a = i4;
        dny.h = j5;
        long j6 = cdc2.d;
        int i5 = i4 | 256;
        dny.a = i5;
        dny.i = j6;
        int i6 = i5 | 8;
        dny.a = i6;
        dny.e = j2;
        int i7 = i6 | 16;
        dny.a = i7;
        dny.f = j;
        if (cdc2.g - 1 != 1) {
            dny.j = 0;
            dny.a = i7 | 512;
        } else {
            dny.j = 1;
            dny.a = i7 | 512;
        }
        dny dny2 = (dny) l.g();
        dja dja = (dja) dny2.b(5);
        dja.a((dje) dny2);
        this.b.add((dny) dja.g());
        for (cdc a2 : list) {
            a(a2, ((dny) dja.a).e);
        }
    }
}
