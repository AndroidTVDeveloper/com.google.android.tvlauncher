package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/* renamed from: atg  reason: default package */
/* compiled from: PG */
public abstract class atg extends aiz {
    private static final byte[] f = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    private int A;
    private boolean B;
    private boolean C;
    private boolean D;
    private boolean E;
    private boolean F;
    private boolean G;
    private boolean H;
    private boolean I;
    private boolean J;
    private ByteBuffer[] K;
    private ByteBuffer[] L;
    private long M;
    private int N;
    private int O;
    private ByteBuffer P;
    private boolean Q;
    private boolean R;
    private boolean S;
    private int T = 0;
    private int U = 0;
    private int V = 0;
    private boolean W;
    private boolean X;
    private long Y;
    private long Z;
    private boolean aa;
    private boolean ab;
    private boolean ac;
    public MediaCodec g;
    public atd h;
    public boolean i;
    public ani j;
    private final ati k;
    private final float l;
    private final anj m = new anj(0);
    private final anj n = new anj(0);
    private final bli o = new bli();
    private final ArrayList p = new ArrayList();
    private final MediaCodec.BufferInfo q = new MediaCodec.BufferInfo();
    private akh r;
    private akh s;
    private ans t;
    private ans u;
    private float v = 1.0f;
    private akh w;
    private float x = -1.0f;
    private ArrayDeque y;
    private atf z;

    private final boolean E() {
        return this.O >= 0;
    }

    /* access modifiers changed from: protected */
    public float a(float f2, akh[] akhArr) {
        throw null;
    }

    /* access modifiers changed from: protected */
    public int a(atd atd, akh akh, akh akh2) {
        throw null;
    }

    /* access modifiers changed from: protected */
    public abstract int a(ati ati, akh akh);

    /* access modifiers changed from: protected */
    public void a(MediaCodec mediaCodec, MediaFormat mediaFormat) {
    }

    /* access modifiers changed from: protected */
    public void a(anj anj) {
    }

    /* access modifiers changed from: protected */
    public abstract void a(atd atd, MediaCodec mediaCodec, akh akh, float f2);

    /* access modifiers changed from: protected */
    public void a(String str, long j2, long j3) {
    }

    /* access modifiers changed from: protected */
    public abstract boolean a(long j2, long j3, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i2, int i3, long j4, boolean z2, boolean z3);

    /* access modifiers changed from: protected */
    public boolean a(atd atd) {
        return true;
    }

    /* access modifiers changed from: protected */
    public abstract List b(ati ati, akh akh);

    /* access modifiers changed from: protected */
    public void b(anj anj) {
    }

    /* access modifiers changed from: protected */
    public void c(long j2) {
    }

    public final int o() {
        return 8;
    }

    public boolean w() {
        return this.i;
    }

    /* access modifiers changed from: protected */
    public void x() {
    }

    /* access modifiers changed from: protected */
    public boolean z() {
        return false;
    }

    public atg(int i2, ati ati, float f2) {
        super(i2);
        this.k = (ati) bks.a(ati);
        this.l = f2;
    }

    /* access modifiers changed from: protected */
    public ate a(Throwable th, atd atd) {
        return new ate(th, atd);
    }

    private final void K() {
        if (this.W) {
            this.U = 1;
            this.V = 3;
            return;
        }
        M();
    }

