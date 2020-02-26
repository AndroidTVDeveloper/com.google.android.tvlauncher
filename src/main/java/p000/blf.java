package p000;

import android.os.SystemClock;

/* renamed from: blf */
/* compiled from: PG */
public final class blf implements bkr {

    /* renamed from: a */
    public akq f4280a = akq.f624a;

    /* renamed from: b */
    private boolean f4281b;

    /* renamed from: c */
    private long f4282c;

    /* renamed from: d */
    private long f4283d;

    /* renamed from: Q */
    public final akq mo376Q() {
        return this.f4280a;
    }

    /* renamed from: b */
    public final long mo379b() {
        long j = this.f4282c;
        if (!this.f4281b) {
            return j;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f4283d;
        akq akq = this.f4280a;
        if (akq.f625b != 1.0f) {
            return j + (elapsedRealtime * ((long) akq.f628e));
        }
        return j + aja.m633b(elapsedRealtime);
    }

    /* renamed from: a */
    public final void mo2108a(long j) {
        this.f4282c = j;
        if (this.f4281b) {
            this.f4283d = SystemClock.elapsedRealtime();
        }
    }

    /* renamed from: a */
    public final void mo378a(akq akq) {
        if (this.f4281b) {
            mo2108a(mo379b());
        }
        this.f4280a = akq;
    }

    /* renamed from: a */
    public final void mo2107a() {
        if (!this.f4281b) {
            this.f4283d = SystemClock.elapsedRealtime();
            this.f4281b = true;
        }
    }

    /* renamed from: d */
    public final void mo2109d() {
        if (this.f4281b) {
            mo2108a(mo379b());
            this.f4281b = false;
        }
    }
}
