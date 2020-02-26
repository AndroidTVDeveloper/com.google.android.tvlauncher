package p000;

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

/* renamed from: bqt */
/* compiled from: PG */
public final class bqt extends bos implements brm {

    /* renamed from: j */
    public static /* synthetic */ int f4617j;

    /* renamed from: b */
    public final Lock f4618b;

    /* renamed from: c */
    public brn f4619c = null;

    /* renamed from: d */
    public final Looper f4620d;

    /* renamed from: e */
    public final Queue f4621e = new LinkedList();

    /* renamed from: f */
    public final Map f4622f;

    /* renamed from: g */
    public Set f4623g = new HashSet();

    /* renamed from: h */
    public Set f4624h = null;

    /* renamed from: i */
    public final bse f4625i;

    /* renamed from: k */
    private final btg f4626k;

    /* renamed from: l */
    private final int f4627l;

    /* renamed from: m */
    private final Context f4628m;

    /* renamed from: n */
    private volatile boolean f4629n;

    /* renamed from: o */
    private long f4630o = 120000;

    /* renamed from: p */
    private long f4631p = 5000;

    /* renamed from: q */
    private final bqs f4632q;

    /* renamed from: r */
    private final bnu f4633r;

    /* renamed from: s */
    private brl f4634s;

    /* renamed from: t */
    private final bsv f4635t;

    /* renamed from: u */
    private final Map f4636u;

    /* renamed from: v */
    private final brr f4637v = new brr();

    /* renamed from: w */
    private final ArrayList f4638w;

    /* renamed from: x */
    private Integer f4639x = null;

    /* renamed from: y */
    private final btf f4640y = new bqr(this);

    /* renamed from: z */
    private final cel f4641z;

