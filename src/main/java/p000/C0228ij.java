package p000;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.support.p002v7.widget.RecyclerView;
import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ij */
/* compiled from: PG */
public final class C0228ij extends akr implements C0271jz {

    /* renamed from: p */
    private static final int[] f9571p = {16842919};

    /* renamed from: q */
    private static final int[] f9572q = new int[0];

    /* renamed from: A */
    private int f9573A = 0;

    /* renamed from: B */
    private final int[] f9574B = new int[2];

    /* renamed from: C */
    private final int[] f9575C = new int[2];

    /* renamed from: D */
    private final Runnable f9576D = new C0224if(this);

    /* renamed from: E */
    private final atc f9577E = new C0225ig(this);

    /* renamed from: a */
    public final int f9578a;

    /* renamed from: b */
    public final StateListDrawable f9579b;

    /* renamed from: c */
    public final Drawable f9580c;

    /* renamed from: d */
    public int f9581d;

    /* renamed from: e */
    public int f9582e;

    /* renamed from: f */
    public int f9583f;

    /* renamed from: g */
    public int f9584g;

    /* renamed from: h */
    public int f9585h = 0;

    /* renamed from: i */
    public int f9586i = 0;

    /* renamed from: j */
    public RecyclerView f9587j;

    /* renamed from: k */
    public boolean f9588k = false;

    /* renamed from: l */
    public boolean f9589l = false;

    /* renamed from: m */
    public int f9590m = 0;

    /* renamed from: n */
    public final ValueAnimator f9591n = ValueAnimator.ofFloat(0.0f, 1.0f);

    /* renamed from: o */
    public int f9592o = 0;

    /* renamed from: r */
    private final int f9593r;

    /* renamed from: s */
    private final int f9594s;

    /* renamed from: t */
    private final int f9595t;

    /* renamed from: u */
    private final StateListDrawable f9596u;

    /* renamed from: v */
    private final Drawable f9597v;

    /* renamed from: w */
    private final int f9598w;

    /* renamed from: x */
    private final int f9599x;

    /* renamed from: y */
    private float f9600y;

    /* renamed from: z */
    private float f9601z;

    /* renamed from: b */
    private final boolean m7570b(float f, float f2) {
        if (f2 < ((float) (this.f9586i - this.f9598w))) {
            return false;
        }
        int i = this.f9584g;
        int i2 = this.f9583f / 2;
        return f >= ((float) (i - i2)) && f <= ((float) (i + i2));
    }

    /* renamed from: b */
    public final void mo5251b() {
    }

