package p000;

import android.os.Handler;
import android.os.Looper;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: axg */
/* compiled from: PG */
public final class axg {

    /* renamed from: a */
    public final awt f2609a;

    /* renamed from: b */
    public final CopyOnWriteArrayList f2610b;

    /* renamed from: c */
    private final long f2611c;

    public axg() {
        this(new CopyOnWriteArrayList(), null, 0);
    }

    private axg(CopyOnWriteArrayList copyOnWriteArrayList, awt awt, long j) {
        this.f2610b = copyOnWriteArrayList;
        this.f2609a = awt;
        this.f2611c = j;
    }

    /* renamed from: a */
    public final void mo1520a(long j) {
        int i = (aja.m632a(j) > -9223372036854775807L ? 1 : (aja.m632a(j) == -9223372036854775807L ? 0 : -1));
    }

    /* renamed from: b */
    public final void mo1528b(long j) {
        mo1520a(j);
        mo1531b(new buk());
    }

    /* renamed from: b */
    public final void mo1531b(buk buk) {
        Iterator it = this.f2610b.iterator();
        while (it.hasNext()) {
            axf axf = (axf) it.next();
            m2288a(axf.f2607a, new axe(this, axf.f2608b, buk, (byte) 0, (byte) 0));
        }
    }

    /* renamed from: c */
    public final void mo1535c(buj buj, buk buk) {
        Iterator it = this.f2610b.iterator();
        while (it.hasNext()) {
            axf axf = (axf) it.next();
            m2288a(axf.f2607a, new axa(this, axf.f2608b, buj, buk, (byte) 0, (byte) 0));
        }
    }

    /* renamed from: a */
    public final void mo1521a(long j, long j2) {
        buj buj = new buj();
        mo1520a(j);
        mo1520a(j2);
        mo1535c(buj, new buk());
    }

    /* renamed from: a */
    public final void mo1518a(int i) {
        mo1521a(-9223372036854775807L, -9223372036854775807L);
    }

    /* renamed from: b */
    public final void mo1530b(buj buj, buk buk) {
        Iterator it = this.f2610b.iterator();
        while (it.hasNext()) {
            axf axf = (axf) it.next();
            m2288a(axf.f2607a, new awz(this, axf.f2608b, buj, buk, (byte) 0, (byte) 0));
        }
    }

    /* renamed from: b */
    public final void mo1529b(long j, long j2) {
        buj buj = new buj();
        mo1520a(j);
        mo1520a(j2);
        mo1530b(buj, new buk());
    }

    /* renamed from: b */
    public final void mo1527b(int i) {
        mo1529b(-9223372036854775807L, -9223372036854775807L);
    }

    /* renamed from: a */
    public final void mo1524a(buj buj, buk buk, IOException iOException, boolean z) {
        Iterator it = this.f2610b.iterator();
        while (it.hasNext()) {
            axf axf = (axf) it.next();
            m2288a(axf.f2607a, new axb(this, axf.f2608b, buj, buk, iOException, z, (byte) 0, (byte) 0));
        }
    }

    /* renamed from: a */
    public final void mo1522a(long j, long j2, IOException iOException, boolean z) {
        buj buj = new buj();
        mo1520a(j);
        mo1520a(j2);
        mo1524a(buj, new buk(), iOException, z);
    }

    /* renamed from: a */
    public final void mo1519a(int i, IOException iOException, boolean z) {
        mo1522a(-9223372036854775807L, -9223372036854775807L, iOException, z);
    }

    /* renamed from: a */
    public final void mo1523a(buj buj, buk buk) {
        Iterator it = this.f2610b.iterator();
        while (it.hasNext()) {
            axf axf = (axf) it.next();
            m2288a(axf.f2607a, new awy(this, axf.f2608b, buj, buk, (byte) 0, (byte) 0));
        }
    }

    /* renamed from: c */
    public final void mo1534c(long j, long j2) {
        Collections.emptyMap();
        buj buj = new buj();
        mo1520a(j);
        mo1520a(j2);
        mo1523a(buj, new buk());
    }

    /* renamed from: c */
    public final void mo1533c(int i) {
        mo1534c(-9223372036854775807L, -9223372036854775807L);
    }

    /* renamed from: a */
    public final void mo1517a() {
        awt awt = (awt) bks.m3507a(this.f2609a);
        Iterator it = this.f2610b.iterator();
        while (it.hasNext()) {
            axf axf = (axf) it.next();
            m2288a(axf.f2607a, new aww(axf.f2608b, awt));
        }
    }

    /* renamed from: b */
    public final void mo1526b() {
        awt awt = (awt) bks.m3507a(this.f2609a);
        Iterator it = this.f2610b.iterator();
        while (it.hasNext()) {
            axf axf = (axf) it.next();
            m2288a(axf.f2607a, new awx(axf.f2608b, awt));
        }
    }

    /* renamed from: a */
    private static final void m2288a(Handler handler, Runnable runnable) {
        if (handler.getLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            handler.post(runnable);
        }
    }

    /* renamed from: c */
    public final void mo1532c() {
        awt awt = (awt) bks.m3507a(this.f2609a);
        Iterator it = this.f2610b.iterator();
        while (it.hasNext()) {
            axf axf = (axf) it.next();
            m2288a(axf.f2607a, new axc(axf.f2608b, awt));
        }
    }

    /* renamed from: a */
    public final void mo1525a(buk buk) {
        awt awt = (awt) bks.m3507a(this.f2609a);
        Iterator it = this.f2610b.iterator();
        while (it.hasNext()) {
            axf axf = (axf) it.next();
            m2288a(axf.f2607a, new axd(axf.f2608b, awt, buk, (byte) 0, (byte) 0));
        }
    }

    /* renamed from: a */
    public final axg mo1516a(awt awt, long j) {
        return new axg(this.f2610b, awt, j);
    }
}
