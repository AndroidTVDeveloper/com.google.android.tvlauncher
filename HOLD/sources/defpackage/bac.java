package defpackage;

import android.net.Uri;
import java.util.List;

/* renamed from: bac  reason: default package */
/* compiled from: PG */
public final class bac {
    public final long a;
    public final long b;
    public final boolean c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final bav h;
    public final Uri i;
    private final List j;

    public bac(long j2, long j3, boolean z, long j4, long j5, long j6, long j7, bav bav, Uri uri, List list) {
        this.a = j2;
        this.b = j3;
        this.c = z;
        this.d = j4;
        this.e = j5;
        this.f = j6;
        this.g = j7;
        this.h = bav;
        this.i = uri;
        this.j = list;
    }

    public final bah a(int i2) {
        return (bah) this.j.get(i2);
    }

    public final int a() {
        return this.j.size();
    }

    public final long b(int i2) {
        long j2;
        if (i2 != this.j.size() - 1) {
            j2 = ((bah) this.j.get(i2 + 1)).b - ((bah) this.j.get(i2)).b;
        } else {
            long j3 = this.b;
            j2 = j3 != -9223372036854775807L ? j3 - ((bah) this.j.get(i2)).b : -9223372036854775807L;
        }
        return aja.b(j2);
    }
}
