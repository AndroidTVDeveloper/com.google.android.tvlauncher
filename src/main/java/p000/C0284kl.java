package p000;

import android.os.Build;
import android.support.p002v7.widget.RecyclerView;
import android.view.animation.Interpolator;
import android.widget.OverScroller;

/* renamed from: kl */
/* compiled from: PG */
public final class C0284kl implements Runnable {

    /* renamed from: a */
    public int f9775a;

    /* renamed from: b */
    public int f9776b;

    /* renamed from: c */
    public OverScroller f9777c;

    /* renamed from: d */
    public Interpolator f9778d = RecyclerView.f1018K;

    /* renamed from: e */
    public final /* synthetic */ RecyclerView f9779e;

    /* renamed from: f */
    private boolean f9780f = false;

    /* renamed from: g */
    private boolean f9781g = false;

    public C0284kl(RecyclerView recyclerView) {
        this.f9779e = recyclerView;
        this.f9777c = new OverScroller(recyclerView.getContext(), RecyclerView.f1018K);
    }

    /* renamed from: c */
    private final void m7795c() {
        this.f9779e.removeCallbacks(this);
        C0107dx.m7201a(this.f9779e, this);
    }

    /* renamed from: a */
    public final void mo5423a() {
        if (this.f9780f) {
            this.f9781g = true;
        } else {
            m7795c();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0122  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r22 = this;
            r0 = r22
            android.support.v7.widget.RecyclerView r1 = r0.f9779e
            jx r2 = r1.f1068h
            if (r2 == 0) goto L_0x01c8
            r2 = 0
            r0.f9781g = r2
            r3 = 1
            r0.f9780f = r3
            r1.mo847c()
            android.widget.OverScroller r1 = r0.f9777c
            boolean r4 = r1.computeScrollOffset()
            if (r4 == 0) goto L_0x01a1
            int r4 = r1.getCurrX()
            int r5 = r1.getCurrY()
            int r6 = r0.f9775a
            int r6 = r4 - r6
            int r7 = r0.f9776b
            int r13 = r5 - r7
            r0.f9775a = r4
            r0.f9776b = r5
            android.support.v7.widget.RecyclerView r7 = r0.f9779e
            int[] r10 = r7.f1030J
            r10[r2] = r2
            r10[r3] = r2
            r11 = 0
            r12 = 1
            r8 = r6
            r9 = r13
            boolean r4 = r7.mo839a(r8, r9, r10, r11, r12)
            if (r4 == 0) goto L_0x004a
            android.support.v7.widget.RecyclerView r4 = r0.f9779e
            int[] r4 = r4.f1030J
            r5 = r4[r2]
            int r6 = r6 - r5
            r4 = r4[r3]
            int r13 = r13 - r4
            goto L_0x004b
        L_0x004a:
        L_0x004b:
            android.support.v7.widget.RecyclerView r4 = r0.f9779e
            int r4 = r4.getOverScrollMode()
            r5 = 2
            if (r4 != r5) goto L_0x0055
            goto L_0x005a
        L_0x0055:
            android.support.v7.widget.RecyclerView r4 = r0.f9779e
            r4.mo844b(r6, r13)
        L_0x005a:
            android.support.v7.widget.RecyclerView r4 = r0.f9779e
            jp r7 = r4.f1067g
            if (r7 == 0) goto L_0x00a1
            int[] r7 = r4.f1030J
            r7[r2] = r2
            r7[r3] = r2
            r4.mo828a(r6, r13, r7)
            android.support.v7.widget.RecyclerView r4 = r0.f9779e
            int[] r7 = r4.f1030J
            r8 = r7[r2]
            r7 = r7[r3]
            int r6 = r6 - r8
            int r13 = r13 - r7
            jx r9 = r4.f1068h
            kj r9 = r9.f9710c
            if (r9 != 0) goto L_0x007a
        L_0x0079:
            goto L_0x00a3
        L_0x007a:
            boolean r10 = r9.f9746d
            if (r10 != 0) goto L_0x0079
            boolean r10 = r9.f9747e
            if (r10 == 0) goto L_0x0079
            kk r4 = r4.f1024D
            int r4 = r4.mo5420a()
            if (r4 != 0) goto L_0x008f
            r9.mo5411a()
            goto L_0x00a3
        L_0x008f:
            int r10 = r9.f9743a
            if (r10 < r4) goto L_0x009c
            int r4 = r4 + -1
            r9.f9743a = r4
            r9.mo5412a(r8, r7)
            goto L_0x00a3
        L_0x009c:
            r9.mo5412a(r8, r7)
            goto L_0x00a3
        L_0x00a1:
            r7 = 0
            r8 = 0
        L_0x00a3:
            android.support.v7.widget.RecyclerView r4 = r0.f9779e
            java.util.ArrayList r4 = r4.f1070j
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L_0x00b2
            android.support.v7.widget.RecyclerView r4 = r0.f9779e
            r4.invalidate()
        L_0x00b2:
            android.support.v7.widget.RecyclerView r14 = r0.f9779e
            int[] r4 = r14.f1030J
            r4[r2] = r2
            r4[r3] = r2
            r19 = 0
            r20 = 1
            r15 = r8
            r16 = r7
            r17 = r6
            r18 = r13
            r21 = r4
            r14.mo826a(r15, r16, r17, r18, r19, r20, r21)
            android.support.v7.widget.RecyclerView r4 = r0.f9779e
            int[] r9 = r4.f1030J
            r10 = r9[r2]
            int r6 = r6 - r10
            r9 = r9[r3]
            int r13 = r13 - r9
            if (r8 == 0) goto L_0x00d7
            goto L_0x00d9
        L_0x00d7:
            if (r7 == 0) goto L_0x00dc
        L_0x00d9:
            r4.mo849c(r8, r7)
        L_0x00dc:
            android.support.v7.widget.RecyclerView r4 = r0.f9779e
            boolean r4 = r4.awakenScrollBars()
            if (r4 != 0) goto L_0x00e9
            android.support.v7.widget.RecyclerView r4 = r0.f9779e
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
            android.support.v7.widget.RecyclerView r9 = r0.f9779e
            jx r10 = r9.f1068h
            kj r10 = r10.f9710c
            if (r10 == 0) goto L_0x011a
            boolean r10 = r10.f9746d
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
            android.support.v7.widget.RecyclerView r5 = r0.f9779e
            if (r4 >= 0) goto L_0x014d
            r5.mo874f()
            android.widget.EdgeEffect r6 = r5.f1080t
            boolean r6 = r6.isFinished()
            if (r6 == 0) goto L_0x015f
            android.widget.EdgeEffect r6 = r5.f1080t
            int r7 = -r4
            r6.onAbsorb(r7)
            goto L_0x015f
        L_0x014d:
            if (r4 <= 0) goto L_0x015f
            r5.mo877g()
            android.widget.EdgeEffect r6 = r5.f1082v
            boolean r6 = r6.isFinished()
            if (r6 == 0) goto L_0x015f
            android.widget.EdgeEffect r6 = r5.f1082v
            r6.onAbsorb(r4)
        L_0x015f:
            if (r1 >= 0) goto L_0x0173
            r5.mo884h()
            android.widget.EdgeEffect r6 = r5.f1081u
            boolean r6 = r6.isFinished()
            if (r6 == 0) goto L_0x0185
            android.widget.EdgeEffect r6 = r5.f1081u
            int r7 = -r1
            r6.onAbsorb(r7)
            goto L_0x0185
        L_0x0173:
            if (r1 <= 0) goto L_0x0185
            r5.mo886i()
            android.widget.EdgeEffect r6 = r5.f1083w
            boolean r6 = r6.isFinished()
            if (r6 == 0) goto L_0x0185
            android.widget.EdgeEffect r6 = r5.f1083w
            r6.onAbsorb(r1)
        L_0x0185:
            if (r4 != 0) goto L_0x018a
            if (r1 != 0) goto L_0x018a
            goto L_0x018d
        L_0x018a:
            p000.C0107dx.m7207d(r5)
        L_0x018d:
            android.support.v7.widget.RecyclerView r1 = r0.f9779e
            io r1 = r1.f1023C
            r1.mo5260a()
            goto L_0x01a1
        L_0x0195:
            r22.mo5423a()
            android.support.v7.widget.RecyclerView r1 = r0.f9779e
            iq r4 = r1.f1022B
            if (r4 == 0) goto L_0x01a1
            r4.mo5264a(r1, r8, r7)
        L_0x01a1:
            android.support.v7.widget.RecyclerView r1 = r0.f9779e
            jx r1 = r1.f1068h
            kj r1 = r1.f9710c
            if (r1 == 0) goto L_0x01b2
            boolean r4 = r1.f9746d
            if (r4 != 0) goto L_0x01ae
            goto L_0x01b2
        L_0x01ae:
            r1.mo5412a(r2, r2)
        L_0x01b2:
            r0.f9780f = r2
            boolean r1 = r0.f9781g
            if (r1 != 0) goto L_0x01c4
            android.support.v7.widget.RecyclerView r1 = r0.f9779e
            r1.mo843b(r2)
            android.support.v7.widget.RecyclerView r1 = r0.f9779e
            r1.mo875f(r3)
            return
        L_0x01c4:
            r22.m7795c()
            return
        L_0x01c8:
            r22.mo5425b()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0284kl.run():void");
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.min(float, float):float}
     arg types: [int, float]
     candidates:
      ClspMth{java.lang.Math.min(double, double):double}
      ClspMth{java.lang.Math.min(long, long):long}
      ClspMth{java.lang.Math.min(int, int):int}
      ClspMth{java.lang.Math.min(float, float):float} */
    /* renamed from: a */
    public final void mo5424a(int i, int i2, int i3, Interpolator interpolator) {
        int i4;
        int i5;
        if (i3 == Integer.MIN_VALUE) {
            int abs = Math.abs(i);
            int abs2 = Math.abs(i2);
            int sqrt = (int) Math.sqrt(0.0d);
            int sqrt2 = (int) Math.sqrt((double) ((i * i) + (i2 * i2)));
            int height = abs <= abs2 ? this.f9779e.getHeight() : this.f9779e.getWidth();
            float f = (float) height;
            float f2 = (float) (height / 2);
            float sin = f2 + (((float) Math.sin((double) ((Math.min(1.0f, ((float) sqrt2) / f) - 8.0f) * 0.47123894f))) * f2);
            if (sqrt > 0) {
                i5 = Math.round(Math.abs(sin / ((float) sqrt)) * 1000.0f) << 2;
            } else {
                if (abs <= abs2) {
                    abs = abs2;
                }
                i5 = (int) (((((float) abs) / f) + 1.0f) * 300.0f);
            }
            i4 = Math.min(i5, 2000);
        } else {
            i4 = i3;
        }
        if (interpolator == null) {
            interpolator = RecyclerView.f1018K;
        }
        if (this.f9778d != interpolator) {
            this.f9778d = interpolator;
            this.f9777c = new OverScroller(this.f9779e.getContext(), interpolator);
        }
        this.f9776b = 0;
        this.f9775a = 0;
        this.f9779e.mo843b(2);
        this.f9777c.startScroll(0, 0, i, i2, i4);
        int i6 = Build.VERSION.SDK_INT;
        mo5423a();
    }

    /* renamed from: b */
    public final void mo5425b() {
        this.f9779e.removeCallbacks(this);
        this.f9777c.abortAnimation();
    }
}
