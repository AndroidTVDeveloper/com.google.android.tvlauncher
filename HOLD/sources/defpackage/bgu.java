package defpackage;

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

/* renamed from: bgu  reason: default package */
/* compiled from: PG */
public final class bgu extends View implements bhg {
    private final long A;
    private int B;
    private boolean C;
    private long D;
    private long E;
    private long F;
    private long G;
    private int H;
    private long[] I;
    private boolean[] J;
    private final Rect a = new Rect();
    private final Rect b = new Rect();
    private final Rect c = new Rect();
    private final Rect d = new Rect();
    private final Paint e = new Paint();
    private final Paint f = new Paint();
    private final Paint g = new Paint();
    private final Paint h = new Paint();
    private final Paint i = new Paint();
    private final Paint j;
    private final int k;
    private final int l;
    private final int m;
    private final int n;
    private final int o;
    private final int p;
    private final int q;
    private final int r;
    private final StringBuilder s;
    private final Formatter t;
    private final Runnable u;
    private final CopyOnWriteArraySet v;
    private final int[] w;
    private final Point x;
    private final float y;
    private final int z;

    public bgu(Context context) {
        super(context, null, 0);
        Paint paint = new Paint();
        this.j = paint;
        paint.setAntiAlias(true);
        this.v = new CopyOnWriteArraySet();
        this.w = new int[2];
        this.x = new Point();
        float f2 = context.getResources().getDisplayMetrics().density;
        this.y = f2;
        this.r = a(f2, -50);
        float f3 = this.y;
        this.k = a(f3, 4);
        this.l = a(f3, 26);
        this.m = a(f3, 4);
        this.n = a(f3, 12);
        this.o = a(f3, 0);
        this.p = a(f3, 16);
        this.e.setColor(-1);
        this.j.setColor(-1);
        this.f.setColor(-855638017);
        this.g.setColor(872415231);
        this.h.setColor(-1291845888);
        this.i.setColor(872414976);
        this.s = new StringBuilder();
        this.t = new Formatter(this.s, Locale.getDefault());
        this.u = new bgt(this);
        this.q = (Math.max(this.o, Math.max(this.n, this.p)) + 1) / 2;
        this.E = -9223372036854775807L;
        this.A = -9223372036854775807L;
        this.z = 20;
        setFocusable(true);
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    private static int a(float f2, int i2) {
        return (int) ((((float) i2) * f2) + 0.5f);
    }

    public final void onRtlPropertiesChanged(int i2) {
    }

    public final void a(bhf bhf) {
        this.v.add(bhf);
    }

    private final long e() {
        long j2 = this.A;
        if (j2 != -9223372036854775807L) {
            return j2;
        }
        long j3 = this.E;
        if (j3 == -9223372036854775807L) {
            return 0;
        }
        return j3 / ((long) this.z);
    }

    public final long a() {
        int width = (int) (((float) this.b.width()) / this.y);
        if (width == 0) {
            return Long.MAX_VALUE;
        }
        long j2 = this.E;
        if (j2 == 0 || j2 == -9223372036854775807L) {
            return Long.MAX_VALUE;
        }
        return j2 / ((long) width);
    }

    private final String d() {
        return blm.a(this.s, this.t, this.F);
    }

    private final long c() {
        if (this.b.width() <= 0 || this.E == -9223372036854775807L) {
            return 0;
        }
        return (((long) this.d.width()) * this.E) / ((long) this.b.width());
    }

    public final void onDraw(Canvas canvas) {
        Paint paint;
        canvas.save();
        int height = this.b.height();
        int centerY = this.b.centerY() - (height / 2);
        int i2 = height + centerY;
        if (this.E <= 0) {
            canvas.drawRect((float) this.b.left, (float) centerY, (float) this.b.right, (float) i2, this.g);
        } else {
            int i3 = this.c.left;
            int i4 = this.c.right;
            int max = Math.max(Math.max(this.b.left, i4), this.d.right);
            if (max < this.b.right) {
                canvas.drawRect((float) max, (float) centerY, (float) this.b.right, (float) i2, this.g);
            }
            int max2 = Math.max(i3, this.d.right);
            if (i4 > max2) {
                canvas.drawRect((float) max2, (float) centerY, (float) i4, (float) i2, this.f);
            }
            if (this.d.width() > 0) {
                canvas.drawRect((float) this.d.left, (float) centerY, (float) this.d.right, (float) i2, this.e);
            }
            if (this.H != 0) {
                long[] jArr = (long[]) bks.a(this.I);
                boolean[] zArr = (boolean[]) bks.a(this.J);
                int i5 = this.m / 2;
                for (int i6 = 0; i6 < this.H; i6++) {
                    int min = this.b.left + Math.min(this.b.width() - this.m, Math.max(0, ((int) ((((long) this.b.width()) * blm.a(jArr[i6], 0, this.E)) / this.E)) - i5));
                    if (!zArr[i6]) {
                        paint = this.h;
                    } else {
                        paint = this.i;
                    }
                    canvas.drawRect((float) min, (float) centerY, (float) (min + this.m), (float) i2, paint);
                }
            }
        }
        if (this.E > 0) {
            canvas.drawCircle((float) blm.a(this.d.right, this.d.left, this.b.right), (float) this.d.centerY(), (float) (((!this.C && !isFocused()) ? isEnabled() ? this.n : this.o : this.p) / 2), this.j);
        }
        canvas.restore();
    }

    /* access modifiers changed from: protected */
    public final void onFocusChanged(boolean z2, int i2, Rect rect) {
        super.onFocusChanged(z2, i2, rect);
        if (this.C && !z2) {
            a(false);
        }
    }

    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 4) {
            accessibilityEvent.getText().add(d());
        }
        accessibilityEvent.setClassName("android.widget.SeekBar");
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.SeekBar");
        accessibilityNodeInfo.setContentDescription(d());
        if (this.E <= 0) {
            return;
        }
        if (blm.a < 21) {
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
            long r0 = r4.e()
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
            boolean r0 = r4.f(r0)
            if (r0 == 0) goto L_0x0030
            java.lang.Runnable r5 = r4.u
            r4.removeCallbacks(r5)
            java.lang.Runnable r5 = r4.u
            r0 = 1000(0x3e8, double:4.94E-321)
            r4.postDelayed(r5, r0)
            return r3
        L_0x0027:
            boolean r0 = r4.C
            if (r0 == 0) goto L_0x0030
            r5 = 0
            r4.a(r5)
            return r3
        L_0x0030:
            boolean r5 = super.onKeyDown(r5, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bgu.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int i6 = ((i5 - i3) - this.l) / 2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int i7 = this.l;
        int i8 = ((i7 - this.k) / 2) + i6;
        this.a.set(paddingLeft, i6, (i4 - i2) - paddingRight, i7 + i6);
        this.b.set(this.a.left + this.q, i8, this.a.right - this.q, this.k + i8);
        b();
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        if (mode == 0) {
            size = this.l;
        } else if (mode != 1073741824) {
            size = Math.min(this.l, size);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i2), size);
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
            long r2 = r7.E
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0095
            int[] r0 = r7.w
            r7.getLocationOnScreen(r0)
            android.graphics.Point r0 = r7.x
            float r2 = r8.getRawX()
            int r2 = (int) r2
            int[] r3 = r7.w
            r3 = r3[r1]
            int r2 = r2 - r3
            float r3 = r8.getRawY()
            int r3 = (int) r3
            int[] r4 = r7.w
            r5 = 1
            r4 = r4[r5]
            int r3 = r3 - r4
            r0.set(r2, r3)
            android.graphics.Point r0 = r7.x
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
            boolean r8 = r7.C
            if (r8 == 0) goto L_0x0095
            int r8 = r7.r
            if (r0 >= r8) goto L_0x0055
            int r8 = r7.B
            int r2 = r2 - r8
            int r2 = r2 / r4
            int r8 = r8 + r2
            float r8 = (float) r8
            r7.a(r8)
            goto L_0x005b
        L_0x0055:
            r7.B = r2
            float r8 = (float) r2
            r7.a(r8)
        L_0x005b:
            long r0 = r7.c()
            r7.e(r0)
            r7.b()
            r7.invalidate()
            return r5
        L_0x0069:
            boolean r0 = r7.C
            if (r0 == 0) goto L_0x0095
            int r8 = r8.getAction()
            if (r8 != r4) goto L_0x0074
            r1 = 1
        L_0x0074:
            r7.a(r1)
            return r5
        L_0x0078:
            float r8 = (float) r2
            android.graphics.Rect r2 = r7.a
            int r3 = (int) r8
            float r0 = (float) r0
            int r0 = (int) r0
            boolean r0 = r2.contains(r3, r0)
            if (r0 == 0) goto L_0x0095
            r7.a(r8)
            long r0 = r7.c()
            r7.d(r0)
            r7.b()
            r7.invalidate()
            return r5
        L_0x0095:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bgu.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final boolean performAccessibilityAction(int i2, Bundle bundle) {
        if (super.performAccessibilityAction(i2, bundle)) {
            return true;
        }
        if (this.E > 0) {
            if (i2 == 8192) {
                if (f(-e())) {
                    a(false);
                }
            } else if (i2 == 4096) {
                if (f(e())) {
                    a(false);
                }
            }
            sendAccessibilityEvent(4);
            return true;
        }
        return false;
    }

    private final void a(float f2) {
        this.d.right = blm.a((int) f2, this.b.left, this.b.right);
    }

    private final boolean f(long j2) {
        long j3 = this.E;
        if (j3 > 0) {
            long j4 = this.C ? this.D : this.F;
            long a2 = blm.a(j4 + j2, 0, j3);
            if (a2 != j4) {
                if (!this.C) {
                    d(a2);
                } else {
                    e(a2);
                }
                b();
                return true;
            }
        }
        return false;
    }

    public final void a(long[] jArr, boolean[] zArr, int i2) {
        boolean z2 = false;
        if (i2 == 0) {
            z2 = true;
        } else if (!(jArr == null || zArr == null)) {
            z2 = true;
        }
        bks.a(z2);
        this.H = i2;
        this.I = jArr;
        this.J = zArr;
        b();
    }

    public final void b(long j2) {
        this.G = j2;
        b();
    }

    public final void c(long j2) {
        this.E = j2;
        if (this.C && j2 == -9223372036854775807L) {
            a(true);
        }
        b();
    }

    public final void setEnabled(boolean z2) {
        super.setEnabled(z2);
        if (this.C && !z2) {
            a(true);
        }
    }

    public final void a(long j2) {
        this.F = j2;
        setContentDescription(d());
        b();
    }

    private final void d(long j2) {
        this.D = j2;
        this.C = true;
        setPressed(true);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        Iterator it = this.v.iterator();
        while (it.hasNext()) {
            ((bhf) it.next()).b(j2);
        }
    }

    public final void a(boolean z2) {
        removeCallbacks(this.u);
        this.C = false;
        setPressed(false);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        invalidate();
        Iterator it = this.v.iterator();
        while (it.hasNext()) {
            ((bhf) it.next()).a(this.D, z2);
        }
    }

    private final void b() {
        long j2;
        this.c.set(this.b);
        this.d.set(this.b);
        if (!this.C) {
            j2 = this.F;
        } else {
            j2 = this.D;
        }
        if (this.E > 0) {
            int width = this.b.width();
            long j3 = ((long) width) * this.G;
            this.c.right = Math.min(this.b.left + ((int) (j3 / this.E)), this.b.right);
            long width2 = ((long) this.b.width()) * j2;
            this.d.right = Math.min(this.b.left + ((int) (width2 / this.E)), this.b.right);
        } else {
            this.c.right = this.b.left;
            this.d.right = this.b.left;
        }
        invalidate(this.a);
    }

    private final void e(long j2) {
        if (this.D != j2) {
            this.D = j2;
            Iterator it = this.v.iterator();
            while (it.hasNext()) {
                ((bhf) it.next()).a(j2);
            }
        }
    }
}
