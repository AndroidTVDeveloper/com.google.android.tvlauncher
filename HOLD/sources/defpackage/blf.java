package defpackage;

import android.os.SystemClock;

/* renamed from: blf  reason: default package */
/* compiled from: PG */
public final class blf implements bkr {
    public akq a = akq.a;
    private boolean b;
    private long c;
    private long d;

    public final akq Q() {
        return this.a;
    }

    public final long b() {
        long j = this.c;
        if (!this.b) {
            return j;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.d;
        akq akq = this.a;
        if (akq.b != 1.0f) {
            return j + (elapsedRealtime * ((long) akq.e));
        }
        return j + aja.b(elapsedRealtime);
    }

    public final void a(long j) {
        this.c = j;
        if (this.b) {
            this.d = SystemClock.elapsedRealtime();
        }
    }

    public final void a(akq akq) {
        if (this.b) {
            a(b());
        }
        this.a = akq;
    }

    public final void a() {
        if (!this.b) {
            this.d = SystemClock.elapsedRealtime();
            this.b = true;
        }
    }

    public final void d() {
        if (this.b) {
            a(b());
            this.b = false;
        }
    }
}
