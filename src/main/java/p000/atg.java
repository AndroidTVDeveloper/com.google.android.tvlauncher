package p000;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/* renamed from: atg */
/* compiled from: PG */
public abstract class atg extends aiz {

    /* renamed from: f */
    private static final byte[] f2339f = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};

    /* renamed from: A */
    private int f2340A;

    /* renamed from: B */
    private boolean f2341B;

    /* renamed from: C */
    private boolean f2342C;

    /* renamed from: D */
    private boolean f2343D;

    /* renamed from: E */
    private boolean f2344E;

    /* renamed from: F */
    private boolean f2345F;

    /* renamed from: G */
    private boolean f2346G;

    /* renamed from: H */
    private boolean f2347H;

    /* renamed from: I */
    private boolean f2348I;

    /* renamed from: J */
    private boolean f2349J;

    /* renamed from: K */
    private ByteBuffer[] f2350K;

    /* renamed from: L */
    private ByteBuffer[] f2351L;

    /* renamed from: M */
    private long f2352M;

    /* renamed from: N */
    private int f2353N;

    /* renamed from: O */
    private int f2354O;

    /* renamed from: P */
    private ByteBuffer f2355P;

    /* renamed from: Q */
    private boolean f2356Q;

    /* renamed from: R */
    private boolean f2357R;

    /* renamed from: S */
    private boolean f2358S;

    /* renamed from: T */
    private int f2359T = 0;

    /* renamed from: U */
    private int f2360U = 0;

    /* renamed from: V */
    private int f2361V = 0;

    /* renamed from: W */
    private boolean f2362W;

    /* renamed from: X */
    private boolean f2363X;

    /* renamed from: Y */
    private long f2364Y;

    /* renamed from: Z */
    private long f2365Z;

    /* renamed from: aa */
    private boolean f2366aa;

    /* renamed from: ab */
    private boolean f2367ab;

    /* renamed from: ac */
    private boolean f2368ac;

    /* renamed from: g */
    public MediaCodec f2369g;

    /* renamed from: h */
    public atd f2370h;

    /* renamed from: i */
    public boolean f2371i;

    /* renamed from: j */
    public ani f2372j;

    /* renamed from: k */
    private final ati f2373k;

    /* renamed from: l */
    private final float f2374l;

    /* renamed from: m */
    private final anj f2375m = new anj(0);

    /* renamed from: n */
    private final anj f2376n = new anj(0);

    /* renamed from: o */
    private final bli f2377o = new bli();

    /* renamed from: p */
    private final ArrayList f2378p = new ArrayList();

    /* renamed from: q */
    private final MediaCodec.BufferInfo f2379q = new MediaCodec.BufferInfo();

    /* renamed from: r */
    private akh f2380r;

    /* renamed from: s */
    private akh f2381s;

    /* renamed from: t */
    private ans f2382t;

    /* renamed from: u */
    private ans f2383u;

    /* renamed from: v */
    private float f2384v = 1.0f;

    /* renamed from: w */
    private akh f2385w;

    /* renamed from: x */
    private float f2386x = -1.0f;

    /* renamed from: y */
    private ArrayDeque f2387y;

    /* renamed from: z */
    private atf f2388z;

    /* renamed from: E */
    private final boolean m2058E() {
        return this.f2354O >= 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public float mo673a(float f, akh[] akhArr) {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo674a(atd atd, akh akh, akh akh2) {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo675a(ati ati, akh akh);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo677a(MediaCodec mediaCodec, MediaFormat mediaFormat) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo678a(anj anj) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo679a(atd atd, MediaCodec mediaCodec, akh akh, float f);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo680a(String str, long j, long j2) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo681a(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z, boolean z2);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo1326a(atd atd) {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract List mo682b(ati ati, akh akh);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo1327b(anj anj) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo683c(long j) {
    }

    /* renamed from: o */
    public final int mo367o() {
        return 8;
    }

    /* renamed from: w */
    public boolean mo486w() {
        return this.f2371i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public void mo684x() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public boolean mo1330z() {
        return false;
    }

    public atg(int i, ati ati, float f) {
        super(i);
        this.f2373k = (ati) bks.m3507a(ati);
        this.f2374l = f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public ate mo1325a(Throwable th, atd atd) {
        return new ate(th, atd);
    }

    /* renamed from: K */
    private final void m2064K() {
        if (this.f2362W) {
            this.f2360U = 1;
            this.f2361V = 3;
            return;
        }
        m2066M();
    }

    /* renamed from: J */
    private final void m2063J() {
        if (blm.f4293a < 23) {
            m2064K();
        } else if (this.f2362W) {
            this.f2360U = 1;
            this.f2361V = 2;
        } else {
            m2067N();
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aiz.a(aki, anj, boolean):int
     arg types: [aki, anj, int]
     candidates:
      atg.a(atd, akh, akh):int
      atg.a(java.lang.String, long, long):void
      aiz.a(akh[], axx, long):void
      akx.a(akh[], axx, long):void
      aiz.a(aki, anj, boolean):int */
    /* renamed from: H */
    private final boolean m2061H() {
        ByteBuffer byteBuffer;
        MediaCodec mediaCodec = this.f2369g;
        if (mediaCodec == null || this.f2360U == 2 || this.f2366aa) {
            return false;
        }
        if (this.f2353N < 0) {
            int dequeueInputBuffer = mediaCodec.dequeueInputBuffer(0);
            this.f2353N = dequeueInputBuffer;
            if (dequeueInputBuffer < 0) {
                return false;
            }
            anj anj = this.f2375m;
            if (blm.f4293a < 21) {
                byteBuffer = this.f2350K[dequeueInputBuffer];
            } else {
                byteBuffer = this.f2369g.getInputBuffer(dequeueInputBuffer);
            }
            anj.f1425c = byteBuffer;
            this.f2375m.mo1139a();
        }
        if (this.f2360U == 1) {
            if (!this.f2349J) {
                this.f2363X = true;
                this.f2369g.queueInputBuffer(this.f2353N, 0, 0, 0, 4);
                m2059F();
            }
            this.f2360U = 2;
            return false;
        } else if (this.f2347H) {
            this.f2347H = false;
            this.f2375m.f1425c.put(f2339f);
            this.f2369g.queueInputBuffer(this.f2353N, 0, f2339f.length, 0, 0);
            m2059F();
            this.f2362W = true;
            return true;
        } else {
            aki t = mo372t();
            if (this.f2359T == 1) {
                for (int i = 0; i < this.f2385w.f558k.size(); i++) {
                    this.f2375m.f1425c.put((byte[]) this.f2385w.f558k.get(i));
                }
                this.f2359T = 2;
            }
            int position = this.f2375m.f1425c.position();
            int a = mo345a(t, this.f2375m, false);
            if (mo359g()) {
                this.f2364Y = this.f2365Z;
            }
            if (a == -3) {
                return false;
            }
            if (a == -5) {
                if (this.f2359T == 2) {
                    this.f2375m.mo1139a();
                    this.f2359T = 1;
                }
                mo676a(t);
                return true;
            } else if (this.f2375m.mo1141c()) {
                if (this.f2359T == 2) {
                    this.f2375m.mo1139a();
                    this.f2359T = 1;
                }
                this.f2366aa = true;
                if (this.f2362W) {
                    try {
                        if (!this.f2349J) {
                            this.f2363X = true;
                            this.f2369g.queueInputBuffer(this.f2353N, 0, 0, 0, 4);
                            m2059F();
                        }
                        return false;
                    } catch (MediaCodec.CryptoException e) {
                        throw ajh.m642a((Exception) e);
                    }
                } else {
                    m2065L();
                    return false;
                }
            } else if (!this.f2367ab || this.f2375m.mo1140b(1)) {
                this.f2367ab = false;
                boolean f = this.f2375m.mo1151f();
                ans ans = this.f2382t;
                if (ans == null) {
                    if (this.f2342C && !f) {
                        bkw.m3527a(this.f2375m.f1425c);
                        if (this.f2375m.f1425c.position() == 0) {
                            return true;
                        }
                        this.f2342C = false;
                    }
                    try {
                        anj anj2 = this.f2375m;
                        long j = anj2.f1426d;
                        if (anj2.mo1138T()) {
                            this.f2378p.add(Long.valueOf(j));
                        }
                        if (this.f2368ac) {
                            this.f2377o.mo2112a(j, this.f2380r);
                            this.f2368ac = false;
                        }
                        this.f2365Z = Math.max(this.f2365Z, j);
                        this.f2375m.mo1152g();
                        if (this.f2375m.mo1142d()) {
                            mo1327b(this.f2375m);
                        }
                        mo678a(this.f2375m);
                        if (!f) {
                            this.f2369g.queueInputBuffer(this.f2353N, 0, this.f2375m.f1425c.limit(), j, 0);
                        } else {
                            MediaCodec.CryptoInfo cryptoInfo = this.f2375m.f1424b.f1413d;
                            if (position != 0) {
                                if (cryptoInfo.numBytesOfClearData == null) {
                                    cryptoInfo.numBytesOfClearData = new int[1];
                                }
                                int[] iArr = cryptoInfo.numBytesOfClearData;
                                iArr[0] = iArr[0] + position;
                            }
                            this.f2369g.queueSecureInputBuffer(this.f2353N, 0, cryptoInfo, j, 0);
                        }
                        m2059F();
                        this.f2362W = true;
                        this.f2359T = 0;
                        this.f2372j.f1417c++;
                        return true;
                    } catch (MediaCodec.CryptoException e2) {
                        throw ajh.m642a((Exception) e2);
                    }
                } else {
                    throw ajh.m642a(((anv) ans).f1454a);
                }
            } else {
                this.f2375m.mo1139a();
                if (this.f2359T == 2) {
                    this.f2359T = 1;
                }
                return true;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public final void mo1324C() {
        if (mo1323B()) {
            mo1329y();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public boolean mo1323B() {
        MediaCodec mediaCodec = this.f2369g;
        if (mediaCodec == null) {
            return false;
        }
        if (this.f2361V == 3 || this.f2343D || (this.f2344E && this.f2363X)) {
            mo1322A();
            return true;
        }
        mediaCodec.flush();
        m2059F();
        m2060G();
        this.f2352M = -9223372036854775807L;
        this.f2363X = false;
        this.f2362W = false;
        this.f2367ab = true;
        this.f2347H = false;
        this.f2348I = false;
        this.f2356Q = false;
        this.f2357R = false;
        this.f2378p.clear();
        this.f2365Z = -9223372036854775807L;
        this.f2364Y = -9223372036854775807L;
        this.f2360U = 0;
        this.f2361V = 0;
        this.f2359T = this.f2358S ? 1 : 0;
        return false;
    }

    /* renamed from: v */
    public boolean mo485v() {
        boolean z;
        if (this.f2380r == null) {
            return false;
        }
        if (!mo359g()) {
            z = this.f422c.mo1478a();
        } else {
            z = this.f424e;
        }
        if (z || m2058E()) {
            return true;
        }
        return this.f2352M != -9223372036854775807L && SystemClock.elapsedRealtime() < this.f2352M;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x01de A[Catch:{ Exception -> 0x02ed }] */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x01ef A[Catch:{ Exception -> 0x02ed }] */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x021a A[Catch:{ Exception -> 0x02ed }] */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x022b A[Catch:{ Exception -> 0x02ed }] */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x023f A[Catch:{ Exception -> 0x02ed }] */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x0257 A[Catch:{ Exception -> 0x02ed }] */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x0268 A[Catch:{ Exception -> 0x02ed }] */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0269 A[Catch:{ Exception -> 0x02ed }] */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x0290 A[Catch:{ Exception -> 0x02ed }] */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x0292 A[Catch:{ Exception -> 0x02ed }] */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x02a0 A[Catch:{ Exception -> 0x02ed }] */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x02a8 A[Catch:{ Exception -> 0x02ed }] */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x02e3 A[Catch:{ Exception -> 0x02eb }] */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x02e4 A[Catch:{ Exception -> 0x02eb }] */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x0323 A[Catch:{ ato -> 0x0054, atf -> 0x035d }] */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x033a A[Catch:{ ato -> 0x0054, atf -> 0x035d }] */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x0344 A[Catch:{ ato -> 0x0054, atf -> 0x035d }] */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x0348 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0182 A[Catch:{ Exception -> 0x02ed }] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0196 A[Catch:{ Exception -> 0x02ed }] */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo1329y() {
        /*
            r16 = this;
            r7 = r16
            android.media.MediaCodec r0 = r7.f2369g
            if (r0 != 0) goto L_0x0363
            akh r0 = r7.f2380r
            if (r0 == 0) goto L_0x0363
            ans r0 = r7.f2383u
            r7.f2382t = r0
            if (r0 == 0) goto L_0x0027
            anv r0 = (p000.anv) r0
            anr r0 = r0.f1454a
            if (r0 == 0) goto L_0x0026
            boolean r0 = p000.anw.f1455a
            if (r0 != 0) goto L_0x001b
            goto L_0x0027
        L_0x001b:
            ans r0 = r7.f2382t
            anv r0 = (p000.anv) r0
            anr r0 = r0.f1454a
            ajh r0 = p000.ajh.m642a(r0)
            throw r0
        L_0x0026:
            return
        L_0x0027:
            java.util.ArrayDeque r0 = r7.f2387y     // Catch:{ atf -> 0x035d }
            r8 = 0
            r9 = 0
            if (r0 != 0) goto L_0x0060
            ati r0 = r7.f2373k     // Catch:{ ato -> 0x0054 }
            akh r1 = r7.f2380r     // Catch:{ ato -> 0x0054 }
            java.util.List r0 = r7.mo682b(r0, r1)     // Catch:{ ato -> 0x0054 }
            r0.isEmpty()     // Catch:{ ato -> 0x0054 }
            java.util.ArrayDeque r1 = new java.util.ArrayDeque     // Catch:{ ato -> 0x0054 }
            r1.<init>()     // Catch:{ ato -> 0x0054 }
            r7.f2387y = r1     // Catch:{ ato -> 0x0054 }
            boolean r1 = r0.isEmpty()     // Catch:{ ato -> 0x0054 }
            if (r1 != 0) goto L_0x0050
            java.util.ArrayDeque r1 = r7.f2387y     // Catch:{ ato -> 0x0054 }
            java.lang.Object r0 = r0.get(r9)     // Catch:{ ato -> 0x0054 }
            atd r0 = (p000.atd) r0     // Catch:{ ato -> 0x0054 }
            r1.add(r0)     // Catch:{ ato -> 0x0054 }
        L_0x0050:
            r7.f2388z = r8     // Catch:{ ato -> 0x0054 }
            goto L_0x0060
        L_0x0054:
            r0 = move-exception
            atf r1 = new atf     // Catch:{ atf -> 0x035d }
            akh r2 = r7.f2380r     // Catch:{ atf -> 0x035d }
            r3 = -49998(0xffffffffffff3cb2, float:NaN)
            r1.<init>(r2, r0, r3)     // Catch:{ atf -> 0x035d }
            throw r1     // Catch:{ atf -> 0x035d }
        L_0x0060:
            java.util.ArrayDeque r0 = r7.f2387y     // Catch:{ atf -> 0x035d }
            boolean r0 = r0.isEmpty()     // Catch:{ atf -> 0x035d }
            if (r0 != 0) goto L_0x0351
        L_0x0068:
            android.media.MediaCodec r0 = r7.f2369g     // Catch:{ atf -> 0x035d }
            if (r0 != 0) goto L_0x034c
            java.util.ArrayDeque r0 = r7.f2387y     // Catch:{ atf -> 0x035d }
            java.lang.Object r0 = r0.peekFirst()     // Catch:{ atf -> 0x035d }
            r10 = r0
            atd r10 = (p000.atd) r10     // Catch:{ atf -> 0x035d }
            boolean r0 = r7.mo1326a(r10)     // Catch:{ atf -> 0x035d }
            if (r0 == 0) goto L_0x034b
            java.lang.String r2 = r10.f2328a     // Catch:{ Exception -> 0x02ed }
            int r0 = p000.blm.f4293a     // Catch:{ Exception -> 0x02ed }
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r3 = 23
            if (r0 < r3) goto L_0x008e
            float r0 = r7.f2384v     // Catch:{ Exception -> 0x02ed }
            akh[] r4 = r7.f423d     // Catch:{ Exception -> 0x02ed }
            float r0 = r7.mo673a(r0, r4)     // Catch:{ Exception -> 0x02ed }
            goto L_0x0091
        L_0x008e:
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x0091:
            float r4 = r7.f2374l     // Catch:{ Exception -> 0x02ed }
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 <= 0) goto L_0x0098
            goto L_0x009b
        L_0x0098:
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x009b:
            long r4 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x02de }
            java.lang.String r1 = "createCodec:"
            java.lang.String r6 = java.lang.String.valueOf(r2)     // Catch:{ Exception -> 0x02de }
            int r11 = r6.length()     // Catch:{ Exception -> 0x02de }
            if (r11 != 0) goto L_0x00b1
            java.lang.String r6 = new java.lang.String     // Catch:{ Exception -> 0x02de }
            r6.<init>(r1)     // Catch:{ Exception -> 0x02de }
            goto L_0x00b5
        L_0x00b1:
            java.lang.String r6 = r1.concat(r6)     // Catch:{ Exception -> 0x02de }
        L_0x00b5:
            p000.blk.m3619a(r6)     // Catch:{ Exception -> 0x02de }
            android.media.MediaCodec r1 = android.media.MediaCodec.createByCodecName(r2)     // Catch:{ Exception -> 0x02de }
            p000.blk.m3618a()     // Catch:{ Exception -> 0x02db }
            java.lang.String r6 = "configureCodec"
            p000.blk.m3619a(r6)     // Catch:{ Exception -> 0x02db }
            akh r6 = r7.f2380r     // Catch:{ Exception -> 0x02db }
            r7.mo679a(r10, r1, r6, r0)     // Catch:{ Exception -> 0x02db }
            p000.blk.m3618a()     // Catch:{ Exception -> 0x02db }
            java.lang.String r6 = "startCodec"
            p000.blk.m3619a(r6)     // Catch:{ Exception -> 0x02db }
            r1.start()     // Catch:{ Exception -> 0x02db }
            p000.blk.m3618a()     // Catch:{ Exception -> 0x02db }
            long r11 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x02db }
            int r6 = p000.blm.f4293a     // Catch:{ Exception -> 0x02db }
            r13 = 21
            if (r6 >= r13) goto L_0x00ed
            java.nio.ByteBuffer[] r6 = r1.getInputBuffers()     // Catch:{ Exception -> 0x02db }
            r7.f2350K = r6     // Catch:{ Exception -> 0x02db }
            java.nio.ByteBuffer[] r6 = r1.getOutputBuffers()     // Catch:{ Exception -> 0x02db }
            r7.f2351L = r6     // Catch:{ Exception -> 0x02db }
        L_0x00ed:
            r7.f2369g = r1     // Catch:{ Exception -> 0x02ed }
            r7.f2370h = r10     // Catch:{ Exception -> 0x02ed }
            r7.f2386x = r0     // Catch:{ Exception -> 0x02ed }
            akh r0 = r7.f2380r     // Catch:{ Exception -> 0x02ed }
            r7.f2385w = r0     // Catch:{ Exception -> 0x02ed }
            int r0 = p000.blm.f4293a     // Catch:{ Exception -> 0x02ed }
            java.lang.String r1 = "OMX.Exynos.avc.dec.secure"
            r6 = 25
            r15 = 1
            if (r0 > r6) goto L_0x0131
            boolean r0 = r1.equals(r2)     // Catch:{ Exception -> 0x02ed }
            if (r0 == 0) goto L_0x0131
            java.lang.String r0 = p000.blm.f4296d     // Catch:{ Exception -> 0x02ed }
            java.lang.String r8 = "SM-T585"
            boolean r0 = r0.startsWith(r8)     // Catch:{ Exception -> 0x02ed }
            if (r0 != 0) goto L_0x012f
            java.lang.String r0 = p000.blm.f4296d     // Catch:{ Exception -> 0x02ed }
            java.lang.String r8 = "SM-A510"
            boolean r0 = r0.startsWith(r8)     // Catch:{ Exception -> 0x02ed }
            if (r0 != 0) goto L_0x012f
            java.lang.String r0 = p000.blm.f4296d     // Catch:{ Exception -> 0x02ed }
            java.lang.String r8 = "SM-A520"
            boolean r0 = r0.startsWith(r8)     // Catch:{ Exception -> 0x02ed }
            if (r0 != 0) goto L_0x012f
            java.lang.String r0 = p000.blm.f4296d     // Catch:{ Exception -> 0x02ed }
            java.lang.String r8 = "SM-J700"
            boolean r0 = r0.startsWith(r8)     // Catch:{ Exception -> 0x02ed }
            if (r0 != 0) goto L_0x012f
            goto L_0x0131
        L_0x012f:
            r0 = 2
            goto L_0x0176
        L_0x0131:
            int r0 = p000.blm.f4293a     // Catch:{ Exception -> 0x02ed }
            r8 = 24
            if (r0 >= r8) goto L_0x0175
            java.lang.String r0 = "OMX.Nvidia.h264.decode"
            boolean r0 = r0.equals(r2)     // Catch:{ Exception -> 0x02ed }
            if (r0 == 0) goto L_0x0140
        L_0x013f:
            goto L_0x0149
        L_0x0140:
            java.lang.String r0 = "OMX.Nvidia.h264.decode.secure"
            boolean r0 = r0.equals(r2)     // Catch:{ Exception -> 0x02ed }
            if (r0 != 0) goto L_0x013f
            goto L_0x0175
        L_0x0149:
            java.lang.String r0 = "flounder"
            java.lang.String r8 = p000.blm.f4294b     // Catch:{ Exception -> 0x02ed }
            boolean r0 = r0.equals(r8)     // Catch:{ Exception -> 0x02ed }
            if (r0 != 0) goto L_0x0173
            java.lang.String r0 = "flounder_lte"
            java.lang.String r8 = p000.blm.f4294b     // Catch:{ Exception -> 0x02ed }
            boolean r0 = r0.equals(r8)     // Catch:{ Exception -> 0x02ed }
            if (r0 != 0) goto L_0x0173
            java.lang.String r0 = "grouper"
            java.lang.String r8 = p000.blm.f4294b     // Catch:{ Exception -> 0x02ed }
            boolean r0 = r0.equals(r8)     // Catch:{ Exception -> 0x02ed }
            if (r0 != 0) goto L_0x0173
            java.lang.String r0 = "tilapia"
            java.lang.String r8 = p000.blm.f4294b     // Catch:{ Exception -> 0x02ed }
            boolean r0 = r0.equals(r8)     // Catch:{ Exception -> 0x02ed }
            if (r0 != 0) goto L_0x0172
            goto L_0x0175
        L_0x0172:
        L_0x0173:
            r0 = 1
            goto L_0x0176
        L_0x0175:
            r0 = 0
        L_0x0176:
            r7.f2340A = r0     // Catch:{ Exception -> 0x02ed }
            java.lang.String r0 = p000.blm.f4296d     // Catch:{ Exception -> 0x02ed }
            java.lang.String r8 = "SM-T230"
            boolean r0 = r0.startsWith(r8)     // Catch:{ Exception -> 0x02ed }
            if (r0 == 0) goto L_0x018d
            java.lang.String r0 = "OMX.MARVELL.VIDEO.HW.CODA7542DECODER"
            boolean r0 = r0.equals(r2)     // Catch:{ Exception -> 0x02ed }
            if (r0 == 0) goto L_0x018c
            r0 = 1
            goto L_0x018e
        L_0x018c:
        L_0x018d:
            r0 = 0
        L_0x018e:
            r7.f2341B = r0     // Catch:{ Exception -> 0x02ed }
            akh r0 = r7.f2385w     // Catch:{ Exception -> 0x02ed }
            int r8 = p000.blm.f4293a     // Catch:{ Exception -> 0x02ed }
            if (r8 >= r13) goto L_0x01a9
            java.util.List r0 = r0.f558k     // Catch:{ Exception -> 0x02ed }
            boolean r0 = r0.isEmpty()     // Catch:{ Exception -> 0x02ed }
            if (r0 == 0) goto L_0x01a9
            java.lang.String r0 = "OMX.MTK.VIDEO.DECODER.AVC"
            boolean r0 = r0.equals(r2)     // Catch:{ Exception -> 0x02ed }
            if (r0 == 0) goto L_0x01a8
            r0 = 1
            goto L_0x01aa
        L_0x01a8:
        L_0x01a9:
            r0 = 0
        L_0x01aa:
            r7.f2342C = r0     // Catch:{ Exception -> 0x02ed }
            int r0 = p000.blm.f4293a     // Catch:{ Exception -> 0x02ed }
            r8 = 19
            r9 = 18
            if (r0 < r9) goto L_0x01e8
            int r0 = p000.blm.f4293a     // Catch:{ Exception -> 0x02ed }
            if (r0 != r9) goto L_0x01c8
            java.lang.String r0 = "OMX.SEC.avc.dec"
            boolean r0 = r0.equals(r2)     // Catch:{ Exception -> 0x02ed }
            if (r0 != 0) goto L_0x01e8
            java.lang.String r0 = "OMX.SEC.avc.dec.secure"
            boolean r0 = r0.equals(r2)     // Catch:{ Exception -> 0x02ed }
            if (r0 != 0) goto L_0x01e8
        L_0x01c8:
            int r0 = p000.blm.f4293a     // Catch:{ Exception -> 0x02ed }
            if (r0 != r8) goto L_0x01e6
            java.lang.String r0 = p000.blm.f4296d     // Catch:{ Exception -> 0x02ed }
            java.lang.String r14 = "SM-G800"
            boolean r0 = r0.startsWith(r14)     // Catch:{ Exception -> 0x02ed }
            if (r0 == 0) goto L_0x01e6
            java.lang.String r0 = "OMX.Exynos.avc.dec"
            boolean r0 = r0.equals(r2)     // Catch:{ Exception -> 0x02ed }
            if (r0 != 0) goto L_0x01e8
            boolean r0 = r1.equals(r2)     // Catch:{ Exception -> 0x02ed }
            if (r0 != 0) goto L_0x01e5
            goto L_0x01e6
        L_0x01e5:
            goto L_0x01e8
        L_0x01e6:
            r0 = 0
            goto L_0x01e9
        L_0x01e8:
            r0 = 1
        L_0x01e9:
            r7.f2343D = r0     // Catch:{ Exception -> 0x02ed }
            int r0 = p000.blm.f4293a     // Catch:{ Exception -> 0x02ed }
            if (r0 > r3) goto L_0x01fa
            java.lang.String r0 = "OMX.google.vorbis.decoder"
            boolean r0 = r0.equals(r2)     // Catch:{ Exception -> 0x02ed }
            if (r0 != 0) goto L_0x01f8
            goto L_0x01fa
        L_0x01f8:
            r0 = 1
            goto L_0x0225
        L_0x01fa:
            int r0 = p000.blm.f4293a     // Catch:{ Exception -> 0x02ed }
            if (r0 > r8) goto L_0x0224
            java.lang.String r0 = "hb2000"
            java.lang.String r1 = p000.blm.f4294b     // Catch:{ Exception -> 0x02ed }
            boolean r0 = r0.equals(r1)     // Catch:{ Exception -> 0x02ed }
            if (r0 != 0) goto L_0x0212
            java.lang.String r0 = "stvm8"
            java.lang.String r1 = p000.blm.f4294b     // Catch:{ Exception -> 0x02ed }
            boolean r0 = r0.equals(r1)     // Catch:{ Exception -> 0x02ed }
            if (r0 == 0) goto L_0x0224
        L_0x0212:
            java.lang.String r0 = "OMX.amlogic.avc.decoder.awesome"
            boolean r0 = r0.equals(r2)     // Catch:{ Exception -> 0x02ed }
            if (r0 != 0) goto L_0x01f8
            java.lang.String r0 = "OMX.amlogic.avc.decoder.awesome.secure"
            boolean r0 = r0.equals(r2)     // Catch:{ Exception -> 0x02ed }
            if (r0 != 0) goto L_0x0223
            goto L_0x0224
        L_0x0223:
            goto L_0x01f8
        L_0x0224:
            r0 = 0
        L_0x0225:
            r7.f2344E = r0     // Catch:{ Exception -> 0x02ed }
            int r0 = p000.blm.f4293a     // Catch:{ Exception -> 0x02ed }
            if (r0 != r13) goto L_0x0236
            java.lang.String r0 = "OMX.google.aac.decoder"
            boolean r0 = r0.equals(r2)     // Catch:{ Exception -> 0x02ed }
            if (r0 == 0) goto L_0x0235
            r0 = 1
            goto L_0x0237
        L_0x0235:
        L_0x0236:
            r0 = 0
        L_0x0237:
            r7.f2345F = r0     // Catch:{ Exception -> 0x02ed }
            akh r0 = r7.f2385w     // Catch:{ Exception -> 0x02ed }
            int r1 = p000.blm.f4293a     // Catch:{ Exception -> 0x02ed }
            if (r1 > r9) goto L_0x024e
            int r0 = r0.f569v     // Catch:{ Exception -> 0x02ed }
            if (r0 != r15) goto L_0x024e
            java.lang.String r0 = "OMX.MTK.AUDIO.DECODER.MP3"
            boolean r0 = r0.equals(r2)     // Catch:{ Exception -> 0x02ed }
            if (r0 == 0) goto L_0x024d
            r0 = 1
            goto L_0x024f
        L_0x024d:
        L_0x024e:
            r0 = 0
        L_0x024f:
            r7.f2346G = r0     // Catch:{ Exception -> 0x02ed }
            java.lang.String r0 = r10.f2328a     // Catch:{ Exception -> 0x02ed }
            int r1 = p000.blm.f4293a     // Catch:{ Exception -> 0x02ed }
            if (r1 > r6) goto L_0x0262
            java.lang.String r1 = "OMX.rk.video_decoder.avc"
            boolean r1 = r1.equals(r0)     // Catch:{ Exception -> 0x02ed }
            if (r1 != 0) goto L_0x0260
            goto L_0x0262
        L_0x0260:
            r0 = 1
            goto L_0x0293
        L_0x0262:
            int r1 = p000.blm.f4293a     // Catch:{ Exception -> 0x02ed }
            r3 = 17
            if (r1 <= r3) goto L_0x0269
            goto L_0x0272
        L_0x0269:
            java.lang.String r1 = "OMX.allwinner.video.decoder.avc"
            boolean r0 = r1.equals(r0)     // Catch:{ Exception -> 0x02ed }
            if (r0 == 0) goto L_0x0272
            goto L_0x0260
        L_0x0272:
            java.lang.String r0 = "Amazon"
            java.lang.String r1 = p000.blm.f4295c     // Catch:{ Exception -> 0x02ed }
            boolean r0 = r0.equals(r1)     // Catch:{ Exception -> 0x02ed }
            if (r0 == 0) goto L_0x028a
            java.lang.String r0 = "AFTS"
            java.lang.String r1 = p000.blm.f4296d     // Catch:{ Exception -> 0x02ed }
            boolean r0 = r0.equals(r1)     // Catch:{ Exception -> 0x02ed }
            if (r0 == 0) goto L_0x028a
            boolean r0 = r10.f2332e     // Catch:{ Exception -> 0x02ed }
            if (r0 != 0) goto L_0x0260
        L_0x028a:
            boolean r0 = r16.mo1330z()     // Catch:{ Exception -> 0x02ed }
            if (r0 != 0) goto L_0x0292
            r0 = 0
            goto L_0x0293
        L_0x0292:
            goto L_0x0260
        L_0x0293:
            r7.f2349J = r0     // Catch:{ Exception -> 0x02ed }
            r16.m2059F()     // Catch:{ Exception -> 0x02ed }
            r16.m2060G()     // Catch:{ Exception -> 0x02ed }
            int r0 = r7.f421b     // Catch:{ Exception -> 0x02ed }
            r1 = 2
            if (r0 != r1) goto L_0x02a8
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x02ed }
            r8 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 + r8
            goto L_0x02ae
        L_0x02a8:
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x02ae:
            r7.f2352M = r0     // Catch:{ Exception -> 0x02ed }
            r8 = 0
            r7.f2358S = r8     // Catch:{ Exception -> 0x02eb }
            r7.f2359T = r8     // Catch:{ Exception -> 0x02eb }
            r7.f2363X = r8     // Catch:{ Exception -> 0x02eb }
            r7.f2362W = r8     // Catch:{ Exception -> 0x02eb }
            r7.f2360U = r8     // Catch:{ Exception -> 0x02eb }
            r7.f2361V = r8     // Catch:{ Exception -> 0x02eb }
            r7.f2347H = r8     // Catch:{ Exception -> 0x02eb }
            r7.f2348I = r8     // Catch:{ Exception -> 0x02eb }
            r7.f2356Q = r8     // Catch:{ Exception -> 0x02eb }
            r7.f2357R = r8     // Catch:{ Exception -> 0x02eb }
            r7.f2367ab = r15     // Catch:{ Exception -> 0x02eb }
            ani r0 = r7.f2372j     // Catch:{ Exception -> 0x02eb }
            int r1 = r0.f1415a     // Catch:{ Exception -> 0x02eb }
            int r1 = r1 + r15
            r0.f1415a = r1     // Catch:{ Exception -> 0x02eb }
            long r13 = r11 - r4
            r1 = r16
            r3 = r11
            r5 = r13
            r1.mo680a(r2, r3, r5)     // Catch:{ Exception -> 0x02eb }
            r8 = 0
            r9 = 0
            goto L_0x0068
        L_0x02db:
            r0 = move-exception
            r8 = 0
            goto L_0x02e1
        L_0x02de:
            r0 = move-exception
            r8 = 0
            r1 = 0
        L_0x02e1:
            if (r1 != 0) goto L_0x02e4
            goto L_0x02ea
        L_0x02e4:
            r16.m2057D()     // Catch:{ Exception -> 0x02eb }
            r1.release()     // Catch:{ Exception -> 0x02eb }
        L_0x02ea:
            throw r0     // Catch:{ Exception -> 0x02eb }
        L_0x02eb:
            r0 = move-exception
            goto L_0x02ef
        L_0x02ed:
            r0 = move-exception
            r8 = 0
        L_0x02ef:
            java.lang.String r1 = "MediaCodecRenderer"
            java.lang.String r2 = java.lang.String.valueOf(r10)     // Catch:{ atf -> 0x035d }
            java.lang.String r3 = java.lang.String.valueOf(r2)     // Catch:{ atf -> 0x035d }
            int r3 = r3.length()     // Catch:{ atf -> 0x035d }
            int r3 = r3 + 30
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ atf -> 0x035d }
            r4.<init>(r3)     // Catch:{ atf -> 0x035d }
            java.lang.String r3 = "Failed to initialize decoder: "
            r4.append(r3)     // Catch:{ atf -> 0x035d }
            r4.append(r2)     // Catch:{ atf -> 0x035d }
            java.lang.String r2 = r4.toString()     // Catch:{ atf -> 0x035d }
            android.util.Log.w(r1, r2, r0)     // Catch:{ atf -> 0x035d }
            java.util.ArrayDeque r1 = r7.f2387y     // Catch:{ atf -> 0x035d }
            r1.removeFirst()     // Catch:{ atf -> 0x035d }
            atf r1 = new atf     // Catch:{ atf -> 0x035d }
            akh r2 = r7.f2380r     // Catch:{ atf -> 0x035d }
            r1.<init>(r2, r0, r10)     // Catch:{ atf -> 0x035d }
            atf r0 = r7.f2388z     // Catch:{ atf -> 0x035d }
            if (r0 == 0) goto L_0x033a
            atf r1 = new atf     // Catch:{ atf -> 0x035d }
            java.lang.String r10 = r0.getMessage()     // Catch:{ atf -> 0x035d }
            java.lang.Throwable r11 = r0.getCause()     // Catch:{ atf -> 0x035d }
            java.lang.String r12 = r0.f2336a     // Catch:{ atf -> 0x035d }
            atd r13 = r0.f2337b     // Catch:{ atf -> 0x035d }
            java.lang.String r14 = r0.f2338c     // Catch:{ atf -> 0x035d }
            r9 = r1
            r9.<init>(r10, r11, r12, r13, r14)     // Catch:{ atf -> 0x035d }
            r7.f2388z = r1     // Catch:{ atf -> 0x035d }
            goto L_0x033c
        L_0x033a:
            r7.f2388z = r1     // Catch:{ atf -> 0x035d }
        L_0x033c:
            java.util.ArrayDeque r0 = r7.f2387y     // Catch:{ atf -> 0x035d }
            boolean r0 = r0.isEmpty()     // Catch:{ atf -> 0x035d }
            if (r0 != 0) goto L_0x0348
            r8 = 0
            r9 = 0
            goto L_0x0068
        L_0x0348:
            atf r0 = r7.f2388z     // Catch:{ atf -> 0x035d }
            throw r0     // Catch:{ atf -> 0x035d }
        L_0x034b:
            return
        L_0x034c:
            r1 = 0
            r7.f2387y = r1     // Catch:{ atf -> 0x035d }
            return
        L_0x0351:
            atf r0 = new atf     // Catch:{ atf -> 0x035d }
            akh r1 = r7.f2380r     // Catch:{ atf -> 0x035d }
            r2 = -49999(0xffffffffffff3cb1, float:NaN)
            r3 = 0
            r0.<init>(r1, r3, r2)     // Catch:{ atf -> 0x035d }
            throw r0     // Catch:{ atf -> 0x035d }
        L_0x035d:
            r0 = move-exception
            ajh r0 = p000.ajh.m642a(r0)
            throw r0
        L_0x0363:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.atg.mo1329y():void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public void mo370r() {
        this.f2380r = null;
        if (this.f2383u == null && this.f2382t == null) {
            mo1323B();
        } else {
            mo371s();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo351a(boolean z) {
        this.f2372j = new ani();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00b3, code lost:
        if (r1.f562o == r2.f562o) goto L_0x00a3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo676a(p000.aki r6) {
        /*
            r5 = this;
            r0 = 1
            r5.f2368ac = r0
            akh r1 = r6.f576c
            java.lang.Object r1 = p000.bks.m3507a(r1)
            akh r1 = (p000.akh) r1
            boolean r2 = r6.f574a
            if (r2 == 0) goto L_0x0014
            ans r6 = r6.f575b
            r5.f2383u = r6
            goto L_0x0041
        L_0x0014:
            akh r6 = r5.f2380r
            ans r2 = r5.f2383u
            anq r3 = r1.f559l
            r4 = 0
            if (r6 == 0) goto L_0x0020
            anq r6 = r6.f559l
            goto L_0x0022
        L_0x0020:
            r6 = r4
        L_0x0022:
            boolean r6 = p000.blm.m3652a(r3, r6)
            r6 = r6 ^ r0
            if (r6 == 0) goto L_0x003e
            anq r6 = r1.f559l
            if (r6 != 0) goto L_0x0032
            if (r2 == 0) goto L_0x0030
            goto L_0x0031
        L_0x0030:
        L_0x0031:
            goto L_0x003f
        L_0x0032:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "Media requires a DrmSessionManager"
            r6.<init>(r0)
            ajh r6 = p000.ajh.m642a(r6)
            throw r6
        L_0x003e:
            r4 = r2
        L_0x003f:
            r5.f2383u = r4
        L_0x0041:
            r5.f2380r = r1
            android.media.MediaCodec r6 = r5.f2369g
            if (r6 == 0) goto L_0x00e7
            ans r6 = r5.f2383u
            if (r6 != 0) goto L_0x004f
            ans r2 = r5.f2382t
            if (r2 != 0) goto L_0x006b
        L_0x004f:
            if (r6 == 0) goto L_0x0056
            ans r2 = r5.f2382t
            if (r2 != 0) goto L_0x0056
            goto L_0x006b
        L_0x0056:
            if (r6 == 0) goto L_0x005e
            atd r6 = r5.f2370h
            boolean r6 = r6.f2332e
            if (r6 == 0) goto L_0x006b
        L_0x005e:
            int r6 = p000.blm.f4293a
            r2 = 23
            if (r6 < r2) goto L_0x0065
            goto L_0x006f
        L_0x0065:
            ans r6 = r5.f2383u
            ans r2 = r5.f2382t
            if (r6 == r2) goto L_0x006f
        L_0x006b:
            r5.m2064K()
            return
        L_0x006f:
            atd r6 = r5.f2370h
            akh r2 = r5.f2385w
            int r6 = r5.mo674a(r6, r2, r1)
            if (r6 == 0) goto L_0x00e3
            if (r6 == r0) goto L_0x00cb
            r2 = 2
            if (r6 == r2) goto L_0x0096
            r0 = 3
            if (r6 != r0) goto L_0x0090
            r5.f2385w = r1
            r5.m2062I()
            ans r6 = r5.f2383u
            ans r0 = r5.f2382t
            if (r6 == r0) goto L_0x00de
            r5.m2063J()
            return
        L_0x0090:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            r6.<init>()
            throw r6
        L_0x0096:
            boolean r6 = r5.f2341B
            if (r6 != 0) goto L_0x00c7
            r5.f2358S = r0
            r5.f2359T = r0
            int r6 = r5.f2340A
            r3 = 0
            if (r6 != r2) goto L_0x00a5
        L_0x00a3:
            r3 = 1
            goto L_0x00b6
        L_0x00a5:
            if (r6 != r0) goto L_0x00b5
            int r6 = r1.f561n
            akh r2 = r5.f2385w
            int r4 = r2.f561n
            if (r6 != r4) goto L_0x00b5
            int r6 = r1.f562o
            int r2 = r2.f562o
            if (r6 == r2) goto L_0x00a3
        L_0x00b5:
        L_0x00b6:
            r5.f2347H = r3
            r5.f2385w = r1
            r5.m2062I()
            ans r6 = r5.f2383u
            ans r0 = r5.f2382t
            if (r6 == r0) goto L_0x00de
            r5.m2063J()
            return
        L_0x00c7:
            r5.m2064K()
            return
        L_0x00cb:
            r5.f2385w = r1
            r5.m2062I()
            ans r6 = r5.f2383u
            ans r1 = r5.f2382t
            if (r6 != r1) goto L_0x00df
            boolean r6 = r5.f2362W
            if (r6 == 0) goto L_0x00de
            r5.f2360U = r0
            r5.f2361V = r0
        L_0x00de:
            return
        L_0x00df:
            r5.m2063J()
            return
        L_0x00e3:
            r5.m2064K()
            return
        L_0x00e7:
            r5.mo1329y()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.atg.mo676a(aki):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo349a(long j, boolean z) {
        this.f2366aa = false;
        this.f2371i = false;
        mo1324C();
        this.f2377o.mo2111a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public void mo371s() {
        try {
            mo1322A();
        } finally {
            this.f2383u = null;
        }
    }

    /* renamed from: L */
    private final void m2065L() {
        int i = this.f2361V;
        if (i == 1) {
            mo1324C();
        } else if (i == 2) {
            m2067N();
        } else if (i != 3) {
            this.f2371i = true;
            mo684x();
        } else {
            m2066M();
        }
    }

    /* renamed from: b */
    private final boolean m2068b(boolean z) {
        aki t = mo372t();
        this.f2376n.mo1139a();
        int a = mo345a(t, this.f2376n, z);
        if (a == -5) {
            mo676a(t);
            return true;
        } else if (a != -4 || !this.f2376n.mo1141c()) {
            return false;
        } else {
            this.f2366aa = true;
            m2065L();
            return false;
        }
    }

    /* renamed from: M */
    private final void m2066M() {
        mo1322A();
        mo1329y();
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public void mo1322A() {
        this.f2387y = null;
        this.f2370h = null;
        this.f2385w = null;
        m2059F();
        m2060G();
        m2057D();
        this.f2352M = -9223372036854775807L;
        this.f2378p.clear();
        this.f2365Z = -9223372036854775807L;
        this.f2364Y = -9223372036854775807L;
        try {
            MediaCodec mediaCodec = this.f2369g;
            if (mediaCodec != null) {
                this.f2372j.f1416b++;
                mediaCodec.stop();
                this.f2369g.release();
            }
            this.f2369g = null;
            this.f2382t = null;
        } catch (Throwable th) {
            this.f2369g = null;
            this.f2382t = null;
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:0x0197 A[Catch:{ IllegalStateException -> 0x01e7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x01be A[Catch:{ IllegalStateException -> 0x01e7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x01bd A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x006b A[Catch:{ IllegalStateException -> 0x01e9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00fa A[Catch:{ IllegalStateException -> 0x01e9 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo484a(long r20, long r22) {
        /*
            r19 = this;
            r14 = r19
            r15 = 21
            r13 = 0
            boolean r0 = r14.f2371i     // Catch:{ IllegalStateException -> 0x01e9 }
            if (r0 != 0) goto L_0x01e1
            akh r0 = r14.f2380r     // Catch:{ IllegalStateException -> 0x01e9 }
            r12 = 1
            if (r0 != 0) goto L_0x0016
            boolean r0 = r14.m2068b(r12)     // Catch:{ IllegalStateException -> 0x01e9 }
            if (r0 == 0) goto L_0x0015
            goto L_0x0016
        L_0x0015:
            return
        L_0x0016:
            r19.mo1329y()     // Catch:{ IllegalStateException -> 0x01e9 }
            android.media.MediaCodec r0 = r14.f2369g     // Catch:{ IllegalStateException -> 0x01e9 }
            if (r0 != 0) goto L_0x002c
            ani r0 = r14.f2372j     // Catch:{ IllegalStateException -> 0x01e9 }
            int r1 = r0.f1418d     // Catch:{ IllegalStateException -> 0x01e9 }
            int r2 = r19.mo354b(r20)     // Catch:{ IllegalStateException -> 0x01e9 }
            int r1 = r1 + r2
            r0.f1418d = r1     // Catch:{ IllegalStateException -> 0x01e9 }
            r14.m2068b(r13)     // Catch:{ IllegalStateException -> 0x01e9 }
            return
        L_0x002c:
            android.os.SystemClock.elapsedRealtime()     // Catch:{ IllegalStateException -> 0x01e9 }
            java.lang.String r0 = "drainAndFeed"
            p000.blk.m3619a(r0)     // Catch:{ IllegalStateException -> 0x01e9 }
        L_0x0034:
            boolean r0 = r19.m2058E()     // Catch:{ IllegalStateException -> 0x01e9 }
            if (r0 != 0) goto L_0x0158
            boolean r0 = r14.f2345F     // Catch:{ IllegalStateException -> 0x01e9 }
            r1 = 0
            if (r0 != 0) goto L_0x0041
            goto L_0x0061
        L_0x0041:
            boolean r0 = r14.f2363X     // Catch:{ IllegalStateException -> 0x01e9 }
            if (r0 == 0) goto L_0x0061
            android.media.MediaCodec r0 = r14.f2369g     // Catch:{ IllegalStateException -> 0x004e }
            android.media.MediaCodec$BufferInfo r3 = r14.f2379q     // Catch:{ IllegalStateException -> 0x004e }
            int r0 = r0.dequeueOutputBuffer(r3, r1)     // Catch:{ IllegalStateException -> 0x004e }
            goto L_0x0069
        L_0x004e:
            r0 = move-exception
            r19.m2065L()     // Catch:{ IllegalStateException -> 0x01e9 }
            boolean r0 = r14.f2371i     // Catch:{ IllegalStateException -> 0x01e9 }
            if (r0 == 0) goto L_0x005d
            r19.mo1322A()     // Catch:{ IllegalStateException -> 0x01e9 }
            r18 = 0
            goto L_0x01d3
        L_0x005d:
            r18 = 0
            goto L_0x01d3
        L_0x0061:
            android.media.MediaCodec r0 = r14.f2369g     // Catch:{ IllegalStateException -> 0x01e9 }
            android.media.MediaCodec$BufferInfo r3 = r14.f2379q     // Catch:{ IllegalStateException -> 0x01e9 }
            int r0 = r0.dequeueOutputBuffer(r3, r1)     // Catch:{ IllegalStateException -> 0x01e9 }
        L_0x0069:
            if (r0 < 0) goto L_0x00fa
            boolean r1 = r14.f2348I     // Catch:{ IllegalStateException -> 0x01e9 }
            if (r1 == 0) goto L_0x0077
            r14.f2348I = r13     // Catch:{ IllegalStateException -> 0x01e9 }
            android.media.MediaCodec r1 = r14.f2369g     // Catch:{ IllegalStateException -> 0x01e9 }
            r1.releaseOutputBuffer(r0, r13)     // Catch:{ IllegalStateException -> 0x01e9 }
            goto L_0x0034
        L_0x0077:
            android.media.MediaCodec$BufferInfo r1 = r14.f2379q     // Catch:{ IllegalStateException -> 0x01e9 }
            int r1 = r1.size     // Catch:{ IllegalStateException -> 0x01e9 }
            if (r1 != 0) goto L_0x008d
            android.media.MediaCodec$BufferInfo r1 = r14.f2379q     // Catch:{ IllegalStateException -> 0x01e9 }
            int r1 = r1.flags     // Catch:{ IllegalStateException -> 0x01e9 }
            r1 = r1 & 4
            if (r1 != 0) goto L_0x0086
            goto L_0x008d
        L_0x0086:
            r19.m2065L()     // Catch:{ IllegalStateException -> 0x01e9 }
            r18 = 0
            goto L_0x01d3
        L_0x008d:
            r14.f2354O = r0     // Catch:{ IllegalStateException -> 0x01e9 }
            int r1 = p000.blm.f4293a     // Catch:{ IllegalStateException -> 0x01e9 }
            if (r1 >= r15) goto L_0x0098
            java.nio.ByteBuffer[] r1 = r14.f2351L     // Catch:{ IllegalStateException -> 0x01e9 }
            r0 = r1[r0]     // Catch:{ IllegalStateException -> 0x01e9 }
            goto L_0x009e
        L_0x0098:
            android.media.MediaCodec r1 = r14.f2369g     // Catch:{ IllegalStateException -> 0x01e9 }
            java.nio.ByteBuffer r0 = r1.getOutputBuffer(r0)     // Catch:{ IllegalStateException -> 0x01e9 }
        L_0x009e:
            r14.f2355P = r0     // Catch:{ IllegalStateException -> 0x01e9 }
            if (r0 == 0) goto L_0x00b7
            android.media.MediaCodec$BufferInfo r1 = r14.f2379q     // Catch:{ IllegalStateException -> 0x01e9 }
            int r1 = r1.offset     // Catch:{ IllegalStateException -> 0x01e9 }
            r0.position(r1)     // Catch:{ IllegalStateException -> 0x01e9 }
            java.nio.ByteBuffer r0 = r14.f2355P     // Catch:{ IllegalStateException -> 0x01e9 }
            android.media.MediaCodec$BufferInfo r1 = r14.f2379q     // Catch:{ IllegalStateException -> 0x01e9 }
            int r1 = r1.offset     // Catch:{ IllegalStateException -> 0x01e9 }
            android.media.MediaCodec$BufferInfo r2 = r14.f2379q     // Catch:{ IllegalStateException -> 0x01e9 }
            int r2 = r2.size     // Catch:{ IllegalStateException -> 0x01e9 }
            int r1 = r1 + r2
            r0.limit(r1)     // Catch:{ IllegalStateException -> 0x01e9 }
        L_0x00b7:
            android.media.MediaCodec$BufferInfo r0 = r14.f2379q     // Catch:{ IllegalStateException -> 0x01e9 }
            long r0 = r0.presentationTimeUs     // Catch:{ IllegalStateException -> 0x01e9 }
            java.util.ArrayList r2 = r14.f2378p     // Catch:{ IllegalStateException -> 0x01e9 }
            int r2 = r2.size()     // Catch:{ IllegalStateException -> 0x01e9 }
            r3 = 0
        L_0x00c2:
            if (r3 >= r2) goto L_0x00de
            java.util.ArrayList r4 = r14.f2378p     // Catch:{ IllegalStateException -> 0x01e9 }
            java.lang.Object r4 = r4.get(r3)     // Catch:{ IllegalStateException -> 0x01e9 }
            java.lang.Long r4 = (java.lang.Long) r4     // Catch:{ IllegalStateException -> 0x01e9 }
            long r4 = r4.longValue()     // Catch:{ IllegalStateException -> 0x01e9 }
            int r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r6 != 0) goto L_0x00db
            java.util.ArrayList r0 = r14.f2378p     // Catch:{ IllegalStateException -> 0x01e9 }
            r0.remove(r3)     // Catch:{ IllegalStateException -> 0x01e9 }
            r0 = 1
            goto L_0x00e0
        L_0x00db:
            int r3 = r3 + 1
            goto L_0x00c2
        L_0x00de:
            r0 = 0
        L_0x00e0:
            r14.f2356Q = r0     // Catch:{ IllegalStateException -> 0x01e9 }
            long r0 = r14.f2364Y     // Catch:{ IllegalStateException -> 0x01e9 }
            android.media.MediaCodec$BufferInfo r2 = r14.f2379q     // Catch:{ IllegalStateException -> 0x01e9 }
            long r2 = r2.presentationTimeUs     // Catch:{ IllegalStateException -> 0x01e9 }
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x00ee
            r0 = 1
            goto L_0x00f0
        L_0x00ee:
            r0 = 0
        L_0x00f0:
            r14.f2357R = r0     // Catch:{ IllegalStateException -> 0x01e9 }
            android.media.MediaCodec$BufferInfo r0 = r14.f2379q     // Catch:{ IllegalStateException -> 0x01e9 }
            long r0 = r0.presentationTimeUs     // Catch:{ IllegalStateException -> 0x01e9 }
            r14.mo1328d(r0)     // Catch:{ IllegalStateException -> 0x01e9 }
            goto L_0x0158
        L_0x00fa:
            r1 = -2
            if (r0 != r1) goto L_0x012f
            android.media.MediaCodec r0 = r14.f2369g     // Catch:{ IllegalStateException -> 0x01e9 }
            android.media.MediaFormat r0 = r0.getOutputFormat()     // Catch:{ IllegalStateException -> 0x01e9 }
            int r1 = r14.f2340A     // Catch:{ IllegalStateException -> 0x01e9 }
            if (r1 == 0) goto L_0x011f
            java.lang.String r1 = "width"
            int r1 = r0.getInteger(r1)     // Catch:{ IllegalStateException -> 0x01e9 }
            r2 = 32
            if (r1 != r2) goto L_0x011f
            java.lang.String r1 = "height"
            int r1 = r0.getInteger(r1)     // Catch:{ IllegalStateException -> 0x01e9 }
            if (r1 == r2) goto L_0x011a
            goto L_0x011f
        L_0x011a:
            r14.f2348I = r12     // Catch:{ IllegalStateException -> 0x01e9 }
            goto L_0x0034
        L_0x011f:
            boolean r1 = r14.f2346G     // Catch:{ IllegalStateException -> 0x01e9 }
            if (r1 == 0) goto L_0x0128
            java.lang.String r1 = "channel-count"
            r0.setInteger(r1, r12)     // Catch:{ IllegalStateException -> 0x01e9 }
        L_0x0128:
            android.media.MediaCodec r1 = r14.f2369g     // Catch:{ IllegalStateException -> 0x01e9 }
            r14.mo677a(r1, r0)     // Catch:{ IllegalStateException -> 0x01e9 }
            goto L_0x0034
        L_0x012f:
            r1 = -3
            if (r0 == r1) goto L_0x014a
            boolean r0 = r14.f2349J     // Catch:{ IllegalStateException -> 0x01e9 }
            if (r0 == 0) goto L_0x0146
            boolean r0 = r14.f2366aa     // Catch:{ IllegalStateException -> 0x01e9 }
            if (r0 != 0) goto L_0x013f
            int r0 = r14.f2360U     // Catch:{ IllegalStateException -> 0x01e9 }
            r1 = 2
            if (r0 != r1) goto L_0x0146
        L_0x013f:
            r19.m2065L()     // Catch:{ IllegalStateException -> 0x01e9 }
            r18 = 0
            goto L_0x01d3
        L_0x0146:
            r18 = 0
            goto L_0x01d3
        L_0x014a:
            int r0 = p000.blm.f4293a     // Catch:{ IllegalStateException -> 0x01e9 }
            if (r0 >= r15) goto L_0x0034
            android.media.MediaCodec r0 = r14.f2369g     // Catch:{ IllegalStateException -> 0x01e9 }
            java.nio.ByteBuffer[] r0 = r0.getOutputBuffers()     // Catch:{ IllegalStateException -> 0x01e9 }
            r14.f2351L = r0     // Catch:{ IllegalStateException -> 0x01e9 }
            goto L_0x0034
        L_0x0158:
            boolean r0 = r14.f2345F     // Catch:{ IllegalStateException -> 0x01e9 }
            if (r0 != 0) goto L_0x0161
            r17 = 1
            r18 = 0
            goto L_0x019f
        L_0x0161:
            boolean r0 = r14.f2363X     // Catch:{ IllegalStateException -> 0x01e9 }
            if (r0 == 0) goto L_0x019b
            android.media.MediaCodec r6 = r14.f2369g     // Catch:{ IllegalStateException -> 0x018d }
            java.nio.ByteBuffer r7 = r14.f2355P     // Catch:{ IllegalStateException -> 0x018d }
            int r8 = r14.f2354O     // Catch:{ IllegalStateException -> 0x018d }
            android.media.MediaCodec$BufferInfo r0 = r14.f2379q     // Catch:{ IllegalStateException -> 0x018d }
            int r9 = r0.flags     // Catch:{ IllegalStateException -> 0x018d }
            android.media.MediaCodec$BufferInfo r0 = r14.f2379q     // Catch:{ IllegalStateException -> 0x018d }
            long r10 = r0.presentationTimeUs     // Catch:{ IllegalStateException -> 0x018d }
            boolean r0 = r14.f2356Q     // Catch:{ IllegalStateException -> 0x018d }
            boolean r4 = r14.f2357R     // Catch:{ IllegalStateException -> 0x018d }
            r1 = r19
            r2 = r20
            r16 = r4
            r4 = r22
            r17 = 1
            r12 = r0
            r18 = 0
            r13 = r16
            boolean r0 = r1.mo681a(r2, r4, r6, r7, r8, r9, r10, r12, r13)     // Catch:{ IllegalStateException -> 0x018b }
            goto L_0x01bb
        L_0x018b:
            r0 = move-exception
            goto L_0x0190
        L_0x018d:
            r0 = move-exception
            r18 = 0
        L_0x0190:
            r19.m2065L()     // Catch:{ IllegalStateException -> 0x01e7 }
            boolean r0 = r14.f2371i     // Catch:{ IllegalStateException -> 0x01e7 }
            if (r0 == 0) goto L_0x01d3
            r19.mo1322A()     // Catch:{ IllegalStateException -> 0x01e7 }
            goto L_0x01d3
        L_0x019b:
            r17 = 1
            r18 = 0
        L_0x019f:
            android.media.MediaCodec r6 = r14.f2369g     // Catch:{ IllegalStateException -> 0x01e7 }
            java.nio.ByteBuffer r7 = r14.f2355P     // Catch:{ IllegalStateException -> 0x01e7 }
            int r8 = r14.f2354O     // Catch:{ IllegalStateException -> 0x01e7 }
            android.media.MediaCodec$BufferInfo r0 = r14.f2379q     // Catch:{ IllegalStateException -> 0x01e7 }
            int r9 = r0.flags     // Catch:{ IllegalStateException -> 0x01e7 }
            android.media.MediaCodec$BufferInfo r0 = r14.f2379q     // Catch:{ IllegalStateException -> 0x01e7 }
            long r10 = r0.presentationTimeUs     // Catch:{ IllegalStateException -> 0x01e7 }
            boolean r12 = r14.f2356Q     // Catch:{ IllegalStateException -> 0x01e7 }
            boolean r13 = r14.f2357R     // Catch:{ IllegalStateException -> 0x01e7 }
            r1 = r19
            r2 = r20
            r4 = r22
            boolean r0 = r1.mo681a(r2, r4, r6, r7, r8, r9, r10, r12, r13)     // Catch:{ IllegalStateException -> 0x01e7 }
        L_0x01bb:
            if (r0 != 0) goto L_0x01be
            goto L_0x01d3
        L_0x01be:
            android.media.MediaCodec$BufferInfo r0 = r14.f2379q     // Catch:{ IllegalStateException -> 0x01e7 }
            long r0 = r0.presentationTimeUs     // Catch:{ IllegalStateException -> 0x01e7 }
            r14.mo683c(r0)     // Catch:{ IllegalStateException -> 0x01e7 }
            android.media.MediaCodec$BufferInfo r0 = r14.f2379q     // Catch:{ IllegalStateException -> 0x01e7 }
            int r0 = r0.flags     // Catch:{ IllegalStateException -> 0x01e7 }
            r19.m2060G()     // Catch:{ IllegalStateException -> 0x01e7 }
            r0 = r0 & 4
            if (r0 == 0) goto L_0x01dd
            r19.m2065L()     // Catch:{ IllegalStateException -> 0x01e7 }
        L_0x01d3:
            boolean r0 = r19.m2061H()     // Catch:{ IllegalStateException -> 0x01e7 }
            if (r0 != 0) goto L_0x01d3
            p000.blk.m3618a()     // Catch:{ IllegalStateException -> 0x01e7 }
            return
        L_0x01dd:
            r12 = 1
            r13 = 0
            goto L_0x0034
        L_0x01e1:
            r18 = 0
            r19.mo684x()     // Catch:{ IllegalStateException -> 0x01e7 }
            return
        L_0x01e7:
            r0 = move-exception
            goto L_0x01ec
        L_0x01e9:
            r0 = move-exception
            r18 = 0
        L_0x01ec:
            int r1 = p000.blm.f4293a
            if (r1 < r15) goto L_0x01f4
            boolean r1 = r0 instanceof android.media.MediaCodec.CodecException
            if (r1 != 0) goto L_0x020a
        L_0x01f4:
            java.lang.StackTraceElement[] r1 = r0.getStackTrace()
            int r2 = r1.length
            if (r2 <= 0) goto L_0x0215
            r1 = r1[r18]
            java.lang.String r1 = r1.getClassName()
            java.lang.String r2 = "android.media.MediaCodec"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x020a
            goto L_0x0215
        L_0x020a:
            atd r1 = r14.f2370h
            ate r0 = r14.mo1325a(r0, r1)
            ajh r0 = p000.ajh.m642a(r0)
            throw r0
        L_0x0215:
            goto L_0x0217
        L_0x0216:
            throw r0
        L_0x0217:
            goto L_0x0216
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.atg.mo484a(long, long):void");
    }

    /* renamed from: D */
    private final void m2057D() {
        if (blm.f4293a < 21) {
            this.f2350K = null;
            this.f2351L = null;
        }
    }

    /* renamed from: F */
    private final void m2059F() {
        this.f2353N = -1;
        this.f2375m.f1425c = null;
    }

    /* renamed from: G */
    private final void m2060G() {
        this.f2354O = -1;
        this.f2355P = null;
    }

    /* renamed from: a */
    public final void mo346a(float f) {
        this.f2384v = f;
        if (this.f2369g != null && this.f2361V != 3 && this.f421b != 0) {
            m2062I();
        }
    }

    /* renamed from: a */
    public final int mo487a(akh akh) {
        try {
            return mo675a(this.f2373k, akh);
        } catch (ato e) {
            throw ajh.m642a(e);
        }
    }

    /* renamed from: I */
    private final void m2062I() {
        if (blm.f4293a >= 23) {
            float a = mo673a(this.f2384v, this.f423d);
            float f = this.f2386x;
            if (f == a) {
                return;
            }
            if (a == -1.0f) {
                m2064K();
            } else if (f != -1.0f || a > this.f2374l) {
                Bundle bundle = new Bundle();
                bundle.putFloat("operating-rate", a);
                this.f2369g.setParameters(bundle);
                this.f2386x = a;
            }
        }
    }

    /* renamed from: N */
    private final void m2067N() {
        m2066M();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final akh mo1328d(long j) {
        akh akh = (akh) this.f2377o.mo2110a(j);
        if (akh != null) {
            this.f2381s = akh;
        }
        return akh;
    }
}
