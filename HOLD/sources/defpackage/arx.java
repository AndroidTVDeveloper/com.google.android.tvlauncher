package defpackage;

import android.util.SparseArray;

/* renamed from: arx  reason: default package */
/* compiled from: PG */
final class arx {
    public final aov a;
    public final boolean b;
    public final boolean c;
    public final SparseArray d = new SparseArray();
    public final SparseArray e = new SparseArray();
    public final bkz f = new bkz(this.g, 0, 0);
    public byte[] g = new byte[128];
    public int h;
    public int i;
    public long j;
    public boolean k;
    public long l;
    public arw m = new arw((byte) 0);
    public arw n = new arw((byte) 0);
    public boolean o;
    public long p;
    public long q;
    public boolean r;

    public arx(aov aov, boolean z, boolean z2) {
        this.a = aov;
        this.b = z;
        this.c = z2;
        a();
    }

    public final void a(bku bku) {
        this.e.append(bku.a, bku);
    }

    public final void a(bkv bkv) {
        this.d.append(bkv.d, bkv);
    }

    public final void a() {
        this.k = false;
        this.o = false;
        this.n.a();
    }
}
