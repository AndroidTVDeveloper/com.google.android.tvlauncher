package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: axg  reason: default package */
/* compiled from: PG */
public final class axg {
    public final awt a;
    public final CopyOnWriteArrayList b;
    private final long c;

    public axg() {
        this(new CopyOnWriteArrayList(), null, 0);
    }

    private axg(CopyOnWriteArrayList copyOnWriteArrayList, awt awt, long j) {
        this.b = copyOnWriteArrayList;
        this.a = awt;
        this.c = j;
    }

    public final void a(long j) {
        int i = (aja.a(j) > -9223372036854775807L ? 1 : (aja.a(j) == -9223372036854775807L ? 0 : -1));
    }

    public final void b(long j) {
        a(j);
        b(new buk());
    }

    public final void b(buk buk) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            axf axf = (axf) it.next();
            a(axf.a, new axe(this, axf.b, buk, (byte) 0, (byte) 0));
        }
    }

    public final void c(buj buj, buk buk) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            axf axf = (axf) it.next();
            a(axf.a, new axa(this, axf.b, buj, buk, (byte) 0, (byte) 0));
        }
    }

    public final void a(long j, long j2) {
        buj buj = new buj();
        a(j);
        a(j2);
        c(buj, new buk());
    }

    public final void a(int i) {
        a(-9223372036854775807L, -9223372036854775807L);
    }

    public final void b(buj buj, buk buk) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            axf axf = (axf) it.next();
            a(axf.a, new awz(this, axf.b, buj, buk, (byte) 0, (byte) 0));
        }
    }

    public final void b(long j, long j2) {
        buj buj = new buj();
        a(j);
        a(j2);
        b(buj, new buk());
    }

    public final void b(int i) {
        b(-9223372036854775807L, -9223372036854775807L);
    }

    public final void a(buj buj, buk buk, IOException iOException, boolean z) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            axf axf = (axf) it.next();
            a(axf.a, new axb(this, axf.b, buj, buk, iOException, z, (byte) 0, (byte) 0));
        }
    }

    public final void a(long j, long j2, IOException iOException, boolean z) {
        buj buj = new buj();
        a(j);
        a(j2);
        a(buj, new buk(), iOException, z);
    }

    public final void a(int i, IOException iOException, boolean z) {
        a(-9223372036854775807L, -9223372036854775807L, iOException, z);
    }

    public final void a(buj buj, buk buk) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            axf axf = (axf) it.next();
            a(axf.a, new awy(this, axf.b, buj, buk, (byte) 0, (byte) 0));
        }
    }

    public final void c(long j, long j2) {
        Collections.emptyMap();
        buj buj = new buj();
        a(j);
        a(j2);
        a(buj, new buk());
    }

    public final void c(int i) {
        c(-9223372036854775807L, -9223372036854775807L);
    }

    public final void a() {
        awt awt = (awt) bks.a(this.a);
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            axf axf = (axf) it.next();
            a(axf.a, new aww(axf.b, awt));
        }
    }

    public final void b() {
        awt awt = (awt) bks.a(this.a);
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            axf axf = (axf) it.next();
            a(axf.a, new awx(axf.b, awt));
        }
    }

    private static final void a(Handler handler, Runnable runnable) {
        if (handler.getLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            handler.post(runnable);
        }
    }

    public final void c() {
        awt awt = (awt) bks.a(this.a);
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            axf axf = (axf) it.next();
            a(axf.a, new axc(axf.b, awt));
        }
    }

    public final void a(buk buk) {
        awt awt = (awt) bks.a(this.a);
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            axf axf = (axf) it.next();
            a(axf.a, new axd(axf.b, awt, buk, (byte) 0, (byte) 0));
        }
    }

    public final axg a(awt awt, long j) {
        return new axg(this.b, awt, j);
    }
}
