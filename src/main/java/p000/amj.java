package p000;

import android.media.AudioTrack;

/* renamed from: amj */
/* compiled from: PG */
final class amj {

    /* renamed from: a */
    public final ami f748a;

    /* renamed from: b */
    public int f749b;

    /* renamed from: c */
    public long f750c;

    /* renamed from: d */
    public long f751d;

    /* renamed from: e */
    public long f752e;

    /* renamed from: f */
    public long f753f;

    public amj(AudioTrack audioTrack) {
        if (blm.f4293a >= 19) {
            this.f748a = new ami(audioTrack);
            mo641b();
            return;
        }
        this.f748a = null;
        mo640a(3);
    }

    /* renamed from: d */
    public final long mo643d() {
        ami ami = this.f748a;
        if (ami == null) {
            return -1;
        }
        return ami.f747e;
    }

    /* renamed from: c */
    public final long mo642c() {
        ami ami = this.f748a;
        if (ami == null) {
            return -9223372036854775807L;
        }
        return ami.mo638a();
    }

    /* renamed from: a */
    public final void mo639a() {
        mo640a(4);
    }

    /* renamed from: b */
    public final void mo641b() {
        if (this.f748a != null) {
            mo640a(0);
        }
    }

    /* renamed from: a */
    public final void mo640a(int i) {
        this.f749b = i;
        if (i == 0) {
            this.f752e = 0;
            this.f753f = -1;
            this.f750c = System.nanoTime() / 1000;
            this.f751d = 5000;
        } else if (i == 1) {
            this.f751d = 5000;
        } else if (i == 2 || i == 3) {
            this.f751d = 10000000;
        } else {
            this.f751d = 500000;
        }
    }
}
