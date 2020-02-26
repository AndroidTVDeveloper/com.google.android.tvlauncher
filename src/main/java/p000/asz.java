package p000;

import android.util.Log;

/* renamed from: asz */
/* compiled from: PG */
public final class asz implements aoi {

    /* renamed from: a */
    private aok f2313a;

    /* renamed from: b */
    private aov f2314b;

    /* renamed from: c */
    private ata f2315c;

    /* renamed from: d */
    private int f2316d;

    /* renamed from: e */
    private int f2317e;

    /* renamed from: a */
    public final void mo1208a(aok aok) {
        this.f2313a = aok;
        this.f2314b = aok.mo1211a(0, 1);
        this.f2315c = null;
        aok.mo1210S();
    }

    /* renamed from: a */
    public final int mo1206a(aoj aoj, aop aop) {
        boolean z;
        aoj aoj2 = aoj;
        ata ata = this.f2315c;
        if (ata == null) {
            ata a = atc.m2045a(aoj);
            this.f2315c = a;
            if (a != null) {
                int i = a.f2319b;
                int i2 = a.f2321d;
                int i3 = a.f2318a;
                this.f2314b.mo1204a(akh.m730a(null, "audio/raw", i2 * i * i3, 32768, i3, i, a.f2322e, null, null, 0, null));
                ata = this.f2315c;
                this.f2316d = ata.f2320c;
            } else {
                throw new ako("Unsupported or unrecognized wav header.");
            }
        }
        int i4 = ata.f2323f;
        if (i4 == -1) {
            bks.m3507a(aoj);
            bks.m3507a(ata);
            aoj.mo1191a();
            bky bky = new bky(8);
            atb a2 = atb.m2042a(aoj2, bky);
            while (true) {
                int i5 = a2.f2326a;
                if (i5 == 1684108385) {
                    aoj2.mo1192a(8);
                    aof aof = (aof) aoj2;
                    int i6 = (int) aof.f1490c;
                    long j = ((long) i6) + a2.f2327b;
                    long j2 = aof.f1489b;
                    if (j2 == -1 || j <= j2) {
                        j2 = j;
                    } else {
                        StringBuilder sb = new StringBuilder(69);
                        sb.append("Data exceeds input length: ");
                        sb.append(j);
                        sb.append(", ");
                        sb.append(j2);
                        Log.w("WavHeaderReader", sb.toString());
                    }
                    ata.f2323f = i6;
                    ata.f2324g = j2;
                    this.f2313a.mo1212a(this.f2315c);
                } else {
                    if (!(i5 == 1380533830 || i5 == 1718449184)) {
                        StringBuilder sb2 = new StringBuilder(39);
                        sb2.append("Ignoring unknown WAV chunk: ");
                        sb2.append(i5);
                        Log.w("WavHeaderReader", sb2.toString());
                    }
                    long j3 = a2.f2327b + 8;
                    int i7 = a2.f2326a;
                    if (i7 == 1380533830) {
                        j3 = 12;
                    }
                    if (j3 <= 2147483647L) {
                        aoj2.mo1192a((int) j3);
                        a2 = atb.m2042a(aoj2, bky);
                    } else {
                        StringBuilder sb3 = new StringBuilder(51);
                        sb3.append("Chunk is too large (~2GB+) to skip; id: ");
                        sb3.append(i7);
                        throw new ako(sb3.toString());
                    }
                }
            }
        } else if (((aof) aoj2).f1490c == 0) {
            aoj2.mo1192a(i4);
        }
        long j4 = this.f2315c.f2324g;
        if (j4 != -1) {
            z = true;
        } else {
            z = false;
        }
        bks.m3512b(z);
        aof aof2 = (aof) aoj2;
        long j5 = j4 - aof2.f1490c;
        if (j5 > 0) {
            int a3 = this.f2314b.mo1202a(aoj2, (int) Math.min((long) (32768 - this.f2317e), j5), true);
            if (a3 != -1) {
                this.f2317e += a3;
            }
            int i8 = this.f2317e;
            int i9 = i8 / this.f2316d;
            if (i9 > 0) {
                long b = this.f2315c.mo1314b(aof2.f1490c - ((long) i8));
                int i10 = i9 * this.f2316d;
                int i11 = this.f2317e - i10;
                this.f2317e = i11;
                this.f2314b.mo1203a(b, 1, i10, i11, null);
            }
            if (a3 != -1) {
                return 0;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public final void mo1207a(long j, long j2) {
        this.f2317e = 0;
    }

    /* renamed from: a */
    public final boolean mo1209a(aoj aoj) {
        return atc.m2045a(aoj) != null;
    }
}