    public C0228ij(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        boolean z = false;
        this.f9579b = stateListDrawable;
        this.f9580c = drawable;
        this.f9596u = stateListDrawable2;
        this.f9597v = drawable2;
        this.f9594s = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.f9595t = Math.max(i, drawable.getIntrinsicWidth());
        this.f9598w = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.f9599x = Math.max(i, drawable2.getIntrinsicWidth());
        this.f9578a = i2;
        this.f9593r = i3;
        this.f9579b.setAlpha(255);
        this.f9580c.setAlpha(255);
        this.f9591n.addListener(new C0226ih(this));
        this.f9591n.addUpdateListener(new C0227ii(this));
        RecyclerView recyclerView2 = this.f9587j;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                C0269jx jxVar = recyclerView2.f1068h;
                if (jxVar != null) {
                    jxVar.mo5344a("Cannot remove item decoration during a scroll  or layout");
                }
                recyclerView2.f1070j.remove(this);
                if (recyclerView2.f1070j.isEmpty()) {
                    recyclerView2.setWillNotDraw(recyclerView2.getOverScrollMode() == 2 ? true : z);
                }
                recyclerView2.mo894n();
                recyclerView2.requestLayout();
                RecyclerView recyclerView3 = this.f9587j;
                recyclerView3.f1071k.remove(this);
                if (recyclerView3.f1072l == this) {
                    recyclerView3.f1072l = null;
                }
                RecyclerView recyclerView4 = this.f9587j;
                atc atc = this.f9577E;
                List list = recyclerView4.f1025E;
                if (list != null) {
                    list.remove(atc);
                }
                m7573e();
            }
            this.f9587j = recyclerView;
            if (recyclerView != null) {
                recyclerView.mo829a(this);
                this.f9587j.f1071k.add(this);
                RecyclerView recyclerView5 = this.f9587j;
                atc atc2 = this.f9577E;
                if (recyclerView5.f1025E == null) {
                    recyclerView5.f1025E = new ArrayList();
                }
                recyclerView5.f1025E.add(atc2);
            }
        }
    }

    /* renamed from: e */
    private final void m7573e() {
        this.f9587j.removeCallbacks(this.f9576D);
    }

    /* renamed from: c */
    private final boolean m7571c() {
        return C0107dx.m7209f(this.f9587j) == 1;
    }

    /* renamed from: a */
    private final boolean m7568a(float f, float f2) {
        if (!m7571c()) {
            if (f < ((float) (this.f9585h - this.f9594s))) {
                return false;
            }
        } else if (f > ((float) (this.f9594s / 2))) {
            return false;
        }
        int i = this.f9582e;
        int i2 = this.f9581d / 2;
        return f2 >= ((float) (i - i2)) && f2 <= ((float) (i + i2));
    }

    /* renamed from: a */
    public final void mo464a(Canvas canvas, RecyclerView recyclerView) {
        if (this.f9585h != this.f9587j.getWidth() || this.f9586i != this.f9587j.getHeight()) {
            this.f9585h = this.f9587j.getWidth();
            this.f9586i = this.f9587j.getHeight();
            mo5249a(0);
        } else if (this.f9592o != 0) {
            if (this.f9588k) {
                int i = this.f9585h;
                int i2 = this.f9594s;
                int i3 = i - i2;
                int i4 = this.f9582e;
                int i5 = this.f9581d;
                int i6 = i4 - (i5 / 2);
                this.f9579b.setBounds(0, 0, i2, i5);
                this.f9580c.setBounds(0, 0, this.f9595t, this.f9586i);
                if (m7571c()) {
                    this.f9580c.draw(canvas);
                    canvas.translate((float) this.f9594s, (float) i6);
                    canvas.scale(-1.0f, 1.0f);
                    this.f9579b.draw(canvas);
                    canvas.scale(1.0f, 1.0f);
                    canvas.translate((float) (-this.f9594s), (float) (-i6));
                } else {
                    canvas.translate((float) i3, 0.0f);
                    this.f9580c.draw(canvas);
                    canvas.translate(0.0f, (float) i6);
                    this.f9579b.draw(canvas);
                    canvas.translate((float) (-i3), (float) (-i6));
                }
            }
            if (this.f9589l) {
                int i7 = this.f9586i;
                int i8 = this.f9598w;
                int i9 = i7 - i8;
                int i10 = this.f9584g;
                int i11 = this.f9583f;
                int i12 = i10 - (i11 / 2);
                this.f9596u.setBounds(0, 0, i11, i8);
                this.f9597v.setBounds(0, 0, this.f9585h, this.f9599x);
                canvas.translate(0.0f, (float) i9);
                this.f9597v.draw(canvas);
                canvas.translate((float) i12, 0.0f);
                this.f9596u.draw(canvas);
                canvas.translate((float) (-i12), (float) (-i9));
            }
        }
    }

    /* renamed from: a */
    public final boolean mo5250a(MotionEvent motionEvent) {
        int i = this.f9590m;
        if (i != 1) {
            return i == 2;
        }
        boolean a = m7568a(motionEvent.getX(), motionEvent.getY());
        boolean b = m7570b(motionEvent.getX(), motionEvent.getY());
        if (motionEvent.getAction() != 0) {
            return false;
        }
        if (!a) {
            if (!b) {
                return false;
            }
        } else if (!b) {
            this.f9573A = 2;
            this.f9600y = (float) ((int) motionEvent.getY());
            mo5249a(2);
            return true;
        }
        this.f9573A = 1;
        this.f9601z = (float) ((int) motionEvent.getX());
        mo5249a(2);
        return true;
    }

    /* renamed from: b */
    public final void mo5252b(MotionEvent motionEvent) {
        if (this.f9590m == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean a = m7568a(motionEvent.getX(), motionEvent.getY());
            boolean b = m7570b(motionEvent.getX(), motionEvent.getY());
            if (!a) {
                if (!b) {
                    return;
                }
            } else if (!b) {
                this.f9573A = 2;
                this.f9600y = (float) ((int) motionEvent.getY());
                mo5249a(2);
            }
            this.f9573A = 1;
            this.f9601z = (float) ((int) motionEvent.getX());
            mo5249a(2);
        } else if (motionEvent.getAction() == 1 && this.f9590m == 2) {
            this.f9600y = 0.0f;
            this.f9601z = 0.0f;
            mo5249a(1);
            this.f9573A = 0;
        } else if (motionEvent.getAction() == 2 && this.f9590m == 2) {
            m7572d();
            if (this.f9573A == 1) {
                float x = motionEvent.getX();
                int[] iArr = this.f9575C;
                int i = this.f9593r;
                iArr[0] = i;
                int i2 = this.f9585h - i;
                iArr[1] = i2;
                float max = Math.max((float) iArr[0], Math.min((float) i2, x));
                if (Math.abs(((float) this.f9584g) - max) >= 2.0f) {
                    int a2 = m7567a(this.f9601z, max, iArr, this.f9587j.computeHorizontalScrollRange(), this.f9587j.computeHorizontalScrollOffset(), this.f9585h);
                    if (a2 != 0) {
                        this.f9587j.scrollBy(a2, 0);
                    }
                    this.f9601z = max;
                }
            }
            if (this.f9573A == 2) {
                float y = motionEvent.getY();
                int[] iArr2 = this.f9574B;
                int i3 = this.f9593r;
                iArr2[0] = i3;
                int i4 = this.f9586i - i3;
                iArr2[1] = i4;
                float max2 = Math.max((float) iArr2[0], Math.min((float) i4, y));
                if (Math.abs(((float) this.f9582e) - max2) >= 2.0f) {
                    int a3 = m7567a(this.f9600y, max2, iArr2, this.f9587j.computeVerticalScrollRange(), this.f9587j.computeVerticalScrollOffset(), this.f9586i);
                    if (a3 != 0) {
                        this.f9587j.scrollBy(0, a3);
                    }
                    this.f9600y = max2;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo5248a() {
        this.f9587j.invalidate();
    }

    /* renamed from: b */
    private final void m7569b(int i) {
        m7573e();
        this.f9587j.postDelayed(this.f9576D, (long) i);
    }

    /* renamed from: a */
    private static final int m7567a(float f, float f2, int[] iArr, int i, int i2, int i3) {
        int i4 = iArr[1] - iArr[0];
        if (i4 != 0) {
            int i5 = i - i3;
            int i6 = (int) (((f2 - f) / ((float) i4)) * ((float) i5));
            int i7 = i2 + i6;
            if (i7 >= i5 || i7 < 0) {
                return 0;
            }
            return i6;
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo5249a(int i) {
        if (i == 2 && this.f9590m != 2) {
            this.f9579b.setState(f9571p);
            m7573e();
        }
        if (i != 0) {
            m7572d();
        } else {
            mo5248a();
        }
        if (this.f9590m == 2 && i != 2) {
            this.f9579b.setState(f9572q);
            m7569b(1200);
        } else if (i == 1) {
            m7569b(1500);
        }
        this.f9590m = i;
    }

    /* renamed from: d */
    private final void m7572d() {
        int i = this.f9592o;
        if (i != 0) {
            if (i == 3) {
                this.f9591n.cancel();
            } else {
                return;
            }
        }
        this.f9592o = 1;
        ValueAnimator valueAnimator = this.f9591n;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        this.f9591n.setDuration(500L);
        this.f9591n.setStartDelay(0);
        this.f9591n.start();
    }
}
