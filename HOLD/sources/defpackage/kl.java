package defpackage;

import android.os.Build;
import android.support.v7.widget.RecyclerView;
import android.view.animation.Interpolator;
import android.widget.OverScroller;

/* renamed from: kl  reason: default package */
/* compiled from: PG */
public final class kl implements Runnable {
    public int a;
    public int b;
    public OverScroller c;
    public Interpolator d = RecyclerView.K;
    public final /* synthetic */ RecyclerView e;
    private boolean f = false;
    private boolean g = false;

    public kl(RecyclerView recyclerView) {
        this.e = recyclerView;
        this.c = new OverScroller(recyclerView.getContext(), RecyclerView.K);
    }

    private final void c() {
        this.e.removeCallbacks(this);
        dx.a(this.e, this);
    }

    public final void a() {
        if (this.f) {
            this.g = true;
        } else {
            c();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0122  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r22 = this;
            r0 = r22
            android.support.v7.widget.RecyclerView r1 = r0.e
            jx r2 = r1.h
            if (r2 == 0) goto L_0x01c8
            r2 = 0
            r0.g = r2
            r3 = 1
            r0.f = r3
            r1.c()
            android.widget.OverScroller r1 = r0.c
            boolean r4 = r1.computeScrollOffset()
            if (r4 == 0) goto L_0x01a1
            int r4 = r1.getCurrX()
            int r5 = r1.getCurrY()
            int r6 = r0.a
            int r6 = r4 - r6
            int r7 = r0.b
            int r13 = r5 - r7
            r0.a = r4
            r0.b = r5
            android.support.v7.widget.RecyclerView r7 = r0.e
            int[] r10 = r7.J
            r10[r2] = r2
            r10[r3] = r2
            r11 = 0
            r12 = 1
            r8 = r6
            r9 = r13
            boolean r4 = r7.a(r8, r9, r10, r11, r12)
            if (r4 == 0) goto L_0x004a
            android.support.v7.widget.RecyclerView r4 = r0.e
            int[] r4 = r4.J
            r5 = r4[r2]
            int r6 = r6 - r5
            r4 = r4[r3]
            int r13 = r13 - r4
            goto L_0x004b
        L_0x004a:
        L_0x004b:
            android.support.v7.widget.RecyclerView r4 = r0.e
            int r4 = r4.getOverScrollMode()
            r5 = 2
            if (r4 != r5) goto L_0x0055
            goto L_0x005a
        L_0x0055:
            android.support.v7.widget.RecyclerView r4 = r0.e
            r4.b(r6, r13)
        L_0x005a:
            android.support.v7.widget.RecyclerView r4 = r0.e
            jp r7 = r4.g
            if (r7 == 0) goto L_0x00a1
            int[] r7 = r4.J
            r7[r2] = r2
            r7[r3] = r2
            r4.a(r6, r13, r7)
            android.support.v7.widget.RecyclerView r4 = r0.e
            int[] r7 = r4.J
            r8 = r7[r2]
            r7 = r7[r3]
            int r6 = r6 - r8
            int r13 = r13 - r7
            jx r9 = r4.h
            kj r9 = r9.c
            if (r9 != 0) goto L_0x007a
        L_0x0079:
            goto L_0x00a3
        L_0x007a:
            boolean r10 = r9.d
            if (r10 != 0) goto L_0x0079
            boolean r10 = r9.e
            if (r10 == 0) goto L_0x0079
            kk r4 = r4.D
            int r4 = r4.a()
            if (r4 != 0) goto L_0x008f
            r9.a()
            goto L_0x00a3
        L_0x008f:
            int r10 = r9.a
            if (r10 < r4) goto L_0x009c
            int r4 = r4 + -1
            r9.a = r4
            r9.a(r8, r7)
            goto L_0x00a3
        L_0x009c:
            r9.a(r8, r7)
            goto L_0x00a3
        L_0x00a1:
            r7 = 0
            r8 = 0
        L_0x00a3:
            android.support.v7.widget.RecyclerView r4 = r0.e
            java.util.ArrayList r4 = r4.j
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L_0x00b2
            android.support.v7.widget.RecyclerView r4 = r0.e
            r4.invalidate()
        L_0x00b2:
            android.support.v7.widget.RecyclerView r14 = r0.e
            int[] r4 = r14.J
            r4[r2] = r2
            r4[r3] = r2
            r19 = 0
            r20 = 1
            r15 = r8
            r16 = r7
            r17 = r6
            r18 = r13
            r21 = r4
            r14.a(r15, r16, r17, r18, r19, r20, r21)
            android.support.v7.widget.RecyclerView r4 = r0.e
            int[] r9 = r4.J
            r10 = r9[r2]
            int r6 = r6 - r10
            r9 = r9[r3]
            int r13 = r13 - r9
            if (r8 == 0) goto L_0x00d7
            goto L_0x00d9
        L_0x00d7:
            if (r7 == 0) goto L_0x00dc
        L_0x00d9:
            r4.c(r8, r7)
        L_0x00dc:
            android.support.v7.widget.RecyclerView r4 = r0.e
            boolean r4 = r4.awakenScrollBars()
            if (r4 != 0) goto L_0x00e9
            android.support.v7.widget.RecyclerView r4 = r0.e
            r4.invalidate()
        L_0x00e9:
            int r4 = r1.getCurrX()
            int r9 = r1.getFinalX()
            int r10 = r1.getCurrY()
            int r11 = r1.getFinalY()
            boolean r12 = r1.isFinished()
            if (r12 == 0) goto L_0x0101
        L_0x00ff:
            r4 = 1
            goto L_0x010e
        L_0x0101:
            if (r4 == r9) goto L_0x0108
            if (r6 == 0) goto L_0x0106
            goto L_0x0108
        L_0x0106:
            r4 = 0
            goto L_0x010e
        L_0x0108:
            if (r10 == r11) goto L_0x00ff
            if (r13 != 0) goto L_0x00ff
            r4 = 0
        L_0x010e:
            android.support.v7.widget.RecyclerView r9 = r0.e
            jx r10 = r9.h
            kj r10 = r10.c
            if (r10 == 0) goto L_0x011a
            boolean r10 = r10.d
            if (r10 != 0) goto L_0x0195
        L_0x011a:
            if (r4 == 0) goto L_0x0195
            int r4 = r9.getOverScrollMode()
            if (r4 == r5) goto L_0x018d
            float r1 = r1.getCurrVelocity()
            int r1 = (int) r1
            if (r6 >= 0) goto L_0x012b
            int r4 = -r1
            goto L_0x0130
        L_0x012b:
            if (r6 <= 0) goto L_0x012f
            r4 = r1
            goto L_0x0130
        L_0x012f:
            r4 = 0
        L_0x0130:
            if (r13 >= 0) goto L_0x0134
            int r1 = -r1
            goto L_0x0137
        L_0x0134:
            if (r13 > 0) goto L_0x0137
            r1 = 0
        L_0x0137:
            android.support.v7.widget.RecyclerView r5 = r0.e
            if (r4 >= 0) goto L_0x014d
            r5.f()
            android.widget.EdgeEffect r6 = r5.t
            boolean r6 = r6.isFinished()
            if (r6 == 0) goto L_0x015f
            android.widget.EdgeEffect r6 = r5.t
            int r7 = -r4
            r6.onAbsorb(r7)
            goto L_0x015f
        L_0x014d:
            if (r4 <= 0) goto L_0x015f
            r5.g()
            android.widget.EdgeEffect r6 = r5.v
            boolean r6 = r6.isFinished()
            if (r6 == 0) goto L_0x015f
            android.widget.EdgeEffect r6 = r5.v
            r6.onAbsorb(r4)
        L_0x015f:
            if (r1 >= 0) goto L_0x0173
            r5.h()
            android.widget.EdgeEffect r6 = r5.u
            boolean r6 = r6.isFinished()
            if (r6 == 0) goto L_0x0185
            android.widget.EdgeEffect r6 = r5.u
            int r7 = -r1
            r6.onAbsorb(r7)
            goto L_0x0185
        L_0x0173:
            if (r1 <= 0) goto L_0x0185
            r5.i()
            android.widget.EdgeEffect r6 = r5.w
            boolean r6 = r6.isFinished()
            if (r6 == 0) goto L_0x0185
            android.widget.EdgeEffect r6 = r5.w
            r6.onAbsorb(r1)
        L_0x0185:
            if (r4 != 0) goto L_0x018a
            if (r1 != 0) goto L_0x018a
            goto L_0x018d
        L_0x018a:
            defpackage.dx.d(r5)
        L_0x018d:
            android.support.v7.widget.RecyclerView r1 = r0.e
            io r1 = r1.C
            r1.a()
            goto L_0x01a1
        L_0x0195:
            r22.a()
            android.support.v7.widget.RecyclerView r1 = r0.e
            iq r4 = r1.B
            if (r4 == 0) goto L_0x01a1
            r4.a(r1, r8, r7)
        L_0x01a1:
            android.support.v7.widget.RecyclerView r1 = r0.e
            jx r1 = r1.h
            kj r1 = r1.c
            if (r1 == 0) goto L_0x01b2
            boolean r4 = r1.d
            if (r4 != 0) goto L_0x01ae
            goto L_0x01b2
        L_0x01ae:
            r1.a(r2, r2)
        L_0x01b2:
            r0.f = r2
            boolean r1 = r0.g
            if (r1 != 0) goto L_0x01c4
            android.support.v7.widget.RecyclerView r1 = r0.e
            r1.b(r2)
            android.support.v7.widget.RecyclerView r1 = r0.e
            r1.f(r3)
            return
        L_0x01c4:
            r22.c()
            return
        L_0x01c8:
            r22.b()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kl.run():void");
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.min(float, float):float}
     arg types: [int, float]
     candidates:
      ClspMth{java.lang.Math.min(double, double):double}
      ClspMth{java.lang.Math.min(long, long):long}
      ClspMth{java.lang.Math.min(int, int):int}
      ClspMth{java.lang.Math.min(float, float):float} */
    public final void a(int i, int i2, int i3, Interpolator interpolator) {
        int i4;
        int i5;
        if (i3 == Integer.MIN_VALUE) {
            int abs = Math.abs(i);
            int abs2 = Math.abs(i2);
            int sqrt = (int) Math.sqrt(0.0d);
            int sqrt2 = (int) Math.sqrt((double) ((i * i) + (i2 * i2)));
            int height = abs <= abs2 ? this.e.getHeight() : this.e.getWidth();
            float f2 = (float) height;
            float f3 = (float) (height / 2);
            float sin = f3 + (((float) Math.sin((double) ((Math.min(1.0f, ((float) sqrt2) / f2) - 8.0f) * 0.47123894f))) * f3);
            if (sqrt > 0) {
                i5 = Math.round(Math.abs(sin / ((float) sqrt)) * 1000.0f) << 2;
            } else {
                if (abs <= abs2) {
                    abs = abs2;
                }
                i5 = (int) (((((float) abs) / f2) + 1.0f) * 300.0f);
            }
            i4 = Math.min(i5, 2000);
        } else {
            i4 = i3;
        }
        if (interpolator == null) {
            interpolator = RecyclerView.K;
        }
        if (this.d != interpolator) {
            this.d = interpolator;
            this.c = new OverScroller(this.e.getContext(), interpolator);
        }
        this.b = 0;
        this.a = 0;
        this.e.b(2);
        this.c.startScroll(0, 0, i, i2, i4);
        int i6 = Build.VERSION.SDK_INT;
        a();
    }

    public final void b() {
        this.e.removeCallbacks(this);
        this.c.abortAnimation();
    }
}
