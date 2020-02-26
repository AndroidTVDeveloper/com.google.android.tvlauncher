package p000;

import android.support.p002v7.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* renamed from: iq */
/* compiled from: PG */
public final class C0235iq implements Runnable {

    /* renamed from: a */
    public static final ThreadLocal f9622a = new ThreadLocal();

    /* renamed from: f */
    private static final Comparator f9623f = new C0232in();

    /* renamed from: b */
    public final ArrayList f9624b = new ArrayList();

    /* renamed from: c */
    public long f9625c;

    /* renamed from: d */
    private long f9626d;

    /* renamed from: e */
    private final ArrayList f9627e = new ArrayList();

    /* renamed from: a */
    public final void mo5264a(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.f1073m && this.f9626d == 0) {
            this.f9626d = System.nanoTime();
            recyclerView.post(this);
        }
        C0233io ioVar = recyclerView.f1023C;
        ioVar.f9613a = i;
        ioVar.f9614b = i2;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: kc.a(km, boolean):void
     arg types: [km, int]
     candidates:
      kc.a(int, long):km
      kc.a(km, boolean):void */
    /* renamed from: a */
    private static final C0285km m7588a(RecyclerView recyclerView, int i, long j) {
        int b = recyclerView.f1063c.mo5201b();
        for (int i2 = 0; i2 < b; i2++) {
            C0285km c = RecyclerView.m1301c(recyclerView.f1063c.mo5204c(i2));
            if (c.f9785c == i && !c.mo5442j()) {
                return null;
            }
        }
        C0275kc kcVar = recyclerView.f1041a;
        try {
            recyclerView.mo890j();
            C0285km a = kcVar.mo5392a(i, j);
            if (a != null) {
                if (!a.mo5444l() || a.mo5442j()) {
                    kcVar.mo5396a(a, false);
                } else {
                    kcVar.mo5394a(a.f9783a);
                }
            }
            return a;
        } finally {
            recyclerView.mo845b(false);
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
        C0234ip ipVar;
        RecyclerView recyclerView;
        long j;
        RecyclerView recyclerView2;
        C0234ip ipVar2;
        boolean z;
        long j2 = 0;
        try {
            C0049bu.m4189a("RV Prefetch");
            if (!this.f9624b.isEmpty()) {
                int size = this.f9624b.size();
                long j3 = 0;
                for (int i = 0; i < size; i++) {
                    RecyclerView recyclerView3 = (RecyclerView) this.f9624b.get(i);
                    if (recyclerView3.getWindowVisibility() == 0) {
                        j3 = Math.max(recyclerView3.getDrawingTime(), j3);
                    }
                }
                if (j3 != 0) {
                    long nanos = TimeUnit.MILLISECONDS.toNanos(j3) + this.f9625c;
                    int size2 = this.f9624b.size();
                    int i2 = 0;
                    for (int i3 = 0; i3 < size2; i3++) {
                        RecyclerView recyclerView4 = (RecyclerView) this.f9624b.get(i3);
                        if (recyclerView4.getWindowVisibility() == 0) {
                            recyclerView4.f1023C.mo5262a(recyclerView4, false);
                            i2 += recyclerView4.f1023C.f9616d;
                        }
                    }
                    this.f9627e.ensureCapacity(i2);
                    int i4 = 0;
                    for (int i5 = 0; i5 < size2; i5++) {
                        RecyclerView recyclerView5 = (RecyclerView) this.f9624b.get(i5);
                        if (recyclerView5.getWindowVisibility() == 0) {
                            C0233io ioVar = recyclerView5.f1023C;
                            int abs = Math.abs(ioVar.f9613a) + Math.abs(ioVar.f9614b);
                            int i6 = i4;
                            int i7 = 0;
                            while (true) {
                                int i8 = ioVar.f9616d;
                                if (i7 >= i8 + i8) {
                                    break;
                                }
                                if (i6 >= this.f9627e.size()) {
                                    ipVar2 = new C0234ip();
                                    this.f9627e.add(ipVar2);
                                } else {
                                    ipVar2 = (C0234ip) this.f9627e.get(i6);
                                }
                                int[] iArr = ioVar.f9615c;
                                int i9 = iArr[i7 + 1];
                                if (i9 <= abs) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                ipVar2.f9617a = z;
                                ipVar2.f9618b = abs;
                                ipVar2.f9619c = i9;
                                ipVar2.f9620d = recyclerView5;
                                ipVar2.f9621e = iArr[i7];
                                i6++;
                                i7 += 2;
                            }
                            i4 = i6;
                        }
                    }
                    Collections.sort(this.f9627e, f9623f);
                    int i10 = 0;
                    while (i10 < this.f9627e.size() && (recyclerView = (ipVar = (C0234ip) this.f9627e.get(i10)).f9620d) != null) {
                        if (!ipVar.f9617a) {
                            j = nanos;
                        } else {
                            j = Long.MAX_VALUE;
                        }
                        C0285km a = m7588a(recyclerView, ipVar.f9621e, j);
                        if (!(a == null || a.f9784b == null || !a.mo5444l() || a.mo5442j() || (recyclerView2 = (RecyclerView) a.f9784b.get()) == null)) {
                            if (recyclerView2.f1079s) {
                                if (recyclerView2.f1063c.mo5201b() != 0) {
                                    recyclerView2.mo842b();
                                }
                            }
                            C0233io ioVar2 = recyclerView2.f1023C;
                            ioVar2.mo5262a(recyclerView2, true);
                            if (ioVar2.f9616d != 0) {
                                C0049bu.m4189a("RV Nested Prefetch");
                                C0283kk kkVar = recyclerView2.f1024D;
                                C0261jp jpVar = recyclerView2.f1067g;
                                kkVar.f9762d = 1;
                                kkVar.f9763e = jpVar.mo2794a();
                                kkVar.f9765g = false;
                                kkVar.f9766h = false;
                                kkVar.f9767i = false;
                                int i11 = 0;
                                while (true) {
                                    int i12 = ioVar2.f9616d;
                                    if (i11 >= i12 + i12) {
                                        break;
                                    }
                                    m7588a(recyclerView2, ioVar2.f9615c[i11], nanos);
                                    i11 += 2;
                                }
                                C0049bu.m4188a();
                            }
                        }
                        ipVar.f9617a = false;
                        ipVar.f9618b = 0;
                        ipVar.f9619c = 0;
                        ipVar.f9620d = null;
                        ipVar.f9621e = 0;
                        i10++;
                    }
                }
                j2 = 0;
            }
            this.f9626d = j2;
            C0049bu.m4188a();
        } catch (Throwable th) {
            this.f9626d = 0;
            throw th;
        } finally {
        }
    }
}
