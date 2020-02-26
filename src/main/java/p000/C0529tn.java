package p000;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;

/* renamed from: tn */
/* compiled from: PG */
public final class C0529tn implements C0525tj {

    /* renamed from: a */
    public final C0524ti f10497a;

    /* renamed from: b */
    public ByteBuffer f10498b;

    /* renamed from: c */
    public byte[] f10499c;

    /* renamed from: d */
    public byte[] f10500d;

    /* renamed from: e */
    public int[] f10501e;

    /* renamed from: f */
    public int f10502f;

    /* renamed from: g */
    public C0527tl f10503g;

    /* renamed from: h */
    public Bitmap f10504h;

    /* renamed from: i */
    public Boolean f10505i;

    /* renamed from: j */
    public Bitmap.Config f10506j = Bitmap.Config.ARGB_8888;

    /* renamed from: k */
    private int[] f10507k;

    /* renamed from: l */
    private final int[] f10508l = new int[256];

    /* renamed from: m */
    private short[] f10509m;

    /* renamed from: n */
    private byte[] f10510n;

    /* renamed from: o */
    private byte[] f10511o;

    /* renamed from: p */
    private boolean f10512p;

    /* renamed from: q */
    private int f10513q;

    /* renamed from: r */
    private int f10514r;

    /* renamed from: s */
    private int f10515s;

    /* renamed from: t */
    private int f10516t;

    static {
        C0529tn.class.getSimpleName();
    }

    public C0529tn(C0524ti tiVar, C0527tl tlVar, ByteBuffer byteBuffer, int i) {
        this.f10497a = tiVar;
        this.f10503g = new C0527tl();
        m8376a(tlVar, byteBuffer, i);
    }

    /* renamed from: a */
    public final void mo5976a() {
        this.f10502f = (this.f10502f + 1) % this.f10503g.f10482c;
    }

