package defpackage;

import android.media.AudioTrack;
import android.os.ConditionVariable;
import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* renamed from: amu  reason: default package */
/* compiled from: PG */
public final class amu implements amh {
    public boolean A;
    public long B;
    private final alr C;
    private final alu[] D;
    private ByteBuffer E;
    private int F;
    private long G;
    private long H;
    private alu[] I;
    private ByteBuffer[] J;
    private ByteBuffer K;
    private byte[] L;
    private int M;
    private int N;
    private boolean O;
    public final amp a;
    public final amn b = new amn();
    public final and c = new and();
    public final alu[] d;
    public final ConditionVariable e = new ConditionVariable(true);
    public final aml f = new aml(new amt(this));
    public final ArrayDeque g;
    public amf h;
    public amq i;
    public amq j;
    public AudioTrack k;
    public final alq l;
    public akq m;
    public akq n;
    public long o;
    public long p;
    public long q;
    public long r;
    public int s;
    public int t;
    public long u;
    public float v;
    public ByteBuffer w;
    public boolean x;
    public boolean y;
    public int z;

    public amu(alr alr, alu[] aluArr) {
        amr amr = new amr(aluArr);
        this.C = alr;
        this.a = (amp) bks.a(amr);
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new amz(), this.b, this.c);
        Collections.addAll(arrayList, amr.a);
        this.d = (alu[]) arrayList.toArray(new alu[0]);
        this.D = new alu[]{new amw()};
        this.v = 1.0f;
        this.t = 0;
        this.l = alq.a;
        this.z = 0;
        this.n = akq.a;
        this.N = -1;
        this.I = new alu[0];
        this.J = new ByteBuffer[0];
        this.g = new ArrayDeque();
    }

    public final boolean i() {
        return this.k != null;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.max(long, long):long}
     arg types: [int, long]
     candidates:
      ClspMth{java.lang.Math.max(double, double):double}
      ClspMth{java.lang.Math.max(int, int):int}
      ClspMth{java.lang.Math.max(float, float):float}
      ClspMth{java.lang.Math.max(long, long):long} */
    public final void a(akq akq, long j2) {
        akq akq2;
        if (this.j.j) {
            akq2 = this.a.a(akq);
        } else {
            akq2 = akq.a;
        }
        this.g.add(new ams(akq2, Math.max(0L, j2), this.j.a(k())));
        alu[] aluArr = this.j.k;
        ArrayList arrayList = new ArrayList();
        for (alu alu : aluArr) {
            if (alu.a()) {
                arrayList.add(alu);
            } else {
                alu.h();
            }
        }
        int size = arrayList.size();
        this.I = (alu[]) arrayList.toArray(new alu[size]);
        this.J = new ByteBuffer[size];
        m();
    }

    public final boolean g() {
        boolean z2;
        if (this.N == -1) {
            this.N = !this.j.i ? this.I.length : 0;
            z2 = true;
        } else {
            z2 = false;
        }
        while (true) {
            int i2 = this.N;
            alu[] aluArr = this.I;
            if (i2 >= aluArr.length) {
                ByteBuffer byteBuffer = this.K;
                if (byteBuffer != null) {
                    a(byteBuffer, -9223372036854775807L);
                    if (this.K != null) {
                        return false;
                    }
                }
                this.N = -1;
                return true;
            }
            alu alu = aluArr[i2];
            if (z2) {
                alu.e();
            }
            a(-9223372036854775807L);
            if (!alu.g()) {
                return false;
            }
            this.N++;
            z2 = true;
        }
    }

    public final void e() {
        if (i()) {
            this.q = 0;
            this.r = 0;
            this.G = 0;
            this.H = 0;
            this.s = 0;
            akq akq = this.m;
            if (akq != null) {
                this.n = akq;
                this.m = null;
            } else if (!this.g.isEmpty()) {
                this.n = ((ams) this.g.getLast()).a;
            }
            this.g.clear();
            this.o = 0;
            this.p = 0;
            this.c.g = 0;
            m();
            this.w = null;
            this.K = null;
            this.O = false;
            this.x = false;
            this.N = -1;
            this.E = null;
            this.F = 0;
            this.t = 0;
            if (((AudioTrack) bks.a(this.f.c)).getPlayState() == 3) {
                this.k.pause();
            }
            AudioTrack audioTrack = this.k;
            this.k = null;
            amq amq = this.i;
            if (amq != null) {
                this.j = amq;
                this.i = null;
            }
            aml aml = this.f;
            aml.a();
            aml.c = null;
            aml.f = null;
            this.e.close();
            new amo(this, audioTrack).start();
        }
    }

    private final void m() {
        int i2 = 0;
        while (true) {
            alu[] aluArr = this.I;
            if (i2 < aluArr.length) {
                alu alu = aluArr[i2];
                alu.h();
                this.J[i2] = alu.f();
                i2++;
            } else {
                return;
            }
        }
    }

    public final akq d() {
        akq akq = this.m;
        if (akq != null) {
            return akq;
        }
        return !this.g.isEmpty() ? ((ams) this.g.getLast()).a : this.n;
    }

    public final long j() {
        amq amq = this.j;
        return amq.a ? this.q / ((long) amq.b) : this.r;
    }

    public final long k() {
        amq amq = this.j;
        return amq.a ? this.G / ((long) amq.d) : this.H;
    }

    public final void b() {
        if (this.t == 1) {
            this.t = 2;
        }
    }

    public final boolean c() {
        return i() && this.f.a(k());
    }

    public final void a() {
        this.y = true;
        if (i()) {
            ((amj) bks.a(this.f.f)).b();
            this.k.play();
        }
    }

    public final void l() {
        if (!this.O) {
            this.O = true;
            aml aml = this.f;
            long k2 = k();
            aml.x = aml.c();
            aml.v = SystemClock.elapsedRealtime() * 1000;
            aml.y = k2;
            this.k.stop();
            this.F = 0;
        }
    }

    public final void a(long j2) {
        ByteBuffer byteBuffer;
        int length = this.I.length;
        int i2 = length;
        while (i2 >= 0) {
            if (i2 > 0) {
                byteBuffer = this.J[i2 - 1];
            } else {
                byteBuffer = this.w;
                if (byteBuffer == null) {
                    byteBuffer = alu.a;
                }
            }
            if (i2 != length) {
                alu alu = this.I[i2];
                alu.a(byteBuffer);
                ByteBuffer f2 = alu.f();
                this.J[i2] = f2;
                if (f2.hasRemaining()) {
                    i2++;
                }
            } else {
                a(byteBuffer, j2);
            }
            if (!byteBuffer.hasRemaining()) {
                i2--;
            } else {
                return;
            }
        }
    }

    public final void f() {
        e();
        for (alu i2 : this.d) {
            i2.i();
        }
        this.D[0].i();
        this.z = 0;
        this.y = false;
    }

    public final void h() {
        if (!i()) {
            return;
        }
        if (blm.a < 21) {
            AudioTrack audioTrack = this.k;
            float f2 = this.v;
            audioTrack.setStereoVolume(f2, f2);
            return;
        }
        this.k.setVolume(this.v);
    }

    public final boolean a(int i2, int i3) {
        if (blm.c(i3)) {
            return i3 != 4 || blm.a >= 21;
        }
        alr alr = this.C;
        if (alr == null || Arrays.binarySearch(alr.a, i3) < 0) {
            return false;
        }
        return i2 == -1 || i2 <= this.C.b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00f1, code lost:
        if (r13 >= r12) goto L_0x00f5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.nio.ByteBuffer r11, long r12) {
        /*
            r10 = this;
            boolean r0 = r11.hasRemaining()
            if (r0 == 0) goto L_0x012f
            java.nio.ByteBuffer r0 = r10.K
            r1 = 21
            r2 = 1
            r3 = 0
            if (r0 != 0) goto L_0x0032
            r10.K = r11
            int r0 = defpackage.blm.a
            if (r0 >= r1) goto L_0x003b
            int r0 = r11.remaining()
            byte[] r4 = r10.L
            if (r4 == 0) goto L_0x001f
            int r4 = r4.length
            if (r4 >= r0) goto L_0x0023
        L_0x001f:
            byte[] r4 = new byte[r0]
            r10.L = r4
        L_0x0023:
            int r4 = r11.position()
            byte[] r5 = r10.L
            r11.get(r5, r3, r0)
            r11.position(r4)
            r10.M = r3
            goto L_0x003b
        L_0x0032:
            if (r0 != r11) goto L_0x0036
            r0 = 1
            goto L_0x0038
        L_0x0036:
            r0 = 0
        L_0x0038:
            defpackage.bks.a(r0)
        L_0x003b:
            int r0 = r11.remaining()
            int r4 = defpackage.blm.a
            if (r4 >= r1) goto L_0x0078
            aml r12 = r10.f
            long r1 = r10.G
            long r4 = r12.c()
            int r13 = r12.d
            int r12 = r12.e
            long r6 = (long) r13
            long r4 = r4 * r6
            long r1 = r1 - r4
            int r13 = (int) r1
            int r12 = r12 - r13
            if (r12 <= 0) goto L_0x0076
            int r12 = java.lang.Math.min(r0, r12)
            android.media.AudioTrack r13 = r10.k
            byte[] r1 = r10.L
            int r2 = r10.M
            int r3 = r13.write(r1, r2, r12)
            if (r3 <= 0) goto L_0x0076
            int r12 = r10.M
            int r12 = r12 + r3
            r10.M = r12
            int r12 = r11.position()
            int r12 = r12 + r3
            r11.position(r12)
            goto L_0x0105
        L_0x0076:
            goto L_0x0105
        L_0x0078:
            boolean r1 = r10.A
            if (r1 != 0) goto L_0x0084
            android.media.AudioTrack r12 = r10.k
            int r3 = a(r12, r11, r0)
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
            defpackage.bks.b(r1)
            android.media.AudioTrack r4 = r10.k
            int r1 = defpackage.blm.a
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
            java.nio.ByteBuffer r1 = r10.E
            if (r1 != 0) goto L_0x00c2
            r1 = 16
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r1)
            r10.E = r1
            java.nio.ByteOrder r5 = java.nio.ByteOrder.BIG_ENDIAN
            r1.order(r5)
            java.nio.ByteBuffer r1 = r10.E
            r5 = 1431633921(0x55550001, float:1.46372496E13)
            r1.putInt(r5)
        L_0x00c2:
            int r1 = r10.F
            if (r1 != 0) goto L_0x00dc
            java.nio.ByteBuffer r1 = r10.E
            r5 = 4
            r1.putInt(r5, r0)
            java.nio.ByteBuffer r1 = r10.E
            r5 = 8
            long r12 = r12 * r6
            r1.putLong(r5, r12)
            java.nio.ByteBuffer r12 = r10.E
            r12.position(r3)
            r10.F = r0
        L_0x00dc:
            java.nio.ByteBuffer r12 = r10.E
            int r12 = r12.remaining()
            if (r12 <= 0) goto L_0x00f5
            java.nio.ByteBuffer r13 = r10.E
            int r13 = r4.write(r13, r12, r2)
            if (r13 >= 0) goto L_0x00f1
            r10.F = r3
            r3 = r13
            goto L_0x0105
        L_0x00f1:
            if (r13 < r12) goto L_0x00f4
            goto L_0x00f5
        L_0x00f4:
            goto L_0x0076
        L_0x00f5:
            int r11 = a(r4, r11, r0)
            if (r11 < 0) goto L_0x0101
            int r12 = r10.F
            int r12 = r12 - r11
            r10.F = r12
            goto L_0x0104
        L_0x0101:
            r10.F = r3
        L_0x0104:
            r3 = r11
        L_0x0105:
            long r11 = android.os.SystemClock.elapsedRealtime()
            r10.B = r11
            if (r3 < 0) goto L_0x0129
            amq r11 = r10.j
            boolean r11 = r11.a
            if (r11 == 0) goto L_0x0119
            long r12 = r10.G
            long r1 = (long) r3
            long r12 = r12 + r1
            r10.G = r12
        L_0x0119:
            if (r3 != r0) goto L_0x0128
            if (r11 != 0) goto L_0x0125
            long r11 = r10.H
            int r13 = r10.s
            long r0 = (long) r13
            long r11 = r11 + r0
            r10.H = r11
        L_0x0125:
            r11 = 0
            r10.K = r11
        L_0x0128:
            return
        L_0x0129:
            amg r11 = new amg
            r11.<init>(r3)
            throw r11
        L_0x012f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amu.a(java.nio.ByteBuffer, long):void");
    }

    private static int a(AudioTrack audioTrack, ByteBuffer byteBuffer, int i2) {
        return audioTrack.write(byteBuffer, i2, 1);
    }
}
