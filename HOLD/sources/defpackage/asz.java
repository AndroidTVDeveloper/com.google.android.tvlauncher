package defpackage;

import android.util.Log;

/* renamed from: asz  reason: default package */
/* compiled from: PG */
public final class asz implements aoi {
    private aok a;
    private aov b;
    private ata c;
    private int d;
    private int e;

    public final void a(aok aok) {
        this.a = aok;
        this.b = aok.a(0, 1);
        this.c = null;
        aok.S();
    }

    public final int a(aoj aoj, aop aop) {
        boolean z;
        aoj aoj2 = aoj;
        ata ata = this.c;
        if (ata == null) {
            ata a2 = atc.a(aoj);
            this.c = a2;
            if (a2 != null) {
                int i = a2.b;
                int i2 = a2.d;
                int i3 = a2.a;
                this.b.a(akh.a(null, "audio/raw", i2 * i * i3, 32768, i3, i, a2.e, null, null, 0, null));
                ata = this.c;
                this.d = ata.c;
            } else {
                throw new ako("Unsupported or unrecognized wav header.");
            }
        }
        int i4 = ata.f;
        if (i4 == -1) {
            bks.a(aoj);
            bks.a(ata);
            aoj.a();
            bky bky = new bky(8);
            atb a3 = atb.a(aoj2, bky);
            while (true) {
                int i5 = a3.a;
                if (i5 == 1684108385) {
                    aoj2.a(8);
                    aof aof = (aof) aoj2;
                    int i6 = (int) aof.c;
                    long j = ((long) i6) + a3.b;
                    long j2 = aof.b;
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
                    ata.f = i6;
                    ata.g = j2;
                    this.a.a(this.c);
                } else {
                    if (!(i5 == 1380533830 || i5 == 1718449184)) {
                        StringBuilder sb2 = new StringBuilder(39);
                        sb2.append("Ignoring unknown WAV chunk: ");
                        sb2.append(i5);
                        Log.w("WavHeaderReader", sb2.toString());
                    }
                    long j3 = a3.b + 8;
                    int i7 = a3.a;
                    if (i7 == 1380533830) {
                        j3 = 12;
                    }
                    if (j3 <= 2147483647L) {
                        aoj2.a((int) j3);
                        a3 = atb.a(aoj2, bky);
                    } else {
                        StringBuilder sb3 = new StringBuilder(51);
                        sb3.append("Chunk is too large (~2GB+) to skip; id: ");
                        sb3.append(i7);
                        throw new ako(sb3.toString());
                    }
                }
            }
        } else if (((aof) aoj2).c == 0) {
            aoj2.a(i4);
        }
        long j4 = this.c.g;
        if (j4 != -1) {
            z = true;
        } else {
            z = false;
        }
        bks.b(z);
        aof aof2 = (aof) aoj2;
        long j5 = j4 - aof2.c;
        if (j5 > 0) {
            int a4 = this.b.a(aoj2, (int) Math.min((long) (32768 - this.e), j5), true);
            if (a4 != -1) {
                this.e += a4;
            }
            int i8 = this.e;
            int i9 = i8 / this.d;
            if (i9 > 0) {
                long b2 = this.c.b(aof2.c - ((long) i8));
                int i10 = i9 * this.d;
                int i11 = this.e - i10;
                this.e = i11;
                this.b.a(b2, 1, i10, i11, null);
            }
            if (a4 != -1) {
                return 0;
            }
        }
        return -1;
    }

    public final void a(long j, long j2) {
        this.e = 0;
    }

    public final boolean a(aoj aoj) {
        return atc.a(aoj) != null;
    }
}
