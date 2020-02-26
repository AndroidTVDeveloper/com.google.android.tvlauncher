package defpackage;

import android.media.AudioTrack;

/* renamed from: amj  reason: default package */
/* compiled from: PG */
final class amj {
    public final ami a;
    public int b;
    public long c;
    public long d;
    public long e;
    public long f;

    public amj(AudioTrack audioTrack) {
        if (blm.a >= 19) {
            this.a = new ami(audioTrack);
            b();
            return;
        }
        this.a = null;
        a(3);
    }

    public final long d() {
        ami ami = this.a;
        if (ami == null) {
            return -1;
        }
        return ami.e;
    }

    public final long c() {
        ami ami = this.a;
        if (ami == null) {
            return -9223372036854775807L;
        }
        return ami.a();
    }

    public final void a() {
        a(4);
    }

    public final void b() {
        if (this.a != null) {
            a(0);
        }
    }

    public final void a(int i) {
        this.b = i;
        if (i == 0) {
            this.e = 0;
            this.f = -1;
            this.c = System.nanoTime() / 1000;
            this.d = 5000;
        } else if (i == 1) {
            this.d = 5000;
        } else if (i == 2 || i == 3) {
            this.d = 10000000;
        } else {
            this.d = 500000;
        }
    }
}
