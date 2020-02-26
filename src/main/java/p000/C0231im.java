package p000;

import android.view.View;
import android.view.ViewConfiguration;

/* renamed from: im */
/* compiled from: PG */
public abstract class C0231im implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: a */
    public final View f9604a;

    /* renamed from: b */
    public boolean f9605b;

    /* renamed from: c */
    private final float f9606c;

    /* renamed from: d */
    private final int f9607d;

    /* renamed from: e */
    private final int f9608e;

    /* renamed from: f */
    private Runnable f9609f;

    /* renamed from: g */
    private Runnable f9610g;

    /* renamed from: h */
    private int f9611h;

    /* renamed from: i */
    private final int[] f9612i = new int[2];

    public C0231im(View view) {
        this.f9604a = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f9606c = (float) ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f9607d = tapTimeout;
        this.f9608e = (tapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    /* renamed from: a */
    public abstract C0162fy mo4824a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo4825b() {
        throw null;
    }

    public final void onViewAttachedToWindow(View view) {
    }

    /* renamed from: d */
    public final void mo5255d() {
        Runnable runnable = this.f9610g;
        if (runnable != null) {
            this.f9604a.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f9609f;
        if (runnable2 != null) {
            this.f9604a.removeCallbacks(runnable2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo5068c() {
        C0162fy a = mo4824a();
        if (a == null || !a.mo4850e()) {
            return true;
        }
        a.mo4849d();
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005c, code lost:
        if (r13 != false) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x007e, code lost:
        if (r4 != 3) goto L_0x0106;
     */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0109  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouch(android.view.View r12, android.view.MotionEvent r13) {
        /*
            r11 = this;
            boolean r12 = r11.f9605b
            r0 = 3
            r1 = 1
            r2 = 0
            if (r12 == 0) goto L_0x006b
            android.view.View r3 = r11.f9604a
            fy r4 = r11.mo4824a()
            if (r4 == 0) goto L_0x005e
            boolean r5 = r4.mo4850e()
            if (r5 == 0) goto L_0x005e
            android.widget.ListView r4 = r4.mo4851f()
            ie r4 = (p000.C0223ie) r4
            if (r4 == 0) goto L_0x005e
            boolean r5 = r4.isShown()
            if (r5 == 0) goto L_0x005e
            android.view.MotionEvent r5 = android.view.MotionEvent.obtainNoHistory(r13)
            int[] r6 = r11.f9612i
            r3.getLocationOnScreen(r6)
            r3 = r6[r2]
            float r3 = (float) r3
            r6 = r6[r1]
            float r6 = (float) r6
            r5.offsetLocation(r3, r6)
            int[] r3 = r11.f9612i
            r4.getLocationOnScreen(r3)
            r6 = r3[r2]
            int r6 = -r6
            float r6 = (float) r6
            r3 = r3[r1]
            int r3 = -r3
            float r3 = (float) r3
            r5.offsetLocation(r6, r3)
            int r3 = r11.f9611h
            boolean r3 = r4.mo5233a(r5, r3)
            r5.recycle()
            int r13 = r13.getActionMasked()
            if (r13 != r1) goto L_0x0056
        L_0x0054:
            r13 = 0
            goto L_0x005a
        L_0x0056:
            if (r13 == r0) goto L_0x0054
            r13 = 1
        L_0x005a:
            if (r3 == 0) goto L_0x005e
            if (r13 != 0) goto L_0x0068
        L_0x005e:
            boolean r13 = r11.mo5068c()
            if (r13 == 0) goto L_0x0067
            r13 = 0
            goto L_0x011e
        L_0x0067:
        L_0x0068:
            r13 = 1
            goto L_0x011e
        L_0x006b:
            android.view.View r3 = r11.f9604a
            boolean r4 = r3.isEnabled()
            if (r4 == 0) goto L_0x0105
            int r4 = r13.getActionMasked()
            if (r4 == 0) goto L_0x00d5
            if (r4 == r1) goto L_0x00cf
            r5 = 2
            if (r4 == r5) goto L_0x0082
            if (r4 == r0) goto L_0x00cf
            goto L_0x0106
        L_0x0082:
            int r0 = r11.f9611h
            int r0 = r13.findPointerIndex(r0)
            if (r0 < 0) goto L_0x0106
            float r4 = r13.getX(r0)
            float r13 = r13.getY(r0)
            float r0 = r11.f9606c
            float r5 = -r0
            int r6 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r6 >= 0) goto L_0x009a
            goto L_0x00bd
        L_0x009a:
            int r5 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r5 < 0) goto L_0x00bd
            int r5 = r3.getRight()
            int r6 = r3.getLeft()
            int r5 = r5 - r6
            float r5 = (float) r5
            float r5 = r5 + r0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 >= 0) goto L_0x00bd
            int r4 = r3.getBottom()
            int r5 = r3.getTop()
            int r4 = r4 - r5
            float r4 = (float) r4
            float r4 = r4 + r0
            int r13 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r13 >= 0) goto L_0x00bd
            goto L_0x0106
        L_0x00bd:
            r11.mo5255d()
            android.view.ViewParent r13 = r3.getParent()
            r13.requestDisallowInterceptTouchEvent(r1)
            boolean r13 = r11.mo4825b()
            if (r13 == 0) goto L_0x0106
            r13 = 1
            goto L_0x0107
        L_0x00cf:
            r11.mo5255d()
            r13 = 0
            goto L_0x0107
        L_0x00d5:
            int r13 = r13.getPointerId(r2)
            r11.f9611h = r13
            java.lang.Runnable r13 = r11.f9609f
            if (r13 != 0) goto L_0x00e7
            ik r13 = new ik
            r13.<init>(r11)
            r11.f9609f = r13
        L_0x00e7:
            java.lang.Runnable r13 = r11.f9609f
            int r0 = r11.f9607d
            long r4 = (long) r0
            r3.postDelayed(r13, r4)
            java.lang.Runnable r13 = r11.f9610g
            if (r13 != 0) goto L_0x00fa
            il r13 = new il
            r13.<init>(r11)
            r11.f9610g = r13
        L_0x00fa:
            java.lang.Runnable r13 = r11.f9610g
            int r0 = r11.f9608e
            long r4 = (long) r0
            r3.postDelayed(r13, r4)
            r13 = 0
            goto L_0x0107
        L_0x0105:
        L_0x0106:
            r13 = 0
        L_0x0107:
            if (r13 == 0) goto L_0x011e
            long r5 = android.os.SystemClock.uptimeMillis()
            r7 = 3
            r8 = 0
            r9 = 0
            r10 = 0
            r3 = r5
            android.view.MotionEvent r0 = android.view.MotionEvent.obtain(r3, r5, r7, r8, r9, r10)
            android.view.View r3 = r11.f9604a
            r3.onTouchEvent(r0)
            r0.recycle()
        L_0x011e:
            r11.f9605b = r13
            if (r13 != 0) goto L_0x0125
            if (r12 != 0) goto L_0x0125
            return r2
        L_0x0125:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0231im.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public final void onViewDetachedFromWindow(View view) {
        this.f9605b = false;
        this.f9611h = -1;
        Runnable runnable = this.f9609f;
        if (runnable != null) {
            this.f9604a.removeCallbacks(runnable);
        }
    }
}
