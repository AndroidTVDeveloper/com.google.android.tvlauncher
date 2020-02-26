package p000;

import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: ctv */
/* compiled from: PG */
public final class ctv extends den {

    /* renamed from: b */
    public static /* synthetic */ int f7498b;

    /* renamed from: n */
    private static final Interpolator f7499n = new DecelerateInterpolator(3.0f);

    /* renamed from: o */
    private static final Interpolator f7500o = new AccelerateInterpolator(3.0f);

    /* renamed from: a */
    public final Set f7501a = new HashSet();

    /* renamed from: p */
    private final Interpolator f7502p;

    public ctv() {
        mo5326g();
        this.f7502p = new DecelerateInterpolator();
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
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo3745d(p000.C0285km r23, p000.C0265jt r24, p000.C0265jt r25) {
        /*
            r22 = this;
            r0 = r22
            r1 = r23
            java.util.Map r2 = r0.f8386c
            java.lang.Object r2 = r2.get(r1)
            android.animation.Animator r2 = (android.animation.Animator) r2
            if (r2 == 0) goto L_0x0013
            java.util.Set r3 = r0.f7501a
            r3.add(r2)
        L_0x0013:
            r22.mo4197g(r23)
            r2 = r24
            ctu r2 = (p000.ctu) r2
            r3 = r25
            ctu r3 = (p000.ctu) r3
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            android.view.View r5 = r1.f9783a
            boolean r6 = r5 instanceof com.google.android.tvlauncher.home.view.ProgramView
            r7 = 0
            r8 = 1
            r9 = 0
            r10 = 2
            if (r6 == 0) goto L_0x0213
            com.google.android.tvlauncher.home.view.ProgramView r5 = (com.google.android.tvlauncher.home.view.ProgramView) r5
            android.graphics.Rect r6 = r2.f7476e
            android.graphics.Rect r11 = r3.f7476e
            android.view.animation.Interpolator r12 = r0.f7502p
            android.animation.Animator r6 = p000.dei.m6232a(r5, r6, r11, r12)
            p000.dei.m6238a(r4, r6)
            android.view.View r6 = r1.f9783a
            float r11 = r2.f7477f
            float r12 = r3.f7477f
            android.view.animation.Interpolator r13 = r0.f7502p
            android.animation.Animator r11 = p000.dei.m6225a(r6, r11, r12, r13)
            if (r11 == 0) goto L_0x0058
            float r12 = r2.f7479h
            float r13 = r3.f7479h
            float r12 = java.lang.Math.max(r12, r13)
            r6.setPivotY(r12)
            r4.add(r11)
        L_0x0058:
            float r11 = r2.f7480i
            float r12 = r3.f7480i
            float r13 = r2.f7483l
            android.view.animation.Interpolator r14 = r0.f7502p
            android.animation.Animator r6 = p000.dei.m6224a(r6, r11, r12, r13, r14)
            p000.dei.m6238a(r4, r6)
            android.widget.ImageView r6 = r5.f6567c
            android.graphics.Rect r12 = r2.f7486o
            android.graphics.Rect r13 = r3.f7486o
            float r14 = r2.f7487p
            int r11 = r6.getHeight()
            int r11 = r11 / r10
            float r15 = (float) r11
            android.view.animation.Interpolator r11 = r0.f7502p
            r16 = r11
            r11 = r6
            android.animation.Animator r11 = p000.dei.m6230a(r11, r12, r13, r14, r15, r16)
            p000.dei.m6238a(r4, r11)
            android.graphics.Rect r11 = r2.f7476e
            int r11 = r11.height()
            android.graphics.Rect r12 = r3.f7476e
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
            android.view.View r6 = r5.f6566b
            android.graphics.Rect r7 = r2.f7485n
            android.graphics.Rect r10 = r3.f7485n
            android.view.animation.Interpolator r11 = r0.f7502p
            android.animation.Animator r6 = p000.dei.m6232a(r6, r7, r10, r11)
            p000.dei.m6238a(r4, r6)
            android.widget.ImageView r6 = r5.f6568d
            android.graphics.Rect r7 = r2.f7488q
            android.graphics.Rect r10 = r3.f7488q
            float r11 = r2.f7489r
            android.view.animation.Interpolator r12 = r0.f7502p
            android.animation.Animator r7 = p000.dei.m6231a(r6, r7, r10, r11, r12)
            p000.dei.m6238a(r4, r7)
            android.graphics.Rect r7 = r2.f7488q
            int r11 = r7.left
            android.graphics.Rect r7 = r2.f7488q
            int r12 = r7.top
            android.graphics.Rect r7 = r3.f7488q
            int r13 = r7.left
            android.graphics.Rect r7 = r3.f7488q
            int r14 = r7.top
            float r15 = r2.f7490s
            float r7 = r2.f7491t
            android.view.animation.Interpolator r10 = r0.f7502p
            r17 = r10
            r10 = r6
            r16 = r7
            android.animation.Animator r7 = p000.dei.m6228a(r10, r11, r12, r13, r14, r15, r16, r17)
            p000.dei.m6238a(r4, r7)
            float r7 = r2.f7475az
            float r10 = r3.f7475az
            android.view.animation.Interpolator r11 = r0.f7502p
            android.animation.Animator r6 = p000.dei.m6233a(r6, r7, r10, r11)
            p000.dei.m6238a(r4, r6)
            android.view.View r10 = r5.f6571g
            int r11 = r2.f7492u
            int r12 = r2.f7494w
            int r13 = r3.f7492u
            int r14 = r3.f7494w
            float r15 = r2.f7493v
            float r6 = r3.f7495x
            android.view.animation.Interpolator r7 = r0.f7502p
            r16 = r6
            r17 = r7
            android.animation.Animator r6 = p000.dei.m6228a(r10, r11, r12, r13, r14, r15, r16, r17)
            p000.dei.m6238a(r4, r6)
            android.view.View r6 = r5.f6573i
            int r7 = r2.f7496y
            int r10 = r3.f7496y
            float r11 = r2.f7497z
            android.view.animation.Interpolator r12 = r0.f7502p
            android.animation.Animator r7 = p000.dei.m6227a(r6, r7, r10, r11, r12)
            p000.dei.m6238a(r4, r7)
            int r7 = r2.f7423A
            int r10 = r3.f7423A
            float r11 = r2.f7424B
            android.view.animation.Interpolator r12 = r0.f7502p
            android.animation.Animator r6 = p000.dei.m6245d(r6, r7, r10, r11, r12)
            p000.dei.m6238a(r4, r6)
            android.widget.ProgressBar r6 = r5.f6572h
            int r7 = r2.f7425C
            int r10 = r3.f7425C
            float r11 = r2.f7426D
            android.view.animation.Interpolator r12 = r0.f7502p
            android.animation.Animator r7 = p000.dei.m6227a(r6, r7, r10, r11, r12)
            p000.dei.m6238a(r4, r7)
            int r7 = r2.f7427E
            int r10 = r3.f7427E
            float r11 = r2.f7428F
            android.view.animation.Interpolator r12 = r0.f7502p
            android.animation.Animator r6 = p000.dei.m6245d(r6, r7, r10, r11, r12)
            p000.dei.m6238a(r4, r6)
            android.view.View r6 = r5.f6574j
            android.graphics.Rect r7 = r2.f7429G
            android.graphics.Rect r10 = r3.f7429G
            android.view.animation.Interpolator r11 = r0.f7502p
            android.animation.Animator r6 = p000.dei.m6232a(r6, r7, r10, r11)
            p000.dei.m6238a(r4, r6)
            android.view.View r6 = r5.f6577m
            int r7 = r2.f7430H
            int r10 = r3.f7430H
            float r11 = r2.f7431I
            android.view.animation.Interpolator r12 = r0.f7502p
            android.animation.Animator r7 = p000.dei.m6227a(r6, r7, r10, r11, r12)
            p000.dei.m6238a(r4, r7)
            int r7 = r2.f7432J
            int r10 = r3.f7432J
            float r11 = r2.f7433K
            android.view.animation.Interpolator r12 = r0.f7502p
            android.animation.Animator r7 = p000.dei.m6245d(r6, r7, r10, r11, r12)
            p000.dei.m6238a(r4, r7)
            int r7 = r2.f7434L
            int r10 = r3.f7434L
            float r11 = r2.f7435M
            android.view.animation.Interpolator r12 = r0.f7502p
            android.animation.Animator r6 = p000.dei.m6246e(r6, r7, r10, r11, r12)
            p000.dei.m6238a(r4, r6)
            android.widget.ImageView r6 = r5.f6575k
            int r7 = r2.f7436N
            int r10 = r3.f7436N
            float r11 = r2.f7437O
            android.view.animation.Interpolator r12 = r0.f7502p
            android.animation.Animator r7 = p000.dei.m6245d(r6, r7, r10, r11, r12)
            p000.dei.m6238a(r4, r7)
            int r7 = r2.f7438P
            int r10 = r3.f7438P
            float r11 = r2.f7439Q
            android.animation.Animator r6 = p000.dei.m6226a(r6, r7, r10, r11)
            p000.dei.m6238a(r4, r6)
            android.widget.ImageView r6 = r5.f6581q
            int r11 = r2.f7440R
            int r12 = r2.f7442T
            int r13 = r3.f7440R
            int r14 = r3.f7442T
            float r15 = r2.f7441S
            float r7 = r2.f7443U
            android.view.animation.Interpolator r10 = r0.f7502p
            r17 = r10
            r10 = r6
            r16 = r7
            android.animation.Animator r7 = p000.dei.m6228a(r10, r11, r12, r13, r14, r15, r16, r17)
            p000.dei.m6238a(r4, r7)
            int r7 = r2.f7444V
            int r10 = r3.f7444V
            float r11 = r2.f7445W
            android.animation.Animator r6 = p000.dei.m6226a(r6, r7, r10, r11)
            p000.dei.m6238a(r4, r6)
            android.widget.TextView r6 = r5.f6579o
            android.view.ViewParent r6 = r6.getParent()
            r10 = r6
            android.view.View r10 = (android.view.View) r10
            int r11 = r2.f7446X
            int r12 = r2.f7448Z
            int r13 = r3.f7446X
            int r14 = r3.f7448Z
            float r15 = r2.f7447Y
            float r6 = r2.f7450aa
            android.view.animation.Interpolator r7 = r0.f7502p
            r16 = r6
            r17 = r7
            android.animation.Animator r6 = p000.dei.m6228a(r10, r11, r12, r13, r14, r15, r16, r17)
            p000.dei.m6238a(r4, r6)
            android.widget.TextView r6 = r5.f6579o
            int r7 = r2.f7451ab
            int r10 = r3.f7451ab
            float r11 = r2.f7452ac
            android.animation.Animator r6 = p000.dei.m6226a(r6, r7, r10, r11)
            p000.dei.m6238a(r4, r6)
            android.widget.TextView r5 = r5.f6583s
            int r6 = r2.f7453ad
            int r7 = r3.f7453ad
            float r10 = r2.f7454ae
            android.animation.Animator r5 = p000.dei.m6226a(r5, r6, r7, r10)
            p000.dei.m6238a(r4, r5)
            goto L_0x044c
        L_0x0213:
            boolean r6 = r5 instanceof p000.cus
            if (r6 == 0) goto L_0x029c
            cus r5 = (p000.cus) r5
            r10 = r5
            android.view.View r10 = (android.view.View) r10
            float r6 = r2.f7477f
            float r7 = r3.f7477f
            android.view.animation.Interpolator r11 = r0.f7502p
            android.animation.Animator r6 = p000.dei.m6225a(r10, r6, r7, r11)
            p000.dei.m6238a(r4, r6)
            float r6 = r2.f7478g
            float r7 = r3.f7478g
            android.view.animation.Interpolator r11 = r0.f7502p
            android.animation.Animator r6 = p000.dei.m6239b(r10, r6, r7, r11)
            p000.dei.m6238a(r4, r6)
            float r6 = r2.f7480i
            float r7 = r3.f7480i
            float r11 = r2.f7483l
            android.view.animation.Interpolator r12 = r0.f7502p
            android.animation.Animator r6 = p000.dei.m6224a(r10, r6, r7, r11, r12)
            p000.dei.m6238a(r4, r6)
            int r11 = r2.f9700a
            int r12 = r2.f9701b
            int r13 = r3.f9700a
            int r14 = r3.f9701b
            float r15 = r2.f7481j
            float r6 = r2.f7482k
            android.view.animation.Interpolator r7 = r0.f7502p
            r16 = r6
            r17 = r7
            android.animation.Animator r6 = p000.dei.m6228a(r10, r11, r12, r13, r14, r15, r16, r17)
            p000.dei.m6238a(r4, r6)
            android.widget.ImageView r6 = r5.mo3223a()
            float r7 = r2.f7475az
            float r10 = r3.f7475az
            android.view.animation.Interpolator r11 = r0.f7502p
            android.animation.Animator r6 = p000.dei.m6233a(r6, r7, r10, r11)
            p000.dei.m6238a(r4, r6)
            boolean r6 = r5 instanceof com.google.android.tvlauncher.appsview.BannerView
            if (r6 == 0) goto L_0x0289
            r6 = r5
            com.google.android.tvlauncher.appsview.BannerView r6 = (com.google.android.tvlauncher.appsview.BannerView) r6
            android.widget.ImageView r6 = r6.mo3229c()
            if (r6 == 0) goto L_0x0289
            float r7 = r2.f7449aA
            float r10 = r3.f7449aA
            android.view.animation.Interpolator r11 = r0.f7502p
            android.animation.Animator r6 = p000.dei.m6233a(r6, r7, r10, r11)
            p000.dei.m6238a(r4, r6)
        L_0x0289:
            android.widget.TextView r5 = r5.mo3230d()
            int r6 = r2.f7456ag
            int r7 = r3.f7456ag
            float r10 = r2.f7455af
            android.animation.Animator r5 = p000.dei.m6226a(r5, r6, r7, r10)
            p000.dei.m6238a(r4, r5)
            goto L_0x044c
        L_0x029c:
            boolean r6 = r5 instanceof com.google.android.tvlauncher.home.view.WatchNextInfoView
            if (r6 == 0) goto L_0x044c
            com.google.android.tvlauncher.home.view.WatchNextInfoView r5 = (com.google.android.tvlauncher.home.view.WatchNextInfoView) r5
            android.graphics.Rect r6 = r2.f7476e
            android.graphics.Rect r11 = r3.f7476e
            android.view.animation.Interpolator r12 = r0.f7502p
            android.animation.Animator r6 = p000.dei.m6232a(r5, r6, r11, r12)
            p000.dei.m6238a(r4, r6)
            android.view.View r6 = r5.f6589a
            float r11 = r2.f7459aj
            r12 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r11 = r11 + r12
            float r11 = java.lang.Math.abs(r11)
            r13 = 981668463(0x3a83126f, float:0.001)
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 >= 0) goto L_0x02d4
            float r11 = r3.f7459aj
            int r14 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r14 < 0) goto L_0x02c8
            goto L_0x02d4
        L_0x02c8:
            float r12 = r2.f7459aj
            android.view.animation.Interpolator r14 = p000.ctv.f7499n
            android.animation.Animator r11 = p000.dei.m6242c(r6, r12, r11, r14)
            p000.dei.m6238a(r4, r11)
            goto L_0x02f2
        L_0x02d4:
            float r11 = r2.f7459aj
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 >= 0) goto L_0x02f2
            float r11 = r3.f7459aj
            float r11 = r11 + r12
            float r11 = java.lang.Math.abs(r11)
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 >= 0) goto L_0x02f2
            float r11 = r2.f7459aj
            float r12 = r3.f7459aj
            android.view.animation.Interpolator r14 = p000.ctv.f7500o
            android.animation.Animator r11 = p000.dei.m6242c(r6, r11, r12, r14)
            p000.dei.m6238a(r4, r11)
        L_0x02f2:
            android.graphics.Rect r11 = r2.f7457ah
            android.graphics.Rect r12 = r3.f7457ah
            android.view.animation.Interpolator r14 = r0.f7502p
            android.animation.Animator r11 = p000.dei.m6232a(r6, r11, r12, r14)
            p000.dei.m6238a(r4, r11)
            android.graphics.Rect r11 = r3.f7457ah
            int r11 = r11.height()
            int r11 = r11 / r10
            float r11 = (float) r11
            r6.setPivotY(r11)
            android.content.Context r11 = r5.getContext()
            boolean r11 = p000.dcy.m6191a(r11)
            if (r11 == 0) goto L_0x031f
            android.graphics.Rect r7 = r3.f7457ah
            int r7 = r7.width()
            float r7 = (float) r7
            r6.setPivotX(r7)
            goto L_0x0323
        L_0x031f:
            r6.setPivotX(r7)
        L_0x0323:
            float r7 = r2.f7458ai
            float r11 = r3.f7458ai
            android.view.animation.Interpolator r12 = r0.f7502p
            android.animation.Animator r6 = p000.dei.m6225a(r6, r7, r11, r12)
            p000.dei.m6238a(r4, r6)
            android.view.View r6 = r5.mo3418a()
            android.graphics.Rect r7 = r2.f7460ak
            android.graphics.Rect r11 = r3.f7460ak
            android.view.animation.Interpolator r12 = r0.f7502p
            android.animation.Animator r6 = p000.dei.m6232a(r6, r7, r11, r12)
            p000.dei.m6238a(r4, r6)
            android.widget.ImageView r6 = r5.f6590b
            android.graphics.Rect r7 = r2.f7461al
            android.graphics.Rect r11 = r3.f7461al
            float r12 = r2.f7462am
            android.view.animation.Interpolator r14 = r0.f7502p
            android.animation.Animator r6 = p000.dei.m6231a(r6, r7, r11, r12, r14)
            p000.dei.m6238a(r4, r6)
            android.widget.ImageView r14 = r5.f6590b
            android.graphics.Rect r6 = r2.f7461al
            int r15 = r6.left
            android.graphics.Rect r6 = r2.f7461al
            int r6 = r6.top
            android.graphics.Rect r7 = r3.f7461al
            int r7 = r7.left
            android.graphics.Rect r11 = r3.f7461al
            int r11 = r11.top
            float r12 = r2.f7463an
            float r8 = r2.f7464ao
            android.view.animation.Interpolator r9 = r0.f7502p
            r16 = r6
            r17 = r7
            r18 = r11
            r19 = r12
            r20 = r8
            r21 = r9
            android.animation.Animator r6 = p000.dei.m6228a(r14, r15, r16, r17, r18, r19, r20, r21)
            p000.dei.m6238a(r4, r6)
            android.widget.ImageView r6 = r5.f6590b
            float r7 = r2.f7465ap
            float r8 = r3.f7465ap
            android.view.animation.Interpolator r9 = r0.f7502p
            android.animation.Animator r6 = p000.dei.m6242c(r6, r7, r8, r9)
            p000.dei.m6238a(r4, r6)
            android.widget.TextView r6 = r5.f6591c
            android.graphics.Rect r7 = r2.f7466aq
            int r7 = r7.height()
            android.graphics.Rect r8 = r3.f7466aq
            int r8 = r8.height()
            float r9 = r2.f7467ar
            android.view.animation.Interpolator r11 = r0.f7502p
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
            deg r8 = p000.dei.f8374a
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
            p000.dei.m6238a(r4, r9)
            android.content.Context r6 = r5.getContext()
            boolean r6 = p000.dcy.m6191a(r6)
            if (r6 == 0) goto L_0x03eb
            android.widget.TextView r6 = r5.f6591c
            android.graphics.Rect r7 = r2.f7466aq
            int r7 = r7.right
            android.graphics.Rect r8 = r3.f7466aq
            int r8 = r8.right
            float r9 = r2.f7468as
            android.view.animation.Interpolator r10 = r0.f7502p
            android.animation.Animator r6 = p000.dei.m6243c(r6, r7, r8, r9, r10)
            p000.dei.m6238a(r4, r6)
            goto L_0x0400
        L_0x03eb:
            android.widget.TextView r6 = r5.f6591c
            android.graphics.Rect r7 = r2.f7466aq
            int r7 = r7.left
            android.graphics.Rect r8 = r3.f7466aq
            int r8 = r8.left
            float r9 = r2.f7468as
            android.view.animation.Interpolator r10 = r0.f7502p
            android.animation.Animator r6 = p000.dei.m6243c(r6, r7, r8, r9, r10)
            p000.dei.m6238a(r4, r6)
        L_0x0400:
            android.widget.TextView r6 = r5.f6591c
            int r7 = r2.f7474ay
            int r8 = r3.f7474ay
            android.view.animation.Interpolator r9 = r0.f7502p
            android.animation.Animator r6 = p000.dei.m6234a(r6, r7, r8, r9)
            p000.dei.m6238a(r4, r6)
            android.widget.TextView r6 = r5.f6592d
            float r7 = r2.f7471av
            float r8 = r3.f7471av
            android.view.animation.Interpolator r9 = r0.f7502p
            android.animation.Animator r6 = p000.dei.m6225a(r6, r7, r8, r9)
            p000.dei.m6238a(r4, r6)
            android.widget.TextView r7 = r5.f6592d
            android.graphics.Rect r6 = r2.f7470au
            int r8 = r6.left
            android.graphics.Rect r6 = r2.f7470au
            int r9 = r6.top
            android.graphics.Rect r6 = r3.f7470au
            int r10 = r6.left
            android.graphics.Rect r6 = r3.f7470au
            int r11 = r6.top
            float r12 = r2.f7472aw
            float r13 = r2.f7473ax
            android.view.animation.Interpolator r14 = r0.f7502p
            android.animation.Animator r6 = p000.dei.m6228a(r7, r8, r9, r10, r11, r12, r13, r14)
            p000.dei.m6238a(r4, r6)
            android.widget.TextView r5 = r5.f6592d
            int r6 = r2.f7474ay
            int r7 = r3.f7474ay
            android.view.animation.Interpolator r8 = r0.f7502p
            android.animation.Animator r5 = p000.dei.m6234a(r5, r6, r7, r8)
            p000.dei.m6238a(r4, r5)
        L_0x044c:
            boolean r5 = r4.isEmpty()
            if (r5 != 0) goto L_0x0471
            android.animation.AnimatorSet r5 = new android.animation.AnimatorSet
            r5.<init>()
            r5.playTogether(r4)
            long r6 = r0.f9705i
            r5.setDuration(r6)
            ctt r4 = new ctt
            r4.<init>(r0, r1, r3, r2)
            r5.addListener(r4)
            java.util.Map r2 = r0.f8386c
            r2.put(r1, r5)
            r5.start()
            r1 = 1
            return r1
        L_0x0471:
            r22.mo5324e(r23)
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ctv.mo3745d(km, jt, jt):boolean");
    }

    /* renamed from: f */
    public final C0265jt mo3746f() {
        return new ctu((byte) 0);
    }

    /* renamed from: a */
    public final C0265jt mo3744a(C0283kk kkVar, C0285km kmVar, int i, List list) {
        C0265jt a = super.mo3744a(kkVar, kmVar, i, list);
        ((ctu) a).f7484m = new ArrayList(list);
        return a;
    }
}
