package defpackage;

import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* renamed from: bix  reason: default package */
/* compiled from: PG */
public final class bix implements biy {
    public static final bir a = new bir(2, -9223372036854775807L);
    public static final bir b = new bir(3, -9223372036854775807L);
    public final ExecutorService c;
    public bis d;
    public IOException e;

    static {
        a(false, -9223372036854775807L);
        a(true, -9223372036854775807L);
    }

    public final boolean b() {
        return this.e != null;
    }

    public final boolean d() {
        return this.d != null;
    }

    public bix(String str) {
        this.c = blm.a(str);
    }

    public final void e() {
        this.d.a(false);
    }

    public final void c() {
        this.e = null;
    }

    public static bir a(boolean z, long j) {
        return new bir(z ? 1 : 0, j);
    }

    public final void a() {
        a(Integer.MIN_VALUE);
    }

    public final void a(int i) {
        IOException iOException = this.e;
        if (iOException == null) {
            bis bis = this.d;
            if (bis != null) {
                if (i == Integer.MIN_VALUE) {
                    i = bis.a;
                }
                IOException iOException2 = bis.b;
                if (iOException2 != null && bis.c > i) {
                    throw iOException2;
                }
                return;
            }
            return;
        }
        throw iOException;
    }

    public final void f() {
        a((biu) null);
    }

    public final void a(biu biu) {
        bis bis = this.d;
        if (bis != null) {
            bis.a(true);
        }
        if (biu != null) {
            this.c.execute(new biv(biu));
        }
        this.c.shutdown();
    }

    public final long a(bit bit, biq biq, int i) {
        boolean z;
        Looper myLooper = Looper.myLooper();
        if (myLooper != null) {
            z = true;
        } else {
            z = false;
        }
        bks.b(z);
        this.e = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new bis(this, myLooper, bit, biq, i, elapsedRealtime).a(0);
        return elapsedRealtime;
    }
}
