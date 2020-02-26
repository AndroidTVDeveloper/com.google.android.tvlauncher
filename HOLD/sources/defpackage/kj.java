package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* renamed from: kj  reason: default package */
/* compiled from: PG */
public class kj {
    public int a = -1;
    public RecyclerView b;
    public jx c;
    public boolean d;
    public boolean e;
    public View f;
    public boolean g;
    public final DecelerateInterpolator h = new DecelerateInterpolator();
    private final kh i = new kh();
    private final LinearInterpolator j = new LinearInterpolator();
    private PointF k;
    private final DisplayMetrics l;
    private boolean m = false;
    private float n;
    private int o = 0;
    private int p = 0;

    public kj(Context context) {
        this.l = context.getResources().getDisplayMetrics();
    }

    private static int a(int i2, int i3, int i4, int i5, int i6) {
        if (i6 == -1) {
            return i4 - i2;
        }
        if (i6 != 0) {
            return i5 - i3;
        }
        int i7 = i4 - i2;
        if (i7 > 0) {
            return i7;
        }
        int i8 = i5 - i3;
        if (i8 < 0) {
            return i8;
        }
        return 0;
    }

    private static int b(int i2, int i3) {
        int i4 = i2 - i3;
        if (i2 * i4 <= 0) {
            return 0;
        }
        return i4;
    }

    /* access modifiers changed from: protected */
    public float a(DisplayMetrics displayMetrics) {
        return 25.0f / ((float) displayMetrics.densityDpi);
    }

    /* access modifiers changed from: protected */
    public final int c(int i2) {
        double d2 = (double) d(i2);
        Double.isNaN(d2);
        return (int) Math.ceil(d2 / 0.3356d);
    }

    /* access modifiers changed from: protected */
    public int d(int i2) {
        float abs = (float) Math.abs(i2);
        if (!this.m) {
            this.n = a(this.l);
            this.m = true;
        }
        return (int) Math.ceil((double) (abs * this.n));
    }

    /* access modifiers changed from: protected */
    public void c() {
        this.p = 0;
        this.o = 0;
        this.k = null;
    }

    /* access modifiers changed from: protected */
    public void a(View view, kh khVar) {
        int i2;
        PointF pointF = this.k;
        int i3 = 1;
        int i4 = 0;
        int i5 = (pointF == null || pointF.x == 0.0f) ? 0 : this.k.x > 0.0f ? 1 : -1;
        jx jxVar = this.c;
        if (jxVar == null || !jxVar.c()) {
            i2 = 0;
        } else {
            jy jyVar = (jy) view.getLayoutParams();
            i2 = a(jxVar.a(view) - jyVar.leftMargin, jxVar.c(view) + jyVar.rightMargin, jxVar.h(), jxVar.h - jxVar.j(), i5);
        }
        PointF pointF2 = this.k;
        if (pointF2 == null || pointF2.y == 0.0f) {
            i3 = 0;
        } else if (this.k.y <= 0.0f) {
            i3 = -1;
        }
        jx jxVar2 = this.c;
        if (jxVar2 != null && jxVar2.d()) {
            jy jyVar2 = (jy) view.getLayoutParams();
            i4 = a(jxVar2.b(view) - jyVar2.topMargin, jxVar2.d(view) + jyVar2.bottomMargin, jxVar2.i(), jxVar2.i - jxVar2.k(), i3);
        }
        int c2 = c((int) Math.sqrt((double) ((i2 * i2) + (i4 * i4))));
        if (c2 > 0) {
            khVar.a(-i2, -i4, c2, this.h);
        }
    }

    /* access modifiers changed from: protected */
    public void a(kh khVar) {
        PointF a2 = a(this.a);
        if (a2 == null || (a2.x == 0.0f && a2.y == 0.0f)) {
            khVar.a = this.a;
            a();
            return;
        }
        float sqrt = (float) Math.sqrt((double) ((a2.x * a2.x) + (a2.y * a2.y)));
        a2.x /= sqrt;
        a2.y /= sqrt;
        this.k = a2;
        this.o = (int) (a2.x * 10000.0f);
        this.p = (int) (a2.y * 10000.0f);
        khVar.a((int) (((float) this.o) * 1.2f), (int) (((float) this.p) * 1.2f), (int) (((float) d(10000)) * 1.2f), this.j);
    }

    public PointF a(int i2) {
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + ki.class.getCanonicalName());
        return null;
    }

    public final View b(int i2) {
        return this.b.h.c(i2);
    }

    public final int b() {
        return this.b.h.g();
    }

    public static final int a(View view) {
        km c2 = RecyclerView.c(view);
        if (c2 == null) {
            return -1;
        }
        return c2.c();
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2, int i3) {
        PointF a2;
        RecyclerView recyclerView = this.b;
        if (this.a == -1 || recyclerView == null) {
            a();
        }
        if (!(!this.d || this.f != null || this.c == null || (a2 = a(this.a)) == null || (a2.x == 0.0f && a2.y == 0.0f))) {
            recyclerView.a((int) Math.signum(a2.x), (int) Math.signum(a2.y), (int[]) null);
        }
        this.d = false;
        View view = this.f;
        if (view != null) {
            if (a(view) == this.a) {
                View view2 = this.f;
                kk kkVar = recyclerView.D;
                a(view2, this.i);
                this.i.a(recyclerView);
                a();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.f = null;
            }
        }
        if (this.e) {
            kk kkVar2 = recyclerView.D;
            kh khVar = this.i;
            if (b() == 0) {
                a();
            } else {
                this.o = b(this.o, i2);
                int b2 = b(this.p, i3);
                this.p = b2;
                if (this.o == 0 && b2 == 0) {
                    a(khVar);
                }
            }
            kh khVar2 = this.i;
            int i4 = khVar2.a;
            khVar2.a(recyclerView);
            if (i4 >= 0 && this.e) {
                this.d = true;
                recyclerView.A.a();
            }
        }
    }

    public final void a() {
        if (this.e) {
            this.e = false;
            c();
            this.b.D.a = -1;
            this.f = null;
            this.a = -1;
            this.d = false;
            jx jxVar = this.c;
            if (jxVar.c == this) {
                jxVar.c = null;
            }
            this.c = null;
            this.b = null;
        }
    }
}
