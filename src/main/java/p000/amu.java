package p000;

import android.media.AudioTrack;
import android.os.ConditionVariable;
import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* renamed from: amu */
/* compiled from: PG */
public final class amu implements amh {

    /* renamed from: A */
    public boolean f808A;

    /* renamed from: B */
    public long f809B;

    /* renamed from: C */
    private final alr f810C;

    /* renamed from: D */
    private final alu[] f811D;

    /* renamed from: E */
    private ByteBuffer f812E;

    /* renamed from: F */
    private int f813F;

    /* renamed from: G */
    private long f814G;

    /* renamed from: H */
    private long f815H;

    /* renamed from: I */
    private alu[] f816I;

    /* renamed from: J */
    private ByteBuffer[] f817J;

    /* renamed from: K */
    private ByteBuffer f818K;

    /* renamed from: L */
    private byte[] f819L;

    /* renamed from: M */
    private int f820M;

    /* renamed from: N */
    private int f821N;

    /* renamed from: O */
    private boolean f822O;

    /* renamed from: a */
    public final amp f823a;

    /* renamed from: b */
    public final amn f824b = new amn();

    /* renamed from: c */
    public final and f825c = new and();

    /* renamed from: d */
    public final alu[] f826d;

    /* renamed from: e */
    public final ConditionVariable f827e = new ConditionVariable(true);

    /* renamed from: f */
    public final aml f828f = new aml(new amt(this));

    /* renamed from: g */
    public final ArrayDeque f829g;

    /* renamed from: h */
    public amf f830h;

    /* renamed from: i */
    public amq f831i;

    /* renamed from: j */
    public amq f832j;

    /* renamed from: k */
    public AudioTrack f833k;

    /* renamed from: l */
    public final alq f834l;

    /* renamed from: m */
    public akq f835m;

    /* renamed from: n */
    public akq f836n;

    /* renamed from: o */
    public long f837o;

    /* renamed from: p */
    public long f838p;

    /* renamed from: q */
    public long f839q;

    /* renamed from: r */
    public long f840r;

    /* renamed from: s */
    public int f841s;

    /* renamed from: t */
    public int f842t;

    /* renamed from: u */
    public long f843u;

    /* renamed from: v */
    public float f844v;

    /* renamed from: w */
    public ByteBuffer f845w;

    /* renamed from: x */
    public boolean f846x;

    /* renamed from: y */
    public boolean f847y;

    /* renamed from: z */
    public int f848z;

