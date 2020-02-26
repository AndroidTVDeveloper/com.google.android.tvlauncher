package p000;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.Collections;
import java.util.List;

/* renamed from: bdt */
/* compiled from: PG */
public final class bdt extends aiz implements Handler.Callback {

    /* renamed from: f */
    private final Handler f3426f;

    /* renamed from: g */
    private final bds f3427g;

    /* renamed from: h */
    private final bdp f3428h;

    /* renamed from: i */
    private final aki f3429i;

    /* renamed from: j */
    private boolean f3430j;

    /* renamed from: k */
    private boolean f3431k;

    /* renamed from: l */
    private int f3432l;

    /* renamed from: m */
    private akh f3433m;

    /* renamed from: n */
    private bdm f3434n;

    /* renamed from: o */
    private bdq f3435o;

    /* renamed from: p */
    private bdr f3436p;

    /* renamed from: q */
    private bdr f3437q;

    /* renamed from: r */
    private int f3438r;

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
        bdp bdp = bdp.f3422a;
        this.f3427g = (bds) bks.m3507a(bds);
        if (looper != null) {
            handler = blm.m3634a(looper, (Handler.Callback) this);
        } else {
            handler = null;
        }
        this.f3426f = handler;
        this.f3428h = bdp;
        this.f3429i = new aki();
    }

    /* renamed from: v */
    public final boolean mo485v() {
        return true;
    }

    /* renamed from: w */
    public final boolean mo486w() {
        return this.f3431k;
    }

    /* renamed from: B */
    private final void m2915B() {
        m2916a(Collections.emptyList());
    }

    /* renamed from: A */
    private final long m2914A() {
        int i = this.f3438r;
        if (i == -1 || i >= this.f3436p.mo1782b()) {
            return Long.MAX_VALUE;
        }
        return this.f3436p.mo1781a(this.f3438r);
    }

    public final boolean handleMessage(Message message) {
        if (message.what == 0) {
            m2917b((List) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    /* renamed from: b */
    private final void m2917b(List list) {
        this.f3427g.mo503a(list);
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final void mo370r() {
        this.f3433m = null;
        m2915B();
        m2919y();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo349a(long j, boolean z) {
        m2915B();
        this.f3430j = false;
        this.f3431k = false;
        if (this.f3432l != 0) {
            m2920z();
            return;
        }
        m2918x();
        this.f3434n.mo1147c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo352a(akh[] akhArr, long j) {
        akh akh = akhArr[0];
        this.f3433m = akh;
        if (this.f3434n == null) {
            this.f3434n = this.f3428h.mo1784a(akh);
        } else {
            this.f3432l = 1;
        }
    }

    /* renamed from: x */
    private final void m2918x() {
        this.f3435o = null;
        this.f3438r = -1;
        bdr bdr = this.f3436p;
        if (bdr != null) {
            bdr.mo1153e();
            this.f3436p = null;
        }
        bdr bdr2 = this.f3437q;
        if (bdr2 != null) {
            bdr2.mo1153e();
            this.f3437q = null;
        }
    }

    /* renamed from: y */
    private final void m2919y() {
        m2918x();
        this.f3434n.mo1148d();
        this.f3434n = null;
        this.f3432l = 0;
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
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo484a(long r7, long r9) {
        /*
            r6 = this;
            boolean r9 = r6.f3431k
            if (r9 != 0) goto L_0x00f4
            bdr r9 = r6.f3437q
            if (r9 == 0) goto L_0x0009
            goto L_0x0018
        L_0x0009:
            bdm r9 = r6.f3434n
            r9.mo1156a(r7)
            bdm r9 = r6.f3434n     // Catch:{ bdn -> 0x00ee }
            java.lang.Object r9 = r9.mo1146b()     // Catch:{ bdn -> 0x00ee }
            bdr r9 = (p000.bdr) r9     // Catch:{ bdn -> 0x00ee }
            r6.f3437q = r9     // Catch:{ bdn -> 0x00ee }
        L_0x0018:
            int r9 = r6.f421b
            r10 = 2
            if (r9 != r10) goto L_0x00ed
            bdr r9 = r6.f3436p
            r0 = 0
            r1 = 1
            if (r9 != 0) goto L_0x0025
            r9 = 0
            goto L_0x003a
        L_0x0025:
            long r2 = r6.m2914A()
            r9 = 0
        L_0x002a:
            int r4 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r4 > 0) goto L_0x003a
            int r9 = r6.f3438r
            int r9 = r9 + r1
            r6.f3438r = r9
            long r2 = r6.m2914A()
            r9 = 1
            goto L_0x002a
        L_0x003a:
            bdr r2 = r6.f3437q
            r3 = 0
            if (r2 == 0) goto L_0x007f
            boolean r2 = r2.mo1141c()
            if (r2 != 0) goto L_0x0062
            bdr r2 = r6.f3437q
            long r4 = r2.f1429b
            int r2 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r2 > 0) goto L_0x007f
            bdr r9 = r6.f3436p
            if (r9 != 0) goto L_0x0052
            goto L_0x0055
        L_0x0052:
            r9.mo1153e()
        L_0x0055:
            bdr r9 = r6.f3437q
            r6.f3436p = r9
            r6.f3437q = r3
            int r9 = r9.mo1780a(r7)
            r6.f3438r = r9
            goto L_0x0081
        L_0x0062:
            if (r9 != 0) goto L_0x0081
            long r7 = r6.m2914A()
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r9 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r9 != 0) goto L_0x008a
            int r7 = r6.f3432l
            if (r7 == r10) goto L_0x007b
            r6.m2918x()
            r6.f3431k = r1
            goto L_0x008a
        L_0x007b:
            r6.m2920z()
            goto L_0x008a
        L_0x007f:
            if (r9 == 0) goto L_0x008a
        L_0x0081:
            bdr r9 = r6.f3436p
            java.util.List r7 = r9.mo1783b(r7)
            r6.m2916a(r7)
        L_0x008a:
            int r7 = r6.f3432l
            if (r7 == r10) goto L_0x00ec
        L_0x008e:
            boolean r7 = r6.f3430j     // Catch:{ bdn -> 0x00e6 }
            if (r7 != 0) goto L_0x00e5
            bdq r7 = r6.f3435o     // Catch:{ bdn -> 0x00e6 }
            if (r7 != 0) goto L_0x00a4
            bdm r7 = r6.f3434n     // Catch:{ bdn -> 0x00e6 }
            java.lang.Object r7 = r7.mo1144a()     // Catch:{ bdn -> 0x00e6 }
            bdq r7 = (p000.bdq) r7     // Catch:{ bdn -> 0x00e6 }
            r6.f3435o = r7     // Catch:{ bdn -> 0x00e6 }
            if (r7 == 0) goto L_0x00a3
            goto L_0x00a4
        L_0x00a3:
            return
        L_0x00a4:
            int r8 = r6.f3432l     // Catch:{ bdn -> 0x00e6 }
            if (r8 == r1) goto L_0x00d8
            aki r8 = r6.f3429i     // Catch:{ bdn -> 0x00e6 }
            int r7 = r6.mo345a(r8, r7, r0)     // Catch:{ bdn -> 0x00e6 }
            r8 = -4
            if (r7 != r8) goto L_0x00d4
            bdq r7 = r6.f3435o     // Catch:{ bdn -> 0x00e6 }
            boolean r7 = r7.mo1141c()     // Catch:{ bdn -> 0x00e6 }
            if (r7 != 0) goto L_0x00c7
            bdq r7 = r6.f3435o     // Catch:{ bdn -> 0x00e6 }
            aki r8 = r6.f3429i     // Catch:{ bdn -> 0x00e6 }
            akh r8 = r8.f576c     // Catch:{ bdn -> 0x00e6 }
            long r8 = r8.f560m     // Catch:{ bdn -> 0x00e6 }
            r7.f3423f = r8     // Catch:{ bdn -> 0x00e6 }
            r7.mo1152g()     // Catch:{ bdn -> 0x00e6 }
            goto L_0x00ca
        L_0x00c7:
            r6.f3430j = r1     // Catch:{ bdn -> 0x00e6 }
        L_0x00ca:
            bdm r7 = r6.f3434n     // Catch:{ bdn -> 0x00e6 }
            bdq r8 = r6.f3435o     // Catch:{ bdn -> 0x00e6 }
            r7.mo1145a(r8)     // Catch:{ bdn -> 0x00e6 }
            r6.f3435o = r3     // Catch:{ bdn -> 0x00e6 }
            goto L_0x008e
        L_0x00d4:
            r8 = -3
            if (r7 != r8) goto L_0x008e
            return
        L_0x00d8:
            r8 = 4
            r7.f1407a = r8     // Catch:{ bdn -> 0x00e6 }
            bdm r8 = r6.f3434n     // Catch:{ bdn -> 0x00e6 }
            r8.mo1145a(r7)     // Catch:{ bdn -> 0x00e6 }
            r6.f3435o = r3     // Catch:{ bdn -> 0x00e6 }
            r6.f3432l = r10     // Catch:{ bdn -> 0x00e6 }
            return
        L_0x00e5:
            return
        L_0x00e6:
            r7 = move-exception
            ajh r7 = p000.ajh.m642a(r7)
            throw r7
        L_0x00ec:
            return
        L_0x00ed:
            return
        L_0x00ee:
            r7 = move-exception
            ajh r7 = p000.ajh.m642a(r7)
            throw r7
        L_0x00f4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.bdt.mo484a(long, long):void");
    }

    /* renamed from: z */
    private final void m2920z() {
        m2919y();
        this.f3434n = this.f3428h.mo1784a(this.f3433m);
    }

    /* renamed from: a */
    public final int mo487a(akh akh) {
        String str = akh.f556i;
        return ("text/vtt".equals(str) || "text/x-ssa".equals(str) || "application/ttml+xml".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-subrip".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/cea-608".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/cea-708".equals(str) || "application/dvbsubs".equals(str) || "application/pgs".equals(str)) ? m599a(akh.f559l) ? 4 : 2 : bkt.m3517c(akh.f556i) ? 1 : 0;
    }

    /* renamed from: a */
    private final void m2916a(List list) {
        Handler handler = this.f3426f;
        if (handler != null) {
            handler.obtainMessage(0, list).sendToTarget();
        } else {
            m2917b(list);
        }
    }
}
