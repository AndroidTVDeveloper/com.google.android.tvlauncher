package p000;

import android.content.Context;
import android.graphics.PointF;
import android.support.p002v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* renamed from: kj */
/* compiled from: PG */
public class C0282kj {

    /* renamed from: a */
    public int f9743a = -1;

    /* renamed from: b */
    public RecyclerView f9744b;

    /* renamed from: c */
    public C0269jx f9745c;

    /* renamed from: d */
    public boolean f9746d;

    /* renamed from: e */
    public boolean f9747e;

    /* renamed from: f */
    public View f9748f;

    /* renamed from: g */
    public boolean f9749g;

    /* renamed from: h */
    public final DecelerateInterpolator f9750h = new DecelerateInterpolator();

    /* renamed from: i */
    private final C0280kh f9751i = new C0280kh();

    /* renamed from: j */
    private final LinearInterpolator f9752j = new LinearInterpolator();

    /* renamed from: k */
    private PointF f9753k;

    /* renamed from: l */
    private final DisplayMetrics f9754l;

    /* renamed from: m */
    private boolean f9755m = false;

    /* renamed from: n */
    private float f9756n;

    /* renamed from: o */
    private int f9757o = 0;

    /* renamed from: p */
    private int f9758p = 0;

    public C0282kj(Context context) {
        this.f9754l = context.getResources().getDisplayMetrics();
    }

    /* renamed from: a */
    private static int m7779a(int i, int i2, int i3, int i4, int i5) {
        if (i5 == -1) {
            return i3 - i;
        }
        if (i5 != 0) {
            return i4 - i2;
        }
        int i6 = i3 - i;
        if (i6 > 0) {
            return i6;
        }
        int i7 = i4 - i2;
        if (i7 < 0) {
            return i7;
        }
        return 0;
    }