    public amu(alr alr, alu[] aluArr) {
        amr amr = new amr(aluArr);
        this.f810C = alr;
        this.f823a = (amp) bks.m3507a(amr);
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new amz(), this.f824b, this.f825c);
        Collections.addAll(arrayList, amr.f801a);
        this.f826d = (alu[]) arrayList.toArray(new alu[0]);
        this.f811D = new alu[]{new amw()};
        this.f844v = 1.0f;
        this.f842t = 0;
        this.f834l = alq.f716a;
        this.f848z = 0;
        this.f836n = akq.f624a;
        this.f821N = -1;
        this.f816I = new alu[0];
        this.f817J = new ByteBuffer[0];
        this.f829g = new ArrayDeque();
    }

    /* renamed from: i */
    public final boolean mo669i() {
        return this.f833k != null;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.max(long, long):long}
     arg types: [int, long]
     candidates:
      ClspMth{java.lang.Math.max(double, double):double}
      ClspMth{java.lang.Math.max(int, int):int}
      ClspMth{java.lang.Math.max(float, float):float}
      ClspMth{java.lang.Math.max(long, long):long} */
    /* renamed from: a */
    public final void mo665a(akq akq, long j) {
        akq akq2;
        if (this.f832j.f799j) {
            akq2 = this.f823a.mo661a(akq);
        } else {
            akq2 = akq.f624a;
        }
        this.f829g.add(new ams(akq2, Math.max(0L, j), this.f832j.mo662a(mo671k())));
        alu[] aluArr = this.f832j.f800k;
        ArrayList arrayList = new ArrayList();
        for (alu alu : aluArr) {
            if (alu.mo612a()) {
                arrayList.add(alu);
            } else {
                alu.mo620h();
            }
        }
        int size = arrayList.size();
        this.f816I = (alu[]) arrayList.toArray(new alu[size]);
        this.f817J = new ByteBuffer[size];
        m1118m();
    }

    /* renamed from: g */
    public final boolean mo667g() {
        boolean z;
        if (this.f821N == -1) {
            this.f821N = !this.f832j.f798i ? this.f816I.length : 0;
            z = true;
        } else {
            z = false;
        }
        while (true) {
            int i = this.f821N;
            alu[] aluArr = this.f816I;
            if (i >= aluArr.length) {
                ByteBuffer byteBuffer = this.f818K;
                if (byteBuffer != null) {
                    mo666a(byteBuffer, -9223372036854775807L);
                    if (this.f818K != null) {
                        return false;
                    }
                }
                this.f821N = -1;
                return true;
            }
            alu alu = aluArr[i];
            if (z) {
                alu.mo617e();
            }
            mo664a(-9223372036854775807L);
            if (!alu.mo619g()) {
                return false;
            }
            this.f821N++;
            z = true;
        }
    }

    /* renamed from: e */
    public final void mo636e() {
        if (mo669i()) {
            this.f839q = 0;
            this.f840r = 0;
            this.f814G = 0;
            this.f815H = 0;
            this.f841s = 0;
            akq akq = this.f835m;
            if (akq != null) {
                this.f836n = akq;
                this.f835m = null;
            } else if (!this.f829g.isEmpty()) {
                this.f836n = ((ams) this.f829g.getLast()).f804a;
            }
            this.f829g.clear();
            this.f837o = 0;
            this.f838p = 0;
            this.f825c.f917g = 0;
            m1118m();
            this.f845w = null;
            this.f818K = null;
            this.f822O = false;
            this.f846x = false;
            this.f821N = -1;
            this.f812E = null;
            this.f813F = 0;
            this.f842t = 0;
            if (((AudioTrack) bks.m3507a(this.f828f.f756c)).getPlayState() == 3) {
                this.f833k.pause();
            }
            AudioTrack audioTrack = this.f833k;
            this.f833k = null;
            amq amq = this.f831i;
            if (amq != null) {
                this.f832j = amq;
                this.f831i = null;
            }
            aml aml = this.f828f;
            aml.mo648a();
            aml.f756c = null;
            aml.f759f = null;
            this.f827e.close();
            new amo(this, audioTrack).start();
        }
    }

    /* renamed from: m */
    private final void m1118m() {
        int i = 0;
        while (true) {
            alu[] aluArr = this.f816I;
            if (i < aluArr.length) {
                alu alu = aluArr[i];
                alu.mo620h();
                this.f817J[i] = alu.mo618f();
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: d */
    public final akq mo635d() {
        akq akq = this.f835m;
        if (akq != null) {
            return akq;
        }
        return !this.f829g.isEmpty() ? ((ams) this.f829g.getLast()).f804a : this.f836n;
    }

    /* renamed from: j */
    public final long mo670j() {
        amq amq = this.f832j;
        return amq.f790a ? this.f839q / ((long) amq.f791b) : this.f840r;
    }

    /* renamed from: k */
    public final long mo671k() {
        amq amq = this.f832j;
        return amq.f790a ? this.f814G / ((long) amq.f793d) : this.f815H;
    }

    /* renamed from: b */
    public final void mo633b() {
        if (this.f842t == 1) {
            this.f842t = 2;
        }
    }

    /* renamed from: c */
    public final boolean mo634c() {
        return mo669i() && this.f828f.mo649a(mo671k());
    }

    /* renamed from: a */
    public final void mo631a() {
        this.f847y = true;
        if (mo669i()) {
            ((amj) bks.m3507a(this.f828f.f759f)).mo641b();
            this.f833k.play();
        }
    }

    /* renamed from: l */
    public final void mo672l() {
        if (!this.f822O) {
            this.f822O = true;
            aml aml = this.f828f;
            long k = mo671k();
            aml.f777x = aml.mo652c();
            aml.f775v = SystemClock.elapsedRealtime() * 1000;
            aml.f778y = k;
            this.f833k.stop();
            this.f813F = 0;
        }
    }

    /* renamed from: a */
    public final void mo664a(long j) {
        ByteBuffer byteBuffer;
        int length = this.f816I.length;
        int i = length;
        while (i >= 0) {
            if (i > 0) {
                byteBuffer = this.f817J[i - 1];
            } else {
                byteBuffer = this.f845w;
                if (byteBuffer == null) {
                    byteBuffer = alu.f724a;
                }
            }
            if (i != length) {
                alu alu = this.f816I[i];
                alu.mo611a(byteBuffer);
                ByteBuffer f = alu.mo618f();
                this.f817J[i] = f;
                if (f.hasRemaining()) {
                    i++;
                }
            } else {
                mo666a(byteBuffer, j);
            }
            if (!byteBuffer.hasRemaining()) {
                i--;
            } else {
                return;
            }
        }
    }

    /* renamed from: f */
    public final void mo637f() {
        mo636e();
        for (alu i : this.f826d) {
            i.mo621i();
        }
        this.f811D[0].mo621i();
        this.f848z = 0;
        this.f847y = false;
    }

    /* renamed from: h */
    public final void mo668h() {
        if (!mo669i()) {
            return;
        }
        if (blm.f4293a < 21) {
            AudioTrack audioTrack = this.f833k;
            float f = this.f844v;
            audioTrack.setStereoVolume(f, f);
            return;
        }
        this.f833k.setVolume(this.f844v);
    }

    /* renamed from: a */
    public final boolean mo632a(int i, int i2) {
        if (blm.m3672c(i2)) {
            return i2 != 4 || blm.f4293a >= 21;
        }
        alr alr = this.f810C;
        if (alr == null || Arrays.binarySearch(alr.f722a, i2) < 0) {
            return false;
        }
        return i == -1 || i <= this.f810C.f723b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00f1, code lost:
        if (r13 >= r12) goto L_0x00f5;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo666a(java.nio.ByteBuffer r11, long r12) {
        /*
            r10 = this;
            boolean r0 = r11.hasRemaining()
            if (r0 == 0) goto L_0x012f
            java.nio.ByteBuffer r0 = r10.f818K
            r1 = 21
            r2 = 1
            r3 = 0
            if (r0 != 0) goto L_0x0032
            r10.f818K = r11
            int r0 = p000.blm.f4293a
            if (r0 >= r1) goto L_0x003b
            int r0 = r11.remaining()
            byte[] r4 = r10.f819L
            if (r4 == 0) goto L_0x001f
            int r4 = r4.length
            if (r4 >= r0) goto L_0x0023
        L_0x001f:
            byte[] r4 = new byte[r0]
            r10.f819L = r4
        L_0x0023:
            int r4 = r11.position()
            byte[] r5 = r10.f819L
            r11.get(r5, r3, r0)
            r11.position(r4)
            r10.f820M = r3
            goto L_0x003b
        L_0x0032:
            if (r0 != r11) goto L_0x0036
            r0 = 1
            goto L_0x0038
        L_0x0036:
            r0 = 0
        L_0x0038:
            p000.bks.m3510a(r0)
        L_0x003b:
            int r0 = r11.remaining()
            int r4 = p000.blm.f4293a
            if (r4 >= r1) goto L_0x0078
            aml r12 = r10.f828f
            long r1 = r10.f814G
            long r4 = r12.mo652c()
            int r13 = r12.f757d
            int r12 = r12.f758e
            long r6 = (long) r13
            long r4 = r4 * r6
            long r1 = r1 - r4
            int r13 = (int) r1
            int r12 = r12 - r13
            if (r12 <= 0) goto L_0x0076
            int r12 = java.lang.Math.min(r0, r12)
            android.media.AudioTrack r13 = r10.f833k
            byte[] r1 = r10.f819L
            int r2 = r10.f820M
            int r3 = r13.write(r1, r2, r12)
            if (r3 <= 0) goto L_0x0076
            int r12 = r10.f820M
            int r12 = r12 + r3
            r10.f820M = r12
            int r12 = r11.position()
            int r12 = r12 + r3
            r11.position(r12)
            goto L_0x0105
        L_0x0076:
            goto L_0x0105
        L_0x0078:
            boolean r1 = r10.f808A
            if (r1 != 0) goto L_0x0084
            android.media.AudioTrack r12 = r10.f833k
            int r3 = m1117a(r12, r11, r0)
            goto L_0x0105
        L_0x0084:
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r1 == 0) goto L_0x008f
            r1 = 1
            goto L_0x0091
        L_0x008f:
            r1 = 0
        L_0x0091:
            p000.bks.m3512b(r1)
            android.media.AudioTrack r4 = r10.f833k
            int r1 = p000.blm.f4293a
            r5 = 26
            r6 = 1000(0x3e8, double:4.94E-321)
            if (r1 < r5) goto L_0x00a9
            r1 = 1
            long r8 = r12 * r6
            r5 = r11
            r6 = r0
            r7 = r1
            int r3 = r4.write(r5, r6, r7, r8)
            goto L_0x0105
        L_0x00a9:
            java.nio.ByteBuffer r1 = r10.f812E
            if (r1 != 0) goto L_0x00c2
            r1 = 16
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r1)
            r10.f812E = r1
            java.nio.ByteOrder r5 = java.nio.ByteOrder.BIG_ENDIAN
            r1.order(r5)
            java.nio.ByteBuffer r1 = r10.f812E
            r5 = 1431633921(0x55550001, float:1.46372496E13)
            r1.putInt(r5)
        L_0x00c2:
            int r1 = r10.f813F
            if (r1 != 0) goto L_0x00dc
            java.nio.ByteBuffer r1 = r10.f812E
            r5 = 4
            r1.putInt(r5, r0)
            java.nio.ByteBuffer r1 = r10.f812E
            r5 = 8
            long r12 = r12 * r6
            r1.putLong(r5, r12)
            java.nio.ByteBuffer r12 = r10.f812E
            r12.position(r3)
            r10.f813F = r0
        L_0x00dc:
            java.nio.ByteBuffer r12 = r10.f812E
            int r12 = r12.remaining()
            if (r12 <= 0) goto L_0x00f5
            java.nio.ByteBuffer r13 = r10.f812E
            int r13 = r4.write(r13, r12, r2)
            if (r13 >= 0) goto L_0x00f1
            r10.f813F = r3
            r3 = r13
            goto L_0x0105
        L_0x00f1:
            if (r13 < r12) goto L_0x00f4
            goto L_0x00f5
        L_0x00f4:
            goto L_0x0076
        L_0x00f5:
            int r11 = m1117a(r4, r11, r0)
            if (r11 < 0) goto L_0x0101
            int r12 = r10.f813F
            int r12 = r12 - r11
            r10.f813F = r12
            goto L_0x0104
        L_0x0101:
            r10.f813F = r3
        L_0x0104:
            r3 = r11
        L_0x0105:
            long r11 = android.os.SystemClock.elapsedRealtime()
            r10.f809B = r11
            if (r3 < 0) goto L_0x0129
            amq r11 = r10.f832j
            boolean r11 = r11.f790a
            if (r11 == 0) goto L_0x0119
            long r12 = r10.f814G
            long r1 = (long) r3
            long r12 = r12 + r1
            r10.f814G = r12
        L_0x0119:
            if (r3 != r0) goto L_0x0128
            if (r11 != 0) goto L_0x0125
            long r11 = r10.f815H
            int r13 = r10.f841s
            long r0 = (long) r13
            long r11 = r11 + r0
            r10.f815H = r11
        L_0x0125:
            r11 = 0
            r10.f818K = r11
        L_0x0128:
            return
        L_0x0129:
            amg r11 = new amg
            r11.<init>(r3)
            throw r11
        L_0x012f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.amu.mo666a(java.nio.ByteBuffer, long):void");
    }

    /* renamed from: a */
    private static int m1117a(AudioTrack audioTrack, ByteBuffer byteBuffer, int i) {
        return audioTrack.write(byteBuffer, i, 1);
    }
}
