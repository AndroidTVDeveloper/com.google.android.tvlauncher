package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.locks.Lock;

/* renamed from: bqt  reason: default package */
/* compiled from: PG */
public final class bqt extends bos implements brm {
    public static /* synthetic */ int j;
    public final Lock b;
    public brn c = null;
    public final Looper d;
    public final Queue e = new LinkedList();
    public final Map f;
    public Set g = new HashSet();
    public Set h = null;
    public final bse i;
    private final btg k;
    private final int l;
    private final Context m;
    private volatile boolean n;
    private long o = 120000;
    private long p = 5000;
    private final bqs q;
    private final bnu r;
    private brl s;
    private final bsv t;
    private final Map u;
    private final brr v = new brr();
    private final ArrayList w;
    private Integer x = null;
    private final btf y = new bqr(this);
    private final cel z;

    public bqt(Context context, Lock lock, Looper looper, bsv bsv, bnu bnu, cel cel, Map map, List list, List list2, Map map2, ArrayList arrayList, byte b2, byte b3) {
        this.m = context;
        this.b = lock;
        this.k = new btg(looper, this.y);
        this.d = looper;
        this.q = new bqs(this, looper);
        this.r = bnu;
        this.l = -1;
        this.u = map;
        this.f = map2;
        this.w = arrayList;
        this.i = new bse();
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            boq boq = (boq) list.get(i2);
            btg btg = this.k;
            buh.a(boq);
            synchronized (btg.i) {
                if (btg.b.contains(boq)) {
                    String valueOf = String.valueOf(boq);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 62);
                    sb.append("registerConnectionCallbacks(): listener ");
                    sb.append(valueOf);
                    sb.append(" is already registered");
                    Log.w("GmsClientEvents", sb.toString());
                } else {
                    btg.b.add(boq);
                }
            }
            if (btg.a.e()) {
                Handler handler = btg.h;
                handler.sendMessage(handler.obtainMessage(1, boq));
            }
        }
        int size2 = list2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            bor bor = (bor) list2.get(i3);
            btg btg2 = this.k;
            buh.a(bor);
            synchronized (btg2.i) {
                if (btg2.d.contains(bor)) {
                    String valueOf2 = String.valueOf(bor);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 67);
                    sb2.append("registerConnectionFailedListener(): listener ");
                    sb2.append(valueOf2);
                    sb2.append(" is already registered");
                    Log.w("GmsClientEvents", sb2.toString());
                } else {
                    btg2.d.add(bor);
                }
            }
        }
        this.t = bsv;
        this.z = cel;
    }

    private static String b(int i2) {
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? "UNKNOWN" : "SIGN_IN_MODE_NONE" : "SIGN_IN_MODE_OPTIONAL" : "SIGN_IN_MODE_REQUIRED";
    }

    public final Looper a() {
        return this.d;
    }

    /* JADX WARN: Failed to insert an additional move for type inference into block B:1:0x0007 */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:97:0x0230 */
    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:89:0x01e4 */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:69:0x0174 */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:72:0x017b */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v1, resolved type: bqt} */
    /* JADX WARN: Type inference failed for: r15v0, types: [bqt] */
    /* JADX WARN: Type inference failed for: r15v2, types: [bqt] */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4, types: [bqt] */
    /* JADX WARN: Type inference failed for: r15v5, types: [byte] */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7, types: [bqt] */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b() {
        /*
            r19 = this;
            r15 = r19
            java.util.concurrent.locks.Lock r0 = r15.b
            r0.lock()
            int r0 = r15.l     // Catch:{ all -> 0x0236 }
            r1 = 2
            r2 = 0
            r3 = 1
            if (r0 >= 0) goto L_0x0032
            java.lang.Integer r0 = r15.x     // Catch:{ all -> 0x0236 }
            if (r0 != 0) goto L_0x0023
            java.util.Map r0 = r15.f     // Catch:{ all -> 0x0236 }
            java.util.Collection r0 = r0.values()     // Catch:{ all -> 0x0236 }
            int r0 = a(r0)     // Catch:{ all -> 0x0236 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0236 }
            r15.x = r0     // Catch:{ all -> 0x0236 }
            goto L_0x003f
        L_0x0023:
            int r0 = r0.intValue()     // Catch:{ all -> 0x0236 }
            if (r0 == r1) goto L_0x002a
            goto L_0x003f
        L_0x002a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0236 }
            java.lang.String r1 = "Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead."
            r0.<init>(r1)     // Catch:{ all -> 0x0236 }
            throw r0     // Catch:{ all -> 0x0236 }
        L_0x0032:
            java.lang.Integer r0 = r15.x     // Catch:{ all -> 0x0236 }
            if (r0 == 0) goto L_0x0038
            r0 = 1
            goto L_0x003a
        L_0x0038:
            r0 = 0
        L_0x003a:
            java.lang.String r4 = "Sign-in mode should have been set explicitly by auto-manage."
            defpackage.buh.a(r0, r4)     // Catch:{ all -> 0x0236 }
        L_0x003f:
            java.lang.Integer r0 = r15.x     // Catch:{ all -> 0x0236 }
            int r0 = r0.intValue()     // Catch:{ all -> 0x0236 }
            java.util.concurrent.locks.Lock r4 = r15.b     // Catch:{ all -> 0x0236 }
            r4.lock()     // Catch:{ all -> 0x0236 }
            r4 = 3
            if (r0 != r4) goto L_0x004f
        L_0x004d:
            r4 = 1
            goto L_0x0057
        L_0x004f:
            if (r0 == r3) goto L_0x004d
            if (r0 != r1) goto L_0x0056
            r4 = 1
            goto L_0x0057
        L_0x0056:
            r4 = 0
        L_0x0057:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x022f }
            r6 = 33
            r5.<init>(r6)     // Catch:{ all -> 0x022f }
            java.lang.String r6 = "Illegal sign-in mode: "
            r5.append(r6)     // Catch:{ all -> 0x022f }
            r5.append(r0)     // Catch:{ all -> 0x022f }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x022f }
            defpackage.buh.b(r4, r5)     // Catch:{ all -> 0x022f }
            java.lang.Integer r4 = r15.x     // Catch:{ all -> 0x022f }
            if (r4 != 0) goto L_0x0078
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x022f }
            r15.x = r0     // Catch:{ all -> 0x022f }
            goto L_0x007e
        L_0x0078:
            int r4 = r4.intValue()     // Catch:{ all -> 0x022f }
            if (r4 != r0) goto L_0x01ef
        L_0x007e:
            brn r0 = r15.c     // Catch:{ all -> 0x022f }
            if (r0 != 0) goto L_0x01e1
            java.util.Map r0 = r15.f     // Catch:{ all -> 0x022f }
            java.util.Collection r0 = r0.values()     // Catch:{ all -> 0x022f }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x022f }
        L_0x008c:
            boolean r4 = r0.hasNext()     // Catch:{ all -> 0x022f }
            if (r4 == 0) goto L_0x00a5
            java.lang.Object r4 = r0.next()     // Catch:{ all -> 0x022f }
            boj r4 = (defpackage.boj) r4     // Catch:{ all -> 0x022f }
            boolean r5 = r4.g()     // Catch:{ all -> 0x022f }
            if (r5 != 0) goto L_0x009f
            goto L_0x00a1
        L_0x009f:
            r2 = 1
        L_0x00a1:
            r4.k()     // Catch:{ all -> 0x022f }
            goto L_0x008c
        L_0x00a5:
            java.lang.Integer r0 = r15.x     // Catch:{ all -> 0x022f }
            int r0 = r0.intValue()     // Catch:{ all -> 0x022f }
            if (r0 == r3) goto L_0x01b6
            if (r0 == r1) goto L_0x00b1
            goto L_0x01b8
        L_0x00b1:
            if (r2 == 0) goto L_0x01b8
            android.content.Context r2 = r15.m     // Catch:{ all -> 0x022f }
            java.util.concurrent.locks.Lock r4 = r15.b     // Catch:{ all -> 0x022f }
            android.os.Looper r5 = r15.d     // Catch:{ all -> 0x022f }
            bnu r6 = r15.r     // Catch:{ all -> 0x022f }
            java.util.Map r0 = r15.f     // Catch:{ all -> 0x022f }
            bsv r9 = r15.t     // Catch:{ all -> 0x022f }
            java.util.Map r1 = r15.u     // Catch:{ all -> 0x022f }
            cel r10 = r15.z     // Catch:{ all -> 0x022f }
            java.util.ArrayList r7 = r15.w     // Catch:{ all -> 0x022f }
            cl r8 = new cl     // Catch:{ all -> 0x022f }
            r8.<init>()     // Catch:{ all -> 0x022f }
            cl r11 = new cl     // Catch:{ all -> 0x022f }
            r11.<init>()     // Catch:{ all -> 0x022f }
            java.util.Set r0 = r0.entrySet()     // Catch:{ all -> 0x022f }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x022f }
        L_0x00d7:
            boolean r12 = r0.hasNext()     // Catch:{ all -> 0x022f }
            if (r12 == 0) goto L_0x0106
            java.lang.Object r12 = r0.next()     // Catch:{ all -> 0x022f }
            java.util.Map$Entry r12 = (java.util.Map.Entry) r12     // Catch:{ all -> 0x022f }
            java.lang.Object r13 = r12.getValue()     // Catch:{ all -> 0x022f }
            boj r13 = (defpackage.boj) r13     // Catch:{ all -> 0x022f }
            r13.k()     // Catch:{ all -> 0x022f }
            boolean r14 = r13.g()     // Catch:{ all -> 0x022f }
            if (r14 != 0) goto L_0x00fc
            java.lang.Object r12 = r12.getKey()     // Catch:{ all -> 0x022f }
            bog r12 = (defpackage.bog) r12     // Catch:{ all -> 0x022f }
            r11.put(r12, r13)     // Catch:{ all -> 0x022f }
            goto L_0x00d7
        L_0x00fc:
            java.lang.Object r12 = r12.getKey()     // Catch:{ all -> 0x022f }
            bog r12 = (defpackage.bog) r12     // Catch:{ all -> 0x022f }
            r8.put(r12, r13)     // Catch:{ all -> 0x022f }
            goto L_0x00d7
        L_0x0106:
            boolean r0 = r8.isEmpty()     // Catch:{ all -> 0x022f }
            r0 = r0 ^ r3
            java.lang.String r3 = "CompositeGoogleApiClient should not be used without any APIs that require sign-in."
            defpackage.buh.a(r0, r3)     // Catch:{ all -> 0x022f }
            cl r13 = new cl     // Catch:{ all -> 0x022f }
            r13.<init>()     // Catch:{ all -> 0x022f }
            cl r14 = new cl     // Catch:{ all -> 0x022f }
            r14.<init>()     // Catch:{ all -> 0x022f }
            java.util.Set r0 = r1.keySet()     // Catch:{ all -> 0x022f }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x022f }
        L_0x0122:
            boolean r3 = r0.hasNext()     // Catch:{ all -> 0x022f }
            if (r3 != 0) goto L_0x0183
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x022f }
            r0.<init>()     // Catch:{ all -> 0x022f }
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ all -> 0x022f }
            r12.<init>()     // Catch:{ all -> 0x022f }
            java.util.Iterator r1 = r7.iterator()     // Catch:{ all -> 0x022f }
        L_0x0136:
            boolean r3 = r1.hasNext()     // Catch:{ all -> 0x022f }
            if (r3 == 0) goto L_0x0162
            java.lang.Object r3 = r1.next()     // Catch:{ all -> 0x022f }
            bpt r3 = (defpackage.bpt) r3     // Catch:{ all -> 0x022f }
            bok r7 = r3.a     // Catch:{ all -> 0x022f }
            boolean r7 = r13.containsKey(r7)     // Catch:{ all -> 0x022f }
            if (r7 != 0) goto L_0x015e
            bok r7 = r3.a     // Catch:{ all -> 0x022f }
            boolean r7 = r14.containsKey(r7)     // Catch:{ all -> 0x022f }
            if (r7 == 0) goto L_0x0156
            r12.add(r3)     // Catch:{ all -> 0x022f }
            goto L_0x0136
        L_0x0156:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x022f }
            java.lang.String r1 = "Each ClientCallbacks must have a corresponding API in the isOptionalMap"
            r0.<init>(r1)     // Catch:{ all -> 0x022f }
            throw r0     // Catch:{ all -> 0x022f }
        L_0x015e:
            r0.add(r3)     // Catch:{ all -> 0x022f }
            goto L_0x0136
        L_0x0162:
            bpx r7 = new bpx     // Catch:{ all -> 0x022f }
            r16 = 0
            r17 = 0
            r1 = r7
            r3 = r19
            r18 = r7
            r7 = r8
            r8 = r11
            r11 = r0
            r15 = r16
            r16 = r17
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)     // Catch:{ all -> 0x017e }
            r15 = r19
            r0 = r18
            r15.c = r0     // Catch:{ all -> 0x022f }
            goto L_0x01e1
        L_0x017e:
            r0 = move-exception
            r15 = r19
            goto L_0x0230
        L_0x0183:
            java.lang.Object r3 = r0.next()     // Catch:{ all -> 0x022f }
            bok r3 = (defpackage.bok) r3     // Catch:{ all -> 0x022f }
            bog r12 = r3.a()     // Catch:{ all -> 0x022f }
            boolean r16 = r8.containsKey(r12)     // Catch:{ all -> 0x022f }
            if (r16 == 0) goto L_0x019d
            java.lang.Object r12 = r1.get(r3)     // Catch:{ all -> 0x022f }
            java.lang.Boolean r12 = (java.lang.Boolean) r12     // Catch:{ all -> 0x022f }
            r13.put(r3, r12)     // Catch:{ all -> 0x022f }
            goto L_0x0122
        L_0x019d:
            boolean r12 = r11.containsKey(r12)     // Catch:{ all -> 0x022f }
            if (r12 == 0) goto L_0x01ae
            java.lang.Object r12 = r1.get(r3)     // Catch:{ all -> 0x022f }
            java.lang.Boolean r12 = (java.lang.Boolean) r12     // Catch:{ all -> 0x022f }
            r14.put(r3, r12)     // Catch:{ all -> 0x022f }
            goto L_0x0122
        L_0x01ae:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x022f }
            java.lang.String r1 = "Each API in the isOptionalMap must have a corresponding client in the clients map."
            r0.<init>(r1)     // Catch:{ all -> 0x022f }
            throw r0     // Catch:{ all -> 0x022f }
        L_0x01b6:
            if (r2 == 0) goto L_0x01d9
        L_0x01b8:
            bqx r0 = new bqx     // Catch:{ all -> 0x022f }
            android.content.Context r2 = r15.m     // Catch:{ all -> 0x022f }
            java.util.concurrent.locks.Lock r4 = r15.b     // Catch:{ all -> 0x022f }
            android.os.Looper r5 = r15.d     // Catch:{ all -> 0x022f }
            bnu r6 = r15.r     // Catch:{ all -> 0x022f }
            java.util.Map r7 = r15.f     // Catch:{ all -> 0x022f }
            bsv r8 = r15.t     // Catch:{ all -> 0x022f }
            java.util.Map r9 = r15.u     // Catch:{ all -> 0x022f }
            cel r10 = r15.z     // Catch:{ all -> 0x022f }
            java.util.ArrayList r11 = r15.w     // Catch:{ all -> 0x022f }
            r13 = 0
            r14 = 0
            r1 = r0
            r3 = r19
            r12 = r19
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)     // Catch:{ all -> 0x022f }
            r15.c = r0     // Catch:{ all -> 0x022f }
            goto L_0x01e1
        L_0x01d9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x022f }
            java.lang.String r1 = "SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead."
            r0.<init>(r1)     // Catch:{ all -> 0x022f }
            throw r0     // Catch:{ all -> 0x022f }
        L_0x01e1:
            r19.d()     // Catch:{ all -> 0x022f }
            java.util.concurrent.locks.Lock r0 = r15.b     // Catch:{ all -> 0x0236 }
            r0.unlock()     // Catch:{ all -> 0x0236 }
            java.util.concurrent.locks.Lock r0 = r15.b
            r0.unlock()
            return
        L_0x01ef:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x022f }
            java.lang.String r0 = b(r0)     // Catch:{ all -> 0x022f }
            java.lang.Integer r2 = r15.x     // Catch:{ all -> 0x022f }
            int r2 = r2.intValue()     // Catch:{ all -> 0x022f }
            java.lang.String r2 = b(r2)     // Catch:{ all -> 0x022f }
            java.lang.String r3 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x022f }
            int r3 = r3.length()     // Catch:{ all -> 0x022f }
            int r3 = r3 + 51
            java.lang.String r4 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x022f }
            int r4 = r4.length()     // Catch:{ all -> 0x022f }
            int r3 = r3 + r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x022f }
            r4.<init>(r3)     // Catch:{ all -> 0x022f }
            java.lang.String r3 = "Cannot use sign-in mode: "
            r4.append(r3)     // Catch:{ all -> 0x022f }
            r4.append(r0)     // Catch:{ all -> 0x022f }
            java.lang.String r0 = ". Mode was already set to "
            r4.append(r0)     // Catch:{ all -> 0x022f }
            r4.append(r2)     // Catch:{ all -> 0x022f }
            java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x022f }
            r1.<init>(r0)     // Catch:{ all -> 0x022f }
            throw r1     // Catch:{ all -> 0x022f }
        L_0x022f:
            r0 = move-exception
        L_0x0230:
            java.util.concurrent.locks.Lock r1 = r15.b     // Catch:{ all -> 0x0236 }
            r1.unlock()     // Catch:{ all -> 0x0236 }
            throw r0     // Catch:{ all -> 0x0236 }
        L_0x0236:
            r0 = move-exception
            java.util.concurrent.locks.Lock r1 = r15.b
            r1.unlock()
            goto L_0x023e
        L_0x023d:
            throw r0
        L_0x023e:
            goto L_0x023d
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bqt.b():void");
    }

    public final void d() {
        this.k.e = true;
        this.c.a();
    }

    public final void c() {
        Lock lock;
        boolean b2;
        this.b.lock();
        try {
            bse bse = this.i;
            for (BasePendingResult basePendingResult : (BasePendingResult[]) bse.c.toArray(bse.b)) {
                basePendingResult.a((bsd) null);
                synchronized (basePendingResult.c) {
                    if (((bos) basePendingResult.d.get()) == null || !basePendingResult.f) {
                        basePendingResult.a();
                    }
                    b2 = basePendingResult.b();
                }
                if (b2) {
                    bse.c.remove(basePendingResult);
                }
            }
            brn brn = this.c;
            if (brn != null) {
                brn.b();
            }
            brr brr = this.v;
            Iterator it = brr.a.iterator();
            if (!it.hasNext()) {
                brr.a.clear();
                for (bpn bpn : this.e) {
                    bpn.a((bsd) null);
                    bpn.a();
                }
                this.e.clear();
                if (this.c != null) {
                    f();
                    this.k.a();
                    lock = this.b;
                } else {
                    lock = this.b;
                }
                lock.unlock();
                return;
            }
            bru bru = (bru) it.next();
            throw null;
        } catch (Throwable th) {
            this.b.unlock();
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    public final String g() {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        printWriter.append((CharSequence) "").append((CharSequence) "mContext=").println(this.m);
        printWriter.append((CharSequence) "").append((CharSequence) "mResuming=").print(this.n);
        printWriter.append((CharSequence) " mWorkQueue.size()=").print(this.e.size());
        printWriter.append((CharSequence) " mUnconsumedApiCalls.size()=").println(this.i.c.size());
        brn brn = this.c;
        if (brn != null) {
            brn.a("", printWriter);
        }
        return stringWriter.toString();
    }

    public final bpn a(bpn bpn) {
        String str;
        Lock lock;
        buh.b(bpn.b != null, "This task can not be enqueued (it's probably a Batch or malformed)");
        boolean containsKey = this.f.containsKey(bpn.b);
        bok bok = bpn.a;
        if (bok == null) {
            str = "the API";
        } else {
            str = bok.a;
        }
        StringBuilder sb = new StringBuilder(str.length() + 65);
        sb.append("GoogleApiClient is not configured to use ");
        sb.append(str);
        sb.append(" required for this call.");
        buh.b(containsKey, sb.toString());
        this.b.lock();
        try {
            brn brn = this.c;
            if (brn == null) {
                this.e.add(bpn);
                lock = this.b;
            } else {
                bpn = brn.a(bpn);
                lock = this.b;
            }
            lock.unlock();
            return bpn;
        } catch (Throwable th) {
            this.b.unlock();
            throw th;
        }
    }

    public final void a(bno bno) {
        if (!bof.b(this.m, bno.b)) {
            f();
        }
        if (!this.n) {
            btg btg = this.k;
            buh.a(btg.h, "onConnectionFailure must only be called on the Handler thread");
            btg.h.removeMessages(1);
            synchronized (btg.i) {
                ArrayList arrayList = new ArrayList(btg.d);
                int i2 = btg.f.get();
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    bor bor = (bor) it.next();
                    if (btg.e && btg.f.get() == i2) {
                        if (btg.d.contains(bor)) {
                            bor.a(bno);
                        }
                    }
                }
            }
            this.k.a();
        }
    }

    public final void a(Bundle bundle) {
        String str;
        Lock lock;
        while (true) {
            boolean z2 = false;
            boolean z3 = true;
            if (!this.e.isEmpty()) {
                bpn bpn = (bpn) this.e.remove();
                if (bpn.b != null) {
                    z2 = true;
                }
                buh.b(z2, "This task can not be executed (it's probably a Batch or malformed)");
                boolean containsKey = this.f.containsKey(bpn.b);
                bok bok = bpn.a;
                if (bok == null) {
                    str = "the API";
                } else {
                    str = bok.a;
                }
                StringBuilder sb = new StringBuilder(str.length() + 65);
                sb.append("GoogleApiClient is not configured to use ");
                sb.append(str);
                sb.append(" required for this call.");
                buh.b(containsKey, sb.toString());
                this.b.lock();
                try {
                    if (this.c != null) {
                        if (!this.n) {
                            this.c.b(bpn);
                            lock = this.b;
                        } else {
                            this.e.add(bpn);
                            while (!this.e.isEmpty()) {
                                bpn bpn2 = (bpn) this.e.remove();
                                this.i.a(bpn2);
                                bpn2.b(Status.c);
                            }
                            lock = this.b;
                        }
                        lock.unlock();
                    } else {
                        throw new IllegalStateException("GoogleApiClient is not connected yet.");
                    }
                } catch (Throwable th) {
                    this.b.unlock();
                    throw th;
                }
            } else {
                btg btg = this.k;
                buh.a(btg.h, "onConnectionSuccess must only be called on the Handler thread");
                synchronized (btg.i) {
                    buh.a(!btg.g);
                    btg.h.removeMessages(1);
                    btg.g = true;
                    if (btg.c.size() != 0) {
                        z3 = false;
                    }
                    buh.a(z3);
                    ArrayList arrayList = new ArrayList(btg.b);
                    int i2 = btg.f.get();
                    Iterator it = arrayList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        boq boq = (boq) it.next();
                        if (btg.e) {
                            if (!btg.a.e() || btg.f.get() != i2) {
                                break;
                            } else if (!btg.c.contains(boq)) {
                                boq.a(bundle);
                            }
                        } else {
                            break;
                        }
                    }
                    btg.c.clear();
                    btg.g = false;
                }
                return;
            }
        }
    }

    public final void a(int i2) {
        if (i2 == 1 && !this.n) {
            this.n = true;
            if (this.s == null) {
                try {
                    Context applicationContext = this.m.getApplicationContext();
                    brk brk = new brk(this);
                    IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
                    intentFilter.addDataScheme("package");
                    brl brl = new brl(brk);
                    applicationContext.registerReceiver(brl, intentFilter);
                    brl.a = applicationContext;
                    if (!bof.a(applicationContext, "com.google.android.gms")) {
                        brk.a();
                        brl.a();
                        brl = null;
                    }
                    this.s = brl;
                } catch (SecurityException e2) {
                }
            }
            bqs bqs = this.q;
            bqs.sendMessageDelayed(bqs.obtainMessage(1), this.o);
            bqs bqs2 = this.q;
            bqs2.sendMessageDelayed(bqs2.obtainMessage(2), this.p);
        }
        for (BasePendingResult c2 : (BasePendingResult[]) this.i.c.toArray(bse.b)) {
            c2.c(bse.a);
        }
        btg btg = this.k;
        buh.a(btg.h, "onUnintentionalDisconnection must only be called on the Handler thread");
        btg.h.removeMessages(1);
        synchronized (btg.i) {
            btg.g = true;
            ArrayList arrayList = new ArrayList(btg.b);
            int i3 = btg.f.get();
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                boq boq = (boq) it.next();
                if (btg.e) {
                    if (btg.f.get() != i3) {
                        break;
                    } else if (btg.b.contains(boq)) {
                        boq.a(i2);
                    }
                } else {
                    break;
                }
            }
            btg.c.clear();
            btg.g = false;
        }
        this.k.a();
        if (i2 == 2) {
            d();
        }
    }

    public final void e() {
        this.b.lock();
        try {
            if (this.n) {
                d();
            }
        } finally {
            this.b.unlock();
        }
    }

    public static int a(Iterable iterable) {
        Iterator it = iterable.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            boj boj = (boj) it.next();
            if (boj.g()) {
                z2 = true;
            }
            boj.k();
        }
        if (!z2) {
            return 3;
        }
        return 1;
    }

    /* access modifiers changed from: package-private */
    public final boolean f() {
        boolean z2 = false;
        if (this.n) {
            this.n = false;
            this.q.removeMessages(2);
            z2 = true;
            this.q.removeMessages(1);
            brl brl = this.s;
            if (brl != null) {
                brl.a();
                this.s = null;
            }
        }
        return z2;
    }
}
