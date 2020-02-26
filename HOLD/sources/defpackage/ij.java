package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ij  reason: default package */
/* compiled from: PG */
public final class ij extends akr implements jz {
    private static final int[] p = {16842919};
    private static final int[] q = new int[0];
    private int A = 0;
    private final int[] B = new int[2];
    private final int[] C = new int[2];
    private final Runnable D = new C0001if(this);
    private final atc E = new ig(this);
    public final int a;
    public final StateListDrawable b;
    public final Drawable c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h = 0;
    public int i = 0;
    public RecyclerView j;
    public boolean k = false;
    public boolean l = false;
    public int m = 0;
    public final ValueAnimator n = ValueAnimator.ofFloat(0.0f, 1.0f);
    public int o = 0;
    private final int r;
    private final int s;
    private final int t;
    private final StateListDrawable u;
    private final Drawable v;
    private final int w;
    private final int x;
    private float y;
    private float z;

    private final boolean b(float f2, float f3) {
        if (f3 < ((float) (this.i - this.w))) {
            return false;
        }
        int i2 = this.g;
        int i3 = this.f / 2;
        return f2 >= ((float) (i2 - i3)) && f2 <= ((float) (i2 + i3));
    }

    public final void b() {
    }

    public ij(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i2, int i3, int i4) {
        boolean z2 = false;
        this.b = stateListDrawable;
        this.c = drawable;
        this.u = stateListDrawable2;
        this.v = drawable2;
        this.s = Math.max(i2, stateListDrawable.getIntrinsicWidth());
        this.t = Math.max(i2, drawable.getIntrinsicWidth());
        this.w = Math.max(i2, stateListDrawable2.getIntrinsicWidth());
        this.x = Math.max(i2, drawable2.getIntrinsicWidth());
        this.a = i3;
        this.r = i4;
        this.b.setAlpha(255);
        this.c.setAlpha(255);
        this.n.addListener(new ih(this));
        this.n.addUpdateListener(new ii(this));
        RecyclerView recyclerView2 = this.j;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                jx jxVar = recyclerView2.h;
                if (jxVar != null) {
                    jxVar.a("Cannot remove item decoration during a scroll  or layout");
                }
                recyclerView2.j.remove(this);
                if (recyclerView2.j.isEmpty()) {
                    recyclerView2.setWillNotDraw(recyclerView2.getOverScrollMode() == 2 ? true : z2);
                }
                recyclerView2.n();
                recyclerView2.requestLayout();
                RecyclerView recyclerView3 = this.j;
                recyclerView3.k.remove(this);
                if (recyclerView3.l == this) {
                    recyclerView3.l = null;
                }
                RecyclerView recyclerView4 = this.j;
                atc atc = this.E;
                List list = recyclerView4.E;
                if (list != null) {
                    list.remove(atc);
                }
                e();
            }
            this.j = recyclerView;
            if (recyclerView != null) {
                recyclerView.a(this);
                this.j.k.add(this);
                RecyclerView recyclerView5 = this.j;
                atc atc2 = this.E;
                if (recyclerView5.E == null) {
                    recyclerView5.E = new ArrayList();
                }
                recyclerView5.E.add(atc2);
            }
        }
    }

    private final void e() {
        this.j.removeCallbacks(this.D);
    }

    private final boolean c() {
        return dx.f(this.j) == 1;
    }

    private final boolean a(float f2, float f3) {
        if (!c()) {
            if (f2 < ((float) (this.h - this.s))) {
                return false;
            }
        } else if (f2 > ((float) (this.s / 2))) {
            return false;
        }
        int i2 = this.e;
        int i3 = this.d / 2;
        return f3 >= ((float) (i2 - i3)) && f3 <= ((float) (i2 + i3));
    }

    public final void a(Canvas canvas, RecyclerView recyclerView) {
        if (this.h != this.j.getWidth() || this.i != this.j.getHeight()) {
            this.h = this.j.getWidth();
            this.i = this.j.getHeight();
            a(0);
        } else if (this.o != 0) {
            if (this.k) {
                int i2 = this.h;
                int i3 = this.s;
                int i4 = i2 - i3;
                int i5 = this.e;
                int i6 = this.d;
                int i7 = i5 - (i6 / 2);
                this.b.setBounds(0, 0, i3, i6);
                this.c.setBounds(0, 0, this.t, this.i);
                if (c()) {
                    this.c.draw(canvas);
                    canvas.translate((float) this.s, (float) i7);
                    canvas.scale(-1.0f, 1.0f);
                    this.b.draw(canvas);
                    canvas.scale(1.0f, 1.0f);
                    canvas.translate((float) (-this.s), (float) (-i7));
                } else {
                    canvas.translate((float) i4, 0.0f);
                    this.c.draw(canvas);
                    canvas.translate(0.0f, (float) i7);
                    this.b.draw(canvas);
                    canvas.translate((float) (-i4), (float) (-i7));
                }
            }
            if (this.l) {
                int i8 = this.i;
                int i9 = this.w;
                int i10 = i8 - i9;
                int i11 = this.g;
                int i12 = this.f;
                int i13 = i11 - (i12 / 2);
                this.u.setBounds(0, 0, i12, i9);
                this.v.setBounds(0, 0, this.h, this.x);
                canvas.translate(0.0f, (float) i10);
                this.v.draw(canvas);
                canvas.translate((float) i13, 0.0f);
                this.u.draw(canvas);
                canvas.translate((float) (-i13), (float) (-i10));
            }
        }
    }

    public final boolean a(MotionEvent motionEvent) {
        int i2 = this.m;
        if (i2 != 1) {
            return i2 == 2;
        }
        boolean a2 = a(motionEvent.getX(), motionEvent.getY());
        boolean b2 = b(motionEvent.getX(), motionEvent.getY());
        if (motionEvent.getAction() != 0) {
            return false;
        }
        if (!a2) {
            if (!b2) {
                return false;
            }
        } else if (!b2) {
            this.A = 2;
            this.y = (float) ((int) motionEvent.getY());
            a(2);
            return true;
        }
        this.A = 1;
        this.z = (float) ((int) motionEvent.getX());
        a(2);
        return true;
    }

    public final void b(MotionEvent motionEvent) {
        if (this.m == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean a2 = a(motionEvent.getX(), motionEvent.getY());
            boolean b2 = b(motionEvent.getX(), motionEvent.getY());
            if (!a2) {
                if (!b2) {
                    return;
                }
            } else if (!b2) {
                this.A = 2;
                this.y = (float) ((int) motionEvent.getY());
                a(2);
            }
            this.A = 1;
            this.z = (float) ((int) motionEvent.getX());
            a(2);
        } else if (motionEvent.getAction() == 1 && this.m == 2) {
            this.y = 0.0f;
            this.z = 0.0f;
            a(1);
            this.A = 0;
        } else if (motionEvent.getAction() == 2 && this.m == 2) {
            d();
            if (this.A == 1) {
                float x2 = motionEvent.getX();
                int[] iArr = this.C;
                int i2 = this.r;
                iArr[0] = i2;
                int i3 = this.h - i2;
                iArr[1] = i3;
                float max = Math.max((float) iArr[0], Math.min((float) i3, x2));
                if (Math.abs(((float) this.g) - max) >= 2.0f) {
                    int a3 = a(this.z, max, iArr, this.j.computeHorizontalScrollRange(), this.j.computeHorizontalScrollOffset(), this.h);
                    if (a3 != 0) {
                        this.j.scrollBy(a3, 0);
                    }
                    this.z = max;
                }
            }
            if (this.A == 2) {
                float y2 = motionEvent.getY();
                int[] iArr2 = this.B;
                int i4 = this.r;
                iArr2[0] = i4;
                int i5 = this.i - i4;
                iArr2[1] = i5;
                float max2 = Math.max((float) iArr2[0], Math.min((float) i5, y2));
                if (Math.abs(((float) this.e) - max2) >= 2.0f) {
                    int a4 = a(this.y, max2, iArr2, this.j.computeVerticalScrollRange(), this.j.computeVerticalScrollOffset(), this.i);
                    if (a4 != 0) {
                        this.j.scrollBy(0, a4);
                    }
                    this.y = max2;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        this.j.invalidate();
    }

    private final void b(int i2) {
        e();
        this.j.postDelayed(this.D, (long) i2);
    }

    private static final int a(float f2, float f3, int[] iArr, int i2, int i3, int i4) {
        int i5 = iArr[1] - iArr[0];
        if (i5 != 0) {
            int i6 = i2 - i4;
            int i7 = (int) (((f3 - f2) / ((float) i5)) * ((float) i6));
            int i8 = i3 + i7;
            if (i8 >= i6 || i8 < 0) {
                return 0;
            }
            return i7;
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2) {
        if (i2 == 2 && this.m != 2) {
            this.b.setState(p);
            e();
        }
        if (i2 != 0) {
            d();
        } else {
            a();
        }
        if (this.m == 2 && i2 != 2) {
            this.b.setState(q);
            b(1200);
        } else if (i2 == 1) {
            b(1500);
        }
        this.m = i2;
    }

    private final void d() {
        int i2 = this.o;
        if (i2 != 0) {
            if (i2 == 3) {
                this.n.cancel();
            } else {
                return;
            }
        }
        this.o = 1;
        ValueAnimator valueAnimator = this.n;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        this.n.setDuration(500L);
        this.n.setStartDelay(0);
        this.n.start();
    }
}
