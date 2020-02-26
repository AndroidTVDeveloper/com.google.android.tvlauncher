package defpackage;

import android.media.AudioTrack;

/* renamed from: amq  reason: default package */
/* compiled from: PG */
final class amq {
    public final boolean a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final boolean i;
    public final boolean j;
    public final alu[] k;

    public amq(boolean z, int i2, int i3, int i4, int i5, int i6, int i7, boolean z2, boolean z3, alu[] aluArr) {
        int i8;
        boolean z4;
        int i9;
        this.a = z;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
        this.g = i7;
        if (!z) {
            if (i7 != 5) {
                if (i7 != 6) {
                    if (i7 == 7) {
                        i9 = 192000;
                    } else if (i7 == 8) {
                        i9 = 2250000;
                    } else if (i7 == 14) {
                        i9 = 3062500;
                    } else if (i7 == 17) {
                        i9 = 336000;
                    } else if (i7 != 18) {
                        throw new IllegalArgumentException();
                    }
                }
                i9 = 768000;
            } else {
                i9 = 80000;
            }
            i8 = (int) ((((long) (i7 == 5 ? i9 + i9 : i9)) * 250000) / 1000000);
        } else {
            int minBufferSize = AudioTrack.getMinBufferSize(i5, i6, i7);
            if (minBufferSize != -2) {
                z4 = true;
            } else {
                z4 = false;
            }
            bks.b(z4);
            i8 = blm.a(minBufferSize << 2, ((int) b(250000)) * this.d, (int) Math.max((long) minBufferSize, b(750000) * ((long) this.d)));
        }
        this.h = i8;
        this.i = z2;
        this.j = z3;
        this.k = aluArr;
    }

    private final long b(long j2) {
        return (j2 * ((long) this.e)) / 1000000;
    }

    public final boolean a(amq amq) {
        return amq.g == this.g && amq.e == this.e && amq.f == this.f;
    }

    public final long a(long j2) {
        return (j2 * 1000000) / ((long) this.e);
    }
}