    private final void J() {
        if (blm.a < 23) {
            K();
        } else if (this.W) {
            this.U = 1;
            this.V = 2;
        } else {
            N();
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
    private final boolean H() {
        ByteBuffer byteBuffer;
        MediaCodec mediaCodec = this.g;
        if (mediaCodec == null || this.U == 2 || this.aa) {
            return false;
        }
        if (this.N < 0) {
            int dequeueInputBuffer = mediaCodec.dequeueInputBuffer(0);
            this.N = dequeueInputBuffer;
            if (dequeueInputBuffer < 0) {
                return false;
            }
            anj anj = this.m;
            if (blm.a < 21) {
                byteBuffer = this.K[dequeueInputBuffer];
            } else {
                byteBuffer = this.g.getInputBuffer(dequeueInputBuffer);
            }
            anj.c = byteBuffer;
            this.m.a();
        }
        if (this.U == 1) {
            if (!this.J) {
                this.X = true;
                this.g.queueInputBuffer(this.N, 0, 0, 0, 4);
                F();
            }
            this.U = 2;
            return false;
        } else if (this.H) {
            this.H = false;
            this.m.c.put(f);
            this.g.queueInputBuffer(this.N, 0, f.length, 0, 0);
            F();
            this.W = true;
            return true;
        } else {
            aki t2 = t();
            if (this.T == 1) {
                for (int i2 = 0; i2 < this.w.k.size(); i2++) {
                    this.m.c.put((byte[]) this.w.k.get(i2));
                }
                this.T = 2;
            }
            int position = this.m.c.position();
            int a = a(t2, this.m, false);
            if (g()) {
                this.Y = this.Z;
            }
            if (a == -3) {
                return false;
            }
            if (a == -5) {
                if (this.T == 2) {
                    this.m.a();
                    this.T = 1;
                }
                a(t2);
                return true;
            } else if (this.m.c()) {
                if (this.T == 2) {
                    this.m.a();
                    this.T = 1;
                }
                this.aa = true;
                if (this.W) {
                    try {
                        if (!this.J) {
                            this.X = true;
                            this.g.queueInputBuffer(this.N, 0, 0, 0, 4);
                            F();
                        }
                        return false;
                    } catch (MediaCodec.CryptoException e) {
                        throw ajh.a((Exception) e);
                    }
                } else {
                    L();
                    return false;
                }
            } else if (!this.ab || this.m.b(1)) {
                this.ab = false;
                boolean f2 = this.m.f();
                ans ans = this.t;
                if (ans == null) {
                    if (this.C && !f2) {
                        bkw.a(this.m.c);
                        if (this.m.c.position() == 0) {
                            return true;
                        }
                        this.C = false;
                    }
                    try {
                        anj anj2 = this.m;
                        long j2 = anj2.d;
                        if (anj2.T()) {
                            this.p.add(Long.valueOf(j2));
                        }
                        if (this.ac) {
                            this.o.a(j2, this.r);
                            this.ac = false;
                        }
                        this.Z = Math.max(this.Z, j2);
                        this.m.g();
                        if (this.m.d()) {
                            b(this.m);
                        }
                        a(this.m);
                        if (!f2) {
                            this.g.queueInputBuffer(this.N, 0, this.m.c.limit(), j2, 0);
                        } else {
                            MediaCodec.CryptoInfo cryptoInfo = this.m.b.d;
                            if (position != 0) {
                                if (cryptoInfo.numBytesOfClearData == null) {
                                    cryptoInfo.numBytesOfClearData = new int[1];
                                }
                                int[] iArr = cryptoInfo.numBytesOfClearData;
                                iArr[0] = iArr[0] + position;
                            }
                            this.g.queueSecureInputBuffer(this.N, 0, cryptoInfo, j2, 0);
                        }
                        F();
                        this.W = true;
                        this.T = 0;
                        this.j.c++;
                        return true;
                    } catch (MediaCodec.CryptoException e2) {
                        throw ajh.a((Exception) e2);
                    }
                } else {
                    throw ajh.a(((anv) ans).a);
                }
            } else {
                this.m.a();
                if (this.T == 2) {
                    this.T = 1;
                }
                return true;
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void C() {
        if (B()) {
            y();
        }
    }

    /* access modifiers changed from: protected */
    public boolean B() {
        MediaCodec mediaCodec = this.g;
        if (mediaCodec == null) {
            return false;
        }
        if (this.V == 3 || this.D || (this.E && this.X)) {
            A();
            return true;
        }
        mediaCodec.flush();
        F();
        G();
        this.M = -9223372036854775807L;
        this.X = false;
        this.W = false;
        this.ab = true;
        this.H = false;
        this.I = false;
        this.Q = false;
        this.R = false;
        this.p.clear();
        this.Z = -9223372036854775807L;
        this.Y = -9223372036854775807L;
        this.U = 0;
        this.V = 0;
        this.T = this.S ? 1 : 0;
        return false;
    }

    public boolean v() {
        boolean z2;
        if (this.r == null) {
            return false;
        }
        if (!g()) {
            z2 = this.c.a();
        } else {
            z2 = this.e;
        }
        if (z2 || E()) {
            return true;
        }
        return this.M != -9223372036854775807L && SystemClock.elapsedRealtime() < this.M;
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
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void y() {
        /*
            r16 = this;
            r7 = r16
            android.media.MediaCodec r0 = r7.g
            if (r0 != 0) goto L_0x0363
            akh r0 = r7.r
            if (r0 == 0) goto L_0x0363
            ans r0 = r7.u
            r7.t = r0
            if (r0 == 0) goto L_0x0027
            anv r0 = (defpackage.anv) r0
            anr r0 = r0.a
            if (r0 == 0) goto L_0x0026
            boolean r0 = defpackage.anw.a
            if (r0 != 0) goto L_0x001b
            goto L_0x0027
        L_0x001b:
            ans r0 = r7.t
            anv r0 = (defpackage.anv) r0
            anr r0 = r0.a
            ajh r0 = defpackage.ajh.a(r0)
            throw r0
        L_0x0026:
            return
        L_0x0027:
            java.util.ArrayDeque r0 = r7.y     // Catch:{ atf -> 0x035d }
            r8 = 0
            r9 = 0
            if (r0 != 0) goto L_0x0060
            ati r0 = r7.k     // Catch:{ ato -> 0x0054 }
            akh r1 = r7.r     // Catch:{ ato -> 0x0054 }
            java.util.List r0 = r7.b(r0, r1)     // Catch:{ ato -> 0x0054 }
            r0.isEmpty()     // Catch:{ ato -> 0x0054 }
            java.util.ArrayDeque r1 = new java.util.ArrayDeque     // Catch:{ ato -> 0x0054 }
            r1.<init>()     // Catch:{ ato -> 0x0054 }
            r7.y = r1     // Catch:{ ato -> 0x0054 }
            boolean r1 = r0.isEmpty()     // Catch:{ ato -> 0x0054 }
            if (r1 != 0) goto L_0x0050
            java.util.ArrayDeque r1 = r7.y     // Catch:{ ato -> 0x0054 }
            java.lang.Object r0 = r0.get(r9)     // Catch:{ ato -> 0x0054 }
            atd r0 = (defpackage.atd) r0     // Catch:{ ato -> 0x0054 }
            r1.add(r0)     // Catch:{ ato -> 0x0054 }
        L_0x0050:
            r7.z = r8     // Catch:{ ato -> 0x0054 }
            goto L_0x0060
        L_0x0054:
            r0 = move-exception
            atf r1 = new atf     // Catch:{ atf -> 0x035d }
            akh r2 = r7.r     // Catch:{ atf -> 0x035d }
            r3 = -49998(0xffffffffffff3cb2, float:NaN)
            r1.<init>(r2, r0, r3)     // Catch:{ atf -> 0x035d }
            throw r1     // Catch:{ atf -> 0x035d }
        L_0x0060:
            java.util.ArrayDeque r0 = r7.y     // Catch:{ atf -> 0x035d }
            boolean r0 = r0.isEmpty()     // Catch:{ atf -> 0x035d }
            if (r0 != 0) goto L_0x0351
        L_0x0068:
            android.media.MediaCodec r0 = r7.g     // Catch:{ atf -> 0x035d }
            if (r0 != 0) goto L_0x034c
            java.util.ArrayDeque r0 = r7.y     // Catch:{ atf -> 0x035d }
            java.lang.Object r0 = r0.peekFirst()     // Catch:{ atf -> 0x035d }
            r10 = r0
            atd r10 = (defpackage.atd) r10     // Catch:{ atf -> 0x035d }
            boolean r0 = r7.a(r10)     // Catch:{ atf -> 0x035d }
            if (r0 == 0) goto L_0x034b
            java.lang.String r2 = r10.a     // Catch:{ Exception -> 0x02ed }
            int r0 = defpackage.blm.a     // Catch:{ Exception -> 0x02ed }
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r3 = 23
            if (r0 < r3) goto L_0x008e
            float r0 = r7.v     // Catch:{ Exception -> 0x02ed }
            akh[] r4 = r7.d     // Catch:{ Exception -> 0x02ed }
            float r0 = r7.a(r0, r4)     // Catch:{ Exception -> 0x02ed }
            goto L_0x0091
        L_0x008e:
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x0091:
            float r4 = r7.l     // Catch:{ Exception -> 0x02ed }
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
            defpackage.blk.a(r6)     // Catch:{ Exception -> 0x02de }
            android.media.MediaCodec r1 = android.media.MediaCodec.createByCodecName(r2)     // Catch:{ Exception -> 0x02de }
            defpackage.blk.a()     // Catch:{ Exception -> 0x02db }
            java.lang.String r6 = "configureCodec"
            defpackage.blk.a(r6)     // Catch:{ Exception -> 0x02db }
            akh r6 = r7.r     // Catch:{ Exception -> 0x02db }
            r7.a(r10, r1, r6, r0)     // Catch:{ Exception -> 0x02db }
            defpackage.blk.a()     // Catch:{ Exception -> 0x02db }
            java.lang.String r6 = "startCodec"
            defpackage.blk.a(r6)     // Catch:{ Exception -> 0x02db }
            r1.start()     // Catch:{ Exception -> 0x02db }
            defpackage.blk.a()     // Catch:{ Exception -> 0x02db }
            long r11 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x02db }
            int r6 = defpackage.blm.a     // Catch:{ Exception -> 0x02db }
            r13 = 21
            if (r6 >= r13) goto L_0x00ed
            java.nio.ByteBuffer[] r6 = r1.getInputBuffers()     // Catch:{ Exception -> 0x02db }
            r7.K = r6     // Catch:{ Exception -> 0x02db }
            java.nio.ByteBuffer[] r6 = r1.getOutputBuffers()     // Catch:{ Exception -> 0x02db }
            r7.L = r6     // Catch:{ Exception -> 0x02db }
        L_0x00ed:
            r7.g = r1     // Catch:{ Exception -> 0x02ed }
            r7.h = r10     // Catch:{ Exception -> 0x02ed }
            r7.x = r0     // Catch:{ Exception -> 0x02ed }
            akh r0 = r7.r     // Catch:{ Exception -> 0x02ed }
            r7.w = r0     // Catch:{ Exception -> 0x02ed }
            int r0 = defpackage.blm.a     // Catch:{ Exception -> 0x02ed }
            java.lang.String r1 = "OMX.Exynos.avc.dec.secure"
            r6 = 25
            r15 = 1
            if (r0 > r6) goto L_0x0131
            boolean r0 = r1.equals(r2)     // Catch:{ Exception -> 0x02ed }
            if (r0 == 0) goto L_0x0131
            java.lang.String r0 = defpackage.blm.d     // Catch:{ Exception -> 0x02ed }
            java.lang.String r8 = "SM-T585"
            boolean r0 = r0.startsWith(r8)     // Catch:{ Exception -> 0x02ed }
            if (r0 != 0) goto L_0x012f
            java.lang.String r0 = defpackage.blm.d     // Catch:{ Exception -> 0x02ed }
            java.lang.String r8 = "SM-A510"
            boolean r0 = r0.startsWith(r8)     // Catch:{ Exception -> 0x02ed }
            if (r0 != 0) goto L_0x012f
            java.lang.String r0 = defpackage.blm.d     // Catch:{ Exception -> 0x02ed }
            java.lang.String r8 = "SM-A520"
            boolean r0 = r0.startsWith(r8)     // Catch:{ Exception -> 0x02ed }
            if (r0 != 0) goto L_0x012f
            java.lang.String r0 = defpackage.blm.d     // Catch:{ Exception -> 0x02ed }
            java.lang.String r8 = "SM-J700"
            boolean r0 = r0.startsWith(r8)     // Catch:{ Exception -> 0x02ed }
            if (r0 != 0) goto L_0x012f
            goto L_0x0131
        L_0x012f:
            r0 = 2
            goto L_0x0176
        L_0x0131:
            int r0 = defpackage.blm.a     // Catch:{ Exception -> 0x02ed }
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
            java.lang.String r8 = defpackage.blm.b     // Catch:{ Exception -> 0x02ed }
            boolean r0 = r0.equals(r8)     // Catch:{ Exception -> 0x02ed }
            if (r0 != 0) goto L_0x0173
            java.lang.String r0 = "flounder_lte"
            java.lang.String r8 = defpackage.blm.b     // Catch:{ Exception -> 0x02ed }
            boolean r0 = r0.equals(r8)     // Catch:{ Exception -> 0x02ed }
            if (r0 != 0) goto L_0x0173
            java.lang.String r0 = "grouper"
            java.lang.String r8 = defpackage.blm.b     // Catch:{ Exception -> 0x02ed }
            boolean r0 = r0.equals(r8)     // Catch:{ Exception -> 0x02ed }
            if (r0 != 0) goto L_0x0173
            java.lang.String r0 = "tilapia"
            java.lang.String r8 = defpackage.blm.b     // Catch:{ Exception -> 0x02ed }
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
            r7.A = r0     // Catch:{ Exception -> 0x02ed }
            java.lang.String r0 = defpackage.blm.d     // Catch:{ Exception -> 0x02ed }
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
            r7.B = r0     // Catch:{ Exception -> 0x02ed }
            akh r0 = r7.w     // Catch:{ Exception -> 0x02ed }
            int r8 = defpackage.blm.a     // Catch:{ Exception -> 0x02ed }
            if (r8 >= r13) goto L_0x01a9
            java.util.List r0 = r0.k     // Catch:{ Exception -> 0x02ed }
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
            r7.C = r0     // Catch:{ Exception -> 0x02ed }
            int r0 = defpackage.blm.a     // Catch:{ Exception -> 0x02ed }
            r8 = 19
            r9 = 18
            if (r0 < r9) goto L_0x01e8
            int r0 = defpackage.blm.a     // Catch:{ Exception -> 0x02ed }
            if (r0 != r9) goto L_0x01c8
            java.lang.String r0 = "OMX.SEC.avc.dec"
            boolean r0 = r0.equals(r2)     // Catch:{ Exception -> 0x02ed }
            if (r0 != 0) goto L_0x01e8
            java.lang.String r0 = "OMX.SEC.avc.dec.secure"
            boolean r0 = r0.equals(r2)     // Catch:{ Exception -> 0x02ed }
            if (r0 != 0) goto L_0x01e8
        L_0x01c8:
            int r0 = defpackage.blm.a     // Catch:{ Exception -> 0x02ed }
            if (r0 != r8) goto L_0x01e6
            java.lang.String r0 = defpackage.blm.d     // Catch:{ Exception -> 0x02ed }
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
            r7.D = r0     // Catch:{ Exception -> 0x02ed }
            int r0 = defpackage.blm.a     // Catch:{ Exception -> 0x02ed }
            if (r0 > r3) goto L_0x01fa
            java.lang.String r0 = "OMX.google.vorbis.decoder"
            boolean r0 = r0.equals(r2)     // Catch:{ Exception -> 0x02ed }
            if (r0 != 0) goto L_0x01f8
            goto L_0x01fa
        L_0x01f8:
            r0 = 1
            goto L_0x0225
        L_0x01fa:
            int r0 = defpackage.blm.a     // Catch:{ Exception -> 0x02ed }
            if (r0 > r8) goto L_0x0224
            java.lang.String r0 = "hb2000"
            java.lang.String r1 = defpackage.blm.b     // Catch:{ Exception -> 0x02ed }
            boolean r0 = r0.equals(r1)     // Catch:{ Exception -> 0x02ed }
            if (r0 != 0) goto L_0x0212
            java.lang.String r0 = "stvm8"
            java.lang.String r1 = defpackage.blm.b     // Catch:{ Exception -> 0x02ed }
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
            r7.E = r0     // Catch:{ Exception -> 0x02ed }
            int r0 = defpackage.blm.a     // Catch:{ Exception -> 0x02ed }
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
            r7.F = r0     // Catch:{ Exception -> 0x02ed }
            akh r0 = r7.w     // Catch:{ Exception -> 0x02ed }
            int r1 = defpackage.blm.a     // Catch:{ Exception -> 0x02ed }
            if (r1 > r9) goto L_0x024e
            int r0 = r0.v     // Catch:{ Exception -> 0x02ed }
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
            r7.G = r0     // Catch:{ Exception -> 0x02ed }
            java.lang.String r0 = r10.a     // Catch:{ Exception -> 0x02ed }
            int r1 = defpackage.blm.a     // Catch:{ Exception -> 0x02ed }
            if (r1 > r6) goto L_0x0262
            java.lang.String r1 = "OMX.rk.video_decoder.avc"
            boolean r1 = r1.equals(r0)     // Catch:{ Exception -> 0x02ed }
            if (r1 != 0) goto L_0x0260
            goto L_0x0262
        L_0x0260:
            r0 = 1
            goto L_0x0293
        L_0x0262:
            int r1 = defpackage.blm.a     // Catch:{ Exception -> 0x02ed }
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
            java.lang.String r1 = defpackage.blm.c     // Catch:{ Exception -> 0x02ed }
            boolean r0 = r0.equals(r1)     // Catch:{ Exception -> 0x02ed }
            if (r0 == 0) goto L_0x028a
            java.lang.String r0 = "AFTS"
            java.lang.String r1 = defpackage.blm.d     // Catch:{ Exception -> 0x02ed }
            boolean r0 = r0.equals(r1)     // Catch:{ Exception -> 0x02ed }
            if (r0 == 0) goto L_0x028a
            boolean r0 = r10.e     // Catch:{ Exception -> 0x02ed }
            if (r0 != 0) goto L_0x0260
        L_0x028a:
            boolean r0 = r16.z()     // Catch:{ Exception -> 0x02ed }
            if (r0 != 0) goto L_0x0292
            r0 = 0
            goto L_0x0293
        L_0x0292:
            goto L_0x0260
        L_0x0293:
            r7.J = r0     // Catch:{ Exception -> 0x02ed }
            r16.F()     // Catch:{ Exception -> 0x02ed }
            r16.G()     // Catch:{ Exception -> 0x02ed }
            int r0 = r7.b     // Catch:{ Exception -> 0x02ed }
            r1 = 2
            if (r0 != r1) goto L_0x02a8
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x02ed }
            r8 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 + r8
            goto L_0x02ae
        L_0x02a8:
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x02ae:
            r7.M = r0     // Catch:{ Exception -> 0x02ed }
            r8 = 0
            r7.S = r8     // Catch:{ Exception -> 0x02eb }
            r7.T = r8     // Catch:{ Exception -> 0x02eb }
            r7.X = r8     // Catch:{ Exception -> 0x02eb }
            r7.W = r8     // Catch:{ Exception -> 0x02eb }
            r7.U = r8     // Catch:{ Exception -> 0x02eb }
            r7.V = r8     // Catch:{ Exception -> 0x02eb }
            r7.H = r8     // Catch:{ Exception -> 0x02eb }
            r7.I = r8     // Catch:{ Exception -> 0x02eb }
            r7.Q = r8     // Catch:{ Exception -> 0x02eb }
            r7.R = r8     // Catch:{ Exception -> 0x02eb }
            r7.ab = r15     // Catch:{ Exception -> 0x02eb }
            ani r0 = r7.j     // Catch:{ Exception -> 0x02eb }
            int r1 = r0.a     // Catch:{ Exception -> 0x02eb }
            int r1 = r1 + r15
            r0.a = r1     // Catch:{ Exception -> 0x02eb }
            long r13 = r11 - r4
            r1 = r16
            r3 = r11
            r5 = r13
            r1.a(r2, r3, r5)     // Catch:{ Exception -> 0x02eb }
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
            r16.D()     // Catch:{ Exception -> 0x02eb }
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
            java.util.ArrayDeque r1 = r7.y     // Catch:{ atf -> 0x035d }
            r1.removeFirst()     // Catch:{ atf -> 0x035d }
            atf r1 = new atf     // Catch:{ atf -> 0x035d }
            akh r2 = r7.r     // Catch:{ atf -> 0x035d }
            r1.<init>(r2, r0, r10)     // Catch:{ atf -> 0x035d }
            atf r0 = r7.z     // Catch:{ atf -> 0x035d }
            if (r0 == 0) goto L_0x033a
            atf r1 = new atf     // Catch:{ atf -> 0x035d }
            java.lang.String r10 = r0.getMessage()     // Catch:{ atf -> 0x035d }
            java.lang.Throwable r11 = r0.getCause()     // Catch:{ atf -> 0x035d }
            java.lang.String r12 = r0.a     // Catch:{ atf -> 0x035d }
            atd r13 = r0.b     // Catch:{ atf -> 0x035d }
            java.lang.String r14 = r0.c     // Catch:{ atf -> 0x035d }
            r9 = r1
            r9.<init>(r10, r11, r12, r13, r14)     // Catch:{ atf -> 0x035d }
            r7.z = r1     // Catch:{ atf -> 0x035d }
            goto L_0x033c
        L_0x033a:
            r7.z = r1     // Catch:{ atf -> 0x035d }
        L_0x033c:
            java.util.ArrayDeque r0 = r7.y     // Catch:{ atf -> 0x035d }
            boolean r0 = r0.isEmpty()     // Catch:{ atf -> 0x035d }
            if (r0 != 0) goto L_0x0348
            r8 = 0
            r9 = 0
            goto L_0x0068
        L_0x0348:
            atf r0 = r7.z     // Catch:{ atf -> 0x035d }
            throw r0     // Catch:{ atf -> 0x035d }
        L_0x034b:
            return
        L_0x034c:
            r1 = 0
            r7.y = r1     // Catch:{ atf -> 0x035d }
            return
        L_0x0351:
            atf r0 = new atf     // Catch:{ atf -> 0x035d }
            akh r1 = r7.r     // Catch:{ atf -> 0x035d }
            r2 = -49999(0xffffffffffff3cb1, float:NaN)
            r3 = 0
            r0.<init>(r1, r3, r2)     // Catch:{ atf -> 0x035d }
            throw r0     // Catch:{ atf -> 0x035d }
        L_0x035d:
            r0 = move-exception
            ajh r0 = defpackage.ajh.a(r0)
            throw r0
        L_0x0363:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.atg.y():void");
    }

    /* access modifiers changed from: protected */
    public void r() {
        this.r = null;
        if (this.u == null && this.t == null) {
            B();
        } else {
            s();
        }
    }

    /* access modifiers changed from: protected */
    public void a(boolean z2) {
        this.j = new ani();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00b3, code lost:
        if (r1.o == r2.o) goto L_0x00a3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(defpackage.aki r6) {
        /*
            r5 = this;
            r0 = 1
            r5.ac = r0
            akh r1 = r6.c
            java.lang.Object r1 = defpackage.bks.a(r1)
            akh r1 = (defpackage.akh) r1
            boolean r2 = r6.a
            if (r2 == 0) goto L_0x0014
            ans r6 = r6.b
            r5.u = r6
            goto L_0x0041
        L_0x0014:
            akh r6 = r5.r
            ans r2 = r5.u
            anq r3 = r1.l
            r4 = 0
            if (r6 == 0) goto L_0x0020
            anq r6 = r6.l
            goto L_0x0022
        L_0x0020:
            r6 = r4
        L_0x0022:
            boolean r6 = defpackage.blm.a(r3, r6)
            r6 = r6 ^ r0
            if (r6 == 0) goto L_0x003e
            anq r6 = r1.l
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
            ajh r6 = defpackage.ajh.a(r6)
            throw r6
        L_0x003e:
            r4 = r2
        L_0x003f:
            r5.u = r4
        L_0x0041:
            r5.r = r1
            android.media.MediaCodec r6 = r5.g
            if (r6 == 0) goto L_0x00e7
            ans r6 = r5.u
            if (r6 != 0) goto L_0x004f
            ans r2 = r5.t
            if (r2 != 0) goto L_0x006b
        L_0x004f:
            if (r6 == 0) goto L_0x0056
            ans r2 = r5.t
            if (r2 != 0) goto L_0x0056
            goto L_0x006b
        L_0x0056:
            if (r6 == 0) goto L_0x005e
            atd r6 = r5.h
            boolean r6 = r6.e
            if (r6 == 0) goto L_0x006b
        L_0x005e:
            int r6 = defpackage.blm.a
            r2 = 23
            if (r6 < r2) goto L_0x0065
            goto L_0x006f
        L_0x0065:
            ans r6 = r5.u
            ans r2 = r5.t
            if (r6 == r2) goto L_0x006f
        L_0x006b:
            r5.K()
            return
        L_0x006f:
            atd r6 = r5.h
            akh r2 = r5.w
            int r6 = r5.a(r6, r2, r1)
            if (r6 == 0) goto L_0x00e3
            if (r6 == r0) goto L_0x00cb
            r2 = 2
            if (r6 == r2) goto L_0x0096
            r0 = 3
            if (r6 != r0) goto L_0x0090
            r5.w = r1
            r5.I()
            ans r6 = r5.u
            ans r0 = r5.t
            if (r6 == r0) goto L_0x00de
            r5.J()
            return
        L_0x0090:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            r6.<init>()
            throw r6
        L_0x0096:
            boolean r6 = r5.B
            if (r6 != 0) goto L_0x00c7
            r5.S = r0
            r5.T = r0
            int r6 = r5.A
            r3 = 0
            if (r6 != r2) goto L_0x00a5
        L_0x00a3:
            r3 = 1
            goto L_0x00b6
        L_0x00a5:
            if (r6 != r0) goto L_0x00b5
            int r6 = r1.n
            akh r2 = r5.w
            int r4 = r2.n
            if (r6 != r4) goto L_0x00b5
            int r6 = r1.o
            int r2 = r2.o
            if (r6 == r2) goto L_0x00a3
        L_0x00b5:
        L_0x00b6:
            r5.H = r3
            r5.w = r1
            r5.I()
            ans r6 = r5.u
            ans r0 = r5.t
            if (r6 == r0) goto L_0x00de
            r5.J()
            return
        L_0x00c7:
            r5.K()
            return
        L_0x00cb:
            r5.w = r1
            r5.I()
            ans r6 = r5.u
            ans r1 = r5.t
            if (r6 != r1) goto L_0x00df
            boolean r6 = r5.W
            if (r6 == 0) goto L_0x00de
            r5.U = r0
            r5.V = r0
        L_0x00de:
            return
        L_0x00df:
            r5.J()
            return
        L_0x00e3:
            r5.K()
            return
        L_0x00e7:
            r5.y()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.atg.a(aki):void");
    }

    /* access modifiers changed from: protected */
    public void a(long j2, boolean z2) {
        this.aa = false;
        this.i = false;
        C();
        this.o.a();
    }

    /* access modifiers changed from: protected */
    public void s() {
        try {
            A();
        } finally {
            this.u = null;
        }
    }

    private final void L() {
        int i2 = this.V;
        if (i2 == 1) {
            C();
        } else if (i2 == 2) {
            N();
        } else if (i2 != 3) {
            this.i = true;
            x();
        } else {
            M();
        }
    }

    private final boolean b(boolean z2) {
        aki t2 = t();
        this.n.a();
        int a = a(t2, this.n, z2);
        if (a == -5) {
            a(t2);
            return true;
        } else if (a != -4 || !this.n.c()) {
            return false;
        } else {
            this.aa = true;
            L();
            return false;
        }
    }

    private final void M() {
        A();
        y();
    }

    /* access modifiers changed from: protected */
    public void A() {
        this.y = null;
        this.h = null;
        this.w = null;
        F();
        G();
        D();
        this.M = -9223372036854775807L;
        this.p.clear();
        this.Z = -9223372036854775807L;
        this.Y = -9223372036854775807L;
        try {
            MediaCodec mediaCodec = this.g;
            if (mediaCodec != null) {
                this.j.b++;
                mediaCodec.stop();
                this.g.release();
            }
            this.g = null;
            this.t = null;
        } catch (Throwable th) {
            this.g = null;
            this.t = null;
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:0x0197 A[Catch:{ IllegalStateException -> 0x01e7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x01be A[Catch:{ IllegalStateException -> 0x01e7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x01bd A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x006b A[Catch:{ IllegalStateException -> 0x01e9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00fa A[Catch:{ IllegalStateException -> 0x01e9 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(long r20, long r22) {
        /*
            r19 = this;
            r14 = r19
            r15 = 21
            r13 = 0
            boolean r0 = r14.i     // Catch:{ IllegalStateException -> 0x01e9 }
            if (r0 != 0) goto L_0x01e1
            akh r0 = r14.r     // Catch:{ IllegalStateException -> 0x01e9 }
            r12 = 1
            if (r0 != 0) goto L_0x0016
            boolean r0 = r14.b(r12)     // Catch:{ IllegalStateException -> 0x01e9 }
            if (r0 == 0) goto L_0x0015
            goto L_0x0016
        L_0x0015:
            return
        L_0x0016:
            r19.y()     // Catch:{ IllegalStateException -> 0x01e9 }
            android.media.MediaCodec r0 = r14.g     // Catch:{ IllegalStateException -> 0x01e9 }
            if (r0 != 0) goto L_0x002c
            ani r0 = r14.j     // Catch:{ IllegalStateException -> 0x01e9 }
            int r1 = r0.d     // Catch:{ IllegalStateException -> 0x01e9 }
            int r2 = r19.b(r20)     // Catch:{ IllegalStateException -> 0x01e9 }
            int r1 = r1 + r2
            r0.d = r1     // Catch:{ IllegalStateException -> 0x01e9 }
            r14.b(r13)     // Catch:{ IllegalStateException -> 0x01e9 }
            return
        L_0x002c:
            android.os.SystemClock.elapsedRealtime()     // Catch:{ IllegalStateException -> 0x01e9 }
            java.lang.String r0 = "drainAndFeed"
            defpackage.blk.a(r0)     // Catch:{ IllegalStateException -> 0x01e9 }
        L_0x0034:
            boolean r0 = r19.E()     // Catch:{ IllegalStateException -> 0x01e9 }
            if (r0 != 0) goto L_0x0158
            boolean r0 = r14.F     // Catch:{ IllegalStateException -> 0x01e9 }
            r1 = 0
            if (r0 != 0) goto L_0x0041
            goto L_0x0061
        L_0x0041:
            boolean r0 = r14.X     // Catch:{ IllegalStateException -> 0x01e9 }
            if (r0 == 0) goto L_0x0061
            android.media.MediaCodec r0 = r14.g     // Catch:{ IllegalStateException -> 0x004e }
            android.media.MediaCodec$BufferInfo r3 = r14.q     // Catch:{ IllegalStateException -> 0x004e }
            int r0 = r0.dequeueOutputBuffer(r3, r1)     // Catch:{ IllegalStateException -> 0x004e }
            goto L_0x0069
        L_0x004e:
            r0 = move-exception
            r19.L()     // Catch:{ IllegalStateException -> 0x01e9 }
            boolean r0 = r14.i     // Catch:{ IllegalStateException -> 0x01e9 }
            if (r0 == 0) goto L_0x005d
            r19.A()     // Catch:{ IllegalStateException -> 0x01e9 }
            r18 = 0
            goto L_0x01d3
        L_0x005d:
            r18 = 0
            goto L_0x01d3
        L_0x0061:
            android.media.MediaCodec r0 = r14.g     // Catch:{ IllegalStateException -> 0x01e9 }
            android.media.MediaCodec$BufferInfo r3 = r14.q     // Catch:{ IllegalStateException -> 0x01e9 }
            int r0 = r0.dequeueOutputBuffer(r3, r1)     // Catch:{ IllegalStateException -> 0x01e9 }
        L_0x0069:
            if (r0 < 0) goto L_0x00fa
            boolean r1 = r14.I     // Catch:{ IllegalStateException -> 0x01e9 }
            if (r1 == 0) goto L_0x0077
            r14.I = r13     // Catch:{ IllegalStateException -> 0x01e9 }
            android.media.MediaCodec r1 = r14.g     // Catch:{ IllegalStateException -> 0x01e9 }
            r1.releaseOutputBuffer(r0, r13)     // Catch:{ IllegalStateException -> 0x01e9 }
            goto L_0x0034
        L_0x0077:
            android.media.MediaCodec$BufferInfo r1 = r14.q     // Catch:{ IllegalStateException -> 0x01e9 }
            int r1 = r1.size     // Catch:{ IllegalStateException -> 0x01e9 }
            if (r1 != 0) goto L_0x008d
            android.media.MediaCodec$BufferInfo r1 = r14.q     // Catch:{ IllegalStateException -> 0x01e9 }
            int r1 = r1.flags     // Catch:{ IllegalStateException -> 0x01e9 }
            r1 = r1 & 4
            if (r1 != 0) goto L_0x0086
            goto L_0x008d
        L_0x0086:
            r19.L()     // Catch:{ IllegalStateException -> 0x01e9 }
            r18 = 0
            goto L_0x01d3
        L_0x008d:
            r14.O = r0     // Catch:{ IllegalStateException -> 0x01e9 }
            int r1 = defpackage.blm.a     // Catch:{ IllegalStateException -> 0x01e9 }
            if (r1 >= r15) goto L_0x0098
            java.nio.ByteBuffer[] r1 = r14.L     // Catch:{ IllegalStateException -> 0x01e9 }
            r0 = r1[r0]     // Catch:{ IllegalStateException -> 0x01e9 }
            goto L_0x009e
        L_0x0098:
            android.media.MediaCodec r1 = r14.g     // Catch:{ IllegalStateException -> 0x01e9 }
            java.nio.ByteBuffer r0 = r1.getOutputBuffer(r0)     // Catch:{ IllegalStateException -> 0x01e9 }
        L_0x009e:
            r14.P = r0     // Catch:{ IllegalStateException -> 0x01e9 }
            if (r0 == 0) goto L_0x00b7
            android.media.MediaCodec$BufferInfo r1 = r14.q     // Catch:{ IllegalStateException -> 0x01e9 }
            int r1 = r1.offset     // Catch:{ IllegalStateException -> 0x01e9 }
            r0.position(r1)     // Catch:{ IllegalStateException -> 0x01e9 }
            java.nio.ByteBuffer r0 = r14.P     // Catch:{ IllegalStateException -> 0x01e9 }
            android.media.MediaCodec$BufferInfo r1 = r14.q     // Catch:{ IllegalStateException -> 0x01e9 }
            int r1 = r1.offset     // Catch:{ IllegalStateException -> 0x01e9 }
            android.media.MediaCodec$BufferInfo r2 = r14.q     // Catch:{ IllegalStateException -> 0x01e9 }
            int r2 = r2.size     // Catch:{ IllegalStateException -> 0x01e9 }
            int r1 = r1 + r2
            r0.limit(r1)     // Catch:{ IllegalStateException -> 0x01e9 }
        L_0x00b7:
            android.media.MediaCodec$BufferInfo r0 = r14.q     // Catch:{ IllegalStateException -> 0x01e9 }
            long r0 = r0.presentationTimeUs     // Catch:{ IllegalStateException -> 0x01e9 }
            java.util.ArrayList r2 = r14.p     // Catch:{ IllegalStateException -> 0x01e9 }
            int r2 = r2.size()     // Catch:{ IllegalStateException -> 0x01e9 }
            r3 = 0
        L_0x00c2:
            if (r3 >= r2) goto L_0x00de
            java.util.ArrayList r4 = r14.p     // Catch:{ IllegalStateException -> 0x01e9 }
            java.lang.Object r4 = r4.get(r3)     // Catch:{ IllegalStateException -> 0x01e9 }
            java.lang.Long r4 = (java.lang.Long) r4     // Catch:{ IllegalStateException -> 0x01e9 }
            long r4 = r4.longValue()     // Catch:{ IllegalStateException -> 0x01e9 }
            int r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r6 != 0) goto L_0x00db
            java.util.ArrayList r0 = r14.p     // Catch:{ IllegalStateException -> 0x01e9 }
            r0.remove(r3)     // Catch:{ IllegalStateException -> 0x01e9 }
            r0 = 1
            goto L_0x00e0
        L_0x00db:
            int r3 = r3 + 1
            goto L_0x00c2
        L_0x00de:
            r0 = 0
        L_0x00e0:
            r14.Q = r0     // Catch:{ IllegalStateException -> 0x01e9 }
            long r0 = r14.Y     // Catch:{ IllegalStateException -> 0x01e9 }
            android.media.MediaCodec$BufferInfo r2 = r14.q     // Catch:{ IllegalStateException -> 0x01e9 }
            long r2 = r2.presentationTimeUs     // Catch:{ IllegalStateException -> 0x01e9 }
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x00ee
            r0 = 1
            goto L_0x00f0
        L_0x00ee:
            r0 = 0
        L_0x00f0:
            r14.R = r0     // Catch:{ IllegalStateException -> 0x01e9 }
            android.media.MediaCodec$BufferInfo r0 = r14.q     // Catch:{ IllegalStateException -> 0x01e9 }
            long r0 = r0.presentationTimeUs     // Catch:{ IllegalStateException -> 0x01e9 }
            r14.d(r0)     // Catch:{ IllegalStateException -> 0x01e9 }
            goto L_0x0158
        L_0x00fa:
            r1 = -2
            if (r0 != r1) goto L_0x012f
            android.media.MediaCodec r0 = r14.g     // Catch:{ IllegalStateException -> 0x01e9 }
            android.media.MediaFormat r0 = r0.getOutputFormat()     // Catch:{ IllegalStateException -> 0x01e9 }
            int r1 = r14.A     // Catch:{ IllegalStateException -> 0x01e9 }
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
            r14.I = r12     // Catch:{ IllegalStateException -> 0x01e9 }
            goto L_0x0034
        L_0x011f:
            boolean r1 = r14.G     // Catch:{ IllegalStateException -> 0x01e9 }
            if (r1 == 0) goto L_0x0128
            java.lang.String r1 = "channel-count"
            r0.setInteger(r1, r12)     // Catch:{ IllegalStateException -> 0x01e9 }
        L_0x0128:
            android.media.MediaCodec r1 = r14.g     // Catch:{ IllegalStateException -> 0x01e9 }
            r14.a(r1, r0)     // Catch:{ IllegalStateException -> 0x01e9 }
            goto L_0x0034
        L_0x012f:
            r1 = -3
            if (r0 == r1) goto L_0x014a
            boolean r0 = r14.J     // Catch:{ IllegalStateException -> 0x01e9 }
            if (r0 == 0) goto L_0x0146
            boolean r0 = r14.aa     // Catch:{ IllegalStateException -> 0x01e9 }
            if (r0 != 0) goto L_0x013f
            int r0 = r14.U     // Catch:{ IllegalStateException -> 0x01e9 }
            r1 = 2
            if (r0 != r1) goto L_0x0146
        L_0x013f:
            r19.L()     // Catch:{ IllegalStateException -> 0x01e9 }
            r18 = 0
            goto L_0x01d3
        L_0x0146:
            r18 = 0
            goto L_0x01d3
        L_0x014a:
            int r0 = defpackage.blm.a     // Catch:{ IllegalStateException -> 0x01e9 }
            if (r0 >= r15) goto L_0x0034
            android.media.MediaCodec r0 = r14.g     // Catch:{ IllegalStateException -> 0x01e9 }
            java.nio.ByteBuffer[] r0 = r0.getOutputBuffers()     // Catch:{ IllegalStateException -> 0x01e9 }
            r14.L = r0     // Catch:{ IllegalStateException -> 0x01e9 }
            goto L_0x0034
        L_0x0158:
            boolean r0 = r14.F     // Catch:{ IllegalStateException -> 0x01e9 }
            if (r0 != 0) goto L_0x0161
            r17 = 1
            r18 = 0
            goto L_0x019f
        L_0x0161:
            boolean r0 = r14.X     // Catch:{ IllegalStateException -> 0x01e9 }
            if (r0 == 0) goto L_0x019b
            android.media.MediaCodec r6 = r14.g     // Catch:{ IllegalStateException -> 0x018d }
            java.nio.ByteBuffer r7 = r14.P     // Catch:{ IllegalStateException -> 0x018d }
            int r8 = r14.O     // Catch:{ IllegalStateException -> 0x018d }
            android.media.MediaCodec$BufferInfo r0 = r14.q     // Catch:{ IllegalStateException -> 0x018d }
            int r9 = r0.flags     // Catch:{ IllegalStateException -> 0x018d }
            android.media.MediaCodec$BufferInfo r0 = r14.q     // Catch:{ IllegalStateException -> 0x018d }
            long r10 = r0.presentationTimeUs     // Catch:{ IllegalStateException -> 0x018d }
            boolean r0 = r14.Q     // Catch:{ IllegalStateException -> 0x018d }
            boolean r4 = r14.R     // Catch:{ IllegalStateException -> 0x018d }
            r1 = r19
            r2 = r20
            r16 = r4
            r4 = r22
            r17 = 1
            r12 = r0
            r18 = 0
            r13 = r16
            boolean r0 = r1.a(r2, r4, r6, r7, r8, r9, r10, r12, r13)     // Catch:{ IllegalStateException -> 0x018b }
            goto L_0x01bb
        L_0x018b:
            r0 = move-exception
            goto L_0x0190
        L_0x018d:
            r0 = move-exception
            r18 = 0
        L_0x0190:
            r19.L()     // Catch:{ IllegalStateException -> 0x01e7 }
            boolean r0 = r14.i     // Catch:{ IllegalStateException -> 0x01e7 }
            if (r0 == 0) goto L_0x01d3
            r19.A()     // Catch:{ IllegalStateException -> 0x01e7 }
            goto L_0x01d3
        L_0x019b:
            r17 = 1
            r18 = 0
        L_0x019f:
            android.media.MediaCodec r6 = r14.g     // Catch:{ IllegalStateException -> 0x01e7 }
            java.nio.ByteBuffer r7 = r14.P     // Catch:{ IllegalStateException -> 0x01e7 }
            int r8 = r14.O     // Catch:{ IllegalStateException -> 0x01e7 }
            android.media.MediaCodec$BufferInfo r0 = r14.q     // Catch:{ IllegalStateException -> 0x01e7 }
            int r9 = r0.flags     // Catch:{ IllegalStateException -> 0x01e7 }
            android.media.MediaCodec$BufferInfo r0 = r14.q     // Catch:{ IllegalStateException -> 0x01e7 }
            long r10 = r0.presentationTimeUs     // Catch:{ IllegalStateException -> 0x01e7 }
            boolean r12 = r14.Q     // Catch:{ IllegalStateException -> 0x01e7 }
            boolean r13 = r14.R     // Catch:{ IllegalStateException -> 0x01e7 }
            r1 = r19
            r2 = r20
            r4 = r22
            boolean r0 = r1.a(r2, r4, r6, r7, r8, r9, r10, r12, r13)     // Catch:{ IllegalStateException -> 0x01e7 }
        L_0x01bb:
            if (r0 != 0) goto L_0x01be
            goto L_0x01d3
        L_0x01be:
            android.media.MediaCodec$BufferInfo r0 = r14.q     // Catch:{ IllegalStateException -> 0x01e7 }
            long r0 = r0.presentationTimeUs     // Catch:{ IllegalStateException -> 0x01e7 }
            r14.c(r0)     // Catch:{ IllegalStateException -> 0x01e7 }
            android.media.MediaCodec$BufferInfo r0 = r14.q     // Catch:{ IllegalStateException -> 0x01e7 }
            int r0 = r0.flags     // Catch:{ IllegalStateException -> 0x01e7 }
            r19.G()     // Catch:{ IllegalStateException -> 0x01e7 }
            r0 = r0 & 4
            if (r0 == 0) goto L_0x01dd
            r19.L()     // Catch:{ IllegalStateException -> 0x01e7 }
        L_0x01d3:
            boolean r0 = r19.H()     // Catch:{ IllegalStateException -> 0x01e7 }
            if (r0 != 0) goto L_0x01d3
            defpackage.blk.a()     // Catch:{ IllegalStateException -> 0x01e7 }
            return
        L_0x01dd:
            r12 = 1
            r13 = 0
            goto L_0x0034
        L_0x01e1:
            r18 = 0
            r19.x()     // Catch:{ IllegalStateException -> 0x01e7 }
            return
        L_0x01e7:
            r0 = move-exception
            goto L_0x01ec
        L_0x01e9:
            r0 = move-exception
            r18 = 0
        L_0x01ec:
            int r1 = defpackage.blm.a
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
            atd r1 = r14.h
            ate r0 = r14.a(r0, r1)
            ajh r0 = defpackage.ajh.a(r0)
            throw r0
        L_0x0215:
            goto L_0x0217
        L_0x0216:
            throw r0
        L_0x0217:
            goto L_0x0216
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.atg.a(long, long):void");
    }

    private final void D() {
        if (blm.a < 21) {
            this.K = null;
            this.L = null;
        }
    }

    private final void F() {
        this.N = -1;
        this.m.c = null;
    }

    private final void G() {
        this.O = -1;
        this.P = null;
    }

    public final void a(float f2) {
        this.v = f2;
        if (this.g != null && this.V != 3 && this.b != 0) {
            I();
        }
    }

    public final int a(akh akh) {
        try {
            return a(this.k, akh);
        } catch (ato e) {
            throw ajh.a(e);
        }
    }

    private final void I() {
        if (blm.a >= 23) {
            float a = a(this.v, this.d);
            float f2 = this.x;
            if (f2 == a) {
                return;
            }
            if (a == -1.0f) {
                K();
            } else if (f2 != -1.0f || a > this.l) {
                Bundle bundle = new Bundle();
                bundle.putFloat("operating-rate", a);
                this.g.setParameters(bundle);
                this.x = a;
            }
        }
    }

    private final void N() {
        M();
    }

    /* access modifiers changed from: protected */
    public final akh d(long j2) {
        akh akh = (akh) this.o.a(j2);
        if (akh != null) {
            this.s = akh;
        }
        return akh;
    }
}
