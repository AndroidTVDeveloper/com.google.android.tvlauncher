package p000;

import android.media.AudioTrack;

/* renamed from: amq */
/* compiled from: PG */
final class amq {

    /* renamed from: a */
    public final boolean f790a;

    /* renamed from: b */
    public final int f791b;

    /* renamed from: c */
    public final int f792c;

    /* renamed from: d */
    public final int f793d;

    /* renamed from: e */
    public final int f794e;

    /* renamed from: f */
    public final int f795f;

    /* renamed from: g */
    public final int f796g;

    /* renamed from: h */
    public final int f797h;

    /* renamed from: i */
    public final boolean f798i;

    /* renamed from: j */
    public final boolean f799j;

    /* renamed from: k */
    public final alu[] f800k;

    public amq(boolean z, int i, int i2, int i3, int i4, int i5, int i6, boolean z2, boolean z3, alu[] aluArr) {
        int i7;
        boolean z4;
        int i8;
        this.f790a = z;
        this.f791b = i;
        this.f792c = i2;
        this.f793d = i3;
        this.f794e = i4;
        this.f795f = i5;
        this.f796g = i6;
        if (!z) {
            if (i6 != 5) {
                if (i6 != 6) {
                    if (i6 == 7) {
                        i8 = 192000;
                    } else if (i6 == 8) {
                        i8 = 2250000;
                    } else if (i6 == 14) {
                        i8 = 3062500;
                    } else if (i6 == 17) {
                        i8 = 336000;
                    } else if (i6 != 18) {
                        throw new IllegalArgumentException();
                    }
                }
                i8 = 768000;
            } else {
                i8 = 80000;
            }
            i7 = (int) ((((long) (i6 == 5 ? i8 + i8 : i8)) * 250000) / 1000000);
        } else {
            int minBufferSize = AudioTrack.getMinBufferSize(i4, i5, i6);
            if (minBufferSize != -2) {
                z4 = true;
            } else {
                z4 = false;
            }
            bks.m3512b(z4);
            i7 = blm.m3624a(minBufferSize << 2, ((int) m1107b(250000)) * this.f793d, (int) Math.max((long) minBufferSize, m1107b(750000) * ((long) this.f793d)));
        }
        this.f797h = i7;
        this.f798i = z2;
        this.f799j = z3;
        this.f800k = aluArr;
    }

    /* renamed from: b */
    private final long m1107b(long j) {
        return (j * ((long) this.f794e)) / 1000000;
    }

    /* renamed from: a */
    public final boolean mo663a(amq amq) {
        return amq.f796g == this.f796g && amq.f794e == this.f794e && amq.f795f == this.f795f;
    }

    /* renamed from: a */
    public final long mo662a(long j) {
        return (j * 1000000) / ((long) this.f794e);
    }
}
