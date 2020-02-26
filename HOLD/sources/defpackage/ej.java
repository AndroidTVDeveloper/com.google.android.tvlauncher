package defpackage;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.ListView;

/* renamed from: ej  reason: default package */
/* compiled from: PG */
public final class ej implements View.OnTouchListener {
    private static final int q = ViewConfiguration.getTapTimeout();
    public final eh a = new eh();
    public final View b;
    public boolean c;
    public boolean d;
    public boolean e;
    public final ListView f;
    private final Interpolator g = new AccelerateInterpolator();
    private Runnable h;
    private final float[] i = {0.0f, 0.0f};
    private final float[] j = {Float.MAX_VALUE, Float.MAX_VALUE};
    private final int k;
    private final float[] l = {0.0f, 0.0f};
    private final float[] m = {0.0f, 0.0f};
    private final float[] n = {Float.MAX_VALUE, Float.MAX_VALUE};
    private boolean o;
    private boolean p;

    private final float a(float f2, float f3) {
        if (f3 != 0.0f && f2 < f3) {
            if (f2 >= 0.0f) {
                return 1.0f - (f2 / f3);
            }
            if (this.e) {
                return 1.0f;
            }
        }
        return 0.0f;
    }

    static float a(float f2, float f3, float f4) {
        return f2 <= f4 ? f2 < f3 ? f3 : f2 : f4;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0061 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final float a(int r4, float r5, float r6, float r7) {
        /*
            r3 = this;
            float[] r0 = r3.i
            r0 = r0[r4]
            float r0 = r0 * r6
            float[] r1 = r3.j
            r1 = r1[r4]
            r2 = 0
            float r0 = a(r0, r2, r1)
            float r1 = r3.a(r5, r0)
            float r6 = r6 - r5
            float r5 = r3.a(r6, r0)
            float r5 = r5 - r1
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 >= 0) goto L_0x0026
            android.view.animation.Interpolator r6 = r3.g
            float r5 = -r5
            float r5 = r6.getInterpolation(r5)
            float r5 = -r5
            goto L_0x0030
        L_0x0026:
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 <= 0) goto L_0x0039
            android.view.animation.Interpolator r6 = r3.g
            float r5 = r6.getInterpolation(r5)
        L_0x0030:
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r5 = a(r5, r6, r0)
            goto L_0x003b
        L_0x0039:
            r5 = 0
        L_0x003b:
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 == 0) goto L_0x0061
            float[] r6 = r3.l
            r6 = r6[r4]
            float[] r0 = r3.m
            r0 = r0[r4]
            float[] r1 = r3.n
            r4 = r1[r4]
            float r6 = r6 * r7
            int r7 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r7 <= 0) goto L_0x0058
            float r5 = r5 * r6
            float r4 = a(r5, r0, r4)
            return r4
        L_0x0058:
            float r5 = -r5
            float r5 = r5 * r6
            float r4 = a(r5, r0, r4)
            float r4 = -r4
            return r4
        L_0x0061:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ej.a(int, float, float, float):float");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0012, code lost:
        if (r0 != 3) goto L_0x0080;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            boolean r0 = r5.p
            r1 = 0
            if (r0 == 0) goto L_0x0081
            int r0 = r7.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L_0x0019
            if (r0 == r2) goto L_0x0015
            r3 = 2
            if (r0 == r3) goto L_0x001e
            r6 = 3
            if (r0 == r6) goto L_0x0015
            goto L_0x007f
        L_0x0015:
            r5.b()
            goto L_0x007f
        L_0x0019:
            r5.d = r2
            r5.o = r1
        L_0x001e:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            android.view.View r4 = r5.b
            int r4 = r4.getWidth()
            float r3 = (float) r3
            float r4 = (float) r4
            float r0 = r5.a(r1, r0, r3, r4)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            android.view.View r3 = r5.b
            int r3 = r3.getHeight()
            float r6 = (float) r6
            float r3 = (float) r3
            float r6 = r5.a(r2, r7, r6, r3)
            eh r7 = r5.a
            r7.c = r0
            r7.d = r6
            boolean r6 = r5.e
            if (r6 != 0) goto L_0x007f
            boolean r6 = r5.a()
            if (r6 == 0) goto L_0x007f
            java.lang.Runnable r6 = r5.h
            if (r6 != 0) goto L_0x0061
            ei r6 = new ei
            r6.<init>(r5)
            r5.h = r6
        L_0x0061:
            r5.e = r2
            r5.c = r2
            boolean r6 = r5.o
            if (r6 != 0) goto L_0x0077
            int r6 = r5.k
            if (r6 <= 0) goto L_0x0077
            android.view.View r7 = r5.b
            java.lang.Runnable r0 = r5.h
            long r3 = (long) r6
            defpackage.dx.a(r7, r0, r3)
            goto L_0x007c
        L_0x0077:
            java.lang.Runnable r6 = r5.h
            r6.run()
        L_0x007c:
            r5.o = r2
        L_0x007f:
            return r1
        L_0x0081:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ej.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    private final void b() {
        int i2 = 0;
        if (!this.c) {
            eh ehVar = this.a;
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            int i3 = (int) (currentAnimationTimeMillis - ehVar.e);
            int i4 = ehVar.b;
            if (i3 > i4) {
                i2 = i4;
            } else if (i3 >= 0) {
                i2 = i3;
            }
            ehVar.k = i2;
            ehVar.j = ehVar.a(currentAnimationTimeMillis);
            ehVar.i = currentAnimationTimeMillis;
            return;
        }
        this.e = false;
    }

    public final void a(boolean z) {
        if (this.p && !z) {
            b();
        }
        this.p = z;
    }

    /* access modifiers changed from: package-private */
    public final boolean a() {
        ListView listView;
        int count;
        eh ehVar = this.a;
        float f2 = ehVar.d;
        int abs = (int) (f2 / Math.abs(f2));
        float f3 = ehVar.c;
        int abs2 = (int) (f3 / Math.abs(f3));
        if (!(abs == 0 || (count = (listView = this.f).getCount()) == 0)) {
            int childCount = listView.getChildCount();
            int firstVisiblePosition = listView.getFirstVisiblePosition();
            int i2 = firstVisiblePosition + childCount;
            if (abs <= 0) {
                if (abs < 0 && (firstVisiblePosition > 0 || listView.getChildAt(0).getTop() < 0)) {
                    return true;
                }
            } else if (i2 < count || listView.getChildAt(childCount - 1).getBottom() > listView.getHeight()) {
                return true;
            }
        }
        if (abs2 == 0) {
            return false;
        }
        return false;
    }

    public ej(ListView listView) {
        this.b = listView;
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        float f2 = displayMetrics.density;
        float f3 = displayMetrics.density;
        float[] fArr = this.n;
        float f4 = ((float) ((int) ((f2 * 1575.0f) + 0.5f))) / 1000.0f;
        fArr[0] = f4;
        fArr[1] = f4;
        float[] fArr2 = this.m;
        float f5 = ((float) ((int) ((f3 * 315.0f) + 0.5f))) / 1000.0f;
        fArr2[0] = f5;
        fArr2[1] = f5;
        float[] fArr3 = this.j;
        fArr3[0] = Float.MAX_VALUE;
        fArr3[1] = Float.MAX_VALUE;
        float[] fArr4 = this.i;
        fArr4[0] = 0.2f;
        fArr4[1] = 0.2f;
        float[] fArr5 = this.l;
        fArr5[0] = 0.001f;
        fArr5[1] = 0.001f;
        this.k = q;
        eh ehVar = this.a;
        ehVar.a = 500;
        ehVar.b = 500;
        this.f = listView;
    }
}
