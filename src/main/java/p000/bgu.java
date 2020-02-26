package p000;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: bgu */
/* compiled from: PG */
public final class bgu extends View implements bhg {

    /* renamed from: A */
    private final long f3839A;

    /* renamed from: B */
    private int f3840B;

    /* renamed from: C */
    private boolean f3841C;

    /* renamed from: D */
    private long f3842D;

    /* renamed from: E */
    private long f3843E;

    /* renamed from: F */
    private long f3844F;

    /* renamed from: G */
    private long f3845G;

    /* renamed from: H */
    private int f3846H;

    /* renamed from: I */
    private long[] f3847I;

    /* renamed from: J */
    private boolean[] f3848J;

    /* renamed from: a */
    private final Rect f3849a = new Rect();

    /* renamed from: b */
    private final Rect f3850b = new Rect();

    /* renamed from: c */
    private final Rect f3851c = new Rect();

    /* renamed from: d */
    private final Rect f3852d = new Rect();

    /* renamed from: e */
    private final Paint f3853e = new Paint();

    /* renamed from: f */
    private final Paint f3854f = new Paint();

    /* renamed from: g */
    private final Paint f3855g = new Paint();

    /* renamed from: h */
    private final Paint f3856h = new Paint();

    /* renamed from: i */
    private final Paint f3857i = new Paint();

    /* renamed from: j */
    private final Paint f3858j;

    /* renamed from: k */
    private final int f3859k;

    /* renamed from: l */
    private final int f3860l;

    /* renamed from: m */
    private final int f3861m;

    /* renamed from: n */
    private final int f3862n;

    /* renamed from: o */
    private final int f3863o;

    /* renamed from: p */
    private final int f3864p;

    /* renamed from: q */
    private final int f3865q;

    /* renamed from: r */
    private final int f3866r;

    /* renamed from: s */
    private final StringBuilder f3867s;

    /* renamed from: t */
    private final Formatter f3868t;

    /* renamed from: u */
    private final Runnable f3869u;

    /* renamed from: v */
    private final CopyOnWriteArraySet f3870v;

    /* renamed from: w */
    private final int[] f3871w;

    /* renamed from: x */
    private final Point f3872x;

    /* renamed from: y */
    private final float f3873y;

    /* renamed from: z */
    private final int f3874z;

