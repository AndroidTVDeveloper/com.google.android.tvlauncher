package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.Collections;
import java.util.List;

/* renamed from: bdt  reason: default package */
/* compiled from: PG */
public final class bdt extends aiz implements Handler.Callback {
    private final Handler f;
    private final bds g;
    private final bdp h;
    private final aki i;
    private boolean j;
    private boolean k;
    private int l;
    private akh m;
    private bdm n;
    private bdq o;
    private bdr p;
    private bdr q;
    private int r;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: blm.a(android.os.Looper, android.os.Handler$Callback):android.os.Handler
     arg types: [android.os.Looper, bdt]
     candidates:
      blm.a(int, int):int
      blm.a(byte[], int):int
      blm.a(long, float):long
      blm.a(long, long):long
      blm.a(java.lang.String, int):java.lang.String
      blm.a(java.lang.String, java.lang.Object[]):java.lang.String
      blm.a(android.os.Parcel, boolean):void
      blm.a(long[], long):void
      blm.a(java.lang.Object, java.lang.Object):boolean
      blm.a(java.lang.Object[], java.lang.Object):boolean
      blm.a(java.util.List, long):long[]
      blm.a(java.lang.Object[], int):java.lang.Object[]
      blm.a(java.lang.String, java.lang.String):java.lang.String[]
      blm.a(android.os.Looper, android.os.Handler$Callback):android.os.Handler */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bdt(bds bds, Looper looper) {
        super(3);
        Handler handler;
        bdp bdp = bdp.a;
        this.g = (bds) bks.a(bds);
        if (looper != null) {
            handler = blm.a(looper, (Handler.Callback) this);
        } else {
            handler = null;
        }
        this.f = handler;
        this.h = bdp;
        this.i = new aki();
    }

    public final boolean v() {
        return true;
    }

    public final boolean w() {
        return this.k;
    }

    private final void B() {
        a(Collections.emptyList());
    }

    private final long A() {
        int i2 = this.r;
        if (i2 == -1 || i2 >= this.p.b()) {
            return Long.MAX_VALUE;
        }
        return this.p.a(this.r);
    }

