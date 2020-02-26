package defpackage;

import android.util.SparseArray;

/* renamed from: ayo  reason: default package */
/* compiled from: PG */
public final class ayo implements aok {
    public final aoi a;
    public aos b;
    public akh[] c;
    private final int d;
    private final akh e;
    private final SparseArray f = new SparseArray();
    private boolean g;
    private ayn h;
    private long i;

    public ayo(aoi aoi, int i2, akh akh) {
        this.a = aoi;
        this.d = i2;
        this.e = akh;
    }

    public final void S() {
        akh[] akhArr = new akh[this.f.size()];
        for (int i2 = 0; i2 < this.f.size(); i2++) {
            akhArr[i2] = ((aym) this.f.valueAt(i2)).a;
        }
        this.c = akhArr;
    }

    public final void a(ayn ayn, long j, long j2) {
        this.h = ayn;
        this.i = j2;
        if (this.g) {
            aoi aoi = this.a;
            if (j == -9223372036854775807L) {
                j = 0;
            }
            aoi.a(0, j);
            for (int i2 = 0; i2 < this.f.size(); i2++) {
                ((aym) this.f.valueAt(i2)).a(ayn, j2);
            }
            return;
        }
        this.a.a(this);
        if (j != -9223372036854775807L) {
            this.a.a(0, j);
        }
        this.g = true;
    }

    public final void a(aos aos) {
        this.b = aos;
    }

    public final aov a(int i2, int i3) {
        boolean z;
        akh akh;
        aym aym = (aym) this.f.get(i2);
        if (aym == null) {
            if (this.c == null) {
                z = true;
            } else {
                z = false;
            }
            bks.b(z);
            if (i3 == this.d) {
                akh = this.e;
            } else {
                akh = null;
            }
            aym = new aym(i3, akh);
            aym.a(this.h, this.i);
            this.f.put(i2, aym);
        }
        return aym;
    }
}
