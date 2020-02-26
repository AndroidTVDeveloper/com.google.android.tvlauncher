package defpackage;

import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* renamed from: iq  reason: default package */
/* compiled from: PG */
public final class iq implements Runnable {
    public static final ThreadLocal a = new ThreadLocal();
    private static final Comparator f = new in();
    public final ArrayList b = new ArrayList();
    public long c;
    private long d;
    private final ArrayList e = new ArrayList();

    public final void a(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.m && this.d == 0) {
            this.d = System.nanoTime();
            recyclerView.post(this);
        }
        io ioVar = recyclerView.C;
        ioVar.a = i;
        ioVar.b = i2;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: kc.a(km, boolean):void
     arg types: [km, int]
     candidates:
      kc.a(int, long):km
      kc.a(km, boolean):void */
    private static final km a(RecyclerView recyclerView, int i, long j) {
        int b2 = recyclerView.c.b();
        for (int i2 = 0; i2 < b2; i2++) {
            km c2 = RecyclerView.c(recyclerView.c.c(i2));
            if (c2.c == i && !c2.j()) {
                return null;
            }
        }
        kc kcVar = recyclerView.a;
        try {
            recyclerView.j();
            km a2 = kcVar.a(i, j);
            if (a2 != null) {
                if (!a2.l() || a2.j()) {
                    kcVar.a(a2, false);
                } else {
                    kcVar.a(a2.a);
                }
            }
            return a2;
        } finally {
            recyclerView.b(false);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: io.a(android.support.v7.widget.RecyclerView, boolean):void
     arg types: [android.support.v7.widget.RecyclerView, int]
     candidates:
      io.a(int, int):void
      jw.a(int, int):void
      io.a(android.support.v7.widget.RecyclerView, boolean):void */
    public final void run() {
        ip ipVar;
        RecyclerView recyclerView;
        long j;
        RecyclerView recyclerView2;
        ip ipVar2;
        boolean z;
        long j2 = 0;
        try {
            bu.a("RV Prefetch");
            if (!this.b.isEmpty()) {
                int size = this.b.size();
                long j3 = 0;
                for (int i = 0; i < size; i++) {
                    RecyclerView recyclerView3 = (RecyclerView) this.b.get(i);
                    if (recyclerView3.getWindowVisibility() == 0) {
                        j3 = Math.max(recyclerView3.getDrawingTime(), j3);
                    }
                }
                if (j3 != 0) {
                    long nanos = TimeUnit.MILLISECONDS.toNanos(j3) + this.c;
                    int size2 = this.b.size();
                    int i2 = 0;
                    for (int i3 = 0; i3 < size2; i3++) {
                        RecyclerView recyclerView4 = (RecyclerView) this.b.get(i3);
                        if (recyclerView4.getWindowVisibility() == 0) {
                            recyclerView4.C.a(recyclerView4, false);
                            i2 += recyclerView4.C.d;
                        }
                    }
                    this.e.ensureCapacity(i2);
                    int i4 = 0;
                    for (int i5 = 0; i5 < size2; i5++) {
                        RecyclerView recyclerView5 = (RecyclerView) this.b.get(i5);
                        if (recyclerView5.getWindowVisibility() == 0) {
                            io ioVar = recyclerView5.C;
                            int abs = Math.abs(ioVar.a) + Math.abs(ioVar.b);
                            int i6 = i4;
                            int i7 = 0;
                            while (true) {
                                int i8 = ioVar.d;
                                if (i7 >= i8 + i8) {
                                    break;
                                }
                                if (i6 >= this.e.size()) {
                                    ipVar2 = new ip();
                                    this.e.add(ipVar2);
                                } else {
                                    ipVar2 = (ip) this.e.get(i6);
                                }
                                int[] iArr = ioVar.c;
                                int i9 = iArr[i7 + 1];
                                if (i9 <= abs) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                ipVar2.a = z;
                                ipVar2.b = abs;
                                ipVar2.c = i9;
                                ipVar2.d = recyclerView5;
                                ipVar2.e = iArr[i7];
                                i6++;
                                i7 += 2;
                            }
                            i4 = i6;
                        }
                    }
                    Collections.sort(this.e, f);
                    int i10 = 0;
                    while (i10 < this.e.size() && (recyclerView = (ipVar = (ip) this.e.get(i10)).d) != null) {
                        if (!ipVar.a) {
                            j = nanos;
                        } else {
                            j = Long.MAX_VALUE;
                        }
                        km a2 = a(recyclerView, ipVar.e, j);
                        if (!(a2 == null || a2.b == null || !a2.l() || a2.j() || (recyclerView2 = (RecyclerView) a2.b.get()) == null)) {
                            if (recyclerView2.s) {
                                if (recyclerView2.c.b() != 0) {
                                    recyclerView2.b();
                                }
                            }
                            io ioVar2 = recyclerView2.C;
                            ioVar2.a(recyclerView2, true);
                            if (ioVar2.d != 0) {
                                bu.a("RV Nested Prefetch");
                                kk kkVar = recyclerView2.D;
                                jp jpVar = recyclerView2.g;
                                kkVar.d = 1;
                                kkVar.e = jpVar.a();
                                kkVar.g = false;
                                kkVar.h = false;
                                kkVar.i = false;
                                int i11 = 0;
                                while (true) {
                                    int i12 = ioVar2.d;
                                    if (i11 >= i12 + i12) {
                                        break;
                                    }
                                    a(recyclerView2, ioVar2.c[i11], nanos);
                                    i11 += 2;
                                }
                                bu.a();
                            }
                        }
                        ipVar.a = false;
                        ipVar.b = 0;
                        ipVar.c = 0;
                        ipVar.d = null;
                        ipVar.e = 0;
                        i10++;
                    }
                }
                j2 = 0;
            }
            this.d = j2;
            bu.a();
        } catch (Throwable th) {
            this.d = 0;
            throw th;
        } finally {
        }
    }
}