    /* renamed from: b */
    private static int m7781b(int i, int i2) {
        int i3 = i - i2;
        if (i * i3 <= 0) {
            return 0;
        }
        return i3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public float mo5409a(DisplayMetrics displayMetrics) {
        return 25.0f / ((float) displayMetrics.densityDpi);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final int mo5417c(int i) {
        double d = (double) mo5419d(i);
        Double.isNaN(d);
        return (int) Math.ceil(d / 0.3356d);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public int mo5419d(int i) {
        float abs = (float) Math.abs(i);
        if (!this.f9755m) {
            this.f9756n = mo5409a(this.f9754l);
            this.f9755m = true;
        }
        return (int) Math.ceil((double) (abs * this.f9756n));
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo5418c() {
        this.f9758p = 0;
        this.f9757o = 0;
        this.f9753k = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo5413a(View view, C0280kh khVar) {
        int i;
        PointF pointF = this.f9753k;
        int i2 = 1;
        int i3 = 0;
        int i4 = (pointF == null || pointF.x == 0.0f) ? 0 : this.f9753k.x > 0.0f ? 1 : -1;
        C0269jx jxVar = this.f9745c;
        if (jxVar == null || !jxVar.mo5366c()) {
            i = 0;
        } else {
            C0270jy jyVar = (C0270jy) view.getLayoutParams();
            i = m7779a(jxVar.mo5328a(view) - jyVar.leftMargin, jxVar.mo5362c(view) + jyVar.rightMargin, jxVar.mo5375h(), jxVar.f9715h - jxVar.mo5377j(), i4);
        }
        PointF pointF2 = this.f9753k;
        if (pointF2 == null || pointF2.y == 0.0f) {
            i2 = 0;
        } else if (this.f9753k.y <= 0.0f) {
            i2 = -1;
        }
        C0269jx jxVar2 = this.f9745c;
        if (jxVar2 != null && jxVar2.mo5370d()) {
            C0270jy jyVar2 = (C0270jy) view.getLayoutParams();
            i3 = m7779a(jxVar2.mo5353b(view) - jyVar2.topMargin, jxVar2.mo5367d(view) + jyVar2.bottomMargin, jxVar2.mo5376i(), jxVar2.f9716i - jxVar2.mo5378k(), i2);
        }
        int c = mo5417c((int) Math.sqrt((double) ((i * i) + (i3 * i3))));
        if (c > 0) {
            khVar.mo5407a(-i, -i3, c, this.f9750h);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo5414a(C0280kh khVar) {
        PointF a = mo5410a(this.f9743a);
        if (a == null || (a.x == 0.0f && a.y == 0.0f)) {
            khVar.f9736a = this.f9743a;
            mo5411a();
            return;
        }
        float sqrt = (float) Math.sqrt((double) ((a.x * a.x) + (a.y * a.y)));
        a.x /= sqrt;
        a.y /= sqrt;
        this.f9753k = a;
        this.f9757o = (int) (a.x * 10000.0f);
        this.f9758p = (int) (a.y * 10000.0f);
        khVar.mo5407a((int) (((float) this.f9757o) * 1.2f), (int) (((float) this.f9758p) * 1.2f), (int) (((float) mo5419d(10000)) * 1.2f), this.f9752j);
    }

    /* renamed from: a */
    public PointF mo5410a(int i) {
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + C0281ki.class.getCanonicalName());
        return null;
    }

    /* renamed from: b */
    public final View mo5416b(int i) {
        return this.f9744b.f1068h.mo5363c(i);
    }

    /* renamed from: b */
    public final int mo5415b() {
        return this.f9744b.f1068h.mo5374g();
    }

    /* renamed from: a */
    public static final int m7780a(View view) {
        C0285km c = RecyclerView.m1301c(view);
        if (c == null) {
            return -1;
        }
        return c.mo5435c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo5412a(int i, int i2) {
        PointF a;
        RecyclerView recyclerView = this.f9744b;
        if (this.f9743a == -1 || recyclerView == null) {
            mo5411a();
        }
        if (!(!this.f9746d || this.f9748f != null || this.f9745c == null || (a = mo5410a(this.f9743a)) == null || (a.x == 0.0f && a.y == 0.0f))) {
            recyclerView.mo828a((int) Math.signum(a.x), (int) Math.signum(a.y), (int[]) null);
        }
        this.f9746d = false;
        View view = this.f9748f;
        if (view != null) {
            if (m7780a(view) == this.f9743a) {
                View view2 = this.f9748f;
                C0283kk kkVar = recyclerView.f1024D;
                mo5413a(view2, this.f9751i);
                this.f9751i.mo5408a(recyclerView);
                mo5411a();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.f9748f = null;
            }
        }
        if (this.f9747e) {
            C0283kk kkVar2 = recyclerView.f1024D;
            C0280kh khVar = this.f9751i;
            if (mo5415b() == 0) {
                mo5411a();
            } else {
                this.f9757o = m7781b(this.f9757o, i);
                int b = m7781b(this.f9758p, i2);
                this.f9758p = b;
                if (this.f9757o == 0 && b == 0) {
                    mo5414a(khVar);
                }
            }
            C0280kh khVar2 = this.f9751i;
            int i3 = khVar2.f9736a;
            khVar2.mo5408a(recyclerView);
            if (i3 >= 0 && this.f9747e) {
                this.f9746d = true;
                recyclerView.f1021A.mo5423a();
            }
        }
    }

    /* renamed from: a */
    public final void mo5411a() {
        if (this.f9747e) {
            this.f9747e = false;
            mo5418c();
            this.f9744b.f1024D.f9759a = -1;
            this.f9748f = null;
            this.f9743a = -1;
            this.f9746d = false;
            C0269jx jxVar = this.f9745c;
            if (jxVar.f9710c == this) {
                jxVar.f9710c = null;
            }
            this.f9745c = null;
            this.f9744b = null;
        }
    }
}