    public final boolean handleMessage(Message message) {
        if (message.what == 0) {
            b((List) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    private final void b(List list) {
        this.g.a(list);
    }

    /* access modifiers changed from: protected */
    public final void r() {
        this.m = null;
        B();
        y();
    }

    /* access modifiers changed from: protected */
    public final void a(long j2, boolean z) {
        B();
        this.j = false;
        this.k = false;
        if (this.l != 0) {
            z();
            return;
        }
        x();
        this.n.c();
    }

    /* access modifiers changed from: protected */
    public final void a(akh[] akhArr, long j2) {
        akh akh = akhArr[0];
        this.m = akh;
        if (this.n == null) {
            this.n = this.h.a(akh);
        } else {
            this.l = 1;
        }
    }

    private final void x() {
        this.o = null;
        this.r = -1;
        bdr bdr = this.p;
        if (bdr != null) {
            bdr.e();
            this.p = null;
        }
        bdr bdr2 = this.q;
        if (bdr2 != null) {
            bdr2.e();
            this.q = null;
        }
    }

    private final void y() {
        x();
        this.n.d();
        this.n = null;
        this.l = 0;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aiz.a(aki, anj, boolean):int
     arg types: [aki, bdq, int]
     candidates:
      aiz.a(akh[], axx, long):void
      akx.a(akh[], axx, long):void
      aiz.a(aki, anj, boolean):int */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x007f, code lost:
        if (r9 != false) goto L_0x0081;
     */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x008e A[LOOP:1: B:37:0x008e->B:71:0x008e, LOOP_START, SYNTHETIC, Splitter:B:37:0x008e] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00ec A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(long r7, long r9) {
        /*
            r6 = this;
            boolean r9 = r6.k
            if (r9 != 0) goto L_0x00f4
            bdr r9 = r6.q
            if (r9 == 0) goto L_0x0009
            goto L_0x0018
        L_0x0009:
            bdm r9 = r6.n
            r9.a(r7)
            bdm r9 = r6.n     // Catch:{ bdn -> 0x00ee }
            java.lang.Object r9 = r9.b()     // Catch:{ bdn -> 0x00ee }
            bdr r9 = (defpackage.bdr) r9     // Catch:{ bdn -> 0x00ee }
            r6.q = r9     // Catch:{ bdn -> 0x00ee }
        L_0x0018:
            int r9 = r6.b
            r10 = 2
            if (r9 != r10) goto L_0x00ed
            bdr r9 = r6.p
            r0 = 0
            r1 = 1
            if (r9 != 0) goto L_0x0025
            r9 = 0
            goto L_0x003a
        L_0x0025:
            long r2 = r6.A()
            r9 = 0
        L_0x002a:
            int r4 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r4 > 0) goto L_0x003a
            int r9 = r6.r
            int r9 = r9 + r1
            r6.r = r9
            long r2 = r6.A()
            r9 = 1
            goto L_0x002a
        L_0x003a:
            bdr r2 = r6.q
            r3 = 0
            if (r2 == 0) goto L_0x007f
            boolean r2 = r2.c()
            if (r2 != 0) goto L_0x0062
            bdr r2 = r6.q
            long r4 = r2.b
            int r2 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r2 > 0) goto L_0x007f
            bdr r9 = r6.p
            if (r9 != 0) goto L_0x0052
            goto L_0x0055
        L_0x0052:
            r9.e()
        L_0x0055:
            bdr r9 = r6.q
            r6.p = r9
            r6.q = r3
            int r9 = r9.a(r7)
            r6.r = r9
            goto L_0x0081
        L_0x0062:
            if (r9 != 0) goto L_0x0081
            long r7 = r6.A()
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r9 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r9 != 0) goto L_0x008a
            int r7 = r6.l
            if (r7 == r10) goto L_0x007b
            r6.x()
            r6.k = r1
            goto L_0x008a
        L_0x007b:
            r6.z()
            goto L_0x008a
        L_0x007f:
            if (r9 == 0) goto L_0x008a
        L_0x0081:
            bdr r9 = r6.p
            java.util.List r7 = r9.b(r7)
            r6.a(r7)
        L_0x008a:
            int r7 = r6.l
            if (r7 == r10) goto L_0x00ec
        L_0x008e:
            boolean r7 = r6.j     // Catch:{ bdn -> 0x00e6 }
            if (r7 != 0) goto L_0x00e5
            bdq r7 = r6.o     // Catch:{ bdn -> 0x00e6 }
            if (r7 != 0) goto L_0x00a4
            bdm r7 = r6.n     // Catch:{ bdn -> 0x00e6 }
            java.lang.Object r7 = r7.a()     // Catch:{ bdn -> 0x00e6 }
            bdq r7 = (defpackage.bdq) r7     // Catch:{ bdn -> 0x00e6 }
            r6.o = r7     // Catch:{ bdn -> 0x00e6 }
            if (r7 == 0) goto L_0x00a3
            goto L_0x00a4
        L_0x00a3:
            return
        L_0x00a4:
            int r8 = r6.l     // Catch:{ bdn -> 0x00e6 }
            if (r8 == r1) goto L_0x00d8
            aki r8 = r6.i     // Catch:{ bdn -> 0x00e6 }
            int r7 = r6.a(r8, r7, r0)     // Catch:{ bdn -> 0x00e6 }
            r8 = -4
            if (r7 != r8) goto L_0x00d4
            bdq r7 = r6.o     // Catch:{ bdn -> 0x00e6 }
            boolean r7 = r7.c()     // Catch:{ bdn -> 0x00e6 }
            if (r7 != 0) goto L_0x00c7
            bdq r7 = r6.o     // Catch:{ bdn -> 0x00e6 }
            aki r8 = r6.i     // Catch:{ bdn -> 0x00e6 }
            akh r8 = r8.c     // Catch:{ bdn -> 0x00e6 }
            long r8 = r8.m     // Catch:{ bdn -> 0x00e6 }
            r7.f = r8     // Catch:{ bdn -> 0x00e6 }
            r7.g()     // Catch:{ bdn -> 0x00e6 }
            goto L_0x00ca
        L_0x00c7:
            r6.j = r1     // Catch:{ bdn -> 0x00e6 }
        L_0x00ca:
            bdm r7 = r6.n     // Catch:{ bdn -> 0x00e6 }
            bdq r8 = r6.o     // Catch:{ bdn -> 0x00e6 }
            r7.a(r8)     // Catch:{ bdn -> 0x00e6 }
            r6.o = r3     // Catch:{ bdn -> 0x00e6 }
            goto L_0x008e
        L_0x00d4:
            r8 = -3
            if (r7 != r8) goto L_0x008e
            return
        L_0x00d8:
            r8 = 4
            r7.a = r8     // Catch:{ bdn -> 0x00e6 }
            bdm r8 = r6.n     // Catch:{ bdn -> 0x00e6 }
            r8.a(r7)     // Catch:{ bdn -> 0x00e6 }
            r6.o = r3     // Catch:{ bdn -> 0x00e6 }
            r6.l = r10     // Catch:{ bdn -> 0x00e6 }
            return
        L_0x00e5:
            return
        L_0x00e6:
            r7 = move-exception
            ajh r7 = defpackage.ajh.a(r7)
            throw r7
        L_0x00ec:
            return
        L_0x00ed:
            return
        L_0x00ee:
            r7 = move-exception
            ajh r7 = defpackage.ajh.a(r7)
            throw r7
        L_0x00f4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bdt.a(long, long):void");
    }

    private final void z() {
        y();
        this.n = this.h.a(this.m);
    }

    public final int a(akh akh) {
        String str = akh.i;
        return ("text/vtt".equals(str) || "text/x-ssa".equals(str) || "application/ttml+xml".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-subrip".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/cea-608".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/cea-708".equals(str) || "application/dvbsubs".equals(str) || "application/pgs".equals(str)) ? a(akh.l) ? 4 : 2 : bkt.c(akh.i) ? 1 : 0;
    }

    private final void a(List list) {
        Handler handler = this.f;
        if (handler != null) {
            handler.obtainMessage(0, list).sendToTarget();
        } else {
            b(list);
        }
    }
}