    public bqt(Context context, Lock lock, Looper looper, bsv bsv, bnu bnu, cel cel, Map map, List list, List list2, Map map2, ArrayList arrayList, byte b, byte b2) {
        this.f4628m = context;
        this.f4618b = lock;
        this.f4626k = new btg(looper, this.f4640y);
        this.f4620d = looper;
        this.f4632q = new bqs(this, looper);
        this.f4633r = bnu;
        this.f4627l = -1;
        this.f4636u = map;
        this.f4622f = map2;
        this.f4638w = arrayList;
        this.f4625i = new bse();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            boq boq = (boq) list.get(i);
            btg btg = this.f4626k;
            buh.m4199a(boq);
            synchronized (btg.f4805i) {
                if (btg.f4798b.contains(boq)) {
                    String valueOf = String.valueOf(boq);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 62);
                    sb.append("registerConnectionCallbacks(): listener ");
                    sb.append(valueOf);
                    sb.append(" is already registered");
                    Log.w("GmsClientEvents", sb.toString());
                } else {
                    btg.f4798b.add(boq);
                }
            }
            if (btg.f4797a.mo2325e()) {
                Handler handler = btg.f4804h;
                handler.sendMessage(handler.obtainMessage(1, boq));
            }
        }
        int size2 = list2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            bor bor = (bor) list2.get(i2);
            btg btg2 = this.f4626k;
            buh.m4199a(bor);
            synchronized (btg2.f4805i) {
                if (btg2.f4800d.contains(bor)) {
                    String valueOf2 = String.valueOf(bor);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 67);
                    sb2.append("registerConnectionFailedListener(): listener ");
                    sb2.append(valueOf2);
                    sb2.append(" is already registered");
                    Log.w("GmsClientEvents", sb2.toString());
                } else {
                    btg2.f4800d.add(bor);
                }
            }
        }
        this.f4635t = bsv;
        this.f4641z = cel;
    }

    /* renamed from: b */
    private static String m4005b(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "UNKNOWN" : "SIGN_IN_MODE_NONE" : "SIGN_IN_MODE_OPTIONAL" : "SIGN_IN_MODE_REQUIRED";
    }

    /* renamed from: a */
    public final Looper mo2244a() {
        return this.f4620d;
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
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo2246b() {
        /*
            r19 = this;
            r15 = r19
            java.util.concurrent.locks.Lock r0 = r15.f4618b
            r0.lock()
            int r0 = r15.f4627l     // Catch:{ all -> 0x0236 }
            r1 = 2
            r2 = 0
            r3 = 1
            if (r0 >= 0) goto L_0x0032
            java.lang.Integer r0 = r15.f4639x     // Catch:{ all -> 0x0236 }
            if (r0 != 0) goto L_0x0023
            java.util.Map r0 = r15.f4622f     // Catch:{ all -> 0x0236 }
            java.util.Collection r0 = r0.values()     // Catch:{ all -> 0x0236 }
            int r0 = m4004a(r0)     // Catch:{ all -> 0x0236 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0236 }
            r15.f4639x = r0     // Catch:{ all -> 0x0236 }
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
            java.lang.Integer r0 = r15.f4639x     // Catch:{ all -> 0x0236 }
            if (r0 == 0) goto L_0x0038
            r0 = 1
            goto L_0x003a
        L_0x0038:
            r0 = 0
        L_0x003a:
            java.lang.String r4 = "Sign-in mode should have been set explicitly by auto-manage."
            p000.buh.m4206a(r0, r4)     // Catch:{ all -> 0x0236 }
        L_0x003f:
            java.lang.Integer r0 = r15.f4639x     // Catch:{ all -> 0x0236 }
            int r0 = r0.intValue()     // Catch:{ all -> 0x0236 }
            java.util.concurrent.locks.Lock r4 = r15.f4618b     // Catch:{ all -> 0x0236 }
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
            p000.buh.m4213b(r4, r5)     // Catch:{ all -> 0x022f }
            java.lang.Integer r4 = r15.f4639x     // Catch:{ all -> 0x022f }
            if (r4 != 0) goto L_0x0078
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x022f }
            r15.f4639x = r0     // Catch:{ all -> 0x022f }
            goto L_0x007e
        L_0x0078:
            int r4 = r4.intValue()     // Catch:{ all -> 0x022f }
            if (r4 != r0) goto L_0x01ef
        L_0x007e:
            brn r0 = r15.f4619c     // Catch:{ all -> 0x022f }
            if (r0 != 0) goto L_0x01e1
            java.util.Map r0 = r15.f4622f     // Catch:{ all -> 0x022f }
            java.util.Collection r0 = r0.values()     // Catch:{ all -> 0x022f }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x022f }
        L_0x008c:
            boolean r4 = r0.hasNext()     // Catch:{ all -> 0x022f }
            if (r4 == 0) goto L_0x00a5
            java.lang.Object r4 = r0.next()     // Catch:{ all -> 0x022f }
            boj r4 = (p000.boj) r4     // Catch:{ all -> 0x022f }
            boolean r5 = r4.mo2231g()     // Catch:{ all -> 0x022f }
            if (r5 != 0) goto L_0x009f
            goto L_0x00a1
        L_0x009f:
            r2 = 1
        L_0x00a1:
            r4.mo2235k()     // Catch:{ all -> 0x022f }
            goto L_0x008c
        L_0x00a5:
            java.lang.Integer r0 = r15.f4639x     // Catch:{ all -> 0x022f }
            int r0 = r0.intValue()     // Catch:{ all -> 0x022f }
            if (r0 == r3) goto L_0x01b6
            if (r0 == r1) goto L_0x00b1
            goto L_0x01b8
        L_0x00b1:
            if (r2 == 0) goto L_0x01b8
            android.content.Context r2 = r15.f4628m     // Catch:{ all -> 0x022f }
            java.util.concurrent.locks.Lock r4 = r15.f4618b     // Catch:{ all -> 0x022f }
            android.os.Looper r5 = r15.f4620d     // Catch:{ all -> 0x022f }
            bnu r6 = r15.f4633r     // Catch:{ all -> 0x022f }
            java.util.Map r0 = r15.f4622f     // Catch:{ all -> 0x022f }
            bsv r9 = r15.f4635t     // Catch:{ all -> 0x022f }
            java.util.Map r1 = r15.f4636u     // Catch:{ all -> 0x022f }
            cel r10 = r15.f4641z     // Catch:{ all -> 0x022f }
            java.util.ArrayList r7 = r15.f4638w     // Catch:{ all -> 0x022f }
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
            boj r13 = (p000.boj) r13     // Catch:{ all -> 0x022f }
            r13.mo2235k()     // Catch:{ all -> 0x022f }
            boolean r14 = r13.mo2231g()     // Catch:{ all -> 0x022f }
            if (r14 != 0) goto L_0x00fc
            java.lang.Object r12 = r12.getKey()     // Catch:{ all -> 0x022f }
            bog r12 = (p000.bog) r12     // Catch:{ all -> 0x022f }
            r11.put(r12, r13)     // Catch:{ all -> 0x022f }
            goto L_0x00d7
        L_0x00fc:
            java.lang.Object r12 = r12.getKey()     // Catch:{ all -> 0x022f }
            bog r12 = (p000.bog) r12     // Catch:{ all -> 0x022f }
            r8.put(r12, r13)     // Catch:{ all -> 0x022f }
            goto L_0x00d7
        L_0x0106:
            boolean r0 = r8.isEmpty()     // Catch:{ all -> 0x022f }
            r0 = r0 ^ r3
            java.lang.String r3 = "CompositeGoogleApiClient should not be used without any APIs that require sign-in."
            p000.buh.m4206a(r0, r3)     // Catch:{ all -> 0x022f }
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
            bpt r3 = (p000.bpt) r3     // Catch:{ all -> 0x022f }
            bok r7 = r3.f4552a     // Catch:{ all -> 0x022f }
            boolean r7 = r13.containsKey(r7)     // Catch:{ all -> 0x022f }
            if (r7 != 0) goto L_0x015e
            bok r7 = r3.f4552a     // Catch:{ all -> 0x022f }
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
            r15.f4619c = r0     // Catch:{ all -> 0x022f }
            goto L_0x01e1
        L_0x017e:
            r0 = move-exception
            r15 = r19
            goto L_0x0230
        L_0x0183:
            java.lang.Object r3 = r0.next()     // Catch:{ all -> 0x022f }
            bok r3 = (p000.bok) r3     // Catch:{ all -> 0x022f }
            bog r12 = r3.mo2237a()     // Catch:{ all -> 0x022f }
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
            android.content.Context r2 = r15.f4628m     // Catch:{ all -> 0x022f }
            java.util.concurrent.locks.Lock r4 = r15.f4618b     // Catch:{ all -> 0x022f }
            android.os.Looper r5 = r15.f4620d     // Catch:{ all -> 0x022f }
            bnu r6 = r15.f4633r     // Catch:{ all -> 0x022f }
            java.util.Map r7 = r15.f4622f     // Catch:{ all -> 0x022f }
            bsv r8 = r15.f4635t     // Catch:{ all -> 0x022f }
            java.util.Map r9 = r15.f4636u     // Catch:{ all -> 0x022f }
            cel r10 = r15.f4641z     // Catch:{ all -> 0x022f }
            java.util.ArrayList r11 = r15.f4638w     // Catch:{ all -> 0x022f }
            r13 = 0
            r14 = 0
            r1 = r0
            r3 = r19
            r12 = r19
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)     // Catch:{ all -> 0x022f }
            r15.f4619c = r0     // Catch:{ all -> 0x022f }
            goto L_0x01e1
        L_0x01d9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x022f }
            java.lang.String r1 = "SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead."
            r0.<init>(r1)     // Catch:{ all -> 0x022f }
            throw r0     // Catch:{ all -> 0x022f }
        L_0x01e1:
            r19.mo2327d()     // Catch:{ all -> 0x022f }
            java.util.concurrent.locks.Lock r0 = r15.f4618b     // Catch:{ all -> 0x0236 }
            r0.unlock()     // Catch:{ all -> 0x0236 }
            java.util.concurrent.locks.Lock r0 = r15.f4618b
            r0.unlock()
            return
        L_0x01ef:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x022f }
            java.lang.String r0 = m4005b(r0)     // Catch:{ all -> 0x022f }
            java.lang.Integer r2 = r15.f4639x     // Catch:{ all -> 0x022f }
            int r2 = r2.intValue()     // Catch:{ all -> 0x022f }
            java.lang.String r2 = m4005b(r2)     // Catch:{ all -> 0x022f }
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
            java.util.concurrent.locks.Lock r1 = r15.f4618b     // Catch:{ all -> 0x0236 }
            r1.unlock()     // Catch:{ all -> 0x0236 }
            throw r0     // Catch:{ all -> 0x0236 }
        L_0x0236:
            r0 = move-exception
            java.util.concurrent.locks.Lock r1 = r15.f4618b
            r1.unlock()
            goto L_0x023e
        L_0x023d:
            throw r0
        L_0x023e:
            goto L_0x023d
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.bqt.mo2246b():void");
    }

    /* renamed from: d */
    public final void mo2327d() {
        this.f4626k.f4801e = true;
        this.f4619c.mo2295a();
    }

    /* renamed from: c */
    public final void mo2247c() {
        Lock lock;
        boolean b;
        this.f4618b.lock();
        try {
            bse bse = this.f4625i;
            for (BasePendingResult basePendingResult : (BasePendingResult[]) bse.f4724c.toArray(bse.f4723b)) {
                basePendingResult.mo3196a((bsd) null);
                synchronized (basePendingResult.f6272c) {
                    if (((bos) basePendingResult.f6273d.get()) == null || !basePendingResult.f6275f) {
                        basePendingResult.mo3194a();
                    }
                    b = basePendingResult.mo3197b();
                }
                if (b) {
                    bse.f4724c.remove(basePendingResult);
                }
            }
            brn brn = this.f4619c;
            if (brn != null) {
                brn.mo2299b();
            }
            brr brr = this.f4637v;
            Iterator it = brr.f4705a.iterator();
            if (!it.hasNext()) {
                brr.f4705a.clear();
                for (bpn bpn : this.f4621e) {
                    bpn.mo3196a((bsd) null);
                    bpn.mo3194a();
                }
                this.f4621e.clear();
                if (this.f4619c != null) {
                    mo2329f();
                    this.f4626k.mo2419a();
                    lock = this.f4618b;
                } else {
                    lock = this.f4618b;
                }
                lock.unlock();
                return;
            }
            bru bru = (bru) it.next();
            throw null;
        } catch (Throwable th) {
            this.f4618b.unlock();
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final String mo2330g() {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        printWriter.append((CharSequence) "").append((CharSequence) "mContext=").println(this.f4628m);
        printWriter.append((CharSequence) "").append((CharSequence) "mResuming=").print(this.f4629n);
        printWriter.append((CharSequence) " mWorkQueue.size()=").print(this.f4621e.size());
        printWriter.append((CharSequence) " mUnconsumedApiCalls.size()=").println(this.f4625i.f4724c.size());
        brn brn = this.f4619c;
        if (brn != null) {
            brn.mo2297a("", printWriter);
        }
        return stringWriter.toString();
    }

    /* renamed from: a */
    public final bpn mo2245a(bpn bpn) {
        String str;
        Lock lock;
        buh.m4213b(bpn.f4550b != null, "This task can not be enqueued (it's probably a Batch or malformed)");
        boolean containsKey = this.f4622f.containsKey(bpn.f4550b);
        bok bok = bpn.f4549a;
        if (bok == null) {
            str = "the API";
        } else {
            str = bok.f4507a;
        }
        StringBuilder sb = new StringBuilder(str.length() + 65);
        sb.append("GoogleApiClient is not configured to use ");
        sb.append(str);
        sb.append(" required for this call.");
        buh.m4213b(containsKey, sb.toString());
        this.f4618b.lock();
        try {
            brn brn = this.f4619c;
            if (brn == null) {
                this.f4621e.add(bpn);
                lock = this.f4618b;
            } else {
                bpn = brn.mo2294a(bpn);
                lock = this.f4618b;
            }
            lock.unlock();
            return bpn;
        } catch (Throwable th) {
            this.f4618b.unlock();
            throw th;
        }
    }

    /* renamed from: a */
    public final void mo2293a(bno bno) {
        if (!bof.m3826b(this.f4628m, bno.f4482b)) {
            mo2329f();
        }
        if (!this.f4629n) {
            btg btg = this.f4626k;
            buh.m4203a(btg.f4804h, "onConnectionFailure must only be called on the Handler thread");
            btg.f4804h.removeMessages(1);
            synchronized (btg.f4805i) {
                ArrayList arrayList = new ArrayList(btg.f4800d);
                int i = btg.f4802f.get();
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    bor bor = (bor) it.next();
                    if (btg.f4801e && btg.f4802f.get() == i) {
                        if (btg.f4800d.contains(bor)) {
                            bor.mo2290a(bno);
                        }
                    }
                }
            }
            this.f4626k.mo2419a();
        }
    }

    /* renamed from: a */
    public final void mo2292a(Bundle bundle) {
        String str;
        Lock lock;
        while (true) {
            boolean z = false;
            boolean z2 = true;
            if (!this.f4621e.isEmpty()) {
                bpn bpn = (bpn) this.f4621e.remove();
                if (bpn.f4550b != null) {
                    z = true;
                }
                buh.m4213b(z, "This task can not be executed (it's probably a Batch or malformed)");
                boolean containsKey = this.f4622f.containsKey(bpn.f4550b);
                bok bok = bpn.f4549a;
                if (bok == null) {
                    str = "the API";
                } else {
                    str = bok.f4507a;
                }
                StringBuilder sb = new StringBuilder(str.length() + 65);
                sb.append("GoogleApiClient is not configured to use ");
                sb.append(str);
                sb.append(" required for this call.");
                buh.m4213b(containsKey, sb.toString());
                this.f4618b.lock();
                try {
                    if (this.f4619c != null) {
                        if (!this.f4629n) {
                            this.f4619c.mo2298b(bpn);
                            lock = this.f4618b;
                        } else {
                            this.f4621e.add(bpn);
                            while (!this.f4621e.isEmpty()) {
                                bpn bpn2 = (bpn) this.f4621e.remove();
                                this.f4625i.mo2368a(bpn2);
                                bpn2.mo2282b(Status.f6262c);
                            }
                            lock = this.f4618b;
                        }
                        lock.unlock();
                    } else {
                        throw new IllegalStateException("GoogleApiClient is not connected yet.");
                    }
                } catch (Throwable th) {
                    this.f4618b.unlock();
                    throw th;
                }
            } else {
                btg btg = this.f4626k;
                buh.m4203a(btg.f4804h, "onConnectionSuccess must only be called on the Handler thread");
                synchronized (btg.f4805i) {
                    buh.m4205a(!btg.f4803g);
                    btg.f4804h.removeMessages(1);
                    btg.f4803g = true;
                    if (btg.f4799c.size() != 0) {
                        z2 = false;
                    }
                    buh.m4205a(z2);
                    ArrayList arrayList = new ArrayList(btg.f4798b);
                    int i = btg.f4802f.get();
                    Iterator it = arrayList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        boq boq = (boq) it.next();
                        if (btg.f4801e) {
                            if (!btg.f4797a.mo2325e() || btg.f4802f.get() != i) {
                                break;
                            } else if (!btg.f4799c.contains(boq)) {
                                boq.mo2289a(bundle);
                            }
                        } else {
                            break;
                        }
                    }
                    btg.f4799c.clear();
                    btg.f4803g = false;
                }
                return;
            }
        }
    }

    /* renamed from: a */
    public final void mo2291a(int i) {
        if (i == 1 && !this.f4629n) {
            this.f4629n = true;
            if (this.f4634s == null) {
                try {
                    Context applicationContext = this.f4628m.getApplicationContext();
                    brk brk = new brk(this);
                    IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
                    intentFilter.addDataScheme("package");
                    brl brl = new brl(brk);
                    applicationContext.registerReceiver(brl, intentFilter);
                    brl.f4703a = applicationContext;
                    if (!bof.m3824a(applicationContext, "com.google.android.gms")) {
                        brk.mo2357a();
                        brl.mo2358a();
                        brl = null;
                    }
                    this.f4634s = brl;
                } catch (SecurityException e) {
                }
            }
            bqs bqs = this.f4632q;
            bqs.sendMessageDelayed(bqs.obtainMessage(1), this.f4630o);
            bqs bqs2 = this.f4632q;
            bqs2.sendMessageDelayed(bqs2.obtainMessage(2), this.f4631p);
        }
        for (BasePendingResult c : (BasePendingResult[]) this.f4625i.f4724c.toArray(bse.f4723b)) {
            c.mo3199c(bse.f4722a);
        }
        btg btg = this.f4626k;
        buh.m4203a(btg.f4804h, "onUnintentionalDisconnection must only be called on the Handler thread");
        btg.f4804h.removeMessages(1);
        synchronized (btg.f4805i) {
            btg.f4803g = true;
            ArrayList arrayList = new ArrayList(btg.f4798b);
            int i2 = btg.f4802f.get();
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                boq boq = (boq) it.next();
                if (btg.f4801e) {
                    if (btg.f4802f.get() != i2) {
                        break;
                    } else if (btg.f4798b.contains(boq)) {
                        boq.mo2288a(i);
                    }
                } else {
                    break;
                }
            }
            btg.f4799c.clear();
            btg.f4803g = false;
        }
        this.f4626k.mo2419a();
        if (i == 2) {
            mo2327d();
        }
    }

    /* renamed from: e */
    public final void mo2328e() {
        this.f4618b.lock();
        try {
            if (this.f4629n) {
                mo2327d();
            }
        } finally {
            this.f4618b.unlock();
        }
    }

    /* renamed from: a */
    public static int m4004a(Iterable iterable) {
        Iterator it = iterable.iterator();
        boolean z = false;
        while (it.hasNext()) {
            boj boj = (boj) it.next();
            if (boj.mo2231g()) {
                z = true;
            }
            boj.mo2235k();
        }
        if (!z) {
            return 3;
        }
        return 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final boolean mo2329f() {
        boolean z = false;
        if (this.f4629n) {
            this.f4629n = false;
            this.f4632q.removeMessages(2);
            z = true;
            this.f4632q.removeMessages(1);
            brl brl = this.f4634s;
            if (brl != null) {
                brl.mo2358a();
                this.f4634s = null;
            }
        }
        return z;
    }
}