    /* renamed from: d */
    private final Bitmap m8378d() {
        Bitmap.Config config;
        Boolean bool = this.f10505i;
        if (bool != null && !bool.booleanValue()) {
            config = this.f10506j;
        } else {
            config = Bitmap.Config.ARGB_8888;
        }
        C0524ti tiVar = this.f10497a;
        Bitmap b = ((aef) tiVar).f172a.mo6109b(this.f10516t, this.f10515s, config);
        b.setHasAlpha(true);
        return b;
    }

    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0274, code lost:
        if (r0 == 1) goto L_0x0276;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00b9, code lost:
        if (r10.f10489j == r5.f10476h) goto L_0x00bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0119, code lost:
        if (r7.length < r10) goto L_0x011b;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x026e  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00d4  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized android.graphics.Bitmap mo5977b() {
        /*
            r38 = this;
            r1 = r38
            monitor-enter(r38)
            tl r0 = r1.f10503g     // Catch:{ all -> 0x0500 }
            int r0 = r0.f10482c     // Catch:{ all -> 0x0500 }
            r2 = 1
            if (r0 <= 0) goto L_0x000f
            int r0 = r1.f10502f     // Catch:{ all -> 0x0500 }
            if (r0 < 0) goto L_0x000f
            goto L_0x0012
        L_0x000f:
            r1.f10513q = r2     // Catch:{ all -> 0x0500 }
        L_0x0012:
            int r0 = r1.f10513q     // Catch:{ all -> 0x0500 }
            r3 = 0
            if (r0 != r2) goto L_0x0019
        L_0x0017:
            goto L_0x04fe
        L_0x0019:
            r4 = 2
            if (r0 == r4) goto L_0x0017
            r0 = 0
            r1.f10513q = r0     // Catch:{ all -> 0x0500 }
            byte[] r5 = r1.f10499c     // Catch:{ all -> 0x0500 }
            r6 = 255(0xff, float:3.57E-43)
            if (r5 != 0) goto L_0x002e
            ti r5 = r1.f10497a     // Catch:{ all -> 0x0500 }
            byte[] r5 = r5.mo94a(r6)     // Catch:{ all -> 0x0500 }
            r1.f10499c = r5     // Catch:{ all -> 0x0500 }
        L_0x002e:
            tl r5 = r1.f10503g     // Catch:{ all -> 0x0500 }
            java.util.List r5 = r5.f10484e     // Catch:{ all -> 0x0500 }
            int r7 = r1.f10502f     // Catch:{ all -> 0x0500 }
            java.lang.Object r5 = r5.get(r7)     // Catch:{ all -> 0x0500 }
            tk r5 = (p000.C0526tk) r5     // Catch:{ all -> 0x0500 }
            int r7 = r1.f10502f     // Catch:{ all -> 0x0500 }
            r8 = -1
            int r7 = r7 + r8
            if (r7 < 0) goto L_0x004b
            tl r9 = r1.f10503g     // Catch:{ all -> 0x0500 }
            java.util.List r9 = r9.f10484e     // Catch:{ all -> 0x0500 }
            java.lang.Object r7 = r9.get(r7)     // Catch:{ all -> 0x0500 }
            tk r7 = (p000.C0526tk) r7     // Catch:{ all -> 0x0500 }
            goto L_0x004d
        L_0x004b:
            r7 = r3
        L_0x004d:
            int[] r9 = r5.f10479k     // Catch:{ all -> 0x0500 }
            if (r9 == 0) goto L_0x0052
        L_0x0051:
            goto L_0x0057
        L_0x0052:
            tl r9 = r1.f10503g     // Catch:{ all -> 0x0500 }
            int[] r9 = r9.f10480a     // Catch:{ all -> 0x0500 }
            goto L_0x0051
        L_0x0057:
            r1.f10507k = r9     // Catch:{ all -> 0x0500 }
            if (r9 != 0) goto L_0x005f
            r1.f10513q = r2     // Catch:{ all -> 0x0500 }
            monitor-exit(r38)
            return r3
        L_0x005f:
            boolean r10 = r5.f10474f     // Catch:{ all -> 0x0500 }
            if (r10 == 0) goto L_0x0080
            int[] r10 = r1.f10508l     // Catch:{ all -> 0x0500 }
            int r11 = r9.length     // Catch:{ all -> 0x0500 }
            java.lang.System.arraycopy(r9, r0, r10, r0, r11)     // Catch:{ all -> 0x0500 }
            int[] r9 = r1.f10508l     // Catch:{ all -> 0x0500 }
            r1.f10507k = r9     // Catch:{ all -> 0x0500 }
            int r10 = r5.f10476h     // Catch:{ all -> 0x0500 }
            r9[r10] = r0     // Catch:{ all -> 0x0500 }
            int r9 = r5.f10475g     // Catch:{ all -> 0x0500 }
            if (r9 == r4) goto L_0x0076
            goto L_0x0080
        L_0x0076:
            int r9 = r1.f10502f     // Catch:{ all -> 0x0500 }
            if (r9 != 0) goto L_0x0080
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r2)     // Catch:{ all -> 0x0500 }
            r1.f10505i = r9     // Catch:{ all -> 0x0500 }
        L_0x0080:
            int[] r9 = r1.f10501e     // Catch:{ all -> 0x0500 }
            if (r7 != 0) goto L_0x0093
            android.graphics.Bitmap r10 = r1.f10504h     // Catch:{ all -> 0x0500 }
            if (r10 == 0) goto L_0x008d
            ti r11 = r1.f10497a     // Catch:{ all -> 0x0500 }
            r11.mo92a(r10)     // Catch:{ all -> 0x0500 }
        L_0x008d:
            r1.f10504h = r3     // Catch:{ all -> 0x0500 }
            java.util.Arrays.fill(r9, r0)     // Catch:{ all -> 0x0500 }
        L_0x0093:
            r3 = 3
            if (r7 == 0) goto L_0x00a1
            int r10 = r7.f10475g     // Catch:{ all -> 0x0500 }
            if (r10 != r3) goto L_0x00a1
            android.graphics.Bitmap r10 = r1.f10504h     // Catch:{ all -> 0x0500 }
            if (r10 != 0) goto L_0x00a1
            java.util.Arrays.fill(r9, r0)     // Catch:{ all -> 0x0500 }
        L_0x00a1:
            if (r7 == 0) goto L_0x00f9
            int r10 = r7.f10475g     // Catch:{ all -> 0x0500 }
            if (r10 <= 0) goto L_0x00f9
            if (r10 != r4) goto L_0x00e2
            boolean r10 = r5.f10474f     // Catch:{ all -> 0x0500 }
            if (r10 != 0) goto L_0x00bb
            tl r10 = r1.f10503g     // Catch:{ all -> 0x0500 }
            int r11 = r10.f10491l     // Catch:{ all -> 0x0500 }
            int[] r12 = r5.f10479k     // Catch:{ all -> 0x0500 }
            if (r12 == 0) goto L_0x00bc
            int r10 = r10.f10489j     // Catch:{ all -> 0x0500 }
            int r12 = r5.f10476h     // Catch:{ all -> 0x0500 }
            if (r10 != r12) goto L_0x00bc
        L_0x00bb:
            r11 = 0
        L_0x00bc:
            int r10 = r7.f10472d     // Catch:{ all -> 0x0500 }
            int r12 = r1.f10514r     // Catch:{ all -> 0x0500 }
            int r10 = r10 / r12
            int r13 = r7.f10470b     // Catch:{ all -> 0x0500 }
            int r13 = r13 / r12
            int r14 = r7.f10471c     // Catch:{ all -> 0x0500 }
            int r14 = r14 / r12
            int r7 = r7.f10469a     // Catch:{ all -> 0x0500 }
            int r7 = r7 / r12
            int r12 = r1.f10516t     // Catch:{ all -> 0x0500 }
            int r13 = r13 * r12
            int r13 = r13 + r7
            int r10 = r10 * r12
            int r10 = r10 + r13
        L_0x00d2:
            if (r13 >= r10) goto L_0x00f9
            int r7 = r13 + r14
            r12 = r13
        L_0x00d7:
            if (r12 < r7) goto L_0x00dd
            int r7 = r1.f10516t     // Catch:{ all -> 0x0500 }
            int r13 = r13 + r7
            goto L_0x00d2
        L_0x00dd:
            r9[r12] = r11     // Catch:{ all -> 0x0500 }
            int r12 = r12 + 1
            goto L_0x00d7
        L_0x00e2:
            if (r10 != r3) goto L_0x00f9
            android.graphics.Bitmap r10 = r1.f10504h     // Catch:{ all -> 0x0500 }
            if (r10 == 0) goto L_0x00f9
            int r7 = r1.f10516t     // Catch:{ all -> 0x0500 }
            r12 = 0
            r14 = 0
            r15 = 0
            int r13 = r1.f10515s     // Catch:{ all -> 0x0500 }
            r11 = r9
            r17 = r13
            r13 = r7
            r16 = r7
            r10.getPixels(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x0500 }
        L_0x00f9:
            if (r5 == 0) goto L_0x0102
            java.nio.ByteBuffer r7 = r1.f10498b     // Catch:{ all -> 0x0500 }
            int r10 = r5.f10478j     // Catch:{ all -> 0x0500 }
            r7.position(r10)     // Catch:{ all -> 0x0500 }
        L_0x0102:
            if (r5 != 0) goto L_0x010d
            tl r7 = r1.f10503g     // Catch:{ all -> 0x0500 }
            int r10 = r7.f10485f     // Catch:{ all -> 0x0500 }
            int r7 = r7.f10486g     // Catch:{ all -> 0x0500 }
            int r10 = r10 * r7
            goto L_0x0113
        L_0x010d:
            int r7 = r5.f10471c     // Catch:{ all -> 0x0500 }
            int r10 = r5.f10472d     // Catch:{ all -> 0x0500 }
            int r10 = r10 * r7
        L_0x0113:
            byte[] r7 = r1.f10500d     // Catch:{ all -> 0x0500 }
            if (r7 != 0) goto L_0x0118
            goto L_0x011b
        L_0x0118:
            int r7 = r7.length     // Catch:{ all -> 0x0500 }
            if (r7 >= r10) goto L_0x0123
        L_0x011b:
            ti r7 = r1.f10497a     // Catch:{ all -> 0x0500 }
            byte[] r7 = r7.mo94a(r10)     // Catch:{ all -> 0x0500 }
            r1.f10500d = r7     // Catch:{ all -> 0x0500 }
        L_0x0123:
            byte[] r7 = r1.f10500d     // Catch:{ all -> 0x0500 }
            short[] r11 = r1.f10509m     // Catch:{ all -> 0x0500 }
            r12 = 4096(0x1000, float:5.74E-42)
            if (r11 == 0) goto L_0x012c
            goto L_0x0131
        L_0x012c:
            short[] r11 = new short[r12]     // Catch:{ all -> 0x0500 }
            r1.f10509m = r11     // Catch:{ all -> 0x0500 }
        L_0x0131:
            short[] r11 = r1.f10509m     // Catch:{ all -> 0x0500 }
            byte[] r13 = r1.f10510n     // Catch:{ all -> 0x0500 }
            if (r13 == 0) goto L_0x0138
            goto L_0x013d
        L_0x0138:
            byte[] r13 = new byte[r12]     // Catch:{ all -> 0x0500 }
            r1.f10510n = r13     // Catch:{ all -> 0x0500 }
        L_0x013d:
            byte[] r13 = r1.f10510n     // Catch:{ all -> 0x0500 }
            byte[] r14 = r1.f10511o     // Catch:{ all -> 0x0500 }
            if (r14 == 0) goto L_0x0144
            goto L_0x014a
        L_0x0144:
            r14 = 4097(0x1001, float:5.741E-42)
            byte[] r14 = new byte[r14]     // Catch:{ all -> 0x0500 }
            r1.f10511o = r14     // Catch:{ all -> 0x0500 }
        L_0x014a:
            byte[] r14 = r1.f10511o     // Catch:{ all -> 0x0500 }
            int r15 = r38.m8377c()     // Catch:{ all -> 0x0500 }
            int r12 = r2 << r15
            int r6 = r12 + 1
            int r18 = r12 + 2
            int r15 = r15 + r2
            int r19 = r2 << r15
            int r19 = r19 + -1
            r4 = 0
        L_0x015c:
            if (r4 < r12) goto L_0x04de
            byte[] r4 = r1.f10499c     // Catch:{ all -> 0x0500 }
            r24 = r15
            r30 = r18
            r23 = r19
            r2 = 0
            r8 = 0
            r21 = 0
            r22 = 0
            r25 = -1
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
        L_0x0176:
            r31 = 8
            if (r8 < r10) goto L_0x017b
            goto L_0x01b0
        L_0x017b:
            if (r21 != 0) goto L_0x0419
            int r3 = r38.m8377c()     // Catch:{ all -> 0x0500 }
            if (r3 <= 0) goto L_0x019a
            java.nio.ByteBuffer r0 = r1.f10498b     // Catch:{ all -> 0x0500 }
            r33 = r8
            byte[] r8 = r1.f10499c     // Catch:{ all -> 0x0500 }
            r34 = r15
            int r15 = r0.remaining()     // Catch:{ all -> 0x0500 }
            int r15 = java.lang.Math.min(r3, r15)     // Catch:{ all -> 0x0500 }
            r35 = r11
            r11 = 0
            r0.get(r8, r11, r15)     // Catch:{ all -> 0x0500 }
            goto L_0x01a0
        L_0x019a:
            r33 = r8
            r35 = r11
            r34 = r15
        L_0x01a0:
            if (r3 <= 0) goto L_0x01ac
            r0 = r2
            r37 = r5
            r36 = r9
            r5 = 1
            r22 = 0
            goto L_0x0427
        L_0x01ac:
            r0 = 3
            r1.f10513q = r0     // Catch:{ all -> 0x0500 }
        L_0x01b0:
            r0 = 0
            java.util.Arrays.fill(r7, r2, r10, r0)     // Catch:{ all -> 0x0500 }
            boolean r0 = r5.f10473e     // Catch:{ all -> 0x0500 }
            if (r0 == 0) goto L_0x01bb
            goto L_0x0230
        L_0x01bb:
            int r0 = r1.f10514r     // Catch:{ all -> 0x0500 }
            r2 = 1
            if (r0 != r2) goto L_0x0230
            int[] r0 = r1.f10501e     // Catch:{ all -> 0x0500 }
            int r2 = r5.f10472d     // Catch:{ all -> 0x0500 }
            int r3 = r5.f10470b     // Catch:{ all -> 0x0500 }
            int r4 = r5.f10471c     // Catch:{ all -> 0x0500 }
            int r6 = r5.f10469a     // Catch:{ all -> 0x0500 }
            int r7 = r1.f10502f     // Catch:{ all -> 0x0500 }
            int r8 = r1.f10516t     // Catch:{ all -> 0x0500 }
            byte[] r10 = r1.f10500d     // Catch:{ all -> 0x0500 }
            int[] r11 = r1.f10507k     // Catch:{ all -> 0x0500 }
            r12 = 0
            r13 = -1
        L_0x01d4:
            if (r12 >= r2) goto L_0x020d
            int r14 = r12 + r3
            int r14 = r14 * r8
            int r15 = r14 + r6
            r16 = r2
            int r2 = r15 + r4
            int r14 = r14 + r8
            if (r14 >= r2) goto L_0x01e4
            r2 = r14
        L_0x01e4:
            int r14 = r5.f10471c     // Catch:{ all -> 0x0500 }
            int r14 = r14 * r12
        L_0x01e8:
            if (r15 >= r2) goto L_0x0206
            r17 = r2
            byte r2 = r10[r14]     // Catch:{ all -> 0x0500 }
            r18 = r3
            r3 = r2 & 255(0xff, float:3.57E-43)
            if (r3 != r13) goto L_0x01f5
            goto L_0x01fd
        L_0x01f5:
            r3 = r11[r3]     // Catch:{ all -> 0x0500 }
            if (r3 == 0) goto L_0x01fc
            r0[r15] = r3     // Catch:{ all -> 0x0500 }
            goto L_0x01fd
        L_0x01fc:
            r13 = r2
        L_0x01fd:
            int r14 = r14 + 1
            int r15 = r15 + 1
            r2 = r17
            r3 = r18
            goto L_0x01e8
        L_0x0206:
            r18 = r3
            int r12 = r12 + 1
            r2 = r16
            goto L_0x01d4
        L_0x020d:
            java.lang.Boolean r0 = r1.f10505i     // Catch:{ all -> 0x0500 }
            if (r0 == 0) goto L_0x021b
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0500 }
            if (r0 != 0) goto L_0x0218
            goto L_0x021b
        L_0x0218:
            r32 = 1
            goto L_0x0229
        L_0x021b:
            java.lang.Boolean r0 = r1.f10505i     // Catch:{ all -> 0x0500 }
            if (r0 == 0) goto L_0x0222
        L_0x021f:
            r32 = 0
            goto L_0x0229
        L_0x0222:
            if (r7 == 0) goto L_0x0225
            goto L_0x021f
        L_0x0225:
            r0 = -1
            if (r13 != r0) goto L_0x0218
            goto L_0x021f
        L_0x0229:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r32)     // Catch:{ all -> 0x0500 }
            r1.f10505i = r0     // Catch:{ all -> 0x0500 }
            goto L_0x026a
        L_0x0230:
            int[] r0 = r1.f10501e     // Catch:{ all -> 0x0500 }
            int r2 = r5.f10472d     // Catch:{ all -> 0x0500 }
            int r3 = r1.f10514r     // Catch:{ all -> 0x0500 }
            int r2 = r2 / r3
            int r4 = r5.f10470b     // Catch:{ all -> 0x0500 }
            int r4 = r4 / r3
            int r6 = r5.f10471c     // Catch:{ all -> 0x0500 }
            int r6 = r6 / r3
            int r7 = r5.f10469a     // Catch:{ all -> 0x0500 }
            int r7 = r7 / r3
            int r8 = r1.f10502f     // Catch:{ all -> 0x0500 }
            int r10 = r1.f10516t     // Catch:{ all -> 0x0500 }
            int r11 = r1.f10515s     // Catch:{ all -> 0x0500 }
            byte[] r12 = r1.f10500d     // Catch:{ all -> 0x0500 }
            int[] r13 = r1.f10507k     // Catch:{ all -> 0x0500 }
            java.lang.Boolean r14 = r1.f10505i     // Catch:{ all -> 0x0500 }
            r18 = r14
            r14 = 0
            r15 = 0
            r16 = 8
            r19 = 1
        L_0x0254:
            if (r14 < r2) goto L_0x02aa
            java.lang.Boolean r0 = r1.f10505i     // Catch:{ all -> 0x0500 }
            if (r0 == 0) goto L_0x025b
            goto L_0x026a
        L_0x025b:
            if (r18 == 0) goto L_0x0262
            boolean r0 = r18.booleanValue()     // Catch:{ all -> 0x0500 }
            goto L_0x0264
        L_0x0262:
            r0 = 0
        L_0x0264:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0500 }
            r1.f10505i = r0     // Catch:{ all -> 0x0500 }
        L_0x026a:
            boolean r0 = r1.f10512p     // Catch:{ all -> 0x0500 }
            if (r0 == 0) goto L_0x0293
            int r0 = r5.f10475g     // Catch:{ all -> 0x0500 }
            if (r0 != 0) goto L_0x0273
            goto L_0x0276
        L_0x0273:
            r2 = 1
            if (r0 != r2) goto L_0x0293
        L_0x0276:
            android.graphics.Bitmap r0 = r1.f10504h     // Catch:{ all -> 0x0500 }
            if (r0 == 0) goto L_0x027b
            goto L_0x0281
        L_0x027b:
            android.graphics.Bitmap r0 = r38.m8378d()     // Catch:{ all -> 0x0500 }
            r1.f10504h = r0     // Catch:{ all -> 0x0500 }
        L_0x0281:
            android.graphics.Bitmap r10 = r1.f10504h     // Catch:{ all -> 0x0500 }
            int r0 = r1.f10516t     // Catch:{ all -> 0x0500 }
            r12 = 0
            r14 = 0
            r15 = 0
            int r2 = r1.f10515s     // Catch:{ all -> 0x0500 }
            r11 = r9
            r13 = r0
            r16 = r0
            r17 = r2
            r10.setPixels(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x0500 }
        L_0x0293:
            android.graphics.Bitmap r0 = r38.m8378d()     // Catch:{ all -> 0x0500 }
            int r2 = r1.f10516t     // Catch:{ all -> 0x0500 }
            r12 = 0
            r14 = 0
            r15 = 0
            int r3 = r1.f10515s     // Catch:{ all -> 0x0500 }
            r10 = r0
            r11 = r9
            r13 = r2
            r16 = r2
            r17 = r3
            r10.setPixels(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x0500 }
            monitor-exit(r38)
            return r0
        L_0x02aa:
            r36 = r9
            boolean r9 = r5.f10473e     // Catch:{ all -> 0x0500 }
            if (r9 != 0) goto L_0x02b5
            r21 = r2
            r2 = r15
            r15 = r14
            goto L_0x02da
        L_0x02b5:
            if (r15 < r2) goto L_0x02d1
            int r9 = r19 + 1
            r21 = r2
            r2 = 2
            if (r9 == r2) goto L_0x02ce
            r2 = 3
            if (r9 == r2) goto L_0x02c9
            r2 = 4
            if (r9 == r2) goto L_0x02c5
            goto L_0x02d5
        L_0x02c5:
            r15 = 1
            r16 = 2
            goto L_0x02d5
        L_0x02c9:
            r2 = 4
            r15 = 2
            r16 = 4
            goto L_0x02d5
        L_0x02ce:
            r2 = 4
            r15 = 4
            goto L_0x02d5
        L_0x02d1:
            r21 = r2
            r9 = r19
        L_0x02d5:
            int r2 = r15 + r16
            r19 = r9
        L_0x02da:
            int r15 = r15 + r4
            if (r15 >= r11) goto L_0x03f3
            int r15 = r15 * r10
            int r9 = r15 + r7
            r20 = r2
            int r2 = r9 + r6
            int r15 = r15 + r10
            if (r15 >= r2) goto L_0x02e9
            goto L_0x02ea
        L_0x02e9:
            r15 = r2
        L_0x02ea:
            int r2 = r14 * r3
            r22 = r4
            int r4 = r5.f10471c     // Catch:{ all -> 0x0500 }
            int r2 = r2 * r4
            r4 = 1
            if (r3 == r4) goto L_0x03c6
            int r4 = r15 - r9
            int r4 = r4 * r3
            int r4 = r4 + r2
        L_0x02fa:
            if (r9 < r15) goto L_0x0308
            r37 = r5
            r23 = r6
            r29 = r7
            r30 = r10
            r33 = r11
            goto L_0x03d2
        L_0x0308:
            r23 = r6
            int r6 = r5.f10471c     // Catch:{ all -> 0x0500 }
            r37 = r5
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r5 = r2
        L_0x0319:
            r29 = r7
            int r7 = r1.f10514r     // Catch:{ all -> 0x0500 }
            int r7 = r7 + r2
            if (r5 < r7) goto L_0x0325
            r30 = r10
            r33 = r11
            goto L_0x035d
        L_0x0325:
            byte[] r7 = r1.f10500d     // Catch:{ all -> 0x0500 }
            r30 = r10
            int r10 = r7.length     // Catch:{ all -> 0x0500 }
            if (r5 >= r10) goto L_0x035b
            if (r5 >= r4) goto L_0x035b
            byte r7 = r7[r5]     // Catch:{ all -> 0x0500 }
            int[] r10 = r1.f10507k     // Catch:{ all -> 0x0500 }
            r33 = r11
            r11 = 255(0xff, float:3.57E-43)
            r7 = r7 & r11
            r7 = r10[r7]     // Catch:{ all -> 0x0500 }
            if (r7 == 0) goto L_0x0351
            int r10 = r7 >>> 24
            int r28 = r28 + r10
            int r10 = r7 >> 16
            r11 = 255(0xff, float:3.57E-43)
            r10 = r10 & r11
            int r24 = r24 + r10
            int r10 = r7 >> 8
            r10 = r10 & r11
            int r25 = r25 + r10
            r7 = r7 & 255(0xff, float:3.57E-43)
            int r26 = r26 + r7
            int r27 = r27 + 1
        L_0x0351:
            int r5 = r5 + 1
            r7 = r29
            r10 = r30
            r11 = r33
            goto L_0x0319
        L_0x035b:
            r33 = r11
        L_0x035d:
            int r6 = r6 + r2
            r5 = r6
        L_0x035f:
            int r7 = r1.f10514r     // Catch:{ all -> 0x0500 }
            int r7 = r7 + r6
            if (r5 >= r7) goto L_0x0390
            byte[] r7 = r1.f10500d     // Catch:{ all -> 0x0500 }
            int r10 = r7.length     // Catch:{ all -> 0x0500 }
            if (r5 >= r10) goto L_0x0390
            if (r5 >= r4) goto L_0x0390
            byte r7 = r7[r5]     // Catch:{ all -> 0x0500 }
            int[] r10 = r1.f10507k     // Catch:{ all -> 0x0500 }
            r11 = 255(0xff, float:3.57E-43)
            r7 = r7 & r11
            r7 = r10[r7]     // Catch:{ all -> 0x0500 }
            if (r7 == 0) goto L_0x038c
            int r10 = r7 >>> 24
            int r28 = r28 + r10
            int r10 = r7 >> 16
            r11 = 255(0xff, float:3.57E-43)
            r10 = r10 & r11
            int r24 = r24 + r10
            int r10 = r7 >> 8
            r10 = r10 & r11
            int r25 = r25 + r10
            r7 = r7 & 255(0xff, float:3.57E-43)
            int r26 = r26 + r7
            int r27 = r27 + 1
        L_0x038c:
            int r5 = r5 + 1
            goto L_0x035f
        L_0x0390:
            if (r27 == 0) goto L_0x03a5
            int r28 = r28 / r27
            int r5 = r28 << 24
            int r24 = r24 / r27
            int r6 = r24 << 16
            r5 = r5 | r6
            int r25 = r25 / r27
            int r6 = r25 << 8
            r5 = r5 | r6
            int r26 = r26 / r27
            r5 = r5 | r26
            goto L_0x03a7
        L_0x03a5:
            r5 = 0
        L_0x03a7:
            if (r5 == 0) goto L_0x03ac
            r0[r9] = r5     // Catch:{ all -> 0x0500 }
            goto L_0x03b7
        L_0x03ac:
            if (r8 != 0) goto L_0x03b7
            if (r18 != 0) goto L_0x03b7
            r5 = 1
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r5)     // Catch:{ all -> 0x0500 }
            r18 = r6
        L_0x03b7:
            int r2 = r2 + r3
            int r9 = r9 + 1
            r6 = r23
            r7 = r29
            r10 = r30
            r11 = r33
            r5 = r37
            goto L_0x02fa
        L_0x03c6:
            r37 = r5
            r23 = r6
            r29 = r7
            r30 = r10
            r33 = r11
        L_0x03d0:
            if (r9 < r15) goto L_0x03d4
        L_0x03d2:
            r5 = 1
            goto L_0x0402
        L_0x03d4:
            byte r4 = r12[r2]     // Catch:{ all -> 0x0500 }
            r5 = 255(0xff, float:3.57E-43)
            r4 = r4 & r5
            r4 = r13[r4]     // Catch:{ all -> 0x0500 }
            if (r4 == 0) goto L_0x03e1
            r0[r9] = r4     // Catch:{ all -> 0x0500 }
            r5 = 1
            goto L_0x03ee
        L_0x03e1:
            if (r8 != 0) goto L_0x03ed
            if (r18 != 0) goto L_0x03ed
            r5 = 1
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r5)     // Catch:{ all -> 0x0500 }
            r18 = r4
            goto L_0x03ee
        L_0x03ed:
            r5 = 1
        L_0x03ee:
            int r2 = r2 + 1
            int r9 = r9 + 1
            goto L_0x03d0
        L_0x03f3:
            r20 = r2
            r22 = r4
            r37 = r5
            r23 = r6
            r29 = r7
            r30 = r10
            r33 = r11
            r5 = 1
        L_0x0402:
            int r14 = r14 + 1
            r15 = r20
            r2 = r21
            r4 = r22
            r6 = r23
            r7 = r29
            r10 = r30
            r11 = r33
            r9 = r36
            r5 = r37
            goto L_0x0254
        L_0x0419:
            r0 = r2
            r37 = r5
            r33 = r8
            r36 = r9
            r35 = r11
            r34 = r15
            r5 = 1
            r3 = r21
        L_0x0427:
            byte r2 = r4[r22]     // Catch:{ all -> 0x0500 }
            r8 = 255(0xff, float:3.57E-43)
            r2 = r2 & r8
            int r2 = r2 << r26
            int r27 = r27 + r2
            int r26 = r26 + 8
            int r22 = r22 + 1
            r2 = -1
            int r21 = r3 + -1
            r11 = r0
            r2 = r24
            r3 = r25
            r0 = r26
            r9 = r28
            r15 = r30
            r8 = r33
        L_0x0444:
            if (r0 < r2) goto L_0x04c1
            r5 = r27 & r23
            int r27 = r27 >> r2
            int r0 = r0 - r2
            if (r5 != r12) goto L_0x0456
            r15 = r18
            r23 = r19
            r2 = r34
            r3 = -1
            r5 = 1
            goto L_0x0444
        L_0x0456:
            if (r5 == r6) goto L_0x04c1
            r24 = r0
            r0 = -1
            if (r3 != r0) goto L_0x046c
            byte r3 = r13[r5]     // Catch:{ all -> 0x0500 }
            r7[r11] = r3     // Catch:{ all -> 0x0500 }
            int r11 = r11 + 1
            int r8 = r8 + 1
            r3 = r5
            r9 = r3
            r0 = r24
            r5 = 1
            goto L_0x0444
        L_0x046c:
            if (r5 < r15) goto L_0x0475
            byte r9 = (byte) r9     // Catch:{ all -> 0x0500 }
            r14[r29] = r9     // Catch:{ all -> 0x0500 }
            int r29 = r29 + 1
            r9 = r3
            goto L_0x0476
        L_0x0475:
            r9 = r5
        L_0x0476:
            if (r9 < r12) goto L_0x0481
            byte r20 = r13[r9]     // Catch:{ all -> 0x0500 }
            r14[r29] = r20     // Catch:{ all -> 0x0500 }
            int r29 = r29 + 1
            short r9 = r35[r9]     // Catch:{ all -> 0x0500 }
            goto L_0x0476
        L_0x0481:
            byte r9 = r13[r9]     // Catch:{ all -> 0x0500 }
            r0 = 255(0xff, float:3.57E-43)
            r9 = r9 & r0
            byte r0 = (byte) r9     // Catch:{ all -> 0x0500 }
            r7[r11] = r0     // Catch:{ all -> 0x0500 }
            int r11 = r11 + 1
            int r8 = r8 + 1
        L_0x048d:
            if (r29 <= 0) goto L_0x049a
            int r29 = r29 + -1
            byte r25 = r14[r29]     // Catch:{ all -> 0x0500 }
            r7[r11] = r25     // Catch:{ all -> 0x0500 }
            int r11 = r11 + 1
            int r8 = r8 + 1
            goto L_0x048d
        L_0x049a:
            r25 = r4
            r4 = 4096(0x1000, float:5.74E-42)
            if (r15 >= r4) goto L_0x04b7
            short r3 = (short) r3     // Catch:{ all -> 0x0500 }
            r35[r15] = r3     // Catch:{ all -> 0x0500 }
            r13[r15] = r0     // Catch:{ all -> 0x0500 }
            int r15 = r15 + 1
            r0 = r15 & r23
            if (r0 == 0) goto L_0x04ae
            r0 = 4096(0x1000, float:5.74E-42)
            goto L_0x04b9
        L_0x04ae:
            r0 = 4096(0x1000, float:5.74E-42)
            if (r15 >= r0) goto L_0x04b9
            int r2 = r2 + 1
            int r23 = r23 + r15
            goto L_0x04b9
        L_0x04b7:
            r0 = 4096(0x1000, float:5.74E-42)
        L_0x04b9:
            r3 = r5
            r0 = r24
            r4 = r25
            r5 = 1
            goto L_0x0444
        L_0x04c1:
            r24 = r0
            r25 = r4
            r0 = 4096(0x1000, float:5.74E-42)
            r28 = r9
            r30 = r15
            r26 = r24
            r15 = r34
            r9 = r36
            r5 = r37
            r0 = 0
            r24 = r2
            r25 = r3
            r2 = r11
            r11 = r35
            r3 = 3
            goto L_0x0176
        L_0x04de:
            r37 = r5
            r36 = r9
            r35 = r11
            r34 = r15
            r0 = 4096(0x1000, float:5.74E-42)
            r2 = 0
            r35[r4] = r2     // Catch:{ all -> 0x0500 }
            byte r3 = (byte) r4     // Catch:{ all -> 0x0500 }
            r13[r4] = r3     // Catch:{ all -> 0x0500 }
            int r4 = r4 + 1
            r15 = r34
            r11 = r35
            r9 = r36
            r5 = r37
            r0 = 0
            r2 = 1
            r3 = 3
            r8 = -1
            goto L_0x015c
        L_0x04fe:
            monitor-exit(r38)
            return r3
        L_0x0500:
            r0 = move-exception
            monitor-exit(r38)
            goto L_0x0504
        L_0x0503:
            throw r0
        L_0x0504:
            goto L_0x0503
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0529tn.mo5977b():android.graphics.Bitmap");
    }

    /* renamed from: c */
    private final int m8377c() {
        return this.f10498b.get() & 255;
    }

    /* renamed from: a */
    private final synchronized void m8376a(C0527tl tlVar, ByteBuffer byteBuffer, int i) {
        if (i > 0) {
            int highestOneBit = Integer.highestOneBit(i);
            int i2 = 0;
            this.f10513q = 0;
            this.f10503g = tlVar;
            this.f10502f = -1;
            ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
            this.f10498b = asReadOnlyBuffer;
            asReadOnlyBuffer.position(0);
            this.f10498b.order(ByteOrder.LITTLE_ENDIAN);
            this.f10512p = false;
            List list = tlVar.f10484e;
            int size = list.size();
            while (true) {
                if (i2 >= size) {
                    break;
                }
                int i3 = i2 + 1;
                if (((C0526tk) list.get(i2)).f10475g == 3) {
                    this.f10512p = true;
                    break;
                }
                i2 = i3;
            }
            this.f10514r = highestOneBit;
            int i4 = tlVar.f10485f;
            this.f10516t = i4 / highestOneBit;
            int i5 = tlVar.f10486g;
            this.f10515s = i5 / highestOneBit;
            this.f10500d = this.f10497a.mo94a(i4 * i5);
            C0524ti tiVar = this.f10497a;
            int i6 = this.f10516t * this.f10515s;
            C0628xe xeVar = ((aef) tiVar).f173b;
            this.f10501e = xeVar != null ? (int[]) xeVar.mo6098a(i6, int[].class) : new int[i6];
        } else {
            StringBuilder sb = new StringBuilder(41);
            sb.append("Sample size must be >=0, not: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
    }
}
