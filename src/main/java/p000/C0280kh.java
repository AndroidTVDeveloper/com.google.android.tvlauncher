package p000;

import android.support.p002v7.widget.RecyclerView;
import android.util.Log;
import android.view.animation.Interpolator;

/* renamed from: kh */
/* compiled from: PG */
public final class C0280kh {

    /* renamed from: a */
    public int f9736a = -1;

    /* renamed from: b */
    private int f9737b = 0;

    /* renamed from: c */
    private int f9738c = 0;

    /* renamed from: d */
    private int f9739d = Integer.MIN_VALUE;

    /* renamed from: e */
    private Interpolator f9740e = null;

    /* renamed from: f */
    private boolean f9741f = false;

    /* renamed from: g */
    private int f9742g = 0;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo5408a(RecyclerView recyclerView) {
        int i = this.f9736a;
        if (i >= 0) {
            this.f9736a = -1;
            recyclerView.mo848c(i);
            this.f9741f = false;
        } else if (this.f9741f) {
            Interpolator interpolator = this.f9740e;
            if (interpolator != null && this.f9739d <= 0) {
                throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
            }
            int i2 = this.f9739d;
            if (i2 > 0) {
                recyclerView.f1021A.mo5424a(this.f9737b, this.f9738c, i2, interpolator);
                int i3 = this.f9742g + 1;
                this.f9742g = i3;
                if (i3 > 10) {
                    Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                }
                this.f9741f = false;
                return;
            }
            throw new IllegalStateException("Scroll duration must be a positive number");
        } else {
            this.f9742g = 0;
        }
    }

    /* renamed from: a */
    public final void mo5407a(int i, int i2, int i3, Interpolator interpolator) {
        this.f9737b = i;
        this.f9738c = i2;
        this.f9739d = i3;
        this.f9740e = interpolator;
        this.f9741f = true;
    }
}
