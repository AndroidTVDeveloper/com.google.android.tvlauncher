package p000;

import android.util.Log;

/* renamed from: asb */
/* compiled from: PG */
public final class asb implements art {

    /* renamed from: a */
    private final bky f2170a = new bky(10);

    /* renamed from: b */
    private aov f2171b;

    /* renamed from: c */
    private boolean f2172c;

    /* renamed from: d */
    private long f2173d;

    /* renamed from: e */
    private int f2174e;

    /* renamed from: f */
    private int f2175f;

    /* renamed from: a */
    public final void mo1284a(bky bky) {
        if (this.f2172c) {
            int b = bky.mo2070b();
            int i = this.f2175f;
            if (i < 10) {
                int min = Math.min(b, 10 - i);
                System.arraycopy(bky.f4258a, bky.f4259b, this.f2170a.f4258a, this.f2175f, min);
                if (this.f2175f + min == 10) {
                    this.f2170a.mo2073c(0);
                    if (this.f2170a.mo2074d() == 73 && this.f2170a.mo2074d() == 68 && this.f2170a.mo2074d() == 51) {
                        this.f2170a.mo2075d(3);
                        this.f2174e = this.f2170a.mo2086m() + 10;
                    } else {
                        Log.w("Id3Reader", "Discarding invalid ID3 tag");
                        this.f2172c = false;
                        return;
                    }
                }
            }
            int min2 = Math.min(b, this.f2174e - this.f2175f);
            this.f2171b.mo1205a(bky, min2);
            this.f2175f += min2;
        }
    }

    /* renamed from: a */
    public final void mo1283a(aok aok, asw asw) {
        asw.mo1308a();
        aov a = aok.mo1211a(asw.mo1309b(), 4);
        this.f2171b = a;
        a.mo1204a(akh.m728a(asw.mo1310c(), "application/id3"));
    }

    /* renamed from: b */
    public final void mo1285b() {
        int i;
        if (this.f2172c && (i = this.f2174e) != 0 && this.f2175f == i) {
            this.f2171b.mo1203a(this.f2173d, 1, i, 0, null);
            this.f2172c = false;
        }
    }

    /* renamed from: a */
    public final void mo1282a(long j, int i) {
        if ((i & 4) != 0) {
            this.f2172c = true;
            this.f2173d = j;
            this.f2174e = 0;
            this.f2175f = 0;
        }
    }

    /* renamed from: a */
    public final void mo1281a() {
        this.f2172c = false;
    }
}
