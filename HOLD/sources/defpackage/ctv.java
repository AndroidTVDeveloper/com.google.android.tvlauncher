package defpackage;

import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: ctv  reason: default package */
/* compiled from: PG */
public final class ctv extends den {
    public static /* synthetic */ int b;
    private static final Interpolator n = new DecelerateInterpolator(3.0f);
    private static final Interpolator o = new AccelerateInterpolator(3.0f);
    public final Set a = new HashSet();
    private final Interpolator p;

    public ctv() {
        g();
        this.p = new DecelerateInterpolator();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: dei.a(android.view.View, int, int, float, android.view.animation.Interpolator):android.animation.Animator
     arg types: [android.widget.ProgressBar, int, int, float, android.view.animation.Interpolator]
     candidates:
      dei.a(android.view.View, float, float, float, android.view.animation.Interpolator):android.animation.Animator
      dei.a(android.view.View, android.graphics.Rect, android.graphics.Rect, float, android.view.animation.Interpolator):android.animation.Animator
      dei.a(android.view.View, int, int, float, android.view.animation.Interpolator):android.animation.Animator */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0314  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x031f  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x03b2  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x03d5  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x03eb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean d(defpackage.km r23, defpackage.jt r24, defpackage.jt r25) {
        /*
            r22 = this;
            r0 = r22
            r1 = r23
            java.util.Map r2 = r0.c
            java.lang.Object r2 = r2.get(r1)
            android.animation.Animator r2 = (android.animation.Animator) r2
            if (r2 == 0) goto L_0x0013
            java.util.Set r3 = r0.a
            r3.add(r2)
        L_0x0013:
            r22.g(r23)
            r2 = r24
            ctu r2 = (defpackage.ctu) r2
            r3 = r25
            ctu r3 = (defpackage.ctu) r3
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            android.view.View r5 = r1.a
            boolean r6 = r5 instanceof com.google.android.tvlauncher.home.view.ProgramView
            r7 = 0
            r8 = 1
            r9 = 0
            r10 = 2
            if (r6 == 0) goto L_0x0213
            com.google.android.tvlauncher.home.view.ProgramView r5 = (com.google.android.tvlauncher.home.view.ProgramView) r5
            android.graphics.Rect r6 = r2.e
            android.graphics.Rect r11 = r3.e
            android.view.animation.Interpolator r12 = r0.p
            android.animation.Animator r6 = defpackage.dei.a(r5, r6, r11, r12)
            defpackage.dei.a(r4, r6)
            android.view.View r6 = r1.a
            float r11 = r2.f
            float r12 = r3.f
            android.view.animation.Interpolator r13 = r0.p
            android.animation.Animator r11 = defpackage.dei.a(r6, r11, r12, r13)
            if (r11 == 0) goto L_0x0058
            float r12 = r2.h
            float r13 = r3.h
            float r12 = java.lang.Math.max(r12, r13)
            r6.setPivotY(r12)
            r4.add(r11)
        L_0x0058:
            float r11 = r2.i
            float r12 = r3.i
            float r13 = r2.l
            android.view.animation.Interpolator r14 = r0.p
            android.animation.Animator r6 = defpackage.dei.a(r6, r11, r12, r13, r14)
            defpackage.dei.a(r4, r6)
            android.widget.ImageView r6 = r5.c
            android.graphics.Rect r12 = r2.o
            android.graphics.Rect r13 = r3.o
            float r14 = r2.p
            int r11 = r6.getHeight()
            int r11 = r11 / r10
            float r15 = (float) r11
            android.view.animation.Interpolator r11 = r0.p
            r16 = r11
            r11 = r6
            android.animation.Animator r11 = defpackage.dei.a(r11, r12, r13, r14, r15, r16)
            defpackage.dei.a(r4, r11)
            android.graphics.Rect r11 = r2.e
            int r11 = r11.height()
            android.graphics.Rect r12 = r3.e
            int r12 = r12.height()
            if (r11 != r12) goto L_0x0090
            goto L_0x00a2
        L_0x0090:
            android.util.Property r13 = android.view.View.TRANSLATION_Y
            float[] r14 = new float[r10]
            int r11 = r11 - r12
            int r11 = r11 / r10
            float r10 = (float) r11
            r14[r9] = r10
            r14[r8] = r7
            android.animation.ObjectAnimator r6 = android.animation.ObjectAnimator.ofFloat(r6, r13, r14)
            r4.add(r6)
        L_0x00a2:
            android.view.View r6 = r5.b
            android.graphics.Rect r7 = r2.n
            android.graphics.Rect r10 = r3.n
            android.view.animation.Interpolator r11 = r0.p
            android.animation.Animator r6 = defpackage.dei.a(r6, r7, r10, r11)
            defpackage.dei.a(r4, r6)
            android.widget.ImageView r6 = r5.d
            android.graphics.Rect r7 = r2.q
            android.graphics.Rect r10 = r3.q
            float r11 = r2.r
            android.view.animation.Interpolator r12 = r0.p
            android.animation.Animator r7 = defpackage.dei.a(r6, r7, r10, r11, r12)
            defpackage.dei.a(r4, r7)
            android.graphics.Rect r7 = r2.q
            int r11 = r7.left
            android.graphics.Rect r7 = r2.q
            int r12 = r7.top
            android.graphics.Rect r7 = r3.q
            int r13 = r7.left
            android.graphics.Rect r7 = r3.q
            int r14 = r7.top
            float r15 = r2.s
            float r7 = r2.t
            android.view.animation.Interpolator r10 = r0.p
            r17 = r10
            r10 = r6
            r16 = r7
            android.animation.Animator r7 = defpackage.dei.a(r10, r11, r12, r13, r14, r15, r16, r17)
            defpackage.dei.a(r4, r7)
            float r7 = r2.az
            float r10 = r3.az
            android.view.animation.Interpolator r11 = r0.p
            android.animation.Animator r6 = defpackage.dei.a(r6, r7, r10, r11)
            defpackage.dei.a(r4, r6)
            android.view.View r10 = r5.g
            int r11 = r2.u
            int r12 = r2.w
            int r13 = r3.u
            int r14 = r3.w
            float r15 = r2.v
            float r6 = r3.x
            android.view.animation.Interpolator r7 = r0.p
            r16 = r6
            r17 = r7
            android.animation.Animator r6 = defpackage.dei.a(r10, r11, r12, r13, r14, r15, r16, r17)
            defpackage.dei.a(r4, r6)
            android.view.View r6 = r5.i
            int r7 = r2.y
            int r10 = r3.y
            float r11 = r2.z
            android.view.animation.Interpolator r12 = r0.p
            android.animation.Animator r7 = defpackage.dei.a(r6, r7, r10, r11, r12)
            defpackage.dei.a(r4, r7)
            int r7 = r2.A
            int r10 = r3.A
            float r11 = r2.B
            android.view.animation.Interpolator r12 = r0.p
            android.animation.Animator r6 = defpackage.dei.d(r6, r7, r10, r11, r12)
            defpackage.dei.a(r4, r6)
            android.widget.ProgressBar r6 = r5.h
            int r7 = r2.C
            int r10 = r3.C
            float r11 = r2.D
            android.view.animation.Interpolator r12 = r0.p
            android.animation.Animator r7 = defpackage.dei.a(r6, r7, r10, r11, r12)
            defpackage.dei.a(r4, r7)
            int r7 = r2.E
            int r10 = r3.E
            float r11 = r2.F
            android.view.animation.Interpolator r12 = r0.p
            android.animation.Animator r6 = defpackage.dei.d(r6, r7, r10, r11, r12)
            defpackage.dei.a(r4, r6)
            android.view.View r6 = r5.j
            android.graphics.Rect r7 = r2.G
            android.graphics.Rect r10 = r3.G
            android.view.animation.Interpolator r11 = r0.p
            android.animation.Animator r6 = defpackage.dei.a(r6, r7, r10, r11)
            defpackage.dei.a(r4, r6)
            android.view.View r6 = r5.m
            int r7 = r2.H
            int r10 = r3.H
            float r11 = r2.I
            android.view.animation.Interpolator r12 = r0.p
            android.animation.Animator r7 = defpackage.dei.a(r6, r7, r10, r11, r12)
            defpackage.dei.a(r4, r7)
            int r7 = r2.J
            int r10 = r3.J
            float r11 = r2.K
            android.view.animation.Interpolator r12 = r0.p
            android.animation.Animator r7 = defpackage.dei.d(r6, r7, r10, r11, r12)
            defpackage.dei.a(r4, r7)
            int r7 = r2.L
            int r10 = r3.L
            float r11 = r2.M
            android.view.animation.Interpolator r12 = r0.p
            android.animation.Animator r6 = defpackage.dei.e(r6, r7, r10, r11, r12)
            defpackage.dei.a(r4, r6)
            android.widget.ImageView r6 = r5.k
            int r7 = r2.N
            int r10 = r3.N
            float r11 = r2.O
            android.view.animation.Interpolator r12 = r0.p
            android.animation.Animator r7 = defpackage.dei.d(r6, r7, r10, r11, r12)
            defpackage.dei.a(r4, r7)
            int r7 = r2.P
            int r10 = r3.P
            float r11 = r2.Q
            android.animation.Animator r6 = defpackage.dei.a(r6, r7, r10, r11)
            defpackage.dei.a(r4, r6)
            android.widget.ImageView r6 = r5.q
            int r11 = r2.R
            int r12 = r2.T
            int r13 = r3.R
            int r14 = r3.T
            float r15 = r2.S
            float r7 = r2.U
            android.view.animation.Interpolator r10 = r0.p
            r17 = r10
            r10 = r6
            r16 = r7
            android.animation.Animator r7 = defpackage.dei.a(r10, r11, r12, r13, r14, r15, r16, r17)
            defpackage.dei.a(r4, r7)
            int r7 = r2.V
            int r10 = r3.V
            float r11 = r2.W
            android.animation.Animator r6 = defpackage.dei.a(r6, r7, r10, r11)
            defpackage.dei.a(r4, r6)
            android.widget.TextView r6 = r5.o
            android.view.ViewParent r6 = r6.getParent()
            r10 = r6
            android.view.View r10 = (android.view.View) r10
            int r11 = r2.X
            int r12 = r2.Z
            int r13 = r3.X
            int r14 = r3.Z
            float r15 = r2.Y
            float r6 = r2.aa
            android.view.animation.Interpolator r7 = r0.p
            r16 = r6
            r17 = r7
            android.animation.Animator r6 = defpackage.dei.a(r10, r11, r12, r13, r14, r15, r16, r17)
            defpackage.dei.a(r4, r6)
            android.widget.TextView r6 = r5.o
            int r7 = r2.ab
            int r10 = r3.ab
            float r11 = r2.ac
            android.animation.Animator r6 = defpackage.dei.a(r6, r7, r10, r11)
            defpackage.dei.a(r4, r6)
            android.widget.TextView r5 = r5.s
            int r6 = r2.ad
            int r7 = r3.ad
            float r10 = r2.ae
            android.animation.Animator r5 = defpackage.dei.a(r5, r6, r7, r10)
            defpackage.dei.a(r4, r5)
            goto L_0x044c
        L_0x0213:
            boolean r6 = r5 instanceof defpackage.cus
            if (r6 == 0) goto L_0x029c
            cus r5 = (defpackage.cus) r5
            r10 = r5
            android.view.View r10 = (android.view.View) r10
            float r6 = r2.f
            float r7 = r3.f
            android.view.animation.Interpolator r11 = r0.p
            android.animation.Animator r6 = defpackage.dei.a(r10, r6, r7, r11)
            defpackage.dei.a(r4, r6)
            float r6 = r2.g
            float r7 = r3.g
            android.view.animation.Interpolator r11 = r0.p
            android.animation.Animator r6 = defpackage.dei.b(r10, r6, r7, r11)
            defpackage.dei.a(r4, r6)
            float r6 = r2.i
            float r7 = r3.i
            float r11 = r2.l
            android.view.animation.Interpolator r12 = r0.p
            android.animation.Animator r6 = defpackage.dei.a(r10, r6, r7, r11, r12)
            defpackage.dei.a(r4, r6)
            int r11 = r2.a
            int r12 = r2.b
            int r13 = r3.a
            int r14 = r3.b
            float r15 = r2.j
            float r6 = r2.k
            android.view.animation.Interpolator r7 = r0.p
            r16 = r6
            r17 = r7
            android.animation.Animator r6 = defpackage.dei.a(r10, r11, r12, r13, r14, r15, r16, r17)
            defpackage.dei.a(r4, r6)
            android.widget.ImageView r6 = r5.a()
            float r7 = r2.az
            float r10 = r3.az
            android.view.animation.Interpolator r11 = r0.p
            android.animation.Animator r6 = defpackage.dei.a(r6, r7, r10, r11)
            defpackage.dei.a(r4, r6)
            boolean r6 = r5 instanceof com.google.android.tvlauncher.appsview.BannerView
            if (r6 == 0) goto L_0x0289
            r6 = r5
            com.google.android.tvlauncher.appsview.BannerView r6 = (com.google.android.tvlauncher.appsview.BannerView) r6
            android.widget.ImageView r6 = r6.c()
            if (r6 == 0) goto L_0x0289
            float r7 = r2.aA
            float r10 = r3.aA
            android.view.animation.Interpolator r11 = r0.p
            android.animation.Animator r6 = defpackage.dei.a(r6, r7, r10, r11)
            defpackage.dei.a(r4, r6)
        L_0x0289:
            android.widget.TextView r5 = r5.d()
            int r6 = r2.ag
            int r7 = r3.ag
            float r10 = r2.af
            android.animation.Animator r5 = defpackage.dei.a(r5, r6, r7, r10)
            defpackage.dei.a(r4, r5)
            goto L_0x044c
        L_0x029c:
            boolean r6 = r5 instanceof com.google.android.tvlauncher.home.view.WatchNextInfoView
            if (r6 == 0) goto L_0x044c
            com.google.android.tvlauncher.home.view.WatchNextInfoView r5 = (com.google.android.tvlauncher.home.view.WatchNextInfoView) r5
            android.graphics.Rect r6 = r2.e
            android.graphics.Rect r11 = r3.e
            android.view.animation.Interpolator r12 = r0.p
            android.animation.Animator r6 = defpackage.dei.a(r5, r6, r11, r12)
            defpackage.dei.a(r4, r6)
            android.view.View r6 = r5.a
            float r11 = r2.aj
            r12 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r11 = r11 + r12
            float r11 = java.lang.Math.abs(r11)
            r13 = 981668463(0x3a83126f, float:0.001)
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 >= 0) goto L_0x02d4
            float r11 = r3.aj
            int r14 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r14 < 0) goto L_0x02c8
            goto L_0x02d4
        L_0x02c8:
            float r12 = r2.aj
            android.view.animation.Interpolator r14 = defpackage.ctv.n
            android.animation.Animator r11 = defpackage.dei.c(r6, r12, r11, r14)
            defpackage.dei.a(r4, r11)
            goto L_0x02f2
        L_0x02d4:
            float r11 = r2.aj
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 >= 0) goto L_0x02f2
            float r11 = r3.aj
            float r11 = r11 + r12
            float r11 = java.lang.Math.abs(r11)
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 >= 0) goto L_0x02f2
            float r11 = r2.aj
            float r12 = r3.aj
            android.view.animation.Interpolator r14 = defpackage.ctv.o
            android.animation.Animator r11 = defpackage.dei.c(r6, r11, r12, r14)
            defpackage.dei.a(r4, r11)
        L_0x02f2:
            android.graphics.Rect r11 = r2.ah
            android.graphics.Rect r12 = r3.ah
            android.view.animation.Interpolator r14 = r0.p
            android.animation.Animator r11 = defpackage.dei.a(r6, r11, r12, r14)
            defpackage.dei.a(r4, r11)
            android.graphics.Rect r11 = r3.ah
            int r11 = r11.height()
            int r11 = r11 / r10
            float r11 = (float) r11
            r6.setPivotY(r11)
            android.content.Context r11 = r5.getContext()
            boolean r11 = defpackage.dcy.a(r11)
            if (r11 == 0) goto L_0x031f
            android.graphics.Rect r7 = r3.ah
            int r7 = r7.width()
            float r7 = (float) r7
            r6.setPivotX(r7)
            goto L_0x0323
        L_0x031f:
            r6.setPivotX(r7)
        L_0x0323:
            float r7 = r2.ai
            float r11 = r3.ai
            android.view.animation.Interpolator r12 = r0.p
            android.animation.Animator r6 = defpackage.dei.a(r6, r7, r11, r12)
            defpackage.dei.a(r4, r6)
            android.view.View r6 = r5.a()
            android.graphics.Rect r7 = r2.ak
            android.graphics.Rect r11 = r3.ak
            android.view.animation.Interpolator r12 = r0.p
            android.animation.Animator r6 = defpackage.dei.a(r6, r7, r11, r12)
            defpackage.dei.a(r4, r6)
            android.widget.ImageView r6 = r5.b
            android.graphics.Rect r7 = r2.al
            android.graphics.Rect r11 = r3.al
            float r12 = r2.am
            android.view.animation.Interpolator r14 = r0.p
            android.animation.Animator r6 = defpackage.dei.a(r6, r7, r11, r12, r14)
            defpackage.dei.a(r4, r6)
            android.widget.ImageView r14 = r5.b
            android.graphics.Rect r6 = r2.al
            int r15 = r6.left
            android.graphics.Rect r6 = r2.al
            int r6 = r6.top
            android.graphics.Rect r7 = r3.al
            int r7 = r7.left
            android.graphics.Rect r11 = r3.al
            int r11 = r11.top
            float r12 = r2.an
            float r8 = r2.ao
            android.view.animation.Interpolator r9 = r0.p
            r16 = r6
            r17 = r7
            r18 = r11
            r19 = r12
            r20 = r8
            r21 = r9
            android.animation.Animator r6 = defpackage.dei.a(r14, r15, r16, r17, r18, r19, r20, r21)
            defpackage.dei.a(r4, r6)
            android.widget.ImageView r6 = r5.b
            float r7 = r2.ap
            float r8 = r3.ap
            android.view.animation.Interpolator r9 = r0.p
            android.animation.Animator r6 = defpackage.dei.c(r6, r7, r8, r9)
            defpackage.dei.a(r4, r6)
            android.widget.TextView r6 = r5.c
            android.graphics.Rect r7 = r2.aq
            int r7 = r7.height()
            android.graphics.Rect r8 = r3.aq
            int r8 = r8.height()
            float r9 = r2.ar
            android.view.animation.Interpolator r11 = r0.p
            float r12 = (float) r7
            float r12 = r12 * r9
            r9 = 0
            if (r7 > 0) goto L_0x03a5
        L_0x03a4:
            goto L_0x03c8
        L_0x03a5:
            if (r8 <= 0) goto L_0x03a4
            float r7 = (float) r8
            float r8 = r12 - r7
            float r8 = java.lang.Math.abs(r8)
            int r8 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
            if (r8 <= 0) goto L_0x03c7
            deg r8 = defpackage.dei.a
            float[] r9 = new float[r10]
            float r12 = r12 / r7
            r7 = 0
            r9[r7] = r12
            r7 = 1065353216(0x3f800000, float:1.0)
            r10 = 1
            r9[r10] = r7
            android.animation.ObjectAnimator r9 = android.animation.ObjectAnimator.ofFloat(r6, r8, r9)
            r9.setInterpolator(r11)
            goto L_0x03c8
        L_0x03c7:
            goto L_0x03a4
        L_0x03c8:
            defpackage.dei.a(r4, r9)
            android.content.Context r6 = r5.getContext()
            boolean r6 = defpackage.dcy.a(r6)
            if (r6 == 0) goto L_0x03eb
            android.widget.TextView r6 = r5.c
            android.graphics.Rect r7 = r2.aq
            int r7 = r7.right
            android.graphics.Rect r8 = r3.aq
            int r8 = r8.right
            float r9 = r2.as
            android.view.animation.Interpolator r10 = r0.p
            android.animation.Animator r6 = defpackage.dei.c(r6, r7, r8, r9, r10)
            defpackage.dei.a(r4, r6)
            goto L_0x0400
        L_0x03eb:
            android.widget.TextView r6 = r5.c
            android.graphics.Rect r7 = r2.aq
            int r7 = r7.left
            android.graphics.Rect r8 = r3.aq
            int r8 = r8.left
            float r9 = r2.as
            android.view.animation.Interpolator r10 = r0.p
            android.animation.Animator r6 = defpackage.dei.c(r6, r7, r8, r9, r10)
            defpackage.dei.a(r4, r6)
        L_0x0400:
            android.widget.TextView r6 = r5.c
            int r7 = r2.ay
            int r8 = r3.ay
            android.view.animation.Interpolator r9 = r0.p
            android.animation.Animator r6 = defpackage.dei.a(r6, r7, r8, r9)
            defpackage.dei.a(r4, r6)
            android.widget.TextView r6 = r5.d
            float r7 = r2.av
            float r8 = r3.av
            android.view.animation.Interpolator r9 = r0.p
            android.animation.Animator r6 = defpackage.dei.a(r6, r7, r8, r9)
            defpackage.dei.a(r4, r6)
            android.widget.TextView r7 = r5.d
            android.graphics.Rect r6 = r2.au
            int r8 = r6.left
            android.graphics.Rect r6 = r2.au
            int r9 = r6.top
            android.graphics.Rect r6 = r3.au
            int r10 = r6.left
            android.graphics.Rect r6 = r3.au
            int r11 = r6.top
            float r12 = r2.aw
            float r13 = r2.ax
            android.view.animation.Interpolator r14 = r0.p
            android.animation.Animator r6 = defpackage.dei.a(r7, r8, r9, r10, r11, r12, r13, r14)
            defpackage.dei.a(r4, r6)
            android.widget.TextView r5 = r5.d
            int r6 = r2.ay
            int r7 = r3.ay
            android.view.animation.Interpolator r8 = r0.p
            android.animation.Animator r5 = defpackage.dei.a(r5, r6, r7, r8)
            defpackage.dei.a(r4, r5)
        L_0x044c:
            boolean r5 = r4.isEmpty()
            if (r5 != 0) goto L_0x0471
            android.animation.AnimatorSet r5 = new android.animation.AnimatorSet
            r5.<init>()
            r5.playTogether(r4)
            long r6 = r0.i
            r5.setDuration(r6)
            ctt r4 = new ctt
            r4.<init>(r0, r1, r3, r2)
            r5.addListener(r4)
            java.util.Map r2 = r0.c
            r2.put(r1, r5)
            r5.start()
            r1 = 1
            return r1
        L_0x0471:
            r22.e(r23)
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ctv.d(km, jt, jt):boolean");
    }

    public final jt f() {
        return new ctu((byte) 0);
    }

    public final jt a(kk kkVar, km kmVar, int i, List list) {
        jt a2 = super.a(kkVar, kmVar, i, list);
        ((ctu) a2).m = new ArrayList(list);
        return a2;
    }
}
