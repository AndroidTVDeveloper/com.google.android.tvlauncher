package p000;

import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* renamed from: bix */
/* compiled from: PG */
public final class bix implements biy {

    /* renamed from: a */
    public static final bir f4092a = new bir(2, -9223372036854775807L);

    /* renamed from: b */
    public static final bir f4093b = new bir(3, -9223372036854775807L);

    /* renamed from: c */
    public final ExecutorService f4094c;

    /* renamed from: d */
    public bis f4095d;

    /* renamed from: e */
    public IOException f4096e;

    static {
        m3360a(false, -9223372036854775807L);
        m3360a(true, -9223372036854775807L);
    }

    /* renamed from: b */
    public final boolean mo1987b() {
        return this.f4096e != null;
    }

    /* renamed from: d */
    public final boolean mo1989d() {
        return this.f4095d != null;
    }

    public bix(String str) {
        this.f4094c = blm.m3642a(str);
    }

    /* renamed from: e */
    public final void mo1990e() {
        this.f4095d.mo1980a(false);
    }

    /* renamed from: c */
    public final void mo1988c() {
        this.f4096e = null;
    }

    /* renamed from: a */
    public static bir m3360a(boolean z, long j) {
        return new bir(z ? 1 : 0, j);
    }

    /* renamed from: a */
    public final void mo1649a() {
        mo1985a(Integer.MIN_VALUE);
    }

    /* renamed from: a */
    public final void mo1985a(int i) {
        IOException iOException = this.f4096e;
        if (iOException == null) {
            bis bis = this.f4095d;
            if (bis != null) {
                if (i == Integer.MIN_VALUE) {
                    i = bis.f4081a;
                }
                IOException iOException2 = bis.f4082b;
                if (iOException2 != null && bis.f4083c > i) {
                    throw iOException2;
                }
                return;
            }
            return;
        }
        throw iOException;
    }

    /* renamed from: f */
    public final void mo1991f() {
        mo1986a((biu) null);
    }

    /* renamed from: a */
    public final void mo1986a(biu biu) {
        bis bis = this.f4095d;
        if (bis != null) {
            bis.mo1980a(true);
        }
        if (biu != null) {
            this.f4094c.execute(new biv(biu));
        }
        this.f4094c.shutdown();
    }

    /* renamed from: a */
    public final long mo1984a(bit bit, biq biq, int i) {
        boolean z;
        Looper myLooper = Looper.myLooper();
        if (myLooper != null) {
            z = true;
        } else {
            z = false;
        }
        bks.m3512b(z);
        this.f4096e = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new bis(this, myLooper, bit, biq, i, elapsedRealtime).mo1979a(0);
        return elapsedRealtime;
    }
}