    public bgu(Context context) {
        super(context, null, 0);
        Paint paint = new Paint();
        this.f3858j = paint;
        paint.setAntiAlias(true);
        this.f3870v = new CopyOnWriteArraySet();
        this.f3871w = new int[2];
        this.f3872x = new Point();
        float f = context.getResources().getDisplayMetrics().density;
        this.f3873y = f;
        this.f3866r = m3159a(f, -50);
        float f2 = this.f3873y;
        this.f3859k = m3159a(f2, 4);
        this.f3860l = m3159a(f2, 26);
        this.f3861m = m3159a(f2, 4);
        this.f3862n = m3159a(f2, 12);
        this.f3863o = m3159a(f2, 0);
        this.f3864p = m3159a(f2, 16);
        this.f3853e.setColor(-1);
        this.f3858j.setColor(-1);
        this.f3854f.setColor(-855638017);
        this.f3855g.setColor(872415231);
        this.f3856h.setColor(-1291845888);
        this.f3857i.setColor(872414976);
        this.f3867s = new StringBuilder();
        this.f3868t = new Formatter(this.f3867s, Locale.getDefault());
        this.f3869u = new bgt(this);
        this.f3865q = (Math.max(this.f3863o, Math.max(this.f3862n, this.f3864p)) + 1) / 2;
        this.f3843E = -9223372036854775807L;
        this.f3839A = -9223372036854775807L;
        this.f3874z = 20;
        setFocusable(true);
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    /* renamed from: a */
    private static int m3159a(float f, int i) {
        return (int) ((((float) i) * f) + 0.5f);
    }

    public final void onRtlPropertiesChanged(int i) {
    }

    /* renamed from: a */
    public final void mo1874a(bhf bhf) {
        this.f3870v.add(bhf);
    }

    /* renamed from: e */
    private final long m3165e() {
        long j = this.f3839A;
        if (j != -9223372036854775807L) {
            return j;
        }
        long j2 = this.f3843E;
        if (j2 == -9223372036854775807L) {
            return 0;
        }
        return j2 / ((long) this.f3874z);
    }

    /* renamed from: a */
    public final long mo1872a() {
        int width = (int) (((float) this.f3850b.width()) / this.f3873y);
        if (width == 0) {
            return Long.MAX_VALUE;
        }
        long j = this.f3843E;
        if (j == 0 || j == -9223372036854775807L) {
            return Long.MAX_VALUE;
        }
        return j / ((long) width);
    }

    /* renamed from: d */
    private final String m3163d() {
        return blm.m3639a(this.f3867s, this.f3868t, this.f3844F);
    }

    /* renamed from: c */
    private final long m3162c() {
        if (this.f3850b.width() <= 0 || this.f3843E == -9223372036854775807L) {
            return 0;
        }
        return (((long) this.f3852d.width()) * this.f3843E) / ((long) this.f3850b.width());
    }

    public final void onDraw(Canvas canvas) {
        Paint paint;
        canvas.save();
        int height = this.f3850b.height();
        int centerY = this.f3850b.centerY() - (height / 2);
        int i = height + centerY;
        if (this.f3843E <= 0) {
            canvas.drawRect((float) this.f3850b.left, (float) centerY, (float) this.f3850b.right, (float) i, this.f3855g);
        } else {
            int i2 = this.f3851c.left;
            int i3 = this.f3851c.right;
            int max = Math.max(Math.max(this.f3850b.left, i3), this.f3852d.right);
            if (max < this.f3850b.right) {
                canvas.drawRect((float) max, (float) centerY, (float) this.f3850b.right, (float) i, this.f3855g);
            }
            int max2 = Math.max(i2, this.f3852d.right);
            if (i3 > max2) {
                canvas.drawRect((float) max2, (float) centerY, (float) i3, (float) i, this.f3854f);
            }
            if (this.f3852d.width() > 0) {
                canvas.drawRect((float) this.f3852d.left, (float) centerY, (float) this.f3852d.right, (float) i, this.f3853e);
            }
            if (this.f3846H != 0) {
                long[] jArr = (long[]) bks.m3507a(this.f3847I);
                boolean[] zArr = (boolean[]) bks.m3507a(this.f3848J);
                int i4 = this.f3861m / 2;
                for (int i5 = 0; i5 < this.f3846H; i5++) {
                    int min = this.f3850b.left + Math.min(this.f3850b.width() - this.f3861m, Math.max(0, ((int) ((((long) this.f3850b.width()) * blm.m3632a(jArr[i5], 0, this.f3843E)) / this.f3843E)) - i4));
                    if (!zArr[i5]) {
                        paint = this.f3856h;
                    } else {
                        paint = this.f3857i;
                    }
                    canvas.drawRect((float) min, (float) centerY, (float) (min + this.f3861m), (float) i, paint);
                }
            }
        }
        if (this.f3843E > 0) {
            canvas.drawCircle((float) blm.m3624a(this.f3852d.right, this.f3852d.left, this.f3850b.right), (float) this.f3852d.centerY(), (float) (((!this.f3841C && !isFocused()) ? isEnabled() ? this.f3862n : this.f3863o : this.f3864p) / 2), this.f3858j);
        }
        canvas.restore();
    }

    /* access modifiers changed from: protected */
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (this.f3841C && !z) {
            mo1875a(false);
        }
    }

    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 4) {
            accessibilityEvent.getText().add(m3163d());
        }
        accessibilityEvent.setClassName("android.widget.SeekBar");
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.SeekBar");
        accessibilityNodeInfo.setContentDescription(m3163d());
        if (this.f3843E <= 0) {
            return;
        }
        if (blm.f4293a < 21) {
            accessibilityNodeInfo.addAction(4096);
            accessibilityNodeInfo.addAction(8192);
            return;
        }
        accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
        accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x001a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onKeyDown(int r5, android.view.KeyEvent r6) {
        /*
            r4 = this;
            boolean r0 = r4.isEnabled()
            if (r0 == 0) goto L_0x0030
            long r0 = r4.m3165e()
            r2 = 66
            r3 = 1
            if (r5 == r2) goto L_0x0027
            switch(r5) {
                case 21: goto L_0x0013;
                case 22: goto L_0x0014;
                case 23: goto L_0x0027;
                default: goto L_0x0012;
            }
        L_0x0012:
            goto L_0x0030
        L_0x0013:
            long r0 = -r0
        L_0x0014:
            boolean r0 = r4.m3167f(r0)
            if (r0 == 0) goto L_0x0030
            java.lang.Runnable r5 = r4.f3869u
            r4.removeCallbacks(r5)
            java.lang.Runnable r5 = r4.f3869u
            r0 = 1000(0x3e8, double:4.94E-321)
            r4.postDelayed(r5, r0)
            return r3
        L_0x0027:
            boolean r0 = r4.f3841C
            if (r0 == 0) goto L_0x0030
            r5 = 0
            r4.mo1875a(r5)
            return r3
        L_0x0030:
            boolean r5 = super.onKeyDown(r5, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.bgu.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = ((i4 - i2) - this.f3860l) / 2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int i6 = this.f3860l;
        int i7 = ((i6 - this.f3859k) / 2) + i5;
        this.f3849a.set(paddingLeft, i5, (i3 - i) - paddingRight, i6 + i5);
        this.f3850b.set(this.f3849a.left + this.f3865q, i7, this.f3849a.right - this.f3865q, this.f3859k + i7);
        m3161b();
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == 0) {
            size = this.f3860l;
        } else if (mode != 1073741824) {
            size = Math.min(this.f3860l, size);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), size);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0040, code lost:
        if (r3 != 3) goto L_0x0095;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            boolean r0 = r7.isEnabled()
            r1 = 0
            if (r0 == 0) goto L_0x0095
            long r2 = r7.f3843E
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0095
            int[] r0 = r7.f3871w
            r7.getLocationOnScreen(r0)
            android.graphics.Point r0 = r7.f3872x
            float r2 = r8.getRawX()
            int r2 = (int) r2
            int[] r3 = r7.f3871w
            r3 = r3[r1]
            int r2 = r2 - r3
            float r3 = r8.getRawY()
            int r3 = (int) r3
            int[] r4 = r7.f3871w
            r5 = 1
            r4 = r4[r5]
            int r3 = r3 - r4
            r0.set(r2, r3)
            android.graphics.Point r0 = r7.f3872x
            int r2 = r0.x
            int r0 = r0.y
            int r3 = r8.getAction()
            if (r3 == 0) goto L_0x0078
            r4 = 3
            if (r3 == r5) goto L_0x0069
            r6 = 2
            if (r3 == r6) goto L_0x0043
            if (r3 == r4) goto L_0x0069
            goto L_0x0095
        L_0x0043:
            boolean r8 = r7.f3841C
            if (r8 == 0) goto L_0x0095
            int r8 = r7.f3866r
            if (r0 >= r8) goto L_0x0055
            int r8 = r7.f3840B
            int r2 = r2 - r8
            int r2 = r2 / r4
            int r8 = r8 + r2
            float r8 = (float) r8
            r7.m3160a(r8)
            goto L_0x005b
        L_0x0055:
            r7.f3840B = r2
            float r8 = (float) r2
            r7.m3160a(r8)
        L_0x005b:
            long r0 = r7.m3162c()
            r7.m3166e(r0)
            r7.m3161b()
            r7.invalidate()
            return r5
        L_0x0069:
            boolean r0 = r7.f3841C
            if (r0 == 0) goto L_0x0095
            int r8 = r8.getAction()
            if (r8 != r4) goto L_0x0074
            r1 = 1
        L_0x0074:
            r7.mo1875a(r1)
            return r5
        L_0x0078:
            float r8 = (float) r2
            android.graphics.Rect r2 = r7.f3849a
            int r3 = (int) r8
            float r0 = (float) r0
            int r0 = (int) r0
            boolean r0 = r2.contains(r3, r0)
            if (r0 == 0) goto L_0x0095
            r7.m3160a(r8)
            long r0 = r7.m3162c()
            r7.m3164d(r0)
            r7.m3161b()
            r7.invalidate()
            return r5
        L_0x0095:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.bgu.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        if (super.performAccessibilityAction(i, bundle)) {
            return true;
        }
        if (this.f3843E > 0) {
            if (i == 8192) {
                if (m3167f(-m3165e())) {
                    mo1875a(false);
                }
            } else if (i == 4096) {
                if (m3167f(m3165e())) {
                    mo1875a(false);
                }
            }
            sendAccessibilityEvent(4);
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private final void m3160a(float f) {
        this.f3852d.right = blm.m3624a((int) f, this.f3850b.left, this.f3850b.right);
    }

    /* renamed from: f */
    private final boolean m3167f(long j) {
        long j2 = this.f3843E;
        if (j2 > 0) {
            long j3 = this.f3841C ? this.f3842D : this.f3844F;
            long a = blm.m3632a(j3 + j, 0, j2);
            if (a != j3) {
                if (!this.f3841C) {
                    m3164d(a);
                } else {
                    m3166e(a);
                }
                m3161b();
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo1876a(long[] jArr, boolean[] zArr, int i) {
        boolean z = false;
        if (i == 0) {
            z = true;
        } else if (!(jArr == null || zArr == null)) {
            z = true;
        }
        bks.m3510a(z);
        this.f3846H = i;
        this.f3847I = jArr;
        this.f3848J = zArr;
        m3161b();
    }

    /* renamed from: b */
    public final void mo1877b(long j) {
        this.f3845G = j;
        m3161b();
    }

    /* renamed from: c */
    public final void mo1878c(long j) {
        this.f3843E = j;
        if (this.f3841C && j == -9223372036854775807L) {
            mo1875a(true);
        }
        m3161b();
    }

    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        if (this.f3841C && !z) {
            mo1875a(true);
        }
    }

    /* renamed from: a */
    public final void mo1873a(long j) {
        this.f3844F = j;
        setContentDescription(m3163d());
        m3161b();
    }

    /* renamed from: d */
    private final void m3164d(long j) {
        this.f3842D = j;
        this.f3841C = true;
        setPressed(true);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        Iterator it = this.f3870v.iterator();
        while (it.hasNext()) {
            ((bhf) it.next()).mo1894b(j);
        }
    }

    /* renamed from: a */
    public final void mo1875a(boolean z) {
        removeCallbacks(this.f3869u);
        this.f3841C = false;
        setPressed(false);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        invalidate();
        Iterator it = this.f3870v.iterator();
        while (it.hasNext()) {
            ((bhf) it.next()).mo1893a(this.f3842D, z);
        }
    }

    /* renamed from: b */
    private final void m3161b() {
        long j;
        this.f3851c.set(this.f3850b);
        this.f3852d.set(this.f3850b);
        if (!this.f3841C) {
            j = this.f3844F;
        } else {
            j = this.f3842D;
        }
        if (this.f3843E > 0) {
            int width = this.f3850b.width();
            long j2 = ((long) width) * this.f3845G;
            this.f3851c.right = Math.min(this.f3850b.left + ((int) (j2 / this.f3843E)), this.f3850b.right);
            long width2 = ((long) this.f3850b.width()) * j;
            this.f3852d.right = Math.min(this.f3850b.left + ((int) (width2 / this.f3843E)), this.f3850b.right);
        } else {
            this.f3851c.right = this.f3850b.left;
            this.f3852d.right = this.f3850b.left;
        }
        invalidate(this.f3849a);
    }

    /* renamed from: e */
    private final void m3166e(long j) {
        if (this.f3842D != j) {
            this.f3842D = j;
            Iterator it = this.f3870v.iterator();
            while (it.hasNext()) {
                ((bhf) it.next()).mo1892a(j);
            }
        }
    }
}
